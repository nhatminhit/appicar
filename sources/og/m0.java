package og;

import ch.c;
import ch.e;
import ch.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public abstract class m0 implements Closeable {
    @Nullable
    public Reader O;

    public class a extends m0 {
        public final /* synthetic */ e0 P;
        public final /* synthetic */ long Q;
        public final /* synthetic */ e R;

        public a(e0 e0Var, long j10, e eVar) {
            this.P = e0Var;
            this.Q = j10;
            this.R = eVar;
        }

        public long k() {
            return this.Q;
        }

        @Nullable
        public e0 l() {
            return this.P;
        }

        public e w() {
            return this.R;
        }
    }

    public static final class b extends Reader {
        public final e O;
        public final Charset P;
        public boolean Q;
        @Nullable
        public Reader R;

        public b(e eVar, Charset charset) {
            this.O = eVar;
            this.P = charset;
        }

        public void close() throws IOException {
            this.Q = true;
            Reader reader = this.R;
            if (reader != null) {
                reader.close();
            } else {
                this.O.close();
            }
        }

        public int read(char[] cArr, int i10, int i11) throws IOException {
            if (!this.Q) {
                Reader reader = this.R;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.O.n(), pg.e.c(this.O, this.P));
                    this.R = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i10, i11);
            }
            throw new IOException("Stream closed");
        }
    }

    public static /* synthetic */ void c(Throwable th2, AutoCloseable autoCloseable) {
        if (th2 != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            autoCloseable.close();
        }
    }

    public static m0 m(@Nullable e0 e0Var, long j10, e eVar) {
        if (eVar != null) {
            return new a(e0Var, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }

    public static m0 o(@Nullable e0 e0Var, f fVar) {
        return m(e0Var, (long) fVar.R(), new c().T(fVar));
    }

    public static m0 q(@Nullable e0 e0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (e0Var != null && (charset = e0Var.a()) == null) {
            charset = StandardCharsets.UTF_8;
            e0Var = e0.d(e0Var + "; charset=utf-8");
        }
        c Z1 = new c().R0(str, charset);
        return m(e0Var, Z1.size(), Z1);
    }

    public static m0 t(@Nullable e0 e0Var, byte[] bArr) {
        return m(e0Var, (long) bArr.length, new c().write(bArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        c(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A() throws java.io.IOException {
        /*
            r3 = this;
            ch.e r0 = r3.w()
            java.nio.charset.Charset r1 = r3.i()     // Catch:{ all -> 0x0015 }
            java.nio.charset.Charset r1 = pg.e.c(r0, r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r0.I0(r1)     // Catch:{ all -> 0x0015 }
            r2 = 0
            c(r2, r0)
            return r1
        L_0x0015:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0017 }
        L_0x0017:
            r2 = move-exception
            if (r0 == 0) goto L_0x001d
            c(r1, r0)
        L_0x001d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.m0.A():java.lang.String");
    }

    public void close() {
        pg.e.g(w());
    }

    public final InputStream f() {
        return w().n();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r2 != null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        c(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] g() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.k()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
            ch.e r2 = r6.w()
            r3 = 0
            byte[] r4 = r2.S()     // Catch:{ all -> 0x004a }
            c(r3, r2)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0049
            int r2 = r4.length
            long r2 = (long) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0024
            goto L_0x0049
        L_0x0024:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Content-Length ("
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            int r0 = r4.length
            r3.append(r0)
            java.lang.String r0 = ") disagree"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0049:
            return r4
        L_0x004a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0052
            c(r0, r2)
        L_0x0052:
            throw r1
        L_0x0053:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: og.m0.g():byte[]");
    }

    public final Reader h() {
        Reader reader = this.O;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(w(), i());
        this.O = bVar;
        return bVar;
    }

    public final Charset i() {
        e0 l10 = l();
        return l10 != null ? l10.b(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public abstract long k();

    @Nullable
    public abstract e0 l();

    public abstract e w();
}
