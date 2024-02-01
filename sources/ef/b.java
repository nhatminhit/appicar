package ef;

import fh.g;
import java.util.Random;
import xe.l0;

public final class b extends a {
    @g
    public final a Q = new a();

    public static final class a extends ThreadLocal<Random> {
        @g
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    @g
    public Random r() {
        Object obj = this.Q.get();
        l0.o(obj, "implStorage.get()");
        return (Random) obj;
    }
}
