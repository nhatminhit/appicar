package ea;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.v;

public final class d implements v {

    /* renamed from: a  reason: collision with root package name */
    public float f18418a = 1.0f;

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18419a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18420b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18421c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f18422d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f18423e;

        public a(View view, float f10, float f11, float f12, float f13) {
            this.f18419a = view;
            this.f18420b = f10;
            this.f18421c = f11;
            this.f18422d = f12;
            this.f18423e = f13;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f18419a.setAlpha(u.l(this.f18420b, this.f18421c, this.f18422d, this.f18423e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18424a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18425b;

        public b(View view, float f10) {
            this.f18424a = view;
            this.f18425b = f10;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18424a.setAlpha(this.f18425b);
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
        return c(view, 0.0f, alpha, 0.0f, this.f18418a, alpha);
    }

    @o0
    public Animator b(@m0 ViewGroup viewGroup, @m0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float d() {
        return this.f18418a;
    }

    public void e(float f10) {
        this.f18418a = f10;
    }
}
