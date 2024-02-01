package ca;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d.b1;
import d.f;
import d.m0;
import d.o0;
import i9.a;
import k.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f16345a = {16842752, a.c.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f16346b = {a.c.materialThemeOverlay};

    @b1
    public static int a(@m0 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16345a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @b1
    public static int b(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f16346b, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @m0
    public static Context c(@m0 Context context, @o0 AttributeSet attributeSet, @f int i10, @b1 int i11) {
        int b10 = b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof d) && ((d) context).c() == b10;
        if (b10 == 0 || z10) {
            return context;
        }
        d dVar = new d(context, b10);
        int a10 = a(context, attributeSet);
        if (a10 != 0) {
            dVar.getTheme().applyStyle(a10, true);
        }
        return dVar;
    }
}
