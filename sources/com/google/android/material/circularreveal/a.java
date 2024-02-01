package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.c;
import d.m0;

public final class a {

    /* renamed from: com.google.android.material.circularreveal.a$a  reason: collision with other inner class name */
    public static class C0276a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f16926a;

        public C0276a(c cVar) {
            this.f16926a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f16926a.b();
        }

        public void onAnimationStart(Animator animator) {
            this.f16926a.a();
        }
    }

    @m0
    public static Animator a(@m0 c cVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0278c.f16944a, c.b.f16942b, new c.e[]{new c.e(f10, f11, f12)});
        c.e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f10, (int) f11, revealInfo.f16949c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @m0
    public static Animator b(c cVar, float f10, float f11, float f12, float f13) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, c.C0278c.f16944a, c.b.f16942b, new c.e[]{new c.e(f10, f11, f12), new c.e(f10, f11, f13)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f10, (int) f11, f12, f13);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }

    @m0
    public static Animator.AnimatorListener c(@m0 c cVar) {
        return new C0276a(cVar);
    }
}
