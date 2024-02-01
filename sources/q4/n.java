package q4;

import d.m0;
import t4.m;

@Deprecated
public abstract class n<Z> extends b<Z> {
    public final int P;
    public final int Q;

    public n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public n(int i10, int i11) {
        this.P = i10;
        this.Q = i11;
    }

    public void e(@m0 o oVar) {
    }

    public final void o(@m0 o oVar) {
        if (m.v(this.P, this.Q)) {
            oVar.d(this.P, this.Q);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.P + " and height: " + this.Q + ", either provide dimensions in the constructor or call override()");
    }
}
