package qa;

public final class i extends j {

    /* renamed from: c  reason: collision with root package name */
    public final j f22171c;

    public i(j jVar) {
        super(jVar.e(), jVar.b());
        this.f22171c = jVar;
    }

    public j a(int i10, int i11, int i12, int i13) {
        return new i(this.f22171c.a(i10, i11, i12, i13));
    }

    public byte[] c() {
        byte[] c10 = this.f22171c.c();
        int e10 = e() * b();
        byte[] bArr = new byte[e10];
        for (int i10 = 0; i10 < e10; i10++) {
            bArr[i10] = (byte) (255 - (c10[i10] & 255));
        }
        return bArr;
    }

    public byte[] d(int i10, byte[] bArr) {
        byte[] d10 = this.f22171c.d(i10, bArr);
        int e10 = e();
        for (int i11 = 0; i11 < e10; i11++) {
            d10[i11] = (byte) (255 - (d10[i11] & 255));
        }
        return d10;
    }

    public j f() {
        return this.f22171c;
    }

    public boolean g() {
        return this.f22171c.g();
    }

    public boolean h() {
        return this.f22171c.h();
    }

    public j i() {
        return new i(this.f22171c.i());
    }

    public j j() {
        return new i(this.f22171c.j());
    }
}
