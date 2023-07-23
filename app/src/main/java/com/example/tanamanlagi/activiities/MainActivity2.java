package com.example.tanamanlagi.activiities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.azhar.tanamanhias.R;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1 = (TextView)findViewById(R.id.tvhello);
    }
}