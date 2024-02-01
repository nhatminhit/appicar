package com.google.android.material.bottomappbar;

import d.m0;
import d.v;
import d.x0;
import z9.g;
import z9.q;

public class a extends g implements Cloneable {
    public static final int T = 90;
    public static final int U = 180;
    public static final int V = 270;
    public static final int W = 180;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S = 0.0f;

    public a(float f10, float f11, float f12) {
        this.P = f10;
        this.O = f11;
        p(f12);
    }

    public void d(float f10, float f11, float f12, @m0 q qVar) {
        float f13 = f10;
        q qVar2 = qVar;
        float f14 = this.Q;
        if (f14 == 0.0f) {
            qVar2.n(f13, 0.0f);
            return;
        }
        float f15 = ((this.P * 2.0f) + f14) / 2.0f;
        float f16 = f12 * this.O;
        float f17 = f11 + this.S;
        float f18 = (this.R * f12) + ((1.0f - f12) * f15);
        if (f18 / f15 >= 1.0f) {
            qVar2.n(f13, 0.0f);
            return;
        }
        float f19 = f15 + f16;
        float f20 = f18 + f16;
        float sqrt = (float) Math.sqrt((double) ((f19 * f19) - (f20 * f20)));
        float f21 = f17 - sqrt;
        float f22 = f17 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f20)));
        float f23 = 90.0f - degrees;
        qVar2.n(f21, 0.0f);
        float f24 = f16 * 2.0f;
        float f25 = degrees;
        qVar.a(f21 - f16, 0.0f, f21 + f16, f24, 270.0f, degrees);
        qVar.a(f17 - f15, (-f15) - f18, f17 + f15, f15 - f18, 180.0f - f23, (f23 * 2.0f) - 180.0f);
        qVar.a(f22 - f16, 0.0f, f22 + f16, f24, 270.0f - f25, f25);
        qVar2.n(f13, 0.0f);
    }

    public float i() {
        return this.R;
    }

    public float j() {
        return this.P;
    }

    public float k() {
        return this.O;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public float m() {
        return this.Q;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public float n() {
        return this.S;
    }

    public void p(@v(from = 0.0d) float f10) {
        if (f10 >= 0.0f) {
            this.R = f10;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public void q(float f10) {
        this.P = f10;
    }

    public void r(float f10) {
        this.O = f10;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void s(float f10) {
        this.Q = f10;
    }

    public void t(float f10) {
        this.S = f10;
    }
}
