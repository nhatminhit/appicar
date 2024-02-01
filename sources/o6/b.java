package o6;

import android.util.Pair;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o6.a;
import w7.p;
import w7.q0;
import w7.s;
import w7.w;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11139a = "AtomParsers";

    /* renamed from: b  reason: collision with root package name */
    public static final int f11140b = q0.T("vide");

    /* renamed from: c  reason: collision with root package name */
    public static final int f11141c = q0.T("soun");

    /* renamed from: d  reason: collision with root package name */
    public static final int f11142d = q0.T("text");

    /* renamed from: e  reason: collision with root package name */
    public static final int f11143e = q0.T("sbtl");

    /* renamed from: f  reason: collision with root package name */
    public static final int f11144f = q0.T("subt");

    /* renamed from: g  reason: collision with root package name */
    public static final int f11145g = q0.T("clcp");

    /* renamed from: h  reason: collision with root package name */
    public static final int f11146h = q0.T("meta");

    /* renamed from: i  reason: collision with root package name */
    public static final int f11147i = q0.T("mdta");

    /* renamed from: j  reason: collision with root package name */
    public static final int f11148j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final byte[] f11149k = q0.m0("OpusHead");

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11150a;

        /* renamed from: b  reason: collision with root package name */
        public int f11151b;

        /* renamed from: c  reason: collision with root package name */
        public int f11152c;

        /* renamed from: d  reason: collision with root package name */
        public long f11153d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f11154e;

        /* renamed from: f  reason: collision with root package name */
        public final w f11155f;

        /* renamed from: g  reason: collision with root package name */
        public final w f11156g;

        /* renamed from: h  reason: collision with root package name */
        public int f11157h;

        /* renamed from: i  reason: collision with root package name */
        public int f11158i;

        public a(w wVar, w wVar2, boolean z10) {
            this.f11156g = wVar;
            this.f11155f = wVar2;
            this.f11154e = z10;
            wVar2.Q(12);
            this.f11150a = wVar2.H();
            wVar.Q(12);
            this.f11158i = wVar.H();
            w7.a.j(wVar.l() != 1 ? false : true, "first_chunk must be 1");
            this.f11151b = -1;
        }

        public boolean a() {
            int i10 = this.f11151b + 1;
            this.f11151b = i10;
            if (i10 == this.f11150a) {
                return false;
            }
            this.f11153d = this.f11154e ? this.f11155f.I() : this.f11155f.F();
            if (this.f11151b == this.f11157h) {
                this.f11152c = this.f11156g.H();
                this.f11156g.R(4);
                int i11 = this.f11158i - 1;
                this.f11158i = i11;
                this.f11157h = i11 > 0 ? this.f11156g.H() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: o6.b$b  reason: collision with other inner class name */
    public interface C0193b {
        boolean a();

        int b();

        int c();
    }

    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final int f11159e = 8;

        /* renamed from: a  reason: collision with root package name */
        public final m[] f11160a;

        /* renamed from: b  reason: collision with root package name */
        public Format f11161b;

        /* renamed from: c  reason: collision with root package name */
        public int f11162c;

        /* renamed from: d  reason: collision with root package name */
        public int f11163d = 0;

        public c(int i10) {
            this.f11160a = new m[i10];
        }
    }

    public static final class d implements C0193b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11164a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11165b;

        /* renamed from: c  reason: collision with root package name */
        public final w f11166c;

        public d(a.b bVar) {
            w wVar = bVar.f11138m1;
            this.f11166c = wVar;
            wVar.Q(12);
            this.f11164a = wVar.H();
            this.f11165b = wVar.H();
        }

        public boolean a() {
            return this.f11164a != 0;
        }

        public int b() {
            return this.f11165b;
        }

        public int c() {
            int i10 = this.f11164a;
            return i10 == 0 ? this.f11166c.H() : i10;
        }
    }

    public static final class e implements C0193b {

        /* renamed from: a  reason: collision with root package name */
        public final w f11167a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11168b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11169c;

        /* renamed from: d  reason: collision with root package name */
        public int f11170d;

        /* renamed from: e  reason: collision with root package name */
        public int f11171e;

        public e(a.b bVar) {
            w wVar = bVar.f11138m1;
            this.f11167a = wVar;
            wVar.Q(12);
            this.f11169c = wVar.H() & 255;
            this.f11168b = wVar.H();
        }

        public boolean a() {
            return false;
        }

        public int b() {
            return this.f11168b;
        }

        public int c() {
            int i10 = this.f11169c;
            if (i10 == 8) {
                return this.f11167a.D();
            }
            if (i10 == 16) {
                return this.f11167a.J();
            }
            int i11 = this.f11170d;
            this.f11170d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f11171e & 15;
            }
            int D = this.f11167a.D();
            this.f11171e = D;
            return (D & 240) >> 4;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f11172a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11173b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11174c;

        public f(int i10, long j10, int i11) {
            this.f11172a = i10;
            this.f11173b = j10;
            this.f11174c = i11;
        }
    }

    public static boolean a(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[q0.u(4, 0, length)] && jArr[q0.u(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int b(w wVar, int i10, int i11) {
        int c10 = wVar.c();
        while (c10 - i10 < i11) {
            wVar.Q(c10);
            int l10 = wVar.l();
            w7.a.b(l10 > 0, "childAtomSize should be positive");
            if (wVar.l() == a.f11077c0) {
                return c10;
            }
            c10 += l10;
        }
        return -1;
    }

    public static int c(int i10) {
        if (i10 == f11141c) {
            return 1;
        }
        if (i10 == f11140b) {
            return 2;
        }
        if (i10 == f11142d || i10 == f11143e || i10 == f11144f || i10 == f11145g) {
            return 3;
        }
        return i10 == f11146h ? 4 : -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.String} */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0266: MOVE  (r8v4 java.lang.String) = (r25v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0221  */
    public static void d(w7.w r28, int r29, int r30, int r31, int r32, java.lang.String r33, boolean r34, com.google.android.exoplayer2.drm.DrmInitData r35, o6.b.c r36, int r37) throws b6.j0 {
        /*
            r0 = r28
            r1 = r30
            r2 = r31
            r14 = r33
            r3 = r35
            r15 = r36
            int r4 = r1 + 8
            r5 = 8
            int r4 = r4 + r5
            r0.Q(r4)
            r4 = 6
            r13 = 0
            if (r34 == 0) goto L_0x0020
            int r5 = r28.J()
            r0.R(r4)
            goto L_0x0024
        L_0x0020:
            r0.R(r5)
            r5 = r13
        L_0x0024:
            r12 = 2
            r6 = 16
            r11 = 1
            if (r5 == 0) goto L_0x0046
            if (r5 != r11) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            if (r5 != r12) goto L_0x0045
            r0.R(r6)
            double r4 = r28.j()
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            int r5 = r28.H()
            r6 = 20
            r0.R(r6)
            goto L_0x0057
        L_0x0045:
            return
        L_0x0046:
            int r7 = r28.J()
            r0.R(r4)
            int r4 = r28.E()
            if (r5 != r11) goto L_0x0056
            r0.R(r6)
        L_0x0056:
            r5 = r7
        L_0x0057:
            int r6 = r28.c()
            int r7 = o6.a.f11121t0
            r16 = 0
            r8 = r29
            if (r8 != r7) goto L_0x008b
            android.util.Pair r7 = p(r0, r1, r2)
            if (r7 == 0) goto L_0x0088
            java.lang.Object r8 = r7.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0076
            r3 = r16
            goto L_0x0080
        L_0x0076:
            java.lang.Object r9 = r7.second
            o6.m r9 = (o6.m) r9
            java.lang.String r9 = r9.f11296b
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.c(r9)
        L_0x0080:
            o6.m[] r9 = r15.f11160a
            java.lang.Object r7 = r7.second
            o6.m r7 = (o6.m) r7
            r9[r37] = r7
        L_0x0088:
            r0.Q(r6)
        L_0x008b:
            r10 = r3
            int r3 = o6.a.G
            java.lang.String r9 = "audio/raw"
            if (r8 != r3) goto L_0x0096
            java.lang.String r3 = "audio/ac3"
            goto L_0x0106
        L_0x0096:
            int r3 = o6.a.I
            if (r8 != r3) goto L_0x009e
            java.lang.String r3 = "audio/eac3"
            goto L_0x0106
        L_0x009e:
            int r3 = o6.a.K
            if (r8 != r3) goto L_0x00a6
            java.lang.String r3 = "audio/ac4"
            goto L_0x0106
        L_0x00a6:
            int r3 = o6.a.M
            if (r8 != r3) goto L_0x00ae
            java.lang.String r3 = "audio/vnd.dts"
            goto L_0x0106
        L_0x00ae:
            int r3 = o6.a.N
            if (r8 == r3) goto L_0x0104
            int r3 = o6.a.O
            if (r8 != r3) goto L_0x00b7
            goto L_0x0104
        L_0x00b7:
            int r3 = o6.a.P
            if (r8 != r3) goto L_0x00be
            java.lang.String r3 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x0106
        L_0x00be:
            int r3 = o6.a.R0
            if (r8 != r3) goto L_0x00c5
            java.lang.String r3 = "audio/3gpp"
            goto L_0x0106
        L_0x00c5:
            int r3 = o6.a.S0
            if (r8 != r3) goto L_0x00cc
            java.lang.String r3 = "audio/amr-wb"
            goto L_0x0106
        L_0x00cc:
            int r3 = o6.a.E
            if (r8 == r3) goto L_0x0102
            int r3 = o6.a.F
            if (r8 != r3) goto L_0x00d5
            goto L_0x0102
        L_0x00d5:
            int r3 = o6.a.C
            if (r8 != r3) goto L_0x00dc
            java.lang.String r3 = "audio/mpeg"
            goto L_0x0106
        L_0x00dc:
            int r3 = o6.a.f11087f1
            if (r8 != r3) goto L_0x00e3
            java.lang.String r3 = "audio/alac"
            goto L_0x0106
        L_0x00e3:
            int r3 = o6.a.f11090g1
            if (r8 != r3) goto L_0x00ea
            java.lang.String r3 = "audio/g711-alaw"
            goto L_0x0106
        L_0x00ea:
            int r3 = o6.a.f11093h1
            if (r8 != r3) goto L_0x00f1
            java.lang.String r3 = "audio/g711-mlaw"
            goto L_0x0106
        L_0x00f1:
            int r3 = o6.a.f11096i1
            if (r8 != r3) goto L_0x00f8
            java.lang.String r3 = "audio/opus"
            goto L_0x0106
        L_0x00f8:
            int r3 = o6.a.f11102k1
            if (r8 != r3) goto L_0x00ff
            java.lang.String r3 = "audio/flac"
            goto L_0x0106
        L_0x00ff:
            r3 = r16
            goto L_0x0106
        L_0x0102:
            r3 = r9
            goto L_0x0106
        L_0x0104:
            java.lang.String r3 = "audio/vnd.dts.hd"
        L_0x0106:
            r8 = r3
            r18 = r4
            r17 = r5
            r7 = r6
            r19 = r16
        L_0x010e:
            int r3 = r7 - r1
            r4 = -1
            if (r3 >= r2) goto L_0x025a
            r0.Q(r7)
            int r6 = r28.l()
            if (r6 <= 0) goto L_0x011e
            r3 = r11
            goto L_0x011f
        L_0x011e:
            r3 = r13
        L_0x011f:
            java.lang.String r5 = "childAtomSize should be positive"
            w7.a.b(r3, r5)
            int r3 = r28.l()
            int r5 = o6.a.f11077c0
            if (r3 == r5) goto L_0x020c
            if (r34 == 0) goto L_0x013f
            int r11 = o6.a.D
            if (r3 != r11) goto L_0x013f
            r25 = r8
            r26 = r9
            r21 = r10
            r22 = r12
            r1 = r13
            r20 = 1
            goto L_0x0217
        L_0x013f:
            int r4 = o6.a.H
            if (r3 != r4) goto L_0x015f
            int r3 = r7 + 8
            r0.Q(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.Format r3 = d6.a.d(r0, r3, r14, r10)
        L_0x0150:
            r15.f11161b = r3
            r25 = r8
            r26 = r9
            r21 = r10
            r22 = r12
            r1 = r13
            r20 = 1
            goto L_0x01fa
        L_0x015f:
            int r4 = o6.a.J
            if (r3 != r4) goto L_0x0171
            int r3 = r7 + 8
            r0.Q(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.Format r3 = d6.a.g(r0, r3, r14, r10)
            goto L_0x0150
        L_0x0171:
            int r4 = o6.a.L
            if (r3 != r4) goto L_0x0183
            int r3 = r7 + 8
            r0.Q(r3)
            java.lang.String r3 = java.lang.Integer.toString(r32)
            com.google.android.exoplayer2.Format r3 = d6.b.b(r0, r3, r14, r10)
            goto L_0x0150
        L_0x0183:
            int r4 = o6.a.Q
            if (r3 != r4) goto L_0x01be
            java.lang.String r3 = java.lang.Integer.toString(r32)
            r5 = 0
            r11 = -1
            r21 = -1
            r22 = 0
            r23 = 0
            r4 = r8
            r24 = r6
            r6 = r11
            r11 = r7
            r7 = r21
            r25 = r8
            r8 = r17
            r26 = r9
            r9 = r18
            r21 = r10
            r10 = r22
            r27 = r11
            r20 = 1
            r11 = r21
            r22 = r12
            r12 = r23
            r1 = r13
            r13 = r33
            com.google.android.exoplayer2.Format r3 = com.google.android.exoplayer2.Format.r(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.f11161b = r3
            r6 = r24
            r7 = r27
            goto L_0x01fa
        L_0x01be:
            r24 = r6
            r27 = r7
            r25 = r8
            r26 = r9
            r21 = r10
            r22 = r12
            r1 = r13
            r20 = 1
            int r4 = o6.a.f11099j1
            if (r3 != r4) goto L_0x01ed
            r6 = r24
            int r3 = r6 + -8
            byte[] r4 = f11149k
            int r5 = r4.length
            int r5 = r5 + r3
            byte[] r5 = new byte[r5]
            int r7 = r4.length
            java.lang.System.arraycopy(r4, r1, r5, r1, r7)
            r7 = r27
            int r8 = r7 + 8
            r0.Q(r8)
            int r4 = r4.length
            r0.i(r5, r4, r3)
            r19 = r5
            goto L_0x01fa
        L_0x01ed:
            r6 = r24
            r7 = r27
            int r4 = o6.a.f11105l1
            if (r6 == r4) goto L_0x01fd
            int r4 = o6.a.f11087f1
            if (r3 != r4) goto L_0x01fa
            goto L_0x01fd
        L_0x01fa:
            r8 = r25
            goto L_0x024c
        L_0x01fd:
            int r3 = r6 + -12
            byte[] r4 = new byte[r3]
            int r5 = r7 + 12
            r0.Q(r5)
            r0.i(r4, r1, r3)
            r19 = r4
            goto L_0x01fa
        L_0x020c:
            r25 = r8
            r26 = r9
            r21 = r10
            r20 = r11
            r22 = r12
            r1 = r13
        L_0x0217:
            if (r3 != r5) goto L_0x021b
            r3 = r7
            goto L_0x021f
        L_0x021b:
            int r3 = b(r0, r7, r6)
        L_0x021f:
            if (r3 == r4) goto L_0x01fa
            android.util.Pair r3 = g(r0, r3)
            java.lang.Object r4 = r3.first
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r3 = r3.second
            r19 = r3
            byte[] r19 = (byte[]) r19
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x024c
            android.util.Pair r3 = w7.d.j(r19)
            java.lang.Object r4 = r3.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r18 = r4.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r17 = r3.intValue()
        L_0x024c:
            int r7 = r7 + r6
            r13 = r1
            r11 = r20
            r10 = r21
            r12 = r22
            r9 = r26
            r1 = r30
            goto L_0x010e
        L_0x025a:
            r25 = r8
            r26 = r9
            r21 = r10
            r22 = r12
            com.google.android.exoplayer2.Format r0 = r15.f11161b
            if (r0 != 0) goto L_0x0298
            r8 = r25
            if (r8 == 0) goto L_0x0298
            r0 = r26
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0275
            r7 = r22
            goto L_0x0276
        L_0x0275:
            r7 = r4
        L_0x0276:
            java.lang.String r0 = java.lang.Integer.toString(r32)
            r2 = 0
            r3 = -1
            r4 = -1
            if (r19 != 0) goto L_0x0280
            goto L_0x0286
        L_0x0280:
            java.util.List r1 = java.util.Collections.singletonList(r19)
            r16 = r1
        L_0x0286:
            r10 = 0
            r1 = r8
            r5 = r17
            r6 = r18
            r8 = r16
            r9 = r21
            r11 = r33
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.q(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.f11161b = r0
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.b.d(w7.w, int, int, int, int, java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData, o6.b$c, int):void");
    }

    public static Pair<Integer, m> e(w wVar, int i10, int i11) {
        int i12 = i10 + 8;
        boolean z10 = false;
        int i13 = -1;
        String str = null;
        Integer num = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            wVar.Q(i12);
            int l10 = wVar.l();
            int l11 = wVar.l();
            if (l11 == a.f11123u0) {
                num = Integer.valueOf(wVar.l());
            } else if (l11 == a.f11113p0) {
                wVar.R(4);
                str = wVar.A(4);
            } else if (l11 == a.f11115q0) {
                i13 = i12;
                i14 = l10;
            }
            i12 += l10;
        }
        if (!"cenc".equals(str) && !b6.c.f4279u1.equals(str) && !b6.c.f4283v1.equals(str) && !b6.c.f4287w1.equals(str)) {
            return null;
        }
        w7.a.b(num != null, "frma atom is mandatory");
        w7.a.b(i13 != -1, "schi atom is mandatory");
        m q10 = q(wVar, i13, i14, str);
        if (q10 != null) {
            z10 = true;
        }
        w7.a.b(z10, "tenc atom is mandatory");
        return Pair.create(num, q10);
    }

    public static Pair<long[], long[]> f(a.C0192a aVar) {
        a.b h10;
        if (aVar == null || (h10 = aVar.h(a.f11098j0)) == null) {
            return Pair.create((Object) null, (Object) null);
        }
        w wVar = h10.f11138m1;
        wVar.Q(8);
        int c10 = a.c(wVar.l());
        int H = wVar.H();
        long[] jArr = new long[H];
        long[] jArr2 = new long[H];
        int i10 = 0;
        while (i10 < H) {
            jArr[i10] = c10 == 1 ? wVar.I() : wVar.F();
            jArr2[i10] = c10 == 1 ? wVar.w() : (long) wVar.l();
            if (wVar.z() == 1) {
                wVar.R(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> g(w wVar, int i10) {
        wVar.Q(i10 + 8 + 4);
        wVar.R(1);
        h(wVar);
        wVar.R(2);
        int D = wVar.D();
        if ((D & 128) != 0) {
            wVar.R(2);
        }
        if ((D & 64) != 0) {
            wVar.R(wVar.J());
        }
        if ((D & 32) != 0) {
            wVar.R(2);
        }
        wVar.R(1);
        h(wVar);
        String e10 = s.e(wVar.D());
        if (s.f14838w.equals(e10) || s.H.equals(e10) || s.I.equals(e10)) {
            return Pair.create(e10, (Object) null);
        }
        wVar.R(12);
        wVar.R(1);
        int h10 = h(wVar);
        byte[] bArr = new byte[h10];
        wVar.i(bArr, 0, h10);
        return Pair.create(e10, bArr);
    }

    public static int h(w wVar) {
        int D = wVar.D();
        int i10 = D & 127;
        while ((D & 128) == 128) {
            D = wVar.D();
            i10 = (i10 << 7) | (D & 127);
        }
        return i10;
    }

    public static int i(w wVar) {
        wVar.Q(16);
        return wVar.l();
    }

    @o0
    public static Metadata j(w wVar, int i10) {
        wVar.R(8);
        ArrayList arrayList = new ArrayList();
        while (wVar.c() < i10) {
            Metadata.Entry d10 = g.d(wVar);
            if (d10 != null) {
                arrayList.add(d10);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public static Pair<Long, String> k(w wVar) {
        int i10 = 8;
        wVar.Q(8);
        int c10 = a.c(wVar.l());
        wVar.R(c10 == 0 ? 8 : 16);
        long F = wVar.F();
        if (c10 == 0) {
            i10 = 4;
        }
        wVar.R(i10);
        int J = wVar.J();
        return Pair.create(Long.valueOf(F), "" + ((char) (((J >> 10) & 31) + 96)) + ((char) (((J >> 5) & 31) + 96)) + ((char) ((J & 31) + 96)));
    }

    @o0
    public static Metadata l(a.C0192a aVar) {
        a.b h10 = aVar.h(a.f11104l0);
        a.b h11 = aVar.h(a.V0);
        a.b h12 = aVar.h(a.W0);
        if (h10 == null || h11 == null || h12 == null || i(h10.f11138m1) != f11147i) {
            return null;
        }
        w wVar = h11.f11138m1;
        wVar.Q(12);
        int l10 = wVar.l();
        String[] strArr = new String[l10];
        for (int i10 = 0; i10 < l10; i10++) {
            int l11 = wVar.l();
            wVar.R(4);
            strArr[i10] = wVar.A(l11 - 8);
        }
        w wVar2 = h12.f11138m1;
        wVar2.Q(8);
        ArrayList arrayList = new ArrayList();
        while (wVar2.a() > 8) {
            int c10 = wVar2.c();
            int l12 = wVar2.l();
            int l13 = wVar2.l() - 1;
            if (l13 < 0 || l13 >= l10) {
                p.l(f11139a, "Skipped metadata with unknown key index: " + l13);
            } else {
                MdtaMetadataEntry g10 = g.g(wVar2, c10 + l12, strArr[l13]);
                if (g10 != null) {
                    arrayList.add(g10);
                }
            }
            wVar2.Q(c10 + l12);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public static long m(w wVar) {
        int i10 = 8;
        wVar.Q(8);
        if (a.c(wVar.l()) != 0) {
            i10 = 16;
        }
        wVar.R(i10);
        return wVar.F();
    }

    public static float n(w wVar, int i10) {
        wVar.Q(i10 + 8);
        return ((float) wVar.H()) / ((float) wVar.H());
    }

    public static byte[] o(w wVar, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            wVar.Q(i12);
            int l10 = wVar.l();
            if (wVar.l() == a.f11081d1) {
                return Arrays.copyOfRange(wVar.f14880a, i12, l10 + i12);
            }
            i12 += l10;
        }
        return null;
    }

    public static Pair<Integer, m> p(w wVar, int i10, int i11) {
        Pair<Integer, m> e10;
        int c10 = wVar.c();
        while (c10 - i10 < i11) {
            wVar.Q(c10);
            int l10 = wVar.l();
            w7.a.b(l10 > 0, "childAtomSize should be positive");
            if (wVar.l() == a.f11111o0 && (e10 = e(wVar, c10, l10)) != null) {
                return e10;
            }
            c10 += l10;
        }
        return null;
    }

    public static m q(w wVar, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            wVar.Q(i14);
            int l10 = wVar.l();
            if (wVar.l() == a.f11117r0) {
                int c10 = a.c(wVar.l());
                wVar.R(1);
                if (c10 == 0) {
                    wVar.R(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int D = wVar.D();
                    i12 = D & 15;
                    i13 = (D & 240) >> 4;
                }
                boolean z10 = wVar.D() == 1;
                int D2 = wVar.D();
                byte[] bArr2 = new byte[16];
                wVar.i(bArr2, 0, 16);
                if (z10 && D2 == 0) {
                    int D3 = wVar.D();
                    bArr = new byte[D3];
                    wVar.i(bArr, 0, D3);
                }
                return new m(z10, str, D2, bArr2, i13, i12, bArr);
            }
            i14 += l10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o6.o r(o6.l r35, o6.a.C0192a r36, j6.m r37) throws b6.j0 {
        /*
            r1 = r35
            r0 = r36
            r2 = r37
            int r3 = o6.a.J0
            o6.a$b r3 = r0.h(r3)
            if (r3 == 0) goto L_0x0014
            o6.b$d r4 = new o6.b$d
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = o6.a.K0
            o6.a$b r3 = r0.h(r3)
            if (r3 == 0) goto L_0x04d2
            o6.b$e r4 = new o6.b$e
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.b()
            r5 = 0
            if (r3 != 0) goto L_0x0042
            o6.o r9 = new o6.o
            long[] r2 = new long[r5]
            int[] r3 = new int[r5]
            r4 = 0
            long[] r6 = new long[r5]
            int[] r7 = new int[r5]
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r9
            r1 = r35
            r5 = r6
            r6 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0042:
            int r6 = o6.a.L0
            o6.a$b r6 = r0.h(r6)
            r7 = 1
            if (r6 != 0) goto L_0x0053
            int r6 = o6.a.M0
            o6.a$b r6 = r0.h(r6)
            r8 = r7
            goto L_0x0054
        L_0x0053:
            r8 = r5
        L_0x0054:
            w7.w r6 = r6.f11138m1
            int r9 = o6.a.I0
            o6.a$b r9 = r0.h(r9)
            w7.w r9 = r9.f11138m1
            int r10 = o6.a.F0
            o6.a$b r10 = r0.h(r10)
            w7.w r10 = r10.f11138m1
            int r11 = o6.a.G0
            o6.a$b r11 = r0.h(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0072
            w7.w r11 = r11.f11138m1
            goto L_0x0073
        L_0x0072:
            r11 = r12
        L_0x0073:
            int r13 = o6.a.H0
            o6.a$b r0 = r0.h(r13)
            if (r0 == 0) goto L_0x007e
            w7.w r0 = r0.f11138m1
            goto L_0x007f
        L_0x007e:
            r0 = r12
        L_0x007f:
            o6.b$a r13 = new o6.b$a
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.Q(r6)
            int r8 = r10.H()
            int r8 = r8 - r7
            int r9 = r10.H()
            int r14 = r10.H()
            if (r0 == 0) goto L_0x00a0
            r0.Q(r6)
            int r15 = r0.H()
            goto L_0x00a1
        L_0x00a0:
            r15 = r5
        L_0x00a1:
            r16 = -1
            if (r11 == 0) goto L_0x00b5
            r11.Q(r6)
            int r6 = r11.H()
            if (r6 <= 0) goto L_0x00b7
            int r12 = r11.H()
            int r16 = r12 + -1
            goto L_0x00b6
        L_0x00b5:
            r6 = r5
        L_0x00b6:
            r12 = r11
        L_0x00b7:
            boolean r11 = r4.a()
            if (r11 == 0) goto L_0x00d1
            com.google.android.exoplayer2.Format r11 = r1.f11288f
            java.lang.String r11 = r11.W
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x00d1
            if (r8 != 0) goto L_0x00d1
            if (r15 != 0) goto L_0x00d1
            if (r6 != 0) goto L_0x00d1
            r5 = r7
            goto L_0x00d2
        L_0x00d1:
            r5 = 0
        L_0x00d2:
            r18 = 0
            if (r5 != 0) goto L_0x023b
            long[] r5 = new long[r3]
            int[] r11 = new int[r3]
            long[] r7 = new long[r3]
            r36 = r6
            int[] r6 = new int[r3]
            r23 = r10
            r2 = r16
            r25 = r18
            r27 = r25
            r1 = 0
            r10 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r16 = r15
            r15 = r14
            r14 = r9
            r34 = r8
            r8 = r36
        L_0x00f8:
            r36 = r34
            java.lang.String r9 = "AtomParsers"
            if (r1 >= r3) goto L_0x01b6
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x0104:
            if (r27 != 0) goto L_0x0121
            boolean r22 = r13.a()
            if (r22 == 0) goto L_0x0121
            r30 = r14
            r31 = r15
            long r14 = r13.f11153d
            r32 = r3
            int r3 = r13.f11152c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x0104
        L_0x0121:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x0145
            java.lang.String r2 = "Unexpected end of chunk data"
            w7.p.l(r9, r2)
            long[] r5 = java.util.Arrays.copyOf(r5, r1)
            int[] r11 = java.util.Arrays.copyOf(r11, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x01be
        L_0x0145:
            if (r0 == 0) goto L_0x0158
        L_0x0147:
            if (r24 != 0) goto L_0x0156
            if (r16 <= 0) goto L_0x0156
            int r24 = r0.H()
            int r21 = r0.l()
            int r16 = r16 + -1
            goto L_0x0147
        L_0x0156:
            int r24 = r24 + -1
        L_0x0158:
            r3 = r21
            r5[r1] = r28
            int r9 = r4.c()
            r11[r1] = r9
            if (r9 <= r10) goto L_0x0165
            r10 = r9
        L_0x0165:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x016e
            r9 = 1
            goto L_0x016f
        L_0x016e:
            r9 = 0
        L_0x016f:
            r6[r1] = r9
            if (r1 != r2) goto L_0x017f
            r9 = 1
            r6[r1] = r9
            int r8 = r8 + -1
            if (r8 <= 0) goto L_0x017f
            int r2 = r12.H()
            int r2 = r2 - r9
        L_0x017f:
            r15 = r2
            r9 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x0197
            if (r36 <= 0) goto L_0x0197
            int r2 = r23.H()
            int r3 = r23.l()
            int r14 = r36 + -1
            goto L_0x019a
        L_0x0197:
            r3 = r14
            r14 = r36
        L_0x019a:
            r36 = r2
            r2 = r11[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r9
            r34 = r14
            r14 = r36
            goto L_0x00f8
        L_0x01b6:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x01be:
            long r12 = (long) r2
            long r25 = r25 + r12
        L_0x01c1:
            if (r16 <= 0) goto L_0x01d1
            int r2 = r0.H()
            if (r2 == 0) goto L_0x01cb
            r0 = 0
            goto L_0x01d2
        L_0x01cb:
            r0.l()
            int r16 = r16 + -1
            goto L_0x01c1
        L_0x01d1:
            r0 = 1
        L_0x01d2:
            if (r8 != 0) goto L_0x01e4
            if (r30 != 0) goto L_0x01e4
            if (r1 != 0) goto L_0x01e4
            if (r36 != 0) goto L_0x01e4
            r2 = r24
            if (r2 != 0) goto L_0x01e6
            if (r0 != 0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            r12 = r35
            goto L_0x0234
        L_0x01e4:
            r2 = r24
        L_0x01e6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = "Inconsistent stbl box for track "
            r4.append(r12)
            r12 = r35
            int r13 = r12.f11283a
            r4.append(r13)
            java.lang.String r13 = ": remainingSynchronizationSamples "
            r4.append(r13)
            r4.append(r8)
            java.lang.String r8 = ", remainingSamplesAtTimestampDelta "
            r4.append(r8)
            r8 = r30
            r4.append(r8)
            java.lang.String r8 = ", remainingSamplesInChunk "
            r4.append(r8)
            r4.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r4.append(r1)
            r14 = r36
            r4.append(r14)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r4.append(r1)
            r4.append(r2)
            if (r0 != 0) goto L_0x0228
            java.lang.String r0 = ", ctts invalid"
            goto L_0x022a
        L_0x0228:
            java.lang.String r0 = ""
        L_0x022a:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            w7.p.l(r9, r0)
        L_0x0234:
            r0 = r3
            r2 = r5
            r14 = r6
            r13 = r7
            r4 = r10
            r3 = r11
            goto L_0x0279
        L_0x023b:
            r12 = r1
            r32 = r3
            int r0 = r13.f11150a
            long[] r1 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0244:
            boolean r2 = r13.a()
            if (r2 == 0) goto L_0x0255
            int r2 = r13.f11151b
            long r3 = r13.f11153d
            r1[r2] = r3
            int r3 = r13.f11152c
            r0[r2] = r3
            goto L_0x0244
        L_0x0255:
            com.google.android.exoplayer2.Format r2 = r12.f11288f
            int r3 = r2.f5079l0
            int r2 = r2.f5077j0
            int r2 = w7.q0.Z(r3, r2)
            long r3 = (long) r14
            o6.d$b r0 = o6.d.a(r2, r1, r0, r3)
            long[] r1 = r0.f11180a
            int[] r2 = r0.f11181b
            int r3 = r0.f11182c
            long[] r4 = r0.f11183d
            int[] r5 = r0.f11184e
            long r6 = r0.f11185f
            r13 = r4
            r14 = r5
            r25 = r6
            r0 = r32
            r4 = r3
            r3 = r2
            r2 = r1
        L_0x0279:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r12.f11285c
            r5 = r25
            long r7 = w7.q0.L0(r5, r7, r9)
            long[] r1 = r12.f11290h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 == 0) goto L_0x04af
            boolean r1 = r37.a()
            if (r1 == 0) goto L_0x0293
            goto L_0x04af
        L_0x0293:
            long[] r1 = r12.f11290h
            int r5 = r1.length
            r6 = 1
            if (r5 != r6) goto L_0x0327
            int r5 = r12.f11284b
            if (r5 != r6) goto L_0x0327
            int r5 = r13.length
            r6 = 2
            if (r5 < r6) goto L_0x0327
            long[] r5 = r12.f11291i
            r6 = 0
            r15 = r5[r6]
            r27 = r1[r6]
            long r5 = r12.f11285c
            long r7 = r12.f11286d
            r29 = r5
            r31 = r7
            long r5 = w7.q0.L0(r27, r29, r31)
            long r21 = r15 + r5
            r5 = r13
            r6 = r25
            r8 = r15
            r23 = r0
            r0 = r10
            r10 = r21
            boolean r5 = a(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0329
            long r6 = r25 - r21
            r5 = 0
            r8 = r13[r5]
            long r27 = r15 - r8
            com.google.android.exoplayer2.Format r5 = r12.f11288f
            int r5 = r5.f5078k0
            long r8 = (long) r5
            long r10 = r12.f11285c
            r29 = r8
            r31 = r10
            long r10 = w7.q0.L0(r27, r29, r31)
            com.google.android.exoplayer2.Format r5 = r12.f11288f
            int r5 = r5.f5078k0
            long r8 = (long) r5
            long r0 = r12.f11285c
            r36 = r14
            r14 = r10
            r10 = r0
            long r0 = w7.q0.L0(r6, r8, r10)
            int r5 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x02f2
            int r5 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x032b
        L_0x02f2:
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x032b
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x032b
            int r5 = (int) r14
            r6 = r37
            r6.f9592a = r5
            int r0 = (int) r0
            r6.f9593b = r0
            long r0 = r12.f11285c
            r5 = 1000000(0xf4240, double:4.940656E-318)
            w7.q0.N0(r13, r5, r0)
            long[] r0 = r12.f11290h
            r1 = 0
            r5 = r0[r1]
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r12.f11286d
            long r7 = w7.q0.L0(r5, r7, r9)
            o6.o r9 = new o6.o
            r0 = r9
            r1 = r35
            r5 = r13
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0327:
            r23 = r0
        L_0x0329:
            r36 = r14
        L_0x032b:
            long[] r0 = r12.f11290h
            int r1 = r0.length
            r5 = 1
            if (r1 != r5) goto L_0x036d
            r1 = 0
            r5 = r0[r1]
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x036d
            long[] r0 = r12.f11291i
            r5 = r0[r1]
            r0 = 0
        L_0x033d:
            int r1 = r13.length
            if (r0 >= r1) goto L_0x0354
            r7 = r13[r0]
            long r14 = r7 - r5
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r12.f11285c
            r18 = r7
            long r7 = w7.q0.L0(r14, r16, r18)
            r13[r0] = r7
            int r0 = r0 + 1
            goto L_0x033d
        L_0x0354:
            long r14 = r25 - r5
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f11285c
            r18 = r0
            long r7 = w7.q0.L0(r14, r16, r18)
            o6.o r9 = new o6.o
            r0 = r9
            r1 = r35
            r5 = r13
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x036d:
            int r1 = r12.f11284b
            r5 = 1
            if (r1 != r5) goto L_0x0374
            r9 = 1
            goto L_0x0375
        L_0x0374:
            r9 = 0
        L_0x0375:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x037f:
            long[] r10 = r12.f11290h
            int r11 = r10.length
            if (r6 >= r11) goto L_0x03d8
            long[] r11 = r12.f11291i
            r14 = r11[r6]
            r21 = -1
            int r11 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r11 == 0) goto L_0x03cb
            r24 = r10[r6]
            long r10 = r12.f11285c
            r21 = r3
            r22 = r4
            long r3 = r12.f11286d
            r26 = r10
            r28 = r3
            long r3 = w7.q0.L0(r24, r26, r28)
            r10 = 1
            int r11 = w7.q0.h(r13, r14, r10, r10)
            r1[r6] = r11
            long r14 = r14 + r3
            r3 = 0
            int r4 = w7.q0.h(r13, r14, r9, r3)
            r0[r6] = r4
        L_0x03af:
            r4 = r1[r6]
            r11 = r0[r6]
            if (r4 >= r11) goto L_0x03bf
            r14 = r36[r4]
            r14 = r14 & r10
            if (r14 != 0) goto L_0x03bf
            int r4 = r4 + 1
            r1[r6] = r4
            goto L_0x03af
        L_0x03bf:
            int r14 = r11 - r4
            int r7 = r7 + r14
            if (r8 == r4) goto L_0x03c6
            r4 = r10
            goto L_0x03c7
        L_0x03c6:
            r4 = r3
        L_0x03c7:
            r4 = r4 | r5
            r5 = r4
            r8 = r11
            goto L_0x03d1
        L_0x03cb:
            r21 = r3
            r22 = r4
            r3 = 0
            r10 = 1
        L_0x03d1:
            int r6 = r6 + 1
            r3 = r21
            r4 = r22
            goto L_0x037f
        L_0x03d8:
            r21 = r3
            r22 = r4
            r4 = r23
            r3 = 0
            r10 = 1
            if (r7 == r4) goto L_0x03e3
            goto L_0x03e4
        L_0x03e3:
            r10 = r3
        L_0x03e4:
            r4 = r5 | r10
            if (r4 == 0) goto L_0x03eb
            long[] r5 = new long[r7]
            goto L_0x03ec
        L_0x03eb:
            r5 = r2
        L_0x03ec:
            if (r4 == 0) goto L_0x03f1
            int[] r6 = new int[r7]
            goto L_0x03f3
        L_0x03f1:
            r6 = r21
        L_0x03f3:
            if (r4 == 0) goto L_0x03f7
            r22 = r3
        L_0x03f7:
            if (r4 == 0) goto L_0x03fc
            int[] r8 = new int[r7]
            goto L_0x03fe
        L_0x03fc:
            r8 = r36
        L_0x03fe:
            long[] r7 = new long[r7]
            r9 = r3
            r10 = r18
        L_0x0403:
            long[] r14 = r12.f11290h
            int r14 = r14.length
            if (r3 >= r14) goto L_0x0490
            long[] r14 = r12.f11291i
            r23 = r14[r3]
            r14 = r1[r3]
            r15 = r0[r3]
            r20 = r0
            if (r4 == 0) goto L_0x0428
            int r0 = r15 - r14
            java.lang.System.arraycopy(r2, r14, r5, r9, r0)
            r25 = r2
            r2 = r21
            java.lang.System.arraycopy(r2, r14, r6, r9, r0)
            r21 = r1
            r1 = r36
            java.lang.System.arraycopy(r1, r14, r8, r9, r0)
            goto L_0x0430
        L_0x0428:
            r25 = r2
            r2 = r21
            r21 = r1
            r1 = r36
        L_0x0430:
            r0 = r14
            r14 = r22
        L_0x0433:
            if (r0 >= r15) goto L_0x0474
            r16 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r1
            r26 = r2
            long r1 = r12.f11286d
            r27 = r8
            r8 = r14
            r22 = r15
            r14 = r10
            r18 = r1
            long r1 = w7.q0.L0(r14, r16, r18)
            r14 = r13[r0]
            long r28 = r14 - r23
            r30 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r12.f11285c
            r32 = r14
            long r14 = w7.q0.L0(r28, r30, r32)
            long r1 = r1 + r14
            r7[r9] = r1
            if (r4 == 0) goto L_0x0466
            r1 = r6[r9]
            if (r1 <= r8) goto L_0x0466
            r1 = r26[r0]
            r14 = r1
            goto L_0x0467
        L_0x0466:
            r14 = r8
        L_0x0467:
            int r9 = r9 + 1
            int r0 = r0 + 1
            r1 = r36
            r15 = r22
            r2 = r26
            r8 = r27
            goto L_0x0433
        L_0x0474:
            r36 = r1
            r26 = r2
            r27 = r8
            r8 = r14
            long[] r0 = r12.f11290h
            r1 = r0[r3]
            long r10 = r10 + r1
            int r3 = r3 + 1
            r22 = r8
            r0 = r20
            r1 = r21
            r2 = r25
            r21 = r26
            r8 = r27
            goto L_0x0403
        L_0x0490:
            r27 = r8
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r12.f11286d
            r14 = r10
            r18 = r0
            long r8 = w7.q0.L0(r14, r16, r18)
            o6.o r10 = new o6.o
            r0 = r10
            r1 = r35
            r2 = r5
            r3 = r6
            r4 = r22
            r5 = r7
            r6 = r27
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x04af:
            r25 = r2
            r26 = r3
            r22 = r4
            r36 = r14
            long r0 = r12.f11285c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            w7.q0.N0(r13, r2, r0)
            o6.o r9 = new o6.o
            r0 = r9
            r6 = r36
            r1 = r35
            r11 = r26
            r2 = r25
            r3 = r11
            r4 = r22
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x04d2:
            b6.j0 r0 = new b6.j0
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.b.r(o6.l, o6.a$a, j6.m):o6.o");
    }

    public static c s(w wVar, int i10, int i11, String str, DrmInitData drmInitData, boolean z10) throws j0 {
        w wVar2 = wVar;
        wVar2.Q(12);
        int l10 = wVar.l();
        c cVar = new c(l10);
        for (int i12 = 0; i12 < l10; i12++) {
            int c10 = wVar.c();
            int l11 = wVar.l();
            w7.a.b(l11 > 0, "childAtomSize should be positive");
            int l12 = wVar.l();
            if (l12 == a.f11091h || l12 == a.f11094i || l12 == a.f11119s0 || l12 == a.E0 || l12 == a.f11100k || l12 == a.f11103l || l12 == a.f11130y || l12 == a.f11108n || l12 == a.f11110o || l12 == a.f11114q || l12 == a.f11118s || l12 == a.f11120t || l12 == a.f11122u || l12 == a.f11124v) {
                y(wVar, l12, c10, l11, i10, i11, drmInitData, cVar, i12);
            } else if (l12 == a.B || l12 == a.f11121t0 || l12 == a.G || l12 == a.I || l12 == a.K || l12 == a.M || l12 == a.P || l12 == a.N || l12 == a.O || l12 == a.R0 || l12 == a.S0 || l12 == a.E || l12 == a.F || l12 == a.C || l12 == a.f11087f1 || l12 == a.f11090g1 || l12 == a.f11093h1 || l12 == a.f11096i1 || l12 == a.f11102k1) {
                d(wVar, l12, c10, l11, i10, str, z10, drmInitData, cVar, i12);
            } else if (l12 == a.C0 || l12 == a.N0 || l12 == a.O0 || l12 == a.P0 || l12 == a.Q0) {
                t(wVar, l12, c10, l11, i10, str, cVar);
            } else if (l12 == a.f11084e1) {
                cVar.f11161b = Format.w(Integer.toString(i10), s.f14822l0, (String) null, -1, (DrmInitData) null);
            }
            wVar2.Q(c10 + l11);
        }
        return cVar;
    }

    public static void t(w wVar, int i10, int i11, int i12, int i13, String str, c cVar) throws j0 {
        w wVar2 = wVar;
        int i14 = i10;
        c cVar2 = cVar;
        wVar2.Q(i11 + 8 + 8);
        int i15 = a.C0;
        String str2 = s.f14806d0;
        List list = null;
        long j10 = Long.MAX_VALUE;
        if (i14 != i15) {
            if (i14 == a.N0) {
                int i16 = (i12 - 8) - 8;
                byte[] bArr = new byte[i16];
                wVar2.i(bArr, 0, i16);
                list = Collections.singletonList(bArr);
                str2 = s.f14808e0;
            } else if (i14 == a.O0) {
                str2 = s.f14810f0;
            } else if (i14 == a.P0) {
                j10 = 0;
            } else if (i14 == a.Q0) {
                cVar2.f11163d = 1;
                str2 = s.f14812g0;
            } else {
                throw new IllegalStateException();
            }
        }
        cVar2.f11161b = Format.C(Integer.toString(i13), str2, (String) null, -1, 0, str, -1, (DrmInitData) null, j10, list);
    }

    public static f u(w wVar) {
        boolean z10;
        int i10 = 8;
        wVar.Q(8);
        int c10 = a.c(wVar.l());
        wVar.R(c10 == 0 ? 8 : 16);
        int l10 = wVar.l();
        wVar.R(4);
        int c11 = wVar.c();
        if (c10 == 0) {
            i10 = 4;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            } else if (wVar.f14880a[c11 + i12] != -1) {
                z10 = false;
                break;
            } else {
                i12++;
            }
        }
        long j10 = b6.c.f4201b;
        if (z10) {
            wVar.R(i10);
        } else {
            long F = c10 == 0 ? wVar.F() : wVar.I();
            if (F != 0) {
                j10 = F;
            }
        }
        wVar.R(16);
        int l11 = wVar.l();
        int l12 = wVar.l();
        wVar.R(4);
        int l13 = wVar.l();
        int l14 = wVar.l();
        if (l11 == 0 && l12 == 65536 && l13 == -65536 && l14 == 0) {
            i11 = 90;
        } else if (l11 == 0 && l12 == -65536 && l13 == 65536 && l14 == 0) {
            i11 = 270;
        } else if (l11 == -65536 && l12 == 0 && l13 == 0 && l14 == -65536) {
            i11 = 180;
        }
        return new f(l10, j10, i11);
    }

    public static l v(a.C0192a aVar, a.b bVar, long j10, DrmInitData drmInitData, boolean z10, boolean z11) throws j0 {
        long j11;
        a.b bVar2;
        long[] jArr;
        long[] jArr2;
        a.C0192a aVar2 = aVar;
        a.C0192a g10 = aVar2.g(a.Z);
        int c10 = c(i(g10.h(a.f11104l0).f11138m1));
        if (c10 == -1) {
            return null;
        }
        f u10 = u(aVar2.h(a.f11092h0).f11138m1);
        long j12 = b6.c.f4201b;
        if (j10 == b6.c.f4201b) {
            bVar2 = bVar;
            j11 = u10.f11173b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long m10 = m(bVar2.f11138m1);
        if (j11 != b6.c.f4201b) {
            j12 = q0.L0(j11, 1000000, m10);
        }
        long j13 = j12;
        a.C0192a g11 = g10.g(a.f11071a0).g(a.f11074b0);
        Pair<Long, String> k10 = k(g10.h(a.f11101k0).f11138m1);
        c s10 = s(g11.h(a.f11107m0).f11138m1, u10.f11172a, u10.f11174c, (String) k10.second, drmInitData, z11);
        if (!z10) {
            Pair<long[], long[]> f10 = f(aVar2.g(a.f11095i0));
            jArr = (long[]) f10.second;
            jArr2 = (long[]) f10.first;
        } else {
            jArr2 = null;
            jArr = null;
        }
        if (s10.f11161b == null) {
            return null;
        }
        return new l(u10.f11172a, c10, ((Long) k10.first).longValue(), m10, j13, s10.f11161b, s10.f11163d, s10.f11160a, s10.f11162c, jArr2, jArr);
    }

    @o0
    public static Metadata w(a.b bVar, boolean z10) {
        if (z10) {
            return null;
        }
        w wVar = bVar.f11138m1;
        wVar.Q(8);
        while (wVar.a() >= 8) {
            int c10 = wVar.c();
            int l10 = wVar.l();
            if (wVar.l() == a.U0) {
                wVar.Q(c10);
                return x(wVar, c10 + l10);
            }
            wVar.Q(c10 + l10);
        }
        return null;
    }

    @o0
    public static Metadata x(w wVar, int i10) {
        wVar.R(12);
        while (wVar.c() < i10) {
            int c10 = wVar.c();
            int l10 = wVar.l();
            if (wVar.l() == a.W0) {
                wVar.Q(c10);
                return j(wVar, c10 + l10);
            }
            wVar.Q(c10 + l10);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void y(w7.w r21, int r22, int r23, int r24, int r25, int r26, com.google.android.exoplayer2.drm.DrmInitData r27, o6.b.c r28, int r29) throws b6.j0 {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r27
            r4 = r28
            int r5 = r1 + 8
            int r5 = r5 + 8
            r0.Q(r5)
            r5 = 16
            r0.R(r5)
            int r11 = r21.J()
            int r12 = r21.J()
            r5 = 50
            r0.R(r5)
            int r5 = r21.c()
            int r6 = o6.a.f11119s0
            r7 = 0
            r8 = r22
            if (r8 != r6) goto L_0x0055
            android.util.Pair r6 = p(r0, r1, r2)
            if (r6 == 0) goto L_0x0052
            java.lang.Object r8 = r6.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r3 != 0) goto L_0x0040
            r3 = r7
            goto L_0x004a
        L_0x0040:
            java.lang.Object r9 = r6.second
            o6.m r9 = (o6.m) r9
            java.lang.String r9 = r9.f11296b
            com.google.android.exoplayer2.drm.DrmInitData r3 = r3.c(r9)
        L_0x004a:
            o6.m[] r9 = r4.f11160a
            java.lang.Object r6 = r6.second
            o6.m r6 = (o6.m) r6
            r9[r29] = r6
        L_0x0052:
            r0.Q(r5)
        L_0x0055:
            r20 = r3
            r3 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
            r18 = r3
            r3 = r7
            r14 = r3
            r17 = r14
            r16 = r9
            r9 = 0
        L_0x0063:
            int r10 = r5 - r1
            if (r10 >= r2) goto L_0x017d
            r0.Q(r5)
            int r10 = r21.c()
            int r13 = r21.l()
            if (r13 != 0) goto L_0x007d
            int r15 = r21.c()
            int r15 = r15 - r1
            if (r15 != r2) goto L_0x007d
            goto L_0x017d
        L_0x007d:
            if (r13 <= 0) goto L_0x0081
            r6 = 1
            goto L_0x0082
        L_0x0081:
            r6 = 0
        L_0x0082:
            java.lang.String r15 = "childAtomSize should be positive"
            w7.a.b(r6, r15)
            int r6 = r21.l()
            int r15 = o6.a.f11097j
            r1 = 3
            if (r6 != r15) goto L_0x00b1
            if (r7 != 0) goto L_0x0094
            r15 = 1
            goto L_0x0095
        L_0x0094:
            r15 = 0
        L_0x0095:
            w7.a.i(r15)
            int r10 = r10 + 8
            r0.Q(r10)
            x7.a r1 = x7.a.b(r21)
            java.util.List<byte[]> r14 = r1.f15147a
            int r6 = r1.f15148b
            r4.f11162c = r6
            if (r9 != 0) goto L_0x00ad
            float r1 = r1.f15151e
            r16 = r1
        L_0x00ad:
            java.lang.String r7 = "video/avc"
            goto L_0x0178
        L_0x00b1:
            int r15 = o6.a.f11106m
            if (r6 != r15) goto L_0x00d0
            if (r7 != 0) goto L_0x00b9
            r15 = 1
            goto L_0x00ba
        L_0x00b9:
            r15 = 0
        L_0x00ba:
            w7.a.i(r15)
            int r10 = r10 + 8
            r0.Q(r10)
            x7.c r1 = x7.c.a(r21)
            java.util.List<byte[]> r14 = r1.f15155a
            int r1 = r1.f15156b
            r4.f11162c = r1
            java.lang.String r7 = "video/hevc"
            goto L_0x0178
        L_0x00d0:
            int r15 = o6.a.f11126w
            if (r6 == r15) goto L_0x0169
            int r15 = o6.a.f11128x
            if (r6 != r15) goto L_0x00da
            goto L_0x0169
        L_0x00da:
            int r15 = o6.a.f11112p
            if (r6 != r15) goto L_0x00f2
            if (r7 != 0) goto L_0x00e2
            r15 = 1
            goto L_0x00e3
        L_0x00e2:
            r15 = 0
        L_0x00e3:
            w7.a.i(r15)
            int r1 = o6.a.f11108n
            if (r8 != r1) goto L_0x00ed
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x00ef
        L_0x00ed:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
        L_0x00ef:
            r7 = r1
            goto L_0x0178
        L_0x00f2:
            int r15 = o6.a.f11116r
            if (r6 != r15) goto L_0x0102
            if (r7 != 0) goto L_0x00fa
            r15 = 1
            goto L_0x00fb
        L_0x00fa:
            r15 = 0
        L_0x00fb:
            w7.a.i(r15)
            java.lang.String r7 = "video/av01"
            goto L_0x0178
        L_0x0102:
            int r15 = o6.a.f11132z
            if (r6 != r15) goto L_0x0112
            if (r7 != 0) goto L_0x010a
            r15 = 1
            goto L_0x010b
        L_0x010a:
            r15 = 0
        L_0x010b:
            w7.a.i(r15)
            java.lang.String r7 = "video/3gpp"
            goto L_0x0178
        L_0x0112:
            int r15 = o6.a.f11077c0
            if (r6 != r15) goto L_0x012e
            if (r7 != 0) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            w7.a.i(r15)
            android.util.Pair r1 = g(r0, r10)
            java.lang.Object r6 = r1.first
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r1.second
            java.util.List r14 = java.util.Collections.singletonList(r1)
            goto L_0x0178
        L_0x012e:
            int r15 = o6.a.B0
            if (r6 != r15) goto L_0x0138
            float r16 = n(r0, r10)
            r9 = 1
            goto L_0x0178
        L_0x0138:
            int r15 = o6.a.f11078c1
            if (r6 != r15) goto L_0x0141
            byte[] r17 = o(r0, r10, r13)
            goto L_0x0178
        L_0x0141:
            int r10 = o6.a.f11075b1
            if (r6 != r10) goto L_0x0178
            int r6 = r21.D()
            r0.R(r1)
            if (r6 != 0) goto L_0x0178
            int r6 = r21.D()
            if (r6 == 0) goto L_0x0166
            r10 = 1
            if (r6 == r10) goto L_0x0163
            r15 = 2
            if (r6 == r15) goto L_0x0160
            if (r6 == r1) goto L_0x015d
            goto L_0x0178
        L_0x015d:
            r18 = r1
            goto L_0x0178
        L_0x0160:
            r18 = r15
            goto L_0x0178
        L_0x0163:
            r18 = r10
            goto L_0x0178
        L_0x0166:
            r18 = 0
            goto L_0x0178
        L_0x0169:
            x7.b r1 = x7.b.a(r21)
            if (r1 == 0) goto L_0x0178
            int r6 = r1.f15152a
            r10 = 5
            if (r6 != r10) goto L_0x0178
            java.lang.String r3 = r1.f15154c
            java.lang.String r7 = "video/dolby-vision"
        L_0x0178:
            int r5 = r5 + r13
            r1 = r23
            goto L_0x0063
        L_0x017d:
            if (r7 != 0) goto L_0x0180
            return
        L_0x0180:
            java.lang.String r6 = java.lang.Integer.toString(r25)
            r9 = -1
            r10 = -1
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r19 = 0
            r8 = r3
            r15 = r26
            com.google.android.exoplayer2.Format r0 = com.google.android.exoplayer2.Format.H(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.f11161b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.b.y(w7.w, int, int, int, int, int, com.google.android.exoplayer2.drm.DrmInitData, o6.b$c, int):void");
    }
}
