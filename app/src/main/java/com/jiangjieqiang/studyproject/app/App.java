package com.jiangjieqiang.studyproject.app;

import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DoraemonKit.install(this, null, "d4a5c65867284077771797fa69a37cc2");
    }
}
