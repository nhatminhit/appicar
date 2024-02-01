package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.z0;
import androidx.core.widget.y;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.v;
import d.a1;
import d.h0;
import d.m0;
import d.o0;
import d.q;
import d.u;
import d.x0;
import e1.m;
import f1.o;
import f1.t0;
import f1.w1;
import g1.z;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final int H0 = a.n.Widget_Design_TabLayout;
    @q(unit = 0)
    public static final int I0 = 72;
    @q(unit = 0)
    public static final int J0 = 8;
    @q(unit = 0)
    public static final int K0 = 48;
    @q(unit = 0)
    public static final int L0 = 56;
    @q(unit = 0)
    public static final int M0 = 16;
    public static final int N0 = -1;
    public static final int O0 = 300;
    public static final m.a<i> P0 = new m.c(16);
    public static final String Q0 = "TabLayout";
    public static final int R0 = 0;
    public static final int S0 = 1;
    public static final int T0 = 2;
    public static final int U0 = 0;
    public static final int V0 = 1;
    public static final int W0 = 0;
    public static final int X0 = 1;
    public static final int Y0 = 2;
    public static final int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f17422a1 = 1;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f17423b1 = 2;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f17424c1 = 3;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f17425d1 = 0;

    /* renamed from: e1  reason: collision with root package name */
    public static final int f17426e1 = 1;
    @o0
    public ViewPager A0;
    @o0
    public n3.a B0;
    public DataSetObserver C0;
    public m D0;
    public b E0;
    public boolean F0;
    public final m.a<TabView> G0;
    public final ArrayList<i> O;
    @o0
    public i P;
    @m0
    public final h Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public ColorStateList W;

    /* renamed from: a0  reason: collision with root package name */
    public ColorStateList f17427a0;

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f17428b0;
    @m0

    /* renamed from: c0  reason: collision with root package name */
    public Drawable f17429c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f17430d0;

    /* renamed from: e0  reason: collision with root package name */
    public PorterDuff.Mode f17431e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f17432f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f17433g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f17434h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f17435i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f17436j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f17437k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f17438l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f17439m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f17440n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f17441o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f17442p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f17443q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f17444r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f17445s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f17446t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f17447u0;

    /* renamed from: v0  reason: collision with root package name */
    public a f17448v0;
    @o0

    /* renamed from: w0  reason: collision with root package name */
    public c f17449w0;

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList<c> f17450x0;
    @o0

    /* renamed from: y0  reason: collision with root package name */
    public c f17451y0;

    /* renamed from: z0  reason: collision with root package name */
    public ValueAnimator f17452z0;

    public final class TabView extends LinearLayout {
        public i O;
        public TextView P;
        public ImageView Q;
        @o0
        public View R;
        @o0
        public BadgeDrawable S;
        @o0
        public View T;
        @o0
        public TextView U;
        @o0
        public ImageView V;
        @o0
        public Drawable W;

        /* renamed from: a0  reason: collision with root package name */
        public int f17453a0 = 2;

        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ View O;

            public a(View view) {
                this.O = view;
            }

            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.O.getVisibility() == 0) {
                    TabView.this.w(this.O);
                }
            }
        }

        public TabView(@m0 Context context) {
            super(context);
            y(context);
            w1.b2(this, TabLayout.this.R, TabLayout.this.S, TabLayout.this.T, TabLayout.this.U);
            setGravity(17);
            setOrientation(TabLayout.this.f17444r0 ^ true ? 1 : 0);
            setClickable(true);
            w1.e2(this, t0.c(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        @o0
        public BadgeDrawable getBadge() {
            return this.S;
        }

        /* access modifiers changed from: private */
        @m0
        public BadgeDrawable getOrCreateBadge() {
            if (this.S == null) {
                this.S = BadgeDrawable.d(getContext());
            }
            v();
            BadgeDrawable badgeDrawable = this.S;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void A(@o0 TextView textView, @o0 ImageView imageView) {
            i iVar = this.O;
            CharSequence charSequence = null;
            Drawable mutate = (iVar == null || iVar.h() == null) ? null : o0.d.r(this.O.h()).mutate();
            i iVar2 = this.O;
            CharSequence n10 = iVar2 != null ? iVar2.n() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(n10);
            if (textView != null) {
                if (z10) {
                    textView.setText(n10);
                    if (this.O.f17471g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int e10 = (!z10 || imageView.getVisibility() != 0) ? 0 : (int) v.e(getContext(), 8);
                if (TabLayout.this.f17444r0) {
                    if (e10 != o.b(marginLayoutParams)) {
                        o.g(marginLayoutParams, e10);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (e10 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = e10;
                    o.g(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            i iVar3 = this.O;
            if (iVar3 != null) {
                charSequence = iVar3.f17468d;
            }
            if (!z10) {
                n10 = charSequence;
            }
            z0.a(this, n10);
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.W;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.W.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.P, this.Q, this.T};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.P, this.Q, this.T};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        @o0
        public i getTab() {
            return this.O;
        }

        public final void i(@o0 View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new a(view));
            }
        }

        public final float j(@m0 Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        public final void k(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        @m0
        public final FrameLayout l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        public final void m(@m0 Canvas canvas) {
            Drawable drawable = this.W;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.W.draw(canvas);
            }
        }

        @o0
        public final FrameLayout n(@m0 View view) {
            if ((view == this.Q || view == this.P) && com.google.android.material.badge.a.f16660a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        public final boolean o() {
            return this.S != null;
        }

        public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.S;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.S.m());
            }
            z V1 = z.V1(accessibilityNodeInfo);
            V1.X0(z.c.h(0, 1, this.O.k(), 1, false, isSelected()));
            if (isSelected()) {
                V1.V0(false);
                V1.J0(z.a.f7603j);
            }
            V1.B1(getResources().getString(a.m.item_view_role_description));
        }

        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f17435i0, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.P != null) {
                float f10 = TabLayout.this.f17432f0;
                int i12 = this.f17453a0;
                ImageView imageView = this.Q;
                boolean z10 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.P;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f17433g0;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.P.getTextSize();
                int lineCount = this.P.getLineCount();
                int k10 = y.k(this.P);
                int i13 = (f10 > textSize ? 1 : (f10 == textSize ? 0 : -1));
                if (i13 != 0 || (k10 >= 0 && i12 != k10)) {
                    if (TabLayout.this.f17443q0 == 1 && i13 > 0 && lineCount == 1 && ((layout = this.P.getLayout()) == null || j(layout, 0, f10) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z10 = false;
                    }
                    if (z10) {
                        this.P.setTextSize(0, f10);
                        this.P.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        public final void p() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.a.f16660a) {
                viewGroup = l();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(a.k.design_layout_tab_icon, viewGroup, false);
            this.Q = imageView;
            viewGroup.addView(imageView, 0);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.O == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.O.r();
            return true;
        }

        public final void q() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.a.f16660a) {
                viewGroup = l();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(a.k.design_layout_tab_text, viewGroup, false);
            this.P = textView;
            viewGroup.addView(textView);
        }

        public final void r() {
            if (this.R != null) {
                u();
            }
            this.S = null;
        }

        public void s() {
            setTab((i) null);
            setSelected(false);
        }

        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.P;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.Q;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.T;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(@o0 i iVar) {
            if (iVar != this.O) {
                this.O = iVar;
                x();
            }
        }

        public final void t(@o0 View view) {
            if (o() && view != null) {
                k(false);
                com.google.android.material.badge.a.b(this.S, view, n(view));
                this.R = view;
            }
        }

        public final void u() {
            if (o()) {
                k(true);
                View view = this.R;
                if (view != null) {
                    com.google.android.material.badge.a.g(this.S, view);
                    this.R = null;
                }
            }
        }

        public final void v() {
            i iVar;
            View view;
            View view2;
            i iVar2;
            if (o()) {
                if (this.T == null) {
                    if (this.Q != null && (iVar2 = this.O) != null && iVar2.h() != null) {
                        View view3 = this.R;
                        view = this.Q;
                        if (view3 != view) {
                            u();
                            view2 = this.Q;
                        }
                        w(view);
                        return;
                    } else if (!(this.P == null || (iVar = this.O) == null || iVar.l() != 1)) {
                        View view4 = this.R;
                        view = this.P;
                        if (view4 != view) {
                            u();
                            view2 = this.P;
                        }
                        w(view);
                        return;
                    }
                    t(view2);
                    return;
                }
                u();
            }
        }

        public final void w(@m0 View view) {
            if (o() && view == this.R) {
                com.google.android.material.badge.a.i(this.S, view, n(view));
            }
        }

        public final void x() {
            i iVar = this.O;
            Drawable drawable = null;
            View g10 = iVar != null ? iVar.g() : null;
            if (g10 != null) {
                ViewParent parent = g10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(g10);
                    }
                    addView(g10);
                }
                this.T = g10;
                TextView textView = this.P;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.Q;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.Q.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) g10.findViewById(16908308);
                this.U = textView2;
                if (textView2 != null) {
                    this.f17453a0 = y.k(textView2);
                }
                this.V = (ImageView) g10.findViewById(16908294);
            } else {
                View view = this.T;
                if (view != null) {
                    removeView(view);
                    this.T = null;
                }
                this.U = null;
                this.V = null;
            }
            if (this.T == null) {
                if (this.Q == null) {
                    p();
                }
                if (!(iVar == null || iVar.h() == null)) {
                    drawable = o0.d.r(iVar.h()).mutate();
                }
                if (drawable != null) {
                    o0.d.o(drawable, TabLayout.this.f17427a0);
                    PorterDuff.Mode mode = TabLayout.this.f17431e0;
                    if (mode != null) {
                        o0.d.p(drawable, mode);
                    }
                }
                if (this.P == null) {
                    q();
                    this.f17453a0 = y.k(this.P);
                }
                y.E(this.P, TabLayout.this.V);
                ColorStateList colorStateList = TabLayout.this.W;
                if (colorStateList != null) {
                    this.P.setTextColor(colorStateList);
                }
                A(this.P, this.Q);
                v();
                i(this.Q);
                i(this.P);
            } else {
                TextView textView3 = this.U;
                if (!(textView3 == null && this.V == null)) {
                    A(textView3, this.V);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f17468d)) {
                setContentDescription(iVar.f17468d);
            }
            setSelected(iVar != null && iVar.o());
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void y(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f17434h0
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = g.a.d(r6, r0)
                r5.W = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.W
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.W = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f17428b0
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f17428b0
                android.content.res.ColorStateList r2 = x9.b.a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f17447u0
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                f1.w1.G1(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.y(android.content.Context):void");
        }

        public final void z() {
            ImageView imageView;
            setOrientation(TabLayout.this.f17444r0 ^ true ? 1 : 0);
            TextView textView = this.U;
            if (textView == null && this.V == null) {
                textView = this.P;
                imageView = this.Q;
            } else {
                imageView = this.V;
            }
            A(textView, imageView);
        }
    }

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public boolean f17456a;

        public b() {
        }

        public void a(boolean z10) {
            this.f17456a = z10;
        }

        public void b(@m0 ViewPager viewPager, @o0 n3.a aVar, @o0 n3.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.A0 == viewPager) {
                tabLayout.O(aVar2, this.f17456a);
            }
        }
    }

    @Deprecated
    public interface c<T extends i> {
        void a(T t10);

        void b(T t10);

        void c(T t10);
    }

    public @interface d {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public interface f extends c<i> {
    }

    public class g extends DataSetObserver {
        public g() {
        }

        public void onChanged() {
            TabLayout.this.E();
        }

        public void onInvalidated() {
            TabLayout.this.E();
        }
    }

    public class h extends LinearLayout {
        public ValueAnimator O;
        public int P = -1;
        public float Q;
        public int R = -1;

        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f17459a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f17460b;

            public a(View view, View view2) {
                this.f17459a = view;
                this.f17460b = view2;
            }

            public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
                h.this.h(this.f17459a, this.f17460b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f17462a;

            public b(int i10) {
                this.f17462a = i10;
            }

            public void onAnimationEnd(Animator animator) {
                h.this.P = this.f17462a;
            }

            public void onAnimationStart(Animator animator) {
                h.this.P = this.f17462a;
            }
        }

        public h(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public void b(int i10, int i11) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.O.cancel();
            }
            i(true, i10, i11);
        }

        public boolean c() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public float d() {
            return ((float) this.P) + this.Q;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(@d.m0 android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f17429c0
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L_0x0016
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f17429c0
                int r0 = r0.getIntrinsicHeight()
            L_0x0016:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.f17442p0
                r2 = 0
                if (r1 == 0) goto L_0x0037
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L_0x0028
                if (r1 == r4) goto L_0x0041
                r0 = 3
                if (r1 == r0) goto L_0x003d
                r0 = r2
                goto L_0x0041
            L_0x0028:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L_0x0041
            L_0x0037:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L_0x003d:
                int r0 = r5.getHeight()
            L_0x0041:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f17429c0
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L_0x007c
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f17429c0
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f17429c0
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r0.f17429c0
                int r0 = r0.f17430d0
                if (r0 == 0) goto L_0x0079
                android.graphics.drawable.Drawable r1 = o0.d.r(r1)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f17430d0
                o0.d.n(r1, r0)
            L_0x0079:
                r1.draw(r6)
            L_0x007c:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.draw(android.graphics.Canvas):void");
        }

        public final void e() {
            View childAt = getChildAt(this.P);
            a a10 = TabLayout.this.f17448v0;
            TabLayout tabLayout = TabLayout.this;
            a10.d(tabLayout, childAt, tabLayout.f17429c0);
        }

        public void f(int i10, float f10) {
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.O.cancel();
            }
            this.P = i10;
            this.Q = f10;
            h(getChildAt(i10), getChildAt(this.P + 1), this.Q);
        }

        public void g(int i10) {
            Rect bounds = TabLayout.this.f17429c0.getBounds();
            TabLayout.this.f17429c0.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void h(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                a a10 = TabLayout.this.f17448v0;
                TabLayout tabLayout = TabLayout.this;
                a10.c(tabLayout, view, view2, f10, tabLayout.f17429c0);
            } else {
                Drawable drawable = TabLayout.this.f17429c0;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f17429c0.getBounds().bottom);
            }
            w1.l1(this);
        }

        public final void i(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.P);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                e();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z10) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.O = valueAnimator;
                valueAnimator.setInterpolator(j9.a.f19829b);
                valueAnimator.setDuration((long) i11);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i10));
                valueAnimator.start();
                return;
            }
            this.O.removeAllUpdateListeners();
            this.O.addUpdateListener(aVar);
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.O;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                i(false, this.P, -1);
            }
        }

        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z10 = true;
                if (tabLayout.f17440n0 == 1 || tabLayout.f17443q0 == 2) {
                    int childCount = getChildCount();
                    int i12 = 0;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = getChildAt(i13);
                        if (childAt.getVisibility() == 0) {
                            i12 = Math.max(i12, childAt.getMeasuredWidth());
                        }
                    }
                    if (i12 > 0) {
                        if (i12 * childCount <= getMeasuredWidth() - (((int) v.e(getContext(), 16)) * 2)) {
                            boolean z11 = false;
                            for (int i14 = 0; i14 < childCount; i14++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                                if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i12;
                                    layoutParams.weight = 0.0f;
                                    z11 = true;
                                }
                            }
                            z10 = z11;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f17440n0 = 0;
                            tabLayout2.W(false);
                        }
                        if (z10) {
                            super.onMeasure(i10, i11);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    public static class i {

        /* renamed from: k  reason: collision with root package name */
        public static final int f17464k = -1;
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Object f17465a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public Drawable f17466b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f17467c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f17468d;

        /* renamed from: e  reason: collision with root package name */
        public int f17469e = -1;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public View f17470f;
        @d

        /* renamed from: g  reason: collision with root package name */
        public int f17471g = 1;
        @o0

        /* renamed from: h  reason: collision with root package name */
        public TabLayout f17472h;
        @m0

        /* renamed from: i  reason: collision with root package name */
        public TabView f17473i;

        /* renamed from: j  reason: collision with root package name */
        public int f17474j = -1;

        @m0
        public i A(@d int i10) {
            this.f17471g = i10;
            TabLayout tabLayout = this.f17472h;
            if (tabLayout.f17440n0 == 1 || tabLayout.f17443q0 == 2) {
                tabLayout.W(true);
            }
            E();
            if (com.google.android.material.badge.a.f16660a && this.f17473i.o() && this.f17473i.S.isVisible()) {
                this.f17473i.invalidate();
            }
            return this;
        }

        @m0
        public i B(@o0 Object obj) {
            this.f17465a = obj;
            return this;
        }

        @m0
        public i C(@a1 int i10) {
            TabLayout tabLayout = this.f17472h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @m0
        public i D(@o0 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f17468d) && !TextUtils.isEmpty(charSequence)) {
                this.f17473i.setContentDescription(charSequence);
            }
            this.f17467c = charSequence;
            E();
            return this;
        }

        public void E() {
            TabView tabView = this.f17473i;
            if (tabView != null) {
                tabView.x();
            }
        }

        @o0
        public BadgeDrawable e() {
            return this.f17473i.getBadge();
        }

        @o0
        public CharSequence f() {
            TabView tabView = this.f17473i;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @o0
        public View g() {
            return this.f17470f;
        }

        @o0
        public Drawable h() {
            return this.f17466b;
        }

        public int i() {
            return this.f17474j;
        }

        @m0
        public BadgeDrawable j() {
            return this.f17473i.getOrCreateBadge();
        }

        public int k() {
            return this.f17469e;
        }

        @d
        public int l() {
            return this.f17471g;
        }

        @o0
        public Object m() {
            return this.f17465a;
        }

        @o0
        public CharSequence n() {
            return this.f17467c;
        }

        public boolean o() {
            TabLayout tabLayout = this.f17472h;
            if (tabLayout != null) {
                return tabLayout.getSelectedTabPosition() == this.f17469e;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void p() {
            this.f17473i.r();
        }

        public void q() {
            this.f17472h = null;
            this.f17473i = null;
            this.f17465a = null;
            this.f17466b = null;
            this.f17474j = -1;
            this.f17467c = null;
            this.f17468d = null;
            this.f17469e = -1;
            this.f17470f = null;
        }

        public void r() {
            TabLayout tabLayout = this.f17472h;
            if (tabLayout != null) {
                tabLayout.M(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @m0
        public i s(@a1 int i10) {
            TabLayout tabLayout = this.f17472h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @m0
        public i t(@o0 CharSequence charSequence) {
            this.f17468d = charSequence;
            E();
            return this;
        }

        @m0
        public i u(@h0 int i10) {
            return v(LayoutInflater.from(this.f17473i.getContext()).inflate(i10, this.f17473i, false));
        }

        @m0
        public i v(@o0 View view) {
            this.f17470f = view;
            E();
            return this;
        }

        @m0
        public i w(@u int i10) {
            TabLayout tabLayout = this.f17472h;
            if (tabLayout != null) {
                return x(g.a.d(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @m0
        public i x(@o0 Drawable drawable) {
            this.f17466b = drawable;
            TabLayout tabLayout = this.f17472h;
            if (tabLayout.f17440n0 == 1 || tabLayout.f17443q0 == 2) {
                tabLayout.W(true);
            }
            E();
            if (com.google.android.material.badge.a.f16660a && this.f17473i.o() && this.f17473i.S.isVisible()) {
                this.f17473i.invalidate();
            }
            return this;
        }

        @m0
        public i y(int i10) {
            this.f17474j = i10;
            TabView tabView = this.f17473i;
            if (tabView != null) {
                tabView.setId(i10);
            }
            return this;
        }

        public void z(int i10) {
            this.f17469e = i10;
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public static class m implements ViewPager.j {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<TabLayout> f17475a;

        /* renamed from: b  reason: collision with root package name */
        public int f17476b;

        /* renamed from: c  reason: collision with root package name */
        public int f17477c;

        public m(TabLayout tabLayout) {
            this.f17475a = new WeakReference<>(tabLayout);
        }

        public void a(int i10, float f10, int i11) {
            TabLayout tabLayout = this.f17475a.get();
            if (tabLayout != null) {
                int i12 = this.f17477c;
                boolean z10 = false;
                boolean z11 = i12 != 2 || this.f17476b == 1;
                if (!(i12 == 2 && this.f17476b == 0)) {
                    z10 = true;
                }
                tabLayout.Q(i10, f10, z11, z10);
            }
        }

        public void b() {
            this.f17477c = 0;
            this.f17476b = 0;
        }

        public void c(int i10) {
            this.f17476b = this.f17477c;
            this.f17477c = i10;
        }

        public void d(int i10) {
            TabLayout tabLayout = this.f17475a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i10 && i10 < tabLayout.getTabCount()) {
                int i11 = this.f17477c;
                tabLayout.N(tabLayout.z(i10), i11 == 0 || (i11 == 2 && this.f17476b == 0));
            }
        }
    }

    public static class n implements f {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f17478a;

        public n(ViewPager viewPager) {
            this.f17478a = viewPager;
        }

        public void a(i iVar) {
        }

        public void b(@m0 i iVar) {
            this.f17478a.setCurrentItem(iVar.k());
        }

        public void c(i iVar) {
        }
    }

    public TabLayout(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(@d.m0 android.content.Context r12, @d.o0 android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = H0
            android.content.Context r12 = ca.a.c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.O = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.f17429c0 = r12
            r12 = 0
            r11.f17430d0 = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f17435i0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f17450x0 = r0
            e1.m$b r0 = new e1.m$b
            r1 = 12
            r0.<init>(r1)
            r11.G0 = r0
            android.content.Context r6 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$h r7 = new com.google.android.material.tabs.TabLayout$h
            r7.<init>(r6)
            r11.Q = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r12, r0)
            int[] r2 = i9.a.o.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = i9.a.o.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r6
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x0082
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            z9.j r0 = new z9.j
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.n0(r14)
            r0.Y(r6)
            float r14 = f1.w1.P(r11)
            r0.m0(r14)
            f1.w1.G1(r11, r0)
        L_0x0082:
            int r14 = i9.a.o.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = w9.c.d(r6, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = i9.a.o.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = i9.a.o.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r7.g(r14)
            int r14 = i9.a.o.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = i9.a.o.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = i9.a.o.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = i9.a.o.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.U = r14
            r11.T = r14
            r11.S = r14
            r11.R = r14
            int r0 = i9.a.o.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.R = r14
            int r14 = i9.a.o.TabLayout_tabPaddingTop
            int r0 = r11.S
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.S = r14
            int r14 = i9.a.o.TabLayout_tabPaddingEnd
            int r0 = r11.T
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.T = r14
            int r14 = i9.a.o.TabLayout_tabPaddingBottom
            int r0 = r11.U
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.U = r14
            int r14 = i9.a.n.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.V = r14
            int[] r0 = f.a.n.TextAppearance
            android.content.res.TypedArray r14 = r6.obtainStyledAttributes(r14, r0)
            int r0 = f.a.n.TextAppearance_android_textSize     // Catch:{ all -> 0x01b7 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b7 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b7 }
            r11.f17432f0 = r0     // Catch:{ all -> 0x01b7 }
            int r0 = f.a.n.TextAppearance_android_textColor     // Catch:{ all -> 0x01b7 }
            android.content.res.ColorStateList r0 = w9.c.a(r6, r14, r0)     // Catch:{ all -> 0x01b7 }
            r11.W = r0     // Catch:{ all -> 0x01b7 }
            r14.recycle()
            int r14 = i9.a.o.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x011c
            android.content.res.ColorStateList r14 = w9.c.a(r6, r13, r14)
            r11.W = r14
        L_0x011c:
            int r14 = i9.a.o.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0134
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.W
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = r(r0, r14)
            r11.W = r14
        L_0x0134:
            int r14 = i9.a.o.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = w9.c.a(r6, r13, r14)
            r11.f17427a0 = r14
            int r14 = i9.a.o.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r8)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.google.android.material.internal.v.k(r14, r0)
            r11.f17431e0 = r14
            int r14 = i9.a.o.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = w9.c.a(r6, r13, r14)
            r11.f17428b0 = r14
            int r14 = i9.a.o.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f17441o0 = r14
            int r14 = i9.a.o.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f17436j0 = r14
            int r14 = i9.a.o.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r8)
            r11.f17437k0 = r14
            int r14 = i9.a.o.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f17434h0 = r14
            int r14 = i9.a.o.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f17439m0 = r14
            int r14 = i9.a.o.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f17443q0 = r14
            int r14 = i9.a.o.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f17440n0 = r14
            int r14 = i9.a.o.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f17444r0 = r14
            int r14 = i9.a.o.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f17447u0 = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = i9.a.f.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f17433g0 = r13
            int r13 = i9.a.f.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f17438l0 = r12
            r11.n()
            return
        L_0x01b7:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @q(unit = 0)
    private int getDefaultHeight() {
        int size = this.O.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                i iVar = this.O.get(i10);
                if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.f17444r0) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.f17436j0;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f17443q0;
        if (i11 == 0 || i11 == 2) {
            return this.f17438l0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.Q.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @m0
    public static ColorStateList r(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.Q.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.Q.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    public boolean A() {
        return this.f17447u0;
    }

    public boolean B() {
        return this.f17444r0;
    }

    public boolean C() {
        return this.f17445s0;
    }

    @m0
    public i D() {
        i t10 = t();
        t10.f17472h = this;
        t10.f17473i = u(t10);
        if (t10.f17474j != -1) {
            t10.f17473i.setId(t10.f17474j);
        }
        return t10;
    }

    public void E() {
        int currentItem;
        G();
        n3.a aVar = this.B0;
        if (aVar != null) {
            int e10 = aVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                h(D().D(this.B0.g(i10)), false);
            }
            ViewPager viewPager = this.A0;
            if (viewPager != null && e10 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                M(z(currentItem));
            }
        }
    }

    public boolean F(i iVar) {
        return P0.a(iVar);
    }

    public void G() {
        for (int childCount = this.Q.getChildCount() - 1; childCount >= 0; childCount--) {
            L(childCount);
        }
        Iterator<i> it = this.O.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            F(next);
        }
        this.P = null;
    }

    @Deprecated
    public void H(@o0 c cVar) {
        this.f17450x0.remove(cVar);
    }

    public void I(@m0 f fVar) {
        H(fVar);
    }

    public void J(@m0 i iVar) {
        if (iVar.f17472h == this) {
            K(iVar.k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void K(int i10) {
        i iVar = this.P;
        int k10 = iVar != null ? iVar.k() : 0;
        L(i10);
        i remove = this.O.remove(i10);
        if (remove != null) {
            remove.q();
            F(remove);
        }
        int size = this.O.size();
        for (int i11 = i10; i11 < size; i11++) {
            this.O.get(i11).z(i11);
        }
        if (k10 == i10) {
            M(this.O.isEmpty() ? null : this.O.get(Math.max(0, i10 - 1)));
        }
    }

    public final void L(int i10) {
        TabView tabView = (TabView) this.Q.getChildAt(i10);
        this.Q.removeViewAt(i10);
        if (tabView != null) {
            tabView.s();
            this.G0.a(tabView);
        }
        requestLayout();
    }

    public void M(@o0 i iVar) {
        N(iVar, true);
    }

    public void N(@o0 i iVar, boolean z10) {
        i iVar2 = this.P;
        if (iVar2 != iVar) {
            int k10 = iVar != null ? iVar.k() : -1;
            if (z10) {
                if ((iVar2 == null || iVar2.k() == -1) && k10 != -1) {
                    P(k10, 0.0f, true);
                } else {
                    l(k10);
                }
                if (k10 != -1) {
                    setSelectedTabView(k10);
                }
            }
            this.P = iVar;
            if (iVar2 != null) {
                x(iVar2);
            }
            if (iVar != null) {
                w(iVar);
            }
        } else if (iVar2 != null) {
            v(iVar);
            l(iVar.k());
        }
    }

    public void O(@o0 n3.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        n3.a aVar2 = this.B0;
        if (!(aVar2 == null || (dataSetObserver = this.C0) == null)) {
            aVar2.u(dataSetObserver);
        }
        this.B0 = aVar;
        if (z10 && aVar != null) {
            if (this.C0 == null) {
                this.C0 = new g();
            }
            aVar.m(this.C0);
        }
        E();
    }

    public void P(int i10, float f10, boolean z10) {
        Q(i10, f10, z10, true);
    }

    public void Q(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(((float) i10) + f10);
        if (round >= 0 && round < this.Q.getChildCount()) {
            if (z11) {
                this.Q.f(i10, f10);
            }
            ValueAnimator valueAnimator = this.f17452z0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f17452z0.cancel();
            }
            scrollTo(o(i10, f10), 0);
            if (z10) {
                setSelectedTabView(round);
            }
        }
    }

    public void R(int i10, int i11) {
        setTabTextColors(r(i10, i11));
    }

    public void S(@o0 ViewPager viewPager, boolean z10) {
        T(viewPager, z10, false);
    }

    public final void T(@o0 ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.A0;
        if (viewPager2 != null) {
            m mVar = this.D0;
            if (mVar != null) {
                viewPager2.O(mVar);
            }
            b bVar = this.E0;
            if (bVar != null) {
                this.A0.N(bVar);
            }
        }
        c cVar = this.f17451y0;
        if (cVar != null) {
            H(cVar);
            this.f17451y0 = null;
        }
        if (viewPager != null) {
            this.A0 = viewPager;
            if (this.D0 == null) {
                this.D0 = new m(this);
            }
            this.D0.b();
            viewPager.c(this.D0);
            n nVar = new n(viewPager);
            this.f17451y0 = nVar;
            c(nVar);
            n3.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                O(adapter, z10);
            }
            if (this.E0 == null) {
                this.E0 = new b();
            }
            this.E0.a(z10);
            viewPager.b(this.E0);
            P(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.A0 = null;
            O((n3.a) null, false);
        }
        this.F0 = z11;
    }

    public final void U() {
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.O.get(i10).E();
        }
    }

    public final void V(@m0 LinearLayout.LayoutParams layoutParams) {
        float f10;
        if (this.f17443q0 == 1 && this.f17440n0 == 0) {
            layoutParams.width = 0;
            f10 = 1.0f;
        } else {
            layoutParams.width = -2;
            f10 = 0.0f;
        }
        layoutParams.weight = f10;
    }

    public void W(boolean z10) {
        for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
            View childAt = this.Q.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            V((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        k(view);
    }

    public void addView(View view, int i10) {
        k(view);
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k(view);
    }

    @Deprecated
    public void c(@o0 c cVar) {
        if (!this.f17450x0.contains(cVar)) {
            this.f17450x0.add(cVar);
        }
    }

    public void d(@m0 f fVar) {
        c(fVar);
    }

    public void e(@m0 i iVar) {
        h(iVar, this.O.isEmpty());
    }

    public void f(@m0 i iVar, int i10) {
        g(iVar, i10, this.O.isEmpty());
    }

    public void g(@m0 i iVar, int i10, boolean z10) {
        if (iVar.f17472h == this) {
            q(iVar, i10);
            j(iVar);
            if (z10) {
                iVar.r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        i iVar = this.P;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.O.size();
    }

    public int getTabGravity() {
        return this.f17440n0;
    }

    @o0
    public ColorStateList getTabIconTint() {
        return this.f17427a0;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f17446t0;
    }

    public int getTabIndicatorGravity() {
        return this.f17442p0;
    }

    public int getTabMaxWidth() {
        return this.f17435i0;
    }

    public int getTabMode() {
        return this.f17443q0;
    }

    @o0
    public ColorStateList getTabRippleColor() {
        return this.f17428b0;
    }

    @m0
    public Drawable getTabSelectedIndicator() {
        return this.f17429c0;
    }

    @o0
    public ColorStateList getTabTextColors() {
        return this.W;
    }

    public void h(@m0 i iVar, boolean z10) {
        g(iVar, this.O.size(), z10);
    }

    public final void i(@m0 TabItem tabItem) {
        i D = D();
        CharSequence charSequence = tabItem.O;
        if (charSequence != null) {
            D.D(charSequence);
        }
        Drawable drawable = tabItem.P;
        if (drawable != null) {
            D.x(drawable);
        }
        int i10 = tabItem.Q;
        if (i10 != 0) {
            D.u(i10);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            D.t(tabItem.getContentDescription());
        }
        e(D);
    }

    public final void j(@m0 i iVar) {
        TabView tabView = iVar.f17473i;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.Q.addView(tabView, iVar.k(), s());
    }

    public final void k(View view) {
        if (view instanceof TabItem) {
            i((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void l(int i10) {
        if (i10 != -1) {
            if (getWindowToken() == null || !w1.T0(this) || this.Q.c()) {
                P(i10, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int o10 = o(i10, 0.0f);
            if (scrollX != o10) {
                y();
                this.f17452z0.setIntValues(new int[]{scrollX, o10});
                this.f17452z0.start();
            }
            this.Q.b(i10, this.f17441o0);
        }
    }

    public final void m(int i10) {
        h hVar;
        int i11;
        if (i10 != 0) {
            i11 = 1;
            if (i10 == 1) {
                hVar = this.Q;
                hVar.setGravity(i11);
            } else if (i10 != 2) {
                return;
            }
        }
        hVar = this.Q;
        i11 = f1.j.f7185b;
        hVar.setGravity(i11);
    }

    public final void n() {
        int i10 = this.f17443q0;
        w1.b2(this.Q, (i10 == 0 || i10 == 2) ? Math.max(0, this.f17439m0 - this.R) : 0, 0, 0, 0);
        int i11 = this.f17443q0;
        if (i11 == 0) {
            m(this.f17440n0);
        } else if (i11 == 1 || i11 == 2) {
            this.Q.setGravity(1);
        }
        W(true);
    }

    public final int o(int i10, float f10) {
        int i11 = this.f17443q0;
        int i12 = 0;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        View childAt = this.Q.getChildAt(i10);
        int i13 = i10 + 1;
        View childAt2 = i13 < this.Q.getChildCount() ? this.Q.getChildAt(i13) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i12 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i14 = (int) (((float) (width + i12)) * 0.5f * f10);
        return w1.X(this) == 0 ? left + i14 : left - i14;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z9.k.e(this);
        if (this.A0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                T((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.F0) {
            setupWithViewPager((ViewPager) null);
            this.F0 = false;
        }
    }

    public void onDraw(@m0 Canvas canvas) {
        for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
            View childAt = this.Q.getChildAt(i10);
            if (childAt instanceof TabView) {
                ((TabView) childAt).m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        z.V1(accessibilityNodeInfo).W0(z.b.f(1, getTabCount(), false, 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.v.e(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f17437k0
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.v.e(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f17435i0 = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f17443q0
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public void p() {
        this.f17450x0.clear();
    }

    public final void q(@m0 i iVar, int i10) {
        iVar.z(i10);
        this.O.add(i10, iVar);
        int size = this.O.size();
        while (true) {
            i10++;
            if (i10 < size) {
                this.O.get(i10).z(i10);
            } else {
                return;
            }
        }
    }

    @m0
    public final LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        V(layoutParams);
        return layoutParams;
    }

    @d.t0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        z9.k.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.f17444r0 != z10) {
            this.f17444r0 = z10;
            for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
                View childAt = this.Q.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).z();
                }
            }
            n();
        }
    }

    public void setInlineLabelResource(@d.h int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(@o0 c cVar) {
        c cVar2 = this.f17449w0;
        if (cVar2 != null) {
            H(cVar2);
        }
        this.f17449w0 = cVar;
        if (cVar != null) {
            c(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@o0 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.f17452z0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@u int i10) {
        setSelectedTabIndicator(i10 != 0 ? g.a.d(getContext(), i10) : null);
    }

    public void setSelectedTabIndicator(@o0 Drawable drawable) {
        if (this.f17429c0 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f17429c0 = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(@d.l int i10) {
        this.f17430d0 = i10;
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.f17442p0 != i10) {
            this.f17442p0 = i10;
            w1.l1(this.Q);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.Q.g(i10);
    }

    public void setTabGravity(int i10) {
        if (this.f17440n0 != i10) {
            this.f17440n0 = i10;
            n();
        }
    }

    public void setTabIconTint(@o0 ColorStateList colorStateList) {
        if (this.f17427a0 != colorStateList) {
            this.f17427a0 = colorStateList;
            U();
        }
    }

    public void setTabIconTintResource(@d.n int i10) {
        setTabIconTint(g.a.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        a aVar;
        this.f17446t0 = i10;
        if (i10 == 0) {
            aVar = new a();
        } else if (i10 == 1) {
            aVar = new ba.a();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
        this.f17448v0 = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.f17445s0 = z10;
        w1.l1(this.Q);
    }

    public void setTabMode(int i10) {
        if (i10 != this.f17443q0) {
            this.f17443q0 = i10;
            n();
        }
    }

    public void setTabRippleColor(@o0 ColorStateList colorStateList) {
        if (this.f17428b0 != colorStateList) {
            this.f17428b0 = colorStateList;
            for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
                View childAt = this.Q.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@d.n int i10) {
        setTabRippleColor(g.a.c(getContext(), i10));
    }

    public void setTabTextColors(@o0 ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            U();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@o0 n3.a aVar) {
        O(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.f17447u0 != z10) {
            this.f17447u0 = z10;
            for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
                View childAt = this.Q.getChildAt(i10);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@d.h int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(@o0 ViewPager viewPager) {
        S(viewPager, true);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public i t() {
        i b10 = P0.b();
        return b10 == null ? new i() : b10;
    }

    @m0
    public final TabView u(@m0 i iVar) {
        m.a<TabView> aVar = this.G0;
        TabView b10 = aVar != null ? aVar.b() : null;
        if (b10 == null) {
            b10 = new TabView(getContext());
        }
        b10.setTab(iVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        b10.setContentDescription(TextUtils.isEmpty(iVar.f17468d) ? iVar.f17467c : iVar.f17468d);
        return b10;
    }

    public final void v(@m0 i iVar) {
        for (int size = this.f17450x0.size() - 1; size >= 0; size--) {
            this.f17450x0.get(size).a(iVar);
        }
    }

    public final void w(@m0 i iVar) {
        for (int size = this.f17450x0.size() - 1; size >= 0; size--) {
            this.f17450x0.get(size).b(iVar);
        }
    }

    public final void x(@m0 i iVar) {
        for (int size = this.f17450x0.size() - 1; size >= 0; size--) {
            this.f17450x0.get(size).c(iVar);
        }
    }

    public final void y() {
        if (this.f17452z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17452z0 = valueAnimator;
            valueAnimator.setInterpolator(j9.a.f19829b);
            this.f17452z0.setDuration((long) this.f17441o0);
            this.f17452z0.addUpdateListener(new a());
        }
    }

    @o0
    public i z(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return this.O.get(i10);
    }
}
