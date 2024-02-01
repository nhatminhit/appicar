package ea;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.r0;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class s implements v {

    /* renamed from: c  reason: collision with root package name */
    public static final int f18523c = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f18524a;
    @r0

    /* renamed from: b  reason: collision with root package name */
    public int f18525b = -1;

    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18526a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18527b;

        public a(View view, float f10) {
            this.f18526a = view;
            this.f18527b = f10;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18526a.setTranslationX(this.f18527b);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f18528a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f18529b;

        public b(View view, float f10) {
            this.f18528a = view;
            this.f18529b = f10;
        }

        public void onAnimationEnd(Animator animator) {
            this.f18528a.setTranslationY(this.f18529b);
        }
    }

    @x0({x0.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public s(int i10) {
        this.f18524a = i10;
    }

    public static Animator c(View view, View view2, int i10, @r0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, ((float) i11) + translationX, translationX, translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX - ((float) i11), translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY - ((float) i11), translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, ((float) i11) + translationY, translationY, translationY);
        }
        if (i10 == 8388611) {
            return e(view2, j(view) ? ((float) i11) + translationX : translationX - ((float) i11), translationX, translationX);
        } else if (i10 == 8388613) {
            return e(view2, j(view) ? translationX - ((float) i11) : ((float) i11) + translationX, translationX, translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i10);
        }
    }

    public static Animator d(View view, View view2, int i10, @r0 int i11) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i10 == 3) {
            return e(view2, translationX, translationX - ((float) i11), translationX);
        }
        if (i10 == 5) {
            return e(view2, translationX, ((float) i11) + translationX, translationX);
        }
        if (i10 == 48) {
            return f(view2, translationY, ((float) i11) + translationY, translationY);
        }
        if (i10 == 80) {
            return f(view2, translationY, translationY - ((float) i11), translationY);
        }
        if (i10 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - ((float) i11) : ((float) i11) + translationX, translationX);
        } else if (i10 == 8388613) {
            return e(view2, translationX, j(view) ? ((float) i11) + translationX : translationX - ((float) i11), translationX);
        } else {
            throw new IllegalArgumentException("Invalid slide direction: " + i10);
        }
    }

    public static Animator e(View view, float f10, float f11, float f12) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f10, f11})});
        ofPropertyValuesHolder.addListener(new a(view, f12));
        return ofPropertyValuesHolder;
    }

    public static Animator f(View view, float f10, float f11, float f12) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f10, f11})});
        ofPropertyValuesHolder.addListener(new b(view, f12));
        return ofPropertyValuesHolder;
    }

    public static boolean j(View view) {
        return w1.X(view) == 1;
    }

    @o0
    public Animator a(@m0 ViewGroup viewGroup, @m0 View view) {
        return c(viewGroup, view, this.f18524a, h(view.getContext()));
    }

    @o0
    public Animator b(@m0 ViewGroup viewGroup, @m0 View view) {
        return d(viewGroup, view, this.f18524a, h(view.getContext()));
    }

    @r0
    public int g() {
        return this.f18525b;
    }

    public final int h(Context context) {
        int i10 = this.f18525b;
        return i10 != -1 ? i10 : context.getResources().getDimensionPixelSize(a.f.mtrl_transition_shared_axis_slide_distance);
    }

    public int i() {
        return this.f18524a;
    }

    public void k(@r0 int i10) {
        if (i10 >= 0) {
            this.f18525b = i10;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void l(int i10) {
        this.f18524a = i10;
    }
}
