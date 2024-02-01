package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p4.b;
import p4.c;
import p4.d;
import p4.e;
import p4.f;
import p4.g;
import p4.h;
import q4.m;
import q4.p;
import q4.r;
import y3.j;

public class k<TranscodeType> extends p4.a<k<TranscodeType>> implements Cloneable, g<k<TranscodeType>> {
    public static final h X0 = ((h) ((h) ((h) new h().y(j.f15394c)).F0(h.LOW)).N0(true));
    public final Context J0;
    public final l K0;
    public final Class<TranscodeType> L0;
    public final b M0;
    public final d N0;
    @m0
    public m<?, ? super TranscodeType> O0;
    @o0
    public Object P0;
    @o0
    public List<g<TranscodeType>> Q0;
    @o0
    public k<TranscodeType> R0;
    @o0
    public k<TranscodeType> S0;
    @o0
    public Float T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4984a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f4985b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.h[] r0 = com.bumptech.glide.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4985b = r0
                r1 = 1
                com.bumptech.glide.h r2 = com.bumptech.glide.h.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f4985b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.h r3 = com.bumptech.glide.h.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f4985b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.h r4 = com.bumptech.glide.h.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f4985b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.h r5 = com.bumptech.glide.h.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f4984a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f4984a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f4984a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    public k(@m0 b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.U0 = true;
        this.M0 = bVar;
        this.K0 = lVar;
        this.L0 = cls;
        this.J0 = context;
        this.O0 = lVar.G(cls);
        this.N0 = bVar.j();
        k1(lVar.E());
        a(lVar.F());
    }

    @SuppressLint({"CheckResult"})
    public k(Class<TranscodeType> cls, k<?> kVar) {
        this(kVar.M0, kVar.K0, cls, kVar.J0);
        this.P0 = kVar.P0;
        this.V0 = kVar.V0;
        a(kVar);
    }

    @d.j
    @m0
    /* renamed from: A1 */
    public k<TranscodeType> i(@o0 byte[] bArr) {
        k<TranscodeType> B1 = B1(bArr);
        if (!B1.f0()) {
            B1 = B1.a(h.e1(j.f15393b));
        }
        return !B1.m0() ? B1.a(h.x1(true)) : B1;
    }

    @m0
    public final k<TranscodeType> B1(@o0 Object obj) {
        this.P0 = obj;
        this.V0 = true;
        return this;
    }

    public final d C1(Object obj, p<TranscodeType> pVar, g<TranscodeType> gVar, p4.a<?> aVar, e eVar, m<?, ? super TranscodeType> mVar, h hVar, int i10, int i11, Executor executor) {
        Context context = this.J0;
        d dVar = this.N0;
        return p4.j.x(context, dVar, obj, this.P0, this.L0, aVar, i10, i11, hVar, pVar, gVar, this.Q0, eVar, dVar.f(), mVar.g(), executor);
    }

    @m0
    public p<TranscodeType> D1() {
        return E1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @m0
    public p<TranscodeType> E1(int i10, int i11) {
        return m1(m.d(this.K0, i10, i11));
    }

    @m0
    public c<TranscodeType> F1() {
        return G1(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @m0
    public c<TranscodeType> G1(int i10, int i11) {
        f fVar = new f(i10, i11);
        return (c) n1(fVar, fVar, t4.e.a());
    }

    @d.j
    @m0
    public k<TranscodeType> H1(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.T0 = Float.valueOf(f10);
        return this;
    }

    @d.j
    @m0
    public k<TranscodeType> I1(@o0 k<TranscodeType> kVar) {
        this.R0 = kVar;
        return this;
    }

    @d.j
    @m0
    public k<TranscodeType> J1(@o0 k<TranscodeType>... kVarArr) {
        k<TranscodeType> kVar = null;
        if (kVarArr == null || kVarArr.length == 0) {
            return I1((k) null);
        }
        for (int length = kVarArr.length - 1; length >= 0; length--) {
            k<TranscodeType> kVar2 = kVarArr[length];
            if (kVar2 != null) {
                kVar = kVar == null ? kVar2 : kVar2.I1(kVar);
            }
        }
        return I1(kVar);
    }

    @d.j
    @m0
    public k<TranscodeType> K1(@m0 m<?, ? super TranscodeType> mVar) {
        this.O0 = (m) t4.k.d(mVar);
        this.U0 = false;
        return this;
    }

    @d.j
    @m0
    public k<TranscodeType> Z0(@o0 g<TranscodeType> gVar) {
        if (gVar != null) {
            if (this.Q0 == null) {
                this.Q0 = new ArrayList();
            }
            this.Q0.add(gVar);
        }
        return this;
    }

    @d.j
    @m0
    /* renamed from: a1 */
    public k<TranscodeType> a(@m0 p4.a<?> aVar) {
        t4.k.d(aVar);
        return (k) super.a(aVar);
    }

    public final d b1(p<TranscodeType> pVar, @o0 g<TranscodeType> gVar, p4.a<?> aVar, Executor executor) {
        return c1(new Object(), pVar, gVar, (e) null, this.O0, aVar.W(), aVar.T(), aVar.S(), aVar, executor);
    }

    public final d c1(Object obj, p<TranscodeType> pVar, @o0 g<TranscodeType> gVar, @o0 e eVar, m<?, ? super TranscodeType> mVar, h hVar, int i10, int i11, p4.a<?> aVar, Executor executor) {
        b bVar;
        b bVar2;
        if (this.S0 != null) {
            bVar2 = new b(obj, eVar);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = eVar;
        }
        d d12 = d1(obj, pVar, gVar, bVar2, mVar, hVar, i10, i11, aVar, executor);
        if (bVar == null) {
            return d12;
        }
        int T = this.S0.T();
        int S = this.S0.S();
        if (t4.m.v(i10, i11) && !this.S0.q0()) {
            T = aVar.T();
            S = aVar.S();
        }
        k<TranscodeType> kVar = this.S0;
        b bVar3 = bVar;
        bVar3.o(d12, kVar.c1(obj, pVar, gVar, bVar3, kVar.O0, kVar.W(), T, S, this.S0, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [p4.a, p4.a<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4.d d1(java.lang.Object r19, q4.p<TranscodeType> r20, p4.g<TranscodeType> r21, @d.o0 p4.e r22, com.bumptech.glide.m<?, ? super TranscodeType> r23, com.bumptech.glide.h r24, int r25, int r26, p4.a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.k<TranscodeType> r0 = r11.R0
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.W0
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.m<?, ? super TranscodeType> r1 = r0.O0
            boolean r2 = r0.U0
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.i0()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.k<TranscodeType> r0 = r11.R0
            com.bumptech.glide.h r0 = r0.W()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.h r0 = r11.j1(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.k<TranscodeType> r0 = r11.R0
            int r0 = r0.T()
            com.bumptech.glide.k<TranscodeType> r1 = r11.R0
            int r1 = r1.S()
            boolean r2 = t4.m.v(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.k<TranscodeType> r2 = r11.R0
            boolean r2 = r2.q0()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.T()
            int r1 = r27.S()
        L_0x004e:
            r16 = r0
            r17 = r1
            p4.k r10 = new p4.k
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            p4.d r10 = r0.C1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.W0 = r0
            com.bumptech.glide.k<TranscodeType> r9 = r11.R0
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            p4.d r0 = r0.c1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.W0 = r1
            r13.n(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.T0
            if (r0 == 0) goto L_0x00d4
            p4.k r14 = new p4.k
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            p4.d r15 = r0.C1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            p4.a r0 = r27.clone()
            java.lang.Float r1 = r11.T0
            float r1 = r1.floatValue()
            p4.a r4 = r0.M0(r1)
            com.bumptech.glide.h r7 = r11.j1(r13)
            r0 = r18
            r1 = r19
            p4.d r0 = r0.C1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.n(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            p4.d r0 = r0.C1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.d1(java.lang.Object, q4.p, p4.g, p4.e, com.bumptech.glide.m, com.bumptech.glide.h, int, int, p4.a, java.util.concurrent.Executor):p4.d");
    }

    @d.j
    /* renamed from: e1 */
    public k<TranscodeType> v() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.O0 = kVar.O0.clone();
        return kVar;
    }

    @d.j
    @Deprecated
    public c<File> f1(int i10, int i11) {
        return i1().G1(i10, i11);
    }

    @d.j
    @Deprecated
    public <Y extends p<File>> Y g1(@m0 Y y10) {
        return i1().m1(y10);
    }

    @m0
    public k<TranscodeType> h1(@o0 k<TranscodeType> kVar) {
        this.S0 = kVar;
        return this;
    }

    @d.j
    @m0
    public k<File> i1() {
        return new k(File.class, this).a(X0);
    }

    @m0
    public final h j1(@m0 h hVar) {
        int i10 = a.f4985b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + W());
    }

    @SuppressLint({"CheckResult"})
    public final void k1(List<g<Object>> list) {
        for (g<Object> Z0 : list) {
            Z0(Z0);
        }
    }

    @Deprecated
    public c<TranscodeType> l1(int i10, int i11) {
        return G1(i10, i11);
    }

    @m0
    public <Y extends p<TranscodeType>> Y m1(@m0 Y y10) {
        return n1(y10, (g) null, t4.e.b());
    }

    @m0
    public <Y extends p<TranscodeType>> Y n1(@m0 Y y10, @o0 g<TranscodeType> gVar, Executor executor) {
        return o1(y10, gVar, this, executor);
    }

    public final <Y extends p<TranscodeType>> Y o1(@m0 Y y10, @o0 g<TranscodeType> gVar, p4.a<?> aVar, Executor executor) {
        t4.k.d(y10);
        if (this.V0) {
            d b12 = b1(y10, gVar, aVar, executor);
            d q10 = y10.q();
            if (!b12.f(q10) || q1(aVar, q10)) {
                this.K0.B(y10);
                y10.h(b12);
                this.K0.a0(y10, b12);
                return y10;
            }
            if (!((d) t4.k.d(q10)).isRunning()) {
                q10.h();
            }
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    @m0
    public r<ImageView, TranscodeType> p1(@m0 ImageView imageView) {
        p4.a aVar;
        t4.m.b();
        t4.k.d(imageView);
        if (!p0() && n0() && imageView.getScaleType() != null) {
            switch (a.f4984a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().t0();
                    break;
                case 2:
                case 6:
                    aVar = clone().u0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().w0();
                    break;
            }
        }
        aVar = this;
        return (r) o1(this.N0.a(imageView, this.L0), (g) null, aVar, t4.e.b());
    }

    public final boolean q1(p4.a<?> aVar, d dVar) {
        return !aVar.h0() && dVar.i();
    }

    @d.j
    @m0
    public k<TranscodeType> r1(@o0 g<TranscodeType> gVar) {
        this.Q0 = null;
        return Z0(gVar);
    }

    @d.j
    @m0
    /* renamed from: s1 */
    public k<TranscodeType> m(@o0 Bitmap bitmap) {
        return B1(bitmap).a(h.e1(j.f15393b));
    }

    @d.j
    @m0
    /* renamed from: t1 */
    public k<TranscodeType> k(@o0 Drawable drawable) {
        return B1(drawable).a(h.e1(j.f15393b));
    }

    @d.j
    @m0
    /* renamed from: u1 */
    public k<TranscodeType> g(@o0 Uri uri) {
        return B1(uri);
    }

    @d.j
    @m0
    /* renamed from: v1 */
    public k<TranscodeType> j(@o0 File file) {
        return B1(file);
    }

    @d.j
    @m0
    /* renamed from: w1 */
    public k<TranscodeType> p(@o0 @s0 @u Integer num) {
        return B1(num).a(h.v1(s4.a.c(this.J0)));
    }

    @d.j
    @m0
    /* renamed from: x1 */
    public k<TranscodeType> n(@o0 Object obj) {
        return B1(obj);
    }

    @d.j
    @m0
    /* renamed from: y1 */
    public k<TranscodeType> t(@o0 String str) {
        return B1(str);
    }

    @d.j
    @Deprecated
    /* renamed from: z1 */
    public k<TranscodeType> d(@o0 URL url) {
        return B1(url);
    }
}
