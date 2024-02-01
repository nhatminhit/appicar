package ka;

import ha.e;
import ha.y;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import ka.k;
import pa.a;
import pa.d;

public final class m<T> extends y<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e f20050a;

    /* renamed from: b  reason: collision with root package name */
    public final y<T> f20051b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f20052c;

    public m(e eVar, y<T> yVar, Type type) {
        this.f20050a = eVar;
        this.f20051b = yVar;
        this.f20052c = type;
    }

    public T e(a aVar) throws IOException {
        return this.f20051b.e(aVar);
    }

    public void i(d dVar, T t10) throws IOException {
        y<T> yVar = this.f20051b;
        Type j10 = j(this.f20052c, t10);
        if (j10 != this.f20052c) {
            yVar = this.f20050a.q(oa.a.c(j10));
            if (yVar instanceof k.b) {
                y<T> yVar2 = this.f20051b;
                if (!(yVar2 instanceof k.b)) {
                    yVar = yVar2;
                }
            }
        }
        yVar.i(dVar, t10);
    }

    public final Type j(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
