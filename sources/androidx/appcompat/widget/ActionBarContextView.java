package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.s2;
import f1.w1;
import k.b;

@x0({x0.a.Q})
public class ActionBarContextView extends a {

    /* renamed from: a0  reason: collision with root package name */
    public CharSequence f1004a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f1005b0;

    /* renamed from: c0  reason: collision with root package name */
    public View f1006c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f1007d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1008e0;

    /* renamed from: f0  reason: collision with root package name */
    public LinearLayout f1009f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f1010g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1011h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1012i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f1013j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1014k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f1015l0;

    public class a implements View.OnClickListener {
        public final /* synthetic */ b O;

        public a(b bVar) {
            this.O = bVar;
        }

        public void onClick(View view) {
            this.O.c();
        }
    }

    public ActionBarContextView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.actionModeStyle);
    }

    public ActionBarContextView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w0 G = w0.G(context, attributeSet, a.n.ActionMode, i10, 0);
        w1.G1(this, G.h(a.n.ActionMode_background));
        this.f1012i0 = G.u(a.n.ActionMode_titleTextStyle, 0);
        this.f1013j0 = G.u(a.n.ActionMode_subtitleTextStyle, 0);
        this.S = G.q(a.n.ActionMode_height, 0);
        this.f1015l0 = G.u(a.n.ActionMode_closeItemLayout, a.k.abc_action_mode_close_item_material);
        G.I();
    }

    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1005b0;
    }

    public CharSequence getTitle() {
        return this.f1004a0;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public /* bridge */ /* synthetic */ s2 n(int i10, long j10) {
        return super.n(i10, j10);
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.R;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E();
            this.R.F();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1004a0);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = d1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1006c0;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1006c0.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int k10 = a.k(paddingRight, i14, b10);
            paddingRight = a.k(k10 + l(this.f1006c0, k10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f1009f0;
        if (!(linearLayout == null || this.f1008e0 != null || linearLayout.getVisibility() == 8)) {
            i16 += l(this.f1009f0, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f1008e0;
        if (view2 != null) {
            l(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.Q;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.S;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f1006c0;
            if (view != null) {
                int j10 = j(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1006c0.getLayoutParams();
                paddingLeft = j10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.Q;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = j(this.Q, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1009f0;
            if (linearLayout != null && this.f1008e0 == null) {
                if (this.f1014k0) {
                    this.f1009f0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1009f0.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1009f0.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = j(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1008e0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f1008e0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.S <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f1006c0 == null) {
            t();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(k.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1006c0
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1015l0
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1006c0 = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f1006c0
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f1006c0
            int r1 = f.a.h.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f1007d0 = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.R
            if (r0 == 0) goto L_0x0041
            r0.B()
        L_0x0041:
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.R = r0
            r1 = 1
            r0.O(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r1 = r3.R
            android.content.Context r2 = r3.P
            r4.c(r1, r2)
            androidx.appcompat.widget.ActionMenuPresenter r4 = r3.R
            androidx.appcompat.view.menu.k r4 = r4.m(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.Q = r4
            r1 = 0
            f1.w1.G1(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.Q
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.q(k.b):void");
    }

    public final void r() {
        if (this.f1009f0 == null) {
            LayoutInflater.from(getContext()).inflate(a.k.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1009f0 = linearLayout;
            this.f1010g0 = (TextView) linearLayout.findViewById(a.h.action_bar_title);
            this.f1011h0 = (TextView) this.f1009f0.findViewById(a.h.action_bar_subtitle);
            if (this.f1012i0 != 0) {
                this.f1010g0.setTextAppearance(getContext(), this.f1012i0);
            }
            if (this.f1013j0 != 0) {
                this.f1011h0.setTextAppearance(getContext(), this.f1013j0);
            }
        }
        this.f1010g0.setText(this.f1004a0);
        this.f1011h0.setText(this.f1005b0);
        boolean z10 = !TextUtils.isEmpty(this.f1004a0);
        boolean z11 = !TextUtils.isEmpty(this.f1005b0);
        int i10 = 0;
        this.f1011h0.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f1009f0;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f1009f0.getParent() == null) {
            addView(this.f1009f0);
        }
    }

    public boolean s() {
        return this.f1014k0;
    }

    public void setContentHeight(int i10) {
        this.S = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1008e0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1008e0 = view;
        if (!(view == null || (linearLayout = this.f1009f0) == null)) {
            removeView(linearLayout);
            this.f1009f0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1005b0 = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1004a0 = charSequence;
        r();
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f1014k0) {
            requestLayout();
        }
        this.f1014k0 = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f1008e0 = null;
        this.Q = null;
        this.R = null;
        View view = this.f1007d0;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }
}
