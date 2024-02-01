package mb;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f21011a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21012b;

    public b(int i10, int i11) {
        this.f21011a = i10;
        this.f21012b = i11;
    }

    public final int a() {
        return this.f21012b;
    }

    public final int b() {
        return this.f21011a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21011a == bVar.f21011a && this.f21012b == bVar.f21012b;
    }

    public final int hashCode() {
        return this.f21011a ^ this.f21012b;
    }

    public final String toString() {
        return this.f21011a + "(" + this.f21012b + ')';
    }
}
