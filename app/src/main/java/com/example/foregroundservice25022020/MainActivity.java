package com.example.foregroundservice25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnStart,mBtnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnStart = findViewById(R.id.buttonStartService);
        mBtnStop = findViewById(R.id.buttonStopService);

        mBtnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
