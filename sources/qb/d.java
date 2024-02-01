package qb;

public final class d {

    /* renamed from: f  reason: collision with root package name */
    public static final int f22213f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final int f22214a;

    /* renamed from: b  reason: collision with root package name */
    public final int f22215b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22216c;

    /* renamed from: d  reason: collision with root package name */
    public final int f22217d;

    /* renamed from: e  reason: collision with root package name */
    public int f22218e = -1;

    public d(int i10, int i11, int i12, int i13) {
        this.f22214a = i10;
        this.f22215b = i11;
        this.f22216c = i12;
        this.f22217d = i13;
    }

    public int a() {
        return this.f22216c;
    }

    public int b() {
        return this.f22215b;
    }

    public int c() {
        return this.f22218e;
    }

    public int d() {
        return this.f22214a;
    }

    public int e() {
        return this.f22217d;
    }

    public int f() {
        return this.f22215b - this.f22214a;
    }

    public boolean g() {
        return h(this.f22218e);
    }

    public boolean h(int i10) {
        return i10 != -1 && this.f22216c == (i10 % 3) * 3;
    }

    public void i(int i10) {
        this.f22218e = i10;
    }

    public void j() {
        this.f22218e = ((this.f22217d / 30) * 3) + (this.f22216c / 3);
    }

    public String toString() {
        return this.f22218e + "|" + this.f22217d;
    }
}
