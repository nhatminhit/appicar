package ya;

import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f24656a;

    /* renamed from: b  reason: collision with root package name */
    public int f24657b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24658c;

    /* renamed from: d  reason: collision with root package name */
    public final List<byte[]> f24659d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24660e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f24661f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f24662g;

    /* renamed from: h  reason: collision with root package name */
    public Object f24663h;

    /* renamed from: i  reason: collision with root package name */
    public final int f24664i;

    /* renamed from: j  reason: collision with root package name */
    public final int f24665j;

    public e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public e(byte[] bArr, String str, List<byte[]> list, String str2, int i10, int i11) {
        this.f24656a = bArr;
        this.f24657b = bArr == null ? 0 : bArr.length * 8;
        this.f24658c = str;
        this.f24659d = list;
        this.f24660e = str2;
        this.f24664i = i11;
        this.f24665j = i10;
    }

    public List<byte[]> a() {
        return this.f24659d;
    }

    public String b() {
        return this.f24660e;
    }

    public Integer c() {
        return this.f24662g;
    }

    public Integer d() {
        return this.f24661f;
    }

    public int e() {
        return this.f24657b;
    }

    public Object f() {
        return this.f24663h;
    }

    public byte[] g() {
        return this.f24656a;
    }

    public int h() {
        return this.f24664i;
    }

    public int i() {
        return this.f24665j;
    }

    public String j() {
        return this.f24658c;
    }

    public boolean k() {
        return this.f24664i >= 0 && this.f24665j >= 0;
    }

    public void l(Integer num) {
        this.f24662g = num;
    }

    public void m(Integer num) {
        this.f24661f = num;
    }

    public void n(int i10) {
        this.f24657b = i10;
    }

    public void o(Object obj) {
        this.f24663h = obj;
    }
}
