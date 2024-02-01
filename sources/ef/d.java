package ef;

import fh.g;
import java.io.Serializable;
import java.util.Random;
import xe.l0;
import xe.w;

public final class d extends a implements Serializable {
    @g
    public static final a R = new a((w) null);
    @Deprecated
    public static final long S = 0;
    @g
    public final Random Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public d(@g Random random) {
        l0.p(random, "impl");
        this.Q = random;
    }

    @g
    public Random r() {
        return this.Q;
    }
}
