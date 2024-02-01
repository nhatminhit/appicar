package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.e;

public class MotionTelltales extends MockView {

    /* renamed from: j0  reason: collision with root package name */
    public static final String f1757j0 = "MotionTelltales";

    /* renamed from: c0  reason: collision with root package name */
    public Paint f1758c0 = new Paint();

    /* renamed from: d0  reason: collision with root package name */
    public MotionLayout f1759d0;

    /* renamed from: e0  reason: collision with root package name */
    public float[] f1760e0 = new float[2];

    /* renamed from: f0  reason: collision with root package name */
    public Matrix f1761f0 = new Matrix();

    /* renamed from: g0  reason: collision with root package name */
    public int f1762g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public int f1763h0 = -65281;

    /* renamed from: i0  reason: collision with root package name */
    public float f1764i0 = 0.25f;

    public MotionTelltales(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.MotionTelltales_telltales_tailColor) {
                    this.f1763h0 = obtainStyledAttributes.getColor(index, this.f1763h0);
                } else if (index == e.m.MotionTelltales_telltales_velocityMode) {
                    this.f1762g0 = obtainStyledAttributes.getInt(index, this.f1762g0);
                } else if (index == e.m.MotionTelltales_telltales_tailScale) {
                    this.f1764i0 = obtainStyledAttributes.getFloat(index, this.f1764i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1758c0.setColor(this.f1763h0);
        this.f1758c0.setStrokeWidth(5.0f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f1761f0);
        if (this.f1759d0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f1759d0 = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i10 = 0; i10 < 5; i10++) {
            float f10 = fArr[i10];
            for (int i11 = 0; i11 < 5; i11++) {
                float f11 = fArr[i11];
                this.f1759d0.w0(this, f11, f10, this.f1760e0, this.f1762g0);
                this.f1761f0.mapVectors(this.f1760e0);
                float f12 = ((float) width) * f11;
                float f13 = ((float) height) * f10;
                float[] fArr2 = this.f1760e0;
                float f14 = fArr2[0];
                float f15 = this.f1764i0;
                float f16 = f13 - (fArr2[1] * f15);
                this.f1761f0.mapVectors(fArr2);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, this.f1758c0);
            }
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.T = charSequence.toString();
        requestLayout();
    }
}
