package ob;

public final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String f21343b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21344c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21345d;

    public o(int i10, String str) {
        super(i10);
        this.f21343b = str;
        this.f21345d = false;
        this.f21344c = 0;
    }

    public o(int i10, String str, int i11) {
        super(i10);
        this.f21345d = true;
        this.f21344c = i11;
        this.f21343b = str;
    }

    public String b() {
        return this.f21343b;
    }

    public int c() {
        return this.f21344c;
    }

    public boolean d() {
        return this.f21345d;
    }
}
