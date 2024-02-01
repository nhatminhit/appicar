package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d.m0;
import d.o0;
import f1.w1;
import i9.a;
import j9.h;
import j9.i;
import j9.j;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f17668f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final RectF f17669g = new RectF();

    /* renamed from: h  reason: collision with root package name */
    public final RectF f17670h = new RectF();

    /* renamed from: i  reason: collision with root package name */
    public final int[] f17671i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public float f17672j;

    /* renamed from: k  reason: collision with root package name */
    public float f17673k;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17674a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f17675b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f17676c;

        public a(boolean z10, View view, View view2) {
            this.f17674a = z10;
            this.f17675b = view;
            this.f17676c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f17674a) {
                this.f17675b.setVisibility(4);
                this.f17676c.setAlpha(1.0f);
                this.f17676c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f17674a) {
                this.f17675b.setVisibility(0);
                this.f17676c.setAlpha(0.0f);
                this.f17676c.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f17678a;

        public b(View view) {
            this.f17678a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f17678a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f17680a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Drawable f17681b;

        public c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f17680a = cVar;
            this.f17681b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f17680a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f17680a.setCircularRevealOverlayDrawable(this.f17681b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f17683a;

        public d(com.google.android.material.circularreveal.c cVar) {
            this.f17683a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f17683a.getRevealInfo();
            revealInfo.f16949c = Float.MAX_VALUE;
            this.f17683a.setRevealInfo(revealInfo);
        }
    }

    public static class e {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public h f17685a;

        /* renamed from: b  reason: collision with root package name */
        public j f17686b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @m0
    public AnimatorSet M(@m0 View view, @m0 View view2, boolean z10, boolean z11) {
        boolean z12 = z10;
        e h02 = h0(view2.getContext(), z12);
        if (z12) {
            this.f17672j = view.getTranslationX();
            this.f17673k = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a0(view, view2, z10, z11, h02, arrayList, arrayList2);
        RectF rectF = this.f17669g;
        View view3 = view;
        View view4 = view2;
        boolean z13 = z10;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        f0(view3, view4, z13, z11, h02, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        Z(view3, view4, z13, h02, arrayList);
        boolean z14 = z11;
        e eVar = h02;
        c0(view3, view4, z13, z14, eVar, arrayList3, arrayList4);
        b0(view3, view4, z13, z14, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        Y(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        X(view3, view4, z13, z14, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        j9.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z12, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    @o0
    public final ViewGroup N(@m0 View view) {
        View findViewById = view.findViewById(a.h.mtrl_child_content_container);
        return findViewById != null ? i0(findViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? i0(((ViewGroup) view).getChildAt(0)) : i0(view);
    }

    public final void O(@m0 View view, @m0 e eVar, @m0 i iVar, @m0 i iVar2, float f10, float f11, float f12, float f13, @m0 RectF rectF) {
        float V = V(eVar, iVar, f10, f12);
        float V2 = V(eVar, iVar2, f11, f13);
        Rect rect = this.f17668f;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f17669g;
        rectF2.set(rect);
        RectF rectF3 = this.f17670h;
        W(view, rectF3);
        rectF3.offset(V, V2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void P(@m0 View view, @m0 RectF rectF) {
        W(view, rectF);
        rectF.offset(this.f17672j, this.f17673k);
    }

    @m0
    public final Pair<i, i> Q(float f10, float f11, boolean z10, @m0 e eVar) {
        String str;
        h hVar;
        i iVar;
        int i10;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVar = eVar.f17685a.h("translationXLinear");
            hVar = eVar.f17685a;
            str = "translationYLinear";
        } else if ((!z10 || f11 >= 0.0f) && (z10 || i10 <= 0)) {
            iVar = eVar.f17685a.h("translationXCurveDownwards");
            hVar = eVar.f17685a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f17685a.h("translationXCurveUpwards");
            hVar = eVar.f17685a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.h(str));
    }

    public final float R(@m0 View view, @m0 View view2, @m0 j jVar) {
        RectF rectF = this.f17669g;
        RectF rectF2 = this.f17670h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(-T(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float S(@m0 View view, @m0 View view2, @m0 j jVar) {
        RectF rectF = this.f17669g;
        RectF rectF2 = this.f17670h;
        P(view, rectF);
        W(view2, rectF2);
        rectF2.offset(0.0f, -U(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float T(@m0 View view, @m0 View view2, @m0 j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f17669g;
        RectF rectF2 = this.f17670h;
        P(view, rectF);
        W(view2, rectF2);
        int i10 = jVar.f19849a & 7;
        if (i10 == 1) {
            f12 = rectF2.centerX();
            f11 = rectF.centerX();
        } else if (i10 == 3) {
            f12 = rectF2.left;
            f11 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + jVar.f19850b;
        } else {
            f12 = rectF2.right;
            f11 = rectF.right;
        }
        f10 = f12 - f11;
        return f10 + jVar.f19850b;
    }

    public final float U(@m0 View view, @m0 View view2, @m0 j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f17669g;
        RectF rectF2 = this.f17670h;
        P(view, rectF);
        W(view2, rectF2);
        int i10 = jVar.f19849a & 112;
        if (i10 == 16) {
            f12 = rectF2.centerY();
            f11 = rectF.centerY();
        } else if (i10 == 48) {
            f12 = rectF2.top;
            f11 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + jVar.f19851c;
        } else {
            f12 = rectF2.bottom;
            f11 = rectF.bottom;
        }
        f10 = f12 - f11;
        return f10 + jVar.f19851c;
    }

    public final float V(@m0 e eVar, @m0 i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i h10 = eVar.f17685a.h("expansion");
        return j9.a.a(f10, f11, iVar.e().getInterpolation(((float) (((h10.c() + h10.d()) + 17) - c10)) / ((float) d10)));
    }

    public final void W(@m0 View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f17671i;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public final void X(View view, View view2, boolean z10, boolean z11, @m0 e eVar, @m0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup N;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof com.google.android.material.circularreveal.c) || com.google.android.material.circularreveal.b.f16931o != 0) && (N = N(view2)) != null) {
                if (z10) {
                    if (!z11) {
                        j9.d.f19834a.set(N, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(N, j9.d.f19834a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(N, j9.d.f19834a, new float[]{0.0f});
                }
                eVar.f17685a.h("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    public final void Y(@m0 View view, View view2, boolean z10, boolean z11, @m0 e eVar, @m0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int g02 = g0(view);
            int i10 = 16777215 & g02;
            if (z10) {
                if (!z11) {
                    cVar.setCircularRevealScrimColor(g02);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f16945a, new int[]{i10});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.f16945a, new int[]{g02});
            }
            objectAnimator.setEvaluator(j9.c.b());
            eVar.f17685a.h(n7.b.L).a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    public final void Z(@m0 View view, @m0 View view2, boolean z10, @m0 e eVar, @m0 List<Animator> list) {
        float T = T(view, view2, eVar.f17686b);
        float U = U(view, view2, eVar.f17686b);
        Pair<i, i> Q = Q(T, U, z10, eVar);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z10) {
            T = this.f17672j;
        }
        fArr[0] = T;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z10) {
            U = this.f17673k;
        }
        fArr2[0] = U;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.a(ofFloat);
        iVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    public final void a0(View view, @m0 View view2, boolean z10, boolean z11, @m0 e eVar, @m0 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float P = w1.P(view2) - w1.P(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-P);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-P});
        }
        eVar.f17685a.h(v.e.f13912h).a(objectAnimator);
        list.add(objectAnimator);
    }

    public final void b0(@m0 View view, View view2, boolean z10, boolean z11, @m0 e eVar, float f10, float f11, @m0 List<Animator> list, @m0 List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view4;
            float R = R(view3, view4, eVar2.f17686b);
            float S = S(view3, view4, eVar2.f17686b);
            ((FloatingActionButton) view3).k(this.f17668f);
            float width = ((float) this.f17668f.width()) / 2.0f;
            i h10 = eVar2.f17685a.h("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new c.e(R, S, width));
                }
                if (z11) {
                    width = cVar.getRevealInfo().f16949c;
                }
                animator = com.google.android.material.circularreveal.a.a(cVar, R, S, u9.a.b(R, S, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(cVar));
                e0(view2, h10.c(), (int) R, (int) S, width, list);
            } else {
                float f12 = cVar.getRevealInfo().f16949c;
                Animator a10 = com.google.android.material.circularreveal.a.a(cVar, R, S, width);
                int i10 = (int) R;
                int i11 = (int) S;
                View view5 = view2;
                e0(view5, h10.c(), i10, i11, f12, list);
                long c10 = h10.c();
                long d10 = h10.d();
                long i12 = eVar2.f17685a.i();
                d0(view5, c10, d10, i12, i10, i11, width, list);
                animator = a10;
            }
            h10.a(animator);
            list.add(animator);
            list2.add(com.google.android.material.circularreveal.a.c(cVar));
        }
    }

    public final void c0(View view, View view2, boolean z10, boolean z11, @m0 e eVar, @m0 List<Animator> list, @m0 List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, j9.e.f19835b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, j9.e.f19835b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(view2));
                eVar.f17685a.h("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(cVar, drawable));
            }
        }
    }

    public final void d0(View view, long j10, long j11, long j12, int i10, int i11, float f10, @m0 List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    public final void e0(View view, long j10, int i10, int i11, float f10, @m0 List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    @d.i
    public boolean f(@m0 CoordinatorLayout coordinatorLayout, @m0 View view, @m0 View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public final void f0(@m0 View view, @m0 View view2, boolean z10, boolean z11, @m0 e eVar, @m0 List<Animator> list, List<Animator.AnimatorListener> list2, @m0 RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z12 = z10;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float T = T(view3, view4, eVar2.f17686b);
        float U = U(view3, view4, eVar2.f17686b);
        Pair<i, i> Q = Q(T, U, z12, eVar2);
        i iVar = (i) Q.first;
        i iVar2 = (i) Q.second;
        if (z12) {
            if (!z11) {
                view4.setTranslationX(-T);
                view4.setTranslationY(-U);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            O(view2, eVar, iVar, iVar2, -T, -U, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-T});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-U});
        }
        iVar.a(objectAnimator2);
        iVar2.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    public final int g0(@m0 View view) {
        ColorStateList L = w1.L(view);
        if (L != null) {
            return L.getColorForState(view.getDrawableState(), L.getDefaultColor());
        }
        return 0;
    }

    @d.i
    public void h(@m0 CoordinatorLayout.g gVar) {
        if (gVar.f2159h == 0) {
            gVar.f2159h = 80;
        }
    }

    public abstract e h0(Context context, boolean z10);

    @o0
    public final ViewGroup i0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }
}
