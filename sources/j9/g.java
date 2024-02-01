package j9;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import d.m0;

public class g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f19838a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f19839b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f19840c = new Matrix();

    @m0
    /* renamed from: a */
    public Matrix evaluate(float f10, @m0 Matrix matrix, @m0 Matrix matrix2) {
        matrix.getValues(this.f19838a);
        matrix2.getValues(this.f19839b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f19839b;
            float f11 = fArr[i10];
            float f12 = this.f19838a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f19840c.setValues(this.f19839b);
        return this.f19840c;
    }
}
