package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.badge.BadgeDrawable;
import d.e0;
import d.m0;
import d.o0;
import d.r0;
import d.t0;
import d.x0;
import f1.w1;
import g1.c0;
import g1.z;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o3.a;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: l0  reason: collision with root package name */
    public static final int f3964l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f3965m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f3966n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f3967o0 = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f3968p0 = 2;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f3969q0 = -1;

    /* renamed from: r0  reason: collision with root package name */
    public static boolean f3970r0 = true;
    public final Rect O = new Rect();
    public final Rect P = new Rect();
    public b Q = new b(3);
    public int R;
    public boolean S = false;
    public RecyclerView.i T = new a();
    public LinearLayoutManager U;
    public int V = -1;
    public Parcelable W;

    /* renamed from: a0  reason: collision with root package name */
    public RecyclerView f3971a0;

    /* renamed from: b0  reason: collision with root package name */
    public x f3972b0;

    /* renamed from: c0  reason: collision with root package name */
    public g f3973c0;

    /* renamed from: d0  reason: collision with root package name */
    public b f3974d0;

    /* renamed from: e0  reason: collision with root package name */
    public d f3975e0;

    /* renamed from: f0  reason: collision with root package name */
    public f f3976f0;

    /* renamed from: g0  reason: collision with root package name */
    public RecyclerView.l f3977g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f3978h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3979i0 = true;

    /* renamed from: j0  reason: collision with root package name */
    public int f3980j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public e f3981k0;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;
        public int P;
        public Parcelable Q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, (ClassLoader) null);
        }

        @t0(24)
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void a(Parcel parcel, ClassLoader classLoader) {
            this.O = parcel.readInt();
            this.P = parcel.readInt();
            this.Q = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.O);
            parcel.writeInt(this.P);
            parcel.writeParcelable(this.Q, i10);
        }
    }

    public class a extends g {
        public a() {
            super((a) null);
        }

        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.S = true;
            viewPager2.f3973c0.n();
        }
    }

    public class b extends j {
        public b() {
        }

        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.y();
            }
        }

        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.R != i10) {
                viewPager2.R = i10;
                viewPager2.f3981k0.q();
            }
        }
    }

    public class c extends j {
        public c() {
        }

        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3971a0.requestFocus(2);
            }
        }
    }

    public class d implements RecyclerView.q {
        public d() {
        }

        public void b(@m0 View view) {
        }

        public void d(@m0 View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            if (pVar.width != -1 || pVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class e {
        public e() {
        }

        public /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }

        public boolean a() {
            return false;
        }

        public boolean b(int i10) {
            return false;
        }

        public boolean c(int i10, Bundle bundle) {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(@o0 RecyclerView.g<?> gVar) {
        }

        public void f(@o0 RecyclerView.g<?> gVar) {
        }

        public String g() {
            throw new IllegalStateException("Not implemented.");
        }

        public void h(@m0 b bVar, @m0 RecyclerView recyclerView) {
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        public void j(@m0 z zVar) {
        }

        public boolean k(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean l(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        public void m() {
        }

        public CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        public void o(@m0 AccessibilityEvent accessibilityEvent) {
        }

        public void p() {
        }

        public void q() {
        }

        public void r() {
        }

        public void s() {
        }
    }

    public class f extends e {
        public f() {
            super(ViewPager2.this, (a) null);
        }

        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.l();
        }

        public boolean d() {
            return true;
        }

        public void j(@m0 z zVar) {
            if (!ViewPager2.this.l()) {
                zVar.J0(z.a.f7612s);
                zVar.J0(z.a.f7611r);
                zVar.D1(false);
            }
        }

        public boolean k(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    public static abstract class g extends RecyclerView.i {
        public g() {
        }

        public /* synthetic */ g(a aVar) {
            this();
        }

        public abstract void a();

        public final void b(int i10, int i11) {
            a();
        }

        public final void c(int i10, int i11, @o0 Object obj) {
            a();
        }

        public final void d(int i10, int i11) {
            a();
        }

        public final void e(int i10, int i11, int i12) {
            a();
        }

        public final void f(int i10, int i11) {
            a();
        }
    }

    public class h extends LinearLayoutManager {
        public h(Context context) {
            super(context);
        }

        public boolean M1(@m0 RecyclerView recyclerView, @m0 View view, @m0 Rect rect, boolean z10, boolean z11) {
            return false;
        }

        public void d1(@m0 RecyclerView.w wVar, @m0 RecyclerView.b0 b0Var, @m0 z zVar) {
            super.d1(wVar, b0Var, zVar);
            ViewPager2.this.f3981k0.j(zVar);
        }

        public void k2(@m0 RecyclerView.b0 b0Var, @m0 int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.k2(b0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public boolean y1(@m0 RecyclerView.w wVar, @m0 RecyclerView.b0 b0Var, int i10, @o0 Bundle bundle) {
            return ViewPager2.this.f3981k0.b(i10) ? ViewPager2.this.f3981k0.k(i10) : super.y1(wVar, b0Var, i10, bundle);
        }
    }

    @e0(from = 1)
    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    public static abstract class j {
        public void a(int i10) {
        }

        public void b(int i10, float f10, @r0 int i11) {
        }

        public void c(int i10) {
        }
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public class l extends e {

        /* renamed from: b  reason: collision with root package name */
        public final c0 f3988b = new a();

        /* renamed from: c  reason: collision with root package name */
        public final c0 f3989c = new b();

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView.i f3990d;

        public class a implements c0 {
            public a() {
            }

            public boolean a(@m0 View view, @o0 c0.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        public class b implements c0 {
            public b() {
            }

            public boolean a(@m0 View view, @o0 c0.a aVar) {
                l.this.v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        public class c extends g {
            public c() {
                super((a) null);
            }

            public void a() {
                l.this.w();
            }
        }

        public l() {
            super(ViewPager2.this, (a) null);
        }

        public boolean a() {
            return true;
        }

        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        public void e(@o0 RecyclerView.g<?> gVar) {
            w();
            if (gVar != null) {
                gVar.C(this.f3990d);
            }
        }

        public void f(@o0 RecyclerView.g<?> gVar) {
            if (gVar != null) {
                gVar.E(this.f3990d);
            }
        }

        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        public void h(@m0 b bVar, @m0 RecyclerView recyclerView) {
            w1.P1(recyclerView, 2);
            this.f3990d = new c();
            if (w1.T(ViewPager2.this) == 0) {
                w1.P1(ViewPager2.this, 1);
            }
        }

        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            u(accessibilityNodeInfo);
        }

        public boolean l(int i10, Bundle bundle) {
            if (c(i10, bundle)) {
                v(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        public void m() {
            w();
        }

        public void o(@m0 AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        public void p() {
            w();
        }

        public void q() {
            w();
        }

        public void r() {
            w();
        }

        public void s() {
            w();
        }

        public final void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i10;
            int i11;
            if (ViewPager2.this.getAdapter() == null) {
                i11 = 0;
                i10 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i11 = ViewPager2.this.getAdapter().e();
                i10 = 0;
            } else {
                i10 = ViewPager2.this.getAdapter().e();
                i11 = 0;
            }
            z.V1(accessibilityNodeInfo).W0(z.b.f(i11, i10, false, 0));
        }

        public final void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int e10;
            RecyclerView.g adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (e10 = adapter.e()) != 0 && ViewPager2.this.l()) {
                if (ViewPager2.this.R > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.R < e10 - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        public void v(int i10) {
            if (ViewPager2.this.l()) {
                ViewPager2.this.t(i10, true);
            }
        }

        public void w() {
            int e10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = 16908360;
            w1.p1(viewPager2, 16908360);
            w1.p1(viewPager2, 16908361);
            w1.p1(viewPager2, 16908358);
            w1.p1(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (e10 = ViewPager2.this.getAdapter().e()) != 0 && ViewPager2.this.l()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean k10 = ViewPager2.this.k();
                    int i11 = k10 ? 16908360 : 16908361;
                    if (k10) {
                        i10 = 16908361;
                    }
                    if (ViewPager2.this.R < e10 - 1) {
                        w1.s1(viewPager2, new z.a(i11, (CharSequence) null), (CharSequence) null, this.f3988b);
                    }
                    if (ViewPager2.this.R > 0) {
                        w1.s1(viewPager2, new z.a(i10, (CharSequence) null), (CharSequence) null, this.f3989c);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.R < e10 - 1) {
                    w1.s1(viewPager2, new z.a(16908359, (CharSequence) null), (CharSequence) null, this.f3988b);
                }
                if (ViewPager2.this.R > 0) {
                    w1.s1(viewPager2, new z.a(16908358, (CharSequence) null), (CharSequence) null, this.f3989c);
                }
            }
        }
    }

    public interface m {
        void a(@m0 View view, float f10);
    }

    public class n extends x {
        public n() {
        }

        @o0
        public View h(RecyclerView.o oVar) {
            if (ViewPager2.this.j()) {
                return null;
            }
            return super.h(oVar);
        }
    }

    public class o extends RecyclerView {
        public o(@m0 Context context) {
            super(context);
        }

        @t0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3981k0.d() ? ViewPager2.this.f3981k0.n() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(@m0 AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.R);
            accessibilityEvent.setToIndex(ViewPager2.this.R);
            ViewPager2.this.f3981k0.o(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.l() && super.onTouchEvent(motionEvent);
        }
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface p {
    }

    public static class q implements Runnable {
        public final int O;
        public final RecyclerView P;

        public q(int i10, RecyclerView recyclerView) {
            this.O = i10;
            this.P = recyclerView;
        }

        public void run() {
            this.P.K1(this.O);
        }
    }

    public ViewPager2(@m0 Context context) {
        super(context);
        h(context, (AttributeSet) null);
    }

    public ViewPager2(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    public ViewPager2(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        h(context, attributeSet);
    }

    @t0(21)
    public ViewPager2(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        h(context, attributeSet);
    }

    public void a(@m0 RecyclerView.n nVar) {
        this.f3971a0.n(nVar);
    }

    public void b(@m0 RecyclerView.n nVar, int i10) {
        this.f3971a0.o(nVar, i10);
    }

    public boolean c() {
        return this.f3975e0.b();
    }

    public boolean canScrollHorizontally(int i10) {
        return this.f3971a0.canScrollHorizontally(i10);
    }

    public boolean canScrollVertically(int i10) {
        return this.f3971a0.canScrollVertically(i10);
    }

    public boolean d() {
        return this.f3975e0.d();
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).O;
            sparseArray.put(this.f3971a0.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        r();
    }

    public final RecyclerView.q e() {
        return new d();
    }

    public boolean f(@SuppressLint({"SupportAnnotationUsage"}) @r0 float f10) {
        return this.f3975e0.e(f10);
    }

    @m0
    public RecyclerView.n g(int i10) {
        return this.f3971a0.z0(i10);
    }

    @t0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f3981k0.a() ? this.f3981k0.g() : super.getAccessibilityClassName();
    }

    @o0
    public RecyclerView.g getAdapter() {
        return this.f3971a0.getAdapter();
    }

    public int getCurrentItem() {
        return this.R;
    }

    public int getItemDecorationCount() {
        return this.f3971a0.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3980j0;
    }

    public int getOrientation() {
        return this.U.Q2();
    }

    public int getPageSize() {
        int i10;
        int i11;
        RecyclerView recyclerView = this.f3971a0;
        if (getOrientation() == 0) {
            i10 = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i11 = recyclerView.getPaddingRight();
        } else {
            i10 = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i11 = recyclerView.getPaddingBottom();
        }
        return i10 - i11;
    }

    public int getScrollState() {
        return this.f3973c0.h();
    }

    public final void h(Context context, AttributeSet attributeSet) {
        this.f3981k0 = f3970r0 ? new l() : new f();
        o oVar = new o(context);
        this.f3971a0 = oVar;
        oVar.setId(w1.B());
        this.f3971a0.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.U = hVar;
        this.f3971a0.setLayoutManager(hVar);
        this.f3971a0.setScrollingTouchSlop(1);
        u(context, attributeSet);
        this.f3971a0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f3971a0.p(e());
        g gVar = new g(this);
        this.f3973c0 = gVar;
        this.f3975e0 = new d(this, gVar, this.f3971a0);
        n nVar = new n();
        this.f3972b0 = nVar;
        nVar.b(this.f3971a0);
        this.f3971a0.r(this.f3973c0);
        b bVar = new b(3);
        this.f3974d0 = bVar;
        this.f3973c0.r(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f3974d0.d(bVar2);
        this.f3974d0.d(cVar);
        this.f3981k0.h(this.f3974d0, this.f3971a0);
        this.f3974d0.d(this.Q);
        f fVar = new f(this.U);
        this.f3976f0 = fVar;
        this.f3974d0.d(fVar);
        RecyclerView recyclerView = this.f3971a0;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    public void i() {
        this.f3971a0.J0();
    }

    public boolean j() {
        return this.f3975e0.f();
    }

    public boolean k() {
        return this.U.i0() == 1;
    }

    public boolean l() {
        return this.f3979i0;
    }

    public final void m(@o0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.C(this.T);
        }
    }

    public void n(@m0 j jVar) {
        this.Q.d(jVar);
    }

    public void o(@m0 RecyclerView.n nVar) {
        this.f3971a0.p1(nVar);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3981k0.i(accessibilityNodeInfo);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3971a0.getMeasuredWidth();
        int measuredHeight = this.f3971a0.getMeasuredHeight();
        this.O.left = getPaddingLeft();
        this.O.right = (i12 - i10) - getPaddingRight();
        this.O.top = getPaddingTop();
        this.O.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.f16647f0, measuredWidth, measuredHeight, this.O, this.P);
        RecyclerView recyclerView = this.f3971a0;
        Rect rect = this.P;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.S) {
            y();
        }
    }

    public void onMeasure(int i10, int i11) {
        measureChild(this.f3971a0, i10, i11);
        int measuredWidth = this.f3971a0.getMeasuredWidth();
        int measuredHeight = this.f3971a0.getMeasuredHeight();
        int measuredState = this.f3971a0.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.V = savedState.P;
        this.W = savedState.Q;
    }

    @o0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.O = this.f3971a0.getId();
        int i10 = this.V;
        if (i10 == -1) {
            i10 = this.R;
        }
        savedState.P = i10;
        Parcelable parcelable = this.W;
        if (parcelable == null) {
            RecyclerView.g adapter = this.f3971a0.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.b) {
                parcelable = ((androidx.viewpager2.adapter.b) adapter).a();
            }
            return savedState;
        }
        savedState.Q = parcelable;
        return savedState;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(int i10) {
        this.f3971a0.q1(i10);
    }

    @t0(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f3981k0.c(i10, bundle) ? this.f3981k0.l(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void q() {
        if (this.f3976f0.d() != null) {
            double g10 = this.f3973c0.g();
            int i10 = (int) g10;
            float f10 = (float) (g10 - ((double) i10));
            this.f3976f0.b(i10, f10, Math.round(((float) getPageSize()) * f10));
        }
    }

    public final void r() {
        RecyclerView.g adapter;
        if (this.V != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.W;
            if (parcelable != null) {
                if (adapter instanceof androidx.viewpager2.adapter.b) {
                    ((androidx.viewpager2.adapter.b) adapter).b(parcelable);
                }
                this.W = null;
            }
            int max = Math.max(0, Math.min(this.V, adapter.e() - 1));
            this.R = max;
            this.V = -1;
            this.f3971a0.C1(max);
            this.f3981k0.m();
        }
    }

    public void s(int i10, boolean z10) {
        if (!j()) {
            t(i10, z10);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setAdapter(@o0 RecyclerView.g gVar) {
        RecyclerView.g adapter = this.f3971a0.getAdapter();
        this.f3981k0.f(adapter);
        w(adapter);
        this.f3971a0.setAdapter(gVar);
        this.R = 0;
        r();
        this.f3981k0.e(gVar);
        m(gVar);
    }

    public void setCurrentItem(int i10) {
        s(i10, true);
    }

    @t0(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f3981k0.p();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 >= 1 || i10 == -1) {
            this.f3980j0 = i10;
            this.f3971a0.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i10) {
        this.U.j3(i10);
        this.f3981k0.r();
    }

    public void setPageTransformer(@o0 m mVar) {
        boolean z10 = this.f3978h0;
        if (mVar != null) {
            if (!z10) {
                this.f3977g0 = this.f3971a0.getItemAnimator();
                this.f3978h0 = true;
            }
            this.f3971a0.setItemAnimator((RecyclerView.l) null);
        } else if (z10) {
            this.f3971a0.setItemAnimator(this.f3977g0);
            this.f3977g0 = null;
            this.f3978h0 = false;
        }
        if (mVar != this.f3976f0.d()) {
            this.f3976f0.e(mVar);
            q();
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3979i0 = z10;
        this.f3981k0.s();
    }

    public void t(int i10, boolean z10) {
        RecyclerView.g adapter = getAdapter();
        if (adapter == null) {
            if (this.V != -1) {
                this.V = Math.max(i10, 0);
            }
        } else if (adapter.e() > 0) {
            int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
            if (min != this.R || !this.f3973c0.k()) {
                int i11 = this.R;
                if (min != i11 || !z10) {
                    double d10 = (double) i11;
                    this.R = min;
                    this.f3981k0.q();
                    if (!this.f3973c0.k()) {
                        d10 = this.f3973c0.g();
                    }
                    this.f3973c0.p(min, z10);
                    if (!z10) {
                        this.f3971a0.C1(min);
                        return;
                    }
                    double d11 = (double) min;
                    if (Math.abs(d11 - d10) > 3.0d) {
                        this.f3971a0.C1(d11 > d10 ? min - 3 : min + 3);
                        RecyclerView recyclerView = this.f3971a0;
                        recyclerView.post(new q(min, recyclerView));
                        return;
                    }
                    this.f3971a0.K1(min);
                }
            }
        }
    }

    public final void u(Context context, AttributeSet attributeSet) {
        int[] iArr = a.j.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(a.j.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void v() {
        View h10 = this.f3972b0.h(this.U);
        if (h10 != null) {
            int[] c10 = this.f3972b0.c(this.U, h10);
            int i10 = c10[0];
            if (i10 != 0 || c10[1] != 0) {
                this.f3971a0.G1(i10, c10[1]);
            }
        }
    }

    public final void w(@o0 RecyclerView.g<?> gVar) {
        if (gVar != null) {
            gVar.E(this.T);
        }
    }

    public void x(@m0 j jVar) {
        this.Q.e(jVar);
    }

    public void y() {
        x xVar = this.f3972b0;
        if (xVar != null) {
            View h10 = xVar.h(this.U);
            if (h10 != null) {
                int s02 = this.U.s0(h10);
                if (s02 != this.R && getScrollState() == 0) {
                    this.f3974d0.c(s02);
                }
                this.S = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
