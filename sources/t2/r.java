package t2;

import android.view.MotionEvent;
import d.m0;
import e1.n;
import t2.n;

public final class r<K> extends q<K> {
    public static final String X = "MouseInputDelegate";
    public final n<K> R;
    public final t S;
    public final v<K> T;
    public final i<K> U;
    public boolean V;
    public boolean W;

    public r(@m0 e0<K> e0Var, @m0 o<K> oVar, @m0 n<K> nVar, @m0 t tVar, @m0 v<K> vVar, @m0 i<K> iVar) {
        super(e0Var, oVar, iVar);
        boolean z10 = true;
        n.a(nVar != null);
        n.a(tVar != null);
        n.a(vVar == null ? false : z10);
        this.R = nVar;
        this.S = tVar;
        this.T = vVar;
        this.U = iVar;
    }

    public final void h(@m0 MotionEvent motionEvent, @m0 n.a<K> aVar) {
        if (this.O.m()) {
            e1.n.a(aVar != null);
            if (g(motionEvent)) {
                a(aVar);
                return;
            }
            if (f(motionEvent, aVar)) {
                this.O.e();
            }
            if (!this.O.o(aVar.b())) {
                j(aVar, motionEvent);
            } else if (this.O.g(aVar.b())) {
                this.U.a();
            }
        }
    }

    public final boolean i(@m0 MotionEvent motionEvent) {
        n.a<K> a10;
        if (this.R.g(motionEvent) && (a10 = this.R.a(motionEvent)) != null && !this.O.o(a10.b())) {
            this.O.e();
            e(a10);
        }
        return this.S.onContextClick(motionEvent);
    }

    public final void j(@m0 n.a<K> aVar, @m0 MotionEvent motionEvent) {
        if (aVar.e(motionEvent) || p.k(motionEvent)) {
            e(aVar);
        } else {
            b(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r1 = r3.R.a(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(@d.m0 android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 0
            r3.V = r0
            t2.n<K> r1 = r3.R
            boolean r1 = r1.g(r4)
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            boolean r1 = t2.p.r(r4)
            if (r1 == 0) goto L_0x0013
            return r0
        L_0x0013:
            t2.n<K> r1 = r3.R
            t2.n$a r1 = r1.a(r4)
            if (r1 == 0) goto L_0x0024
            t2.v<K> r2 = r3.T
            boolean r4 = r2.a(r1, r4)
            if (r4 == 0) goto L_0x0024
            r0 = 1
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.r.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDown(@m0 MotionEvent motionEvent) {
        if ((!p.i(motionEvent) || !p.o(motionEvent)) && !p.p(motionEvent)) {
            return false;
        }
        this.W = true;
        return i(motionEvent);
    }

    public boolean onScroll(@m0 MotionEvent motionEvent, @m0 MotionEvent motionEvent2, float f10, float f11) {
        return !p.s(motionEvent2);
    }

    public boolean onSingleTapConfirmed(@m0 MotionEvent motionEvent) {
        n.a<K> a10;
        if (this.V) {
            this.V = false;
            return false;
        } else if (this.O.m() || !this.R.f(motionEvent) || p.r(motionEvent) || (a10 = this.R.a(motionEvent)) == null || !a10.c()) {
            return false;
        } else {
            if (!this.U.e() || !p.q(motionEvent)) {
                j(a10, motionEvent);
                return true;
            }
            this.O.w(this.U.d());
            this.O.j(a10.a());
            return true;
        }
    }

    public boolean onSingleTapUp(@m0 MotionEvent motionEvent) {
        if (this.W) {
            this.W = false;
            return false;
        } else if (!this.R.g(motionEvent)) {
            this.O.e();
            this.U.a();
            return false;
        } else if (p.r(motionEvent) || !this.O.m()) {
            return false;
        } else {
            h(motionEvent, this.R.a(motionEvent));
            this.V = true;
            return true;
        }
    }
}
