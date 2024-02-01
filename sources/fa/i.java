package fa;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;
import d.t0;

@t0(21)
public final class i extends Visibility {
    @m0
    public Animator onAppear(@m0 ViewGroup viewGroup, @m0 View view, @o0 TransitionValues transitionValues, @o0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }

    @m0
    public Animator onDisappear(@m0 ViewGroup viewGroup, @m0 View view, @o0 TransitionValues transitionValues, @o0 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(new float[]{0.0f});
    }
}
