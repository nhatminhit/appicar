package mb;

import qa.t;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f21013a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f21014b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f21015c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f21013a = i10;
        this.f21014b = iArr;
        float f10 = (float) i13;
        this.f21015c = new t[]{new t((float) i11, f10), new t((float) i12, f10)};
    }

    public t[] a() {
        return this.f21015c;
    }

    public int[] b() {
        return this.f21014b;
    }

    public int c() {
        return this.f21013a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f21013a == ((c) obj).f21013a;
    }

    public int hashCode() {
        return this.f21013a;
    }
}
