package re;

import fh.g;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import xe.l0;

public final class r {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final r f22507a = new r();

    /* renamed from: b  reason: collision with root package name */
    public static final int f22508b = 32;

    /* renamed from: c  reason: collision with root package name */
    public static CharsetDecoder f22509c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f22510d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f22511e;
    @g

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f22512f;
    @g

    /* renamed from: g  reason: collision with root package name */
    public static final ByteBuffer f22513g;
    @g

    /* renamed from: h  reason: collision with root package name */
    public static final CharBuffer f22514h;
    @g

    /* renamed from: i  reason: collision with root package name */
    public static final StringBuilder f22515i = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        f22511e = bArr;
        char[] cArr = new char[32];
        f22512f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        l0.o(wrap, "wrap(bytes)");
        f22513g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        l0.o(wrap2, "wrap(chars)");
        f22514h = wrap2;
    }

    public final int a() {
        ByteBuffer byteBuffer = f22513g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    public final int b(boolean z10) {
        while (true) {
            CharsetDecoder charsetDecoder = f22509c;
            if (charsetDecoder == null) {
                l0.S("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f22513g;
            CharBuffer charBuffer = f22514h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z10);
            l0.o(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb2 = f22515i;
            char[] cArr = f22512f;
            int i10 = position - 1;
            sb2.append(cArr, 0, i10);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i10]);
        }
    }

    public final int c(int i10, int i11) {
        ByteBuffer byteBuffer = f22513g;
        byteBuffer.limit(i10);
        f22514h.position(i11);
        int b10 = b(true);
        CharsetDecoder charsetDecoder = f22509c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (f22515i.length() != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r11 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r2 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11 = c(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (xe.l0.g(r0.charset(), r12) == false) goto L_0x0022;
     */
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String d(@fh.g java.io.InputStream r11, @fh.g java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            xe.l0.p(r11, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "charset"
            xe.l0.p(r12, r0)     // Catch:{ all -> 0x00c9 }
            java.nio.charset.CharsetDecoder r0 = f22509c     // Catch:{ all -> 0x00c9 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "decoder"
            xe.l0.S(r0)     // Catch:{ all -> 0x00c9 }
            r0 = r1
        L_0x0018:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x00c9 }
            boolean r0 = xe.l0.g(r0, r12)     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            r10.g(r12)     // Catch:{ all -> 0x00c9 }
        L_0x0025:
            r12 = 0
            r0 = r12
            r2 = r0
        L_0x0028:
            int r3 = r11.read()     // Catch:{ all -> 0x00c9 }
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L_0x004c
            java.lang.StringBuilder r11 = f22515i     // Catch:{ all -> 0x00c9 }
            int r11 = r11.length()     // Catch:{ all -> 0x00c9 }
            if (r11 != 0) goto L_0x003e
            r11 = r7
            goto L_0x003f
        L_0x003e:
            r11 = r12
        L_0x003f:
            if (r11 == 0) goto L_0x0047
            if (r0 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            monitor-exit(r10)
            return r1
        L_0x0047:
            int r11 = r10.c(r0, r2)     // Catch:{ all -> 0x00c9 }
            goto L_0x007a
        L_0x004c:
            byte[] r6 = f22511e     // Catch:{ all -> 0x00c9 }
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch:{ all -> 0x00c9 }
            r6[r0] = r9     // Catch:{ all -> 0x00c9 }
            if (r3 == r5) goto L_0x005e
            if (r8 == r4) goto L_0x005e
            boolean r0 = f22510d     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = r8
            goto L_0x0028
        L_0x005e:
            java.nio.ByteBuffer r0 = f22513g     // Catch:{ all -> 0x00c9 }
            r0.limit(r8)     // Catch:{ all -> 0x00c9 }
            java.nio.CharBuffer r3 = f22514h     // Catch:{ all -> 0x00c9 }
            r3.position(r2)     // Catch:{ all -> 0x00c9 }
            int r2 = r10.b(r12)     // Catch:{ all -> 0x00c9 }
            if (r2 <= 0) goto L_0x00c3
            char[] r3 = f22512f     // Catch:{ all -> 0x00c9 }
            int r6 = r2 + -1
            char r3 = r3[r6]     // Catch:{ all -> 0x00c9 }
            if (r3 != r5) goto L_0x00c3
            r0.position(r12)     // Catch:{ all -> 0x00c9 }
            r11 = r2
        L_0x007a:
            if (r11 <= 0) goto L_0x0092
            char[] r0 = f22512f     // Catch:{ all -> 0x00c9 }
            int r1 = r11 + -1
            char r1 = r0[r1]     // Catch:{ all -> 0x00c9 }
            if (r1 != r5) goto L_0x0092
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x0092
            int r1 = r11 + -1
            char r0 = r0[r1]     // Catch:{ all -> 0x00c9 }
            r1 = 13
            if (r0 != r1) goto L_0x0092
            int r11 = r11 + -1
        L_0x0092:
            java.lang.StringBuilder r0 = f22515i     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r7 = r12
        L_0x009c:
            if (r7 == 0) goto L_0x00a7
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00c9 }
            char[] r1 = f22512f     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r0
        L_0x00a7:
            char[] r1 = f22512f     // Catch:{ all -> 0x00c9 }
            r0.append(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "sb.toString()"
            xe.l0.o(r11, r1)     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 <= r4) goto L_0x00be
            r10.f()     // Catch:{ all -> 0x00c9 }
        L_0x00be:
            r0.setLength(r12)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r11
        L_0x00c3:
            int r0 = r10.a()     // Catch:{ all -> 0x00c9 }
            goto L_0x0028
        L_0x00c9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: re.r.d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    public final void e() {
        CharsetDecoder charsetDecoder = f22509c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f22513g.position(0);
        f22515i.setLength(0);
    }

    public final void f() {
        StringBuilder sb2 = f22515i;
        sb2.setLength(32);
        sb2.trimToSize();
    }

    public final void g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        l0.o(newDecoder, "charset.newDecoder()");
        f22509c = newDecoder;
        ByteBuffer byteBuffer = f22513g;
        byteBuffer.clear();
        CharBuffer charBuffer = f22514h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f22509c;
        if (charsetDecoder == null) {
            l0.S("decoder");
            charsetDecoder = null;
        }
        boolean z10 = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == 10) {
            z10 = true;
        }
        f22510d = z10;
        e();
    }
}
