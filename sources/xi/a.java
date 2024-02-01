package xi;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class a {
    @c("message")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public String f24585a;
    @c("data")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public List<C0490a> f24586b = null;
    @c("statusCode")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public Integer f24587c;

    /* renamed from: xi.a$a  reason: collision with other inner class name */
    public static class C0490a {
        @c("_id")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public String f24588a;
        @c("name")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f24589b;
        @c("lang")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public String f24590c;
        @c("category")
        @ia.a

        /* renamed from: d  reason: collision with root package name */
        public String f24591d;
        @c("sub_category")
        @ia.a

        /* renamed from: e  reason: collision with root package name */
        public String f24592e;
        @c("type")
        @ia.a

        /* renamed from: f  reason: collision with root package name */
        public Integer f24593f;
        @c("code")
        @ia.a

        /* renamed from: g  reason: collision with root package name */
        public String f24594g;
        @c("crawl_type")
        @ia.a

        /* renamed from: h  reason: collision with root package name */
        public String f24595h;
        @c("thumb")
        @ia.a

        /* renamed from: i  reason: collision with root package name */
        public String f24596i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f24597j = false;

        public String a() {
            String str = this.f24591d;
            return str == null ? "" : str;
        }

        public String b() {
            String str = this.f24594g;
            return str == null ? "" : str;
        }

        public String c() {
            String str = this.f24595h;
            return str == null ? "" : str;
        }

        public String d() {
            String str = this.f24588a;
            return str == null ? "" : str;
        }

        public String e() {
            String str = this.f24590c;
            return str == null ? "" : str;
        }

        public String f() {
            String str = this.f24589b;
            return str == null ? "" : str;
        }

        public String g() {
            String str = this.f24592e;
            return str == null ? "" : str;
        }

        public String h() {
            String str = this.f24596i;
            return str == null ? "" : str;
        }

        public Integer i() {
            Integer num = this.f24593f;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public boolean j() {
            return this.f24597j;
        }

        public void k(String str) {
            this.f24591d = str;
        }

        public void l(String str) {
            this.f24594g = str;
        }

        public void m(String str) {
            this.f24595h = str;
        }

        public void n(String str) {
            this.f24588a = str;
        }

        public void o(String str) {
            this.f24590c = str;
        }

        public void p(String str) {
            this.f24589b = str;
        }

        public void q(String str) {
            this.f24592e = str;
        }

        public void r(boolean z10) {
            this.f24597j = z10;
        }

        public void s(String str) {
            this.f24596i = str;
        }

        public void t(Integer num) {
            this.f24593f = num;
        }

        public String toString() {
            return "Data{id='" + this.f24588a + '\'' + ", name='" + this.f24589b + '\'' + ", lang='" + this.f24590c + '\'' + ", category='" + this.f24591d + '\'' + ", subCategory='" + this.f24592e + '\'' + ", type=" + this.f24593f + ", code='" + this.f24594g + '\'' + ", crawlType='" + this.f24595h + '\'' + ", thumb='" + this.f24596i + '\'' + ", tgClick=" + this.f24597j + '}';
        }
    }

    public List<C0490a> a() {
        List<C0490a> list = this.f24586b;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f24585a;
        return str == null ? "" : str;
    }

    public Integer c() {
        Integer num = this.f24587c;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void d(List<C0490a> list) {
        this.f24586b = list;
    }

    public void e(String str) {
        this.f24585a = str;
    }

    public void f(Integer num) {
        this.f24587c = num;
    }

    public String toString() {
        return "ChannelList{message='" + this.f24585a + '\'' + ", data=" + this.f24586b + ", statusCode=" + this.f24587c + '}';
    }
}
