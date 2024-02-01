package g4;

import android.graphics.Bitmap;
import d.m0;
import java.security.MessageDigest;
import v3.f;
import z3.e;

public class n extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final int f7953c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final String f7954d = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f7955e = f7954d.getBytes(f.f14159b);

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f7955e);
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.d(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    public int hashCode() {
        return 1101716364;
    }
}
