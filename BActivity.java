package com.example.chenbin.helloas;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by chenbin on 2017-9-6.
 */
@Route(path = "/app/bactivity")
public class BActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapp_activity_btest);
    }
}
