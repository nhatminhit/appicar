package t2;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import d.o0;
import d.x0;
import e1.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t2.e0;
import t2.z;

@x0({x0.a.LIBRARY})
public class e<K> extends e0<K> implements b0 {

    /* renamed from: m  reason: collision with root package name */
    public static final String f12790m = "DefaultSelectionTracker";

    /* renamed from: n  reason: collision with root package name */
    public static final String f12791n = "androidx.recyclerview.selection";

    /* renamed from: c  reason: collision with root package name */
    public final c0<K> f12792c = new c0<>();

    /* renamed from: d  reason: collision with root package name */
    public final List<e0.b<K>> f12793d = new ArrayList(1);

    /* renamed from: e  reason: collision with root package name */
    public final o<K> f12794e;

    /* renamed from: f  reason: collision with root package name */
    public final e0.c<K> f12795f;

    /* renamed from: g  reason: collision with root package name */
    public final h0<K> f12796g;

    /* renamed from: h  reason: collision with root package name */
    public final e<K>.b f12797h;

    /* renamed from: i  reason: collision with root package name */
    public final a f12798i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12799j;

    /* renamed from: k  reason: collision with root package name */
    public final String f12800k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public z f12801l;

    public static final class a extends RecyclerView.i {

        /* renamed from: a  reason: collision with root package name */
        public final e<?> f12802a;

        public a(@m0 e<?> eVar) {
            n.a(eVar != null);
            this.f12802a = eVar;
        }

        public void a() {
            this.f12802a.I();
        }

        public void c(int i10, int i11, @o0 Object obj) {
            if (!e0.f12805b.equals(obj)) {
                this.f12802a.I();
            }
        }

        public void d(int i10, int i11) {
            this.f12802a.h();
        }

        public void e(int i10, int i11, int i12) {
            this.f12802a.h();
        }

        public void f(int i10, int i11) {
            this.f12802a.h();
        }
    }

    public final class b extends z.a {
        public b() {
        }

        public void a(int i10, int i11, boolean z10, int i12) {
            if (i12 == 0) {
                e.this.L(i10, i11, z10);
            } else if (i12 == 1) {
                e.this.K(i10, i11, z10);
            } else {
                throw new IllegalArgumentException("Invalid range type: " + i12);
            }
        }
    }

    public e(@m0 String str, @m0 o<K> oVar, @m0 e0.c<K> cVar, @m0 h0<K> h0Var) {
        boolean z10 = false;
        n.a(str != null);
        n.a(!str.trim().isEmpty());
        n.a(oVar != null);
        n.a(cVar != null);
        n.a(h0Var != null ? true : z10);
        this.f12800k = str;
        this.f12794e = oVar;
        this.f12795f = cVar;
        this.f12796g = h0Var;
        this.f12797h = new b();
        this.f12799j = !cVar.a();
        this.f12798i = new a(this);
    }

    public final void A(int i10, int i11) {
        if (n()) {
            if (i10 == -1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring attempt to extend range to invalid position: ");
                sb2.append(i10);
                return;
            }
            this.f12801l.b(i10, i11);
            D();
        }
    }

    @g1
    public String B() {
        return "androidx.recyclerview.selection:" + this.f12800k;
    }

    public final void C(@m0 K k10, boolean z10) {
        n.a(k10 != null);
        for (int size = this.f12793d.size() - 1; size >= 0; size--) {
            this.f12793d.get(size).a(k10, z10);
        }
    }

    public final void D() {
        for (int size = this.f12793d.size() - 1; size >= 0; size--) {
            this.f12793d.get(size).b();
        }
    }

    public final void E() {
        for (e0.b<K> c10 : this.f12793d) {
            c10.c();
        }
    }

    public final void F(@m0 c0<K> c0Var) {
        for (K C : c0Var.O) {
            C(C, false);
        }
        for (K C2 : c0Var.P) {
            C(C2, false);
        }
    }

    public final void G() {
        for (int size = this.f12793d.size() - 1; size >= 0; size--) {
            this.f12793d.get(size).d();
        }
    }

    public final void H() {
        for (int size = this.f12793d.size() - 1; size >= 0; size--) {
            this.f12793d.get(size).e();
        }
    }

    public void I() {
        this.f12792c.b();
        G();
        Iterator<K> it = this.f12792c.iterator();
        ArrayList<Object> arrayList = null;
        while (it.hasNext()) {
            K next = it.next();
            if (!x(next, true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
            } else {
                for (int size = this.f12793d.size() - 1; size >= 0; size--) {
                    this.f12793d.get(size).a(next, true);
                }
            }
        }
        if (arrayList != null) {
            for (Object g10 : arrayList) {
                g(g10);
            }
        }
        D();
    }

    public final boolean J(@m0 Iterable<K> iterable, boolean z10) {
        boolean z11 = false;
        for (K next : iterable) {
            boolean z12 = true;
            if (!z10 ? !x(next, false) || !this.f12792c.remove(next) : !x(next, true) || !this.f12792c.add(next)) {
                z12 = false;
            }
            if (z12) {
                C(next, z10);
            }
            z11 |= z12;
        }
        return z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r6 < r5) goto L_0x0006
            r2 = r1
            goto L_0x0007
        L_0x0006:
            r2 = r0
        L_0x0007:
            e1.n.a(r2)
        L_0x000a:
            if (r5 > r6) goto L_0x0041
            t2.o<K> r2 = r4.f12794e
            java.lang.Object r2 = r2.a(r5)
            if (r2 != 0) goto L_0x0015
            goto L_0x003e
        L_0x0015:
            if (r7 == 0) goto L_0x0031
            boolean r3 = r4.x(r2, r1)
            if (r3 == 0) goto L_0x002f
            t2.c0<K> r3 = r4.f12792c
            java.util.Set<K> r3 = r3.O
            boolean r3 = r3.contains(r2)
            if (r3 != 0) goto L_0x002f
            t2.c0<K> r3 = r4.f12792c
            java.util.Set<K> r3 = r3.P
            r3.add(r2)
            goto L_0x0038
        L_0x002f:
            r3 = r0
            goto L_0x0039
        L_0x0031:
            t2.c0<K> r3 = r4.f12792c
            java.util.Set<K> r3 = r3.P
            r3.remove(r2)
        L_0x0038:
            r3 = r1
        L_0x0039:
            if (r3 == 0) goto L_0x003e
            r4.C(r2, r7)
        L_0x003e:
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0041:
            r4.D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.e.K(int, int, boolean):void");
    }

    public void L(int i10, int i11, boolean z10) {
        n.a(i11 >= i10);
        while (i10 <= i11) {
            K a10 = this.f12794e.a(i10);
            if (a10 != null) {
                if (z10) {
                    t(a10);
                } else {
                    g(a10);
                }
            }
            i10++;
        }
    }

    public void a(@m0 e0.b<K> bVar) {
        n.a(bVar != null);
        this.f12793d.add(bVar);
    }

    public boolean b() {
        return m() || n();
    }

    public void c(int i10) {
        n.a(i10 != -1);
        n.a(this.f12792c.contains(this.f12794e.a(i10)));
        this.f12801l = new z(i10, this.f12797h);
    }

    public void d() {
        for (K C : this.f12792c.P) {
            C(C, false);
        }
        this.f12792c.b();
    }

    public boolean e() {
        if (!m()) {
            return false;
        }
        d();
        y();
        E();
        return true;
    }

    public void f(@m0 s<K> sVar) {
        sVar.c(this.f12792c);
    }

    public boolean g(@m0 K k10) {
        n.a(k10 != null);
        if (!this.f12792c.contains(k10) || !x(k10, false)) {
            return false;
        }
        this.f12792c.remove(k10);
        C(k10, false);
        D();
        if (this.f12792c.isEmpty() && n()) {
            h();
        }
        return true;
    }

    public void h() {
        this.f12801l = null;
        d();
    }

    public void i(int i10) {
        if (!this.f12799j) {
            A(i10, 1);
        }
    }

    public void j(int i10) {
        A(i10, 0);
    }

    @m0
    public RecyclerView.i k() {
        return this.f12798i;
    }

    @m0
    public c0<K> l() {
        return this.f12792c;
    }

    public boolean m() {
        return !this.f12792c.isEmpty();
    }

    public boolean n() {
        return this.f12801l != null;
    }

    public boolean o(@o0 K k10) {
        return this.f12792c.contains(k10);
    }

    public void p() {
        this.f12792c.f();
        D();
    }

    public final void q(@o0 Bundle bundle) {
        Bundle bundle2;
        c0<K> b10;
        if (bundle != null && (bundle2 = bundle.getBundle(B())) != null && (b10 = this.f12796g.b(bundle2)) != null && !b10.isEmpty()) {
            s(b10);
        }
    }

    public final void r(@m0 Bundle bundle) {
        if (!this.f12792c.isEmpty()) {
            bundle.putBundle(B(), this.f12796g.a(this.f12792c));
        }
    }

    public void reset() {
        e();
        this.f12801l = null;
    }

    public void s(@m0 c0<K> c0Var) {
        n.a(c0Var != null);
        J(c0Var.O, true);
        H();
    }

    public boolean t(@m0 K k10) {
        n.a(k10 != null);
        if (this.f12792c.contains(k10) || !x(k10, true)) {
            return false;
        }
        if (this.f12799j && m()) {
            F(z());
        }
        this.f12792c.add(k10);
        C(k10, true);
        D();
        return true;
    }

    public boolean u(@m0 Iterable<K> iterable, boolean z10) {
        boolean J = J(iterable, z10);
        D();
        return J;
    }

    public void v(@m0 Set<K> set) {
        if (!this.f12799j) {
            for (Map.Entry next : this.f12792c.h(set).entrySet()) {
                C(next.getKey(), ((Boolean) next.getValue()).booleanValue());
            }
            D();
        }
    }

    public void w(int i10) {
        if (this.f12792c.contains(this.f12794e.a(i10)) || t(this.f12794e.a(i10))) {
            c(i10);
        }
    }

    public final boolean x(@m0 K k10, boolean z10) {
        return this.f12795f.c(k10, z10);
    }

    public final void y() {
        if (m()) {
            F(z());
            D();
        }
    }

    public final c0<K> z() {
        this.f12801l = null;
        s sVar = new s();
        if (m()) {
            f(sVar);
            this.f12792c.clear();
        }
        return sVar;
    }
}
