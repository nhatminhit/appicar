package t7;

import android.net.Uri;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public final class o {

    /* renamed from: j  reason: collision with root package name */
    public static final int f13123j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f13124k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f13125l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f13126m = 16;

    /* renamed from: n  reason: collision with root package name */
    public static final int f13127n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f13128o = 2;

    /* renamed from: p  reason: collision with root package name */
    public static final int f13129p = 3;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f13130a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13131b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f13132c;
    @o0
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f13133d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13134e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13135f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13136g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public final String f13137h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13138i;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public o(Uri uri) {
        this(uri, 0);
    }

    public o(Uri uri, int i10) {
        this(uri, 0, -1, (String) null, i10);
    }

    public o(Uri uri, int i10, @o0 byte[] bArr, long j10, long j11, long j12, @o0 String str, int i11) {
        byte[] bArr2 = bArr;
        long j13 = j10;
        long j14 = j11;
        long j15 = j12;
        boolean z10 = true;
        w7.a.a(j13 >= 0);
        w7.a.a(j14 >= 0);
        if (j15 <= 0 && j15 != -1) {
            z10 = false;
        }
        w7.a.a(z10);
        this.f13130a = uri;
        this.f13131b = i10;
        bArr2 = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f13132c = bArr2;
        this.f13133d = bArr2;
        this.f13134e = j13;
        this.f13135f = j14;
        this.f13136g = j15;
        this.f13137h = str;
        this.f13138i = i11;
    }

    public o(Uri uri, long j10, long j11, long j12, @o0 String str, int i10) {
        this(uri, (byte[]) null, j10, j11, j12, str, i10);
    }

    public o(Uri uri, long j10, long j11, @o0 String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    public o(Uri uri, long j10, long j11, @o0 String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(Uri uri, @o0 byte[] bArr, long j10, long j11, long j12, @o0 String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i10);
    }

    public final String a() {
        return b(this.f13131b);
    }

    public boolean c(int i10) {
        return (this.f13138i & i10) == i10;
    }

    public o d(long j10) {
        long j11 = this.f13136g;
        long j12 = -1;
        if (j11 != -1) {
            j12 = j11 - j10;
        }
        return e(j10, j12);
    }

    public o e(long j10, long j11) {
        if (j10 == 0 && this.f13136g == j11) {
            return this;
        }
        return new o(this.f13130a, this.f13131b, this.f13132c, this.f13134e + j10, this.f13135f + j10, j11, this.f13137h, this.f13138i);
    }

    public o f(Uri uri) {
        return new o(uri, this.f13131b, this.f13132c, this.f13134e, this.f13135f, this.f13136g, this.f13137h, this.f13138i);
    }

    public String toString() {
        return "DataSpec[" + a() + " " + this.f13130a + ", " + Arrays.toString(this.f13132c) + ", " + this.f13134e + ", " + this.f13135f + ", " + this.f13136g + ", " + this.f13137h + ", " + this.f13138i + "]";
    }
}
