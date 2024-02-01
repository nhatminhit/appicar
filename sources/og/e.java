package og;

import ch.a0;
import ch.h;
import ch.i;
import ch.p;
import ch.z;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;
import og.b0;
import og.j0;
import og.l0;
import rg.d;
import rg.f;
import ug.k;

public final class e implements Closeable, Flushable {
    public static final int V = 201105;
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public final f O;
    public final rg.d P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;

    public class a implements f {
        public a() {
        }

        public void a() {
            e.this.P();
        }

        @Nullable
        public l0 b(j0 j0Var) throws IOException {
            return e.this.i(j0Var);
        }

        public void c(j0 j0Var) throws IOException {
            e.this.A(j0Var);
        }

        public void d(rg.c cVar) {
            e.this.Q(cVar);
        }

        public void e(l0 l0Var, l0 l0Var2) {
            e.this.Y(l0Var, l0Var2);
        }

        @Nullable
        public rg.b f(l0 l0Var) throws IOException {
            return e.this.t(l0Var);
        }
    }

    public class b implements Iterator<String> {
        public final Iterator<d.f> O;
        @Nullable
        public String P;
        public boolean Q;

        public b() throws IOException {
            this.O = e.this.P.m0();
        }

        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.P;
                this.P = null;
                this.Q = true;
                return str;
            }
            throw new NoSuchElementException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            if (r2 != null) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            continue;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean hasNext() {
            /*
                r5 = this;
                java.lang.String r0 = r5.P
                r1 = 1
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                r5.Q = r0
            L_0x0009:
                java.util.Iterator<rg.d$f> r2 = r5.O
                boolean r2 = r2.hasNext()
                if (r2 == 0) goto L_0x0039
                java.util.Iterator<rg.d$f> r2 = r5.O     // Catch:{ IOException -> 0x0009 }
                java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0009 }
                rg.d$f r2 = (rg.d.f) r2     // Catch:{ IOException -> 0x0009 }
                ch.a0 r3 = r2.h(r0)     // Catch:{ all -> 0x002b }
                ch.e r3 = ch.p.d(r3)     // Catch:{ all -> 0x002b }
                java.lang.String r3 = r3.b1()     // Catch:{ all -> 0x002b }
                r5.P = r3     // Catch:{ all -> 0x002b }
                r2.close()     // Catch:{ IOException -> 0x0009 }
                return r1
            L_0x002b:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x002d }
            L_0x002d:
                r4 = move-exception
                if (r2 == 0) goto L_0x0038
                r2.close()     // Catch:{ all -> 0x0034 }
                goto L_0x0038
            L_0x0034:
                r2 = move-exception
                r3.addSuppressed(r2)     // Catch:{ IOException -> 0x0009 }
            L_0x0038:
                throw r4     // Catch:{ IOException -> 0x0009 }
            L_0x0039:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: og.e.b.hasNext():boolean");
        }

        public void remove() {
            if (this.Q) {
                this.O.remove();
                return;
            }
            throw new IllegalStateException("remove() before next()");
        }
    }

    public final class c implements rg.b {

        /* renamed from: a  reason: collision with root package name */
        public final d.C0413d f21502a;

        /* renamed from: b  reason: collision with root package name */
        public z f21503b;

        /* renamed from: c  reason: collision with root package name */
        public z f21504c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f21505d;

        public class a extends h {
            public final /* synthetic */ e P;
            public final /* synthetic */ d.C0413d Q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(z zVar, e eVar, d.C0413d dVar) {
                super(zVar);
                this.P = eVar;
                this.Q = dVar;
            }

            public void close() throws IOException {
                synchronized (e.this) {
                    c cVar = c.this;
                    if (!cVar.f21505d) {
                        cVar.f21505d = true;
                        e.this.Q++;
                        super.close();
                        this.Q.c();
                    }
                }
            }
        }

        public c(d.C0413d dVar) {
            this.f21502a = dVar;
            z e10 = dVar.e(1);
            this.f21503b = e10;
            this.f21504c = new a(e10, e.this, dVar);
        }

        public void abort() {
            synchronized (e.this) {
                if (!this.f21505d) {
                    this.f21505d = true;
                    e.this.R++;
                    pg.e.g(this.f21503b);
                    try {
                        this.f21502a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public z e() {
            return this.f21504c;
        }
    }

    public static class d extends m0 {
        public final d.f P;
        public final ch.e Q;
        @Nullable
        public final String R;
        @Nullable
        public final String S;

        public class a extends i {
            public final /* synthetic */ d.f P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, d.f fVar) {
                super(a0Var);
                this.P = fVar;
            }

            public void close() throws IOException {
                this.P.close();
                super.close();
            }
        }

        public d(d.f fVar, String str, String str2) {
            this.P = fVar;
            this.R = str;
            this.S = str2;
            this.Q = p.d(new a(fVar.h(1), fVar));
        }

        public long k() {
            try {
                String str = this.S;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public e0 l() {
            String str = this.R;
            if (str != null) {
                return e0.d(str);
            }
            return null;
        }

        public ch.e w() {
            return this.Q;
        }
    }

    /* renamed from: og.e$e  reason: collision with other inner class name */
    public static final class C0381e {

        /* renamed from: k  reason: collision with root package name */
        public static final String f21507k = (yg.h.m().n() + "-Sent-Millis");

        /* renamed from: l  reason: collision with root package name */
        public static final String f21508l = (yg.h.m().n() + "-Received-Millis");

        /* renamed from: a  reason: collision with root package name */
        public final String f21509a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f21510b;

        /* renamed from: c  reason: collision with root package name */
        public final String f21511c;

        /* renamed from: d  reason: collision with root package name */
        public final h0 f21512d;

        /* renamed from: e  reason: collision with root package name */
        public final int f21513e;

        /* renamed from: f  reason: collision with root package name */
        public final String f21514f;

        /* renamed from: g  reason: collision with root package name */
        public final b0 f21515g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public final z f21516h;

        /* renamed from: i  reason: collision with root package name */
        public final long f21517i;

        /* renamed from: j  reason: collision with root package name */
        public final long f21518j;

        public C0381e(a0 a0Var) throws IOException {
            try {
                ch.e d10 = p.d(a0Var);
                this.f21509a = d10.b1();
                this.f21511c = d10.b1();
                b0.a aVar = new b0.a();
                int w10 = e.w(d10);
                for (int i10 = 0; i10 < w10; i10++) {
                    aVar.f(d10.b1());
                }
                this.f21510b = aVar.i();
                k b10 = k.b(d10.b1());
                this.f21512d = b10.f23395a;
                this.f21513e = b10.f23396b;
                this.f21514f = b10.f23397c;
                b0.a aVar2 = new b0.a();
                int w11 = e.w(d10);
                for (int i11 = 0; i11 < w11; i11++) {
                    aVar2.f(d10.b1());
                }
                String str = f21507k;
                String j10 = aVar2.j(str);
                String str2 = f21508l;
                String j11 = aVar2.j(str2);
                aVar2.k(str);
                aVar2.k(str2);
                long j12 = 0;
                this.f21517i = j10 != null ? Long.parseLong(j10) : 0;
                this.f21518j = j11 != null ? Long.parseLong(j11) : j12;
                this.f21515g = aVar2.i();
                if (a()) {
                    String b12 = d10.b1();
                    if (b12.length() <= 0) {
                        this.f21516h = z.c(!d10.X() ? o0.a(d10.b1()) : o0.SSL_3_0, l.b(d10.b1()), c(d10), c(d10));
                    } else {
                        throw new IOException("expected \"\" but was \"" + b12 + "\"");
                    }
                } else {
                    this.f21516h = null;
                }
            } finally {
                a0Var.close();
            }
        }

        public C0381e(l0 l0Var) {
            this.f21509a = l0Var.e0().k().toString();
            this.f21510b = ug.e.u(l0Var);
            this.f21511c = l0Var.e0().g();
            this.f21512d = l0Var.a0();
            this.f21513e = l0Var.i();
            this.f21514f = l0Var.A();
            this.f21515g = l0Var.q();
            this.f21516h = l0Var.k();
            this.f21517i = l0Var.k0();
            this.f21518j = l0Var.c0();
        }

        public final boolean a() {
            return this.f21509a.startsWith("https://");
        }

        public boolean b(j0 j0Var, l0 l0Var) {
            return this.f21509a.equals(j0Var.k().toString()) && this.f21511c.equals(j0Var.g()) && ug.e.v(l0Var, this.f21510b, j0Var);
        }

        public final List<Certificate> c(ch.e eVar) throws IOException {
            int w10 = e.w(eVar);
            if (w10 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(w10);
                for (int i10 = 0; i10 < w10; i10++) {
                    String b12 = eVar.b1();
                    ch.c cVar = new ch.c();
                    cVar.T(ch.f.j(b12));
                    arrayList.add(instance.generateCertificate(cVar.n()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public l0 d(d.f fVar) {
            String d10 = this.f21515g.d(hh.c.f19573f);
            String d11 = this.f21515g.d("Content-Length");
            return new l0.a().r(new j0.a().q(this.f21509a).j(this.f21511c, (k0) null).i(this.f21510b).b()).o(this.f21512d).g(this.f21513e).l(this.f21514f).j(this.f21515g).b(new d(fVar, d10, d11)).h(this.f21516h).s(this.f21517i).p(this.f21518j).c();
        }

        public final void e(ch.d dVar, List<Certificate> list) throws IOException {
            try {
                dVar.G1((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    dVar.D0(ch.f.I(list.get(i10).getEncoded()).b()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public void f(d.C0413d dVar) throws IOException {
            ch.d c10 = p.c(dVar.e(0));
            c10.D0(this.f21509a).writeByte(10);
            c10.D0(this.f21511c).writeByte(10);
            c10.G1((long) this.f21510b.m()).writeByte(10);
            int m10 = this.f21510b.m();
            for (int i10 = 0; i10 < m10; i10++) {
                c10.D0(this.f21510b.h(i10)).D0(": ").D0(this.f21510b.o(i10)).writeByte(10);
            }
            c10.D0(new k(this.f21512d, this.f21513e, this.f21514f).toString()).writeByte(10);
            c10.G1((long) (this.f21515g.m() + 2)).writeByte(10);
            int m11 = this.f21515g.m();
            for (int i11 = 0; i11 < m11; i11++) {
                c10.D0(this.f21515g.h(i11)).D0(": ").D0(this.f21515g.o(i11)).writeByte(10);
            }
            c10.D0(f21507k).D0(": ").G1(this.f21517i).writeByte(10);
            c10.D0(f21508l).D0(": ").G1(this.f21518j).writeByte(10);
            if (a()) {
                c10.writeByte(10);
                c10.D0(this.f21516h.a().e()).writeByte(10);
                e(c10, this.f21516h.g());
                e(c10, this.f21516h.d());
                c10.D0(this.f21516h.i().d()).writeByte(10);
            }
            c10.close();
        }
    }

    public e(File file, long j10) {
        this(file, j10, xg.a.f24580a);
    }

    public e(File file, long j10, xg.a aVar) {
        this.O = new a();
        this.P = rg.d.h(aVar, file, V, 2, j10);
    }

    public static String m(c0 c0Var) {
        return ch.f.o(c0Var.toString()).G().s();
    }

    public static int w(ch.e eVar) throws IOException {
        try {
            long j02 = eVar.j0();
            String b12 = eVar.b1();
            if (j02 >= 0 && j02 <= y4.c.M0 && b12.isEmpty()) {
                return (int) j02;
            }
            throw new IOException("expected an int but was \"" + j02 + b12 + "\"");
        } catch (NumberFormatException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public void A(j0 j0Var) throws IOException {
        this.P.c0(m(j0Var.k()));
    }

    public synchronized int N() {
        return this.U;
    }

    public synchronized void P() {
        this.T++;
    }

    public synchronized void Q(rg.c cVar) {
        this.U++;
        if (cVar.f22551a != null) {
            this.S++;
        } else if (cVar.f22552b != null) {
            this.T++;
        }
    }

    public void Y(l0 l0Var, l0 l0Var2) {
        d.C0413d dVar;
        C0381e eVar = new C0381e(l0Var2);
        try {
            dVar = ((d) l0Var.c()).P.f();
            if (dVar != null) {
                try {
                    eVar.f(dVar);
                    dVar.c();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            dVar = null;
            c(dVar);
        }
    }

    public Iterator<String> a0() throws IOException {
        return new b();
    }

    public final void c(@Nullable d.C0413d dVar) {
        if (dVar != null) {
            try {
                dVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public synchronized int c0() {
        return this.R;
    }

    public void close() throws IOException {
        this.P.close();
    }

    public synchronized int e0() {
        return this.Q;
    }

    public void f() throws IOException {
        this.P.i();
    }

    public void flush() throws IOException {
        this.P.flush();
    }

    public File g() {
        return this.P.q();
    }

    public void h() throws IOException {
        this.P.m();
    }

    @Nullable
    public l0 i(j0 j0Var) {
        try {
            d.f o10 = this.P.o(m(j0Var.k()));
            if (o10 == null) {
                return null;
            }
            try {
                C0381e eVar = new C0381e(o10.h(0));
                l0 d10 = eVar.d(o10);
                if (eVar.b(j0Var, d10)) {
                    return d10;
                }
                pg.e.g(d10.c());
                return null;
            } catch (IOException unused) {
                pg.e.g(o10);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public boolean isClosed() {
        return this.P.isClosed();
    }

    public synchronized int k() {
        return this.T;
    }

    public void l() throws IOException {
        this.P.w();
    }

    public long o() {
        return this.P.t();
    }

    public synchronized int q() {
        return this.S;
    }

    public long size() throws IOException {
        return this.P.size();
    }

    @Nullable
    public rg.b t(l0 l0Var) {
        d.C0413d dVar;
        String g10 = l0Var.e0().g();
        if (ug.f.a(l0Var.e0().g())) {
            try {
                A(l0Var.e0());
            } catch (IOException unused) {
            }
            return null;
        } else if (!g10.equals("GET") || ug.e.e(l0Var)) {
            return null;
        } else {
            C0381e eVar = new C0381e(l0Var);
            try {
                dVar = this.P.k(m(l0Var.e0().k()));
                if (dVar == null) {
                    return null;
                }
                try {
                    eVar.f(dVar);
                    return new c(dVar);
                } catch (IOException unused2) {
                    c(dVar);
                    return null;
                }
            } catch (IOException unused3) {
                dVar = null;
                c(dVar);
                return null;
            }
        }
    }
}
