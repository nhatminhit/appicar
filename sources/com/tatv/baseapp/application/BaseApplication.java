package com.tatv.baseapp.application;

import android.app.Application;
import android.content.Context;
import vc.c;

public class BaseApplication extends Application {
    public Context a() {
        return getApplicationContext();
    }

    public void onCreate() {
        super.onCreate();
        c.g().k(a());
    }
}
