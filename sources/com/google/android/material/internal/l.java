package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.x0;
import g3.j0;
import g3.r0;
import java.util.Map;

@x0({x0.a.LIBRARY_GROUP})
public class l extends j0 {
    public static final String K0 = "android:textscale:scale";

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f17254a;

        public a(TextView textView) {
            this.f17254a = textView;
        }

        public void onAnimationUpdate(@m0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f17254a.setScaleX(floatValue);
            this.f17254a.setScaleY(floatValue);
        }
    }

    public final void H0(@m0 r0 r0Var) {
        View view = r0Var.f7848b;
        if (view instanceof TextView) {
            r0Var.f7847a.put(K0, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        if (r0Var == null || r0Var2 == null || !(r0Var.f7848b instanceof TextView)) {
            return null;
        }
        View view = r0Var2.f7848b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = r0Var.f7847a;
        Map<String, Object> map2 = r0Var2.f7847a;
        float f10 = 1.0f;
        float floatValue = map.get(K0) != null ? ((Float) map.get(K0)).floatValue() : 1.0f;
        if (map2.get(K0) != null) {
            f10 = ((Float) map2.get(K0)).floatValue();
        }
        if (floatValue == f10) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f10});
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
