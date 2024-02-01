package x7;

import b6.j0;
import d.o0;
import java.util.Collections;
import java.util.List;
import w7.t;
import w7.w;

public final class c {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f15155a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15156b;

    public c(@o0 List<byte[]> list, int i10) {
        this.f15155a = list;
        this.f15156b = i10;
    }

    public static c a(w wVar) throws j0 {
        try {
            wVar.R(21);
            int D = wVar.D() & 3;
            int D2 = wVar.D();
            int c10 = wVar.c();
            int i10 = 0;
            for (int i11 = 0; i11 < D2; i11++) {
                wVar.R(1);
                int J = wVar.J();
                for (int i12 = 0; i12 < J; i12++) {
                    int J2 = wVar.J();
                    i10 += J2 + 4;
                    wVar.R(J2);
                }
            }
            wVar.Q(c10);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            for (int i14 = 0; i14 < D2; i14++) {
                wVar.R(1);
                int J3 = wVar.J();
                for (int i15 = 0; i15 < J3; i15++) {
                    int J4 = wVar.J();
                    byte[] bArr2 = t.f14846b;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(wVar.f14880a, wVar.c(), bArr, length, J4);
                    i13 = length + J4;
                    wVar.R(J4);
                }
            }
            return new c(i10 == 0 ? null : Collections.singletonList(bArr), D + 1);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new j0("Error parsing HEVC config", e10);
        }
    }
}
