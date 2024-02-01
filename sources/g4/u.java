package g4;

import android.graphics.Bitmap;
import d.m0;
import java.security.MessageDigest;
import v3.f;
import z3.e;

public class u extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final String f8012c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f8013d = f8012c.getBytes(f.f14159b);

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f8013d);
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.f(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof u;
    }

    public int hashCode() {
        return 1572326941;
    }
}
