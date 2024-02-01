package qa;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f22167a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22168b;

    public f(int i10, int i11) {
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        this.f22167a = i10;
        this.f22168b = i11;
    }

    public int a() {
        return this.f22168b;
    }

    public int b() {
        return this.f22167a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f22167a == fVar.f22167a && this.f22168b == fVar.f22168b;
        }
    }

    public int hashCode() {
        return (this.f22167a * 32713) + this.f22168b;
    }

    public String toString() {
        return this.f22167a + "x" + this.f22168b;
    }
}
