package z9;

import d.m0;

public class t extends g {
    public final float O;
    public final boolean P;

    public t(float f10, boolean z10) {
        this.O = f10;
        this.P = z10;
    }

    public void d(float f10, float f11, float f12, @m0 q qVar) {
        qVar.n(f11 - (this.O * f12), 0.0f);
        qVar.n(f11, (this.P ? this.O : -this.O) * f12);
        qVar.n(f11 + (this.O * f12), 0.0f);
        qVar.n(f10, 0.0f);
    }
}
