package fa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;
import d.v;

@t0(21)
public final class e implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final float f18731a = 0.35f;

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18732a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18733b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18734c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f18735d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f18736e;

        public a(View view, float f10, float f11, float f12, float f13) {
            this.f18732a = view;
            this.f18733b = f10;
            this.f18734c = f11;
            this.f18735d = f12;
            this.f18736e = f13;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18732a.setAlpha(v.l(this.f18733b, this.f18734c, this.f18735d, this.f18736e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18737a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18738b;

        public b(View view, float f10) {
            this.f18737a = view;
            this.f18738b = f10;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18737a.setAlpha(this.f18738b);
        }
    }

    public static Animator c(View view, float f10, float f11, @v(from = 0.0d, to = 1.0d) float f12, @v(from = 0.0d, to = 1.0d) float f13, float f14) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new a(view, f10, f11, f12, f13));
        ofFloat.addListener(new b(view, f14));
        return ofFloat;
    }

    @o0
    public Animator a(@m0 ViewGroup viewGroup, @m0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.35f, 1.0f, alpha);
    }

    @o0
    public Animator b(@m0 ViewGroup viewGroup, @m0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 0.35f, alpha);
    }
}
