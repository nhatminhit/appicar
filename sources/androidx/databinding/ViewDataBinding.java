package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.i;
import androidx.databinding.u;
import androidx.databinding.y;
import androidx.databinding.z;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.p;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import d.j0;
import d.m0;
import d.o0;
import d.x0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import o1.b;

public abstract class ViewDataBinding extends a implements l3.c {

    /* renamed from: f0  reason: collision with root package name */
    public static int f2326f0 = Build.VERSION.SDK_INT;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f2327g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f2328h0 = 2;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f2329i0 = 3;

    /* renamed from: j0  reason: collision with root package name */
    public static final String f2330j0 = "binding_";

    /* renamed from: k0  reason: collision with root package name */
    public static final int f2331k0 = 8;

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f2332l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public static final j f2333m0 = new a();

    /* renamed from: n0  reason: collision with root package name */
    public static final j f2334n0 = new b();

    /* renamed from: o0  reason: collision with root package name */
    public static final j f2335o0 = new c();

    /* renamed from: p0  reason: collision with root package name */
    public static final j f2336p0 = new d();

    /* renamed from: q0  reason: collision with root package name */
    public static final i.a<b0, ViewDataBinding, Void> f2337q0 = new e();

    /* renamed from: r0  reason: collision with root package name */
    public static final ReferenceQueue<ViewDataBinding> f2338r0 = new ReferenceQueue<>();

    /* renamed from: s0  reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f2339s0 = new f();
    public final Runnable P;
    public boolean Q;
    public boolean R;
    public f0[] S;
    public final View T;
    public i<b0, ViewDataBinding, Void> U;
    public boolean V;
    public Choreographer W;
    public final Choreographer.FrameCallback X;
    public Handler Y;
    public final l Z;

    /* renamed from: a0  reason: collision with root package name */
    public ViewDataBinding f2340a0;

    /* renamed from: b0  reason: collision with root package name */
    public y f2341b0;

    /* renamed from: c0  reason: collision with root package name */
    public OnStartListener f2342c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2343d0;
    @x0({x0.a.P})

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2344e0;

    public static class OnStartListener implements x {
        public final WeakReference<ViewDataBinding> O;

        public OnStartListener(ViewDataBinding viewDataBinding) {
            this.O = new WeakReference<>(viewDataBinding);
        }

        public /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, a aVar) {
            this(viewDataBinding);
        }

        @i0(p.a.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.O.get();
            if (viewDataBinding != null) {
                viewDataBinding.u();
            }
        }
    }

    public class a implements j {
        public f0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new n(viewDataBinding, i10, referenceQueue).c();
        }
    }

    public class b implements j {
        public f0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i10, referenceQueue).c();
        }
    }

    public class c implements j {
        public f0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i10, referenceQueue).c();
        }
    }

    public class d implements j {
        public f0 a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new j(viewDataBinding, i10, referenceQueue).c();
        }
    }

    public class e extends i.a<b0, ViewDataBinding, Void> {
        /* renamed from: b */
        public void a(b0 b0Var, ViewDataBinding viewDataBinding, int i10, Void voidR) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b0Var.b(viewDataBinding);
                } else if (i10 == 3) {
                    b0Var.a(viewDataBinding);
                }
            } else if (!b0Var.c(viewDataBinding)) {
                boolean unused = viewDataBinding.R = true;
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.y(view).P.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = ViewDataBinding.this.Q = false;
            }
            ViewDataBinding.t0();
            if (!ViewDataBinding.this.T.isAttachedToWindow()) {
                ViewDataBinding.this.T.removeOnAttachStateChangeListener(ViewDataBinding.f2339s0);
                ViewDataBinding.this.T.addOnAttachStateChangeListener(ViewDataBinding.f2339s0);
                return;
            }
            ViewDataBinding.this.u();
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        public void doFrame(long j10) {
            ViewDataBinding.this.P.run();
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final String[][] f2345a;

        /* renamed from: b  reason: collision with root package name */
        public final int[][] f2346b;

        /* renamed from: c  reason: collision with root package name */
        public final int[][] f2347c;

        public i(int i10) {
            this.f2345a = new String[i10][];
            this.f2346b = new int[i10][];
            this.f2347c = new int[i10][];
        }

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f2345a[i10] = strArr;
            this.f2346b[i10] = iArr;
            this.f2347c[i10] = iArr2;
        }
    }

    public static class j implements h0, a0<LiveData<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final f0<LiveData<?>> f2348a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<y> f2349b = null;

        public j(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2348a = new f0<>(viewDataBinding, i10, this, referenceQueue);
        }

        /* renamed from: a */
        public void e(LiveData<?> liveData) {
            y g10 = g();
            if (g10 != null) {
                liveData.k(g10, this);
            }
        }

        public void b(@o0 y yVar) {
            y g10 = g();
            LiveData b10 = this.f2348a.b();
            if (b10 != null) {
                if (g10 != null) {
                    b10.p(this);
                }
                if (yVar != null) {
                    b10.k(yVar, this);
                }
            }
            if (yVar != null) {
                this.f2349b = new WeakReference<>(yVar);
            }
        }

        public f0<LiveData<?>> c() {
            return this.f2348a;
        }

        public void f(@o0 Object obj) {
            ViewDataBinding a10 = this.f2348a.a();
            if (a10 != null) {
                f0<LiveData<?>> f0Var = this.f2348a;
                a10.Y(f0Var.f2363b, f0Var.b(), 0);
            }
        }

        @o0
        public final y g() {
            WeakReference<y> weakReference = this.f2349b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: h */
        public void d(LiveData<?> liveData) {
            liveData.p(this);
        }
    }

    public static abstract class k extends u.a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final int f2350a;

        public k(int i10) {
            this.f2350a = i10;
        }

        public void f(u uVar, int i10) {
            if (i10 == this.f2350a || i10 == 0) {
                a();
            }
        }
    }

    public static class l extends y.a implements a0<y> {

        /* renamed from: a  reason: collision with root package name */
        public final f0<y> f2351a;

        public l(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2351a = new f0<>(viewDataBinding, i10, this, referenceQueue);
        }

        public void a(y yVar) {
            y b10;
            ViewDataBinding a10 = this.f2351a.a();
            if (a10 != null && (b10 = this.f2351a.b()) == yVar) {
                a10.Y(this.f2351a.f2363b, b10, 0);
            }
        }

        public void b(androidx.lifecycle.y yVar) {
        }

        public f0<y> c() {
            return this.f2351a;
        }

        public void f(y yVar, int i10, int i11) {
            a(yVar);
        }

        public void g(y yVar, int i10, int i11) {
            a(yVar);
        }

        public void h(y yVar, int i10, int i11, int i12) {
            a(yVar);
        }

        public void i(y yVar, int i10, int i11) {
            a(yVar);
        }

        /* renamed from: j */
        public void e(y yVar) {
            yVar.N(this);
        }

        /* renamed from: k */
        public void d(y yVar) {
            yVar.k(this);
        }
    }

    public static class m extends z.a implements a0<z> {

        /* renamed from: a  reason: collision with root package name */
        public final f0<z> f2352a;

        public m(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2352a = new f0<>(viewDataBinding, i10, this, referenceQueue);
        }

        public void a(z zVar, Object obj) {
            ViewDataBinding a10 = this.f2352a.a();
            if (a10 != null && zVar == this.f2352a.b()) {
                a10.Y(this.f2352a.f2363b, zVar, 0);
            }
        }

        public void b(androidx.lifecycle.y yVar) {
        }

        public f0<z> c() {
            return this.f2352a;
        }

        /* renamed from: f */
        public void e(z zVar) {
            zVar.a(this);
        }

        /* renamed from: g */
        public void d(z zVar) {
            zVar.d(this);
        }
    }

    public static class n extends u.a implements a0<u> {

        /* renamed from: a  reason: collision with root package name */
        public final f0<u> f2353a;

        public n(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f2353a = new f0<>(viewDataBinding, i10, this, referenceQueue);
        }

        public void b(androidx.lifecycle.y yVar) {
        }

        public f0<u> c() {
            return this.f2353a;
        }

        public void f(u uVar, int i10) {
            ViewDataBinding a10 = this.f2353a.a();
            if (a10 != null && this.f2353a.b() == uVar) {
                a10.Y(this.f2353a.f2363b, uVar, i10);
            }
        }

        /* renamed from: g */
        public void e(u uVar) {
            uVar.a(this);
        }

        /* renamed from: h */
        public void d(u uVar) {
            uVar.b(this);
        }
    }

    public ViewDataBinding(l lVar, View view, int i10) {
        this.P = new g();
        this.Q = false;
        this.R = false;
        this.Z = lVar;
        this.S = new f0[i10];
        this.T = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f2332l0) {
            this.W = Choreographer.getInstance();
            this.X = new h();
        } else {
            this.X = null;
            this.Y = new Handler(Looper.myLooper());
        }
    }

    public ViewDataBinding(Object obj, View view, int i10) {
        this(p(obj), view, i10);
    }

    public static int A(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    public static float A0(Float f10) {
        if (f10 == null) {
            return 0.0f;
        }
        return f10.floatValue();
    }

    public static ColorStateList B(View view, int i10) {
        return view.getContext().getColorStateList(i10);
    }

    public static int B0(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static Drawable C(View view, int i10) {
        return view.getContext().getDrawable(i10);
    }

    public static long C0(Long l10) {
        if (l10 == null) {
            return 0;
        }
        return l10.longValue();
    }

    public static <K, T> T D(Map<K, T> map, K k10) {
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    public static short D0(Short sh2) {
        if (sh2 == null) {
            return 0;
        }
        return sh2.shortValue();
    }

    public static byte E(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return 0;
        }
        return bArr[i10];
    }

    public static boolean E0(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static char F(char[] cArr, int i10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return 0;
        }
        return cArr[i10];
    }

    public static void F0(ViewDataBinding viewDataBinding, o oVar, k kVar) {
        if (oVar != kVar) {
            if (oVar != null) {
                viewDataBinding.b((k) oVar);
            }
            if (kVar != null) {
                viewDataBinding.a(kVar);
            }
        }
    }

    public static double G(double[] dArr, int i10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i10];
    }

    public static float H(float[] fArr, int i10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i10];
    }

    public static int I(int[] iArr, int i10) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10];
    }

    public static long J(long[] jArr, int i10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return 0;
        }
        return jArr[i10];
    }

    public static <T> T K(T[] tArr, int i10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static short L(short[] sArr, int i10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return 0;
        }
        return sArr[i10];
    }

    @TargetApi(16)
    public static <T> void L0(LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray != null && i10 >= 0 && i10 < longSparseArray.size()) {
            longSparseArray.put((long) i10, t10);
        }
    }

    public static boolean M(boolean[] zArr, int i10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    public static <T> void M0(SparseArray<T> sparseArray, int i10, T t10) {
        if (sparseArray != null && i10 >= 0 && i10 < sparseArray.size()) {
            sparseArray.put(i10, t10);
        }
    }

    public static void N0(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        if (sparseBooleanArray != null && i10 >= 0 && i10 < sparseBooleanArray.size()) {
            sparseBooleanArray.put(i10, z10);
        }
    }

    public static int O(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null || i10 < 0) {
            return 0;
        }
        return sparseIntArray.get(i10);
    }

    public static void O0(SparseIntArray sparseIntArray, int i10, int i11) {
        if (sparseIntArray != null && i10 >= 0 && i10 < sparseIntArray.size()) {
            sparseIntArray.put(i10, i11);
        }
    }

    @TargetApi(18)
    public static void P0(SparseLongArray sparseLongArray, int i10, long j10) {
        if (sparseLongArray != null && i10 >= 0 && i10 < sparseLongArray.size()) {
            sparseLongArray.put(i10, j10);
        }
    }

    @TargetApi(18)
    public static long Q(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray == null || i10 < 0) {
            return 0;
        }
        return sparseLongArray.get(i10);
    }

    public static <T> void Q0(androidx.collection.f<T> fVar, int i10, T t10) {
        if (fVar != null && i10 >= 0 && i10 < fVar.D()) {
            fVar.u((long) i10, t10);
        }
    }

    @TargetApi(16)
    public static <T> T R(LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get((long) i10);
    }

    public static <T> void R0(List<T> list, int i10, T t10) {
        if (list != null && i10 >= 0 && i10 < list.size()) {
            list.set(i10, t10);
        }
    }

    public static <T> T S(SparseArray<T> sparseArray, int i10) {
        if (sparseArray == null || i10 < 0) {
            return null;
        }
        return sparseArray.get(i10);
    }

    public static <K, T> void S0(Map<K, T> map, K k10, T t10) {
        if (map != null) {
            map.put(k10, t10);
        }
    }

    public static <T> T T(androidx.collection.f<T> fVar, int i10) {
        if (fVar == null || i10 < 0) {
            return null;
        }
        return fVar.n((long) i10);
    }

    public static <T> T U(List<T> list, int i10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static void U0(byte[] bArr, int i10, byte b10) {
        if (bArr != null && i10 >= 0 && i10 < bArr.length) {
            bArr[i10] = b10;
        }
    }

    public static boolean V(SparseBooleanArray sparseBooleanArray, int i10) {
        if (sparseBooleanArray == null || i10 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i10);
    }

    public static void V0(char[] cArr, int i10, char c10) {
        if (cArr != null && i10 >= 0 && i10 < cArr.length) {
            cArr[i10] = c10;
        }
    }

    public static void X0(double[] dArr, int i10, double d10) {
        if (dArr != null && i10 >= 0 && i10 < dArr.length) {
            dArr[i10] = d10;
        }
    }

    public static void Y0(float[] fArr, int i10, float f10) {
        if (fArr != null && i10 >= 0 && i10 < fArr.length) {
            fArr[i10] = f10;
        }
    }

    public static void Z0(int[] iArr, int i10, int i11) {
        if (iArr != null && i10 >= 0 && i10 < iArr.length) {
            iArr[i10] = i11;
        }
    }

    @x0({x0.a.P})
    public static <T extends ViewDataBinding> T a0(@m0 LayoutInflater layoutInflater, int i10, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return m.k(layoutInflater, i10, viewGroup, z10, p(obj));
    }

    public static void a1(long[] jArr, int i10, long j10) {
        if (jArr != null && i10 >= 0 && i10 < jArr.length) {
            jArr[i10] = j10;
        }
    }

    public static <T> void b1(T[] tArr, int i10, T t10) {
        if (tArr != null && i10 >= 0 && i10 < tArr.length) {
            tArr[i10] = t10;
        }
    }

    public static void c1(short[] sArr, int i10, short s10) {
        if (sArr != null && i10 >= 0 && i10 < sArr.length) {
            sArr[i10] = s10;
        }
    }

    public static boolean d0(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static void d1(boolean[] zArr, int i10, boolean z10) {
        if (zArr != null && i10 >= 0 && i10 < zArr.length) {
            zArr[i10] = z10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x010e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e0(androidx.databinding.l r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            r6 = r17
            r0 = r18
            r7 = r20
            r8 = r21
            androidx.databinding.ViewDataBinding r1 = y(r18)
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = r18.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x001a
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            java.lang.String r9 = "layout"
            r2 = -1
            r11 = 1
            if (r22 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            boolean r3 = r1.startsWith(r9)
            if (r3 == 0) goto L_0x004b
            r3 = 95
            int r3 = r1.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0047
            int r3 = r3 + r11
            boolean r4 = d0(r1, r3)
            if (r4 == 0) goto L_0x0047
            int r1 = s0(r1, r3)
            r3 = r19[r1]
            if (r3 != 0) goto L_0x0042
            r19[r1] = r0
        L_0x0042:
            if (r7 != 0) goto L_0x0045
            r1 = r2
        L_0x0045:
            r3 = r11
            goto L_0x0049
        L_0x0047:
            r1 = r2
            r3 = 0
        L_0x0049:
            r12 = r1
            goto L_0x0069
        L_0x004b:
            if (r1 == 0) goto L_0x0067
            java.lang.String r3 = "binding_"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0067
            int r3 = f2331k0
            int r1 = s0(r1, r3)
            r3 = r19[r1]
            if (r3 != 0) goto L_0x0061
            r19[r1] = r0
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            r1 = r2
        L_0x0064:
            r12 = r1
            r3 = r11
            goto L_0x0069
        L_0x0067:
            r12 = r2
            r3 = 0
        L_0x0069:
            if (r3 != 0) goto L_0x007f
            int r1 = r18.getId()
            if (r1 <= 0) goto L_0x007f
            if (r8 == 0) goto L_0x007f
            int r1 = r8.get(r1, r2)
            if (r1 < 0) goto L_0x007f
            r2 = r19[r1]
            if (r2 != 0) goto L_0x007f
            r19[r1] = r0
        L_0x007f:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0119
            r13 = r0
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r14 = r13.getChildCount()
            r0 = 0
            r1 = 0
        L_0x008c:
            if (r0 >= r14) goto L_0x0119
            android.view.View r2 = r13.getChildAt(r0)
            if (r12 < 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r2.getTag()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "_0"
            boolean r4 = r3.endsWith(r4)
            if (r4 == 0) goto L_0x00fc
            boolean r4 = r3.startsWith(r9)
            if (r4 == 0) goto L_0x00fc
            r4 = 47
            int r4 = r3.indexOf(r4)
            if (r4 <= 0) goto L_0x00fc
            int r3 = v(r3, r1, r7, r12)
            if (r3 < 0) goto L_0x00fc
            int r1 = r3 + 1
            int[][] r4 = r7.f2346b
            r4 = r4[r12]
            r4 = r4[r3]
            int[][] r5 = r7.f2347c
            r5 = r5[r12]
            r3 = r5[r3]
            int r5 = w(r13, r0)
            if (r5 != r0) goto L_0x00dc
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.m.c(r6, r2, r3)
            r19[r4] = r3
            r10 = r0
            r0 = r11
            r11 = r1
            goto L_0x00ff
        L_0x00dc:
            int r5 = r5 - r0
            int r5 = r5 + r11
            android.view.View[] r15 = new android.view.View[r5]
            r10 = 0
        L_0x00e1:
            if (r10 >= r5) goto L_0x00ef
            int r11 = r0 + r10
            android.view.View r11 = r13.getChildAt(r11)
            r15[r10] = r11
            int r10 = r10 + 1
            r11 = 1
            goto L_0x00e1
        L_0x00ef:
            androidx.databinding.ViewDataBinding r3 = androidx.databinding.m.d(r6, r15, r3)
            r19[r4] = r3
            int r5 = r5 + -1
            int r0 = r0 + r5
            r10 = r0
            r11 = r1
            r0 = 1
            goto L_0x00ff
        L_0x00fc:
            r10 = r0
            r11 = r1
            r0 = 0
        L_0x00ff:
            if (r0 != 0) goto L_0x010e
            r5 = 0
            r0 = r17
            r1 = r2
            r2 = r19
            r3 = r20
            r4 = r21
            e0(r0, r1, r2, r3, r4, r5)
        L_0x010e:
            r0 = 1
            int r1 = r10 + 1
            r16 = r11
            r11 = r0
            r0 = r1
            r1 = r16
            goto L_0x008c
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.e0(androidx.databinding.l, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] f0(l lVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        e0(lVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    public static Object[] g0(l lVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View e02 : viewArr) {
            e0(lVar, e02, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    public static byte i0(String str, byte b10) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static char j0(String str, char c10) {
        return (str == null || str.isEmpty()) ? c10 : str.charAt(0);
    }

    public static double l0(String str, double d10) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d10;
        }
    }

    public static float n0(String str, float f10) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f10;
        }
    }

    public static ViewDataBinding o(Object obj, View view, int i10) {
        return m.c(p(obj), view, i10);
    }

    public static int o0(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static l p(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof l) {
            return (l) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static long p0(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static short q0(String str, short s10) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s10;
        }
    }

    public static boolean r0(String str, boolean z10) {
        return str == null ? z10 : Boolean.parseBoolean(str);
    }

    public static int s0(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            i11 = (i11 * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return i11;
    }

    public static void t(ViewDataBinding viewDataBinding) {
        viewDataBinding.s();
    }

    public static void t0() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f2338r0.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof f0) {
                ((f0) poll).e();
            }
        }
    }

    public static int v(String str, int i10, i iVar, int i11) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f2345a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(subSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int w(ViewGroup viewGroup, int i10) {
        String str = (String) viewGroup.getChildAt(i10).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i10;
                }
                if (d0(str2, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    public static byte x0(Byte b10) {
        if (b10 == null) {
            return 0;
        }
        return b10.byteValue();
    }

    public static ViewDataBinding y(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(b.e.dataBinding);
        }
        return null;
    }

    public static char y0(Character ch2) {
        if (ch2 == null) {
            return 0;
        }
        return ch2.charValue();
    }

    public static int z() {
        return f2326f0;
    }

    public static double z0(Double d10) {
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }

    public void G0(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f2340a0 = this;
        }
    }

    @j0
    public void I0(@o0 androidx.lifecycle.y yVar) {
        boolean z10 = yVar instanceof Fragment;
        androidx.lifecycle.y yVar2 = this.f2341b0;
        if (yVar2 != yVar) {
            if (yVar2 != null) {
                yVar2.getLifecycle().d(this.f2342c0);
            }
            this.f2341b0 = yVar;
            if (yVar != null) {
                if (this.f2342c0 == null) {
                    this.f2342c0 = new OnStartListener(this, (a) null);
                }
                yVar.getLifecycle().a(this.f2342c0);
            }
            for (f0 f0Var : this.S) {
                if (f0Var != null) {
                    f0Var.c(yVar);
                }
            }
        }
    }

    public void J0(View view) {
        view.setTag(b.e.dataBinding, this);
    }

    public void K0(View[] viewArr) {
        for (View tag : viewArr) {
            tag.setTag(b.e.dataBinding, this);
        }
    }

    @o0
    public androidx.lifecycle.y W() {
        return this.f2341b0;
    }

    public Object X(int i10) {
        f0 f0Var = this.S[i10];
        if (f0Var == null) {
            return null;
        }
        return f0Var.b();
    }

    @x0({x0.a.P})
    public void Y(int i10, Object obj, int i11) {
        if (!this.f2343d0 && !this.f2344e0 && h0(i10, obj, i11)) {
            w0();
        }
    }

    public abstract boolean Z();

    public abstract void b0();

    public abstract boolean e1(int i10, @o0 Object obj);

    public void f1() {
        for (f0 f0Var : this.S) {
            if (f0Var != null) {
                f0Var.e();
            }
        }
    }

    public boolean g1(int i10) {
        f0 f0Var = this.S[i10];
        if (f0Var != null) {
            return f0Var.e();
        }
        return false;
    }

    @m0
    public View getRoot() {
        return this.T;
    }

    public abstract boolean h0(int i10, Object obj, int i11);

    public boolean h1(int i10, LiveData<?> liveData) {
        this.f2343d0 = true;
        try {
            return l1(i10, liveData, f2336p0);
        } finally {
            this.f2343d0 = false;
        }
    }

    public boolean i1(int i10, u uVar) {
        return l1(i10, uVar, f2333m0);
    }

    public boolean j1(int i10, y yVar) {
        return l1(i10, yVar, f2334n0);
    }

    public boolean k1(int i10, z zVar) {
        return l1(i10, zVar, f2335o0);
    }

    @x0({x0.a.P})
    public boolean l1(int i10, Object obj, j jVar) {
        if (obj == null) {
            return g1(i10);
        }
        f0 f0Var = this.S[i10];
        if (f0Var == null) {
            u0(i10, obj, jVar);
            return true;
        } else if (f0Var.b() == obj) {
            return false;
        } else {
            g1(i10);
            u0(i10, obj, jVar);
            return true;
        }
    }

    public void n(@m0 b0 b0Var) {
        if (this.U == null) {
            this.U = new i<>(f2337q0);
        }
        this.U.a(b0Var);
    }

    public void q(Class<?> cls) {
        if (this.Z == null) {
            throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
        }
    }

    public abstract void r();

    public final void s() {
        if (this.V) {
            w0();
        } else if (Z()) {
            this.V = true;
            this.R = false;
            i<b0, ViewDataBinding, Void> iVar = this.U;
            if (iVar != null) {
                iVar.n(this, 1, null);
                if (this.R) {
                    this.U.n(this, 2, null);
                }
            }
            if (!this.R) {
                r();
                i<b0, ViewDataBinding, Void> iVar2 = this.U;
                if (iVar2 != null) {
                    iVar2.n(this, 3, null);
                }
            }
            this.V = false;
        }
    }

    public void u() {
        ViewDataBinding viewDataBinding = this.f2340a0;
        if (viewDataBinding == null) {
            s();
        } else {
            viewDataBinding.u();
        }
    }

    public void u0(int i10, Object obj, j jVar) {
        if (obj != null) {
            f0 f0Var = this.S[i10];
            if (f0Var == null) {
                f0Var = jVar.a(this, i10, f2338r0);
                this.S[i10] = f0Var;
                androidx.lifecycle.y yVar = this.f2341b0;
                if (yVar != null) {
                    f0Var.c(yVar);
                }
            }
            f0Var.d(obj);
        }
    }

    public void v0(@m0 b0 b0Var) {
        i<b0, ViewDataBinding, Void> iVar = this.U;
        if (iVar != null) {
            iVar.t(b0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (f2332l0 == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r2.W.postFrameCallback(r2.X);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r2.Y.post(r2.P);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w0() {
        /*
            r2 = this;
            androidx.databinding.ViewDataBinding r0 = r2.f2340a0
            if (r0 == 0) goto L_0x0008
            r0.w0()
            goto L_0x003b
        L_0x0008:
            androidx.lifecycle.y r0 = r2.f2341b0
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.p r0 = r0.getLifecycle()
            androidx.lifecycle.p$b r0 = r0.b()
            androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.STARTED
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.Q     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0024
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            return
        L_0x0024:
            r0 = 1
            r2.Q = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            boolean r0 = f2332l0
            if (r0 == 0) goto L_0x0034
            android.view.Choreographer r0 = r2.W
            android.view.Choreographer$FrameCallback r1 = r2.X
            r0.postFrameCallback(r1)
            goto L_0x003b
        L_0x0034:
            android.os.Handler r0 = r2.Y
            java.lang.Runnable r1 = r2.P
            r0.post(r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.w0():void");
    }

    public void x() {
        r();
    }
}
