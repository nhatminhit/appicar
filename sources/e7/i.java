package e7;

import android.net.Uri;
import b6.c;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import d.o0;
import d7.l;
import e7.g;
import g7.f;
import j6.e;
import j6.j;
import j6.p;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import t7.o;
import w7.j0;
import w7.l0;
import w7.q0;
import w7.w;
import x6.b;

public final class i extends l {
    public static final String H = "com.apple.streaming.transportStreamTimestamp";
    public static final AtomicInteger I = new AtomicInteger();
    public j6.i A;
    public boolean B;
    public o C;
    public int D;
    public boolean E;
    public volatile boolean F;
    public boolean G;

    /* renamed from: j  reason: collision with root package name */
    public final int f6921j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6922k;

    /* renamed from: l  reason: collision with root package name */
    public final Uri f6923l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public final t7.l f6924m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public final o f6925n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6926o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6927p;

    /* renamed from: q  reason: collision with root package name */
    public final j0 f6928q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f6929r;

    /* renamed from: s  reason: collision with root package name */
    public final g f6930s;
    @o0

    /* renamed from: t  reason: collision with root package name */
    public final List<Format> f6931t;
    @o0

    /* renamed from: u  reason: collision with root package name */
    public final DrmInitData f6932u;
    @o0

    /* renamed from: v  reason: collision with root package name */
    public final j6.i f6933v;

    /* renamed from: w  reason: collision with root package name */
    public final b f6934w;

    /* renamed from: x  reason: collision with root package name */
    public final w f6935x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f6936y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f6937z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(g gVar, t7.l lVar, o oVar, Format format, boolean z10, t7.l lVar2, @o0 o oVar2, boolean z11, Uri uri, @o0 List<Format> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, boolean z13, j0 j0Var, @o0 DrmInitData drmInitData, @o0 j6.i iVar, b bVar, w wVar, boolean z14) {
        super(lVar, oVar, format, i10, obj, j10, j11, j12);
        o oVar3 = oVar2;
        this.f6936y = z10;
        this.f6922k = i11;
        this.f6924m = lVar2;
        this.f6925n = oVar3;
        this.f6937z = z11;
        this.f6923l = uri;
        this.f6926o = z13;
        this.f6928q = j0Var;
        this.f6927p = z12;
        this.f6930s = gVar;
        this.f6931t = list;
        this.f6932u = drmInitData;
        this.f6933v = iVar;
        this.f6934w = bVar;
        this.f6935x = wVar;
        this.f6929r = z14;
        this.E = oVar3 != null;
        this.f6921j = I.getAndIncrement();
    }

    public static t7.l i(t7.l lVar, byte[] bArr, byte[] bArr2) {
        return bArr != null ? new a(lVar, bArr, bArr2) : lVar;
    }

    public static i j(g gVar, t7.l lVar, Format format, long j10, f fVar, int i10, Uri uri, @o0 List<Format> list, int i11, @o0 Object obj, boolean z10, r rVar, @o0 i iVar, @o0 byte[] bArr, @o0 byte[] bArr2) {
        t7.l lVar2;
        boolean z11;
        o oVar;
        boolean z12;
        w wVar;
        b bVar;
        j6.i iVar2;
        t7.l lVar3 = lVar;
        f fVar2 = fVar;
        int i12 = i10;
        i iVar3 = iVar;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        f.b bVar2 = fVar2.f8127o.get(i12);
        o oVar2 = new o(l0.e(fVar2.f8129a, bVar2.O), bVar2.X, bVar2.Y, (String) null);
        boolean z13 = bArr3 != null;
        t7.l i13 = i(lVar3, bArr3, z13 ? l(bVar2.W) : null);
        f.b bVar3 = bVar2.P;
        if (bVar3 != null) {
            boolean z14 = bArr4 != null;
            byte[] l10 = z14 ? l(bVar3.W) : null;
            o oVar3 = new o(l0.e(fVar2.f8129a, bVar3.O), bVar3.X, bVar3.Y, (String) null);
            t7.l i14 = i(lVar3, bArr4, l10);
            z11 = z14;
            lVar2 = i14;
            oVar = oVar3;
        } else {
            oVar = null;
            z11 = false;
            lVar2 = null;
        }
        long j11 = j10 + bVar2.T;
        long j12 = j11 + bVar2.Q;
        int i15 = fVar2.f8120h + bVar2.S;
        if (iVar3 != null) {
            b bVar4 = iVar3.f6934w;
            w wVar2 = iVar3.f6935x;
            boolean z15 = !uri.equals(iVar3.f6923l) || !iVar3.G;
            bVar = bVar4;
            wVar = wVar2;
            iVar2 = (!iVar3.B || iVar3.f6922k != i15 || z15) ? null : iVar3.A;
            z12 = z15;
        } else {
            Uri uri2 = uri;
            bVar = new b();
            wVar = new w(10);
            iVar2 = null;
            z12 = false;
        }
        return new i(gVar, i13, oVar2, format, z13, lVar2, oVar, z11, uri, list, i11, obj, j11, j12, fVar2.f8121i + ((long) i12), i15, bVar2.Z, z10, rVar.a(i15), bVar2.U, iVar2, bVar, wVar, z12);
    }

    public static byte[] l(String str) {
        if (q0.Y0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public void b() throws IOException, InterruptedException {
        j6.i iVar;
        if (this.A == null && (iVar = this.f6933v) != null) {
            this.A = iVar;
            this.B = true;
            this.E = false;
            this.C.H(this.f6921j, this.f6929r, true);
        }
        o();
        if (!this.F) {
            if (!this.f6927p) {
                n();
            }
            this.G = true;
        }
    }

    public void c() {
        this.F = true;
    }

    public boolean h() {
        return this.G;
    }

    public final void k(t7.l lVar, o oVar, boolean z10) throws IOException, InterruptedException {
        o oVar2;
        boolean z11;
        e q10;
        int i10 = 0;
        if (z10) {
            z11 = this.D != 0;
            oVar2 = oVar;
        } else {
            oVar2 = oVar.d((long) this.D);
            z11 = false;
        }
        try {
            q10 = q(lVar, oVar2);
            if (z11) {
                q10.i(this.D);
            }
            while (i10 == 0) {
                if (this.F) {
                    break;
                }
                i10 = this.A.f(q10, (p) null);
            }
            this.D = (int) (q10.getPosition() - oVar.f13134e);
            q0.r(lVar);
        } catch (Throwable th2) {
            q0.r(lVar);
            throw th2;
        }
    }

    public void m(o oVar) {
        this.C = oVar;
    }

    public final void n() throws IOException, InterruptedException {
        if (!this.f6926o) {
            this.f6928q.j();
        } else if (this.f6928q.c() == Long.MAX_VALUE) {
            this.f6928q.h(this.f6520f);
        }
        k(this.f6522h, this.f6515a, this.f6936y);
    }

    public final void o() throws IOException, InterruptedException {
        if (this.E) {
            k(this.f6924m, this.f6925n, this.f6937z);
            this.D = 0;
            this.E = false;
        }
    }

    public final long p(j jVar) throws IOException, InterruptedException {
        jVar.h();
        try {
            jVar.k(this.f6935x.f14880a, 0, 10);
            this.f6935x.M(10);
            if (this.f6935x.G() != b.f15129d) {
                return c.f4201b;
            }
            this.f6935x.R(3);
            int C2 = this.f6935x.C();
            int i10 = C2 + 10;
            if (i10 > this.f6935x.b()) {
                w wVar = this.f6935x;
                byte[] bArr = wVar.f14880a;
                wVar.M(i10);
                System.arraycopy(bArr, 0, this.f6935x.f14880a, 0, 10);
            }
            jVar.k(this.f6935x.f14880a, 10, C2);
            Metadata d10 = this.f6934w.d(this.f6935x.f14880a, C2);
            if (d10 == null) {
                return c.f4201b;
            }
            int d11 = d10.d();
            for (int i11 = 0; i11 < d11; i11++) {
                Metadata.Entry c10 = d10.c(i11);
                if (c10 instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) c10;
                    if (H.equals(privFrame.P)) {
                        System.arraycopy(privFrame.Q, 0, this.f6935x.f14880a, 0, 8);
                        this.f6935x.M(8);
                        return this.f6935x.w() & 8589934591L;
                    }
                }
            }
            return c.f4201b;
        } catch (EOFException unused) {
        }
    }

    public final e q(t7.l lVar, o oVar) throws IOException, InterruptedException {
        o oVar2 = oVar;
        e eVar = new e(lVar, oVar2.f13134e, lVar.a(oVar));
        if (this.A != null) {
            return eVar;
        }
        long p10 = p(eVar);
        eVar.h();
        e eVar2 = eVar;
        g.a a10 = this.f6930s.a(this.f6933v, oVar2.f13130a, this.f6517c, this.f6931t, this.f6932u, this.f6928q, lVar.b(), eVar2);
        this.A = a10.f6916a;
        this.B = a10.f6918c;
        if (a10.f6917b) {
            this.C.b0(p10 != c.f4201b ? this.f6928q.b(p10) : this.f6520f);
        }
        this.C.H(this.f6921j, this.f6929r, false);
        this.A.g(this.C);
        return eVar2;
    }
}
