package vn.icar.entertaiment.view.activity;

import ad.d;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import d.o0;
import ej.a;

public class BootActivity extends Activity {
    public static final String O = "BootActivity";

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        a.b().s(true);
        d.c(O, "onCreate");
        if (!a.b().r()) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("open_News", "true");
            Intent intent = new Intent(this, HomeActivity.class);
            intent.putExtras(bundle2);
            startActivity(intent);
        }
        sendBroadcast(new Intent("vn.icar.entertaiment.AUTOSTART_PLAY"));
        finish();
    }
}
