package t2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import d.m0;
import d.o0;
import e1.n;
import t2.n;

public abstract class q<K> extends GestureDetector.SimpleOnGestureListener {
    public final e0<K> O;
    public final o<K> P;
    public final i<K> Q;

    public q(@m0 e0<K> e0Var, @m0 o<K> oVar, @m0 i<K> iVar) {
        boolean z10 = true;
        n.a(e0Var != null);
        n.a(oVar != null);
        n.a(iVar == null ? false : z10);
        this.O = e0Var;
        this.P = oVar;
        this.Q = iVar;
    }

    public static boolean c(@o0 n.a<?> aVar) {
        return (aVar == null || aVar.a() == -1) ? false : true;
    }

    public static boolean d(@o0 n.a<?> aVar) {
        return (aVar == null || aVar.b() == null) ? false : true;
    }

    public final void a(@m0 n.a<K> aVar) {
        e1.n.i(this.P.c(0));
        e1.n.a(c(aVar));
        e1.n.a(d(aVar));
        this.O.j(aVar.a());
        this.Q.c(aVar);
    }

    public final boolean b(@m0 n.a<K> aVar) {
        e1.n.a(aVar != null);
        e1.n.a(d(aVar));
        this.O.e();
        this.Q.c(aVar);
        return true;
    }

    public final boolean e(@m0 n.a<K> aVar) {
        e1.n.a(aVar != null);
        e1.n.a(c(aVar));
        e1.n.a(d(aVar));
        if (this.O.t(aVar.b())) {
            this.O.c(aVar.a());
        }
        if (this.O.l().size() == 1) {
            this.Q.c(aVar);
        } else {
            this.Q.a();
        }
        return true;
    }

    public boolean f(@m0 MotionEvent motionEvent, @m0 n.a<K> aVar) {
        return !p.k(motionEvent) && !aVar.e(motionEvent) && !this.O.o(aVar.b());
    }

    public final boolean g(@m0 MotionEvent motionEvent) {
        return p.q(motionEvent) && this.O.n() && this.P.c(0);
    }
}
