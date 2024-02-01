package f5;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f7400a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7401b;

    public f(String str, int i10) {
        this.f7400a = str;
        this.f7401b = i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10, int i11);

    public abstract boolean c(int i10, int i11, int i12);

    public abstract boolean d(int[] iArr, int i10);

    public String e() {
        return this.f7400a;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f7401b;
    }

    public String toString() {
        return this.f7400a;
    }
}
