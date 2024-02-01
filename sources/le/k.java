package le;

import fh.g;
import fh.h;
import ie.d;
import xe.e0;
import xe.l0;
import xe.l1;
import zd.h1;

@h1(version = "1.3")
public abstract class k extends j implements e0<Object>, n {
    public final int P;

    public k(int i10) {
        this(i10, (d<Object>) null);
    }

    public k(int i10, @h d<Object> dVar) {
        super(dVar);
        this.P = i10;
    }

    public int g() {
        return this.P;
    }

    @g
    public String toString() {
        if (J() != null) {
            return super.toString();
        }
        String w10 = l1.w(this);
        l0.o(w10, "renderLambdaToString(this)");
        return w10;
    }
}
