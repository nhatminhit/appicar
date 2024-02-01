package ea;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public final class r implements v {

    /* renamed from: a  reason: collision with root package name */
    public float f18514a;

    /* renamed from: b  reason: collision with root package name */
    public float f18515b;

    /* renamed from: c  reason: collision with root package name */
    public float f18516c;

    /* renamed from: d  reason: collision with root package name */
    public float f18517d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18518e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18519f;

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18520a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18521b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18522c;

        public a(View view, float f10, float f11) {
            this.f18520a = view;
            this.f18521b = f10;
            this.f18522c = f11;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18520a.setScaleX(this.f18521b);
            this.f18520a.setScaleY(this.f18522c);
        }
    }

    public r() {
        this(true);
    }

    public r(boolean z10) {
        this.f18514a = 1.0f;
        this.f18515b = 1.1f;
        this.f18516c = 0.8f;
        this.f18517d = 1.0f;
        this.f18519f = true;
        this.f18518e = z10;
    }

    public static Animator c(View view, float f10, float f11) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f10, scaleX * f11}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f10 * scaleY, f11 * scaleY})});
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @o0
    public Animator a(@m0 ViewGroup viewGroup, @m0 View view) {
        float f10;
        float f11;
        if (this.f18518e) {
            f10 = this.f18516c;
            f11 = this.f18517d;
        } else {
            f10 = this.f18515b;
            f11 = this.f18514a;
        }
        return c(view, f10, f11);
    }

    @o0
    public Animator b(@m0 ViewGroup viewGroup, @m0 View view) {
        float f10;
        float f11;
        if (!this.f18519f) {
            return null;
        }
        if (this.f18518e) {
            f10 = this.f18514a;
            f11 = this.f18515b;
        } else {
            f10 = this.f18517d;
            f11 = this.f18516c;
        }
        return c(view, f10, f11);
    }

    public float d() {
        return this.f18517d;
    }

    public float e() {
        return this.f18516c;
    }

    public float f() {
        return this.f18515b;
    }

    public float g() {
        return this.f18514a;
    }

    public boolean h() {
        return this.f18518e;
    }

    public boolean i() {
        return this.f18519f;
    }

    public void j(boolean z10) {
        this.f18518e = z10;
    }

    public void k(float f10) {
        this.f18517d = f10;
    }

    public void l(float f10) {
        this.f18516c = f10;
    }

    public void m(float f10) {
        this.f18515b = f10;
    }

    public void n(float f10) {
        this.f18514a = f10;
    }

    public void o(boolean z10) {
        this.f18519f = z10;
    }
}
