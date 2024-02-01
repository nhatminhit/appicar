package k9;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.n;
import d.m0;
import d.t0;
import i9.a;
import v.e;

@t0(21)
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f20002a = {16843848};

    public static void a(@m0 View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    public static void b(@m0 View view, float f10) {
        int integer = view.getResources().getInteger(a.i.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = (long) integer;
        stateListAnimator.addState(new int[]{16842766, a.c.state_liftable, -a.c.state_lifted}, ObjectAnimator.ofFloat(view, e.f13912h, new float[]{0.0f}).setDuration(j10));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, e.f13912h, new float[]{f10}).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, e.f13912h, new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void c(@m0 View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray j10 = n.j(context, attributeSet, f20002a, i10, i11, new int[0]);
        try {
            if (j10.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, j10.getResourceId(0, 0)));
            }
        } finally {
            j10.recycle();
        }
    }
}
