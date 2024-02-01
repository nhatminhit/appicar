package w8;

import androidx.collection.b;
import d.m0;
import d.o0;
import e8.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@a
public final class h {
    @a
    public static boolean a(@o0 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @a
    @m0
    @Deprecated
    public static <T> List<T> b() {
        return Collections.emptyList();
    }

    @a
    @m0
    @Deprecated
    public static <T> List<T> c(@m0 T t10) {
        return Collections.singletonList(t10);
    }

    @a
    @m0
    @Deprecated
    public static <T> List<T> d(@m0 T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : c(tArr[0]) : b();
    }

    @a
    @m0
    public static <K, V> Map<K, V> e(@m0 K k10, @m0 V v10, @m0 K k11, @m0 V v11, @m0 K k12, @m0 V v12) {
        Map k13 = k(3, false);
        k13.put(k10, v10);
        k13.put(k11, v11);
        k13.put(k12, v12);
        return Collections.unmodifiableMap(k13);
    }

    @a
    @m0
    public static <K, V> Map<K, V> f(@m0 K k10, @m0 V v10, @m0 K k11, @m0 V v11, @m0 K k12, @m0 V v12, @m0 K k13, @m0 V v13, @m0 K k14, @m0 V v14, @m0 K k15, @m0 V v15) {
        Map k16 = k(6, false);
        k16.put(k10, v10);
        k16.put(k11, v11);
        k16.put(k12, v12);
        k16.put(k13, v13);
        k16.put(k14, v14);
        k16.put(k15, v15);
        return Collections.unmodifiableMap(k16);
    }

    @a
    @m0
    public static <K, V> Map<K, V> g(@m0 K[] kArr, @m0 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        } else if (length == 0) {
            return Collections.emptyMap();
        } else {
            if (length == 1) {
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            Map k10 = k(length, false);
            for (int i10 = 0; i10 < kArr.length; i10++) {
                k10.put(kArr[i10], vArr[i10]);
            }
            return Collections.unmodifiableMap(k10);
        }
    }

    @a
    @m0
    public static <T> Set<T> h(int i10) {
        return i10 == 0 ? new b() : l(i10, true);
    }

    @a
    @m0
    @Deprecated
    public static <T> Set<T> i(@m0 T t10, @m0 T t11, @m0 T t12) {
        Set l10 = l(3, false);
        l10.add(t10);
        l10.add(t11);
        l10.add(t12);
        return Collections.unmodifiableSet(l10);
    }

    @a
    @m0
    @Deprecated
    public static <T> Set<T> j(@m0 T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set l10 = l(2, false);
            l10.add(t10);
            l10.add(t11);
            return Collections.unmodifiableSet(l10);
        } else if (length == 3) {
            return i(tArr[0], tArr[1], tArr[2]);
        } else {
            if (length != 4) {
                Set l11 = l(length, false);
                Collections.addAll(l11, tArr);
                return Collections.unmodifiableSet(l11);
            }
            T t12 = tArr[0];
            T t13 = tArr[1];
            T t14 = tArr[2];
            T t15 = tArr[3];
            Set l12 = l(4, false);
            l12.add(t12);
            l12.add(t13);
            l12.add(t14);
            l12.add(t15);
            return Collections.unmodifiableSet(l12);
        }
    }

    public static Map k(int i10, boolean z10) {
        return i10 <= 256 ? new androidx.collection.a(i10) : new HashMap(i10, 1.0f);
    }

    public static Set l(int i10, boolean z10) {
        return i10 <= (true != z10 ? 256 : 128) ? new b(i10) : new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }
}
