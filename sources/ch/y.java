package ch;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class y extends f {
    public final transient byte[][] U;
    public final transient int[] V;

    public y(c cVar, int i10) {
        super((byte[]) null);
        d0.b(cVar.P, 0, (long) i10);
        w wVar = cVar.O;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = wVar.f16531c;
            int i15 = wVar.f16530b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                wVar = wVar.f16534f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.U = new byte[i13][];
        this.V = new int[(i13 * 2)];
        w wVar2 = cVar.O;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.U;
            bArr[i16] = wVar2.f16529a;
            int i17 = wVar2.f16531c;
            int i18 = wVar2.f16530b;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.V;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            wVar2.f16532d = true;
            i16++;
            wVar2 = wVar2.f16534f;
        }
    }

    public int A(byte[] bArr, int i10) {
        return f0().A(bArr, i10);
    }

    public byte[] B() {
        return Z();
    }

    public int F(byte[] bArr, int i10) {
        return f0().F(bArr, i10);
    }

    public f G() {
        return f0().G();
    }

    public boolean K(int i10, f fVar, int i11, int i12) {
        if (i10 < 0 || i10 > R() - i12) {
            return false;
        }
        int e02 = e0(i10);
        while (i12 > 0) {
            int i13 = e02 == 0 ? 0 : this.V[e02 - 1];
            int min = Math.min(i12, ((this.V[e02] - i13) + i13) - i10);
            int[] iArr = this.V;
            byte[][] bArr = this.U;
            if (!fVar.L(i11, bArr[e02], (i10 - i13) + iArr[bArr.length + e02], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            e02++;
        }
        return true;
    }

    public boolean L(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > R() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int e02 = e0(i10);
        while (i12 > 0) {
            int i13 = e02 == 0 ? 0 : this.V[e02 - 1];
            int min = Math.min(i12, ((this.V[e02] - i13) + i13) - i10);
            int[] iArr = this.V;
            byte[][] bArr2 = this.U;
            if (!d0.a(bArr2[e02], (i10 - i13) + iArr[bArr2.length + e02], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            e02++;
        }
        return true;
    }

    public f O() {
        return f0().O();
    }

    public f P() {
        return f0().P();
    }

    public int R() {
        return this.V[this.U.length - 1];
    }

    public String U(Charset charset) {
        return f0().U(charset);
    }

    public f V(int i10) {
        return f0().V(i10);
    }

    public f W(int i10, int i11) {
        return f0().W(i10, i11);
    }

    public f X() {
        return f0().X();
    }

    public f Y() {
        return f0().Y();
    }

    public byte[] Z() {
        int[] iArr = this.V;
        byte[][] bArr = this.U;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.V;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.U[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(Z()).asReadOnlyBuffer();
    }

    public String a0() {
        return f0().a0();
    }

    public String b() {
        return f0().b();
    }

    public void b0(c cVar) {
        int length = this.U.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.V;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            w wVar = new w(this.U[i10], i12, (i12 + i13) - i11, true, false);
            w wVar2 = cVar.O;
            if (wVar2 == null) {
                wVar.f16535g = wVar;
                wVar.f16534f = wVar;
                cVar.O = wVar;
            } else {
                wVar2.f16535g.c(wVar);
            }
            i10++;
            i11 = i13;
        }
        cVar.P += (long) i11;
    }

    public void c0(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.U.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int[] iArr = this.V;
                int i12 = iArr[length + i10];
                int i13 = iArr[i10];
                outputStream.write(this.U[i10], i12, i13 - i11);
                i10++;
                i11 = i13;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public String d() {
        return f0().d();
    }

    public final int e0(int i10) {
        int binarySearch = Arrays.binarySearch(this.V, 0, this.U.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.R() == R() && K(0, fVar, 0, R())) {
                return true;
            }
        }
        return false;
    }

    public final f f0() {
        return new f(Z());
    }

    public final Object g0() {
        return f0();
    }

    public int hashCode() {
        int i10 = this.P;
        if (i10 != 0) {
            return i10;
        }
        int length = this.U.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.U[i11];
            int[] iArr = this.V;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.P = i12;
        return i12;
    }

    public byte r(int i10) {
        d0.b((long) this.V[this.U.length - 1], (long) i10, 1);
        int e02 = e0(i10);
        int i11 = e02 == 0 ? 0 : this.V[e02 - 1];
        int[] iArr = this.V;
        byte[][] bArr = this.U;
        return bArr[e02][(i10 - i11) + iArr[bArr.length + e02]];
    }

    public String s() {
        return f0().s();
    }

    public String toString() {
        return f0().toString();
    }

    public f u(f fVar) {
        return f0().u(fVar);
    }

    public f v(f fVar) {
        return f0().v(fVar);
    }
}
