package f5;

public final class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final int f7395c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7396d;

    public d(String str, int i10, int i11, int i12) {
        super(str, i10);
        this.f7395c = i11;
        this.f7396d = i12;
    }

    public boolean a(int i10) {
        return false;
    }

    public boolean b(int i10, int i11) {
        return i10 == this.f7395c && i11 == this.f7396d;
    }

    public boolean c(int i10, int i11, int i12) {
        return false;
    }

    public boolean d(int[] iArr, int i10) {
        return i10 == 2 && iArr[0] == this.f7395c && iArr[1] == this.f7396d;
    }
}
