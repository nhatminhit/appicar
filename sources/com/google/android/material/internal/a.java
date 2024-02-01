package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import b1.r;
import com.google.android.material.internal.j;
import d.l;
import d.m0;
import d.o0;
import d.x0;
import e1.n;
import f1.w1;
import w9.a;
import w9.d;

@x0({x0.a.LIBRARY_GROUP})
public final class a {

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f17156b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public static final String f17157c0 = "CollapsingTextHelper";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f17158d0 = "…";

    /* renamed from: e0  reason: collision with root package name */
    public static final boolean f17159e0 = false;
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public static final Paint f17160f0 = null;
    public boolean A;
    @o0
    public Bitmap B;
    public Paint C;
    public float D;
    public float E;
    public int[] F;
    public boolean G;
    @m0
    public final TextPaint H;
    @m0
    public final TextPaint I;
    public TimeInterpolator J;
    public TimeInterpolator K;
    public float L;
    public float M;
    public float N;
    public ColorStateList O;
    public float P;
    public float Q;
    public float R;
    public ColorStateList S;
    public float T;
    public float U;
    public StaticLayout V;
    public float W;
    public float X;
    public float Y;
    public CharSequence Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f17161a;

    /* renamed from: a0  reason: collision with root package name */
    public int f17162a0 = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17163b;

    /* renamed from: c  reason: collision with root package name */
    public float f17164c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final Rect f17165d;
    @m0

    /* renamed from: e  reason: collision with root package name */
    public final Rect f17166e;
    @m0

    /* renamed from: f  reason: collision with root package name */
    public final RectF f17167f;

    /* renamed from: g  reason: collision with root package name */
    public int f17168g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f17169h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f17170i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f17171j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f17172k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f17173l;

    /* renamed from: m  reason: collision with root package name */
    public float f17174m;

    /* renamed from: n  reason: collision with root package name */
    public float f17175n;

    /* renamed from: o  reason: collision with root package name */
    public float f17176o;

    /* renamed from: p  reason: collision with root package name */
    public float f17177p;

    /* renamed from: q  reason: collision with root package name */
    public float f17178q;

    /* renamed from: r  reason: collision with root package name */
    public float f17179r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f17180s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f17181t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f17182u;

    /* renamed from: v  reason: collision with root package name */
    public w9.a f17183v;

    /* renamed from: w  reason: collision with root package name */
    public w9.a f17184w;
    @o0

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f17185x;
    @o0

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f17186y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f17187z;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    public class C0280a implements a.C0476a {
        public C0280a() {
        }

        public void a(Typeface typeface) {
            a.this.W(typeface);
        }
    }

    public class b implements a.C0476a {
        public b() {
        }

        public void a(Typeface typeface) {
            a.this.f0(typeface);
        }
    }

    public a(View view) {
        this.f17161a = view;
        TextPaint textPaint = new TextPaint(129);
        this.H = textPaint;
        this.I = new TextPaint(textPaint);
        this.f17166e = new Rect();
        this.f17165d = new Rect();
        this.f17167f = new RectF();
    }

    public static boolean I(float f10, float f11) {
        return Math.abs(f10 - f11) < 0.001f;
    }

    public static float L(float f10, float f11, float f12, @o0 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return j9.a.a(f10, f11, f12);
    }

    public static boolean O(@m0 Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((((float) Color.alpha(i10)) * f11) + (((float) Color.alpha(i11)) * f10)), (int) ((((float) Color.red(i10)) * f11) + (((float) Color.red(i11)) * f10)), (int) ((((float) Color.green(i10)) * f11) + (((float) Color.green(i11)) * f10)), (int) ((((float) Color.blue(i10)) * f11) + (((float) Color.blue(i11)) * f10)));
    }

    public float A() {
        return this.f17170i;
    }

    public Typeface B() {
        Typeface typeface = this.f17181t;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float C() {
        return this.f17164c;
    }

    public int D() {
        return this.f17162a0;
    }

    @o0
    public CharSequence E() {
        return this.f17185x;
    }

    public final void F(@m0 TextPaint textPaint) {
        textPaint.setTextSize(this.f17171j);
        textPaint.setTypeface(this.f17180s);
        textPaint.setLetterSpacing(this.T);
    }

    public final void G(@m0 TextPaint textPaint) {
        textPaint.setTextSize(this.f17170i);
        textPaint.setTypeface(this.f17181t);
        textPaint.setLetterSpacing(this.U);
    }

    public final void H(float f10) {
        this.f17167f.left = L((float) this.f17165d.left, (float) this.f17166e.left, f10, this.J);
        this.f17167f.top = L(this.f17174m, this.f17175n, f10, this.J);
        this.f17167f.right = L((float) this.f17165d.right, (float) this.f17166e.right, f10, this.J);
        this.f17167f.bottom = L((float) this.f17165d.bottom, (float) this.f17166e.bottom, f10, this.J);
    }

    public final boolean J() {
        return w1.X(this.f17161a) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f17172k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f17173l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f17172k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.K():boolean");
    }

    public void M() {
        this.f17163b = this.f17166e.width() > 0 && this.f17166e.height() > 0 && this.f17165d.width() > 0 && this.f17165d.height() > 0;
    }

    public void N() {
        if (this.f17161a.getHeight() > 0 && this.f17161a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void P(int i10, int i11, int i12, int i13) {
        if (!O(this.f17166e, i10, i11, i12, i13)) {
            this.f17166e.set(i10, i11, i12, i13);
            this.G = true;
            M();
        }
    }

    public void Q(@m0 Rect rect) {
        P(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void R(int i10) {
        d dVar = new d(this.f17161a.getContext(), i10);
        ColorStateList colorStateList = dVar.f23975a;
        if (colorStateList != null) {
            this.f17173l = colorStateList;
        }
        float f10 = dVar.f23988n;
        if (f10 != 0.0f) {
            this.f17171j = f10;
        }
        ColorStateList colorStateList2 = dVar.f23978d;
        if (colorStateList2 != null) {
            this.O = colorStateList2;
        }
        this.M = dVar.f23983i;
        this.N = dVar.f23984j;
        this.L = dVar.f23985k;
        this.T = dVar.f23987m;
        w9.a aVar = this.f17184w;
        if (aVar != null) {
            aVar.c();
        }
        this.f17184w = new w9.a(new C0280a(), dVar.e());
        dVar.h(this.f17161a.getContext(), this.f17184w);
        N();
    }

    public final void S(float f10) {
        this.W = f10;
        w1.l1(this.f17161a);
    }

    public void T(ColorStateList colorStateList) {
        if (this.f17173l != colorStateList) {
            this.f17173l = colorStateList;
            N();
        }
    }

    public void U(int i10) {
        if (this.f17169h != i10) {
            this.f17169h = i10;
            N();
        }
    }

    public void V(float f10) {
        if (this.f17171j != f10) {
            this.f17171j = f10;
            N();
        }
    }

    public void W(Typeface typeface) {
        if (X(typeface)) {
            N();
        }
    }

    public final boolean X(Typeface typeface) {
        w9.a aVar = this.f17184w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f17180s == typeface) {
            return false;
        }
        this.f17180s = typeface;
        return true;
    }

    public void Y(int i10, int i11, int i12, int i13) {
        if (!O(this.f17165d, i10, i11, i12, i13)) {
            this.f17165d.set(i10, i11, i12, i13);
            this.G = true;
            M();
        }
    }

    public void Z(@m0 Rect rect) {
        Y(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a0(int i10) {
        d dVar = new d(this.f17161a.getContext(), i10);
        ColorStateList colorStateList = dVar.f23975a;
        if (colorStateList != null) {
            this.f17172k = colorStateList;
        }
        float f10 = dVar.f23988n;
        if (f10 != 0.0f) {
            this.f17170i = f10;
        }
        ColorStateList colorStateList2 = dVar.f23978d;
        if (colorStateList2 != null) {
            this.S = colorStateList2;
        }
        this.Q = dVar.f23983i;
        this.R = dVar.f23984j;
        this.P = dVar.f23985k;
        this.U = dVar.f23987m;
        w9.a aVar = this.f17183v;
        if (aVar != null) {
            aVar.c();
        }
        this.f17183v = new w9.a(new b(), dVar.e());
        dVar.h(this.f17161a.getContext(), this.f17183v);
        N();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r13 = this;
            float r0 = r13.E
            float r1 = r13.f17171j
            r13.g(r1)
            java.lang.CharSequence r1 = r13.f17186y
            if (r1 == 0) goto L_0x001e
            android.text.StaticLayout r2 = r13.V
            if (r2 == 0) goto L_0x001e
            android.text.TextPaint r3 = r13.H
            int r2 = r2.getWidth()
            float r2 = (float) r2
            android.text.TextUtils$TruncateAt r4 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r1 = android.text.TextUtils.ellipsize(r1, r3, r2, r4)
            r13.Z = r1
        L_0x001e:
            java.lang.CharSequence r1 = r13.Z
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x002f
            android.text.TextPaint r4 = r13.H
            int r5 = r1.length()
            float r1 = r4.measureText(r1, r2, r5)
            goto L_0x0030
        L_0x002f:
            r1 = r3
        L_0x0030:
            int r4 = r13.f17169h
            boolean r5 = r13.f17187z
            int r4 = f1.j.d(r4, r5)
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 80
            r7 = 48
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x006a
            if (r5 == r6) goto L_0x005d
            android.text.TextPaint r5 = r13.H
            float r5 = r5.descent()
            android.text.TextPaint r9 = r13.H
            float r9 = r9.ascent()
            float r5 = r5 - r9
            float r5 = r5 / r8
            android.graphics.Rect r9 = r13.f17166e
            int r9 = r9.centerY()
            float r9 = (float) r9
            float r9 = r9 - r5
            r13.f17175n = r9
            goto L_0x0071
        L_0x005d:
            android.graphics.Rect r5 = r13.f17166e
            int r5 = r5.bottom
            float r5 = (float) r5
            android.text.TextPaint r9 = r13.H
            float r9 = r9.ascent()
            float r5 = r5 + r9
            goto L_0x006f
        L_0x006a:
            android.graphics.Rect r5 = r13.f17166e
            int r5 = r5.top
            float r5 = (float) r5
        L_0x006f:
            r13.f17175n = r5
        L_0x0071:
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r9 = 5
            r10 = 1
            if (r4 == r10) goto L_0x0089
            if (r4 == r9) goto L_0x0083
            android.graphics.Rect r1 = r13.f17166e
            int r1 = r1.left
            float r1 = (float) r1
            r13.f17177p = r1
            goto L_0x0094
        L_0x0083:
            android.graphics.Rect r4 = r13.f17166e
            int r4 = r4.right
            float r4 = (float) r4
            goto L_0x0091
        L_0x0089:
            android.graphics.Rect r4 = r13.f17166e
            int r4 = r4.centerX()
            float r4 = (float) r4
            float r1 = r1 / r8
        L_0x0091:
            float r4 = r4 - r1
            r13.f17177p = r4
        L_0x0094:
            float r1 = r13.f17170i
            r13.g(r1)
            android.text.StaticLayout r1 = r13.V
            if (r1 == 0) goto L_0x00a3
            int r1 = r1.getHeight()
            float r1 = (float) r1
            goto L_0x00a4
        L_0x00a3:
            r1 = r3
        L_0x00a4:
            java.lang.CharSequence r4 = r13.f17186y
            if (r4 == 0) goto L_0x00b3
            android.text.TextPaint r11 = r13.H
            int r12 = r4.length()
            float r4 = r11.measureText(r4, r2, r12)
            goto L_0x00b4
        L_0x00b3:
            r4 = r3
        L_0x00b4:
            android.text.StaticLayout r11 = r13.V
            if (r11 == 0) goto L_0x00c5
            int r12 = r13.f17162a0
            if (r12 <= r10) goto L_0x00c5
            boolean r12 = r13.f17187z
            if (r12 != 0) goto L_0x00c5
            int r4 = r11.getWidth()
            float r4 = (float) r4
        L_0x00c5:
            android.text.StaticLayout r11 = r13.V
            if (r11 == 0) goto L_0x00cd
            float r3 = r11.getLineLeft(r2)
        L_0x00cd:
            r13.Y = r3
            int r2 = r13.f17168g
            boolean r3 = r13.f17187z
            int r2 = f1.j.d(r2, r3)
            r3 = r2 & 112(0x70, float:1.57E-43)
            if (r3 == r7) goto L_0x00f7
            if (r3 == r6) goto L_0x00e9
            float r1 = r1 / r8
            android.graphics.Rect r3 = r13.f17165d
            int r3 = r3.centerY()
            float r3 = (float) r3
            float r3 = r3 - r1
        L_0x00e6:
            r13.f17174m = r3
            goto L_0x00fe
        L_0x00e9:
            android.graphics.Rect r3 = r13.f17165d
            int r3 = r3.bottom
            float r3 = (float) r3
            float r3 = r3 - r1
            android.text.TextPaint r1 = r13.H
            float r1 = r1.descent()
            float r3 = r3 + r1
            goto L_0x00e6
        L_0x00f7:
            android.graphics.Rect r1 = r13.f17165d
            int r1 = r1.top
            float r1 = (float) r1
            r13.f17174m = r1
        L_0x00fe:
            r1 = r2 & r5
            if (r1 == r10) goto L_0x0110
            if (r1 == r9) goto L_0x010a
            android.graphics.Rect r1 = r13.f17165d
            int r1 = r1.left
            float r1 = (float) r1
            goto L_0x0119
        L_0x010a:
            android.graphics.Rect r1 = r13.f17165d
            int r1 = r1.right
            float r1 = (float) r1
            goto L_0x0118
        L_0x0110:
            android.graphics.Rect r1 = r13.f17165d
            int r1 = r1.centerX()
            float r1 = (float) r1
            float r4 = r4 / r8
        L_0x0118:
            float r1 = r1 - r4
        L_0x0119:
            r13.f17176o = r1
            r13.h()
            r13.i0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.a.b():void");
    }

    public final void b0(float f10) {
        this.X = f10;
        w1.l1(this.f17161a);
    }

    public float c() {
        if (this.f17185x == null) {
            return 0.0f;
        }
        F(this.I);
        TextPaint textPaint = this.I;
        CharSequence charSequence = this.f17185x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(ColorStateList colorStateList) {
        if (this.f17172k != colorStateList) {
            this.f17172k = colorStateList;
            N();
        }
    }

    public final void d() {
        f(this.f17164c);
    }

    public void d0(int i10) {
        if (this.f17168g != i10) {
            this.f17168g = i10;
            N();
        }
    }

    public final boolean e(@m0 CharSequence charSequence) {
        return (J() ? r.f4092d : r.f4091c).isRtl(charSequence, 0, charSequence.length());
    }

    public void e0(float f10) {
        if (this.f17170i != f10) {
            this.f17170i = f10;
            N();
        }
    }

    public final void f(float f10) {
        int i10;
        TextPaint textPaint;
        H(f10);
        this.f17178q = L(this.f17176o, this.f17177p, f10, this.J);
        this.f17179r = L(this.f17174m, this.f17175n, f10, this.J);
        i0(L(this.f17170i, this.f17171j, f10, this.K));
        TimeInterpolator timeInterpolator = j9.a.f19829b;
        S(1.0f - L(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        b0(L(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f17173l != this.f17172k) {
            textPaint = this.H;
            i10 = a(w(), u(), f10);
        } else {
            textPaint = this.H;
            i10 = u();
        }
        textPaint.setColor(i10);
        float f11 = this.T;
        float f12 = this.U;
        if (f11 != f12) {
            this.H.setLetterSpacing(L(f12, f11, f10, timeInterpolator));
        } else {
            this.H.setLetterSpacing(f11);
        }
        this.H.setShadowLayer(L(this.P, this.L, f10, (TimeInterpolator) null), L(this.Q, this.M, f10, (TimeInterpolator) null), L(this.R, this.N, f10, (TimeInterpolator) null), a(v(this.S), v(this.O), f10));
        w1.l1(this.f17161a);
    }

    public void f0(Typeface typeface) {
        if (g0(typeface)) {
            N();
        }
    }

    public final void g(float f10) {
        float f11;
        boolean z10;
        boolean z11;
        if (this.f17185x != null) {
            float width = (float) this.f17166e.width();
            float width2 = (float) this.f17165d.width();
            boolean z12 = false;
            int i10 = 1;
            if (I(f10, this.f17171j)) {
                f11 = this.f17171j;
                this.D = 1.0f;
                Typeface typeface = this.f17182u;
                Typeface typeface2 = this.f17180s;
                if (typeface != typeface2) {
                    this.f17182u = typeface2;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                float f12 = this.f17170i;
                Typeface typeface3 = this.f17182u;
                Typeface typeface4 = this.f17181t;
                if (typeface3 != typeface4) {
                    this.f17182u = typeface4;
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (I(f10, f12)) {
                    this.D = 1.0f;
                } else {
                    this.D = f10 / this.f17170i;
                }
                float f13 = this.f17171j / this.f17170i;
                width = width2 * f13 > width ? Math.min(width / f13, width2) : width2;
                f11 = f12;
                z10 = z11;
            }
            if (width > 0.0f) {
                z10 = this.E != f11 || this.G || z10;
                this.E = f11;
                this.G = false;
            }
            if (this.f17186y == null || z10) {
                this.H.setTextSize(this.E);
                this.H.setTypeface(this.f17182u);
                TextPaint textPaint = this.H;
                if (this.D != 1.0f) {
                    z12 = true;
                }
                textPaint.setLinearText(z12);
                this.f17187z = e(this.f17185x);
                if (p0()) {
                    i10 = this.f17162a0;
                }
                StaticLayout i11 = i(i10, width, this.f17187z);
                this.V = i11;
                this.f17186y = i11.getText();
            }
        }
    }

    public final boolean g0(Typeface typeface) {
        w9.a aVar = this.f17183v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f17181t == typeface) {
            return false;
        }
        this.f17181t = typeface;
        return true;
    }

    public final void h() {
        Bitmap bitmap = this.B;
        if (bitmap != null) {
            bitmap.recycle();
            this.B = null;
        }
    }

    public void h0(float f10) {
        float b10 = v0.a.b(f10, 0.0f, 1.0f);
        if (b10 != this.f17164c) {
            this.f17164c = b10;
            d();
        }
    }

    public final StaticLayout i(int i10, float f10, boolean z10) {
        StaticLayout staticLayout;
        try {
            staticLayout = j.c(this.f17185x, this.H, (int) f10).e(TextUtils.TruncateAt.END).h(z10).d(Layout.Alignment.ALIGN_NORMAL).g(false).i(i10).a();
        } catch (j.a e10) {
            e10.getCause().getMessage();
            staticLayout = null;
        }
        return (StaticLayout) n.g(staticLayout);
    }

    public final void i0(float f10) {
        g(f10);
        boolean z10 = f17156b0 && this.D != 1.0f;
        this.A = z10;
        if (z10) {
            l();
        }
        w1.l1(this.f17161a);
    }

    public void j(@m0 Canvas canvas) {
        int save = canvas.save();
        if (this.f17186y != null && this.f17163b) {
            boolean z10 = false;
            float lineLeft = (this.f17178q + this.V.getLineLeft(0)) - (this.Y * 2.0f);
            this.H.setTextSize(this.E);
            float f10 = this.f17178q;
            float f11 = this.f17179r;
            if (this.A && this.B != null) {
                z10 = true;
            }
            float f12 = this.D;
            if (f12 != 1.0f) {
                canvas.scale(f12, f12, f10, f11);
            }
            if (z10) {
                canvas.drawBitmap(this.B, f10, f11, this.C);
                canvas.restoreToCount(save);
                return;
            }
            if (p0()) {
                k(canvas, lineLeft, f11);
            } else {
                canvas.translate(f10, f11);
                this.V.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void j0(int i10) {
        if (i10 != this.f17162a0) {
            this.f17162a0 = i10;
            h();
            N();
        }
    }

    public final void k(@m0 Canvas canvas, float f10, float f11) {
        int alpha = this.H.getAlpha();
        canvas.translate(f10, f11);
        float f12 = (float) alpha;
        this.H.setAlpha((int) (this.X * f12));
        this.V.draw(canvas);
        this.H.setAlpha((int) (this.W * f12));
        int lineBaseline = this.V.getLineBaseline(0);
        CharSequence charSequence = this.Z;
        float f13 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.H);
        String trim = this.Z.toString().trim();
        if (trim.endsWith(f17158d0)) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.V.getLineEnd(0), str.length()), 0.0f, f13, this.H);
    }

    public void k0(TimeInterpolator timeInterpolator) {
        this.J = timeInterpolator;
        N();
    }

    public final void l() {
        if (this.B == null && !this.f17165d.isEmpty() && !TextUtils.isEmpty(this.f17186y)) {
            f(0.0f);
            int width = this.V.getWidth();
            int height = this.V.getHeight();
            if (width > 0 && height > 0) {
                this.B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.V.draw(new Canvas(this.B));
                if (this.C == null) {
                    this.C = new Paint(3);
                }
            }
        }
    }

    public final boolean l0(int[] iArr) {
        this.F = iArr;
        if (!K()) {
            return false;
        }
        N();
        return true;
    }

    public void m(@m0 RectF rectF, int i10, int i11) {
        this.f17187z = e(this.f17185x);
        rectF.left = q(i10, i11);
        rectF.top = (float) this.f17166e.top;
        rectF.right = r(rectF, i10, i11);
        rectF.bottom = ((float) this.f17166e.top) + p();
    }

    public void m0(@o0 CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f17185x, charSequence)) {
            this.f17185x = charSequence;
            this.f17186y = null;
            h();
            N();
        }
    }

    public ColorStateList n() {
        return this.f17173l;
    }

    public void n0(TimeInterpolator timeInterpolator) {
        this.K = timeInterpolator;
        N();
    }

    public int o() {
        return this.f17169h;
    }

    public void o0(Typeface typeface) {
        boolean X2 = X(typeface);
        boolean g02 = g0(typeface);
        if (X2 || g02) {
            N();
        }
    }

    public float p() {
        F(this.I);
        return -this.I.ascent();
    }

    public final boolean p0() {
        return this.f17162a0 > 1 && !this.f17187z && !this.A;
    }

    public final float q(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (((float) i10) / 2.0f) - (c() / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f17187z ? (float) this.f17166e.left : ((float) this.f17166e.right) - c() : this.f17187z ? ((float) this.f17166e.right) - c() : (float) this.f17166e.left;
    }

    public final float r(@m0 RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (((float) i10) / 2.0f) + (c() / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f17187z ? rectF.left + c() : (float) this.f17166e.right : this.f17187z ? (float) this.f17166e.right : rectF.left + c();
    }

    public float s() {
        return this.f17171j;
    }

    public Typeface t() {
        Typeface typeface = this.f17180s;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @l
    public int u() {
        return v(this.f17173l);
    }

    @l
    public final int v(@o0 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    @l
    public final int w() {
        return v(this.f17172k);
    }

    public ColorStateList x() {
        return this.f17172k;
    }

    public int y() {
        return this.f17168g;
    }

    public float z() {
        G(this.I);
        return -this.I.ascent();
    }
}
