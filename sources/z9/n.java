package z9;

import d.m0;

public class n extends e {

    /* renamed from: a  reason: collision with root package name */
    public float f24927a;

    public n() {
        this.f24927a = -1.0f;
    }

    @Deprecated
    public n(float f10) {
        this.f24927a = f10;
    }

    public void b(@m0 q qVar, float f10, float f11, float f12) {
        qVar.q(0.0f, f12 * f11, 180.0f, 180.0f - f10);
        float f13 = f12 * 2.0f * f11;
        qVar.a(0.0f, 0.0f, f13, f13, 180.0f, f10);
    }
}
