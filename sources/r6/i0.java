package r6;

import b6.c;
import w7.w;

public final class i0 {
    public static int a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long b(w wVar, int i10, int i11) {
        wVar.Q(i10);
        if (wVar.a() < 5) {
            return c.f4201b;
        }
        int l10 = wVar.l();
        if ((8388608 & l10) != 0 || ((2096896 & l10) >> 8) != i11) {
            return c.f4201b;
        }
        boolean z10 = true;
        if (((l10 & 32) != 0) && wVar.D() >= 7 && wVar.a() >= 7) {
            if ((wVar.D() & 16) != 16) {
                z10 = false;
            }
            if (z10) {
                byte[] bArr = new byte[6];
                wVar.i(bArr, 0, 6);
                return c(bArr);
            }
        }
        return c.f4201b;
    }

    public static long c(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
