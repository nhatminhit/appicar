package j9;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import d.m0;

public class f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f19837a = new Matrix();

    public f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    @m0
    /* renamed from: a */
    public Matrix get(@m0 ImageView imageView) {
        this.f19837a.set(imageView.getImageMatrix());
        return this.f19837a;
    }

    /* renamed from: b */
    public void set(@m0 ImageView imageView, @m0 Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
