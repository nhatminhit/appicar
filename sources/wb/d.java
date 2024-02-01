package wb;

import qa.t;

public final class d extends t {

    /* renamed from: c  reason: collision with root package name */
    public final float f24012c;

    /* renamed from: d  reason: collision with root package name */
    public final int f24013d;

    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    public d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f24012c = f12;
        this.f24013d = i10;
    }

    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f24012c);
        return abs <= 1.0f || abs <= this.f24012c;
    }

    public d g(float f10, float f11, float f12) {
        int i10 = this.f24013d;
        int i11 = i10 + 1;
        float c10 = (((float) i10) * c()) + f11;
        float f13 = (float) i11;
        return new d(c10 / f13, ((((float) this.f24013d) * d()) + f10) / f13, ((((float) this.f24013d) * this.f24012c) + f12) / f13, i11);
    }

    public int h() {
        return this.f24013d;
    }

    public float i() {
        return this.f24012c;
    }
}
