package o6;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import j6.i;
import j6.j;
import j6.k;
import j6.l;
import j6.q;
import j6.s;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o6.a;
import w7.j0;
import w7.p;
import w7.q0;
import w7.s;
import w7.t;
import w7.w;

public class f implements i {
    public static final l M = new e();
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 4;
    public static final int Q = 8;
    public static final int R = 16;
    public static final String S = "FragmentedMp4Extractor";
    public static final int T = q0.T("seig");
    public static final byte[] U = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format V = Format.v((String) null, s.f14824m0, Long.MAX_VALUE);
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2;
    public static final int Z = 3;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f11186a0 = 4;
    public long A;
    public long B;
    public c C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public k I;
    public j6.s[] J;
    public j6.s[] K;
    public boolean L;

    /* renamed from: d  reason: collision with root package name */
    public final int f11187d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final l f11188e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Format> f11189f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final DrmInitData f11190g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray<c> f11191h;

    /* renamed from: i  reason: collision with root package name */
    public final w f11192i;

    /* renamed from: j  reason: collision with root package name */
    public final w f11193j;

    /* renamed from: k  reason: collision with root package name */
    public final w f11194k;

    /* renamed from: l  reason: collision with root package name */
    public final byte[] f11195l;

    /* renamed from: m  reason: collision with root package name */
    public final w f11196m;
    @o0

    /* renamed from: n  reason: collision with root package name */
    public final j0 f11197n;

    /* renamed from: o  reason: collision with root package name */
    public final w f11198o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayDeque<a.C0192a> f11199p;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayDeque<b> f11200q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public final j6.s f11201r;

    /* renamed from: s  reason: collision with root package name */
    public int f11202s;

    /* renamed from: t  reason: collision with root package name */
    public int f11203t;

    /* renamed from: u  reason: collision with root package name */
    public long f11204u;

    /* renamed from: v  reason: collision with root package name */
    public int f11205v;

    /* renamed from: w  reason: collision with root package name */
    public w f11206w;

    /* renamed from: x  reason: collision with root package name */
    public long f11207x;

    /* renamed from: y  reason: collision with root package name */
    public int f11208y;

    /* renamed from: z  reason: collision with root package name */
    public long f11209z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f11210a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11211b;

        public b(long j10, int i10) {
            this.f11210a = j10;
            this.f11211b = i10;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final j6.s f11212a;

        /* renamed from: b  reason: collision with root package name */
        public final n f11213b = new n();

        /* renamed from: c  reason: collision with root package name */
        public l f11214c;

        /* renamed from: d  reason: collision with root package name */
        public c f11215d;

        /* renamed from: e  reason: collision with root package name */
        public int f11216e;

        /* renamed from: f  reason: collision with root package name */
        public int f11217f;

        /* renamed from: g  reason: collision with root package name */
        public int f11218g;

        /* renamed from: h  reason: collision with root package name */
        public int f11219h;

        /* renamed from: i  reason: collision with root package name */
        public final w f11220i = new w(1);

        /* renamed from: j  reason: collision with root package name */
        public final w f11221j = new w();

        public c(j6.s sVar) {
            this.f11212a = sVar;
        }

        public final m c() {
            n nVar = this.f11213b;
            int i10 = nVar.f11300a.f11175a;
            m mVar = nVar.f11314o;
            if (mVar == null) {
                mVar = this.f11214c.b(i10);
            }
            if (mVar == null || !mVar.f11295a) {
                return null;
            }
            return mVar;
        }

        public void d(l lVar, c cVar) {
            this.f11214c = (l) w7.a.g(lVar);
            this.f11215d = (c) w7.a.g(cVar);
            this.f11212a.d(lVar.f11288f);
            g();
        }

        public boolean e() {
            this.f11216e++;
            int i10 = this.f11217f + 1;
            this.f11217f = i10;
            int[] iArr = this.f11213b.f11307h;
            int i11 = this.f11218g;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f11218g = i11 + 1;
            this.f11217f = 0;
            return false;
        }

        public int f() {
            w wVar;
            m c10 = c();
            if (c10 == null) {
                return 0;
            }
            int i10 = c10.f11298d;
            if (i10 != 0) {
                wVar = this.f11213b.f11316q;
            } else {
                byte[] bArr = c10.f11299e;
                this.f11221j.O(bArr, bArr.length);
                w wVar2 = this.f11221j;
                i10 = bArr.length;
                wVar = wVar2;
            }
            boolean g10 = this.f11213b.g(this.f11216e);
            w wVar3 = this.f11220i;
            wVar3.f14880a[0] = (byte) ((g10 ? 128 : 0) | i10);
            wVar3.Q(0);
            this.f11212a.a(this.f11220i, 1);
            this.f11212a.a(wVar, i10);
            if (!g10) {
                return i10 + 1;
            }
            w wVar4 = this.f11213b.f11316q;
            int J = wVar4.J();
            wVar4.R(-2);
            int i11 = (J * 6) + 2;
            this.f11212a.a(wVar4, i11);
            return i10 + 1 + i11;
        }

        public void g() {
            this.f11213b.f();
            this.f11216e = 0;
            this.f11218g = 0;
            this.f11217f = 0;
            this.f11219h = 0;
        }

        public void h(long j10) {
            long c10 = b6.c.c(j10);
            int i10 = this.f11216e;
            while (true) {
                n nVar = this.f11213b;
                if (i10 < nVar.f11305f && nVar.c(i10) < c10) {
                    if (this.f11213b.f11311l[i10]) {
                        this.f11219h = i10;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        public final void i() {
            m c10 = c();
            if (c10 != null) {
                w wVar = this.f11213b.f11316q;
                int i10 = c10.f11298d;
                if (i10 != 0) {
                    wVar.R(i10);
                }
                if (this.f11213b.g(this.f11216e)) {
                    wVar.R(wVar.J() * 6);
                }
            }
        }

        public void j(DrmInitData drmInitData) {
            m b10 = this.f11214c.b(this.f11213b.f11300a.f11175a);
            this.f11212a.d(this.f11214c.f11288f.c(drmInitData.c(b10 != null ? b10.f11296b : null)));
        }
    }

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, (j0) null);
    }

    public f(int i10, @o0 j0 j0Var) {
        this(i10, j0Var, (l) null, (DrmInitData) null);
    }

    public f(int i10, @o0 j0 j0Var, @o0 l lVar, @o0 DrmInitData drmInitData) {
        this(i10, j0Var, lVar, drmInitData, Collections.emptyList());
    }

    public f(int i10, @o0 j0 j0Var, @o0 l lVar, @o0 DrmInitData drmInitData, List<Format> list) {
        this(i10, j0Var, lVar, drmInitData, list, (j6.s) null);
    }

    public f(int i10, @o0 j0 j0Var, @o0 l lVar, @o0 DrmInitData drmInitData, List<Format> list, @o0 j6.s sVar) {
        this.f11187d = i10 | (lVar != null ? 8 : 0);
        this.f11197n = j0Var;
        this.f11188e = lVar;
        this.f11190g = drmInitData;
        this.f11189f = Collections.unmodifiableList(list);
        this.f11201r = sVar;
        this.f11198o = new w(16);
        this.f11192i = new w(t.f14846b);
        this.f11193j = new w(5);
        this.f11194k = new w();
        byte[] bArr = new byte[16];
        this.f11195l = bArr;
        this.f11196m = new w(bArr);
        this.f11199p = new ArrayDeque<>();
        this.f11200q = new ArrayDeque<>();
        this.f11191h = new SparseArray<>();
        this.A = b6.c.f4201b;
        this.f11209z = b6.c.f4201b;
        this.B = b6.c.f4201b;
        d();
    }

    public static void A(w wVar, w wVar2, String str, n nVar) throws b6.j0 {
        byte[] bArr;
        w wVar3 = wVar;
        w wVar4 = wVar2;
        n nVar2 = nVar;
        wVar3.Q(8);
        int l10 = wVar.l();
        int l11 = wVar.l();
        int i10 = T;
        if (l11 == i10) {
            if (a.c(l10) == 1) {
                wVar3.R(4);
            }
            if (wVar.l() == 1) {
                wVar4.Q(8);
                int l12 = wVar2.l();
                if (wVar2.l() == i10) {
                    int c10 = a.c(l12);
                    if (c10 == 1) {
                        if (wVar2.F() == 0) {
                            throw new b6.j0("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c10 >= 2) {
                        wVar4.R(4);
                    }
                    if (wVar2.F() == 1) {
                        wVar4.R(1);
                        int D2 = wVar2.D();
                        int i11 = (D2 & 240) >> 4;
                        int i12 = D2 & 15;
                        boolean z10 = wVar2.D() == 1;
                        if (z10) {
                            int D3 = wVar2.D();
                            byte[] bArr2 = new byte[16];
                            wVar4.i(bArr2, 0, 16);
                            if (D3 == 0) {
                                int D4 = wVar2.D();
                                byte[] bArr3 = new byte[D4];
                                wVar4.i(bArr3, 0, D4);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            nVar2.f11312m = true;
                            nVar2.f11314o = new m(z10, str, D3, bArr2, i11, i12, bArr);
                            return;
                        }
                        return;
                    }
                    throw new b6.j0("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new b6.j0("Entry count in sbgp != 1 (unsupported).");
        }
    }

    public static Pair<Long, j6.c> B(w wVar, long j10) throws b6.j0 {
        long j11;
        long j12;
        w wVar2 = wVar;
        wVar2.Q(8);
        int c10 = a.c(wVar.l());
        wVar2.R(4);
        long F2 = wVar.F();
        if (c10 == 0) {
            j12 = wVar.F();
            j11 = wVar.F();
        } else {
            j12 = wVar.I();
            j11 = wVar.I();
        }
        long j13 = j12;
        long j14 = j10 + j11;
        long L0 = q0.L0(j13, 1000000, F2);
        wVar2.R(2);
        int J2 = wVar.J();
        int[] iArr = new int[J2];
        long[] jArr = new long[J2];
        long[] jArr2 = new long[J2];
        long[] jArr3 = new long[J2];
        long j15 = L0;
        long j16 = j13;
        int i10 = 0;
        long j17 = j16;
        while (i10 < J2) {
            int l10 = wVar.l();
            if ((l10 & Integer.MIN_VALUE) == 0) {
                long F3 = wVar.F();
                iArr[i10] = l10 & Integer.MAX_VALUE;
                jArr[i10] = j14;
                jArr3[i10] = j15;
                long j18 = j17 + F3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i11 = J2;
                int[] iArr2 = iArr;
                long L02 = q0.L0(j18, 1000000, F2);
                jArr4[i10] = L02 - jArr5[i10];
                wVar2.R(4);
                j14 += (long) iArr2[i10];
                i10++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr;
                J2 = i11;
                long j19 = L02;
                j17 = j18;
                j15 = j19;
            } else {
                throw new b6.j0("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(L0), new j6.c(iArr, jArr, jArr2, jArr3));
    }

    public static long C(w wVar) {
        wVar.Q(8);
        return a.c(wVar.l()) == 1 ? wVar.I() : wVar.F();
    }

    public static c D(w wVar, SparseArray<c> sparseArray) {
        wVar.Q(8);
        int b10 = a.b(wVar.l());
        c k10 = k(sparseArray, wVar.l());
        if (k10 == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long I2 = wVar.I();
            n nVar = k10.f11213b;
            nVar.f11302c = I2;
            nVar.f11303d = I2;
        }
        c cVar = k10.f11215d;
        k10.f11213b.f11300a = new c((b10 & 2) != 0 ? wVar.H() - 1 : cVar.f11175a, (b10 & 8) != 0 ? wVar.H() : cVar.f11176b, (b10 & 16) != 0 ? wVar.H() : cVar.f11177c, (b10 & 32) != 0 ? wVar.H() : cVar.f11178d);
        return k10;
    }

    public static void E(a.C0192a aVar, SparseArray<c> sparseArray, int i10, byte[] bArr) throws b6.j0 {
        c D2 = D(aVar.h(a.S).f11138m1, sparseArray);
        if (D2 != null) {
            n nVar = D2.f11213b;
            long j10 = nVar.f11318s;
            D2.g();
            int i11 = a.R;
            if (aVar.h(i11) != null && (i10 & 2) == 0) {
                j10 = C(aVar.h(i11).f11138m1);
            }
            H(aVar, D2, j10, i10);
            m b10 = D2.f11214c.b(nVar.f11300a.f11175a);
            a.b h10 = aVar.h(a.f11125v0);
            if (h10 != null) {
                x(b10, h10.f11138m1, nVar);
            }
            a.b h11 = aVar.h(a.f11127w0);
            if (h11 != null) {
                w(h11.f11138m1, nVar);
            }
            a.b h12 = aVar.h(a.A0);
            if (h12 != null) {
                z(h12.f11138m1, nVar);
            }
            a.b h13 = aVar.h(a.f11129x0);
            a.b h14 = aVar.h(a.f11131y0);
            if (!(h13 == null || h14 == null)) {
                A(h13.f11138m1, h14.f11138m1, b10 != null ? b10.f11296b : null, nVar);
            }
            int size = aVar.f11136n1.size();
            for (int i12 = 0; i12 < size; i12++) {
                a.b bVar = aVar.f11136n1.get(i12);
                if (bVar.f11134a == a.f11133z0) {
                    I(bVar.f11138m1, nVar, bArr);
                }
            }
        }
    }

    public static Pair<Integer, c> F(w wVar) {
        wVar.Q(12);
        return Pair.create(Integer.valueOf(wVar.l()), new c(wVar.H() - 1, wVar.H(), wVar.H(), wVar.l()));
    }

    public static int G(c cVar, int i10, long j10, int i11, w wVar, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        c cVar2 = cVar;
        wVar.Q(8);
        int b10 = a.b(wVar.l());
        l lVar = cVar2.f11214c;
        n nVar = cVar2.f11213b;
        c cVar3 = nVar.f11300a;
        nVar.f11307h[i10] = wVar.H();
        long[] jArr = nVar.f11306g;
        long j11 = nVar.f11302c;
        jArr[i10] = j11;
        if ((b10 & 1) != 0) {
            jArr[i10] = j11 + ((long) wVar.l());
        }
        boolean z15 = (b10 & 4) != 0;
        int i15 = cVar3.f11178d;
        if (z15) {
            i15 = wVar.H();
        }
        boolean z16 = (b10 & 256) != 0;
        boolean z17 = (b10 & 512) != 0;
        boolean z18 = (b10 & 1024) != 0;
        boolean z19 = (b10 & 2048) != 0;
        long[] jArr2 = lVar.f11290h;
        long j12 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j12 = q0.L0(lVar.f11291i[0], 1000, lVar.f11285c);
        }
        int[] iArr = nVar.f11308i;
        int[] iArr2 = nVar.f11309j;
        long[] jArr3 = nVar.f11310k;
        boolean[] zArr = nVar.f11311l;
        int i16 = i15;
        boolean z20 = lVar.f11284b == 2 && (i11 & 1) != 0;
        int i17 = i12 + nVar.f11307h[i10];
        long j13 = lVar.f11285c;
        long j14 = j12;
        boolean[] zArr2 = zArr;
        long j15 = i10 > 0 ? nVar.f11318s : j10;
        int i18 = i12;
        while (i18 < i17) {
            int H2 = z16 ? wVar.H() : cVar3.f11176b;
            if (z17) {
                z10 = z16;
                i13 = wVar.H();
            } else {
                z10 = z16;
                i13 = cVar3.f11177c;
            }
            if (i18 == 0 && z15) {
                z11 = z15;
                i14 = i16;
            } else if (z18) {
                z11 = z15;
                i14 = wVar.l();
            } else {
                z11 = z15;
                i14 = cVar3.f11178d;
            }
            boolean z21 = z19;
            if (z19) {
                z13 = z17;
                z12 = z18;
                iArr2[i18] = (int) ((((long) wVar.l()) * 1000) / j13);
                z14 = false;
            } else {
                z13 = z17;
                z12 = z18;
                z14 = false;
                iArr2[i18] = 0;
            }
            jArr3[i18] = q0.L0(j15, 1000, j13) - j14;
            iArr[i18] = i13;
            zArr2[i18] = (((i14 >> 16) & 1) != 0 || (z20 && i18 != 0)) ? z14 : true;
            i18++;
            j15 += (long) H2;
            j13 = j13;
            z16 = z10;
            z15 = z11;
            z19 = z21;
            z17 = z13;
            z18 = z12;
        }
        nVar.f11318s = j15;
        return i17;
    }

    public static void H(a.C0192a aVar, c cVar, long j10, int i10) {
        List<a.b> list = aVar.f11136n1;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = list.get(i13);
            if (bVar.f11134a == a.U) {
                w wVar = bVar.f11138m1;
                wVar.Q(12);
                int H2 = wVar.H();
                if (H2 > 0) {
                    i12 += H2;
                    i11++;
                }
            }
        }
        cVar.f11218g = 0;
        cVar.f11217f = 0;
        cVar.f11216e = 0;
        cVar.f11213b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar2 = list.get(i16);
            if (bVar2.f11134a == a.U) {
                i15 = G(cVar, i14, j10, i10, bVar2.f11138m1, i15);
                i14++;
            }
        }
    }

    public static void I(w wVar, n nVar, byte[] bArr) throws b6.j0 {
        wVar.Q(8);
        wVar.i(bArr, 0, 16);
        if (Arrays.equals(bArr, U)) {
            y(wVar, 16, nVar);
        }
    }

    public static boolean O(int i10) {
        return i10 == a.W || i10 == a.Y || i10 == a.Z || i10 == a.f11071a0 || i10 == a.f11074b0 || i10 == a.f11080d0 || i10 == a.f11083e0 || i10 == a.f11086f0 || i10 == a.f11095i0;
    }

    public static boolean P(int i10) {
        return i10 == a.f11104l0 || i10 == a.f11101k0 || i10 == a.X || i10 == a.V || i10 == a.f11107m0 || i10 == a.R || i10 == a.S || i10 == a.f11092h0 || i10 == a.T || i10 == a.U || i10 == a.f11109n0 || i10 == a.f11125v0 || i10 == a.f11127w0 || i10 == a.A0 || i10 == a.f11133z0 || i10 == a.f11129x0 || i10 == a.f11131y0 || i10 == a.f11098j0 || i10 == a.f11089g0 || i10 == a.f11072a1;
    }

    public static DrmInitData i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f11134a == a.f11109n0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f11138m1.f14880a;
                UUID f10 = j.f(bArr);
                if (f10 == null) {
                    p.l(S, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(f10, s.f14807e, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<DrmInitData.SchemeData>) arrayList);
    }

    public static c j(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            c valueAt = sparseArray.valueAt(i10);
            int i11 = valueAt.f11218g;
            n nVar = valueAt.f11213b;
            if (i11 != nVar.f11304e) {
                long j11 = nVar.f11306g[i11];
                if (j11 < j10) {
                    cVar = valueAt;
                    j10 = j11;
                }
            }
        }
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.util.SparseArray, android.util.SparseArray<o6.f$c>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o6.f.c k(android.util.SparseArray<o6.f.c> r2, int r3) {
        /*
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L_0x000f
            r3 = 0
            java.lang.Object r2 = r2.valueAt(r3)
        L_0x000c:
            o6.f$c r2 = (o6.f.c) r2
            return r2
        L_0x000f:
            java.lang.Object r2 = r2.get(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f.k(android.util.SparseArray, int):o6.f$c");
    }

    public static /* synthetic */ i[] l() {
        return new i[]{new f()};
    }

    public static long u(w wVar) {
        wVar.Q(8);
        return a.c(wVar.l()) == 0 ? wVar.F() : wVar.I();
    }

    public static void v(a.C0192a aVar, SparseArray<c> sparseArray, int i10, byte[] bArr) throws b6.j0 {
        int size = aVar.f11137o1.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0192a aVar2 = aVar.f11137o1.get(i11);
            if (aVar2.f11134a == a.f11083e0) {
                E(aVar2, sparseArray, i10, bArr);
            }
        }
    }

    public static void w(w wVar, n nVar) throws b6.j0 {
        wVar.Q(8);
        int l10 = wVar.l();
        if ((a.b(l10) & 1) == 1) {
            wVar.R(8);
        }
        int H2 = wVar.H();
        if (H2 == 1) {
            nVar.f11303d += a.c(l10) == 0 ? wVar.F() : wVar.I();
            return;
        }
        throw new b6.j0("Unexpected saio entry count: " + H2);
    }

    public static void x(m mVar, w wVar, n nVar) throws b6.j0 {
        int i10;
        int i11 = mVar.f11298d;
        wVar.Q(8);
        boolean z10 = true;
        if ((a.b(wVar.l()) & 1) == 1) {
            wVar.R(8);
        }
        int D2 = wVar.D();
        int H2 = wVar.H();
        if (H2 == nVar.f11305f) {
            if (D2 == 0) {
                boolean[] zArr = nVar.f11313n;
                i10 = 0;
                for (int i12 = 0; i12 < H2; i12++) {
                    int D3 = wVar.D();
                    i10 += D3;
                    zArr[i12] = D3 > i11;
                }
            } else {
                if (D2 <= i11) {
                    z10 = false;
                }
                i10 = (D2 * H2) + 0;
                Arrays.fill(nVar.f11313n, 0, H2, z10);
            }
            nVar.d(i10);
            return;
        }
        throw new b6.j0("Length mismatch: " + H2 + ", " + nVar.f11305f);
    }

    public static void y(w wVar, int i10, n nVar) throws b6.j0 {
        wVar.Q(i10 + 8);
        int b10 = a.b(wVar.l());
        if ((b10 & 1) == 0) {
            boolean z10 = (b10 & 2) != 0;
            int H2 = wVar.H();
            if (H2 == nVar.f11305f) {
                Arrays.fill(nVar.f11313n, 0, H2, z10);
                nVar.d(wVar.a());
                nVar.b(wVar);
                return;
            }
            throw new b6.j0("Length mismatch: " + H2 + ", " + nVar.f11305f);
        }
        throw new b6.j0("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static void z(w wVar, n nVar) throws b6.j0 {
        y(wVar, 0, nVar);
    }

    public final void J(long j10) throws b6.j0 {
        while (!this.f11199p.isEmpty() && this.f11199p.peek().f11135m1 == j10) {
            o(this.f11199p.pop());
        }
        d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(j6.j r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.f11205v
            r1 = 8
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x002a
            w7.w r0 = r8.f11198o
            byte[] r0 = r0.f14880a
            boolean r0 = r9.a(r0, r2, r1, r3)
            if (r0 != 0) goto L_0x0013
            return r2
        L_0x0013:
            r8.f11205v = r1
            w7.w r0 = r8.f11198o
            r0.Q(r2)
            w7.w r0 = r8.f11198o
            long r4 = r0.F()
            r8.f11204u = r4
            w7.w r0 = r8.f11198o
            int r0 = r0.l()
            r8.f11203t = r0
        L_0x002a:
            long r4 = r8.f11204u
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            w7.w r0 = r8.f11198o
            byte[] r0 = r0.f14880a
            r9.readFully(r0, r1, r1)
            int r0 = r8.f11205v
            int r0 = r0 + r1
            r8.f11205v = r0
            w7.w r0 = r8.f11198o
            long r4 = r0.I()
        L_0x0044:
            r8.f11204u = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<o6.a$a> r0 = r8.f11199p
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<o6.a$a> r0 = r8.f11199p
            java.lang.Object r0 = r0.peek()
            o6.a$a r0 = (o6.a.C0192a) r0
            long r4 = r0.f11135m1
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.getPosition()
            long r4 = r4 - r6
            int r0 = r8.f11205v
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.f11204u
            int r0 = r8.f11205v
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0145
            long r4 = r9.getPosition()
            int r0 = r8.f11205v
            long r6 = (long) r0
            long r4 = r4 - r6
            int r0 = r8.f11203t
            int r6 = o6.a.f11080d0
            if (r0 != r6) goto L_0x00aa
            android.util.SparseArray<o6.f$c> r0 = r8.f11191h
            int r0 = r0.size()
            r6 = r2
        L_0x0095:
            if (r6 >= r0) goto L_0x00aa
            android.util.SparseArray<o6.f$c> r7 = r8.f11191h
            java.lang.Object r7 = r7.valueAt(r6)
            o6.f$c r7 = (o6.f.c) r7
            o6.n r7 = r7.f11213b
            r7.f11301b = r4
            r7.f11303d = r4
            r7.f11302c = r4
            int r6 = r6 + 1
            goto L_0x0095
        L_0x00aa:
            int r0 = r8.f11203t
            int r6 = o6.a.A
            r7 = 0
            if (r0 != r6) goto L_0x00ce
            r8.C = r7
            long r0 = r8.f11204u
            long r0 = r0 + r4
            r8.f11207x = r0
            boolean r9 = r8.L
            if (r9 != 0) goto L_0x00ca
            j6.k r9 = r8.I
            j6.q$b r0 = new j6.q$b
            long r1 = r8.A
            r0.<init>(r1, r4)
            r9.q(r0)
            r8.L = r3
        L_0x00ca:
            r9 = 2
            r8.f11202s = r9
            return r3
        L_0x00ce:
            boolean r0 = O(r0)
            if (r0 == 0) goto L_0x00fb
            long r0 = r9.getPosition()
            long r4 = r8.f11204u
            long r0 = r0 + r4
            r4 = 8
            long r0 = r0 - r4
            java.util.ArrayDeque<o6.a$a> r9 = r8.f11199p
            o6.a$a r2 = new o6.a$a
            int r4 = r8.f11203t
            r2.<init>(r4, r0)
            r9.push(r2)
            long r4 = r8.f11204u
            int r9 = r8.f11205v
            long r6 = (long) r9
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f7
            r8.J(r0)
            goto L_0x013c
        L_0x00f7:
            r8.d()
            goto L_0x013c
        L_0x00fb:
            int r9 = r8.f11203t
            boolean r9 = P(r9)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r9 == 0) goto L_0x0132
            int r9 = r8.f11205v
            if (r9 != r1) goto L_0x012a
            long r6 = r8.f11204u
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0122
            w7.w r9 = new w7.w
            int r0 = (int) r6
            r9.<init>((int) r0)
            r8.f11206w = r9
            w7.w r0 = r8.f11198o
            byte[] r0 = r0.f14880a
            byte[] r9 = r9.f14880a
            java.lang.System.arraycopy(r0, r2, r9, r2, r1)
            goto L_0x013a
        L_0x0122:
            b6.j0 r9 = new b6.j0
            java.lang.String r0 = "Leaf atom with length > 2147483647 (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x012a:
            b6.j0 r9 = new b6.j0
            java.lang.String r0 = "Leaf atom defines extended atom size (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x0132:
            long r0 = r8.f11204u
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x013d
            r8.f11206w = r7
        L_0x013a:
            r8.f11202s = r3
        L_0x013c:
            return r3
        L_0x013d:
            b6.j0 r9 = new b6.j0
            java.lang.String r0 = "Skipping atom with length > 2147483647 (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        L_0x0145:
            b6.j0 r9 = new b6.j0
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f.K(j6.j):boolean");
    }

    public final void L(j jVar) throws IOException, InterruptedException {
        int i10 = ((int) this.f11204u) - this.f11205v;
        w wVar = this.f11206w;
        if (wVar != null) {
            jVar.readFully(wVar.f14880a, 8, i10);
            q(new a.b(this.f11203t, this.f11206w), jVar.getPosition());
        } else {
            jVar.i(i10);
        }
        J(jVar.getPosition());
    }

    public final void M(j jVar) throws IOException, InterruptedException {
        int size = this.f11191h.size();
        c cVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = this.f11191h.valueAt(i10).f11213b;
            if (nVar.f11317r) {
                long j11 = nVar.f11303d;
                if (j11 < j10) {
                    cVar = this.f11191h.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (cVar == null) {
            this.f11202s = 3;
            return;
        }
        int position = (int) (j10 - jVar.getPosition());
        if (position >= 0) {
            jVar.i(position);
            cVar.f11213b.a(jVar);
            return;
        }
        throw new b6.j0("Offset to encryption data was negative.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean N(j6.j r18) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f11202s
            r3 = 0
            r4 = 3
            r5 = 4
            r6 = 1
            r7 = 0
            if (r2 != r4) goto L_0x00a3
            o6.f$c r2 = r0.C
            if (r2 != 0) goto L_0x004f
            android.util.SparseArray<o6.f$c> r2 = r0.f11191h
            o6.f$c r2 = j(r2)
            if (r2 != 0) goto L_0x0032
            long r2 = r0.f11207x
            long r4 = r18.getPosition()
            long r2 = r2 - r4
            int r2 = (int) r2
            if (r2 < 0) goto L_0x002a
            r1.i(r2)
            r17.d()
            return r7
        L_0x002a:
            b6.j0 r1 = new b6.j0
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0032:
            o6.n r8 = r2.f11213b
            long[] r8 = r8.f11306g
            int r9 = r2.f11218g
            r9 = r8[r9]
            long r11 = r18.getPosition()
            long r9 = r9 - r11
            int r8 = (int) r9
            if (r8 >= 0) goto L_0x004a
            java.lang.String r8 = "FragmentedMp4Extractor"
            java.lang.String r9 = "Ignoring negative offset to sample data."
            w7.p.l(r8, r9)
            r8 = r7
        L_0x004a:
            r1.i(r8)
            r0.C = r2
        L_0x004f:
            o6.f$c r2 = r0.C
            o6.n r8 = r2.f11213b
            int[] r8 = r8.f11308i
            int r9 = r2.f11216e
            r8 = r8[r9]
            r0.D = r8
            int r10 = r2.f11219h
            if (r9 >= r10) goto L_0x0074
            r1.i(r8)
            o6.f$c r1 = r0.C
            r1.i()
            o6.f$c r1 = r0.C
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x0071
            r0.C = r3
        L_0x0071:
            r0.f11202s = r4
            return r6
        L_0x0074:
            o6.l r2 = r2.f11214c
            int r2 = r2.f11289g
            if (r2 != r6) goto L_0x0082
            r2 = 8
            int r8 = r8 - r2
            r0.D = r8
            r1.i(r2)
        L_0x0082:
            o6.f$c r2 = r0.C
            int r2 = r2.f()
            r0.E = r2
            int r8 = r0.D
            int r8 = r8 + r2
            r0.D = r8
            r0.f11202s = r5
            r0.F = r7
            o6.f$c r2 = r0.C
            o6.l r2 = r2.f11214c
            com.google.android.exoplayer2.Format r2 = r2.f11288f
            java.lang.String r2 = r2.W
            java.lang.String r8 = "audio/ac4"
            boolean r2 = r8.equals(r2)
            r0.H = r2
        L_0x00a3:
            o6.f$c r2 = r0.C
            o6.n r8 = r2.f11213b
            o6.l r9 = r2.f11214c
            j6.s r10 = r2.f11212a
            int r2 = r2.f11216e
            long r11 = r8.c(r2)
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            w7.j0 r13 = r0.f11197n
            if (r13 == 0) goto L_0x00bc
            long r11 = r13.a(r11)
        L_0x00bc:
            r14 = r11
            int r11 = r9.f11292j
            if (r11 == 0) goto L_0x0180
            w7.w r12 = r0.f11193j
            byte[] r12 = r12.f14880a
            r12[r7] = r7
            r12[r6] = r7
            r13 = 2
            r12[r13] = r7
            int r13 = r11 + 1
            int r11 = 4 - r11
        L_0x00d0:
            int r4 = r0.E
            int r3 = r0.D
            if (r4 >= r3) goto L_0x01b6
            int r3 = r0.F
            if (r3 != 0) goto L_0x0128
            r1.readFully(r12, r11, r13)
            w7.w r3 = r0.f11193j
            r3.Q(r7)
            w7.w r3 = r0.f11193j
            int r3 = r3.l()
            if (r3 < r6) goto L_0x0120
            int r3 = r3 + -1
            r0.F = r3
            w7.w r3 = r0.f11192i
            r3.Q(r7)
            w7.w r3 = r0.f11192i
            r10.a(r3, r5)
            w7.w r3 = r0.f11193j
            r10.a(r3, r6)
            j6.s[] r3 = r0.K
            int r3 = r3.length
            if (r3 <= 0) goto L_0x0110
            com.google.android.exoplayer2.Format r3 = r9.f11288f
            java.lang.String r3 = r3.W
            byte r4 = r12[r5]
            boolean r3 = w7.t.g(r3, r4)
            if (r3 == 0) goto L_0x0110
            r3 = r6
            goto L_0x0111
        L_0x0110:
            r3 = r7
        L_0x0111:
            r0.G = r3
            int r3 = r0.E
            int r3 = r3 + 5
            r0.E = r3
            int r3 = r0.D
            int r3 = r3 + r11
            r0.D = r3
            r3 = 0
            goto L_0x00d0
        L_0x0120:
            b6.j0 r1 = new b6.j0
            java.lang.String r2 = "Invalid NAL length"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0128:
            boolean r4 = r0.G
            if (r4 == 0) goto L_0x016b
            w7.w r4 = r0.f11194k
            r4.M(r3)
            w7.w r3 = r0.f11194k
            byte[] r3 = r3.f14880a
            int r4 = r0.F
            r1.readFully(r3, r7, r4)
            w7.w r3 = r0.f11194k
            int r4 = r0.F
            r10.a(r3, r4)
            int r3 = r0.F
            w7.w r4 = r0.f11194k
            byte[] r5 = r4.f14880a
            int r4 = r4.d()
            int r4 = w7.t.k(r5, r4)
            w7.w r5 = r0.f11194k
            com.google.android.exoplayer2.Format r6 = r9.f11288f
            java.lang.String r6 = r6.W
            java.lang.String r7 = "video/hevc"
            boolean r6 = r7.equals(r6)
            r5.Q(r6)
            w7.w r5 = r0.f11194k
            r5.P(r4)
            w7.w r4 = r0.f11194k
            j6.s[] r5 = r0.K
            i7.g.a(r14, r4, r5)
            goto L_0x0170
        L_0x016b:
            r4 = r7
            int r3 = r10.b(r1, r3, r4)
        L_0x0170:
            int r4 = r0.E
            int r4 = r4 + r3
            r0.E = r4
            int r4 = r0.F
            int r4 = r4 - r3
            r0.F = r4
            r3 = 0
            r5 = 4
            r6 = 1
            r7 = 0
            goto L_0x00d0
        L_0x0180:
            boolean r3 = r0.H
            if (r3 == 0) goto L_0x01a4
            int r3 = r0.D
            w7.w r4 = r0.f11196m
            d6.b.a(r3, r4)
            w7.w r3 = r0.f11196m
            int r3 = r3.d()
            w7.w r4 = r0.f11196m
            r10.a(r4, r3)
            int r4 = r0.D
            int r4 = r4 + r3
            r0.D = r4
            int r4 = r0.E
            int r4 = r4 + r3
            r0.E = r4
            r3 = 0
            r0.H = r3
            goto L_0x01a5
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            int r4 = r0.E
            int r5 = r0.D
            if (r4 >= r5) goto L_0x01b6
            int r5 = r5 - r4
            int r4 = r10.b(r1, r5, r3)
            int r5 = r0.E
            int r5 = r5 + r4
            r0.E = r5
            goto L_0x01a5
        L_0x01b6:
            boolean[] r1 = r8.f11311l
            boolean r1 = r1[r2]
            o6.f$c r2 = r0.C
            o6.m r2 = r2.c()
            if (r2 == 0) goto L_0x01cb
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r1 | r3
            j6.s$a r2 = r2.f11297c
            r13 = r1
            r16 = r2
            goto L_0x01ce
        L_0x01cb:
            r13 = r1
            r16 = 0
        L_0x01ce:
            int r1 = r0.D
            r2 = 0
            r11 = r14
            r3 = r14
            r14 = r1
            r15 = r2
            r10.c(r11, r13, r14, r15, r16)
            r0.t(r3)
            o6.f$c r1 = r0.C
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x01e6
            r1 = 0
            r0.C = r1
        L_0x01e6:
            r1 = 3
            r0.f11202s = r1
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f.N(j6.j):boolean");
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        return k.b(jVar);
    }

    public final void d() {
        this.f11202s = 0;
        this.f11205v = 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.util.SparseArray, android.util.SparseArray<o6.c>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o6.c e(android.util.SparseArray<o6.c> r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.size()
            r1 = 1
            if (r0 != r1) goto L_0x000f
            r4 = 0
            java.lang.Object r3 = r3.valueAt(r4)
        L_0x000c:
            o6.c r3 = (o6.c) r3
            return r3
        L_0x000f:
            java.lang.Object r3 = r3.get(r4)
            java.lang.Object r3 = w7.a.g(r3)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.f.e(android.util.SparseArray, int):o6.c");
    }

    public int f(j jVar, j6.p pVar) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.f11202s;
            if (i10 != 0) {
                if (i10 == 1) {
                    L(jVar);
                } else if (i10 == 2) {
                    M(jVar);
                } else if (N(jVar)) {
                    return 0;
                }
            } else if (!K(jVar)) {
                return -1;
            }
        }
    }

    public void g(k kVar) {
        this.I = kVar;
        l lVar = this.f11188e;
        if (lVar != null) {
            c cVar = new c(kVar.a(0, lVar.f11284b));
            cVar.d(this.f11188e, new c(0, 0, 0, 0));
            this.f11191h.put(0, cVar);
            m();
            this.I.r();
        }
    }

    public void h(long j10, long j11) {
        int size = this.f11191h.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f11191h.valueAt(i10).g();
        }
        this.f11200q.clear();
        this.f11208y = 0;
        this.f11209z = j11;
        this.f11199p.clear();
        this.H = false;
        d();
    }

    public final void m() {
        int i10;
        if (this.J == null) {
            j6.s[] sVarArr = new j6.s[2];
            this.J = sVarArr;
            j6.s sVar = this.f11201r;
            if (sVar != null) {
                sVarArr[0] = sVar;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.f11187d & 4) != 0) {
                sVarArr[i10] = this.I.a(this.f11191h.size(), 4);
                i10++;
            }
            j6.s[] sVarArr2 = (j6.s[]) Arrays.copyOf(this.J, i10);
            this.J = sVarArr2;
            for (j6.s d10 : sVarArr2) {
                d10.d(V);
            }
        }
        if (this.K == null) {
            this.K = new j6.s[this.f11189f.size()];
            for (int i11 = 0; i11 < this.K.length; i11++) {
                j6.s a10 = this.I.a(this.f11191h.size() + 1 + i11, 3);
                a10.d(this.f11189f.get(i11));
                this.K[i11] = a10;
            }
        }
    }

    @o0
    public l n(@o0 l lVar) {
        return lVar;
    }

    public final void o(a.C0192a aVar) throws b6.j0 {
        int i10 = aVar.f11134a;
        if (i10 == a.W) {
            s(aVar);
        } else if (i10 == a.f11080d0) {
            r(aVar);
        } else if (!this.f11199p.isEmpty()) {
            this.f11199p.peek().d(aVar);
        }
    }

    public final void p(w wVar) {
        j6.s[] sVarArr = this.J;
        if (sVarArr != null && sVarArr.length != 0) {
            wVar.Q(12);
            int a10 = wVar.a();
            wVar.x();
            wVar.x();
            long L0 = q0.L0(wVar.F(), 1000000, wVar.F());
            int c10 = wVar.c();
            byte[] bArr = wVar.f14880a;
            bArr[c10 - 4] = 0;
            bArr[c10 - 3] = 0;
            bArr[c10 - 2] = 0;
            bArr[c10 - 1] = 0;
            for (j6.s a11 : this.J) {
                wVar.Q(12);
                a11.a(wVar, a10);
            }
            long j10 = this.B;
            if (j10 != b6.c.f4201b) {
                long j11 = j10 + L0;
                j0 j0Var = this.f11197n;
                if (j0Var != null) {
                    j11 = j0Var.a(j11);
                }
                long j12 = j11;
                for (j6.s c11 : this.J) {
                    c11.c(j12, 1, a10, 0, (s.a) null);
                }
                return;
            }
            this.f11200q.addLast(new b(L0, a10));
            this.f11208y += a10;
        }
    }

    public final void q(a.b bVar, long j10) throws b6.j0 {
        if (!this.f11199p.isEmpty()) {
            this.f11199p.peek().e(bVar);
            return;
        }
        int i10 = bVar.f11134a;
        if (i10 == a.V) {
            Pair<Long, j6.c> B2 = B(bVar.f11138m1, j10);
            this.B = ((Long) B2.first).longValue();
            this.I.q((q) B2.second);
            this.L = true;
        } else if (i10 == a.f11072a1) {
            p(bVar.f11138m1);
        }
    }

    public final void r(a.C0192a aVar) throws b6.j0 {
        v(aVar, this.f11191h, this.f11187d, this.f11195l);
        DrmInitData i10 = this.f11190g != null ? null : i(aVar.f11136n1);
        if (i10 != null) {
            int size = this.f11191h.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f11191h.valueAt(i11).j(i10);
            }
        }
        if (this.f11209z != b6.c.f4201b) {
            int size2 = this.f11191h.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f11191h.valueAt(i12).h(this.f11209z);
            }
            this.f11209z = b6.c.f4201b;
        }
    }

    public final void s(a.C0192a aVar) throws b6.j0 {
        int i10;
        int i11;
        a.C0192a aVar2 = aVar;
        boolean z10 = true;
        int i12 = 0;
        w7.a.j(this.f11188e == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.f11190g;
        if (drmInitData == null) {
            drmInitData = i(aVar2.f11136n1);
        }
        a.C0192a g10 = aVar2.g(a.f11086f0);
        SparseArray sparseArray = new SparseArray();
        int size = g10.f11136n1.size();
        long j10 = -9223372036854775807L;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar = g10.f11136n1.get(i13);
            int i14 = bVar.f11134a;
            if (i14 == a.T) {
                Pair<Integer, c> F2 = F(bVar.f11138m1);
                sparseArray.put(((Integer) F2.first).intValue(), F2.second);
            } else if (i14 == a.f11089g0) {
                j10 = u(bVar.f11138m1);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.f11137o1.size();
        int i15 = 0;
        while (i15 < size2) {
            a.C0192a aVar3 = aVar2.f11137o1.get(i15);
            if (aVar3.f11134a == a.Y) {
                i10 = i15;
                i11 = size2;
                l n10 = n(b.v(aVar3, aVar2.h(a.X), j10, drmInitData, (this.f11187d & 16) != 0, false));
                if (n10 != null) {
                    sparseArray2.put(n10.f11283a, n10);
                }
            } else {
                i10 = i15;
                i11 = size2;
            }
            i15 = i10 + 1;
            size2 = i11;
        }
        int size3 = sparseArray2.size();
        if (this.f11191h.size() == 0) {
            while (i12 < size3) {
                l lVar = (l) sparseArray2.valueAt(i12);
                c cVar = new c(this.I.a(i12, lVar.f11284b));
                cVar.d(lVar, e(sparseArray, lVar.f11283a));
                this.f11191h.put(lVar.f11283a, cVar);
                this.A = Math.max(this.A, lVar.f11287e);
                i12++;
            }
            m();
            this.I.r();
            return;
        }
        if (this.f11191h.size() != size3) {
            z10 = false;
        }
        w7.a.i(z10);
        while (i12 < size3) {
            l lVar2 = (l) sparseArray2.valueAt(i12);
            this.f11191h.get(lVar2.f11283a).d(lVar2, e(sparseArray, lVar2.f11283a));
            i12++;
        }
    }

    public final void t(long j10) {
        while (!this.f11200q.isEmpty()) {
            b removeFirst = this.f11200q.removeFirst();
            this.f11208y -= removeFirst.f11211b;
            long j11 = removeFirst.f11210a + j10;
            j0 j0Var = this.f11197n;
            if (j0Var != null) {
                j11 = j0Var.a(j11);
            }
            for (j6.s c10 : this.J) {
                c10.c(j11, 1, removeFirst.f11211b, this.f11208y, (s.a) null);
            }
        }
    }
}
