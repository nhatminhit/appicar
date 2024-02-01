package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import d.e0;
import d.m0;
import d.o0;
import d.x0;
import java.lang.reflect.Constructor;

@x0({x0.a.LIBRARY_GROUP})
public final class j {

    /* renamed from: k  reason: collision with root package name */
    public static final String f17230k = "android.text.TextDirectionHeuristic";

    /* renamed from: l  reason: collision with root package name */
    public static final String f17231l = "android.text.TextDirectionHeuristics";

    /* renamed from: m  reason: collision with root package name */
    public static final String f17232m = "LTR";

    /* renamed from: n  reason: collision with root package name */
    public static final String f17233n = "RTL";

    /* renamed from: o  reason: collision with root package name */
    public static boolean f17234o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public static Constructor<StaticLayout> f17235p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public static Object f17236q;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f17237a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f17238b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17239c;

    /* renamed from: d  reason: collision with root package name */
    public int f17240d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f17241e;

    /* renamed from: f  reason: collision with root package name */
    public Layout.Alignment f17242f;

    /* renamed from: g  reason: collision with root package name */
    public int f17243g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f17244h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f17245i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public TextUtils.TruncateAt f17246j;

    public static class a extends Exception {
        public a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    public j(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f17237a = charSequence;
        this.f17238b = textPaint;
        this.f17239c = i10;
        this.f17241e = charSequence.length();
        this.f17242f = Layout.Alignment.ALIGN_NORMAL;
        this.f17243g = Integer.MAX_VALUE;
        this.f17244h = true;
        this.f17246j = null;
    }

    @m0
    public static j c(@m0 CharSequence charSequence, @m0 TextPaint textPaint, @e0(from = 0) int i10) {
        return new j(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f17237a == null) {
            this.f17237a = "";
        }
        int max = Math.max(0, this.f17239c);
        CharSequence charSequence = this.f17237a;
        if (this.f17243g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f17238b, (float) max, this.f17246j);
        }
        int min = Math.min(charSequence.length(), this.f17241e);
        this.f17241e = min;
        if (this.f17245i) {
            this.f17242f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f17240d, min, this.f17238b, max);
        obtain.setAlignment(this.f17242f);
        obtain.setIncludePad(this.f17244h);
        obtain.setTextDirection(this.f17245i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f17246j;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f17243g);
        return obtain.build();
    }

    public final void b() throws a {
        if (!f17234o) {
            try {
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f17236q = this.f17245i ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f17235p = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f17234o = true;
            } catch (Exception e10) {
                throw new a(e10);
            }
        }
    }

    @m0
    public j d(@m0 Layout.Alignment alignment) {
        this.f17242f = alignment;
        return this;
    }

    @m0
    public j e(@o0 TextUtils.TruncateAt truncateAt) {
        this.f17246j = truncateAt;
        return this;
    }

    @m0
    public j f(@e0(from = 0) int i10) {
        this.f17241e = i10;
        return this;
    }

    @m0
    public j g(boolean z10) {
        this.f17244h = z10;
        return this;
    }

    public j h(boolean z10) {
        this.f17245i = z10;
        return this;
    }

    @m0
    public j i(@e0(from = 0) int i10) {
        this.f17243g = i10;
        return this;
    }

    @m0
    public j j(@e0(from = 0) int i10) {
        this.f17240d = i10;
        return this;
    }
}
