package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.widget.o;
import d.b1;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;
import java.lang.reflect.Method;

public class i0 implements l.f {
    public static final int A0 = 0;
    public static final int B0 = 1;
    public static final int C0 = -1;
    public static final int D0 = -2;
    public static final int E0 = 0;
    public static final int F0 = 1;
    public static final int G0 = 2;

    /* renamed from: u0  reason: collision with root package name */
    public static final String f1313u0 = "ListPopupWindow";

    /* renamed from: v0  reason: collision with root package name */
    public static final boolean f1314v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f1315w0 = 250;

    /* renamed from: x0  reason: collision with root package name */
    public static Method f1316x0;

    /* renamed from: y0  reason: collision with root package name */
    public static Method f1317y0;

    /* renamed from: z0  reason: collision with root package name */
    public static Method f1318z0;
    public Context O;
    public ListAdapter P;
    public c0 Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1319a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1320b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1321c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f1322d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1323e0;

    /* renamed from: f0  reason: collision with root package name */
    public DataSetObserver f1324f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1325g0;

    /* renamed from: h0  reason: collision with root package name */
    public Drawable f1326h0;

    /* renamed from: i0  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1327i0;

    /* renamed from: j0  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f1328j0;

    /* renamed from: k0  reason: collision with root package name */
    public final h f1329k0;

    /* renamed from: l0  reason: collision with root package name */
    public final g f1330l0;

    /* renamed from: m0  reason: collision with root package name */
    public final f f1331m0;

    /* renamed from: n0  reason: collision with root package name */
    public final d f1332n0;

    /* renamed from: o0  reason: collision with root package name */
    public Runnable f1333o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Handler f1334p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f1335q0;

    /* renamed from: r0  reason: collision with root package name */
    public Rect f1336r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1337s0;

    /* renamed from: t0  reason: collision with root package name */
    public PopupWindow f1338t0;

    public class a extends e0 {
        public a(View view) {
            super(view);
        }

        /* renamed from: k */
        public i0 b() {
            return i0.this;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            View v10 = i0.this.v();
            if (v10 != null && v10.getWindowToken() != null) {
                i0.this.a();
            }
        }
    }

    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            c0 c0Var;
            if (i10 != -1 && (c0Var = i0.this.Q) != null) {
                c0Var.setListSelectionHidden(false);
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            i0.this.s();
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public void onChanged() {
            if (i0.this.c()) {
                i0.this.a();
            }
        }

        public void onInvalidated() {
            i0.this.dismiss();
        }
    }

    public class f implements AbsListView.OnScrollListener {
        public f() {
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !i0.this.K() && i0.this.f1338t0.getContentView() != null) {
                i0 i0Var = i0.this;
                i0Var.f1334p0.removeCallbacks(i0Var.f1329k0);
                i0.this.f1329k0.run();
            }
        }
    }

    public class g implements View.OnTouchListener {
        public g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = i0.this.f1338t0) != null && popupWindow.isShowing() && x10 >= 0 && x10 < i0.this.f1338t0.getWidth() && y10 >= 0 && y10 < i0.this.f1338t0.getHeight()) {
                i0 i0Var = i0.this;
                i0Var.f1334p0.postDelayed(i0Var.f1329k0, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                i0 i0Var2 = i0.this;
                i0Var2.f1334p0.removeCallbacks(i0Var2.f1329k0);
                return false;
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public void run() {
            c0 c0Var = i0.this.Q;
            if (c0Var != null && w1.N0(c0Var) && i0.this.Q.getCount() > i0.this.Q.getChildCount()) {
                int childCount = i0.this.Q.getChildCount();
                i0 i0Var = i0.this;
                if (childCount <= i0Var.f1321c0) {
                    i0Var.f1338t0.setInputMethodMode(2);
                    i0.this.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1316x0 = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1318z0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1317y0 = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public i0(@m0 Context context) {
        this(context, (AttributeSet) null, a.c.listPopupWindowStyle);
    }

    public i0(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.listPopupWindowStyle);
    }

    public i0(@m0 Context context, @o0 AttributeSet attributeSet, @d.f int i10) {
        this(context, attributeSet, i10, 0);
    }

    public i0(@m0 Context context, @o0 AttributeSet attributeSet, @d.f int i10, @b1 int i11) {
        this.R = -2;
        this.S = -2;
        this.V = 1002;
        this.Z = 0;
        this.f1319a0 = false;
        this.f1320b0 = false;
        this.f1321c0 = Integer.MAX_VALUE;
        this.f1323e0 = 0;
        this.f1329k0 = new h();
        this.f1330l0 = new g();
        this.f1331m0 = new f();
        this.f1332n0 = new d();
        this.f1335q0 = new Rect();
        this.O = context;
        this.f1334p0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.ListPopupWindow, i10, i11);
        this.T = obtainStyledAttributes.getDimensionPixelOffset(a.n.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(a.n.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.U = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.W = true;
        }
        obtainStyledAttributes.recycle();
        i iVar = new i(context, attributeSet, i10, i11);
        this.f1338t0 = iVar;
        iVar.setInputMethodMode(1);
    }

    public static boolean I(int i10) {
        return i10 == 66 || i10 == 23;
    }

    public final int A(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1338t0.getMaxAvailableHeight(view, i10, z10);
        }
        Method method = f1317y0;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1338t0, new Object[]{view, Integer.valueOf(i10), Boolean.valueOf(z10)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f1338t0.getMaxAvailableHeight(view, i10);
    }

    public int B() {
        return this.f1323e0;
    }

    @o0
    public Object C() {
        if (!c()) {
            return null;
        }
        return this.Q.getSelectedItem();
    }

    public long D() {
        if (!c()) {
            return Long.MIN_VALUE;
        }
        return this.Q.getSelectedItemId();
    }

    public int E() {
        if (!c()) {
            return -1;
        }
        return this.Q.getSelectedItemPosition();
    }

    @o0
    public View F() {
        if (!c()) {
            return null;
        }
        return this.Q.getSelectedView();
    }

    public int G() {
        return this.f1338t0.getSoftInputMode();
    }

    public int H() {
        return this.S;
    }

    @x0({x0.a.Q})
    public boolean J() {
        return this.f1319a0;
    }

    public boolean K() {
        return this.f1338t0.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.f1337s0;
    }

    public boolean M(int i10, @m0 KeyEvent keyEvent) {
        if (c() && i10 != 62 && (this.Q.getSelectedItemPosition() >= 0 || !I(i10))) {
            int selectedItemPosition = this.Q.getSelectedItemPosition();
            boolean z10 = !this.f1338t0.isAboveAnchor();
            ListAdapter listAdapter = this.P;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int d10 = areAllItemsEnabled ? 0 : this.Q.d(0, true);
                int count = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.Q.d(listAdapter.getCount() - 1, false);
                i11 = d10;
                i12 = count;
            }
            if ((!z10 || i10 != 19 || selectedItemPosition > i11) && (z10 || i10 != 20 || selectedItemPosition < i12)) {
                this.Q.setListSelectionHidden(false);
                if (this.Q.onKeyDown(i10, keyEvent)) {
                    this.f1338t0.setInputMethodMode(2);
                    this.Q.requestFocusFromTouch();
                    a();
                    if (i10 == 19 || i10 == 20 || i10 == 23 || i10 == 66) {
                        return true;
                    }
                } else if (!z10 || i10 != 20) {
                    return !z10 && i10 == 19 && selectedItemPosition == i11;
                } else {
                    if (selectedItemPosition == i12) {
                        return true;
                    }
                }
            } else {
                s();
                this.f1338t0.setInputMethodMode(1);
                a();
                return true;
            }
        }
    }

    public boolean N(int i10, @m0 KeyEvent keyEvent) {
        if (i10 != 4 || !c()) {
            return false;
        }
        View view = this.f1325g0;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                return false;
            }
            dismiss();
            return true;
        }
    }

    public boolean O(int i10, @m0 KeyEvent keyEvent) {
        if (!c() || this.Q.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.Q.onKeyUp(i10, keyEvent);
        if (onKeyUp && I(i10)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean P(int i10) {
        if (!c()) {
            return false;
        }
        if (this.f1327i0 == null) {
            return true;
        }
        c0 c0Var = this.Q;
        int i11 = i10;
        this.f1327i0.onItemClick(c0Var, c0Var.getChildAt(i10 - c0Var.getFirstVisiblePosition()), i11, c0Var.getAdapter().getItemId(i10));
        return true;
    }

    public void Q() {
        this.f1334p0.post(this.f1333o0);
    }

    public final void R() {
        View view = this.f1322d0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1322d0);
            }
        }
    }

    public void S(@o0 View view) {
        this.f1325g0 = view;
    }

    public void T(@b1 int i10) {
        this.f1338t0.setAnimationStyle(i10);
    }

    public void U(int i10) {
        Drawable background = this.f1338t0.getBackground();
        if (background != null) {
            background.getPadding(this.f1335q0);
            Rect rect = this.f1335q0;
            this.S = rect.left + rect.right + i10;
            return;
        }
        n0(i10);
    }

    @x0({x0.a.Q})
    public void V(boolean z10) {
        this.f1319a0 = z10;
    }

    public void W(int i10) {
        this.Z = i10;
    }

    public void X(@o0 Rect rect) {
        this.f1336r0 = rect != null ? new Rect(rect) : null;
    }

    @x0({x0.a.Q})
    public void Y(boolean z10) {
        this.f1320b0 = z10;
    }

    public void Z(int i10) {
        if (i10 >= 0 || -2 == i10 || -1 == i10) {
            this.R = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    public void a() {
        int r10 = r();
        boolean K = K();
        o.d(this.f1338t0, this.V);
        boolean z10 = true;
        if (!this.f1338t0.isShowing()) {
            int i10 = this.S;
            if (i10 == -1) {
                i10 = -1;
            } else if (i10 == -2) {
                i10 = v().getWidth();
            }
            int i11 = this.R;
            if (i11 == -1) {
                r10 = -1;
            } else if (i11 != -2) {
                r10 = i11;
            }
            this.f1338t0.setWidth(i10);
            this.f1338t0.setHeight(r10);
            i0(true);
            this.f1338t0.setOutsideTouchable(!this.f1320b0 && !this.f1319a0);
            this.f1338t0.setTouchInterceptor(this.f1330l0);
            if (this.Y) {
                o.c(this.f1338t0, this.X);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1318z0;
                if (method != null) {
                    try {
                        method.invoke(this.f1338t0, new Object[]{this.f1336r0});
                    } catch (Exception unused) {
                    }
                }
            } else {
                this.f1338t0.setEpicenterBounds(this.f1336r0);
            }
            o.e(this.f1338t0, v(), this.T, this.U, this.Z);
            this.Q.setSelection(-1);
            if (!this.f1337s0 || this.Q.isInTouchMode()) {
                s();
            }
            if (!this.f1337s0) {
                this.f1334p0.post(this.f1332n0);
            }
        } else if (w1.N0(v())) {
            int i12 = this.S;
            if (i12 == -1) {
                i12 = -1;
            } else if (i12 == -2) {
                i12 = v().getWidth();
            }
            int i13 = this.R;
            if (i13 == -1) {
                if (!K) {
                    r10 = -1;
                }
                if (K) {
                    this.f1338t0.setWidth(this.S == -1 ? -1 : 0);
                    this.f1338t0.setHeight(0);
                } else {
                    this.f1338t0.setWidth(this.S == -1 ? -1 : 0);
                    this.f1338t0.setHeight(-1);
                }
            } else if (i13 != -2) {
                r10 = i13;
            }
            PopupWindow popupWindow = this.f1338t0;
            if (this.f1320b0 || this.f1319a0) {
                z10 = false;
            }
            popupWindow.setOutsideTouchable(z10);
            this.f1338t0.update(v(), this.T, this.U, i12 < 0 ? -1 : i12, r10 < 0 ? -1 : r10);
        }
    }

    public void a0(int i10) {
        this.f1338t0.setInputMethodMode(i10);
    }

    public void b(@o0 Drawable drawable) {
        this.f1338t0.setBackgroundDrawable(drawable);
    }

    public void b0(int i10) {
        this.f1321c0 = i10;
    }

    public boolean c() {
        return this.f1338t0.isShowing();
    }

    public void c0(Drawable drawable) {
        this.f1326h0 = drawable;
    }

    public int d() {
        return this.T;
    }

    public void d0(boolean z10) {
        this.f1337s0 = z10;
        this.f1338t0.setFocusable(z10);
    }

    public void dismiss() {
        this.f1338t0.dismiss();
        R();
        this.f1338t0.setContentView((View) null);
        this.Q = null;
        this.f1334p0.removeCallbacks(this.f1329k0);
    }

    public void e0(@o0 PopupWindow.OnDismissListener onDismissListener) {
        this.f1338t0.setOnDismissListener(onDismissListener);
    }

    public void f(int i10) {
        this.T = i10;
    }

    public void f0(@o0 AdapterView.OnItemClickListener onItemClickListener) {
        this.f1327i0 = onItemClickListener;
    }

    public void g0(@o0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1328j0 = onItemSelectedListener;
    }

    @x0({x0.a.Q})
    public void h0(boolean z10) {
        this.Y = true;
        this.X = z10;
    }

    @o0
    public Drawable i() {
        return this.f1338t0.getBackground();
    }

    public final void i0(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1316x0;
            if (method != null) {
                try {
                    method.invoke(this.f1338t0, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f1338t0.setIsClippedToScreen(z10);
        }
    }

    public void j0(int i10) {
        this.f1323e0 = i10;
    }

    @o0
    public ListView k() {
        return this.Q;
    }

    public void k0(@o0 View view) {
        boolean c10 = c();
        if (c10) {
            R();
        }
        this.f1322d0 = view;
        if (c10) {
            a();
        }
    }

    public void l(int i10) {
        this.U = i10;
        this.W = true;
    }

    public void l0(int i10) {
        c0 c0Var = this.Q;
        if (c() && c0Var != null) {
            c0Var.setListSelectionHidden(false);
            c0Var.setSelection(i10);
            if (c0Var.getChoiceMode() != 0) {
                c0Var.setItemChecked(i10, true);
            }
        }
    }

    public void m0(int i10) {
        this.f1338t0.setSoftInputMode(i10);
    }

    public void n0(int i10) {
        this.S = i10;
    }

    public int o() {
        if (!this.W) {
            return 0;
        }
        return this.U;
    }

    public void o0(int i10) {
        this.V = i10;
    }

    public void q(@o0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1324f0;
        if (dataSetObserver == null) {
            this.f1324f0 = new e();
        } else {
            ListAdapter listAdapter2 = this.P;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.P = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1324f0);
        }
        c0 c0Var = this.Q;
        if (c0Var != null) {
            c0Var.setAdapter(this.P);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: androidx.appcompat.widget.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: androidx.appcompat.widget.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: androidx.appcompat.widget.c0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r() {
        /*
            r12 = this;
            androidx.appcompat.widget.c0 r0 = r12.Q
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x00b5
            android.content.Context r0 = r12.O
            androidx.appcompat.widget.i0$b r5 = new androidx.appcompat.widget.i0$b
            r5.<init>()
            r12.f1333o0 = r5
            boolean r5 = r12.f1337s0
            r5 = r5 ^ r3
            androidx.appcompat.widget.c0 r5 = r12.u(r0, r5)
            r12.Q = r5
            android.graphics.drawable.Drawable r6 = r12.f1326h0
            if (r6 == 0) goto L_0x0022
            r5.setSelector(r6)
        L_0x0022:
            androidx.appcompat.widget.c0 r5 = r12.Q
            android.widget.ListAdapter r6 = r12.P
            r5.setAdapter(r6)
            androidx.appcompat.widget.c0 r5 = r12.Q
            android.widget.AdapterView$OnItemClickListener r6 = r12.f1327i0
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.c0 r5 = r12.Q
            r5.setFocusable(r3)
            androidx.appcompat.widget.c0 r5 = r12.Q
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.c0 r5 = r12.Q
            androidx.appcompat.widget.i0$c r6 = new androidx.appcompat.widget.i0$c
            r6.<init>()
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.c0 r5 = r12.Q
            androidx.appcompat.widget.i0$f r6 = r12.f1331m0
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r12.f1328j0
            if (r5 == 0) goto L_0x0054
            androidx.appcompat.widget.c0 r6 = r12.Q
            r6.setOnItemSelectedListener(r5)
        L_0x0054:
            androidx.appcompat.widget.c0 r5 = r12.Q
            android.view.View r6 = r12.f1322d0
            if (r6 == 0) goto L_0x00ae
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r12.f1323e0
            if (r8 == 0) goto L_0x0086
            if (r8 == r3) goto L_0x007f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "Invalid hint position "
            r0.append(r5)
            int r5 = r12.f1323e0
            r0.append(r5)
            goto L_0x008c
        L_0x007f:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x008c
        L_0x0086:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x008c:
            int r0 = r12.S
            if (r0 < 0) goto L_0x0092
            r5 = r1
            goto L_0x0094
        L_0x0092:
            r0 = r4
            r5 = r0
        L_0x0094:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00af
        L_0x00ae:
            r0 = r4
        L_0x00af:
            android.widget.PopupWindow r6 = r12.f1338t0
            r6.setContentView(r5)
            goto L_0x00d3
        L_0x00b5:
            android.widget.PopupWindow r0 = r12.f1338t0
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r12.f1322d0
            if (r0 == 0) goto L_0x00d2
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00d3
        L_0x00d2:
            r0 = r4
        L_0x00d3:
            android.widget.PopupWindow r5 = r12.f1338t0
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x00ef
            android.graphics.Rect r6 = r12.f1335q0
            r5.getPadding(r6)
            android.graphics.Rect r5 = r12.f1335q0
            int r6 = r5.top
            int r5 = r5.bottom
            int r5 = r5 + r6
            boolean r7 = r12.W
            if (r7 != 0) goto L_0x00f5
            int r6 = -r6
            r12.U = r6
            goto L_0x00f5
        L_0x00ef:
            android.graphics.Rect r5 = r12.f1335q0
            r5.setEmpty()
            r5 = r4
        L_0x00f5:
            android.widget.PopupWindow r6 = r12.f1338t0
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x00ff
            goto L_0x0100
        L_0x00ff:
            r3 = r4
        L_0x0100:
            android.view.View r4 = r12.v()
            int r6 = r12.U
            int r3 = r12.A(r4, r6, r3)
            boolean r4 = r12.f1319a0
            if (r4 != 0) goto L_0x0158
            int r4 = r12.R
            if (r4 != r2) goto L_0x0113
            goto L_0x0158
        L_0x0113:
            int r4 = r12.S
            r6 = -2
            if (r4 == r6) goto L_0x0121
            r1 = 1073741824(0x40000000, float:2.0)
            if (r4 == r2) goto L_0x0121
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
            goto L_0x0139
        L_0x0121:
            android.content.Context r2 = r12.O
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r4 = r12.f1335q0
            int r6 = r4.left
            int r4 = r4.right
            int r6 = r6 + r4
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L_0x0139:
            r7 = r1
            androidx.appcompat.widget.c0 r6 = r12.Q
            r8 = 0
            r9 = -1
            int r10 = r3 - r0
            r11 = -1
            int r1 = r6.e(r7, r8, r9, r10, r11)
            if (r1 <= 0) goto L_0x0156
            androidx.appcompat.widget.c0 r2 = r12.Q
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.c0 r3 = r12.Q
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r5 = r5 + r2
            int r0 = r0 + r5
        L_0x0156:
            int r1 = r1 + r0
            return r1
        L_0x0158:
            int r3 = r3 + r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.r():int");
    }

    public void s() {
        c0 c0Var = this.Q;
        if (c0Var != null) {
            c0Var.setListSelectionHidden(true);
            c0Var.requestLayout();
        }
    }

    public View.OnTouchListener t(View view) {
        return new a(view);
    }

    @m0
    public c0 u(Context context, boolean z10) {
        return new c0(context, z10);
    }

    @o0
    public View v() {
        return this.f1325g0;
    }

    @b1
    public int w() {
        return this.f1338t0.getAnimationStyle();
    }

    @o0
    public Rect x() {
        if (this.f1336r0 != null) {
            return new Rect(this.f1336r0);
        }
        return null;
    }

    public int y() {
        return this.R;
    }

    public int z() {
        return this.f1338t0.getInputMethodMode();
    }
}
