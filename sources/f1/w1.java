package f1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import d.b0;
import d.f1;
import d.m0;
import d.o0;
import d.r0;
import d.t0;
import d.v;
import d.x0;
import e0.a;
import f1.a;
import f1.a3;
import f1.e3;
import g1.a0;
import g1.c0;
import g1.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class w1 {
    public static final int A = 1;
    public static final int B = 1;
    public static final int C = 2;
    public static final int D = 4;
    public static final int E = 8;
    public static final int F = 16;
    public static final int G = 32;
    public static final AtomicInteger H = new AtomicInteger(1);
    public static Field I = null;
    public static boolean J = false;
    public static Field K = null;
    public static boolean L = false;
    public static Method M = null;
    public static Method N = null;
    public static boolean O = false;
    public static WeakHashMap<View, String> P = null;
    public static WeakHashMap<View, s2> Q = null;
    public static Method R = null;
    public static Field S = null;
    public static boolean T = false;
    public static ThreadLocal<Rect> U = null;
    public static final int[] V = {a.e.accessibility_custom_action_0, a.e.accessibility_custom_action_1, a.e.accessibility_custom_action_2, a.e.accessibility_custom_action_3, a.e.accessibility_custom_action_4, a.e.accessibility_custom_action_5, a.e.accessibility_custom_action_6, a.e.accessibility_custom_action_7, a.e.accessibility_custom_action_8, a.e.accessibility_custom_action_9, a.e.accessibility_custom_action_10, a.e.accessibility_custom_action_11, a.e.accessibility_custom_action_12, a.e.accessibility_custom_action_13, a.e.accessibility_custom_action_14, a.e.accessibility_custom_action_15, a.e.accessibility_custom_action_16, a.e.accessibility_custom_action_17, a.e.accessibility_custom_action_18, a.e.accessibility_custom_action_19, a.e.accessibility_custom_action_20, a.e.accessibility_custom_action_21, a.e.accessibility_custom_action_22, a.e.accessibility_custom_action_23, a.e.accessibility_custom_action_24, a.e.accessibility_custom_action_25, a.e.accessibility_custom_action_26, a.e.accessibility_custom_action_27, a.e.accessibility_custom_action_28, a.e.accessibility_custom_action_29, a.e.accessibility_custom_action_30, a.e.accessibility_custom_action_31};
    public static final r0 W = new a();
    public static f X = new f();

    /* renamed from: a  reason: collision with root package name */
    public static final String f7281a = "ViewCompat";
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f7282b = 0;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f7283c = 1;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f7284d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f7285e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f7286f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7287g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f7288h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7289i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7290j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f7291k = 2;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f7292l = 0;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final int f7293m = 1;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    public static final int f7294n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f7295o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7296p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7297q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7298r = 3;
    @Deprecated

    /* renamed from: s  reason: collision with root package name */
    public static final int f7299s = 16777215;
    @Deprecated

    /* renamed from: t  reason: collision with root package name */
    public static final int f7300t = -16777216;
    @Deprecated

    /* renamed from: u  reason: collision with root package name */
    public static final int f7301u = 16;
    @Deprecated

    /* renamed from: v  reason: collision with root package name */
    public static final int f7302v = 16777216;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7303w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7304x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f7305y = 2;

    /* renamed from: z  reason: collision with root package name */
    public static final int f7306z = 0;

    public class a implements r0 {
        public c a(@m0 c cVar) {
            return cVar;
        }
    }

    public class b extends g<Boolean> {
        public b(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @t0(28)
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        @t0(28)
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class c extends g<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @t0(28)
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @t0(28)
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends g<CharSequence> {
        public d(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @t0(30)
        /* renamed from: i */
        public CharSequence d(View view) {
            return view.getStateDescription();
        }

        @t0(30)
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class e extends g<Boolean> {
        public e(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @t0(28)
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        @t0(28)
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public WeakHashMap<View, Boolean> O = new WeakHashMap<>();

        @t0(19)
        public void a(View view) {
            this.O.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        @t0(19)
        public final void b(View view, boolean z10) {
            boolean z11 = view.getVisibility() == 0;
            if (z10 != z11) {
                w1.b1(view, z11 ? 16 : 32);
                this.O.put(view, Boolean.valueOf(z11));
            }
        }

        @t0(19)
        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @t0(19)
        public void d(View view) {
            this.O.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @t0(19)
        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @t0(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.O.entrySet()) {
                    b((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        @t0(19)
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class g<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f7307a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f7308b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7309c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7310d;

        public g(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public g(int i10, Class<T> cls, int i11, int i12) {
            this.f7307a = i10;
            this.f7308b = cls;
            this.f7310d = i11;
            this.f7309c = i12;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.f7309c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t10);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            T tag = view.getTag(this.f7307a);
            if (this.f7308b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void g(View view, T t10) {
            if (c()) {
                e(view, t10);
            } else if (b() && h(f(view), t10)) {
                w1.g0(view);
                view.setTag(this.f7307a, t10);
                w1.b1(view, this.f7310d);
            }
        }

        public boolean h(T t10, T t11) {
            return !t11.equals(t10);
        }
    }

    @t0(21)
    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public e3 f7311a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f7312b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ p0 f7313c;

            public a(View view, p0 p0Var) {
                this.f7312b = view;
                this.f7313c = p0Var;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                e3 L = e3.L(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f7312b);
                    if (L.equals(this.f7311a)) {
                        return this.f7313c.a(view, L).J();
                    }
                }
                this.f7311a = L;
                e3 a10 = this.f7313c.a(view, L);
                if (i10 >= 30) {
                    return a10.J();
                }
                w1.t1(view);
                return a10.J();
            }
        }

        private h() {
        }

        public static void a(@m0 WindowInsets windowInsets, @m0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(a.e.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static e3 b(@m0 View view, @m0 e3 e3Var, @m0 Rect rect) {
            WindowInsets J = e3Var.J();
            if (J != null) {
                return e3.L(view.computeSystemWindowInsets(J, rect), view);
            }
            rect.setEmpty();
            return e3Var;
        }

        @o0
        public static e3 c(@m0 View view) {
            return e3.a.a(view);
        }

        public static void d(@m0 View view, @o0 p0 p0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(a.e.tag_on_apply_window_listener, p0Var);
            }
            if (p0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(a.e.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, p0Var));
            }
        }
    }

    @t0(23)
    public static class i {
        private i() {
        }

        @o0
        public static e3 a(@m0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            e3 K = e3.K(rootWindowInsets);
            K.H(K);
            K.d(view.getRootView());
            return K;
        }
    }

    @t0(29)
    public static class j {
        private j() {
        }

        public static void a(@m0 View view, @m0 Context context, @m0 int[] iArr, @o0 AttributeSet attributeSet, @m0 TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    @t0(30)
    public static class k {
        private k() {
        }

        @o0
        public static r3 a(@m0 View view) {
            WindowInsetsController a10 = view.getWindowInsetsController();
            if (a10 != null) {
                return r3.l(a10);
            }
            return null;
        }
    }

    @t0(28)
    public static class l {

        public class a implements View$OnUnhandledKeyEventListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ q f7314a;

            public a(q qVar) {
                this.f7314a = qVar;
            }

            public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
                return this.f7314a.onUnhandledKeyEvent(view, keyEvent);
            }
        }

        public static void a(@m0 View view, @m0 q qVar) {
            int i10 = a.e.tag_unhandled_key_listeners;
            androidx.collection.i iVar = (androidx.collection.i) view.getTag(i10);
            if (iVar == null) {
                iVar = new androidx.collection.i();
                view.setTag(i10, iVar);
            }
            a aVar = new a(qVar);
            iVar.put(qVar, aVar);
            view.addOnUnhandledKeyEventListener(aVar);
        }

        public static void b(@m0 View view, @m0 q qVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            androidx.collection.i iVar = (androidx.collection.i) view.getTag(a.e.tag_unhandled_key_listeners);
            if (iVar != null && (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) iVar.get(qVar)) != null) {
                view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface o {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface p {
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface r {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    public static class t {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f7315d = new ArrayList<>();
        @o0

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f7316a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f7317b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f7318c = null;

        public static t a(View view) {
            int i10 = a.e.tag_unhandled_key_event_manager;
            t tVar = (t) view.getTag(i10);
            if (tVar != null) {
                return tVar;
            }
            t tVar2 = new t();
            view.setTag(i10, tVar2);
            return tVar2;
        }

        public static void h(View view) {
            ArrayList<WeakReference<View>> arrayList = f7315d;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f7315d.add(new WeakReference(view));
            }
        }

        public static void i(View view) {
            synchronized (f7315d) {
                int i10 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f7315d;
                    if (i10 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i10).get() == view) {
                        arrayList.remove(i10);
                        return;
                    }
                    i10++;
                }
            }
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c10 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c10 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(c10));
                }
            }
            return c10 != null;
        }

        @o0
        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f7316a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c10 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c10 != null) {
                            return c10;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.f7317b == null) {
                this.f7317b = new SparseArray<>();
            }
            return this.f7317b;
        }

        public final boolean e(@m0 View view, @m0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f7318c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f7318c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d10 = d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d10.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d10.valueAt(indexOfKey);
                d10.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d10.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && w1.N0(view)) {
                e(view, keyEvent);
            }
            return true;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f7316a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f7315d;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f7316a == null) {
                        this.f7316a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f7315d;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f7316a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f7316a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A(View view) {
        g0(view);
    }

    @o0
    public static r3 A0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return k.a(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return x2.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @f1
    public static void A1(View view, boolean z10) {
        a().g(view, Boolean.valueOf(z10));
    }

    public static boolean A2(@m0 View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? view.startDragAndDrop(clipData, dragShadowBuilder, obj, i10) : view.startDrag(clipData, dragShadowBuilder, obj, i10);
    }

    public static int B() {
        return View.generateViewId();
    }

    public static int B0(@m0 View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void B1(@m0 View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static boolean B2(@m0 View view, int i10) {
        return view.startNestedScroll(i10);
    }

    @o0
    public static a C(@m0 View view) {
        View.AccessibilityDelegate D2 = D(view);
        if (D2 == null) {
            return null;
        }
        return D2 instanceof a.C0116a ? ((a.C0116a) D2).f7004a : new a(D2);
    }

    @Deprecated
    public static float C0(View view) {
        return view.getX();
    }

    @f1
    public static void C1(View view, CharSequence charSequence) {
        i1().g(view, charSequence);
        if (charSequence != null) {
            X.a(view);
        } else {
            X.d(view);
        }
    }

    public static boolean C2(@m0 View view, int i10, int i11) {
        if (view instanceof h0) {
            return ((h0) view).f(i10, i11);
        }
        if (i11 == 0) {
            return B2(view, i10);
        }
        return false;
    }

    @o0
    public static View.AccessibilityDelegate D(@m0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : E(view);
    }

    @Deprecated
    public static float D0(View view) {
        return view.getY();
    }

    @Deprecated
    public static void D1(View view, boolean z10) {
        view.setActivated(z10);
    }

    public static g<CharSequence> D2() {
        return new d(a.e.tag_state_description, CharSequence.class, 64, 30);
    }

    @o0
    public static View.AccessibilityDelegate E(@m0 View view) {
        if (T) {
            return null;
        }
        if (S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                T = true;
                return null;
            }
        }
        try {
            Object obj = S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            T = true;
            return null;
        }
    }

    public static float E0(@m0 View view) {
        return view.getZ();
    }

    @Deprecated
    public static void E1(View view, @v(from = 0.0d, to = 1.0d) float f10) {
        view.setAlpha(f10);
    }

    public static void E2(@m0 View view) {
        view.stopNestedScroll();
    }

    public static int F(@m0 View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean F0(@m0 View view) {
        return D(view) != null;
    }

    public static void F1(@m0 View view, @o0 String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setAutofillHints(strArr);
        }
    }

    public static void F2(@m0 View view, int i10) {
        if (view instanceof h0) {
            ((h0) view).g(i10);
        } else if (i10 == 0) {
            E2(view);
        }
    }

    public static a0 G(@m0 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new a0(accessibilityNodeProvider);
        }
        return null;
    }

    public static boolean G0(@m0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.hasExplicitFocusable() : view.hasFocusable();
    }

    public static void G1(@m0 View view, @o0 Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void G2(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @f1
    public static CharSequence H(View view) {
        return i1().f(view);
    }

    public static boolean H0(@m0 View view) {
        return view.hasNestedScrollingParent();
    }

    public static void H1(@m0 View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void H2(@m0 View view, View.DragShadowBuilder dragShadowBuilder) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    public static List<z.a> I(View view) {
        int i10 = a.e.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static boolean I0(@m0 View view, int i10) {
        if (view instanceof h0) {
            ((h0) view).d(i10);
            return false;
        } else if (i10 == 0) {
            return H0(view);
        } else {
            return false;
        }
    }

    public static void I1(@m0 View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    @Deprecated
    public static float J(View view) {
        return view.getAlpha();
    }

    public static boolean J0(@m0 View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static void J1(ViewGroup viewGroup, boolean z10) {
        if (R == null) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                R = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            R.setAccessible(true);
        }
        try {
            R.invoke(viewGroup, new Object[]{Boolean.valueOf(z10)});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    public static int K(View view, @m0 CharSequence charSequence) {
        List<z.a> I2 = I(view);
        for (int i10 = 0; i10 < I2.size(); i10++) {
            if (TextUtils.equals(charSequence, I2.get(i10).c())) {
                return I2.get(i10).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = V;
            if (i12 >= iArr.length || i11 != -1) {
                return i11;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < I2.size(); i14++) {
                z10 &= I2.get(i14).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static boolean K0(@m0 View view) {
        return view.hasOverlappingRendering();
    }

    public static void K1(@m0 View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static ColorStateList L(@m0 View view) {
        return view.getBackgroundTintList();
    }

    public static boolean L0(@m0 View view) {
        return view.hasTransientState();
    }

    public static void L1(@m0 View view, float f10) {
        view.setElevation(f10);
    }

    public static PorterDuff.Mode M(@m0 View view) {
        return view.getBackgroundTintMode();
    }

    @f1
    public static boolean M0(View view) {
        Boolean f10 = a().f(view);
        if (f10 == null) {
            return false;
        }
        return f10.booleanValue();
    }

    @Deprecated
    public static void M1(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    @o0
    public static Rect N(@m0 View view) {
        return view.getClipBounds();
    }

    public static boolean N0(@m0 View view) {
        return view.isAttachedToWindow();
    }

    public static void N1(@m0 View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setFocusedByDefault(z10);
        }
    }

    @o0
    public static Display O(@m0 View view) {
        return view.getDisplay();
    }

    public static boolean O0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isFocusedByDefault();
        }
        return false;
    }

    public static void O1(@m0 View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    public static float P(@m0 View view) {
        return view.getElevation();
    }

    public static boolean P0(@m0 View view) {
        return view.isImportantForAccessibility();
    }

    public static void P1(@m0 View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static Rect Q() {
        if (U == null) {
            U = new ThreadLocal<>();
        }
        Rect rect = U.get();
        if (rect == null) {
            rect = new Rect();
            U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static boolean Q0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    public static void Q1(@m0 View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i10);
        }
    }

    public static r0 R(@m0 View view) {
        return view instanceof r0 ? (r0) view : W;
    }

    public static boolean R0(@m0 View view) {
        return view.isInLayout();
    }

    public static void R1(@m0 View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setKeyboardNavigationCluster(z10);
        }
    }

    public static boolean S(@m0 View view) {
        return view.getFitsSystemWindows();
    }

    public static boolean S0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.isKeyboardNavigationCluster();
        }
        return false;
    }

    public static void S1(@m0 View view, @b0 int i10) {
        view.setLabelFor(i10);
    }

    public static int T(@m0 View view) {
        return view.getImportantForAccessibility();
    }

    public static boolean T0(@m0 View view) {
        return view.isLaidOut();
    }

    public static void T1(@m0 View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @SuppressLint({"InlinedApi"})
    public static int U(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static boolean U0(@m0 View view) {
        return view.isLayoutDirectionResolved();
    }

    @Deprecated
    public static void U1(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    public static int V(@m0 View view) {
        return view.getLabelFor();
    }

    public static boolean V0(@m0 View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void V1(@m0 View view, int i10) {
        view.setLayoutDirection(i10);
    }

    @Deprecated
    public static int W(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static boolean W0(View view) {
        return view.isOpaque();
    }

    public static void W1(@m0 View view, boolean z10) {
        view.setNestedScrollingEnabled(z10);
    }

    public static int X(@m0 View view) {
        return view.getLayoutDirection();
    }

    public static boolean X0(@m0 View view) {
        return view.isPaddingRelative();
    }

    public static void X1(@m0 View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setNextClusterForwardId(i10);
        }
    }

    @o0
    @Deprecated
    public static Matrix Y(View view) {
        return view.getMatrix();
    }

    @f1
    public static boolean Y0(View view) {
        Boolean f10 = y1().f(view);
        if (f10 == null) {
            return false;
        }
        return f10.booleanValue();
    }

    public static void Y1(@m0 View view, @o0 p0 p0Var) {
        h.d(view, p0Var);
    }

    @Deprecated
    public static int Z(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static void Z0(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void Z1(@m0 View view, @o0 String[] strArr, @o0 q0 q0Var) {
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z10 = false;
        if (q0Var != null) {
            e1.n.b(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (strArr[i10].startsWith("*")) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            e1.n.b(!z10, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(a.e.tag_on_receive_content_mime_types, strArr);
        view.setTag(a.e.tag_on_receive_content_listener, q0Var);
    }

    public static g<Boolean> a() {
        return new e(a.e.tag_accessibility_heading, Boolean.class, 28);
    }

    @Deprecated
    public static int a0(View view) {
        return view.getMeasuredState();
    }

    public static View a1(@m0 View view, View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.keyboardNavigationClusterSearch(view2, i10);
        }
        return null;
    }

    @Deprecated
    public static void a2(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    public static int b(@m0 View view, @m0 CharSequence charSequence, @m0 c0 c0Var) {
        int K2 = K(view, charSequence);
        if (K2 != -1) {
            c(view, new z.a(K2, charSequence, c0Var));
        }
        return K2;
    }

    @Deprecated
    public static int b0(View view) {
        return view.getMeasuredWidthAndState();
    }

    @t0(19)
    public static void b1(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = H(view) != null && view.getVisibility() == 0;
            int i11 = 32;
            if (F(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z10) {
                    i11 = 2048;
                }
                obtain.setEventType(i11);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    obtain.getText().add(H(view));
                    v2(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(H(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(view.getParent().getClass().getSimpleName());
                    sb2.append(" does not fully implement ViewParent");
                }
            }
        }
    }

    public static void b2(@m0 View view, @r0 int i10, @r0 int i11, @r0 int i12, @r0 int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    public static void c(@m0 View view, @m0 z.a aVar) {
        g0(view);
        q1(aVar.b(), view);
        I(view).add(aVar);
        b1(view, 0);
    }

    public static int c0(@m0 View view) {
        return view.getMinimumHeight();
    }

    public static void c1(@m0 View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    @Deprecated
    public static void c2(View view, float f10) {
        view.setPivotX(f10);
    }

    public static void d(@m0 View view, @m0 Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.addKeyboardNavigationClusters(collection, i10);
        }
    }

    public static int d0(@m0 View view) {
        return view.getMinimumWidth();
    }

    public static void d1(@m0 View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    @Deprecated
    public static void d2(View view, float f10) {
        view.setPivotY(f10);
    }

    public static void e(@m0 View view, @m0 q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.a(view, qVar);
            return;
        }
        int i10 = a.e.tag_unhandled_key_listeners;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i10, arrayList);
        }
        arrayList.add(qVar);
        if (arrayList.size() == 1) {
            t.h(view);
        }
    }

    public static int e0(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getNextClusterForwardId();
        }
        return -1;
    }

    @m0
    public static e3 e1(@m0 View view, @m0 e3 e3Var) {
        WindowInsets J2 = e3Var.J();
        if (J2 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(J2);
            if (!onApplyWindowInsets.equals(J2)) {
                return e3.L(onApplyWindowInsets, view);
            }
        }
        return e3Var;
    }

    public static void e2(@m0 View view, t0 t0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (t0Var != null ? t0Var.b() : null));
        }
    }

    @m0
    public static s2 f(@m0 View view) {
        if (Q == null) {
            Q = new WeakHashMap<>();
        }
        s2 s2Var = Q.get(view);
        if (s2Var != null) {
            return s2Var;
        }
        s2 s2Var2 = new s2(view);
        Q.put(view, s2Var2);
        return s2Var2;
    }

    @o0
    public static String[] f0(@m0 View view) {
        return (String[]) view.getTag(a.e.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static void f1(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void f2(View view, float f10) {
        view.setRotation(f10);
    }

    public static void g() {
        try {
            M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        O = true;
    }

    public static a g0(@m0 View view) {
        a C2 = C(view);
        if (C2 == null) {
            C2 = new a();
        }
        z1(view, C2);
        return C2;
    }

    public static void g1(@m0 View view, z zVar) {
        view.onInitializeAccessibilityNodeInfo(zVar.U1());
    }

    @Deprecated
    public static void g2(View view, float f10) {
        view.setRotationX(f10);
    }

    @Deprecated
    public static boolean h(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public static int h0(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static void h1(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void h2(View view, float f10) {
        view.setRotationY(f10);
    }

    @Deprecated
    public static boolean i(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    @r0
    public static int i0(@m0 View view) {
        return view.getPaddingEnd();
    }

    public static g<CharSequence> i1() {
        return new c(a.e.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static void i2(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    public static void j(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.cancelDragAndDrop();
        }
    }

    @r0
    public static int j0(@m0 View view) {
        return view.getPaddingStart();
    }

    public static boolean j1(@m0 View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    @Deprecated
    public static void j2(View view, float f10) {
        view.setScaleX(f10);
    }

    @Deprecated
    public static int k(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    public static ViewParent k0(@m0 View view) {
        return view.getParentForAccessibility();
    }

    @o0
    public static c k1(@m0 View view, @m0 c cVar) {
        if (Log.isLoggable(f7281a, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("performReceiveContent: ");
            sb2.append(cVar);
            sb2.append(", view=");
            sb2.append(view.getClass().getSimpleName());
            sb2.append("[");
            sb2.append(view.getId());
            sb2.append("]");
        }
        q0 q0Var = (q0) view.getTag(a.e.tag_on_receive_content_listener);
        if (q0Var == null) {
            return R(view).a(cVar);
        }
        c a10 = q0Var.a(view, cVar);
        if (a10 == null) {
            return null;
        }
        return R(view).a(a10);
    }

    @Deprecated
    public static void k2(View view, float f10) {
        view.setScaleY(f10);
    }

    public static void l(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            G2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                G2((View) parent);
            }
        }
    }

    @Deprecated
    public static float l0(View view) {
        return view.getPivotX();
    }

    public static void l1(@m0 View view) {
        view.postInvalidateOnAnimation();
    }

    @f1
    public static void l2(View view, boolean z10) {
        y1().g(view, Boolean.valueOf(z10));
    }

    public static void m(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            G2(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                G2((View) parent);
            }
        }
    }

    @Deprecated
    public static float m0(View view) {
        return view.getPivotY();
    }

    public static void m1(@m0 View view, int i10, int i11, int i12, int i13) {
        view.postInvalidateOnAnimation(i10, i11, i12, i13);
    }

    public static void m2(@m0 View view, int i10) {
        view.setScrollIndicators(i10);
    }

    @m0
    public static e3 n(@m0 View view, @m0 e3 e3Var, @m0 Rect rect) {
        return h.b(view, e3Var, rect);
    }

    @o0
    public static e3 n0(@m0 View view) {
        return i.a(view);
    }

    public static void n1(@m0 View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void n2(@m0 View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }

    @m0
    public static e3 o(@m0 View view, @m0 e3 e3Var) {
        WindowInsets J2 = e3Var.J();
        if (J2 != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(J2);
            if (!dispatchApplyWindowInsets.equals(J2)) {
                return e3.L(dispatchApplyWindowInsets, view);
            }
        }
        return e3Var;
    }

    @Deprecated
    public static float o0(View view) {
        return view.getRotation();
    }

    public static void o1(@m0 View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    @f1
    public static void o2(@m0 View view, @o0 CharSequence charSequence) {
        D2().g(view, charSequence);
    }

    public static void p(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!O) {
            g();
        }
        Method method = N;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    @Deprecated
    public static float p0(View view) {
        return view.getRotationX();
    }

    public static void p1(@m0 View view, int i10) {
        q1(i10, view);
        b1(view, 0);
    }

    public static void p2(@m0 View view, @m0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static boolean q(@m0 View view, float f10, float f11, boolean z10) {
        return view.dispatchNestedFling(f10, f11, z10);
    }

    @Deprecated
    public static float q0(View view) {
        return view.getRotationY();
    }

    public static void q1(int i10, View view) {
        List<z.a> I2 = I(view);
        for (int i11 = 0; i11 < I2.size(); i11++) {
            if (I2.get(i11).b() == i10) {
                I2.remove(i11);
                return;
            }
        }
    }

    public static void q2(@m0 View view, @o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        }
    }

    public static boolean r(@m0 View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    @Deprecated
    public static float r0(View view) {
        return view.getScaleX();
    }

    public static void r1(@m0 View view, @m0 q qVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            l.b(view, qVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(a.e.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(qVar);
            if (arrayList.size() == 0) {
                t.i(view);
            }
        }
    }

    public static void r2(@m0 View view, String str) {
        view.setTransitionName(str);
    }

    public static boolean s(@m0 View view, int i10, int i11, @o0 int[] iArr, @o0 int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Deprecated
    public static float s0(View view) {
        return view.getScaleY();
    }

    public static void s1(@m0 View view, @m0 z.a aVar, @o0 CharSequence charSequence, @o0 c0 c0Var) {
        if (c0Var == null && charSequence == null) {
            p1(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, c0Var));
        }
    }

    @Deprecated
    public static void s2(View view, float f10) {
        view.setTranslationX(f10);
    }

    public static boolean t(@m0 View view, int i10, int i11, @o0 int[] iArr, @o0 int[] iArr2, int i12) {
        if (view instanceof h0) {
            return ((h0) view).b(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return s(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    public static int t0(@m0 View view) {
        return view.getScrollIndicators();
    }

    public static void t1(@m0 View view) {
        view.requestApplyInsets();
    }

    @Deprecated
    public static void t2(View view, float f10) {
        view.setTranslationY(f10);
    }

    public static void u(@m0 View view, int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14, @m0 int[] iArr2) {
        View view2 = view;
        if (view2 instanceof i0) {
            ((i0) view2).c(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            w(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    @o0
    @f1
    public static final CharSequence u0(@m0 View view) {
        return D2().f(view);
    }

    @m0
    public static <T extends View> T u1(@m0 View view, @b0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return view.requireViewById(i10);
        }
        T findViewById = view.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static void u2(@m0 View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static boolean v(@m0 View view, int i10, int i11, int i12, int i13, @o0 int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @m0
    public static List<Rect> v0(@m0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getSystemGestureExclusionRects() : Collections.emptyList();
    }

    @Deprecated
    public static int v1(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static void v2(View view) {
        if (T(view) == 0) {
            P1(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (T((View) parent) == 4) {
                P1(view, 2);
                return;
            }
        }
    }

    public static boolean w(@m0 View view, int i10, int i11, int i12, int i13, @o0 int[] iArr, int i14) {
        if (view instanceof h0) {
            return ((h0) view).a(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return v(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }

    @o0
    public static String w0(@m0 View view) {
        return view.getTransitionName();
    }

    public static boolean w1(@m0 View view) {
        return Build.VERSION.SDK_INT >= 26 ? view.restoreDefaultFocus() : view.requestFocus();
    }

    public static void w2(@m0 View view, @o0 a3.b bVar) {
        a3.h(view, bVar);
    }

    public static void x(@m0 View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!O) {
            g();
        }
        Method method = M;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused) {
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    @Deprecated
    public static float x0(View view) {
        return view.getTranslationX();
    }

    public static void x1(@m0 View view, @SuppressLint({"ContextFirst"}) @m0 Context context, @m0 int[] iArr, @o0 AttributeSet attributeSet, @m0 TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            j.a(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    @Deprecated
    public static void x2(View view, float f10) {
        view.setX(f10);
    }

    @f1
    public static boolean y(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).b(view, keyEvent);
    }

    @Deprecated
    public static float y0(View view) {
        return view.getTranslationY();
    }

    public static g<Boolean> y1() {
        return new b(a.e.tag_screen_reader_focusable, Boolean.class, 28);
    }

    @Deprecated
    public static void y2(View view, float f10) {
        view.setY(f10);
    }

    @f1
    public static boolean z(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return t.a(view).f(keyEvent);
    }

    public static float z0(@m0 View view) {
        return view.getTranslationZ();
    }

    public static void z1(@m0 View view, a aVar) {
        if (aVar == null && (D(view) instanceof a.C0116a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void z2(@m0 View view, float f10) {
        view.setZ(f10);
    }
}
