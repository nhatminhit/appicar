package ea;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.v;

public final class e implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final float f18426a = 0.35f;

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18427a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18428b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18429c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f18430d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f18431e;

        public a(View view, float f10, float f11, float f12, float f13) {
            this.f18427a = view;
            this.f18428b = f10;
            this.f18429c = f11;
            this.f18430d = f12;
            this.f18431e = f13;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18427a.setAlpha(u.l(this.f18428b, this.f18429c, this.f18430d, this.f18431e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18432a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18433b;

        public b(View view, float f10) {
            this.f18432a = view;
            this.f18433b = f10;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18432a.setAlpha(this.f18433b);
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
