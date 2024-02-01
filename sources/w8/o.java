package w8;

import d.m0;
import d.o0;
import e8.a;
import y3.q;

@a
public final class o {
    @a
    @o0
    public static String a(@m0 byte[] bArr, int i10, int i11, boolean z10) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i10 < 0 || i11 <= 0 || i10 + i11 > length) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder((z10 ? 75 : 57) * ((i11 + 15) / 16));
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 > 0) {
            if (i13 == 0) {
                sb2.append(i11 < 65536 ? String.format("%04X:", new Object[]{Integer.valueOf(i10)}) : String.format("%08X:", new Object[]{Integer.valueOf(i10)}));
                i14 = i10;
            } else if (i13 == 8) {
                sb2.append(" -");
            }
            sb2.append(String.format(" %02X", new Object[]{Integer.valueOf(bArr[i10] & 255)}));
            i12--;
            i13++;
            if (z10 && (i13 == 16 || i12 == 0)) {
                int i15 = 16 - i13;
                if (i15 > 0) {
                    for (int i16 = 0; i16 < i15; i16++) {
                        sb2.append("   ");
                    }
                }
                if (i15 >= 8) {
                    sb2.append(q.a.R);
                }
                sb2.append(q.a.R);
                for (int i17 = 0; i17 < i13; i17++) {
                    char c10 = (char) bArr[i14 + i17];
                    if (c10 < ' ' || c10 > '~') {
                        c10 = '.';
                    }
                    sb2.append(c10);
                }
            }
            if (i13 == 16 || i12 == 0) {
                sb2.append(10);
                i13 = 0;
            }
            i10++;
        }
        return sb2.toString();
    }
}
