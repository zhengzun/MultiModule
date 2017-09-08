package com.example.moudlec;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by chenbin on 2017-9-6.
 */
@Route(path = "/moudlec/cactivity")
public class CActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulec_activity_c);
    }
}
