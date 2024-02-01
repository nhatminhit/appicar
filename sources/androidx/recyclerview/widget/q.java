package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class q extends RecyclerView.a0 {

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f3677q = false;

    /* renamed from: r  reason: collision with root package name */
    public static final float f3678r = 25.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final int f3679s = 10000;

    /* renamed from: t  reason: collision with root package name */
    public static final int f3680t = -1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f3681u = 1;

    /* renamed from: v  reason: collision with root package name */
    public static final int f3682v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final float f3683w = 1.2f;

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f3684i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f3685j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f3686k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f3687l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3688m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f3689n;

    /* renamed from: o  reason: collision with root package name */
    public int f3690o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f3691p = 0;

    public q(Context context) {
        this.f3687l = context.getResources().getDisplayMetrics();
    }

    public int A() {
        PointF pointF = this.f3686k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public final float B() {
        if (!this.f3688m) {
            this.f3689n = w(this.f3687l);
            this.f3688m = true;
        }
        return this.f3689n;
    }

    public int C() {
        PointF pointF = this.f3686k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    public void D(RecyclerView.a0.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.f(f());
            s();
            return;
        }
        j(a10);
        this.f3686k = a10;
        this.f3690o = (int) (a10.x * 10000.0f);
        this.f3691p = (int) (a10.y * 10000.0f);
        aVar.l((int) (((float) this.f3690o) * 1.2f), (int) (((float) this.f3691p) * 1.2f), (int) (((float) y(10000)) * 1.2f), this.f3684i);
    }

    public void m(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.f3690o = z(this.f3690o, i10);
        int z10 = z(this.f3691p, i11);
        this.f3691p = z10;
        if (this.f3690o == 0 && z10 == 0) {
            D(aVar);
        }
    }

    public void n() {
    }

    public void o() {
        this.f3691p = 0;
        this.f3690o = 0;
        this.f3686k = null;
    }

    public void p(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
        int u10 = u(view, A());
        int v10 = v(view, C());
        int x10 = x((int) Math.sqrt((double) ((u10 * u10) + (v10 * v10))));
        if (x10 > 0) {
            aVar.l(-u10, -v10, x10, this.f3685j);
        }
    }

    public int t(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int u(View view, int i10) {
        RecyclerView.o e10 = e();
        if (e10 == null || !e10.n()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(e10.Y(view) - pVar.leftMargin, e10.b0(view) + pVar.rightMargin, e10.o0(), e10.z0() - e10.p0(), i10);
    }

    public int v(View view, int i10) {
        RecyclerView.o e10 = e();
        if (e10 == null || !e10.o()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return t(e10.c0(view) - pVar.topMargin, e10.W(view) + pVar.bottomMargin, e10.r0(), e10.e0() - e10.m0(), i10);
    }

    public float w(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int x(int i10) {
        return (int) Math.ceil(((double) y(i10)) / 0.3356d);
    }

    public int y(int i10) {
        return (int) Math.ceil((double) (((float) Math.abs(i10)) * B()));
    }

    public final int z(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }
}
