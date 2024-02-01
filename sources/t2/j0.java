package t2;

import android.view.MotionEvent;
import d.m0;
import e1.n;
import t2.e0;
import t2.n;

public final class j0<K> extends q<K> {
    public static final String X = "TouchInputDelegate";
    public final n<K> R;
    public final e0.c<K> S;
    public final v<K> T;
    public final u U;
    public final Runnable V;
    public final Runnable W;

    public j0(@m0 e0<K> e0Var, @m0 o<K> oVar, @m0 n<K> nVar, @m0 e0.c<K> cVar, @m0 Runnable runnable, @m0 u uVar, @m0 v<K> vVar, @m0 i<K> iVar, @m0 Runnable runnable2) {
        super(e0Var, oVar, iVar);
        boolean z10 = true;
        n.a(nVar != null);
        n.a(cVar != null);
        n.a(runnable != null);
        n.a(vVar != null);
        n.a(uVar != null);
        n.a(runnable2 == null ? false : z10);
        this.R = nVar;
        this.S = cVar;
        this.V = runnable;
        this.T = vVar;
        this.U = uVar;
        this.W = runnable2;
    }

    public void onLongPress(@m0 MotionEvent motionEvent) {
        n.a<K> a10;
        if (this.R.g(motionEvent) && (a10 = this.R.a(motionEvent)) != null) {
            if (g(motionEvent)) {
                a(a10);
            } else if (this.O.o(a10.b())) {
                this.U.a(motionEvent);
            } else if (this.S.c(a10.b(), true) && e(a10)) {
                if (this.S.a() && this.O.n()) {
                    this.V.run();
                }
            } else {
                return;
            }
            this.W.run();
        }
    }

    public boolean onSingleTapUp(@m0 MotionEvent motionEvent) {
        if (!this.R.g(motionEvent)) {
            this.O.e();
            return false;
        }
        n.a<K> a10 = this.R.a(motionEvent);
        if (a10 == null) {
            return false;
        }
        if (!this.O.m()) {
            return a10.e(motionEvent) ? e(a10) : this.T.a(a10, motionEvent);
        }
        if (g(motionEvent)) {
            a(a10);
            return true;
        } else if (this.O.o(a10.b())) {
            this.O.g(a10.b());
            return true;
        } else {
            e(a10);
            return true;
        }
    }
}
