package g3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

public class a0<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    public final Property<T, PointF> f7634a;

    /* renamed from: b  reason: collision with root package name */
    public final PathMeasure f7635b;

    /* renamed from: c  reason: collision with root package name */
    public final float f7636c;

    /* renamed from: d  reason: collision with root package name */
    public final float[] f7637d = new float[2];

    /* renamed from: e  reason: collision with root package name */
    public final PointF f7638e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    public float f7639f;

    public a0(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f7634a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f7635b = pathMeasure;
        this.f7636c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t10) {
        return Float.valueOf(this.f7639f);
    }

    /* renamed from: b */
    public void set(T t10, Float f10) {
        this.f7639f = f10.floatValue();
        this.f7635b.getPosTan(this.f7636c * f10.floatValue(), this.f7637d, (float[]) null);
        PointF pointF = this.f7638e;
        float[] fArr = this.f7637d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f7634a.set(t10, pointF);
    }
}
