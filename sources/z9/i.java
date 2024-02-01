package z9;

import d.m0;

public final class i extends g {
    public final float O;

    public i(float f10) {
        this.O = f10 - 0.001f;
    }

    public boolean a() {
        return true;
    }

    public void d(float f10, float f11, float f12, @m0 q qVar) {
        float sqrt = (float) ((((double) this.O) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.O, 2.0d) - Math.pow((double) sqrt, 2.0d));
        qVar.p(f11 - sqrt, ((float) (-((((double) this.O) * Math.sqrt(2.0d)) - ((double) this.O)))) + sqrt2);
        qVar.n(f11, (float) (-((((double) this.O) * Math.sqrt(2.0d)) - ((double) this.O))));
        qVar.n(f11 + sqrt, ((float) (-((((double) this.O) * Math.sqrt(2.0d)) - ((double) this.O)))) + sqrt2);
    }
}
