package bd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import b6.c;

public class a {
    public String a() {
        return "com.google.android.apps.maps";
    }

    public boolean b(Context context) {
        return fd.a.h(context, a());
    }

    public void c(Context context) {
        if (b(context)) {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(a()).setFlags(c.A));
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void d(Context context, double d10, double d11, String str) {
        if (b(context)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:%f, %f?q=%f, %f(%s)", new Object[]{Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(d10), Double.valueOf(d11), str}))).setFlags(c.A));
        }
    }
}
