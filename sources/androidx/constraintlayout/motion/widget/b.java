package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;
import v.c;

public class b {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 3;
    public static final int D = 4;
    public static final int E = 5;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;
    public static final int K = 5;
    public static final int L = 6;
    public static final int M = 1;
    public static final int N = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final String f1710v = "TouchResponse";

    /* renamed from: w  reason: collision with root package name */
    public static final boolean f1711w = false;

    /* renamed from: x  reason: collision with root package name */
    public static final float[][] f1712x = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: y  reason: collision with root package name */
    public static final float[][] f1713y = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: z  reason: collision with root package name */
    public static final int f1714z = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f1715a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1716b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1717c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f1718d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f1719e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f1720f = -1;

    /* renamed from: g  reason: collision with root package name */
    public float f1721g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public float f1722h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public float f1723i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f1724j = 1.0f;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1725k = false;

    /* renamed from: l  reason: collision with root package name */
    public float[] f1726l = new float[2];

    /* renamed from: m  reason: collision with root package name */
    public float f1727m;

    /* renamed from: n  reason: collision with root package name */
    public float f1728n;

    /* renamed from: o  reason: collision with root package name */
    public final MotionLayout f1729o;

    /* renamed from: p  reason: collision with root package name */
    public float f1730p = 4.0f;

    /* renamed from: q  reason: collision with root package name */
    public float f1731q = 1.2f;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1732r = true;

    /* renamed from: s  reason: collision with root package name */
    public float f1733s = 1.0f;

    /* renamed from: t  reason: collision with root package name */
    public int f1734t = 0;

    /* renamed from: u  reason: collision with root package name */
    public float f1735u = 10.0f;

    public class a implements View.OnTouchListener {
        public a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b  reason: collision with other inner class name */
    public class C0027b implements NestedScrollView.b {
        public C0027b() {
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }

    public b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f1729o = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public float a(float f10, float f11) {
        return (f10 * this.f1723i) + (f11 * this.f1724j);
    }

    public final void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == e.m.OnSwipe_touchAnchorId) {
                this.f1718d = typedArray.getResourceId(index, this.f1718d);
            } else if (index == e.m.OnSwipe_touchAnchorSide) {
                int i11 = typedArray.getInt(index, this.f1715a);
                this.f1715a = i11;
                float[] fArr = f1712x[i11];
                this.f1722h = fArr[0];
                this.f1721g = fArr[1];
            } else if (index == e.m.OnSwipe_dragDirection) {
                int i12 = typedArray.getInt(index, this.f1716b);
                this.f1716b = i12;
                float[] fArr2 = f1713y[i12];
                this.f1723i = fArr2[0];
                this.f1724j = fArr2[1];
            } else if (index == e.m.OnSwipe_maxVelocity) {
                this.f1730p = typedArray.getFloat(index, this.f1730p);
            } else if (index == e.m.OnSwipe_maxAcceleration) {
                this.f1731q = typedArray.getFloat(index, this.f1731q);
            } else if (index == e.m.OnSwipe_moveWhenScrollAtTop) {
                this.f1732r = typedArray.getBoolean(index, this.f1732r);
            } else if (index == e.m.OnSwipe_dragScale) {
                this.f1733s = typedArray.getFloat(index, this.f1733s);
            } else if (index == e.m.OnSwipe_dragThreshold) {
                this.f1735u = typedArray.getFloat(index, this.f1735u);
            } else if (index == e.m.OnSwipe_touchRegionId) {
                this.f1719e = typedArray.getResourceId(index, this.f1719e);
            } else if (index == e.m.OnSwipe_onTouchUp) {
                this.f1717c = typedArray.getInt(index, this.f1717c);
            } else if (index == e.m.OnSwipe_nestedScrollFlags) {
                this.f1734t = typedArray.getInteger(index, 0);
            } else if (index == e.m.OnSwipe_limitBoundsTo) {
                this.f1720f = typedArray.getResourceId(index, 0);
            }
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.OnSwipe);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public int d() {
        return this.f1718d;
    }

    public int e() {
        return this.f1734t;
    }

    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f1720f;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public int g() {
        return this.f1720f;
    }

    public float h() {
        return this.f1731q;
    }

    public float i() {
        return this.f1730p;
    }

    public boolean j() {
        return this.f1732r;
    }

    public float k(float f10, float f11) {
        this.f1729o.r0(this.f1718d, this.f1729o.getProgress(), this.f1722h, this.f1721g, this.f1726l);
        float f12 = this.f1723i;
        if (f12 != 0.0f) {
            float[] fArr = this.f1726l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f1726l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f1724j) / fArr2[1];
    }

    public RectF l(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i10 = this.f1719e;
        if (i10 == -1 || (findViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public int m() {
        return this.f1719e;
    }

    public void n(MotionEvent motionEvent, MotionLayout.f fVar, int i10, a aVar) {
        int i11;
        MotionLayout.f fVar2 = fVar;
        fVar2.e(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f1727m = motionEvent.getRawX();
            this.f1728n = motionEvent.getRawY();
            this.f1725k = false;
        } else if (action == 1) {
            this.f1725k = false;
            fVar2.h(1000);
            float g10 = fVar.g();
            float f10 = fVar.f();
            float progress = this.f1729o.getProgress();
            int i12 = this.f1718d;
            if (i12 != -1) {
                this.f1729o.r0(i12, progress, this.f1722h, this.f1721g, this.f1726l);
            } else {
                float min = (float) Math.min(this.f1729o.getWidth(), this.f1729o.getHeight());
                float[] fArr = this.f1726l;
                fArr[1] = this.f1724j * min;
                fArr[0] = min * this.f1723i;
            }
            float f11 = this.f1723i;
            float[] fArr2 = this.f1726l;
            float f12 = f11 != 0.0f ? g10 / fArr2[0] : f10 / fArr2[1];
            float f13 = !Float.isNaN(f12) ? (f12 / 3.0f) + progress : progress;
            if (f13 != 0.0f && f13 != 1.0f && (i11 = this.f1717c) != 3) {
                this.f1729o.K0(i11, ((double) f13) < 0.5d ? 0.0f : 1.0f, f12);
                if (0.0f < progress && 1.0f > progress) {
                    return;
                }
            } else if (0.0f < f13 && 1.0f > f13) {
                return;
            }
            this.f1729o.setState(MotionLayout.j.FINISHED);
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f1728n;
            float rawX = motionEvent.getRawX() - this.f1727m;
            if (Math.abs((this.f1723i * rawX) + (this.f1724j * rawY)) > this.f1735u || this.f1725k) {
                float progress2 = this.f1729o.getProgress();
                if (!this.f1725k) {
                    this.f1725k = true;
                    this.f1729o.setProgress(progress2);
                }
                int i13 = this.f1718d;
                if (i13 != -1) {
                    this.f1729o.r0(i13, progress2, this.f1722h, this.f1721g, this.f1726l);
                } else {
                    float min2 = (float) Math.min(this.f1729o.getWidth(), this.f1729o.getHeight());
                    float[] fArr3 = this.f1726l;
                    fArr3[1] = this.f1724j * min2;
                    fArr3[0] = min2 * this.f1723i;
                }
                float f14 = this.f1723i;
                float[] fArr4 = this.f1726l;
                if (((double) Math.abs(((f14 * fArr4[0]) + (this.f1724j * fArr4[1])) * this.f1733s)) < 0.01d) {
                    float[] fArr5 = this.f1726l;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                float max = Math.max(Math.min(progress2 + (this.f1723i != 0.0f ? rawX / this.f1726l[0] : rawY / this.f1726l[1]), 1.0f), 0.0f);
                if (max != this.f1729o.getProgress()) {
                    this.f1729o.setProgress(max);
                    fVar2.h(1000);
                    this.f1729o.f1611z0 = this.f1723i != 0.0f ? fVar.g() / this.f1726l[0] : fVar.f() / this.f1726l[1];
                } else {
                    this.f1729o.f1611z0 = 0.0f;
                }
                this.f1727m = motionEvent.getRawX();
                this.f1728n = motionEvent.getRawY();
            }
        }
    }

    public void o(float f10, float f11) {
        float progress = this.f1729o.getProgress();
        if (!this.f1725k) {
            this.f1725k = true;
            this.f1729o.setProgress(progress);
        }
        this.f1729o.r0(this.f1718d, progress, this.f1722h, this.f1721g, this.f1726l);
        float f12 = this.f1723i;
        float[] fArr = this.f1726l;
        if (((double) Math.abs((f12 * fArr[0]) + (this.f1724j * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f1726l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.f1723i;
        float max = Math.max(Math.min(progress + (f13 != 0.0f ? (f10 * f13) / this.f1726l[0] : (f11 * this.f1724j) / this.f1726l[1]), 1.0f), 0.0f);
        if (max != this.f1729o.getProgress()) {
            this.f1729o.setProgress(max);
        }
    }

    public void p(float f10, float f11) {
        boolean z10 = false;
        this.f1725k = false;
        float progress = this.f1729o.getProgress();
        this.f1729o.r0(this.f1718d, progress, this.f1722h, this.f1721g, this.f1726l);
        float f12 = this.f1723i;
        float[] fArr = this.f1726l;
        float f13 = 0.0f;
        float f14 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * this.f1724j) / fArr[1];
        if (!Float.isNaN(f14)) {
            progress += f14 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z11 = progress != 1.0f;
            int i10 = this.f1717c;
            if (i10 != 3) {
                z10 = true;
            }
            if (z10 && z11) {
                MotionLayout motionLayout = this.f1729o;
                if (((double) progress) >= 0.5d) {
                    f13 = 1.0f;
                }
                motionLayout.K0(i10, f13, f14);
            }
        }
    }

    public void q(int i10) {
        this.f1718d = i10;
    }

    public void r(float f10, float f11) {
        this.f1727m = f10;
        this.f1728n = f11;
    }

    public void s(float f10) {
        this.f1731q = f10;
    }

    public void t(float f10) {
        this.f1730p = f10;
    }

    public String toString() {
        return this.f1723i + " , " + this.f1724j;
    }

    public void u(boolean z10) {
        if (z10) {
            float[][] fArr = f1713y;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f1712x;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f1713y;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f1712x;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f1712x[this.f1715a];
        this.f1722h = fArr5[0];
        this.f1721g = fArr5[1];
        float[] fArr6 = f1713y[this.f1716b];
        this.f1723i = fArr6[0];
        this.f1724j = fArr6[1];
    }

    public void v(float f10, float f11) {
        this.f1722h = f10;
        this.f1721g = f11;
    }

    public void w(float f10, float f11) {
        this.f1727m = f10;
        this.f1728n = f11;
        this.f1725k = false;
    }

    public void x() {
        View view;
        int i10 = this.f1718d;
        if (i10 != -1) {
            view = this.f1729o.findViewById(i10);
            if (view == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("cannot find TouchAnchorId @id/");
                sb2.append(c.i(this.f1729o.getContext(), this.f1718d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new C0027b());
        }
    }
}
