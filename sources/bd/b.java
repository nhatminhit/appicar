package bd;

import android.content.Context;
import b6.c;
import fd.a;

public class b {
    public String a() {
        return "com.vietmap.S2OBU";
    }

    public boolean b(Context context) {
        return a.h(context, a());
    }

    public void c(Context context) {
        if (b(context)) {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(a()).setFlags(c.A));
        }
    }
}
