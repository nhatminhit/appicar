package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.d;
import com.google.android.exoplayer2.ui.e;
import d.l;
import d.o0;
import f1.w1;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import r7.c;
import w7.a;
import w7.q0;

public class DefaultTimeBar extends View implements e {
    public static final int C0 = 4;
    public static final int D0 = 26;
    public static final int E0 = 4;
    public static final int F0 = 12;
    public static final int G0 = 0;
    public static final int H0 = 16;
    public static final int I0 = -1;
    public static final int J0 = -1291845888;
    public static final int K0 = -50;
    public static final int L0 = 3;
    public static final long M0 = 1000;
    public static final int N0 = 20;
    public static final String O0 = "android.widget.SeekBar";
    @o0
    public long[] A0;
    @o0
    public boolean[] B0;
    public final Rect O;
    public final Rect P;
    public final Rect Q;
    public final Rect R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final Paint V;
    public final Paint W;

    /* renamed from: a0  reason: collision with root package name */
    public final Paint f5447a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public final Drawable f5448b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f5449c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f5450d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f5451e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f5452f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f5453g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f5454h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5455i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f5456j0;

    /* renamed from: k0  reason: collision with root package name */
    public final StringBuilder f5457k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Formatter f5458l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Runnable f5459m0;

    /* renamed from: n0  reason: collision with root package name */
    public final CopyOnWriteArraySet<e.a> f5460n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f5461o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Point f5462p0;

    /* renamed from: q0  reason: collision with root package name */
    public final float f5463q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f5464r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f5465s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f5466t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5467u0;

    /* renamed from: v0  reason: collision with root package name */
    public long f5468v0;

    /* renamed from: w0  reason: collision with root package name */
    public long f5469w0;

    /* renamed from: x0  reason: collision with root package name */
    public long f5470x0;

    /* renamed from: y0  reason: collision with root package name */
    public long f5471y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5472z0;

    public DefaultTimeBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public DefaultTimeBar(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, @o0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultTimeBar(Context context, @o0 AttributeSet attributeSet, int i10, @o0 AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        int i12;
        AttributeSet attributeSet3 = attributeSet2;
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new Rect();
        this.R = new Rect();
        Paint paint = new Paint();
        this.S = paint;
        Paint paint2 = new Paint();
        this.T = paint2;
        Paint paint3 = new Paint();
        this.U = paint3;
        Paint paint4 = new Paint();
        this.V = paint4;
        Paint paint5 = new Paint();
        this.W = paint5;
        Paint paint6 = new Paint();
        this.f5447a0 = paint6;
        paint6.setAntiAlias(true);
        this.f5460n0 = new CopyOnWriteArraySet<>();
        this.f5461o0 = new int[2];
        this.f5462p0 = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f5463q0 = f10;
        this.f5456j0 = e(f10, -50);
        int e10 = e(f10, 4);
        int e11 = e(f10, 26);
        int e12 = e(f10, 4);
        int e13 = e(f10, 12);
        int e14 = e(f10, 0);
        int e15 = e(f10, 16);
        if (attributeSet3 != null) {
            Paint paint7 = paint5;
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet3, d.j.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(d.j.DefaultTimeBar_scrubber_drawable);
                this.f5448b0 = drawable;
                if (drawable != null) {
                    r(drawable);
                    e11 = Math.max(drawable.getMinimumHeight(), e11);
                }
                this.f5449c0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_bar_height, e10);
                this.f5450d0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_touch_target_height, e11);
                this.f5451e0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_ad_marker_width, e12);
                this.f5452f0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_scrubber_enabled_size, e13);
                this.f5453g0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_scrubber_disabled_size, e14);
                this.f5454h0 = obtainStyledAttributes.getDimensionPixelSize(d.j.DefaultTimeBar_scrubber_dragged_size, e15);
                int i13 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_played_color, -1);
                int i14 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_scrubber_color, j(i13));
                int i15 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_buffered_color, h(i13));
                int i16 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_unplayed_color, k(i13));
                int i17 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_ad_marker_color, J0);
                int i18 = obtainStyledAttributes.getInt(d.j.DefaultTimeBar_played_ad_marker_color, i(i17));
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint7.setColor(i18);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f5449c0 = e10;
            this.f5450d0 = e11;
            this.f5451e0 = e12;
            this.f5452f0 = e13;
            this.f5453g0 = e14;
            this.f5454h0 = e15;
            paint.setColor(-1);
            paint6.setColor(j(-1));
            paint2.setColor(h(-1));
            paint3.setColor(k(-1));
            paint4.setColor(J0);
            this.f5448b0 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f5457k0 = sb2;
        this.f5458l0 = new Formatter(sb2, Locale.getDefault());
        this.f5459m0 = new c(this);
        Drawable drawable2 = this.f5448b0;
        if (drawable2 != null) {
            z10 = true;
            i12 = drawable2.getMinimumWidth() + 1;
            i11 = 2;
        } else {
            z10 = true;
            i11 = 2;
            i12 = Math.max(this.f5453g0, Math.max(this.f5452f0, this.f5454h0)) + 1;
        }
        this.f5455i0 = i12 / i11;
        this.f5469w0 = b6.c.f4201b;
        this.f5465s0 = b6.c.f4201b;
        this.f5464r0 = 20;
        setFocusable(z10);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(z10 ? 1 : 0);
        }
    }

    public static int e(float f10, int i10) {
        return (int) ((((float) i10) * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.f5465s0;
        if (j10 != b6.c.f4201b) {
            return j10;
        }
        long j11 = this.f5469w0;
        if (j11 == b6.c.f4201b) {
            return 0;
        }
        return j11 / ((long) this.f5464r0);
    }

    private String getProgressText() {
        return q0.f0(this.f5457k0, this.f5458l0, this.f5470x0);
    }

    private long getScrubberPosition() {
        if (this.P.width() <= 0 || this.f5469w0 == b6.c.f4201b) {
            return 0;
        }
        return (((long) this.R.width()) * this.f5469w0) / ((long) this.P.width());
    }

    public static int h(int i10) {
        return (i10 & w1.f7299s) | -872415232;
    }

    public static int i(int i10) {
        return (i10 & w1.f7299s) | 855638016;
    }

    public static int j(int i10) {
        return i10 | -16777216;
    }

    public static int k(int i10) {
        return (i10 & w1.f7299s) | 855638016;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m() {
        u(false);
    }

    public static int o(float f10, int i10) {
        return (int) (((float) i10) / f10);
    }

    public static boolean s(Drawable drawable, int i10) {
        return q0.f14786a >= 23 && drawable.setLayoutDirection(i10);
    }

    public void a(@o0 long[] jArr, @o0 boolean[] zArr, int i10) {
        a.a(i10 == 0 || !(jArr == null || zArr == null));
        this.f5472z0 = i10;
        this.A0 = jArr;
        this.B0 = zArr;
        v();
    }

    public void b(e.a aVar) {
        this.f5460n0.remove(aVar);
    }

    public void c(e.a aVar) {
        this.f5460n0.add(aVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        w();
    }

    public final void f(Canvas canvas) {
        if (this.f5469w0 > 0) {
            Rect rect = this.R;
            int u10 = q0.u(rect.right, rect.left, this.P.right);
            int centerY = this.R.centerY();
            Drawable drawable = this.f5448b0;
            if (drawable == null) {
                canvas.drawCircle((float) u10, (float) centerY, (float) (((this.f5467u0 || isFocused()) ? this.f5454h0 : isEnabled() ? this.f5452f0 : this.f5453g0) / 2), this.f5447a0);
                return;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
            int intrinsicHeight = this.f5448b0.getIntrinsicHeight() / 2;
            this.f5448b0.setBounds(u10 - intrinsicWidth, centerY - intrinsicHeight, u10 + intrinsicWidth, centerY + intrinsicHeight);
            this.f5448b0.draw(canvas);
        }
    }

    public final void g(Canvas canvas) {
        int height = this.P.height();
        int centerY = this.P.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.f5469w0 <= 0) {
            Rect rect = this.P;
            canvas.drawRect((float) rect.left, (float) centerY, (float) rect.right, (float) i10, this.U);
            return;
        }
        Rect rect2 = this.Q;
        int i11 = rect2.left;
        int i12 = rect2.right;
        int max = Math.max(Math.max(this.P.left, i12), this.R.right);
        int i13 = this.P.right;
        if (max < i13) {
            canvas.drawRect((float) max, (float) centerY, (float) i13, (float) i10, this.U);
        }
        int max2 = Math.max(i11, this.R.right);
        if (i12 > max2) {
            canvas.drawRect((float) max2, (float) centerY, (float) i12, (float) i10, this.T);
        }
        if (this.R.width() > 0) {
            Rect rect3 = this.R;
            canvas.drawRect((float) rect3.left, (float) centerY, (float) rect3.right, (float) i10, this.S);
        }
        if (this.f5472z0 != 0) {
            long[] jArr = (long[]) a.g(this.A0);
            boolean[] zArr = (boolean[]) a.g(this.B0);
            int i14 = this.f5451e0 / 2;
            for (int i15 = 0; i15 < this.f5472z0; i15++) {
                long v10 = q0.v(jArr[i15], 0, this.f5469w0);
                Rect rect4 = this.P;
                int min = rect4.left + Math.min(rect4.width() - this.f5451e0, Math.max(0, ((int) ((((long) this.P.width()) * v10) / this.f5469w0)) - i14));
                canvas.drawRect((float) min, (float) centerY, (float) (min + this.f5451e0), (float) i10, zArr[i15] ? this.W : this.V);
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int o10 = o(this.f5463q0, this.P.width());
        if (o10 != 0) {
            long j10 = this.f5469w0;
            if (!(j10 == 0 || j10 == b6.c.f4201b)) {
                return j10 / ((long) o10);
            }
        }
        return Long.MAX_VALUE;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5448b0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean l(float f10, float f11) {
        return this.O.contains((int) f10, (int) f11);
    }

    public final void n(float f10) {
        Rect rect = this.R;
        Rect rect2 = this.P;
        rect.right = q0.u((int) f10, rect2.left, rect2.right);
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    public void onFocusChanged(boolean z10, int i10, @o0 Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f5467u0 && !z10) {
            u(false);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(O0);
    }

    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(O0);
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5469w0 > 0) {
            if (q0.f14786a >= 21) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                return;
            }
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (q(r0) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        removeCallbacks(r4.f5459m0);
        postDelayed(r4.f5459m0, 1000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0030
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L_0x0027
            switch(r5) {
                case 21: goto L_0x0013;
                case 22: goto L_0x0014;
                case 23: goto L_0x0027;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0030
        L_0x0013:
            long r0 = -r0
        L_0x0014:
            boolean r0 = r4.q(r0)
            if (r0 == 0) goto L_0x0030
            java.lang.Runnable r5 = r4.f5459m0
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f5459m0
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L_0x0027:
            boolean r0 = r4.f5467u0
            if (r0 == 0) goto L_0x0030
            r5 = 0
            r4.u(r5)
            return r3
        L_0x0030:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = ((i13 - i11) - this.f5450d0) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int i15 = this.f5450d0;
        int i16 = ((i15 - this.f5449c0) / 2) + i14;
        this.O.set(paddingLeft, i14, paddingRight, i15 + i14);
        Rect rect = this.P;
        Rect rect2 = this.O;
        int i17 = rect2.left;
        int i18 = this.f5455i0;
        rect.set(i17 + i18, i16, rect2.right - i18, this.f5449c0 + i16);
        v();
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.f5450d0;
        } else if (mode != 1073741824) {
            size = Math.min(this.f5450d0, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        w();
    }

    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.f5448b0;
        if (drawable != null && s(drawable, i10)) {
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r3 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L_0x006d
            long r2 = r7.f5469w0
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
            goto L_0x006d
        L_0x0010:
            android.graphics.Point r0 = r7.p(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L_0x005a
            r5 = 3
            if (r3 == r4) goto L_0x004b
            r6 = 2
            if (r3 == r6) goto L_0x0028
            if (r3 == r5) goto L_0x004b
            goto L_0x006d
        L_0x0028:
            boolean r8 = r7.f5467u0
            if (r8 == 0) goto L_0x006d
            int r8 = r7.f5456j0
            if (r0 >= r8) goto L_0x0037
            int r8 = r7.f5466t0
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L_0x003a
        L_0x0037:
            r7.f5466t0 = r2
            float r8 = (float) r2
        L_0x003a:
            r7.n(r8)
            long r0 = r7.getScrubberPosition()
            r7.x(r0)
        L_0x0044:
            r7.v()
            r7.invalidate()
            return r4
        L_0x004b:
            boolean r0 = r7.f5467u0
            if (r0 == 0) goto L_0x006d
            int r8 = r8.getAction()
            if (r8 != r5) goto L_0x0056
            r1 = r4
        L_0x0056:
            r7.u(r1)
            return r4
        L_0x005a:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.l(r8, r0)
            if (r0 == 0) goto L_0x006d
            r7.n(r8)
            long r0 = r7.getScrubberPosition()
            r7.t(r0)
            goto L_0x0044
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Point p(MotionEvent motionEvent) {
        getLocationOnScreen(this.f5461o0);
        this.f5462p0.set(((int) motionEvent.getRawX()) - this.f5461o0[0], ((int) motionEvent.getRawY()) - this.f5461o0[1]);
        return this.f5462p0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (q(getPositionIncrement()) != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (q(-getPositionIncrement()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(int r6, @d.o0 android.os.Bundle r7) {
        /*
            r5 = this;
            boolean r7 = super.performAccessibilityAction(r6, r7)
            r0 = 1
            if (r7 == 0) goto L_0x0008
            return r0
        L_0x0008:
            long r1 = r5.f5469w0
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r7 > 0) goto L_0x0012
            return r1
        L_0x0012:
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r6 != r7) goto L_0x0025
            long r6 = r5.getPositionIncrement()
            long r6 = -r6
            boolean r6 = r5.q(r6)
            if (r6 == 0) goto L_0x0034
        L_0x0021:
            r5.u(r1)
            goto L_0x0034
        L_0x0025:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 != r7) goto L_0x0039
            long r6 = r5.getPositionIncrement()
            boolean r6 = r5.q(r6)
            if (r6 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            r6 = 4
            r5.sendAccessibilityEvent(r6)
            return r0
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final boolean q(long j10) {
        long j11 = this.f5469w0;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f5467u0 ? this.f5468v0 : this.f5470x0;
        long v10 = q0.v(j12 + j10, 0, j11);
        if (v10 == j12) {
            return false;
        }
        if (!this.f5467u0) {
            t(v10);
        } else {
            x(v10);
        }
        v();
        return true;
    }

    public final boolean r(Drawable drawable) {
        return q0.f14786a >= 23 && s(drawable, getLayoutDirection());
    }

    public void setAdMarkerColor(@l int i10) {
        this.V.setColor(i10);
        invalidate(this.O);
    }

    public void setBufferedColor(@l int i10) {
        this.T.setColor(i10);
        invalidate(this.O);
    }

    public void setBufferedPosition(long j10) {
        this.f5471y0 = j10;
        v();
    }

    public void setDuration(long j10) {
        this.f5469w0 = j10;
        if (this.f5467u0 && j10 == b6.c.f4201b) {
            u(true);
        }
        v();
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f5467u0 && !z10) {
            u(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        a.a(i10 > 0);
        this.f5464r0 = i10;
        this.f5465s0 = b6.c.f4201b;
    }

    public void setKeyTimeIncrement(long j10) {
        a.a(j10 > 0);
        this.f5464r0 = -1;
        this.f5465s0 = j10;
    }

    public void setPlayedAdMarkerColor(@l int i10) {
        this.W.setColor(i10);
        invalidate(this.O);
    }

    public void setPlayedColor(@l int i10) {
        this.S.setColor(i10);
        invalidate(this.O);
    }

    public void setPosition(long j10) {
        this.f5470x0 = j10;
        setContentDescription(getProgressText());
        v();
    }

    public void setScrubberColor(@l int i10) {
        this.f5447a0.setColor(i10);
        invalidate(this.O);
    }

    public void setUnplayedColor(@l int i10) {
        this.U.setColor(i10);
        invalidate(this.O);
    }

    public final void t(long j10) {
        this.f5468v0 = j10;
        this.f5467u0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e.a> it = this.f5460n0.iterator();
        while (it.hasNext()) {
            it.next().f(this, j10);
        }
    }

    public final void u(boolean z10) {
        removeCallbacks(this.f5459m0);
        this.f5467u0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e.a> it = this.f5460n0.iterator();
        while (it.hasNext()) {
            it.next().c(this, this.f5468v0, z10);
        }
    }

    public final void v() {
        this.Q.set(this.P);
        this.R.set(this.P);
        long j10 = this.f5467u0 ? this.f5468v0 : this.f5470x0;
        if (this.f5469w0 > 0) {
            Rect rect = this.Q;
            Rect rect2 = this.P;
            rect.right = Math.min(rect2.left + ((int) ((((long) this.P.width()) * this.f5471y0) / this.f5469w0)), rect2.right);
            int width = (int) ((((long) this.P.width()) * j10) / this.f5469w0);
            Rect rect3 = this.R;
            Rect rect4 = this.P;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.Q;
            int i10 = this.P.left;
            rect5.right = i10;
            this.R.right = i10;
        }
        invalidate(this.O);
    }

    public final void w() {
        Drawable drawable = this.f5448b0;
        if (drawable != null && drawable.isStateful() && this.f5448b0.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void x(long j10) {
        if (this.f5468v0 != j10) {
            this.f5468v0 = j10;
            Iterator<e.a> it = this.f5460n0.iterator();
            while (it.hasNext()) {
                it.next().a(this, j10);
            }
        }
    }
}
