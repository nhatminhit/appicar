package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import d.m0;
import d.o0;

public class z0 {
    public static void a(@m0 View view, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            a1.f(view, charSequence);
        }
    }
}
