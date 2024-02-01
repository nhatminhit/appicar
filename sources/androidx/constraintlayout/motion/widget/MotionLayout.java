package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.e;
import d.o0;
import f1.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v.p;
import v.q;
import y3.q;
import z.d;
import z.e;
import z.m;

public class MotionLayout extends ConstraintLayout implements m0 {
    public static final int K1 = 0;
    public static final int L1 = 1;
    public static final int M1 = 2;
    public static final int N1 = 3;
    public static final int O1 = 4;
    public static final int P1 = 5;
    public static final String Q1 = "MotionLayout";
    public static final boolean R1 = false;
    public static boolean S1 = false;
    public static final int T1 = 0;
    public static final int U1 = 1;
    public static final int V1 = 2;
    public static final int W1 = 50;
    public static final int X1 = 0;
    public static final int Y1 = 1;
    public static final int Z1 = 2;

    /* renamed from: a2  reason: collision with root package name */
    public static final int f1582a2 = 3;

    /* renamed from: b2  reason: collision with root package name */
    public static final float f1583b2 = 1.0E-5f;
    public int A0 = -1;
    public float A1;
    public int B0 = -1;
    public v.g B1 = new v.g();
    public int C0 = -1;
    public boolean C1 = false;
    public int D0 = 0;
    public h D1;
    public int E0 = 0;
    public j E1 = j.UNDEFINED;
    public boolean F0 = true;
    public e F1 = new e();
    public HashMap<View, p> G0 = new HashMap<>();
    public boolean G1 = false;
    public long H0 = 0;
    public RectF H1 = new RectF();
    public float I0 = 1.0f;
    public View I1 = null;
    public float J0 = 0.0f;
    public ArrayList<Integer> J1 = new ArrayList<>();
    public float K0 = 0.0f;
    public long L0;
    public float M0 = 0.0f;
    public boolean N0;
    public boolean O0 = false;
    public boolean P0 = false;
    public i Q0;
    public float R0;
    public float S0;
    public int T0 = 0;
    public d U0;
    public boolean V0 = false;
    public u.h W0 = new u.h();
    public c X0 = new c();
    public v.d Y0;
    public boolean Z0 = true;

    /* renamed from: a1  reason: collision with root package name */
    public int f1584a1;

    /* renamed from: b1  reason: collision with root package name */
    public int f1585b1;

    /* renamed from: c1  reason: collision with root package name */
    public int f1586c1;

    /* renamed from: d1  reason: collision with root package name */
    public int f1587d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f1588e1 = false;

    /* renamed from: f1  reason: collision with root package name */
    public float f1589f1;

    /* renamed from: g1  reason: collision with root package name */
    public float f1590g1;

    /* renamed from: h1  reason: collision with root package name */
    public long f1591h1;

    /* renamed from: i1  reason: collision with root package name */
    public float f1592i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f1593j1 = false;

    /* renamed from: k1  reason: collision with root package name */
    public ArrayList<MotionHelper> f1594k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    public ArrayList<MotionHelper> f1595l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList<i> f1596m1 = null;

    /* renamed from: n1  reason: collision with root package name */
    public int f1597n1 = 0;

    /* renamed from: o1  reason: collision with root package name */
    public long f1598o1 = -1;

    /* renamed from: p1  reason: collision with root package name */
    public float f1599p1 = 0.0f;

    /* renamed from: q1  reason: collision with root package name */
    public int f1600q1 = 0;

    /* renamed from: r1  reason: collision with root package name */
    public float f1601r1 = 0.0f;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f1602s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f1603t1 = false;

    /* renamed from: u1  reason: collision with root package name */
    public int f1604u1;

    /* renamed from: v1  reason: collision with root package name */
    public int f1605v1;

    /* renamed from: w1  reason: collision with root package name */
    public int f1606w1;

    /* renamed from: x0  reason: collision with root package name */
    public a f1607x0;

    /* renamed from: x1  reason: collision with root package name */
    public int f1608x1;

    /* renamed from: y0  reason: collision with root package name */
    public Interpolator f1609y0;

    /* renamed from: y1  reason: collision with root package name */
    public int f1610y1;

    /* renamed from: z0  reason: collision with root package name */
    public float f1611z0 = 0.0f;

    /* renamed from: z1  reason: collision with root package name */
    public int f1612z1;

    public class a implements Runnable {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void run() {
            this.O.setNestedScrollingEnabled(true);
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1613a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$j[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1613a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.j.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1613a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.j.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1613a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.j.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1613a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$j r1 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.b.<clinit>():void");
        }
    }

    public class c extends q {

        /* renamed from: a  reason: collision with root package name */
        public float f1614a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1615b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1616c;

        public c() {
        }

        public float a() {
            return MotionLayout.this.f1611z0;
        }

        public void b(float f10, float f11, float f12) {
            this.f1614a = f10;
            this.f1615b = f11;
            this.f1616c = f12;
        }

        public float getInterpolation(float f10) {
            float f11;
            float f12 = this.f1614a;
            if (f12 > 0.0f) {
                float f13 = this.f1616c;
                if (f12 / f13 < f10) {
                    f10 = f12 / f13;
                }
                MotionLayout.this.f1611z0 = f12 - (f13 * f10);
                f11 = (f12 * f10) - (((f13 * f10) * f10) / 2.0f);
            } else {
                float f14 = this.f1616c;
                if ((-f12) / f14 < f10) {
                    f10 = (-f12) / f14;
                }
                MotionLayout.this.f1611z0 = (f14 * f10) + f12;
                f11 = (f12 * f10) + (((f14 * f10) * f10) / 2.0f);
            }
            return f11 + this.f1615b;
        }
    }

    public class d {

        /* renamed from: v  reason: collision with root package name */
        public static final int f1618v = 16;

        /* renamed from: a  reason: collision with root package name */
        public float[] f1619a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f1620b;

        /* renamed from: c  reason: collision with root package name */
        public float[] f1621c;

        /* renamed from: d  reason: collision with root package name */
        public Path f1622d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1623e;

        /* renamed from: f  reason: collision with root package name */
        public Paint f1624f;

        /* renamed from: g  reason: collision with root package name */
        public Paint f1625g;

        /* renamed from: h  reason: collision with root package name */
        public Paint f1626h;

        /* renamed from: i  reason: collision with root package name */
        public Paint f1627i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f1628j;

        /* renamed from: k  reason: collision with root package name */
        public final int f1629k = -21965;

        /* renamed from: l  reason: collision with root package name */
        public final int f1630l = -2067046;

        /* renamed from: m  reason: collision with root package name */
        public final int f1631m = -13391360;

        /* renamed from: n  reason: collision with root package name */
        public final int f1632n = 1996488704;

        /* renamed from: o  reason: collision with root package name */
        public final int f1633o = 10;

        /* renamed from: p  reason: collision with root package name */
        public DashPathEffect f1634p;

        /* renamed from: q  reason: collision with root package name */
        public int f1635q;

        /* renamed from: r  reason: collision with root package name */
        public Rect f1636r = new Rect();

        /* renamed from: s  reason: collision with root package name */
        public boolean f1637s = false;

        /* renamed from: t  reason: collision with root package name */
        public int f1638t = 1;

        public d() {
            Paint paint = new Paint();
            this.f1623e = paint;
            paint.setAntiAlias(true);
            this.f1623e.setColor(-21965);
            this.f1623e.setStrokeWidth(2.0f);
            this.f1623e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1624f = paint2;
            paint2.setAntiAlias(true);
            this.f1624f.setColor(-2067046);
            this.f1624f.setStrokeWidth(2.0f);
            this.f1624f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1625g = paint3;
            paint3.setAntiAlias(true);
            this.f1625g.setColor(-13391360);
            this.f1625g.setStrokeWidth(2.0f);
            this.f1625g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1626h = paint4;
            paint4.setAntiAlias(true);
            this.f1626h.setColor(-13391360);
            this.f1626h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1628j = new float[8];
            Paint paint5 = new Paint();
            this.f1627i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1634p = dashPathEffect;
            this.f1625g.setPathEffect(dashPathEffect);
            this.f1621c = new float[100];
            this.f1620b = new int[50];
            if (this.f1637s) {
                this.f1623e.setStrokeWidth(8.0f);
                this.f1627i.setStrokeWidth(8.0f);
                this.f1624f.setStrokeWidth(8.0f);
                this.f1638t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, p> hashMap, int i10, int i11) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i11 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.C0) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f1626h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f1623e);
                }
                for (p next : hashMap.values()) {
                    int l10 = next.l();
                    if (i11 > 0 && l10 == 0) {
                        l10 = 1;
                    }
                    if (l10 != 0) {
                        this.f1635q = next.e(this.f1621c, this.f1620b);
                        if (l10 >= 1) {
                            int i12 = i10 / 16;
                            float[] fArr = this.f1619a;
                            if (fArr == null || fArr.length != i12 * 2) {
                                this.f1619a = new float[(i12 * 2)];
                                this.f1622d = new Path();
                            }
                            int i13 = this.f1638t;
                            canvas.translate((float) i13, (float) i13);
                            this.f1623e.setColor(1996488704);
                            this.f1627i.setColor(1996488704);
                            this.f1624f.setColor(1996488704);
                            this.f1625g.setColor(1996488704);
                            next.f(this.f1619a, i12);
                            b(canvas, l10, this.f1635q, next);
                            this.f1623e.setColor(-21965);
                            this.f1624f.setColor(-2067046);
                            this.f1627i.setColor(-2067046);
                            this.f1625g.setColor(-13391360);
                            int i14 = this.f1638t;
                            canvas.translate((float) (-i14), (float) (-i14));
                            b(canvas, l10, this.f1635q, next);
                            if (l10 == 5) {
                                j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i10, int i11, p pVar) {
            if (i10 == 4) {
                d(canvas);
            }
            if (i10 == 2) {
                g(canvas);
            }
            if (i10 == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i10, i11, pVar);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.f1619a, this.f1623e);
        }

        public final void d(Canvas canvas) {
            boolean z10 = false;
            boolean z11 = false;
            for (int i10 = 0; i10 < this.f1635q; i10++) {
                int i11 = this.f1620b[i10];
                if (i11 == 1) {
                    z10 = true;
                }
                if (i11 == 2) {
                    z11 = true;
                }
            }
            if (z10) {
                g(canvas);
            }
            if (z11) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.f1619a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f1625g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f1625g);
        }

        public final void f(Canvas canvas, float f10, float f11) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1619a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f10 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d))) / 100.0f);
            m(str, this.f1626h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f1636r.width() / 2))) + min, f11 - 20.0f, this.f1626h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f1625g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d))) / 100.0f);
            m(str2, this.f1626h);
            canvas2.drawText(str2, f10 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1636r.height() / 2))), this.f1626h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f1625g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.f1619a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1625g);
        }

        public final void h(Canvas canvas, float f10, float f11) {
            float[] fArr = this.f1619a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f12 - f14), (double) (f13 - f15));
            float f16 = f14 - f12;
            float f17 = f15 - f13;
            float f18 = (((f10 - f12) * f16) + ((f11 - f13) * f17)) / (hypot * hypot);
            float f19 = f12 + (f16 * f18);
            float f20 = f13 + (f18 * f17);
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f19, f20);
            float hypot2 = (float) Math.hypot((double) (f19 - f10), (double) (f20 - f11));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            m(str, this.f1626h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f1636r.width() / 2)), -20.0f, this.f1626h);
            canvas.drawLine(f10, f11, f19, f20, this.f1625g);
        }

        public final void i(Canvas canvas, float f10, float f11, int i10, int i11) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f10 - ((float) (i10 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i10)))) + 0.5d))) / 100.0f);
            m(str, this.f1626h);
            canvas2.drawText(str, ((f10 / 2.0f) - ((float) (this.f1636r.width() / 2))) + 0.0f, f11 - 20.0f, this.f1626h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f1625g);
            String str2 = "" + (((float) ((int) (((double) (((f11 - ((float) (i11 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i11)))) + 0.5d))) / 100.0f);
            m(str2, this.f1626h);
            canvas2.drawText(str2, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - ((float) (this.f1636r.height() / 2))), this.f1626h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f1625g);
        }

        public final void j(Canvas canvas, p pVar) {
            this.f1622d.reset();
            for (int i10 = 0; i10 <= 50; i10++) {
                pVar.g(((float) i10) / ((float) 50), this.f1628j, 0);
                Path path = this.f1622d;
                float[] fArr = this.f1628j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1622d;
                float[] fArr2 = this.f1628j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1622d;
                float[] fArr3 = this.f1628j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1622d;
                float[] fArr4 = this.f1628j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1622d.close();
            }
            this.f1623e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1622d, this.f1623e);
            canvas.translate(-2.0f, -2.0f);
            this.f1623e.setColor(s0.a.f12612c);
            canvas.drawPath(this.f1622d, this.f1623e);
        }

        public final void k(Canvas canvas, int i10, int i11, p pVar) {
            int i12;
            int i13;
            float f10;
            float f11;
            int i14;
            Canvas canvas2 = canvas;
            int i15 = i10;
            p pVar2 = pVar;
            View view = pVar2.f14083a;
            if (view != null) {
                i13 = view.getWidth();
                i12 = pVar2.f14083a.getHeight();
            } else {
                i13 = 0;
                i12 = 0;
            }
            for (int i16 = 1; i16 < i11 - 1; i16++) {
                if (i15 != 4 || this.f1620b[i16 - 1] != 0) {
                    float[] fArr = this.f1621c;
                    int i17 = i16 * 2;
                    float f12 = fArr[i17];
                    float f13 = fArr[i17 + 1];
                    this.f1622d.reset();
                    this.f1622d.moveTo(f12, f13 + 10.0f);
                    this.f1622d.lineTo(f12 + 10.0f, f13);
                    this.f1622d.lineTo(f12, f13 - 10.0f);
                    this.f1622d.lineTo(f12 - 10.0f, f13);
                    this.f1622d.close();
                    int i18 = i16 - 1;
                    pVar2.o(i18);
                    if (i15 == 4) {
                        int i19 = this.f1620b[i18];
                        if (i19 == 1) {
                            h(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i19 == 2) {
                            f(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i19 == 3) {
                            i14 = 3;
                            f11 = f13;
                            f10 = f12;
                            i(canvas, f12 - 0.0f, f13 - 0.0f, i13, i12);
                            canvas2.drawPath(this.f1622d, this.f1627i);
                        }
                        i14 = 3;
                        f11 = f13;
                        f10 = f12;
                        canvas2.drawPath(this.f1622d, this.f1627i);
                    } else {
                        i14 = 3;
                        f11 = f13;
                        f10 = f12;
                    }
                    if (i15 == 2) {
                        h(canvas2, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i15 == i14) {
                        f(canvas2, f10 - 0.0f, f11 - 0.0f);
                    }
                    if (i15 == 6) {
                        i(canvas, f10 - 0.0f, f11 - 0.0f, i13, i12);
                    }
                    canvas2.drawPath(this.f1622d, this.f1627i);
                }
            }
            float[] fArr2 = this.f1619a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1624f);
                float[] fArr3 = this.f1619a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1624f);
            }
        }

        public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
            canvas.drawRect(f10, f11, f12, f13, this.f1625g);
            canvas.drawLine(f10, f11, f12, f13, this.f1625g);
        }

        public void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1636r);
        }
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public z.f f1640a = new z.f();

        /* renamed from: b  reason: collision with root package name */
        public z.f f1641b = new z.f();

        /* renamed from: c  reason: collision with root package name */
        public androidx.constraintlayout.widget.d f1642c = null;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.d f1643d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1644e;

        /* renamed from: f  reason: collision with root package name */
        public int f1645f;

        public e() {
        }

        public void a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.G0.clear();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = MotionLayout.this.getChildAt(i10);
                MotionLayout.this.G0.put(childAt, new p(childAt));
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = MotionLayout.this.getChildAt(i11);
                p pVar = MotionLayout.this.G0.get(childAt2);
                if (pVar != null) {
                    if (this.f1642c != null) {
                        z.e f10 = f(this.f1640a, childAt2);
                        if (f10 != null) {
                            pVar.G(f10, this.f1642c);
                        } else if (MotionLayout.this.T0 != 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(v.c.g());
                            sb2.append("no widget for  ");
                            sb2.append(v.c.k(childAt2));
                            sb2.append(" (");
                            sb2.append(childAt2.getClass().getName());
                            sb2.append(")");
                        }
                    }
                    if (this.f1643d != null) {
                        z.e f11 = f(this.f1641b, childAt2);
                        if (f11 != null) {
                            pVar.D(f11, this.f1643d);
                        } else if (MotionLayout.this.T0 != 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(v.c.g());
                            sb3.append("no widget for  ");
                            sb3.append(v.c.k(childAt2));
                            sb3.append(" (");
                            sb3.append(childAt2.getClass().getName());
                            sb3.append(")");
                        }
                    }
                }
            }
        }

        public void b(z.f fVar, z.f fVar2) {
            ArrayList<z.e> P1 = fVar.P1();
            HashMap hashMap = new HashMap();
            hashMap.put(fVar, fVar2);
            fVar2.P1().clear();
            fVar2.n(fVar, hashMap);
            Iterator<z.e> it = P1.iterator();
            while (it.hasNext()) {
                z.e next = it.next();
                z.e aVar = next instanceof z.a ? new z.a() : next instanceof z.h ? new z.h() : next instanceof z.g ? new z.g() : next instanceof z.i ? new z.j() : new z.e();
                fVar2.b(aVar);
                hashMap.put(next, aVar);
            }
            Iterator<z.e> it2 = P1.iterator();
            while (it2.hasNext()) {
                z.e next2 = it2.next();
                ((z.e) hashMap.get(next2)).n(next2, hashMap);
            }
        }

        public final void c(String str, z.f fVar) {
            String str2 = str + " " + v.c.k((View) fVar.w());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("  ========= ");
            sb2.append(fVar);
            int size = fVar.P1().size();
            for (int i10 = 0; i10 < size; i10++) {
                String str3 = str2 + "[" + i10 + "] ";
                z.e eVar = fVar.P1().get(i10);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                String str4 = "_";
                sb3.append(eVar.K.f15623f != null ? w1.a.X4 : str4);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(eVar.M.f15623f != null ? "B" : str4);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                sb7.append(eVar.J.f15623f != null ? "L" : str4);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb8);
                if (eVar.L.f15623f != null) {
                    str4 = "R";
                }
                sb9.append(str4);
                String sb10 = sb9.toString();
                View view = (View) eVar.w();
                String k10 = v.c.k(view);
                if (view instanceof TextView) {
                    k10 = k10 + "(" + ((TextView) view).getText() + ")";
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str3);
                sb11.append(q.a.R);
                sb11.append(k10);
                sb11.append(" ");
                sb11.append(eVar);
                sb11.append(" ");
                sb11.append(sb10);
            }
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str2);
            sb12.append(" done. ");
        }

        public final void d(String str, ConstraintLayout.b bVar) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(bVar.f1840q != -1 ? "SS" : "__");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            String str2 = "|__";
            sb4.append(bVar.f1839p != -1 ? "|SE" : str2);
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append(bVar.f1841r != -1 ? "|ES" : str2);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            sb8.append(bVar.f1842s != -1 ? "|EE" : str2);
            String sb9 = sb8.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            sb10.append(bVar.f1815d != -1 ? "|LL" : str2);
            String sb11 = sb10.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(sb11);
            sb12.append(bVar.f1817e != -1 ? "|LR" : str2);
            String sb13 = sb12.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append(sb13);
            sb14.append(bVar.f1819f != -1 ? "|RL" : str2);
            String sb15 = sb14.toString();
            StringBuilder sb16 = new StringBuilder();
            sb16.append(sb15);
            sb16.append(bVar.f1821g != -1 ? "|RR" : str2);
            String sb17 = sb16.toString();
            StringBuilder sb18 = new StringBuilder();
            sb18.append(sb17);
            sb18.append(bVar.f1823h != -1 ? "|TT" : str2);
            String sb19 = sb18.toString();
            StringBuilder sb20 = new StringBuilder();
            sb20.append(sb19);
            sb20.append(bVar.f1825i != -1 ? "|TB" : str2);
            String sb21 = sb20.toString();
            StringBuilder sb22 = new StringBuilder();
            sb22.append(sb21);
            sb22.append(bVar.f1827j != -1 ? "|BT" : str2);
            String sb23 = sb22.toString();
            StringBuilder sb24 = new StringBuilder();
            sb24.append(sb23);
            if (bVar.f1829k != -1) {
                str2 = "|BB";
            }
            sb24.append(str2);
            String sb25 = sb24.toString();
            StringBuilder sb26 = new StringBuilder();
            sb26.append(str);
            sb26.append(sb25);
        }

        public final void e(String str, z.e eVar) {
            String str2;
            String str3;
            String str4;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            String str5 = "B";
            String str6 = "__";
            if (eVar.K.f15623f != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w1.a.X4);
                sb3.append(eVar.K.f15623f.f15622e == d.b.TOP ? w1.a.X4 : str5);
                str2 = sb3.toString();
            } else {
                str2 = str6;
            }
            sb2.append(str2);
            String sb4 = sb2.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (eVar.M.f15623f != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str5);
                if (eVar.M.f15623f.f15622e == d.b.TOP) {
                    str5 = w1.a.X4;
                }
                sb6.append(str5);
                str3 = sb6.toString();
            } else {
                str3 = str6;
            }
            sb5.append(str3);
            String sb7 = sb5.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb7);
            String str7 = "R";
            if (eVar.J.f15623f != null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append("L");
                sb9.append(eVar.J.f15623f.f15622e == d.b.LEFT ? "L" : str7);
                str4 = sb9.toString();
            } else {
                str4 = str6;
            }
            sb8.append(str4);
            String sb10 = sb8.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (eVar.L.f15623f != null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str7);
                if (eVar.L.f15623f.f15622e == d.b.LEFT) {
                    str7 = "L";
                }
                sb12.append(str7);
                str6 = sb12.toString();
            }
            sb11.append(str6);
            String sb13 = sb11.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append(str);
            sb14.append(sb13);
            sb14.append(" ---  ");
            sb14.append(eVar);
        }

        public z.e f(z.f fVar, View view) {
            if (fVar.w() == view) {
                return fVar;
            }
            ArrayList<z.e> P1 = fVar.P1();
            int size = P1.size();
            for (int i10 = 0; i10 < size; i10++) {
                z.e eVar = P1.get(i10);
                if (eVar.w() == view) {
                    return eVar;
                }
            }
            return null;
        }

        public void g(z.f fVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
            this.f1642c = dVar;
            this.f1643d = dVar2;
            this.f1640a = new z.f();
            this.f1641b = new z.f();
            this.f1640a.y2(MotionLayout.this.Q.k2());
            this.f1641b.y2(MotionLayout.this.Q.k2());
            this.f1640a.T1();
            this.f1641b.T1();
            b(MotionLayout.this.Q, this.f1640a);
            b(MotionLayout.this.Q, this.f1641b);
            if (((double) MotionLayout.this.K0) > 0.5d) {
                if (dVar != null) {
                    l(this.f1640a, dVar);
                }
                l(this.f1641b, dVar2);
            } else {
                l(this.f1641b, dVar2);
                if (dVar != null) {
                    l(this.f1640a, dVar);
                }
            }
            this.f1640a.B2(MotionLayout.this.w());
            this.f1640a.D2();
            this.f1641b.B2(MotionLayout.this.w());
            this.f1641b.D2();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    z.f fVar2 = this.f1640a;
                    e.b bVar = e.b.WRAP_CONTENT;
                    fVar2.i1(bVar);
                    this.f1641b.i1(bVar);
                }
                if (layoutParams.height == -2) {
                    z.f fVar3 = this.f1640a;
                    e.b bVar2 = e.b.WRAP_CONTENT;
                    fVar3.D1(bVar2);
                    this.f1641b.D1(bVar2);
                }
            }
        }

        public boolean h(int i10, int i11) {
            return (i10 == this.f1644e && i11 == this.f1645f) ? false : true;
        }

        public void i(int i10, int i11) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f1610y1 = mode;
            motionLayout.f1612z1 = mode2;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            MotionLayout motionLayout2 = MotionLayout.this;
            if (motionLayout2.B0 == motionLayout2.getStartState()) {
                MotionLayout.this.B(this.f1641b, optimizationLevel, i10, i11);
                if (this.f1642c != null) {
                    MotionLayout.this.B(this.f1640a, optimizationLevel, i10, i11);
                }
            } else {
                if (this.f1642c != null) {
                    MotionLayout.this.B(this.f1640a, optimizationLevel, i10, i11);
                }
                MotionLayout.this.B(this.f1641b, optimizationLevel, i10, i11);
            }
            boolean z10 = false;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.f1610y1 = mode;
                motionLayout3.f1612z1 = mode2;
                if (motionLayout3.B0 == motionLayout3.getStartState()) {
                    MotionLayout.this.B(this.f1641b, optimizationLevel, i10, i11);
                    if (this.f1642c != null) {
                        MotionLayout.this.B(this.f1640a, optimizationLevel, i10, i11);
                    }
                } else {
                    if (this.f1642c != null) {
                        MotionLayout.this.B(this.f1640a, optimizationLevel, i10, i11);
                    }
                    MotionLayout.this.B(this.f1641b, optimizationLevel, i10, i11);
                }
                MotionLayout.this.f1604u1 = this.f1640a.j0();
                MotionLayout.this.f1605v1 = this.f1640a.D();
                MotionLayout.this.f1606w1 = this.f1641b.j0();
                MotionLayout.this.f1608x1 = this.f1641b.D();
                MotionLayout motionLayout4 = MotionLayout.this;
                motionLayout4.f1603t1 = (motionLayout4.f1604u1 == motionLayout4.f1606w1 && motionLayout4.f1605v1 == motionLayout4.f1608x1) ? false : true;
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            int i12 = motionLayout5.f1604u1;
            int i13 = motionLayout5.f1605v1;
            int i14 = motionLayout5.f1610y1;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                i12 = (int) (((float) i12) + (motionLayout5.A1 * ((float) (motionLayout5.f1606w1 - i12))));
            }
            int i15 = motionLayout5.f1612z1;
            if (i15 == Integer.MIN_VALUE || i15 == 0) {
                i13 = (int) (((float) i13) + (motionLayout5.A1 * ((float) (motionLayout5.f1608x1 - i13))));
            }
            boolean z11 = this.f1640a.t2() || this.f1641b.t2();
            if (this.f1640a.r2() || this.f1641b.r2()) {
                z10 = true;
            }
            MotionLayout.this.A(i10, i11, i12, i13, z11, z10);
        }

        public void j() {
            i(MotionLayout.this.D0, MotionLayout.this.E0);
            MotionLayout.this.J0();
        }

        public void k(int i10, int i11) {
            this.f1644e = i10;
            this.f1645f = i11;
        }

        public final void l(z.f fVar, androidx.constraintlayout.widget.d dVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.a aVar = new Constraints.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            Iterator<z.e> it = fVar.P1().iterator();
            while (it.hasNext()) {
                z.e next = it.next();
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<z.e> it2 = fVar.P1().iterator();
            while (it2.hasNext()) {
                z.e next2 = it2.next();
                View view = (View) next2.w();
                dVar.o(view.getId(), aVar);
                next2.H1(dVar.l0(view.getId()));
                next2.d1(dVar.f0(view.getId()));
                if (view instanceof ConstraintHelper) {
                    dVar.m((ConstraintHelper) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).y();
                    }
                }
                aVar.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.i(false, view, next2, aVar, sparseArray);
                next2.G1(dVar.k0(view.getId()) == 1 ? view.getVisibility() : dVar.j0(view.getId()));
            }
            Iterator<z.e> it3 = fVar.P1().iterator();
            while (it3.hasNext()) {
                z.e next3 = it3.next();
                if (next3 instanceof m) {
                    z.i iVar = (z.i) next3;
                    ((ConstraintHelper) next3.w()).x(fVar, iVar, sparseArray);
                    ((m) iVar).R1();
                }
            }
        }
    }

    public interface f {
        void a();

        void b(int i10, float f10);

        float c(int i10);

        void clear();

        float d(int i10);

        void e(MotionEvent motionEvent);

        float f();

        float g();

        void h(int i10);
    }

    public static class g implements f {

        /* renamed from: b  reason: collision with root package name */
        public static g f1647b = new g();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f1648a;

        public static g i() {
            f1647b.f1648a = VelocityTracker.obtain();
            return f1647b;
        }

        public void a() {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1648a = null;
            }
        }

        public void b(int i10, float f10) {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10, f10);
            }
        }

        public float c(int i10) {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i10);
            }
            return 0.0f;
        }

        public void clear() {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        public float d(int i10) {
            if (this.f1648a != null) {
                return d(i10);
            }
            return 0.0f;
        }

        public void e(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public float f() {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        public float g() {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public void h(int i10) {
            VelocityTracker velocityTracker = this.f1648a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i10);
            }
        }
    }

    public class h {

        /* renamed from: a  reason: collision with root package name */
        public float f1649a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f1650b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f1651c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1652d = -1;

        /* renamed from: e  reason: collision with root package name */
        public final String f1653e = "motion.progress";

        /* renamed from: f  reason: collision with root package name */
        public final String f1654f = "motion.velocity";

        /* renamed from: g  reason: collision with root package name */
        public final String f1655g = "motion.StartState";

        /* renamed from: h  reason: collision with root package name */
        public final String f1656h = "motion.EndState";

        public h() {
        }

        public void a() {
            int i10 = this.f1651c;
            if (!(i10 == -1 && this.f1652d == -1)) {
                if (i10 == -1) {
                    MotionLayout.this.N0(this.f1652d);
                } else {
                    int i11 = this.f1652d;
                    if (i11 == -1) {
                        MotionLayout.this.F(i10, -1, -1);
                    } else {
                        MotionLayout.this.I0(i10, i11);
                    }
                }
                MotionLayout.this.setState(j.SETUP);
            }
            if (!Float.isNaN(this.f1650b)) {
                MotionLayout.this.H0(this.f1649a, this.f1650b);
                this.f1649a = Float.NaN;
                this.f1650b = Float.NaN;
                this.f1651c = -1;
                this.f1652d = -1;
            } else if (!Float.isNaN(this.f1649a)) {
                MotionLayout.this.setProgress(this.f1649a);
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f1649a);
            bundle.putFloat("motion.velocity", this.f1650b);
            bundle.putInt("motion.StartState", this.f1651c);
            bundle.putInt("motion.EndState", this.f1652d);
            return bundle;
        }

        public void c() {
            this.f1652d = MotionLayout.this.C0;
            this.f1651c = MotionLayout.this.A0;
            this.f1650b = MotionLayout.this.getVelocity();
            this.f1649a = MotionLayout.this.getProgress();
        }

        public void d(int i10) {
            this.f1652d = i10;
        }

        public void e(float f10) {
            this.f1649a = f10;
        }

        public void f(int i10) {
            this.f1651c = i10;
        }

        public void g(Bundle bundle) {
            this.f1649a = bundle.getFloat("motion.progress");
            this.f1650b = bundle.getFloat("motion.velocity");
            this.f1651c = bundle.getInt("motion.StartState");
            this.f1652d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f1650b = f10;
        }
    }

    public interface i {
        void a(MotionLayout motionLayout, int i10, int i11, float f10);

        void b(MotionLayout motionLayout, int i10, int i11);

        void c(MotionLayout motionLayout, int i10, boolean z10, float f10);

        void d(MotionLayout motionLayout, int i10);
    }

    public enum j {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@d.m0 Context context) {
        super(context);
        y0((AttributeSet) null);
    }

    public MotionLayout(@d.m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        y0(attributeSet);
    }

    public MotionLayout(@d.m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        y0(attributeSet);
    }

    public static boolean R0(float f10, float f11, float f12) {
        if (f10 > 0.0f) {
            float f13 = f10 / f12;
            return f11 + ((f10 * f13) - (((f12 * f13) * f13) / 2.0f)) > 1.0f;
        }
        float f14 = (-f10) / f12;
        return f11 + ((f10 * f14) + (((f12 * f14) * f14) / 2.0f)) < 0.0f;
    }

    public int A0(String str) {
        a aVar = this.f1607x0;
        if (aVar == null) {
            return 0;
        }
        return aVar.L(str);
    }

    public f B0() {
        return g.i();
    }

    public void C0() {
        a aVar = this.f1607x0;
        if (aVar != null) {
            if (aVar.g(this, this.B0)) {
                requestLayout();
                return;
            }
            int i10 = this.B0;
            if (i10 != -1) {
                this.f1607x0.e(this, i10);
            }
            if (this.f1607x0.e0()) {
                this.f1607x0.c0();
            }
        }
    }

    public final void D0() {
        ArrayList<i> arrayList;
        if (this.Q0 != null || ((arrayList = this.f1596m1) != null && !arrayList.isEmpty())) {
            this.f1602s1 = false;
            Iterator<Integer> it = this.J1.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                i iVar = this.Q0;
                if (iVar != null) {
                    iVar.d(this, next.intValue());
                }
                ArrayList<i> arrayList2 = this.f1596m1;
                if (arrayList2 != null) {
                    Iterator<i> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(this, next.intValue());
                    }
                }
            }
            this.J1.clear();
        }
    }

    @Deprecated
    public void E0() {
        F0();
    }

    public void F(int i10, int i11, int i12) {
        setState(j.SETUP);
        this.B0 = i10;
        this.A0 = -1;
        this.C0 = -1;
        androidx.constraintlayout.widget.b bVar = this.f1782b0;
        if (bVar != null) {
            bVar.e(i10, (float) i11, (float) i12);
            return;
        }
        a aVar = this.f1607x0;
        if (aVar != null) {
            aVar.k(i10).l(this);
        }
    }

    public void F0() {
        this.F1.j();
        invalidate();
    }

    public boolean G0(i iVar) {
        ArrayList<i> arrayList = this.f1596m1;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(iVar);
    }

    public void H0(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.D1 == null) {
                this.D1 = new h();
            }
            this.D1.e(f10);
            this.D1.h(f11);
            return;
        }
        setProgress(f10);
        setState(j.MOVING);
        this.f1611z0 = f11;
        d0(1.0f);
    }

    public void I0(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.D1 == null) {
                this.D1 = new h();
            }
            this.D1.f(i10);
            this.D1.d(i11);
            return;
        }
        a aVar = this.f1607x0;
        if (aVar != null) {
            this.A0 = i10;
            this.C0 = i11;
            aVar.a0(i10, i11);
            this.F1.g(this.Q, this.f1607x0.k(i10), this.f1607x0.k(i11));
            F0();
            this.K0 = 0.0f;
            M0();
        }
    }

    public final void J0() {
        int childCount = getChildCount();
        this.F1.a();
        boolean z10 = true;
        this.O0 = true;
        int width = getWidth();
        int height = getHeight();
        int j10 = this.f1607x0.j();
        int i10 = 0;
        if (j10 != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                p pVar = this.G0.get(getChildAt(i11));
                if (pVar != null) {
                    pVar.E(j10);
                }
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            p pVar2 = this.G0.get(getChildAt(i12));
            if (pVar2 != null) {
                this.f1607x0.v(pVar2);
                pVar2.I(width, height, this.I0, getNanoTime());
            }
        }
        float C = this.f1607x0.C();
        if (C != 0.0f) {
            boolean z11 = ((double) C) < 0.0d;
            float abs = Math.abs(C);
            float f10 = -3.4028235E38f;
            float f11 = Float.MAX_VALUE;
            float f12 = -3.4028235E38f;
            float f13 = Float.MAX_VALUE;
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    z10 = false;
                    break;
                }
                p pVar3 = this.G0.get(getChildAt(i13));
                if (!Float.isNaN(pVar3.f14093k)) {
                    break;
                }
                float m10 = pVar3.m();
                float n10 = pVar3.n();
                float f14 = z11 ? n10 - m10 : n10 + m10;
                f13 = Math.min(f13, f14);
                f12 = Math.max(f12, f14);
                i13++;
            }
            if (z10) {
                for (int i14 = 0; i14 < childCount; i14++) {
                    p pVar4 = this.G0.get(getChildAt(i14));
                    if (!Float.isNaN(pVar4.f14093k)) {
                        f11 = Math.min(f11, pVar4.f14093k);
                        f10 = Math.max(f10, pVar4.f14093k);
                    }
                }
                while (i10 < childCount) {
                    p pVar5 = this.G0.get(getChildAt(i10));
                    if (!Float.isNaN(pVar5.f14093k)) {
                        pVar5.f14095m = 1.0f / (1.0f - abs);
                        float f15 = pVar5.f14093k;
                        pVar5.f14094l = abs - (z11 ? ((f10 - f15) / (f10 - f11)) * abs : ((f15 - f11) * abs) / (f10 - f11));
                    }
                    i10++;
                }
                return;
            }
            while (i10 < childCount) {
                p pVar6 = this.G0.get(getChildAt(i10));
                float m11 = pVar6.m();
                float n11 = pVar6.n();
                float f16 = z11 ? n11 - m11 : n11 + m11;
                pVar6.f14095m = 1.0f / (1.0f - abs);
                pVar6.f14094l = abs - (((f16 - f13) * abs) / (f12 - f13));
                i10++;
            }
        }
    }

    public void K0(int i10, float f10, float f11) {
        Interpolator interpolator;
        if (this.f1607x0 != null && this.K0 != f10) {
            this.V0 = true;
            this.H0 = getNanoTime();
            float p10 = ((float) this.f1607x0.p()) / 1000.0f;
            this.I0 = p10;
            this.M0 = f10;
            this.O0 = true;
            if (i10 == 0 || i10 == 1 || i10 == 2) {
                if (i10 == 1) {
                    f10 = 0.0f;
                } else if (i10 == 2) {
                    f10 = 1.0f;
                }
                this.W0.c(this.K0, f10, f11, p10, this.f1607x0.w(), this.f1607x0.x());
            } else {
                if (i10 != 4) {
                    if (i10 == 5) {
                        if (!R0(f11, this.K0, this.f1607x0.w())) {
                            this.W0.c(this.K0, f10, f11, this.I0, this.f1607x0.w(), this.f1607x0.x());
                            this.f1611z0 = 0.0f;
                        }
                    }
                    this.N0 = false;
                    this.H0 = getNanoTime();
                    invalidate();
                }
                this.X0.b(f11, this.K0, this.f1607x0.w());
                interpolator = this.X0;
                this.f1609y0 = interpolator;
                this.N0 = false;
                this.H0 = getNanoTime();
                invalidate();
            }
            int i11 = this.B0;
            this.M0 = f10;
            this.B0 = i11;
            interpolator = this.W0;
            this.f1609y0 = interpolator;
            this.N0 = false;
            this.H0 = getNanoTime();
            invalidate();
        }
    }

    public void L0() {
        d0(1.0f);
    }

    public void M0() {
        d0(0.0f);
    }

    public void N0(int i10) {
        if (!isAttachedToWindow()) {
            if (this.D1 == null) {
                this.D1 = new h();
            }
            this.D1.d(i10);
            return;
        }
        O0(i10, -1, -1);
    }

    public void O0(int i10, int i11, int i12) {
        androidx.constraintlayout.widget.f fVar;
        int a10;
        a aVar = this.f1607x0;
        if (!(aVar == null || (fVar = aVar.f1665b) == null || (a10 = fVar.a(this.B0, i10, (float) i11, (float) i12)) == -1)) {
            i10 = a10;
        }
        int i13 = this.B0;
        if (i13 != i10) {
            if (this.A0 == i10) {
                d0(0.0f);
            } else if (this.C0 == i10) {
                d0(1.0f);
            } else {
                this.C0 = i10;
                if (i13 != -1) {
                    I0(i13, i10);
                    d0(1.0f);
                    this.K0 = 0.0f;
                    L0();
                    return;
                }
                this.V0 = false;
                this.M0 = 1.0f;
                this.J0 = 0.0f;
                this.K0 = 0.0f;
                this.L0 = getNanoTime();
                this.H0 = getNanoTime();
                this.N0 = false;
                this.f1609y0 = null;
                this.I0 = ((float) this.f1607x0.p()) / 1000.0f;
                this.A0 = -1;
                this.f1607x0.a0(-1, this.C0);
                this.f1607x0.D();
                int childCount = getChildCount();
                this.G0.clear();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = getChildAt(i14);
                    this.G0.put(childAt, new p(childAt));
                }
                this.O0 = true;
                this.F1.g(this.Q, (androidx.constraintlayout.widget.d) null, this.f1607x0.k(i10));
                F0();
                this.F1.a();
                h0();
                int width = getWidth();
                int height = getHeight();
                for (int i15 = 0; i15 < childCount; i15++) {
                    p pVar = this.G0.get(getChildAt(i15));
                    this.f1607x0.v(pVar);
                    pVar.I(width, height, this.I0, getNanoTime());
                }
                float C = this.f1607x0.C();
                if (C != 0.0f) {
                    float f10 = Float.MAX_VALUE;
                    float f11 = -3.4028235E38f;
                    for (int i16 = 0; i16 < childCount; i16++) {
                        p pVar2 = this.G0.get(getChildAt(i16));
                        float n10 = pVar2.n() + pVar2.m();
                        f10 = Math.min(f10, n10);
                        f11 = Math.max(f11, n10);
                    }
                    for (int i17 = 0; i17 < childCount; i17++) {
                        p pVar3 = this.G0.get(getChildAt(i17));
                        float m10 = pVar3.m();
                        float n11 = pVar3.n();
                        pVar3.f14095m = 1.0f / (1.0f - C);
                        pVar3.f14094l = C - ((((m10 + n11) - f10) * C) / (f11 - f10));
                    }
                }
                this.J0 = 0.0f;
                this.K0 = 0.0f;
                this.O0 = true;
                invalidate();
            }
        }
    }

    public void P0() {
        this.F1.g(this.Q, this.f1607x0.k(this.A0), this.f1607x0.k(this.C0));
        F0();
    }

    public void Q0(int i10, androidx.constraintlayout.widget.d dVar) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            aVar.W(i10, dVar);
        }
        P0();
        if (this.B0 == i10) {
            dVar.l(this);
        }
    }

    public void c0(i iVar) {
        if (this.f1596m1 == null) {
            this.f1596m1 = new ArrayList<>();
        }
        this.f1596m1.add(iVar);
    }

    public void d0(float f10) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            float f11 = this.K0;
            float f12 = this.J0;
            if (f11 != f12 && this.N0) {
                this.K0 = f12;
            }
            float f13 = this.K0;
            if (f13 != f10) {
                this.V0 = false;
                this.M0 = f10;
                this.I0 = ((float) aVar.p()) / 1000.0f;
                setProgress(this.M0);
                this.f1609y0 = this.f1607x0.t();
                this.N0 = false;
                this.H0 = getNanoTime();
                this.O0 = true;
                this.J0 = f13;
                this.K0 = f13;
                invalidate();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            r0 = 0
            r9.l0(r0)
            super.dispatchDraw(r10)
            androidx.constraintlayout.motion.widget.a r1 = r9.f1607x0
            if (r1 != 0) goto L_0x000c
            return
        L_0x000c:
            int r1 = r9.T0
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x00d0
            boolean r1 = r9.isInEditMode()
            if (r1 != 0) goto L_0x00d0
            int r1 = r9.f1597n1
            int r1 = r1 + r2
            r9.f1597n1 = r1
            long r3 = r9.getNanoTime()
            long r5 = r9.f1598o1
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0045
            long r5 = r3 - r5
            r7 = 200000000(0xbebc200, double:9.8813129E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0047
            int r1 = r9.f1597n1
            float r1 = (float) r1
            float r5 = (float) r5
            r6 = 814313567(0x3089705f, float:1.0E-9)
            float r5 = r5 * r6
            float r1 = r1 / r5
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            int r1 = (int) r1
            float r1 = (float) r1
            float r1 = r1 / r5
            r9.f1599p1 = r1
            r9.f1597n1 = r0
        L_0x0045:
            r9.f1598o1 = r3
        L_0x0047:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r1 = 1109917696(0x42280000, float:42.0)
            r0.setTextSize(r1)
            float r1 = r9.getProgress()
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            float r1 = (float) r1
            r3 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 / r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            float r5 = r9.f1599p1
            r4.append(r5)
            java.lang.String r5 = " fps "
            r4.append(r5)
            int r5 = r9.A0
            java.lang.String r5 = v.c.l(r9, r5)
            r4.append(r5)
            java.lang.String r5 = " -> "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            int r4 = r9.C0
            java.lang.String r4 = v.c.l(r9, r4)
            r5.append(r4)
            java.lang.String r4 = " (progress: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = " ) state="
            r5.append(r1)
            int r1 = r9.B0
            r4 = -1
            if (r1 != r4) goto L_0x00a4
            java.lang.String r1 = "undefined"
            goto L_0x00a8
        L_0x00a4:
            java.lang.String r1 = v.c.l(r9, r1)
        L_0x00a8:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setColor(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            int r5 = r9.getHeight()
            int r5 = r5 + -29
            float r5 = (float) r5
            r10.drawText(r1, r4, r5, r0)
            r4 = -7864184(0xffffffffff880088, float:NaN)
            r0.setColor(r4)
            int r4 = r9.getHeight()
            int r4 = r4 + -30
            float r4 = (float) r4
            r10.drawText(r1, r3, r4, r0)
        L_0x00d0:
            int r0 = r9.T0
            if (r0 <= r2) goto L_0x00ee
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = r9.U0
            if (r0 != 0) goto L_0x00df
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = new androidx.constraintlayout.motion.widget.MotionLayout$d
            r0.<init>()
            r9.U0 = r0
        L_0x00df:
            androidx.constraintlayout.motion.widget.MotionLayout$d r0 = r9.U0
            java.util.HashMap<android.view.View, v.p> r1 = r9.G0
            androidx.constraintlayout.motion.widget.a r2 = r9.f1607x0
            int r2 = r2.p()
            int r3 = r9.T0
            r0.a(r10, r1, r2, r3)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.f1588e1 && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f1588e1 = false;
    }

    public final void e0() {
        a aVar = this.f1607x0;
        if (aVar != null) {
            int D = aVar.D();
            a aVar2 = this.f1607x0;
            f0(D, aVar2.k(aVar2.D()));
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<a.b> it = this.f1607x0.o().iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                a.b bVar = this.f1607x0.f1666c;
                g0(next);
                int G = next.G();
                int z10 = next.z();
                String i10 = v.c.i(getContext(), G);
                String i11 = v.c.i(getContext(), z10);
                if (sparseIntArray.get(G) == z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CHECK: two transitions with the same start and end ");
                    sb2.append(i10);
                    sb2.append("->");
                    sb2.append(i11);
                }
                if (sparseIntArray2.get(z10) == G) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("CHECK: you can't have reverse transitions");
                    sb3.append(i10);
                    sb3.append("->");
                    sb3.append(i11);
                }
                sparseIntArray.put(G, z10);
                sparseIntArray2.put(z10, G);
                if (this.f1607x0.k(G) == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(" no such constraintSetStart ");
                    sb4.append(i10);
                }
                if (this.f1607x0.k(z10) == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(" no such constraintSetEnd ");
                    sb5.append(i10);
                }
            }
        }
    }

    public final void f0(int i10, androidx.constraintlayout.widget.d dVar) {
        String i11 = v.c.i(getContext(), i10);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            if (id2 == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(i11);
                sb2.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb2.append(childAt.getClass().getName());
                sb2.append(" does not!");
            }
            if (dVar.d0(id2) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(i11);
                sb3.append(" NO CONSTRAINTS for ");
                sb3.append(v.c.k(childAt));
            }
        }
        int[] g02 = dVar.g0();
        for (int i13 = 0; i13 < g02.length; i13++) {
            int i14 = g02[i13];
            String i15 = v.c.i(getContext(), i14);
            if (findViewById(g02[i13]) == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(i11);
                sb4.append(" NO View matches id ");
                sb4.append(i15);
            }
            if (dVar.f0(i14) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(i11);
                sb5.append("(");
                sb5.append(i15);
                sb5.append(") no LAYOUT_HEIGHT");
            }
            if (dVar.l0(i14) == -1) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("CHECK: ");
                sb6.append(i11);
                sb6.append("(");
                sb6.append(i15);
                sb6.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    public final void g0(a.b bVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CHECK: transition = ");
        sb2.append(bVar.u(getContext()));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("CHECK: transition.setDuration = ");
        sb3.append(bVar.y());
        bVar.G();
        bVar.z();
    }

    public int[] getConstraintSetIds() {
        a aVar = this.f1607x0;
        if (aVar == null) {
            return null;
        }
        return aVar.n();
    }

    public int getCurrentState() {
        return this.B0;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        a aVar = this.f1607x0;
        if (aVar == null) {
            return null;
        }
        return aVar.o();
    }

    public v.d getDesignTool() {
        if (this.Y0 == null) {
            this.Y0 = new v.d(this);
        }
        return this.Y0;
    }

    public int getEndState() {
        return this.C0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.K0;
    }

    public int getStartState() {
        return this.A0;
    }

    public float getTargetPosition() {
        return this.M0;
    }

    public Bundle getTransitionState() {
        if (this.D1 == null) {
            this.D1 = new h();
        }
        this.D1.c();
        return this.D1.b();
    }

    public long getTransitionTimeMs() {
        a aVar = this.f1607x0;
        if (aVar != null) {
            this.I0 = ((float) aVar.p()) / 1000.0f;
        }
        return (long) (this.I0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f1611z0;
    }

    public final void h0() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            p pVar = this.G0.get(childAt);
            if (pVar != null) {
                pVar.F(childAt);
            }
        }
    }

    public final void i0() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(v.c.g());
            sb2.append(" ");
            sb2.append(v.c.k(this));
            sb2.append(" ");
            sb2.append(v.c.i(getContext(), this.B0));
            sb2.append(" ");
            sb2.append(v.c.k(childAt));
            sb2.append(childAt.getLeft());
            sb2.append(" ");
            sb2.append(childAt.getTop());
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void j0(boolean z10) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            aVar.i(z10);
        }
    }

    public void k0(int i10, boolean z10) {
        boolean z11;
        a.b v02 = v0(i10);
        if (z10) {
            z11 = true;
        } else {
            a aVar = this.f1607x0;
            if (v02 == aVar.f1666c) {
                Iterator<a.b> it = aVar.G(this.B0).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a.b next = it.next();
                    if (next.I()) {
                        this.f1607x0.f1666c = next;
                        break;
                    }
                }
            }
            z11 = false;
        }
        v02.M(z11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0205, code lost:
        if (r1 != r2) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0215, code lost:
        if (r1 != r2) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l0(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            long r1 = r0.L0
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r22.getNanoTime()
            r0.L0 = r1
        L_0x0010:
            float r1 = r0.K0
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.B0 = r4
        L_0x0020:
            boolean r3 = r0.f1593j1
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.O0
            if (r3 == 0) goto L_0x01f9
            if (r23 != 0) goto L_0x0032
            float r3 = r0.M0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x01f9
        L_0x0032:
            float r3 = r0.M0
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r22.getNanoTime()
            android.view.animation.Interpolator r3 = r0.f1609y0
            boolean r10 = r3 instanceof v.q
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.L0
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.I0
            float r10 = r10 / r12
            r0.f1611z0 = r10
            goto L_0x0054
        L_0x0053:
            r10 = r2
        L_0x0054:
            float r12 = r0.K0
            float r12 = r12 + r10
            boolean r13 = r0.N0
            if (r13 == 0) goto L_0x005d
            float r12 = r0.M0
        L_0x005d:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.M0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.M0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.M0
            r0.O0 = r7
            r14 = r6
            goto L_0x0078
        L_0x0077:
            r14 = r7
        L_0x0078:
            r0.K0 = r12
            r0.J0 = r12
            r0.L0 = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x00ec
            if (r14 != 0) goto L_0x00ec
            boolean r14 = r0.V0
            if (r14 == 0) goto L_0x00d0
            long r4 = r0.H0
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            r0.K0 = r3
            r0.L0 = r8
            android.view.animation.Interpolator r4 = r0.f1609y0
            boolean r5 = r4 instanceof v.q
            if (r5 == 0) goto L_0x00eb
            v.q r4 = (v.q) r4
            float r4 = r4.a()
            r0.f1611z0 = r4
            float r5 = java.lang.Math.abs(r4)
            float r8 = r0.I0
            float r5 = r5 * r8
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 > 0) goto L_0x00b2
            r0.O0 = r7
        L_0x00b2:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x00c2
            r0.K0 = r5
            r0.O0 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00c2:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00eb
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00eb
            r0.K0 = r2
            r0.O0 = r7
            r12 = r2
            goto L_0x00ec
        L_0x00d0:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.f1609y0
            boolean r5 = r4 instanceof v.q
            if (r5 == 0) goto L_0x00e1
            v.q r4 = (v.q) r4
            float r4 = r4.a()
            goto L_0x00e9
        L_0x00e1:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
        L_0x00e9:
            r0.f1611z0 = r4
        L_0x00eb:
            r12 = r3
        L_0x00ec:
            float r3 = r0.f1611z0
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x00fb
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.MOVING
            r0.setState(r3)
        L_0x00fb:
            if (r13 <= 0) goto L_0x0103
            float r3 = r0.M0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x010d
        L_0x0103:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0111
            float r3 = r0.M0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0111
        L_0x010d:
            float r12 = r0.M0
            r0.O0 = r7
        L_0x0111:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x011b
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0122
        L_0x011b:
            r0.O0 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
        L_0x0122:
            int r3 = r22.getChildCount()
            r0.f1593j1 = r7
            long r8 = r22.getNanoTime()
            r0.A1 = r12
            r5 = r7
        L_0x012f:
            if (r5 >= r3) goto L_0x0157
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, v.p> r11 = r0.G0
            java.lang.Object r11 = r11.get(r10)
            r16 = r11
            v.p r16 = (v.p) r16
            if (r16 == 0) goto L_0x0154
            boolean r11 = r0.f1593j1
            v.g r15 = r0.B1
            r17 = r10
            r18 = r12
            r19 = r8
            r21 = r15
            boolean r10 = r16.y(r17, r18, r19, r21)
            r10 = r10 | r11
            r0.f1593j1 = r10
        L_0x0154:
            int r5 = r5 + 1
            goto L_0x012f
        L_0x0157:
            if (r13 <= 0) goto L_0x015f
            float r3 = r0.M0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0169
        L_0x015f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x016b
            float r3 = r0.M0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x016b
        L_0x0169:
            r3 = r6
            goto L_0x016c
        L_0x016b:
            r3 = r7
        L_0x016c:
            boolean r5 = r0.f1593j1
            if (r5 != 0) goto L_0x017b
            boolean r5 = r0.O0
            if (r5 != 0) goto L_0x017b
            if (r3 == 0) goto L_0x017b
            androidx.constraintlayout.motion.widget.MotionLayout$j r5 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r5)
        L_0x017b:
            boolean r5 = r0.f1603t1
            if (r5 == 0) goto L_0x0182
            r22.requestLayout()
        L_0x0182:
            boolean r5 = r0.f1593j1
            r3 = r3 ^ r6
            r3 = r3 | r5
            r0.f1593j1 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01a6
            int r3 = r0.A0
            r5 = -1
            if (r3 == r5) goto L_0x01a6
            int r5 = r0.B0
            if (r5 == r3) goto L_0x01a6
            r0.B0 = r3
            androidx.constraintlayout.motion.widget.a r5 = r0.f1607x0
            androidx.constraintlayout.widget.d r3 = r5.k(r3)
            r3.k(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01a6:
            double r8 = (double) r12
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x01c4
            int r3 = r0.B0
            int r5 = r0.C0
            if (r3 == r5) goto L_0x01c4
            r0.B0 = r5
            androidx.constraintlayout.motion.widget.a r3 = r0.f1607x0
            androidx.constraintlayout.widget.d r3 = r3.k(r5)
            r3.k(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01c4:
            boolean r3 = r0.f1593j1
            if (r3 != 0) goto L_0x01df
            boolean r3 = r0.O0
            if (r3 == 0) goto L_0x01cd
            goto L_0x01df
        L_0x01cd:
            if (r13 <= 0) goto L_0x01d1
            if (r4 == 0) goto L_0x01d9
        L_0x01d1:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x01e2
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x01e2
        L_0x01d9:
            androidx.constraintlayout.motion.widget.MotionLayout$j r3 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            r0.setState(r3)
            goto L_0x01e2
        L_0x01df:
            r22.invalidate()
        L_0x01e2:
            boolean r3 = r0.f1593j1
            if (r3 != 0) goto L_0x01ee
            boolean r3 = r0.O0
            if (r3 == 0) goto L_0x01ee
            if (r13 <= 0) goto L_0x01ee
            if (r4 == 0) goto L_0x01f6
        L_0x01ee:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x01f9
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x01f9
        L_0x01f6:
            r22.C0()
        L_0x01f9:
            float r1 = r0.K0
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x020d
            int r1 = r0.B0
            int r2 = r0.C0
            if (r1 == r2) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r6 = r7
        L_0x0209:
            r0.B0 = r2
            r7 = r6
            goto L_0x0218
        L_0x020d:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0218
            int r1 = r0.B0
            int r2 = r0.A0
            if (r1 == r2) goto L_0x0208
            goto L_0x0209
        L_0x0218:
            boolean r1 = r0.G1
            r1 = r1 | r7
            r0.G1 = r1
            if (r7 == 0) goto L_0x0226
            boolean r1 = r0.C1
            if (r1 != 0) goto L_0x0226
            r22.requestLayout()
        L_0x0226:
            float r1 = r0.K0
            r0.J0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.l0(boolean):void");
    }

    public final void m0() {
        boolean z10;
        float signum = Math.signum(this.M0 - this.K0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f1609y0;
        float f10 = this.K0 + (!(interpolator instanceof u.h) ? ((((float) (nanoTime - this.L0)) * signum) * 1.0E-9f) / this.I0 : 0.0f);
        if (this.N0) {
            f10 = this.M0;
        }
        int i10 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i10 <= 0 || f10 < this.M0) && (signum > 0.0f || f10 > this.M0)) {
            z10 = false;
        } else {
            f10 = this.M0;
            z10 = true;
        }
        if (interpolator != null && !z10) {
            f10 = this.V0 ? interpolator.getInterpolation(((float) (nanoTime - this.H0)) * 1.0E-9f) : interpolator.getInterpolation(f10);
        }
        if ((i10 > 0 && f10 >= this.M0) || (signum <= 0.0f && f10 <= this.M0)) {
            f10 = this.M0;
        }
        this.A1 = f10;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            p pVar = this.G0.get(childAt);
            if (pVar != null) {
                pVar.y(childAt, f10, nanoTime2, this.B1);
            }
        }
        if (this.f1603t1) {
            requestLayout();
        }
    }

    public final void n0() {
        ArrayList<i> arrayList;
        if ((this.Q0 != null || ((arrayList = this.f1596m1) != null && !arrayList.isEmpty())) && this.f1601r1 != this.J0) {
            if (this.f1600q1 != -1) {
                i iVar = this.Q0;
                if (iVar != null) {
                    iVar.b(this, this.A0, this.C0);
                }
                ArrayList<i> arrayList2 = this.f1596m1;
                if (arrayList2 != null) {
                    Iterator<i> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.A0, this.C0);
                    }
                }
                this.f1602s1 = true;
            }
            this.f1600q1 = -1;
            float f10 = this.J0;
            this.f1601r1 = f10;
            i iVar2 = this.Q0;
            if (iVar2 != null) {
                iVar2.a(this, this.A0, this.C0, f10);
            }
            ArrayList<i> arrayList3 = this.f1596m1;
            if (arrayList3 != null) {
                Iterator<i> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.A0, this.C0, this.J0);
                }
            }
            this.f1602s1 = true;
        }
    }

    public void o0() {
        int i10;
        ArrayList<i> arrayList;
        if ((this.Q0 != null || ((arrayList = this.f1596m1) != null && !arrayList.isEmpty())) && this.f1600q1 == -1) {
            this.f1600q1 = this.B0;
            if (!this.J1.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.J1;
                i10 = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.B0;
            if (!(i10 == i11 || i11 == -1)) {
                this.J1.add(Integer.valueOf(i11));
            }
        }
        D0();
    }

    public void onAttachedToWindow() {
        a.b bVar;
        int i10;
        super.onAttachedToWindow();
        a aVar = this.f1607x0;
        if (!(aVar == null || (i10 = this.B0) == -1)) {
            androidx.constraintlayout.widget.d k10 = aVar.k(i10);
            this.f1607x0.U(this);
            if (k10 != null) {
                k10.l(this);
            }
            this.A0 = this.B0;
        }
        C0();
        h hVar = this.D1;
        if (hVar != null) {
            hVar.a();
            return;
        }
        a aVar2 = this.f1607x0;
        if (aVar2 != null && (bVar = aVar2.f1666c) != null && bVar.x() == 4) {
            L0();
            setState(j.SETUP);
            setState(j.MOVING);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a.b bVar;
        b H;
        int m10;
        RectF l10;
        a aVar = this.f1607x0;
        if (aVar != null && this.F0 && (bVar = aVar.f1666c) != null && bVar.I() && (H = bVar.H()) != null && ((motionEvent.getAction() != 0 || (l10 = H.l(this, new RectF())) == null || l10.contains(motionEvent.getX(), motionEvent.getY())) && (m10 = H.m()) != -1)) {
            View view = this.I1;
            if (view == null || view.getId() != m10) {
                this.I1 = findViewById(m10);
            }
            View view2 = this.I1;
            if (view2 != null) {
                this.H1.set((float) view2.getLeft(), (float) this.I1.getTop(), (float) this.I1.getRight(), (float) this.I1.getBottom());
                if (this.H1.contains(motionEvent.getX(), motionEvent.getY()) && !x0(0.0f, 0.0f, this.I1, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.C1 = true;
        try {
            if (this.f1607x0 == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (!(this.f1586c1 == i14 && this.f1587d1 == i15)) {
                F0();
                l0(true);
            }
            this.f1586c1 = i14;
            this.f1587d1 = i15;
            this.f1584a1 = i14;
            this.f1585b1 = i15;
            this.C1 = false;
        } finally {
            this.C1 = false;
        }
    }

    public void onMeasure(int i10, int i11) {
        if (this.f1607x0 == null) {
            super.onMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        boolean z11 = (this.D0 == i10 && this.E0 == i11) ? false : true;
        if (this.G1) {
            this.G1 = false;
            C0();
            D0();
            z11 = true;
        }
        if (this.V) {
            z11 = true;
        }
        this.D0 = i10;
        this.E0 = i11;
        int D = this.f1607x0.D();
        int q10 = this.f1607x0.q();
        if ((z11 || this.F1.h(D, q10)) && this.A0 != -1) {
            super.onMeasure(i10, i11);
            this.F1.g(this.Q, this.f1607x0.k(D), this.f1607x0.k(q10));
            this.F1.j();
            this.F1.k(D, q10);
        } else {
            z10 = true;
        }
        if (this.f1603t1 || z10) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int j02 = this.Q.j0() + getPaddingLeft() + getPaddingRight();
            int D2 = this.Q.D() + paddingTop;
            int i12 = this.f1610y1;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                int i13 = this.f1604u1;
                j02 = (int) (((float) i13) + (this.A1 * ((float) (this.f1606w1 - i13))));
                requestLayout();
            }
            int i14 = this.f1612z1;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                int i15 = this.f1605v1;
                D2 = (int) (((float) i15) + (this.A1 * ((float) (this.f1608x1 - i15))));
                requestLayout();
            }
            setMeasuredDimension(j02, D2);
        }
        m0();
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onRtlPropertiesChanged(int i10) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            aVar.Z(w());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f1607x0;
        if (aVar == null || !this.F0 || !aVar.e0()) {
            return super.onTouchEvent(motionEvent);
        }
        a.b bVar = this.f1607x0.f1666c;
        if (bVar != null && !bVar.I()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1607x0.S(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1596m1 == null) {
                this.f1596m1 = new ArrayList<>();
            }
            this.f1596m1.add(motionHelper);
            if (motionHelper.A()) {
                if (this.f1594k1 == null) {
                    this.f1594k1 = new ArrayList<>();
                }
                this.f1594k1.add(motionHelper);
            }
            if (motionHelper.z()) {
                if (this.f1595l1 == null) {
                    this.f1595l1 = new ArrayList<>();
                }
                this.f1595l1.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1594k1;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1595l1;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void p0(MotionLayout motionLayout, int i10, int i11) {
        i iVar = this.Q0;
        if (iVar != null) {
            iVar.b(this, i10, i11);
        }
        ArrayList<i> arrayList = this.f1596m1;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(motionLayout, i10, i11);
            }
        }
    }

    public void q0(int i10, boolean z10, float f10) {
        i iVar = this.Q0;
        if (iVar != null) {
            iVar.c(this, i10, z10, f10);
        }
        ArrayList<i> arrayList = this.f1596m1;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().c(this, i10, z10, f10);
            }
        }
    }

    public void r(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public void r0(int i10, float f10, float f11, float f12, float[] fArr) {
        String str;
        HashMap<View, p> hashMap = this.G0;
        View o10 = o(i10);
        p pVar = hashMap.get(o10);
        if (pVar != null) {
            pVar.k(f10, f11, f12, fArr);
            float y10 = o10.getY();
            this.R0 = f10;
            this.S0 = y10;
            return;
        }
        if (o10 == null) {
            str = "" + i10;
        } else {
            str = o10.getContext().getResources().getResourceName(i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WARNING could not find view id ");
        sb2.append(str);
    }

    public void requestLayout() {
        a aVar;
        a.b bVar;
        if (this.f1603t1 || this.B0 != -1 || (aVar = this.f1607x0) == null || (bVar = aVar.f1666c) == null || bVar.C() != 0) {
            super.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.f1666c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(android.view.View r1, android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.a r1 = r0.f1607x0
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f1666c
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.b r1 = r1.H()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.a r1 = r0.f1607x0
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f1666c
            androidx.constraintlayout.motion.widget.b r1 = r1.H()
            int r1 = r1.e()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.s(android.view.View, android.view.View, int, int):boolean");
    }

    public androidx.constraintlayout.widget.d s0(int i10) {
        a aVar = this.f1607x0;
        if (aVar == null) {
            return null;
        }
        return aVar.k(i10);
    }

    public void setDebugMode(int i10) {
        this.T0 = i10;
        invalidate();
    }

    public void setInteractionEnabled(boolean z10) {
        this.F0 = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f1607x0 != null) {
            setState(j.MOVING);
            Interpolator t10 = this.f1607x0.t();
            if (t10 != null) {
                setProgress(t10.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1595l1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1595l1.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1594k1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1594k1.get(i10).setProgress(f10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4.K0 == 0.0f) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r4.K0 == 1.0f) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProgress(float r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L_0x0009
            int r3 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
        L_0x0009:
            boolean r3 = r4.isAttachedToWindow()
            if (r3 != 0) goto L_0x0020
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r4.D1
            if (r0 != 0) goto L_0x001a
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = new androidx.constraintlayout.motion.widget.MotionLayout$h
            r0.<init>()
            r4.D1 = r0
        L_0x001a:
            androidx.constraintlayout.motion.widget.MotionLayout$h r0 = r4.D1
            r0.e(r5)
            return
        L_0x0020:
            if (r1 > 0) goto L_0x002f
            int r1 = r4.A0
            r4.B0 = r1
            float r1 = r4.K0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
        L_0x002c:
            androidx.constraintlayout.motion.widget.MotionLayout$j r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.FINISHED
            goto L_0x0043
        L_0x002f:
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x003e
            int r0 = r4.C0
            r4.B0 = r0
            float r0 = r4.K0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            goto L_0x002c
        L_0x003e:
            r0 = -1
            r4.B0 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$j r0 = androidx.constraintlayout.motion.widget.MotionLayout.j.MOVING
        L_0x0043:
            r4.setState(r0)
        L_0x0046:
            androidx.constraintlayout.motion.widget.a r0 = r4.f1607x0
            if (r0 != 0) goto L_0x004b
            return
        L_0x004b:
            r0 = 1
            r4.N0 = r0
            r4.M0 = r5
            r4.J0 = r5
            r1 = -1
            r4.L0 = r1
            r4.H0 = r1
            r5 = 0
            r4.f1609y0 = r5
            r4.O0 = r0
            r4.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    public void setScene(a aVar) {
        this.f1607x0 = aVar;
        aVar.Z(w());
        F0();
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar != jVar2 || this.B0 != -1) {
            j jVar3 = this.E1;
            this.E1 = jVar;
            j jVar4 = j.MOVING;
            if (jVar3 == jVar4 && jVar == jVar4) {
                n0();
            }
            int i10 = b.f1613a[jVar3.ordinal()];
            if (i10 == 1 || i10 == 2) {
                if (jVar == jVar4) {
                    n0();
                }
                if (jVar != jVar2) {
                    return;
                }
            } else if (!(i10 == 3 && jVar == jVar2)) {
                return;
            }
            o0();
        }
    }

    public void setTransition(int i10) {
        if (this.f1607x0 != null) {
            a.b v02 = v0(i10);
            this.A0 = v02.G();
            this.C0 = v02.z();
            if (!isAttachedToWindow()) {
                if (this.D1 == null) {
                    this.D1 = new h();
                }
                this.D1.f(this.A0);
                this.D1.d(this.C0);
                return;
            }
            float f10 = Float.NaN;
            int i11 = this.B0;
            float f11 = 0.0f;
            if (i11 == this.A0) {
                f10 = 0.0f;
            } else if (i11 == this.C0) {
                f10 = 1.0f;
            }
            this.f1607x0.b0(v02);
            this.F1.g(this.Q, this.f1607x0.k(this.A0), this.f1607x0.k(this.C0));
            F0();
            if (!Float.isNaN(f10)) {
                f11 = f10;
            }
            this.K0 = f11;
            if (Float.isNaN(f10)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v.c.g());
                sb2.append(" transitionToStart ");
                M0();
                return;
            }
            setProgress(f10);
        }
    }

    public void setTransition(a.b bVar) {
        this.f1607x0.b0(bVar);
        setState(j.SETUP);
        float f10 = this.B0 == this.f1607x0.q() ? 1.0f : 0.0f;
        this.K0 = f10;
        this.J0 = f10;
        this.M0 = f10;
        this.L0 = bVar.J(1) ? -1 : getNanoTime();
        int D = this.f1607x0.D();
        int q10 = this.f1607x0.q();
        if (D != this.A0 || q10 != this.C0) {
            this.A0 = D;
            this.C0 = q10;
            this.f1607x0.a0(D, q10);
            this.F1.g(this.Q, this.f1607x0.k(this.A0), this.f1607x0.k(this.C0));
            this.F1.k(this.A0, this.C0);
            this.F1.j();
            F0();
        }
    }

    public void setTransitionDuration(int i10) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            aVar.X(i10);
        }
    }

    public void setTransitionListener(i iVar) {
        this.Q0 = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.D1 == null) {
            this.D1 = new h();
        }
        this.D1.g(bundle);
        if (isAttachedToWindow()) {
            this.D1.a();
        }
    }

    public void t(View view, View view2, int i10, int i11) {
    }

    public String t0(int i10) {
        a aVar = this.f1607x0;
        if (aVar == null) {
            return null;
        }
        return aVar.M(i10);
    }

    public String toString() {
        Context context = getContext();
        return v.c.i(context, this.A0) + "->" + v.c.i(context, this.C0) + " (pos:" + this.K0 + " Dpos/Dt:" + this.f1611z0;
    }

    public void u(View view, int i10) {
        a aVar = this.f1607x0;
        if (aVar != null) {
            float f10 = this.f1589f1;
            float f11 = this.f1592i1;
            aVar.R(f10 / f11, this.f1590g1 / f11);
        }
    }

    public void u0(boolean z10) {
        this.T0 = z10 ? 2 : 1;
        invalidate();
    }

    public void v(View view, int i10, int i11, int[] iArr, int i12) {
        a.b bVar;
        b H;
        int m10;
        a aVar = this.f1607x0;
        if (aVar != null && (bVar = aVar.f1666c) != null && bVar.I()) {
            a.b bVar2 = this.f1607x0.f1666c;
            if (bVar2 == null || !bVar2.I() || (H = bVar2.H()) == null || (m10 = H.m()) == -1 || view.getId() == m10) {
                a aVar2 = this.f1607x0;
                if (aVar2 != null && aVar2.y()) {
                    float f10 = this.J0;
                    if ((f10 == 1.0f || f10 == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(bVar2.H() == null || (this.f1607x0.f1666c.H().e() & 1) == 0)) {
                    float A = this.f1607x0.A((float) i10, (float) i11);
                    float f11 = this.K0;
                    if ((f11 <= 0.0f && A < 0.0f) || (f11 >= 1.0f && A > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new a(view));
                        return;
                    }
                }
                float f12 = this.J0;
                long nanoTime = getNanoTime();
                float f13 = (float) i10;
                this.f1589f1 = f13;
                float f14 = (float) i11;
                this.f1590g1 = f14;
                this.f1592i1 = (float) (((double) (nanoTime - this.f1591h1)) * 1.0E-9d);
                this.f1591h1 = nanoTime;
                this.f1607x0.Q(f13, f14);
                if (f12 != this.J0) {
                    iArr[0] = i10;
                    iArr[1] = i11;
                }
                l0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f1588e1 = true;
                }
            }
        }
    }

    public a.b v0(int i10) {
        return this.f1607x0.E(i10);
    }

    public void w0(View view, float f10, float f11, float[] fArr, int i10) {
        float f12;
        float f13 = this.f1611z0;
        float f14 = this.K0;
        if (this.f1609y0 != null) {
            float signum = Math.signum(this.M0 - f14);
            float interpolation = this.f1609y0.getInterpolation(this.K0 + 1.0E-5f);
            float interpolation2 = this.f1609y0.getInterpolation(this.K0);
            f13 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.I0;
            f12 = interpolation2;
        } else {
            f12 = f14;
        }
        Interpolator interpolator = this.f1609y0;
        if (interpolator instanceof v.q) {
            f13 = ((v.q) interpolator).a();
        }
        p pVar = this.G0.get(view);
        if ((i10 & 1) == 0) {
            pVar.s(f12, view.getWidth(), view.getHeight(), f10, f11, fArr);
        } else {
            pVar.k(f12, f10, f11, fArr);
        }
        if (i10 < 2) {
            fArr[0] = fArr[0] * f13;
            fArr[1] = fArr[1] * f13;
        }
    }

    public void x(int i10) {
        if (i10 != 0) {
            try {
                this.f1607x0 = new a(getContext(), this, i10);
                if (isAttachedToWindow()) {
                    this.f1607x0.U(this);
                    this.F1.g(this.Q, this.f1607x0.k(this.A0), this.f1607x0.k(this.C0));
                    F0();
                    this.f1607x0.Z(w());
                }
            } catch (Exception e10) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e10);
            }
        } else {
            this.f1607x0 = null;
        }
    }

    public final boolean x0(float f10, float f11, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (x0(((float) view.getLeft()) + f10, ((float) view.getTop()) + f11, viewGroup.getChildAt(i10), motionEvent)) {
                    return true;
                }
            }
        }
        this.H1.set(((float) view.getLeft()) + f10, ((float) view.getTop()) + f11, f10 + ((float) view.getRight()), f11 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.H1.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    public final void y0(AttributeSet attributeSet) {
        a aVar;
        int i10;
        S1 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == e.m.MotionLayout_layoutDescription) {
                    this.f1607x0 = new a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == e.m.MotionLayout_currentState) {
                    this.B0 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == e.m.MotionLayout_motionProgress) {
                    this.M0 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.O0 = true;
                } else if (index == e.m.MotionLayout_applyMotionScene) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else {
                    if (index == e.m.MotionLayout_showPaths) {
                        if (this.T0 == 0) {
                            i10 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        }
                    } else if (index == e.m.MotionLayout_motionDebug) {
                        i10 = obtainStyledAttributes.getInt(index, 0);
                    }
                    this.T0 = i10;
                }
            }
            obtainStyledAttributes.recycle();
            if (!z10) {
                this.f1607x0 = null;
            }
        }
        if (this.T0 != 0) {
            e0();
        }
        if (this.B0 == -1 && (aVar = this.f1607x0) != null) {
            this.B0 = aVar.D();
            this.A0 = this.f1607x0.D();
            this.C0 = this.f1607x0.q();
        }
    }

    public void z(int i10) {
        this.f1782b0 = null;
    }

    public boolean z0() {
        return this.F0;
    }
}
