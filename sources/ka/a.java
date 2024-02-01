package ka;

import ha.e;
import ha.y;
import ha.z;
import ja.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import pa.c;
import pa.d;

public final class a<E> extends y<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final z f20003c = new C0342a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f20004a;

    /* renamed from: b  reason: collision with root package name */
    public final y<E> f20005b;

    /* renamed from: ka.a$a  reason: collision with other inner class name */
    public class C0342a implements z {
        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            Type h10 = aVar.h();
            if (!(h10 instanceof GenericArrayType) && (!(h10 instanceof Class) || !((Class) h10).isArray())) {
                return null;
            }
            Type g10 = b.g(h10);
            return new a(eVar, eVar.q(oa.a.c(g10)), b.k(g10));
        }
    }

    public a(e eVar, y<E> yVar, Class<E> cls) {
        this.f20005b = new m(eVar, yVar, cls);
        this.f20004a = cls;
    }

    public Object e(pa.a aVar) throws IOException {
        if (aVar.z0() == c.NULL) {
            aVar.c0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.o()) {
            arrayList.add(this.f20005b.e(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f20004a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void i(d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.N();
            return;
        }
        dVar.g();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f20005b.i(dVar, Array.get(obj, i10));
        }
        dVar.k();
    }
}
