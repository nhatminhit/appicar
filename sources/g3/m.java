package g3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import d.m0;
import g3.d0;

public class m extends s1 {
    public static final TimeInterpolator S0 = new DecelerateInterpolator();
    public static final TimeInterpolator T0 = new AccelerateInterpolator();
    public static final String U0 = "android:explode:screenBounds";
    public int[] R0 = new int[2];

    public m() {
        C0(new l());
    }

    public m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0(new l());
    }

    private void H0(r0 r0Var) {
        View view = r0Var.f7848b;
        view.getLocationOnScreen(this.R0);
        int[] iArr = this.R0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        r0Var.f7847a.put(U0, new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    public static float Q0(float f10, float f11) {
        return (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
    }

    public static float R0(View view, int i10, int i11) {
        return Q0((float) Math.max(i10, view.getWidth() - i10), (float) Math.max(i11, view.getHeight() - i11));
    }

    public Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) r0Var2.f7847a.get(U0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        S0(viewGroup, rect, this.R0);
        int[] iArr = this.R0;
        return t0.a(view, r0Var2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, S0, this);
    }

    public Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        float f10;
        float f11;
        if (r0Var == null) {
            return null;
        }
        Rect rect = (Rect) r0Var.f7847a.get(U0);
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) r0Var.f7848b.getTag(d0.e.transition_position);
        if (iArr != null) {
            int i12 = iArr[0];
            f11 = ((float) (i12 - rect.left)) + translationX;
            int i13 = iArr[1];
            f10 = ((float) (i13 - rect.top)) + translationY;
            rect.offsetTo(i12, i13);
        } else {
            f11 = translationX;
            f10 = translationY;
        }
        S0(viewGroup, rect, this.R0);
        int[] iArr2 = this.R0;
        return t0.a(view, r0Var, i10, i11, translationX, translationY, f11 + ((float) iArr2[0]), f10 + ((float) iArr2[1]), T0, this);
    }

    public final void S0(View view, Rect rect, int[] iArr) {
        int i10;
        int i11;
        View view2 = view;
        view2.getLocationOnScreen(this.R0);
        int[] iArr2 = this.R0;
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        Rect N = N();
        if (N == null) {
            i11 = (view.getWidth() / 2) + i12 + Math.round(view.getTranslationX());
            i10 = (view.getHeight() / 2) + i13 + Math.round(view.getTranslationY());
        } else {
            int centerX = N.centerX();
            i10 = N.centerY();
            i11 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i11);
        float centerY = (float) (rect.centerY() - i10);
        if (centerX2 == 0.0f && centerY == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float Q0 = Q0(centerX2, centerY);
        float R02 = R0(view2, i11 - i12, i10 - i13);
        iArr[0] = Math.round((centerX2 / Q0) * R02);
        iArr[1] = Math.round(R02 * (centerY / Q0));
    }

    public void q(@m0 r0 r0Var) {
        super.q(r0Var);
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        super.t(r0Var);
        H0(r0Var);
    }
}
