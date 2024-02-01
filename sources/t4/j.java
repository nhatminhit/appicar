package t4;

import d.m0;
import d.o0;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f12951a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f12952b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f12953c;

    public j() {
    }

    public j(@m0 Class<?> cls, @m0 Class<?> cls2) {
        a(cls, cls2);
    }

    public j(@m0 Class<?> cls, @m0 Class<?> cls2, @o0 Class<?> cls3) {
        b(cls, cls2, cls3);
    }

    public void a(@m0 Class<?> cls, @m0 Class<?> cls2) {
        b(cls, cls2, (Class<?>) null);
    }

    public void b(@m0 Class<?> cls, @m0 Class<?> cls2, @o0 Class<?> cls3) {
        this.f12951a = cls;
        this.f12952b = cls2;
        this.f12953c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f12951a.equals(jVar.f12951a) && this.f12952b.equals(jVar.f12952b) && m.d(this.f12953c, jVar.f12953c);
    }

    public int hashCode() {
        int hashCode = ((this.f12951a.hashCode() * 31) + this.f12952b.hashCode()) * 31;
        Class<?> cls = this.f12953c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f12951a + ", second=" + this.f12952b + '}';
    }
}
