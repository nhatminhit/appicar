package q5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?>[] f11993c = new Class[0];

    /* renamed from: a  reason: collision with root package name */
    public final String f11994a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<?>[] f11995b;

    public x(String str, Class<?>[] clsArr) {
        this.f11994a = str;
        this.f11995b = clsArr == null ? f11993c : clsArr;
    }

    public x(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public x(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.f11995b.length;
    }

    public String b() {
        return this.f11994a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != x.class) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f11994a.equals(xVar.f11994a)) {
            return false;
        }
        Class<?>[] clsArr = xVar.f11995b;
        int length = this.f11995b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (clsArr[i10] != this.f11995b[i10]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f11994a.hashCode() + this.f11995b.length;
    }

    public String toString() {
        return this.f11994a + "(" + this.f11995b.length + "-args)";
    }
}
