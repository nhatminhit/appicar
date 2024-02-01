package g3;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import d.m0;
import d.t0;

@t0(23)
public class p1 extends n1 {

    /* renamed from: m  reason: collision with root package name */
    public static boolean f7839m = true;

    @SuppressLint({"NewApi"})
    public void h(@m0 View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i10);
        } else if (f7839m) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f7839m = false;
            }
        }
    }
}
