package d6;

import d6.l;
import java.nio.ByteBuffer;
import w7.q0;

public final class c0 extends y {

    /* renamed from: h  reason: collision with root package name */
    public static final int f6279h = Float.floatToIntBits(Float.NaN);

    /* renamed from: i  reason: collision with root package name */
    public static final double f6280i = 4.656612875245797E-10d;

    public static void p(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (floatToIntBits == f6279h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public boolean c() {
        return q0.r0(this.f6498d);
    }

    public void d(ByteBuffer byteBuffer) {
        boolean z10 = this.f6498d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (!z10) {
            i10 = (i10 / 3) * 4;
        }
        ByteBuffer n10 = n(i10);
        if (z10) {
            while (position < limit) {
                p((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), n10);
                position += 4;
            }
        } else {
            while (position < limit) {
                p(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), n10);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        n10.flip();
    }

    public int g() {
        return 4;
    }

    public boolean i(int i10, int i11, int i12) throws l.a {
        if (q0.r0(i12)) {
            return o(i10, i11, i12);
        }
        throw new l.a(i10, i11, i12);
    }
}
