package y7;

import android.opengl.Matrix;
import w7.i0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f15549a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f15550b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final i0<float[]> f15551c = new i0<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f15552d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    public static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f10 / length, f11 / length, f12 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public boolean c(float[] fArr, long j10) {
        float[] i10 = this.f15551c.i(j10);
        if (i10 == null) {
            return false;
        }
        b(this.f15550b, i10);
        if (!this.f15552d) {
            a(this.f15549a, this.f15550b);
            this.f15552d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f15549a, 0, this.f15550b, 0);
        return true;
    }

    public void d() {
        this.f15551c.c();
        this.f15552d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f15551c.a(j10, fArr);
    }
}
