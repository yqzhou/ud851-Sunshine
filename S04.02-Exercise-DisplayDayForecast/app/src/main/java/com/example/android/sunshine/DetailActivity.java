package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeather;
    private String weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeather = (TextView) findViewById(R.id.tv_weather_show);
        Intent current = getIntent();
        if (current == null) return;
        if (current.hasExtra(Intent.EXTRA_TEXT)) weather = current.getStringExtra(Intent.EXTRA_TEXT);
        if (weather != null && weather.length() > 0) mWeather.setText(weather);
    }
}