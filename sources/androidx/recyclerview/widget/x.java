package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public class x extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final int f3734g = 100;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public w f3735e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public w f3736f;

    public class a extends q {
        public a(Context context) {
            super(context);
        }

        public void p(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            x xVar = x.this;
            int[] c10 = xVar.c(xVar.f3361a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int x10 = x(Math.max(Math.abs(i10), Math.abs(i11)));
            if (x10 > 0) {
                aVar.l(i10, i11, x10, this.f3685j);
            }
        }

        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public int y(int i10) {
            return Math.min(100, super.y(i10));
        }
    }

    @o0
    public int[] c(@m0 RecyclerView.o oVar, @m0 View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = m(oVar, view, o(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = m(oVar, view, q(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public q f(RecyclerView.o oVar) {
        if (!(oVar instanceof RecyclerView.a0.b)) {
            return null;
        }
        return new a(this.f3361a.getContext());
    }

    @o0
    public View h(RecyclerView.o oVar) {
        w o10;
        if (oVar.o()) {
            o10 = q(oVar);
        } else if (!oVar.n()) {
            return null;
        } else {
            o10 = o(oVar);
        }
        return n(oVar, o10);
    }

    public int i(RecyclerView.o oVar, int i10, int i11) {
        w p10;
        int g02 = oVar.g0();
        if (g02 == 0 || (p10 = p(oVar)) == null) {
            return -1;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int Q = oVar.Q();
        View view = null;
        View view2 = null;
        for (int i14 = 0; i14 < Q; i14++) {
            View P = oVar.P(i14);
            if (P != null) {
                int m10 = m(oVar, P, p10);
                if (m10 <= 0 && m10 > i12) {
                    view2 = P;
                    i12 = m10;
                }
                if (m10 >= 0 && m10 < i13) {
                    view = P;
                    i13 = m10;
                }
            }
        }
        boolean r10 = r(oVar, i10, i11);
        if (r10 && view != null) {
            return oVar.s0(view);
        }
        if (!r10 && view2 != null) {
            return oVar.s0(view2);
        }
        if (r10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int s02 = oVar.s0(view) + (s(oVar) == r10 ? -1 : 1);
        if (s02 < 0 || s02 >= g02) {
            return -1;
        }
        return s02;
    }

    public final int m(@m0 RecyclerView.o oVar, @m0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    @o0
    public final View n(RecyclerView.o oVar, w wVar) {
        int Q = oVar.Q();
        View view = null;
        if (Q == 0) {
            return null;
        }
        int n10 = wVar.n() + (wVar.o() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < Q; i11++) {
            View P = oVar.P(i11);
            int abs = Math.abs((wVar.g(P) + (wVar.e(P) / 2)) - n10);
            if (abs < i10) {
                view = P;
                i10 = abs;
            }
        }
        return view;
    }

    @m0
    public final w o(@m0 RecyclerView.o oVar) {
        w wVar = this.f3736f;
        if (wVar == null || wVar.f3731a != oVar) {
            this.f3736f = w.a(oVar);
        }
        return this.f3736f;
    }

    @o0
    public final w p(RecyclerView.o oVar) {
        if (oVar.o()) {
            return q(oVar);
        }
        if (oVar.n()) {
            return o(oVar);
        }
        return null;
    }

    @m0
    public final w q(@m0 RecyclerView.o oVar) {
        w wVar = this.f3735e;
        if (wVar == null || wVar.f3731a != oVar) {
            this.f3735e = w.c(oVar);
        }
        return this.f3735e;
    }

    public final boolean r(RecyclerView.o oVar, int i10, int i11) {
        return oVar.n() ? i10 > 0 : i11 > 0;
    }

    public final boolean s(RecyclerView.o oVar) {
        PointF a10;
        int g02 = oVar.g0();
        if (!(oVar instanceof RecyclerView.a0.b) || (a10 = ((RecyclerView.a0.b) oVar).a(g02 - 1)) == null) {
            return false;
        }
        return a10.x < 0.0f || a10.y < 0.0f;
    }
}
