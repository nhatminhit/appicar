package r6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d6.b;
import j6.k;
import j6.s;
import java.util.List;
import r6.h0;
import w7.v;
import w7.w;

public final class f implements m {

    /* renamed from: n  reason: collision with root package name */
    public static final int f12181n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f12182o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f12183p = 2;

    /* renamed from: a  reason: collision with root package name */
    public final v f12184a;

    /* renamed from: b  reason: collision with root package name */
    public final w f12185b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12186c;

    /* renamed from: d  reason: collision with root package name */
    public String f12187d;

    /* renamed from: e  reason: collision with root package name */
    public s f12188e;

    /* renamed from: f  reason: collision with root package name */
    public int f12189f;

    /* renamed from: g  reason: collision with root package name */
    public int f12190g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f12191h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12192i;

    /* renamed from: j  reason: collision with root package name */
    public long f12193j;

    /* renamed from: k  reason: collision with root package name */
    public Format f12194k;

    /* renamed from: l  reason: collision with root package name */
    public int f12195l;

    /* renamed from: m  reason: collision with root package name */
    public long f12196m;

    public f() {
        this((String) null);
    }

    public f(String str) {
        v vVar = new v(new byte[16]);
        this.f12184a = vVar;
        this.f12185b = new w(vVar.f14876a);
        this.f12189f = 0;
        this.f12190g = 0;
        this.f12191h = false;
        this.f12192i = false;
        this.f12186c = str;
    }

    public final boolean a(w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.f12190g);
        wVar.i(bArr, this.f12190g, min);
        int i11 = this.f12190g + min;
        this.f12190g = i11;
        return i11 == i10;
    }

    public void b(w wVar) {
        while (wVar.a() > 0) {
            int i10 = this.f12189f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(wVar.a(), this.f12195l - this.f12190g);
                        this.f12188e.a(wVar, min);
                        int i11 = this.f12190g + min;
                        this.f12190g = i11;
                        int i12 = this.f12195l;
                        if (i11 == i12) {
                            this.f12188e.c(this.f12196m, 1, i12, 0, (s.a) null);
                            this.f12196m += this.f12193j;
                            this.f12189f = 0;
                        }
                    }
                } else if (a(wVar, this.f12185b.f14880a, 16)) {
                    g();
                    this.f12185b.Q(0);
                    this.f12188e.a(this.f12185b, 16);
                    this.f12189f = 2;
                }
            } else if (h(wVar)) {
                this.f12189f = 1;
                byte[] bArr = this.f12185b.f14880a;
                bArr[0] = -84;
                bArr[1] = (byte) (this.f12192i ? 65 : 64);
                this.f12190g = 2;
            }
        }
    }

    public void c() {
        this.f12189f = 0;
        this.f12190g = 0;
        this.f12191h = false;
        this.f12192i = false;
    }

    public void d() {
    }

    public void e(k kVar, h0.e eVar) {
        eVar.a();
        this.f12187d = eVar.b();
        this.f12188e = kVar.a(eVar.c(), 1);
    }

    public void f(long j10, int i10) {
        this.f12196m = j10;
    }

    public final void g() {
        this.f12184a.n(0);
        b.C0106b d10 = b.d(this.f12184a);
        Format format = this.f12194k;
        if (format == null || d10.f6257c != format.f5077j0 || d10.f6256b != format.f5078k0 || !w7.s.F.equals(format.W)) {
            Format r10 = Format.r(this.f12187d, w7.s.F, (String) null, -1, -1, d10.f6257c, d10.f6256b, (List<byte[]>) null, (DrmInitData) null, 0, this.f12186c);
            this.f12194k = r10;
            this.f12188e.d(r10);
        }
        this.f12195l = d10.f6258d;
        this.f12193j = (((long) d10.f6259e) * 1000000) / ((long) this.f12194k.f5078k0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean h(w7.w r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f12191h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.D()
            if (r0 != r2) goto L_0x0015
            r1 = r3
        L_0x0015:
            r5.f12191h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.D()
            if (r0 != r2) goto L_0x0020
            r2 = r3
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            r5.f12191h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = r3
        L_0x002e:
            r5.f12192i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.f.h(w7.w):boolean");
    }
}
