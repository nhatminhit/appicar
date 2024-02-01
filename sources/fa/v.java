package fa;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewParent;
import d.b0;
import d.l;
import d.m0;
import d.o0;
import d.t0;
import z9.m;
import z9.o;

@t0(21)
public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f18847a = new RectF();

    public static class a implements o.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RectF f18848a;

        public a(RectF rectF) {
            this.f18848a = rectF;
        }

        @m0
        public z9.d a(@m0 z9.d dVar) {
            return dVar instanceof m ? dVar : new m(dVar.a(this.f18848a) / this.f18848a.height());
        }
    }

    public static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RectF f18849a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RectF f18850b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f18851c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f18852d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f18853e;

        public b(RectF rectF, RectF rectF2, float f10, float f11, float f12) {
            this.f18849a = rectF;
            this.f18850b = rectF2;
            this.f18851c = f10;
            this.f18852d = f11;
            this.f18853e = f12;
        }

        @m0
        public z9.d a(@m0 z9.d dVar, @m0 z9.d dVar2) {
            return new z9.a(v.l(dVar.a(this.f18849a), dVar2.a(this.f18850b), this.f18851c, this.f18852d, this.f18853e));
        }
    }

    public interface c {
        void a(Canvas canvas);
    }

    public interface d {
        @m0
        z9.d a(@m0 z9.d dVar, @m0 z9.d dVar2);
    }

    public static float a(@m0 RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static o b(o oVar, RectF rectF) {
        return oVar.y(new a(rectF));
    }

    public static Shader c(@l int i10) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i10, i10, Shader.TileMode.CLAMP);
    }

    @m0
    public static <T> T d(@o0 T t10, @m0 T t11) {
        return t10 != null ? t10 : t11;
    }

    public static View e(View view, @b0 int i10) {
        String resourceName = view.getResources().getResourceName(i10);
        while (view != null) {
            if (view.getId() != i10) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View f(View view, @b0 int i10) {
        View findViewById = view.findViewById(i10);
        return findViewById != null ? findViewById : e(view, i10);
    }

    public static RectF g(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return new RectF((float) i10, (float) i11, (float) (view.getWidth() + i10), (float) (view.getHeight() + i11));
    }

    public static RectF h(View view) {
        return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
    }

    public static Rect i(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean j(o oVar, RectF rectF) {
        return (oVar.r().a(rectF) == 0.0f && oVar.t().a(rectF) == 0.0f && oVar.l().a(rectF) == 0.0f && oVar.j().a(rectF) == 0.0f) ? false : true;
    }

    public static float k(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    public static float l(float f10, float f11, @d.v(from = 0.0d, to = 1.0d) float f12, @d.v(from = 0.0d, to = 1.0d) float f13, @d.v(from = 0.0d, to = 1.0d) float f14) {
        return m(f10, f11, f12, f13, f14, false);
    }

    public static float m(float f10, float f11, @d.v(from = 0.0d, to = 1.0d) float f12, @d.v(from = 0.0d, to = 1.0d) float f13, @d.v(from = 0.0d) float f14, boolean z10) {
        return (!z10 || (f14 >= 0.0f && f14 <= 1.0f)) ? f14 < f12 ? f10 : f14 > f13 ? f11 : k(f10, f11, (f14 - f12) / (f13 - f12)) : k(f10, f11, f14);
    }

    public static int n(int i10, int i11, @d.v(from = 0.0d, to = 1.0d) float f10, @d.v(from = 0.0d, to = 1.0d) float f11, @d.v(from = 0.0d, to = 1.0d) float f12) {
        return f12 < f10 ? i10 : f12 > f11 ? i11 : (int) k((float) i10, (float) i11, (f12 - f10) / (f11 - f10));
    }

    public static o o(o oVar, o oVar2, RectF rectF, RectF rectF2, @d.v(from = 0.0d, to = 1.0d) float f10, @d.v(from = 0.0d, to = 1.0d) float f11, @d.v(from = 0.0d, to = 1.0d) float f12) {
        return f12 < f10 ? oVar : f12 > f11 ? oVar2 : t(oVar, oVar2, rectF, new b(rectF, rectF2, f10, f11, f12));
    }

    public static void p(TransitionSet transitionSet, @o0 Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static void q(TransitionSet transitionSet, @o0 Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    public static int r(Canvas canvas, Rect rect, int i10) {
        RectF rectF = f18847a;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i10);
    }

    public static void s(Canvas canvas, Rect rect, float f10, float f11, float f12, int i10, c cVar) {
        if (i10 > 0) {
            int save = canvas.save();
            canvas.translate(f10, f11);
            canvas.scale(f12, f12);
            if (i10 < 255) {
                r(canvas, rect, i10);
            }
            cVar.a(canvas);
            canvas.restoreToCount(save);
        }
    }

    public static o t(o oVar, o oVar2, RectF rectF, d dVar) {
        return (j(oVar, rectF) ? oVar : oVar2).v().L(dVar.a(oVar.r(), oVar2.r())).Q(dVar.a(oVar.t(), oVar2.t())).y(dVar.a(oVar.j(), oVar2.j())).D(dVar.a(oVar.l(), oVar2.l())).m();
    }
}
