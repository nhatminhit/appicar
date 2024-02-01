package y5;

import a6.b0;
import i5.e0;
import i5.j;
import i5.l;
import java.io.IOException;
import java.util.UUID;
import s5.g;
import s5.n;
import w4.i;

public class s0 extends l0<UUID> {
    public static final char[] R = "0123456789abcdef".toCharArray();

    public s0() {
        super(UUID.class);
    }

    public static final void M(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >> 24);
        int i12 = i11 + 1;
        bArr[i12] = (byte) (i10 >> 16);
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i10 >> 8);
        bArr[i13 + 1] = (byte) i10;
    }

    public static void N(int i10, char[] cArr, int i11) {
        O(i10 >> 16, cArr, i11);
        O(i10, cArr, i11 + 4);
    }

    public static void O(int i10, char[] cArr, int i11) {
        char[] cArr2 = R;
        cArr[i11] = cArr2[(i10 >> 12) & 15];
        int i12 = i11 + 1;
        cArr[i12] = cArr2[(i10 >> 8) & 15];
        int i13 = i12 + 1;
        cArr[i13] = cArr2[(i10 >> 4) & 15];
        cArr[i13 + 1] = cArr2[i10 & 15];
    }

    public static final byte[] P(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        M((int) (mostSignificantBits >> 32), bArr, 0);
        M((int) mostSignificantBits, bArr, 4);
        M((int) (leastSignificantBits >> 32), bArr, 8);
        M((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    /* renamed from: Q */
    public boolean h(e0 e0Var, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    /* renamed from: R */
    public void m(UUID uuid, i iVar, e0 e0Var) throws IOException {
        if (!iVar.o() || (iVar instanceof b0)) {
            char[] cArr = new char[36];
            long mostSignificantBits = uuid.getMostSignificantBits();
            N((int) (mostSignificantBits >> 32), cArr, 0);
            cArr[8] = '-';
            int i10 = (int) mostSignificantBits;
            O(i10 >>> 16, cArr, 9);
            cArr[13] = '-';
            O(i10, cArr, 14);
            cArr[18] = '-';
            long leastSignificantBits = uuid.getLeastSignificantBits();
            O((int) (leastSignificantBits >>> 48), cArr, 19);
            cArr[23] = '-';
            O((int) (leastSignificantBits >>> 32), cArr, 24);
            N((int) leastSignificantBits, cArr, 28);
            iVar.b3(cArr, 0, 36);
            return;
        }
        iVar.Z1(P(uuid));
    }

    public void e(g gVar, j jVar) throws l {
        J(gVar, jVar, n.UUID);
    }
}
