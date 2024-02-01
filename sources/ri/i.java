package ri;

import ia.a;
import ia.c;

public class i {
    @c("app_version")
    @a

    /* renamed from: a  reason: collision with root package name */
    public String f22780a;
    @c("app_link")
    @a

    /* renamed from: b  reason: collision with root package name */
    public String f22781b;
    @c("app_force_update")
    @a

    /* renamed from: c  reason: collision with root package name */
    public String f22782c;

    public String a() {
        String str = this.f22782c;
        return str == null ? "" : str;
    }

    public String b() {
        String str = this.f22781b;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.f22780a;
        return str == null ? "" : str;
    }

    public void d(String str) {
        this.f22782c = str;
    }

    public void e(String str) {
        this.f22781b = str;
    }

    public void f(String str) {
        this.f22780a = str;
    }

    public String toString() {
        return "Update{appVersion='" + this.f22780a + '\'' + ", appLink='" + this.f22781b + '\'' + ", appForceUpdate='" + this.f22782c + '\'' + '}';
    }
}
