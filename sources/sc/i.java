package sc;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public String f22917a;

    /* renamed from: b  reason: collision with root package name */
    public String f22918b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f22919c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22920d;

    public i() {
    }

    public i(String str, String str2) {
        this.f22917a = str;
        this.f22918b = str2;
    }

    public String a() {
        return this.f22918b;
    }

    public String b() {
        return this.f22917a;
    }

    public boolean c() {
        return this.f22919c;
    }

    public boolean d() {
        return this.f22920d;
    }

    public i e(boolean z10) {
        this.f22919c = z10;
        return this;
    }

    public i f(String str) {
        this.f22918b = str;
        return this;
    }

    public i g(String str) {
        this.f22917a = str;
        return this;
    }

    public i h(boolean z10) {
        this.f22920d = z10;
        return this;
    }

    public String toString() {
        return "BleDevice{name='" + this.f22917a + '\'' + ", macAddress='" + this.f22918b + '\'' + ", connected=" + this.f22919c + ", selected=" + this.f22920d + '}';
    }
}
