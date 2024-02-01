package r6;

import b6.c;
import d6.b;
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

public final class e implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final l f12163h = new d();

    /* renamed from: i  reason: collision with root package name */
    public static final int f12164i = 8192;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12165j = 16384;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12166k = 7;

    /* renamed from: l  reason: collision with root package name */
    public static final int f12167l = q0.T("ID3");

    /* renamed from: d  reason: collision with root package name */
    public final long f12168d;

    /* renamed from: e  reason: collision with root package name */
    public final f f12169e;

    /* renamed from: f  reason: collision with root package name */
    public final w f12170f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12171g;

    public e() {
        this(0);
    }

    public e(long j10) {
        this.f12168d = j10;
        this.f12169e = new f();
        this.f12170f = new w(16384);
    }

    public static /* synthetic */ i[] d() {
        return new i[]{new e()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        w wVar = new w(10);
        int i10 = 0;
        while (true) {
            jVar.k(wVar.f14880a, 0, 10);
            wVar.Q(0);
            if (wVar.G() != f12167l) {
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
            jVar.k(wVar.f14880a, 0, 7);
            wVar.Q(0);
            int J = wVar.J();
            if (J == 44096 || J == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int e10 = b.e(wVar.f14880a, J);
                if (e10 == -1) {
                    return false;
                }
                jVar.e(e10 - 7);
            } else {
                jVar.h();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                jVar.e(i12);
                i11 = 0;
            }
        }
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        int read = jVar.read(this.f12170f.f14880a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f12170f.Q(0);
        this.f12170f.P(read);
        if (!this.f12171g) {
            this.f12169e.f(this.f12168d, 4);
            this.f12171g = true;
        }
        this.f12169e.b(this.f12170f);
        return 0;
    }

    public void g(k kVar) {
        this.f12169e.e(kVar, new h0.e(0, 1));
        kVar.r();
        kVar.q(new q.b(c.f4201b));
    }

    public void h(long j10, long j11) {
        this.f12171g = false;
        this.f12169e.c();
    }
}
