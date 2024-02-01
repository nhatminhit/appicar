package g3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public class j extends j0 {
    public static final String K0 = "android:changeScroll:x";
    public static final String L0 = "android:changeScroll:y";
    public static final String[] M0 = {K0, L0};

    public j() {
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void H0(r0 r0Var) {
        r0Var.f7847a.put(K0, Integer.valueOf(r0Var.f7848b.getScrollX()));
        r0Var.f7847a.put(L0, Integer.valueOf(r0Var.f7848b.getScrollY()));
    }

    @o0
    public String[] a0() {
        return M0;
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
    }

    @o0
    public Animator x(@m0 ViewGroup viewGroup, @o0 r0 r0Var, @o0 r0 r0Var2) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (r0Var == null || r0Var2 == null) {
            return null;
        }
        View view = r0Var2.f7848b;
        int intValue = ((Integer) r0Var.f7847a.get(K0)).intValue();
        int intValue2 = ((Integer) r0Var2.f7847a.get(K0)).intValue();
        int intValue3 = ((Integer) r0Var.f7847a.get(L0)).intValue();
        int intValue4 = ((Integer) r0Var2.f7847a.get(L0)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return q0.c(objectAnimator, objectAnimator2);
    }
}
