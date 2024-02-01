package t2;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import d.u;
import e1.n;
import java.util.Set;
import t2.e0;
import t2.m;

public class c<K> implements RecyclerView.s, b0 {

    /* renamed from: l  reason: collision with root package name */
    public static final String f12769l = "BandSelectionHelper";

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f12770m = false;

    /* renamed from: a  reason: collision with root package name */
    public final C0215c<K> f12771a;

    /* renamed from: b  reason: collision with root package name */
    public final o<K> f12772b;

    /* renamed from: c  reason: collision with root package name */
    public final e0<K> f12773c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12774d;

    /* renamed from: e  reason: collision with root package name */
    public final i<K> f12775e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12776f;

    /* renamed from: g  reason: collision with root package name */
    public final a f12777g;

    /* renamed from: h  reason: collision with root package name */
    public final m.f<K> f12778h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public Point f12779i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public Point f12780j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public m<K> f12781k;

    public class a extends RecyclerView.t {
        public a() {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            c.this.h(recyclerView, i10, i11);
        }
    }

    public class b extends m.f<K> {
        public b() {
        }

        public void a(Set<K> set) {
            c.this.f12773c.v(set);
        }
    }

    /* renamed from: t2.c$c  reason: collision with other inner class name */
    public static abstract class C0215c<K> {
        public abstract void a(@m0 RecyclerView.t tVar);

        public abstract m<K> b();

        public abstract void c();

        public abstract void d(@m0 Rect rect);
    }

    public c(@m0 C0215c<K> cVar, @m0 a aVar, @m0 o<K> oVar, @m0 e0<K> e0Var, @m0 b bVar, @m0 i<K> iVar, @m0 w wVar) {
        boolean z10 = true;
        n.a(cVar != null);
        n.a(aVar != null);
        n.a(oVar != null);
        n.a(e0Var != null);
        n.a(bVar != null);
        n.a(iVar != null);
        n.a(wVar == null ? false : z10);
        this.f12771a = cVar;
        this.f12772b = oVar;
        this.f12773c = e0Var;
        this.f12774d = bVar;
        this.f12775e = iVar;
        this.f12776f = wVar;
        cVar.a(new a());
        this.f12777g = aVar;
        this.f12778h = new b();
    }

    public static <K> c<K> d(@m0 RecyclerView recyclerView, @m0 a aVar, @u int i10, @m0 o<K> oVar, @m0 e0<K> e0Var, @m0 e0.c<K> cVar, @m0 b bVar, @m0 i<K> iVar, @m0 w wVar) {
        RecyclerView recyclerView2 = recyclerView;
        int i11 = i10;
        e0.c<K> cVar2 = cVar;
        return new c(new d(recyclerView, i10, oVar, cVar), aVar, oVar, e0Var, bVar, iVar, wVar);
    }

    public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        if (k(motionEvent)) {
            f();
        } else if (g()) {
            Point a10 = p.a(motionEvent);
            this.f12779i = a10;
            this.f12781k.u(a10);
            i();
            this.f12777g.b(this.f12779i);
        }
    }

    public boolean b() {
        return g();
    }

    public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        if (j(motionEvent)) {
            l(motionEvent);
        } else if (k(motionEvent)) {
            f();
        }
        return g();
    }

    public void e(boolean z10) {
    }

    public final void f() {
        int j10 = this.f12781k.j();
        if (j10 != -1 && this.f12773c.o(this.f12772b.a(j10))) {
            this.f12773c.c(j10);
        }
        this.f12773c.p();
        this.f12776f.j();
        this.f12771a.c();
        m<K> mVar = this.f12781k;
        if (mVar != null) {
            mVar.w();
            this.f12781k.p();
        }
        this.f12781k = null;
        this.f12780j = null;
        this.f12777g.a();
    }

    public final boolean g() {
        return this.f12781k != null;
    }

    public void h(@m0 RecyclerView recyclerView, int i10, int i11) {
        if (g()) {
            this.f12780j.y -= i11;
            i();
        }
    }

    public final void i() {
        this.f12771a.d(new Rect(Math.min(this.f12780j.x, this.f12779i.x), Math.min(this.f12780j.y, this.f12779i.y), Math.max(this.f12780j.x, this.f12779i.x), Math.max(this.f12780j.y, this.f12779i.y)));
    }

    public final boolean j(@m0 MotionEvent motionEvent) {
        return p.o(motionEvent) && p.e(motionEvent) && this.f12774d.a(motionEvent) && !g();
    }

    public final boolean k(@m0 MotionEvent motionEvent) {
        return g() && p.h(motionEvent);
    }

    public final void l(@m0 MotionEvent motionEvent) {
        if (!p.k(motionEvent)) {
            this.f12773c.e();
        }
        Point a10 = p.a(motionEvent);
        m<K> b10 = this.f12771a.b();
        this.f12781k = b10;
        b10.a(this.f12778h);
        this.f12776f.i();
        this.f12775e.a();
        this.f12780j = a10;
        this.f12781k.v(a10);
    }

    public void reset() {
        if (g()) {
            this.f12771a.c();
            m<K> mVar = this.f12781k;
            if (mVar != null) {
                mVar.w();
                this.f12781k.p();
            }
            this.f12781k = null;
            this.f12780j = null;
            this.f12777g.a();
        }
    }
}
