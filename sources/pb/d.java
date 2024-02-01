package pb;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;
import qa.a;
import qa.g;
import qa.v;
import qa.w;
import tb.c;
import tb.e;
import ya.b;

public final class d implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final int f21975a = 30;

    /* renamed from: b  reason: collision with root package name */
    public static final int f21976b = 2;

    public static b c(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        b bVar = new b(bArr[0].length + i11, bArr.length + i11);
        bVar.d();
        int n10 = (bVar.n() - i10) - 1;
        int i12 = 0;
        while (i12 < bArr.length) {
            byte[] bArr2 = bArr[i12];
            for (int i13 = 0; i13 < bArr[0].length; i13++) {
                if (bArr2[i13] == 1) {
                    bVar.w(i13 + i10, n10);
                }
            }
            i12++;
            n10--;
        }
        return bVar;
    }

    public static b d(e eVar, String str, int i10, int i11, int i12, int i13) throws w {
        boolean z10;
        eVar.e(str, i10);
        byte[][] c10 = eVar.f().c(1, 4);
        if ((i12 > i11) != (c10[0].length < c10.length)) {
            c10 = e(c10);
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(i11 / c10[0].length, i12 / c10.length);
        if (min <= 1) {
            return c(c10, i13);
        }
        byte[][] c11 = eVar.f().c(min, min << 2);
        if (z10) {
            c11 = e(c11);
        }
        return c(c11, i13);
    }

    public static byte[][] e(byte[][] bArr) {
        int length = bArr[0].length;
        int[] iArr = new int[2];
        iArr[1] = bArr.length;
        iArr[0] = length;
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length2 = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length2] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public b a(String str, a aVar, int i10, int i11) throws w {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public b b(String str, a aVar, int i10, int i11, Map<g, ?> map) throws w {
        if (aVar == a.PDF_417) {
            e eVar = new e();
            int i12 = 30;
            int i13 = 2;
            if (map != null) {
                g gVar = g.PDF417_COMPACT;
                if (map.containsKey(gVar)) {
                    eVar.h(Boolean.parseBoolean(map.get(gVar).toString()));
                }
                g gVar2 = g.PDF417_COMPACTION;
                if (map.containsKey(gVar2)) {
                    eVar.i(c.valueOf(map.get(gVar2).toString()));
                }
                g gVar3 = g.PDF417_DIMENSIONS;
                if (map.containsKey(gVar3)) {
                    tb.d dVar = (tb.d) map.get(gVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                g gVar4 = g.MARGIN;
                if (map.containsKey(gVar4)) {
                    i12 = Integer.parseInt(map.get(gVar4).toString());
                }
                g gVar5 = g.ERROR_CORRECTION;
                if (map.containsKey(gVar5)) {
                    i13 = Integer.parseInt(map.get(gVar5).toString());
                }
                g gVar6 = g.CHARACTER_SET;
                if (map.containsKey(gVar6)) {
                    eVar.k(Charset.forName(map.get(gVar6).toString()));
                }
            }
            return d(eVar, str, i13, i10, i11, i12);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
