package ra;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import qa.a;
import qa.g;
import qa.v;
import ya.b;

public final class c implements v {
    public static b c(String str, a aVar, int i10, int i11, Charset charset, int i12, int i13) {
        if (aVar == a.AZTEC) {
            return d(ua.c.e(str.getBytes(charset), i12, i13), i10, i11);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    public static b d(ua.a aVar, int i10, int i11) {
        b c10 = aVar.c();
        if (c10 != null) {
            int s10 = c10.s();
            int n10 = c10.n();
            int max = Math.max(i10, s10);
            int max2 = Math.max(i11, n10);
            int min = Math.min(max / s10, max2 / n10);
            int i12 = (max - (s10 * min)) / 2;
            int i13 = (max2 - (n10 * min)) / 2;
            b bVar = new b(max, max2);
            int i14 = 0;
            while (i14 < n10) {
                int i15 = 0;
                int i16 = i12;
                while (i15 < s10) {
                    if (c10.j(i15, i14)) {
                        bVar.x(i16, i13, min, min);
                    }
                    i15++;
                    i16 += min;
                }
                i14++;
                i13 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    public b a(String str, a aVar, int i10, int i11) {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public b b(String str, a aVar, int i10, int i11, Map<g, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i12 = 33;
        int i13 = 0;
        if (map != null) {
            g gVar = g.CHARACTER_SET;
            if (map.containsKey(gVar)) {
                charset = Charset.forName(map.get(gVar).toString());
            }
            g gVar2 = g.ERROR_CORRECTION;
            if (map.containsKey(gVar2)) {
                i12 = Integer.parseInt(map.get(gVar2).toString());
            }
            g gVar3 = g.AZTEC_LAYERS;
            if (map.containsKey(gVar3)) {
                i13 = Integer.parseInt(map.get(gVar3).toString());
            }
        }
        return c(str, aVar, i10, i11, charset, i12, i13);
    }
}
