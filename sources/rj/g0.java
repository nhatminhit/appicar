package rj;

import u2.h1;
import u2.s0;

@s0(tableName = "VideoOffline")
public class g0 {
    @h1(autoGenerate = true)

    /* renamed from: a  reason: collision with root package name */
    public int f22817a;

    /* renamed from: b  reason: collision with root package name */
    public String f22818b;

    /* renamed from: c  reason: collision with root package name */
    public String f22819c;

    public g0(String str, String str2) {
        this.f22818b = str;
        this.f22819c = str2;
    }

    public int a() {
        return this.f22817a;
    }

    public String b() {
        return this.f22818b;
    }

    public String c() {
        return this.f22819c;
    }

    public void d(int i10) {
        this.f22817a = i10;
    }

    public void e(String str) {
        this.f22818b = str;
    }

    public void f(String str) {
        this.f22819c = str;
    }

    public String toString() {
        return "VideoOffline{Id=" + this.f22817a + ", nameFodder='" + this.f22818b + '\'' + ", source='" + this.f22819c + '\'' + '}';
    }
}
