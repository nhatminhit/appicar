package androidx.appcompat.widget;

public class o0 {

    /* renamed from: i  reason: collision with root package name */
    public static final int f1377i = Integer.MIN_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public int f1378a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1379b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1380c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1381d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1382e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1383f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1384g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1385h = false;

    public int a() {
        return this.f1384g ? this.f1378a : this.f1379b;
    }

    public int b() {
        return this.f1378a;
    }

    public int c() {
        return this.f1379b;
    }

    public int d() {
        return this.f1384g ? this.f1379b : this.f1378a;
    }

    public void e(int i10, int i11) {
        this.f1385h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1382e = i10;
            this.f1378a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1383f = i11;
            this.f1379b = i11;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1384g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1384g = r2
            boolean r0 = r1.f1385h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1381d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1382e
        L_0x0016:
            r1.f1378a = r2
            int r2 = r1.f1380c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1380c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1382e
        L_0x0024:
            r1.f1378a = r2
            int r2 = r1.f1381d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1382e
            r1.f1378a = r2
        L_0x002f:
            int r2 = r1.f1383f
        L_0x0031:
            r1.f1379b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0.f(boolean):void");
    }

    public void g(int i10, int i11) {
        this.f1380c = i10;
        this.f1381d = i11;
        this.f1385h = true;
        if (this.f1384g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1378a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1379b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1378a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1379b = i11;
        }
    }
}
