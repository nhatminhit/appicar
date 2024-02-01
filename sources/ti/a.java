package ti;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f23299a;

    /* renamed from: b  reason: collision with root package name */
    public String f23300b;

    /* renamed from: c  reason: collision with root package name */
    public String f23301c;

    /* renamed from: d  reason: collision with root package name */
    public long f23302d;

    /* renamed from: e  reason: collision with root package name */
    public String f23303e;

    /* renamed from: f  reason: collision with root package name */
    public String f23304f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23305g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f23306h = false;

    public a(String str, String str2, String str3, long j10, String str4, String str5) {
        this.f23299a = str;
        this.f23300b = str2;
        this.f23301c = str3;
        this.f23302d = j10;
        this.f23303e = str4;
        this.f23304f = str5;
    }

    public String a() {
        String str = this.f23303e;
        return str == null ? "" : str;
    }

    public String b() {
        String str = this.f23300b;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.f23304f;
        return str == null ? "" : str;
    }

    public long d() {
        return this.f23302d;
    }

    public String e() {
        String str = this.f23299a;
        return str == null ? "" : str;
    }

    public String f() {
        String str = this.f23301c;
        return str == null ? "" : str;
    }

    public boolean g() {
        return this.f23306h;
    }

    public boolean h() {
        return this.f23305g;
    }

    public void i(String str) {
        this.f23303e = str;
    }

    public void j(String str) {
        this.f23300b = str;
    }

    public void k(boolean z10) {
        this.f23306h = z10;
    }

    public void l(String str) {
        this.f23304f = str;
    }

    public void m(boolean z10) {
        this.f23305g = z10;
    }

    public void n(long j10) {
        this.f23302d = j10;
    }

    public void o(String str) {
        this.f23299a = str;
    }

    public void p(String str) {
        this.f23301c = str;
    }

    public String toString() {
        return "MusicAndVideoOffline{title='" + this.f23299a + '\'' + ", path='" + this.f23300b + '\'' + ", type='" + this.f23301c + '\'' + ", time=" + this.f23302d + ", folderName='" + this.f23303e + '\'' + ", source='" + this.f23304f + '\'' + ", tgClick=" + this.f23305g + ", playing=" + this.f23306h + '}';
    }
}
