package p4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import d.e0;
import d.m0;
import d.o0;
import d.u;
import d.v;
import g4.e;
import g4.k0;
import g4.l;
import g4.n;
import g4.p;
import g4.q;
import java.util.Map;
import p4.a;
import s4.c;
import t4.b;
import t4.k;
import v3.f;
import v3.g;
import v3.i;
import v3.m;
import y3.j;

public abstract class a<T extends a<T>> implements Cloneable {
    public static final int A0 = 4096;
    public static final int B0 = 8192;
    public static final int C0 = 16384;
    public static final int D0 = 32768;
    public static final int E0 = 65536;
    public static final int F0 = 131072;
    public static final int G0 = 262144;
    public static final int H0 = 524288;
    public static final int I0 = 1048576;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f11443o0 = -1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f11444p0 = 2;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f11445q0 = 4;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f11446r0 = 8;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f11447s0 = 16;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f11448t0 = 32;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f11449u0 = 64;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f11450v0 = 128;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f11451w0 = 256;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f11452x0 = 512;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f11453y0 = 1024;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f11454z0 = 2048;
    public int O;
    public float P = 1.0f;
    @m0
    public j Q = j.f15396e;
    @m0
    public h R = h.NORMAL;
    @o0
    public Drawable S;
    public int T;
    @o0
    public Drawable U;
    public int V;
    public boolean W = true;
    public int X = -1;
    public int Y = -1;
    @m0
    public f Z = c.c();

    /* renamed from: a0  reason: collision with root package name */
    public boolean f11455a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f11456b0 = true;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f11457c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f11458d0;
    @m0

    /* renamed from: e0  reason: collision with root package name */
    public i f11459e0 = new i();
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public Map<Class<?>, m<?>> f11460f0 = new b();
    @m0

    /* renamed from: g0  reason: collision with root package name */
    public Class<?> f11461g0 = Object.class;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f11462h0;
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public Resources.Theme f11463i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f11464j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11465k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11466l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f11467m0 = true;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f11468n0;

    public static boolean l0(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @d.j
    @m0
    public T A() {
        if (this.f11464j0) {
            return clone().A();
        }
        this.f11460f0.clear();
        this.f11455a0 = false;
        this.f11456b0 = false;
        this.O = (this.O & -2049 & -131073) | 65536;
        this.f11467m0 = true;
        return J0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T A0(@d.m0 v3.m<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 0
            p4.a r2 = r1.U0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.A0(v3.m):p4.a");
    }

    @d.j
    @m0
    public T B(@m0 p pVar) {
        return K0(p.f7989h, k.d(pVar));
    }

    @d.j
    @m0
    public T B0(int i10) {
        return C0(i10, i10);
    }

    @d.j
    @m0
    public T C(@m0 Bitmap.CompressFormat compressFormat) {
        return K0(e.f7911c, k.d(compressFormat));
    }

    @d.j
    @m0
    public T C0(int i10, int i11) {
        if (this.f11464j0) {
            return clone().C0(i10, i11);
        }
        this.Y = i10;
        this.X = i11;
        this.O |= 512;
        return J0();
    }

    @d.j
    @m0
    public T D(@e0(from = 0, to = 100) int i10) {
        return K0(e.f7910b, Integer.valueOf(i10));
    }

    @d.j
    @m0
    public T D0(@u int i10) {
        if (this.f11464j0) {
            return clone().D0(i10);
        }
        this.V = i10;
        this.U = null;
        this.O = (this.O | 128) & -65;
        return J0();
    }

    @d.j
    @m0
    public T E(@u int i10) {
        if (this.f11464j0) {
            return clone().E(i10);
        }
        this.T = i10;
        this.S = null;
        this.O = (this.O | 32) & -17;
        return J0();
    }

    @d.j
    @m0
    public T E0(@o0 Drawable drawable) {
        if (this.f11464j0) {
            return clone().E0(drawable);
        }
        this.U = drawable;
        this.V = 0;
        this.O = (this.O | 64) & -129;
        return J0();
    }

    @d.j
    @m0
    public T F(@o0 Drawable drawable) {
        if (this.f11464j0) {
            return clone().F(drawable);
        }
        this.S = drawable;
        this.T = 0;
        this.O = (this.O | 16) & -33;
        return J0();
    }

    @d.j
    @m0
    public T F0(@m0 h hVar) {
        if (this.f11464j0) {
            return clone().F0(hVar);
        }
        this.R = (h) k.d(hVar);
        this.O |= 8;
        return J0();
    }

    @d.j
    @m0
    public T G(@u int i10) {
        if (this.f11464j0) {
            return clone().G(i10);
        }
        this.f11458d0 = i10;
        this.f11457c0 = null;
        this.O = (this.O | 16384) & -8193;
        return J0();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T G0(@d.m0 g4.p r2, @d.m0 v3.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 1
            p4.a r2 = r1.H0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.G0(g4.p, v3.m):p4.a");
    }

    @d.j
    @m0
    public T H(@o0 Drawable drawable) {
        if (this.f11464j0) {
            return clone().H(drawable);
        }
        this.f11457c0 = drawable;
        this.f11458d0 = 0;
        this.O = (this.O | 8192) & -16385;
        return J0();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T H0(@d.m0 g4.p r1, @d.m0 v3.m<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            p4.a r1 = r0.Q0(r1, r2)
            goto L_0x000b
        L_0x0007:
            p4.a r1 = r0.y0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.f11467m0 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.H0(g4.p, v3.m, boolean):p4.a");
    }

    @d.j
    @m0
    public T I() {
        return G0(p.f7984c, new g4.u());
    }

    public final T I0() {
        return this;
    }

    @d.j
    @m0
    public T J(@m0 v3.b bVar) {
        k.d(bVar);
        return K0(q.f7992g, bVar).K0(k4.i.f10007a, bVar);
    }

    @m0
    public final T J0() {
        if (!this.f11462h0) {
            return I0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @d.j
    @m0
    public T K(@e0(from = 0) long j10) {
        return K0(k0.f7941g, Long.valueOf(j10));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [v3.h, v3.h<Y>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T K0(@d.m0 v3.h<Y> r2, @d.m0 Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11464j0
            if (r0 == 0) goto L_0x000d
            p4.a r0 = r1.clone()
            p4.a r2 = r0.K0(r2, r3)
            return r2
        L_0x000d:
            t4.k.d(r2)
            t4.k.d(r3)
            v3.i r0 = r1.f11459e0
            r0.e(r2, r3)
            p4.a r2 = r1.J0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.K0(v3.h, java.lang.Object):p4.a");
    }

    @m0
    public final j L() {
        return this.Q;
    }

    @d.j
    @m0
    public T L0(@m0 f fVar) {
        if (this.f11464j0) {
            return clone().L0(fVar);
        }
        this.Z = (f) k.d(fVar);
        this.O |= 1024;
        return J0();
    }

    public final int M() {
        return this.T;
    }

    @d.j
    @m0
    public T M0(@v(from = 0.0d, to = 1.0d) float f10) {
        if (this.f11464j0) {
            return clone().M0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.P = f10;
        this.O |= 2;
        return J0();
    }

    @o0
    public final Drawable N() {
        return this.S;
    }

    @d.j
    @m0
    public T N0(boolean z10) {
        if (this.f11464j0) {
            return clone().N0(true);
        }
        this.W = !z10;
        this.O |= 256;
        return J0();
    }

    @o0
    public final Drawable O() {
        return this.f11457c0;
    }

    @d.j
    @m0
    public T O0(@o0 Resources.Theme theme) {
        if (this.f11464j0) {
            return clone().O0(theme);
        }
        this.f11463i0 = theme;
        this.O |= 32768;
        return J0();
    }

    public final int P() {
        return this.f11458d0;
    }

    @d.j
    @m0
    public T P0(@e0(from = 0) int i10) {
        return K0(e4.b.f6810b, Integer.valueOf(i10));
    }

    public final boolean Q() {
        return this.f11466l0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T Q0(@d.m0 g4.p r2, @d.m0 v3.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11464j0
            if (r0 == 0) goto L_0x000d
            p4.a r0 = r1.clone()
            p4.a r2 = r0.Q0(r2, r3)
            return r2
        L_0x000d:
            r1.B(r2)
            p4.a r2 = r1.T0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.Q0(g4.p, v3.m):p4.a");
    }

    @m0
    public final i R() {
        return this.f11459e0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<Y>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T R0(@d.m0 java.lang.Class<Y> r2, @d.m0 v3.m<Y> r3) {
        /*
            r1 = this;
            r0 = 1
            p4.a r2 = r1.S0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.R0(java.lang.Class, v3.m):p4.a");
    }

    public final int S() {
        return this.X;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<Y>, java.lang.Object, v3.m] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T S0(@d.m0 java.lang.Class<Y> r2, @d.m0 v3.m<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.f11464j0
            if (r0 == 0) goto L_0x000d
            p4.a r0 = r1.clone()
            p4.a r2 = r0.S0(r2, r3, r4)
            return r2
        L_0x000d:
            t4.k.d(r2)
            t4.k.d(r3)
            java.util.Map<java.lang.Class<?>, v3.m<?>> r0 = r1.f11460f0
            r0.put(r2, r3)
            int r2 = r1.O
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r3 = 1
            r1.f11456b0 = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.O = r2
            r0 = 0
            r1.f11467m0 = r0
            if (r4 == 0) goto L_0x0030
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.O = r2
            r1.f11455a0 = r3
        L_0x0030:
            p4.a r2 = r1.J0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.S0(java.lang.Class, v3.m, boolean):p4.a");
    }

    public final int T() {
        return this.Y;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T T0(@d.m0 v3.m<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            p4.a r2 = r1.U0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.T0(v3.m):p4.a");
    }

    @o0
    public final Drawable U() {
        return this.U;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T U0(@d.m0 v3.m<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f11464j0
            if (r0 == 0) goto L_0x000d
            p4.a r0 = r2.clone()
            p4.a r3 = r0.U0(r3, r4)
            return r3
        L_0x000d:
            g4.s r0 = new g4.s
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.S0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.S0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            v3.m r0 = r0.c()
            r2.S0(r1, r0, r4)
            java.lang.Class<k4.c> r0 = k4.c.class
            k4.f r1 = new k4.f
            r1.<init>(r3)
            r2.S0(r0, r1, r4)
            p4.a r3 = r2.J0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.U0(v3.m, boolean):p4.a");
    }

    public final int V() {
        return this.V;
    }

    @d.j
    @m0
    public T V0(@m0 m<Bitmap>... mVarArr) {
        return mVarArr.length > 1 ? U0(new g((m<T>[]) mVarArr), true) : mVarArr.length == 1 ? T0(mVarArr[0]) : J0();
    }

    @m0
    public final h W() {
        return this.R;
    }

    @d.j
    @m0
    @Deprecated
    public T W0(@m0 m<Bitmap>... mVarArr) {
        return U0(new g((m<T>[]) mVarArr), true);
    }

    @m0
    public final Class<?> X() {
        return this.f11461g0;
    }

    @d.j
    @m0
    public T X0(boolean z10) {
        if (this.f11464j0) {
            return clone().X0(z10);
        }
        this.f11468n0 = z10;
        this.O |= 1048576;
        return J0();
    }

    @m0
    public final f Y() {
        return this.Z;
    }

    @d.j
    @m0
    public T Y0(boolean z10) {
        if (this.f11464j0) {
            return clone().Y0(z10);
        }
        this.f11465k0 = z10;
        this.O |= 262144;
        return J0();
    }

    public final float Z() {
        return this.P;
    }

    @d.j
    @m0
    public T a(@m0 a<?> aVar) {
        if (this.f11464j0) {
            return clone().a(aVar);
        }
        if (l0(aVar.O, 2)) {
            this.P = aVar.P;
        }
        if (l0(aVar.O, 262144)) {
            this.f11465k0 = aVar.f11465k0;
        }
        if (l0(aVar.O, 1048576)) {
            this.f11468n0 = aVar.f11468n0;
        }
        if (l0(aVar.O, 4)) {
            this.Q = aVar.Q;
        }
        if (l0(aVar.O, 8)) {
            this.R = aVar.R;
        }
        if (l0(aVar.O, 16)) {
            this.S = aVar.S;
            this.T = 0;
            this.O &= -33;
        }
        if (l0(aVar.O, 32)) {
            this.T = aVar.T;
            this.S = null;
            this.O &= -17;
        }
        if (l0(aVar.O, 64)) {
            this.U = aVar.U;
            this.V = 0;
            this.O &= -129;
        }
        if (l0(aVar.O, 128)) {
            this.V = aVar.V;
            this.U = null;
            this.O &= -65;
        }
        if (l0(aVar.O, 256)) {
            this.W = aVar.W;
        }
        if (l0(aVar.O, 512)) {
            this.Y = aVar.Y;
            this.X = aVar.X;
        }
        if (l0(aVar.O, 1024)) {
            this.Z = aVar.Z;
        }
        if (l0(aVar.O, 4096)) {
            this.f11461g0 = aVar.f11461g0;
        }
        if (l0(aVar.O, 8192)) {
            this.f11457c0 = aVar.f11457c0;
            this.f11458d0 = 0;
            this.O &= -16385;
        }
        if (l0(aVar.O, 16384)) {
            this.f11458d0 = aVar.f11458d0;
            this.f11457c0 = null;
            this.O &= -8193;
        }
        if (l0(aVar.O, 32768)) {
            this.f11463i0 = aVar.f11463i0;
        }
        if (l0(aVar.O, 65536)) {
            this.f11456b0 = aVar.f11456b0;
        }
        if (l0(aVar.O, 131072)) {
            this.f11455a0 = aVar.f11455a0;
        }
        if (l0(aVar.O, 2048)) {
            this.f11460f0.putAll(aVar.f11460f0);
            this.f11467m0 = aVar.f11467m0;
        }
        if (l0(aVar.O, 524288)) {
            this.f11466l0 = aVar.f11466l0;
        }
        if (!this.f11456b0) {
            this.f11460f0.clear();
            this.f11455a0 = false;
            this.O = this.O & -2049 & -131073;
            this.f11467m0 = true;
        }
        this.O |= aVar.O;
        this.f11459e0.d(aVar.f11459e0);
        return J0();
    }

    @o0
    public final Resources.Theme a0() {
        return this.f11463i0;
    }

    @m0
    public final Map<Class<?>, m<?>> b0() {
        return this.f11460f0;
    }

    public final boolean c0() {
        return this.f11468n0;
    }

    public final boolean d0() {
        return this.f11465k0;
    }

    public boolean e0() {
        return this.f11464j0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.P, this.P) == 0 && this.T == aVar.T && t4.m.d(this.S, aVar.S) && this.V == aVar.V && t4.m.d(this.U, aVar.U) && this.f11458d0 == aVar.f11458d0 && t4.m.d(this.f11457c0, aVar.f11457c0) && this.W == aVar.W && this.X == aVar.X && this.Y == aVar.Y && this.f11455a0 == aVar.f11455a0 && this.f11456b0 == aVar.f11456b0 && this.f11465k0 == aVar.f11465k0 && this.f11466l0 == aVar.f11466l0 && this.Q.equals(aVar.Q) && this.R == aVar.R && this.f11459e0.equals(aVar.f11459e0) && this.f11460f0.equals(aVar.f11460f0) && this.f11461g0.equals(aVar.f11461g0) && t4.m.d(this.Z, aVar.Z) && t4.m.d(this.f11463i0, aVar.f11463i0);
    }

    public final boolean f0() {
        return k0(4);
    }

    public final boolean g0() {
        return this.f11462h0;
    }

    public final boolean h0() {
        return this.W;
    }

    public int hashCode() {
        return t4.m.p(this.f11463i0, t4.m.p(this.Z, t4.m.p(this.f11461g0, t4.m.p(this.f11460f0, t4.m.p(this.f11459e0, t4.m.p(this.R, t4.m.p(this.Q, t4.m.r(this.f11466l0, t4.m.r(this.f11465k0, t4.m.r(this.f11456b0, t4.m.r(this.f11455a0, t4.m.o(this.Y, t4.m.o(this.X, t4.m.r(this.W, t4.m.p(this.f11457c0, t4.m.o(this.f11458d0, t4.m.p(this.U, t4.m.o(this.V, t4.m.p(this.S, t4.m.o(this.T, t4.m.l(this.P)))))))))))))))))))));
    }

    public final boolean i0() {
        return k0(8);
    }

    public boolean j0() {
        return this.f11467m0;
    }

    public final boolean k0(int i10) {
        return l0(this.O, i10);
    }

    public final boolean m0() {
        return k0(256);
    }

    public final boolean n0() {
        return this.f11456b0;
    }

    public final boolean o0() {
        return this.f11455a0;
    }

    public final boolean p0() {
        return k0(2048);
    }

    @m0
    public T q() {
        if (!this.f11462h0 || this.f11464j0) {
            this.f11464j0 = true;
            return r0();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public final boolean q0() {
        return t4.m.v(this.Y, this.X);
    }

    @d.j
    @m0
    public T r() {
        return Q0(p.f7986e, new l());
    }

    @m0
    public T r0() {
        this.f11462h0 = true;
        return I0();
    }

    @d.j
    @m0
    public T s() {
        return G0(p.f7985d, new g4.m());
    }

    @d.j
    @m0
    public T s0(boolean z10) {
        if (this.f11464j0) {
            return clone().s0(z10);
        }
        this.f11466l0 = z10;
        this.O |= 524288;
        return J0();
    }

    @d.j
    @m0
    public T t0() {
        return y0(p.f7986e, new l());
    }

    @d.j
    @m0
    public T u() {
        return Q0(p.f7985d, new n());
    }

    @d.j
    @m0
    public T u0() {
        return x0(p.f7985d, new g4.m());
    }

    @d.j
    /* renamed from: v */
    public T clone() {
        try {
            T t10 = (a) super.clone();
            i iVar = new i();
            t10.f11459e0 = iVar;
            iVar.d(this.f11459e0);
            b bVar = new b();
            t10.f11460f0 = bVar;
            bVar.putAll(this.f11460f0);
            t10.f11462h0 = false;
            t10.f11464j0 = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    @d.j
    @m0
    public T v0() {
        return y0(p.f7986e, new n());
    }

    @d.j
    @m0
    public T w(@m0 Class<?> cls) {
        if (this.f11464j0) {
            return clone().w(cls);
        }
        this.f11461g0 = (Class) k.d(cls);
        this.O |= 4096;
        return J0();
    }

    @d.j
    @m0
    public T w0() {
        return x0(p.f7984c, new g4.u());
    }

    @d.j
    @m0
    public T x() {
        return K0(q.f7996k, Boolean.FALSE);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T x0(@d.m0 g4.p r2, @d.m0 v3.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            p4.a r2 = r1.H0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.x0(g4.p, v3.m):p4.a");
    }

    @d.j
    @m0
    public T y(@m0 j jVar) {
        if (this.f11464j0) {
            return clone().y(jVar);
        }
        this.Q = (j) k.d(jVar);
        this.O |= 4;
        return J0();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<android.graphics.Bitmap>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T y0(@d.m0 g4.p r2, @d.m0 v3.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.f11464j0
            if (r0 == 0) goto L_0x000d
            p4.a r0 = r1.clone()
            p4.a r2 = r0.y0(r2, r3)
            return r2
        L_0x000d:
            r1.B(r2)
            r2 = 0
            p4.a r2 = r1.U0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.y0(g4.p, v3.m):p4.a");
    }

    @d.j
    @m0
    public T z() {
        return K0(k4.i.f10008b, Boolean.TRUE);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [v3.m<Y>, v3.m] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @d.j
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T z0(@d.m0 java.lang.Class<Y> r2, @d.m0 v3.m<Y> r3) {
        /*
            r1 = this;
            r0 = 0
            p4.a r2 = r1.S0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.a.z0(java.lang.Class, v3.m):p4.a");
    }
}
