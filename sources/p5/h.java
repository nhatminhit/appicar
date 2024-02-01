package p5;

import i5.y;
import java.beans.ConstructorProperties;
import java.beans.Transient;
import q5.a;
import q5.l;
import q5.m;

public class h extends g {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f11511b = ConstructorProperties.class;

    public h() {
        Class<Transient> cls = Transient.class;
    }

    public y a(l lVar) {
        ConstructorProperties d10;
        m v10 = lVar.v();
        if (v10 == null || (d10 = v10.d(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] value = d10.value();
        int u10 = lVar.u();
        if (u10 < value.length) {
            return y.a(value[u10]);
        }
        return null;
    }

    public Boolean b(a aVar) {
        Transient d10 = aVar.d(Transient.class);
        if (d10 != null) {
            return Boolean.valueOf(d10.value());
        }
        return null;
    }

    public Boolean c(a aVar) {
        if (aVar.d(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}
