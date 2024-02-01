package f5;

public final class c extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final c f7393d = new c("", 0, 0);

    /* renamed from: c  reason: collision with root package name */
    public final int f7394c;

    public c(String str, int i10, int i11) {
        super(str, i10);
        this.f7394c = i11;
    }

    public static c f() {
        return f7393d;
    }

    public boolean a(int i10) {
        return i10 == this.f7394c;
    }

    public boolean b(int i10, int i11) {
        return i10 == this.f7394c && i11 == 0;
    }

    public boolean c(int i10, int i11, int i12) {
        return false;
    }

    public boolean d(int[] iArr, int i10) {
        return i10 == 1 && iArr[0] == this.f7394c;
    }
}
