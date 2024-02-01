package z9;

import d.m0;

public final class l extends g {
    public final g O;
    public final float P;

    public l(@m0 g gVar, float f10) {
        this.O = gVar;
        this.P = f10;
    }

    public boolean a() {
        return this.O.a();
    }

    public void d(float f10, float f11, float f12, @m0 q qVar) {
        this.O.d(f10, f11 - this.P, f12, qVar);
    }
}
