package yi;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class b {
    @c("message")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public String f24839a;
    @c("data")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public List<a> f24840b = null;
    @c("statusCode")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public Integer f24841c;

    public class a {
        @c("_id")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public String f24842a;
        @c("category")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f24843b;
        @c("sub_category")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public String f24844c;
        @c("name")
        @ia.a

        /* renamed from: d  reason: collision with root package name */
        public String f24845d;
        @c("thumb")
        @ia.a

        /* renamed from: e  reason: collision with root package name */
        public String f24846e;
        @c("poster")
        @ia.a

        /* renamed from: f  reason: collision with root package name */
        public String f24847f;
        @c("playtime")
        @ia.a

        /* renamed from: g  reason: collision with root package name */
        public String f24848g;
        @c("publishtime")
        @ia.a

        /* renamed from: h  reason: collision with root package name */
        public String f24849h;
        @c("views")
        @ia.a

        /* renamed from: i  reason: collision with root package name */
        public Integer f24850i;
        @c("lang")
        @ia.a

        /* renamed from: j  reason: collision with root package name */
        public String f24851j;
        @c("channel")
        @ia.a

        /* renamed from: k  reason: collision with root package name */
        public C0494a f24852k;
        @c("code")
        @ia.a

        /* renamed from: l  reason: collision with root package name */
        public String f24853l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f24854m = false;

        /* renamed from: yi.b$a$a  reason: collision with other inner class name */
        public class C0494a {
            @c("_id")
            @ia.a

            /* renamed from: a  reason: collision with root package name */
            public String f24856a;
            @c("name")
            @ia.a

            /* renamed from: b  reason: collision with root package name */
            public String f24857b;
            @c("thumb")
            @ia.a

            /* renamed from: c  reason: collision with root package name */
            public String f24858c;

            public C0494a() {
            }

            public String a() {
                String str = this.f24856a;
                return str == null ? "" : str;
            }

            public String b() {
                String str = this.f24857b;
                return str == null ? "" : str;
            }

            public String c() {
                String str = this.f24858c;
                return str == null ? "" : str;
            }

            public void d(String str) {
                this.f24856a = str;
            }

            public void e(String str) {
                this.f24857b = str;
            }

            public void f(String str) {
                this.f24858c = str;
            }

            public String toString() {
                return "Channel{id='" + this.f24856a + '\'' + ", name='" + this.f24857b + '\'' + ", thumb='" + this.f24858c + '\'' + '}';
            }
        }

        public a() {
        }

        public String a() {
            String str = this.f24843b;
            return str == null ? "" : str;
        }

        public C0494a b() {
            C0494a aVar = this.f24852k;
            return aVar == null ? new C0494a() : aVar;
        }

        public String c() {
            String str = this.f24853l;
            return str == null ? "" : str;
        }

        public String d() {
            String str = this.f24842a;
            return str == null ? "" : str;
        }

        public String e() {
            String str = this.f24851j;
            return str == null ? "" : str;
        }

        public String f() {
            String str = this.f24845d;
            return str == null ? "" : str;
        }

        public String g() {
            String str = this.f24848g;
            return str == null ? "" : str;
        }

        public String h() {
            String str = this.f24847f;
            return str == null ? "" : str;
        }

        public String i() {
            String str = this.f24849h;
            return str == null ? "" : str;
        }

        public String j() {
            String str = this.f24844c;
            return str == null ? "" : str;
        }

        public String k() {
            String str = this.f24846e;
            return str == null ? "" : str;
        }

        public Integer l() {
            Integer num = this.f24850i;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public boolean m() {
            return this.f24854m;
        }

        public void n(String str) {
            this.f24843b = str;
        }

        public void o(C0494a aVar) {
            this.f24852k = aVar;
        }

        public void p(String str) {
            this.f24853l = str;
        }

        public void q(String str) {
            this.f24842a = str;
        }

        public void r(String str) {
            this.f24851j = str;
        }

        public void s(String str) {
            this.f24845d = str;
        }

        public void t(boolean z10) {
            this.f24854m = z10;
        }

        public String toString() {
            return "Data{id='" + this.f24842a + '\'' + ", category='" + this.f24843b + '\'' + ", subCategory='" + this.f24844c + '\'' + ", name='" + this.f24845d + '\'' + ", thumb='" + this.f24846e + '\'' + ", poster='" + this.f24847f + '\'' + ", playtime='" + this.f24848g + '\'' + ", publishtime='" + this.f24849h + '\'' + ", views=" + this.f24850i + ", lang='" + this.f24851j + '\'' + ", channel=" + this.f24852k + ", code='" + this.f24853l + '\'' + ", playingVideo=" + this.f24854m + '}';
        }

        public void u(String str) {
            this.f24848g = str;
        }

        public void v(String str) {
            this.f24847f = str;
        }

        public void w(String str) {
            this.f24849h = str;
        }

        public void x(String str) {
            this.f24844c = str;
        }

        public void y(String str) {
            this.f24846e = str;
        }

        public void z(Integer num) {
            this.f24850i = num;
        }
    }

    public List<a> a() {
        List<a> list = this.f24840b;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f24839a;
        return str == null ? "" : str;
    }

    public Integer c() {
        Integer num = this.f24841c;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void d(List<a> list) {
        this.f24840b = list;
    }

    public void e(String str) {
        this.f24839a = str;
    }

    public void f(Integer num) {
        this.f24841c = num;
    }

    public String toString() {
        return "Video{message='" + this.f24839a + '\'' + ", data=" + this.f24840b + ", statusCode=" + this.f24841c + '}';
    }
}
