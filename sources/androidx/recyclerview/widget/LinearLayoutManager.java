package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import d.m0;
import d.x0;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements m.j, RecyclerView.a0.b {
    public static final String I = "LinearLayoutManager";
    public static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    public static final float N = 0.33333334f;
    public int A;
    public int B;
    public boolean C;
    public SavedState D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;

    /* renamed from: s  reason: collision with root package name */
    public int f3085s;

    /* renamed from: t  reason: collision with root package name */
    public c f3086t;

    /* renamed from: u  reason: collision with root package name */
    public w f3087u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3088v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3089w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3090x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3091y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3092z;

    @SuppressLint({"BanParcelableUsage"})
    @x0({x0.a.O})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;
        public int P;
        public boolean Q;

        public static class a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.O = parcel.readInt();
            this.P = parcel.readInt();
            this.Q = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.O = savedState.O;
            this.P = savedState.P;
            this.Q = savedState.Q;
        }

        public boolean a() {
            return this.O >= 0;
        }

        public void b() {
            this.O = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q ? 1 : 0);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public w f3093a;

        /* renamed from: b  reason: collision with root package name */
        public int f3094b;

        /* renamed from: c  reason: collision with root package name */
        public int f3095c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3096d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3097e;

        public a() {
            e();
        }

        public void a() {
            this.f3095c = this.f3096d ? this.f3093a.i() : this.f3093a.n();
        }

        public void b(View view, int i10) {
            this.f3095c = this.f3096d ? this.f3093a.d(view) + this.f3093a.p() : this.f3093a.g(view);
            this.f3094b = i10;
        }

        public void c(View view, int i10) {
            int p10 = this.f3093a.p();
            if (p10 >= 0) {
                b(view, i10);
                return;
            }
            this.f3094b = i10;
            if (this.f3096d) {
                int i11 = (this.f3093a.i() - p10) - this.f3093a.d(view);
                this.f3095c = this.f3093a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f3095c - this.f3093a.e(view);
                    int n10 = this.f3093a.n();
                    int min = e10 - (n10 + Math.min(this.f3093a.g(view) - n10, 0));
                    if (min < 0) {
                        this.f3095c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f3093a.g(view);
            int n11 = g10 - this.f3093a.n();
            this.f3095c = g10;
            if (n11 > 0) {
                int i12 = (this.f3093a.i() - Math.min(0, (this.f3093a.i() - p10) - this.f3093a.d(view))) - (g10 + this.f3093a.e(view));
                if (i12 < 0) {
                    this.f3095c -= Math.min(n11, -i12);
                }
            }
        }

        public boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.e() && pVar.b() >= 0 && pVar.b() < b0Var.d();
        }

        public void e() {
            this.f3094b = -1;
            this.f3095c = Integer.MIN_VALUE;
            this.f3096d = false;
            this.f3097e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3094b + ", mCoordinate=" + this.f3095c + ", mLayoutFromEnd=" + this.f3096d + ", mValid=" + this.f3097e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3098a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3099b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3100c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3101d;

        public void a() {
            this.f3098a = 0;
            this.f3099b = false;
            this.f3100c = false;
            this.f3101d = false;
        }
    }

    public static class c {

        /* renamed from: n  reason: collision with root package name */
        public static final String f3102n = "LLM#LayoutState";

        /* renamed from: o  reason: collision with root package name */
        public static final int f3103o = -1;

        /* renamed from: p  reason: collision with root package name */
        public static final int f3104p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f3105q = Integer.MIN_VALUE;

        /* renamed from: r  reason: collision with root package name */
        public static final int f3106r = -1;

        /* renamed from: s  reason: collision with root package name */
        public static final int f3107s = 1;

        /* renamed from: t  reason: collision with root package name */
        public static final int f3108t = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public boolean f3109a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f3110b;

        /* renamed from: c  reason: collision with root package name */
        public int f3111c;

        /* renamed from: d  reason: collision with root package name */
        public int f3112d;

        /* renamed from: e  reason: collision with root package name */
        public int f3113e;

        /* renamed from: f  reason: collision with root package name */
        public int f3114f;

        /* renamed from: g  reason: collision with root package name */
        public int f3115g;

        /* renamed from: h  reason: collision with root package name */
        public int f3116h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f3117i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3118j = false;

        /* renamed from: k  reason: collision with root package name */
        public int f3119k;

        /* renamed from: l  reason: collision with root package name */
        public List<RecyclerView.e0> f3120l = null;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3121m;

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View g10 = g(view);
            this.f3112d = g10 == null ? -1 : ((RecyclerView.p) g10.getLayoutParams()).b();
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i10 = this.f3112d;
            return i10 >= 0 && i10 < b0Var.d();
        }

        public void d() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("avail:");
            sb2.append(this.f3111c);
            sb2.append(", ind:");
            sb2.append(this.f3112d);
            sb2.append(", dir:");
            sb2.append(this.f3113e);
            sb2.append(", offset:");
            sb2.append(this.f3110b);
            sb2.append(", layoutDir:");
            sb2.append(this.f3114f);
        }

        public View e(RecyclerView.w wVar) {
            if (this.f3120l != null) {
                return f();
            }
            View p10 = wVar.p(this.f3112d);
            this.f3112d += this.f3113e;
            return p10;
        }

        public final View f() {
            int size = this.f3120l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f3120l.get(i10).f3220a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.e() && this.f3112d == pVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View g(View view) {
            int b10;
            int size = this.f3120l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f3120l.get(i11).f3220a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.e() && (b10 = (pVar.b() - this.f3112d) * this.f3113e) >= 0 && b10 < i10) {
                    view2 = view3;
                    if (b10 == 0) {
                        break;
                    }
                    i10 = b10;
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3085s = 1;
        this.f3089w = false;
        this.f3090x = false;
        this.f3091y = false;
        this.f3092z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        j3(i10);
        l3(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3085s = 1;
        this.f3089w = false;
        this.f3090x = false;
        this.f3091y = false;
        this.f3092z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d t02 = RecyclerView.o.t0(context, attributeSet, i10, i11);
        j3(t02.f3282a);
        l3(t02.f3284c);
        n3(t02.f3285d);
    }

    public final View A2() {
        return D2(Q() - 1, -1);
    }

    public final View B2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return H2(wVar, b0Var, Q() - 1, -1, b0Var.d());
    }

    public int C2() {
        View E2 = E2(Q() - 1, -1, false, true);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public View D2(int i10, int i11) {
        int i12;
        int i13;
        r2();
        if ((i11 > i10 ? 1 : i11 < i10 ? (char) 65535 : 0) == 0) {
            return P(i10);
        }
        if (this.f3087u.g(P(i10)) < this.f3087u.n()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = u.I;
        }
        return (this.f3085s == 0 ? this.f3266e : this.f3267f).a(i10, i11, i13, i12);
    }

    public View E2(int i10, int i11, boolean z10, boolean z11) {
        r2();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return (this.f3085s == 0 ? this.f3266e : this.f3267f).a(i10, i11, i13, i12);
    }

    public boolean F0() {
        return true;
    }

    public final View F2() {
        return this.f3090x ? u2() : A2();
    }

    public final View G2() {
        return this.f3090x ? A2() : u2();
    }

    public View H2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11, int i12) {
        r2();
        int n10 = this.f3087u.n();
        int i13 = this.f3087u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View P = P(i10);
            int s02 = s0(P);
            if (s02 >= 0 && s02 < i12) {
                if (((RecyclerView.p) P.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = P;
                    }
                } else if (this.f3087u.g(P) < i13 && this.f3087u.d(P) >= n10) {
                    return P;
                } else {
                    if (view == null) {
                        view = P;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    public final View I2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return this.f3090x ? v2(wVar, b0Var) : B2(wVar, b0Var);
    }

    public View J(int i10) {
        int Q = Q();
        if (Q == 0) {
            return null;
        }
        int s02 = i10 - s0(P(0));
        if (s02 >= 0 && s02 < Q) {
            View P = P(s02);
            if (s0(P) == i10) {
                return P;
            }
        }
        return super.J(i10);
    }

    public final View J2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return this.f3090x ? B2(wVar, b0Var) : v2(wVar, b0Var);
    }

    public RecyclerView.p K() {
        return new RecyclerView.p(-2, -2);
    }

    public final int K2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i11;
        int i12 = this.f3087u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -g3(-i12, wVar, b0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f3087u.i() - i14) <= 0) {
            return i13;
        }
        this.f3087u.t(i11);
        return i11 + i13;
    }

    public final int L2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int n10;
        int n11 = i10 - this.f3087u.n();
        if (n11 <= 0) {
            return 0;
        }
        int i11 = -g3(n11, wVar, b0Var);
        int i12 = i10 + i11;
        if (!z10 || (n10 = i12 - this.f3087u.n()) <= 0) {
            return i11;
        }
        this.f3087u.t(-n10);
        return i11 - n10;
    }

    public final View M2() {
        return P(this.f3090x ? 0 : Q() - 1);
    }

    public final View N2() {
        return P(this.f3090x ? Q() - 1 : 0);
    }

    @Deprecated
    public int O2(RecyclerView.b0 b0Var) {
        if (b0Var.h()) {
            return this.f3087u.o();
        }
        return 0;
    }

    public int P2() {
        return this.G;
    }

    public int Q1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3085s == 1) {
            return 0;
        }
        return g3(i10, wVar, b0Var);
    }

    public int Q2() {
        return this.f3085s;
    }

    public void R1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        N1();
    }

    public boolean R2() {
        return this.C;
    }

    public int S1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3085s == 0) {
            return 0;
        }
        return g3(i10, wVar, b0Var);
    }

    public boolean S2() {
        return this.f3089w;
    }

    public boolean T2() {
        return this.f3091y;
    }

    public boolean U2() {
        return i0() == 1;
    }

    public boolean V2() {
        return this.f3092z;
    }

    public void W2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View e10 = cVar.e(wVar);
        if (e10 == null) {
            bVar.f3099b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) e10.getLayoutParams();
        if (cVar.f3120l == null) {
            if (this.f3090x == (cVar.f3114f == -1)) {
                e(e10);
            } else {
                f(e10, 0);
            }
        } else {
            if (this.f3090x == (cVar.f3114f == -1)) {
                c(e10);
            } else {
                d(e10, 0);
            }
        }
        R0(e10, 0, 0);
        bVar.f3098a = this.f3087u.e(e10);
        if (this.f3085s == 1) {
            if (U2()) {
                i14 = z0() - p0();
                i13 = i14 - this.f3087u.f(e10);
            } else {
                i13 = o0();
                i14 = this.f3087u.f(e10) + i13;
            }
            int i15 = cVar.f3114f;
            int i16 = cVar.f3110b;
            if (i15 == -1) {
                i10 = i16;
                i11 = i14;
                i12 = i16 - bVar.f3098a;
            } else {
                i12 = i16;
                i11 = i14;
                i10 = bVar.f3098a + i16;
            }
        } else {
            int r02 = r0();
            int f10 = this.f3087u.f(e10) + r02;
            int i17 = cVar.f3114f;
            int i18 = cVar.f3110b;
            if (i17 == -1) {
                i11 = i18;
                i12 = r02;
                i10 = f10;
                i13 = i18 - bVar.f3098a;
            } else {
                i12 = r02;
                i11 = bVar.f3098a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        P0(e10, i13, i12, i11, i10);
        if (pVar.e() || pVar.d()) {
            bVar.f3100c = true;
        }
        bVar.f3101d = e10.hasFocusable();
    }

    public final void X2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10, int i11) {
        RecyclerView.w wVar2 = wVar;
        RecyclerView.b0 b0Var2 = b0Var;
        if (b0Var.n() && Q() != 0 && !b0Var.j() && j2()) {
            List<RecyclerView.e0> l10 = wVar.l();
            int size = l10.size();
            int s02 = s0(P(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.e0 e0Var = l10.get(i14);
                if (!e0Var.w()) {
                    boolean z10 = true;
                    if ((e0Var.m() < s02) != this.f3090x) {
                        z10 = true;
                    }
                    int e10 = this.f3087u.e(e0Var.f3220a);
                    if (z10) {
                        i12 += e10;
                    } else {
                        i13 += e10;
                    }
                }
            }
            this.f3086t.f3120l = l10;
            if (i12 > 0) {
                u3(s0(N2()), i10);
                c cVar = this.f3086t;
                cVar.f3116h = i12;
                cVar.f3111c = 0;
                cVar.a();
                s2(wVar2, this.f3086t, b0Var2, false);
            }
            if (i13 > 0) {
                s3(s0(M2()), i11);
                c cVar2 = this.f3086t;
                cVar2.f3116h = i13;
                cVar2.f3111c = 0;
                cVar2.a();
                s2(wVar2, this.f3086t, b0Var2, false);
            }
            this.f3086t.f3120l = null;
        }
    }

    public final void Y2() {
        for (int i10 = 0; i10 < Q(); i10++) {
            View P = P(i10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("item ");
            sb2.append(s0(P));
            sb2.append(", coord:");
            sb2.append(this.f3087u.g(P));
        }
    }

    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        if (this.C) {
            D1(wVar);
            wVar.d();
        }
    }

    public void Z2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i10) {
    }

    public PointF a(int i10) {
        if (Q() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < s0(P(0))) {
            z10 = true;
        }
        if (z10 != this.f3090x) {
            i11 = -1;
        }
        return this.f3085s == 0 ? new PointF((float) i11, 0.0f) : new PointF(0.0f, (float) i11);
    }

    public View a1(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int p22;
        f3();
        if (Q() == 0 || (p22 = p2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        r3(p22, (int) (((float) this.f3087u.o()) * 0.33333334f), false, b0Var);
        c cVar = this.f3086t;
        cVar.f3115g = Integer.MIN_VALUE;
        cVar.f3109a = false;
        s2(wVar, cVar, b0Var, true);
        View G2 = p22 == -1 ? G2() : F2();
        View N2 = p22 == -1 ? N2() : M2();
        if (!N2.hasFocusable()) {
            return G2;
        }
        if (G2 == null) {
            return null;
        }
        return N2;
    }

    public final void a3(RecyclerView.w wVar, c cVar) {
        if (cVar.f3109a && !cVar.f3121m) {
            int i10 = cVar.f3115g;
            int i11 = cVar.f3117i;
            if (cVar.f3114f == -1) {
                c3(wVar, i10, i11);
            } else {
                d3(wVar, i10, i11);
            }
        }
    }

    public void b(@m0 View view, @m0 View view2, int i10, int i11) {
        int i12;
        i("Cannot drop a view during a scroll or layout calculation");
        r2();
        f3();
        int s02 = s0(view);
        int s03 = s0(view2);
        boolean z10 = s02 < s03 ? true : true;
        if (this.f3090x) {
            if (z10) {
                h3(s03, this.f3087u.i() - (this.f3087u.g(view2) + this.f3087u.e(view)));
                return;
            }
            i12 = this.f3087u.i() - this.f3087u.d(view2);
        } else if (z10) {
            i12 = this.f3087u.g(view2);
        } else {
            h3(s03, this.f3087u.d(view2) - this.f3087u.e(view));
            return;
        }
        h3(s03, i12);
    }

    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(y2());
            accessibilityEvent.setToIndex(C2());
        }
    }

    public final void b3(RecyclerView.w wVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    G1(i12, wVar);
                }
                return;
            }
            while (i10 > i11) {
                G1(i10, wVar);
                i10--;
            }
        }
    }

    public final void c3(RecyclerView.w wVar, int i10, int i11) {
        int Q = Q();
        if (i10 >= 0) {
            int h10 = (this.f3087u.h() - i10) + i11;
            if (this.f3090x) {
                for (int i12 = 0; i12 < Q; i12++) {
                    View P = P(i12);
                    if (this.f3087u.g(P) < h10 || this.f3087u.r(P) < h10) {
                        b3(wVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = Q - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View P2 = P(i14);
                if (this.f3087u.g(P2) < h10 || this.f3087u.r(P2) < h10) {
                    b3(wVar, i13, i14);
                    return;
                }
            }
        }
    }

    public boolean d2() {
        return (f0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    public final void d3(RecyclerView.w wVar, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int Q = Q();
            if (this.f3090x) {
                int i13 = Q - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View P = P(i14);
                    if (this.f3087u.d(P) > i12 || this.f3087u.q(P) > i12) {
                        b3(wVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < Q; i15++) {
                View P2 = P(i15);
                if (this.f3087u.d(P2) > i12 || this.f3087u.q(P2) > i12) {
                    b3(wVar, 0, i15);
                    return;
                }
            }
        }
    }

    public boolean e3() {
        return this.f3087u.l() == 0 && this.f3087u.h() == 0;
    }

    public void f2(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.q(i10);
        g2(qVar);
    }

    public final void f3() {
        this.f3090x = (this.f3085s == 1 || !U2()) ? this.f3089w : !this.f3089w;
    }

    public int g3(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (Q() == 0 || i10 == 0) {
            return 0;
        }
        r2();
        this.f3086t.f3109a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        r3(i11, abs, true, b0Var);
        c cVar = this.f3086t;
        int s22 = cVar.f3115g + s2(wVar, cVar, b0Var, false);
        if (s22 < 0) {
            return 0;
        }
        if (abs > s22) {
            i10 = i11 * s22;
        }
        this.f3087u.t(-i10);
        this.f3086t.f3119k = i10;
        return i10;
    }

    public void h3(int i10, int i11) {
        this.A = i10;
        this.B = i11;
        SavedState savedState = this.D;
        if (savedState != null) {
            savedState.b();
        }
        N1();
    }

    public void i(String str) {
        if (this.D == null) {
            super.i(str);
        }
    }

    public void i3(int i10) {
        this.G = i10;
    }

    public boolean j2() {
        return this.D == null && this.f3088v == this.f3091y;
    }

    public void j3(int i10) {
        if (i10 == 0 || i10 == 1) {
            i((String) null);
            if (i10 != this.f3085s || this.f3087u == null) {
                w b10 = w.b(this, i10);
                this.f3087u = b10;
                this.E.f3093a = b10;
                this.f3085s = i10;
                N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void k2(@m0 RecyclerView.b0 b0Var, @m0 int[] iArr) {
        int i10;
        int O2 = O2(b0Var);
        if (this.f3086t.f3114f == -1) {
            i10 = 0;
        } else {
            i10 = O2;
            O2 = 0;
        }
        iArr[0] = O2;
        iArr[1] = i10;
    }

    public void k3(boolean z10) {
        this.C = z10;
    }

    public void l2(RecyclerView.b0 b0Var, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f3112d;
        if (i10 >= 0 && i10 < b0Var.d()) {
            cVar2.a(i10, Math.max(0, cVar.f3115g));
        }
    }

    public void l3(boolean z10) {
        i((String) null);
        if (z10 != this.f3089w) {
            this.f3089w = z10;
            N1();
        }
    }

    public final int m2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        w wVar = this.f3087u;
        View x22 = x2(!this.f3092z, true);
        return z.a(b0Var, wVar, x22, w2(!this.f3092z, true), this, this.f3092z);
    }

    public void m3(boolean z10) {
        this.f3092z = z10;
    }

    public boolean n() {
        return this.f3085s == 0;
    }

    public final int n2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        w wVar = this.f3087u;
        View x22 = x2(!this.f3092z, true);
        return z.b(b0Var, wVar, x22, w2(!this.f3092z, true), this, this.f3092z, this.f3090x);
    }

    public void n3(boolean z10) {
        i((String) null);
        if (this.f3091y != z10) {
            this.f3091y = z10;
            N1();
        }
    }

    public boolean o() {
        return this.f3085s == 1;
    }

    public void o1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View J2;
        int i16;
        int i17;
        int i18 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.d() == 0) {
            D1(wVar);
            return;
        }
        SavedState savedState = this.D;
        if (savedState != null && savedState.a()) {
            this.A = this.D.O;
        }
        r2();
        this.f3086t.f3109a = false;
        f3();
        View d02 = d0();
        a aVar = this.E;
        if (!aVar.f3097e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3096d = this.f3090x ^ this.f3091y;
            q3(wVar, b0Var, aVar2);
            this.E.f3097e = true;
        } else if (d02 != null && (this.f3087u.g(d02) >= this.f3087u.i() || this.f3087u.d(d02) <= this.f3087u.n())) {
            this.E.c(d02, s0(d02));
        }
        c cVar = this.f3086t;
        cVar.f3114f = cVar.f3119k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(b0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f3087u.n();
        int max2 = Math.max(0, this.H[1]) + this.f3087u.j();
        if (!(!b0Var.j() || (i15 = this.A) == -1 || this.B == Integer.MIN_VALUE || (J2 = J(i15)) == null)) {
            if (this.f3090x) {
                i16 = this.f3087u.i() - this.f3087u.d(J2);
                i17 = this.B;
            } else {
                i17 = this.f3087u.g(J2) - this.f3087u.n();
                i16 = this.B;
            }
            int i19 = i16 - i17;
            if (i19 > 0) {
                max += i19;
            } else {
                max2 -= i19;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3096d ? !this.f3090x : this.f3090x) {
            i18 = 1;
        }
        Z2(wVar, b0Var, aVar3, i18);
        z(wVar);
        this.f3086t.f3121m = e3();
        this.f3086t.f3118j = b0Var.j();
        this.f3086t.f3117i = 0;
        a aVar4 = this.E;
        if (aVar4.f3096d) {
            v3(aVar4);
            c cVar2 = this.f3086t;
            cVar2.f3116h = max;
            s2(wVar, cVar2, b0Var, false);
            c cVar3 = this.f3086t;
            i11 = cVar3.f3110b;
            int i20 = cVar3.f3112d;
            int i21 = cVar3.f3111c;
            if (i21 > 0) {
                max2 += i21;
            }
            t3(this.E);
            c cVar4 = this.f3086t;
            cVar4.f3116h = max2;
            cVar4.f3112d += cVar4.f3113e;
            s2(wVar, cVar4, b0Var, false);
            c cVar5 = this.f3086t;
            i10 = cVar5.f3110b;
            int i22 = cVar5.f3111c;
            if (i22 > 0) {
                u3(i20, i11);
                c cVar6 = this.f3086t;
                cVar6.f3116h = i22;
                s2(wVar, cVar6, b0Var, false);
                i11 = this.f3086t.f3110b;
            }
        } else {
            t3(aVar4);
            c cVar7 = this.f3086t;
            cVar7.f3116h = max2;
            s2(wVar, cVar7, b0Var, false);
            c cVar8 = this.f3086t;
            i10 = cVar8.f3110b;
            int i23 = cVar8.f3112d;
            int i24 = cVar8.f3111c;
            if (i24 > 0) {
                max += i24;
            }
            v3(this.E);
            c cVar9 = this.f3086t;
            cVar9.f3116h = max;
            cVar9.f3112d += cVar9.f3113e;
            s2(wVar, cVar9, b0Var, false);
            c cVar10 = this.f3086t;
            i11 = cVar10.f3110b;
            int i25 = cVar10.f3111c;
            if (i25 > 0) {
                s3(i23, i10);
                c cVar11 = this.f3086t;
                cVar11.f3116h = i25;
                s2(wVar, cVar11, b0Var, false);
                i10 = this.f3086t.f3110b;
            }
        }
        if (Q() > 0) {
            if (this.f3090x ^ this.f3091y) {
                int K2 = K2(i10, wVar, b0Var, true);
                i13 = i11 + K2;
                i12 = i10 + K2;
                i14 = L2(i13, wVar, b0Var, false);
            } else {
                int L2 = L2(i11, wVar, b0Var, true);
                i13 = i11 + L2;
                i12 = i10 + L2;
                i14 = K2(i12, wVar, b0Var, false);
            }
            i11 = i13 + i14;
            i10 = i12 + i14;
        }
        X2(wVar, b0Var, i11, i10);
        if (!b0Var.j()) {
            this.f3087u.u();
        } else {
            this.E.e();
        }
        this.f3088v = this.f3091y;
    }

    public final int o2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        w wVar = this.f3087u;
        View x22 = x2(!this.f3092z, true);
        return z.c(b0Var, wVar, x22, w2(!this.f3092z, true), this, this.f3092z);
    }

    public final boolean o3(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        boolean z10 = false;
        if (Q() == 0) {
            return false;
        }
        View d02 = d0();
        if (d02 != null && aVar.d(d02, b0Var)) {
            aVar.c(d02, s0(d02));
            return true;
        } else if (this.f3088v != this.f3091y) {
            return false;
        } else {
            View I2 = aVar.f3096d ? I2(wVar, b0Var) : J2(wVar, b0Var);
            if (I2 == null) {
                return false;
            }
            aVar.b(I2, s0(I2));
            if (!b0Var.j() && j2()) {
                if (this.f3087u.g(I2) >= this.f3087u.i() || this.f3087u.d(I2) < this.f3087u.n()) {
                    z10 = true;
                }
                if (z10) {
                    aVar.f3095c = aVar.f3096d ? this.f3087u.i() : this.f3087u.n();
                }
            }
            return true;
        }
    }

    public void p1(RecyclerView.b0 b0Var) {
        super.p1(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int p2(int i10) {
        if (i10 == 1) {
            return (this.f3085s != 1 && U2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3085s != 1 && U2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3085s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3085s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f3085s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3085s == 1 ? 1 : Integer.MIN_VALUE;
    }

    public final boolean p3(RecyclerView.b0 b0Var, a aVar) {
        int i10;
        boolean z10 = false;
        if (!b0Var.j() && (i10 = this.A) != -1) {
            if (i10 < 0 || i10 >= b0Var.d()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f3094b = this.A;
                SavedState savedState = this.D;
                if (savedState != null && savedState.a()) {
                    boolean z11 = this.D.Q;
                    aVar.f3096d = z11;
                    aVar.f3095c = z11 ? this.f3087u.i() - this.D.P : this.f3087u.n() + this.D.P;
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View J2 = J(this.A);
                    if (J2 == null) {
                        if (Q() > 0) {
                            if ((this.A < s0(P(0))) == this.f3090x) {
                                z10 = true;
                            }
                            aVar.f3096d = z10;
                        }
                        aVar.a();
                    } else if (this.f3087u.e(J2) > this.f3087u.o()) {
                        aVar.a();
                        return true;
                    } else if (this.f3087u.g(J2) - this.f3087u.n() < 0) {
                        aVar.f3095c = this.f3087u.n();
                        aVar.f3096d = false;
                        return true;
                    } else if (this.f3087u.i() - this.f3087u.d(J2) < 0) {
                        aVar.f3095c = this.f3087u.i();
                        aVar.f3096d = true;
                        return true;
                    } else {
                        aVar.f3095c = aVar.f3096d ? this.f3087u.d(J2) + this.f3087u.p() : this.f3087u.g(J2);
                    }
                    return true;
                } else {
                    boolean z12 = this.f3090x;
                    aVar.f3096d = z12;
                    aVar.f3095c = z12 ? this.f3087u.i() - this.B : this.f3087u.n() + this.B;
                    return true;
                }
            }
        }
        return false;
    }

    public c q2() {
        return new c();
    }

    public final void q3(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (!p3(b0Var, aVar) && !o3(wVar, b0Var, aVar)) {
            aVar.a();
            aVar.f3094b = this.f3091y ? b0Var.d() - 1 : 0;
        }
    }

    public void r(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.o.c cVar) {
        if (this.f3085s != 0) {
            i10 = i11;
        }
        if (Q() != 0 && i10 != 0) {
            r2();
            r3(i10 > 0 ? 1 : -1, Math.abs(i10), true, b0Var);
            l2(b0Var, this.f3086t, cVar);
        }
    }

    public void r2() {
        if (this.f3086t == null) {
            this.f3086t = q2();
        }
    }

    public final void r3(int i10, int i11, boolean z10, RecyclerView.b0 b0Var) {
        int i12;
        this.f3086t.f3121m = e3();
        this.f3086t.f3114f = i10;
        int[] iArr = this.H;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        k2(b0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f3086t;
        int i14 = z11 ? max2 : max;
        cVar.f3116h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f3117i = max;
        if (z11) {
            cVar.f3116h = i14 + this.f3087u.j();
            View M2 = M2();
            c cVar2 = this.f3086t;
            if (this.f3090x) {
                i13 = -1;
            }
            cVar2.f3113e = i13;
            int s02 = s0(M2);
            c cVar3 = this.f3086t;
            cVar2.f3112d = s02 + cVar3.f3113e;
            cVar3.f3110b = this.f3087u.d(M2);
            i12 = this.f3087u.d(M2) - this.f3087u.i();
        } else {
            View N2 = N2();
            this.f3086t.f3116h += this.f3087u.n();
            c cVar4 = this.f3086t;
            if (!this.f3090x) {
                i13 = -1;
            }
            cVar4.f3113e = i13;
            int s03 = s0(N2);
            c cVar5 = this.f3086t;
            cVar4.f3112d = s03 + cVar5.f3113e;
            cVar5.f3110b = this.f3087u.g(N2);
            i12 = (-this.f3087u.g(N2)) + this.f3087u.n();
        }
        c cVar6 = this.f3086t;
        cVar6.f3111c = i11;
        if (z10) {
            cVar6.f3111c = i11 - i12;
        }
        cVar6.f3115g = i12;
    }

    public void s(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        SavedState savedState = this.D;
        int i12 = -1;
        if (savedState == null || !savedState.a()) {
            f3();
            z10 = this.f3090x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.D;
            z10 = savedState2.Q;
            i11 = savedState2.O;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public int s2(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10 = cVar.f3111c;
        int i11 = cVar.f3115g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3115g = i11 + i10;
            }
            a3(wVar, cVar);
        }
        int i12 = cVar.f3111c + cVar.f3116h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3121m && i12 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            W2(wVar, b0Var, cVar, bVar);
            if (!bVar.f3099b) {
                cVar.f3110b += bVar.f3098a * cVar.f3114f;
                if (!bVar.f3100c || cVar.f3120l != null || !b0Var.j()) {
                    int i13 = cVar.f3111c;
                    int i14 = bVar.f3098a;
                    cVar.f3111c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3115g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3098a;
                    cVar.f3115g = i16;
                    int i17 = cVar.f3111c;
                    if (i17 < 0) {
                        cVar.f3115g = i16 + i17;
                    }
                    a3(wVar, cVar);
                }
                if (z10 && bVar.f3101d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3111c;
    }

    public final void s3(int i10, int i11) {
        this.f3086t.f3111c = this.f3087u.i() - i11;
        c cVar = this.f3086t;
        cVar.f3113e = this.f3090x ? -1 : 1;
        cVar.f3112d = i10;
        cVar.f3114f = 1;
        cVar.f3110b = i11;
        cVar.f3115g = Integer.MIN_VALUE;
    }

    public int t(RecyclerView.b0 b0Var) {
        return m2(b0Var);
    }

    public void t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.D = (SavedState) parcelable;
            N1();
        }
    }

    public int t2() {
        View E2 = E2(0, Q(), true, false);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public final void t3(a aVar) {
        s3(aVar.f3094b, aVar.f3095c);
    }

    public int u(RecyclerView.b0 b0Var) {
        return n2(b0Var);
    }

    public Parcelable u1() {
        if (this.D != null) {
            return new SavedState(this.D);
        }
        SavedState savedState = new SavedState();
        if (Q() > 0) {
            r2();
            boolean z10 = this.f3088v ^ this.f3090x;
            savedState.Q = z10;
            if (z10) {
                View M2 = M2();
                savedState.P = this.f3087u.i() - this.f3087u.d(M2);
                savedState.O = s0(M2);
            } else {
                View N2 = N2();
                savedState.O = s0(N2);
                savedState.P = this.f3087u.g(N2) - this.f3087u.n();
            }
        } else {
            savedState.b();
        }
        return savedState;
    }

    public final View u2() {
        return D2(0, Q());
    }

    public final void u3(int i10, int i11) {
        this.f3086t.f3111c = i11 - this.f3087u.n();
        c cVar = this.f3086t;
        cVar.f3112d = i10;
        cVar.f3113e = this.f3090x ? 1 : -1;
        cVar.f3114f = -1;
        cVar.f3110b = i11;
        cVar.f3115g = Integer.MIN_VALUE;
    }

    public int v(RecyclerView.b0 b0Var) {
        return o2(b0Var);
    }

    public final View v2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return H2(wVar, b0Var, 0, Q(), b0Var.d());
    }

    public final void v3(a aVar) {
        u3(aVar.f3094b, aVar.f3095c);
    }

    public int w(RecyclerView.b0 b0Var) {
        return m2(b0Var);
    }

    public View w2(boolean z10, boolean z11) {
        int Q;
        int i10;
        if (this.f3090x) {
            Q = 0;
            i10 = Q();
        } else {
            Q = Q() - 1;
            i10 = -1;
        }
        return E2(Q, i10, z10, z11);
    }

    public void w3() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("validating child count ");
        sb2.append(Q());
        boolean z10 = true;
        if (Q() >= 1) {
            int s02 = s0(P(0));
            int g10 = this.f3087u.g(P(0));
            if (this.f3090x) {
                int i10 = 1;
                while (i10 < Q()) {
                    View P = P(i10);
                    int s03 = s0(P);
                    int g11 = this.f3087u.g(P);
                    if (s03 < s02) {
                        Y2();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("detected invalid position. loc invalid? ");
                        if (g11 >= g10) {
                            z10 = false;
                        }
                        sb3.append(z10);
                        throw new RuntimeException(sb3.toString());
                    } else if (g11 <= g10) {
                        i10++;
                    } else {
                        Y2();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i11 = 1;
            while (i11 < Q()) {
                View P2 = P(i11);
                int s04 = s0(P2);
                int g12 = this.f3087u.g(P2);
                if (s04 < s02) {
                    Y2();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("detected invalid position. loc invalid? ");
                    if (g12 >= g10) {
                        z10 = false;
                    }
                    sb4.append(z10);
                    throw new RuntimeException(sb4.toString());
                } else if (g12 >= g10) {
                    i11++;
                } else {
                    Y2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public int x(RecyclerView.b0 b0Var) {
        return n2(b0Var);
    }

    public View x2(boolean z10, boolean z11) {
        int i10;
        int Q;
        if (this.f3090x) {
            i10 = Q() - 1;
            Q = -1;
        } else {
            i10 = 0;
            Q = Q();
        }
        return E2(i10, Q, z10, z11);
    }

    public int y(RecyclerView.b0 b0Var) {
        return o2(b0Var);
    }

    public int y2() {
        View E2 = E2(0, Q(), false, true);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public int z2() {
        View E2 = E2(Q() - 1, -1, true, false);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }
}
