package b6;

import d.o0;
import w7.a;

public final class l0 {

    /* renamed from: e  reason: collision with root package name */
    public static final l0 f4401e = new l0(1.0f);

    /* renamed from: a  reason: collision with root package name */
    public final float f4402a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4403b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4404c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4405d;

    public l0(float f10) {
        this(f10, 1.0f, false);
    }

    public l0(float f10, float f11) {
        this(f10, f11, false);
    }

    public l0(float f10, float f11, boolean z10) {
        boolean z11 = true;
        a.a(f10 > 0.0f);
        a.a(f11 <= 0.0f ? false : z11);
        this.f4402a = f10;
        this.f4403b = f11;
        this.f4404c = z10;
        this.f4405d = Math.round(f10 * 1000.0f);
    }

    public long a(long j10) {
        return j10 * ((long) this.f4405d);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f4402a == l0Var.f4402a && this.f4403b == l0Var.f4403b && this.f4404c == l0Var.f4404c;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.f4402a)) * 31) + Float.floatToRawIntBits(this.f4403b)) * 31) + (this.f4404c ? 1 : 0);
    }
}
