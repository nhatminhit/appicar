package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g1.z;

public class GridLayoutManager extends LinearLayoutManager {
    public static final boolean X = false;
    public static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    public boolean O = false;
    public int P = -1;
    public int[] Q;
    public View[] R;
    public final SparseIntArray S = new SparseIntArray();
    public final SparseIntArray T = new SparseIntArray();
    public c U = new a();
    public final Rect V = new Rect();
    public boolean W;

    public static final class a extends c {
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        public int f(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.p {

        /* renamed from: g  reason: collision with root package name */
        public static final int f3078g = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f3079e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3080f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
        }

        public int h() {
            return this.f3079e;
        }

        public int i() {
            return this.f3080f;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f3081a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f3082b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3083c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3084d = false;

        public static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        public int b(int i10, int i11) {
            if (!this.f3084d) {
                return d(i10, i11);
            }
            int i12 = this.f3082b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f3082b.put(i10, d10);
            return d10;
        }

        public int c(int i10, int i11) {
            if (!this.f3083c) {
                return e(i10, i11);
            }
            int i12 = this.f3081a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f3081a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f3084d || (a10 = a(this.f3082b, i10)) == -1) {
                i14 = 0;
                i13 = 0;
                i12 = 0;
            } else {
                i14 = this.f3082b.get(a10);
                i13 = a10 + 1;
                i12 = c(a10, i11) + f(a10);
                if (i12 == i11) {
                    i14++;
                    i12 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                int i15 = i12 + f11;
                if (i15 == i11) {
                    i14++;
                    i15 = 0;
                } else if (i15 > i11) {
                    i14++;
                    i15 = f11;
                }
                i13++;
            }
            return i12 + f10 > i11 ? i14 + 1 : i14;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.f(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f3083c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f3081a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f3081a
                int r3 = r3.get(r2)
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r3 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.f(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = r1
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.e(int, int):int");
        }

        public abstract int f(int i10);

        public void g() {
            this.f3082b.clear();
        }

        public void h() {
            this.f3081a.clear();
        }

        public boolean i() {
            return this.f3084d;
        }

        public boolean j() {
            return this.f3083c;
        }

        public void k(boolean z10) {
            if (!z10) {
                this.f3082b.clear();
            }
            this.f3084d = z10;
        }

        public void l(boolean z10) {
            if (!z10) {
                this.f3082b.clear();
            }
            this.f3083c = z10;
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        Q3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        Q3(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Q3(RecyclerView.o.t0(context, attributeSet, i10, i11).f3283b);
    }

    public static int[] A3(int[] iArr, int i10, int i11) {
        int i12;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i11)) {
            iArr = new int[(i10 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    public final void B3() {
        this.S.clear();
        this.T.clear();
    }

    public final int C3(RecyclerView.b0 b0Var) {
        if (!(Q() == 0 || b0Var.d() == 0)) {
            r2();
            boolean V2 = V2();
            View x22 = x2(!V2, true);
            View w22 = w2(!V2, true);
            if (!(x22 == null || w22 == null)) {
                int b10 = this.U.b(s0(x22), this.P);
                int b11 = this.U.b(s0(w22), this.P);
                int min = Math.min(b10, b11);
                int max = this.f3090x ? Math.max(0, ((this.U.b(b0Var.d() - 1, this.P) + 1) - Math.max(b10, b11)) - 1) : Math.max(0, min);
                if (!V2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3087u.d(w22) - this.f3087u.g(x22))) / ((float) ((this.U.b(s0(w22), this.P) - this.U.b(s0(x22), this.P)) + 1)))) + ((float) (this.f3087u.n() - this.f3087u.g(x22))));
            }
        }
        return 0;
    }

    public final int D3(RecyclerView.b0 b0Var) {
        if (!(Q() == 0 || b0Var.d() == 0)) {
            r2();
            View x22 = x2(!V2(), true);
            View w22 = w2(!V2(), true);
            if (!(x22 == null || w22 == null)) {
                if (!V2()) {
                    return this.U.b(b0Var.d() - 1, this.P) + 1;
                }
                int d10 = this.f3087u.d(w22) - this.f3087u.g(x22);
                int b10 = this.U.b(s0(x22), this.P);
                return (int) ((((float) d10) / ((float) ((this.U.b(s0(w22), this.P) - b10) + 1))) * ((float) (this.U.b(b0Var.d() - 1, this.P) + 1)));
            }
        }
        return 0;
    }

    public final void E3(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int J3 = J3(wVar, b0Var, aVar.f3094b);
        if (z10) {
            while (J3 > 0) {
                int i11 = aVar.f3094b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f3094b = i12;
                    J3 = J3(wVar, b0Var, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int d10 = b0Var.d() - 1;
        int i13 = aVar.f3094b;
        while (i13 < d10) {
            int i14 = i13 + 1;
            int J32 = J3(wVar, b0Var, i14);
            if (J32 <= J3) {
                break;
            }
            i13 = i14;
            J3 = J32;
        }
        aVar.f3094b = i13;
    }

    public final void F3() {
        View[] viewArr = this.R;
        if (viewArr == null || viewArr.length != this.P) {
            this.R = new View[this.P];
        }
    }

    public int G3(int i10, int i11) {
        if (this.f3085s != 1 || !U2()) {
            int[] iArr = this.Q;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.Q;
        int i12 = this.P;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public View H2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11, int i12) {
        r2();
        int n10 = this.f3087u.n();
        int i13 = this.f3087u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View P2 = P(i10);
            int s02 = s0(P2);
            if (s02 >= 0 && s02 < i12 && J3(wVar, b0Var, s02) == 0) {
                if (((RecyclerView.p) P2.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = P2;
                    }
                } else if (this.f3087u.g(P2) < i13 && this.f3087u.d(P2) >= n10) {
                    return P2;
                } else {
                    if (view == null) {
                        view = P2;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    public int H3() {
        return this.P;
    }

    public final int I3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.j()) {
            return this.U.b(i10, this.P);
        }
        int g10 = wVar.g(i10);
        if (g10 != -1) {
            return this.U.b(g10, this.P);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot find span size for pre layout position. ");
        sb2.append(i10);
        return 0;
    }

    public final int J3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.j()) {
            return this.U.c(i10, this.P);
        }
        int i11 = this.T.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int g10 = wVar.g(i10);
        if (g10 != -1) {
            return this.U.c(g10, this.P);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb2.append(i10);
        return 0;
    }

    public RecyclerView.p K() {
        return this.f3085s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public final int K3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        if (!b0Var.j()) {
            return this.U.f(i10);
        }
        int i11 = this.S.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int g10 = wVar.g(i10);
        if (g10 != -1) {
            return this.U.f(g10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb2.append(i10);
        return 1;
    }

    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public c L3() {
        return this.U;
    }

    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void M3(float f10, int i10) {
        z3(Math.max(Math.round(f10 * ((float) this.P)), i10));
    }

    public boolean N3() {
        return this.W;
    }

    public final void O3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3287b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int G3 = G3(bVar.f3079e, bVar.f3080f);
        if (this.f3085s == 1) {
            i11 = RecyclerView.o.R(G3, i10, i14, bVar.width, false);
            i12 = RecyclerView.o.R(this.f3087u.o(), f0(), i13, bVar.height, true);
        } else {
            int R2 = RecyclerView.o.R(G3, i10, i13, bVar.height, false);
            int R3 = RecyclerView.o.R(this.f3087u.o(), A0(), i14, bVar.width, true);
            i12 = R2;
            i11 = R3;
        }
        P3(view, i11, i12, z10);
    }

    public final void P3(View view, int i10, int i11, boolean z10) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z10 ? e2(view, i10, i11, pVar) : c2(view, i10, i11, pVar)) {
            view.measure(i10, i11);
        }
    }

    public int Q1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        T3();
        F3();
        return super.Q1(i10, wVar, b0Var);
    }

    public void Q3(int i10) {
        if (i10 != this.P) {
            this.O = true;
            if (i10 >= 1) {
                this.P = i10;
                this.U.h();
                N1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void R3(c cVar) {
        this.U = cVar;
    }

    public int S1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        T3();
        F3();
        return super.S1(i10, wVar, b0Var);
    }

    public void S3(boolean z10) {
        this.W = z10;
    }

    public final void T3() {
        int i10;
        int i11;
        if (Q2() == 1) {
            i11 = z0() - p0();
            i10 = o0();
        } else {
            i11 = e0() - m0();
            i10 = r0();
        }
        z3(i11 - i10);
    }

    public int V(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3085s == 1) {
            return this.P;
        }
        if (b0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, b0Var, b0Var.d() - 1) + 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x021a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0218  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void W2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.b0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.w r3 = r6.f3087u
            int r3 = r3.m()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = r8
            goto L_0x0019
        L_0x0018:
            r9 = r5
        L_0x0019:
            int r10 = r17.Q()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.Q
            int r11 = r6.P
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = r5
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.T3()
        L_0x002c:
            int r11 = r2.f3113e
            if (r11 != r8) goto L_0x0032
            r11 = r8
            goto L_0x0033
        L_0x0032:
            r11 = r5
        L_0x0033:
            int r12 = r6.P
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f3112d
            int r12 = r6.J3(r0, r1, r12)
            int r13 = r2.f3112d
            int r13 = r6.K3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = r5
        L_0x0045:
            int r14 = r6.P
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f3112d
            int r15 = r6.K3(r0, r1, r14)
            int r4 = r6.P
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.e(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.R
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.P
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f3099b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.x3(r0, r1, r13, r11)
            r0 = r5
            r1 = r0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f3
            android.view.View[] r12 = r6.R
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$e0> r14 = r2.f3120l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.e(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.f(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.c(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.d(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.V
            r6.m(r12, r14)
            r6.O3(r12, r3, r5)
            androidx.recyclerview.widget.w r14 = r6.f3087u
            int r14 = r14.e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.b) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.w r5 = r6.f3087u
            int r5 = r5.f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.f3080f
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ef
            r4 = r5
        L_0x00ef:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f3:
            if (r9 == 0) goto L_0x0111
            r6.M3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fa:
            if (r0 >= r13) goto L_0x0111
            android.view.View[] r3 = r6.R
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.O3(r3, r4, r8)
            androidx.recyclerview.widget.w r4 = r6.f3087u
            int r3 = r4.e(r3)
            if (r3 <= r1) goto L_0x010e
            r1 = r3
        L_0x010e:
            int r0 = r0 + 1
            goto L_0x00fa
        L_0x0111:
            r0 = 0
        L_0x0112:
            if (r0 >= r13) goto L_0x0174
            android.view.View[] r3 = r6.R
            r3 = r3[r0]
            androidx.recyclerview.widget.w r4 = r6.f3087u
            int r4 = r4.e(r3)
            if (r4 == r1) goto L_0x016e
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r4 = (androidx.recyclerview.widget.GridLayoutManager.b) r4
            android.graphics.Rect r5 = r4.f3287b
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.f3079e
            int r11 = r4.f3080f
            int r5 = r6.G3(r5, r11)
            int r11 = r6.f3085s
            if (r11 != r8) goto L_0x015a
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.o.R(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016a
        L_0x015a:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.o.R(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016a:
            r6.P3(r3, r4, r5, r8)
            goto L_0x0171
        L_0x016e:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0171:
            int r0 = r0 + 1
            goto L_0x0112
        L_0x0174:
            r12 = 0
            r7.f3098a = r1
            int r0 = r6.f3085s
            r3 = -1
            if (r0 != r8) goto L_0x018e
            int r0 = r2.f3114f
            if (r0 != r3) goto L_0x0186
            int r0 = r2.f3110b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018b
        L_0x0186:
            int r0 = r2.f3110b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018b:
            r1 = r12
            r3 = r1
            goto L_0x01a1
        L_0x018e:
            int r0 = r2.f3114f
            if (r0 != r3) goto L_0x019b
            int r0 = r2.f3110b
            int r1 = r0 - r1
            r3 = r1
            r2 = r12
            r1 = r0
            r0 = r2
            goto L_0x01a1
        L_0x019b:
            int r0 = r2.f3110b
            int r1 = r1 + r0
            r3 = r0
            r0 = r12
            r2 = r0
        L_0x01a1:
            if (r12 >= r13) goto L_0x022c
            android.view.View[] r4 = r6.R
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.b) r10
            int r4 = r6.f3085s
            if (r4 != r8) goto L_0x01ea
            boolean r1 = r17.U2()
            if (r1 == 0) goto L_0x01d2
            int r1 = r17.o0()
            int[] r3 = r6.Q
            int r4 = r6.P
            int r5 = r10.f3079e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.w r3 = r6.f3087u
            int r3 = r3.f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x01ff
        L_0x01d2:
            int r1 = r17.o0()
            int[] r3 = r6.Q
            int r4 = r10.f3079e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.w r3 = r6.f3087u
            int r3 = r3.f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0201
        L_0x01ea:
            int r0 = r17.r0()
            int[] r2 = r6.Q
            int r4 = r10.f3079e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.w r2 = r6.f3087u
            int r2 = r2.f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x01ff:
            r16 = r3
        L_0x0201:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.P0(r1, r2, r3, r4, r5)
            boolean r0 = r10.e()
            if (r0 != 0) goto L_0x0218
            boolean r0 = r10.d()
            if (r0 == 0) goto L_0x021a
        L_0x0218:
            r7.f3100c = r8
        L_0x021a:
            boolean r0 = r7.f3101d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.f3101d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a1
        L_0x022c:
            android.view.View[] r0 = r6.R
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.W2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public void Y1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.Q == null) {
            super.Y1(rect, i10, i11);
        }
        int o02 = o0() + p0();
        int r02 = r0() + m0();
        if (this.f3085s == 1) {
            i13 = RecyclerView.o.q(i11, rect.height() + r02, k0());
            int[] iArr = this.Q;
            i12 = RecyclerView.o.q(i10, iArr[iArr.length - 1] + o02, l0());
        } else {
            i12 = RecyclerView.o.q(i10, rect.width() + o02, l0());
            int[] iArr2 = this.Q;
            i13 = RecyclerView.o.q(i11, iArr2[iArr2.length - 1] + r02, k0());
        }
        X1(i12, i13);
    }

    public void Z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i10) {
        super.Z2(wVar, b0Var, aVar, i10);
        T3();
        if (b0Var.d() > 0 && !b0Var.j()) {
            E3(wVar, b0Var, aVar, i10);
        }
        F3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a1(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.I(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f3079e
            int r5 = r5.f3080f
            int r5 = r5 + r6
            android.view.View r7 = super.a1(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.p2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3090x
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.Q()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.Q()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.f3085s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.U2()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.I3(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.I3(r1, r2, r10)
            android.view.View r1 = r0.P(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f3079e
            r18 = r3
            int r3 = r9.f3080f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.N0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.f3079e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.f3079e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a1(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, z zVar) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.f1(view, zVar);
            return;
        }
        b bVar = (b) layoutParams;
        int I3 = I3(wVar, b0Var, bVar.b());
        if (this.f3085s == 0) {
            i13 = bVar.h();
            i12 = bVar.i();
            i10 = 1;
            z11 = false;
            z10 = false;
            i11 = I3;
        } else {
            i12 = 1;
            i11 = bVar.h();
            i10 = bVar.i();
            z11 = false;
            z10 = false;
            i13 = I3;
        }
        zVar.X0(z.c.h(i13, i12, i11, i10, z11, z10));
    }

    public void i1(RecyclerView recyclerView, int i10, int i11) {
        this.U.h();
        this.U.g();
    }

    public void j1(RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }

    public boolean j2() {
        return this.D == null && !this.O;
    }

    public void k1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.U.h();
        this.U.g();
    }

    public void l1(RecyclerView recyclerView, int i10, int i11) {
        this.U.h();
        this.U.g();
    }

    public void l2(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i10 = this.P;
        for (int i11 = 0; i11 < this.P && cVar.c(b0Var) && i10 > 0; i11++) {
            int i12 = cVar.f3112d;
            cVar2.a(i12, Math.max(0, cVar.f3115g));
            i10 -= this.U.f(i12);
            cVar.f3112d += cVar.f3113e;
        }
    }

    public void n1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.U.h();
        this.U.g();
    }

    public void n3(boolean z10) {
        if (!z10) {
            super.n3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void o1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.j()) {
            y3();
        }
        super.o1(wVar, b0Var);
        B3();
    }

    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public void p1(RecyclerView.b0 b0Var) {
        super.p1(b0Var);
        this.O = false;
    }

    public int u(RecyclerView.b0 b0Var) {
        return this.W ? C3(b0Var) : super.u(b0Var);
    }

    public int v(RecyclerView.b0 b0Var) {
        return this.W ? D3(b0Var) : super.v(b0Var);
    }

    public int v0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3085s == 0) {
            return this.P;
        }
        if (b0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, b0Var, b0Var.d() - 1) + 1;
    }

    public int x(RecyclerView.b0 b0Var) {
        return this.W ? C3(b0Var) : super.x(b0Var);
    }

    public final void x3(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = -1;
        if (z10) {
            i11 = 1;
            i14 = i10;
            i12 = 0;
        } else {
            i12 = i10 - 1;
            i11 = -1;
        }
        while (i12 != i14) {
            View view = this.R[i12];
            b bVar = (b) view.getLayoutParams();
            int K3 = K3(wVar, b0Var, s0(view));
            bVar.f3080f = K3;
            bVar.f3079e = i13;
            i13 += K3;
            i12 += i11;
        }
    }

    public int y(RecyclerView.b0 b0Var) {
        return this.W ? D3(b0Var) : super.y(b0Var);
    }

    public final void y3() {
        int Q2 = Q();
        for (int i10 = 0; i10 < Q2; i10++) {
            b bVar = (b) P(i10).getLayoutParams();
            int b10 = bVar.b();
            this.S.put(b10, bVar.i());
            this.T.put(b10, bVar.h());
        }
    }

    public final void z3(int i10) {
        this.Q = A3(this.Q, this.P, i10);
    }
}
