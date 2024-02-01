package ce;

import fh.g;
import java.util.Arrays;
import java.util.List;
import xe.l0;

public final class c {
    @g
    public static final <E> E[] d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @g
    public static final <T> T[] e(@g T[] tArr, int i10) {
        l0.p(tArr, "<this>");
        T[] copyOf = Arrays.copyOf(tArr, i10);
        l0.o(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final <E> void f(@g E[] eArr, int i10) {
        l0.p(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void g(@g E[] eArr, int i10, int i11) {
        l0.p(eArr, "<this>");
        while (i10 < i11) {
            f(eArr, i10);
            i10++;
        }
    }

    public static final <T> boolean h(T[] tArr, int i10, int i11, List<?> list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!l0.g(tArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static final <T> int i(T[] tArr, int i10, int i11) {
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            T t10 = tArr[i10 + i13];
            i12 = (i12 * 31) + (t10 != null ? t10.hashCode() : 0);
        }
        return i12;
    }

    public static final <T> String j(T[] tArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(tArr[i10 + i12]);
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        l0.o(sb3, "sb.toString()");
        return sb3;
    }
}
