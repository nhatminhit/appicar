package og;

import ch.d;
import ch.f;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import pg.e;

public abstract class k0 {

    public class a extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e0 f21634a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f21635b;

        public a(e0 e0Var, f fVar) {
            this.f21634a = e0Var;
            this.f21635b = fVar;
        }

        public long a() throws IOException {
            return (long) this.f21635b.R();
        }

        @Nullable
        public e0 b() {
            return this.f21634a;
        }

        public void j(d dVar) throws IOException {
            dVar.T(this.f21635b);
        }
    }

    public class b extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e0 f21636a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21637b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ byte[] f21638c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f21639d;

        public b(e0 e0Var, int i10, byte[] bArr, int i11) {
            this.f21636a = e0Var;
            this.f21637b = i10;
            this.f21638c = bArr;
            this.f21639d = i11;
        }

        public long a() {
            return (long) this.f21637b;
        }

        @Nullable
        public e0 b() {
            return this.f21636a;
        }

        public void j(d dVar) throws IOException {
            dVar.write(this.f21638c, this.f21639d, this.f21637b);
        }
    }

    public class c extends k0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e0 f21640a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ File f21641b;

        public c(e0 e0Var, File file) {
            this.f21640a = e0Var;
            this.f21641b = file;
        }

        public long a() {
            return this.f21641b.length();
        }

        @Nullable
        public e0 b() {
            return this.f21640a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
            r3.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
            if (r0 != null) goto L_0x0014;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void j(ch.d r3) throws java.io.IOException {
            /*
                r2 = this;
                java.io.File r0 = r2.f21641b
                ch.a0 r0 = ch.p.k(r0)
                r3.V0(r0)     // Catch:{ all -> 0x000f }
                if (r0 == 0) goto L_0x000e
                r0.close()
            L_0x000e:
                return
            L_0x000f:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0011 }
            L_0x0011:
                r1 = move-exception
                if (r0 == 0) goto L_0x001c
                r0.close()     // Catch:{ all -> 0x0018 }
                goto L_0x001c
            L_0x0018:
                r0 = move-exception
                r3.addSuppressed(r0)
            L_0x001c:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: og.k0.c.j(ch.d):void");
        }
    }

    public static k0 c(@Nullable e0 e0Var, f fVar) {
        return new a(e0Var, fVar);
    }

    public static k0 d(@Nullable e0 e0Var, File file) {
        if (file != null) {
            return new c(e0Var, file);
        }
        throw new NullPointerException("file == null");
    }

    public static k0 e(@Nullable e0 e0Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (e0Var != null && (charset = e0Var.a()) == null) {
            charset = StandardCharsets.UTF_8;
            e0Var = e0.d(e0Var + "; charset=utf-8");
        }
        return f(e0Var, str.getBytes(charset));
    }

    public static k0 f(@Nullable e0 e0Var, byte[] bArr) {
        return g(e0Var, bArr, 0, bArr.length);
    }

    public static k0 g(@Nullable e0 e0Var, byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            e.f((long) bArr.length, (long) i10, (long) i11);
            return new b(e0Var, i11, bArr, i10);
        }
        throw new NullPointerException("content == null");
    }

    public long a() throws IOException {
        return -1;
    }

    @Nullable
    public abstract e0 b();

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public abstract void j(d dVar) throws IOException;
}
