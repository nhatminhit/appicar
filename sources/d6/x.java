package d6;

import d.o0;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final int f6493c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f6494a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6495b;

    public x(int i10, float f10) {
        this.f6494a = i10;
        this.f6495b = f10;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f6494a == xVar.f6494a && Float.compare(xVar.f6495b, this.f6495b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f6494a) * 31) + Float.floatToIntBits(this.f6495b);
    }
}
