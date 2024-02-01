package ch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f16514a = Logger.getLogger(p.class.getName());

    public class a implements z {
        public final /* synthetic */ b0 O;
        public final /* synthetic */ OutputStream P;

        public a(b0 b0Var, OutputStream outputStream) {
            this.O = b0Var;
            this.P = outputStream;
        }

        public b0 b() {
            return this.O;
        }

        public void close() throws IOException {
            this.P.close();
        }

        public void d1(c cVar, long j10) throws IOException {
            d0.b(cVar.P, 0, j10);
            while (j10 > 0) {
                this.O.h();
                w wVar = cVar.O;
                int min = (int) Math.min(j10, (long) (wVar.f16531c - wVar.f16530b));
                this.P.write(wVar.f16529a, wVar.f16530b, min);
                int i10 = wVar.f16530b + min;
                wVar.f16530b = i10;
                long j11 = (long) min;
                j10 -= j11;
                cVar.P -= j11;
                if (i10 == wVar.f16531c) {
                    cVar.O = wVar.b();
                    x.a(wVar);
                }
            }
        }

        public void flush() throws IOException {
            this.P.flush();
        }

        public String toString() {
            return "sink(" + this.P + ")";
        }
    }

    public class b implements a0 {
        public final /* synthetic */ b0 O;
        public final /* synthetic */ InputStream P;

        public b(b0 b0Var, InputStream inputStream) {
            this.O = b0Var;
            this.P = inputStream;
        }

        public long C0(c cVar, long j10) throws IOException {
            int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
            if (i10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            } else if (i10 == 0) {
                return 0;
            } else {
                try {
                    this.O.h();
                    w F1 = cVar.F1(1);
                    int read = this.P.read(F1.f16529a, F1.f16531c, (int) Math.min(j10, (long) (8192 - F1.f16531c)));
                    if (read == -1) {
                        return -1;
                    }
                    F1.f16531c += read;
                    long j11 = (long) read;
                    cVar.P += j11;
                    return j11;
                } catch (AssertionError e10) {
                    if (p.e(e10)) {
                        throw new IOException(e10);
                    }
                    throw e10;
                }
            }
        }

        public b0 b() {
            return this.O;
        }

        public void close() throws IOException {
            this.P.close();
        }

        public String toString() {
            return "source(" + this.P + ")";
        }
    }

    public class c implements z {
        public b0 b() {
            return b0.f16507d;
        }

        public void close() throws IOException {
        }

        public void d1(c cVar, long j10) throws IOException {
            cVar.skip(j10);
        }

        public void flush() throws IOException {
        }
    }

    public class d extends a {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Socket f16515l;

        public d(Socket socket) {
            this.f16515l = socket;
        }

        public IOException r(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void w() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.f16515l     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = ch.p.e(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = ch.p.f16514a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = ch.p.f16514a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.f16515l
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ch.p.d.w():void");
        }
    }

    public static z a(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static z b() {
        return new c();
    }

    public static d c(z zVar) {
        return new u(zVar);
    }

    public static e d(a0 a0Var) {
        return new v(a0Var);
    }

    public static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static z f(File file) throws FileNotFoundException {
        if (file != null) {
            return g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static z g(OutputStream outputStream) {
        return h(outputStream, new b0());
    }

    public static z h(OutputStream outputStream, b0 b0Var) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (b0Var != null) {
            return new a(b0Var, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static z i(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            a p10 = p(socket);
            return p10.u(h(socket.getOutputStream(), p10));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    @IgnoreJRERequirement
    public static z j(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return g(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static a0 k(File file) throws FileNotFoundException {
        if (file != null) {
            return l(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static a0 l(InputStream inputStream) {
        return m(inputStream, new b0());
    }

    public static a0 m(InputStream inputStream, b0 b0Var) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (b0Var != null) {
            return new b(b0Var, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static a0 n(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            a p10 = p(socket);
            return p10.v(m(socket.getInputStream(), p10));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    @IgnoreJRERequirement
    public static a0 o(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return l(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static a p(Socket socket) {
        return new d(socket);
    }
}
