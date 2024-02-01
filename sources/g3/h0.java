package g3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import d.m0;
import d.x0;
import f1.w1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k0.l;
import org.xmlpull.v1.XmlPullParser;

public class h0 extends s1 {
    public static final TimeInterpolator T0 = new DecelerateInterpolator();
    public static final TimeInterpolator U0 = new AccelerateInterpolator();
    public static final String V0 = "android:slide:screenPosition";
    public static final g W0 = new a();
    public static final g X0 = new b();
    public static final g Y0 = new c();
    public static final g Z0 = new d();

    /* renamed from: a1  reason: collision with root package name */
    public static final g f7705a1 = new e();

    /* renamed from: b1  reason: collision with root package name */
    public static final g f7706b1 = new f();
    public g R0 = f7706b1;
    public int S0 = 80;

    public static class a extends h {
        public a() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    public static class b extends h {
        public b() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z10 = true;
            if (w1.X(viewGroup) != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z10 ? translationX + width : translationX - width;
        }
    }

    public static class c extends i {
        public c() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    public static class d extends h {
        public d() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    public static class e extends h {
        public e() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z10 = true;
            if (w1.X(viewGroup) != 1) {
                z10 = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z10 ? translationX - width : translationX + width;
        }
    }

    public static class f extends i {
        public f() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        public i() {
        }

        public /* synthetic */ i(a aVar) {
            this();
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    public h0() {
        R0(80);
    }

    public h0(int i10) {
        R0(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i0.f7716h);
        int k10 = l.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        R0(k10);
    }

    private void H0(r0 r0Var) {
        int[] iArr = new int[2];
        r0Var.f7848b.getLocationOnScreen(iArr);
        r0Var.f7847a.put(V0, iArr);
    }

    public Animator L0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) r0Var2.f7847a.get(V0);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return t0.a(view, r0Var2, iArr[0], iArr[1], this.R0.b(viewGroup, view), this.R0.a(viewGroup, view), translationX, translationY, T0, this);
    }

    public Animator N0(ViewGroup viewGroup, View view, r0 r0Var, r0 r0Var2) {
        if (r0Var == null) {
            return null;
        }
        int[] iArr = (int[]) r0Var.f7847a.get(V0);
        return t0.a(view, r0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.R0.b(viewGroup, view), this.R0.a(viewGroup, view), U0, this);
    }

    public int Q0() {
        return this.S0;
    }

    public void R0(int i10) {
        g gVar;
        if (i10 == 3) {
            gVar = W0;
        } else if (i10 == 5) {
            gVar = Z0;
        } else if (i10 == 48) {
            gVar = Y0;
        } else if (i10 == 80) {
            gVar = f7706b1;
        } else if (i10 == 8388611) {
            gVar = X0;
        } else if (i10 == 8388613) {
            gVar = f7705a1;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.R0 = gVar;
        this.S0 = i10;
        g0 g0Var = new g0();
        g0Var.k(i10);
        C0(g0Var);
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
