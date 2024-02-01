package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.p;
import d.g1;
import d.j0;
import fh.g;
import fh.h;
import h0.u0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n.c;
import ve.m;
import xe.l0;
import xe.w;
import zd.k;

public class a0 extends p {
    @g

    /* renamed from: j  reason: collision with root package name */
    public static final a f2766j = new a((w) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2767b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public o.a<x, b> f2768c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public p.b f2769d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<y> f2770e;

    /* renamed from: f  reason: collision with root package name */
    public int f2771f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2772g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2773h;
    @g

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<p.b> f2774i;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        @g
        @m
        @g1
        public final a0 a(@g y yVar) {
            l0.p(yVar, "owner");
            return new a0(yVar, false, (w) null);
        }

        @g
        @m
        public final p.b b(@g p.b bVar, @h p.b bVar2) {
            l0.p(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    public static final class b {
        @g

        /* renamed from: a  reason: collision with root package name */
        public p.b f2775a;
        @g

        /* renamed from: b  reason: collision with root package name */
        public u f2776b;

        public b(@h x xVar, @g p.b bVar) {
            l0.p(bVar, "initialState");
            l0.m(xVar);
            this.f2776b = d0.f(xVar);
            this.f2775a = bVar;
        }

        public final void a(@h y yVar, @g p.a aVar) {
            l0.p(aVar, u0.f8532r0);
            p.b e10 = aVar.e();
            this.f2775a = a0.f2766j.b(this.f2775a, e10);
            u uVar = this.f2776b;
            l0.m(yVar);
            uVar.d(yVar, aVar);
            this.f2775a = e10;
        }

        @g
        public final u b() {
            return this.f2776b;
        }

        @g
        public final p.b c() {
            return this.f2775a;
        }

        public final void d(@g u uVar) {
            l0.p(uVar, "<set-?>");
            this.f2776b = uVar;
        }

        public final void e(@g p.b bVar) {
            l0.p(bVar, "<set-?>");
            this.f2775a = bVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a0(@g y yVar) {
        this(yVar, true);
        l0.p(yVar, "provider");
    }

    public a0(y yVar, boolean z10) {
        this.f2767b = z10;
        this.f2768c = new o.a<>();
        this.f2769d = p.b.INITIALIZED;
        this.f2774i = new ArrayList<>();
        this.f2770e = new WeakReference<>(yVar);
    }

    public /* synthetic */ a0(y yVar, boolean z10, w wVar) {
        this(yVar, z10);
    }

    @g
    @m
    @g1
    public static final a0 h(@g y yVar) {
        return f2766j.a(yVar);
    }

    @g
    @m
    public static final p.b o(@g p.b bVar, @h p.b bVar2) {
        return f2766j.b(bVar, bVar2);
    }

    public void a(@g x xVar) {
        y yVar;
        l0.p(xVar, "observer");
        i("addObserver");
        p.b bVar = this.f2769d;
        p.b bVar2 = p.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = p.b.INITIALIZED;
        }
        b bVar3 = new b(xVar, bVar2);
        if (this.f2768c.i(xVar, bVar3) == null && (yVar = this.f2770e.get()) != null) {
            boolean z10 = this.f2771f != 0 || this.f2772g;
            p.b g10 = g(xVar);
            this.f2771f++;
            while (bVar3.c().compareTo(g10) < 0 && this.f2768c.contains(xVar)) {
                r(bVar3.c());
                p.a c10 = p.a.Companion.c(bVar3.c());
                if (c10 != null) {
                    bVar3.a(yVar, c10);
                    q();
                    g10 = g(xVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.c());
                }
            }
            if (!z10) {
                t();
            }
            this.f2771f--;
        }
    }

    @g
    public p.b b() {
        return this.f2769d;
    }

    public void d(@g x xVar) {
        l0.p(xVar, "observer");
        i("removeObserver");
        this.f2768c.j(xVar);
    }

    public final void f(y yVar) {
        Iterator<Map.Entry<x, b>> descendingIterator = this.f2768c.descendingIterator();
        l0.o(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f2773h) {
            Map.Entry next = descendingIterator.next();
            l0.o(next, "next()");
            x xVar = (x) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.c().compareTo(this.f2769d) > 0 && !this.f2773h && this.f2768c.contains(xVar)) {
                p.a a10 = p.a.Companion.a(bVar.c());
                if (a10 != null) {
                    r(a10.e());
                    bVar.a(yVar, a10);
                    q();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.c());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.p.b g(androidx.lifecycle.x r4) {
        /*
            r3 = this;
            o.a<androidx.lifecycle.x, androidx.lifecycle.a0$b> r0 = r3.f2768c
            java.util.Map$Entry r4 = r0.l(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.a0$b r4 = (androidx.lifecycle.a0.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.p$b r4 = r4.c()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.p$b> r1 = r3.f2774i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList<androidx.lifecycle.p$b> r0 = r3.f2774i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.p$b r0 = (androidx.lifecycle.p.b) r0
        L_0x002f:
            androidx.lifecycle.a0$a r1 = f2766j
            androidx.lifecycle.p$b r2 = r3.f2769d
            androidx.lifecycle.p$b r4 = r1.b(r2, r4)
            androidx.lifecycle.p$b r4 = r1.b(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a0.g(androidx.lifecycle.x):androidx.lifecycle.p$b");
    }

    @SuppressLint({"RestrictedApi"})
    public final void i(String str) {
        if (this.f2767b && !c.h().c()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void j(y yVar) {
        o.b<K, V>.d e10 = this.f2768c.e();
        l0.o(e10, "observerMap.iteratorWithAdditions()");
        while (e10.hasNext() && !this.f2773h) {
            Map.Entry entry = (Map.Entry) e10.next();
            x xVar = (x) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.c().compareTo(this.f2769d) < 0 && !this.f2773h && this.f2768c.contains(xVar)) {
                r(bVar.c());
                p.a c10 = p.a.Companion.c(bVar.c());
                if (c10 != null) {
                    bVar.a(yVar, c10);
                    q();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.c());
                }
            }
        }
    }

    public int k() {
        i("getObserverCount");
        return this.f2768c.size();
    }

    public void l(@g p.a aVar) {
        l0.p(aVar, u0.f8532r0);
        i("handleLifecycleEvent");
        p(aVar.e());
    }

    public final boolean m() {
        if (this.f2768c.size() == 0) {
            return true;
        }
        Map.Entry<x, b> b10 = this.f2768c.b();
        l0.m(b10);
        p.b c10 = b10.getValue().c();
        Map.Entry<x, b> f10 = this.f2768c.f();
        l0.m(f10);
        p.b c11 = f10.getValue().c();
        return c10 == c11 && this.f2769d == c11;
    }

    @j0
    @k(message = "Override [currentState].")
    public void n(@g p.b bVar) {
        l0.p(bVar, "state");
        i("markState");
        s(bVar);
    }

    public final void p(p.b bVar) {
        p.b bVar2 = this.f2769d;
        if (bVar2 != bVar) {
            if ((bVar2 == p.b.INITIALIZED && bVar == p.b.DESTROYED) ? false : true) {
                this.f2769d = bVar;
                if (this.f2772g || this.f2771f != 0) {
                    this.f2773h = true;
                    return;
                }
                this.f2772g = true;
                t();
                this.f2772g = false;
                if (this.f2769d == p.b.DESTROYED) {
                    this.f2768c = new o.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f2769d + " in component " + this.f2770e.get()).toString());
        }
    }

    public final void q() {
        ArrayList<p.b> arrayList = this.f2774i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void r(p.b bVar) {
        this.f2774i.add(bVar);
    }

    public void s(@g p.b bVar) {
        l0.p(bVar, "state");
        i("setCurrentState");
        p(bVar);
    }

    public final void t() {
        y yVar = this.f2770e.get();
        if (yVar != null) {
            while (true) {
                boolean m10 = m();
                this.f2773h = false;
                if (!m10) {
                    p.b bVar = this.f2769d;
                    Map.Entry<x, b> b10 = this.f2768c.b();
                    l0.m(b10);
                    if (bVar.compareTo(b10.getValue().c()) < 0) {
                        f(yVar);
                    }
                    Map.Entry<x, b> f10 = this.f2768c.f();
                    if (!this.f2773h && f10 != null && this.f2769d.compareTo(f10.getValue().c()) > 0) {
                        j(yVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }
}
