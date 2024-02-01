package com.tatv.baseapp.view.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import d.o0;

public class BaseTransparentActivity extends Activity {
    public Context O;

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.O = this;
    }
}
