package lb;

import java.util.EnumMap;
import java.util.Map;
import qa.m;
import qa.r;
import qa.s;
import qa.t;
import ya.a;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f20495a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f20496b = new StringBuilder();

    public static Map<s, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(s.class);
        enumMap.put(s.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    public final int a(a aVar, int[] iArr, StringBuilder sb2) throws m {
        int[] iArr2 = this.f20495a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int s10 = aVar.s();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < s10; i12++) {
            int j10 = y.j(aVar, iArr2, i10, y.f20509j);
            sb2.append((char) ((j10 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (j10 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = aVar.r(aVar.q(i10));
            }
        }
        if (sb2.length() != 2) {
            throw m.a();
        } else if (Integer.parseInt(sb2.toString()) % 4 == i11) {
            return i10;
        } else {
            throw m.a();
        }
    }

    public r b(int i10, a aVar, int[] iArr) throws m {
        StringBuilder sb2 = this.f20496b;
        sb2.setLength(0);
        int a10 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<s, Object> c10 = c(sb3);
        float f10 = (float) i10;
        r rVar = new r(sb3, (byte[]) null, new t[]{new t(((float) (iArr[0] + iArr[1])) / 2.0f, f10), new t((float) a10, f10)}, qa.a.UPC_EAN_EXTENSION);
        if (c10 != null) {
            rVar.i(c10);
        }
        return rVar;
    }
}
