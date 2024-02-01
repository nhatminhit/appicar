package k6;

import b6.c;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import d6.f0;
import j6.d;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.q;
import j6.s;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import w7.q0;

public final class b implements i {
    public static final int A = 16000;
    public static final int B = 8000;
    public static final int C = 20000;

    /* renamed from: s  reason: collision with root package name */
    public static final l f10020s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final int f10021t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f10022u = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f10023v;

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f10024w = q0.m0("#!AMR\n");

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f10025x = q0.m0("#!AMR-WB\n");

    /* renamed from: y  reason: collision with root package name */
    public static final int f10026y;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10027z = 20;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f10028d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10029e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10030f;

    /* renamed from: g  reason: collision with root package name */
    public long f10031g;

    /* renamed from: h  reason: collision with root package name */
    public int f10032h;

    /* renamed from: i  reason: collision with root package name */
    public int f10033i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10034j;

    /* renamed from: k  reason: collision with root package name */
    public long f10035k;

    /* renamed from: l  reason: collision with root package name */
    public int f10036l;

    /* renamed from: m  reason: collision with root package name */
    public int f10037m;

    /* renamed from: n  reason: collision with root package name */
    public long f10038n;

    /* renamed from: o  reason: collision with root package name */
    public k f10039o;

    /* renamed from: p  reason: collision with root package name */
    public s f10040p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public q f10041q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10042r;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10023v = iArr;
        f10026y = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this.f10029e = i10;
        this.f10028d = new byte[1];
        this.f10036l = -1;
    }

    public static byte[] d() {
        byte[] bArr = f10024w;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] e() {
        byte[] bArr = f10025x;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int i(int i10) {
        return f10022u[i10];
    }

    public static int j(int i10) {
        return f10023v[i10];
    }

    public static int k(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    public static /* synthetic */ i[] q() {
        return new i[]{new b()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        return v(jVar);
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        if (jVar.getPosition() != 0 || v(jVar)) {
            r();
            int w10 = w(jVar);
            s(jVar.getLength(), w10);
            return w10;
        }
        throw new j0("Could not find AMR header.");
    }

    public void g(k kVar) {
        this.f10039o = kVar;
        this.f10040p = kVar.a(0, 1);
        kVar.r();
    }

    public void h(long j10, long j11) {
        this.f10031g = 0;
        this.f10032h = 0;
        this.f10033i = 0;
        if (j10 != 0) {
            q qVar = this.f10041q;
            if (qVar instanceof d) {
                this.f10038n = ((d) qVar).c(j10);
                return;
            }
        }
        this.f10038n = 0;
    }

    public final q l(long j10) {
        return new d(j10, this.f10035k, k(this.f10036l, f0.f6302r), this.f10036l);
    }

    public final int m(int i10) throws j0 {
        if (o(i10)) {
            return this.f10030f ? f10023v[i10] : f10022u[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f10030f ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new j0(sb2.toString());
    }

    public final boolean n(int i10) {
        return !this.f10030f && (i10 < 12 || i10 > 14);
    }

    public final boolean o(int i10) {
        return i10 >= 0 && i10 <= 15 && (p(i10) || n(i10));
    }

    public final boolean p(int i10) {
        return this.f10030f && (i10 < 10 || i10 > 13);
    }

    public final void r() {
        if (!this.f10042r) {
            this.f10042r = true;
            boolean z10 = this.f10030f;
            this.f10040p.d(Format.q((String) null, z10 ? w7.s.N : w7.s.M, (String) null, -1, f10026y, 1, z10 ? A : 8000, -1, (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
        }
    }

    public final void s(long j10, int i10) {
        q qVar;
        int i11;
        if (!this.f10034j) {
            if ((this.f10029e & 1) == 0 || j10 == -1 || !((i11 = this.f10036l) == -1 || i11 == this.f10032h)) {
                qVar = new q.b(c.f4201b);
            } else if (this.f10037m >= 20 || i10 == -1) {
                qVar = l(j10);
            } else {
                return;
            }
            this.f10041q = qVar;
            this.f10039o.q(qVar);
            this.f10034j = true;
        }
    }

    public final boolean t(j jVar, byte[] bArr) throws IOException, InterruptedException {
        jVar.h();
        byte[] bArr2 = new byte[bArr.length];
        jVar.k(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final int u(j jVar) throws IOException, InterruptedException {
        jVar.h();
        jVar.k(this.f10028d, 0, 1);
        byte b10 = this.f10028d[0];
        if ((b10 & 131) <= 0) {
            return m((b10 >> 3) & 15);
        }
        throw new j0("Invalid padding bits for frame header " + b10);
    }

    public final boolean v(j jVar) throws IOException, InterruptedException {
        int length;
        byte[] bArr = f10024w;
        if (t(jVar, bArr)) {
            this.f10030f = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f10025x;
            if (!t(jVar, bArr2)) {
                return false;
            }
            this.f10030f = true;
            length = bArr2.length;
        }
        jVar.i(length);
        return true;
    }

    public final int w(j jVar) throws IOException, InterruptedException {
        if (this.f10033i == 0) {
            try {
                int u10 = u(jVar);
                this.f10032h = u10;
                this.f10033i = u10;
                if (this.f10036l == -1) {
                    this.f10035k = jVar.getPosition();
                    this.f10036l = this.f10032h;
                }
                if (this.f10036l == this.f10032h) {
                    this.f10037m++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int b10 = this.f10040p.b(jVar, this.f10033i, true);
        if (b10 == -1) {
            return -1;
        }
        int i10 = this.f10033i - b10;
        this.f10033i = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f10040p.c(this.f10038n + this.f10031g, 1, this.f10032h, 0, (s.a) null);
        this.f10031g += f0.f6302r;
        return 0;
    }
}
