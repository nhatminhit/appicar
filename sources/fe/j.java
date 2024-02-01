package fe;

import fh.g;
import java.util.Comparator;
import p7.f;
import xe.l0;

public final class j implements Comparator<Comparable<? super Object>> {
    @g
    public static final j O = new j();

    /* renamed from: a */
    public int compare(@g Comparable<Object> comparable, @g Comparable<Object> comparable2) {
        l0.p(comparable, "a");
        l0.p(comparable2, f.f11703n);
        return comparable.compareTo(comparable2);
    }

    @g
    public final Comparator<Comparable<Object>> reversed() {
        return k.O;
    }
}
