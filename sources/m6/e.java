package m6;

import android.util.Pair;
import android.util.SparseArray;
import b6.j0;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import d5.k;
import j6.i;
import j6.j;
import j6.l;
import j6.q;
import j6.s;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import w7.p;
import w7.q;
import w7.q0;
import w7.t;
import w7.w;
import xe.o;

public class e implements i {
    public static final String A0 = "A_MPEG/L3";
    public static final int A1 = 176;
    public static final int A2 = 1;
    public static final String B0 = "A_AC3";
    public static final int B1 = 186;
    public static final int B2 = 2;
    public static final String C0 = "A_EAC3";
    public static final int C1 = 21680;
    public static final int C2 = 3;
    public static final String D0 = "A_TRUEHD";
    public static final int D1 = 21690;
    public static final int D2 = 1482049860;
    public static final String E0 = "A_DTS";
    public static final int E1 = 21682;
    public static final int E2 = 859189832;
    public static final String F0 = "A_DTS/EXPRESS";
    public static final int F1 = 225;
    public static final int F2 = 826496599;
    public static final String G0 = "A_DTS/LOSSLESS";
    public static final int G1 = 159;
    public static final byte[] G2 = {49, 10, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, 44, k.f6148y0, k.f6148y0, k.f6148y0, 32, i7.a.f9186b0, i7.a.f9186b0, 62, 32, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, 44, k.f6148y0, k.f6148y0, k.f6148y0, 10};
    public static final String H0 = "A_FLAC";
    public static final int H1 = 25188;
    public static final int H2 = 19;
    public static final String I0 = "A_MS/ACM";
    public static final int I1 = 181;
    public static final byte[] I2 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final String J0 = "A_PCM/INT/LIT";
    public static final int J1 = 28032;
    public static final long J2 = 1000;
    public static final String K0 = "S_TEXT/UTF8";
    public static final int K1 = 25152;
    public static final String K2 = "%02d:%02d:%02d,%03d";
    public static final String L0 = "S_TEXT/ASS";
    public static final int L1 = 20529;
    public static final byte[] L2 = q0.m0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    public static final String M0 = "S_VOBSUB";
    public static final int M1 = 20530;
    public static final byte[] M2 = {68, 105, 97, 108, 111, 103, k.f6147x0, 101, k.F0, 32, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, 44, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, k.F0, k.f6148y0, k.f6148y0, 44};
    public static final String N0 = "S_HDMV/PGS";
    public static final int N1 = 20532;
    public static final int N2 = 21;
    public static final String O0 = "S_DVBSUB";
    public static final int O1 = 16980;
    public static final long O2 = 10000;
    public static final int P0 = 8192;
    public static final int P1 = 16981;
    public static final byte[] P2 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    public static final int Q0 = 5760;
    public static final int Q1 = 20533;
    public static final String Q2 = "%01d:%02d:%02d:%02d";
    public static final int R0 = 8;
    public static final int R1 = 18401;
    public static final int R2 = 18;
    public static final int S0 = 2;
    public static final int S1 = 18402;
    public static final int S2 = 65534;
    public static final int T0 = 440786851;
    public static final int T1 = 18407;
    public static final int T2 = 1;
    public static final int U0 = 17143;
    public static final int U1 = 18408;
    public static final UUID U2 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final int V0 = 17026;
    public static final int V1 = 475249515;
    public static final int W0 = 17029;
    public static final int W1 = 187;
    public static final int X0 = 408125543;
    public static final int X1 = 179;
    public static final int Y0 = 357149030;
    public static final int Y1 = 183;
    public static final int Z0 = 290298740;
    public static final int Z1 = 241;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f10495a1 = 19899;

    /* renamed from: a2  reason: collision with root package name */
    public static final int f10496a2 = 2274716;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f10497b1 = 21419;

    /* renamed from: b2  reason: collision with root package name */
    public static final int f10498b2 = 30320;

    /* renamed from: c0  reason: collision with root package name */
    public static final l f10499c0 = new d();

    /* renamed from: c1  reason: collision with root package name */
    public static final int f10500c1 = 21420;

    /* renamed from: c2  reason: collision with root package name */
    public static final int f10501c2 = 30321;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f10502d0 = 1;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f10503d1 = 357149030;

    /* renamed from: d2  reason: collision with root package name */
    public static final int f10504d2 = 30322;

    /* renamed from: e0  reason: collision with root package name */
    public static final String f10505e0 = "MatroskaExtractor";

    /* renamed from: e1  reason: collision with root package name */
    public static final int f10506e1 = 2807729;

    /* renamed from: e2  reason: collision with root package name */
    public static final int f10507e2 = 30323;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f10508f0 = -1;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f10509f1 = 17545;

    /* renamed from: f2  reason: collision with root package name */
    public static final int f10510f2 = 30324;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f10511g0 = 0;

    /* renamed from: g1  reason: collision with root package name */
    public static final int f10512g1 = 524531317;

    /* renamed from: g2  reason: collision with root package name */
    public static final int f10513g2 = 30325;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f10514h0 = 1;

    /* renamed from: h1  reason: collision with root package name */
    public static final int f10515h1 = 231;

    /* renamed from: h2  reason: collision with root package name */
    public static final int f10516h2 = 21432;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f10517i0 = 2;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f10518i1 = 163;

    /* renamed from: i2  reason: collision with root package name */
    public static final int f10519i2 = 21936;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f10520j0 = "matroska";

    /* renamed from: j1  reason: collision with root package name */
    public static final int f10521j1 = 160;

    /* renamed from: j2  reason: collision with root package name */
    public static final int f10522j2 = 21945;

    /* renamed from: k0  reason: collision with root package name */
    public static final String f10523k0 = "webm";

    /* renamed from: k1  reason: collision with root package name */
    public static final int f10524k1 = 161;

    /* renamed from: k2  reason: collision with root package name */
    public static final int f10525k2 = 21946;

    /* renamed from: l0  reason: collision with root package name */
    public static final String f10526l0 = "V_VP8";

    /* renamed from: l1  reason: collision with root package name */
    public static final int f10527l1 = 155;

    /* renamed from: l2  reason: collision with root package name */
    public static final int f10528l2 = 21947;

    /* renamed from: m0  reason: collision with root package name */
    public static final String f10529m0 = "V_VP9";

    /* renamed from: m1  reason: collision with root package name */
    public static final int f10530m1 = 251;

    /* renamed from: m2  reason: collision with root package name */
    public static final int f10531m2 = 21948;

    /* renamed from: n0  reason: collision with root package name */
    public static final String f10532n0 = "V_AV1";

    /* renamed from: n1  reason: collision with root package name */
    public static final int f10533n1 = 374648427;

    /* renamed from: n2  reason: collision with root package name */
    public static final int f10534n2 = 21949;

    /* renamed from: o0  reason: collision with root package name */
    public static final String f10535o0 = "V_MPEG2";

    /* renamed from: o1  reason: collision with root package name */
    public static final int f10536o1 = 174;

    /* renamed from: o2  reason: collision with root package name */
    public static final int f10537o2 = 21968;

    /* renamed from: p0  reason: collision with root package name */
    public static final String f10538p0 = "V_MPEG4/ISO/SP";

    /* renamed from: p1  reason: collision with root package name */
    public static final int f10539p1 = 215;

    /* renamed from: p2  reason: collision with root package name */
    public static final int f10540p2 = 21969;

    /* renamed from: q0  reason: collision with root package name */
    public static final String f10541q0 = "V_MPEG4/ISO/ASP";

    /* renamed from: q1  reason: collision with root package name */
    public static final int f10542q1 = 131;

    /* renamed from: q2  reason: collision with root package name */
    public static final int f10543q2 = 21970;

    /* renamed from: r0  reason: collision with root package name */
    public static final String f10544r0 = "V_MPEG4/ISO/AP";

    /* renamed from: r1  reason: collision with root package name */
    public static final int f10545r1 = 136;

    /* renamed from: r2  reason: collision with root package name */
    public static final int f10546r2 = 21971;

    /* renamed from: s0  reason: collision with root package name */
    public static final String f10547s0 = "V_MPEG4/ISO/AVC";

    /* renamed from: s1  reason: collision with root package name */
    public static final int f10548s1 = 21930;

    /* renamed from: s2  reason: collision with root package name */
    public static final int f10549s2 = 21972;

    /* renamed from: t0  reason: collision with root package name */
    public static final String f10550t0 = "V_MPEGH/ISO/HEVC";

    /* renamed from: t1  reason: collision with root package name */
    public static final int f10551t1 = 2352003;

    /* renamed from: t2  reason: collision with root package name */
    public static final int f10552t2 = 21973;

    /* renamed from: u0  reason: collision with root package name */
    public static final String f10553u0 = "V_MS/VFW/FOURCC";

    /* renamed from: u1  reason: collision with root package name */
    public static final int f10554u1 = 21358;

    /* renamed from: u2  reason: collision with root package name */
    public static final int f10555u2 = 21974;

    /* renamed from: v0  reason: collision with root package name */
    public static final String f10556v0 = "V_THEORA";

    /* renamed from: v1  reason: collision with root package name */
    public static final int f10557v1 = 134;

    /* renamed from: v2  reason: collision with root package name */
    public static final int f10558v2 = 21975;

    /* renamed from: w0  reason: collision with root package name */
    public static final String f10559w0 = "A_VORBIS";

    /* renamed from: w1  reason: collision with root package name */
    public static final int f10560w1 = 25506;

    /* renamed from: w2  reason: collision with root package name */
    public static final int f10561w2 = 21976;

    /* renamed from: x0  reason: collision with root package name */
    public static final String f10562x0 = "A_OPUS";

    /* renamed from: x1  reason: collision with root package name */
    public static final int f10563x1 = 22186;

    /* renamed from: x2  reason: collision with root package name */
    public static final int f10564x2 = 21977;

    /* renamed from: y0  reason: collision with root package name */
    public static final String f10565y0 = "A_AAC";

    /* renamed from: y1  reason: collision with root package name */
    public static final int f10566y1 = 22203;

    /* renamed from: y2  reason: collision with root package name */
    public static final int f10567y2 = 21978;

    /* renamed from: z0  reason: collision with root package name */
    public static final String f10568z0 = "A_MPEG/L2";

    /* renamed from: z1  reason: collision with root package name */
    public static final int f10569z1 = 224;

    /* renamed from: z2  reason: collision with root package name */
    public static final int f10570z2 = 0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public q E;
    public q F;
    public boolean G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public int[] M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public byte V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f10571a0;

    /* renamed from: b0  reason: collision with root package name */
    public j6.k f10572b0;

    /* renamed from: d  reason: collision with root package name */
    public final c f10573d;

    /* renamed from: e  reason: collision with root package name */
    public final g f10574e;

    /* renamed from: f  reason: collision with root package name */
    public final SparseArray<d> f10575f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10576g;

    /* renamed from: h  reason: collision with root package name */
    public final w f10577h;

    /* renamed from: i  reason: collision with root package name */
    public final w f10578i;

    /* renamed from: j  reason: collision with root package name */
    public final w f10579j;

    /* renamed from: k  reason: collision with root package name */
    public final w f10580k;

    /* renamed from: l  reason: collision with root package name */
    public final w f10581l;

    /* renamed from: m  reason: collision with root package name */
    public final w f10582m;

    /* renamed from: n  reason: collision with root package name */
    public final w f10583n;

    /* renamed from: o  reason: collision with root package name */
    public final w f10584o;

    /* renamed from: p  reason: collision with root package name */
    public final w f10585p;

    /* renamed from: q  reason: collision with root package name */
    public ByteBuffer f10586q;

    /* renamed from: r  reason: collision with root package name */
    public long f10587r;

    /* renamed from: s  reason: collision with root package name */
    public long f10588s;

    /* renamed from: t  reason: collision with root package name */
    public long f10589t;

    /* renamed from: u  reason: collision with root package name */
    public long f10590u;

    /* renamed from: v  reason: collision with root package name */
    public long f10591v;

    /* renamed from: w  reason: collision with root package name */
    public d f10592w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f10593x;

    /* renamed from: y  reason: collision with root package name */
    public int f10594y;

    /* renamed from: z  reason: collision with root package name */
    public long f10595z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public final class c implements b {
        public c() {
        }

        public void a(int i10) throws j0 {
            e.this.m(i10);
        }

        public int b(int i10) {
            return e.this.p(i10);
        }

        public boolean c(int i10) {
            return e.this.s(i10);
        }

        public void d(int i10, String str) throws j0 {
            e.this.C(i10, str);
        }

        public void e(int i10, double d10) throws j0 {
            e.this.o(i10, d10);
        }

        public void f(int i10, long j10, long j11) throws j0 {
            e.this.B(i10, j10, j11);
        }

        public void g(int i10, long j10) throws j0 {
            e.this.q(i10, j10);
        }

        public void h(int i10, int i11, j jVar) throws IOException, InterruptedException {
            e.this.i(i10, i11, jVar);
        }
    }

    public static final class d {
        public static final int W = 0;
        public static final int X = 50000;
        public static final int Y = 1000;
        public static final int Z = 200;
        public int A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public int L;
        public int M;
        public int N;
        public long O;
        public long P;
        @o0
        public C0184e Q;
        public boolean R;
        public boolean S;
        public String T;
        public s U;
        public int V;

        /* renamed from: a  reason: collision with root package name */
        public String f10597a;

        /* renamed from: b  reason: collision with root package name */
        public String f10598b;

        /* renamed from: c  reason: collision with root package name */
        public int f10599c;

        /* renamed from: d  reason: collision with root package name */
        public int f10600d;

        /* renamed from: e  reason: collision with root package name */
        public int f10601e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10602f;

        /* renamed from: g  reason: collision with root package name */
        public byte[] f10603g;

        /* renamed from: h  reason: collision with root package name */
        public s.a f10604h;

        /* renamed from: i  reason: collision with root package name */
        public byte[] f10605i;

        /* renamed from: j  reason: collision with root package name */
        public DrmInitData f10606j;

        /* renamed from: k  reason: collision with root package name */
        public int f10607k;

        /* renamed from: l  reason: collision with root package name */
        public int f10608l;

        /* renamed from: m  reason: collision with root package name */
        public int f10609m;

        /* renamed from: n  reason: collision with root package name */
        public int f10610n;

        /* renamed from: o  reason: collision with root package name */
        public int f10611o;

        /* renamed from: p  reason: collision with root package name */
        public int f10612p;

        /* renamed from: q  reason: collision with root package name */
        public float f10613q;

        /* renamed from: r  reason: collision with root package name */
        public float f10614r;

        /* renamed from: s  reason: collision with root package name */
        public float f10615s;

        /* renamed from: t  reason: collision with root package name */
        public byte[] f10616t;

        /* renamed from: u  reason: collision with root package name */
        public int f10617u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f10618v;

        /* renamed from: w  reason: collision with root package name */
        public int f10619w;

        /* renamed from: x  reason: collision with root package name */
        public int f10620x;

        /* renamed from: y  reason: collision with root package name */
        public int f10621y;

        /* renamed from: z  reason: collision with root package name */
        public int f10622z;

        public d() {
            this.f10607k = -1;
            this.f10608l = -1;
            this.f10609m = -1;
            this.f10610n = -1;
            this.f10611o = 0;
            this.f10612p = -1;
            this.f10613q = 0.0f;
            this.f10614r = 0.0f;
            this.f10615s = 0.0f;
            this.f10616t = null;
            this.f10617u = -1;
            this.f10618v = false;
            this.f10619w = -1;
            this.f10620x = -1;
            this.f10621y = -1;
            this.f10622z = 1000;
            this.A = 200;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = 1;
            this.M = -1;
            this.N = 8000;
            this.O = 0;
            this.P = 0;
            this.S = true;
            this.T = "eng";
        }

        public static Pair<String, List<byte[]>> e(w wVar) throws j0 {
            try {
                wVar.R(16);
                long s10 = wVar.s();
                if (s10 == 1482049860) {
                    return new Pair<>(w7.s.f14831q, (Object) null);
                }
                if (s10 == 859189832) {
                    return new Pair<>(w7.s.f14811g, (Object) null);
                }
                if (s10 == 826496599) {
                    byte[] bArr = wVar.f14880a;
                    for (int c10 = wVar.c() + 20; c10 < bArr.length - 4; c10++) {
                        if (bArr[c10] == 0 && bArr[c10 + 1] == 0 && bArr[c10 + 2] == 1 && bArr[c10 + 3] == 15) {
                            return new Pair<>(w7.s.f14829p, Collections.singletonList(Arrays.copyOfRange(bArr, c10, bArr.length)));
                        }
                    }
                    throw new j0("Failed to find FourCC VC1 initialization data");
                }
                p.l(e.f10505e0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>(w7.s.f14834s, (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new j0("Error parsing FourCC private data");
            }
        }

        public static boolean f(w wVar) throws j0 {
            try {
                int v10 = wVar.v();
                if (v10 == 1) {
                    return true;
                }
                if (v10 != 65534) {
                    return false;
                }
                wVar.Q(24);
                return wVar.w() == e.U2.getMostSignificantBits() && wVar.w() == e.U2.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new j0("Error parsing MS/ACM codec private");
            }
        }

        public static List<byte[]> g(byte[] bArr) throws j0 {
            byte b10;
            byte b11;
            try {
                if (bArr[0] == 2) {
                    int i10 = 0;
                    int i11 = 1;
                    while (true) {
                        b10 = bArr[i11];
                        if (b10 != -1) {
                            break;
                        }
                        i10 += 255;
                        i11++;
                    }
                    int i12 = i11 + 1;
                    int i13 = i10 + b10;
                    int i14 = 0;
                    while (true) {
                        b11 = bArr[i12];
                        if (b11 != -1) {
                            break;
                        }
                        i14 += 255;
                        i12++;
                    }
                    int i15 = i12 + 1;
                    int i16 = i14 + b11;
                    if (bArr[i15] == 1) {
                        byte[] bArr2 = new byte[i13];
                        System.arraycopy(bArr, i15, bArr2, 0, i13);
                        int i17 = i15 + i13;
                        if (bArr[i17] == 3) {
                            int i18 = i17 + i16;
                            if (bArr[i18] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i18)];
                                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new j0("Error parsing vorbis codec private");
                        }
                        throw new j0("Error parsing vorbis codec private");
                    }
                    throw new j0("Error parsing vorbis codec private");
                }
                throw new j0("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new j0("Error parsing vorbis codec private");
            }
        }

        public final byte[] b() {
            if (this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((int) ((this.B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.J + 0.5f)));
            wrap.putShort((short) ((int) (this.K + 0.5f)));
            wrap.putShort((short) this.f10622z);
            wrap.putShort((short) this.A);
            return bArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x023b, code lost:
            r1.append("Unsupported PCM bit depth: ");
            r1.append(r0.M);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0245, code lost:
            r26 = r1;
            r6 = w7.s.f14841z;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0256, code lost:
            r6 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0258, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x025a, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x025c, code lost:
            r31 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0290, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0291, code lost:
            r6 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ca, code lost:
            r6 = r16;
            r31 = 4096;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x02db, code lost:
            r6 = r16;
            r31 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x02df, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0310, code lost:
            r1.append(r2);
            r1.append(r6);
            w7.p.l(m6.e.f10505e0, r1.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x032e, code lost:
            r2 = r0.S | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0333, code lost:
            if (r0.R == false) goto L_0x0337;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0335, code lost:
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0337, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0338, code lost:
            r2 = r2 | r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x033d, code lost:
            if (w7.s.l(r6) == false) goto L_0x0365;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x033f, code lost:
            r1 = com.google.android.exoplayer2.Format.q(java.lang.Integer.toString(r44), r6, (java.lang.String) null, -1, r31, r0.L, r0.N, r26, r1, r0.f10606j, r2, r0.T);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x0369, code lost:
            if (w7.s.n(r6) == false) goto L_0x0462;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x036d, code lost:
            if (r0.f10611o != 0) goto L_0x0381;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x036f, code lost:
            r2 = r0.f10609m;
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0372, code lost:
            if (r2 != -1) goto L_0x0376;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0374, code lost:
            r2 = r0.f10607k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0376, code lost:
            r0.f10609m = r2;
            r2 = r0.f10610n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x037a, code lost:
            if (r2 != -1) goto L_0x037e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x037c, code lost:
            r2 = r0.f10608l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x037e, code lost:
            r0.f10610n = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0381, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0382, code lost:
            r2 = -1.0f;
            r4 = r0.f10609m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0386, code lost:
            if (r4 == r3) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0388, code lost:
            r5 = r0.f10610n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x038a, code lost:
            if (r5 == r3) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x038c, code lost:
            r2 = ((float) (r0.f10608l * r4)) / ((float) (r0.f10607k * r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0395, code lost:
            r37 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x0399, code lost:
            if (r0.f10618v == false) goto L_0x03ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x039b, code lost:
            r40 = new com.google.android.exoplayer2.video.ColorInfo(r0.f10619w, r0.f10621y, r0.f10620x, b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03ad, code lost:
            r40 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bb, code lost:
            if ("htc_video_rotA-000".equals(r0.f10597a) == false) goto L_0x03bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03bd, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c7, code lost:
            if ("htc_video_rotA-090".equals(r0.f10597a) == false) goto L_0x03cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c9, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d3, code lost:
            if ("htc_video_rotA-180".equals(r0.f10597a) == false) goto L_0x03d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d5, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03df, code lost:
            if ("htc_video_rotA-270".equals(r0.f10597a) == false) goto L_0x03e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x03e1, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e4, code lost:
            r9 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e7, code lost:
            if (r0.f10612p != 0) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f0, code lost:
            if (java.lang.Float.compare(r0.f10613q, 0.0f) != 0) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f8, code lost:
            if (java.lang.Float.compare(r0.f10614r, 0.0f) != 0) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x0400, code lost:
            if (java.lang.Float.compare(r0.f10615s, 0.0f) != 0) goto L_0x0405;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0402, code lost:
            r36 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x040d, code lost:
            if (java.lang.Float.compare(r0.f10614r, 90.0f) != 0) goto L_0x0412;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x040f, code lost:
            r36 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x041a, code lost:
            if (java.lang.Float.compare(r0.f10614r, -180.0f) == 0) goto L_0x0434;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0424, code lost:
            if (java.lang.Float.compare(r0.f10614r, 180.0f) != 0) goto L_0x0427;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x042f, code lost:
            if (java.lang.Float.compare(r0.f10614r, -90.0f) != 0) goto L_0x0437;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0431, code lost:
            r8 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0434, code lost:
            r36 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0437, code lost:
            r36 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0439, code lost:
            r1 = com.google.android.exoplayer2.Format.H(java.lang.Integer.toString(r44), r6, (java.lang.String) null, -1, r31, r0.f10607k, r0.f10608l, -1.0f, r1, r36, r37, r0.f10616t, r0.f10617u, r40, r0.f10606j);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0466, code lost:
            if (w7.s.f14804c0.equals(r6) == false) goto L_0x0477;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0468, code lost:
            r1 = com.google.android.exoplayer2.Format.A(java.lang.Integer.toString(r44), r6, r2, r0.T, r0.f10606j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0474, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x047b, code lost:
            if (w7.s.T.equals(r6) == false) goto L_0x04b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x047d, code lost:
            r1 = new java.util.ArrayList(2);
            r1.add(m6.e.d());
            r1.add(r0.f10605i);
            r1 = com.google.android.exoplayer2.Format.C(java.lang.Integer.toString(r44), r6, (java.lang.String) null, -1, r2, r0.T, -1, r0.f10606j, Long.MAX_VALUE, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x04b5, code lost:
            if (w7.s.f14816i0.equals(r6) != false) goto L_0x04cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04bb, code lost:
            if (w7.s.f14818j0.equals(r6) != false) goto L_0x04cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x04c1, code lost:
            if (w7.s.f14826n0.equals(r6) == false) goto L_0x04c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x04cb, code lost:
            throw new b6.j0("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x04cc, code lost:
            r1 = com.google.android.exoplayer2.Format.u(java.lang.Integer.toString(r44), r6, (java.lang.String) null, -1, r2, r1, r0.T, r0.f10606j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e7, code lost:
            r2 = r43.a(r0.f10599c, r5);
            r0.U = r2;
            r2.d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04f4, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(j6.k r43, int r44) throws b6.j0 {
            /*
                r42 = this;
                r0 = r42
                java.lang.String r1 = r0.f10598b
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 4
                r4 = 8
                r5 = 1
                r7 = 3
                r8 = 0
                switch(r2) {
                    case -2095576542: goto L_0x0195;
                    case -2095575984: goto L_0x0189;
                    case -1985379776: goto L_0x017d;
                    case -1784763192: goto L_0x0171;
                    case -1730367663: goto L_0x0165;
                    case -1482641358: goto L_0x0159;
                    case -1482641357: goto L_0x014d;
                    case -1373388978: goto L_0x0141;
                    case -933872740: goto L_0x0134;
                    case -538363189: goto L_0x0126;
                    case -538363109: goto L_0x0118;
                    case -425012669: goto L_0x010a;
                    case -356037306: goto L_0x00fc;
                    case 62923557: goto L_0x00ee;
                    case 62923603: goto L_0x00e0;
                    case 62927045: goto L_0x00d2;
                    case 82318131: goto L_0x00c4;
                    case 82338133: goto L_0x00b6;
                    case 82338134: goto L_0x00a8;
                    case 99146302: goto L_0x009a;
                    case 444813526: goto L_0x008c;
                    case 542569478: goto L_0x007f;
                    case 725957860: goto L_0x0072;
                    case 738597099: goto L_0x0065;
                    case 855502857: goto L_0x0058;
                    case 1422270023: goto L_0x004b;
                    case 1809237540: goto L_0x003e;
                    case 1950749482: goto L_0x0031;
                    case 1950789798: goto L_0x0024;
                    case 1951062397: goto L_0x0017;
                    default: goto L_0x0014;
                }
            L_0x0014:
                r1 = -1
                goto L_0x01a0
            L_0x0017:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0020
                goto L_0x0014
            L_0x0020:
                r1 = 29
                goto L_0x01a0
            L_0x0024:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x002d
                goto L_0x0014
            L_0x002d:
                r1 = 28
                goto L_0x01a0
            L_0x0031:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x003a
                goto L_0x0014
            L_0x003a:
                r1 = 27
                goto L_0x01a0
            L_0x003e:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0047
                goto L_0x0014
            L_0x0047:
                r1 = 26
                goto L_0x01a0
            L_0x004b:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0054
                goto L_0x0014
            L_0x0054:
                r1 = 25
                goto L_0x01a0
            L_0x0058:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0061
                goto L_0x0014
            L_0x0061:
                r1 = 24
                goto L_0x01a0
            L_0x0065:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x006e
                goto L_0x0014
            L_0x006e:
                r1 = 23
                goto L_0x01a0
            L_0x0072:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x007b
                goto L_0x0014
            L_0x007b:
                r1 = 22
                goto L_0x01a0
            L_0x007f:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0088
                goto L_0x0014
            L_0x0088:
                r1 = 21
                goto L_0x01a0
            L_0x008c:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0096
                goto L_0x0014
            L_0x0096:
                r1 = 20
                goto L_0x01a0
            L_0x009a:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00a4
                goto L_0x0014
            L_0x00a4:
                r1 = 19
                goto L_0x01a0
            L_0x00a8:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00b2
                goto L_0x0014
            L_0x00b2:
                r1 = 18
                goto L_0x01a0
            L_0x00b6:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00c0
                goto L_0x0014
            L_0x00c0:
                r1 = 17
                goto L_0x01a0
            L_0x00c4:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00ce
                goto L_0x0014
            L_0x00ce:
                r1 = 16
                goto L_0x01a0
            L_0x00d2:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00dc
                goto L_0x0014
            L_0x00dc:
                r1 = 15
                goto L_0x01a0
            L_0x00e0:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00ea
                goto L_0x0014
            L_0x00ea:
                r1 = 14
                goto L_0x01a0
            L_0x00ee:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x00f8
                goto L_0x0014
            L_0x00f8:
                r1 = 13
                goto L_0x01a0
            L_0x00fc:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0106
                goto L_0x0014
            L_0x0106:
                r1 = 12
                goto L_0x01a0
            L_0x010a:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0114
                goto L_0x0014
            L_0x0114:
                r1 = 11
                goto L_0x01a0
            L_0x0118:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0122
                goto L_0x0014
            L_0x0122:
                r1 = 10
                goto L_0x01a0
            L_0x0126:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0130
                goto L_0x0014
            L_0x0130:
                r1 = 9
                goto L_0x01a0
            L_0x0134:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x013e
                goto L_0x0014
            L_0x013e:
                r1 = r4
                goto L_0x01a0
            L_0x0141:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x014b
                goto L_0x0014
            L_0x014b:
                r1 = 7
                goto L_0x01a0
            L_0x014d:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0157
                goto L_0x0014
            L_0x0157:
                r1 = 6
                goto L_0x01a0
            L_0x0159:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0163
                goto L_0x0014
            L_0x0163:
                r1 = 5
                goto L_0x01a0
            L_0x0165:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x016f
                goto L_0x0014
            L_0x016f:
                r1 = r3
                goto L_0x01a0
            L_0x0171:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x017b
                goto L_0x0014
            L_0x017b:
                r1 = r7
                goto L_0x01a0
            L_0x017d:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0187
                goto L_0x0014
            L_0x0187:
                r1 = 2
                goto L_0x01a0
            L_0x0189:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0193
                goto L_0x0014
            L_0x0193:
                r1 = r5
                goto L_0x01a0
            L_0x0195:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x019f
                goto L_0x0014
            L_0x019f:
                r1 = r8
            L_0x01a0:
                java.lang.String r2 = ". Setting mimeType to "
                java.lang.String r10 = "Unsupported PCM bit depth: "
                java.lang.String r11 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/x-ssa"
                java.lang.String r15 = "application/x-subrip"
                java.lang.String r16 = "audio/raw"
                r17 = 4096(0x1000, float:5.74E-42)
                java.lang.String r9 = "MatroskaExtractor"
                java.lang.String r6 = "audio/x-unknown"
                r18 = 0
                switch(r1) {
                    case 0: goto L_0x031f;
                    case 1: goto L_0x031f;
                    case 2: goto L_0x02ed;
                    case 3: goto L_0x02e2;
                    case 4: goto L_0x02d1;
                    case 5: goto L_0x02c8;
                    case 6: goto L_0x02c5;
                    case 7: goto L_0x02af;
                    case 8: goto L_0x0294;
                    case 9: goto L_0x031f;
                    case 10: goto L_0x027d;
                    case 11: goto L_0x0275;
                    case 12: goto L_0x0272;
                    case 13: goto L_0x0269;
                    case 14: goto L_0x0266;
                    case 15: goto L_0x0263;
                    case 16: goto L_0x0260;
                    case 17: goto L_0x0254;
                    case 18: goto L_0x0251;
                    case 19: goto L_0x024f;
                    case 20: goto L_0x024c;
                    case 21: goto L_0x0263;
                    case 22: goto L_0x022e;
                    case 23: goto L_0x022c;
                    case 24: goto L_0x0217;
                    case 25: goto L_0x0215;
                    case 26: goto L_0x0212;
                    case 27: goto L_0x020f;
                    case 28: goto L_0x0205;
                    case 29: goto L_0x01c3;
                    default: goto L_0x01bb;
                }
            L_0x01bb:
                b6.j0 r1 = new b6.j0
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x01c3:
                r17 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r7)
                byte[] r2 = r0.f10605i
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r9 = r0.O
                java.nio.ByteBuffer r2 = r2.putLong(r9)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.P
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                goto L_0x02db
            L_0x0205:
                byte[] r1 = r0.f10605i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x0291
            L_0x020f:
                java.lang.String r16 = "audio/eac3"
                goto L_0x0256
            L_0x0212:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0256
            L_0x0215:
                r6 = r15
                goto L_0x0258
            L_0x0217:
                w7.w r1 = new w7.w
                byte[] r2 = r0.f10605i
                r1.<init>((byte[]) r2)
                x7.c r1 = x7.c.a(r1)
                java.util.List<byte[]> r2 = r1.f15155a
                int r1 = r1.f15156b
                r0.V = r1
                java.lang.String r16 = "video/hevc"
                goto L_0x0290
            L_0x022c:
                r6 = r14
                goto L_0x0258
            L_0x022e:
                int r1 = r0.M
                int r1 = w7.q0.Y(r1)
                if (r1 != 0) goto L_0x0245
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
            L_0x023b:
                r1.append(r10)
                int r3 = r0.M
                r1.append(r3)
                goto L_0x0310
            L_0x0245:
                r26 = r1
                r6 = r16
                r1 = r18
                goto L_0x025c
            L_0x024c:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0256
            L_0x024f:
                r6 = r12
                goto L_0x0258
            L_0x0251:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0256
            L_0x0254:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0256:
                r6 = r16
            L_0x0258:
                r1 = r18
            L_0x025a:
                r26 = -1
            L_0x025c:
                r31 = -1
                goto L_0x032e
            L_0x0260:
                java.lang.String r16 = "video/av01"
                goto L_0x0256
            L_0x0263:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0256
            L_0x0266:
                java.lang.String r16 = "audio/ac3"
                goto L_0x0256
            L_0x0269:
                byte[] r1 = r0.f10605i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0291
            L_0x0272:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0256
            L_0x0275:
                byte[] r1 = r0.f10605i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r6 = r13
                goto L_0x025a
            L_0x027d:
                w7.w r1 = new w7.w
                byte[] r2 = r0.f10605i
                r1.<init>((byte[]) r2)
                x7.a r1 = x7.a.b(r1)
                java.util.List<byte[]> r2 = r1.f15147a
                int r1 = r1.f15148b
                r0.V = r1
                java.lang.String r16 = "video/avc"
            L_0x0290:
                r1 = r2
            L_0x0291:
                r6 = r16
                goto L_0x025a
            L_0x0294:
                byte[] r1 = new byte[r3]
                byte[] r2 = r0.f10605i
                byte r3 = r2[r8]
                r1[r8] = r3
                byte r3 = r2[r5]
                r1[r5] = r3
                r3 = 2
                byte r4 = r2[r3]
                r1[r3] = r4
                byte r2 = r2[r7]
                r1[r7] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r6 = r11
                goto L_0x025a
            L_0x02af:
                w7.w r1 = new w7.w
                byte[] r2 = r0.f10605i
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = e(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x0291
            L_0x02c5:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x02ca
            L_0x02c8:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x02ca:
                r6 = r16
                r31 = r17
                r1 = r18
                goto L_0x02df
            L_0x02d1:
                r17 = 8192(0x2000, float:1.14794E-41)
                byte[] r1 = r0.f10605i
                java.util.List r1 = g(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x02db:
                r6 = r16
                r31 = r17
            L_0x02df:
                r26 = -1
                goto L_0x032e
            L_0x02e2:
                m6.e$e r1 = new m6.e$e
                r1.<init>()
                r0.Q = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0256
            L_0x02ed:
                w7.w r1 = new w7.w
                byte[] r3 = r0.f10605i
                r1.<init>((byte[]) r3)
                boolean r1 = f(r1)
                if (r1 == 0) goto L_0x0309
                int r1 = r0.M
                int r1 = w7.q0.Y(r1)
                if (r1 != 0) goto L_0x0245
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                goto L_0x023b
            L_0x0309:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            L_0x0310:
                r1.append(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                w7.p.l(r9, r1)
                goto L_0x0258
            L_0x031f:
                byte[] r1 = r0.f10605i
                if (r1 != 0) goto L_0x0326
                r1 = r18
                goto L_0x032a
            L_0x0326:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x032a:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0291
            L_0x032e:
                boolean r2 = r0.S
                r2 = r2 | r8
                boolean r3 = r0.R
                if (r3 == 0) goto L_0x0337
                r3 = 2
                goto L_0x0338
            L_0x0337:
                r3 = r8
            L_0x0338:
                r2 = r2 | r3
                boolean r3 = w7.s.l(r6)
                if (r3 == 0) goto L_0x0365
                java.lang.String r19 = java.lang.Integer.toString(r44)
                r21 = 0
                r22 = -1
                int r3 = r0.L
                int r4 = r0.N
                com.google.android.exoplayer2.drm.DrmInitData r7 = r0.f10606j
                java.lang.String r8 = r0.T
                r20 = r6
                r23 = r31
                r24 = r3
                r25 = r4
                r27 = r1
                r28 = r7
                r29 = r2
                r30 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.q(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x04e7
            L_0x0365:
                boolean r3 = w7.s.n(r6)
                if (r3 == 0) goto L_0x0462
                int r2 = r0.f10611o
                if (r2 != 0) goto L_0x0381
                int r2 = r0.f10609m
                r3 = -1
                if (r2 != r3) goto L_0x0376
                int r2 = r0.f10607k
            L_0x0376:
                r0.f10609m = r2
                int r2 = r0.f10610n
                if (r2 != r3) goto L_0x037e
                int r2 = r0.f10608l
            L_0x037e:
                r0.f10610n = r2
                goto L_0x0382
            L_0x0381:
                r3 = -1
            L_0x0382:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r4 = r0.f10609m
                if (r4 == r3) goto L_0x0395
                int r5 = r0.f10610n
                if (r5 == r3) goto L_0x0395
                int r2 = r0.f10608l
                int r2 = r2 * r4
                float r2 = (float) r2
                int r4 = r0.f10607k
                int r4 = r4 * r5
                float r4 = (float) r4
                float r2 = r2 / r4
            L_0x0395:
                r37 = r2
                boolean r2 = r0.f10618v
                if (r2 == 0) goto L_0x03ad
                byte[] r2 = r42.b()
                com.google.android.exoplayer2.video.ColorInfo r4 = new com.google.android.exoplayer2.video.ColorInfo
                int r5 = r0.f10619w
                int r7 = r0.f10621y
                int r9 = r0.f10620x
                r4.<init>(r5, r7, r9, r2)
                r40 = r4
                goto L_0x03af
            L_0x03ad:
                r40 = r18
            L_0x03af:
                java.lang.String r2 = r0.f10597a
                java.lang.String r4 = "htc_video_rotA-000"
                boolean r2 = r4.equals(r2)
                r4 = 180(0xb4, float:2.52E-43)
                r5 = 90
                if (r2 == 0) goto L_0x03bf
                r9 = r8
                goto L_0x03e5
            L_0x03bf:
                java.lang.String r2 = r0.f10597a
                java.lang.String r7 = "htc_video_rotA-090"
                boolean r2 = r7.equals(r2)
                if (r2 == 0) goto L_0x03cb
                r9 = r5
                goto L_0x03e5
            L_0x03cb:
                java.lang.String r2 = r0.f10597a
                java.lang.String r7 = "htc_video_rotA-180"
                boolean r2 = r7.equals(r2)
                if (r2 == 0) goto L_0x03d7
                r9 = r4
                goto L_0x03e5
            L_0x03d7:
                java.lang.String r2 = r0.f10597a
                java.lang.String r7 = "htc_video_rotA-270"
                boolean r2 = r7.equals(r2)
                if (r2 == 0) goto L_0x03e4
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x03e5
            L_0x03e4:
                r9 = r3
            L_0x03e5:
                int r2 = r0.f10612p
                if (r2 != 0) goto L_0x0437
                float r2 = r0.f10613q
                r3 = 0
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0437
                float r2 = r0.f10614r
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0437
                float r2 = r0.f10615s
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0405
            L_0x0402:
                r36 = r8
                goto L_0x0439
            L_0x0405:
                float r2 = r0.f10614r
                r3 = 1119092736(0x42b40000, float:90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0412
                r36 = r5
                goto L_0x0439
            L_0x0412:
                float r2 = r0.f10614r
                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 == 0) goto L_0x0434
                float r2 = r0.f10614r
                r3 = 1127481344(0x43340000, float:180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0427
                goto L_0x0434
            L_0x0427:
                float r2 = r0.f10614r
                r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x0437
                r8 = 270(0x10e, float:3.78E-43)
                goto L_0x0402
            L_0x0434:
                r36 = r4
                goto L_0x0439
            L_0x0437:
                r36 = r9
            L_0x0439:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                int r2 = r0.f10607k
                int r3 = r0.f10608l
                r34 = -1082130432(0xffffffffbf800000, float:-1.0)
                byte[] r4 = r0.f10616t
                int r5 = r0.f10617u
                com.google.android.exoplayer2.drm.DrmInitData r7 = r0.f10606j
                r28 = r6
                r32 = r2
                r33 = r3
                r35 = r1
                r38 = r4
                r39 = r5
                r41 = r7
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.H(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                r5 = 2
                goto L_0x04e7
            L_0x0462:
                boolean r3 = r15.equals(r6)
                if (r3 == 0) goto L_0x0477
                java.lang.String r1 = java.lang.Integer.toString(r44)
                java.lang.String r3 = r0.T
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f10606j
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.A(r1, r6, r2, r3, r4)
            L_0x0474:
                r5 = r7
                goto L_0x04e7
            L_0x0477:
                boolean r3 = r14.equals(r6)
                if (r3 == 0) goto L_0x04b1
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 2
                r1.<init>(r3)
                byte[] r3 = m6.e.L2
                r1.add(r3)
                byte[] r3 = r0.f10605i
                r1.add(r3)
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.T
                r33 = -1
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f10606j
                r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r28 = r6
                r31 = r2
                r32 = r3
                r34 = r4
                r37 = r1
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.C(r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
                goto L_0x0474
            L_0x04b1:
                boolean r3 = r13.equals(r6)
                if (r3 != 0) goto L_0x04cc
                boolean r3 = r12.equals(r6)
                if (r3 != 0) goto L_0x04cc
                boolean r3 = r11.equals(r6)
                if (r3 == 0) goto L_0x04c4
                goto L_0x04cc
            L_0x04c4:
                b6.j0 r1 = new b6.j0
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x04cc:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.T
                com.google.android.exoplayer2.drm.DrmInitData r4 = r0.f10606j
                r28 = r6
                r31 = r2
                r32 = r1
                r33 = r3
                r34 = r4
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.u(r27, r28, r29, r30, r31, r32, r33, r34)
                goto L_0x0474
            L_0x04e7:
                int r2 = r0.f10599c
                r3 = r43
                j6.s r2 = r3.a(r2, r5)
                r0.U = r2
                r2.d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.e.d.c(j6.k, int):void");
        }

        public void d() {
            C0184e eVar = this.Q;
            if (eVar != null) {
                eVar.a(this);
            }
        }

        public void h() {
            C0184e eVar = this.Q;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    /* renamed from: m6.e$e  reason: collision with other inner class name */
    public static final class C0184e {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f10623a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        public boolean f10624b;

        /* renamed from: c  reason: collision with root package name */
        public int f10625c;

        /* renamed from: d  reason: collision with root package name */
        public int f10626d;

        /* renamed from: e  reason: collision with root package name */
        public long f10627e;

        /* renamed from: f  reason: collision with root package name */
        public int f10628f;

        public void a(d dVar) {
            if (this.f10624b && this.f10625c > 0) {
                dVar.U.c(this.f10627e, this.f10628f, this.f10626d, 0, dVar.f10604h);
                this.f10625c = 0;
            }
        }

        public void b() {
            this.f10624b = false;
        }

        public void c(d dVar, long j10) {
            if (this.f10624b) {
                int i10 = this.f10625c;
                int i11 = i10 + 1;
                this.f10625c = i11;
                if (i10 == 0) {
                    this.f10627e = j10;
                }
                if (i11 >= 16) {
                    dVar.U.c(this.f10627e, this.f10628f, this.f10626d, 0, dVar.f10604h);
                    this.f10625c = 0;
                }
            }
        }

        public void d(j jVar, int i10, int i11) throws IOException, InterruptedException {
            if (!this.f10624b) {
                jVar.k(this.f10623a, 0, 10);
                jVar.h();
                if (d6.a.j(this.f10623a) != 0) {
                    this.f10624b = true;
                    this.f10625c = 0;
                } else {
                    return;
                }
            }
            if (this.f10625c == 0) {
                this.f10628f = i10;
                this.f10626d = 0;
            }
            this.f10626d += i11;
        }
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new a(), i10);
    }

    public e(c cVar, int i10) {
        this.f10588s = -1;
        this.f10589t = b6.c.f4201b;
        this.f10590u = b6.c.f4201b;
        this.f10591v = b6.c.f4201b;
        this.B = -1;
        this.C = -1;
        this.D = b6.c.f4201b;
        this.f10573d = cVar;
        cVar.b(new c());
        this.f10576g = (i10 & 1) != 0 ? false : true;
        this.f10574e = new g();
        this.f10575f = new SparseArray<>();
        this.f10579j = new w(4);
        this.f10580k = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f10581l = new w(4);
        this.f10577h = new w(t.f14846b);
        this.f10578i = new w(4);
        this.f10582m = new w();
        this.f10583n = new w();
        this.f10584o = new w(8);
        this.f10585p = new w();
    }

    public static void A(byte[] bArr, long j10, String str, int i10, long j11, byte[] bArr2) {
        byte[] bArr3;
        if (j10 == b6.c.f4201b) {
            bArr3 = bArr2;
        } else {
            int i11 = (int) (j10 / 3600000000L);
            long j12 = j10 - (((long) (i11 * e1.w.f6765c)) * 1000000);
            int i12 = (int) (j12 / 60000000);
            long j13 = j12 - (((long) (i12 * 60)) * 1000000);
            int i13 = (int) (j13 / 1000000);
            bArr3 = q0.m0(String.format(Locale.US, str, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf((int) ((j13 - (((long) i13) * 1000000)) / j11))}));
        }
        System.arraycopy(bArr3, 0, bArr, i10, bArr2.length);
    }

    public static int[] n(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static boolean r(String str) {
        return f10526l0.equals(str) || f10529m0.equals(str) || f10532n0.equals(str) || f10535o0.equals(str) || f10538p0.equals(str) || f10541q0.equals(str) || f10544r0.equals(str) || f10547s0.equals(str) || f10550t0.equals(str) || f10553u0.equals(str) || f10556v0.equals(str) || f10562x0.equals(str) || f10559w0.equals(str) || f10565y0.equals(str) || f10568z0.equals(str) || A0.equals(str) || B0.equals(str) || C0.equals(str) || D0.equals(str) || E0.equals(str) || F0.equals(str) || G0.equals(str) || H0.equals(str) || I0.equals(str) || J0.equals(str) || K0.equals(str) || L0.equals(str) || M0.equals(str) || N0.equals(str) || O0.equals(str);
    }

    public static /* synthetic */ i[] t() {
        return new i[]{new e()};
    }

    @d.i
    public void B(int i10, long j10, long j11) throws j0 {
        if (i10 == 160) {
            this.f10571a0 = false;
        } else if (i10 == 174) {
            this.f10592w = new d();
        } else if (i10 == 187) {
            this.G = false;
        } else if (i10 == 19899) {
            this.f10594y = -1;
            this.f10595z = -1;
        } else if (i10 == 20533) {
            this.f10592w.f10602f = true;
        } else if (i10 == 21968) {
            this.f10592w.f10618v = true;
        } else if (i10 == 408125543) {
            long j12 = this.f10588s;
            if (j12 == -1 || j12 == j10) {
                this.f10588s = j10;
                this.f10587r = j11;
                return;
            }
            throw new j0("Multiple Segment elements not supported");
        } else if (i10 == 475249515) {
            this.E = new q();
            this.F = new q();
        } else if (i10 != 524531317 || this.f10593x) {
        } else {
            if (!this.f10576g || this.B == -1) {
                this.f10572b0.q(new q.b(this.f10591v));
                this.f10593x = true;
                return;
            }
            this.A = true;
        }
    }

    @d.i
    public void C(int i10, String str) throws j0 {
        if (i10 == 134) {
            this.f10592w.f10598b = str;
        } else if (i10 != 17026) {
            if (i10 == 21358) {
                this.f10592w.f10597a = str;
            } else if (i10 == 2274716) {
                String unused = this.f10592w.T = str;
            }
        } else if (!f10523k0.equals(str) && !f10520j0.equals(str)) {
            throw new j0("DocType " + str + " not supported");
        }
    }

    public final void D(j jVar, d dVar, int i10) throws IOException, InterruptedException {
        int i11;
        if (K0.equals(dVar.f10598b)) {
            E(jVar, G2, i10);
        } else if (L0.equals(dVar.f10598b)) {
            E(jVar, M2, i10);
        } else {
            s sVar = dVar.U;
            boolean z10 = true;
            if (!this.R) {
                if (dVar.f10602f) {
                    this.P &= -1073741825;
                    int i12 = 128;
                    if (!this.S) {
                        jVar.readFully(this.f10579j.f14880a, 0, 1);
                        this.Q++;
                        byte b10 = this.f10579j.f14880a[0];
                        if ((b10 & o.f24535b) != 128) {
                            this.V = b10;
                            this.S = true;
                        } else {
                            throw new j0("Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.V;
                    if ((b11 & 1) == 1) {
                        boolean z11 = (b11 & 2) == 2;
                        this.P |= 1073741824;
                        if (!this.T) {
                            jVar.readFully(this.f10584o.f14880a, 0, 8);
                            this.Q += 8;
                            this.T = true;
                            w wVar = this.f10579j;
                            byte[] bArr = wVar.f14880a;
                            if (!z11) {
                                i12 = 0;
                            }
                            bArr[0] = (byte) (i12 | 8);
                            wVar.Q(0);
                            sVar.a(this.f10579j, 1);
                            this.Y++;
                            this.f10584o.Q(0);
                            sVar.a(this.f10584o, 8);
                            this.Y += 8;
                        }
                        if (z11) {
                            if (!this.U) {
                                jVar.readFully(this.f10579j.f14880a, 0, 1);
                                this.Q++;
                                this.f10579j.Q(0);
                                this.W = this.f10579j.D();
                                this.U = true;
                            }
                            int i13 = this.W * 4;
                            this.f10579j.M(i13);
                            jVar.readFully(this.f10579j.f14880a, 0, i13);
                            this.Q += i13;
                            short s10 = (short) ((this.W / 2) + 1);
                            int i14 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f10586q;
                            if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                this.f10586q = ByteBuffer.allocate(i14);
                            }
                            this.f10586q.position(0);
                            this.f10586q.putShort(s10);
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i11 = this.W;
                                if (i15 >= i11) {
                                    break;
                                }
                                int H3 = this.f10579j.H();
                                if (i15 % 2 == 0) {
                                    this.f10586q.putShort((short) (H3 - i16));
                                } else {
                                    this.f10586q.putInt(H3 - i16);
                                }
                                i15++;
                                i16 = H3;
                            }
                            int i17 = (i10 - this.Q) - i16;
                            int i18 = i11 % 2;
                            ByteBuffer byteBuffer2 = this.f10586q;
                            if (i18 == 1) {
                                byteBuffer2.putInt(i17);
                            } else {
                                byteBuffer2.putShort((short) i17);
                                this.f10586q.putInt(0);
                            }
                            this.f10585p.O(this.f10586q.array(), i14);
                            sVar.a(this.f10585p, i14);
                            this.Y += i14;
                        }
                    }
                } else {
                    byte[] bArr2 = dVar.f10603g;
                    if (bArr2 != null) {
                        this.f10582m.O(bArr2, bArr2.length);
                    }
                }
                this.R = true;
            }
            int d10 = i10 + this.f10582m.d();
            if (!f10547s0.equals(dVar.f10598b) && !f10550t0.equals(dVar.f10598b)) {
                if (dVar.Q != null) {
                    if (this.f10582m.d() != 0) {
                        z10 = false;
                    }
                    w7.a.i(z10);
                    dVar.Q.d(jVar, this.P, d10);
                }
                while (true) {
                    int i19 = this.Q;
                    if (i19 >= d10) {
                        break;
                    }
                    w(jVar, sVar, d10 - i19);
                }
            } else {
                byte[] bArr3 = this.f10578i.f14880a;
                bArr3[0] = 0;
                bArr3[1] = 0;
                bArr3[2] = 0;
                int i20 = dVar.V;
                int i21 = 4 - i20;
                while (this.Q < d10) {
                    int i22 = this.X;
                    if (i22 == 0) {
                        x(jVar, bArr3, i21, i20);
                        this.f10578i.Q(0);
                        this.X = this.f10578i.H();
                        this.f10577h.Q(0);
                        sVar.a(this.f10577h, 4);
                        this.Y += 4;
                    } else {
                        this.X = i22 - w(jVar, sVar, i22);
                    }
                }
            }
            if (f10559w0.equals(dVar.f10598b)) {
                this.f10580k.Q(0);
                sVar.a(this.f10580k, 4);
                this.Y += 4;
            }
        }
    }

    public final void E(j jVar, byte[] bArr, int i10) throws IOException, InterruptedException {
        int length = bArr.length + i10;
        if (this.f10583n.b() < length) {
            this.f10583n.f14880a = Arrays.copyOf(bArr, length + i10);
        } else {
            System.arraycopy(bArr, 0, this.f10583n.f14880a, 0, bArr.length);
        }
        jVar.readFully(this.f10583n.f14880a, bArr.length, i10);
        this.f10583n.M(length);
    }

    public final void a() {
    }

    public final boolean c(j jVar) throws IOException, InterruptedException {
        return new f().b(jVar);
    }

    public final int f(j jVar, j6.p pVar) throws IOException, InterruptedException {
        this.Z = false;
        boolean z10 = true;
        while (z10 && !this.Z) {
            z10 = this.f10573d.a(jVar);
            if (z10 && u(pVar, jVar.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f10575f.size(); i10++) {
            this.f10575f.valueAt(i10).d();
        }
        return -1;
    }

    public final void g(j6.k kVar) {
        this.f10572b0 = kVar;
    }

    @d.i
    public void h(long j10, long j11) {
        this.D = b6.c.f4201b;
        this.H = 0;
        this.f10573d.reset();
        this.f10574e.e();
        y();
        for (int i10 = 0; i10 < this.f10575f.size(); i10++) {
            this.f10575f.valueAt(i10).h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f0, code lost:
        throw new b6.j0("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0241  */
    @d.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(int r22, int r23, j6.j r24) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            if (r1 == r4) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0083
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0073
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0048
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0031
            m6.e$d r1 = r0.f10592w
            byte[] r4 = new byte[r2]
            r1.f10616t = r4
            r3.readFully(r4, r6, r2)
            goto L_0x029e
        L_0x0031:
            b6.j0 r2 = new b6.j0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0048:
            m6.e$d r1 = r0.f10592w
            byte[] r4 = new byte[r2]
            r1.f10605i = r4
            r3.readFully(r4, r6, r2)
            goto L_0x029e
        L_0x0053:
            w7.w r1 = r0.f10581l
            byte[] r1 = r1.f14880a
            java.util.Arrays.fill(r1, r6)
            w7.w r1 = r0.f10581l
            byte[] r1 = r1.f14880a
            int r4 = 4 - r2
            r3.readFully(r1, r4, r2)
            w7.w r1 = r0.f10581l
            r1.Q(r6)
            w7.w r1 = r0.f10581l
            long r1 = r1.F()
            int r1 = (int) r1
            r0.f10594y = r1
            goto L_0x029e
        L_0x0073:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r6, r2)
            m6.e$d r2 = r0.f10592w
            j6.s$a r3 = new j6.s$a
            r3.<init>(r7, r1, r6, r6)
            r2.f10604h = r3
            goto L_0x029e
        L_0x0083:
            m6.e$d r1 = r0.f10592w
            byte[] r4 = new byte[r2]
            r1.f10603g = r4
            r3.readFully(r4, r6, r2)
            goto L_0x029e
        L_0x008e:
            int r4 = r0.H
            r8 = 8
            if (r4 != 0) goto L_0x00b3
            m6.g r4 = r0.f10574e
            long r9 = r4.d(r3, r6, r7, r8)
            int r4 = (int) r9
            r0.N = r4
            m6.g r4 = r0.f10574e
            int r4 = r4.b()
            r0.O = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.J = r9
            r0.H = r7
            w7.w r4 = r0.f10579j
            r4.L()
        L_0x00b3:
            android.util.SparseArray<m6.e$d> r4 = r0.f10575f
            int r9 = r0.N
            java.lang.Object r4 = r4.get(r9)
            m6.e$d r4 = (m6.e.d) r4
            if (r4 != 0) goto L_0x00c9
            int r1 = r0.O
            int r1 = r2 - r1
            r3.i(r1)
            r0.H = r6
            return
        L_0x00c9:
            int r9 = r0.H
            if (r9 != r7) goto L_0x026d
            r9 = 3
            r0.v(r3, r9)
            w7.w r10 = r0.f10579j
            byte[] r10 = r10.f14880a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r7
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00f2
            r0.L = r7
            int[] r10 = r0.M
            int[] r10 = n(r10, r7)
            r0.M = r10
            int r13 = r0.O
            int r2 = r2 - r13
            int r2 = r2 - r9
            r10[r6] = r2
        L_0x00ef:
            r6 = r7
            goto L_0x0204
        L_0x00f2:
            if (r1 != r5) goto L_0x0265
            r13 = 4
            r0.v(r3, r13)
            w7.w r14 = r0.f10579j
            byte[] r14 = r14.f14880a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r7
            r0.L = r14
            int[] r15 = r0.M
            int[] r14 = n(r15, r14)
            r0.M = r14
            if (r10 != r11) goto L_0x0117
            int r9 = r0.O
            int r2 = r2 - r9
            int r2 = r2 - r13
            int r9 = r0.L
            int r2 = r2 / r9
            java.util.Arrays.fill(r14, r6, r9, r2)
            goto L_0x00ef
        L_0x0117:
            if (r10 != r7) goto L_0x014c
            r9 = r6
            r10 = r9
        L_0x011b:
            int r14 = r0.L
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x0141
            int[] r14 = r0.M
            r14[r9] = r6
        L_0x0125:
            int r13 = r13 + r7
            r0.v(r3, r13)
            w7.w r14 = r0.f10579j
            byte[] r14 = r14.f14880a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.M
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0125
            int r10 = r10 + r16
            int r9 = r9 + 1
            goto L_0x011b
        L_0x0141:
            int[] r9 = r0.M
            int r14 = r14 - r7
            int r15 = r0.O
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x00ef
        L_0x014c:
            if (r10 != r9) goto L_0x024e
            r9 = r6
            r10 = r9
        L_0x0150:
            int r14 = r0.L
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x01f9
            int[] r14 = r0.M
            r14[r9] = r6
            int r13 = r13 + 1
            r0.v(r3, r13)
            w7.w r14 = r0.f10579j
            byte[] r14 = r14.f14880a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f1
            r16 = 0
            r14 = r6
        L_0x016c:
            if (r14 >= r8) goto L_0x01c0
            int r18 = 7 - r14
            int r5 = r7 << r18
            w7.w r11 = r0.f10579j
            byte[] r11 = r11.f14880a
            byte r11 = r11[r15]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b6
            int r13 = r13 + r14
            r0.v(r3, r13)
            w7.w r11 = r0.f10579j
            byte[] r11 = r11.f14880a
            int r16 = r15 + 1
            byte r11 = r11[r15]
            r11 = r11 & r12
            int r5 = ~r5
            r5 = r5 & r11
            long r6 = (long) r5
            r5 = r16
            r16 = r6
        L_0x018f:
            if (r5 >= r13) goto L_0x01a8
            long r6 = r16 << r8
            w7.w r15 = r0.f10579j
            byte[] r15 = r15.f14880a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r12
            long r11 = (long) r5
            long r5 = r6 | r11
            r12 = 255(0xff, float:3.57E-43)
            r19 = r5
            r5 = r16
            r16 = r19
            goto L_0x018f
        L_0x01a8:
            if (r9 <= 0) goto L_0x01c0
            int r14 = r14 * 7
            int r14 = r14 + 6
            r5 = 1
            long r11 = r5 << r14
            long r11 = r11 - r5
            long r16 = r16 - r11
            goto L_0x01c0
        L_0x01b6:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x016c
        L_0x01c0:
            r5 = r16
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01e9
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01e9
            int r5 = (int) r5
            int[] r6 = r0.M
            if (r9 != 0) goto L_0x01d6
            goto L_0x01db
        L_0x01d6:
            int r7 = r9 + -1
            r7 = r6[r7]
            int r5 = r5 + r7
        L_0x01db:
            r6[r9] = r5
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0150
        L_0x01e9:
            b6.j0 r1 = new b6.j0
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01f1:
            b6.j0 r1 = new b6.j0
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01f9:
            int[] r5 = r0.M
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.O
            int r2 = r2 - r7
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0204:
            w7.w r2 = r0.f10579j
            byte[] r2 = r2.f14880a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.D
            long r9 = (long) r2
            long r9 = r0.z(r9)
            long r5 = r5 + r9
            r0.I = r5
            w7.w r2 = r0.f10579j
            byte[] r2 = r2.f14880a
            r5 = 2
            byte r2 = r2[r5]
            r6 = r2 & 8
            if (r6 != r8) goto L_0x022a
            r6 = 1
            goto L_0x022b
        L_0x022a:
            r6 = 0
        L_0x022b:
            int r7 = r4.f10600d
            if (r7 == r5) goto L_0x023b
            r5 = 163(0xa3, float:2.28E-43)
            if (r1 != r5) goto L_0x0239
            r5 = 128(0x80, float:1.794E-43)
            r2 = r2 & r5
            if (r2 != r5) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r2 = 0
            goto L_0x023c
        L_0x023b:
            r2 = 1
        L_0x023c:
            if (r6 == 0) goto L_0x0241
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0242
        L_0x0241:
            r5 = 0
        L_0x0242:
            r2 = r2 | r5
            r0.P = r2
            r2 = 2
            r0.H = r2
            r2 = 0
            r0.K = r2
            r2 = 163(0xa3, float:2.28E-43)
            goto L_0x026e
        L_0x024e:
            b6.j0 r1 = new b6.j0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected lacing value: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0265:
            b6.j0 r1 = new b6.j0
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x026d:
            r2 = r5
        L_0x026e:
            if (r1 != r2) goto L_0x0296
        L_0x0270:
            int r1 = r0.K
            int r2 = r0.L
            if (r1 >= r2) goto L_0x0292
            int[] r2 = r0.M
            r1 = r2[r1]
            r0.D(r3, r4, r1)
            long r1 = r0.I
            int r5 = r0.K
            int r6 = r4.f10601e
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.k(r4, r1)
            int r1 = r0.K
            r2 = 1
            int r1 = r1 + r2
            r0.K = r1
            goto L_0x0270
        L_0x0292:
            r1 = 0
            r0.H = r1
            goto L_0x029e
        L_0x0296:
            r1 = 0
            int[] r2 = r0.M
            r1 = r2[r1]
            r0.D(r3, r4, r1)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.e.i(int, int, j6.j):void");
    }

    public final j6.q j() {
        w7.q qVar;
        w7.q qVar2;
        if (this.f10588s == -1 || this.f10591v == b6.c.f4201b || (qVar = this.E) == null || qVar.c() == 0 || (qVar2 = this.F) == null || qVar2.c() != this.E.c()) {
            this.E = null;
            this.F = null;
            return new q.b(this.f10591v);
        }
        int c10 = this.E.c();
        int[] iArr = new int[c10];
        long[] jArr = new long[c10];
        long[] jArr2 = new long[c10];
        long[] jArr3 = new long[c10];
        int i10 = 0;
        for (int i11 = 0; i11 < c10; i11++) {
            jArr3[i11] = this.E.b(i11);
            jArr[i11] = this.f10588s + this.F.b(i11);
        }
        while (true) {
            int i12 = c10 - 1;
            if (i10 < i12) {
                int i13 = i10 + 1;
                iArr[i10] = (int) (jArr[i13] - jArr[i10]);
                jArr2[i10] = jArr3[i13] - jArr3[i10];
                i10 = i13;
            } else {
                iArr[i12] = (int) ((this.f10588s + this.f10587r) - jArr[i12]);
                jArr2[i12] = this.f10591v - jArr3[i12];
                this.E = null;
                this.F = null;
                return new j6.c(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    public final void k(d dVar, long j10) {
        d dVar2 = dVar;
        C0184e eVar = dVar2.Q;
        long j11 = j10;
        if (eVar != null) {
            eVar.c(dVar2, j11);
        } else {
            if (K0.equals(dVar2.f10598b)) {
                l(dVar, K2, 19, 1000, I2);
            } else if (L0.equals(dVar2.f10598b)) {
                l(dVar, Q2, 21, 10000, P2);
            }
            dVar2.U.c(j10, this.P, this.Y, 0, dVar2.f10604h);
        }
        this.Z = true;
        y();
    }

    public final void l(d dVar, String str, int i10, long j10, byte[] bArr) {
        A(this.f10583n.f14880a, this.J, str, i10, j10, bArr);
        s sVar = dVar.U;
        w wVar = this.f10583n;
        sVar.a(wVar, wVar.d());
        this.Y += this.f10583n.d();
    }

    @d.i
    public void m(int i10) throws j0 {
        if (i10 != 160) {
            if (i10 == 174) {
                if (r(this.f10592w.f10598b)) {
                    d dVar = this.f10592w;
                    dVar.c(this.f10572b0, dVar.f10599c);
                    SparseArray<d> sparseArray = this.f10575f;
                    d dVar2 = this.f10592w;
                    sparseArray.put(dVar2.f10599c, dVar2);
                }
                this.f10592w = null;
            } else if (i10 == 19899) {
                int i11 = this.f10594y;
                if (i11 != -1) {
                    long j10 = this.f10595z;
                    if (j10 != -1) {
                        if (i11 == 475249515) {
                            this.B = j10;
                            return;
                        }
                        return;
                    }
                }
                throw new j0("Mandatory element SeekID or SeekPosition not found");
            } else if (i10 == 25152) {
                d dVar3 = this.f10592w;
                if (!dVar3.f10602f) {
                    return;
                }
                if (dVar3.f10604h != null) {
                    dVar3.f10606j = new DrmInitData(new DrmInitData.SchemeData(b6.c.f4291x1, w7.s.f14809f, this.f10592w.f10604h.f9619b));
                    return;
                }
                throw new j0("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i10 == 28032) {
                d dVar4 = this.f10592w;
                if (dVar4.f10602f && dVar4.f10603g != null) {
                    throw new j0("Combining encryption and compression is not supported");
                }
            } else if (i10 == 357149030) {
                if (this.f10589t == b6.c.f4201b) {
                    this.f10589t = 1000000;
                }
                long j11 = this.f10590u;
                if (j11 != b6.c.f4201b) {
                    this.f10591v = z(j11);
                }
            } else if (i10 != 374648427) {
                if (i10 == 475249515 && !this.f10593x) {
                    this.f10572b0.q(j());
                    this.f10593x = true;
                }
            } else if (this.f10575f.size() != 0) {
                this.f10572b0.r();
            } else {
                throw new j0("No valid tracks were found");
            }
        } else if (this.H == 2) {
            if (!this.f10571a0) {
                this.P |= 1;
            }
            k(this.f10575f.get(this.N), this.I);
            this.H = 0;
        }
    }

    @d.i
    public void o(int i10, double d10) throws j0 {
        if (i10 == 181) {
            this.f10592w.N = (int) d10;
        } else if (i10 != 17545) {
            switch (i10) {
                case f10540p2 /*21969*/:
                    this.f10592w.B = (float) d10;
                    return;
                case f10543q2 /*21970*/:
                    this.f10592w.C = (float) d10;
                    return;
                case f10546r2 /*21971*/:
                    this.f10592w.D = (float) d10;
                    return;
                case f10549s2 /*21972*/:
                    this.f10592w.E = (float) d10;
                    return;
                case f10552t2 /*21973*/:
                    this.f10592w.F = (float) d10;
                    return;
                case f10555u2 /*21974*/:
                    this.f10592w.G = (float) d10;
                    return;
                case f10558v2 /*21975*/:
                    this.f10592w.H = (float) d10;
                    return;
                case f10561w2 /*21976*/:
                    this.f10592w.I = (float) d10;
                    return;
                case f10564x2 /*21977*/:
                    this.f10592w.J = (float) d10;
                    return;
                case f10567y2 /*21978*/:
                    this.f10592w.K = (float) d10;
                    return;
                default:
                    switch (i10) {
                        case f10507e2 /*30323*/:
                            this.f10592w.f10613q = (float) d10;
                            return;
                        case f10510f2 /*30324*/:
                            this.f10592w.f10614r = (float) d10;
                            return;
                        case f10513g2 /*30325*/:
                            this.f10592w.f10615s = (float) d10;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f10590u = (long) d10;
        }
    }

    @d.i
    public int p(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case O1 /*16980*/:
            case W0 /*17029*/:
            case U0 /*17143*/:
            case R1 /*18401*/:
            case U1 /*18408*/:
            case L1 /*20529*/:
            case M1 /*20530*/:
            case f10500c1 /*21420*/:
            case f10516h2 /*21432*/:
            case C1 /*21680*/:
            case E1 /*21682*/:
            case D1 /*21690*/:
            case f10548s1 /*21930*/:
            case f10522j2 /*21945*/:
            case f10525k2 /*21946*/:
            case f10528l2 /*21947*/:
            case f10531m2 /*21948*/:
            case f10534n2 /*21949*/:
            case f10563x1 /*22186*/:
            case f10566y1 /*22203*/:
            case H1 /*25188*/:
            case f10501c2 /*30321*/:
            case f10551t1 /*2352003*/:
            case f10506e1 /*2807729*/:
                return 2;
            case 134:
            case V0 /*17026*/:
            case f10554u1 /*21358*/:
            case f10496a2 /*2274716*/:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case T1 /*18407*/:
            case f10495a1 /*19899*/:
            case N1 /*20532*/:
            case Q1 /*20533*/:
            case f10519i2 /*21936*/:
            case f10537o2 /*21968*/:
            case K1 /*25152*/:
            case J1 /*28032*/:
            case f10498b2 /*30320*/:
            case Z0 /*290298740*/:
            case 357149030:
            case f10533n1 /*374648427*/:
            case X0 /*408125543*/:
            case 440786851:
            case V1 /*475249515*/:
            case f10512g1 /*524531317*/:
                return 1;
            case 161:
            case 163:
            case P1 /*16981*/:
            case S1 /*18402*/:
            case f10497b1 /*21419*/:
            case f10560w1 /*25506*/:
            case f10504d2 /*30322*/:
                return 4;
            case 181:
            case f10509f1 /*17545*/:
            case f10540p2 /*21969*/:
            case f10543q2 /*21970*/:
            case f10546r2 /*21971*/:
            case f10549s2 /*21972*/:
            case f10552t2 /*21973*/:
            case f10555u2 /*21974*/:
            case f10558v2 /*21975*/:
            case f10561w2 /*21976*/:
            case f10564x2 /*21977*/:
            case f10567y2 /*21978*/:
            case f10507e2 /*30323*/:
            case f10510f2 /*30324*/:
            case f10513g2 /*30325*/:
                return 5;
            default:
                return 0;
        }
    }

    @d.i
    public void q(int i10, long j10) throws j0 {
        if (i10 != 20529) {
            if (i10 != 20530) {
                boolean z10 = false;
                switch (i10) {
                    case 131:
                        this.f10592w.f10600d = (int) j10;
                        return;
                    case 136:
                        d dVar = this.f10592w;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        dVar.S = z10;
                        return;
                    case 155:
                        this.J = z(j10);
                        return;
                    case 159:
                        this.f10592w.L = (int) j10;
                        return;
                    case 176:
                        this.f10592w.f10607k = (int) j10;
                        return;
                    case 179:
                        this.E.a(z(j10));
                        return;
                    case 186:
                        this.f10592w.f10608l = (int) j10;
                        return;
                    case 215:
                        this.f10592w.f10599c = (int) j10;
                        return;
                    case 231:
                        this.D = z(j10);
                        return;
                    case 241:
                        if (!this.G) {
                            this.F.a(j10);
                            this.G = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f10571a0 = true;
                        return;
                    case O1 /*16980*/:
                        if (j10 != 3) {
                            throw new j0("ContentCompAlgo " + j10 + " not supported");
                        }
                        return;
                    case W0 /*17029*/:
                        if (j10 < 1 || j10 > 2) {
                            throw new j0("DocTypeReadVersion " + j10 + " not supported");
                        }
                        return;
                    case U0 /*17143*/:
                        if (j10 != 1) {
                            throw new j0("EBMLReadVersion " + j10 + " not supported");
                        }
                        return;
                    case R1 /*18401*/:
                        if (j10 != 5) {
                            throw new j0("ContentEncAlgo " + j10 + " not supported");
                        }
                        return;
                    case U1 /*18408*/:
                        if (j10 != 1) {
                            throw new j0("AESSettingsCipherMode " + j10 + " not supported");
                        }
                        return;
                    case f10500c1 /*21420*/:
                        this.f10595z = j10 + this.f10588s;
                        return;
                    case f10516h2 /*21432*/:
                        int i11 = (int) j10;
                        if (i11 == 0) {
                            this.f10592w.f10617u = 0;
                            return;
                        } else if (i11 == 1) {
                            this.f10592w.f10617u = 2;
                            return;
                        } else if (i11 == 3) {
                            this.f10592w.f10617u = 1;
                            return;
                        } else if (i11 == 15) {
                            this.f10592w.f10617u = 3;
                            return;
                        } else {
                            return;
                        }
                    case C1 /*21680*/:
                        this.f10592w.f10609m = (int) j10;
                        return;
                    case E1 /*21682*/:
                        this.f10592w.f10611o = (int) j10;
                        return;
                    case D1 /*21690*/:
                        this.f10592w.f10610n = (int) j10;
                        return;
                    case f10548s1 /*21930*/:
                        d dVar2 = this.f10592w;
                        if (j10 == 1) {
                            z10 = true;
                        }
                        dVar2.R = z10;
                        return;
                    case f10563x1 /*22186*/:
                        this.f10592w.O = j10;
                        return;
                    case f10566y1 /*22203*/:
                        this.f10592w.P = j10;
                        return;
                    case H1 /*25188*/:
                        this.f10592w.M = (int) j10;
                        return;
                    case f10501c2 /*30321*/:
                        int i12 = (int) j10;
                        if (i12 == 0) {
                            this.f10592w.f10612p = 0;
                            return;
                        } else if (i12 == 1) {
                            this.f10592w.f10612p = 1;
                            return;
                        } else if (i12 == 2) {
                            this.f10592w.f10612p = 2;
                            return;
                        } else if (i12 == 3) {
                            this.f10592w.f10612p = 3;
                            return;
                        } else {
                            return;
                        }
                    case f10551t1 /*2352003*/:
                        this.f10592w.f10601e = (int) j10;
                        return;
                    case f10506e1 /*2807729*/:
                        this.f10589t = j10;
                        return;
                    default:
                        switch (i10) {
                            case f10522j2 /*21945*/:
                                int i13 = (int) j10;
                                if (i13 == 1) {
                                    this.f10592w.f10621y = 2;
                                    return;
                                } else if (i13 == 2) {
                                    this.f10592w.f10621y = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case f10525k2 /*21946*/:
                                int i14 = (int) j10;
                                if (i14 != 1) {
                                    if (i14 == 16) {
                                        this.f10592w.f10620x = 6;
                                        return;
                                    } else if (i14 == 18) {
                                        this.f10592w.f10620x = 7;
                                        return;
                                    } else if (!(i14 == 6 || i14 == 7)) {
                                        return;
                                    }
                                }
                                this.f10592w.f10620x = 3;
                                return;
                            case f10528l2 /*21947*/:
                                d dVar3 = this.f10592w;
                                dVar3.f10618v = true;
                                int i15 = (int) j10;
                                if (i15 == 1) {
                                    dVar3.f10619w = 1;
                                    return;
                                } else if (i15 == 9) {
                                    dVar3.f10619w = 6;
                                    return;
                                } else if (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) {
                                    dVar3.f10619w = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case f10531m2 /*21948*/:
                                this.f10592w.f10622z = (int) j10;
                                return;
                            case f10534n2 /*21949*/:
                                this.f10592w.A = (int) j10;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j10 != 1) {
                throw new j0("ContentEncodingScope " + j10 + " not supported");
            }
        } else if (j10 != 0) {
            throw new j0("ContentEncodingOrder " + j10 + " not supported");
        }
    }

    @d.i
    public boolean s(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final boolean u(j6.p pVar, long j10) {
        if (this.A) {
            this.C = j10;
            pVar.f9610a = this.B;
            this.A = false;
            return true;
        }
        if (this.f10593x) {
            long j11 = this.C;
            if (j11 != -1) {
                pVar.f9610a = j11;
                this.C = -1;
                return true;
            }
        }
        return false;
    }

    public final void v(j jVar, int i10) throws IOException, InterruptedException {
        if (this.f10579j.d() < i10) {
            if (this.f10579j.b() < i10) {
                w wVar = this.f10579j;
                byte[] bArr = wVar.f14880a;
                wVar.O(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10)), this.f10579j.d());
            }
            w wVar2 = this.f10579j;
            jVar.readFully(wVar2.f14880a, wVar2.d(), i10 - this.f10579j.d());
            this.f10579j.P(i10);
        }
    }

    public final int w(j jVar, s sVar, int i10) throws IOException, InterruptedException {
        int i11;
        int a10 = this.f10582m.a();
        if (a10 > 0) {
            i11 = Math.min(i10, a10);
            sVar.a(this.f10582m, i11);
        } else {
            i11 = sVar.b(jVar, i10, false);
        }
        this.Q += i11;
        this.Y += i11;
        return i11;
    }

    public final void x(j jVar, byte[] bArr, int i10, int i11) throws IOException, InterruptedException {
        int min = Math.min(i11, this.f10582m.a());
        jVar.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f10582m.i(bArr, i10, min);
        }
        this.Q += i11;
    }

    public final void y() {
        this.Q = 0;
        this.Y = 0;
        this.X = 0;
        this.R = false;
        this.S = false;
        this.U = false;
        this.W = 0;
        this.V = 0;
        this.T = false;
        this.f10582m.L();
    }

    public final long z(long j10) throws j0 {
        long j11 = this.f10589t;
        if (j11 != b6.c.f4201b) {
            return q0.L0(j10, j11, 1000);
        }
        throw new j0("Can't scale timecode prior to timecodeScale being set.");
    }
}
