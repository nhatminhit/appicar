package e7;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import d7.m;
import g7.f;
import g7.j;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t7.l;
import t7.o;
import t7.r0;
import w7.l0;
import w7.q0;

public class e {

    /* renamed from: s  reason: collision with root package name */
    public static final int f6889s = 4;

    /* renamed from: a  reason: collision with root package name */
    public final g f6890a;

    /* renamed from: b  reason: collision with root package name */
    public final l f6891b;

    /* renamed from: c  reason: collision with root package name */
    public final l f6892c;

    /* renamed from: d  reason: collision with root package name */
    public final r f6893d;

    /* renamed from: e  reason: collision with root package name */
    public final Uri[] f6894e;

    /* renamed from: f  reason: collision with root package name */
    public final Format[] f6895f;

    /* renamed from: g  reason: collision with root package name */
    public final j f6896g;

    /* renamed from: h  reason: collision with root package name */
    public final TrackGroup f6897h;

    /* renamed from: i  reason: collision with root package name */
    public final List<Format> f6898i;

    /* renamed from: j  reason: collision with root package name */
    public final b f6899j = new b();

    /* renamed from: k  reason: collision with root package name */
    public boolean f6900k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f6901l;

    /* renamed from: m  reason: collision with root package name */
    public IOException f6902m;

    /* renamed from: n  reason: collision with root package name */
    public Uri f6903n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6904o;

    /* renamed from: p  reason: collision with root package name */
    public f f6905p;

    /* renamed from: q  reason: collision with root package name */
    public long f6906q = b6.c.f4201b;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6907r;

    public static final class a extends d7.j {

        /* renamed from: l  reason: collision with root package name */
        public byte[] f6908l;

        public a(l lVar, o oVar, Format format, int i10, Object obj, byte[] bArr) {
            super(lVar, oVar, 3, format, i10, obj, bArr);
        }

        public void g(byte[] bArr, int i10) {
            this.f6908l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f6908l;
        }
    }

    public static final class b extends LinkedHashMap<Uri, byte[]> {
        public b() {
            super(8, 1.0f, false);
        }

        /* renamed from: g */
        public byte[] get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (byte[]) super.get(obj);
        }

        /* renamed from: k */
        public byte[] put(Uri uri, byte[] bArr) {
            return (byte[]) super.put(uri, w7.a.g(bArr));
        }

        public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > 4;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public d7.d f6909a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6910b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f6911c;

        public c() {
            a();
        }

        public void a() {
            this.f6909a = null;
            this.f6910b = false;
            this.f6911c = null;
        }
    }

    public static final class d extends d7.b {

        /* renamed from: e  reason: collision with root package name */
        public final g7.f f6912e;

        /* renamed from: f  reason: collision with root package name */
        public final long f6913f;

        public d(g7.f fVar, long j10, int i10) {
            super((long) i10, (long) (fVar.f8127o.size() - 1));
            this.f6912e = fVar;
            this.f6913f = j10;
        }

        public long b() {
            e();
            return this.f6913f + this.f6912e.f8127o.get((int) f()).T;
        }

        public o c() {
            e();
            f.b bVar = this.f6912e.f8127o.get((int) f());
            return new o(l0.e(this.f6912e.f8129a, bVar.O), bVar.X, bVar.Y, (String) null);
        }

        public long d() {
            e();
            f.b bVar = this.f6912e.f8127o.get((int) f());
            return this.f6913f + bVar.T + bVar.Q;
        }
    }

    /* renamed from: e7.e$e  reason: collision with other inner class name */
    public static final class C0113e extends q7.a {

        /* renamed from: g  reason: collision with root package name */
        public int f6914g;

        public C0113e(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f6914g = j(trackGroup.a(0));
        }

        public int b() {
            return this.f6914g;
        }

        public void c(long j10, long j11, long j12, List<? extends d7.l> list, m[] mVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (s(this.f6914g, elapsedRealtime)) {
                for (int i10 = this.f12019b - 1; i10 >= 0; i10--) {
                    if (!s(i10, elapsedRealtime)) {
                        this.f6914g = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int m() {
            return 0;
        }

        public Object p() {
            return null;
        }
    }

    public e(g gVar, j jVar, Uri[] uriArr, Format[] formatArr, f fVar, @o0 r0 r0Var, r rVar, List<Format> list) {
        this.f6890a = gVar;
        this.f6896g = jVar;
        this.f6894e = uriArr;
        this.f6895f = formatArr;
        this.f6893d = rVar;
        this.f6898i = list;
        l a10 = fVar.a(1);
        this.f6891b = a10;
        if (r0Var != null) {
            a10.d(r0Var);
        }
        this.f6892c = fVar.a(3);
        this.f6897h = new TrackGroup(formatArr);
        int[] iArr = new int[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            iArr[i10] = i10;
        }
        this.f6905p = new C0113e(this.f6897h, iArr);
    }

    @o0
    public static Uri c(g7.f fVar, @o0 f.b bVar) {
        String str;
        if (bVar == null || (str = bVar.V) == null) {
            return null;
        }
        return l0.e(fVar.f8129a, str);
    }

    public m[] a(@o0 i iVar, long j10) {
        i iVar2 = iVar;
        int b10 = iVar2 == null ? -1 : this.f6897h.b(iVar2.f6517c);
        int length = this.f6905p.length();
        m[] mVarArr = new m[length];
        for (int i10 = 0; i10 < length; i10++) {
            int h10 = this.f6905p.h(i10);
            Uri uri = this.f6894e[h10];
            if (!this.f6896g.b(uri)) {
                mVarArr[i10] = m.f6558a;
            } else {
                g7.f m10 = this.f6896g.m(uri, false);
                long e10 = m10.f8118f - this.f6896g.e();
                long j11 = e10;
                long b11 = b(iVar, h10 != b10, m10, e10, j10);
                long j12 = m10.f8121i;
                if (b11 < j12) {
                    mVarArr[i10] = m.f6558a;
                } else {
                    mVarArr[i10] = new d(m10, j11, (int) (b11 - j12));
                }
            }
        }
        return mVarArr;
    }

    public final long b(@o0 i iVar, boolean z10, g7.f fVar, long j10, long j11) {
        long i10;
        long j12;
        if (iVar != null && !z10) {
            return iVar.g();
        }
        long j13 = fVar.f8128p + j10;
        if (iVar != null && !this.f6904o) {
            j11 = iVar.f6520f;
        }
        if (fVar.f8124l || j11 < j13) {
            i10 = (long) q0.i(fVar.f8127o, Long.valueOf(j11 - j10), true, !this.f6896g.f() || iVar == null);
            j12 = fVar.f8121i;
        } else {
            i10 = fVar.f8121i;
            j12 = (long) fVar.f8127o.size();
        }
        return i10 + j12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(long r29, long r31, java.util.List<e7.i> r33, e7.e.c r34) {
        /*
            r28 = this;
            r8 = r28
            r6 = r31
            r9 = r34
            boolean r0 = r33.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r33
            r4 = 0
            goto L_0x001f
        L_0x0011:
            int r0 = r33.size()
            int r0 = r0 - r11
            r1 = r33
            java.lang.Object r0 = r1.get(r0)
            e7.i r0 = (e7.i) r0
            r4 = r0
        L_0x001f:
            if (r4 != 0) goto L_0x0023
            r0 = -1
            goto L_0x002b
        L_0x0023:
            com.google.android.exoplayer2.source.TrackGroup r0 = r8.f6897h
            com.google.android.exoplayer2.Format r2 = r4.f6517c
            int r0 = r0.b(r2)
        L_0x002b:
            r5 = r0
            long r2 = r6 - r29
            long r12 = r28.m(r29)
            if (r4 == 0) goto L_0x0055
            boolean r0 = r8.f6904o
            if (r0 != 0) goto L_0x0055
            long r14 = r4.d()
            long r2 = r2 - r14
            r10 = 0
            long r2 = java.lang.Math.max(r10, r2)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            long r12 = r12 - r14
            long r10 = java.lang.Math.max(r10, r12)
            r15 = r2
            r17 = r10
            goto L_0x0058
        L_0x0055:
            r15 = r2
            r17 = r12
        L_0x0058:
            d7.m[] r20 = r8.a(r4, r6)
            com.google.android.exoplayer2.trackselection.f r12 = r8.f6905p
            r13 = r29
            r19 = r33
            r12.c(r13, r15, r17, r19, r20)
            com.google.android.exoplayer2.trackselection.f r0 = r8.f6905p
            int r10 = r0.k()
            r11 = 0
            if (r5 == r10) goto L_0x0070
            r12 = 1
            goto L_0x0071
        L_0x0070:
            r12 = r11
        L_0x0071:
            android.net.Uri[] r0 = r8.f6894e
            r13 = r0[r10]
            g7.j r0 = r8.f6896g
            boolean r0 = r0.b(r13)
            if (r0 != 0) goto L_0x008d
            r9.f6911c = r13
            boolean r0 = r8.f6907r
            android.net.Uri r1 = r8.f6903n
            boolean r1 = r13.equals(r1)
            r0 = r0 & r1
            r8.f6907r = r0
            r8.f6903n = r13
            return
        L_0x008d:
            g7.j r0 = r8.f6896g
            r1 = 1
            g7.f r14 = r0.m(r13, r1)
            boolean r0 = r14.f8131c
            r8.f6904o = r0
            r8.p(r14)
            long r0 = r14.f8118f
            g7.j r2 = r8.f6896g
            long r2 = r2.e()
            long r15 = r0 - r2
            r0 = r28
            r1 = r4
            r2 = r12
            r3 = r14
            r25 = r4
            r17 = r5
            r4 = r15
            r6 = r31
            long r0 = r0.b(r1, r2, r3, r4, r6)
            long r2 = r14.f8121i
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00de
            if (r25 == 0) goto L_0x00de
            if (r12 == 0) goto L_0x00de
            android.net.Uri[] r0 = r8.f6894e
            r0 = r0[r17]
            g7.j r1 = r8.f6896g
            r2 = 1
            g7.f r1 = r1.m(r0, r2)
            long r2 = r1.f8118f
            g7.j r4 = r8.f6896g
            long r4 = r4.e()
            long r2 = r2 - r4
            long r4 = r25.g()
            r15 = r2
            r3 = r0
            r2 = r1
            r0 = r4
            r5 = r17
            goto L_0x00e1
        L_0x00de:
            r5 = r10
            r3 = r13
            r2 = r14
        L_0x00e1:
            long r6 = r2.f8121i
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ef
            b7.d r0 = new b7.d
            r0.<init>()
            r8.f6902m = r0
            return
        L_0x00ef:
            long r0 = r0 - r6
            int r0 = (int) r0
            java.util.List<g7.f$b> r1 = r2.f8127o
            int r1 = r1.size()
            if (r0 < r1) goto L_0x0111
            boolean r0 = r2.f8124l
            if (r0 == 0) goto L_0x0101
            r0 = 1
            r9.f6910b = r0
            goto L_0x0110
        L_0x0101:
            r9.f6911c = r3
            boolean r0 = r8.f6907r
            android.net.Uri r1 = r8.f6903n
            boolean r1 = r3.equals(r1)
            r0 = r0 & r1
            r8.f6907r = r0
            r8.f6903n = r3
        L_0x0110:
            return
        L_0x0111:
            r8.f6907r = r11
            r1 = 0
            r8.f6903n = r1
            java.util.List<g7.f$b> r1 = r2.f8127o
            java.lang.Object r1 = r1.get(r0)
            g7.f$b r1 = (g7.f.b) r1
            g7.f$b r4 = r1.P
            android.net.Uri r4 = c(r2, r4)
            d7.d r6 = r8.h(r4, r5)
            r9.f6909a = r6
            if (r6 == 0) goto L_0x012d
            return
        L_0x012d:
            android.net.Uri r1 = c(r2, r1)
            d7.d r6 = r8.h(r1, r5)
            r9.f6909a = r6
            if (r6 == 0) goto L_0x013a
            return
        L_0x013a:
            e7.g r12 = r8.f6890a
            t7.l r13 = r8.f6891b
            com.google.android.exoplayer2.Format[] r6 = r8.f6895f
            r14 = r6[r5]
            java.util.List<com.google.android.exoplayer2.Format> r5 = r8.f6898i
            com.google.android.exoplayer2.trackselection.f r6 = r8.f6905p
            int r21 = r6.m()
            com.google.android.exoplayer2.trackselection.f r6 = r8.f6905p
            java.lang.Object r22 = r6.p()
            boolean r6 = r8.f6900k
            e7.r r7 = r8.f6893d
            e7.e$b r10 = r8.f6899j
            byte[] r26 = r10.get(r1)
            e7.e$b r1 = r8.f6899j
            byte[] r27 = r1.get(r4)
            r17 = r2
            r18 = r0
            r19 = r3
            r20 = r5
            r23 = r6
            r24 = r7
            e7.i r0 = e7.i.j(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.f6909a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.e.d(long, long, java.util.List, e7.e$c):void");
    }

    public TrackGroup e() {
        return this.f6897h;
    }

    public com.google.android.exoplayer2.trackselection.f f() {
        return this.f6905p;
    }

    public boolean g(d7.d dVar, long j10) {
        com.google.android.exoplayer2.trackselection.f fVar = this.f6905p;
        return fVar.d(fVar.r(this.f6897h.b(dVar.f6517c)), j10);
    }

    @o0
    public final d7.d h(@o0 Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        if (this.f6899j.containsKey(uri)) {
            b bVar = this.f6899j;
            bVar.put(uri, (byte[]) bVar.remove(uri));
            return null;
        }
        return new a(this.f6892c, new o(uri, 0, -1, (String) null, 1), this.f6895f[i10], this.f6905p.m(), this.f6905p.p(), this.f6901l);
    }

    public void i() throws IOException {
        IOException iOException = this.f6902m;
        if (iOException == null) {
            Uri uri = this.f6903n;
            if (uri != null && this.f6907r) {
                this.f6896g.c(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void j(d7.d dVar) {
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            this.f6901l = aVar.h();
            this.f6899j.put(aVar.f6515a.f13130a, aVar.j());
        }
    }

    public boolean k(Uri uri, long j10) {
        int r10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f6894e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (r10 = this.f6905p.r(i10)) == -1) {
            return true;
        }
        this.f6907r = uri.equals(this.f6903n) | this.f6907r;
        return j10 == b6.c.f4201b || this.f6905p.d(r10, j10);
    }

    public void l() {
        this.f6902m = null;
    }

    public final long m(long j10) {
        long j11 = this.f6906q;
        return (j11 > b6.c.f4201b ? 1 : (j11 == b6.c.f4201b ? 0 : -1)) != 0 ? j11 - j10 : b6.c.f4201b;
    }

    public void n(boolean z10) {
        this.f6900k = z10;
    }

    public void o(com.google.android.exoplayer2.trackselection.f fVar) {
        this.f6905p = fVar;
    }

    public final void p(g7.f fVar) {
        this.f6906q = fVar.f8124l ? b6.c.f4201b : fVar.e() - this.f6896g.e();
    }
}
