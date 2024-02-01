package u3;

import android.graphics.Bitmap;
import d.l;
import d.m0;
import d.o0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import u3.a;

public class f implements a {
    public static final String A = "f";
    public static final int B = 4096;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = 4;
    public static final int F = 255;
    @l
    public static final int G = 0;
    @l

    /* renamed from: f  reason: collision with root package name */
    public int[] f13701f;
    @l

    /* renamed from: g  reason: collision with root package name */
    public final int[] f13702g;

    /* renamed from: h  reason: collision with root package name */
    public final a.C0227a f13703h;

    /* renamed from: i  reason: collision with root package name */
    public ByteBuffer f13704i;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f13705j;

    /* renamed from: k  reason: collision with root package name */
    public d f13706k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f13707l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f13708m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f13709n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f13710o;
    @l

    /* renamed from: p  reason: collision with root package name */
    public int[] f13711p;

    /* renamed from: q  reason: collision with root package name */
    public int f13712q;

    /* renamed from: r  reason: collision with root package name */
    public c f13713r;

    /* renamed from: s  reason: collision with root package name */
    public Bitmap f13714s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f13715t;

    /* renamed from: u  reason: collision with root package name */
    public int f13716u;

    /* renamed from: v  reason: collision with root package name */
    public int f13717v;

    /* renamed from: w  reason: collision with root package name */
    public int f13718w;

    /* renamed from: x  reason: collision with root package name */
    public int f13719x;
    @o0

    /* renamed from: y  reason: collision with root package name */
    public Boolean f13720y;
    @m0

    /* renamed from: z  reason: collision with root package name */
    public Bitmap.Config f13721z;

    public f(@m0 a.C0227a aVar) {
        this.f13702g = new int[256];
        this.f13721z = Bitmap.Config.ARGB_8888;
        this.f13703h = aVar;
        this.f13713r = new c();
    }

    public f(@m0 a.C0227a aVar, c cVar, ByteBuffer byteBuffer) {
        this(aVar, cVar, byteBuffer, 1);
    }

    public f(@m0 a.C0227a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
        this(aVar);
        j(cVar, byteBuffer, i10);
    }

    public final int A() {
        return this.f13704i.get() & 255;
    }

    public final Bitmap B(b bVar, b bVar2) {
        int i10;
        int i11;
        Bitmap bitmap;
        int[] iArr = this.f13711p;
        int i12 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f13714s;
            if (bitmap2 != null) {
                this.f13703h.c(bitmap2);
            }
            this.f13714s = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f13657g == 3 && this.f13714s == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i11 = bVar2.f13657g) > 0) {
            if (i11 == 2) {
                if (!bVar.f13656f) {
                    c cVar = this.f13713r;
                    int i13 = cVar.f13675l;
                    if (bVar.f13661k == null || cVar.f13673j != bVar.f13658h) {
                        i12 = i13;
                    }
                }
                int i14 = bVar2.f13654d;
                int i15 = this.f13717v;
                int i16 = i14 / i15;
                int i17 = bVar2.f13652b / i15;
                int i18 = bVar2.f13653c / i15;
                int i19 = bVar2.f13651a / i15;
                int i20 = this.f13719x;
                int i21 = (i17 * i20) + i19;
                int i22 = (i16 * i20) + i21;
                while (i21 < i22) {
                    int i23 = i21 + i18;
                    for (int i24 = i21; i24 < i23; i24++) {
                        iArr[i24] = i12;
                    }
                    i21 += this.f13719x;
                }
            } else if (i11 == 3 && (bitmap = this.f13714s) != null) {
                int i25 = this.f13719x;
                bitmap.getPixels(iArr, 0, i25, 0, 0, i25, this.f13718w);
            }
        }
        w(bVar);
        if (bVar.f13655e || this.f13717v != 1) {
            u(bVar);
        } else {
            v(bVar);
        }
        if (this.f13715t && ((i10 = bVar.f13657g) == 0 || i10 == 1)) {
            if (this.f13714s == null) {
                this.f13714s = y();
            }
            Bitmap bitmap3 = this.f13714s;
            int i26 = this.f13719x;
            bitmap3.setPixels(iArr, 0, i26, 0, 0, i26, this.f13718w);
        }
        Bitmap y10 = y();
        int i27 = this.f13719x;
        y10.setPixels(iArr, 0, i27, 0, 0, i27, this.f13718w);
        return y10;
    }

    public int a() {
        return this.f13713r.f13670g;
    }

    public int b() {
        return this.f13713r.f13669f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        return null;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap c() {
        /*
            r8 = this;
            monitor-enter(r8)
            u3.c r0 = r8.f13713r     // Catch:{ all -> 0x00cf }
            int r0 = r0.f13666c     // Catch:{ all -> 0x00cf }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f13712q     // Catch:{ all -> 0x00cf }
            if (r0 >= 0) goto L_0x0032
        L_0x000d:
            java.lang.String r0 = A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0030
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            u3.c r3 = r8.f13713r     // Catch:{ all -> 0x00cf }
            int r3 = r3.f13666c     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00cf }
            int r3 = r8.f13712q     // Catch:{ all -> 0x00cf }
            r0.append(r3)     // Catch:{ all -> 0x00cf }
        L_0x0030:
            r8.f13716u = r2     // Catch:{ all -> 0x00cf }
        L_0x0032:
            int r0 = r8.f13716u     // Catch:{ all -> 0x00cf }
            r3 = 0
            if (r0 == r2) goto L_0x00b6
            r4 = 2
            if (r0 != r4) goto L_0x003c
            goto L_0x00b6
        L_0x003c:
            r0 = 0
            r8.f13716u = r0     // Catch:{ all -> 0x00cf }
            byte[] r5 = r8.f13705j     // Catch:{ all -> 0x00cf }
            if (r5 != 0) goto L_0x004d
            u3.a$a r5 = r8.f13703h     // Catch:{ all -> 0x00cf }
            r6 = 255(0xff, float:3.57E-43)
            byte[] r5 = r5.e(r6)     // Catch:{ all -> 0x00cf }
            r8.f13705j = r5     // Catch:{ all -> 0x00cf }
        L_0x004d:
            u3.c r5 = r8.f13713r     // Catch:{ all -> 0x00cf }
            java.util.List<u3.b> r5 = r5.f13668e     // Catch:{ all -> 0x00cf }
            int r6 = r8.f13712q     // Catch:{ all -> 0x00cf }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00cf }
            u3.b r5 = (u3.b) r5     // Catch:{ all -> 0x00cf }
            int r6 = r8.f13712q     // Catch:{ all -> 0x00cf }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x0069
            u3.c r7 = r8.f13713r     // Catch:{ all -> 0x00cf }
            java.util.List<u3.b> r7 = r7.f13668e     // Catch:{ all -> 0x00cf }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00cf }
            u3.b r6 = (u3.b) r6     // Catch:{ all -> 0x00cf }
            goto L_0x006a
        L_0x0069:
            r6 = r3
        L_0x006a:
            int[] r7 = r5.f13661k     // Catch:{ all -> 0x00cf }
            if (r7 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            u3.c r7 = r8.f13713r     // Catch:{ all -> 0x00cf }
            int[] r7 = r7.f13664a     // Catch:{ all -> 0x00cf }
        L_0x0073:
            r8.f13701f = r7     // Catch:{ all -> 0x00cf }
            if (r7 != 0) goto L_0x0092
            java.lang.String r0 = A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f13712q     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x008e:
            r8.f13716u = r2     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r3
        L_0x0092:
            boolean r1 = r5.f13656f     // Catch:{ all -> 0x00cf }
            if (r1 == 0) goto L_0x00b0
            int[] r1 = r8.f13702g     // Catch:{ all -> 0x00cf }
            int r2 = r7.length     // Catch:{ all -> 0x00cf }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00cf }
            int[] r1 = r8.f13702g     // Catch:{ all -> 0x00cf }
            r8.f13701f = r1     // Catch:{ all -> 0x00cf }
            int r2 = r5.f13658h     // Catch:{ all -> 0x00cf }
            r1[r2] = r0     // Catch:{ all -> 0x00cf }
            int r0 = r5.f13657g     // Catch:{ all -> 0x00cf }
            if (r0 != r4) goto L_0x00b0
            int r0 = r8.f13712q     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00b0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00cf }
            r8.f13720y = r0     // Catch:{ all -> 0x00cf }
        L_0x00b0:
            android.graphics.Bitmap r0 = r8.B(r5, r6)     // Catch:{ all -> 0x00cf }
            monitor-exit(r8)
            return r0
        L_0x00b6:
            java.lang.String r0 = A     // Catch:{ all -> 0x00cf }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00cf }
            int r1 = r8.f13716u     // Catch:{ all -> 0x00cf }
            r0.append(r1)     // Catch:{ all -> 0x00cf }
        L_0x00cd:
            monitor-exit(r8)
            return r3
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.f.c():android.graphics.Bitmap");
    }

    public void clear() {
        this.f13713r = null;
        byte[] bArr = this.f13710o;
        if (bArr != null) {
            this.f13703h.d(bArr);
        }
        int[] iArr = this.f13711p;
        if (iArr != null) {
            this.f13703h.f(iArr);
        }
        Bitmap bitmap = this.f13714s;
        if (bitmap != null) {
            this.f13703h.c(bitmap);
        }
        this.f13714s = null;
        this.f13704i = null;
        this.f13720y = null;
        byte[] bArr2 = this.f13705j;
        if (bArr2 != null) {
            this.f13703h.d(bArr2);
        }
    }

    public void d() {
        this.f13712q = (this.f13712q + 1) % this.f13713r.f13666c;
    }

    public int e() {
        return this.f13713r.f13666c;
    }

    public int f() {
        int i10;
        if (this.f13713r.f13666c <= 0 || (i10 = this.f13712q) < 0) {
            return 0;
        }
        return i(i10);
    }

    public int g() {
        return this.f13716u;
    }

    @m0
    public ByteBuffer getData() {
        return this.f13704i;
    }

    public void h(@m0 Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f13721z = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    public int i(int i10) {
        if (i10 >= 0) {
            c cVar = this.f13713r;
            if (i10 < cVar.f13666c) {
                return cVar.f13668e.get(i10).f13659i;
            }
        }
        return -1;
    }

    public synchronized void j(@m0 c cVar, @m0 ByteBuffer byteBuffer, int i10) {
        if (i10 > 0) {
            int highestOneBit = Integer.highestOneBit(i10);
            this.f13716u = 0;
            this.f13713r = cVar;
            this.f13712q = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f13704i = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f13704i.order(ByteOrder.LITTLE_ENDIAN);
            this.f13715t = false;
            Iterator<b> it = cVar.f13668e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f13657g == 3) {
                        this.f13715t = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f13717v = highestOneBit;
            int i11 = cVar.f13669f;
            this.f13719x = i11 / highestOneBit;
            int i12 = cVar.f13670g;
            this.f13718w = i12 / highestOneBit;
            this.f13710o = this.f13703h.e(i11 * i12);
            this.f13711p = this.f13703h.b(this.f13719x * this.f13718w);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
        }
    }

    public synchronized void k(@m0 c cVar, @m0 byte[] bArr) {
        r(cVar, ByteBuffer.wrap(bArr));
    }

    public void l() {
        this.f13712q = -1;
    }

    public int m() {
        return this.f13712q;
    }

    public int n() {
        return this.f13713r.f13676m;
    }

    public int o(@o0 InputStream inputStream, int i10) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException unused) {
            }
        } else {
            this.f13716u = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return this.f13716u;
    }

    public int p() {
        return this.f13704i.limit() + this.f13710o.length + (this.f13711p.length * 4);
    }

    public int q() {
        int i10 = this.f13713r.f13676m;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    public synchronized void r(@m0 c cVar, @m0 ByteBuffer byteBuffer) {
        j(cVar, byteBuffer, 1);
    }

    public synchronized int read(@o0 byte[] bArr) {
        c d10 = x().r(bArr).d();
        this.f13713r = d10;
        if (bArr != null) {
            k(d10, bArr);
        }
        return this.f13716u;
    }

    @Deprecated
    public int s() {
        int i10 = this.f13713r.f13676m;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    @l
    public final int t(int i10, int i11, int i12) {
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < this.f13717v + i10; i18++) {
            byte[] bArr = this.f13710o;
            if (i18 >= bArr.length || i18 >= i11) {
                break;
            }
            int i19 = this.f13701f[bArr[i18] & 255];
            if (i19 != 0) {
                i13 += (i19 >> 24) & 255;
                i14 += (i19 >> 16) & 255;
                i15 += (i19 >> 8) & 255;
                i16 += i19 & 255;
                i17++;
            }
        }
        int i20 = i10 + i12;
        for (int i21 = i20; i21 < this.f13717v + i20; i21++) {
            byte[] bArr2 = this.f13710o;
            if (i21 >= bArr2.length || i21 >= i11) {
                break;
            }
            int i22 = this.f13701f[bArr2[i21] & 255];
            if (i22 != 0) {
                i13 += (i22 >> 24) & 255;
                i14 += (i22 >> 16) & 255;
                i15 += (i22 >> 8) & 255;
                i16 += i22 & 255;
                i17++;
            }
        }
        if (i17 == 0) {
            return 0;
        }
        return ((i13 / i17) << 24) | ((i14 / i17) << 16) | ((i15 / i17) << 8) | (i16 / i17);
    }

    public final void u(b bVar) {
        Boolean bool;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        b bVar2 = bVar;
        int[] iArr = this.f13711p;
        int i15 = bVar2.f13654d;
        int i16 = this.f13717v;
        int i17 = i15 / i16;
        int i18 = bVar2.f13652b / i16;
        int i19 = bVar2.f13653c / i16;
        int i20 = bVar2.f13651a / i16;
        boolean z10 = this.f13712q == 0;
        int i21 = this.f13719x;
        int i22 = this.f13718w;
        byte[] bArr = this.f13710o;
        int[] iArr2 = this.f13701f;
        Boolean bool2 = this.f13720y;
        int i23 = 8;
        int i24 = 0;
        int i25 = 0;
        int i26 = 1;
        while (true) {
            bool = bool2;
            if (i24 >= i17) {
                break;
            }
            if (bVar2.f13655e) {
                if (i25 >= i17) {
                    i10 = i17;
                    int i27 = i26 + 1;
                    if (i27 == 2) {
                        i26 = i27;
                        i25 = 4;
                    } else if (i27 != 3) {
                        i26 = i27;
                        if (i27 == 4) {
                            i25 = 1;
                            i23 = 2;
                        }
                    } else {
                        i26 = i27;
                        i23 = 4;
                        i25 = 2;
                    }
                } else {
                    i10 = i17;
                }
                i11 = i25 + i23;
            } else {
                i10 = i17;
                i11 = i25;
                i25 = i24;
            }
            int i28 = i25 + i18;
            boolean z11 = i16 == 1;
            if (i28 < i22) {
                int i29 = i28 * i21;
                int i30 = i29 + i20;
                int i31 = i30 + i19;
                int i32 = i29 + i21;
                if (i32 < i31) {
                    i31 = i32;
                }
                i12 = i11;
                int i33 = i24 * i16 * bVar2.f13653c;
                if (z11) {
                    int i34 = i30;
                    while (true) {
                        i14 = i18;
                        if (i34 >= i31) {
                            break;
                        }
                        int i35 = iArr2[bArr[i33] & 255];
                        if (i35 != 0) {
                            iArr[i34] = i35;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i33 += i16;
                        i34++;
                        i18 = i14;
                    }
                } else {
                    i14 = i18;
                    int i36 = ((i31 - i30) * i16) + i33;
                    int i37 = i30;
                    while (true) {
                        i13 = i19;
                        if (i37 >= i31) {
                            break;
                        }
                        int t10 = t(i33, i36, bVar2.f13653c);
                        if (t10 != 0) {
                            iArr[i37] = t10;
                        } else if (z10 && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i33 += i16;
                        i37++;
                        i19 = i13;
                    }
                    bool2 = bool;
                    i24++;
                    i18 = i14;
                    i19 = i13;
                    i17 = i10;
                    i25 = i12;
                }
            } else {
                i12 = i11;
                i14 = i18;
            }
            i13 = i19;
            bool2 = bool;
            i24++;
            i18 = i14;
            i19 = i13;
            i17 = i10;
            i25 = i12;
        }
        if (this.f13720y == null) {
            this.f13720y = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    public final void v(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.f13711p;
        int i10 = bVar2.f13654d;
        int i11 = bVar2.f13652b;
        int i12 = bVar2.f13653c;
        int i13 = bVar2.f13651a;
        boolean z10 = this.f13712q == 0;
        int i14 = this.f13719x;
        byte[] bArr = this.f13710o;
        int[] iArr2 = this.f13701f;
        int i15 = 0;
        byte b10 = -1;
        while (i15 < i10) {
            int i16 = (i15 + i11) * i14;
            int i17 = i16 + i13;
            int i18 = i17 + i12;
            int i19 = i16 + i14;
            if (i19 < i18) {
                i18 = i19;
            }
            int i20 = bVar2.f13653c * i15;
            int i21 = i17;
            while (i21 < i18) {
                byte b11 = bArr[i20];
                int i22 = i10;
                byte b12 = b11 & 255;
                if (b12 != b10) {
                    int i23 = iArr2[b12];
                    if (i23 != 0) {
                        iArr[i21] = i23;
                    } else {
                        b10 = b11;
                    }
                }
                i20++;
                i21++;
                b bVar3 = bVar;
                i10 = i22;
            }
            int i24 = i10;
            i15++;
            bVar2 = bVar;
        }
        Boolean bool = this.f13720y;
        this.f13720y = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f13720y == null && z10 && b10 != -1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(u3.b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f13704i
            int r3 = r1.f13660j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            u3.c r1 = r0.f13713r
            int r2 = r1.f13669f
            int r1 = r1.f13670g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f13653c
            int r1 = r1.f13654d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f13710o
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            u3.a$a r1 = r0.f13703h
            byte[] r1 = r1.e(r2)
            r0.f13710o = r1
        L_0x002a:
            byte[] r1 = r0.f13710o
            short[] r3 = r0.f13707l
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f13707l = r3
        L_0x0036:
            short[] r3 = r0.f13707l
            byte[] r5 = r0.f13708m
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f13708m = r5
        L_0x0040:
            byte[] r5 = r0.f13708m
            byte[] r6 = r0.f13709n
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f13709n = r6
        L_0x004c:
            byte[] r6 = r0.f13709n
            int r7 = r28.A()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f13705j
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r24 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014b
            if (r16 != 0) goto L_0x0093
            int r16 = r28.z()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f13716u = r3
            goto L_0x014b
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ad:
            if (r4 < r15) goto L_0x0135
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d8
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0082
        L_0x00d8:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ec
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ad
        L_0x00ec:
            if (r11 < r8) goto L_0x00f5
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f6
        L_0x00f5:
            r7 = r11
        L_0x00f6:
            if (r7 < r9) goto L_0x0101
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f6
        L_0x0101:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0108:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0115
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0108
        L_0x0115:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012c
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012c
            if (r8 >= r6) goto L_0x012c
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012c:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ad
        L_0x0135:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0082
        L_0x014b:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.f.w(u3.b):void");
    }

    @m0
    public final d x() {
        if (this.f13706k == null) {
            this.f13706k = new d();
        }
        return this.f13706k;
    }

    public final Bitmap y() {
        Boolean bool = this.f13720y;
        Bitmap a10 = this.f13703h.a(this.f13719x, this.f13718w, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f13721z);
        a10.setHasAlpha(true);
        return a10;
    }

    public final int z() {
        int A2 = A();
        if (A2 <= 0) {
            return A2;
        }
        ByteBuffer byteBuffer = this.f13704i;
        byteBuffer.get(this.f13705j, 0, Math.min(A2, byteBuffer.remaining()));
        return A2;
    }
}
