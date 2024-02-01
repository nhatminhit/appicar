package d7;

import b6.c;
import com.google.android.exoplayer2.Format;
import j6.e;
import j6.s;
import java.io.IOException;
import t7.l;
import w7.q0;

public final class o extends a {

    /* renamed from: n  reason: collision with root package name */
    public final int f6561n;

    /* renamed from: o  reason: collision with root package name */
    public final Format f6562o;

    /* renamed from: p  reason: collision with root package name */
    public long f6563p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6564q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(l lVar, t7.o oVar, Format format, int i10, Object obj, long j10, long j11, long j12, int i11, Format format2) {
        super(lVar, oVar, format, i10, obj, j10, j11, c.f4201b, c.f4201b, j12);
        this.f6561n = i11;
        this.f6562o = format2;
    }

    /* JADX INFO: finally extract failed */
    public void b() throws IOException, InterruptedException {
        try {
            long a10 = this.f6522h.a(this.f6515a.d(this.f6563p));
            if (a10 != -1) {
                a10 += this.f6563p;
            }
            e eVar = new e(this.f6522h, this.f6563p, a10);
            c j10 = j();
            j10.c(0);
            s a11 = j10.a(0, this.f6561n);
            a11.d(this.f6562o);
            for (int i10 = 0; i10 != -1; i10 = a11.b(eVar, Integer.MAX_VALUE, true)) {
                this.f6563p += (long) i10;
            }
            a11.c(this.f6520f, 1, (int) this.f6563p, 0, (s.a) null);
            q0.r(this.f6522h);
            this.f6564q = true;
        } catch (Throwable th2) {
            q0.r(this.f6522h);
            throw th2;
        }
    }

    public void c() {
    }

    public boolean h() {
        return this.f6564q;
    }
}
