package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.v;
import d.m0;
import f1.s0;
import x0.c;
import x1.a;

public class c {

    public class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Fragment f2615a;

        public a(Fragment fragment) {
            this.f2615a = fragment;
        }

        public void onCancel() {
            if (this.f2615a.z() != null) {
                View z10 = this.f2615a.z();
                this.f2615a.z0((View) null);
                z10.clearAnimation();
            }
            this.f2615a.B0((Animator) null);
        }
    }

    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2616a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Fragment f2617b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ v.g f2618c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ x0.c f2619d;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                if (b.this.f2617b.z() != null) {
                    b.this.f2617b.z0((View) null);
                    b bVar = b.this;
                    bVar.f2618c.b(bVar.f2617b, bVar.f2619d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, v.g gVar, x0.c cVar) {
            this.f2616a = viewGroup;
            this.f2617b = fragment;
            this.f2618c = gVar;
            this.f2619d = cVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2616a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    public class C0035c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2620a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2621b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f2622c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v.g f2623d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ x0.c f2624e;

        public C0035c(ViewGroup viewGroup, View view, Fragment fragment, v.g gVar, x0.c cVar) {
            this.f2620a = viewGroup;
            this.f2621b = view;
            this.f2622c = fragment;
            this.f2623d = gVar;
            this.f2624e = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2620a.endViewTransition(this.f2621b);
            Animator A = this.f2622c.A();
            this.f2622c.B0((Animator) null);
            if (A != null && this.f2620a.indexOfChild(this.f2621b) < 0) {
                this.f2623d.b(this.f2622c, this.f2624e);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2625a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2626b;

        public d(Animator animator) {
            this.f2625a = null;
            this.f2626b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f2625a = animation;
            this.f2626b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {
        public final ViewGroup O;
        public final View P;
        public boolean Q;
        public boolean R;
        public boolean S = true;

        public e(@m0 Animation animation, @m0 ViewGroup viewGroup, @m0 View view) {
            super(false);
            this.O = viewGroup;
            this.P = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, @m0 Transformation transformation) {
            this.S = true;
            if (this.Q) {
                return !this.R;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.Q = true;
                s0.a(this.O, this);
            }
            return true;
        }

        public boolean getTransformation(long j10, @m0 Transformation transformation, float f10) {
            this.S = true;
            if (this.Q) {
                return !this.R;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.Q = true;
                s0.a(this.O, this);
            }
            return true;
        }

        public void run() {
            if (this.Q || !this.S) {
                this.O.endViewTransition(this.P);
                this.R = true;
                return;
            }
            this.S = false;
            this.O.post(this);
        }
    }

    public static void a(@m0 Fragment fragment, @m0 d dVar, @m0 v.g gVar) {
        View view = fragment.f2461v0;
        ViewGroup viewGroup = fragment.f2460u0;
        viewGroup.startViewTransition(view);
        x0.c cVar = new x0.c();
        cVar.d(new a(fragment));
        gVar.a(fragment, cVar);
        if (dVar.f2625a != null) {
            e eVar = new e(dVar.f2625a, viewGroup, view);
            fragment.z0(fragment.f2461v0);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, cVar));
            fragment.f2461v0.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2626b;
        fragment.B0(animator);
        animator.addListener(new C0035c(viewGroup, view, fragment, gVar, cVar));
        animator.setTarget(fragment.f2461v0);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.K() : fragment.L() : z10 ? fragment.B() : fragment.D();
    }

    public static d c(@m0 Context context, @m0 Fragment fragment, boolean z10, boolean z11) {
        int I = fragment.I();
        int b10 = b(fragment, z10, z11);
        boolean z12 = false;
        fragment.A0(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2460u0;
        if (viewGroup != null) {
            int i10 = a.g.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                fragment.f2460u0.setTag(i10, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2460u0;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(I, z10, b10);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(I, z10, b10);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        if (b10 == 0 && I != 0) {
            b10 = d(I, z10);
        }
        if (b10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z12 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z12) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    @d.a
    public static int d(int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? a.b.fragment_open_enter : a.b.fragment_open_exit;
        }
        if (i10 == 4099) {
            return z10 ? a.b.fragment_fade_enter : a.b.fragment_fade_exit;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z10 ? a.b.fragment_close_enter : a.b.fragment_close_exit;
    }
}
