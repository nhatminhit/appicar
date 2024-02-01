package bi;

import ia.c;

public class a {
    @c("logout")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public b f16332a;
    @c("login")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public C0264a f16333b;

    /* renamed from: bi.a$a  reason: collision with other inner class name */
    public static class C0264a {
        @c("username")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public String f16334a;
        @c("password")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f16335b;
        @c("appId")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public String f16336c;
        @c("appVersion")
        @ia.a

        /* renamed from: d  reason: collision with root package name */
        public String f16337d;
        @c("deviceId")
        @ia.a

        /* renamed from: e  reason: collision with root package name */
        public String f16338e;
        @c("fcmToken")
        @ia.a

        /* renamed from: f  reason: collision with root package name */
        public String f16339f;

        public C0264a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f16334a = str;
            this.f16335b = str2;
            this.f16336c = str3;
            this.f16337d = str4;
            this.f16338e = str5;
            this.f16339f = str6;
        }

        public String a() {
            return this.f16336c;
        }

        public String b() {
            return this.f16337d;
        }

        public String c() {
            return this.f16338e;
        }

        public String d() {
            return this.f16339f;
        }

        public String e() {
            return this.f16335b;
        }

        public String f() {
            return this.f16334a;
        }

        public void g(String str) {
            this.f16336c = str;
        }

        public void h(String str) {
            this.f16337d = str;
        }

        public void i(String str) {
            this.f16338e = str;
        }

        public void j(String str) {
            this.f16339f = str;
        }

        public void k(String str) {
            this.f16335b = str;
        }

        public void l(String str) {
            this.f16334a = str;
        }

        public String toString() {
            return "Login{username='" + this.f16334a + '\'' + ", password='" + this.f16335b + '\'' + ", appId='" + this.f16336c + '\'' + ", appVersion='" + this.f16337d + '\'' + ", deviceId='" + this.f16338e + '\'' + ", fcmToken='" + this.f16339f + '\'' + '}';
        }
    }

    public static class b {
        @c("appId")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public String f16340a;
        @c("accessToken")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f16341b;

        public b(String str, String str2) {
            this.f16340a = str;
            this.f16341b = str2;
        }

        public String a() {
            return this.f16341b;
        }

        public String b() {
            return this.f16340a;
        }

        public void c(String str) {
            this.f16341b = str;
        }

        public void d(String str) {
            this.f16340a = str;
        }

        public String toString() {
            return "Logout{appId='" + this.f16340a + '\'' + ", accessToken='" + this.f16341b + '\'' + '}';
        }
    }

    public a(b bVar, C0264a aVar) {
        this.f16332a = bVar;
        this.f16333b = aVar;
    }

    public C0264a a() {
        return this.f16333b;
    }

    public b b() {
        return this.f16332a;
    }

    public void c(C0264a aVar) {
        this.f16333b = aVar;
    }

    public void d(b bVar) {
        this.f16332a = bVar;
    }

    public String toString() {
        return "LogoutAndLogin{logout=" + this.f16332a + ", login=" + this.f16333b + '}';
    }
}
