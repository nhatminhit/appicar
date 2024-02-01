package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d.m0;
import d.o0;
import d.q;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: e  reason: collision with root package name */
    public static final int f16662e = 225;

    /* renamed from: f  reason: collision with root package name */
    public static final int f16663f = 175;

    /* renamed from: g  reason: collision with root package name */
    public static final int f16664g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f16665h = 2;

    /* renamed from: a  reason: collision with root package name */
    public int f16666a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f16667b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f16668c = 0;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f16669d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f16669d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean B(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, @m0 View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void H(@m0 V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f16669d = v10.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public void I(@m0 V v10, @q int i10) {
        this.f16668c = i10;
        if (this.f16667b == 1) {
            v10.setTranslationY((float) (this.f16666a + i10));
        }
    }

    public void J(@m0 V v10) {
        if (this.f16667b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f16669d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f16667b = 1;
            H(v10, this.f16666a + this.f16668c, 175, j9.a.f19830c);
        }
    }

    public void K(@m0 V v10) {
        if (this.f16667b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f16669d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v10.clearAnimation();
            }
            this.f16667b = 2;
            H(v10, 0, 225, j9.a.f19831d);
        }
    }

    public boolean m(@m0 CoordinatorLayout coordinatorLayout, @m0 V v10, int i10) {
        this.f16666a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return super.m(coordinatorLayout, v10, i10);
    }

    public void u(CoordinatorLayout coordinatorLayout, @m0 V v10, @m0 View view, int i10, int i11, int i12, int i13, int i14, @m0 int[] iArr) {
        if (i11 > 0) {
            J(v10);
        } else if (i11 < 0) {
            K(v10);
        }
    }
}
