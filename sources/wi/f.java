package wi;

import ia.c;
import java.util.List;

public class f {
    @c("youtube")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public a f24308a;

    public class a {
        @c("search")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public C0482a f24309a;
        @c("suggest")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public b f24310b;
        @c("agents")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public List<String> f24311c = null;

        /* renamed from: wi.f$a$a  reason: collision with other inner class name */
        public class C0482a {
            @c("regex")
            @ia.a

            /* renamed from: a  reason: collision with root package name */
            public String f24313a;
            @c("url")
            @ia.a

            /* renamed from: b  reason: collision with root package name */
            public String f24314b;

            public C0482a() {
            }

            public String a() {
                return this.f24313a;
            }

            public String b() {
                return this.f24314b;
            }

            public void c(String str) {
                this.f24313a = str;
            }

            public void d(String str) {
                this.f24314b = str;
            }

            public String toString() {
                return "Search{regex='" + this.f24313a + '\'' + ", url='" + this.f24314b + '\'' + '}';
            }
        }

        public class b {
            @c("regex")
            @ia.a

            /* renamed from: a  reason: collision with root package name */
            public String f24316a;
            @c("url")
            @ia.a

            /* renamed from: b  reason: collision with root package name */
            public String f24317b;

            public b() {
            }

            public String a() {
                return this.f24316a;
            }

            public String b() {
                return this.f24317b;
            }

            public void c(String str) {
                this.f24316a = str;
            }

            public void d(String str) {
                this.f24317b = str;
            }
        }

        public a() {
        }

        public List<String> a() {
            return this.f24311c;
        }

        public C0482a b() {
            return this.f24309a;
        }

        public b c() {
            return this.f24310b;
        }

        public void d(List<String> list) {
            this.f24311c = list;
        }

        public void e(C0482a aVar) {
            this.f24309a = aVar;
        }

        public void f(b bVar) {
            this.f24310b = bVar;
        }

        public String toString() {
            return "Youtube{search=" + this.f24309a + ", suggest=" + this.f24310b + ", agents=" + this.f24311c + '}';
        }
    }

    public a a() {
        return this.f24308a;
    }

    public void b(a aVar) {
        this.f24308a = aVar;
    }

    public String toString() {
        return "Regex{youtube=" + this.f24308a + '}';
    }
}
