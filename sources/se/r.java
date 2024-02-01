package se;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import oe.f;
import p000if.m;
import p000if.u;
import xe.l0;
import zd.h1;
import zd.y2;

public class r {
    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path A(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    public static /* synthetic */ Path B(Path path, m mVar, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, u.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    public static /* synthetic */ Path C(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        re.c.a(r4, r1);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(@fh.g java.nio.file.Path r1, @fh.g java.lang.CharSequence r2, @fh.g java.nio.charset.Charset r3, @fh.g java.nio.file.OpenOption... r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "text"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "options"
            xe.l0.p(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            xe.l0.o(r1, r4)
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            r4.<init>(r1, r3)
            r4.append(r2)     // Catch:{ all -> 0x0031 }
            r1 = 0
            re.c.a(r4, r1)
            return
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            re.c.a(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.D(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset, java.nio.file.OpenOption[]):void");
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final void a(Path path, byte[] bArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(bArr, "array");
        Files.write(path, bArr, new OpenOption[]{StandardOpenOption.APPEND});
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path b(Path path, m<? extends CharSequence> mVar, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, u.N(mVar), charset, new OpenOption[]{StandardOpenOption.APPEND});
        l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path c(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path d(Path path, m mVar, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, u.N(mVar), charset, new OpenOption[]{StandardOpenOption.APPEND});
        l0.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path e(Path path, Iterable iterable, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(iterable, "lines");
        l0.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        l0.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        re.c.a(r0, r3);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(@fh.g java.nio.file.Path r3, @fh.g java.lang.CharSequence r4, @fh.g java.nio.charset.Charset r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "text"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r2 = 0
            r0[r2] = r1
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r0 = "newOutputStream(this, StandardOpenOption.APPEND)"
            xe.l0.o(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3, r5)
            r0.append(r4)     // Catch:{ all -> 0x002d }
            r3 = 0
            re.c.a(r0, r3)
            return
        L_0x002d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r4 = move-exception
            re.c.a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.f(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset):void");
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        f(path, charSequence, charset);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final BufferedReader h(Path path, Charset charset, int i10, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    public static /* synthetic */ BufferedReader i(Path path, Charset charset, int i10, OpenOption[] openOptionArr, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final BufferedWriter j(Path path, Charset charset, int i10, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    public static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i10, OpenOption[] openOptionArr, int i11, Object obj) throws IOException {
        if ((i11 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        xe.i0.d(1);
        re.c.a(r2, r4);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r0;
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(java.nio.file.Path r2, java.nio.charset.Charset r3, we.l<? super java.lang.String, zd.u2> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "action"
            xe.l0.p(r4, r0)
            java.io.BufferedReader r2 = java.nio.file.Files.newBufferedReader(r2, r3)
            java.lang.String r3 = "newBufferedReader(this, charset)"
            xe.l0.o(r2, r3)
            r3 = 1
            if.m r0 = re.y.h(r2)     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            r4.A(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0021
        L_0x002f:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x003c }
            xe.i0.d(r3)
            r4 = 0
            re.c.a(r2, r4)
            xe.i0.c(r3)
            return
        L_0x003c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            xe.i0.d(r3)
            re.c.a(r2, r4)
            xe.i0.c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.l(java.nio.file.Path, java.nio.charset.Charset, we.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        xe.i0.d(1);
        re.c.a(r1, r2);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m(java.nio.file.Path r1, java.nio.charset.Charset r2, we.l r3, int r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.nio.charset.Charset r2 = lf.f.f20792b
        L_0x0006:
            java.lang.String r4 = "<this>"
            xe.l0.p(r1, r4)
            java.lang.String r4 = "charset"
            xe.l0.p(r2, r4)
            java.lang.String r4 = "action"
            xe.l0.p(r3, r4)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            java.lang.String r2 = "newBufferedReader(this, charset)"
            xe.l0.o(r1, r2)
            r2 = 0
            if.m r4 = re.y.h(r1)     // Catch:{ all -> 0x0041 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0027:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0041 }
            r3.A(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0027
        L_0x0035:
            zd.u2 r3 = zd.u2.f25116a     // Catch:{ all -> 0x0041 }
            xe.i0.d(r5)
            re.c.a(r1, r2)
            xe.i0.c(r5)
            return
        L_0x0041:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r3 = move-exception
            xe.i0.d(r5)
            re.c.a(r1, r2)
            xe.i0.c(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.m(java.nio.file.Path, java.nio.charset.Charset, we.l, int, java.lang.Object):void");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final byte[] p(Path path) throws IOException {
        l0.p(path, "<this>");
        byte[] readAllBytes = Files.readAllBytes(path);
        l0.o(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final List<String> q(Path path, Charset charset) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    public static /* synthetic */ List r(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        l0.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        re.c.a(r2, r3);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String s(@fh.g java.nio.file.Path r3, @fh.g java.nio.charset.Charset r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r4, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r3, r0)
            r2.<init>(r3, r4)
            java.lang.String r3 = re.y.k(r2)     // Catch:{ all -> 0x0025 }
            r4 = 0
            re.c.a(r2, r4)
            return r3
        L_0x0025:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r4 = move-exception
            re.c.a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.s(java.nio.file.Path, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        return s(path, charset);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(path, "<this>");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        xe.i0.d(1);
        re.c.a(r1, r3);
        xe.i0.c(1);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T w(java.nio.file.Path r1, java.nio.charset.Charset r2, we.l<? super p000if.m<java.lang.String>, ? extends T> r3) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "block"
            xe.l0.p(r3, r0)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            xe.l0.o(r1, r0)     // Catch:{ all -> 0x002c }
            if.m r0 = re.y.h(r1)     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.A(r0)     // Catch:{ all -> 0x002c }
            xe.i0.d(r2)
            r0 = 0
            re.c.a(r1, r0)
            xe.i0.c(r2)
            return r3
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            xe.i0.d(r2)
            re.c.a(r1, r3)
            xe.i0.c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.w(java.nio.file.Path, java.nio.charset.Charset, we.l):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        xe.i0.d(1);
        re.c.a(r0, r1);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object x(java.nio.file.Path r0, java.nio.charset.Charset r1, we.l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.nio.charset.Charset r1 = lf.f.f20792b
        L_0x0006:
            java.lang.String r3 = "<this>"
            xe.l0.p(r0, r3)
            java.lang.String r3 = "charset"
            xe.l0.p(r1, r3)
            java.lang.String r3 = "block"
            xe.l0.p(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            r1 = 0
            java.lang.String r3 = "it"
            xe.l0.o(r0, r3)     // Catch:{ all -> 0x0031 }
            if.m r3 = re.y.h(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.A(r3)     // Catch:{ all -> 0x0031 }
            xe.i0.d(r4)
            re.c.a(r0, r1)
            xe.i0.c(r4)
            return r2
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            xe.i0.d(r4)
            re.c.a(r0, r1)
            xe.i0.c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: se.r.x(java.nio.file.Path, java.nio.charset.Charset, we.l, int, java.lang.Object):java.lang.Object");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(bArr, "array");
        l0.p(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path z(Path path, m<? extends CharSequence> mVar, Charset charset, OpenOption... openOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(mVar, "lines");
        l0.p(charset, "charset");
        l0.p(openOptionArr, "options");
        Path write = Files.write(path, u.N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        l0.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }
}
