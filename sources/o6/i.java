package o6;

import b6.c;
import b6.j0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import j6.j;
import j6.k;
import j6.l;
import j6.m;
import j6.p;
import j6.q;
import j6.r;
import j6.s;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import o6.a;
import w7.q0;
import w7.t;
import w7.w;

public final class i implements j6.i, q {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = q0.T("qt  ");
    public static final long E = 262144;
    public static final long F = 10485760;

    /* renamed from: y  reason: collision with root package name */
    public static final l f11248y = new h();

    /* renamed from: z  reason: collision with root package name */
    public static final int f11249z = 1;

    /* renamed from: d  reason: collision with root package name */
    public final int f11250d;

    /* renamed from: e  reason: collision with root package name */
    public final w f11251e;

    /* renamed from: f  reason: collision with root package name */
    public final w f11252f;

    /* renamed from: g  reason: collision with root package name */
    public final w f11253g;

    /* renamed from: h  reason: collision with root package name */
    public final w f11254h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayDeque<a.C0192a> f11255i;

    /* renamed from: j  reason: collision with root package name */
    public int f11256j;

    /* renamed from: k  reason: collision with root package name */
    public int f11257k;

    /* renamed from: l  reason: collision with root package name */
    public long f11258l;

    /* renamed from: m  reason: collision with root package name */
    public int f11259m;

    /* renamed from: n  reason: collision with root package name */
    public w f11260n;

    /* renamed from: o  reason: collision with root package name */
    public int f11261o;

    /* renamed from: p  reason: collision with root package name */
    public int f11262p;

    /* renamed from: q  reason: collision with root package name */
    public int f11263q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11264r;

    /* renamed from: s  reason: collision with root package name */
    public k f11265s;

    /* renamed from: t  reason: collision with root package name */
    public b[] f11266t;

    /* renamed from: u  reason: collision with root package name */
    public long[][] f11267u;

    /* renamed from: v  reason: collision with root package name */
    public int f11268v;

    /* renamed from: w  reason: collision with root package name */
    public long f11269w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11270x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final l f11271a;

        /* renamed from: b  reason: collision with root package name */
        public final o f11272b;

        /* renamed from: c  reason: collision with root package name */
        public final s f11273c;

        /* renamed from: d  reason: collision with root package name */
        public int f11274d;

        public b(l lVar, o oVar, s sVar) {
            this.f11271a = lVar;
            this.f11272b = oVar;
            this.f11273c = sVar;
        }
    }

    public i() {
        this(0);
    }

    public i(int i10) {
        this.f11250d = i10;
        this.f11254h = new w(16);
        this.f11255i = new ArrayDeque<>();
        this.f11251e = new w(t.f14846b);
        this.f11252f = new w(4);
        this.f11253g = new w();
        this.f11261o = -1;
    }

    public static boolean A(int i10) {
        return i10 == a.f11101k0 || i10 == a.X || i10 == a.f11104l0 || i10 == a.f11107m0 || i10 == a.F0 || i10 == a.G0 || i10 == a.H0 || i10 == a.f11098j0 || i10 == a.I0 || i10 == a.J0 || i10 == a.K0 || i10 == a.L0 || i10 == a.M0 || i10 == a.f11092h0 || i10 == a.f11088g || i10 == a.T0 || i10 == a.V0 || i10 == a.W0;
    }

    public static long[][] l(b[] bVarArr) {
        long[][] jArr = new long[bVarArr.length][];
        int[] iArr = new int[bVarArr.length];
        long[] jArr2 = new long[bVarArr.length];
        boolean[] zArr = new boolean[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            jArr[i10] = new long[bVarArr[i10].f11272b.f11320b];
            jArr2[i10] = bVarArr[i10].f11272b.f11324f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < bVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < bVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            o oVar = bVarArr[i12].f11272b;
            j10 += (long) oVar.f11322d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = oVar.f11324f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    public static int n(o oVar, long j10) {
        int a10 = oVar.a(j10);
        return a10 == -1 ? oVar.b(j10) : a10;
    }

    public static /* synthetic */ j6.i[] q() {
        return new j6.i[]{new i()};
    }

    public static long r(o oVar, long j10, long j11) {
        int n10 = n(oVar, j10);
        return n10 == -1 ? j11 : Math.min(oVar.f11321c[n10], j11);
    }

    public static boolean u(w wVar) {
        wVar.Q(8);
        if (wVar.l() == D) {
            return true;
        }
        wVar.R(4);
        while (wVar.a() > 0) {
            if (wVar.l() == D) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(int i10) {
        return i10 == a.W || i10 == a.Y || i10 == a.Z || i10 == a.f11071a0 || i10 == a.f11074b0 || i10 == a.f11095i0 || i10 == a.U0;
    }

    public final void B(long j10) {
        for (b bVar : this.f11266t) {
            o oVar = bVar.f11272b;
            int a10 = oVar.a(j10);
            if (a10 == -1) {
                a10 = oVar.b(j10);
            }
            bVar.f11274d = a10;
        }
    }

    public void a() {
    }

    public boolean c(j jVar) throws IOException, InterruptedException {
        return k.d(jVar);
    }

    public boolean d() {
        return true;
    }

    public int f(j jVar, p pVar) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.f11256j;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return y(jVar, pVar);
                    }
                    throw new IllegalStateException();
                } else if (x(jVar, pVar)) {
                    return 1;
                }
            } else if (!w(jVar)) {
                return -1;
            }
        }
    }

    public void g(k kVar) {
        this.f11265s = kVar;
    }

    public void h(long j10, long j11) {
        this.f11255i.clear();
        this.f11259m = 0;
        this.f11261o = -1;
        this.f11262p = 0;
        this.f11263q = 0;
        this.f11264r = false;
        if (j10 == 0) {
            m();
        } else if (this.f11266t != null) {
            B(j11);
        }
    }

    public q.a i(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int b10;
        b[] bVarArr = this.f11266t;
        if (bVarArr.length == 0) {
            return new q.a(r.f9615c);
        }
        int i10 = this.f11268v;
        if (i10 != -1) {
            o oVar = bVarArr[i10].f11272b;
            int n10 = n(oVar, j10);
            if (n10 == -1) {
                return new q.a(r.f9615c);
            }
            long j15 = oVar.f11324f[n10];
            j11 = oVar.f11321c[n10];
            if (j15 >= j10 || n10 >= oVar.f11320b - 1 || (b10 = oVar.b(j10)) == -1 || b10 == n10) {
                j14 = -1;
                j13 = -9223372036854775807L;
            } else {
                j13 = oVar.f11324f[b10];
                j14 = oVar.f11321c[b10];
            }
            j12 = j14;
            j10 = j15;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -1;
            j13 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            b[] bVarArr2 = this.f11266t;
            if (i11 >= bVarArr2.length) {
                break;
            }
            if (i11 != this.f11268v) {
                o oVar2 = bVarArr2[i11].f11272b;
                long r10 = r(oVar2, j10, j11);
                if (j13 != c.f4201b) {
                    j12 = r(oVar2, j13, j12);
                }
                j11 = r10;
            }
            i11++;
        }
        r rVar = new r(j10, j11);
        return j13 == c.f4201b ? new q.a(rVar) : new q.a(rVar, new r(j13, j12));
    }

    public long j() {
        return this.f11269w;
    }

    public final void m() {
        this.f11256j = 0;
        this.f11259m = 0;
    }

    public final int o(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            b[] bVarArr = this.f11266t;
            if (i12 >= bVarArr.length) {
                break;
            }
            b bVar = bVarArr[i12];
            int i13 = bVar.f11274d;
            o oVar = bVar.f11272b;
            if (i13 != oVar.f11320b) {
                long j14 = oVar.f11321c[i13];
                long j15 = this.f11267u[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + F) ? i11 : i10;
    }

    public final ArrayList<o> p(a.C0192a aVar, m mVar, boolean z10) throws j0 {
        l v10;
        ArrayList<o> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < aVar.f11137o1.size(); i10++) {
            a.C0192a aVar2 = aVar.f11137o1.get(i10);
            if (aVar2.f11134a == a.Y && (v10 = b.v(aVar2, aVar.h(a.X), c.f4201b, (DrmInitData) null, z10, this.f11270x)) != null) {
                o r10 = b.r(v10, aVar2.g(a.Z).g(a.f11071a0).g(a.f11074b0), mVar);
                if (r10.f11320b != 0) {
                    arrayList.add(r10);
                }
            }
        }
        return arrayList;
    }

    public final void s(j jVar) throws IOException, InterruptedException {
        this.f11253g.M(8);
        jVar.k(this.f11253g.f14880a, 0, 8);
        this.f11253g.R(4);
        if (this.f11253g.l() == a.f11104l0) {
            jVar.h();
        } else {
            jVar.i(4);
        }
    }

    public final void t(long j10) throws j0 {
        while (!this.f11255i.isEmpty() && this.f11255i.peek().f11135m1 == j10) {
            a.C0192a pop = this.f11255i.pop();
            if (pop.f11134a == a.W) {
                v(pop);
                this.f11255i.clear();
                this.f11256j = 2;
            } else if (!this.f11255i.isEmpty()) {
                this.f11255i.peek().d(pop);
            }
        }
        if (this.f11256j != 2) {
            m();
        }
    }

    public final void v(a.C0192a aVar) throws j0 {
        Metadata metadata;
        long j10;
        o oVar;
        a.C0192a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        m mVar = new m();
        a.b h10 = aVar2.h(a.T0);
        Metadata metadata2 = null;
        if (h10 != null) {
            metadata = b.w(h10, this.f11270x);
            if (metadata != null) {
                mVar.c(metadata);
            }
        } else {
            metadata = null;
        }
        a.C0192a g10 = aVar2.g(a.U0);
        if (g10 != null) {
            metadata2 = b.l(g10);
        }
        ArrayList<o> p10 = p(aVar2, mVar, (this.f11250d & 1) != 0);
        int size = p10.size();
        long j11 = c.f4201b;
        long j12 = -9223372036854775807L;
        int i10 = 0;
        int i11 = -1;
        while (i10 < size) {
            o oVar2 = p10.get(i10);
            l lVar = oVar2.f11319a;
            o oVar3 = oVar2;
            long j13 = lVar.f11287e;
            if (j13 != j11) {
                j10 = j13;
                oVar = oVar3;
            } else {
                oVar = oVar3;
                j10 = oVar.f11326h;
            }
            long max = Math.max(j12, j10);
            ArrayList<o> arrayList2 = p10;
            int i12 = size;
            b bVar = new b(lVar, oVar, this.f11265s.a(i10, lVar.f11284b));
            Format g11 = lVar.f11288f.g(oVar.f11323e + 30);
            long j14 = max;
            if (lVar.f11284b == 2 && j10 > 0) {
                int i13 = oVar.f11320b;
                if (i13 > 1) {
                    g11 = g11.d(((float) i13) / (((float) j10) / 1000000.0f));
                }
            }
            bVar.f11273c.d(g.a(lVar.f11284b, g11, metadata, metadata2, mVar));
            if (lVar.f11284b == 2) {
                if (i11 == -1) {
                    i11 = arrayList.size();
                }
            }
            arrayList.add(bVar);
            i10++;
            p10 = arrayList2;
            size = i12;
            j12 = j14;
            j11 = c.f4201b;
        }
        this.f11268v = i11;
        this.f11269w = j12;
        b[] bVarArr = (b[]) arrayList.toArray(new b[0]);
        this.f11266t = bVarArr;
        this.f11267u = l(bVarArr);
        this.f11265s.r();
        this.f11265s.q(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(j6.j r9) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r8 = this;
            int r0 = r8.f11259m
            r1 = 1
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L_0x002a
            w7.w r0 = r8.f11254h
            byte[] r0 = r0.f14880a
            boolean r0 = r9.a(r0, r3, r2, r1)
            if (r0 != 0) goto L_0x0013
            return r3
        L_0x0013:
            r8.f11259m = r2
            w7.w r0 = r8.f11254h
            r0.Q(r3)
            w7.w r0 = r8.f11254h
            long r4 = r0.F()
            r8.f11258l = r4
            w7.w r0 = r8.f11254h
            int r0 = r0.l()
            r8.f11257k = r0
        L_0x002a:
            long r4 = r8.f11258l
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            w7.w r0 = r8.f11254h
            byte[] r0 = r0.f14880a
            r9.readFully(r0, r2, r2)
            int r0 = r8.f11259m
            int r0 = r0 + r2
            r8.f11259m = r0
            w7.w r0 = r8.f11254h
            long r4 = r0.I()
        L_0x0044:
            r8.f11258l = r4
            goto L_0x0077
        L_0x0047:
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            long r4 = r9.getLength()
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<o6.a$a> r0 = r8.f11255i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0069
            java.util.ArrayDeque<o6.a$a> r0 = r8.f11255i
            java.lang.Object r0 = r0.peek()
            o6.a$a r0 = (o6.a.C0192a) r0
            long r4 = r0.f11135m1
        L_0x0069:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            long r6 = r9.getPosition()
            long r4 = r4 - r6
            int r0 = r8.f11259m
            long r6 = (long) r0
            long r4 = r4 + r6
            goto L_0x0044
        L_0x0077:
            long r4 = r8.f11258l
            int r0 = r8.f11259m
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00f4
            int r0 = r8.f11257k
            boolean r0 = z(r0)
            if (r0 == 0) goto L_0x00b9
            long r2 = r9.getPosition()
            long r4 = r8.f11258l
            long r2 = r2 + r4
            int r0 = r8.f11259m
            long r4 = (long) r0
            long r2 = r2 - r4
            java.util.ArrayDeque<o6.a$a> r0 = r8.f11255i
            o6.a$a r4 = new o6.a$a
            int r5 = r8.f11257k
            r4.<init>(r5, r2)
            r0.push(r4)
            long r4 = r8.f11258l
            int r0 = r8.f11259m
            long r6 = (long) r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00ac
            r8.t(r2)
            goto L_0x00f3
        L_0x00ac:
            int r0 = r8.f11257k
            int r2 = o6.a.U0
            if (r0 != r2) goto L_0x00b5
            r8.s(r9)
        L_0x00b5:
            r8.m()
            goto L_0x00f3
        L_0x00b9:
            int r9 = r8.f11257k
            boolean r9 = A(r9)
            if (r9 == 0) goto L_0x00ee
            int r9 = r8.f11259m
            if (r9 != r2) goto L_0x00c7
            r9 = r1
            goto L_0x00c8
        L_0x00c7:
            r9 = r3
        L_0x00c8:
            w7.a.i(r9)
            long r4 = r8.f11258l
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x00d6
            r9 = r1
            goto L_0x00d7
        L_0x00d6:
            r9 = r3
        L_0x00d7:
            w7.a.i(r9)
            w7.w r9 = new w7.w
            long r4 = r8.f11258l
            int r0 = (int) r4
            r9.<init>((int) r0)
            r8.f11260n = r9
            w7.w r0 = r8.f11254h
            byte[] r0 = r0.f14880a
            byte[] r9 = r9.f14880a
            java.lang.System.arraycopy(r0, r3, r9, r3, r2)
            goto L_0x00f1
        L_0x00ee:
            r9 = 0
            r8.f11260n = r9
        L_0x00f1:
            r8.f11256j = r1
        L_0x00f3:
            return r1
        L_0x00f4:
            b6.j0 r9 = new b6.j0
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            r9.<init>((java.lang.String) r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.i.w(j6.j):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean x(j6.j r10, j6.p r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            long r0 = r9.f11258l
            int r2 = r9.f11259m
            long r2 = (long) r2
            long r0 = r0 - r2
            long r2 = r10.getPosition()
            long r2 = r2 + r0
            w7.w r4 = r9.f11260n
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0045
            byte[] r11 = r4.f14880a
            int r4 = r9.f11259m
            int r0 = (int) r0
            r10.readFully(r11, r4, r0)
            int r10 = r9.f11257k
            int r11 = o6.a.f11088g
            if (r10 != r11) goto L_0x0028
            w7.w r10 = r9.f11260n
            boolean r10 = u(r10)
            r9.f11270x = r10
            goto L_0x0050
        L_0x0028:
            java.util.ArrayDeque<o6.a$a> r10 = r9.f11255i
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0050
            java.util.ArrayDeque<o6.a$a> r10 = r9.f11255i
            java.lang.Object r10 = r10.peek()
            o6.a$a r10 = (o6.a.C0192a) r10
            o6.a$b r11 = new o6.a$b
            int r0 = r9.f11257k
            w7.w r1 = r9.f11260n
            r11.<init>(r0, r1)
            r10.e(r11)
            goto L_0x0050
        L_0x0045:
            r7 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            int r11 = (int) r0
            r10.i(r11)
        L_0x0050:
            r10 = r6
            goto L_0x005a
        L_0x0052:
            long r7 = r10.getPosition()
            long r7 = r7 + r0
            r11.f9610a = r7
            r10 = r5
        L_0x005a:
            r9.t(r2)
            if (r10 == 0) goto L_0x0065
            int r10 = r9.f11256j
            r11 = 2
            if (r10 == r11) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r5 = r6
        L_0x0066:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.i.x(j6.j, j6.p):boolean");
    }

    public final int y(j jVar, p pVar) throws IOException, InterruptedException {
        j jVar2 = jVar;
        long position = jVar.getPosition();
        if (this.f11261o == -1) {
            int o10 = o(position);
            this.f11261o = o10;
            if (o10 == -1) {
                return -1;
            }
            this.f11264r = w7.s.F.equals(this.f11266t[o10].f11271a.f11288f.W);
        }
        b bVar = this.f11266t[this.f11261o];
        s sVar = bVar.f11273c;
        int i10 = bVar.f11274d;
        o oVar = bVar.f11272b;
        long j10 = oVar.f11321c[i10];
        int i11 = oVar.f11322d[i10];
        long j11 = (j10 - position) + ((long) this.f11262p);
        if (j11 < 0 || j11 >= 262144) {
            pVar.f9610a = j10;
            return 1;
        }
        if (bVar.f11271a.f11289g == 1) {
            j11 += 8;
            i11 -= 8;
        }
        jVar2.i((int) j11);
        int i12 = bVar.f11271a.f11292j;
        if (i12 == 0) {
            if (this.f11264r) {
                d6.b.a(i11, this.f11253g);
                int d10 = this.f11253g.d();
                sVar.a(this.f11253g, d10);
                i11 += d10;
                this.f11262p += d10;
                this.f11264r = false;
            }
            while (true) {
                int i13 = this.f11262p;
                if (i13 >= i11) {
                    break;
                }
                int b10 = sVar.b(jVar2, i11 - i13, false);
                this.f11262p += b10;
                this.f11263q -= b10;
            }
        } else {
            byte[] bArr = this.f11252f.f14880a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i14 = 4 - i12;
            while (this.f11262p < i11) {
                int i15 = this.f11263q;
                if (i15 == 0) {
                    jVar2.readFully(bArr, i14, i12);
                    this.f11252f.Q(0);
                    int l10 = this.f11252f.l();
                    if (l10 >= 0) {
                        this.f11263q = l10;
                        this.f11251e.Q(0);
                        sVar.a(this.f11251e, 4);
                        this.f11262p += 4;
                        i11 += i14;
                    } else {
                        throw new j0("Invalid NAL length");
                    }
                } else {
                    int b11 = sVar.b(jVar2, i15, false);
                    this.f11262p += b11;
                    this.f11263q -= b11;
                }
            }
        }
        o oVar2 = bVar.f11272b;
        sVar.c(oVar2.f11324f[i10], oVar2.f11325g[i10], i11, 0, (s.a) null);
        bVar.f11274d++;
        this.f11261o = -1;
        this.f11262p = 0;
        this.f11263q = 0;
        return 0;
    }
}
