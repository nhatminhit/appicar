package t9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.m0;
import d.o0;
import d.t0;
import e1.n;
import i9.a;
import java.util.ArrayList;
import v.e;
import x9.b;
import y9.c;
import z9.j;
import z9.o;

@t0(21)
public class d extends com.google.android.material.floatingactionbutton.a {

    public static class a extends j {
        public a(o oVar) {
            super(oVar);
        }

        public boolean isStateful() {
            return true;
        }
    }

    public d(FloatingActionButton floatingActionButton, c cVar) {
        super(floatingActionButton, cVar);
    }

    public void A() {
    }

    public void C() {
        i0();
    }

    public void E(int[] iArr) {
    }

    public void F(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.S, m0(f10, f12));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.T, m0(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.U, m0(f10, f11));
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.V, m0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f17110y, e.f13912h, new float[]{f10}).setDuration(0));
        if (i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f17110y;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f17110y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.F);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.W, animatorSet);
        stateListAnimator.addState(com.google.android.material.floatingactionbutton.a.X, m0(0.0f, 0.0f));
        this.f17110y.setStateListAnimator(stateListAnimator);
        if (c0()) {
            i0();
        }
    }

    public boolean N() {
        return false;
    }

    public void Y(@o0 ColorStateList colorStateList) {
        Drawable drawable = this.f17088c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(b.d(colorStateList));
        } else {
            super.Y(colorStateList);
        }
    }

    public boolean c0() {
        return this.f17111z.c() || !e0();
    }

    public void g0() {
    }

    @m0
    public j j() {
        return new a((o) n.g(this.f17086a));
    }

    @m0
    public c l0(int i10, ColorStateList colorStateList) {
        Context context = this.f17110y.getContext();
        c cVar = new c((o) n.g(this.f17086a));
        cVar.f(i0.d.f(context, a.e.design_fab_stroke_top_outer_color), i0.d.f(context, a.e.design_fab_stroke_top_inner_color), i0.d.f(context, a.e.design_fab_stroke_end_inner_color), i0.d.f(context, a.e.design_fab_stroke_end_outer_color));
        cVar.e((float) i10);
        cVar.d(colorStateList);
        return cVar;
    }

    @m0
    public final Animator m0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f17110y, e.f13912h, new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f17110y, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.a.F);
        return animatorSet;
    }

    public float n() {
        return this.f17110y.getElevation();
    }

    public void s(@m0 Rect rect) {
        if (this.f17111z.c()) {
            super.s(rect);
            return;
        }
        int sizeDimension = !e0() ? (this.f17096k - this.f17110y.getSizeDimension()) / 2 : 0;
        rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
    }

    public void x(ColorStateList colorStateList, @o0 PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        j j10 = j();
        this.f17087b = j10;
        j10.setTintList(colorStateList);
        if (mode != null) {
            this.f17087b.setTintMode(mode);
        }
        this.f17087b.Y(this.f17110y.getContext());
        if (i10 > 0) {
            this.f17089d = l0(i10, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) n.g(this.f17089d), (Drawable) n.g(this.f17087b)});
        } else {
            this.f17089d = null;
            drawable = this.f17087b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(b.d(colorStateList2), drawable, (Drawable) null);
        this.f17088c = rippleDrawable;
        this.f17090e = rippleDrawable;
    }
}
