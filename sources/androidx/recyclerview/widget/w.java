package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class w {

    /* renamed from: d  reason: collision with root package name */
    public static final int f3728d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public static final int f3729e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f3730f = 1;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.o f3731a;

    /* renamed from: b  reason: collision with root package name */
    public int f3732b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3733c;

    public static class a extends w {
        public a(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f3731a.b0(view) + ((RecyclerView.p) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3731a.a0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3731a.Z(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int g(View view) {
            return this.f3731a.Y(view) - ((RecyclerView.p) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f3731a.z0();
        }

        public int i() {
            return this.f3731a.z0() - this.f3731a.p0();
        }

        public int j() {
            return this.f3731a.p0();
        }

        public int l() {
            return this.f3731a.A0();
        }

        public int m() {
            return this.f3731a.f0();
        }

        public int n() {
            return this.f3731a.o0();
        }

        public int o() {
            return (this.f3731a.z0() - this.f3731a.o0()) - this.f3731a.p0();
        }

        public int q(View view) {
            this.f3731a.y0(view, true, this.f3733c);
            return this.f3733c.right;
        }

        public int r(View view) {
            this.f3731a.y0(view, true, this.f3733c);
            return this.f3733c.left;
        }

        public void s(View view, int i10) {
            view.offsetLeftAndRight(i10);
        }

        public void t(int i10) {
            this.f3731a.T0(i10);
        }
    }

    public static class b extends w {
        public b(RecyclerView.o oVar) {
            super(oVar, (a) null);
        }

        public int d(View view) {
            return this.f3731a.W(view) + ((RecyclerView.p) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3731a.Z(view) + pVar.topMargin + pVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3731a.a0(view) + pVar.leftMargin + pVar.rightMargin;
        }

        public int g(View view) {
            return this.f3731a.c0(view) - ((RecyclerView.p) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f3731a.e0();
        }

        public int i() {
            return this.f3731a.e0() - this.f3731a.m0();
        }

        public int j() {
            return this.f3731a.m0();
        }

        public int l() {
            return this.f3731a.f0();
        }

        public int m() {
            return this.f3731a.A0();
        }

        public int n() {
            return this.f3731a.r0();
        }

        public int o() {
            return (this.f3731a.e0() - this.f3731a.r0()) - this.f3731a.m0();
        }

        public int q(View view) {
            this.f3731a.y0(view, true, this.f3733c);
            return this.f3733c.bottom;
        }

        public int r(View view) {
            this.f3731a.y0(view, true, this.f3733c);
            return this.f3733c.top;
        }

        public void s(View view, int i10) {
            view.offsetTopAndBottom(i10);
        }

        public void t(int i10) {
            this.f3731a.U0(i10);
        }
    }

    public w(RecyclerView.o oVar) {
        this.f3732b = Integer.MIN_VALUE;
        this.f3733c = new Rect();
        this.f3731a = oVar;
    }

    public /* synthetic */ w(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static w a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static w b(RecyclerView.o oVar, int i10) {
        if (i10 == 0) {
            return a(oVar);
        }
        if (i10 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static w c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.o k() {
        return this.f3731a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f3732b) {
            return 0;
        }
        return o() - this.f3732b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(View view, int i10);

    public abstract void t(int i10);

    public void u() {
        this.f3732b = o();
    }
}
