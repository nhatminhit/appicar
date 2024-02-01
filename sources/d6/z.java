package d6;

import d.o0;
import d6.l;
import java.nio.ByteBuffer;
import java.util.Arrays;
import w7.a;

public final class z extends y {
    @o0

    /* renamed from: h  reason: collision with root package name */
    public int[] f6502h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6503i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public int[] f6504j;

    public boolean c() {
        return this.f6503i;
    }

    public void d(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a.g(this.f6504j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer n10 = n(((limit - position) / (this.f6497c * 2)) * iArr.length * 2);
        while (position < limit) {
            for (int i10 : iArr) {
                n10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f6497c * 2;
        }
        byteBuffer.position(limit);
        n10.flip();
    }

    public int e() {
        int[] iArr = this.f6504j;
        return iArr == null ? this.f6497c : iArr.length;
    }

    public boolean i(int i10, int i11, int i12) throws l.a {
        boolean z10 = !Arrays.equals(this.f6502h, this.f6504j);
        int[] iArr = this.f6502h;
        this.f6504j = iArr;
        if (iArr == null) {
            this.f6503i = false;
            return z10;
        } else if (i12 != 2) {
            throw new l.a(i10, i11, i12);
        } else if (!z10 && !o(i10, i11, i12)) {
            return false;
        } else {
            this.f6503i = i11 != iArr.length;
            int i13 = 0;
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                if (i14 < i11) {
                    this.f6503i = (i14 != i13) | this.f6503i;
                    i13++;
                } else {
                    throw new l.a(i10, i11, i12);
                }
            }
            return true;
        }
    }

    public void m() {
        this.f6504j = null;
        this.f6502h = null;
        this.f6503i = false;
    }

    public void p(@o0 int[] iArr) {
        this.f6502h = iArr;
    }
}
