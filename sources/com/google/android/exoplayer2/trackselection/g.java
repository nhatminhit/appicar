package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.f;
import d.g1;
import d.o0;
import d7.l;
import d7.m;
import d7.n;
import java.util.Arrays;
import java.util.List;

public final class g {

    public interface a {
        f a(f.a aVar);
    }

    public static f[] a(f.a[] aVarArr, a aVar) {
        f[] fVarArr = new f[aVarArr.length];
        boolean z10 = false;
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            f.a aVar2 = aVarArr[i10];
            if (aVar2 != null) {
                int[] iArr = aVar2.f5443b;
                if (iArr.length <= 1 || z10) {
                    fVarArr[i10] = new c(aVar2.f5442a, iArr[0], aVar2.f5444c, aVar2.f5445d);
                } else {
                    fVarArr[i10] = aVar.a(aVar2);
                    z10 = true;
                }
            }
        }
        return fVarArr;
    }

    public static void b(int[] iArr, Format[] formatArr, int[] iArr2, float[] fArr) {
        int i10;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == -1 && (i10 = formatArr[i11].S) != -1) {
                iArr[i11] = (int) (fArr[h(i10, iArr2)] * ((float) i10));
            }
        }
    }

    public static int c(m mVar, long j10) {
        long j11 = 0;
        long j12 = 0;
        while (true) {
            if (!mVar.next()) {
                break;
            }
            long j13 = mVar.c().f13136g;
            if (j13 == -1) {
                break;
            }
            long d10 = mVar.d() - mVar.b();
            long j14 = j11 + d10;
            if (j14 >= j10) {
                j12 += (j13 * (j10 - j11)) / d10;
                break;
            }
            j12 += j13;
            j11 = j14;
        }
        j10 = j11;
        if (j10 == 0) {
            return -1;
        }
        return (int) (((j12 * 8) * 1000000) / j10);
    }

    public static int d(List<? extends l> list, long j10) {
        if (list.isEmpty()) {
            return -1;
        }
        return c(new n(j(list), true), j10);
    }

    @g1
    public static int[] e(m[] mVarArr, Format[] formatArr, long j10, @o0 int[] iArr) {
        int length = mVarArr.length;
        w7.a.a(length == formatArr.length);
        if (length == 0) {
            return new int[0];
        }
        if (iArr == null) {
            iArr = new int[length];
        }
        if (j10 == 0) {
            Arrays.fill(iArr, -1);
            return iArr;
        }
        int[] iArr2 = new int[length];
        float[] fArr = new float[length];
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int c10 = c(mVarArr[i10], j10);
            if (c10 != -1) {
                int i11 = formatArr[i10].S;
                iArr2[i10] = i11;
                if (i11 != -1) {
                    fArr[i10] = ((float) c10) / ((float) i11);
                    z11 = true;
                }
            } else {
                iArr2[i10] = -1;
                z10 = true;
            }
            iArr[i10] = c10;
        }
        if (z10 && z11) {
            b(iArr, formatArr, iArr2, fArr);
        }
        return iArr;
    }

    public static int[] f(Format[] formatArr, List<? extends l> list, long j10, m[] mVarArr, long j11, boolean z10, @o0 int[] iArr) {
        int i10;
        int[] e10 = e(mVarArr, formatArr, j11, iArr);
        g(list, formatArr, j10, e10);
        for (int i11 = 0; i11 < e10.length; i11++) {
            int i12 = e10[i11];
            if (i12 == -1 || (z10 && (i10 = formatArr[i11].S) != -1 && i12 < i10)) {
                e10[i11] = formatArr[i11].S;
            }
        }
        return e10;
    }

    @g1
    public static int[] g(List<? extends l> list, Format[] formatArr, long j10, @o0 int[] iArr) {
        int d10;
        int i10;
        if (iArr == null) {
            iArr = new int[formatArr.length];
            Arrays.fill(iArr, -1);
        }
        if (!(j10 == 0 || (d10 = d(list, j10)) == -1 || (i10 = ((l) list.get(list.size() - 1)).f6517c.S) == -1)) {
            b(iArr, formatArr, new int[]{i10}, new float[]{((float) d10) / ((float) i10)});
        }
        return iArr;
    }

    public static int h(int i10, int[] iArr) {
        int abs;
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 != -1 && (abs = Math.abs(i14 - i10)) < i11) {
                i12 = i13;
                i11 = abs;
            }
        }
        return i12;
    }

    public static int[] i(Format[] formatArr, @o0 int[] iArr) {
        int length = formatArr.length;
        if (iArr == null) {
            iArr = new int[length];
        }
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = formatArr[i10].S;
        }
        return iArr;
    }

    public static List<? extends l> j(List<? extends l> list) {
        Format format = ((l) list.get(list.size() - 1)).f6517c;
        int size = list.size();
        for (int i10 = size - 2; i10 >= 0; i10--) {
            if (!((l) list.get(i10)).f6517c.equals(format)) {
                return list.subList(i10 + 1, size);
            }
        }
        return list;
    }

    public static DefaultTrackSelector.Parameters k(DefaultTrackSelector.Parameters parameters, int i10, TrackGroupArray trackGroupArray, boolean z10, @o0 DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.d G = parameters.a().i(i10).G(i10, z10);
        if (selectionOverride != null) {
            G.I(i10, trackGroupArray, selectionOverride);
        }
        return G.a();
    }
}
