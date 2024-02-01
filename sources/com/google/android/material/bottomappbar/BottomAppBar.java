package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.v;
import d.k0;
import d.m0;
import d.o0;
import d.q;
import d.r0;
import f1.e3;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: c1  reason: collision with root package name */
    public static final int f16695c1 = a.n.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: d1  reason: collision with root package name */
    public static final long f16696d1 = 300;

    /* renamed from: e1  reason: collision with root package name */
    public static final int f16697e1 = 0;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f16698f1 = 1;

    /* renamed from: g1  reason: collision with root package name */
    public static final int f16699g1 = 0;

    /* renamed from: h1  reason: collision with root package name */
    public static final int f16700h1 = 1;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f16701i1 = 0;
    public final int H0;
    public final z9.j I0;
    @o0
    public Animator J0;
    @o0
    public Animator K0;
    public int L0;
    public int M0;
    public boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public int R0;
    public ArrayList<j> S0;
    @k0
    public int T0;
    public boolean U0;
    public boolean V0;
    public Behavior W0;
    public int X0;
    public int Y0;
    public int Z0;
    @m0

    /* renamed from: a1  reason: collision with root package name */
    public AnimatorListenerAdapter f16702a1;
    @m0

    /* renamed from: b1  reason: collision with root package name */
    public j9.k<FloatingActionButton> f16703b1;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @m0

        /* renamed from: i  reason: collision with root package name */
        public final Rect f16704i = new Rect();

        /* renamed from: j  reason: collision with root package name */
        public WeakReference<BottomAppBar> f16705j;

        /* renamed from: k  reason: collision with root package name */
        public int f16706k;

        /* renamed from: l  reason: collision with root package name */
        public final View.OnLayoutChangeListener f16707l = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f16705j.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.l(Behavior.this.f16704i);
                int height = Behavior.this.f16704i.height();
                bottomAppBar.V0(height);
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                if (Behavior.this.f16706k == 0) {
                    gVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(a.f.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    gVar.leftMargin = bottomAppBar.getLeftInset();
                    gVar.rightMargin = bottomAppBar.getRightInset();
                    if (v.j(floatingActionButton)) {
                        gVar.leftMargin += bottomAppBar.H0;
                    } else {
                        gVar.rightMargin += bottomAppBar.H0;
                    }
                }
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: O */
        public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 BottomAppBar bottomAppBar, int i10) {
            this.f16705j = new WeakReference<>(bottomAppBar);
            View q02 = bottomAppBar.I0();
            if (q02 != null && !w1.T0(q02)) {
                CoordinatorLayout.g gVar = (CoordinatorLayout.g) q02.getLayoutParams();
                gVar.f2155d = 49;
                this.f16706k = gVar.bottomMargin;
                if (q02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) q02;
                    floatingActionButton.addOnLayoutChangeListener(this.f16707l);
                    bottomAppBar.A0(floatingActionButton);
                }
                bottomAppBar.T0();
            }
            coordinatorLayout.N(bottomAppBar, i10);
            return super.m(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: P */
        public boolean B(@m0 CoordinatorLayout coordinatorLayout, @m0 BottomAppBar bottomAppBar, @m0 View view, @m0 View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.B(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int Q;
        public boolean R;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @o0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @m0
            /* renamed from: b */
            public SavedState createFromParcel(@m0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @m0
            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = parcel.readInt();
            this.R = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R ? 1 : 0);
        }
    }

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.U0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.M0(bottomAppBar.L0, BottomAppBar.this.V0);
            }
        }
    }

    public class b implements j9.k<FloatingActionButton> {
        public b() {
        }

        /* renamed from: c */
        public void a(@m0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.I0.o0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: d */
        public void b(@m0 FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().n() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().t(translationX);
                BottomAppBar.this.I0.invalidateSelf();
            }
            float f10 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().i() != max) {
                BottomAppBar.this.getTopEdgeTreatment().p(max);
                BottomAppBar.this.I0.invalidateSelf();
            }
            z9.j s02 = BottomAppBar.this.I0;
            if (floatingActionButton.getVisibility() == 0) {
                f10 = floatingActionButton.getScaleY();
            }
            s02.o0(f10);
        }
    }

    public class c implements v.e {
        public c() {
        }

        @m0
        public e3 a(View view, @m0 e3 e3Var, @m0 v.f fVar) {
            boolean z10;
            if (BottomAppBar.this.O0) {
                int unused = BottomAppBar.this.X0 = e3Var.o();
            }
            boolean z11 = true;
            boolean z12 = false;
            if (BottomAppBar.this.P0) {
                z10 = BottomAppBar.this.Z0 != e3Var.p();
                int unused2 = BottomAppBar.this.Z0 = e3Var.p();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.Q0) {
                if (BottomAppBar.this.Y0 == e3Var.q()) {
                    z11 = false;
                }
                int unused3 = BottomAppBar.this.Y0 = e3Var.q();
                z12 = z11;
            }
            if (z10 || z12) {
                BottomAppBar.this.B0();
                BottomAppBar.this.T0();
                BottomAppBar.this.S0();
            }
            return e3Var;
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.F0();
            Animator unused = BottomAppBar.this.J0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.G0();
        }
    }

    public class e extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16712a;

        public class a extends FloatingActionButton.b {
            public a() {
            }

            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.F0();
            }
        }

        public e(int i10) {
            this.f16712a = i10;
        }

        public void a(@m0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.K0(this.f16712a));
            floatingActionButton.A(new a());
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.F0();
            boolean unused = BottomAppBar.this.U0 = false;
            Animator unused2 = BottomAppBar.this.K0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.G0();
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16716a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f16717b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f16718c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f16719d;

        public g(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f16717b = actionMenuView;
            this.f16718c = i10;
            this.f16719d = z10;
        }

        public void onAnimationCancel(Animator animator) {
            this.f16716a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f16716a) {
                boolean z10 = BottomAppBar.this.T0 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.R0(bottomAppBar.T0);
                BottomAppBar.this.X0(this.f16717b, this.f16718c, this.f16719d, z10);
            }
        }
    }

    public class h implements Runnable {
        public final /* synthetic */ ActionMenuView O;
        public final /* synthetic */ int P;
        public final /* synthetic */ boolean Q;

        public h(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.O = actionMenuView;
            this.P = i10;
            this.Q = z10;
        }

        public void run() {
            ActionMenuView actionMenuView = this.O;
            actionMenuView.setTranslationX((float) BottomAppBar.this.J0(actionMenuView, this.P, this.Q));
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f16702a1.onAnimationStart(animator);
            FloatingActionButton j02 = BottomAppBar.this.H0();
            if (j02 != null) {
                j02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public BottomAppBar(@m0 Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public BottomAppBar(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.bottomAppBarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(@d.m0 android.content.Context r11, @d.o0 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f16695c1
            android.content.Context r11 = ca.a.c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            z9.j r11 = new z9.j
            r11.<init>()
            r10.I0 = r11
            r7 = 0
            r10.R0 = r7
            r10.T0 = r7
            r10.U0 = r7
            r0 = 1
            r10.V0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f16702a1 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f16703b1 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = i9.a.o.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r1 = i9.a.o.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = w9.c.a(r8, r0, r1)
            int r2 = i9.a.o.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = i9.a.o.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = i9.a.o.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = i9.a.o.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = i9.a.o.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.L0 = r9
            int r9 = i9.a.o.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.M0 = r9
            int r9 = i9.a.o.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.N0 = r9
            int r9 = i9.a.o.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.O0 = r9
            int r9 = i9.a.o.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.P0 = r9
            int r9 = i9.a.o.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.Q0 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = i9.a.f.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.H0 = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            z9.o$b r3 = z9.o.a()
            z9.o$b r0 = r3.G(r0)
            z9.o r0 = r0.m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.w0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.q0(r0)
            r11.Y(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            o0.d.o(r11, r1)
            f1.w1.G1(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.v.c(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @o0
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.X0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return K0(this.L0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().i();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.Z0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.Y0;
    }

    /* access modifiers changed from: private */
    @m0
    public a getTopEdgeTreatment() {
        return (a) this.I0.getShapeAppearanceModel().p();
    }

    public final void A0(@m0 FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.f16702a1);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.f16703b1);
    }

    public final void B0() {
        Animator animator = this.K0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.J0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void C0(int i10, List<Animator> list) {
        FloatingActionButton H02 = H0();
        if (H02 != null && !H02.q()) {
            G0();
            H02.o(new e(i10));
        }
    }

    public final void D0(int i10, @m0 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(H0(), v.e.f13924t, new float[]{K0(i10)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    public final void E0(int i10, boolean z10, @m0 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, v.e.f13911g, new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) J0(actionMenuView, i10, z10))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, v.e.f13911g, new float[]{0.0f});
                ofFloat2.addListener(new g(actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    public final void F0() {
        ArrayList<j> arrayList;
        int i10 = this.R0 - 1;
        this.R0 = i10;
        if (i10 == 0 && (arrayList = this.S0) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    public final void G0() {
        ArrayList<j> arrayList;
        int i10 = this.R0;
        this.R0 = i10 + 1;
        if (i10 == 0 && (arrayList = this.S0) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    @o0
    public final FloatingActionButton H0() {
        View I02 = I0();
        if (I02 instanceof FloatingActionButton) {
            return (FloatingActionButton) I02;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View I0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.x(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.I0():android.view.View");
    }

    public int J0(@m0 ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 != 1 || !z10) {
            return 0;
        }
        boolean j10 = v.j(this);
        int measuredWidth = j10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f802a & f1.j.f7187d) == 8388611) {
                measuredWidth = j10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((j10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (j10 ? this.Y0 : -this.Z0));
    }

    public final float K0(int i10) {
        boolean j10 = v.j(this);
        int i11 = 1;
        if (i10 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.H0 + (j10 ? this.Z0 : this.Y0));
        if (j10) {
            i11 = -1;
        }
        return (float) (measuredWidth * i11);
    }

    public final boolean L0() {
        FloatingActionButton H02 = H0();
        return H02 != null && H02.r();
    }

    public final void M0(int i10, boolean z10) {
        if (!w1.T0(this)) {
            this.U0 = false;
            R0(this.T0);
            return;
        }
        Animator animator = this.K0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!L0()) {
            i10 = 0;
            z10 = false;
        }
        E0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.K0 = animatorSet;
        animatorSet.addListener(new f());
        this.K0.start();
    }

    public final void N0(int i10) {
        if (this.L0 != i10 && w1.T0(this)) {
            Animator animator = this.J0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.M0 == 1) {
                D0(i10, arrayList);
            } else {
                C0(i10, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.J0 = animatorSet;
            animatorSet.addListener(new d());
            this.J0.start();
        }
    }

    public void O0() {
        getBehavior().J(this);
    }

    public void P0() {
        getBehavior().K(this);
    }

    public void Q0(@m0 j jVar) {
        ArrayList<j> arrayList = this.S0;
        if (arrayList != null) {
            arrayList.remove(jVar);
        }
    }

    public void R0(@k0 int i10) {
        if (i10 != 0) {
            this.T0 = 0;
            getMenu().clear();
            x(i10);
        }
    }

    public final void S0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.K0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!L0()) {
                W0(actionMenuView, 0, false);
            } else {
                W0(actionMenuView, this.L0, this.V0);
            }
        }
    }

    public final void T0() {
        getTopEdgeTreatment().t(getFabTranslationX());
        View I02 = I0();
        this.I0.o0((!this.V0 || !L0()) ? 0.0f : 1.0f);
        if (I02 != null) {
            I02.setTranslationY(getFabTranslationY());
            I02.setTranslationX(getFabTranslationX());
        }
    }

    public void U0(int i10, @k0 int i11) {
        this.T0 = i11;
        this.U0 = true;
        M0(i10, this.V0);
        N0(i10);
        this.L0 = i10;
    }

    public boolean V0(@r0 int i10) {
        float f10 = (float) i10;
        if (f10 == getTopEdgeTreatment().m()) {
            return false;
        }
        getTopEdgeTreatment().s(f10);
        this.I0.invalidateSelf();
        return true;
    }

    public final void W0(@m0 ActionMenuView actionMenuView, int i10, boolean z10) {
        X0(actionMenuView, i10, z10, false);
    }

    public final void X0(@m0 ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        h hVar = new h(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    @o0
    public ColorStateList getBackgroundTint() {
        return this.I0.Q();
    }

    @m0
    public Behavior getBehavior() {
        if (this.W0 == null) {
            this.W0 = new Behavior();
        }
        return this.W0;
    }

    @q
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().i();
    }

    public int getFabAlignmentMode() {
        return this.L0;
    }

    public int getFabAnimationMode() {
        return this.M0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().j();
    }

    @q
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().k();
    }

    public boolean getHideOnScroll() {
        return this.N0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9.k.f(this, this.I0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            B0();
            T0();
        }
        S0();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.L0 = savedState.Q;
        this.V0 = savedState.R;
    }

    @m0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = this.L0;
        savedState.R = this.V0;
        return savedState;
    }

    public void setBackgroundTint(@o0 ColorStateList colorStateList) {
        o0.d.o(this.I0, colorStateList);
    }

    public void setCradleVerticalOffset(@q float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().p(f10);
            this.I0.invalidateSelf();
            T0();
        }
    }

    public void setElevation(float f10) {
        this.I0.m0(f10);
        getBehavior().I(this, this.I0.J() - this.I0.I());
    }

    public void setFabAlignmentMode(int i10) {
        U0(i10, 0);
    }

    public void setFabAnimationMode(int i10) {
        this.M0 = i10;
    }

    public void setFabCradleMargin(@q float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().q(f10);
            this.I0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@q float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().r(f10);
            this.I0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.N0 = z10;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public void z0(@m0 j jVar) {
        if (this.S0 == null) {
            this.S0 = new ArrayList<>();
        }
        this.S0.add(jVar);
    }
}
