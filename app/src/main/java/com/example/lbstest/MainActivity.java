package com.example.lbstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_bt).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.test_bt)
        {
            finish();
        }

    }
}