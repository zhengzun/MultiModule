package com.example.commonmodule;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by chenbin on 2017-9-6.
 */

public class BaseApplication extends Application {
    // 获取到主线程的上下文
    private static BaseApplication mApplication;

    @Override
    public void onCreate(){
        super.onCreate();
        mApplication = this;
        Log.e("zzzzz", "onCreate isDebug: " + isDebug());
        if (isDebug()) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(mApplication); // 尽可能早，推荐在Application中初始化
    }

    private boolean isDebug(){
//        return BuildConfig.DEBUG;
        return true;
    }
}
