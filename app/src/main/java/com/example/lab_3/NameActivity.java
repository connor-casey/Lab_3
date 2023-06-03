package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent dataSent = getIntent();

        Button nothanksbutt = findViewById(R.id.button1);
        nothanksbutt.setOnClickListener(click -> {
            setResult(0,dataSent);
            finish();
        }
        );
        Button thanksbutt = findViewById(R.id.button2);
        nothanksbutt.setOnClickListener(click -> {
            setResult(1, dataSent);
            finish();
        }
        );


    }

}