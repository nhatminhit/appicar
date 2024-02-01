package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public class r extends b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final float f3692g = 1.0f;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public w f3693e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public w f3694f;

    public int[] c(@m0 RecyclerView.o oVar, @m0 View view) {
        int[] iArr = new int[2];
        if (oVar.n()) {
            iArr[0] = n(oVar, view, q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.o()) {
            iArr[1] = n(oVar, view, r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View h(RecyclerView.o oVar) {
        w q10;
        if (oVar.o()) {
            q10 = r(oVar);
        } else if (!oVar.n()) {
            return null;
        } else {
            q10 = q(oVar);
        }
        return p(oVar, q10);
    }

    public int i(RecyclerView.o oVar, int i10, int i11) {
        int g02;
        View h10;
        int s02;
        int i12;
        PointF a10;
        int i13;
        int i14;
        if (!(oVar instanceof RecyclerView.a0.b) || (g02 = oVar.g0()) == 0 || (h10 = h(oVar)) == null || (s02 = oVar.s0(h10)) == -1 || (a10 = ((RecyclerView.a0.b) oVar).a(i12)) == null) {
            return -1;
        }
        int i15 = 0;
        if (oVar.n()) {
            i13 = o(oVar, q(oVar), i10, 0);
            if (a10.x < 0.0f) {
                i13 = -i13;
            }
        } else {
            i13 = 0;
        }
        if (oVar.o()) {
            i14 = o(oVar, r(oVar), 0, i11);
            if (a10.y < 0.0f) {
                i14 = -i14;
            }
        } else {
            i14 = 0;
        }
        if (oVar.o()) {
            i13 = i14;
        }
        if (i13 == 0) {
            return -1;
        }
        int i16 = s02 + i13;
        if (i16 >= 0) {
            i15 = i16;
        }
        return i15 >= g02 ? g02 - 1 : i15;
    }

    public final float m(RecyclerView.o oVar, w wVar) {
        int max;
        int Q = oVar.Q();
        if (Q == 0) {
            return 1.0f;
        }
        View view = null;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i12 = 0; i12 < Q; i12++) {
            View P = oVar.P(i12);
            int s02 = oVar.s0(P);
            if (s02 != -1) {
                if (s02 < i11) {
                    view = P;
                    i11 = s02;
                }
                if (s02 > i10) {
                    view2 = P;
                    i10 = s02;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(wVar.d(view), wVar.d(view2)) - Math.min(wVar.g(view), wVar.g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i10 - i11) + 1));
    }

    public final int n(@m0 RecyclerView.o oVar, @m0 View view, w wVar) {
        return (wVar.g(view) + (wVar.e(view) / 2)) - (wVar.n() + (wVar.o() / 2));
    }

    public final int o(RecyclerView.o oVar, w wVar, int i10, int i11) {
        int[] d10 = d(i10, i11);
        float m10 = m(oVar, wVar);
        if (m10 <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d10[0]) > Math.abs(d10[1]) ? d10[0] : d10[1])) / m10);
    }

    @o0
    public final View p(RecyclerView.o oVar, w wVar) {
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
    public final w q(@m0 RecyclerView.o oVar) {
        w wVar = this.f3694f;
        if (wVar == null || wVar.f3731a != oVar) {
            this.f3694f = w.a(oVar);
        }
        return this.f3694f;
    }

    @m0
    public final w r(@m0 RecyclerView.o oVar) {
        w wVar = this.f3693e;
        if (wVar == null || wVar.f3731a != oVar) {
            this.f3693e = w.c(oVar);
        }
        return this.f3693e;
    }
}
