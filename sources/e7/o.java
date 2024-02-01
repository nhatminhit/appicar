package e7;

import android.net.Uri;
import android.os.Handler;
import b6.c;
import b6.c0;
import b7.i0;
import b7.q0;
import b7.r0;
import b7.s0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import d7.d;
import e7.e;
import g6.f;
import j6.h;
import j6.k;
import j6.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t7.g0;
import t7.h0;
import w7.p;
import w7.s;

public final class o implements h0.b<d>, h0.f, s0, k, q0.b {
    public static final String H0 = "HlsSampleStreamWrapper";
    public static final int I0 = -1;
    public static final int J0 = -2;
    public static final int K0 = -3;
    public long A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public long F0;
    public int G0;
    public final int O;
    public final a P;
    public final e Q;
    public final t7.b R;
    public final Format S;
    public final g0 T;
    public final h0 U = new h0("Loader:HlsSampleStreamWrapper");
    public final i0.a V;
    public final e.c W = new e.c();
    public final ArrayList<i> X;
    public final List<i> Y;
    public final Runnable Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Runnable f6946a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Handler f6947b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList<k> f6948c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Map<String, DrmInitData> f6949d0;

    /* renamed from: e0  reason: collision with root package name */
    public q0[] f6950e0 = new q0[0];

    /* renamed from: f0  reason: collision with root package name */
    public int[] f6951f0 = new int[0];

    /* renamed from: g0  reason: collision with root package name */
    public boolean f6952g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6953h0 = -1;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6954i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f6955j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public int f6956k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f6957l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6958m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6959n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f6960o0;

    /* renamed from: p0  reason: collision with root package name */
    public Format f6961p0;

    /* renamed from: q0  reason: collision with root package name */
    public Format f6962q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f6963r0;

    /* renamed from: s0  reason: collision with root package name */
    public TrackGroupArray f6964s0;

    /* renamed from: t0  reason: collision with root package name */
    public TrackGroupArray f6965t0;

    /* renamed from: u0  reason: collision with root package name */
    public int[] f6966u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f6967v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f6968w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean[] f6969x0 = new boolean[0];

    /* renamed from: y0  reason: collision with root package name */
    public boolean[] f6970y0 = new boolean[0];

    /* renamed from: z0  reason: collision with root package name */
    public long f6971z0;

    public interface a extends s0.a<o> {
        void a();

        void l(Uri uri);
    }

    public static final class b extends q0 {
        public b(t7.b bVar) {
            super(bVar);
        }

        @o0
        public final Metadata L(@o0 Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int d10 = metadata.d();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= d10) {
                    i11 = -1;
                    break;
                }
                Metadata.Entry c10 = metadata.c(i11);
                if ((c10 instanceof PrivFrame) && i.H.equals(((PrivFrame) c10).P)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return metadata;
            }
            if (d10 == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[(d10 - 1)];
            while (i10 < d10) {
                if (i10 != i11) {
                    entryArr[i10 < i11 ? i10 : i10 - 1] = metadata.c(i10);
                }
                i10++;
            }
            return new Metadata(entryArr);
        }

        public void d(Format format) {
            super.d(format.h(L(format.U)));
        }
    }

    public o(int i10, a aVar, e eVar, Map<String, DrmInitData> map, t7.b bVar, long j10, Format format, g0 g0Var, i0.a aVar2) {
        this.O = i10;
        this.P = aVar;
        this.Q = eVar;
        this.f6949d0 = map;
        this.R = bVar;
        this.S = format;
        this.T = g0Var;
        this.V = aVar2;
        ArrayList<i> arrayList = new ArrayList<>();
        this.X = arrayList;
        this.Y = Collections.unmodifiableList(arrayList);
        this.f6948c0 = new ArrayList<>();
        this.Z = new l(this);
        this.f6946a0 = new m(this);
        this.f6947b0 = new Handler();
        this.f6971z0 = j10;
        this.A0 = j10;
    }

    public static h A(int i10, int i11) {
        p.l(H0, "Unmapped track with id " + i10 + " of type " + i11);
        return new h();
    }

    public static Format B(Format format, Format format2, boolean z10) {
        if (format == null) {
            return format2;
        }
        int i10 = z10 ? format.S : -1;
        int i11 = format.f5077j0;
        if (i11 == -1) {
            i11 = format2.f5077j0;
        }
        int i12 = i11;
        String L = w7.q0.L(format.T, s.g(format2.W));
        String d10 = s.d(L);
        if (d10 == null) {
            d10 = format2.W;
        }
        return format2.b(format.O, format.P, d10, L, format.U, i10, format.f5069b0, format.f5070c0, i12, format.Q, format.f5082o0);
    }

    public static boolean D(Format format, Format format2) {
        String str = format.W;
        String str2 = format2.W;
        int g10 = s.g(str);
        if (g10 != 3) {
            return g10 == s.g(str2);
        }
        if (!w7.q0.e(str, str2)) {
            return false;
        }
        return (!s.f14800a0.equals(str) && !s.f14802b0.equals(str)) || format.f5083p0 == format2.f5083p0;
    }

    public static int G(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static boolean I(d dVar) {
        return dVar instanceof i;
    }

    public final boolean C(i iVar) {
        int i10 = iVar.f6921j;
        int length = this.f6950e0.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f6969x0[i11] && this.f6950e0[i11].w() == i10) {
                return false;
            }
        }
        return true;
    }

    public final i E() {
        ArrayList<i> arrayList = this.X;
        return arrayList.get(arrayList.size() - 1);
    }

    public int F() {
        return this.f6967v0;
    }

    public void H(int i10, boolean z10, boolean z11) {
        if (!z11) {
            this.f6952g0 = false;
            this.f6954i0 = false;
        }
        this.G0 = i10;
        for (q0 J : this.f6950e0) {
            J.J(i10);
        }
        if (z10) {
            for (q0 K : this.f6950e0) {
                K.K();
            }
        }
    }

    public final boolean J() {
        return this.A0 != c.f4201b;
    }

    public boolean K(int i10) {
        return this.D0 || (!J() && this.f6950e0[i10].u());
    }

    public final void L() {
        int i10 = this.f6964s0.O;
        int[] iArr = new int[i10];
        this.f6966u0 = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                q0[] q0VarArr = this.f6950e0;
                if (i12 >= q0VarArr.length) {
                    break;
                } else if (D(q0VarArr[i12].s(), this.f6964s0.a(i11).a(0))) {
                    this.f6966u0[i11] = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        Iterator<k> it = this.f6948c0.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void M() {
        if (!this.f6963r0 && this.f6966u0 == null && this.f6958m0) {
            q0[] q0VarArr = this.f6950e0;
            int length = q0VarArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (q0VarArr[i10].s() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            if (this.f6964s0 != null) {
                L();
                return;
            }
            y();
            this.f6959n0 = true;
            this.P.a();
        }
    }

    public void N() throws IOException {
        this.U.a();
        this.Q.i();
    }

    /* renamed from: O */
    public void k(d dVar, long j10, long j11, boolean z10) {
        d dVar2 = dVar;
        this.V.x(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, dVar.a());
        if (!z10) {
            W();
            if (this.f6960o0 > 0) {
                this.P.k(this);
            }
        }
    }

    /* renamed from: P */
    public void g(d dVar, long j10, long j11) {
        d dVar2 = dVar;
        this.Q.j(dVar2);
        this.V.A(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, dVar.a());
        if (!this.f6959n0) {
            d(this.f6971z0);
        } else {
            this.P.k(this);
        }
    }

    /* renamed from: Q */
    public h0.c j(d dVar, long j10, long j11, IOException iOException, int i10) {
        h0.c h10;
        d dVar2 = dVar;
        long a10 = dVar.a();
        boolean I = I(dVar);
        long b10 = this.T.b(dVar2.f6516b, j11, iOException, i10);
        boolean z10 = false;
        boolean g10 = b10 != c.f4201b ? this.Q.g(dVar2, b10) : false;
        if (g10) {
            if (I && a10 == 0) {
                ArrayList<i> arrayList = this.X;
                if (arrayList.remove(arrayList.size() - 1) == dVar2) {
                    z10 = true;
                }
                w7.a.i(z10);
                if (this.X.isEmpty()) {
                    this.A0 = this.f6971z0;
                }
            }
            h10 = h0.f13084j;
        } else {
            long a11 = this.T.a(dVar2.f6516b, j11, iOException, i10);
            h10 = a11 != c.f4201b ? h0.h(false, a11) : h0.f13085k;
        }
        h0.c cVar = h10;
        this.V.D(dVar2.f6515a, dVar.f(), dVar.e(), dVar2.f6516b, this.O, dVar2.f6517c, dVar2.f6518d, dVar2.f6519e, dVar2.f6520f, dVar2.f6521g, j10, j11, a10, iOException, !cVar.c());
        if (g10) {
            if (!this.f6959n0) {
                d(this.f6971z0);
            } else {
                this.P.k(this);
            }
        }
        return cVar;
    }

    public boolean R(Uri uri, long j10) {
        return this.Q.k(uri, j10);
    }

    public final void S() {
        this.f6958m0 = true;
        M();
    }

    public void T(TrackGroupArray trackGroupArray, int i10, TrackGroupArray trackGroupArray2) {
        this.f6959n0 = true;
        this.f6964s0 = trackGroupArray;
        this.f6965t0 = trackGroupArray2;
        this.f6967v0 = i10;
        Handler handler = this.f6947b0;
        a aVar = this.P;
        aVar.getClass();
        handler.post(new n(aVar));
    }

    public int U(int i10, c0 c0Var, f fVar, boolean z10) {
        DrmInitData drmInitData;
        if (J()) {
            return -3;
        }
        int i11 = 0;
        if (!this.X.isEmpty()) {
            int i12 = 0;
            while (i12 < this.X.size() - 1 && C(this.X.get(i12))) {
                i12++;
            }
            w7.q0.J0(this.X, 0, i12);
            i iVar = this.X.get(0);
            Format format = iVar.f6517c;
            if (!format.equals(this.f6962q0)) {
                this.V.l(this.O, format, iVar.f6518d, iVar.f6519e, iVar.f6520f);
            }
            this.f6962q0 = format;
        }
        int z11 = this.f6950e0[i10].z(c0Var, fVar, z10, this.D0, this.f6971z0);
        if (z11 == -5) {
            Format format2 = c0Var.f4302c;
            if (i10 == this.f6957l0) {
                int w10 = this.f6950e0[i10].w();
                while (i11 < this.X.size() && this.X.get(i11).f6921j != w10) {
                    i11++;
                }
                format2 = format2.f(i11 < this.X.size() ? this.X.get(i11).f6517c : this.f6961p0);
            }
            DrmInitData drmInitData2 = format2.Z;
            if (!(drmInitData2 == null || (drmInitData = this.f6949d0.get(drmInitData2.Q)) == null)) {
                format2 = format2.c(drmInitData);
            }
            c0Var.f4302c = format2;
        }
        return z11;
    }

    public void V() {
        if (this.f6959n0) {
            for (q0 k10 : this.f6950e0) {
                k10.k();
            }
        }
        this.U.k(this);
        this.f6947b0.removeCallbacksAndMessages((Object) null);
        this.f6963r0 = true;
        this.f6948c0.clear();
    }

    public final void W() {
        for (q0 E : this.f6950e0) {
            E.E(this.B0);
        }
        this.B0 = false;
    }

    public final boolean X(long j10) {
        int length = this.f6950e0.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                return true;
            }
            q0 q0Var = this.f6950e0[i10];
            q0Var.F();
            if (q0Var.f(j10, true, false) == -1) {
                z10 = false;
            }
            if (z10 || (!this.f6970y0[i10] && this.f6968w0)) {
                i10++;
            }
        }
        return false;
    }

    public boolean Y(long j10, boolean z10) {
        this.f6971z0 = j10;
        if (J()) {
            this.A0 = j10;
            return true;
        } else if (this.f6958m0 && !z10 && X(j10)) {
            return false;
        } else {
            this.A0 = j10;
            this.D0 = false;
            this.X.clear();
            if (this.U.i()) {
                this.U.g();
            } else {
                W();
            }
            return true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Z(com.google.android.exoplayer2.trackselection.f[] r20, boolean[] r21, b7.r0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            boolean r3 = r0.f6959n0
            w7.a.i(r3)
            int r3 = r0.f6960o0
            r14 = 0
            r4 = r14
        L_0x0011:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x0031
            r5 = r2[r4]
            if (r5 == 0) goto L_0x002e
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002e
        L_0x0022:
            int r7 = r0.f6960o0
            int r7 = r7 - r15
            r0.f6960o0 = r7
            e7.k r5 = (e7.k) r5
            r5.d()
            r2[r4] = r6
        L_0x002e:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0031:
            if (r26 != 0) goto L_0x0043
            boolean r4 = r0.C0
            if (r4 == 0) goto L_0x003a
            if (r3 != 0) goto L_0x0041
            goto L_0x0043
        L_0x003a:
            long r3 = r0.f6971z0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r3 = r14
            goto L_0x0044
        L_0x0043:
            r3 = r15
        L_0x0044:
            e7.e r4 = r0.Q
            com.google.android.exoplayer2.trackselection.f r4 = r4.f()
            r16 = r3
            r11 = r4
            r3 = r14
        L_0x004e:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a9
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0056
            goto L_0x00a6
        L_0x0056:
            com.google.android.exoplayer2.source.TrackGroupArray r7 = r0.f6964s0
            com.google.android.exoplayer2.source.TrackGroup r8 = r5.a()
            int r7 = r7.b(r8)
            int r8 = r0.f6967v0
            if (r7 != r8) goto L_0x006a
            e7.e r8 = r0.Q
            r8.o(r5)
            r11 = r5
        L_0x006a:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a6
            int r5 = r0.f6960o0
            int r5 = r5 + r15
            r0.f6960o0 = r5
            e7.k r5 = new e7.k
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r8 = r0.f6966u0
            if (r8 == 0) goto L_0x0083
            r5.b()
        L_0x0083:
            boolean r5 = r0.f6958m0
            if (r5 == 0) goto L_0x00a6
            if (r16 != 0) goto L_0x00a6
            b7.q0[] r5 = r0.f6950e0
            int[] r8 = r0.f6966u0
            r7 = r8[r7]
            r5 = r5[r7]
            r5.F()
            int r7 = r5.f(r12, r15, r15)
            r8 = -1
            if (r7 != r8) goto L_0x00a3
            int r5 = r5.r()
            if (r5 == 0) goto L_0x00a3
            r5 = r15
            goto L_0x00a4
        L_0x00a3:
            r5 = r14
        L_0x00a4:
            r16 = r5
        L_0x00a6:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x00a9:
            int r1 = r0.f6960o0
            if (r1 != 0) goto L_0x00e0
            e7.e r1 = r0.Q
            r1.l()
            r0.f6962q0 = r6
            r0.B0 = r15
            java.util.ArrayList<e7.i> r1 = r0.X
            r1.clear()
            t7.h0 r1 = r0.U
            boolean r1 = r1.i()
            if (r1 == 0) goto L_0x00db
            boolean r1 = r0.f6958m0
            if (r1 == 0) goto L_0x00d4
            b7.q0[] r1 = r0.f6950e0
            int r3 = r1.length
        L_0x00ca:
            if (r14 >= r3) goto L_0x00d4
            r4 = r1[r14]
            r4.k()
            int r14 = r14 + 1
            goto L_0x00ca
        L_0x00d4:
            t7.h0 r1 = r0.U
            r1.g()
            goto L_0x0146
        L_0x00db:
            r19.W()
            goto L_0x0146
        L_0x00e0:
            java.util.ArrayList<e7.i> r1 = r0.X
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0133
            boolean r1 = w7.q0.e(r11, r4)
            if (r1 != 0) goto L_0x0133
            boolean r1 = r0.C0
            if (r1 != 0) goto L_0x012a
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f9
            long r3 = -r12
        L_0x00f9:
            r6 = r3
            e7.i r1 = r19.E()
            e7.e r3 = r0.Q
            d7.m[] r17 = r3.a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<e7.i> r10 = r0.Y
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.c(r4, r6, r8, r10, r11)
            e7.e r3 = r0.Q
            com.google.android.exoplayer2.source.TrackGroup r3 = r3.e()
            com.google.android.exoplayer2.Format r1 = r1.f6517c
            int r1 = r3.b(r1)
            int r3 = r18.k()
            if (r3 == r1) goto L_0x0128
            goto L_0x012a
        L_0x0128:
            r1 = r14
            goto L_0x012b
        L_0x012a:
            r1 = r15
        L_0x012b:
            if (r1 == 0) goto L_0x0133
            r0.B0 = r15
            r1 = r15
            r16 = r1
            goto L_0x0135
        L_0x0133:
            r1 = r26
        L_0x0135:
            if (r16 == 0) goto L_0x0146
            r0.Y(r12, r1)
        L_0x013a:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0146
            r1 = r2[r14]
            if (r1 == 0) goto L_0x0143
            r23[r14] = r15
        L_0x0143:
            int r14 = r14 + 1
            goto L_0x013a
        L_0x0146:
            r0.e0(r2)
            r0.C0 = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.o.Z(com.google.android.exoplayer2.trackselection.f[], boolean[], b7.r0[], boolean[], long, boolean):boolean");
    }

    public j6.s a(int i10, int i11) {
        q0[] q0VarArr = this.f6950e0;
        int length = q0VarArr.length;
        boolean z10 = false;
        if (i11 == 1) {
            int i12 = this.f6953h0;
            if (i12 != -1) {
                if (this.f6952g0) {
                    return this.f6951f0[i12] == i10 ? q0VarArr[i12] : A(i10, i11);
                }
                this.f6952g0 = true;
                this.f6951f0[i12] = i10;
                return q0VarArr[i12];
            } else if (this.E0) {
                return A(i10, i11);
            }
        } else if (i11 == 2) {
            int i13 = this.f6955j0;
            if (i13 != -1) {
                if (this.f6954i0) {
                    return this.f6951f0[i13] == i10 ? q0VarArr[i13] : A(i10, i11);
                }
                this.f6954i0 = true;
                this.f6951f0[i13] = i10;
                return q0VarArr[i13];
            } else if (this.E0) {
                return A(i10, i11);
            }
        } else {
            for (int i14 = 0; i14 < length; i14++) {
                if (this.f6951f0[i14] == i10) {
                    return this.f6950e0[i14];
                }
            }
            if (this.E0) {
                return A(i10, i11);
            }
        }
        b bVar = new b(this.R);
        bVar.H(this.F0);
        bVar.J(this.G0);
        bVar.I(this);
        int i15 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f6951f0, i15);
        this.f6951f0 = copyOf;
        copyOf[length] = i10;
        q0[] q0VarArr2 = (q0[]) Arrays.copyOf(this.f6950e0, i15);
        this.f6950e0 = q0VarArr2;
        q0VarArr2[length] = bVar;
        boolean[] copyOf2 = Arrays.copyOf(this.f6970y0, i15);
        this.f6970y0 = copyOf2;
        if (i11 == 1 || i11 == 2) {
            z10 = true;
        }
        copyOf2[length] = z10;
        this.f6968w0 |= z10;
        if (i11 == 1) {
            this.f6952g0 = true;
            this.f6953h0 = length;
        } else if (i11 == 2) {
            this.f6954i0 = true;
            this.f6955j0 = length;
        }
        if (G(i11) > G(this.f6956k0)) {
            this.f6957l0 = length;
            this.f6956k0 = i11;
        }
        this.f6969x0 = Arrays.copyOf(this.f6969x0, i15);
        return bVar;
    }

    public void a0(boolean z10) {
        this.Q.n(z10);
    }

    public long b() {
        if (J()) {
            return this.A0;
        }
        if (this.D0) {
            return Long.MIN_VALUE;
        }
        return E().f6521g;
    }

    public void b0(long j10) {
        this.F0 = j10;
        for (q0 H : this.f6950e0) {
            H.H(j10);
        }
    }

    public int c0(int i10, long j10) {
        if (J()) {
            return 0;
        }
        q0 q0Var = this.f6950e0[i10];
        if (this.D0 && j10 > q0Var.q()) {
            return q0Var.g();
        }
        int f10 = q0Var.f(j10, true, true);
        if (f10 == -1) {
            return 0;
        }
        return f10;
    }

    public boolean d(long j10) {
        List<i> list;
        long max;
        if (this.D0 || this.U.i()) {
            return false;
        }
        if (J()) {
            list = Collections.emptyList();
            max = this.A0;
        } else {
            list = this.Y;
            i E = E();
            max = E.h() ? E.f6521g : Math.max(this.f6971z0, E.f6520f);
        }
        this.Q.d(j10, max, list, this.W);
        e.c cVar = this.W;
        boolean z10 = cVar.f6910b;
        d dVar = cVar.f6909a;
        Uri uri = cVar.f6911c;
        cVar.a();
        if (z10) {
            this.A0 = c.f4201b;
            this.D0 = true;
            return true;
        } else if (dVar == null) {
            if (uri != null) {
                this.P.l(uri);
            }
            return false;
        } else {
            if (I(dVar)) {
                this.A0 = c.f4201b;
                i iVar = (i) dVar;
                iVar.m(this);
                this.X.add(iVar);
                this.f6961p0 = iVar.f6517c;
            }
            this.V.G(dVar.f6515a, dVar.f6516b, this.O, dVar.f6517c, dVar.f6518d, dVar.f6519e, dVar.f6520f, dVar.f6521g, this.U.l(dVar, this, this.T.c(dVar.f6516b)));
            return true;
        }
    }

    public void d0(int i10) {
        int i11 = this.f6966u0[i10];
        w7.a.i(this.f6969x0[i11]);
        this.f6969x0[i11] = false;
    }

    public long e() {
        if (this.D0) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.A0;
        }
        long j10 = this.f6971z0;
        i E = E();
        if (!E.h()) {
            if (this.X.size() > 1) {
                ArrayList<i> arrayList = this.X;
                E = arrayList.get(arrayList.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j10 = Math.max(j10, E.f6521g);
        }
        if (this.f6958m0) {
            for (q0 q10 : this.f6950e0) {
                j10 = Math.max(j10, q10.q());
            }
        }
        return j10;
    }

    public final void e0(r0[] r0VarArr) {
        this.f6948c0.clear();
        for (k kVar : r0VarArr) {
            if (kVar != null) {
                this.f6948c0.add(kVar);
            }
        }
    }

    public void f(long j10) {
    }

    public void i() {
        W();
    }

    public void l(Format format) {
        this.f6947b0.post(this.Z);
    }

    public void o() throws IOException {
        N();
    }

    public void q(q qVar) {
    }

    public void r() {
        this.E0 = true;
        this.f6947b0.post(this.f6946a0);
    }

    public TrackGroupArray t() {
        return this.f6964s0;
    }

    public void u(long j10, boolean z10) {
        if (this.f6958m0 && !J()) {
            int length = this.f6950e0.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f6950e0[i10].j(j10, z10, this.f6969x0[i10]);
            }
        }
    }

    public int x(int i10) {
        int i11 = this.f6966u0[i10];
        if (i11 == -1) {
            return this.f6965t0.b(this.f6964s0.a(i10)) == -1 ? -2 : -3;
        }
        boolean[] zArr = this.f6969x0;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    public final void y() {
        int length = this.f6950e0.length;
        boolean z10 = false;
        int i10 = 6;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (i12 >= length) {
                break;
            }
            String str = this.f6950e0[i12].s().W;
            if (!s.n(str)) {
                i13 = s.l(str) ? 1 : s.m(str) ? 3 : 6;
            }
            if (G(i13) > G(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        TrackGroup e10 = this.Q.e();
        int i14 = e10.O;
        this.f6967v0 = -1;
        this.f6966u0 = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f6966u0[i15] = i15;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i16 = 0; i16 < length; i16++) {
            Format s10 = this.f6950e0[i16].s();
            if (i16 == i11) {
                Format[] formatArr = new Format[i14];
                if (i14 == 1) {
                    formatArr[0] = s10.f(e10.a(0));
                } else {
                    for (int i17 = 0; i17 < i14; i17++) {
                        formatArr[i17] = B(e10.a(i17), s10, true);
                    }
                }
                trackGroupArr[i16] = new TrackGroup(formatArr);
                this.f6967v0 = i16;
            } else {
                trackGroupArr[i16] = new TrackGroup(B((i10 != 2 || !s.l(s10.W)) ? null : this.S, s10, false));
            }
        }
        this.f6964s0 = new TrackGroupArray(trackGroupArr);
        if (this.f6965t0 == null) {
            z10 = true;
        }
        w7.a.i(z10);
        this.f6965t0 = TrackGroupArray.R;
    }

    public void z() {
        if (!this.f6959n0) {
            d(this.f6971z0);
        }
    }
}
