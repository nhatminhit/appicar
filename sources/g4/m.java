package g4;

import android.graphics.Bitmap;
import d.m0;
import java.security.MessageDigest;
import v3.f;
import z3.e;

public class m extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final String f7951c = "com.bumptech.glide.load.resource.bitmap.CenterInside";

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f7952d = f7951c.getBytes(f.f14159b);

    public void a(@m0 MessageDigest messageDigest) {
        messageDigest.update(f7952d);
    }

    public Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        return g0.c(eVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    public int hashCode() {
        return -670243078;
    }
}
