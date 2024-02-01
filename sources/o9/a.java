package o9;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import d.e0;
import d.f;
import d.l;
import d.m0;
import d.v;
import n0.f0;
import w9.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final float f21312a = 1.0f;

    /* renamed from: b  reason: collision with root package name */
    public static final float f21313b = 0.54f;

    /* renamed from: c  reason: collision with root package name */
    public static final float f21314c = 0.38f;

    /* renamed from: d  reason: collision with root package name */
    public static final float f21315d = 0.32f;

    /* renamed from: e  reason: collision with root package name */
    public static final float f21316e = 0.12f;

    @l
    public static int a(@l int i10, @e0(from = 0, to = 255) int i11) {
        return f0.B(i10, (Color.alpha(i10) * i11) / 255);
    }

    @l
    public static int b(@m0 Context context, @f int i10, @l int i11) {
        TypedValue a10 = b.a(context, i10);
        return a10 != null ? a10.data : i11;
    }

    @l
    public static int c(Context context, @f int i10, String str) {
        return b.f(context, i10, str);
    }

    @l
    public static int d(@m0 View view, @f int i10) {
        return b.g(view, i10);
    }

    @l
    public static int e(@m0 View view, @f int i10, @l int i11) {
        return b(view.getContext(), i10, i11);
    }

    @l
    public static int f(@l int i10, @l int i11) {
        return f0.t(i11, i10);
    }

    @l
    public static int g(@l int i10, @l int i11, @v(from = 0.0d, to = 1.0d) float f10) {
        return f(i10, f0.B(i11, Math.round(((float) Color.alpha(i11)) * f10)));
    }

    @l
    public static int h(@m0 View view, @f int i10, @f int i11) {
        return i(view, i10, i11, 1.0f);
    }

    @l
    public static int i(@m0 View view, @f int i10, @f int i11, @v(from = 0.0d, to = 1.0d) float f10) {
        return g(d(view, i10), d(view, i11), f10);
    }
}
