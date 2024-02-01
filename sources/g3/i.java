package g3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import d.m0;
import g3.q0;
import java.util.Map;

public class i extends j0 {
    public static final String K0 = "android:changeImageTransform:matrix";
    public static final String L0 = "android:changeImageTransform:bounds";
    public static final String[] M0 = {K0, L0};
    public static final TypeEvaluator<Matrix> N0 = new a();
    public static final Property<ImageView, Matrix> O0 = new b(Matrix.class, "animatedTransform");

    public static class a implements TypeEvaluator<Matrix> {
        /* renamed from: a */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    public static class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            w.a(imageView, matrix);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7708a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7708a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7708a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g3.i.c.<clinit>():void");
        }
    }

    public i() {
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Matrix I0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = (float) imageView.getWidth();
        float f10 = (float) intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = (float) imageView.getHeight();
        float f11 = (float) intrinsicHeight;
        float max = Math.max(width / f10, height / f11);
        int round = Math.round((width - (f10 * max)) / 2.0f);
        int round2 = Math.round((height - (f11 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float) round, (float) round2);
        return matrix;
    }

    @m0
    public static Matrix J0(@m0 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i10 = c.f7708a[imageView.getScaleType().ordinal()];
            if (i10 == 1) {
                return M0(imageView);
            }
            if (i10 == 2) {
                return I0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    public static Matrix M0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) imageView.getWidth()) / ((float) drawable.getIntrinsicWidth()), ((float) imageView.getHeight()) / ((float) drawable.getIntrinsicHeight()));
        return matrix;
    }

    public final void H0(r0 r0Var) {
        View view = r0Var.f7848b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map<String, Object> map = r0Var.f7847a;
                map.put(L0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                map.put(K0, J0(imageView));
            }
        }
    }

    public final ObjectAnimator K0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, O0, new q0.a(), new Matrix[]{matrix, matrix2});
    }

    @m0
    public final ObjectAnimator L0(@m0 ImageView imageView) {
        Property<ImageView, Matrix> property = O0;
        TypeEvaluator<Matrix> typeEvaluator = N0;
        Matrix matrix = x.f7895a;
        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
    }

    public String[] a0() {
        return M0;
    }

    public void q(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public void t(@m0 r0 r0Var) {
        H0(r0Var);
    }

    public Animator x(@m0 ViewGroup viewGroup, r0 r0Var, r0 r0Var2) {
        if (r0Var == null || r0Var2 == null) {
            return null;
        }
        Rect rect = (Rect) r0Var.f7847a.get(L0);
        Rect rect2 = (Rect) r0Var2.f7847a.get(L0);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) r0Var.f7847a.get(K0);
        Matrix matrix2 = (Matrix) r0Var2.f7847a.get(K0);
        boolean z10 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z10) {
            return null;
        }
        ImageView imageView = (ImageView) r0Var2.f7848b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return L0(imageView);
        }
        if (matrix == null) {
            matrix = x.f7895a;
        }
        if (matrix2 == null) {
            matrix2 = x.f7895a;
        }
        O0.set(imageView, matrix);
        return K0(imageView, matrix, matrix2);
    }
}
