package androidx.lifecycle;

import androidx.lifecycle.p;
import fh.g;
import fh.h;
import ie.d;
import pf.u0;
import pf.v0;
import zd.u2;

public final class RepeatOnLifecycleKt {
    @h
    public static final Object a(@g p pVar, @g p.b bVar, @g we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar2, @g d<? super u2> dVar) {
        if (!(bVar != p.b.INITIALIZED)) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (pVar.b() == p.b.DESTROYED) {
            return u2.f25116a;
        } else {
            Object g10 = v0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(pVar, bVar, pVar2, (d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), dVar);
            return g10 == ke.d.h() ? g10 : u2.f25116a;
        }
    }

    @h
    public static final Object b(@g y yVar, @g p.b bVar, @g we.p<? super u0, ? super d<? super u2>, ? extends Object> pVar, @g d<? super u2> dVar) {
        Object a10 = a(yVar.getLifecycle(), bVar, pVar, dVar);
        return a10 == ke.d.h() ? a10 : u2.f25116a;
    }
}
