package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import d.m0;
import d.o0;
import j9.h;
import java.util.List;

public interface b {
    void a();

    h b();

    @d.b
    int c();

    void d();

    @o0
    h e();

    boolean f();

    void g(@m0 Animator.AnimatorListener animatorListener);

    List<Animator.AnimatorListener> getListeners();

    void h(@m0 Animator.AnimatorListener animatorListener);

    void i(@o0 h hVar);

    void j();

    AnimatorSet k();

    void l(@o0 ExtendedFloatingActionButton.j jVar);

    void onAnimationStart(Animator animator);
}
