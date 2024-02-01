package zc;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f25110a;

    public static g d() {
        if (f25110a == null) {
            f25110a = new g();
        }
        return f25110a;
    }

    public double a(double d10) {
        double d11 = 3.6d * d10;
        if (d11 < 4.0d) {
            return 0.0d;
        }
        return d11 < 7.0d ? (double) ((float) (d10 * 0.7d)) : d10;
    }

    public float b(float f10) {
        double d10 = (double) f10;
        float f11 = (float) (3.6d * d10);
        if (f11 < 4.0f) {
            return 0.0f;
        }
        return f11 < 7.0f ? (float) (d10 * 0.7d) : f10;
    }

    public int c(int i10) {
        double d10 = (double) i10;
        int i11 = (int) (3.6d * d10);
        if (i11 < 4) {
            return 0;
        }
        return i11 < 7 ? (int) (d10 * 0.7d) : i10;
    }
}
