package g3;

import android.annotation.SuppressLint;
import android.view.View;
import d.m0;
import d.t0;

@t0(19)
public class h1 extends r1 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f7707h = true;

    public void a(@m0 View view) {
    }

    @SuppressLint({"NewApi"})
    public float c(@m0 View view) {
        if (f7707h) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f7707h = false;
            }
        }
        return view.getAlpha();
    }

    public void d(@m0 View view) {
    }

    @SuppressLint({"NewApi"})
    public void g(@m0 View view, float f10) {
        if (f7707h) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f7707h = false;
            }
        }
        view.setAlpha(f10);
    }
}
