package t2;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import java.util.Set;
import t2.b;
import t2.n;
import t2.y;

public abstract class e0<K> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12804a = "SelectionTracker";

    /* renamed from: b  reason: collision with root package name */
    public static final String f12805b = "Selection-Changed";

    public static final class a<K> {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f12806a;

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView.g<?> f12807b;

        /* renamed from: c  reason: collision with root package name */
        public final Context f12808c;

        /* renamed from: d  reason: collision with root package name */
        public final String f12809d;

        /* renamed from: e  reason: collision with root package name */
        public final h0<K> f12810e;

        /* renamed from: f  reason: collision with root package name */
        public c<K> f12811f = d0.a();

        /* renamed from: g  reason: collision with root package name */
        public w f12812g = new w();

        /* renamed from: h  reason: collision with root package name */
        public o<K> f12813h;

        /* renamed from: i  reason: collision with root package name */
        public n<K> f12814i;

        /* renamed from: j  reason: collision with root package name */
        public i<K> f12815j = i.b();

        /* renamed from: k  reason: collision with root package name */
        public v<K> f12816k;

        /* renamed from: l  reason: collision with root package name */
        public u f12817l;

        /* renamed from: m  reason: collision with root package name */
        public t f12818m;

        /* renamed from: n  reason: collision with root package name */
        public b f12819n;

        /* renamed from: o  reason: collision with root package name */
        public int f12820o = y.a.selection_band_overlay;

        /* renamed from: p  reason: collision with root package name */
        public int[] f12821p;

        /* renamed from: q  reason: collision with root package name */
        public int[] f12822q;

        /* renamed from: t2.e0$a$a  reason: collision with other inner class name */
        public class C0216a implements u {
            public C0216a() {
            }

            public boolean a(@m0 MotionEvent motionEvent) {
                return false;
            }
        }

        public class b implements v<K> {
            public b() {
            }

            public boolean a(@m0 n.a<K> aVar, @m0 MotionEvent motionEvent) {
                return false;
            }
        }

        public class c implements t {
            public c() {
            }

            public boolean onContextClick(@m0 MotionEvent motionEvent) {
                return false;
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ l O;

            public d(l lVar) {
                this.O = lVar;
            }

            public void run() {
                if (a.this.f12811f.a()) {
                    this.O.k();
                }
            }
        }

        public class e implements Runnable {
            public e() {
            }

            public void run() {
                a.this.f12806a.performHapticFeedback(0);
            }
        }

        public a(@m0 String str, @m0 RecyclerView recyclerView, @m0 o<K> oVar, @m0 n<K> nVar, @m0 h0<K> h0Var) {
            boolean z10 = true;
            this.f12821p = new int[]{1};
            this.f12822q = new int[]{3};
            e1.n.a(str != null);
            e1.n.a(!str.trim().isEmpty());
            e1.n.a(recyclerView != null);
            this.f12809d = str;
            this.f12806a = recyclerView;
            this.f12808c = recyclerView.getContext();
            RecyclerView.g<?> adapter = recyclerView.getAdapter();
            this.f12807b = adapter;
            e1.n.a(adapter != null);
            e1.n.a(oVar != null);
            e1.n.a(nVar != null);
            e1.n.a(h0Var == null ? false : z10);
            this.f12814i = nVar;
            this.f12813h = oVar;
            this.f12810e = h0Var;
            this.f12819n = new b.C0214b(recyclerView, nVar);
        }

        @m0
        public e0<K> a() {
            e eVar = new e(this.f12809d, this.f12813h, this.f12811f, this.f12810e);
            g.a(this.f12807b, eVar, this.f12813h);
            k0 k0Var = new k0(k0.e(this.f12806a));
            k kVar = new k();
            GestureDetector gestureDetector = new GestureDetector(this.f12808c, kVar);
            l d10 = l.d(eVar, this.f12811f, this.f12806a, k0Var, this.f12812g);
            h hVar = new h();
            this.f12806a.q(hVar);
            this.f12806a.q(new j(gestureDetector));
            a0 a0Var = new a0();
            eVar.a(a0Var.d());
            hVar.b(0, a0Var.c());
            a0Var.a(eVar);
            a0Var.a(this.f12812g.b());
            a0Var.a(d10);
            u uVar = this.f12817l;
            if (uVar == null) {
                uVar = new C0216a();
            }
            this.f12817l = uVar;
            v<K> vVar = this.f12816k;
            if (vVar == null) {
                vVar = new b();
            }
            this.f12816k = vVar;
            t tVar = this.f12818m;
            if (tVar == null) {
                tVar = new c();
            }
            this.f12818m = tVar;
            k0 k0Var2 = k0Var;
            j0 j0Var = r1;
            a0 a0Var2 = a0Var;
            j0 j0Var2 = new j0(eVar, this.f12813h, this.f12814i, this.f12811f, new d(d10), this.f12817l, this.f12816k, this.f12815j, new e());
            for (int i10 : this.f12821p) {
                kVar.a(i10, j0Var);
                hVar.b(i10, d10);
            }
            r rVar = new r(eVar, this.f12813h, this.f12814i, this.f12818m, this.f12816k, this.f12815j);
            for (int a10 : this.f12822q) {
                kVar.a(a10, rVar);
            }
            c<K> cVar = null;
            if (this.f12813h.c(0) && this.f12811f.a()) {
                cVar = c.d(this.f12806a, k0Var2, this.f12820o, this.f12813h, eVar, this.f12811f, this.f12819n, this.f12815j, this.f12812g);
                a0Var2.a(cVar);
            }
            hVar.b(3, new x(this.f12814i, this.f12817l, cVar));
            return eVar;
        }

        @m0
        public a<K> b(@u int i10) {
            this.f12820o = i10;
            return this;
        }

        @m0
        public a<K> c(@m0 b bVar) {
            this.f12819n = bVar;
            return this;
        }

        @m0
        public a<K> d(@m0 i<K> iVar) {
            e1.n.a(iVar != null);
            this.f12815j = iVar;
            return this;
        }

        @Deprecated
        @m0
        public a<K> e(@m0 int... iArr) {
            this.f12821p = iArr;
            return this;
        }

        @m0
        public a<K> f(@m0 t tVar) {
            e1.n.a(tVar != null);
            this.f12818m = tVar;
            return this;
        }

        @m0
        public a<K> g(@m0 u uVar) {
            e1.n.a(uVar != null);
            this.f12817l = uVar;
            return this;
        }

        @m0
        public a<K> h(@m0 v<K> vVar) {
            e1.n.a(vVar != null);
            this.f12816k = vVar;
            return this;
        }

        @m0
        public a<K> i(@m0 w wVar) {
            e1.n.a(wVar != null);
            this.f12812g = wVar;
            return this;
        }

        @Deprecated
        @m0
        public a<K> j(@m0 int... iArr) {
            this.f12822q = iArr;
            return this;
        }

        @m0
        public a<K> k(@m0 c<K> cVar) {
            e1.n.a(cVar != null);
            this.f12811f = cVar;
            return this;
        }
    }

    public static abstract class b<K> {
        public void a(@m0 K k10, boolean z10) {
        }

        public void b() {
        }

        @x0({x0.a.LIBRARY})
        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static abstract class c<K> {
        public abstract boolean a();

        public abstract boolean b(int i10, boolean z10);

        public abstract boolean c(@m0 K k10, boolean z10);
    }

    public abstract void a(@m0 b<K> bVar);

    @x0({x0.a.LIBRARY})
    public abstract void c(int i10);

    @x0({x0.a.LIBRARY})
    public abstract void d();

    public abstract boolean e();

    public abstract void f(@m0 s<K> sVar);

    public abstract boolean g(@m0 K k10);

    @x0({x0.a.LIBRARY})
    public abstract void h();

    @x0({x0.a.LIBRARY})
    public abstract void i(int i10);

    @x0({x0.a.LIBRARY})
    public abstract void j(int i10);

    @x0({x0.a.LIBRARY})
    @m0
    public abstract RecyclerView.i k();

    @m0
    public abstract c0<K> l();

    public abstract boolean m();

    @x0({x0.a.LIBRARY})
    public abstract boolean n();

    public abstract boolean o(@o0 K k10);

    @x0({x0.a.LIBRARY})
    public abstract void p();

    public abstract void q(@o0 Bundle bundle);

    public abstract void r(@m0 Bundle bundle);

    public abstract void s(@m0 c0<K> c0Var);

    public abstract boolean t(@m0 K k10);

    public abstract boolean u(@m0 Iterable<K> iterable, boolean z10);

    @x0({x0.a.LIBRARY})
    public abstract void v(@m0 Set<K> set);

    @x0({x0.a.LIBRARY})
    public abstract void w(int i10);
}
