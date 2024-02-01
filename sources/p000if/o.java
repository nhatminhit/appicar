package p000if;

import fh.g;
import fh.h;
import ie.d;
import ie.j;
import java.util.Collection;
import java.util.Iterator;
import zd.h1;
import zd.u2;

@h1(version = "1.3")
@j
/* renamed from: if.o  reason: invalid package */
public abstract class o<T> {
    @h
    public abstract Object a(T t10, @g d<? super u2> dVar);

    @h
    public final Object b(@g m<? extends T> mVar, @g d<? super u2> dVar) {
        Object h10 = h(mVar.iterator(), dVar);
        return h10 == ke.d.h() ? h10 : u2.f25116a;
    }

    @h
    public final Object d(@g Iterable<? extends T> iterable, @g d<? super u2> dVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return u2.f25116a;
        }
        Object h10 = h(iterable.iterator(), dVar);
        return h10 == ke.d.h() ? h10 : u2.f25116a;
    }

    @h
    public abstract Object h(@g Iterator<? extends T> it, @g d<? super u2> dVar);
}
