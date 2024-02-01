package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import wf.t;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0005R\u0014\u0010\n\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lpf/z2;", "Lpf/o0;", "", "toString", "", "parallelism", "Q1", "T1", "S1", "()Lpf/z2;", "immediate", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class z2 extends o0 {
    @g
    public o0 Q1(int i10) {
        t.a(i10);
        return this;
    }

    @g
    public abstract z2 S1();

    @i2
    @h
    public final String T1() {
        z2 z2Var;
        z2 e10 = m1.e();
        if (this == e10) {
            return "Dispatchers.Main";
        }
        try {
            z2Var = e10.S1();
        } catch (UnsupportedOperationException unused) {
            z2Var = null;
        }
        if (this == z2Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @g
    public String toString() {
        String T1 = T1();
        if (T1 != null) {
            return T1;
        }
        return z0.a(this) + '@' + z0.b(this);
    }
}
