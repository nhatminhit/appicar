package t9;

import android.animation.Animator;
import d.o0;

public class a {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public Animator f23094a;

    public void a() {
        Animator animator = this.f23094a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f23094a = null;
    }

    public void c(Animator animator) {
        a();
        this.f23094a = animator;
    }
}
