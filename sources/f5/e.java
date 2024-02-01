package f5;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final int f7397c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7398d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7399e;

    public e(String str, int i10, int i11, int i12, int i13) {
        super(str, i10);
        this.f7397c = i11;
        this.f7398d = i12;
        this.f7399e = i13;
    }

    public boolean a(int i10) {
        return false;
    }

    public boolean b(int i10, int i11) {
        return false;
    }

    public boolean c(int i10, int i11, int i12) {
        return this.f7397c == i10 && this.f7398d == i11 && this.f7399e == i12;
    }

    public boolean d(int[] iArr, int i10) {
        return i10 == 3 && iArr[0] == this.f7397c && iArr[1] == this.f7398d && iArr[2] == this.f7399e;
    }
}
