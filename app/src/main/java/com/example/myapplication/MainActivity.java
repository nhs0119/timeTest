package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    // 현재시간을 msec으로 구함.
    long now = System.currentTimeMillis();
    // 현재시간을 date 변수에 저장
    Date date = new Date(now);
    // 시간을 나타낸다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
    SimpleDateFormat sdfNow = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    // nowDate에 값을 저장
    String formatDate = sdfNow.format(date);

    TextView dateNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateNow = (TextView) findViewById(R.id.dateNow);
        dateNow.setText(formatDate);    // TextView에 현재시간 문자열 할당
    }
}