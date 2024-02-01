package c6;

import android.view.Surface;
import b6.i;
import b6.l0;
import b6.n0;
import b6.x0;
import b7.i0;
import b7.y;
import c6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import d6.k;
import d6.t;
import g6.e;
import h6.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q7.m;
import t7.d;
import u6.d;
import x7.h;
import x7.q;

public class a implements n0.d, d, t, q, i0, d.a, j, h, k {
    public final CopyOnWriteArraySet<c> O;
    public final w7.c P;
    public final x0.c Q;
    public final c R;
    public n0 S;

    /* renamed from: c6.a$a  reason: collision with other inner class name */
    public static class C0077a {
        public a a(@o0 n0 n0Var, w7.c cVar) {
            return new a(n0Var, cVar);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final y.a f4872a;

        /* renamed from: b  reason: collision with root package name */
        public final x0 f4873b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4874c;

        public b(y.a aVar, x0 x0Var, int i10) {
            this.f4872a = aVar;
            this.f4873b = x0Var;
            this.f4874c = i10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<b> f4875a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<y.a, b> f4876b = new HashMap<>();

        /* renamed from: c  reason: collision with root package name */
        public final x0.b f4877c = new x0.b();
        @o0

        /* renamed from: d  reason: collision with root package name */
        public b f4878d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public b f4879e;

        /* renamed from: f  reason: collision with root package name */
        public x0 f4880f = x0.f4491a;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4881g;

        @o0
        public b b() {
            return this.f4878d;
        }

        @o0
        public b c() {
            if (this.f4875a.isEmpty()) {
                return null;
            }
            ArrayList<b> arrayList = this.f4875a;
            return arrayList.get(arrayList.size() - 1);
        }

        @o0
        public b d(y.a aVar) {
            return this.f4876b.get(aVar);
        }

        @o0
        public b e() {
            if (this.f4875a.isEmpty() || this.f4880f.r() || this.f4881g) {
                return null;
            }
            return this.f4875a.get(0);
        }

        @o0
        public b f() {
            return this.f4879e;
        }

        public boolean g() {
            return this.f4881g;
        }

        public void h(int i10, y.a aVar) {
            b bVar = new b(aVar, this.f4880f.b(aVar.f4733a) != -1 ? this.f4880f : x0.f4491a, i10);
            this.f4875a.add(bVar);
            this.f4876b.put(aVar, bVar);
            if (this.f4875a.size() == 1 && !this.f4880f.r()) {
                p();
            }
        }

        public boolean i(y.a aVar) {
            b remove = this.f4876b.remove(aVar);
            if (remove == null) {
                return false;
            }
            this.f4875a.remove(remove);
            b bVar = this.f4879e;
            if (bVar == null || !aVar.equals(bVar.f4872a)) {
                return true;
            }
            this.f4879e = this.f4875a.isEmpty() ? null : this.f4875a.get(0);
            return true;
        }

        public void j(int i10) {
            p();
        }

        public void k(y.a aVar) {
            this.f4879e = this.f4876b.get(aVar);
        }

        public void l() {
            this.f4881g = false;
            p();
        }

        public void m() {
            this.f4881g = true;
        }

        public void n(x0 x0Var) {
            for (int i10 = 0; i10 < this.f4875a.size(); i10++) {
                b q10 = q(this.f4875a.get(i10), x0Var);
                this.f4875a.set(i10, q10);
                this.f4876b.put(q10.f4872a, q10);
            }
            b bVar = this.f4879e;
            if (bVar != null) {
                this.f4879e = q(bVar, x0Var);
            }
            this.f4880f = x0Var;
            p();
        }

        @o0
        public b o(int i10) {
            b bVar = null;
            for (int i11 = 0; i11 < this.f4875a.size(); i11++) {
                b bVar2 = this.f4875a.get(i11);
                int b10 = this.f4880f.b(bVar2.f4872a.f4733a);
                if (b10 != -1 && this.f4880f.f(b10, this.f4877c).f4494c == i10) {
                    if (bVar != null) {
                        return null;
                    }
                    bVar = bVar2;
                }
            }
            return bVar;
        }

        public final void p() {
            if (!this.f4875a.isEmpty()) {
                this.f4878d = this.f4875a.get(0);
            }
        }

        public final b q(b bVar, x0 x0Var) {
            int b10 = x0Var.b(bVar.f4872a.f4733a);
            if (b10 == -1) {
                return bVar;
            }
            return new b(bVar.f4872a, x0Var, x0Var.f(b10, this.f4877c).f4494c);
        }
    }

    public a(@o0 n0 n0Var, w7.c cVar) {
        if (n0Var != null) {
            this.S = n0Var;
        }
        this.P = (w7.c) w7.a.g(cVar);
        this.O = new CopyOnWriteArraySet<>();
        this.R = new c();
        this.Q = new x0.c();
    }

    public final void A(boolean z10, int i10) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().A(Y, z10, i10);
        }
    }

    public final void B(e eVar) {
        c.a V = V();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().q(V, 1, eVar);
        }
    }

    public final void C(int i10) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().l(Y, i10);
        }
    }

    public final void D(e eVar) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().G(Y, 1, eVar);
        }
    }

    public final void E(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().a(X, bVar, cVar);
        }
    }

    public final void F() {
    }

    public final void G(Format format) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().i(Z, 2, format);
        }
    }

    public final void H(Format format) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().i(Z, 1, format);
        }
    }

    public final void I(e eVar) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().G(Y, 2, eVar);
        }
    }

    public final void J(int i10, long j10, long j11) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().d(Z, i10, j10, j11);
        }
    }

    public final void K(TrackGroupArray trackGroupArray, m mVar) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().r(Y, trackGroupArray, mVar);
        }
    }

    public final void L() {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().H(Z);
        }
    }

    public final void M(int i10, y.a aVar) {
        this.R.h(i10, aVar);
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().v(X);
        }
    }

    public final void N(i iVar) {
        c.a W = iVar.O == 0 ? W() : Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().u(W, iVar);
        }
    }

    public void O(int i10, int i11) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().s(Z, i10, i11);
        }
    }

    public final void P(int i10, @o0 y.a aVar, i0.c cVar) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().N(X, cVar);
        }
    }

    public final void Q() {
        c.a V = V();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().y(V);
        }
    }

    public final void R() {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().C(Z);
        }
    }

    public void S(c cVar) {
        this.O.add(cVar);
    }

    @RequiresNonNull({"player"})
    public c.a T(x0 x0Var, int i10, @o0 y.a aVar) {
        if (x0Var.r()) {
            aVar = null;
        }
        y.a aVar2 = aVar;
        long a10 = this.P.a();
        boolean z10 = true;
        boolean z11 = x0Var == this.S.t0() && i10 == this.S.Q();
        long j10 = 0;
        if (aVar2 != null && aVar2.b()) {
            if (!(z11 && this.S.m0() == aVar2.f4734b && this.S.G() == aVar2.f4735c)) {
                z10 = false;
            }
            if (z10) {
                j10 = this.S.getCurrentPosition();
            }
        } else if (z11) {
            j10 = this.S.a0();
        } else if (!x0Var.r()) {
            j10 = x0Var.n(i10, this.Q).a();
        }
        return new c.a(a10, x0Var, i10, aVar2, j10, this.S.getCurrentPosition(), this.S.o());
    }

    public final c.a U(@o0 b bVar) {
        w7.a.g(this.S);
        if (bVar == null) {
            int Q2 = this.S.Q();
            b o10 = this.R.o(Q2);
            if (o10 == null) {
                x0 t02 = this.S.t0();
                if (!(Q2 < t02.q())) {
                    t02 = x0.f4491a;
                }
                return T(t02, Q2, (y.a) null);
            }
            bVar = o10;
        }
        return T(bVar.f4873b, bVar.f4874c, bVar.f4872a);
    }

    public final c.a V() {
        return U(this.R.b());
    }

    public final c.a W() {
        return U(this.R.c());
    }

    public final c.a X(int i10, @o0 y.a aVar) {
        w7.a.g(this.S);
        if (aVar != null) {
            b d10 = this.R.d(aVar);
            return d10 != null ? U(d10) : T(x0.f4491a, i10, aVar);
        }
        x0 t02 = this.S.t0();
        if (!(i10 < t02.q())) {
            t02 = x0.f4491a;
        }
        return T(t02, i10, (y.a) null);
    }

    public final c.a Y() {
        return U(this.R.e());
    }

    public final c.a Z() {
        return U(this.R.f());
    }

    public final void a(int i10) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().B(Z, i10);
        }
    }

    public Set<c> a0() {
        return Collections.unmodifiableSet(this.O);
    }

    public final void b(l0 l0Var) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().h(Y, l0Var);
        }
    }

    public final void b0() {
        if (!this.R.g()) {
            c.a Y = Y();
            this.R.m();
            Iterator<c> it = this.O.iterator();
            while (it.hasNext()) {
                it.next().E(Y);
            }
        }
    }

    public final void c(int i10, int i11, int i12, float f10) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().F(Z, i10, i11, i12, f10);
        }
    }

    public void c0(c cVar) {
        this.O.remove(cVar);
    }

    public final void d(boolean z10) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().g(Y, z10);
        }
    }

    public final void d0() {
        for (b bVar : new ArrayList(this.R.f4875a)) {
            h(bVar.f4874c, bVar.f4872a);
        }
    }

    public final void e(int i10) {
        this.R.j(i10);
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().j(Y, i10);
        }
    }

    public void e0(n0 n0Var) {
        w7.a.i(this.S == null || this.R.f4875a.isEmpty());
        this.S = (n0) w7.a.g(n0Var);
    }

    public final void f(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().L(X, bVar, cVar);
        }
    }

    public final void g(String str, long j10, long j11) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().c(Z, 2, str, j11);
        }
    }

    public final void h(int i10, y.a aVar) {
        c.a X = X(i10, aVar);
        if (this.R.i(aVar)) {
            Iterator<c> it = this.O.iterator();
            while (it.hasNext()) {
                it.next().o(X);
            }
        }
    }

    public final void i() {
        if (this.R.g()) {
            this.R.l();
            c.a Y = Y();
            Iterator<c> it = this.O.iterator();
            while (it.hasNext()) {
                it.next().k(Y);
            }
        }
    }

    public final void j(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().n(X, bVar, cVar);
        }
    }

    public final void k(x0 x0Var, @o0 Object obj, int i10) {
        this.R.n(x0Var);
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().t(Y, i10);
        }
    }

    public final void l() {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().z(Z);
        }
    }

    public void m(float f10) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().f(Z, f10);
        }
    }

    public final void n(Exception exc) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().K(Z, exc);
        }
    }

    public final void o(int i10, y.a aVar) {
        this.R.k(aVar);
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().b(X);
        }
    }

    public final void p(@o0 Surface surface) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().I(Z, surface);
        }
    }

    public final void q(int i10, long j10, long j11) {
        c.a W = W();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().e(W, i10, j10, j11);
        }
    }

    public void r(d6.c cVar) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().J(Z, cVar);
        }
    }

    public final void s(String str, long j10, long j11) {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().c(Z, 1, str, j11);
        }
    }

    public final void t(boolean z10) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().x(Y, z10);
        }
    }

    public final void u(Metadata metadata) {
        c.a Y = Y();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().M(Y, metadata);
        }
    }

    public final void v(int i10, @o0 y.a aVar, i0.c cVar) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().w(X, cVar);
        }
    }

    public final void w(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
        c.a X = X(i10, aVar);
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().p(X, bVar, cVar, iOException, z10);
        }
    }

    public final void x() {
        c.a Z = Z();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().m(Z);
        }
    }

    public final void y(e eVar) {
        c.a V = V();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().q(V, 2, eVar);
        }
    }

    public final void z(int i10, long j10) {
        c.a V = V();
        Iterator<c> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().D(V, i10, j10);
        }
    }
}
