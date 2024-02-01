package zd;

import fh.g;
import fh.h;
import ie.d;
import ie.j;
import xe.l0;
import xe.w;

@h1(version = "1.7")
@y2(markerClass = {r.class})
@j
public abstract class i<T, R> {
    public i() {
    }

    public /* synthetic */ i(w wVar) {
        this();
    }

    @h
    public abstract Object a(T t10, @g d<? super R> dVar);

    @h
    public abstract <U, S> Object b(@g g<U, S> gVar, U u10, @g d<? super S> dVar);

    @g
    @k(level = m.P, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @b1(expression = "this.callRecursive(value)", imports = {}))
    public final Void d(@g g<?, ?> gVar, @h Object obj) {
        l0.p(gVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
