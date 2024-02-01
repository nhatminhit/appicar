package q6;

import b6.c;
import b6.j0;
import com.google.android.exoplayer2.Format;
import j6.i;
import j6.j;
import j6.k;
import j6.p;
import j6.q;
import j6.s;
import java.io.IOException;
import w7.q0;
import w7.w;

public final class a implements i {

    /* renamed from: l  reason: collision with root package name */
    public static final int f12002l = 9;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12003m = 8;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12004n = q0.T("RCC\u0001");

    /* renamed from: o  reason: collision with root package name */
    public static final int f12005o = 4;

    /* renamed from: p  reason: collision with root package name */
    public static final int f12006p = 8;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12007q = 0;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12008r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12009s = 2;

    /* renamed from: d  reason: collision with root package name */
    public final Format f12010d;

    /* renamed from: e  reason: collision with root package name */
    public final w f12011e = new w(9);

    /* renamed from: f  reason: collision with root package name */
    public s f12012f;

    /* renamed from: g  reason: collision with root package name */
    public int f12013g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f12014h;

    /* renamed from: i  reason: collision with root package name */
    public long f12015i;

    /* renamed from: j  reason: collision with root package name */
    public int f12016j;

    /* renamed from: k  reason: collision with root package name */
    public int f12017k;

    public a(Format format) {
        this.f12010d = format;
    }

    public void a() {
    }

    public final boolean b(j jVar) throws IOException, InterruptedException {
        this.f12011e.L();
        if (!jVar.a(this.f12011e.f14880a, 0, 8, true)) {
            return false;
        }
        if (this.f12011e.l() == f12004n) {
            this.f12014h = this.f12011e.D();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        this.f12011e.L();
        jVar.k(this.f12011e.f14880a, 0, 8);
        return this.f12011e.l() == f12004n;
    }

    public final void d(j jVar) throws IOException, InterruptedException {
        while (this.f12016j > 0) {
            this.f12011e.L();
            jVar.readFully(this.f12011e.f14880a, 0, 3);
            this.f12012f.a(this.f12011e, 3);
            this.f12017k += 3;
            this.f12016j--;
        }
        int i10 = this.f12017k;
        if (i10 > 0) {
            this.f12012f.c(this.f12015i, 1, i10, 0, (s.a) null);
        }
    }

    public final boolean e(j jVar) throws IOException, InterruptedException {
        long w10;
        this.f12011e.L();
        int i10 = this.f12014h;
        if (i10 == 0) {
            if (!jVar.a(this.f12011e.f14880a, 0, 5, true)) {
                return false;
            }
            w10 = (this.f12011e.F() * 1000) / 45;
        } else if (i10 != 1) {
            throw new j0("Unsupported version number: " + this.f12014h);
        } else if (!jVar.a(this.f12011e.f14880a, 0, 9, true)) {
            return false;
        } else {
            w10 = this.f12011e.w();
        }
        this.f12015i = w10;
        this.f12016j = this.f12011e.D();
        this.f12017k = 0;
        return true;
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.f12013g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        d(jVar);
                        this.f12013g = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (e(jVar)) {
                    this.f12013g = 2;
                } else {
                    this.f12013g = 0;
                    return -1;
                }
            } else if (!b(jVar)) {
                return -1;
            } else {
                this.f12013g = 1;
            }
        }
    }

    public void g(k kVar) {
        kVar.q(new q.b(c.f4201b));
        this.f12012f = kVar.a(0, 3);
        kVar.r();
        this.f12012f.d(this.f12010d);
    }

    public void h(long j10, long j11) {
        this.f12013g = 0;
    }
}
