package fe;

import fh.g;
import java.util.Comparator;
import xe.l0;
import zd.h1;

public class i extends h {
    @h1(version = "1.4")
    public static final <T> T A0(T t10, @g T[] tArr, @g Comparator<? super T> comparator) {
        l0.p(tArr, "other");
        l0.p(comparator, "comparator");
        for (T t11 : tArr) {
            if (comparator.compare(t10, t11) < 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @h1(version = "1.1")
    public static final <T> T B0(T t10, T t11, T t12, @g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return C0(t10, C0(t11, t12, comparator), comparator);
    }

    @h1(version = "1.1")
    public static final <T> T C0(T t10, T t11, @g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return comparator.compare(t10, t11) <= 0 ? t10 : t11;
    }

    @h1(version = "1.4")
    public static final <T> T D0(T t10, @g T[] tArr, @g Comparator<? super T> comparator) {
        l0.p(tArr, "other");
        l0.p(comparator, "comparator");
        for (T t11 : tArr) {
            if (comparator.compare(t10, t11) > 0) {
                t10 = t11;
            }
        }
        return t10;
    }

    @h1(version = "1.1")
    public static final <T> T y0(T t10, T t11, T t12, @g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return z0(t10, z0(t11, t12, comparator), comparator);
    }

    @h1(version = "1.1")
    public static final <T> T z0(T t10, T t11, @g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return comparator.compare(t10, t11) >= 0 ? t10 : t11;
    }
}
