package z6;

import com.google.android.exoplayer2.offline.DownloadRequest;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class d {

    /* renamed from: i  reason: collision with root package name */
    public static final int f15934i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f15935j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f15936k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f15937l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f15938m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f15939n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f15940o = 7;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15941p = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15942q = 1;

    /* renamed from: r  reason: collision with root package name */
    public static final int f15943r = 0;

    /* renamed from: a  reason: collision with root package name */
    public final DownloadRequest f15944a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15945b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15946c;

    /* renamed from: d  reason: collision with root package name */
    public final long f15947d;

    /* renamed from: e  reason: collision with root package name */
    public final long f15948e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15949f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15950g;

    /* renamed from: h  reason: collision with root package name */
    public final s f15951h;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public d(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12) {
        this(downloadRequest, i10, j10, j11, j12, i11, i12, new s());
    }

    public d(DownloadRequest downloadRequest, int i10, long j10, long j11, long j12, int i11, int i12, s sVar) {
        w7.a.g(sVar);
        boolean z10 = true;
        w7.a.i((i12 == 0) == (i10 != 4));
        if (i11 != 0) {
            w7.a.i((i10 == 2 || i10 == 0) ? false : z10);
        }
        this.f15944a = downloadRequest;
        this.f15945b = i10;
        this.f15946c = j10;
        this.f15947d = j11;
        this.f15948e = j12;
        this.f15949f = i11;
        this.f15950g = i12;
        this.f15951h = sVar;
    }

    public long a() {
        return this.f15951h.f15980a;
    }

    public float b() {
        return this.f15951h.f15981b;
    }

    public boolean c() {
        int i10 = this.f15945b;
        return i10 == 3 || i10 == 4;
    }
}
