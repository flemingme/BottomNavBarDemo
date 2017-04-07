package com.example.fleming.bottomnavbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener {

    private BottomNavigationBar mBottomNavigationBar;
    private TextView mTvTab;
    private String[] tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        tabs = getResources().getStringArray(R.array.tabs);
        mTvTab.setText(tabs[0]);

        initBottomNavigationBar();
    }

    private void initView() {
        mBottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_nb);
        mTvTab = (TextView) findViewById(R.id.tv_tab);
    }

    private void initBottomNavigationBar() {
        mBottomNavigationBar
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                .setMode(BottomNavigationBar.MODE_SHIFTING)
                .addItem(new BottomNavigationItem(R.drawable.ic_home, "Home").setActiveColorResource(R.color.colorRed))
                .addItem(new BottomNavigationItem(R.drawable.ic_book, "Book").setActiveColorResource(R.color.colorYellow))
                .addItem(new BottomNavigationItem(R.drawable.ic_explore, "Explore").setActiveColorResource(R.color.colorBlue))
                .addItem(new BottomNavigationItem(R.drawable.ic_live_tv, "TV").setActiveColorResource(R.color.colorGreen))
                .addItem(new BottomNavigationItem(R.drawable.ic_music_note, "Music").setActiveColorResource(R.color.colorPurple))
                .addItem(new BottomNavigationItem(R.drawable.ic_view_headline, "Line").setActiveColorResource(R.color.colorPink))
                .setFirstSelectedPosition(0)
                .setTabSelectedListener(this)
                .initialise();
    }

    @Override
    public void onTabSelected(int position) {
        mTvTab.setText(tabs[position]);
    }

    @Override
    public void onTabUnselected(int position) {

    }

    @Override
    public void onTabReselected(int position) {

    }
}
