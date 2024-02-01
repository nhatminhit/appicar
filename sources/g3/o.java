package g3;

import android.animation.TypeEvaluator;

public class o implements TypeEvaluator<float[]> {

    /* renamed from: a  reason: collision with root package name */
    public float[] f7821a;

    public o(float[] fArr) {
        this.f7821a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f10, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f7821a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i10 = 0; i10 < fArr3.length; i10++) {
            float f11 = fArr[i10];
            fArr3[i10] = f11 + ((fArr2[i10] - f11) * f10);
        }
        return fArr3;
    }
}
