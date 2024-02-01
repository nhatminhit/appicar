package n0;

import android.graphics.Matrix;
import fh.g;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\b\u001a\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u001a\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005\u001a\"\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Landroid/graphics/Matrix;", "m", "e", "", "h", "", "tx", "ty", "f", "sx", "sy", "c", "degrees", "px", "py", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class i0 {
    @g
    public static final Matrix a(float f10, float f11, float f12) {
        Matrix matrix = new Matrix();
        matrix.setRotate(f10, f11, f12);
        return matrix;
    }

    public static /* synthetic */ Matrix b(float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return a(f10, f11, f12);
    }

    @g
    public static final Matrix c(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setScale(f10, f11);
        return matrix;
    }

    public static /* synthetic */ Matrix d(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        return c(f10, f11);
    }

    @g
    public static final Matrix e(@g Matrix matrix, @g Matrix matrix2) {
        l0.p(matrix, "<this>");
        l0.p(matrix2, "m");
        Matrix matrix3 = new Matrix(matrix);
        matrix3.preConcat(matrix2);
        return matrix3;
    }

    @g
    public static final Matrix f(float f10, float f11) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        return matrix;
    }

    public static /* synthetic */ Matrix g(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        return f(f10, f11);
    }

    @g
    public static final float[] h(@g Matrix matrix) {
        l0.p(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }
}
