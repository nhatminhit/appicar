package ug;

import dg.a;
import hh.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.annotation.Nullable;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import og.c0;
import og.d0;
import og.g0;
import og.j0;
import og.k0;
import og.l0;
import og.n0;
import pg.e;
import tg.k;

public final class j implements d0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f23390b = 20;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f23391a;

    public j(g0 g0Var) {
        this.f23391a = g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        r1.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public og.l0 a(og.d0.a r9) throws java.io.IOException {
        /*
            r8 = this;
            og.j0 r0 = r9.c()
            ug.g r9 = (ug.g) r9
            tg.k r1 = r9.l()
            r2 = 0
            r3 = 0
            r5 = r2
            r4 = r3
        L_0x000e:
            r1.m(r0)
            boolean r6 = r1.i()
            if (r6 != 0) goto L_0x00c1
            og.l0 r0 = r9.k(r0, r1, r3)     // Catch:{ i -> 0x00a8, IOException -> 0x0098 }
            if (r4 == 0) goto L_0x0035
            og.l0$a r0 = r0.P()
            og.l0$a r4 = r4.P()
            og.l0$a r4 = r4.b(r3)
            og.l0 r4 = r4.c()
            og.l0$a r0 = r0.n(r4)
            og.l0 r0 = r0.c()
        L_0x0035:
            r4 = r0
            pg.a r0 = pg.a.f22062a
            tg.c r0 = r0.f(r4)
            if (r0 == 0) goto L_0x0047
            tg.e r6 = r0.c()
            og.n0 r6 = r6.b()
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            og.j0 r6 = r8.b(r4, r6)
            if (r6 != 0) goto L_0x005a
            if (r0 == 0) goto L_0x0059
            boolean r9 = r0.h()
            if (r9 == 0) goto L_0x0059
            r1.p()
        L_0x0059:
            return r4
        L_0x005a:
            og.k0 r7 = r6.a()
            if (r7 == 0) goto L_0x0067
            boolean r7 = r7.i()
            if (r7 == 0) goto L_0x0067
            return r4
        L_0x0067:
            og.m0 r7 = r4.c()
            pg.e.g(r7)
            boolean r7 = r1.h()
            if (r7 == 0) goto L_0x0077
            r0.e()
        L_0x0077:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x007f
            r0 = r6
            goto L_0x000e
        L_0x007f:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0096:
            r9 = move-exception
            goto L_0x00bd
        L_0x0098:
            r6 = move-exception
            boolean r7 = r6 instanceof wg.a     // Catch:{ all -> 0x0096 }
            if (r7 != 0) goto L_0x009f
            r7 = 1
            goto L_0x00a0
        L_0x009f:
            r7 = r2
        L_0x00a0:
            boolean r7 = r8.d(r6, r1, r7, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00a7
            goto L_0x00b3
        L_0x00a7:
            throw r6     // Catch:{ all -> 0x0096 }
        L_0x00a8:
            r6 = move-exception
            java.io.IOException r7 = r6.c()     // Catch:{ all -> 0x0096 }
            boolean r7 = r8.d(r7, r1, r2, r0)     // Catch:{ all -> 0x0096 }
            if (r7 == 0) goto L_0x00b8
        L_0x00b3:
            r1.f()
            goto L_0x000e
        L_0x00b8:
            java.io.IOException r9 = r6.b()     // Catch:{ all -> 0x0096 }
            throw r9     // Catch:{ all -> 0x0096 }
        L_0x00bd:
            r1.f()
            throw r9
        L_0x00c1:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.j.a(og.d0$a):og.l0");
    }

    public final j0 b(l0 l0Var, @Nullable n0 n0Var) throws IOException {
        String l10;
        c0 O;
        if (l0Var != null) {
            int i10 = l0Var.i();
            String g10 = l0Var.e0().g();
            k0 k0Var = null;
            if (i10 == 307 || i10 == 308) {
                if (!g10.equals("GET") && !g10.equals("HEAD")) {
                    return null;
                }
            } else if (i10 == 401) {
                return this.f23391a.g().a(n0Var, l0Var);
            } else {
                if (i10 != 503) {
                    if (i10 == 407) {
                        if ((n0Var != null ? n0Var.b() : this.f23391a.E()).type() == Proxy.Type.HTTP) {
                            return this.f23391a.F().a(n0Var, l0Var);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (i10 != 408) {
                        switch (i10) {
                            case 300:
                            case 301:
                            case a.lm:
                            case a.nm:
                                break;
                            default:
                                return null;
                        }
                    } else if (!this.f23391a.I()) {
                        return null;
                    } else {
                        k0 a10 = l0Var.e0().a();
                        if (a10 != null && a10.i()) {
                            return null;
                        }
                        if ((l0Var.Y() == null || l0Var.Y().i() != 408) && f(l0Var, 0) <= 0) {
                            return l0Var.e0();
                        }
                        return null;
                    }
                } else if ((l0Var.Y() == null || l0Var.Y().i() != 503) && f(l0Var, Integer.MAX_VALUE) == 0) {
                    return l0Var.e0();
                } else {
                    return null;
                }
            }
            if (!this.f23391a.u() || (l10 = l0Var.l(c.e.f19601q)) == null || (O = l0Var.e0().k().O(l10)) == null) {
                return null;
            }
            if (!O.P().equals(l0Var.e0().k().P()) && !this.f23391a.v()) {
                return null;
            }
            j0.a h10 = l0Var.e0().h();
            if (f.b(g10)) {
                boolean d10 = f.d(g10);
                if (f.c(g10)) {
                    h10.j("GET", (k0) null);
                } else {
                    if (d10) {
                        k0Var = l0Var.e0().a();
                    }
                    h10.j(g10, k0Var);
                }
                if (!d10) {
                    h10.n("Transfer-Encoding");
                    h10.n("Content-Length");
                    h10.n(c.f19573f);
                }
            }
            if (!e.F(l0Var.e0().k(), O)) {
                h10.n("Authorization");
            }
            return h10.s(O).b();
        }
        throw new IllegalStateException();
    }

    public final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    public final boolean d(IOException iOException, k kVar, boolean z10, j0 j0Var) {
        if (!this.f23391a.I()) {
            return false;
        }
        return (!z10 || !e(iOException, j0Var)) && c(iOException, z10) && kVar.c();
    }

    public final boolean e(IOException iOException, j0 j0Var) {
        k0 a10 = j0Var.a();
        return (a10 != null && a10.i()) || (iOException instanceof FileNotFoundException);
    }

    public final int f(l0 l0Var, int i10) {
        String l10 = l0Var.l("Retry-After");
        if (l10 == null) {
            return i10;
        }
        if (l10.matches("\\d+")) {
            return Integer.valueOf(l10).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
