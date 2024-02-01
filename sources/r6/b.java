package r6;

import b6.c;
import d6.a;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.q;
import java.io.IOException;
import r6.h0;
import w7.q0;
import w7.w;

public final class b implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final l f12127h = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final int f12128i = 8192;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12129j = 2935;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12130k = 2786;

    /* renamed from: l  reason: collision with root package name */
    public static final int f12131l = q0.T("ID3");

    /* renamed from: d  reason: collision with root package name */
    public final long f12132d;

    /* renamed from: e  reason: collision with root package name */
    public final c f12133e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12134f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12135g;

    public b() {
        this(0);
    }

    public b(long j10) {
        this.f12132d = j10;
        this.f12133e = new c();
        this.f12134f = new w((int) f12130k);
    }

    public static /* synthetic */ i[] d() {
        return new i[]{new b()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        w wVar = new w(10);
        int i10 = 0;
        while (true) {
            jVar.k(wVar.f14880a, 0, 10);
            wVar.Q(0);
            if (wVar.G() != f12131l) {
                break;
            }
            wVar.R(3);
            int C = wVar.C();
            i10 += C + 10;
            jVar.e(C);
        }
        jVar.h();
        jVar.e(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            jVar.k(wVar.f14880a, 0, 6);
            wVar.Q(0);
            if (wVar.J() != 2935) {
                jVar.h();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                jVar.e(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int f10 = a.f(wVar.f14880a);
                if (f10 == -1) {
                    return false;
                }
                jVar.e(f10 - 6);
            }
        }
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        int read = jVar.read(this.f12134f.f14880a, 0, f12130k);
        if (read == -1) {
            return -1;
        }
        this.f12134f.Q(0);
        this.f12134f.P(read);
        if (!this.f12135g) {
            this.f12133e.f(this.f12132d, 4);
            this.f12135g = true;
        }
        this.f12133e.b(this.f12134f);
        return 0;
    }

    public void g(k kVar) {
        this.f12133e.e(kVar, new h0.e(0, 1));
        kVar.r();
        kVar.q(new q.b(c.f4201b));
    }

    public void h(long j10, long j11) {
        this.f12135g = false;
        this.f12133e.c();
    }
}
