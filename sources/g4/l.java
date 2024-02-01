package g4;

import android.graphics.Bitmap;
import d.m0;
import java.security.MessageDigest;
import v3.f;
import z3.e;

public class l extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final String f7949c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7950d = f7949c.getBytes(f.f14159b);

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f7950d);
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.b(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    public int hashCode() {
        return -599754482;
    }
}
