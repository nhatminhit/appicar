package og;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import pg.e;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final l[] f21731e;

    /* renamed from: f  reason: collision with root package name */
    public static final l[] f21732f;

    /* renamed from: g  reason: collision with root package name */
    public static final o f21733g;

    /* renamed from: h  reason: collision with root package name */
    public static final o f21734h;

    /* renamed from: i  reason: collision with root package name */
    public static final o f21735i;

    /* renamed from: j  reason: collision with root package name */
    public static final o f21736j = new a(false).c();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21737a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21738b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String[] f21739c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String[] f21740d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f21741a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public String[] f21742b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public String[] f21743c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21744d;

        public a(o oVar) {
            this.f21741a = oVar.f21737a;
            this.f21742b = oVar.f21739c;
            this.f21743c = oVar.f21740d;
            this.f21744d = oVar.f21738b;
        }

        public a(boolean z10) {
            this.f21741a = z10;
        }

        public a a() {
            if (this.f21741a) {
                this.f21742b = null;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a b() {
            if (this.f21741a) {
                this.f21743c = null;
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public o c() {
            return new o(this);
        }

        public a d(String... strArr) {
            if (!this.f21741a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f21742b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a e(l... lVarArr) {
            if (this.f21741a) {
                String[] strArr = new String[lVarArr.length];
                for (int i10 = 0; i10 < lVarArr.length; i10++) {
                    strArr[i10] = lVarArr[i10].f21711a;
                }
                return d(strArr);
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a f(boolean z10) {
            if (this.f21741a) {
                this.f21744d = z10;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a g(String... strArr) {
            if (!this.f21741a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f21743c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a h(o0... o0VarArr) {
            if (this.f21741a) {
                String[] strArr = new String[o0VarArr.length];
                for (int i10 = 0; i10 < o0VarArr.length; i10++) {
                    strArr[i10] = o0VarArr[i10].O;
                }
                return g(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    static {
        l lVar = l.f21682n1;
        l lVar2 = l.f21685o1;
        l lVar3 = l.f21688p1;
        l lVar4 = l.Z0;
        l lVar5 = l.f21652d1;
        l lVar6 = l.f21643a1;
        l lVar7 = l.f21655e1;
        l lVar8 = l.f21673k1;
        l lVar9 = l.f21670j1;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9};
        f21731e = lVarArr;
        l[] lVarArr2 = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, l.K0, l.L0, l.f21666i0, l.f21669j0, l.G, l.K, l.f21671k};
        f21732f = lVarArr2;
        a e10 = new a(true).e(lVarArr);
        o0 o0Var = o0.TLS_1_3;
        o0 o0Var2 = o0.TLS_1_2;
        f21733g = e10.h(o0Var, o0Var2).f(true).c();
        f21734h = new a(true).e(lVarArr2).h(o0Var, o0Var2).f(true).c();
        f21735i = new a(true).e(lVarArr2).h(o0Var, o0Var2, o0.TLS_1_1, o0.TLS_1_0).f(true).c();
    }

    public o(a aVar) {
        this.f21737a = aVar.f21741a;
        this.f21739c = aVar.f21742b;
        this.f21740d = aVar.f21743c;
        this.f21738b = aVar.f21744d;
    }

    public void a(SSLSocket sSLSocket, boolean z10) {
        o e10 = e(sSLSocket, z10);
        String[] strArr = e10.f21740d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = e10.f21739c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    public List<l> b() {
        String[] strArr = this.f21739c;
        if (strArr != null) {
            return l.c(strArr);
        }
        return null;
    }

    public boolean c(SSLSocket sSLSocket) {
        if (!this.f21737a) {
            return false;
        }
        String[] strArr = this.f21740d;
        if (strArr != null && !e.D(e.f22074j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f21739c;
        return strArr2 == null || e.D(l.f21644b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean d() {
        return this.f21737a;
    }

    public final o e(SSLSocket sSLSocket, boolean z10) {
        String[] A = this.f21739c != null ? e.A(l.f21644b, sSLSocket.getEnabledCipherSuites(), this.f21739c) : sSLSocket.getEnabledCipherSuites();
        String[] A2 = this.f21740d != null ? e.A(e.f22074j, sSLSocket.getEnabledProtocols(), this.f21740d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int x10 = e.x(l.f21644b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z10 && x10 != -1) {
            A = e.j(A, supportedCipherSuites[x10]);
        }
        return new a(this).d(A).g(A2).c();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        boolean z10 = this.f21737a;
        if (z10 != oVar.f21737a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f21739c, oVar.f21739c) && Arrays.equals(this.f21740d, oVar.f21740d) && this.f21738b == oVar.f21738b);
    }

    public boolean f() {
        return this.f21738b;
    }

    @Nullable
    public List<o0> g() {
        String[] strArr = this.f21740d;
        if (strArr != null) {
            return o0.b(strArr);
        }
        return null;
    }

    public int hashCode() {
        if (this.f21737a) {
            return ((((527 + Arrays.hashCode(this.f21739c)) * 31) + Arrays.hashCode(this.f21740d)) * 31) + (this.f21738b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f21737a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(g(), "[all enabled]") + ", supportsTlsExtensions=" + this.f21738b + ")";
    }
}
