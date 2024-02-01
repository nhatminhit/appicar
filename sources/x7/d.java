package x7;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import b6.i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.DummySurface;
import d.m0;
import d.o0;
import d8.r;
import g6.e;
import g6.f;
import h6.l;
import h6.n;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import t6.d;
import u0.m;
import w7.k0;
import w7.p;
import w7.q0;
import w7.s;
import x7.q;

public class d extends t6.b {

    /* renamed from: k2  reason: collision with root package name */
    public static final String f15157k2 = "MediaCodecVideoRenderer";

    /* renamed from: l2  reason: collision with root package name */
    public static final String f15158l2 = "crop-left";

    /* renamed from: m2  reason: collision with root package name */
    public static final String f15159m2 = "crop-right";

    /* renamed from: n2  reason: collision with root package name */
    public static final String f15160n2 = "crop-bottom";

    /* renamed from: o2  reason: collision with root package name */
    public static final String f15161o2 = "crop-top";

    /* renamed from: p2  reason: collision with root package name */
    public static final int[] f15162p2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: q2  reason: collision with root package name */
    public static final int f15163q2 = 10;

    /* renamed from: r2  reason: collision with root package name */
    public static final float f15164r2 = 1.5f;

    /* renamed from: s2  reason: collision with root package name */
    public static boolean f15165s2;

    /* renamed from: t2  reason: collision with root package name */
    public static boolean f15166t2;
    public final q.a A1;
    public final long B1;
    public final int C1;
    public final boolean D1;
    public final long[] E1;
    public final long[] F1;
    public b G1;
    public boolean H1;
    public Surface I1;
    public Surface J1;
    public int K1;
    public boolean L1;
    public long M1;
    public long N1;
    public long O1;
    public int P1;
    public int Q1;
    public int R1;
    public long S1;
    public int T1;
    public float U1;
    public int V1;
    public int W1;
    public int X1;
    public float Y1;
    public int Z1;

    /* renamed from: a2  reason: collision with root package name */
    public int f15167a2;

    /* renamed from: b2  reason: collision with root package name */
    public int f15168b2;

    /* renamed from: c2  reason: collision with root package name */
    public float f15169c2;

    /* renamed from: d2  reason: collision with root package name */
    public boolean f15170d2;

    /* renamed from: e2  reason: collision with root package name */
    public int f15171e2;

    /* renamed from: f2  reason: collision with root package name */
    public c f15172f2;

    /* renamed from: g2  reason: collision with root package name */
    public long f15173g2;

    /* renamed from: h2  reason: collision with root package name */
    public long f15174h2;

    /* renamed from: i2  reason: collision with root package name */
    public int f15175i2;
    @o0

    /* renamed from: j2  reason: collision with root package name */
    public e f15176j2;

    /* renamed from: y1  reason: collision with root package name */
    public final Context f15177y1;

    /* renamed from: z1  reason: collision with root package name */
    public final f f15178z1;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f15179a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15180b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15181c;

        public b(int i10, int i11, int i12) {
            this.f15179a = i10;
            this.f15180b = i11;
            this.f15181c = i12;
        }
    }

    @TargetApi(23)
    public final class c implements MediaCodec.OnFrameRenderedListener {
        public c(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(@m0 MediaCodec mediaCodec, long j10, long j11) {
            d dVar = d.this;
            if (this == dVar.f15172f2) {
                dVar.o1(j10);
            }
        }
    }

    public d(Context context, t6.c cVar) {
        this(context, cVar, 0);
    }

    public d(Context context, t6.c cVar, long j10) {
        this(context, cVar, j10, (Handler) null, (q) null, -1);
    }

    public d(Context context, t6.c cVar, long j10, @o0 Handler handler, @o0 q qVar, int i10) {
        this(context, cVar, j10, (l<n>) null, false, handler, qVar, i10);
    }

    public d(Context context, t6.c cVar, long j10, @o0 l<n> lVar, boolean z10, @o0 Handler handler, @o0 q qVar, int i10) {
        this(context, cVar, j10, lVar, z10, false, handler, qVar, i10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, t6.c cVar, long j10, @o0 l<n> lVar, boolean z10, boolean z11, @o0 Handler handler, @o0 q qVar, int i10) {
        super(2, cVar, lVar, z10, z11, 30.0f);
        this.B1 = j10;
        this.C1 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f15177y1 = applicationContext;
        this.f15178z1 = new f(applicationContext);
        this.A1 = new q.a(handler, qVar);
        this.D1 = X0();
        this.E1 = new long[10];
        this.F1 = new long[10];
        this.f15174h2 = b6.c.f4201b;
        this.f15173g2 = b6.c.f4201b;
        this.N1 = b6.c.f4201b;
        this.V1 = -1;
        this.W1 = -1;
        this.Y1 = -1.0f;
        this.U1 = -1.0f;
        this.K1 = 1;
        U0();
    }

    @TargetApi(21)
    public static void W0(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public static boolean X0() {
        return "NVIDIA".equals(q0.f14788c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int Z0(t6.a r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x009c
            if (r8 != r0) goto L_0x0007
            goto L_0x009c
        L_0x0007:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = r0
            goto L_0x0057
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 5
            goto L_0x0057
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = r2
            goto L_0x0057
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = r3
            goto L_0x0057
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = r4
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = 1
            goto L_0x0057
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 0
        L_0x0057:
            switch(r6) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0094;
                case 2: goto L_0x0096;
                case 3: goto L_0x005b;
                case 4: goto L_0x0096;
                case 5: goto L_0x0094;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r0
        L_0x005b:
            java.lang.String r6 = w7.q0.f14789d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = w7.q0.f14788c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0084
            boolean r5 = r5.f12970g
            if (r5 == 0) goto L_0x0084
            goto L_0x0093
        L_0x0084:
            r5 = 16
            int r6 = w7.q0.n(r7, r5)
            int r7 = w7.q0.n(r8, r5)
            int r6 = r6 * r7
            int r6 = r6 * r5
            int r7 = r6 * 16
            goto L_0x0097
        L_0x0093:
            return r0
        L_0x0094:
            int r7 = r7 * r8
            goto L_0x0098
        L_0x0096:
            int r7 = r7 * r8
        L_0x0097:
            r2 = r4
        L_0x0098:
            int r7 = r7 * r3
            int r2 = r2 * r4
            int r7 = r7 / r2
            return r7
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.d.Z0(t6.a, java.lang.String, int, int):int");
    }

    public static Point a1(t6.a aVar, Format format) {
        int i10 = format.f5070c0;
        int i11 = format.f5069b0;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = ((float) i10) / ((float) i12);
        for (int i13 : f15162p2) {
            int i14 = (int) (((float) i13) * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (q0.f14786a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point b10 = aVar.b(i15, i13);
                if (aVar.s(b10.x, b10.y, (double) format.f5071d0)) {
                    return b10;
                }
            } else {
                try {
                    int n10 = q0.n(i13, 16) * 16;
                    int n11 = q0.n(i14, 16) * 16;
                    if (n10 * n11 <= t6.d.o()) {
                        int i16 = z10 ? n11 : n10;
                        if (!z10) {
                            n10 = n11;
                        }
                        return new Point(i16, n10);
                    }
                } catch (d.c unused) {
                }
            }
        }
        return null;
    }

    public static int c1(t6.a aVar, Format format) {
        if (format.X == -1) {
            return Z0(aVar, format.W, format.f5069b0, format.f5070c0);
        }
        int size = format.Y.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += format.Y.get(i11).length;
        }
        return format.X + i10;
    }

    public static boolean f1(long j10) {
        return j10 < -30000;
    }

    public static boolean g1(long j10) {
        return j10 < -500000;
    }

    @TargetApi(23)
    public static void t1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public void A() {
        this.f15173g2 = b6.c.f4201b;
        this.f15174h2 = b6.c.f4201b;
        this.f15175i2 = 0;
        U0();
        T0();
        this.f15178z1.d();
        this.f15172f2 = null;
        try {
            super.A();
        } finally {
            this.A1.i(this.f12998b1);
        }
    }

    public void A1(int i10) {
        e eVar = this.f12998b1;
        eVar.f8065g += i10;
        this.P1 += i10;
        int i11 = this.Q1 + i10;
        this.Q1 = i11;
        eVar.f8066h = Math.max(i11, eVar.f8066h);
        int i12 = this.C1;
        if (i12 > 0 && this.P1 >= i12) {
            i1();
        }
    }

    public void B(boolean z10) throws i {
        super.B(z10);
        int i10 = this.f15171e2;
        int i11 = w().f4469a;
        this.f15171e2 = i11;
        this.f15170d2 = i11 != 0;
        if (i11 != i10) {
            E0();
        }
        this.A1.k(this.f12998b1);
        this.f15178z1.e();
    }

    public void C(long j10, boolean z10) throws i {
        super.C(j10, z10);
        T0();
        this.M1 = b6.c.f4201b;
        this.Q1 = 0;
        this.f15173g2 = b6.c.f4201b;
        int i10 = this.f15175i2;
        if (i10 != 0) {
            this.f15174h2 = this.E1[i10 - 1];
            this.f15175i2 = 0;
        }
        if (z10) {
            s1();
        } else {
            this.N1 = b6.c.f4201b;
        }
    }

    public void D() {
        try {
            super.D();
            Surface surface = this.J1;
            if (surface != null) {
                if (this.I1 == surface) {
                    this.I1 = null;
                }
                surface.release();
                this.J1 = null;
            }
        } catch (Throwable th2) {
            if (this.J1 != null) {
                Surface surface2 = this.I1;
                Surface surface3 = this.J1;
                if (surface2 == surface3) {
                    this.I1 = null;
                }
                surface3.release();
                this.J1 = null;
            }
            throw th2;
        }
    }

    public void E() {
        super.E();
        this.P1 = 0;
        this.O1 = SystemClock.elapsedRealtime();
        this.S1 = SystemClock.elapsedRealtime() * 1000;
    }

    @d.i
    public void E0() {
        try {
            super.E0();
        } finally {
            this.R1 = 0;
        }
    }

    public void F() {
        this.N1 = b6.c.f4201b;
        i1();
        super.F();
    }

    public void G(Format[] formatArr, long j10) throws i {
        if (this.f15174h2 == b6.c.f4201b) {
            this.f15174h2 = j10;
        } else {
            int i10 = this.f15175i2;
            if (i10 == this.E1.length) {
                p.l(f15157k2, "Too many stream changes, so dropping offset: " + this.E1[this.f15175i2 - 1]);
            } else {
                this.f15175i2 = i10 + 1;
            }
            long[] jArr = this.E1;
            int i11 = this.f15175i2;
            jArr[i11 - 1] = j10;
            this.F1[i11 - 1] = this.f15173g2;
        }
        super.G(formatArr, j10);
    }

    public int K(MediaCodec mediaCodec, t6.a aVar, Format format, Format format2) {
        if (!aVar.n(format, format2, true)) {
            return 0;
        }
        int i10 = format2.f5069b0;
        b bVar = this.G1;
        if (i10 > bVar.f15179a || format2.f5070c0 > bVar.f15180b || c1(aVar, format2) > this.G1.f15181c) {
            return 0;
        }
        return format.K(format2) ? 3 : 2;
    }

    public boolean N0(t6.a aVar) {
        return this.I1 != null || y1(aVar);
    }

    public int P0(t6.c cVar, l<n> lVar, Format format) throws d.c {
        boolean z10;
        int i10 = 0;
        if (!s.n(format.W)) {
            return 0;
        }
        DrmInitData drmInitData = format.Z;
        if (drmInitData != null) {
            z10 = false;
            for (int i11 = 0; i11 < drmInitData.R; i11++) {
                z10 |= drmInitData.e(i11).T;
            }
        } else {
            z10 = false;
        }
        List<t6.a> j02 = j0(cVar, format, z10);
        if (j02.isEmpty()) {
            return (!z10 || cVar.b(format.W, false, false).isEmpty()) ? 1 : 2;
        }
        if (!b6.b.J(lVar, drmInitData)) {
            return 2;
        }
        t6.a aVar = j02.get(0);
        boolean l10 = aVar.l(format);
        int i12 = aVar.m(format) ? 16 : 8;
        if (l10) {
            List<t6.a> b10 = cVar.b(format.W, z10, true);
            if (!b10.isEmpty()) {
                t6.a aVar2 = b10.get(0);
                if (aVar2.l(format) && aVar2.m(format)) {
                    i10 = 32;
                }
            }
        }
        return (l10 ? 4 : 3) | i12 | i10;
    }

    public void T(t6.a aVar, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto, float f10) {
        String str = aVar.f12966c;
        b b12 = b1(aVar, format, y());
        this.G1 = b12;
        MediaFormat d12 = d1(format, str, b12, f10, this.D1, this.f15171e2);
        if (this.I1 == null) {
            w7.a.i(y1(aVar));
            if (this.J1 == null) {
                this.J1 = DummySurface.d(this.f15177y1, aVar.f12970g);
            }
            this.I1 = this.J1;
        }
        mediaCodec.configure(d12, this.I1, mediaCrypto, 0);
        if (q0.f14786a >= 23 && this.f15170d2) {
            this.f15172f2 = new c(mediaCodec);
        }
    }

    public final void T0() {
        MediaCodec e02;
        this.L1 = false;
        if (q0.f14786a >= 23 && this.f15170d2 && (e02 = e0()) != null) {
            this.f15172f2 = new c(e02);
        }
    }

    public final void U0() {
        this.Z1 = -1;
        this.f15167a2 = -1;
        this.f15169c2 = -1.0f;
        this.f15168b2 = -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ("HWEML".equals(r5) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0607, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0608, code lost:
        switch(r2) {
            case 0: goto L_0x060c;
            case 1: goto L_0x060c;
            case 2: goto L_0x060c;
            case 3: goto L_0x060c;
            case 4: goto L_0x060c;
            case 5: goto L_0x060c;
            case 6: goto L_0x060c;
            case 7: goto L_0x060c;
            case 8: goto L_0x060c;
            case 9: goto L_0x060c;
            case 10: goto L_0x060c;
            case 11: goto L_0x060c;
            case 12: goto L_0x060c;
            case 13: goto L_0x060c;
            case 14: goto L_0x060c;
            case 15: goto L_0x060c;
            case 16: goto L_0x060c;
            case 17: goto L_0x060c;
            case 18: goto L_0x060c;
            case 19: goto L_0x060c;
            case 20: goto L_0x060c;
            case 21: goto L_0x060c;
            case 22: goto L_0x060c;
            case 23: goto L_0x060c;
            case 24: goto L_0x060c;
            case 25: goto L_0x060c;
            case 26: goto L_0x060c;
            case 27: goto L_0x060c;
            case 28: goto L_0x060c;
            case 29: goto L_0x060c;
            case 30: goto L_0x060c;
            case 31: goto L_0x060c;
            case 32: goto L_0x060c;
            case 33: goto L_0x060c;
            case 34: goto L_0x060c;
            case 35: goto L_0x060c;
            case 36: goto L_0x060c;
            case 37: goto L_0x060c;
            case 38: goto L_0x060c;
            case 39: goto L_0x060c;
            case 40: goto L_0x060c;
            case 41: goto L_0x060c;
            case 42: goto L_0x060c;
            case 43: goto L_0x060c;
            case 44: goto L_0x060c;
            case 45: goto L_0x060c;
            case 46: goto L_0x060c;
            case 47: goto L_0x060c;
            case 48: goto L_0x060c;
            case 49: goto L_0x060c;
            case 50: goto L_0x060c;
            case 51: goto L_0x060c;
            case 52: goto L_0x060c;
            case 53: goto L_0x060c;
            case 54: goto L_0x060c;
            case 55: goto L_0x060c;
            case 56: goto L_0x060c;
            case 57: goto L_0x060c;
            case 58: goto L_0x060c;
            case 59: goto L_0x060c;
            case 60: goto L_0x060c;
            case 61: goto L_0x060c;
            case 62: goto L_0x060c;
            case 63: goto L_0x060c;
            case 64: goto L_0x060c;
            case 65: goto L_0x060c;
            case 66: goto L_0x060c;
            case 67: goto L_0x060c;
            case 68: goto L_0x060c;
            case 69: goto L_0x060c;
            case 70: goto L_0x060c;
            case 71: goto L_0x060c;
            case 72: goto L_0x060c;
            case 73: goto L_0x060c;
            case 74: goto L_0x060c;
            case 75: goto L_0x060c;
            case 76: goto L_0x060c;
            case 77: goto L_0x060c;
            case 78: goto L_0x060c;
            case 79: goto L_0x060c;
            case 80: goto L_0x060c;
            case 81: goto L_0x060c;
            case 82: goto L_0x060c;
            case 83: goto L_0x060c;
            case 84: goto L_0x060c;
            case 85: goto L_0x060c;
            case 86: goto L_0x060c;
            case 87: goto L_0x060c;
            case 88: goto L_0x060c;
            case 89: goto L_0x060c;
            case 90: goto L_0x060c;
            case 91: goto L_0x060c;
            case 92: goto L_0x060c;
            case 93: goto L_0x060c;
            case 94: goto L_0x060c;
            case 95: goto L_0x060c;
            case 96: goto L_0x060c;
            case 97: goto L_0x060c;
            case 98: goto L_0x060c;
            case 99: goto L_0x060c;
            case 100: goto L_0x060c;
            case 101: goto L_0x060c;
            case 102: goto L_0x060c;
            case 103: goto L_0x060c;
            case 104: goto L_0x060c;
            case 105: goto L_0x060c;
            case 106: goto L_0x060c;
            case 107: goto L_0x060c;
            case 108: goto L_0x060c;
            case 109: goto L_0x060c;
            case 110: goto L_0x060c;
            case 111: goto L_0x060c;
            case 112: goto L_0x060c;
            case 113: goto L_0x060c;
            case 114: goto L_0x060c;
            case 115: goto L_0x060c;
            case 116: goto L_0x060c;
            case 117: goto L_0x060c;
            case 118: goto L_0x060c;
            case 119: goto L_0x060c;
            case 120: goto L_0x060c;
            case 121: goto L_0x060c;
            case 122: goto L_0x060c;
            case 123: goto L_0x060c;
            case 124: goto L_0x060c;
            default: goto L_0x060b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x060c, code lost:
        f15166t2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x060e, code lost:
        r1 = w7.q0.f14789d;
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0617, code lost:
        if (r2 == 2006354) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x061c, code lost:
        if (r2 == 2006367) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0625, code lost:
        if (r1.equals("AFTN") == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0627, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x062f, code lost:
        if (r1.equals("AFTA") == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0632, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0633, code lost:
        if (r0 == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0635, code lost:
        if (r0 == true) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean V0(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            r0 = 0
            if (r7 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<x7.d> r7 = x7.d.class
            monitor-enter(r7)
            boolean r1 = f15165s2     // Catch:{ all -> 0x063d }
            if (r1 != 0) goto L_0x0639
            int r1 = w7.q0.f14786a     // Catch:{ all -> 0x063d }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x002e
            java.lang.String r4 = "dangal"
            java.lang.String r5 = w7.q0.f14787b     // Catch:{ all -> 0x063d }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x063d }
            if (r4 != 0) goto L_0x002a
            java.lang.String r4 = "HWEML"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x063d }
            if (r4 == 0) goto L_0x002e
        L_0x002a:
            f15166t2 = r3     // Catch:{ all -> 0x063d }
            goto L_0x0637
        L_0x002e:
            if (r1 < r2) goto L_0x0032
            goto L_0x0637
        L_0x0032:
            java.lang.String r1 = w7.q0.f14787b     // Catch:{ all -> 0x063d }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x063d }
            r5 = -1
            switch(r4) {
                case -2144781245: goto L_0x05fc;
                case -2144781185: goto L_0x05f1;
                case -2144781160: goto L_0x05e6;
                case -2097309513: goto L_0x05db;
                case -2022874474: goto L_0x05d0;
                case -1978993182: goto L_0x05c5;
                case -1978990237: goto L_0x05ba;
                case -1936688988: goto L_0x05af;
                case -1936688066: goto L_0x05a4;
                case -1936688065: goto L_0x0598;
                case -1931988508: goto L_0x058c;
                case -1696512866: goto L_0x0580;
                case -1680025915: goto L_0x0574;
                case -1615810839: goto L_0x0568;
                case -1554255044: goto L_0x055c;
                case -1481772737: goto L_0x0550;
                case -1481772730: goto L_0x0544;
                case -1481772729: goto L_0x0538;
                case -1320080169: goto L_0x052c;
                case -1217592143: goto L_0x0520;
                case -1180384755: goto L_0x0514;
                case -1139198265: goto L_0x0508;
                case -1052835013: goto L_0x04fc;
                case -993250464: goto L_0x04f1;
                case -993250458: goto L_0x04e6;
                case -965403638: goto L_0x04da;
                case -958336948: goto L_0x04ce;
                case -879245230: goto L_0x04c2;
                case -842500323: goto L_0x04b6;
                case -821392978: goto L_0x04ab;
                case -797483286: goto L_0x049f;
                case -794946968: goto L_0x0493;
                case -788334647: goto L_0x0487;
                case -782144577: goto L_0x047b;
                case -575125681: goto L_0x046f;
                case -521118391: goto L_0x0463;
                case -430914369: goto L_0x0457;
                case -290434366: goto L_0x044b;
                case -282781963: goto L_0x043f;
                case -277133239: goto L_0x0433;
                case -173639913: goto L_0x0427;
                case -56598463: goto L_0x041b;
                case 2126: goto L_0x040f;
                case 2564: goto L_0x0403;
                case 2715: goto L_0x03f7;
                case 2719: goto L_0x03eb;
                case 3483: goto L_0x03df;
                case 73405: goto L_0x03d3;
                case 75739: goto L_0x03c7;
                case 76779: goto L_0x03bb;
                case 78669: goto L_0x03af;
                case 79305: goto L_0x03a3;
                case 80618: goto L_0x0397;
                case 88274: goto L_0x038b;
                case 98846: goto L_0x037f;
                case 98848: goto L_0x0373;
                case 99329: goto L_0x0367;
                case 101481: goto L_0x035b;
                case 1513190: goto L_0x0350;
                case 1514184: goto L_0x0345;
                case 1514185: goto L_0x033a;
                case 2436959: goto L_0x032e;
                case 2463773: goto L_0x0322;
                case 2464648: goto L_0x0316;
                case 2689555: goto L_0x030a;
                case 3154429: goto L_0x02fe;
                case 3284551: goto L_0x02f2;
                case 3351335: goto L_0x02e6;
                case 3386211: goto L_0x02da;
                case 41325051: goto L_0x02ce;
                case 55178625: goto L_0x02c2;
                case 61542055: goto L_0x02b7;
                case 65355429: goto L_0x02ab;
                case 66214468: goto L_0x029f;
                case 66214470: goto L_0x0293;
                case 66214473: goto L_0x0287;
                case 66215429: goto L_0x027b;
                case 66215431: goto L_0x026f;
                case 66215433: goto L_0x0263;
                case 66216390: goto L_0x0257;
                case 76402249: goto L_0x024b;
                case 76404105: goto L_0x023f;
                case 76404911: goto L_0x0233;
                case 80963634: goto L_0x0227;
                case 82882791: goto L_0x021b;
                case 98715550: goto L_0x020f;
                case 102844228: goto L_0x0203;
                case 165221241: goto L_0x01f8;
                case 182191441: goto L_0x01ec;
                case 245388979: goto L_0x01e0;
                case 287431619: goto L_0x01d4;
                case 307593612: goto L_0x01c8;
                case 308517133: goto L_0x01bc;
                case 316215098: goto L_0x01b0;
                case 316215116: goto L_0x01a4;
                case 316246811: goto L_0x0198;
                case 316246818: goto L_0x018c;
                case 407160593: goto L_0x0180;
                case 507412548: goto L_0x0174;
                case 793982701: goto L_0x0168;
                case 794038622: goto L_0x015c;
                case 794040393: goto L_0x0150;
                case 835649806: goto L_0x0144;
                case 917340916: goto L_0x0138;
                case 958008161: goto L_0x012c;
                case 1060579533: goto L_0x0120;
                case 1150207623: goto L_0x0114;
                case 1176899427: goto L_0x0108;
                case 1280332038: goto L_0x00fc;
                case 1306947716: goto L_0x00f0;
                case 1349174697: goto L_0x00e4;
                case 1522194893: goto L_0x00d8;
                case 1691543273: goto L_0x00cc;
                case 1709443163: goto L_0x00c0;
                case 1865889110: goto L_0x00b4;
                case 1906253259: goto L_0x00a8;
                case 1977196784: goto L_0x009c;
                case 2006372676: goto L_0x0090;
                case 2029784656: goto L_0x0084;
                case 2030379515: goto L_0x0078;
                case 2033393791: goto L_0x006c;
                case 2047190025: goto L_0x0062;
                case 2047252157: goto L_0x0056;
                case 2048319463: goto L_0x004a;
                case 2048855701: goto L_0x003e;
                default: goto L_0x003c;
            }     // Catch:{ all -> 0x063d }
        L_0x003c:
            goto L_0x0607
        L_0x003e:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 55
            goto L_0x0608
        L_0x004a:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 54
            goto L_0x0608
        L_0x0056:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 28
            goto L_0x0608
        L_0x0062:
            java.lang.String r4 = "ELUGA_Note"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            goto L_0x0608
        L_0x006c:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 12
            goto L_0x0608
        L_0x0078:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 53
            goto L_0x0608
        L_0x0084:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 52
            goto L_0x0608
        L_0x0090:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 16
            goto L_0x0608
        L_0x009c:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 58
            goto L_0x0608
        L_0x00a8:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 86
            goto L_0x0608
        L_0x00b4:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0608
        L_0x00c0:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 57
            goto L_0x0608
        L_0x00cc:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 20
            goto L_0x0608
        L_0x00d8:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0608
        L_0x00e4:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 50
            goto L_0x0608
        L_0x00f0:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 30
            goto L_0x0608
        L_0x00fc:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 51
            goto L_0x0608
        L_0x0108:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 60
            goto L_0x0608
        L_0x0114:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 66
            goto L_0x0608
        L_0x0120:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 82
            goto L_0x0608
        L_0x012c:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 61
            goto L_0x0608
        L_0x0138:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 8
            goto L_0x0608
        L_0x0144:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 68
            goto L_0x0608
        L_0x0150:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 48
            goto L_0x0608
        L_0x015c:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 47
            goto L_0x0608
        L_0x0168:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 46
            goto L_0x0608
        L_0x0174:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 100
            goto L_0x0608
        L_0x0180:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 92
            goto L_0x0608
        L_0x018c:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0608
        L_0x0198:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0608
        L_0x01a4:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0608
        L_0x01b0:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0608
        L_0x01bc:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 10
            goto L_0x0608
        L_0x01c8:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 9
            goto L_0x0608
        L_0x01d4:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 49
            goto L_0x0608
        L_0x01e0:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 69
            goto L_0x0608
        L_0x01ec:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 21
            goto L_0x0608
        L_0x01f8:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 6
            goto L_0x0608
        L_0x0203:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 65
            goto L_0x0608
        L_0x020f:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 56
            goto L_0x0608
        L_0x021b:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0608
        L_0x0227:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0608
        L_0x0233:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 98
            goto L_0x0608
        L_0x023f:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 96
            goto L_0x0608
        L_0x024b:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 94
            goto L_0x0608
        L_0x0257:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 37
            goto L_0x0608
        L_0x0263:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 36
            goto L_0x0608
        L_0x026f:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 35
            goto L_0x0608
        L_0x027b:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 34
            goto L_0x0608
        L_0x0287:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 33
            goto L_0x0608
        L_0x0293:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 32
            goto L_0x0608
        L_0x029f:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 31
            goto L_0x0608
        L_0x02ab:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 25
            goto L_0x0608
        L_0x02b7:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 5
            goto L_0x0608
        L_0x02c2:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 13
            goto L_0x0608
        L_0x02ce:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 70
            goto L_0x0608
        L_0x02da:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 79
            goto L_0x0608
        L_0x02e6:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 72
            goto L_0x0608
        L_0x02f2:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 64
            goto L_0x0608
        L_0x02fe:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 39
            goto L_0x0608
        L_0x030a:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0608
        L_0x0316:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 97
            goto L_0x0608
        L_0x0322:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 95
            goto L_0x0608
        L_0x032e:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 80
            goto L_0x0608
        L_0x033a:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 2
            goto L_0x0608
        L_0x0345:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = r3
            goto L_0x0608
        L_0x0350:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = r0
            goto L_0x0608
        L_0x035b:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 38
            goto L_0x0608
        L_0x0367:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 24
            goto L_0x0608
        L_0x0373:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 23
            goto L_0x0608
        L_0x037f:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 22
            goto L_0x0608
        L_0x038b:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0608
        L_0x0397:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0608
        L_0x03a3:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 93
            goto L_0x0608
        L_0x03af:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 81
            goto L_0x0608
        L_0x03bb:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 73
            goto L_0x0608
        L_0x03c7:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 67
            goto L_0x0608
        L_0x03d3:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 62
            goto L_0x0608
        L_0x03df:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 71
            goto L_0x0608
        L_0x03eb:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0608
        L_0x03f7:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0608
        L_0x0403:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 99
            goto L_0x0608
        L_0x040f:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 17
            goto L_0x0608
        L_0x041b:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0608
        L_0x0427:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 26
            goto L_0x0608
        L_0x0433:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0608
        L_0x043f:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 14
            goto L_0x0608
        L_0x044b:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0608
        L_0x0457:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 91
            goto L_0x0608
        L_0x0463:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 42
            goto L_0x0608
        L_0x046f:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 40
            goto L_0x0608
        L_0x047b:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 78
            goto L_0x0608
        L_0x0487:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0608
        L_0x0493:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0608
        L_0x049f:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0608
        L_0x04ab:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 7
            goto L_0x0608
        L_0x04b6:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 75
            goto L_0x0608
        L_0x04c2:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0608
        L_0x04ce:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 29
            goto L_0x0608
        L_0x04da:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0608
        L_0x04e6:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 4
            goto L_0x0608
        L_0x04f1:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 3
            goto L_0x0608
        L_0x04fc:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 74
            goto L_0x0608
        L_0x0508:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0608
        L_0x0514:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 59
            goto L_0x0608
        L_0x0520:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 15
            goto L_0x0608
        L_0x052c:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 41
            goto L_0x0608
        L_0x0538:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 85
            goto L_0x0608
        L_0x0544:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 84
            goto L_0x0608
        L_0x0550:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 83
            goto L_0x0608
        L_0x055c:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0608
        L_0x0568:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 90
            goto L_0x0608
        L_0x0574:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 18
            goto L_0x0608
        L_0x0580:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0608
        L_0x058c:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 11
            goto L_0x0608
        L_0x0598:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 89
            goto L_0x0608
        L_0x05a4:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 88
            goto L_0x0608
        L_0x05af:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 87
            goto L_0x0608
        L_0x05ba:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 77
            goto L_0x0608
        L_0x05c5:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 76
            goto L_0x0608
        L_0x05d0:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 19
            goto L_0x0608
        L_0x05db:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 63
            goto L_0x0608
        L_0x05e6:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 45
            goto L_0x0608
        L_0x05f1:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 44
            goto L_0x0608
        L_0x05fc:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0607
            r2 = 43
            goto L_0x0608
        L_0x0607:
            r2 = r5
        L_0x0608:
            switch(r2) {
                case 0: goto L_0x060c;
                case 1: goto L_0x060c;
                case 2: goto L_0x060c;
                case 3: goto L_0x060c;
                case 4: goto L_0x060c;
                case 5: goto L_0x060c;
                case 6: goto L_0x060c;
                case 7: goto L_0x060c;
                case 8: goto L_0x060c;
                case 9: goto L_0x060c;
                case 10: goto L_0x060c;
                case 11: goto L_0x060c;
                case 12: goto L_0x060c;
                case 13: goto L_0x060c;
                case 14: goto L_0x060c;
                case 15: goto L_0x060c;
                case 16: goto L_0x060c;
                case 17: goto L_0x060c;
                case 18: goto L_0x060c;
                case 19: goto L_0x060c;
                case 20: goto L_0x060c;
                case 21: goto L_0x060c;
                case 22: goto L_0x060c;
                case 23: goto L_0x060c;
                case 24: goto L_0x060c;
                case 25: goto L_0x060c;
                case 26: goto L_0x060c;
                case 27: goto L_0x060c;
                case 28: goto L_0x060c;
                case 29: goto L_0x060c;
                case 30: goto L_0x060c;
                case 31: goto L_0x060c;
                case 32: goto L_0x060c;
                case 33: goto L_0x060c;
                case 34: goto L_0x060c;
                case 35: goto L_0x060c;
                case 36: goto L_0x060c;
                case 37: goto L_0x060c;
                case 38: goto L_0x060c;
                case 39: goto L_0x060c;
                case 40: goto L_0x060c;
                case 41: goto L_0x060c;
                case 42: goto L_0x060c;
                case 43: goto L_0x060c;
                case 44: goto L_0x060c;
                case 45: goto L_0x060c;
                case 46: goto L_0x060c;
                case 47: goto L_0x060c;
                case 48: goto L_0x060c;
                case 49: goto L_0x060c;
                case 50: goto L_0x060c;
                case 51: goto L_0x060c;
                case 52: goto L_0x060c;
                case 53: goto L_0x060c;
                case 54: goto L_0x060c;
                case 55: goto L_0x060c;
                case 56: goto L_0x060c;
                case 57: goto L_0x060c;
                case 58: goto L_0x060c;
                case 59: goto L_0x060c;
                case 60: goto L_0x060c;
                case 61: goto L_0x060c;
                case 62: goto L_0x060c;
                case 63: goto L_0x060c;
                case 64: goto L_0x060c;
                case 65: goto L_0x060c;
                case 66: goto L_0x060c;
                case 67: goto L_0x060c;
                case 68: goto L_0x060c;
                case 69: goto L_0x060c;
                case 70: goto L_0x060c;
                case 71: goto L_0x060c;
                case 72: goto L_0x060c;
                case 73: goto L_0x060c;
                case 74: goto L_0x060c;
                case 75: goto L_0x060c;
                case 76: goto L_0x060c;
                case 77: goto L_0x060c;
                case 78: goto L_0x060c;
                case 79: goto L_0x060c;
                case 80: goto L_0x060c;
                case 81: goto L_0x060c;
                case 82: goto L_0x060c;
                case 83: goto L_0x060c;
                case 84: goto L_0x060c;
                case 85: goto L_0x060c;
                case 86: goto L_0x060c;
                case 87: goto L_0x060c;
                case 88: goto L_0x060c;
                case 89: goto L_0x060c;
                case 90: goto L_0x060c;
                case 91: goto L_0x060c;
                case 92: goto L_0x060c;
                case 93: goto L_0x060c;
                case 94: goto L_0x060c;
                case 95: goto L_0x060c;
                case 96: goto L_0x060c;
                case 97: goto L_0x060c;
                case 98: goto L_0x060c;
                case 99: goto L_0x060c;
                case 100: goto L_0x060c;
                case 101: goto L_0x060c;
                case 102: goto L_0x060c;
                case 103: goto L_0x060c;
                case 104: goto L_0x060c;
                case 105: goto L_0x060c;
                case 106: goto L_0x060c;
                case 107: goto L_0x060c;
                case 108: goto L_0x060c;
                case 109: goto L_0x060c;
                case 110: goto L_0x060c;
                case 111: goto L_0x060c;
                case 112: goto L_0x060c;
                case 113: goto L_0x060c;
                case 114: goto L_0x060c;
                case 115: goto L_0x060c;
                case 116: goto L_0x060c;
                case 117: goto L_0x060c;
                case 118: goto L_0x060c;
                case 119: goto L_0x060c;
                case 120: goto L_0x060c;
                case 121: goto L_0x060c;
                case 122: goto L_0x060c;
                case 123: goto L_0x060c;
                case 124: goto L_0x060c;
                default: goto L_0x060b;
            }     // Catch:{ all -> 0x063d }
        L_0x060b:
            goto L_0x060e
        L_0x060c:
            f15166t2 = r3     // Catch:{ all -> 0x063d }
        L_0x060e:
            java.lang.String r1 = w7.q0.f14789d     // Catch:{ all -> 0x063d }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x063d }
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x0629
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r0) goto L_0x061f
            goto L_0x0632
        L_0x061f:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x063d }
            if (r0 == 0) goto L_0x0632
            r0 = r3
            goto L_0x0633
        L_0x0629:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x063d }
            if (r1 == 0) goto L_0x0632
            goto L_0x0633
        L_0x0632:
            r0 = r5
        L_0x0633:
            if (r0 == 0) goto L_0x002a
            if (r0 == r3) goto L_0x002a
        L_0x0637:
            f15165s2 = r3     // Catch:{ all -> 0x063d }
        L_0x0639:
            monitor-exit(r7)     // Catch:{ all -> 0x063d }
            boolean r7 = f15166t2
            return r7
        L_0x063d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x063d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.d.V0(java.lang.String):boolean");
    }

    public void Y0(MediaCodec mediaCodec, int i10, long j10) {
        k0.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        k0.c();
        A1(1);
    }

    public b b1(t6.a aVar, Format format, Format[] formatArr) {
        int Z0;
        int i10 = format.f5069b0;
        int i11 = format.f5070c0;
        int c12 = c1(aVar, format);
        if (formatArr.length == 1) {
            if (!(c12 == -1 || (Z0 = Z0(aVar, format.W, format.f5069b0, format.f5070c0)) == -1)) {
                c12 = Math.min((int) (((float) c12) * 1.5f), Z0);
            }
            return new b(i10, i11, c12);
        }
        boolean z10 = false;
        for (Format format2 : formatArr) {
            if (aVar.n(format, format2, false)) {
                int i12 = format2.f5069b0;
                z10 |= i12 == -1 || format2.f5070c0 == -1;
                i10 = Math.max(i10, i12);
                i11 = Math.max(i11, format2.f5070c0);
                c12 = Math.max(c12, c1(aVar, format2));
            }
        }
        if (z10) {
            p.l(f15157k2, "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point a12 = a1(aVar, format);
            if (a12 != null) {
                i10 = Math.max(i10, a12.x);
                i11 = Math.max(i11, a12.y);
                c12 = Math.max(c12, Z0(aVar, format.W, i10, i11));
                p.l(f15157k2, "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, c12);
    }

    @d.i
    public boolean c0() {
        try {
            return super.c0();
        } finally {
            this.R1 = 0;
        }
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat d1(Format format, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> g10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.f5069b0);
        mediaFormat.setInteger("height", format.f5070c0);
        t6.e.e(mediaFormat, format.Y);
        t6.e.c(mediaFormat, "frame-rate", format.f5071d0);
        t6.e.d(mediaFormat, "rotation-degrees", format.f5072e0);
        t6.e.b(mediaFormat, format.f5076i0);
        if (s.f14833r.equals(format.W) && (g10 = t6.d.g(format.T)) != null) {
            t6.e.d(mediaFormat, r.f6637a, ((Integer) g10.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f15179a);
        mediaFormat.setInteger("max-height", bVar.f15180b);
        t6.e.d(mediaFormat, "max-input-size", bVar.f15181c);
        if (q0.f14786a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            W0(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public long e1() {
        return this.f15174h2;
    }

    public boolean h0() {
        return this.f15170d2;
    }

    public boolean h1(MediaCodec mediaCodec, int i10, long j10, long j11) throws i {
        int I = I(j11);
        if (I == 0) {
            return false;
        }
        this.f12998b1.f8067i++;
        A1(this.R1 + I);
        b0();
        return true;
    }

    public float i0(float f10, Format format, Format[] formatArr) {
        float f11 = -1.0f;
        for (Format format2 : formatArr) {
            float f12 = format2.f5071d0;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    public final void i1() {
        if (this.P1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A1.j(this.P1, elapsedRealtime - this.O1);
            this.P1 = 0;
            this.O1 = elapsedRealtime;
        }
    }

    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.L1 || (((surface = this.J1) != null && this.I1 == surface) || e0() == null || this.f15170d2))) {
            this.N1 = b6.c.f4201b;
            return true;
        } else if (this.N1 == b6.c.f4201b) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.N1) {
                return true;
            }
            this.N1 = b6.c.f4201b;
            return false;
        }
    }

    public List<t6.a> j0(t6.c cVar, Format format, boolean z10) throws d.c {
        return Collections.unmodifiableList(cVar.b(format.W, z10, this.f15170d2));
    }

    public void j1() {
        if (!this.L1) {
            this.L1 = true;
            this.A1.t(this.I1);
        }
    }

    public final void k1() {
        int i10 = this.V1;
        if (i10 != -1 || this.W1 != -1) {
            if (this.Z1 != i10 || this.f15167a2 != this.W1 || this.f15168b2 != this.X1 || this.f15169c2 != this.Y1) {
                this.A1.u(i10, this.W1, this.X1, this.Y1);
                this.Z1 = this.V1;
                this.f15167a2 = this.W1;
                this.f15168b2 = this.X1;
                this.f15169c2 = this.Y1;
            }
        }
    }

    public final void l1() {
        if (this.L1) {
            this.A1.t(this.I1);
        }
    }

    public final void m1() {
        int i10 = this.Z1;
        if (i10 != -1 || this.f15167a2 != -1) {
            this.A1.u(i10, this.f15167a2, this.f15168b2, this.f15169c2);
        }
    }

    public void n(int i10, @o0 Object obj) throws i {
        if (i10 == 1) {
            u1((Surface) obj);
        } else if (i10 == 4) {
            this.K1 = ((Integer) obj).intValue();
            MediaCodec e02 = e0();
            if (e02 != null) {
                e02.setVideoScalingMode(this.K1);
            }
        } else if (i10 == 6) {
            this.f15176j2 = (e) obj;
        } else {
            super.n(i10, obj);
        }
    }

    public final void n1(long j10, long j11, Format format) {
        e eVar = this.f15176j2;
        if (eVar != null) {
            eVar.b(j10, j11, format);
        }
    }

    public void o1(long j10) {
        Format S0 = S0(j10);
        if (S0 != null) {
            p1(e0(), S0.f5069b0, S0.f5070c0);
        }
        k1();
        j1();
        w0(j10);
    }

    public final void p1(MediaCodec mediaCodec, int i10, int i11) {
        this.V1 = i10;
        this.W1 = i11;
        float f10 = this.U1;
        this.Y1 = f10;
        if (q0.f14786a >= 21) {
            int i12 = this.T1;
            if (i12 == 90 || i12 == 270) {
                this.V1 = i11;
                this.W1 = i10;
                this.Y1 = 1.0f / f10;
            }
        } else {
            this.X1 = this.T1;
        }
        mediaCodec.setVideoScalingMode(this.K1);
    }

    public void q1(MediaCodec mediaCodec, int i10, long j10) {
        k1();
        k0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        k0.c();
        this.S1 = SystemClock.elapsedRealtime() * 1000;
        this.f12998b1.f8063e++;
        this.Q1 = 0;
        j1();
    }

    @TargetApi(21)
    public void r1(MediaCodec mediaCodec, int i10, long j10, long j11) {
        k1();
        k0.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        k0.c();
        this.S1 = SystemClock.elapsedRealtime() * 1000;
        this.f12998b1.f8063e++;
        this.Q1 = 0;
        j1();
    }

    public final void s1() {
        this.N1 = this.B1 > 0 ? SystemClock.elapsedRealtime() + this.B1 : b6.c.f4201b;
    }

    public void t0(String str, long j10, long j11) {
        this.A1.h(str, j10, j11);
        this.H1 = V0(str);
    }

    public void u0(Format format) throws i {
        super.u0(format);
        this.A1.l(format);
        this.U1 = format.f5073f0;
        this.T1 = format.f5072e0;
    }

    public final void u1(Surface surface) throws i {
        if (surface == null) {
            Surface surface2 = this.J1;
            if (surface2 != null) {
                surface = surface2;
            } else {
                t6.a g02 = g0();
                if (g02 != null && y1(g02)) {
                    surface = DummySurface.d(this.f15177y1, g02.f12970g);
                    this.J1 = surface;
                }
            }
        }
        if (this.I1 != surface) {
            this.I1 = surface;
            int state = getState();
            MediaCodec e02 = e0();
            if (e02 != null) {
                if (q0.f14786a < 23 || surface == null || this.H1) {
                    E0();
                    r0();
                } else {
                    t1(e02, surface);
                }
            }
            if (surface == null || surface == this.J1) {
                U0();
                T0();
                return;
            }
            m1();
            T0();
            if (state == 2) {
                s1();
            }
        } else if (surface != null && surface != this.J1) {
            m1();
            l1();
        }
    }

    public void v0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z10 = mediaFormat.containsKey(f15159m2) && mediaFormat.containsKey(f15158l2) && mediaFormat.containsKey(f15160n2) && mediaFormat.containsKey(f15161o2);
        p1(mediaCodec, z10 ? (mediaFormat.getInteger(f15159m2) - mediaFormat.getInteger(f15158l2)) + 1 : mediaFormat.getInteger("width"), z10 ? (mediaFormat.getInteger(f15160n2) - mediaFormat.getInteger(f15161o2)) + 1 : mediaFormat.getInteger("height"));
    }

    public boolean v1(long j10, long j11, boolean z10) {
        return g1(j10) && !z10;
    }

    @d.i
    public void w0(long j10) {
        this.R1--;
        while (true) {
            int i10 = this.f15175i2;
            if (i10 != 0 && j10 >= this.F1[0]) {
                long[] jArr = this.E1;
                this.f15174h2 = jArr[0];
                int i11 = i10 - 1;
                this.f15175i2 = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.F1;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f15175i2);
            } else {
                return;
            }
        }
    }

    public boolean w1(long j10, long j11, boolean z10) {
        return f1(j10) && !z10;
    }

    @d.i
    public void x0(f fVar) {
        this.R1++;
        this.f15173g2 = Math.max(fVar.R, this.f15173g2);
        if (q0.f14786a < 23 && this.f15170d2) {
            o1(fVar.R);
        }
    }

    public boolean x1(long j10, long j11) {
        return f1(j10) && j11 > 100000;
    }

    public final boolean y1(t6.a aVar) {
        return q0.f14786a >= 23 && !this.f15170d2 && !V0(aVar.f12964a) && (!aVar.f12970g || DummySurface.c(this.f15177y1));
    }

    public boolean z0(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10, boolean z11, Format format) throws i {
        long j13 = j10;
        MediaCodec mediaCodec2 = mediaCodec;
        int i12 = i10;
        long j14 = j12;
        if (this.M1 == b6.c.f4201b) {
            this.M1 = j13;
        }
        long j15 = j14 - this.f15174h2;
        if (!z10 || z11) {
            long j16 = j14 - j13;
            if (this.I1 != this.J1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                boolean z12 = getState() == 2;
                if (!this.L1 || (z12 && x1(j16, elapsedRealtime - this.S1))) {
                    long nanoTime = System.nanoTime();
                    n1(j15, nanoTime, format);
                    if (q0.f14786a >= 21) {
                        r1(mediaCodec, i10, j15, nanoTime);
                        return true;
                    }
                    q1(mediaCodec2, i12, j15);
                    return true;
                } else if (!z12 || j13 == this.M1) {
                    return false;
                } else {
                    long j17 = j16 - (elapsedRealtime - j11);
                    long nanoTime2 = System.nanoTime();
                    long b10 = this.f15178z1.b(j14, (j17 * 1000) + nanoTime2);
                    long j18 = (b10 - nanoTime2) / 1000;
                    if (v1(j18, j11, z11) && h1(mediaCodec, i10, j15, j10)) {
                        return false;
                    }
                    if (w1(j18, j11, z11)) {
                        Y0(mediaCodec2, i12, j15);
                        return true;
                    } else if (q0.f14786a >= 21) {
                        if (j18 >= 50000) {
                            return false;
                        }
                        n1(j15, b10, format);
                        r1(mediaCodec, i10, j15, b10);
                        return true;
                    } else if (j18 >= m.f13390a) {
                        return false;
                    } else {
                        if (j18 > 11000) {
                            try {
                                Thread.sleep((j18 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        n1(j15, b10, format);
                        q1(mediaCodec2, i12, j15);
                        return true;
                    }
                }
            } else if (!f1(j16)) {
                return false;
            } else {
                z1(mediaCodec2, i12, j15);
                return true;
            }
        } else {
            z1(mediaCodec2, i12, j15);
            return true;
        }
    }

    public void z1(MediaCodec mediaCodec, int i10, long j10) {
        k0.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        k0.c();
        this.f12998b1.f8064f++;
    }
}
