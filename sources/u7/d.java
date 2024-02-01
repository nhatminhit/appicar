package u7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t7.a0;
import t7.j;
import t7.l;
import t7.m;
import t7.o;
import t7.q0;
import t7.r0;
import u7.a;

public final class d implements l {
    public static final int A = 4;
    public static final int B = -1;
    public static final int C = 0;
    public static final int D = 1;
    public static final long E = 102400;

    /* renamed from: y  reason: collision with root package name */
    public static final int f13784y = 1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f13785z = 2;

    /* renamed from: b  reason: collision with root package name */
    public final a f13786b;

    /* renamed from: c  reason: collision with root package name */
    public final l f13787c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final l f13788d;

    /* renamed from: e  reason: collision with root package name */
    public final l f13789e;

    /* renamed from: f  reason: collision with root package name */
    public final i f13790f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final b f13791g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13792h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13793i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f13794j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public l f13795k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13796l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public Uri f13797m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public Uri f13798n;

    /* renamed from: o  reason: collision with root package name */
    public int f13799o;

    /* renamed from: p  reason: collision with root package name */
    public int f13800p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public String f13801q;

    /* renamed from: r  reason: collision with root package name */
    public long f13802r;

    /* renamed from: s  reason: collision with root package name */
    public long f13803s;
    @o0

    /* renamed from: t  reason: collision with root package name */
    public j f13804t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f13805u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f13806v;

    /* renamed from: w  reason: collision with root package name */
    public long f13807w;

    /* renamed from: x  reason: collision with root package name */
    public long f13808x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public interface b {
        void a(int i10);

        void b(long j10, long j11);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public d(a aVar, l lVar) {
        this(aVar, lVar, 0);
    }

    public d(a aVar, l lVar, int i10) {
        this(aVar, lVar, new a0(), new b(aVar, b.f13766l), i10, (b) null);
    }

    public d(a aVar, l lVar, l lVar2, @o0 j jVar, int i10, @o0 b bVar) {
        this(aVar, lVar, lVar2, jVar, i10, bVar, (i) null);
    }

    public d(a aVar, l lVar, l lVar2, @o0 j jVar, int i10, @o0 b bVar, @o0 i iVar) {
        this.f13786b = aVar;
        this.f13787c = lVar2;
        this.f13790f = iVar == null ? l.f13832b : iVar;
        boolean z10 = false;
        this.f13792h = (i10 & 1) != 0;
        this.f13793i = (i10 & 2) != 0;
        this.f13794j = (i10 & 4) != 0 ? true : z10;
        this.f13789e = lVar;
        this.f13788d = jVar != null ? new q0(lVar, jVar) : null;
        this.f13791g = bVar;
    }

    public static Uri i(a aVar, String str, Uri uri) {
        Uri b10 = p.b(aVar.d(str));
        return b10 != null ? b10 : uri;
    }

    public long a(o oVar) throws IOException {
        try {
            String a10 = this.f13790f.a(oVar);
            this.f13801q = a10;
            Uri uri = oVar.f13130a;
            this.f13797m = uri;
            this.f13798n = i(this.f13786b, a10, uri);
            this.f13799o = oVar.f13131b;
            this.f13800p = oVar.f13138i;
            this.f13802r = oVar.f13135f;
            int s10 = s(oVar);
            boolean z10 = s10 != -1;
            this.f13806v = z10;
            if (z10) {
                p(s10);
            }
            long j10 = oVar.f13136g;
            if (j10 == -1) {
                if (!this.f13806v) {
                    long a11 = p.a(this.f13786b.d(this.f13801q));
                    this.f13803s = a11;
                    if (a11 != -1) {
                        long j11 = a11 - oVar.f13135f;
                        this.f13803s = j11;
                        if (j11 <= 0) {
                            throw new m(0);
                        }
                    }
                    q(false);
                    return this.f13803s;
                }
            }
            this.f13803s = j10;
            q(false);
            return this.f13803s;
        } catch (IOException e10) {
            j(e10);
            throw e10;
        }
    }

    public Map<String, List<String>> b() {
        return m() ? this.f13789e.b() : Collections.emptyMap();
    }

    public void close() throws IOException {
        this.f13797m = null;
        this.f13798n = null;
        this.f13799o = 1;
        o();
        try {
            h();
        } catch (IOException e10) {
            j(e10);
            throw e10;
        }
    }

    public void d(r0 r0Var) {
        this.f13787c.d(r0Var);
        this.f13789e.d(r0Var);
    }

    @o0
    public Uri g() {
        return this.f13798n;
    }

    public final void h() throws IOException {
        l lVar = this.f13795k;
        if (lVar != null) {
            try {
                lVar.close();
            } finally {
                this.f13795k = null;
                this.f13796l = false;
                j jVar = this.f13804t;
                if (jVar != null) {
                    this.f13786b.f(jVar);
                    this.f13804t = null;
                }
            }
        }
    }

    public final void j(IOException iOException) {
        if (l() || (iOException instanceof a.C0232a)) {
            this.f13805u = true;
        }
    }

    public final boolean k() {
        return this.f13795k == this.f13789e;
    }

    public final boolean l() {
        return this.f13795k == this.f13787c;
    }

    public final boolean m() {
        return !l();
    }

    public final boolean n() {
        return this.f13795k == this.f13788d;
    }

    public final void o() {
        b bVar = this.f13791g;
        if (bVar != null && this.f13807w > 0) {
            bVar.b(this.f13786b.k(), this.f13807w);
            this.f13807w = 0;
        }
    }

    public final void p(int i10) {
        b bVar = this.f13791g;
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(boolean r21) throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            boolean r0 = r1.f13806v
            r2 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r2
            goto L_0x002f
        L_0x0009:
            boolean r0 = r1.f13792h
            if (r0 == 0) goto L_0x0025
            u7.a r0 = r1.f13786b     // Catch:{ InterruptedException -> 0x0018 }
            java.lang.String r3 = r1.f13801q     // Catch:{ InterruptedException -> 0x0018 }
            long r4 = r1.f13802r     // Catch:{ InterruptedException -> 0x0018 }
            u7.j r0 = r0.o(r3, r4)     // Catch:{ InterruptedException -> 0x0018 }
            goto L_0x002f
        L_0x0018:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            r0.<init>()
            throw r0
        L_0x0025:
            u7.a r0 = r1.f13786b
            java.lang.String r3 = r1.f13801q
            long r4 = r1.f13802r
            u7.j r0 = r0.p(r3, r4)
        L_0x002f:
            r3 = -1
            if (r0 != 0) goto L_0x0054
            t7.l r5 = r1.f13789e
            t7.o r18 = new t7.o
            android.net.Uri r7 = r1.f13797m
            int r8 = r1.f13799o
            r9 = 0
            long r12 = r1.f13802r
            long r14 = r1.f13803s
            java.lang.String r10 = r1.f13801q
            int r11 = r1.f13800p
            r6 = r18
            r16 = r10
            r17 = r11
            r10 = r12
            r6.<init>(r7, r8, r9, r10, r12, r14, r16, r17)
        L_0x004e:
            r6 = r5
            r5 = r0
            r0 = r18
            goto L_0x00c1
        L_0x0054:
            boolean r5 = r0.R
            if (r5 == 0) goto L_0x0082
            java.io.File r5 = r0.S
            android.net.Uri r7 = android.net.Uri.fromFile(r5)
            long r5 = r1.f13802r
            long r8 = r0.P
            long r10 = r5 - r8
            long r5 = r0.Q
            long r5 = r5 - r10
            long r8 = r1.f13803s
            int r12 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x0071
            long r5 = java.lang.Math.min(r5, r8)
        L_0x0071:
            r12 = r5
            t7.o r18 = new t7.o
            long r8 = r1.f13802r
            java.lang.String r14 = r1.f13801q
            int r15 = r1.f13800p
            r6 = r18
            r6.<init>(r7, r8, r10, r12, r14, r15)
            t7.l r5 = r1.f13787c
            goto L_0x004e
        L_0x0082:
            boolean r5 = r0.d()
            if (r5 == 0) goto L_0x008b
            long r5 = r1.f13803s
            goto L_0x0097
        L_0x008b:
            long r5 = r0.Q
            long r7 = r1.f13803s
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0097
            long r5 = java.lang.Math.min(r5, r7)
        L_0x0097:
            r15 = r5
            t7.o r5 = new t7.o
            android.net.Uri r8 = r1.f13797m
            int r9 = r1.f13799o
            r10 = 0
            long r13 = r1.f13802r
            java.lang.String r6 = r1.f13801q
            int r11 = r1.f13800p
            r7 = r5
            r18 = r11
            r11 = r13
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r13, r15, r17, r18)
            t7.l r6 = r1.f13788d
            if (r6 == 0) goto L_0x00b8
            r19 = r5
            r5 = r0
            r0 = r19
            goto L_0x00c1
        L_0x00b8:
            t7.l r6 = r1.f13789e
            u7.a r7 = r1.f13786b
            r7.f(r0)
            r0 = r5
            r5 = r2
        L_0x00c1:
            boolean r7 = r1.f13806v
            if (r7 != 0) goto L_0x00d0
            t7.l r7 = r1.f13789e
            if (r6 != r7) goto L_0x00d0
            long r7 = r1.f13802r
            r9 = 102400(0x19000, double:5.05923E-319)
            long r7 = r7 + r9
            goto L_0x00d5
        L_0x00d0:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d5:
            r1.f13808x = r7
            if (r21 == 0) goto L_0x00f7
            boolean r7 = r20.k()
            w7.a.i(r7)
            t7.l r7 = r1.f13789e
            if (r6 != r7) goto L_0x00e5
            return
        L_0x00e5:
            r20.h()     // Catch:{ all -> 0x00e9 }
            goto L_0x00f7
        L_0x00e9:
            r0 = move-exception
            r2 = r0
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x00f6
            u7.a r0 = r1.f13786b
            r0.f(r5)
        L_0x00f6:
            throw r2
        L_0x00f7:
            if (r5 == 0) goto L_0x0101
            boolean r7 = r5.b()
            if (r7 == 0) goto L_0x0101
            r1.f13804t = r5
        L_0x0101:
            r1.f13795k = r6
            long r7 = r0.f13136g
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r7 = 1
            if (r5 != 0) goto L_0x010c
            r5 = r7
            goto L_0x010d
        L_0x010c:
            r5 = 0
        L_0x010d:
            r1.f13796l = r5
            long r5 = r6.a(r0)
            u7.r r0 = new u7.r
            r0.<init>()
            boolean r8 = r1.f13796l
            if (r8 == 0) goto L_0x0128
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0128
            r1.f13803s = r5
            long r3 = r1.f13802r
            long r3 = r3 + r5
            u7.r.h(r0, r3)
        L_0x0128:
            boolean r3 = r20.m()
            if (r3 == 0) goto L_0x0144
            t7.l r3 = r1.f13795k
            android.net.Uri r3 = r3.g()
            r1.f13798n = r3
            android.net.Uri r4 = r1.f13797m
            boolean r3 = r4.equals(r3)
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0141
            android.net.Uri r2 = r1.f13798n
        L_0x0141:
            u7.r.i(r0, r2)
        L_0x0144:
            boolean r2 = r20.n()
            if (r2 == 0) goto L_0x0151
            u7.a r2 = r1.f13786b
            java.lang.String r3 = r1.f13801q
            r2.l(r3, r0)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.d.q(boolean):void");
    }

    public final void r() throws IOException {
        this.f13803s = 0;
        if (n()) {
            r rVar = new r();
            r.h(rVar, this.f13802r);
            this.f13786b.l(this.f13801q, rVar);
        }
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f13803s == 0) {
            return -1;
        }
        try {
            if (this.f13802r >= this.f13808x) {
                q(true);
            }
            int read = this.f13795k.read(bArr, i10, i11);
            if (read != -1) {
                if (l()) {
                    this.f13807w += (long) read;
                }
                long j10 = (long) read;
                this.f13802r += j10;
                long j11 = this.f13803s;
                if (j11 != -1) {
                    this.f13803s = j11 - j10;
                }
            } else if (this.f13796l) {
                r();
            } else {
                long j12 = this.f13803s;
                if (j12 <= 0) {
                    if (j12 == -1) {
                    }
                }
                h();
                q(false);
                return read(bArr, i10, i11);
            }
            return read;
        } catch (IOException e10) {
            if (!this.f13796l || !l.h(e10)) {
                j(e10);
                throw e10;
            }
            r();
            return -1;
        }
    }

    public final int s(o oVar) {
        if (!this.f13793i || !this.f13805u) {
            return (!this.f13794j || oVar.f13136g != -1) ? -1 : 1;
        }
        return 0;
    }
}
