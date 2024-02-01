package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.m;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import q7.i;
import q7.l;
import w7.q0;

public class a extends q7.a {
    public static final long A = 2000;

    /* renamed from: v  reason: collision with root package name */
    public static final int f5351v = 10000;

    /* renamed from: w  reason: collision with root package name */
    public static final int f5352w = 25000;

    /* renamed from: x  reason: collision with root package name */
    public static final int f5353x = 25000;

    /* renamed from: y  reason: collision with root package name */
    public static final float f5354y = 0.75f;

    /* renamed from: z  reason: collision with root package name */
    public static final float f5355z = 0.75f;

    /* renamed from: g  reason: collision with root package name */
    public final b f5356g;

    /* renamed from: h  reason: collision with root package name */
    public final long f5357h;

    /* renamed from: i  reason: collision with root package name */
    public final long f5358i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5359j;

    /* renamed from: k  reason: collision with root package name */
    public final float f5360k;

    /* renamed from: l  reason: collision with root package name */
    public final long f5361l;

    /* renamed from: m  reason: collision with root package name */
    public final w7.c f5362m;

    /* renamed from: n  reason: collision with root package name */
    public final Format[] f5363n;

    /* renamed from: o  reason: collision with root package name */
    public final int[] f5364o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f5365p;

    /* renamed from: q  reason: collision with root package name */
    public i f5366q;

    /* renamed from: r  reason: collision with root package name */
    public float f5367r;

    /* renamed from: s  reason: collision with root package name */
    public int f5368s;

    /* renamed from: t  reason: collision with root package name */
    public int f5369t;

    /* renamed from: u  reason: collision with root package name */
    public long f5370u;

    public interface b {
        long a();
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final t7.d f5371a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5372b;

        /* renamed from: c  reason: collision with root package name */
        public long f5373c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public long[][] f5374d;

        public c(t7.d dVar, float f10) {
            this.f5371a = dVar;
            this.f5372b = f10;
        }

        public long a() {
            long[][] jArr;
            long max = Math.max(0, ((long) (((float) this.f5371a.g()) * this.f5372b)) - this.f5373c);
            if (this.f5374d == null) {
                return max;
            }
            int i10 = 1;
            while (true) {
                jArr = this.f5374d;
                if (i10 >= jArr.length - 1 || jArr[i10][0] >= max) {
                    long[] jArr2 = jArr[i10 - 1];
                    long[] jArr3 = jArr[i10];
                    long j10 = jArr2[0];
                    long j11 = jArr2[1];
                } else {
                    i10++;
                }
            }
            long[] jArr22 = jArr[i10 - 1];
            long[] jArr32 = jArr[i10];
            long j102 = jArr22[0];
            long j112 = jArr22[1];
            return j112 + ((long) ((((float) (max - j102)) / ((float) (jArr32[0] - j102))) * ((float) (jArr32[1] - j112))));
        }

        public void b(long[][] jArr) {
            w7.a.a(jArr.length >= 2);
            this.f5374d = jArr;
        }

        public void c(long j10) {
            this.f5373c = j10;
        }
    }

    public static class d implements f.b {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final t7.d f5375a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5376b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5377c;

        /* renamed from: d  reason: collision with root package name */
        public final int f5378d;

        /* renamed from: e  reason: collision with root package name */
        public final float f5379e;

        /* renamed from: f  reason: collision with root package name */
        public final float f5380f;

        /* renamed from: g  reason: collision with root package name */
        public final long f5381g;

        /* renamed from: h  reason: collision with root package name */
        public final w7.c f5382h;

        /* renamed from: i  reason: collision with root package name */
        public i f5383i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5384j;

        public d() {
            this(10000, 25000, 25000, 0.75f, 0.75f, 2000, w7.c.f14695a);
        }

        public d(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, f10, 0.75f, 2000, w7.c.f14695a);
        }

        public d(int i10, int i11, int i12, float f10, float f11, long j10, w7.c cVar) {
            this((t7.d) null, i10, i11, i12, f10, f11, j10, cVar);
        }

        @Deprecated
        public d(t7.d dVar) {
            this(dVar, 10000, 25000, 25000, 0.75f, 0.75f, 2000, w7.c.f14695a);
        }

        @Deprecated
        public d(t7.d dVar, int i10, int i11, int i12, float f10) {
            this(dVar, i10, i11, i12, f10, 0.75f, 2000, w7.c.f14695a);
        }

        @Deprecated
        public d(@o0 t7.d dVar, int i10, int i11, int i12, float f10, float f11, long j10, w7.c cVar) {
            this.f5375a = dVar;
            this.f5376b = i10;
            this.f5377c = i11;
            this.f5378d = i12;
            this.f5379e = f10;
            this.f5380f = f11;
            this.f5381g = j10;
            this.f5382h = cVar;
            this.f5383i = i.f12028a;
        }

        public final f[] a(f.a[] aVarArr, t7.d dVar) {
            t7.d dVar2 = this.f5375a;
            if (dVar2 != null) {
                dVar = dVar2;
            }
            f[] fVarArr = new f[aVarArr.length];
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                f.a aVar = aVarArr[i11];
                if (aVar != null) {
                    int[] iArr = aVar.f5443b;
                    if (iArr.length > 1) {
                        a c10 = c(aVar.f5442a, dVar, iArr);
                        c10.z(this.f5383i);
                        arrayList.add(c10);
                        fVarArr[i11] = c10;
                    } else {
                        fVarArr[i11] = new c(aVar.f5442a, iArr[0], aVar.f5444c, aVar.f5445d);
                        int i12 = aVar.f5442a.a(aVar.f5443b[0]).S;
                        if (i12 != -1) {
                            i10 += i12;
                        }
                    }
                }
            }
            if (this.f5384j) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((a) arrayList.get(i13)).y((long) i10);
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    jArr[i14] = new long[aVar2.length()];
                    for (int i15 = 0; i15 < aVar2.length(); i15++) {
                        jArr[i14][i15] = (long) aVar2.f((aVar2.length() - i15) - 1).S;
                    }
                }
                long[][][] t10 = a.A(jArr);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((a) arrayList.get(i16)).x(t10[i16]);
                }
            }
            return fVarArr;
        }

        public /* synthetic */ f b(TrackGroup trackGroup, t7.d dVar, int... iArr) {
            return l.a(this, trackGroup, dVar, iArr);
        }

        public a c(TrackGroup trackGroup, t7.d dVar, int[] iArr) {
            return new a(trackGroup, iArr, (b) new c(dVar, this.f5379e), (long) this.f5376b, (long) this.f5377c, (long) this.f5378d, this.f5380f, this.f5381g, this.f5382h);
        }

        public final void d() {
            this.f5384j = true;
        }

        public final void e(i iVar) {
            this.f5383i = iVar;
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, b bVar, long j10, long j11, long j12, float f10, long j13, w7.c cVar) {
        super(trackGroup, iArr);
        this.f5356g = bVar;
        this.f5357h = j10 * 1000;
        this.f5358i = j11 * 1000;
        this.f5359j = j12 * 1000;
        this.f5360k = f10;
        this.f5361l = j13;
        this.f5362m = cVar;
        this.f5367r = 1.0f;
        this.f5369t = 0;
        this.f5370u = b6.c.f4201b;
        this.f5366q = i.f12028a;
        int i10 = this.f12019b;
        this.f5363n = new Format[i10];
        this.f5364o = new int[i10];
        this.f5365p = new int[i10];
        for (int i11 = 0; i11 < this.f12019b; i11++) {
            Format f11 = f(i11);
            this.f5363n[i11] = f11;
            this.f5364o[i11] = f11.S;
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, t7.d dVar) {
        this(trackGroup, iArr, dVar, 10000, 25000, 25000, 0.75f, 0.75f, 2000, w7.c.f14695a);
    }

    public a(TrackGroup trackGroup, int[] iArr, t7.d dVar, long j10, long j11, long j12, float f10, float f11, long j13, w7.c cVar) {
        this(trackGroup, iArr, new c(dVar, f10), j10, j11, j12, f11, j13, cVar);
    }

    public static long[][][] A(long[][] jArr) {
        int i10;
        long[][] jArr2 = jArr;
        double[][] B = B(jArr);
        double[][] D = D(B);
        int v10 = v(D) + 3;
        int length = B.length;
        int[] iArr = new int[3];
        iArr[2] = 2;
        iArr[1] = v10;
        int i11 = 0;
        iArr[0] = length;
        long[][][] jArr3 = (long[][][]) Array.newInstance(Long.TYPE, iArr);
        int[] iArr2 = new int[B.length];
        F(jArr3, 1, jArr2, iArr2);
        int i12 = 2;
        while (true) {
            i10 = v10 - 1;
            if (i12 >= i10) {
                break;
            }
            double d10 = Double.MAX_VALUE;
            int i13 = i11;
            int i14 = i13;
            while (i13 < B.length) {
                int i15 = iArr2[i13];
                if (i15 + 1 != B[i13].length) {
                    double d11 = D[i13][i15];
                    if (d11 < d10) {
                        i14 = i13;
                        d10 = d11;
                    }
                }
                i13++;
            }
            iArr2[i14] = iArr2[i14] + 1;
            F(jArr3, i12, jArr2, iArr2);
            i12++;
            i11 = 0;
        }
        for (long[][] jArr4 : jArr3) {
            long[] jArr5 = jArr4[i10];
            long[] jArr6 = jArr4[v10 - 2];
            jArr5[0] = jArr6[0] * 2;
            jArr5[1] = jArr6[1] * 2;
        }
        return jArr3;
    }

    public static double[][] B(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            dArr[i10] = new double[jArr[i10].length];
            int i11 = 0;
            while (true) {
                long[] jArr2 = jArr[i10];
                if (i11 >= jArr2.length) {
                    break;
                }
                double[] dArr2 = dArr[i10];
                long j10 = jArr2[i11];
                dArr2[i11] = j10 == -1 ? 0.0d : Math.log((double) j10);
                i11++;
            }
        }
        return dArr;
    }

    public static double[][] D(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double[] dArr3 = new double[(dArr[i10].length - 1)];
            dArr2[i10] = dArr3;
            if (dArr3.length != 0) {
                double[] dArr4 = dArr[i10];
                double d10 = dArr4[dArr4.length - 1] - dArr4[0];
                int i11 = 0;
                while (true) {
                    double[] dArr5 = dArr[i10];
                    if (i11 >= dArr5.length - 1) {
                        break;
                    }
                    int i12 = i11 + 1;
                    dArr2[i10][i11] = d10 == 0.0d ? 1.0d : (((dArr5[i11] + dArr5[i12]) * 0.5d) - dArr5[0]) / d10;
                    i11 = i12;
                }
            }
        }
        return dArr2;
    }

    public static void F(long[][][] jArr, int i10, long[][] jArr2, int[] iArr) {
        long j10 = 0;
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long[] jArr3 = jArr[i11][i10];
            long j11 = jArr2[i11][iArr[i11]];
            jArr3[1] = j11;
            j10 += j11;
        }
        for (long[][] jArr4 : jArr) {
            jArr4[i10][0] = j10;
        }
    }

    public static int v(double[][] dArr) {
        int i10 = 0;
        for (double[] length : dArr) {
            i10 += length.length;
        }
        return i10;
    }

    public long C() {
        return this.f5359j;
    }

    public final long E(long j10) {
        return (j10 > b6.c.f4201b ? 1 : (j10 == b6.c.f4201b ? 0 : -1)) != 0 && (j10 > this.f5357h ? 1 : (j10 == this.f5357h ? 0 : -1)) <= 0 ? (long) (((float) j10) * this.f5360k) : this.f5357h;
    }

    public boolean G(long j10) {
        long j11 = this.f5370u;
        return j11 == b6.c.f4201b || j10 - j11 >= this.f5361l;
    }

    public int b() {
        return this.f5368s;
    }

    public void c(long j10, long j11, long j12, List<? extends d7.l> list, m[] mVarArr) {
        long a10 = this.f5362m.a();
        this.f5366q.a(this.f5363n, list, mVarArr, this.f5365p);
        if (this.f5369t == 0) {
            this.f5369t = 1;
            this.f5368s = w(a10, this.f5365p);
            return;
        }
        int i10 = this.f5368s;
        int w10 = w(a10, this.f5365p);
        this.f5368s = w10;
        if (w10 != i10) {
            if (!s(i10, a10)) {
                Format f10 = f(i10);
                Format f11 = f(this.f5368s);
                if ((f11.S > f10.S && j11 < E(j12)) || (f11.S < f10.S && j11 >= this.f5358i)) {
                    this.f5368s = i10;
                }
            }
            if (this.f5368s != i10) {
                this.f5369t = 3;
            }
        }
    }

    public void g() {
        this.f5370u = b6.c.f4201b;
    }

    public int i(long j10, List<? extends d7.l> list) {
        int i10;
        int i11;
        long a10 = this.f5362m.a();
        if (!G(a10)) {
            return list.size();
        }
        this.f5370u = a10;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long c02 = q0.c0(((d7.l) list.get(size - 1)).f6520f - j10, this.f5367r);
        long C = C();
        if (c02 < C) {
            return size;
        }
        Format f10 = f(w(a10, this.f5364o));
        for (int i12 = 0; i12 < size; i12++) {
            d7.l lVar = (d7.l) list.get(i12);
            Format format = lVar.f6517c;
            if (q0.c0(lVar.f6520f - j10, this.f5367r) >= C && format.S < f10.S && (i10 = format.f5070c0) != -1 && i10 < 720 && (i11 = format.f5069b0) != -1 && i11 < 1280 && i10 < f10.f5070c0) {
                return i12;
            }
        }
        return size;
    }

    public int m() {
        return this.f5369t;
    }

    public void n(float f10) {
        this.f5367r = f10;
    }

    @o0
    public Object p() {
        return null;
    }

    public boolean u(Format format, int i10, float f10, long j10) {
        return ((long) Math.round(((float) i10) * f10)) <= j10;
    }

    public final int w(long j10, int[] iArr) {
        long a10 = this.f5356g.a();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12019b; i11++) {
            if (j10 == Long.MIN_VALUE || !s(i11, j10)) {
                if (u(f(i11), iArr[i11], this.f5367r, a10)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    public void x(long[][] jArr) {
        ((c) this.f5356g).b(jArr);
    }

    public void y(long j10) {
        ((c) this.f5356g).c(j10);
    }

    public void z(i iVar) {
        this.f5366q = iVar;
    }
}
