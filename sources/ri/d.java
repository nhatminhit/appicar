package ri;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class d {
    @c("status")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public String f22765a;
    @c("message")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public String f22766b;
    @c("data")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public List<a> f22767c = null;

    public class a {
        @c("licenseStatus")
        @ia.a

        /* renamed from: a  reason: collision with root package name */
        public Integer f22768a;
        @c("licenseTypeString")
        @ia.a

        /* renamed from: b  reason: collision with root package name */
        public String f22769b;
        @c("licenseExistence")
        @ia.a

        /* renamed from: c  reason: collision with root package name */
        public String f22770c;

        public a() {
        }

        public String a() {
            String str = this.f22770c;
            return str == null ? "" : str;
        }

        public Integer b() {
            Integer num = this.f22768a;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public String c() {
            String str = this.f22769b;
            return str == null ? "" : str;
        }

        public void d(String str) {
            this.f22770c = str;
        }

        public void e(Integer num) {
            this.f22768a = num;
        }

        public void f(String str) {
            this.f22769b = str;
        }
    }

    public List<a> a() {
        List<a> list = this.f22767c;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f22766b;
        return str == null ? "" : str;
    }

    public String c() {
        String str = this.f22765a;
        return str == null ? "" : str;
    }

    public void d(List<a> list) {
        this.f22767c = list;
    }

    public void e(String str) {
        this.f22766b = str;
    }

    public void f(String str) {
        this.f22765a = str;
    }
}
