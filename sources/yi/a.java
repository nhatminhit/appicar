package yi;

import ia.c;
import java.util.List;

public class a {
    @c("channels")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public List<String> f24837a;
    @c("lang")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public String f24838b;

    public a(List<String> list, String str) {
        this.f24837a = list;
        this.f24838b = str;
    }

    public List<String> a() {
        return this.f24837a;
    }

    public String b() {
        return this.f24838b;
    }

    public void c(List<String> list) {
        this.f24837a = list;
    }

    public void d(String str) {
        this.f24838b = str;
    }

    public String toString() {
        return "BodyChannel{channels=" + this.f24837a + ", lang='" + this.f24838b + '\'' + '}';
    }
}
