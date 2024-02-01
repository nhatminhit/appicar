package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import b6.i;
import b6.s0;
import b6.t0;
import b6.x0;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import java.util.Arrays;
import q7.n;
import q7.o;
import w7.q0;

public abstract class d extends n {
    @o0

    /* renamed from: c  reason: collision with root package name */
    public a f5427c;

    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final int f5428h = 0;

        /* renamed from: i  reason: collision with root package name */
        public static final int f5429i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f5430j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f5431k = 3;
        @Deprecated

        /* renamed from: a  reason: collision with root package name */
        public final int f5432a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5433b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f5434c;

        /* renamed from: d  reason: collision with root package name */
        public final TrackGroupArray[] f5435d;

        /* renamed from: e  reason: collision with root package name */
        public final int[] f5436e;

        /* renamed from: f  reason: collision with root package name */
        public final int[][][] f5437f;

        /* renamed from: g  reason: collision with root package name */
        public final TrackGroupArray f5438g;

        public a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f5434c = iArr;
            this.f5435d = trackGroupArrayArr;
            this.f5437f = iArr3;
            this.f5436e = iArr2;
            this.f5438g = trackGroupArray;
            int length = iArr.length;
            this.f5433b = length;
            this.f5432a = length;
        }

        public int a(int i10, int i11, boolean z10) {
            int i12 = this.f5435d[i10].a(i11).O;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int h10 = h(i10, i11, i14);
                if (h10 == 4 || (z10 && h10 == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f5435d[i10].a(i11).a(iArr[i12]).W;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !q0.e(str, str2);
                }
                i13 = Math.min(i13, this.f5437f[i10][i11][i12] & 24);
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f5436e[i10]) : i13;
        }

        public int c() {
            return this.f5433b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            r1 = r1 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.f5437f
                r8 = r0[r8]
                r0 = 0
                r1 = r0
                r2 = r1
            L_0x0007:
                int r3 = r8.length
                if (r1 >= r3) goto L_0x0028
                r3 = r0
            L_0x000b:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L_0x0025
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L_0x001d
                r6 = 4
                if (r4 == r6) goto L_0x001c
                r4 = 1
                goto L_0x001e
            L_0x001c:
                return r5
            L_0x001d:
                r4 = 2
            L_0x001e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto L_0x000b
            L_0x0025:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0028:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.d.a.d(int):int");
        }

        public int e(int i10) {
            return this.f5434c[i10];
        }

        @Deprecated
        public int f(int i10, int i11, int i12) {
            return h(i10, i11, i12);
        }

        public TrackGroupArray g(int i10) {
            return this.f5435d[i10];
        }

        public int h(int i10, int i11, int i12) {
            return this.f5437f[i10][i11][i12] & 7;
        }

        @Deprecated
        public int i(int i10) {
            return j(i10);
        }

        public int j(int i10) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f5433b; i12++) {
                if (this.f5434c[i12] == i10) {
                    i11 = Math.max(i11, d(i12));
                }
            }
            return i11;
        }

        @Deprecated
        public TrackGroupArray k() {
            return l();
        }

        public TrackGroupArray l() {
            return this.f5438g;
        }
    }

    public static int f(s0[] s0VarArr, TrackGroup trackGroup) throws i {
        int length = s0VarArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < s0VarArr.length; i11++) {
            s0 s0Var = s0VarArr[i11];
            for (int i12 = 0; i12 < trackGroup.O; i12++) {
                int b10 = s0Var.b(trackGroup.a(i12)) & 7;
                if (b10 > i10) {
                    if (b10 == 4) {
                        return i11;
                    }
                    length = i11;
                    i10 = b10;
                }
            }
        }
        return length;
    }

    public static int[] h(s0 s0Var, TrackGroup trackGroup) throws i {
        int[] iArr = new int[trackGroup.O];
        for (int i10 = 0; i10 < trackGroup.O; i10++) {
            iArr[i10] = s0Var.b(trackGroup.a(i10));
        }
        return iArr;
    }

    public static int[] i(s0[] s0VarArr) throws i {
        int length = s0VarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = s0VarArr[i10].l();
        }
        return iArr;
    }

    public final void d(Object obj) {
        this.f5427c = (a) obj;
    }

    public final o e(s0[] s0VarArr, TrackGroupArray trackGroupArray, y.a aVar, x0 x0Var) throws i {
        int[] iArr = new int[(s0VarArr.length + 1)];
        int length = s0VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[(s0VarArr.length + 1)][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroupArray.O;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] i12 = i(s0VarArr);
        for (int i13 = 0; i13 < trackGroupArray.O; i13++) {
            TrackGroup a10 = trackGroupArray.a(i13);
            int f10 = f(s0VarArr, a10);
            int[] h10 = f10 == s0VarArr.length ? new int[a10.O] : h(s0VarArr[f10], a10);
            int i14 = iArr[f10];
            trackGroupArr[f10][i14] = a10;
            iArr2[f10][i14] = h10;
            iArr[f10] = i14 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[s0VarArr.length];
        int[] iArr3 = new int[s0VarArr.length];
        for (int i15 = 0; i15 < s0VarArr.length; i15++) {
            int i16 = iArr[i15];
            trackGroupArrayArr[i15] = new TrackGroupArray((TrackGroup[]) q0.E0(trackGroupArr[i15], i16));
            iArr2[i15] = (int[][]) q0.E0(iArr2[i15], i16);
            iArr3[i15] = s0VarArr[i15].f();
        }
        a aVar2 = new a(iArr3, trackGroupArrayArr, i12, iArr2, new TrackGroupArray((TrackGroup[]) q0.E0(trackGroupArr[s0VarArr.length], iArr[s0VarArr.length])));
        Pair<t0[], f[]> j10 = j(aVar2, iArr2, i12);
        return new o((t0[]) j10.first, (f[]) j10.second, aVar2);
    }

    @o0
    public final a g() {
        return this.f5427c;
    }

    public abstract Pair<t0[], f[]> j(a aVar, int[][][] iArr, int[] iArr2) throws i;
}
