package com.example.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceDemo extends AppCompatActivity implements View.OnClickListener {
    Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);
        start= (Button) findViewById(R.id.btn_start);
        stop= (Button) findViewById(R.id.btn_stop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_start:
                startService( new Intent(getApplicationContext(),MyService.class));
                break;
            case R.id.btn_stop:
                stopService( new Intent(getApplicationContext(),MyService.class));
        }
    }
}
