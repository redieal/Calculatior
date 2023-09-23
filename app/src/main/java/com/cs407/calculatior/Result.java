package com.cs407.calculatior;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        textView=(TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("result");
        textView.setText(str);
    }
}