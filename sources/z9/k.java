package z9;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.v;
import d.m0;

public class k {
    @m0
    public static e a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new f() : new n();
    }

    @m0
    public static e b() {
        return new n();
    }

    @m0
    public static g c() {
        return new g();
    }

    public static void d(@m0 View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            ((j) background).m0(f10);
        }
    }

    public static void e(@m0 View view) {
        Drawable background = view.getBackground();
        if (background instanceof j) {
            f(view, (j) background);
        }
    }

    public static void f(@m0 View view, @m0 j jVar) {
        if (jVar.a0()) {
            jVar.r0(v.i(view));
        }
    }
}
