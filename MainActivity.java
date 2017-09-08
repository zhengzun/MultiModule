package com.example.chenbin.helloas;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this, ReactNativeActivity.class);
//                MainActivity.this.startActivity(intent);
                ///app/bactivity  /moudlec/cactivity
                ARouter.getInstance().build("/moudlea/aactivity").navigation();///moudlea/aactivity
            }
        });
    }
}
