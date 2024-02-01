package qi;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class a {
    @c("message")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public String f22401a;
    @c("data")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public List<Object> f22402b = null;
    @c("statusCode")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public Integer f22403c;

    public List<Object> a() {
        List<Object> list = this.f22402b;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f22401a;
        return str == null ? "" : str;
    }

    public Integer c() {
        Integer num = this.f22403c;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void d(List<Object> list) {
        this.f22402b = list;
    }

    public void e(String str) {
        this.f22401a = str;
    }

    public void f(Integer num) {
        this.f22403c = num;
    }

    public String toString() {
        return "DataServer{message='" + this.f22401a + '\'' + ", data=" + this.f22402b + ", statusCode=" + this.f22403c + '}';
    }
}
