package d7;

import b6.c;
import com.google.android.exoplayer2.Format;
import d7.e;
import j6.e;
import j6.p;
import java.io.IOException;
import t7.l;
import t7.o;
import t7.p0;
import w7.a;
import w7.q0;

public class i extends a {

    /* renamed from: t  reason: collision with root package name */
    public static final p f6543t = new p();

    /* renamed from: n  reason: collision with root package name */
    public final int f6544n;

    /* renamed from: o  reason: collision with root package name */
    public final long f6545o;

    /* renamed from: p  reason: collision with root package name */
    public final e f6546p;

    /* renamed from: q  reason: collision with root package name */
    public long f6547q;

    /* renamed from: r  reason: collision with root package name */
    public volatile boolean f6548r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6549s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(l lVar, o oVar, Format format, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(lVar, oVar, format, i10, obj, j10, j11, j12, j13, j14);
        this.f6544n = i11;
        this.f6545o = j15;
        this.f6546p = eVar;
    }

    public final void b() throws IOException, InterruptedException {
        e eVar;
        o d10 = this.f6515a.d(this.f6547q);
        try {
            p0 p0Var = this.f6522h;
            eVar = new e(p0Var, d10.f13134e, p0Var.a(d10));
            if (this.f6547q == 0) {
                c j10 = j();
                j10.c(this.f6545o);
                e eVar2 = this.f6546p;
                e.b l10 = l(j10);
                long j11 = this.f6505j;
                long j12 = j11 == c.f4201b ? -9223372036854775807L : j11 - this.f6545o;
                long j13 = this.f6506k;
                eVar2.d(l10, j12, j13 == c.f4201b ? -9223372036854775807L : j13 - this.f6545o);
            }
            j6.i iVar = this.f6546p.O;
            boolean z10 = false;
            int i10 = 0;
            while (i10 == 0 && !this.f6548r) {
                i10 = iVar.f(eVar, f6543t);
            }
            if (i10 != 1) {
                z10 = true;
            }
            a.i(z10);
            this.f6547q = eVar.getPosition() - this.f6515a.f13134e;
            q0.r(this.f6522h);
            this.f6549s = true;
        } catch (Throwable th2) {
            q0.r(this.f6522h);
            throw th2;
        }
    }

    public final void c() {
        this.f6548r = true;
    }

    public long g() {
        return this.f6557i + ((long) this.f6544n);
    }

    public boolean h() {
        return this.f6549s;
    }

    public e.b l(c cVar) {
        return cVar;
    }
}
