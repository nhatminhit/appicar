package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public abstract class b0 extends RecyclerView.r {

    /* renamed from: d  reason: collision with root package name */
    public static final float f3360d = 100.0f;

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3361a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f3362b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.t f3363c = new a();

    public class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3364a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3364a) {
                this.f3364a = false;
                b0.this.l();
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f3364a = true;
            }
        }
    }

    public class b extends q {
        public b(Context context) {
            super(context);
        }

        public void p(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            b0 b0Var2 = b0.this;
            RecyclerView recyclerView = b0Var2.f3361a;
            if (recyclerView != null) {
                int[] c10 = b0Var2.c(recyclerView.getLayoutManager(), view);
                int i10 = c10[0];
                int i11 = c10[1];
                int x10 = x(Math.max(Math.abs(i10), Math.abs(i11)));
                if (x10 > 0) {
                    aVar.l(i10, i11, x10, this.f3685j);
                }
            }
        }

        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public boolean a(int i10, int i11) {
        RecyclerView.o layoutManager = this.f3361a.getLayoutManager();
        if (layoutManager == null || this.f3361a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3361a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && k(layoutManager, i10, i11);
    }

    public void b(@o0 RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f3361a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                g();
            }
            this.f3361a = recyclerView;
            if (recyclerView != null) {
                j();
                this.f3362b = new Scroller(this.f3361a.getContext(), new DecelerateInterpolator());
                l();
            }
        }
    }

    @o0
    public abstract int[] c(@m0 RecyclerView.o oVar, @m0 View view);

    public int[] d(int i10, int i11) {
        this.f3362b.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f3362b.getFinalX(), this.f3362b.getFinalY()};
    }

    @o0
    public RecyclerView.a0 e(RecyclerView.o oVar) {
        return f(oVar);
    }

    @o0
    @Deprecated
    public q f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.a0.b)) {
            return null;
        }
        return new b(this.f3361a.getContext());
    }

    public final void g() {
        this.f3361a.t1(this.f3363c);
        this.f3361a.setOnFlingListener((RecyclerView.r) null);
    }

    @o0
    public abstract View h(RecyclerView.o oVar);

    public abstract int i(RecyclerView.o oVar, int i10, int i11);

    public final void j() throws IllegalStateException {
        if (this.f3361a.getOnFlingListener() == null) {
            this.f3361a.r(this.f3363c);
            this.f3361a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final boolean k(@m0 RecyclerView.o oVar, int i10, int i11) {
        RecyclerView.a0 e10;
        int i12;
        if (!(oVar instanceof RecyclerView.a0.b) || (e10 = e(oVar)) == null || (i12 = i(oVar, i10, i11)) == -1) {
            return false;
        }
        e10.q(i12);
        oVar.g2(e10);
        return true;
    }

    public void l() {
        RecyclerView.o layoutManager;
        View h10;
        RecyclerView recyclerView = this.f3361a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h10 = h(layoutManager)) != null) {
            int[] c10 = c(layoutManager, h10);
            int i10 = c10[0];
            if (i10 != 0 || c10[1] != 0) {
                this.f3361a.G1(i10, c10[1]);
            }
        }
    }
}
