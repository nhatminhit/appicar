package r6;

import b6.c;
import j6.j;
import j6.p;
import java.io.IOException;
import w7.j0;
import w7.q0;
import w7.w;

public final class e0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f12172i = 112800;

    /* renamed from: a  reason: collision with root package name */
    public final j0 f12173a = new j0(0);

    /* renamed from: b  reason: collision with root package name */
    public final w f12174b = new w();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12175c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12176d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12177e;

    /* renamed from: f  reason: collision with root package name */
    public long f12178f = c.f4201b;

    /* renamed from: g  reason: collision with root package name */
    public long f12179g = c.f4201b;

    /* renamed from: h  reason: collision with root package name */
    public long f12180h = c.f4201b;

    public final int a(j jVar) {
        this.f12174b.N(q0.f14791f);
        this.f12175c = true;
        jVar.h();
        return 0;
    }

    public long b() {
        return this.f12180h;
    }

    public j0 c() {
        return this.f12173a;
    }

    public boolean d() {
        return this.f12175c;
    }

    public int e(j jVar, p pVar, int i10) throws IOException, InterruptedException {
        if (i10 <= 0) {
            return a(jVar);
        }
        if (!this.f12177e) {
            return h(jVar, pVar, i10);
        }
        if (this.f12179g == c.f4201b) {
            return a(jVar);
        }
        if (!this.f12176d) {
            return f(jVar, pVar, i10);
        }
        long j10 = this.f12178f;
        if (j10 == c.f4201b) {
            return a(jVar);
        }
        this.f12180h = this.f12173a.b(this.f12179g) - this.f12173a.b(j10);
        return a(jVar);
    }

    public final int f(j jVar, p pVar, int i10) throws IOException, InterruptedException {
        int min = (int) Math.min(112800, jVar.getLength());
        long j10 = (long) 0;
        if (jVar.getPosition() != j10) {
            pVar.f9610a = j10;
            return 1;
        }
        this.f12174b.M(min);
        jVar.h();
        jVar.k(this.f12174b.f14880a, 0, min);
        this.f12178f = g(this.f12174b, i10);
        this.f12176d = true;
        return 0;
    }

    public final long g(w wVar, int i10) {
        int d10 = wVar.d();
        for (int c10 = wVar.c(); c10 < d10; c10++) {
            if (wVar.f14880a[c10] == 71) {
                long b10 = i0.b(wVar, c10, i10);
                if (b10 != c.f4201b) {
                    return b10;
                }
            }
        }
        return c.f4201b;
    }

    public final int h(j jVar, p pVar, int i10) throws IOException, InterruptedException {
        long length = jVar.getLength();
        int min = (int) Math.min(112800, length);
        long j10 = length - ((long) min);
        if (jVar.getPosition() != j10) {
            pVar.f9610a = j10;
            return 1;
        }
        this.f12174b.M(min);
        jVar.h();
        jVar.k(this.f12174b.f14880a, 0, min);
        this.f12179g = i(this.f12174b, i10);
        this.f12177e = true;
        return 0;
    }

    public final long i(w wVar, int i10) {
        int c10 = wVar.c();
        int d10 = wVar.d();
        while (true) {
            d10--;
            if (d10 < c10) {
                return c.f4201b;
            }
            if (wVar.f14880a[d10] == 71) {
                long b10 = i0.b(wVar, d10, i10);
                if (b10 != c.f4201b) {
                    return b10;
                }
            }
        }
    }
}
