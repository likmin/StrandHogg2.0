package com.victim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activityNormal extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        Intent intent = new Intent();
        String s = intent.getStringExtra("data");
       // Toast.makeText(activityNormal.this, s, Toast.LENGTH_LONG).show();

    }
}
