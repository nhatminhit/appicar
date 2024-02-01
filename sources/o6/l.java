package o6;

import com.google.android.exoplayer2.Format;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class l {

    /* renamed from: l  reason: collision with root package name */
    public static final int f11281l = 0;

    /* renamed from: m  reason: collision with root package name */
    public static final int f11282m = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f11283a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11284b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11285c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11286d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11287e;

    /* renamed from: f  reason: collision with root package name */
    public final Format f11288f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11289g;
    @o0

    /* renamed from: h  reason: collision with root package name */
    public final long[] f11290h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public final long[] f11291i;

    /* renamed from: j  reason: collision with root package name */
    public final int f11292j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public final m[] f11293k;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public l(int i10, int i11, long j10, long j11, long j12, Format format, int i12, @o0 m[] mVarArr, int i13, @o0 long[] jArr, @o0 long[] jArr2) {
        this.f11283a = i10;
        this.f11284b = i11;
        this.f11285c = j10;
        this.f11286d = j11;
        this.f11287e = j12;
        this.f11288f = format;
        this.f11289g = i12;
        this.f11293k = mVarArr;
        this.f11292j = i13;
        this.f11290h = jArr;
        this.f11291i = jArr2;
    }

    public l a(Format format) {
        return new l(this.f11283a, this.f11284b, this.f11285c, this.f11286d, this.f11287e, format, this.f11289g, this.f11293k, this.f11292j, this.f11290h, this.f11291i);
    }

    @o0
    public m b(int i10) {
        m[] mVarArr = this.f11293k;
        if (mVarArr == null) {
            return null;
        }
        return mVarArr[i10];
    }
}
