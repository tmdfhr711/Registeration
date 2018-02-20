package com.plplim.david.registeration;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView noticeListView;
    private NoticeListAdapter adapter;
    private List<Notice> noticeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noticeListView = (ListView) findViewById(R.id.mainactivity_noticeListView);
        noticeList = new ArrayList<Notice>();
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));
        noticeList.add(new Notice("공지사항입니다", "오승록", "2018-02-20"));

        adapter = new NoticeListAdapter(getApplicationContext(), noticeList);
        noticeListView.setAdapter(adapter);

        final Button courseButton = (Button) findViewById(R.id.mainactivity_courseButton);
        final Button statisticsButton = (Button) findViewById(R.id.mainactivity_statisticsButton);
        final Button scheduleButton = (Button) findViewById(R.id.mainactivity_scheduleButton);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.mainactivity_notice);


        courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //프래그먼트를 보이면서
                //노티스 숨기기
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainactivity_fragment, new CourseFragment());
                fragmentTransaction.commit();
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //프래그먼트를 보이면서
                //노티스 숨기기
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainactivity_fragment, new StatisticsFragment());
                fragmentTransaction.commit();
            }
        });

        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //프래그먼트를 보이면서
                //노티스 숨기기
                notice.setVisibility(View.GONE);
                courseButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                statisticsButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                scheduleButton.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.mainactivity_fragment, new ScheduleFragment());
                fragmentTransaction.commit();
            }
        });
    }
}
