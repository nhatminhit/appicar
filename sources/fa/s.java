package fa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;

@t0(21)
public final class s implements w {

    /* renamed from: a  reason: collision with root package name */
    public float f18831a;

    /* renamed from: b  reason: collision with root package name */
    public float f18832b;

    /* renamed from: c  reason: collision with root package name */
    public float f18833c;

    /* renamed from: d  reason: collision with root package name */
    public float f18834d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18835e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18836f;

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18837a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18838b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18839c;

        public a(View view, float f10, float f11) {
            this.f18837a = view;
            this.f18838b = f10;
            this.f18839c = f11;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18837a.setScaleX(this.f18838b);
            this.f18837a.setScaleY(this.f18839c);
        }
    }

    public s() {
        this(true);
    }

    public s(boolean z10) {
        this.f18831a = 1.0f;
        this.f18832b = 1.1f;
        this.f18833c = 0.8f;
        this.f18834d = 1.0f;
        this.f18836f = true;
        this.f18835e = z10;
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
        if (this.f18835e) {
            f10 = this.f18833c;
            f11 = this.f18834d;
        } else {
            f10 = this.f18832b;
            f11 = this.f18831a;
        }
        return c(view, f10, f11);
    }

    @o0
    public Animator b(@m0 ViewGroup viewGroup, @m0 View view) {
        float f10;
        float f11;
        if (!this.f18836f) {
            return null;
        }
        if (this.f18835e) {
            f10 = this.f18831a;
            f11 = this.f18832b;
        } else {
            f10 = this.f18834d;
            f11 = this.f18833c;
        }
        return c(view, f10, f11);
    }

    public float d() {
        return this.f18834d;
    }

    public float e() {
        return this.f18833c;
    }

    public float f() {
        return this.f18832b;
    }

    public float g() {
        return this.f18831a;
    }

    public boolean h() {
        return this.f18835e;
    }

    public boolean i() {
        return this.f18836f;
    }

    public void j(boolean z10) {
        this.f18835e = z10;
    }

    public void k(float f10) {
        this.f18834d = f10;
    }

    public void l(float f10) {
        this.f18833c = f10;
    }

    public void m(float f10) {
        this.f18832b = f10;
    }

    public void n(float f10) {
        this.f18831a = f10;
    }

    public void o(boolean z10) {
        this.f18836f = z10;
    }
}
