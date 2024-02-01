package kc;

import ia.c;
import java.util.ArrayList;
import java.util.List;

public class a<T> {
    @c("statusCode")
    @ia.a

    /* renamed from: a  reason: collision with root package name */
    public Integer f20100a;
    @c("message")
    @ia.a

    /* renamed from: b  reason: collision with root package name */
    public String f20101b;
    @c("data")
    @ia.a

    /* renamed from: c  reason: collision with root package name */
    public List<T> f20102c;
    @c("errors")
    @ia.a

    /* renamed from: d  reason: collision with root package name */
    public List<g> f20103d;

    public List<T> a() {
        if (this.f20102c == null) {
            this.f20102c = new ArrayList();
        }
        return this.f20102c;
    }

    public List<g> b() {
        if (this.f20103d == null) {
            this.f20103d = new ArrayList();
        }
        return this.f20103d;
    }

    public String c() {
        return this.f20101b;
    }

    public Integer d() {
        return this.f20100a;
    }

    public void e(List<T> list) {
        this.f20102c = list;
    }

    public void f(String str) {
        this.f20101b = str;
    }

    public void g(Integer num) {
        this.f20100a = num;
    }

    public String toString() {
        return "BaseResponse{statusCode=" + this.f20100a + ", message='" + this.f20101b + '\'' + ", data=" + this.f20102c + ", errors='" + this.f20103d + '\'' + '}';
    }
}
