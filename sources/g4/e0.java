package g4;

import android.graphics.Bitmap;
import d.m0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t4.k;
import t4.m;
import v3.f;
import z3.e;

public final class e0 extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final String f7914d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7915e = f7914d.getBytes(f.f14159b);

    /* renamed from: c  reason: collision with root package name */
    public final int f7916c;

    public e0(int i10) {
        k.a(i10 > 0, "roundingRadius must be greater than 0.");
        this.f7916c = i10;
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f7915e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7916c).array());
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.q(eVar, bitmap, this.f7916c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && this.f7916c == ((e0) obj).f7916c;
    }

    public int hashCode() {
        return m.o(-569625254, m.n(this.f7916c));
    }
}
