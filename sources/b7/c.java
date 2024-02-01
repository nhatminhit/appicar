package b7;

import android.os.Handler;
import android.os.Looper;
import b6.x0;
import b7.i0;
import b7.y;
import d.o0;
import java.util.ArrayList;
import java.util.Iterator;
import t7.r0;
import w7.a;

public abstract class c implements y {
    public final ArrayList<y.b> O = new ArrayList<>(1);
    public final i0.a P = new i0.a();
    @o0
    public Looper Q;
    @o0
    public x0 R;
    @o0
    public Object S;

    public final void b(y.b bVar) {
        this.O.remove(bVar);
        if (this.O.isEmpty()) {
            this.Q = null;
            this.R = null;
            this.S = null;
            q();
        }
    }

    public final void e(y.b bVar, @o0 r0 r0Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.Q;
        a.a(looper == null || looper == myLooper);
        this.O.add(bVar);
        if (this.Q == null) {
            this.Q = myLooper;
            o(r0Var);
            return;
        }
        x0 x0Var = this.R;
        if (x0Var != null) {
            bVar.j(this, x0Var, this.S);
        }
    }

    public final void f(Handler handler, i0 i0Var) {
        this.P.j(handler, i0Var);
    }

    public /* synthetic */ Object g() {
        return x.a(this);
    }

    public final void k(i0 i0Var) {
        this.P.M(i0Var);
    }

    public final i0.a l(int i10, @o0 y.a aVar, long j10) {
        return this.P.P(i10, aVar, j10);
    }

    public final i0.a m(@o0 y.a aVar) {
        return this.P.P(0, aVar, 0);
    }

    public final i0.a n(y.a aVar, long j10) {
        a.a(aVar != null);
        return this.P.P(0, aVar, j10);
    }

    public abstract void o(@o0 r0 r0Var);

    public final void p(x0 x0Var, @o0 Object obj) {
        this.R = x0Var;
        this.S = obj;
        Iterator<y.b> it = this.O.iterator();
        while (it.hasNext()) {
            it.next().j(this, x0Var, obj);
        }
    }

    public abstract void q();
}
