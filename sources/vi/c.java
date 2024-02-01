package vi;

import java.util.ArrayList;
import java.util.List;

public class c {
    @ia.c("message")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public String f23666a;
    @ia.c("data")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public List<a> f23667b = null;
    @ia.c("statusCode")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public Integer f23668c;

    public class a {
        @ia.c("_id")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public String f23669a;
        @ia.c("name")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f23670b;
        @ia.c("type")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public Integer f23671c;
        @ia.c("company")
        @ia.a

        /* renamed from: d  reason: collision with root package name */
        public C0467a f23672d;
        @ia.c("thumb")
        @ia.a

        /* renamed from: e  reason: collision with root package name */
        public String f23673e;
        @ia.c("urls")
        @ia.a

        /* renamed from: f  reason: collision with root package name */
        public List<b> f23674f = null;
        @ia.c("lang")
        @ia.a

        /* renamed from: g  reason: collision with root package name */
        public String f23675g;
        @ia.c("status")
        @ia.a

        /* renamed from: h  reason: collision with root package name */
        public Integer f23676h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f23677i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f23678j = false;

        /* renamed from: vi.c$a$a  reason: collision with other inner class name */
        public class C0467a {
            @ia.c("name")
            @ia.a

            /* renamed from: a  reason: collision with root package name */
            public String f23680a;

            public C0467a() {
            }

            public String a() {
                String str = this.f23680a;
                return str == null ? "" : str;
            }

            public void b(String str) {
                this.f23680a = str;
            }

            public String toString() {
                return "Company{name='" + this.f23680a + '\'' + '}';
            }
        }

        public class b {
            @ia.c("url")
            @ia.a

            /* renamed from: a  reason: collision with root package name */
            public String f23682a;
            @ia.c("generate")
            @ia.a

            /* renamed from: b  reason: collision with root package name */
            public String f23683b;

            public b() {
            }

            public String a() {
                String str = this.f23683b;
                return str == null ? "" : str;
            }

            public String b() {
                String str = this.f23682a;
                return str == null ? "" : str;
            }

            public void c(String str) {
                this.f23683b = str;
            }

            public void d(String str) {
                this.f23682a = str;
            }

            public String toString() {
                return "Url{url='" + this.f23682a + '\'' + ", generate='" + this.f23683b + '\'' + '}';
            }
        }

        public a() {
        }

        public C0467a a() {
            C0467a aVar = this.f23672d;
            return aVar == null ? new C0467a() : aVar;
        }

        public String b() {
            String str = this.f23669a;
            return str == null ? "" : str;
        }

        public String c() {
            String str = this.f23675g;
            return str == null ? "" : str;
        }

        public String d() {
            String str = this.f23670b;
            return str == null ? "" : str;
        }

        public Integer e() {
            Integer num = this.f23676h;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public String f() {
            String str = this.f23673e;
            return str == null ? "" : str;
        }

        public Integer g() {
            Integer num = this.f23671c;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public List<b> h() {
            List<b> list = this.f23674f;
            return list == null ? new ArrayList() : list;
        }

        public boolean i() {
            return this.f23678j;
        }

        public boolean j() {
            return this.f23677i;
        }

        public void k(C0467a aVar) {
            this.f23672d = aVar;
        }

        public void l(String str) {
            this.f23669a = str;
        }

        public void m(String str) {
            this.f23675g = str;
        }

        public void n(String str) {
            this.f23670b = str;
        }

        public void o(boolean z10) {
            this.f23678j = z10;
        }

        public void p(boolean z10) {
            this.f23677i = z10;
        }

        public void q(Integer num) {
            this.f23676h = num;
        }

        public void r(String str) {
            this.f23673e = str;
        }

        public void s(Integer num) {
            this.f23671c = num;
        }

        public void t(List<b> list) {
            this.f23674f = list;
        }

        public String toString() {
            return "Data{id='" + this.f23669a + '\'' + ", name='" + this.f23670b + '\'' + ", type=" + this.f23671c + ", company=" + this.f23672d + ", thumb='" + this.f23673e + '\'' + ", urls=" + this.f23674f + ", lang='" + this.f23675g + '\'' + ", status=" + this.f23676h + ", prioritize=" + this.f23677i + ", playing=" + this.f23678j + '}';
        }
    }

    public List<a> a() {
        List<a> list = this.f23667b;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f23666a;
        return str == null ? "" : str;
    }

    public Integer c() {
        Integer num = this.f23668c;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void d(List<a> list) {
        this.f23667b = list;
    }

    public void e(String str) {
        this.f23666a = str;
    }

    public void f(Integer num) {
        this.f23668c = num;
    }

    public String toString() {
        return "ChannelsTv{message='" + this.f23666a + '\'' + ", data=" + this.f23667b + ", statusCode=" + this.f23668c + '}';
    }
}
