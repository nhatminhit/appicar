package u;

import v.q;

public class h extends q {

    /* renamed from: a  reason: collision with root package name */
    public float f13342a;

    /* renamed from: b  reason: collision with root package name */
    public float f13343b;

    /* renamed from: c  reason: collision with root package name */
    public float f13344c;

    /* renamed from: d  reason: collision with root package name */
    public float f13345d;

    /* renamed from: e  reason: collision with root package name */
    public float f13346e;

    /* renamed from: f  reason: collision with root package name */
    public float f13347f;

    /* renamed from: g  reason: collision with root package name */
    public float f13348g;

    /* renamed from: h  reason: collision with root package name */
    public float f13349h;

    /* renamed from: i  reason: collision with root package name */
    public float f13350i;

    /* renamed from: j  reason: collision with root package name */
    public int f13351j;

    /* renamed from: k  reason: collision with root package name */
    public String f13352k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13353l = false;

    /* renamed from: m  reason: collision with root package name */
    public float f13354m;

    /* renamed from: n  reason: collision with root package name */
    public float f13355n;

    public float a() {
        return this.f13353l ? -e(this.f13355n) : e(this.f13355n);
    }

    public final float b(float f10) {
        float f11 = this.f13345d;
        if (f10 <= f11) {
            float f12 = this.f13342a;
            return (f12 * f10) + ((((this.f13343b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f13351j;
        if (i10 == 1) {
            return this.f13348g;
        }
        float f13 = f10 - f11;
        float f14 = this.f13346e;
        if (f13 < f14) {
            float f15 = this.f13348g;
            float f16 = this.f13343b;
            return f15 + (f16 * f13) + ((((this.f13344c - f16) * f13) * f13) / (f14 * 2.0f));
        } else if (i10 == 2) {
            return this.f13349h;
        } else {
            float f17 = f13 - f14;
            float f18 = this.f13347f;
            if (f17 >= f18) {
                return this.f13350i;
            }
            float f19 = this.f13349h;
            float f20 = this.f13344c;
            return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
        }
    }

    public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        h hVar;
        this.f13354m = f10;
        boolean z10 = f10 > f11;
        this.f13353l = z10;
        if (z10) {
            f17 = -f12;
            f16 = f10 - f11;
            hVar = this;
        } else {
            f16 = f11 - f10;
            hVar = this;
            f17 = f12;
        }
        hVar.f(f17, f16, f14, f15, f13);
    }

    public void d(String str, String str2, float f10) {
        StringBuilder sb2;
        String str3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(" ===== ");
        sb3.append(this.f13352k);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(this.f13353l ? "backwards" : "forward ");
        sb4.append(" time = ");
        sb4.append(f10);
        sb4.append("  stages ");
        sb4.append(this.f13351j);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(" dur ");
        sb5.append(this.f13345d);
        sb5.append(" vel ");
        sb5.append(this.f13342a);
        sb5.append(" pos ");
        sb5.append(this.f13348g);
        if (this.f13351j > 1) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str2);
            sb6.append(" dur ");
            sb6.append(this.f13346e);
            sb6.append(" vel ");
            sb6.append(this.f13343b);
            sb6.append(" pos ");
            sb6.append(this.f13349h);
        }
        if (this.f13351j > 2) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            sb7.append(" dur ");
            sb7.append(this.f13347f);
            sb7.append(" vel ");
            sb7.append(this.f13344c);
            sb7.append(" pos ");
            sb7.append(this.f13350i);
        }
        float f11 = this.f13345d;
        if (f10 <= f11) {
            sb2 = new StringBuilder();
            sb2.append(str2);
            str3 = "stage 0";
        } else {
            int i10 = this.f13351j;
            if (i10 == 1) {
                sb2 = new StringBuilder();
                sb2.append(str2);
                str3 = "end stage 0";
            } else {
                float f12 = f10 - f11;
                float f13 = this.f13346e;
                if (f12 < f13) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    str3 = " stage 1";
                } else if (i10 == 2) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    str3 = "end stage 1";
                } else if (f12 - f13 < this.f13347f) {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    str3 = " stage 2";
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str2);
                    str3 = " end stage 2";
                }
            }
        }
        sb2.append(str3);
    }

    public float e(float f10) {
        float f11 = this.f13345d;
        if (f10 <= f11) {
            float f12 = this.f13342a;
            return f12 + (((this.f13343b - f12) * f10) / f11);
        }
        int i10 = this.f13351j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f13346e;
        if (f13 < f14) {
            float f15 = this.f13343b;
            return f15 + (((this.f13344c - f15) * f13) / f14);
        } else if (i10 == 2) {
            return this.f13349h;
        } else {
            float f16 = f13 - f14;
            float f17 = this.f13347f;
            if (f16 >= f17) {
                return this.f13350i;
            }
            float f18 = this.f13344c;
            return f18 - ((f16 * f18) / f17);
        }
    }

    public final void f(float f10, float f11, float f12, float f13, float f14) {
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        this.f13342a = f10;
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12));
            if (sqrt < f13) {
                this.f13352k = "backward accelerate, decelerate";
                this.f13351j = 2;
                this.f13342a = f10;
                this.f13343b = sqrt;
                this.f13344c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.f13345d = f17;
                this.f13346e = sqrt / f12;
                this.f13348g = ((f10 + sqrt) * f17) / 2.0f;
                this.f13349h = f11;
                this.f13350i = f11;
                return;
            }
            this.f13352k = "backward accelerate cruse decelerate";
            this.f13351j = 3;
            this.f13342a = f10;
            this.f13343b = f13;
            this.f13344c = f13;
            float f18 = (f13 - f10) / f12;
            this.f13345d = f18;
            float f19 = f13 / f12;
            this.f13347f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f13346e = ((f11 - f20) - f21) / f13;
            this.f13348g = f20;
            this.f13349h = f11 - f21;
            this.f13350i = f11;
        } else if (f16 >= f11) {
            this.f13352k = "hard stop";
            this.f13351j = 1;
            this.f13342a = f10;
            this.f13343b = 0.0f;
            this.f13348g = f11;
            this.f13345d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f13352k = "cruse decelerate";
                this.f13351j = 2;
                this.f13342a = f10;
                this.f13343b = f10;
                this.f13344c = 0.0f;
                this.f13348g = f22;
                this.f13349h = f11;
                this.f13345d = f23;
                this.f13346e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f12 * f11) + ((f10 * f10) / 2.0f)));
            float f24 = (sqrt2 - f10) / f12;
            this.f13345d = f24;
            float f25 = sqrt2 / f12;
            this.f13346e = f25;
            if (sqrt2 < f13) {
                this.f13352k = "accelerate decelerate";
                this.f13351j = 2;
                this.f13342a = f10;
                this.f13343b = sqrt2;
                this.f13344c = 0.0f;
                this.f13345d = f24;
                this.f13346e = f25;
                this.f13348g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f13349h = f11;
                return;
            }
            this.f13352k = "accelerate cruse decelerate";
            this.f13351j = 3;
            this.f13342a = f10;
            this.f13343b = f13;
            this.f13344c = f13;
            float f26 = (f13 - f10) / f12;
            this.f13345d = f26;
            float f27 = f13 / f12;
            this.f13347f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f13346e = ((f11 - f28) - f29) / f13;
            this.f13348g = f28;
            this.f13349h = f11 - f29;
            this.f13350i = f11;
        }
    }

    public float getInterpolation(float f10) {
        float b10 = b(f10);
        this.f13355n = f10;
        return this.f13353l ? this.f13354m - b10 : this.f13354m + b10;
    }
}
