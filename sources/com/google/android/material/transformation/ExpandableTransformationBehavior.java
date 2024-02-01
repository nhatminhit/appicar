package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import d.i;
import d.m0;
import d.o0;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @o0

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f17666e;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f17666e = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @i
    public boolean K(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f17666e;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet M = M(view, view2, z10, z12);
        this.f17666e = M;
        M.addListener(new a());
        this.f17666e.start();
        if (!z11) {
            this.f17666e.end();
        }
        return true;
    }

    @m0
    public abstract AnimatorSet M(View view, View view2, boolean z10, boolean z11);
}
