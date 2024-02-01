package n6;

import b6.c;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import d.o0;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.m;
import j6.n;
import j6.o;
import j6.p;
import j6.q;
import j6.s;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import w7.q0;
import w7.w;
import x6.b;

public final class e implements i {
    public static final int A = q0.T("Xing");
    public static final int B = q0.T("Info");
    public static final int C = q0.T("VBRI");
    public static final int D = 0;

    /* renamed from: s  reason: collision with root package name */
    public static final l f10891s = new c();

    /* renamed from: t  reason: collision with root package name */
    public static final int f10892t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f10893u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final b.a f10894v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final int f10895w = 131072;

    /* renamed from: x  reason: collision with root package name */
    public static final int f10896x = 16384;

    /* renamed from: y  reason: collision with root package name */
    public static final int f10897y = 10;

    /* renamed from: z  reason: collision with root package name */
    public static final int f10898z = -128000;

    /* renamed from: d  reason: collision with root package name */
    public final int f10899d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10900e;

    /* renamed from: f  reason: collision with root package name */
    public final w f10901f;

    /* renamed from: g  reason: collision with root package name */
    public final o f10902g;

    /* renamed from: h  reason: collision with root package name */
    public final m f10903h;

    /* renamed from: i  reason: collision with root package name */
    public final n f10904i;

    /* renamed from: j  reason: collision with root package name */
    public k f10905j;

    /* renamed from: k  reason: collision with root package name */
    public s f10906k;

    /* renamed from: l  reason: collision with root package name */
    public int f10907l;

    /* renamed from: m  reason: collision with root package name */
    public Metadata f10908m;

    /* renamed from: n  reason: collision with root package name */
    public b f10909n;

    /* renamed from: o  reason: collision with root package name */
    public long f10910o;

    /* renamed from: p  reason: collision with root package name */
    public long f10911p;

    /* renamed from: q  reason: collision with root package name */
    public long f10912q;

    /* renamed from: r  reason: collision with root package name */
    public int f10913r;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b extends q {
        long b();

        long e(long j10);
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(i10, c.f4201b);
    }

    public e(int i10, long j10) {
        this.f10899d = i10;
        this.f10900e = j10;
        this.f10901f = new w(10);
        this.f10902g = new o();
        this.f10903h = new m();
        this.f10910o = c.f4201b;
        this.f10904i = new n();
    }

    public static int i(w wVar, int i10) {
        if (wVar.d() >= i10 + 4) {
            wVar.Q(i10);
            int l10 = wVar.l();
            if (l10 == A || l10 == B) {
                return l10;
            }
        }
        if (wVar.d() < 40) {
            return 0;
        }
        wVar.Q(36);
        int l11 = wVar.l();
        int i11 = C;
        if (l11 == i11) {
            return i11;
        }
        return 0;
    }

    public static boolean j(int i10, long j10) {
        return ((long) (i10 & f10898z)) == (j10 & -128000);
    }

    public static /* synthetic */ i[] k() {
        return new i[]{new e()};
    }

    public static /* synthetic */ boolean l(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @o0
    public static b m(Metadata metadata, long j10) {
        if (metadata == null) {
            return null;
        }
        int d10 = metadata.d();
        for (int i10 = 0; i10 < d10; i10++) {
            Metadata.Entry c10 = metadata.c(i10);
            if (c10 instanceof MlltFrame) {
                return b.a(j10, (MlltFrame) c10);
            }
        }
        return null;
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        return q(jVar, true);
    }

    public final b e(j jVar) throws IOException, InterruptedException {
        jVar.k(this.f10901f.f14880a, 0, 4);
        this.f10901f.Q(0);
        o.b(this.f10901f.l(), this.f10902g);
        return new a(jVar.getLength(), jVar.getPosition(), this.f10902g);
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        j jVar2 = jVar;
        if (this.f10907l == 0) {
            try {
                q(jVar2, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f10909n == null) {
            b n10 = n(jVar);
            b m10 = m(this.f10908m, jVar.getPosition());
            if (m10 != null) {
                this.f10909n = m10;
            } else if (n10 != null) {
                this.f10909n = n10;
            }
            b bVar = this.f10909n;
            if (bVar == null || (!bVar.d() && (this.f10899d & 1) != 0)) {
                this.f10909n = e(jVar);
            }
            this.f10905j.q(this.f10909n);
            s sVar = this.f10906k;
            o oVar = this.f10902g;
            String str = oVar.f9604b;
            int i10 = oVar.f9607e;
            int i11 = oVar.f9606d;
            m mVar = this.f10903h;
            sVar.d(Format.p((String) null, str, (String) null, -1, 4096, i10, i11, -1, mVar.f9592a, mVar.f9593b, (List<byte[]>) null, (DrmInitData) null, 0, (String) null, (this.f10899d & 2) != 0 ? null : this.f10908m));
            this.f10912q = jVar.getPosition();
        } else if (this.f10912q != 0) {
            long position = jVar.getPosition();
            long j10 = this.f10912q;
            if (position < j10) {
                jVar2.i((int) (j10 - position));
            }
        }
        return p(jVar);
    }

    public void g(k kVar) {
        this.f10905j = kVar;
        this.f10906k = kVar.a(0, 1);
        this.f10905j.r();
    }

    public void h(long j10, long j11) {
        this.f10907l = 0;
        this.f10910o = c.f4201b;
        this.f10911p = 0;
        this.f10913r = 0;
    }

    public final b n(j jVar) throws IOException, InterruptedException {
        w wVar = new w(this.f10902g.f9605c);
        jVar.k(wVar.f14880a, 0, this.f10902g.f9605c);
        o oVar = this.f10902g;
        int i10 = oVar.f9603a & 1;
        int i11 = 21;
        int i12 = oVar.f9607e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int i14 = i(wVar, i13);
        if (i14 == A || i14 == B) {
            g a10 = g.a(jVar.getLength(), jVar.getPosition(), this.f10902g, wVar);
            if (a10 != null && !this.f10903h.a()) {
                jVar.h();
                jVar.e(i13 + 141);
                jVar.k(this.f10901f.f14880a, 0, 3);
                this.f10901f.Q(0);
                this.f10903h.d(this.f10901f.G());
            }
            jVar.i(this.f10902g.f9605c);
            return (a10 == null || a10.d() || i14 != B) ? a10 : e(jVar);
        } else if (i14 == C) {
            f a11 = f.a(jVar.getLength(), jVar.getPosition(), this.f10902g, wVar);
            jVar.i(this.f10902g.f9605c);
            return a11;
        } else {
            jVar.h();
            return null;
        }
    }

    public final boolean o(j jVar) throws IOException, InterruptedException {
        b bVar = this.f10909n;
        if (bVar != null) {
            long b10 = bVar.b();
            if (b10 != -1 && jVar.d() > b10 - 4) {
                return true;
            }
        }
        try {
            return !jVar.c(this.f10901f.f14880a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int p(j jVar) throws IOException, InterruptedException {
        if (this.f10913r == 0) {
            jVar.h();
            if (o(jVar)) {
                return -1;
            }
            this.f10901f.Q(0);
            int l10 = this.f10901f.l();
            if (!j(l10, (long) this.f10907l) || o.a(l10) == -1) {
                jVar.i(1);
                this.f10907l = 0;
                return 0;
            }
            o.b(l10, this.f10902g);
            if (this.f10910o == c.f4201b) {
                this.f10910o = this.f10909n.e(jVar.getPosition());
                if (this.f10900e != c.f4201b) {
                    this.f10910o += this.f10900e - this.f10909n.e(0);
                }
            }
            this.f10913r = this.f10902g.f9605c;
        }
        int b10 = this.f10906k.b(jVar, this.f10913r, true);
        if (b10 == -1) {
            return -1;
        }
        int i10 = this.f10913r - b10;
        this.f10913r = i10;
        if (i10 > 0) {
            return 0;
        }
        long j10 = this.f10910o;
        o oVar = this.f10902g;
        this.f10906k.c(j10 + ((this.f10911p * 1000000) / ((long) oVar.f9606d)), 1, oVar.f9605c, 0, (s.a) null);
        this.f10911p += (long) this.f10902g.f9609g;
        this.f10913r = 0;
        return 0;
    }

    public final boolean q(j jVar, boolean z10) throws IOException, InterruptedException {
        int i10;
        int i11;
        int a10;
        int i12 = z10 ? 16384 : 131072;
        jVar.h();
        if (jVar.getPosition() == 0) {
            Metadata a11 = this.f10904i.a(jVar, (this.f10899d & 2) == 0 ? null : f10894v);
            this.f10908m = a11;
            if (a11 != null) {
                this.f10903h.c(a11);
            }
            i11 = (int) jVar.d();
            if (!z10) {
                jVar.i(i11);
            }
            i10 = 0;
        } else {
            i11 = 0;
            i10 = 0;
        }
        int i13 = i10;
        int i14 = i13;
        while (true) {
            if (!o(jVar)) {
                this.f10901f.Q(0);
                int l10 = this.f10901f.l();
                if ((i10 == 0 || j(l10, (long) i10)) && (a10 = o.a(l10)) != -1) {
                    i13++;
                    if (i13 != 1) {
                        if (i13 == 4) {
                            break;
                        }
                    } else {
                        o.b(l10, this.f10902g);
                        i10 = l10;
                    }
                    jVar.e(a10 - 4);
                } else {
                    int i15 = i14 + 1;
                    if (i14 != i12) {
                        if (z10) {
                            jVar.h();
                            jVar.e(i11 + i15);
                        } else {
                            jVar.i(1);
                        }
                        i13 = 0;
                        i14 = i15;
                        i10 = 0;
                    } else if (z10) {
                        return false;
                    } else {
                        throw new j0("Searched too many bytes.");
                    }
                }
            } else if (i13 <= 0) {
                throw new EOFException();
            }
        }
        if (z10) {
            jVar.i(i11 + i14);
        } else {
            jVar.h();
        }
        this.f10907l = i10;
        return true;
    }
}
