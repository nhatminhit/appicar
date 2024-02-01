package g4;

import android.graphics.Bitmap;
import d.m0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t4.m;
import v3.f;
import z3.e;

public final class v extends h {

    /* renamed from: g  reason: collision with root package name */
    public static final String f8014g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f8015h = f8014g.getBytes(f.f14159b);

    /* renamed from: c  reason: collision with root package name */
    public final float f8016c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8017d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8018e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8019f;

    public v(float f10, float f11, float f12, float f13) {
        this.f8016c = f10;
        this.f8017d = f11;
        this.f8018e = f12;
        this.f8019f = f13;
    }

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f8015h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f8016c).putFloat(this.f8017d).putFloat(this.f8018e).putFloat(this.f8019f).array());
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.p(eVar, bitmap, this.f8016c, this.f8017d, this.f8018e, this.f8019f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f8016c == vVar.f8016c && this.f8017d == vVar.f8017d && this.f8018e == vVar.f8018e && this.f8019f == vVar.f8019f;
    }

    public int hashCode() {
        return m.m(this.f8019f, m.m(this.f8018e, m.m(this.f8017d, m.o(-2013597734, m.l(this.f8016c)))));
    }
}
