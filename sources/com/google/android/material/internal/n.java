package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.w0;
import d.b1;
import d.c1;
import d.f;
import d.m0;
import d.o0;
import d.x0;
import i9.a;

@x0({x0.a.LIBRARY_GROUP})
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f17256a = {a.c.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final String f17257b = "Theme.AppCompat";

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f17258c = {a.c.colorPrimaryVariant};

    /* renamed from: d  reason: collision with root package name */
    public static final String f17259d = "Theme.MaterialComponents";

    public static void a(@m0 Context context) {
        e(context, f17256a, f17257b);
    }

    public static void b(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ThemeEnforcement, i10, i11);
        boolean z10 = obtainStyledAttributes.getBoolean(a.o.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@m0 Context context) {
        e(context, f17258c, f17259d);
    }

    public static void d(@m0 Context context, AttributeSet attributeSet, @c1 @m0 int[] iArr, @f int i10, @b1 int i11, @o0 @c1 int... iArr2) {
        boolean z10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.ThemeEnforcement, i10, i11);
        boolean z11 = false;
        if (!obtainStyledAttributes.getBoolean(a.o.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(a.o.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z11 = true;
            }
            z10 = z11;
        } else {
            z10 = g(context, attributeSet, iArr, i10, i11, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z10) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(@m0 Context context, @m0 int[] iArr, String str) {
        if (!i(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static boolean f(@m0 Context context) {
        return i(context, f17256a);
    }

    public static boolean g(@m0 Context context, AttributeSet attributeSet, @c1 @m0 int[] iArr, @f int i10, @b1 int i11, @c1 @m0 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@m0 Context context) {
        return i(context, f17258c);
    }

    public static boolean i(@m0 Context context, @m0 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!obtainStyledAttributes.hasValue(i10)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @m0
    public static TypedArray j(@m0 Context context, AttributeSet attributeSet, @c1 @m0 int[] iArr, @f int i10, @b1 int i11, @c1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    public static w0 k(@m0 Context context, AttributeSet attributeSet, @c1 @m0 int[] iArr, @f int i10, @b1 int i11, @c1 int... iArr2) {
        b(context, attributeSet, i10, i11);
        d(context, attributeSet, iArr, i10, i11, iArr2);
        return w0.G(context, attributeSet, iArr, i10, i11);
    }
}
