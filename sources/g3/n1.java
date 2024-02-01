package g3;

import android.annotation.SuppressLint;
import android.view.View;
import d.m0;
import d.t0;

@t0(22)
public class n1 extends l1 {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f7820l = true;

    @SuppressLint({"NewApi"})
    public void f(@m0 View view, int i10, int i11, int i12, int i13) {
        if (f7820l) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f7820l = false;
            }
        }
    }
}
