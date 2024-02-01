package re;

import fh.g;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import oe.f;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import zd.u2;

public class o extends n {

    public static final class a extends n0 implements l<String, u2> {
        public final /* synthetic */ ArrayList<String> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList) {
            super(1);
            this.P = arrayList;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((String) obj);
            return u2.f25116a;
        }

        public final void c(@g String str) {
            l0.p(str, "it");
            this.P.add(str);
        }
    }

    @f
    public static final InputStreamReader A(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader B(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        xe.i0.d(1);
        re.c.a(r0, r2);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T C(@fh.g java.io.File r2, @fh.g java.nio.charset.Charset r3, @fh.g we.l<? super p000if.m<java.lang.String>, ? extends T> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "block"
            xe.l0.p(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0020
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0028
        L_0x0020:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r3)
            r0 = r2
        L_0x0028:
            r2 = 0
            r3 = 1
            if.m r1 = re.y.h(r0)     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.A(r1)     // Catch:{ all -> 0x003c }
            xe.i0.d(r3)
            re.c.a(r0, r2)
            xe.i0.c(r3)
            return r4
        L_0x003c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003e }
        L_0x003e:
            r4 = move-exception
            xe.i0.d(r3)
            re.c.a(r0, r2)
            xe.i0.c(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.C(java.io.File, java.nio.charset.Charset, we.l):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        xe.i0.d(1);
        re.c.a(r0, r2);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object D(java.io.File r2, java.nio.charset.Charset r3, we.l r4, int r5, java.lang.Object r6) {
        /*
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0006
            java.nio.charset.Charset r3 = lf.f.f20792b
        L_0x0006:
            r5 = 8192(0x2000, float:1.14794E-41)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0019
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x001f
        L_0x0019:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r5)
            r0 = r2
        L_0x001f:
            r2 = 0
            if.m r3 = re.y.h(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Object r3 = r4.A(r3)     // Catch:{ all -> 0x0032 }
            xe.i0.d(r6)
            re.c.a(r0, r2)
            xe.i0.c(r6)
            return r3
        L_0x0032:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            xe.i0.d(r6)
            re.c.a(r0, r2)
            xe.i0.c(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.D(java.io.File, java.nio.charset.Charset, we.l, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        re.c.a(r0, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(@fh.g java.io.File r1, @fh.g byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "array"
            xe.l0.p(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            zd.u2 r1 = zd.u2.f25116a     // Catch:{ all -> 0x0019 }
            r1 = 0
            re.c.a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            re.c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.E(java.io.File, byte[]):void");
    }

    public static final void F(@g File file, @g String str, @g Charset charset) {
        l0.p(file, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        F(file, str, charset);
    }

    @f
    public static final OutputStreamWriter H(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        re.c.a(r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(@fh.g java.io.File r2, @fh.g byte[] r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "array"
            xe.l0.p(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x001a }
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x001a }
            r2 = 0
            re.c.a(r0, r2)
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            re.c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.g(java.io.File, byte[]):void");
    }

    public static final void h(@g File file, @g String str, @g Charset charset) {
        l0.p(file, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = lf.f.f20792b;
        }
        h(file, str, charset);
    }

    @f
    public static final BufferedReader j(File file, Charset charset, int i10) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i10);
    }

    public static /* synthetic */ BufferedReader k(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i10);
    }

    @f
    public static final BufferedWriter l(File file, Charset charset, int i10) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i10);
    }

    public static /* synthetic */ BufferedWriter m(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        re.c.a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(@fh.g java.io.File r1, int r2, @fh.g we.p<? super byte[], ? super java.lang.Integer, zd.u2> r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "action"
            xe.l0.p(r3, r0)
            r0 = 512(0x200, float:7.175E-43)
            int r2 = gf.v.u(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x002c }
            if (r1 > 0) goto L_0x0024
            zd.u2 r1 = zd.u2.f25116a     // Catch:{ all -> 0x002c }
            r1 = 0
            re.c.a(r0, r1)
            return
        L_0x0024:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002c }
            r3.g0(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0017
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            re.c.a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.n(java.io.File, int, we.p):void");
    }

    public static final void o(@g File file, @g p<? super byte[], ? super Integer, u2> pVar) {
        l0.p(file, "<this>");
        l0.p(pVar, "action");
        n(file, 4096, pVar);
    }

    public static final void p(@g File file, @g Charset charset, @g l<? super String, u2> lVar) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        l0.p(lVar, "action");
        y.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    public static /* synthetic */ void q(File file, Charset charset, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        p(file, charset, lVar);
    }

    @f
    public static final FileInputStream r(File file) {
        l0.p(file, "<this>");
        return new FileInputStream(file);
    }

    @f
    public static final FileOutputStream s(File file) {
        l0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @f
    public static final PrintWriter t(File file, Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static /* synthetic */ PrintWriter u(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        re.c.a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw r1;
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] v(@fh.g java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x00a5 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0083
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00a5 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x0028
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x00a5 }
            if (r7 < 0) goto L_0x0028
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r5 <= 0) goto L_0x0035
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x00a5 }
            xe.l0.o(r2, r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x0065
        L_0x0035:
            int r5 = r0.read()     // Catch:{ all -> 0x00a5 }
            r6 = -1
            if (r5 != r6) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            re.g r6 = new re.g     // Catch:{ all -> 0x00a5 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x00a5 }
            r6.write(r5)     // Catch:{ all -> 0x00a5 }
            r5 = 2
            re.b.l(r0, r6, r3, r5, r8)     // Catch:{ all -> 0x00a5 }
            int r5 = r6.size()     // Catch:{ all -> 0x00a5 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x0069
            byte[] r10 = r6.c()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x00a5 }
            xe.l0.o(r2, r7)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = be.o.W0(r10, r2, r1, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x0065:
            re.c.a(r0, r8)
            return r2
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            r2.append(r4)     // Catch:{ all -> 0x00a5 }
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            r5.append(r4)     // Catch:{ all -> 0x00a5 }
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            r5.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x00a5 }
            r3.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            re.c.a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.v(java.io.File):byte[]");
    }

    @g
    public static final List<String> w(@g File file, @g Charset charset) {
        l0.p(file, "<this>");
        l0.p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        return w(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        re.c.a(r0, r2);
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String y(@fh.g java.io.File r2, @fh.g java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "charset"
            xe.l0.p(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = re.y.k(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            re.c.a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            re.c.a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: re.o.y(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    public static /* synthetic */ String z(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        return y(file, charset);
    }
}
