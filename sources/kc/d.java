package kc;

import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f20107a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f20108b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f20109c;

    public List<String> a() {
        return this.f20108b;
    }

    public String b() {
        return this.f20107a;
    }

    public int c() {
        return this.f20109c;
    }

    public void d(List<String> list) {
        this.f20108b = list;
    }

    public void e(String str) {
        this.f20107a = str;
    }

    public void f(int i10) {
        this.f20109c = i10;
    }

    public String toString() {
        return "QRAuth{message='" + this.f20107a + '\'' + ", data=" + this.f20108b + ", statusCode='" + this.f20109c + '\'' + '}';
    }
}
