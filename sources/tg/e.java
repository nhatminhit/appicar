package tg;

import bh.b;
import ch.d;
import ch.p;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import og.c0;
import og.d0;
import og.g;
import og.g0;
import og.h0;
import og.j0;
import og.k0;
import og.l0;
import og.m;
import og.n0;
import og.x;
import og.z;
import ug.c;
import wg.f;
import wg.i;
import wg.n;
import yg.h;

public final class e extends f.j implements m {

    /* renamed from: r  reason: collision with root package name */
    public static final String f23243r = "throw with null exception";

    /* renamed from: s  reason: collision with root package name */
    public static final int f23244s = 21;

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ boolean f23245t = false;

    /* renamed from: b  reason: collision with root package name */
    public final g f23246b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f23247c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f23248d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f23249e;

    /* renamed from: f  reason: collision with root package name */
    public z f23250f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f23251g;

    /* renamed from: h  reason: collision with root package name */
    public f f23252h;

    /* renamed from: i  reason: collision with root package name */
    public ch.e f23253i;

    /* renamed from: j  reason: collision with root package name */
    public d f23254j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23255k;

    /* renamed from: l  reason: collision with root package name */
    public int f23256l;

    /* renamed from: m  reason: collision with root package name */
    public int f23257m;

    /* renamed from: n  reason: collision with root package name */
    public int f23258n;

    /* renamed from: o  reason: collision with root package name */
    public int f23259o = 1;

    /* renamed from: p  reason: collision with root package name */
    public final List<Reference<k>> f23260p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public long f23261q = Long.MAX_VALUE;

    public class a extends b.f {
        public final /* synthetic */ c R;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10, ch.e eVar, d dVar, c cVar) {
            super(z10, eVar, dVar);
            this.R = cVar;
        }

        public void close() throws IOException {
            this.R.a(-1, true, true, (IOException) null);
        }
    }

    public e(g gVar, n0 n0Var) {
        this.f23246b = gVar;
        this.f23247c = n0Var;
    }

    public static e x(g gVar, n0 n0Var, Socket socket, long j10) {
        e eVar = new e(gVar, n0Var);
        eVar.f23249e = socket;
        eVar.f23261q = j10;
        return eVar;
    }

    public h0 a() {
        return this.f23251g;
    }

    public n0 b() {
        return this.f23247c;
    }

    public z c() {
        return this.f23250f;
    }

    public Socket d() {
        return this.f23249e;
    }

    public void e(f fVar) {
        synchronized (this.f23246b) {
            this.f23259o = fVar.Y();
        }
    }

    public void f(i iVar) throws IOException {
        iVar.d(wg.b.REFUSED_STREAM, (IOException) null);
    }

    public void g() {
        pg.e.i(this.f23248d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(int r17, int r18, int r19, int r20, boolean r21, og.g r22, og.x r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            og.h0 r0 = r7.f23251g
            if (r0 != 0) goto L_0x0150
            og.n0 r0 = r7.f23247c
            og.a r0 = r0.a()
            java.util.List r0 = r0.b()
            tg.b r10 = new tg.b
            r10.<init>(r0)
            og.n0 r1 = r7.f23247c
            og.a r1 = r1.a()
            javax.net.ssl.SSLSocketFactory r1 = r1.k()
            if (r1 != 0) goto L_0x0074
            og.o r1 = og.o.f21736j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            og.n0 r0 = r7.f23247c
            og.a r0 = r0.a()
            og.c0 r0 = r0.l()
            java.lang.String r0 = r0.p()
            yg.h r1 = yg.h.m()
            boolean r1 = r1.s(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            tg.i r1 = new tg.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            tg.i r0 = new tg.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            og.n0 r0 = r7.f23247c
            og.a r0 = r0.a()
            java.util.List r0 = r0.f()
            og.h0 r1 = og.h0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            og.n0 r0 = r7.f23247c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.k(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f23248d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.i(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.n(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            og.n0 r0 = r7.f23247c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.d()     // Catch:{ IOException -> 0x00f5 }
            og.n0 r1 = r7.f23247c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.b()     // Catch:{ IOException -> 0x00f5 }
            og.h0 r2 = r7.f23251g     // Catch:{ IOException -> 0x00f5 }
            r9.e(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            og.n0 r0 = r7.f23247c
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f23248d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            tg.i r1 = new tg.i
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            wg.f r0 = r7.f23252h
            if (r0 == 0) goto L_0x00f4
            tg.g r1 = r7.f23246b
            monitor-enter(r1)
            wg.f r0 = r7.f23252h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.Y()     // Catch:{ all -> 0x00f1 }
            r7.f23259o = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f23249e
            pg.e.i(r1)
            java.net.Socket r1 = r7.f23248d
            pg.e.i(r1)
            r7.f23249e = r11
            r7.f23248d = r11
            r7.f23253i = r11
            r7.f23254j = r11
            r7.f23250f = r11
            r7.f23251g = r11
            r7.f23252h = r11
            og.n0 r1 = r7.f23247c
            java.net.InetSocketAddress r3 = r1.d()
            og.n0 r1 = r7.f23247c
            java.net.Proxy r4 = r1.b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.f(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            tg.i r12 = new tg.i
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            tg.i r0 = new tg.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.e.h(int, int, int, int, boolean, og.g, og.x):void");
    }

    public final void i(int i10, int i11, g gVar, x xVar) throws IOException {
        Proxy b10 = this.f23247c.b();
        this.f23248d = (b10.type() == Proxy.Type.DIRECT || b10.type() == Proxy.Type.HTTP) ? this.f23247c.a().j().createSocket() : new Socket(b10);
        xVar.g(gVar, this.f23247c.d(), b10);
        this.f23248d.setSoTimeout(i11);
        try {
            h.m().i(this.f23248d, this.f23247c.d(), i10);
            try {
                this.f23253i = p.d(p.n(this.f23248d));
                this.f23254j = p.c(p.i(this.f23248d));
            } catch (NullPointerException e10) {
                if (f23243r.equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f23247c.d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(tg.b r8) throws java.io.IOException {
        /*
            r7 = this;
            og.n0 r0 = r7.f23247c
            og.a r0 = r0.a()
            javax.net.ssl.SSLSocketFactory r1 = r0.k()
            r2 = 0
            java.net.Socket r3 = r7.f23248d     // Catch:{ AssertionError -> 0x012e }
            og.c0 r4 = r0.l()     // Catch:{ AssertionError -> 0x012e }
            java.lang.String r4 = r4.p()     // Catch:{ AssertionError -> 0x012e }
            og.c0 r5 = r0.l()     // Catch:{ AssertionError -> 0x012e }
            int r5 = r5.E()     // Catch:{ AssertionError -> 0x012e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x012e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x012e }
            og.o r8 = r8.a(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r8.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 == 0) goto L_0x0041
            yg.h r3 = yg.h.m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.c0 r4 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r4 = r4.p()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r0.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.h(r1, r4, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.z r4 = og.z.b(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.HostnameVerifier r5 = r0.e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.c0 r6 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r6 = r6.p()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.g()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.c0 r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.p()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = og.i.d(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r8 = ah.e.a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r2     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.c0 r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.p()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00d8:
            og.i r3 = r0.a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            og.c0 r0 = r0.l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.p()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r4.g()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.a(r0, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r8 = r8.f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r8 == 0) goto L_0x00f9
            yg.h r8 = yg.h.m()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r2 = r8.p(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00f9:
            r7.f23249e = r1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ch.a0 r8 = ch.p.n(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ch.e r8 = ch.p.d(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f23253i = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.net.Socket r8 = r7.f23249e     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ch.z r8 = ch.p.i(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ch.d r8 = ch.p.c(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f23254j = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f23250f = r4     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r2 == 0) goto L_0x011a
            og.h0 r8 = og.h0.a(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            goto L_0x011c
        L_0x011a:
            og.h0 r8 = og.h0.HTTP_1_1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x011c:
            r7.f23251g = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            yg.h r8 = yg.h.m()
            r8.a(r1)
            return
        L_0x0126:
            r8 = move-exception
            r2 = r1
            goto L_0x013c
        L_0x0129:
            r8 = move-exception
            r2 = r1
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            goto L_0x013c
        L_0x012e:
            r8 = move-exception
        L_0x012f:
            boolean r0 = pg.e.B(r8)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x013b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            r0.<init>(r8)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x013b:
            throw r8     // Catch:{ all -> 0x012c }
        L_0x013c:
            if (r2 == 0) goto L_0x0145
            yg.h r0 = yg.h.m()
            r0.a(r2)
        L_0x0145:
            pg.e.i(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.e.j(tg.b):void");
    }

    public final void k(int i10, int i11, int i12, g gVar, x xVar) throws IOException {
        j0 m10 = m();
        c0 k10 = m10.k();
        int i13 = 0;
        while (i13 < 21) {
            i(i10, i11, gVar, xVar);
            m10 = l(i11, i12, m10, k10);
            if (m10 != null) {
                pg.e.i(this.f23248d);
                this.f23248d = null;
                this.f23254j = null;
                this.f23253i = null;
                xVar.e(gVar, this.f23247c.d(), this.f23247c.b(), (h0) null);
                i13++;
            } else {
                return;
            }
        }
    }

    public final j0 l(int i10, int i11, j0 j0Var, c0 c0Var) throws IOException {
        String str = "CONNECT " + pg.e.t(c0Var, true) + " HTTP/1.1";
        while (true) {
            vg.a aVar = new vg.a((g0) null, (e) null, this.f23253i, this.f23254j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f23253i.b().i((long) i10, timeUnit);
            this.f23254j.b().i((long) i11, timeUnit);
            aVar.D(j0Var.e(), str);
            aVar.b();
            l0 c10 = aVar.f(false).r(j0Var).c();
            aVar.C(c10);
            int i12 = c10.i();
            if (i12 != 200) {
                if (i12 == 407) {
                    j0 a10 = this.f23247c.a().h().a(this.f23247c, c10);
                    if (a10 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c10.l("Connection"))) {
                        return a10;
                    } else {
                        j0Var = a10;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c10.i());
                }
            } else if (this.f23253i.V().X() && this.f23254j.j().X()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    public final j0 m() throws IOException {
        j0 b10 = new j0.a().s(this.f23247c.a().l()).j("CONNECT", (k0) null).h("Host", pg.e.t(this.f23247c.a().l(), true)).h("Proxy-Connection", "Keep-Alive").h("User-Agent", pg.f.a()).b();
        j0 a10 = this.f23247c.a().h().a(this.f23247c, new l0.a().r(b10).o(h0.HTTP_1_1).g(dg.a.Qx).l("Preemptive Authenticate").b(pg.e.f22068d).s(-1).p(-1).i("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 != null ? a10 : b10;
    }

    public final void n(b bVar, int i10, g gVar, x xVar) throws IOException {
        if (this.f23247c.a().k() == null) {
            List<h0> f10 = this.f23247c.a().f();
            h0 h0Var = h0.H2_PRIOR_KNOWLEDGE;
            if (f10.contains(h0Var)) {
                this.f23249e = this.f23248d;
                this.f23251g = h0Var;
                v(i10);
                return;
            }
            this.f23249e = this.f23248d;
            this.f23251g = h0.HTTP_1_1;
            return;
        }
        xVar.y(gVar);
        j(bVar);
        xVar.x(gVar, this.f23250f);
        if (this.f23251g == h0.HTTP_2) {
            v(i10);
        }
    }

    public boolean o(og.a aVar, @Nullable List<n0> list) {
        if (this.f23260p.size() >= this.f23259o || this.f23255k || !pg.a.f22062a.e(this.f23247c.a(), aVar)) {
            return false;
        }
        if (aVar.l().p().equals(b().a().l().p())) {
            return true;
        }
        if (this.f23252h == null || list == null || !u(list) || aVar.e() != ah.e.f16120a || !w(aVar.l())) {
            return false;
        }
        try {
            aVar.a().a(aVar.l().p(), c().g());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean p(boolean z10) {
        int soTimeout;
        if (this.f23249e.isClosed() || this.f23249e.isInputShutdown() || this.f23249e.isOutputShutdown()) {
            return false;
        }
        f fVar = this.f23252h;
        if (fVar != null) {
            return fVar.Q(System.nanoTime());
        }
        if (z10) {
            try {
                soTimeout = this.f23249e.getSoTimeout();
                this.f23249e.setSoTimeout(1);
                if (this.f23253i.X()) {
                    this.f23249e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f23249e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th2) {
                this.f23249e.setSoTimeout(soTimeout);
                throw th2;
            }
        }
        return true;
    }

    public boolean q() {
        return this.f23252h != null;
    }

    public c r(g0 g0Var, d0.a aVar) throws SocketException {
        if (this.f23252h != null) {
            return new wg.g(g0Var, this, aVar, this.f23252h);
        }
        this.f23249e.setSoTimeout(aVar.d());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f23253i.b().i((long) aVar.d(), timeUnit);
        this.f23254j.b().i((long) aVar.e(), timeUnit);
        return new vg.a(g0Var, this, this.f23253i, this.f23254j);
    }

    public b.f s(c cVar) throws SocketException {
        this.f23249e.setSoTimeout(0);
        t();
        return new a(true, this.f23253i, this.f23254j, cVar);
    }

    public void t() {
        synchronized (this.f23246b) {
            this.f23255k = true;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f23247c.a().l().p());
        sb2.append(":");
        sb2.append(this.f23247c.a().l().E());
        sb2.append(", proxy=");
        sb2.append(this.f23247c.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f23247c.d());
        sb2.append(" cipherSuite=");
        z zVar = this.f23250f;
        sb2.append(zVar != null ? zVar.a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f23251g);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(List<n0> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            n0 n0Var = list.get(i10);
            if (n0Var.b().type() == Proxy.Type.DIRECT && this.f23247c.b().type() == Proxy.Type.DIRECT && this.f23247c.d().equals(n0Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final void v(int i10) throws IOException {
        this.f23249e.setSoTimeout(0);
        f a10 = new f.h(true).f(this.f23249e, this.f23247c.a().l().p(), this.f23253i, this.f23254j).b(this).c(i10).a();
        this.f23252h = a10;
        a10.m1();
    }

    public boolean w(c0 c0Var) {
        if (c0Var.E() != this.f23247c.a().l().E()) {
            return false;
        }
        if (!c0Var.p().equals(this.f23247c.a().l().p())) {
            return this.f23250f != null && ah.e.f16120a.c(c0Var.p(), (X509Certificate) this.f23250f.g().get(0));
        }
        return true;
    }

    public void y(@Nullable IOException iOException) {
        int i10;
        synchronized (this.f23246b) {
            if (iOException instanceof n) {
                wg.b bVar = ((n) iOException).O;
                if (bVar == wg.b.REFUSED_STREAM) {
                    int i11 = this.f23258n + 1;
                    this.f23258n = i11;
                    if (i11 > 1) {
                        this.f23255k = true;
                        i10 = this.f23256l;
                    }
                } else if (bVar != wg.b.CANCEL) {
                    this.f23255k = true;
                    i10 = this.f23256l;
                }
            } else if (!q() || (iOException instanceof wg.a)) {
                this.f23255k = true;
                if (this.f23257m == 0) {
                    if (iOException != null) {
                        this.f23246b.c(this.f23247c, iOException);
                    }
                    i10 = this.f23256l;
                }
            }
            this.f23256l = i10 + 1;
        }
    }
}
