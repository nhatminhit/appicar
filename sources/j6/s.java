package j6;

import com.google.android.exoplayer2.Format;
import d.o0;
import java.io.IOException;
import java.util.Arrays;
import w7.w;

public interface s {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9618a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f9619b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9620c;

        /* renamed from: d  reason: collision with root package name */
        public final int f9621d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f9618a = i10;
            this.f9619b = bArr;
            this.f9620c = i11;
            this.f9621d = i12;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9618a == aVar.f9618a && this.f9620c == aVar.f9620c && this.f9621d == aVar.f9621d && Arrays.equals(this.f9619b, aVar.f9619b);
        }

        public int hashCode() {
            return (((((this.f9618a * 31) + Arrays.hashCode(this.f9619b)) * 31) + this.f9620c) * 31) + this.f9621d;
        }
    }

    void a(w wVar, int i10);

    int b(j jVar, int i10, boolean z10) throws IOException, InterruptedException;

    void c(long j10, int i10, int i11, int i12, @o0 a aVar);

    void d(Format format);
}
