package r7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import h7.a;
import h7.b;
import w7.q0;

public final class j {
    public static final String K = "SubtitlePainter";
    public static final float L = 0.125f;
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a  reason: collision with root package name */
    public final float f12580a;

    /* renamed from: b  reason: collision with root package name */
    public final float f12581b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12582c;

    /* renamed from: d  reason: collision with root package name */
    public final float f12583d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12584e;

    /* renamed from: f  reason: collision with root package name */
    public final TextPaint f12585f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f12586g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f12587h;

    /* renamed from: i  reason: collision with root package name */
    public Layout.Alignment f12588i;

    /* renamed from: j  reason: collision with root package name */
    public Bitmap f12589j;

    /* renamed from: k  reason: collision with root package name */
    public float f12590k;

    /* renamed from: l  reason: collision with root package name */
    public int f12591l;

    /* renamed from: m  reason: collision with root package name */
    public int f12592m;

    /* renamed from: n  reason: collision with root package name */
    public float f12593n;

    /* renamed from: o  reason: collision with root package name */
    public int f12594o;

    /* renamed from: p  reason: collision with root package name */
    public float f12595p;

    /* renamed from: q  reason: collision with root package name */
    public float f12596q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12597r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12598s;

    /* renamed from: t  reason: collision with root package name */
    public int f12599t;

    /* renamed from: u  reason: collision with root package name */
    public int f12600u;

    /* renamed from: v  reason: collision with root package name */
    public int f12601v;

    /* renamed from: w  reason: collision with root package name */
    public int f12602w;

    /* renamed from: x  reason: collision with root package name */
    public int f12603x;

    /* renamed from: y  reason: collision with root package name */
    public float f12604y;

    /* renamed from: z  reason: collision with root package name */
    public float f12605z;

    public j(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f12584e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f12583d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f12580a = round;
        this.f12581b = round;
        this.f12582c = round;
        TextPaint textPaint = new TextPaint();
        this.f12585f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f12586g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    public void b(b bVar, boolean z10, boolean z11, a aVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        b bVar2 = bVar;
        boolean z12 = z10;
        boolean z13 = z11;
        a aVar2 = aVar;
        float f13 = f10;
        float f14 = f11;
        float f15 = f12;
        Canvas canvas2 = canvas;
        int i14 = i10;
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        boolean z14 = bVar2.Q == null;
        int i18 = -16777216;
        if (z14) {
            if (!TextUtils.isEmpty(bVar2.O)) {
                i18 = (!bVar2.Y || !z12) ? aVar2.f8879c : bVar2.Z;
            } else {
                return;
            }
        }
        if (a(this.f12587h, bVar2.O) && q0.e(this.f12588i, bVar2.P) && this.f12589j == bVar2.Q && this.f12590k == bVar2.R && this.f12591l == bVar2.S && q0.e(Integer.valueOf(this.f12592m), Integer.valueOf(bVar2.T)) && this.f12593n == bVar2.U && q0.e(Integer.valueOf(this.f12594o), Integer.valueOf(bVar2.V)) && this.f12595p == bVar2.W && this.f12596q == bVar2.X && this.f12597r == z12 && this.f12598s == z13 && this.f12599t == aVar2.f8877a && this.f12600u == aVar2.f8878b && this.f12601v == i18 && this.f12603x == aVar2.f8880d && this.f12602w == aVar2.f8881e && q0.e(this.f12585f.getTypeface(), aVar2.f8882f) && this.f12604y == f13 && this.f12605z == f14 && this.A == f15 && this.B == i14 && this.C == i15 && this.D == i16 && this.E == i17) {
            d(canvas, z14);
            return;
        }
        Canvas canvas3 = canvas;
        this.f12587h = bVar2.O;
        this.f12588i = bVar2.P;
        this.f12589j = bVar2.Q;
        this.f12590k = bVar2.R;
        this.f12591l = bVar2.S;
        this.f12592m = bVar2.T;
        this.f12593n = bVar2.U;
        this.f12594o = bVar2.V;
        this.f12595p = bVar2.W;
        this.f12596q = bVar2.X;
        this.f12597r = z12;
        this.f12598s = z13;
        this.f12599t = aVar2.f8877a;
        this.f12600u = aVar2.f8878b;
        this.f12601v = i18;
        this.f12603x = aVar2.f8880d;
        this.f12602w = aVar2.f8881e;
        this.f12585f.setTypeface(aVar2.f8882f);
        this.f12604y = f13;
        this.f12605z = f14;
        this.A = f15;
        this.B = i14;
        this.C = i15;
        this.D = i16;
        this.E = i17;
        if (z14) {
            g();
        } else {
            f();
        }
        d(canvas3, z14);
    }

    public final void c(Canvas canvas) {
        canvas.drawBitmap(this.f12589j, (Rect) null, this.J, (Paint) null);
    }

    public final void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
        } else {
            c(canvas);
        }
    }

    public final void e(Canvas canvas) {
        StaticLayout staticLayout = this.F;
        if (staticLayout != null) {
            int save = canvas.save();
            canvas.translate((float) this.G, (float) this.H);
            if (Color.alpha(this.f12601v) > 0) {
                this.f12586g.setColor(this.f12601v);
                canvas.drawRect((float) (-this.I), 0.0f, (float) (staticLayout.getWidth() + this.I), (float) staticLayout.getHeight(), this.f12586g);
            }
            int i10 = this.f12603x;
            boolean z10 = true;
            if (i10 == 1) {
                this.f12585f.setStrokeJoin(Paint.Join.ROUND);
                this.f12585f.setStrokeWidth(this.f12580a);
                this.f12585f.setColor(this.f12602w);
                this.f12585f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout.draw(canvas);
            } else if (i10 == 2) {
                TextPaint textPaint = this.f12585f;
                float f10 = this.f12581b;
                float f11 = this.f12582c;
                textPaint.setShadowLayer(f10, f11, f11, this.f12602w);
            } else if (i10 == 3 || i10 == 4) {
                if (i10 != 3) {
                    z10 = false;
                }
                int i11 = -1;
                int i12 = z10 ? -1 : this.f12602w;
                if (z10) {
                    i11 = this.f12602w;
                }
                float f12 = this.f12581b / 2.0f;
                this.f12585f.setColor(this.f12599t);
                this.f12585f.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                this.f12585f.setShadowLayer(this.f12581b, f13, f13, i12);
                staticLayout.draw(canvas);
                this.f12585f.setShadowLayer(this.f12581b, f12, f12, i11);
            }
            this.f12585f.setColor(this.f12599t);
            this.f12585f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f12585f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r7 = this;
            int r0 = r7.D
            int r1 = r7.B
            int r0 = r0 - r1
            int r2 = r7.E
            int r3 = r7.C
            int r2 = r2 - r3
            float r1 = (float) r1
            float r0 = (float) r0
            float r4 = r7.f12593n
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r3 = (float) r3
            float r2 = (float) r2
            float r4 = r7.f12590k
            float r4 = r4 * r2
            float r3 = r3 + r4
            float r4 = r7.f12595p
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            float r4 = r7.f12596q
            r5 = 1
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0025
            goto L_0x0035
        L_0x0025:
            float r2 = (float) r0
            android.graphics.Bitmap r4 = r7.f12589j
            int r4 = r4.getHeight()
            float r4 = (float) r4
            android.graphics.Bitmap r5 = r7.f12589j
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
        L_0x0035:
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r7.f12594o
            r5 = 1
            r6 = 2
            if (r4 != r6) goto L_0x0043
            float r4 = (float) r0
        L_0x0041:
            float r1 = r1 - r4
            goto L_0x0049
        L_0x0043:
            if (r4 != r5) goto L_0x0049
            int r4 = r0 / 2
            float r4 = (float) r4
            goto L_0x0041
        L_0x0049:
            int r1 = java.lang.Math.round(r1)
            int r4 = r7.f12592m
            if (r4 != r6) goto L_0x0054
            float r4 = (float) r2
        L_0x0052:
            float r3 = r3 - r4
            goto L_0x005a
        L_0x0054:
            if (r4 != r5) goto L_0x005a
            int r4 = r2 / 2
            float r4 = (float) r4
            goto L_0x0052
        L_0x005a:
            int r3 = java.lang.Math.round(r3)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r0 = r0 + r1
            int r2 = r2 + r3
            r4.<init>(r1, r3, r0, r2)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.j.f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r26 = this;
            r0 = r26
            int r1 = r0.D
            int r2 = r0.B
            int r1 = r1 - r2
            int r2 = r0.E
            int r3 = r0.C
            int r2 = r2 - r3
            android.text.TextPaint r3 = r0.f12585f
            float r4 = r0.f12604y
            r3.setTextSize(r4)
            float r3 = r0.f12604y
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            int r4 = r3 * 2
            int r5 = r1 - r4
            float r6 = r0.f12595p
            r7 = 1
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x002a
            float r5 = (float) r5
            float r5 = r5 * r6
            int r5 = (int) r5
        L_0x002a:
            java.lang.String r6 = "SubtitlePainter"
            if (r5 > 0) goto L_0x0034
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            w7.p.l(r6, r1)
            return
        L_0x0034:
            java.lang.CharSequence r8 = r0.f12587h
            boolean r9 = r0.f12597r
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r16 = 0
            r15 = 0
            if (r9 != 0) goto L_0x0044
            java.lang.String r8 = r8.toString()
            goto L_0x0094
        L_0x0044:
            boolean r9 = r0.f12598s
            if (r9 != 0) goto L_0x0079
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            int r8 = r9.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r11 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r11 = r9.getSpans(r15, r8, r11)
            android.text.style.AbsoluteSizeSpan[] r11 = (android.text.style.AbsoluteSizeSpan[]) r11
            java.lang.Class<android.text.style.RelativeSizeSpan> r12 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r8 = r9.getSpans(r15, r8, r12)
            android.text.style.RelativeSizeSpan[] r8 = (android.text.style.RelativeSizeSpan[]) r8
            int r12 = r11.length
            r13 = r15
        L_0x0063:
            if (r13 >= r12) goto L_0x006d
            r14 = r11[r13]
            r9.removeSpan(r14)
            int r13 = r13 + 1
            goto L_0x0063
        L_0x006d:
            int r11 = r8.length
            r12 = r15
        L_0x006f:
            if (r12 >= r11) goto L_0x0093
            r13 = r8[r12]
            r9.removeSpan(r13)
            int r12 = r12 + 1
            goto L_0x006f
        L_0x0079:
            float r9 = r0.f12605z
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0094
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            android.text.style.AbsoluteSizeSpan r8 = new android.text.style.AbsoluteSizeSpan
            float r11 = r0.f12605z
            int r11 = (int) r11
            r8.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r8, r15, r11, r10)
        L_0x0093:
            r8 = r9
        L_0x0094:
            int r9 = r0.f12600u
            int r9 = android.graphics.Color.alpha(r9)
            if (r9 <= 0) goto L_0x00b2
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r8)
            android.text.style.BackgroundColorSpan r8 = new android.text.style.BackgroundColorSpan
            int r11 = r0.f12600u
            r8.<init>(r11)
            int r11 = r9.length()
            r9.setSpan(r8, r15, r11, r10)
            r18 = r9
            goto L_0x00b4
        L_0x00b2:
            r18 = r8
        L_0x00b4:
            android.text.Layout$Alignment r8 = r0.f12588i
            if (r8 != 0) goto L_0x00ba
            android.text.Layout$Alignment r8 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00ba:
            r21 = r8
            android.text.StaticLayout r14 = new android.text.StaticLayout
            android.text.TextPaint r10 = r0.f12585f
            float r13 = r0.f12583d
            float r12 = r0.f12584e
            r17 = 1
            r8 = r14
            r9 = r18
            r11 = r5
            r19 = r12
            r12 = r21
            r7 = r14
            r14 = r19
            r25 = r3
            r3 = r15
            r15 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.F = r7
            int r7 = r7.getHeight()
            android.text.StaticLayout r8 = r0.F
            int r8 = r8.getLineCount()
            r9 = r3
            r15 = r9
        L_0x00e7:
            if (r15 >= r8) goto L_0x00fc
            android.text.StaticLayout r10 = r0.F
            float r10 = r10.getLineWidth(r15)
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r10 = (int) r10
            int r9 = java.lang.Math.max(r10, r9)
            int r15 = r15 + 1
            goto L_0x00e7
        L_0x00fc:
            float r8 = r0.f12595p
            r10 = 1
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0106
            if (r9 >= r5) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r5 = r9
        L_0x0107:
            int r5 = r5 + r4
            float r4 = r0.f12593n
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r9 = 1
            r10 = 2
            if (r8 == 0) goto L_0x0131
            float r1 = (float) r1
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
            int r4 = r0.B
            int r1 = r1 + r4
            int r8 = r0.f12594o
            if (r8 != r10) goto L_0x011f
            int r1 = r1 - r5
            goto L_0x0125
        L_0x011f:
            if (r8 != r9) goto L_0x0125
            int r1 = r1 * 2
            int r1 = r1 - r5
            int r1 = r1 / r10
        L_0x0125:
            int r1 = java.lang.Math.max(r1, r4)
            int r5 = r5 + r1
            int r4 = r0.D
            int r4 = java.lang.Math.min(r5, r4)
            goto L_0x0138
        L_0x0131:
            int r1 = r1 - r5
            int r1 = r1 / r10
            int r4 = r0.B
            int r1 = r1 + r4
            int r4 = r1 + r5
        L_0x0138:
            int r4 = r4 - r1
            if (r4 > 0) goto L_0x0141
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            w7.p.l(r6, r1)
            return
        L_0x0141:
            float r5 = r0.f12590k
            r6 = 1
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0197
            int r6 = r0.f12591l
            if (r6 != 0) goto L_0x0156
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
        L_0x0152:
            int r3 = r0.C
        L_0x0154:
            int r2 = r2 + r3
            goto L_0x017c
        L_0x0156:
            android.text.StaticLayout r2 = r0.F
            int r2 = r2.getLineBottom(r3)
            android.text.StaticLayout r5 = r0.F
            int r3 = r5.getLineTop(r3)
            int r2 = r2 - r3
            float r3 = r0.f12590k
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 < 0) goto L_0x0170
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            goto L_0x0152
        L_0x0170:
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r5
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = java.lang.Math.round(r3)
            int r3 = r0.E
            goto L_0x0154
        L_0x017c:
            int r3 = r0.f12592m
            if (r3 != r10) goto L_0x0182
            int r2 = r2 - r7
            goto L_0x0188
        L_0x0182:
            if (r3 != r9) goto L_0x0188
            int r2 = r2 * 2
            int r2 = r2 - r7
            int r2 = r2 / r10
        L_0x0188:
            int r3 = r2 + r7
            int r5 = r0.E
            if (r3 <= r5) goto L_0x0191
            int r2 = r5 - r7
            goto L_0x01a1
        L_0x0191:
            int r3 = r0.C
            if (r2 >= r3) goto L_0x01a1
            r2 = r3
            goto L_0x01a1
        L_0x0197:
            int r3 = r0.E
            int r3 = r3 - r7
            float r2 = (float) r2
            float r5 = r0.A
            float r2 = r2 * r5
            int r2 = (int) r2
            int r2 = r3 - r2
        L_0x01a1:
            android.text.StaticLayout r3 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f12585f
            float r6 = r0.f12583d
            float r7 = r0.f12584e
            r24 = 1
            r17 = r3
            r19 = r5
            r20 = r4
            r22 = r6
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.F = r3
            r0.G = r1
            r0.H = r2
            r1 = r25
            r0.I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r7.j.g():void");
    }
}
