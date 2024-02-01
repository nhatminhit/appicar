package r6;

import b6.c;
import d6.f0;
import j6.j;
import j6.p;
import java.io.IOException;
import w7.j0;
import w7.q0;

public final class w {

    /* renamed from: i  reason: collision with root package name */
    public static final int f12533i = 20000;

    /* renamed from: a  reason: collision with root package name */
    public final j0 f12534a = new j0(0);

    /* renamed from: b  reason: collision with root package name */
    public final w7.w f12535b = new w7.w();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12536c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12537d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12538e;

    /* renamed from: f  reason: collision with root package name */
    public long f12539f = c.f4201b;

    /* renamed from: g  reason: collision with root package name */
    public long f12540g = c.f4201b;

    /* renamed from: h  reason: collision with root package name */
    public long f12541h = c.f4201b;

    public static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public static long l(w7.w wVar) {
        int c10 = wVar.c();
        if (wVar.a() < 9) {
            return c.f4201b;
        }
        byte[] bArr = new byte[9];
        wVar.i(bArr, 0, 9);
        wVar.Q(c10);
        return !a(bArr) ? c.f4201b : m(bArr);
    }

    public static long m(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = bArr[2];
        return (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int b(j jVar) {
        this.f12535b.N(q0.f14791f);
        this.f12536c = true;
        jVar.h();
        return 0;
    }

    public long c() {
        return this.f12541h;
    }

    public j0 d() {
        return this.f12534a;
    }

    public boolean e() {
        return this.f12536c;
    }

    public final int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public int g(j jVar, p pVar) throws IOException, InterruptedException {
        if (!this.f12538e) {
            return j(jVar, pVar);
        }
        if (this.f12540g == c.f4201b) {
            return b(jVar);
        }
        if (!this.f12537d) {
            return h(jVar, pVar);
        }
        long j10 = this.f12539f;
        if (j10 == c.f4201b) {
            return b(jVar);
        }
        this.f12541h = this.f12534a.b(this.f12540g) - this.f12534a.b(j10);
        return b(jVar);
    }

    public final int h(j jVar, p pVar) throws IOException, InterruptedException {
        int min = (int) Math.min(f0.f6302r, jVar.getLength());
        long j10 = (long) 0;
        if (jVar.getPosition() != j10) {
            pVar.f9610a = j10;
            return 1;
        }
        this.f12535b.M(min);
        jVar.h();
        jVar.k(this.f12535b.f14880a, 0, min);
        this.f12539f = i(this.f12535b);
        this.f12537d = true;
        return 0;
    }

    public final long i(w7.w wVar) {
        int d10 = wVar.d();
        for (int c10 = wVar.c(); c10 < d10 - 3; c10++) {
            if (f(wVar.f14880a, c10) == 442) {
                wVar.Q(c10 + 4);
                long l10 = l(wVar);
                if (l10 != c.f4201b) {
                    return l10;
                }
            }
        }
        return c.f4201b;
    }

    public final int j(j jVar, p pVar) throws IOException, InterruptedException {
        long length = jVar.getLength();
        int min = (int) Math.min(f0.f6302r, length);
        long j10 = length - ((long) min);
        if (jVar.getPosition() != j10) {
            pVar.f9610a = j10;
            return 1;
        }
        this.f12535b.M(min);
        jVar.h();
        jVar.k(this.f12535b.f14880a, 0, min);
        this.f12540g = k(this.f12535b);
        this.f12538e = true;
        return 0;
    }

    public final long k(w7.w wVar) {
        int c10 = wVar.c();
        for (int d10 = wVar.d() - 4; d10 >= c10; d10--) {
            if (f(wVar.f14880a, d10) == 442) {
                wVar.Q(d10 + 4);
                long l10 = l(wVar);
                if (l10 != c.f4201b) {
                    return l10;
                }
            }
        }
        return c.f4201b;
    }
}
