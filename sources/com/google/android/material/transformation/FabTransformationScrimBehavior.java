package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.m0;
import j9.b;
import j9.i;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: h  reason: collision with root package name */
    public static final long f17687h = 75;

    /* renamed from: i  reason: collision with root package name */
    public static final long f17688i = 150;

    /* renamed from: j  reason: collision with root package name */
    public static final long f17689j = 0;

    /* renamed from: k  reason: collision with root package name */
    public static final long f17690k = 150;

    /* renamed from: f  reason: collision with root package name */
    public final i f17691f = new i(75, 150);

    /* renamed from: g  reason: collision with root package name */
    public final i f17692g = new i(0, 150);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17693a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f17694b;

        public a(boolean z10, View view) {
            this.f17693a = z10;
            this.f17694b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f17693a) {
                this.f17694b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f17693a) {
                this.f17694b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean E(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 MotionEvent motionEvent) {
        return super.E(coordinatorLayout, view, motionEvent);
    }

    @m0
    public AnimatorSet M(@m0 View view, @m0 View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        N(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2));
        return animatorSet;
    }

    public final void N(@m0 View view, boolean z10, boolean z11, @m0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        i iVar = z10 ? this.f17691f : this.f17692g;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.a(objectAnimator);
        list.add(objectAnimator);
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
