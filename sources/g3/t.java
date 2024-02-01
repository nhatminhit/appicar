package g3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import d.m0;
import d.o0;
import f1.w1;
import g3.d0;

@SuppressLint({"ViewConstructor"})
public class t extends ViewGroup implements q {
    public ViewGroup O;
    public View P;
    public final View Q;
    public int R;
    @o0
    public Matrix S;
    public final ViewTreeObserver.OnPreDrawListener T = new a();

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        public boolean onPreDraw() {
            View view;
            w1.l1(t.this);
            t tVar = t.this;
            ViewGroup viewGroup = tVar.O;
            if (viewGroup == null || (view = tVar.P) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            w1.l1(t.this.O);
            t tVar2 = t.this;
            tVar2.O = null;
            tVar2.P = null;
            return true;
        }
    }

    public t(View view) {
        super(view.getContext());
        this.Q = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    public static t b(View view, ViewGroup viewGroup, Matrix matrix) {
        r rVar;
        if (view.getParent() instanceof ViewGroup) {
            r b10 = r.b(viewGroup);
            t e10 = e(view);
            int i10 = 0;
            if (!(e10 == null || (rVar = (r) e10.getParent()) == b10)) {
                i10 = e10.R;
                rVar.removeView(e10);
                e10 = null;
            }
            if (e10 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    c(view, viewGroup, matrix);
                }
                e10 = new t(view);
                e10.h(matrix);
                if (b10 == null) {
                    b10 = new r(viewGroup);
                } else {
                    b10.g();
                }
                d(viewGroup, b10);
                d(viewGroup, e10);
                b10.a(e10);
                e10.R = i10;
            } else if (matrix != null) {
                e10.h(matrix);
            }
            e10.R++;
            return e10;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        e1.j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        e1.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        e1.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static t e(View view) {
        return (t) view.getTag(d0.e.ghost_view);
    }

    public static void f(View view) {
        t e10 = e(view);
        if (e10 != null) {
            int i10 = e10.R - 1;
            e10.R = i10;
            if (i10 <= 0) {
                ((r) e10.getParent()).removeView(e10);
            }
        }
    }

    public static void g(@m0 View view, @o0 t tVar) {
        view.setTag(d0.e.ghost_view, tVar);
    }

    public void a(ViewGroup viewGroup, View view) {
        this.O = viewGroup;
        this.P = view;
    }

    public void h(@m0 Matrix matrix) {
        this.S = matrix;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.Q, this);
        this.Q.getViewTreeObserver().addOnPreDrawListener(this.T);
        e1.i(this.Q, 4);
        if (this.Q.getParent() != null) {
            ((View) this.Q.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        this.Q.getViewTreeObserver().removeOnPreDrawListener(this.T);
        e1.i(this.Q, 0);
        g(this.Q, (t) null);
        if (this.Q.getParent() != null) {
            ((View) this.Q.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        f.a(canvas, true);
        canvas.setMatrix(this.S);
        e1.i(this.Q, 0);
        this.Q.invalidate();
        e1.i(this.Q, 4);
        drawChild(canvas, this.Q, getDrawingTime());
        f.a(canvas, false);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (e(this.Q) == this) {
            e1.i(this.Q, i10 == 0 ? 4 : 0);
        }
    }
}
