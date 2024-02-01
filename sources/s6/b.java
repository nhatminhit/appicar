package s6;

import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.p;
import j6.s;
import java.io.IOException;
import java.util.List;
import w7.a;

public final class b implements i {

    /* renamed from: i  reason: collision with root package name */
    public static final l f12638i = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final int f12639j = 32768;

    /* renamed from: d  reason: collision with root package name */
    public k f12640d;

    /* renamed from: e  reason: collision with root package name */
    public s f12641e;

    /* renamed from: f  reason: collision with root package name */
    public c f12642f;

    /* renamed from: g  reason: collision with root package name */
    public int f12643g;

    /* renamed from: h  reason: collision with root package name */
    public int f12644h;

    public static /* synthetic */ i[] d() {
        return new i[]{new b()};
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        return d.a(jVar) != null;
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        if (this.f12642f == null) {
            c a10 = d.a(jVar);
            this.f12642f = a10;
            if (a10 != null) {
                this.f12641e.d(Format.q((String) null, w7.s.f14841z, (String) null, a10.a(), 32768, this.f12642f.h(), this.f12642f.k(), this.f12642f.g(), (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.f12643g = this.f12642f.c();
            } else {
                throw new j0("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.f12642f.l()) {
            d.b(jVar, this.f12642f);
            this.f12640d.q(this.f12642f);
        } else if (jVar.getPosition() == 0) {
            jVar.i(this.f12642f.f());
        }
        long b10 = this.f12642f.b();
        a.i(b10 != -1);
        long position = b10 - jVar.getPosition();
        if (position <= 0) {
            return -1;
        }
        int b11 = this.f12641e.b(jVar, (int) Math.min((long) (32768 - this.f12644h), position), true);
        if (b11 != -1) {
            this.f12644h += b11;
        }
        int i10 = this.f12644h / this.f12643g;
        if (i10 > 0) {
            long e10 = this.f12642f.e(jVar.getPosition() - ((long) this.f12644h));
            int i11 = i10 * this.f12643g;
            int i12 = this.f12644h - i11;
            this.f12644h = i12;
            this.f12641e.c(e10, 1, i11, i12, (s.a) null);
        }
        return b11 == -1 ? -1 : 0;
    }

    public void g(k kVar) {
        this.f12640d = kVar;
        this.f12641e = kVar.a(0, 1);
        this.f12642f = null;
        kVar.r();
    }

    public void h(long j10, long j11) {
        this.f12644h = 0;
    }
}
