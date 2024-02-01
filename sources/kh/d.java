package kh;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public int f20290a;

    /* renamed from: b  reason: collision with root package name */
    public String f20291b;

    public d(int i10, String str) {
        this.f20290a = i10;
        this.f20291b = str;
    }

    public d(int i10, String str, Object... objArr) {
        this.f20291b = String.format(str, objArr);
        this.f20290a = i10;
    }

    public String a() {
        return this.f20291b;
    }

    public int b() {
        return this.f20290a;
    }

    public String toString() {
        return this.f20290a + ": " + this.f20291b;
    }
}
