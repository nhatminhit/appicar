package j6;

import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.io.EOFException;
import java.io.IOException;
import w7.w;
import x6.b;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final w f9594a = new w(10);

    @o0
    public Metadata a(j jVar, @o0 b.a aVar) throws IOException, InterruptedException {
        Metadata metadata = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.k(this.f9594a.f14880a, 0, 10);
                this.f9594a.Q(0);
                if (this.f9594a.G() != b.f15129d) {
                    break;
                }
                this.f9594a.R(3);
                int C = this.f9594a.C();
                int i11 = C + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f9594a.f14880a, 0, bArr, 0, 10);
                    jVar.k(bArr, 10, C);
                    metadata = new b(aVar).d(bArr, i11);
                } else {
                    jVar.e(C);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        jVar.h();
        jVar.e(i10);
        return metadata;
    }
}
