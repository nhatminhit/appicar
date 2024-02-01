package t2;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import e1.n;
import f1.w1;
import t2.e0;

public final class l implements RecyclerView.s, b0 {

    /* renamed from: g  reason: collision with root package name */
    public static final String f12853g = "GestureSelectionHelper";

    /* renamed from: a  reason: collision with root package name */
    public final e0<?> f12854a;

    /* renamed from: b  reason: collision with root package name */
    public final e0.c<?> f12855b;

    /* renamed from: c  reason: collision with root package name */
    public final a f12856c;

    /* renamed from: d  reason: collision with root package name */
    public final b f12857d;

    /* renamed from: e  reason: collision with root package name */
    public final w f12858e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12859f = false;

    @g1
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f12860a;

        public a(@m0 RecyclerView recyclerView) {
            n.a(recyclerView != null);
            this.f12860a = recyclerView;
        }

        @g1
        public static boolean d(int i10, int i11, int i12, @m0 MotionEvent motionEvent, int i13) {
            return i13 == 0 ? motionEvent.getX() > ((float) i12) && motionEvent.getY() > ((float) i10) : motionEvent.getX() < ((float) i11) && motionEvent.getY() > ((float) i10);
        }

        public int a() {
            return this.f12860a.getHeight();
        }

        public int b(@m0 MotionEvent motionEvent) {
            View Z = this.f12860a.Z(motionEvent.getX(), motionEvent.getY());
            if (Z != null) {
                return this.f12860a.o0(Z);
            }
            return -1;
        }

        public int c(@m0 MotionEvent motionEvent) {
            View P = this.f12860a.getLayoutManager().P(this.f12860a.getLayoutManager().Q() - 1);
            boolean d10 = d(P.getTop(), P.getLeft(), P.getRight(), motionEvent, w1.X(this.f12860a));
            float h10 = l.h((float) this.f12860a.getHeight(), motionEvent.getY());
            if (d10) {
                return this.f12860a.getAdapter().e() - 1;
            }
            RecyclerView recyclerView = this.f12860a;
            return recyclerView.o0(recyclerView.Z(motionEvent.getX(), h10));
        }
    }

    @g1
    public static abstract class b {
        public abstract int a();

        public abstract int b(@m0 MotionEvent motionEvent);

        public abstract int c(@m0 MotionEvent motionEvent);
    }

    public l(@m0 e0<?> e0Var, @m0 e0.c<?> cVar, @m0 b bVar, @m0 a aVar, @m0 w wVar) {
        boolean z10 = false;
        n.a(e0Var != null);
        n.a(cVar != null);
        n.a(bVar != null);
        n.a(aVar != null);
        n.a(wVar != null ? true : z10);
        this.f12854a = e0Var;
        this.f12855b = cVar;
        this.f12857d = bVar;
        this.f12856c = aVar;
        this.f12858e = wVar;
    }

    public static l d(@m0 e0<?> e0Var, @m0 e0.c<?> cVar, @m0 RecyclerView recyclerView, @m0 a aVar, @m0 w wVar) {
        return new l(e0Var, cVar, new a(recyclerView), aVar, wVar);
    }

    public static float h(float f10, float f11) {
        if (f11 < 0.0f) {
            return 0.0f;
        }
        return f11 > f10 ? f10 : f11;
    }

    public void a(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        if (this.f12859f) {
            if (!this.f12854a.n()) {
                f();
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                j();
            } else if (actionMasked == 2) {
                i(motionEvent);
            }
        }
    }

    public boolean b() {
        return this.f12859f;
    }

    public boolean c(@m0 RecyclerView recyclerView, @m0 MotionEvent motionEvent) {
        if (this.f12859f) {
            a(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 2) {
            return this.f12859f;
        }
        return false;
    }

    public void e(boolean z10) {
    }

    public final void f() {
        this.f12859f = false;
        this.f12856c.a();
        this.f12858e.j();
    }

    public final void g(int i10) {
        this.f12854a.i(i10);
    }

    public final void i(@m0 MotionEvent motionEvent) {
        int c10 = this.f12857d.c(motionEvent);
        if (this.f12855b.b(c10, true)) {
            g(c10);
        }
        this.f12856c.b(p.a(motionEvent));
    }

    public final void j() {
        this.f12854a.p();
        f();
    }

    public void k() {
        if (!this.f12859f) {
            this.f12859f = true;
            this.f12858e.i();
        }
    }

    public void reset() {
        this.f12859f = false;
        this.f12856c.a();
    }
}
