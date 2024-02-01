package p6;

import d.g1;
import j6.j;
import j6.q;
import j6.r;
import java.io.EOFException;
import java.io.IOException;
import u0.m;
import w7.q0;

public final class a implements g {

    /* renamed from: p  reason: collision with root package name */
    public static final int f11512p = 72000;

    /* renamed from: q  reason: collision with root package name */
    public static final int f11513q = 100000;

    /* renamed from: r  reason: collision with root package name */
    public static final int f11514r = 30000;

    /* renamed from: s  reason: collision with root package name */
    public static final int f11515s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f11516t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11517u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11518v = 3;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11519w = 4;

    /* renamed from: d  reason: collision with root package name */
    public final f f11520d = new f();

    /* renamed from: e  reason: collision with root package name */
    public final long f11521e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11522f;

    /* renamed from: g  reason: collision with root package name */
    public final i f11523g;

    /* renamed from: h  reason: collision with root package name */
    public int f11524h;

    /* renamed from: i  reason: collision with root package name */
    public long f11525i;

    /* renamed from: j  reason: collision with root package name */
    public long f11526j;

    /* renamed from: k  reason: collision with root package name */
    public long f11527k;

    /* renamed from: l  reason: collision with root package name */
    public long f11528l;

    /* renamed from: m  reason: collision with root package name */
    public long f11529m;

    /* renamed from: n  reason: collision with root package name */
    public long f11530n;

    /* renamed from: o  reason: collision with root package name */
    public long f11531o;

    public final class b implements q {
        public b() {
        }

        public boolean d() {
            return true;
        }

        public q.a i(long j10) {
            return new q.a(new r(j10, q0.v((a.this.f11521e + ((a.this.f11523g.b(j10) * (a.this.f11522f - a.this.f11521e)) / a.this.f11525i)) - m.f13390a, a.this.f11521e, a.this.f11522f - 1)));
        }

        public long j() {
            return a.this.f11523g.a(a.this.f11525i);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        w7.a.a(j10 >= 0 && j11 > j10);
        this.f11523g = iVar;
        this.f11521e = j10;
        this.f11522f = j11;
        if (j12 == j11 - j10 || z10) {
            this.f11525i = j13;
            this.f11524h = 4;
            return;
        }
        this.f11524h = 0;
    }

    public long a(j jVar) throws IOException, InterruptedException {
        int i10 = this.f11524h;
        if (i10 == 0) {
            long position = jVar.getPosition();
            this.f11526j = position;
            this.f11524h = 1;
            long j10 = this.f11522f - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(jVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f11524h = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m(jVar);
            this.f11524h = 4;
            return -(this.f11530n + 2);
        }
        this.f11525i = j(jVar);
        this.f11524h = 4;
        return this.f11526j;
    }

    public void f(long j10) {
        this.f11527k = q0.v(j10, 0, this.f11525i - 1);
        this.f11524h = 2;
        this.f11528l = this.f11521e;
        this.f11529m = this.f11522f;
        this.f11530n = 0;
        this.f11531o = this.f11525i;
    }

    /* renamed from: h */
    public b c() {
        if (this.f11525i != 0) {
            return new b();
        }
        return null;
    }

    public final long i(j jVar) throws IOException, InterruptedException {
        j jVar2 = jVar;
        if (this.f11528l == this.f11529m) {
            return -1;
        }
        long position = jVar.getPosition();
        if (!l(jVar2, this.f11529m)) {
            long j10 = this.f11528l;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f11520d.a(jVar2, false);
        jVar.h();
        long j11 = this.f11527k;
        f fVar = this.f11520d;
        long j12 = fVar.f11562c;
        long j13 = j11 - j12;
        int i10 = fVar.f11567h + fVar.f11568i;
        if (0 <= j13 && j13 < 72000) {
            return -1;
        }
        int i11 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f11529m = position;
            this.f11531o = j12;
        } else {
            this.f11528l = jVar.getPosition() + ((long) i10);
            this.f11530n = this.f11520d.f11562c;
        }
        long j14 = this.f11529m;
        long j15 = this.f11528l;
        if (j14 - j15 < 100000) {
            this.f11529m = j15;
            return j15;
        }
        long position2 = jVar.getPosition() - (((long) i10) * (i11 <= 0 ? 2 : 1));
        long j16 = this.f11529m;
        long j17 = this.f11528l;
        return q0.v(position2 + ((j13 * (j16 - j17)) / (this.f11531o - this.f11530n)), j17, j16 - 1);
    }

    @g1
    public long j(j jVar) throws IOException, InterruptedException {
        k(jVar);
        this.f11520d.b();
        while ((this.f11520d.f11561b & 4) != 4 && jVar.getPosition() < this.f11522f) {
            this.f11520d.a(jVar, false);
            f fVar = this.f11520d;
            jVar.i(fVar.f11567h + fVar.f11568i);
        }
        return this.f11520d.f11562c;
    }

    @g1
    public void k(j jVar) throws IOException, InterruptedException {
        if (!l(jVar, this.f11522f)) {
            throw new EOFException();
        }
    }

    public final boolean l(j jVar, long j10) throws IOException, InterruptedException {
        int i10;
        long min = Math.min(j10 + 3, this.f11522f);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i12 = 0;
            if (jVar.getPosition() + ((long) i11) <= min || (i11 = (int) (min - jVar.getPosition())) >= 4) {
                jVar.c(bArr, 0, i11, false);
                while (true) {
                    i10 = i11 - 3;
                    if (i12 >= i10) {
                        break;
                    } else if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        jVar.i(i12);
                        return true;
                    } else {
                        i12++;
                    }
                }
            } else {
                return false;
            }
            jVar.i(i10);
        }
    }

    public final void m(j jVar) throws IOException, InterruptedException {
        f fVar = this.f11520d;
        while (true) {
            fVar.a(jVar, false);
            f fVar2 = this.f11520d;
            if (fVar2.f11562c <= this.f11527k) {
                jVar.i(fVar2.f11567h + fVar2.f11568i);
                this.f11528l = jVar.getPosition();
                fVar = this.f11520d;
                this.f11530n = fVar.f11562c;
            } else {
                jVar.h();
                return;
            }
        }
    }
}
