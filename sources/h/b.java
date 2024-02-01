package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import d.m0;
import d.o0;
import d.t0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: a0  reason: collision with root package name */
    public static final boolean f8307a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public static final String f8308b0 = "DrawableContainer";

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f8309c0 = true;
    public d O;
    public Rect P;
    public Drawable Q;
    public Drawable R;
    public int S = 255;
    public boolean T;
    public int U = -1;
    public boolean V;
    public Runnable W;
    public long X;
    public long Y;
    public c Z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    @t0(21)
    /* renamed from: h.b$b  reason: collision with other inner class name */
    public static class C0138b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public static class c implements Drawable.Callback {
        public Drawable.Callback O;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.O;
            this.O = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.O = callback;
            return this;
        }

        public void invalidateDrawable(@m0 Drawable drawable) {
        }

        public void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
            Drawable.Callback callback = this.O;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        public void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
            Drawable.Callback callback = this.O;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class d extends Drawable.ConstantState {
        public int A = 0;
        public int B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f8310a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f8311b;

        /* renamed from: c  reason: collision with root package name */
        public int f8312c;

        /* renamed from: d  reason: collision with root package name */
        public int f8313d;

        /* renamed from: e  reason: collision with root package name */
        public int f8314e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f8315f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f8316g;

        /* renamed from: h  reason: collision with root package name */
        public int f8317h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f8318i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f8319j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f8320k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f8321l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f8322m;

        /* renamed from: n  reason: collision with root package name */
        public int f8323n;

        /* renamed from: o  reason: collision with root package name */
        public int f8324o;

        /* renamed from: p  reason: collision with root package name */
        public int f8325p;

        /* renamed from: q  reason: collision with root package name */
        public int f8326q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f8327r;

        /* renamed from: s  reason: collision with root package name */
        public int f8328s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f8329t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f8330u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f8331v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f8332w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f8333x = true;

        /* renamed from: y  reason: collision with root package name */
        public boolean f8334y;

        /* renamed from: z  reason: collision with root package name */
        public int f8335z;

        public d(d dVar, b bVar, Resources resources) {
            this.f8310a = bVar;
            Rect rect = null;
            this.f8311b = resources != null ? resources : dVar != null ? dVar.f8311b : null;
            int g10 = b.g(resources, dVar != null ? dVar.f8312c : 0);
            this.f8312c = g10;
            if (dVar != null) {
                this.f8313d = dVar.f8313d;
                this.f8314e = dVar.f8314e;
                this.f8331v = true;
                this.f8332w = true;
                this.f8318i = dVar.f8318i;
                this.f8321l = dVar.f8321l;
                this.f8333x = dVar.f8333x;
                this.f8334y = dVar.f8334y;
                this.f8335z = dVar.f8335z;
                this.A = dVar.A;
                this.B = dVar.B;
                this.C = dVar.C;
                this.D = dVar.D;
                this.E = dVar.E;
                this.F = dVar.F;
                this.G = dVar.G;
                this.H = dVar.H;
                this.I = dVar.I;
                if (dVar.f8312c == g10) {
                    if (dVar.f8319j) {
                        this.f8320k = dVar.f8320k != null ? new Rect(dVar.f8320k) : rect;
                        this.f8319j = true;
                    }
                    if (dVar.f8322m) {
                        this.f8323n = dVar.f8323n;
                        this.f8324o = dVar.f8324o;
                        this.f8325p = dVar.f8325p;
                        this.f8326q = dVar.f8326q;
                        this.f8322m = true;
                    }
                }
                if (dVar.f8327r) {
                    this.f8328s = dVar.f8328s;
                    this.f8327r = true;
                }
                if (dVar.f8329t) {
                    this.f8330u = dVar.f8330u;
                    this.f8329t = true;
                }
                Drawable[] drawableArr = dVar.f8316g;
                this.f8316g = new Drawable[drawableArr.length];
                this.f8317h = dVar.f8317h;
                SparseArray<Drawable.ConstantState> sparseArray = dVar.f8315f;
                this.f8315f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f8317h);
                int i10 = this.f8317h;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f8315f.put(i11, constantState);
                        } else {
                            this.f8316g[i11] = drawableArr[i11];
                        }
                    }
                }
                return;
            }
            this.f8316g = new Drawable[10];
            this.f8317h = 0;
        }

        public final boolean A(int i10, int i11) {
            int i12 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean m10 = o0.d.m(drawable, i10);
                    if (i13 == i11) {
                        z10 = m10;
                    }
                }
            }
            this.f8335z = i10;
            return z10;
        }

        public final void B(boolean z10) {
            this.f8318i = z10;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.f8311b = resources;
                int g10 = b.g(resources, this.f8312c);
                int i10 = this.f8312c;
                this.f8312c = g10;
                if (i10 != g10) {
                    this.f8322m = false;
                    this.f8319j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f8317h;
            if (i10 >= this.f8316g.length) {
                r(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f8310a);
            this.f8316g[i10] = drawable;
            this.f8317h++;
            this.f8314e = drawable.getChangingConfigurations() | this.f8314e;
            s();
            this.f8320k = null;
            this.f8319j = false;
            this.f8322m = false;
            this.f8331v = false;
            return i10;
        }

        @t0(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i10 = this.f8317h;
                Drawable[] drawableArr = this.f8316g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && o0.d.b(drawable)) {
                        o0.d.a(drawableArr[i11], theme);
                        this.f8314e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                C(C0138b.c(theme));
            }
        }

        public boolean c() {
            if (this.f8331v) {
                return this.f8332w;
            }
            f();
            this.f8331v = true;
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f8332w = false;
                    return false;
                }
            }
            this.f8332w = true;
            return true;
        }

        @t0(21)
        public boolean canApplyTheme() {
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f8315f.get(i11);
                    if (constantState != null && C0138b.a(constantState)) {
                        return true;
                    }
                } else if (o0.d.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            this.f8334y = false;
        }

        public void e() {
            this.f8322m = true;
            f();
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            this.f8324o = -1;
            this.f8323n = -1;
            this.f8326q = 0;
            this.f8325p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f8323n) {
                    this.f8323n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f8324o) {
                    this.f8324o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f8325p) {
                    this.f8325p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f8326q) {
                    this.f8326q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f8315f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f8316g[this.f8315f.keyAt(i10)] = w(this.f8315f.valueAt(i10).newDrawable(this.f8311b));
                }
                this.f8315f = null;
            }
        }

        public final int g() {
            return this.f8316g.length;
        }

        public int getChangingConfigurations() {
            return this.f8313d | this.f8314e;
        }

        public final Drawable h(int i10) {
            int indexOfKey;
            Drawable drawable = this.f8316g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f8315f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable w10 = w(this.f8315f.valueAt(indexOfKey).newDrawable(this.f8311b));
            this.f8316g[i10] = w10;
            this.f8315f.removeAt(indexOfKey);
            if (this.f8315f.size() == 0) {
                this.f8315f = null;
            }
            return w10;
        }

        public final int i() {
            return this.f8317h;
        }

        public final int j() {
            if (!this.f8322m) {
                e();
            }
            return this.f8324o;
        }

        public final int k() {
            if (!this.f8322m) {
                e();
            }
            return this.f8326q;
        }

        public final int l() {
            if (!this.f8322m) {
                e();
            }
            return this.f8325p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f8318i) {
                return null;
            }
            Rect rect2 = this.f8320k;
            if (rect2 != null || this.f8319j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f8319j = true;
            this.f8320k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f8322m) {
                e();
            }
            return this.f8323n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f8327r) {
                return this.f8328s;
            }
            f();
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f8328s = opacity;
            this.f8327r = true;
            return opacity;
        }

        public void r(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f8316g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f8316g = drawableArr;
        }

        public void s() {
            this.f8327r = false;
            this.f8329t = false;
        }

        public final boolean t() {
            return this.f8321l;
        }

        public final boolean u() {
            if (this.f8329t) {
                return this.f8330u;
            }
            f();
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            boolean z10 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                } else if (drawableArr[i11].isStateful()) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
            this.f8330u = z10;
            this.f8329t = true;
            return z10;
        }

        public void v() {
            int i10 = this.f8317h;
            Drawable[] drawableArr = this.f8316g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f8334y = true;
        }

        public final Drawable w(Drawable drawable) {
            o0.d.m(drawable, this.f8335z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f8310a);
            return mutate;
        }

        public final void x(boolean z10) {
            this.f8321l = z10;
        }

        public final void y(int i10) {
            this.A = i10;
        }

        public final void z(int i10) {
            this.B = i10;
        }
    }

    public static int g(@o0 Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.T = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.Q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0034
            long r9 = r13.X
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0036
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.S
            r3.setAlpha(r9)
            goto L_0x0034
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b$d r10 = r13.O
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.S
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L_0x0037
        L_0x0034:
            r13.X = r7
        L_0x0036:
            r3 = r6
        L_0x0037:
            android.graphics.drawable.Drawable r9 = r13.R
            if (r9 == 0) goto L_0x005d
            long r10 = r13.Y
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004c
            r9.setVisible(r6, r6)
            r0 = 0
            r13.R = r0
            goto L_0x005d
        L_0x004c:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b$d r4 = r13.O
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.S
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0060
        L_0x005d:
            r13.Y = r7
        L_0x005f:
            r0 = r3
        L_0x0060:
            if (r14 == 0) goto L_0x006c
            if (r0 == 0) goto L_0x006c
            java.lang.Runnable r14 = r13.W
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.a(boolean):void");
    }

    @t0(21)
    public void applyTheme(@m0 Resources.Theme theme) {
        this.O.b(theme);
    }

    public void b() {
        this.O.d();
        this.V = false;
    }

    public d c() {
        return this.O;
    }

    @t0(21)
    public boolean canApplyTheme() {
        return this.O.canApplyTheme();
    }

    public int d() {
        return this.U;
    }

    public void draw(@m0 Canvas canvas) {
        Drawable drawable = this.Q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.R;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.Z == null) {
            this.Z = new c();
        }
        drawable.setCallback(this.Z.b(drawable.getCallback()));
        try {
            if (this.O.A <= 0 && this.T) {
                drawable.setAlpha(this.S);
            }
            d dVar = this.O;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    o0.d.o(drawable, dVar.F);
                }
                d dVar2 = this.O;
                if (dVar2.I) {
                    o0.d.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.O.f8333x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            o0.d.m(drawable, o0.d.f(this));
            o0.d.j(drawable, this.O.C);
            Rect rect = this.P;
            if (rect != null) {
                o0.d.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.Z.a());
        }
    }

    public final boolean f() {
        return isAutoMirrored() && o0.d.f(this) == 1;
    }

    public int getAlpha() {
        return this.S;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.O.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.O.c()) {
            return null;
        }
        this.O.f8313d = getChangingConfigurations();
        return this.O;
    }

    @m0
    public Drawable getCurrent() {
        return this.Q;
    }

    public void getHotspotBounds(@m0 Rect rect) {
        Rect rect2 = this.P;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.O.t()) {
            return this.O.j();
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.O.t()) {
            return this.O.n();
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.O.t()) {
            return this.O.k();
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.O.t()) {
            return this.O.l();
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.Q;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.O.q();
    }

    @t0(21)
    public void getOutline(@m0 Outline outline) {
        Drawable drawable = this.Q;
        if (drawable != null) {
            C0138b.b(drawable, outline);
        }
    }

    public boolean getPadding(@m0 Rect rect) {
        boolean z10;
        Rect m10 = this.O.m();
        if (m10 != null) {
            rect.set(m10);
            z10 = (m10.right | ((m10.left | m10.top) | m10.bottom)) != 0;
        } else {
            Drawable drawable = this.Q;
            z10 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.U
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b$d r0 = r9.O
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.R
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.Q
            if (r0 == 0) goto L_0x0029
            r9.R = r0
            h.b$d r0 = r9.O
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.Y = r0
            goto L_0x0035
        L_0x0029:
            r9.R = r4
            r9.Y = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.Q
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            h.b$d r0 = r9.O
            int r1 = r0.f8317h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.h(r10)
            r9.Q = r0
            r9.U = r10
            if (r0 == 0) goto L_0x005a
            h.b$d r10 = r9.O
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.X = r2
        L_0x0051:
            r9.e(r0)
            goto L_0x005a
        L_0x0055:
            r9.Q = r4
            r10 = -1
            r9.U = r10
        L_0x005a:
            long r0 = r9.X
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L_0x0067
            long r1 = r9.Y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r10 = r9.W
            if (r10 != 0) goto L_0x0073
            h.b$a r10 = new h.b$a
            r10.<init>()
            r9.W = r10
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r10)
        L_0x0076:
            r9.a(r0)
        L_0x0079:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.h(int):boolean");
    }

    public void i(d dVar) {
        this.O = dVar;
        int i10 = this.U;
        if (i10 >= 0) {
            Drawable h10 = dVar.h(i10);
            this.Q = h10;
            if (h10 != null) {
                e(h10);
            }
        }
        this.R = null;
    }

    public void invalidateDrawable(@m0 Drawable drawable) {
        d dVar = this.O;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable == this.Q && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.O.C;
    }

    public boolean isStateful() {
        return this.O.u();
    }

    public void j(int i10) {
        h(i10);
    }

    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.R;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.R = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.Q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.T) {
                this.Q.setAlpha(this.S);
            }
        }
        if (this.Y != 0) {
            this.Y = 0;
            z10 = true;
        }
        if (this.X != 0) {
            this.X = 0;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public void k(int i10) {
        this.O.A = i10;
    }

    public void l(int i10) {
        this.O.B = i10;
    }

    public final void m(Resources resources) {
        this.O.C(resources);
    }

    public Drawable mutate() {
        if (!this.V && super.mutate() == this) {
            d c10 = c();
            c10.v();
            i(c10);
            this.V = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.Q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i10) {
        return this.O.A(i10, d());
    }

    public boolean onLevelChange(int i10) {
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.Q;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.R;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.Q;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable, long j10) {
        if (drawable == this.Q && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        if (!this.T || this.S != i10) {
            this.T = true;
            this.S = i10;
            Drawable drawable = this.Q;
            if (drawable == null) {
                return;
            }
            if (this.X == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z10) {
        d dVar = this.O;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.Q;
            if (drawable != null) {
                o0.d.j(drawable, z10);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.O;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.Q;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z10) {
        d dVar = this.O;
        if (dVar.f8333x != z10) {
            dVar.f8333x = z10;
            Drawable drawable = this.Q;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.Q;
        if (drawable != null) {
            o0.d.k(drawable, f10, f11);
        }
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.P;
        if (rect == null) {
            this.P = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.Q;
        if (drawable != null) {
            o0.d.l(drawable, i10, i11, i12, i13);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.O;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            o0.d.o(this.Q, colorStateList);
        }
    }

    public void setTintMode(@m0 PorterDuff.Mode mode) {
        d dVar = this.O;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            o0.d.p(this.Q, mode);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.R;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.Q;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    public void unscheduleDrawable(@m0 Drawable drawable, @m0 Runnable runnable) {
        if (drawable == this.Q && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
