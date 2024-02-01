package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import d.m0;
import d.o0;
import g3.d0;
import g3.j0;

public class t0 {

    public static class a extends AnimatorListenerAdapter implements j0.h {

        /* renamed from: a  reason: collision with root package name */
        public final View f7877a;

        /* renamed from: b  reason: collision with root package name */
        public final View f7878b;

        /* renamed from: c  reason: collision with root package name */
        public final int f7879c;

        /* renamed from: d  reason: collision with root package name */
        public final int f7880d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f7881e;

        /* renamed from: f  reason: collision with root package name */
        public float f7882f;

        /* renamed from: g  reason: collision with root package name */
        public float f7883g;

        /* renamed from: h  reason: collision with root package name */
        public final float f7884h;

        /* renamed from: i  reason: collision with root package name */
        public final float f7885i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f7878b = view;
            this.f7877a = view2;
            this.f7879c = i10 - Math.round(view.getTranslationX());
            this.f7880d = i11 - Math.round(view.getTranslationY());
            this.f7884h = f10;
            this.f7885i = f11;
            int i12 = d0.e.transition_position;
            int[] iArr = (int[]) view2.getTag(i12);
            this.f7881e = iArr;
            if (iArr != null) {
                view2.setTag(i12, (Object) null);
            }
        }

        public void a(@m0 j0 j0Var) {
        }

        public void b(@m0 j0 j0Var) {
        }

        public void c(@m0 j0 j0Var) {
        }

        public void d(@m0 j0 j0Var) {
        }

        public void e(@m0 j0 j0Var) {
            this.f7878b.setTranslationX(this.f7884h);
            this.f7878b.setTranslationY(this.f7885i);
            j0Var.o0(this);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f7881e == null) {
                this.f7881e = new int[2];
            }
            this.f7881e[0] = Math.round(((float) this.f7879c) + this.f7878b.getTranslationX());
            this.f7881e[1] = Math.round(((float) this.f7880d) + this.f7878b.getTranslationY());
            this.f7877a.setTag(d0.e.transition_position, this.f7881e);
        }

        public void onAnimationPause(Animator animator) {
            this.f7882f = this.f7878b.getTranslationX();
            this.f7883g = this.f7878b.getTranslationY();
            this.f7878b.setTranslationX(this.f7884h);
            this.f7878b.setTranslationY(this.f7885i);
        }

        public void onAnimationResume(Animator animator) {
            this.f7878b.setTranslationX(this.f7882f);
            this.f7878b.setTranslationY(this.f7883g);
        }
    }

    @o0
    public static Animator a(@m0 View view, @m0 r0 r0Var, int i10, int i11, float f10, float f11, float f12, float f13, @o0 TimeInterpolator timeInterpolator, @m0 j0 j0Var) {
        float f14;
        float f15;
        View view2 = view;
        r0 r0Var2 = r0Var;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) r0Var2.f7848b.getTag(d0.e.transition_position);
        if (iArr != null) {
            f14 = ((float) (iArr[0] - i10)) + translationX;
            f15 = ((float) (iArr[1] - i11)) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int round = i10 + Math.round(f14 - translationX);
        int round2 = i11 + Math.round(f15 - translationY);
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f14, f12}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f15, f13})});
        a aVar = new a(view, r0Var2.f7848b, round, round2, translationX, translationY);
        j0Var.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        a.a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
