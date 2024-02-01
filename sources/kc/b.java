package kc;

import ia.a;
import ia.c;
import java.util.ArrayList;
import java.util.List;

public class b {
    @c("message")
    @a

    /* renamed from: a  reason: collision with root package name */
    public String f20104a;
    @c("data")
    @a

    /* renamed from: b  reason: collision with root package name */
    public List<Object> f20105b = null;
    @c("statusCode")
    @a

    /* renamed from: c  reason: collision with root package name */
    public Integer f20106c;

    public List<Object> a() {
        List<Object> list = this.f20105b;
        return list == null ? new ArrayList() : list;
    }

    public String b() {
        String str = this.f20104a;
        return str == null ? "" : str;
    }

    public Integer c() {
        Integer num = this.f20106c;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void d(List<Object> list) {
        this.f20105b = list;
    }

    public void e(String str) {
        this.f20104a = str;
    }

    public void f(Integer num) {
        this.f20106c = num;
    }

    public String toString() {
        return "DataServer{message='" + this.f20104a + '\'' + ", data=" + this.f20105b + ", statusCode=" + this.f20106c + '}';
    }
}
