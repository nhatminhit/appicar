package p6;

import com.google.android.exoplayer2.Format;
import j6.j;
import j6.k;
import j6.p;
import j6.q;
import j6.s;
import java.io.IOException;
import w7.w;

public abstract class i {

    /* renamed from: n  reason: collision with root package name */
    public static final int f11576n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f11577o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f11578p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f11579q = 3;

    /* renamed from: a  reason: collision with root package name */
    public final e f11580a = new e();

    /* renamed from: b  reason: collision with root package name */
    public s f11581b;

    /* renamed from: c  reason: collision with root package name */
    public k f11582c;

    /* renamed from: d  reason: collision with root package name */
    public g f11583d;

    /* renamed from: e  reason: collision with root package name */
    public long f11584e;

    /* renamed from: f  reason: collision with root package name */
    public long f11585f;

    /* renamed from: g  reason: collision with root package name */
    public long f11586g;

    /* renamed from: h  reason: collision with root package name */
    public int f11587h;

    /* renamed from: i  reason: collision with root package name */
    public int f11588i;

    /* renamed from: j  reason: collision with root package name */
    public b f11589j;

    /* renamed from: k  reason: collision with root package name */
    public long f11590k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11591l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11592m;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Format f11593a;

        /* renamed from: b  reason: collision with root package name */
        public g f11594b;
    }

    public static final class c implements g {
        public c() {
        }

        public long a(j jVar) {
            return -1;
        }

        public q c() {
            return new q.b(b6.c.f4201b);
        }

        public void f(long j10) {
        }
    }

    public long a(long j10) {
        return (j10 * 1000000) / ((long) this.f11588i);
    }

    public long b(long j10) {
        return (((long) this.f11588i) * j10) / 1000000;
    }

    public void c(k kVar, s sVar) {
        this.f11582c = kVar;
        this.f11581b = sVar;
        j(true);
    }

    public void d(long j10) {
        this.f11586g = j10;
    }

    public abstract long e(w wVar);

    public final int f(j jVar, p pVar) throws IOException, InterruptedException {
        int i10 = this.f11587h;
        if (i10 == 0) {
            return g(jVar);
        }
        if (i10 == 1) {
            jVar.i((int) this.f11585f);
            this.f11587h = 2;
            return 0;
        } else if (i10 == 2) {
            return i(jVar, pVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public final int g(j jVar) throws IOException, InterruptedException {
        boolean z10 = true;
        while (z10) {
            if (!this.f11580a.d(jVar)) {
                this.f11587h = 3;
                return -1;
            }
            this.f11590k = jVar.getPosition() - this.f11585f;
            z10 = h(this.f11580a.c(), this.f11585f, this.f11589j);
            if (z10) {
                this.f11585f = jVar.getPosition();
            }
        }
        j jVar2 = jVar;
        Format format = this.f11589j.f11593a;
        this.f11588i = format.f5078k0;
        if (!this.f11592m) {
            this.f11581b.d(format);
            this.f11592m = true;
        }
        g gVar = this.f11589j.f11594b;
        if (gVar != null) {
            this.f11583d = gVar;
        } else if (jVar.getLength() == -1) {
            this.f11583d = new c();
        } else {
            f b10 = this.f11580a.b();
            this.f11583d = new a(this, this.f11585f, jVar.getLength(), (long) (b10.f11567h + b10.f11568i), b10.f11562c, (b10.f11561b & 4) != 0);
        }
        this.f11589j = null;
        this.f11587h = 2;
        this.f11580a.f();
        return 0;
    }

    public abstract boolean h(w wVar, long j10, b bVar) throws IOException, InterruptedException;

    public final int i(j jVar, p pVar) throws IOException, InterruptedException {
        j jVar2 = jVar;
        long a10 = this.f11583d.a(jVar2);
        if (a10 >= 0) {
            pVar.f9610a = a10;
            return 1;
        }
        if (a10 < -1) {
            d(-(a10 + 2));
        }
        if (!this.f11591l) {
            this.f11582c.q(this.f11583d.c());
            this.f11591l = true;
        }
        if (this.f11590k > 0 || this.f11580a.d(jVar2)) {
            this.f11590k = 0;
            w c10 = this.f11580a.c();
            long e10 = e(c10);
            if (e10 >= 0) {
                long j10 = this.f11586g;
                if (j10 + e10 >= this.f11584e) {
                    long a11 = a(j10);
                    this.f11581b.a(c10, c10.d());
                    this.f11581b.c(a11, 1, c10.d(), 0, (s.a) null);
                    this.f11584e = -1;
                }
            }
            this.f11586g += e10;
            return 0;
        }
        this.f11587h = 3;
        return -1;
    }

    public void j(boolean z10) {
        int i10;
        if (z10) {
            this.f11589j = new b();
            this.f11585f = 0;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f11587h = i10;
        this.f11584e = -1;
        this.f11586g = 0;
    }

    public final void k(long j10, long j11) {
        this.f11580a.e();
        if (j10 == 0) {
            j(!this.f11591l);
        } else if (this.f11587h != 0) {
            long b10 = b(j11);
            this.f11584e = b10;
            this.f11583d.f(b10);
            this.f11587h = 2;
        }
    }
}
