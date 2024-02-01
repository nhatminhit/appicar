package ba;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import d.m0;
import d.v;

public class a extends com.google.android.material.tabs.a {
    public static float e(@v(from = 0.0d, to = 1.0d) float f10) {
        return (float) (1.0d - Math.cos((((double) f10) * 3.141592653589793d) / 2.0d));
    }

    public static float f(@v(from = 0.0d, to = 1.0d) float f10) {
        return (float) Math.sin((((double) f10) * 3.141592653589793d) / 2.0d);
    }

    public void c(TabLayout tabLayout, View view, View view2, float f10, @m0 Drawable drawable) {
        float f11;
        float f12;
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a10.left < a11.left) {
            f12 = e(f10);
            f11 = f(f10);
        } else {
            f12 = f(f10);
            f11 = e(f10);
        }
        drawable.setBounds(j9.a.c((int) a10.left, (int) a11.left, f12), drawable.getBounds().top, j9.a.c((int) a10.right, (int) a11.right, f11), drawable.getBounds().bottom);
    }
}
