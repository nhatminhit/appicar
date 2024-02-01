package z;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public int f15769a;

    /* renamed from: b  reason: collision with root package name */
    public int f15770b;

    /* renamed from: c  reason: collision with root package name */
    public int f15771c;

    /* renamed from: d  reason: collision with root package name */
    public int f15772d;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r3 = r2.f15770b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f15769a
            if (r3 < r0) goto L_0x0014
            int r1 = r2.f15771c
            int r0 = r0 + r1
            if (r3 >= r0) goto L_0x0014
            int r3 = r2.f15770b
            if (r4 < r3) goto L_0x0014
            int r0 = r2.f15772d
            int r3 = r3 + r0
            if (r4 >= r3) goto L_0x0014
            r3 = 1
            goto L_0x0015
        L_0x0014:
            r3 = 0
        L_0x0015:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l.a(int, int):boolean");
    }

    public int b() {
        return (this.f15769a + this.f15771c) / 2;
    }

    public int c() {
        return (this.f15770b + this.f15772d) / 2;
    }

    public void d(int i10, int i11) {
        this.f15769a -= i10;
        this.f15770b -= i11;
        this.f15771c += i10 * 2;
        this.f15772d += i11 * 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r3.f15770b;
        r1 = r4.f15770b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(z.l r4) {
        /*
            r3 = this;
            int r0 = r3.f15769a
            int r1 = r4.f15769a
            if (r0 < r1) goto L_0x0018
            int r2 = r4.f15771c
            int r1 = r1 + r2
            if (r0 >= r1) goto L_0x0018
            int r0 = r3.f15770b
            int r1 = r4.f15770b
            if (r0 < r1) goto L_0x0018
            int r4 = r4.f15772d
            int r1 = r1 + r4
            if (r0 >= r1) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z.l.e(z.l):boolean");
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f15769a = i10;
        this.f15770b = i11;
        this.f15771c = i12;
        this.f15772d = i13;
    }
}
