package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import d.m0;

public class a {

    /* renamed from: g3.a$a  reason: collision with other inner class name */
    public interface C0133a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    public static void a(@m0 Animator animator, @m0 AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public static void b(@m0 Animator animator) {
        animator.pause();
    }

    public static void c(@m0 Animator animator) {
        animator.resume();
    }
}
