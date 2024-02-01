package d7;

import b6.c;
import com.google.android.exoplayer2.Format;
import d.o0;
import d7.e;
import j6.e;
import j6.i;
import j6.p;
import java.io.IOException;
import t7.l;
import t7.o;
import t7.p0;
import w7.a;
import w7.q0;

public final class k extends d {

    /* renamed from: l  reason: collision with root package name */
    public static final p f6553l = new p();

    /* renamed from: i  reason: collision with root package name */
    public final e f6554i;

    /* renamed from: j  reason: collision with root package name */
    public long f6555j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f6556k;

    public k(l lVar, o oVar, Format format, int i10, @o0 Object obj, e eVar) {
        super(lVar, oVar, 2, format, i10, obj, c.f4201b, c.f4201b);
        this.f6554i = eVar;
    }

    public void b() throws IOException, InterruptedException {
        e eVar;
        o d10 = this.f6515a.d(this.f6555j);
        try {
            p0 p0Var = this.f6522h;
            eVar = new e(p0Var, d10.f13134e, p0Var.a(d10));
            if (this.f6555j == 0) {
                this.f6554i.d((e.b) null, c.f4201b, c.f4201b);
            }
            i iVar = this.f6554i.O;
            boolean z10 = false;
            int i10 = 0;
            while (i10 == 0 && !this.f6556k) {
                i10 = iVar.f(eVar, f6553l);
            }
            if (i10 != 1) {
                z10 = true;
            }
            a.i(z10);
            this.f6555j = eVar.getPosition() - this.f6515a.f13134e;
            q0.r(this.f6522h);
        } catch (Throwable th2) {
            q0.r(this.f6522h);
            throw th2;
        }
    }

    public void c() {
        this.f6556k = true;
    }
}
