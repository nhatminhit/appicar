package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.i;
import d.b0;
import d.m0;
import d.o0;
import d.x0;
import f1.w1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import k0.l;

public abstract class j0 implements Cloneable {
    public static final int A0 = 3;
    public static final int B0 = 4;
    public static final int C0 = 4;
    public static final String D0 = "instance";
    public static final String E0 = "name";
    public static final String F0 = "id";
    public static final String G0 = "itemId";
    public static final int[] H0 = {2, 1, 3, 4};
    public static final z I0 = new a();
    public static ThreadLocal<androidx.collection.a<Animator, d>> J0 = new ThreadLocal<>();

    /* renamed from: v0  reason: collision with root package name */
    public static final String f7744v0 = "Transition";

    /* renamed from: w0  reason: collision with root package name */
    public static final boolean f7745w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f7746x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f7747y0 = 1;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f7748z0 = 2;
    public String O = getClass().getName();
    public long P = -1;
    public long Q = -1;
    public TimeInterpolator R = null;
    public ArrayList<Integer> S = new ArrayList<>();
    public ArrayList<View> T = new ArrayList<>();
    public ArrayList<String> U = null;
    public ArrayList<Class<?>> V = null;
    public ArrayList<Integer> W = null;
    public ArrayList<View> X = null;
    public ArrayList<Class<?>> Y = null;
    public ArrayList<String> Z = null;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList<Integer> f7749a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList<View> f7750b0 = null;

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList<Class<?>> f7751c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public s0 f7752d0 = new s0();

    /* renamed from: e0  reason: collision with root package name */
    public s0 f7753e0 = new s0();

    /* renamed from: f0  reason: collision with root package name */
    public o0 f7754f0 = null;

    /* renamed from: g0  reason: collision with root package name */
    public int[] f7755g0 = H0;

    /* renamed from: h0  reason: collision with root package name */
    public ArrayList<r0> f7756h0;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList<r0> f7757i0;

    /* renamed from: j0  reason: collision with root package name */
    public ViewGroup f7758j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f7759k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public ArrayList<Animator> f7760l0 = new ArrayList<>();

    /* renamed from: m0  reason: collision with root package name */
    public int f7761m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f7762n0 = false;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7763o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList<h> f7764p0 = null;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList<Animator> f7765q0 = new ArrayList<>();

    /* renamed from: r0  reason: collision with root package name */
    public n0 f7766r0;

    /* renamed from: s0  reason: collision with root package name */
    public f f7767s0;

    /* renamed from: t0  reason: collision with root package name */
    public androidx.collection.a<String, String> f7768t0;

    /* renamed from: u0  reason: collision with root package name */
    public z f7769u0 = I0;

    public static class a extends z {
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.collection.a f7770a;

        public b(androidx.collection.a aVar) {
            this.f7770a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7770a.remove(animator);
            j0.this.f7760l0.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            j0.this.f7760l0.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            j0.this.z();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f7773a;

        /* renamed from: b  reason: collision with root package name */
        public String f7774b;

        /* renamed from: c  reason: collision with root package name */
        public r0 f7775c;

        /* renamed from: d  reason: collision with root package name */
        public w1 f7776d;

        /* renamed from: e  reason: collision with root package name */
        public j0 f7777e;

        public d(View view, String str, j0 j0Var, w1 w1Var, r0 r0Var) {
            this.f7773a = view;
            this.f7774b = str;
            this.f7775c = r0Var;
            this.f7776d = w1Var;
            this.f7777e = j0Var;
        }
    }

    public static class e {
        public static <T> ArrayList<T> a(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t10)) {
                arrayList.add(t10);
            }
            return arrayList;
        }

        public static <T> ArrayList<T> b(ArrayList<T> arrayList, T t10) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t10);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a(@m0 j0 j0Var);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    public interface h {
        void a(@m0 j0 j0Var);

        void b(@m0 j0 j0Var);

        void c(@m0 j0 j0Var);

        void d(@m0 j0 j0Var);

        void e(@m0 j0 j0Var);
    }

    public j0() {
    }

    @SuppressLint({"RestrictedApi"})
    public j0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7711c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long k10 = (long) l.k(obtainStyledAttributes, xmlResourceParser, l6.d.f10232d, 1, -1);
        if (k10 >= 0) {
            x0(k10);
        }
        long k11 = (long) l.k(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (k11 > 0) {
            E0(k11);
        }
        int l10 = l.l(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (l10 > 0) {
            z0(AnimationUtils.loadInterpolator(context, l10));
        }
        String m10 = l.m(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m10 != null) {
            A0(l0(m10));
        }
        obtainStyledAttributes.recycle();
    }

    public static <T> ArrayList<T> E(ArrayList<T> arrayList, T t10, boolean z10) {
        return t10 != null ? z10 ? e.a(arrayList, t10) : e.b(arrayList, t10) : arrayList;
    }

    public static androidx.collection.a<Animator, d> U() {
        androidx.collection.a<Animator, d> aVar = J0.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        J0.set(aVar2);
        return aVar2;
    }

    public static boolean d0(int i10) {
        return i10 >= 1 && i10 <= 4;
    }

    public static boolean f0(r0 r0Var, r0 r0Var2, String str) {
        Object obj = r0Var.f7847a.get(str);
        Object obj2 = r0Var2.f7847a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static int[] l0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i10 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i10] = 3;
            } else if (D0.equalsIgnoreCase(trim)) {
                iArr[i10] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i10] = 2;
            } else if (G0.equalsIgnoreCase(trim)) {
                iArr[i10] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[(iArr.length - 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                i10--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i10++;
        }
        return iArr;
    }

    public static void m(s0 s0Var, View view, r0 r0Var) {
        s0Var.f7857a.put(view, r0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (s0Var.f7858b.indexOfKey(id2) >= 0) {
                s0Var.f7858b.put(id2, (Object) null);
            } else {
                s0Var.f7858b.put(id2, view);
            }
        }
        String w02 = w1.w0(view);
        if (w02 != null) {
            if (s0Var.f7860d.containsKey(w02)) {
                s0Var.f7860d.put(w02, null);
            } else {
                s0Var.f7860d.put(w02, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (s0Var.f7859c.q(itemIdAtPosition) >= 0) {
                    View n10 = s0Var.f7859c.n(itemIdAtPosition);
                    if (n10 != null) {
                        w1.O1(n10, false);
                        s0Var.f7859c.u(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                w1.O1(view, true);
                s0Var.f7859c.u(itemIdAtPosition, view);
            }
        }
    }

    public static boolean n(int[] iArr, int i10) {
        int i11 = iArr[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    @m0
    public j0 A(@b0 int i10, boolean z10) {
        this.f7749a0 = D(this.f7749a0, i10, z10);
        return this;
    }

    public void A0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f7755g0 = H0;
            return;
        }
        int i10 = 0;
        while (i10 < iArr.length) {
            if (!d0(iArr[i10])) {
                throw new IllegalArgumentException("matches contains invalid value");
            } else if (!n(iArr, i10)) {
                i10++;
            } else {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f7755g0 = (int[]) iArr.clone();
    }

    @m0
    public j0 B(@m0 View view, boolean z10) {
        this.f7750b0 = K(this.f7750b0, view, z10);
        return this;
    }

    public void B0(@o0 z zVar) {
        if (zVar == null) {
            zVar = I0;
        }
        this.f7769u0 = zVar;
    }

    @m0
    public j0 C(@m0 Class<?> cls, boolean z10) {
        this.f7751c0 = J(this.f7751c0, cls, z10);
        return this;
    }

    public void C0(@o0 n0 n0Var) {
        this.f7766r0 = n0Var;
    }

    public final ArrayList<Integer> D(ArrayList<Integer> arrayList, int i10, boolean z10) {
        if (i10 <= 0) {
            return arrayList;
        }
        Integer valueOf = Integer.valueOf(i10);
        return z10 ? e.a(arrayList, valueOf) : e.b(arrayList, valueOf);
    }

    public j0 D0(ViewGroup viewGroup) {
        this.f7758j0 = viewGroup;
        return this;
    }

    @m0
    public j0 E0(long j10) {
        this.P = j10;
        return this;
    }

    @m0
    public j0 F(@b0 int i10, boolean z10) {
        this.W = D(this.W, i10, z10);
        return this;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void F0() {
        if (this.f7761m0 == 0) {
            ArrayList<h> arrayList = this.f7764p0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7764p0.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((h) arrayList2.get(i10)).b(this);
                }
            }
            this.f7763o0 = false;
        }
        this.f7761m0++;
    }

    @m0
    public j0 G(@m0 View view, boolean z10) {
        this.X = K(this.X, view, z10);
        return this;
    }

    public String G0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.Q != -1) {
            str2 = str2 + "dur(" + this.Q + ") ";
        }
        if (this.P != -1) {
            str2 = str2 + "dly(" + this.P + ") ";
        }
        if (this.R != null) {
            str2 = str2 + "interp(" + this.R + ") ";
        }
        if (this.S.size() <= 0 && this.T.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.S.size() > 0) {
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.S.get(i10);
            }
        }
        if (this.T.size() > 0) {
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.T.get(i11);
            }
        }
        return str3 + ")";
    }

    @m0
    public j0 H(@m0 Class<?> cls, boolean z10) {
        this.Y = J(this.Y, cls, z10);
        return this;
    }

    @m0
    public j0 I(@m0 String str, boolean z10) {
        this.Z = E(this.Z, str, z10);
        return this;
    }

    public final ArrayList<Class<?>> J(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z10) {
        return cls != null ? z10 ? e.a(arrayList, cls) : e.b(arrayList, cls) : arrayList;
    }

    public final ArrayList<View> K(ArrayList<View> arrayList, View view, boolean z10) {
        return view != null ? z10 ? e.a(arrayList, view) : e.b(arrayList, view) : arrayList;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void L(ViewGroup viewGroup) {
        androidx.collection.a<Animator, d> U2 = U();
        int size = U2.size();
        if (viewGroup != null && size != 0) {
            w1 d10 = e1.d(viewGroup);
            androidx.collection.a aVar = new androidx.collection.a((i) U2);
            U2.clear();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = (d) aVar.q(i10);
                if (!(dVar.f7773a == null || d10 == null || !d10.equals(dVar.f7776d))) {
                    ((Animator) aVar.m(i10)).end();
                }
            }
        }
    }

    public long M() {
        return this.Q;
    }

    @o0
    public Rect N() {
        f fVar = this.f7767s0;
        if (fVar == null) {
            return null;
        }
        return fVar.a(this);
    }

    @o0
    public f O() {
        return this.f7767s0;
    }

    @o0
    public TimeInterpolator P() {
        return this.R;
    }

    public r0 Q(View view, boolean z10) {
        o0 o0Var = this.f7754f0;
        if (o0Var != null) {
            return o0Var.Q(view, z10);
        }
        ArrayList<r0> arrayList = z10 ? this.f7756h0 : this.f7757i0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            r0 r0Var = arrayList.get(i11);
            if (r0Var == null) {
                return null;
            }
            if (r0Var.f7848b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z10 ? this.f7757i0 : this.f7756h0).get(i10);
    }

    @m0
    public String R() {
        return this.O;
    }

    @m0
    public z S() {
        return this.f7769u0;
    }

    @o0
    public n0 T() {
        return this.f7766r0;
    }

    public long V() {
        return this.P;
    }

    @m0
    public List<Integer> W() {
        return this.S;
    }

    @o0
    public List<String> X() {
        return this.U;
    }

    @o0
    public List<Class<?>> Y() {
        return this.V;
    }

    @m0
    public List<View> Z() {
        return this.T;
    }

    @m0
    public j0 a(@m0 h hVar) {
        if (this.f7764p0 == null) {
            this.f7764p0 = new ArrayList<>();
        }
        this.f7764p0.add(hVar);
        return this;
    }

    @o0
    public String[] a0() {
        return null;
    }

    @o0
    public r0 b0(@m0 View view, boolean z10) {
        o0 o0Var = this.f7754f0;
        if (o0Var != null) {
            return o0Var.b0(view, z10);
        }
        return (z10 ? this.f7752d0 : this.f7753e0).f7857a.get(view);
    }

    public boolean c0(@o0 r0 r0Var, @o0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null) {
            return false;
        }
        String[] a02 = a0();
        if (a02 != null) {
            int length = a02.length;
            int i10 = 0;
            while (i10 < length) {
                if (!f0(r0Var, r0Var2, a02[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String f02 : r0Var.f7847a.keySet()) {
            if (f0(r0Var, r0Var2, f02)) {
            }
        }
        return false;
        return true;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.f7760l0.size() - 1; size >= 0; size--) {
            this.f7760l0.get(size).cancel();
        }
        ArrayList<h> arrayList = this.f7764p0;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f7764p0.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((h) arrayList2.get(i10)).d(this);
            }
        }
    }

    @m0
    public j0 d(@b0 int i10) {
        if (i10 != 0) {
            this.S.add(Integer.valueOf(i10));
        }
        return this;
    }

    public boolean e0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.W;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.X;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.Y;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.Y.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.Z != null && w1.w0(view) != null && this.Z.contains(w1.w0(view))) {
            return false;
        }
        if ((this.S.size() == 0 && this.T.size() == 0 && (((arrayList = this.V) == null || arrayList.isEmpty()) && ((arrayList2 = this.U) == null || arrayList2.isEmpty()))) || this.S.contains(Integer.valueOf(id2)) || this.T.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.U;
        if (arrayList6 != null && arrayList6.contains(w1.w0(view))) {
            return true;
        }
        if (this.V != null) {
            for (int i11 = 0; i11 < this.V.size(); i11++) {
                if (this.V.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @m0
    public j0 g(@m0 View view) {
        this.T.add(view);
        return this;
    }

    public final void g0(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && e0(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && e0(view)) {
                r0 r0Var = aVar.get(valueAt);
                r0 r0Var2 = aVar2.get(view);
                if (!(r0Var == null || r0Var2 == null)) {
                    this.f7756h0.add(r0Var);
                    this.f7757i0.add(r0Var2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void h0(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2) {
        r0 remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m10 = aVar.m(size);
            if (m10 != null && e0(m10) && (remove = aVar2.remove(m10)) != null && e0(remove.f7848b)) {
                this.f7756h0.add(aVar.o(size));
                this.f7757i0.add(remove);
            }
        }
    }

    @m0
    public j0 i(@m0 Class<?> cls) {
        if (this.V == null) {
            this.V = new ArrayList<>();
        }
        this.V.add(cls);
        return this;
    }

    public final void i0(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, androidx.collection.f<View> fVar, androidx.collection.f<View> fVar2) {
        View n10;
        int D = fVar.D();
        for (int i10 = 0; i10 < D; i10++) {
            View E = fVar.E(i10);
            if (E != null && e0(E) && (n10 = fVar2.n(fVar.t(i10))) != null && e0(n10)) {
                r0 r0Var = aVar.get(E);
                r0 r0Var2 = aVar2.get(n10);
                if (!(r0Var == null || r0Var2 == null)) {
                    this.f7756h0.add(r0Var);
                    this.f7757i0.add(r0Var2);
                    aVar.remove(E);
                    aVar2.remove(n10);
                }
            }
        }
    }

    @m0
    public j0 j(@m0 String str) {
        if (this.U == null) {
            this.U = new ArrayList<>();
        }
        this.U.add(str);
        return this;
    }

    public final void j0(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View q10 = aVar3.q(i10);
            if (q10 != null && e0(q10) && (view = aVar4.get(aVar3.m(i10))) != null && e0(view)) {
                r0 r0Var = aVar.get(q10);
                r0 r0Var2 = aVar2.get(view);
                if (!(r0Var == null || r0Var2 == null)) {
                    this.f7756h0.add(r0Var);
                    this.f7757i0.add(r0Var2);
                    aVar.remove(q10);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void k(androidx.collection.a<View, r0> aVar, androidx.collection.a<View, r0> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            r0 q10 = aVar.q(i10);
            if (e0(q10.f7848b)) {
                this.f7756h0.add(q10);
                this.f7757i0.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            r0 q11 = aVar2.q(i11);
            if (e0(q11.f7848b)) {
                this.f7757i0.add(q11);
                this.f7756h0.add((Object) null);
            }
        }
    }

    public final void k0(s0 s0Var, s0 s0Var2) {
        androidx.collection.a aVar = new androidx.collection.a((i) s0Var.f7857a);
        androidx.collection.a aVar2 = new androidx.collection.a((i) s0Var2.f7857a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f7755g0;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    h0(aVar, aVar2);
                } else if (i11 == 2) {
                    j0(aVar, aVar2, s0Var.f7860d, s0Var2.f7860d);
                } else if (i11 == 3) {
                    g0(aVar, aVar2, s0Var.f7858b, s0Var2.f7858b);
                } else if (i11 == 4) {
                    i0(aVar, aVar2, s0Var.f7859c, s0Var2.f7859c);
                }
                i10++;
            } else {
                k(aVar, aVar2);
                return;
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void m0(View view) {
        if (!this.f7763o0) {
            androidx.collection.a<Animator, d> U2 = U();
            int size = U2.size();
            w1 d10 = e1.d(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d q10 = U2.q(i10);
                if (q10.f7773a != null && d10.equals(q10.f7776d)) {
                    a.b(U2.m(i10));
                }
            }
            ArrayList<h> arrayList = this.f7764p0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7764p0.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((h) arrayList2.get(i11)).a(this);
                }
            }
            this.f7762n0 = true;
        }
    }

    public void n0(ViewGroup viewGroup) {
        d dVar;
        this.f7756h0 = new ArrayList<>();
        this.f7757i0 = new ArrayList<>();
        k0(this.f7752d0, this.f7753e0);
        androidx.collection.a<Animator, d> U2 = U();
        int size = U2.size();
        w1 d10 = e1.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator m10 = U2.m(i10);
            if (!(m10 == null || (dVar = U2.get(m10)) == null || dVar.f7773a == null || !d10.equals(dVar.f7776d))) {
                r0 r0Var = dVar.f7775c;
                View view = dVar.f7773a;
                r0 b02 = b0(view, true);
                r0 Q2 = Q(view, true);
                if (b02 == null && Q2 == null) {
                    Q2 = this.f7753e0.f7857a.get(view);
                }
                if (!(b02 == null && Q2 == null) && dVar.f7777e.c0(r0Var, Q2)) {
                    if (m10.isRunning() || m10.isStarted()) {
                        m10.cancel();
                    } else {
                        U2.remove(m10);
                    }
                }
            }
        }
        y(viewGroup, this.f7752d0, this.f7753e0, this.f7756h0, this.f7757i0);
        v0();
    }

    @m0
    public j0 o0(@m0 h hVar) {
        ArrayList<h> arrayList = this.f7764p0;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(hVar);
        if (this.f7764p0.size() == 0) {
            this.f7764p0 = null;
        }
        return this;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void p(Animator animator) {
        if (animator == null) {
            z();
            return;
        }
        if (M() >= 0) {
            animator.setDuration(M());
        }
        if (V() >= 0) {
            animator.setStartDelay(V() + animator.getStartDelay());
        }
        if (P() != null) {
            animator.setInterpolator(P());
        }
        animator.addListener(new c());
        animator.start();
    }

    @m0
    public j0 p0(@b0 int i10) {
        if (i10 != 0) {
            this.S.remove(Integer.valueOf(i10));
        }
        return this;
    }

    public abstract void q(@m0 r0 r0Var);

    @m0
    public j0 q0(@m0 View view) {
        this.T.remove(view);
        return this;
    }

    public final void r(View view, boolean z10) {
        if (view != null) {
            int id2 = view.getId();
            ArrayList<Integer> arrayList = this.W;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
                ArrayList<View> arrayList2 = this.X;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.Y;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!this.Y.get(i10).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        r0 r0Var = new r0(view);
                        if (z10) {
                            t(r0Var);
                        } else {
                            q(r0Var);
                        }
                        r0Var.f7849c.add(this);
                        s(r0Var);
                        m(z10 ? this.f7752d0 : this.f7753e0, view, r0Var);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f7749a0;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                            ArrayList<View> arrayList5 = this.f7750b0;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f7751c0;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!this.f7751c0.get(i11).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    r(viewGroup.getChildAt(i12), z10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @m0
    public j0 r0(@m0 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.V;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public void s(r0 r0Var) {
        String[] b10;
        if (this.f7766r0 != null && !r0Var.f7847a.isEmpty() && (b10 = this.f7766r0.b()) != null) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= b10.length) {
                    z10 = true;
                    break;
                } else if (!r0Var.f7847a.containsKey(b10[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                this.f7766r0.a(r0Var);
            }
        }
    }

    @m0
    public j0 s0(@m0 String str) {
        ArrayList<String> arrayList = this.U;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public abstract void t(@m0 r0 r0Var);

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void t0(View view) {
        if (this.f7762n0) {
            if (!this.f7763o0) {
                androidx.collection.a<Animator, d> U2 = U();
                int size = U2.size();
                w1 d10 = e1.d(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d q10 = U2.q(i10);
                    if (q10.f7773a != null && d10.equals(q10.f7776d)) {
                        a.c(U2.m(i10));
                    }
                }
                ArrayList<h> arrayList = this.f7764p0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f7764p0.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((h) arrayList2.get(i11)).c(this);
                    }
                }
            }
            this.f7762n0 = false;
        }
    }

    public String toString() {
        return G0("");
    }

    public void u(ViewGroup viewGroup, boolean z10) {
        androidx.collection.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        v(z10);
        if ((this.S.size() > 0 || this.T.size() > 0) && (((arrayList = this.U) == null || arrayList.isEmpty()) && ((arrayList2 = this.V) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.S.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.S.get(i10).intValue());
                if (findViewById != null) {
                    r0 r0Var = new r0(findViewById);
                    if (z10) {
                        t(r0Var);
                    } else {
                        q(r0Var);
                    }
                    r0Var.f7849c.add(this);
                    s(r0Var);
                    m(z10 ? this.f7752d0 : this.f7753e0, findViewById, r0Var);
                }
            }
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                View view = this.T.get(i11);
                r0 r0Var2 = new r0(view);
                if (z10) {
                    t(r0Var2);
                } else {
                    q(r0Var2);
                }
                r0Var2.f7849c.add(this);
                s(r0Var2);
                m(z10 ? this.f7752d0 : this.f7753e0, view, r0Var2);
            }
        } else {
            r(viewGroup, z10);
        }
        if (!z10 && (aVar = this.f7768t0) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f7752d0.f7860d.remove(this.f7768t0.m(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f7752d0.f7860d.put(this.f7768t0.q(i13), view2);
                }
            }
        }
    }

    public final void u0(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            p(animator);
        }
    }

    public void v(boolean z10) {
        s0 s0Var;
        if (z10) {
            this.f7752d0.f7857a.clear();
            this.f7752d0.f7858b.clear();
            s0Var = this.f7752d0;
        } else {
            this.f7753e0.f7857a.clear();
            this.f7753e0.f7858b.clear();
            s0Var = this.f7753e0;
        }
        s0Var.f7859c.d();
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void v0() {
        F0();
        androidx.collection.a<Animator, d> U2 = U();
        Iterator<Animator> it = this.f7765q0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (U2.containsKey(next)) {
                F0();
                u0(next, U2);
            }
        }
        this.f7765q0.clear();
        z();
    }

    /* renamed from: w */
    public j0 clone() {
        try {
            j0 j0Var = (j0) super.clone();
            j0Var.f7765q0 = new ArrayList<>();
            j0Var.f7752d0 = new s0();
            j0Var.f7753e0 = new s0();
            j0Var.f7756h0 = null;
            j0Var.f7757i0 = null;
            return j0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public void w0(boolean z10) {
        this.f7759k0 = z10;
    }

    @o0
    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        return null;
    }

    @m0
    public j0 x0(long j10) {
        this.Q = j10;
        return this;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void y(ViewGroup viewGroup, s0 s0Var, s0 s0Var2, ArrayList<r0> arrayList, ArrayList<r0> arrayList2) {
        int i10;
        Animator x10;
        View view;
        Animator animator;
        r0 r0Var;
        r0 r0Var2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        androidx.collection.a<Animator, d> U2 = U();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            r0 r0Var3 = arrayList.get(i11);
            r0 r0Var4 = arrayList2.get(i11);
            if (r0Var3 != null && !r0Var3.f7849c.contains(this)) {
                r0Var3 = null;
            }
            if (r0Var4 != null && !r0Var4.f7849c.contains(this)) {
                r0Var4 = null;
            }
            if (!(r0Var3 == null && r0Var4 == null)) {
                if ((r0Var3 == null || r0Var4 == null || c0(r0Var3, r0Var4)) && (x10 = x(viewGroup2, r0Var3, r0Var4)) != null) {
                    if (r0Var4 != null) {
                        view = r0Var4.f7848b;
                        String[] a02 = a0();
                        if (a02 != null && a02.length > 0) {
                            r0Var2 = new r0(view);
                            Animator animator3 = x10;
                            i10 = size;
                            r0 r0Var5 = s0Var2.f7857a.get(view);
                            if (r0Var5 != null) {
                                int i12 = 0;
                                while (i12 < a02.length) {
                                    Map<String, Object> map = r0Var2.f7847a;
                                    String str = a02[i12];
                                    map.put(str, r0Var5.f7847a.get(str));
                                    i12++;
                                    ArrayList<r0> arrayList3 = arrayList2;
                                    a02 = a02;
                                }
                            }
                            int size2 = U2.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = U2.get(U2.m(i13));
                                if (dVar.f7775c != null && dVar.f7773a == view && dVar.f7774b.equals(R()) && dVar.f7775c.equals(r0Var2)) {
                                    animator2 = null;
                                    break;
                                }
                                i13++;
                            }
                        } else {
                            i10 = size;
                            animator2 = x10;
                            r0Var2 = null;
                        }
                        animator = animator2;
                        r0Var = r0Var2;
                    } else {
                        i10 = size;
                        view = r0Var3.f7848b;
                        animator = x10;
                        r0Var = null;
                    }
                    if (animator != null) {
                        n0 n0Var = this.f7766r0;
                        if (n0Var != null) {
                            long c10 = n0Var.c(viewGroup2, this, r0Var3, r0Var4);
                            sparseIntArray.put(this.f7765q0.size(), (int) c10);
                            j10 = Math.min(c10, j10);
                        }
                        U2.put(animator, new d(view, R(), this, e1.d(viewGroup), r0Var));
                        this.f7765q0.add(animator);
                        j10 = j10;
                    }
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator4 = this.f7765q0.get(sparseIntArray.keyAt(i14));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i14)) - j10) + animator4.getStartDelay());
            }
        }
    }

    public void y0(@o0 f fVar) {
        this.f7767s0 = fVar;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void z() {
        int i10 = this.f7761m0 - 1;
        this.f7761m0 = i10;
        if (i10 == 0) {
            ArrayList<h> arrayList = this.f7764p0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f7764p0.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((h) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < this.f7752d0.f7859c.D(); i12++) {
                View E = this.f7752d0.f7859c.E(i12);
                if (E != null) {
                    w1.O1(E, false);
                }
            }
            for (int i13 = 0; i13 < this.f7753e0.f7859c.D(); i13++) {
                View E2 = this.f7753e0.f7859c.E(i13);
                if (E2 != null) {
                    w1.O1(E2, false);
                }
            }
            this.f7763o0 = true;
        }
    }

    @m0
    public j0 z0(@o0 TimeInterpolator timeInterpolator) {
        this.R = timeInterpolator;
        return this;
    }
}
