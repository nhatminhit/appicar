package b7;

import b6.c0;
import com.google.android.exoplayer2.Format;
import g6.f;
import j6.s;
import w7.q0;

public final class p0 {

    /* renamed from: t  reason: collision with root package name */
    public static final int f4642t = 1000;

    /* renamed from: a  reason: collision with root package name */
    public int f4643a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4644b = new int[1000];

    /* renamed from: c  reason: collision with root package name */
    public long[] f4645c = new long[1000];

    /* renamed from: d  reason: collision with root package name */
    public int[] f4646d = new int[1000];

    /* renamed from: e  reason: collision with root package name */
    public int[] f4647e = new int[1000];

    /* renamed from: f  reason: collision with root package name */
    public long[] f4648f = new long[1000];

    /* renamed from: g  reason: collision with root package name */
    public s.a[] f4649g = new s.a[1000];

    /* renamed from: h  reason: collision with root package name */
    public Format[] f4650h = new Format[1000];

    /* renamed from: i  reason: collision with root package name */
    public int f4651i;

    /* renamed from: j  reason: collision with root package name */
    public int f4652j;

    /* renamed from: k  reason: collision with root package name */
    public int f4653k;

    /* renamed from: l  reason: collision with root package name */
    public int f4654l;

    /* renamed from: m  reason: collision with root package name */
    public long f4655m = Long.MIN_VALUE;

    /* renamed from: n  reason: collision with root package name */
    public long f4656n = Long.MIN_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4657o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4658p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4659q = true;

    /* renamed from: r  reason: collision with root package name */
    public Format f4660r;

    /* renamed from: s  reason: collision with root package name */
    public int f4661s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f4662a;

        /* renamed from: b  reason: collision with root package name */
        public long f4663b;

        /* renamed from: c  reason: collision with root package name */
        public s.a f4664c;
    }

    public void A(int i10) {
        this.f4661s = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int a(long r9, boolean r11, boolean r12) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f4654l     // Catch:{ all -> 0x0039 }
            int r2 = r8.q(r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r8.t()     // Catch:{ all -> 0x0039 }
            r7 = -1
            if (r0 == 0) goto L_0x0037
            long[] r0 = r8.f4648f     // Catch:{ all -> 0x0039 }
            r3 = r0[r2]     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0037
            long r0 = r8.f4656n     // Catch:{ all -> 0x0039 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x001f
            if (r12 != 0) goto L_0x001f
            goto L_0x0037
        L_0x001f:
            int r12 = r8.f4651i     // Catch:{ all -> 0x0039 }
            int r0 = r8.f4654l     // Catch:{ all -> 0x0039 }
            int r3 = r12 - r0
            r1 = r8
            r4 = r9
            r6 = r11
            int r9 = r1.j(r2, r3, r4, r6)     // Catch:{ all -> 0x0039 }
            if (r9 != r7) goto L_0x0030
            monitor-exit(r8)
            return r7
        L_0x0030:
            int r10 = r8.f4654l     // Catch:{ all -> 0x0039 }
            int r10 = r10 + r9
            r8.f4654l = r10     // Catch:{ all -> 0x0039 }
            monitor-exit(r8)
            return r9
        L_0x0037:
            monitor-exit(r8)
            return r7
        L_0x0039:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p0.a(long, boolean, boolean):int");
    }

    public synchronized int b() {
        int i10;
        int i11 = this.f4651i;
        i10 = i11 - this.f4654l;
        this.f4654l = i11;
        return i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean c(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f4651i     // Catch:{ all -> 0x0049 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            long r3 = r7.f4655m     // Catch:{ all -> 0x0049 }
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x000e
            r1 = r2
        L_0x000e:
            monitor-exit(r7)
            return r1
        L_0x0010:
            long r3 = r7.f4655m     // Catch:{ all -> 0x0049 }
            int r0 = r7.f4654l     // Catch:{ all -> 0x0049 }
            long r5 = r7.o(r0)     // Catch:{ all -> 0x0049 }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0049 }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0022
            monitor-exit(r7)
            return r1
        L_0x0022:
            int r0 = r7.f4651i     // Catch:{ all -> 0x0049 }
            int r1 = r0 + -1
            int r1 = r7.q(r1)     // Catch:{ all -> 0x0049 }
        L_0x002a:
            int r3 = r7.f4654l     // Catch:{ all -> 0x0049 }
            if (r0 <= r3) goto L_0x0041
            long[] r3 = r7.f4648f     // Catch:{ all -> 0x0049 }
            r4 = r3[r1]     // Catch:{ all -> 0x0049 }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0041
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x002a
            int r1 = r7.f4643a     // Catch:{ all -> 0x0049 }
            int r1 = r1 - r2
            goto L_0x002a
        L_0x0041:
            int r8 = r7.f4652j     // Catch:{ all -> 0x0049 }
            int r8 = r8 + r0
            r7.i(r8)     // Catch:{ all -> 0x0049 }
            monitor-exit(r7)
            return r2
        L_0x0049:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p0.c(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void d(long r6, int r8, long r9, int r11, j6.s.a r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f4658p     // Catch:{ all -> 0x00d7 }
            r1 = 0
            if (r0 == 0) goto L_0x000e
            r0 = r8 & 1
            if (r0 != 0) goto L_0x000c
            monitor-exit(r5)
            return
        L_0x000c:
            r5.f4658p = r1     // Catch:{ all -> 0x00d7 }
        L_0x000e:
            boolean r0 = r5.f4659q     // Catch:{ all -> 0x00d7 }
            r2 = 1
            if (r0 != 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            w7.a.i(r0)     // Catch:{ all -> 0x00d7 }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0020
            r0 = r2
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            r5.f4657o = r0     // Catch:{ all -> 0x00d7 }
            long r3 = r5.f4656n     // Catch:{ all -> 0x00d7 }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00d7 }
            r5.f4656n = r3     // Catch:{ all -> 0x00d7 }
            int r0 = r5.f4651i     // Catch:{ all -> 0x00d7 }
            int r0 = r5.q(r0)     // Catch:{ all -> 0x00d7 }
            long[] r3 = r5.f4648f     // Catch:{ all -> 0x00d7 }
            r3[r0] = r6     // Catch:{ all -> 0x00d7 }
            long[] r6 = r5.f4645c     // Catch:{ all -> 0x00d7 }
            r6[r0] = r9     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f4646d     // Catch:{ all -> 0x00d7 }
            r7[r0] = r11     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f4647e     // Catch:{ all -> 0x00d7 }
            r7[r0] = r8     // Catch:{ all -> 0x00d7 }
            j6.s$a[] r7 = r5.f4649g     // Catch:{ all -> 0x00d7 }
            r7[r0] = r12     // Catch:{ all -> 0x00d7 }
            com.google.android.exoplayer2.Format[] r7 = r5.f4650h     // Catch:{ all -> 0x00d7 }
            com.google.android.exoplayer2.Format r8 = r5.f4660r     // Catch:{ all -> 0x00d7 }
            r7[r0] = r8     // Catch:{ all -> 0x00d7 }
            int[] r7 = r5.f4644b     // Catch:{ all -> 0x00d7 }
            int r8 = r5.f4661s     // Catch:{ all -> 0x00d7 }
            r7[r0] = r8     // Catch:{ all -> 0x00d7 }
            int r7 = r5.f4651i     // Catch:{ all -> 0x00d7 }
            int r7 = r7 + r2
            r5.f4651i = r7     // Catch:{ all -> 0x00d7 }
            int r8 = r5.f4643a     // Catch:{ all -> 0x00d7 }
            if (r7 != r8) goto L_0x00d5
            int r7 = r8 + 1000
            int[] r9 = new int[r7]     // Catch:{ all -> 0x00d7 }
            long[] r10 = new long[r7]     // Catch:{ all -> 0x00d7 }
            long[] r11 = new long[r7]     // Catch:{ all -> 0x00d7 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x00d7 }
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00d7 }
            j6.s$a[] r2 = new j6.s.a[r7]     // Catch:{ all -> 0x00d7 }
            com.google.android.exoplayer2.Format[] r3 = new com.google.android.exoplayer2.Format[r7]     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d7 }
            long[] r6 = r5.f4648f     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f4647e     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f4646d     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d7 }
            j6.s$a[] r6 = r5.f4649g     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d7 }
            com.google.android.exoplayer2.Format[] r6 = r5.f4650h     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d7 }
            int[] r6 = r5.f4644b     // Catch:{ all -> 0x00d7 }
            int r4 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d7 }
            int r6 = r5.f4653k     // Catch:{ all -> 0x00d7 }
            long[] r4 = r5.f4645c     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d7 }
            long[] r4 = r5.f4648f     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f4647e     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f4646d     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d7 }
            j6.s$a[] r4 = r5.f4649g     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d7 }
            com.google.android.exoplayer2.Format[] r4 = r5.f4650h     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d7 }
            int[] r4 = r5.f4644b     // Catch:{ all -> 0x00d7 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d7 }
            r5.f4645c = r10     // Catch:{ all -> 0x00d7 }
            r5.f4648f = r11     // Catch:{ all -> 0x00d7 }
            r5.f4647e = r12     // Catch:{ all -> 0x00d7 }
            r5.f4646d = r0     // Catch:{ all -> 0x00d7 }
            r5.f4649g = r2     // Catch:{ all -> 0x00d7 }
            r5.f4650h = r3     // Catch:{ all -> 0x00d7 }
            r5.f4644b = r9     // Catch:{ all -> 0x00d7 }
            r5.f4653k = r1     // Catch:{ all -> 0x00d7 }
            int r6 = r5.f4643a     // Catch:{ all -> 0x00d7 }
            r5.f4651i = r6     // Catch:{ all -> 0x00d7 }
            r5.f4643a = r7     // Catch:{ all -> 0x00d7 }
        L_0x00d5:
            monitor-exit(r5)
            return
        L_0x00d7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p0.d(long, int, long, int, j6.s$a):void");
    }

    public final long e(int i10) {
        this.f4655m = Math.max(this.f4655m, o(i10));
        int i11 = this.f4651i - i10;
        this.f4651i = i11;
        this.f4652j += i10;
        int i12 = this.f4653k + i10;
        this.f4653k = i12;
        int i13 = this.f4643a;
        if (i12 >= i13) {
            this.f4653k = i12 - i13;
        }
        int i14 = this.f4654l - i10;
        this.f4654l = i14;
        if (i14 < 0) {
            this.f4654l = 0;
        }
        if (i11 != 0) {
            return this.f4645c[this.f4653k];
        }
        int i15 = this.f4653k;
        if (i15 != 0) {
            i13 = i15;
        }
        int i16 = i13 - 1;
        return this.f4645c[i16] + ((long) this.f4646d[i16]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long f(long r11, boolean r13, boolean r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f4651i     // Catch:{ all -> 0x002f }
            r1 = -1
            if (r0 == 0) goto L_0x002d
            long[] r3 = r10.f4648f     // Catch:{ all -> 0x002f }
            int r5 = r10.f4653k     // Catch:{ all -> 0x002f }
            r6 = r3[r5]     // Catch:{ all -> 0x002f }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r14 == 0) goto L_0x001a
            int r14 = r10.f4654l     // Catch:{ all -> 0x002f }
            if (r14 == r0) goto L_0x001a
            int r0 = r14 + 1
        L_0x001a:
            r6 = r0
            r4 = r10
            r7 = r11
            r9 = r13
            int r11 = r4.j(r5, r6, r7, r9)     // Catch:{ all -> 0x002f }
            r12 = -1
            if (r11 != r12) goto L_0x0027
            monitor-exit(r10)
            return r1
        L_0x0027:
            long r11 = r10.e(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r10)
            return r11
        L_0x002d:
            monitor-exit(r10)
            return r1
        L_0x002f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.p0.f(long, boolean, boolean):long");
    }

    public synchronized long g() {
        int i10 = this.f4651i;
        if (i10 == 0) {
            return -1;
        }
        return e(i10);
    }

    public synchronized long h() {
        int i10 = this.f4654l;
        if (i10 == 0) {
            return -1;
        }
        return e(i10);
    }

    public long i(int i10) {
        int s10 = s() - i10;
        boolean z10 = false;
        w7.a.a(s10 >= 0 && s10 <= this.f4651i - this.f4654l);
        int i11 = this.f4651i - s10;
        this.f4651i = i11;
        this.f4656n = Math.max(this.f4655m, o(i11));
        if (s10 == 0 && this.f4657o) {
            z10 = true;
        }
        this.f4657o = z10;
        int i12 = this.f4651i;
        if (i12 == 0) {
            return 0;
        }
        int q10 = q(i12 - 1);
        return this.f4645c[q10] + ((long) this.f4646d[q10]);
    }

    public final int j(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11 && this.f4648f[i10] <= j10; i13++) {
            if (!z10 || (this.f4647e[i10] & 1) != 0) {
                i12 = i13;
            }
            i10++;
            if (i10 == this.f4643a) {
                i10 = 0;
            }
        }
        return i12;
    }

    public synchronized boolean k(Format format) {
        if (format == null) {
            this.f4659q = true;
            return false;
        }
        this.f4659q = false;
        if (q0.e(format, this.f4660r)) {
            return false;
        }
        this.f4660r = format;
        return true;
    }

    public int l() {
        return this.f4652j;
    }

    public synchronized long m() {
        return this.f4651i == 0 ? Long.MIN_VALUE : this.f4648f[this.f4653k];
    }

    public synchronized long n() {
        return this.f4656n;
    }

    public final long o(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int q10 = q(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f4648f[q10]);
            if ((this.f4647e[q10] & 1) != 0) {
                break;
            }
            q10--;
            if (q10 == -1) {
                q10 = this.f4643a - 1;
            }
        }
        return j10;
    }

    public int p() {
        return this.f4652j + this.f4654l;
    }

    public final int q(int i10) {
        int i11 = this.f4653k + i10;
        int i12 = this.f4643a;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public synchronized Format r() {
        return this.f4659q ? null : this.f4660r;
    }

    public int s() {
        return this.f4652j + this.f4651i;
    }

    public synchronized boolean t() {
        return this.f4654l != this.f4651i;
    }

    public synchronized boolean u() {
        return this.f4657o;
    }

    public int v() {
        return t() ? this.f4644b[q(this.f4654l)] : this.f4661s;
    }

    public synchronized int w(c0 c0Var, f fVar, boolean z10, boolean z11, Format format, a aVar) {
        if (!t()) {
            if (!z11) {
                if (!this.f4657o) {
                    Format format2 = this.f4660r;
                    if (format2 == null || (!z10 && format2 == format)) {
                        return -3;
                    }
                    c0Var.f4302c = format2;
                    return -5;
                }
            }
            fVar.p(4);
            return -4;
        }
        int q10 = q(this.f4654l);
        if (!z10) {
            if (this.f4650h[q10] == format) {
                fVar.p(this.f4647e[q10]);
                fVar.R = this.f4648f[q10];
                if (fVar.u()) {
                    return -4;
                }
                aVar.f4662a = this.f4646d[q10];
                aVar.f4663b = this.f4645c[q10];
                aVar.f4664c = this.f4649g[q10];
                this.f4654l++;
                return -4;
            }
        }
        c0Var.f4302c = this.f4650h[q10];
        return -5;
    }

    public void x(boolean z10) {
        this.f4651i = 0;
        this.f4652j = 0;
        this.f4653k = 0;
        this.f4654l = 0;
        this.f4658p = true;
        this.f4655m = Long.MIN_VALUE;
        this.f4656n = Long.MIN_VALUE;
        this.f4657o = false;
        if (z10) {
            this.f4660r = null;
            this.f4659q = true;
        }
    }

    public synchronized void y() {
        this.f4654l = 0;
    }

    public synchronized boolean z(int i10) {
        boolean z10;
        int i11 = this.f4652j;
        if (i11 > i10 || i10 > this.f4651i + i11) {
            z10 = false;
        } else {
            this.f4654l = i10 - i11;
            z10 = true;
        }
        return z10;
    }
}
