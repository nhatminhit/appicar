package t7;

import android.text.TextUtils;
import w7.q0;
import w7.s;
import w7.y;

public final /* synthetic */ class d0 {
    static {
        y<String> yVar = e0.f13062a;
    }

    public static /* synthetic */ boolean a(String str) {
        String Y0 = q0.Y0(str);
        return !TextUtils.isEmpty(Y0) && (!Y0.contains("text") || Y0.contains(s.S)) && !Y0.contains("html") && !Y0.contains("xml");
    }
}
