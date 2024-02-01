package g4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d.o0;
import d.t0;
import g4.p;
import g4.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import t4.g;
import t4.k;
import t4.m;
import v3.h;
import v3.i;
import v3.j;
import y3.v;
import z3.e;

public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final String f7991f = "Downsampler";

    /* renamed from: g  reason: collision with root package name */
    public static final h<v3.b> f7992g = h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", v3.b.Q);

    /* renamed from: h  reason: collision with root package name */
    public static final h<j> f7993h = h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", j.SRGB);
    @Deprecated

    /* renamed from: i  reason: collision with root package name */
    public static final h<p> f7994i = p.f7989h;

    /* renamed from: j  reason: collision with root package name */
    public static final h<Boolean> f7995j;

    /* renamed from: k  reason: collision with root package name */
    public static final h<Boolean> f7996k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f7997l = "image/vnd.wap.wbmp";

    /* renamed from: m  reason: collision with root package name */
    public static final String f7998m = "image/x-ico";

    /* renamed from: n  reason: collision with root package name */
    public static final Set<String> f7999n = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{f7997l, f7998m})));

    /* renamed from: o  reason: collision with root package name */
    public static final b f8000o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f8001p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: q  reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f8002q = m.f(0);

    /* renamed from: a  reason: collision with root package name */
    public final e f8003a;

    /* renamed from: b  reason: collision with root package name */
    public final DisplayMetrics f8004b;

    /* renamed from: c  reason: collision with root package name */
    public final z3.b f8005c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f8006d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8007e = w.a();

    public class a implements b {
        public void a() {
        }

        public void b(e eVar, Bitmap bitmap) {
        }
    }

    public interface b {
        void a();

        void b(e eVar, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f7995j = h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f7996k = h.g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public q(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, e eVar, z3.b bVar) {
        this.f8006d = list;
        this.f8004b = (DisplayMetrics) k.d(displayMetrics);
        this.f8003a = (e) k.d(eVar);
        this.f8005c = (z3.b) k.d(bVar);
    }

    public static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(((double) l10) * d10);
        return x((d10 / ((double) (((float) x10) / ((float) l10)))) * ((double) x10));
    }

    public static void c(ImageHeaderParser.ImageType imageType, x xVar, b bVar, e eVar, p pVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) throws IOException {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ImageHeaderParser.ImageType imageType2 = imageType;
        p pVar2 = pVar;
        int i20 = i11;
        int i21 = i12;
        int i22 = i13;
        int i23 = i14;
        BitmapFactory.Options options2 = options;
        if (i20 <= 0 || i21 <= 0) {
            String str = "x";
            if (Log.isLoggable(f7991f, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to determine dimensions for: ");
                sb2.append(imageType2);
                sb2.append(" with target [");
                sb2.append(i22);
                sb2.append(str);
                sb2.append(i23);
                sb2.append("]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i15 = i20;
            i16 = i21;
        } else {
            i16 = i20;
            i15 = i21;
        }
        float b10 = pVar2.b(i16, i15, i22, i23);
        if (b10 > 0.0f) {
            p.g a10 = pVar2.a(i16, i15, i22, i23);
            if (a10 != null) {
                float f10 = (float) i16;
                float f11 = (float) i15;
                int x10 = i16 / x((double) (b10 * f10));
                int x11 = i15 / x((double) (b10 * f11));
                p.g gVar = p.g.MEMORY;
                int max = a10 == gVar ? Math.max(x10, x11) : Math.min(x10, x11);
                int i24 = Build.VERSION.SDK_INT;
                String str2 = "x";
                String str3 = f7991f;
                if (i24 > 23 || !f7999n.contains(options2.outMimeType)) {
                    int max2 = Math.max(1, Integer.highestOneBit(max));
                    if (a10 == gVar && ((float) max2) < 1.0f / b10) {
                        max2 <<= 1;
                    }
                    i17 = max2;
                } else {
                    i17 = 1;
                }
                options2.inSampleSize = i17;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i17, 8);
                    i18 = (int) Math.ceil((double) (f10 / min));
                    i19 = (int) Math.ceil((double) (f11 / min));
                    int i25 = i17 / 8;
                    if (i25 > 0) {
                        i18 /= i25;
                        i19 /= i25;
                    }
                } else {
                    if (!(imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A)) {
                        if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                            if (i24 >= 24) {
                                float f12 = (float) i17;
                                i18 = Math.round(f10 / f12);
                                i19 = Math.round(f11 / f12);
                            }
                        } else if (i16 % i17 == 0 && i15 % i17 == 0) {
                            i18 = i16 / i17;
                            i19 = i15 / i17;
                        } else {
                            int[] m10 = m(xVar, options2, bVar, eVar);
                            i18 = m10[0];
                            i19 = m10[1];
                        }
                    }
                    float f13 = (float) i17;
                    i18 = (int) Math.floor((double) (f10 / f13));
                    i19 = (int) Math.floor((double) (f11 / f13));
                }
                double b11 = (double) pVar2.b(i18, i19, i22, i23);
                options2.inTargetDensity = a(b11);
                options2.inDensity = l(b11);
                if (s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str3, 2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Calculate scaling, source: [");
                    sb3.append(i11);
                    String str4 = str2;
                    sb3.append(str4);
                    sb3.append(i12);
                    sb3.append("], degreesToRotate: ");
                    sb3.append(i10);
                    sb3.append(", target: [");
                    sb3.append(i22);
                    sb3.append(str4);
                    sb3.append(i23);
                    sb3.append("], power of two scaled: [");
                    sb3.append(i18);
                    sb3.append(str4);
                    sb3.append(i19);
                    sb3.append("], exact scale factor: ");
                    sb3.append(b10);
                    sb3.append(", power of 2 sample size: ");
                    sb3.append(i17);
                    sb3.append(", adjusted scale factor: ");
                    sb3.append(b11);
                    sb3.append(", target density: ");
                    sb3.append(options2.inTargetDensity);
                    sb3.append(", density: ");
                    sb3.append(options2.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i26 = i21;
        String str5 = "x";
        int i27 = i20;
        throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + pVar2 + ", source: [" + i27 + str5 + i26 + "], target: [" + i22 + str5 + i23 + "]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap i(g4.x r4, android.graphics.BitmapFactory.Options r5, g4.q.b r6, z3.e r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.a()
            r4.c()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = g4.g0.i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = g4.g0.i()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0049
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0048
            r7.d(r1)     // Catch:{ IOException -> 0x0047 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0047 }
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0047 }
            java.util.concurrent.locks.Lock r5 = g4.g0.i()
            r5.unlock()
            return r4
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0049:
            java.util.concurrent.locks.Lock r5 = g4.g0.i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.q.i(g4.x, android.graphics.BitmapFactory$Options, g4.q$b, z3.e):android.graphics.Bitmap");
    }

    @o0
    @TargetApi(19)
    public static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (q.class) {
            Queue<BitmapFactory.Options> queue = f8002q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    public static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    public static int[] m(x xVar, BitmapFactory.Options options, b bVar, e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(xVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    public static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean s(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.q.s(android.graphics.BitmapFactory$Options):boolean");
    }

    public static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Decoded ");
        sb2.append(j(bitmap));
        sb2.append(" from [");
        sb2.append(i10);
        sb2.append("x");
        sb2.append(i11);
        sb2.append("] ");
        sb2.append(str);
        sb2.append(" with inBitmap ");
        sb2.append(n(options));
        sb2.append(" for [");
        sb2.append(i12);
        sb2.append("x");
        sb2.append(i13);
        sb2.append("], sample size: ");
        sb2.append(options.inSampleSize);
        sb2.append(", density: ");
        sb2.append(options.inDensity);
        sb2.append(", target density: ");
        sb2.append(options.inTargetDensity);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        sb2.append(", duration: ");
        sb2.append(g.a(j10));
    }

    public static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    public static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f8002q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    @TargetApi(26)
    public static void y(BitmapFactory.Options options, e eVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.g(i10, i11, config);
    }

    public final void b(x xVar, v3.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        if (!this.f8007e.e(i10, i11, options, z10, z11)) {
            if (bVar != v3.b.PREFER_ARGB_8888) {
                boolean z12 = false;
                try {
                    z12 = xVar.d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable(f7991f, 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Cannot determine whether the image has alpha or not from header, format ");
                        sb2.append(bVar);
                    }
                }
                Bitmap.Config config = z12 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    @t0(21)
    public v<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i iVar) throws IOException {
        return e(new x.b(parcelFileDescriptor, this.f8006d, this.f8005c), i10, i11, iVar, f8000o);
    }

    public final v<Bitmap> e(x xVar, int i10, int i11, i iVar, b bVar) throws IOException {
        i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f8005c.e(65536, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        v3.b bVar2 = (v3.b) iVar2.c(f7992g);
        j jVar = (j) iVar2.c(f7993h);
        p pVar = (p) iVar2.c(p.f7989h);
        boolean booleanValue = ((Boolean) iVar2.c(f7995j)).booleanValue();
        h hVar = f7996k;
        try {
            return g.f(h(xVar, k10, pVar, bVar2, jVar, iVar2.c(hVar) != null && ((Boolean) iVar2.c(hVar)).booleanValue(), i10, i11, booleanValue, bVar), this.f8003a);
        } finally {
            v(k10);
            this.f8005c.put(bArr);
        }
    }

    public v<Bitmap> f(InputStream inputStream, int i10, int i11, i iVar) throws IOException {
        return g(inputStream, i10, i11, iVar, f8000o);
    }

    public v<Bitmap> g(InputStream inputStream, int i10, int i11, i iVar, b bVar) throws IOException {
        return e(new x.a(inputStream, this.f8006d, this.f8005c), i10, i11, iVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0157, code lost:
        if (r0 >= 26) goto L_0x0159;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap h(g4.x r29, android.graphics.BitmapFactory.Options r30, g4.p r31, v3.b r32, v3.j r33, boolean r34, int r35, int r36, boolean r37, g4.q.b r38) throws java.io.IOException {
        /*
            r28 = this;
            r8 = r28
            r7 = r29
            r6 = r30
            r5 = r38
            long r20 = t4.g.b()
            z3.e r0 = r8.f8003a
            int[] r0 = m(r7, r6, r5, r0)
            r22 = 0
            r4 = r0[r22]
            r3 = 1
            r2 = r0[r3]
            java.lang.String r1 = r6.outMimeType
            r0 = -1
            if (r4 == r0) goto L_0x0024
            if (r2 != r0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r23 = r34
            goto L_0x0026
        L_0x0024:
            r23 = r22
        L_0x0026:
            int r0 = r29.a()
            int r14 = g4.g0.j(r0)
            boolean r24 = g4.g0.m(r0)
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = r35
            if (r15 != r9) goto L_0x0046
            boolean r10 = r(r14)
            r13 = r36
            if (r10 == 0) goto L_0x0043
            r25 = r2
            goto L_0x004a
        L_0x0043:
            r25 = r4
            goto L_0x004a
        L_0x0046:
            r13 = r36
            r25 = r15
        L_0x004a:
            if (r13 != r9) goto L_0x0058
            boolean r9 = r(r14)
            if (r9 == 0) goto L_0x0055
            r26 = r4
            goto L_0x005a
        L_0x0055:
            r26 = r2
            goto L_0x005a
        L_0x0058:
            r26 = r13
        L_0x005a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r12 = r29.d()
            z3.e r11 = r8.f8003a
            r9 = r12
            r10 = r29
            r16 = r11
            r11 = r38
            r27 = r12
            r12 = r16
            r13 = r31
            r15 = r4
            r16 = r2
            r17 = r25
            r18 = r26
            r19 = r30
            c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r15 = r0
            r0 = r28
            r11 = r1
            r1 = r29
            r10 = r2
            r2 = r32
            r9 = r3
            r3 = r23
            r12 = r4
            r4 = r24
            r13 = r5
            r5 = r30
            r14 = r6
            r6 = r25
            r7 = r26
            r0.b(r1, r2, r3, r4, r5, r6, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r14.inSampleSize
            r1 = r27
            boolean r1 = r8.z(r1)
            java.lang.String r3 = "Downsampler"
            if (r1 == 0) goto L_0x0139
            if (r12 < 0) goto L_0x00ae
            if (r10 < 0) goto L_0x00ae
            if (r37 == 0) goto L_0x00ae
            r6 = r3
            r2 = r25
            r3 = r26
            goto L_0x012f
        L_0x00ae:
            boolean r1 = s(r30)
            if (r1 == 0) goto L_0x00bc
            int r1 = r14.inTargetDensity
            float r1 = (float) r1
            int r4 = r14.inDensity
            float r4 = (float) r4
            float r1 = r1 / r4
            goto L_0x00be
        L_0x00bc:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x00be:
            int r4 = r14.inSampleSize
            float r5 = (float) r12
            float r6 = (float) r4
            float r5 = r5 / r6
            r32 = r3
            double r2 = (double) r5
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            float r3 = (float) r10
            float r3 = r3 / r6
            double r5 = (double) r3
            double r5 = java.lang.Math.ceil(r5)
            int r3 = (int) r5
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = java.lang.Math.round(r2)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = java.lang.Math.round(r3)
            r6 = r32
            r5 = 2
            boolean r7 = android.util.Log.isLoggable(r6, r5)
            if (r7 == 0) goto L_0x012f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Calculated target ["
            r5.append(r7)
            r5.append(r2)
            java.lang.String r7 = "x"
            r5.append(r7)
            r5.append(r3)
            java.lang.String r9 = "] for source ["
            r5.append(r9)
            r5.append(r12)
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = "], sampleSize: "
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = ", targetDensity: "
            r5.append(r4)
            int r4 = r14.inTargetDensity
            r5.append(r4)
            java.lang.String r4 = ", density: "
            r5.append(r4)
            int r4 = r14.inDensity
            r5.append(r4)
            java.lang.String r4 = ", density multiplier: "
            r5.append(r4)
            r5.append(r1)
        L_0x012f:
            if (r2 <= 0) goto L_0x013a
            if (r3 <= 0) goto L_0x013a
            z3.e r1 = r8.f8003a
            y(r14, r1, r2, r3)
            goto L_0x013a
        L_0x0139:
            r6 = r3
        L_0x013a:
            r1 = 28
            if (r0 < r1) goto L_0x0155
            v3.j r0 = v3.j.DISPLAY_P3
            r1 = r33
            if (r1 != r0) goto L_0x0150
            android.graphics.ColorSpace r0 = r14.outColorSpace
            if (r0 == 0) goto L_0x0150
            boolean r0 = r0.isWideGamut()
            if (r0 == 0) goto L_0x0150
            r22 = 1
        L_0x0150:
            if (r22 == 0) goto L_0x0159
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L_0x015b
        L_0x0155:
            r1 = 26
            if (r0 < r1) goto L_0x0161
        L_0x0159:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
        L_0x015b:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r14.inPreferredColorSpace = r0
        L_0x0161:
            z3.e r0 = r8.f8003a
            r1 = r29
            android.graphics.Bitmap r0 = i(r1, r14, r13, r0)
            z3.e r1 = r8.f8003a
            r13.b(r1, r0)
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r6, r1)
            if (r1 == 0) goto L_0x0184
            r9 = r12
            r12 = r30
            r13 = r0
            r14 = r35
            r1 = r15
            r15 = r36
            r16 = r20
            t(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0185
        L_0x0184:
            r1 = r15
        L_0x0185:
            r2 = 0
            if (r0 == 0) goto L_0x01a0
            android.util.DisplayMetrics r2 = r8.f8004b
            int r2 = r2.densityDpi
            r0.setDensity(r2)
            z3.e r2 = r8.f8003a
            android.graphics.Bitmap r2 = g4.g0.o(r2, r0, r1)
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L_0x01a0
            z3.e r1 = r8.f8003a
            r1.d(r0)
        L_0x01a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.q.h(g4.x, android.graphics.BitmapFactory$Options, g4.p, v3.b, v3.j, boolean, int, int, boolean, g4.q$b):android.graphics.Bitmap");
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return w3.m.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    public final boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
