package g7;

import b6.c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import d.m0;
import d.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

public final class f extends g {

    /* renamed from: q  reason: collision with root package name */
    public static final int f8113q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f8114r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f8115s = 2;

    /* renamed from: d  reason: collision with root package name */
    public final int f8116d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8117e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8118f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8119g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8120h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8121i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8122j;

    /* renamed from: k  reason: collision with root package name */
    public final long f8123k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8124l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8125m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public final DrmInitData f8126n;

    /* renamed from: o  reason: collision with root package name */
    public final List<b> f8127o;

    /* renamed from: p  reason: collision with root package name */
    public final long f8128p;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b implements Comparable<Long> {
        public final String O;
        @o0
        public final b P;
        public final long Q;
        public final String R;
        public final int S;
        public final long T;
        @o0
        public final DrmInitData U;
        @o0
        public final String V;
        @o0
        public final String W;
        public final long X;
        public final long Y;
        public final boolean Z;

        public b(String str, long j10, long j11, String str2, String str3) {
            this(str, (b) null, "", 0, -1, c.f4201b, (DrmInitData) null, str2, str3, j10, j11, false);
        }

        public b(String str, @o0 b bVar, String str2, long j10, int i10, long j11, @o0 DrmInitData drmInitData, @o0 String str3, @o0 String str4, long j12, long j13, boolean z10) {
            this.O = str;
            this.P = bVar;
            this.R = str2;
            this.Q = j10;
            this.S = i10;
            this.T = j11;
            this.U = drmInitData;
            this.V = str3;
            this.W = str4;
            this.X = j12;
            this.Y = j13;
            this.Z = z10;
        }

        /* renamed from: a */
        public int compareTo(@m0 Long l10) {
            if (this.T > l10.longValue()) {
                return 1;
            }
            return this.T < l10.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i10, String str, List<String> list, long j10, long j11, boolean z10, int i11, long j12, int i12, long j13, boolean z11, boolean z12, boolean z13, @o0 DrmInitData drmInitData, List<b> list2) {
        super(str, list, z11);
        String str2 = str;
        List<String> list3 = list;
        this.f8116d = i10;
        this.f8118f = j11;
        this.f8119g = z10;
        this.f8120h = i11;
        this.f8121i = j12;
        this.f8122j = i12;
        this.f8123k = j13;
        this.f8124l = z12;
        this.f8125m = z13;
        this.f8126n = drmInitData;
        this.f8127o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            b bVar = list2.get(list2.size() - 1);
            this.f8128p = bVar.T + bVar.Q;
        } else {
            this.f8128p = 0;
        }
        this.f8117e = j10 == c.f4201b ? -9223372036854775807L : j10 >= 0 ? j10 : this.f8128p + j10;
    }

    /* renamed from: b */
    public f a(List<StreamKey> list) {
        return this;
    }

    public f c(long j10, int i10) {
        return new f(this.f8116d, this.f8129a, this.f8130b, this.f8117e, j10, true, i10, this.f8121i, this.f8122j, this.f8123k, this.f8131c, this.f8124l, this.f8125m, this.f8126n, this.f8127o);
    }

    public f d() {
        if (this.f8124l) {
            return this;
        }
        f fVar = r2;
        f fVar2 = new f(this.f8116d, this.f8129a, this.f8130b, this.f8117e, this.f8118f, this.f8119g, this.f8120h, this.f8121i, this.f8122j, this.f8123k, this.f8131c, true, this.f8125m, this.f8126n, this.f8127o);
        return fVar;
    }

    public long e() {
        return this.f8118f + this.f8128p;
    }

    public boolean f(f fVar) {
        if (fVar == null) {
            return true;
        }
        long j10 = this.f8121i;
        long j11 = fVar.f8121i;
        if (j10 > j11) {
            return true;
        }
        if (j10 < j11) {
            return false;
        }
        int size = this.f8127o.size();
        int size2 = fVar.f8127o.size();
        if (size <= size2) {
            return size == size2 && this.f8124l && !fVar.f8124l;
        }
        return true;
    }
}
