package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpf/u2;", "Lpf/g0;", "Lpf/p1;", "Lpf/g2;", "Lzd/u2;", "P", "", "toString", "Lpf/v2;", "R", "Lpf/v2;", "Y0", "()Lpf/v2;", "Z0", "(Lpf/v2;)V", "job", "", "c", "()Z", "isActive", "Lpf/a3;", "K", "()Lpf/a3;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class u2 extends g0 implements p1, g2 {
    public v2 R;

    @h
    public a3 K() {
        return null;
    }

    public void P() {
        Y0().p1(this);
    }

    @g
    public final v2 Y0() {
        v2 v2Var = this.R;
        if (v2Var != null) {
            return v2Var;
        }
        l0.S("job");
        return null;
    }

    public final void Z0(@g v2 v2Var) {
        this.R = v2Var;
    }

    public boolean c() {
        return true;
    }

    @g
    public String toString() {
        return z0.a(this) + '@' + z0.b(this) + "[job@" + z0.b(Y0()) + ']';
    }
}
