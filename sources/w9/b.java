package w9;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import d.f;
import d.m0;
import d.o0;
import d.p;
import d.r0;
import d.x0;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public class b {
    @o0
    public static TypedValue a(@m0 Context context, @f int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(@m0 Context context, @f int i10, boolean z10) {
        TypedValue a10 = a(context, i10);
        return (a10 == null || a10.type != 18) ? z10 : a10.data != 0;
    }

    public static boolean c(@m0 Context context, @f int i10, @m0 String str) {
        return f(context, i10, str) != 0;
    }

    @r0
    public static int d(@m0 Context context, @f int i10, @p int i11) {
        TypedValue a10 = a(context, i10);
        return (int) ((a10 == null || a10.type != 5) ? context.getResources().getDimension(i11) : a10.getDimension(context.getResources().getDisplayMetrics()));
    }

    @r0
    public static int e(@m0 Context context) {
        return d(context, a.c.minTouchTargetSize, a.f.mtrl_min_touch_target_size);
    }

    public static int f(@m0 Context context, @f int i10, @m0 String str) {
        TypedValue a10 = a(context, i10);
        if (a10 != null) {
            return a10.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i10)}));
    }

    public static int g(@m0 View view, @f int i10) {
        return f(view.getContext(), i10, view.getClass().getCanonicalName());
    }
}
