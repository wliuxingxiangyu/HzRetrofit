package com.mi.hz.hzretrofit.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mi.hz.hzretrofit.R;

public class ActivityFirst extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findViewById(R.id.start_load_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent();
                in.setClass(ActivityFirst.this,ActivitySecond.class);
                startActivity(in);
            }
        });
    }



}
