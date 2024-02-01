package g4;

import android.graphics.Bitmap;
import d.m0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t4.m;
import v3.f;
import z3.e;

public class d0 extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final String f7907d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7908e = f7907d.getBytes(f.f14159b);

    /* renamed from: c  reason: collision with root package name */
    public final int f7909c;

    public d0(int i10) {
        this.f7909c = i10;
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f7908e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7909c).array());
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.n(bitmap, this.f7909c);
    }

    public boolean equals(Object obj) {
        return (obj instanceof d0) && this.f7909c == ((d0) obj).f7909c;
    }

    public int hashCode() {
        return m.o(-950519196, m.n(this.f7909c));
    }
}
