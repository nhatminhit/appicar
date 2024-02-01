package re;

import fh.g;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import oe.f;
import p000if.m;
import p000if.s;
import ve.h;
import we.l;
import xe.l0;
import xe.n0;
import zd.u2;

@h(name = "TextStreamsKt")
public final class y {

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
    public static final BufferedReader a(Reader reader, int i10) {
        l0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    @f
    public static final BufferedWriter b(Writer writer, int i10) {
        l0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static /* synthetic */ BufferedReader c(Reader reader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        l0.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i10);
    }

    public static /* synthetic */ BufferedWriter d(Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 8192;
        }
        l0.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i10);
    }

    public static final long e(@g Reader reader, @g Writer writer, int i10) {
        l0.p(reader, "<this>");
        l0.p(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += (long) read;
            read = reader.read(cArr);
        }
        return j10;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return e(reader, writer, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        re.c.a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(@fh.g java.io.Reader r3, @fh.g we.l<? super java.lang.String, zd.u2> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "action"
            xe.l0.p(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            if.m r1 = h(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.A(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x0036 }
            re.c.a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            re.c.a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.y.g(java.io.Reader, we.l):void");
    }

    @g
    public static final m<String> h(@g BufferedReader bufferedReader) {
        l0.p(bufferedReader, "<this>");
        return s.f(new s(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        re.c.a(r2, r0);
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] i(@fh.g java.net.URL r2) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.io.InputStream r2 = r2.openStream()
            java.lang.String r0 = "it"
            xe.l0.o(r2, r0)     // Catch:{ all -> 0x0017 }
            byte[] r0 = re.b.p(r2)     // Catch:{ all -> 0x0017 }
            r1 = 0
            re.c.a(r2, r1)
            return r0
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            re.c.a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.y.i(java.net.URL):byte[]");
    }

    @g
    public static final List<String> j(@g Reader reader) {
        l0.p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @g
    public static final String k(@g Reader reader) {
        l0.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        l0.o(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @f
    public static final String l(URL url, Charset charset) {
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    public static /* synthetic */ String m(URL url, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = lf.f.f20792b;
        }
        l0.p(url, "<this>");
        l0.p(charset, "charset");
        return new String(i(url), charset);
    }

    @f
    public static final StringReader n(String str) {
        l0.p(str, "<this>");
        return new StringReader(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        xe.i0.d(1);
        re.c.a(r3, r4);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T o(@fh.g java.io.Reader r3, @fh.g we.l<? super p000if.m<java.lang.String>, ? extends T> r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "block"
            xe.l0.p(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            r1 = 1
            if.m r2 = h(r3)     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r4.A(r2)     // Catch:{ all -> 0x002d }
            xe.i0.d(r1)
            re.c.a(r3, r0)
            xe.i0.c(r1)
            return r4
        L_0x002d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            xe.i0.d(r1)
            re.c.a(r3, r4)
            xe.i0.c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: re.y.o(java.io.Reader, we.l):java.lang.Object");
    }
}
