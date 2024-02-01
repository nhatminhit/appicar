package n0;

import android.graphics.PointF;
import d.m0;
import e1.n;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final PointF f10734a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10735b;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f10736c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10737d;

    public o0(@m0 PointF pointF, float f10, @m0 PointF pointF2, float f11) {
        this.f10734a = (PointF) n.h(pointF, "start == null");
        this.f10735b = f10;
        this.f10736c = (PointF) n.h(pointF2, "end == null");
        this.f10737d = f11;
    }

    @m0
    public PointF a() {
        return this.f10736c;
    }

    public float b() {
        return this.f10737d;
    }

    @m0
    public PointF c() {
        return this.f10734a;
    }

    public float d() {
        return this.f10735b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Float.compare(this.f10735b, o0Var.f10735b) == 0 && Float.compare(this.f10737d, o0Var.f10737d) == 0 && this.f10734a.equals(o0Var.f10734a) && this.f10736c.equals(o0Var.f10736c);
    }

    public int hashCode() {
        int hashCode = this.f10734a.hashCode() * 31;
        float f10 = this.f10735b;
        int i10 = 0;
        int floatToIntBits = (((hashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f10736c.hashCode()) * 31;
        float f11 = this.f10737d;
        if (f11 != 0.0f) {
            i10 = Float.floatToIntBits(f11);
        }
        return floatToIntBits + i10;
    }

    public String toString() {
        return "PathSegment{start=" + this.f10734a + ", startFraction=" + this.f10735b + ", end=" + this.f10736c + ", endFraction=" + this.f10737d + '}';
    }
}
