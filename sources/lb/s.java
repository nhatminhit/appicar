package lb;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import qa.a;
import qa.g;
import qa.v;
import ya.b;

public abstract class s implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f20492a = Pattern.compile("[0-9]+");

    public static int c(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static void d(String str) {
        if (!f20492a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    public static b h(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        b bVar = new b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.x(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    public final b a(String str, a aVar, int i10, int i11) {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public b b(String str, a aVar, int i10, int i11, Map<g, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        } else {
            Collection<a> g10 = g();
            if (g10 == null || g10.contains(aVar)) {
                int f10 = f();
                if (map != null) {
                    g gVar = g.MARGIN;
                    if (map.containsKey(gVar)) {
                        f10 = Integer.parseInt(map.get(gVar).toString());
                    }
                }
                return h(e(str), i10, i11, f10);
            }
            throw new IllegalArgumentException("Can only encode " + g10 + ", but got " + aVar);
        }
    }

    public abstract boolean[] e(String str);

    public int f() {
        return 10;
    }

    public Collection<a> g() {
        return null;
    }
}
