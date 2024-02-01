package g4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d.m0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import t4.k;

public final class o implements ImageHeaderParser {

    /* renamed from: b  reason: collision with root package name */
    public static final String f7956b = "DfltImageHeaderParser";

    /* renamed from: c  reason: collision with root package name */
    public static final int f7957c = 4671814;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7958d = -1991225785;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7959e = 65496;

    /* renamed from: f  reason: collision with root package name */
    public static final int f7960f = 19789;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7961g = 18761;

    /* renamed from: h  reason: collision with root package name */
    public static final String f7962h = "Exif\u0000\u0000";

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f7963i = f7962h.getBytes(Charset.forName("UTF-8"));

    /* renamed from: j  reason: collision with root package name */
    public static final int f7964j = 218;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7965k = 217;

    /* renamed from: l  reason: collision with root package name */
    public static final int f7966l = 255;

    /* renamed from: m  reason: collision with root package name */
    public static final int f7967m = 225;

    /* renamed from: n  reason: collision with root package name */
    public static final int f7968n = 274;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7969o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: p  reason: collision with root package name */
    public static final int f7970p = 1380533830;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7971q = 1464156752;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7972r = 1448097792;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7973s = -256;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7974t = 255;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7975u = 88;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7976v = 76;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7977w = 16;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7978x = 8;

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7979a;

        public a(ByteBuffer byteBuffer) {
            this.f7979a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public int a() throws c.a {
            return (c() << 8) | c();
        }

        public int b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f7979a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f7979a.get(bArr, 0, min);
            return min;
        }

        public short c() throws c.a {
            if (this.f7979a.remaining() >= 1) {
                return (short) (this.f7979a.get() & 255);
            }
            throw new c.a();
        }

        public long skip(long j10) {
            int min = (int) Math.min((long) this.f7979a.remaining(), j10);
            ByteBuffer byteBuffer = this.f7979a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7980a;

        public b(byte[] bArr, int i10) {
            this.f7980a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f7980a.getShort(i10);
            }
            return -1;
        }

        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f7980a.getInt(i10);
            }
            return -1;
        }

        public final boolean c(int i10, int i11) {
            return this.f7980a.remaining() - i10 >= i11;
        }

        public int d() {
            return this.f7980a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f7980a.order(byteOrder);
        }
    }

    public interface c {

        public static final class a extends IOException {
            public static final long O = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i10) throws IOException;

        short c() throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f7981a;

        public d(InputStream inputStream) {
            this.f7981a = inputStream;
        }

        public int a() throws IOException {
            return (c() << 8) | c();
        }

        public int b(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f7981a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 != 0 || i12 != -1) {
                return i11;
            }
            throw new c.a();
        }

        public short c() throws IOException {
            int read = this.f7981a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f7981a.skip(j11);
                if (skip <= 0) {
                    if (this.f7981a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static boolean h(int i10) {
        return (i10 & f7959e) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        String str;
        StringBuilder sb2;
        short a10 = bVar.a(6);
        if (a10 != 18761) {
            if (a10 != 19789 && Log.isLoggable(f7956b, 3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown endianness = ");
                sb3.append(a10);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int b10 = bVar.b(10) + 6;
        short a11 = bVar.a(b10);
        for (int i10 = 0; i10 < a11; i10++) {
            int e10 = e(b10, i10);
            short a12 = bVar.a(e10);
            if (a12 == 274) {
                short a13 = bVar.a(e10 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b11 = bVar.b(e10 + 4);
                    if (b11 < 0) {
                        Log.isLoggable(f7956b, 3);
                    } else {
                        if (Log.isLoggable(f7956b, 3)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Got tagIndex=");
                            sb4.append(i10);
                            sb4.append(" tagType=");
                            sb4.append(a12);
                            sb4.append(" formatCode=");
                            sb4.append(a13);
                            sb4.append(" componentCount=");
                            sb4.append(b11);
                        }
                        int i11 = b11 + f7969o[a13];
                        if (i11 <= 4) {
                            int i12 = e10 + 8;
                            if (i12 < 0 || i12 > bVar.d()) {
                                if (Log.isLoggable(f7956b, 3)) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Illegal tagValueOffset=");
                                    sb5.append(i12);
                                    sb5.append(" tagType=");
                                    sb5.append(a12);
                                }
                            } else if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                return bVar.a(i12);
                            } else {
                                if (Log.isLoggable(f7956b, 3)) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Illegal number of bytes for TI tag data tagType=");
                                    sb6.append(a12);
                                }
                            }
                        } else if (Log.isLoggable(f7956b, 3)) {
                            sb2 = new StringBuilder();
                            str = "Got byte count > 4, not orientation, continuing, formatCode=";
                        }
                    }
                } else if (Log.isLoggable(f7956b, 3)) {
                    sb2 = new StringBuilder();
                    str = "Got invalid format code = ";
                }
                sb2.append(str);
                sb2.append(a13);
            }
        }
        return -1;
    }

    @m0
    public ImageHeaderParser.ImageType a(@m0 ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) k.d(byteBuffer)));
    }

    @m0
    public ImageHeaderParser.ImageType b(@m0 InputStream inputStream) throws IOException {
        return g(new d((InputStream) k.d(inputStream)));
    }

    public int c(@m0 ByteBuffer byteBuffer, @m0 z3.b bVar) throws IOException {
        return f(new a((ByteBuffer) k.d(byteBuffer)), (z3.b) k.d(bVar));
    }

    public int d(@m0 InputStream inputStream, @m0 z3.b bVar) throws IOException {
        return f(new d((InputStream) k.d(inputStream)), (z3.b) k.d(bVar));
    }

    public final int f(c cVar, z3.b bVar) throws IOException {
        byte[] bArr;
        try {
            int a10 = cVar.a();
            if (!h(a10)) {
                if (Log.isLoggable(f7956b, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parser doesn't handle magic number: ");
                    sb2.append(a10);
                }
                return -1;
            }
            int j10 = j(cVar);
            if (j10 == -1) {
                Log.isLoggable(f7956b, 3);
                return -1;
            }
            bArr = (byte[]) bVar.e(j10, byte[].class);
            int l10 = l(cVar, bArr, j10);
            bVar.put(bArr);
            return l10;
        } catch (c.a unused) {
            return -1;
        } catch (Throwable th2) {
            bVar.put(bArr);
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType g(g4.o.c r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.a()     // Catch:{ a -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.c()     // Catch:{ a -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.c()     // Catch:{ a -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ a -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            int r2 = r6.a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.a()     // Catch:{ a -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.a()     // Catch:{ a -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ a -> 0x00a0 }
            short r6 = r6.c()     // Catch:{ a -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ a -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ a -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.o.g(g4.o$c):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public final boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f7963i.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f7963i;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    return false;
                } else {
                    i11++;
                }
            }
        }
        return z10;
    }

    public final int j(c cVar) throws IOException {
        short c10;
        int a10;
        long j10;
        long skip;
        do {
            short c11 = cVar.c();
            if (c11 != 255) {
                if (Log.isLoggable(f7956b, 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown segmentId=");
                    sb2.append(c11);
                }
                return -1;
            }
            c10 = cVar.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                Log.isLoggable(f7956b, 3);
                return -1;
            }
            a10 = cVar.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            j10 = (long) a10;
            skip = cVar.skip(j10);
        } while (skip == j10);
        if (Log.isLoggable(f7956b, 3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unable to skip enough data, type: ");
            sb3.append(c10);
            sb3.append(", wanted to skip: ");
            sb3.append(a10);
            sb3.append(", but actually skipped: ");
            sb3.append(skip);
        }
        return -1;
    }

    public final int l(c cVar, byte[] bArr, int i10) throws IOException {
        int b10 = cVar.b(bArr, i10);
        if (b10 != i10) {
            if (Log.isLoggable(f7956b, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to read exif segment data, length: ");
                sb2.append(i10);
                sb2.append(", actually read: ");
                sb2.append(b10);
            }
            return -1;
        } else if (i(bArr, i10)) {
            return k(new b(bArr, i10));
        } else {
            Log.isLoggable(f7956b, 3);
            return -1;
        }
    }
}
