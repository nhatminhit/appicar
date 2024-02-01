package n5;

import i5.g;
import i5.l;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import o5.c;
import w4.b;

public class l0 extends n<UUID> {
    public static final long U = 1;
    public static final int[] V;

    static {
        int[] iArr = new int[127];
        V = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            V[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = V;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public l0() {
        super(UUID.class);
    }

    public static int O0(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static long P0(byte[] bArr, int i10) {
        return ((((long) O0(bArr, i10 + 4)) << 32) >>> 32) | (((long) O0(bArr, i10)) << 32);
    }

    public int J0(String str, int i10, g gVar, char c10) throws l {
        throw gVar.h1(str, r(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c10), Integer.toHexString(c10)}));
    }

    public final UUID K0(String str, g gVar) throws IOException {
        return (UUID) gVar.p0(r(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    /* renamed from: L0 */
    public UUID E0(String str, g gVar) throws IOException {
        if (str.length() != 36) {
            return str.length() == 24 ? N0(b.a().d(str), gVar) : K0(str, gVar);
        }
        if (!(str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-')) {
            K0(str, gVar);
        }
        return new UUID((((long) R0(str, 0, gVar)) << 32) + ((((long) S0(str, 9, gVar)) << 16) | ((long) S0(str, 14, gVar))), ((((long) R0(str, 28, gVar)) << 32) >>> 32) | (((long) (S0(str, 24, gVar) | (S0(str, 19, gVar) << 16))) << 32));
    }

    /* renamed from: M0 */
    public UUID F0(Object obj, g gVar) throws IOException {
        if (obj instanceof byte[]) {
            return N0((byte[]) obj, gVar);
        }
        super.F0(obj, gVar);
        return null;
    }

    public final UUID N0(byte[] bArr, g gVar) throws l {
        if (bArr.length == 16) {
            return new UUID(P0(bArr, 0), P0(bArr, 8));
        }
        w4.l Z = gVar.Z();
        throw c.E(Z, "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, r());
    }

    public int Q0(String str, int i10, g gVar) throws l {
        char charAt = str.charAt(i10);
        int i11 = i10 + 1;
        char charAt2 = str.charAt(i11);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = V;
            int i12 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i12 >= 0) {
                return i12;
            }
        }
        return (charAt > 127 || V[charAt] < 0) ? J0(str, i10, gVar, charAt) : J0(str, i11, gVar, charAt2);
    }

    public int R0(String str, int i10, g gVar) throws l {
        return (Q0(str, i10, gVar) << 24) + (Q0(str, i10 + 2, gVar) << 16) + (Q0(str, i10 + 4, gVar) << 8) + Q0(str, i10 + 6, gVar);
    }

    public int S0(String str, int i10, g gVar) throws l {
        return (Q0(str, i10, gVar) << 8) + Q0(str, i10 + 2, gVar);
    }
}
