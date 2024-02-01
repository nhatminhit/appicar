package g3;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.b0;
import d.m0;
import d.x0;
import g3.j0;
import java.util.ArrayList;
import java.util.Iterator;
import k0.l;
import y3.q;

public class o0 extends j0 {
    public static final int P0 = 1;
    public static final int Q0 = 2;
    public static final int R0 = 4;
    public static final int S0 = 8;
    public static final int T0 = 0;
    public static final int U0 = 1;
    public ArrayList<j0> K0 = new ArrayList<>();
    public boolean L0 = true;
    public int M0;
    public boolean N0 = false;
    public int O0 = 0;

    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f7822a;

        public a(j0 j0Var) {
            this.f7822a = j0Var;
        }

        public void e(@m0 j0 j0Var) {
            this.f7822a.v0();
            j0Var.o0(this);
        }
    }

    public static class b extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public o0 f7824a;

        public b(o0 o0Var) {
            this.f7824a = o0Var;
        }

        public void b(@m0 j0 j0Var) {
            o0 o0Var = this.f7824a;
            if (!o0Var.N0) {
                o0Var.F0();
                this.f7824a.N0 = true;
            }
        }

        public void e(@m0 j0 j0Var) {
            o0 o0Var = this.f7824a;
            int i10 = o0Var.M0 - 1;
            o0Var.M0 = i10;
            if (i10 == 0) {
                o0Var.N0 = false;
                o0Var.z();
            }
            j0Var.o0(this);
        }
    }

    public o0() {
    }

    @SuppressLint({"RestrictedApi"})
    public o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7717i);
        Z0(l.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public void B0(z zVar) {
        super.B0(zVar);
        this.O0 |= 4;
        if (this.K0 != null) {
            for (int i10 = 0; i10 < this.K0.size(); i10++) {
                this.K0.get(i10).B0(zVar);
            }
        }
    }

    public void C0(n0 n0Var) {
        super.C0(n0Var);
        this.O0 |= 2;
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).C0(n0Var);
        }
    }

    @m0
    public j0 F(int i10, boolean z10) {
        for (int i11 = 0; i11 < this.K0.size(); i11++) {
            this.K0.get(i11).F(i10, z10);
        }
        return super.F(i10, z10);
    }

    @m0
    public j0 G(@m0 View view, boolean z10) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).G(view, z10);
        }
        return super.G(view, z10);
    }

    public String G0(String str) {
        String G0 = super.G0(str);
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(G0);
            sb2.append("\n");
            sb2.append(this.K0.get(i10).G0(str + q.a.R));
            G0 = sb2.toString();
        }
        return G0;
    }

    @m0
    public j0 H(@m0 Class<?> cls, boolean z10) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).H(cls, z10);
        }
        return super.H(cls, z10);
    }

    @m0
    /* renamed from: H0 */
    public o0 a(@m0 j0.h hVar) {
        return (o0) super.a(hVar);
    }

    @m0
    public j0 I(@m0 String str, boolean z10) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).I(str, z10);
        }
        return super.I(str, z10);
    }

    @m0
    /* renamed from: I0 */
    public o0 d(@b0 int i10) {
        for (int i11 = 0; i11 < this.K0.size(); i11++) {
            this.K0.get(i11).d(i10);
        }
        return (o0) super.d(i10);
    }

    @m0
    /* renamed from: J0 */
    public o0 g(@m0 View view) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).g(view);
        }
        return (o0) super.g(view);
    }

    @m0
    /* renamed from: K0 */
    public o0 i(@m0 Class<?> cls) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).i(cls);
        }
        return (o0) super.i(cls);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void L(ViewGroup viewGroup) {
        super.L(viewGroup);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).L(viewGroup);
        }
    }

    @m0
    /* renamed from: L0 */
    public o0 j(@m0 String str) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).j(str);
        }
        return (o0) super.j(str);
    }

    @m0
    public o0 M0(@m0 j0 j0Var) {
        N0(j0Var);
        long j10 = this.Q;
        if (j10 >= 0) {
            j0Var.x0(j10);
        }
        if ((this.O0 & 1) != 0) {
            j0Var.z0(P());
        }
        if ((this.O0 & 2) != 0) {
            j0Var.C0(T());
        }
        if ((this.O0 & 4) != 0) {
            j0Var.B0(S());
        }
        if ((this.O0 & 8) != 0) {
            j0Var.y0(O());
        }
        return this;
    }

    public final void N0(@m0 j0 j0Var) {
        this.K0.add(j0Var);
        j0Var.f7754f0 = this;
    }

    public int O0() {
        return this.L0 ^ true ? 1 : 0;
    }

    @d.o0
    public j0 P0(int i10) {
        if (i10 < 0 || i10 >= this.K0.size()) {
            return null;
        }
        return this.K0.get(i10);
    }

    public int Q0() {
        return this.K0.size();
    }

    @m0
    /* renamed from: R0 */
    public o0 o0(@m0 j0.h hVar) {
        return (o0) super.o0(hVar);
    }

    @m0
    /* renamed from: S0 */
    public o0 p0(@b0 int i10) {
        for (int i11 = 0; i11 < this.K0.size(); i11++) {
            this.K0.get(i11).p0(i10);
        }
        return (o0) super.p0(i10);
    }

    @m0
    /* renamed from: T0 */
    public o0 q0(@m0 View view) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).q0(view);
        }
        return (o0) super.q0(view);
    }

    @m0
    /* renamed from: U0 */
    public o0 r0(@m0 Class<?> cls) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).r0(cls);
        }
        return (o0) super.r0(cls);
    }

    @m0
    /* renamed from: V0 */
    public o0 s0(@m0 String str) {
        for (int i10 = 0; i10 < this.K0.size(); i10++) {
            this.K0.get(i10).s0(str);
        }
        return (o0) super.s0(str);
    }

    @m0
    public o0 W0(@m0 j0 j0Var) {
        this.K0.remove(j0Var);
        j0Var.f7754f0 = null;
        return this;
    }

    @m0
    /* renamed from: X0 */
    public o0 x0(long j10) {
        ArrayList<j0> arrayList;
        super.x0(j10);
        if (this.Q >= 0 && (arrayList = this.K0) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K0.get(i10).x0(j10);
            }
        }
        return this;
    }

    @m0
    /* renamed from: Y0 */
    public o0 z0(@d.o0 TimeInterpolator timeInterpolator) {
        this.O0 |= 1;
        ArrayList<j0> arrayList = this.K0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.K0.get(i10).z0(timeInterpolator);
            }
        }
        return (o0) super.z0(timeInterpolator);
    }

    @m0
    public o0 Z0(int i10) {
        if (i10 == 0) {
            this.L0 = true;
        } else if (i10 == 1) {
            this.L0 = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        }
        return this;
    }

    /* renamed from: a1 */
    public o0 D0(ViewGroup viewGroup) {
        super.D0(viewGroup);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).D0(viewGroup);
        }
        return this;
    }

    @m0
    /* renamed from: b1 */
    public o0 E0(long j10) {
        return (o0) super.E0(j10);
    }

    public final void c1() {
        b bVar = new b(this);
        Iterator<j0> it = this.K0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M0 = this.K0.size();
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).cancel();
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void m0(View view) {
        super.m0(view);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).m0(view);
        }
    }

    public void q(@m0 r0 r0Var) {
        if (e0(r0Var.f7848b)) {
            Iterator<j0> it = this.K0.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (next.e0(r0Var.f7848b)) {
                    next.q(r0Var);
                    r0Var.f7849c.add(next);
                }
            }
        }
    }

    public void s(r0 r0Var) {
        super.s(r0Var);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).s(r0Var);
        }
    }

    public void t(@m0 r0 r0Var) {
        if (e0(r0Var.f7848b)) {
            Iterator<j0> it = this.K0.iterator();
            while (it.hasNext()) {
                j0 next = it.next();
                if (next.e0(r0Var.f7848b)) {
                    next.t(r0Var);
                    r0Var.f7849c.add(next);
                }
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void t0(View view) {
        super.t0(view);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).t0(view);
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void v0() {
        if (this.K0.isEmpty()) {
            F0();
            z();
            return;
        }
        c1();
        if (!this.L0) {
            for (int i10 = 1; i10 < this.K0.size(); i10++) {
                this.K0.get(i10 - 1).a(new a(this.K0.get(i10)));
            }
            j0 j0Var = this.K0.get(0);
            if (j0Var != null) {
                j0Var.v0();
                return;
            }
            return;
        }
        Iterator<j0> it = this.K0.iterator();
        while (it.hasNext()) {
            it.next().v0();
        }
    }

    /* renamed from: w */
    public j0 clone() {
        o0 o0Var = (o0) super.clone();
        o0Var.K0 = new ArrayList<>();
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0Var.N0(this.K0.get(i10).clone());
        }
        return o0Var;
    }

    public void w0(boolean z10) {
        super.w0(z10);
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).w0(z10);
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void y(ViewGroup viewGroup, s0 s0Var, s0 s0Var2, ArrayList<r0> arrayList, ArrayList<r0> arrayList2) {
        long V = V();
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0 j0Var = this.K0.get(i10);
            if (V > 0 && (this.L0 || i10 == 0)) {
                long V2 = j0Var.V();
                if (V2 > 0) {
                    j0Var.E0(V2 + V);
                } else {
                    j0Var.E0(V);
                }
            }
            j0Var.y(viewGroup, s0Var, s0Var2, arrayList, arrayList2);
        }
    }

    public void y0(j0.f fVar) {
        super.y0(fVar);
        this.O0 |= 8;
        int size = this.K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.K0.get(i10).y0(fVar);
        }
    }
}
