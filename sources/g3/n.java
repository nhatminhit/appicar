package g3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import f1.w1;
import k0.l;

public class n extends s1 {
    public static final String R0 = "android:fade:transitionAlpha";
    public static final String S0 = "Fade";
    public static final int T0 = 1;
    public static final int U0 = 2;

    public class a extends l0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7816a;

        public a(View view) {
            this.f7816a = view;
        }

        public void e(@m0 j0 j0Var) {
            e1.h(this.f7816a, 1.0f);
            e1.a(this.f7816a);
            j0Var.o0(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f7818a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7819b = false;

        public b(View view) {
            this.f7818a = view;
        }

        public void onAnimationEnd(Animator animator) {
            e1.h(this.f7818a, 1.0f);
            if (this.f7819b) {
                this.f7818a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (w1.K0(this.f7818a) && this.f7818a.getLayerType() == 0) {
                this.f7819b = true;
                this.f7818a.setLayerType(2, (Paint) null);
            }
        }
    }

    public n() {
    }

    public n(int i10) {
        P0(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7714f);
        P0(l.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, I0()));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f7847a.get(R0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float R0(g3.r0 r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f7847a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.n.R0(g3.r0, float):float");
    }

    public Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        float f10 = 0.0f;
        float R02 = R0(r0Var, 0.0f);
        if (R02 != 1.0f) {
            f10 = R02;
        }
        return Q0(view, f10, 1.0f);
    }

    public Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        e1.e(view);
        return Q0(view, R0(r0Var, 1.0f), 0.0f);
    }

    public final Animator Q0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        e1.h(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, e1.f7664c, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    public void t(@m0 r0 r0Var) {
        super.t(r0Var);
        r0Var.f7847a.put(R0, Float.valueOf(e1.c(r0Var.f7848b)));
    }
}
