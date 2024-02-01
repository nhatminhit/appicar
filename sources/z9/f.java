package z9;

import d.m0;

public class f extends e {

    /* renamed from: a  reason: collision with root package name */
    public float f24876a;

    public f() {
        this.f24876a = -1.0f;
    }

    @Deprecated
    public f(float f10) {
        this.f24876a = f10;
    }

    public void b(@m0 q qVar, float f10, float f11, float f12) {
        qVar.q(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        double d10 = (double) f12;
        double d11 = (double) f11;
        qVar.n((float) (Math.sin(Math.toRadians((double) f10)) * d10 * d11), (float) (Math.sin(Math.toRadians((double) (90.0f - f10))) * d10 * d11));
    }
}
