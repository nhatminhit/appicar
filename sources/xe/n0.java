package xe;

import fh.g;
import java.io.Serializable;

public abstract class n0<R> implements e0<R>, Serializable {
    public final int O;

    public n0(int i10) {
        this.O = i10;
    }

    public int g() {
        return this.O;
    }

    @g
    public String toString() {
        String x10 = l1.x(this);
        l0.o(x10, "renderLambdaToString(this)");
        return x10;
    }
}
