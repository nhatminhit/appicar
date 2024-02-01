package rf;

import fh.g;
import fh.h;
import ie.d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import pf.e3;
import we.l;
import we.p;
import we.q;
import zd.a1;
import zd.b1;
import zd.k;
import zd.m;
import zd.u0;
import zd.u2;

@Metadata(bv = {}, d1 = {"rf/t", "rf/u", "rf/v"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class s {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f22544a = "Channel was closed";

    @g
    @a1
    public static final <E, R> i0<R> J(@g i0<? extends E> i0Var, @g ie.g gVar, @g p<? super E, ? super d<? super R>, ? extends Object> pVar) {
        return v.E(i0Var, gVar, pVar);
    }

    @g
    @a1
    public static final <E, R> i0<R> L(@g i0<? extends E> i0Var, @g ie.g gVar, @g q<? super Integer, ? super E, ? super d<? super R>, ? extends Object> qVar) {
        return v.G(i0Var, gVar, qVar);
    }

    @g
    @k(level = m.P, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final <E> zf.d<E> U(@g i0<? extends E> i0Var) {
        return u.h(i0Var);
    }

    @h
    @k(level = m.P, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @b1(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final <E> Object V(@g i0<? extends E> i0Var, @g d<? super E> dVar) {
        return u.i(i0Var, dVar);
    }

    @k(level = m.P, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @b1(expression = "trySendBlocking(element)", imports = {}))
    public static final <E> void X(@g m0<? super E> m0Var, E e10) {
        t.a(m0Var, e10);
    }

    @a1
    public static final void b(@g i0<?> i0Var, @h Throwable th2) {
        u.a(i0Var, th2);
    }

    @e3
    public static final <E, R> R c(@g i<E> iVar, @g l<? super i0<? extends E>, ? extends R> lVar) {
        return u.b(iVar, lVar);
    }

    public static final <E, R> R d(@g i0<? extends E> i0Var, @g l<? super i0<? extends E>, ? extends R> lVar) {
        return u.c(i0Var, lVar);
    }

    @h
    @e3
    public static final <E> Object e(@g i<E> iVar, @g l<? super E, u2> lVar, @g d<? super u2> dVar) {
        return u.d(iVar, lVar, dVar);
    }

    @a1
    @h
    public static final <E, C extends m0<? super E>> Object e0(@g i0<? extends E> i0Var, @g C c10, @g d<? super C> dVar) {
        return v.W(i0Var, c10, dVar);
    }

    @h
    public static final <E> Object f(@g i0<? extends E> i0Var, @g l<? super E, u2> lVar, @g d<? super u2> dVar) {
        return u.e(i0Var, lVar, dVar);
    }

    @a1
    @h
    public static final <E, C extends Collection<? super E>> Object f0(@g i0<? extends E> i0Var, @g C c10, @g d<? super C> dVar) {
        return v.X(i0Var, c10, dVar);
    }

    @g
    @a1
    public static final l<Throwable, u2> g(@g i0<?> i0Var) {
        return v.b(i0Var);
    }

    @h
    public static final <E> Object g0(@g i0<? extends E> i0Var, @g d<? super List<? extends E>> dVar) {
        return u.j(i0Var, dVar);
    }

    @g
    @a1
    public static final l<Throwable, u2> h(@g i0<?>... i0VarArr) {
        return v.c(i0VarArr);
    }

    @a1
    @h
    public static final <K, V, M extends Map<? super K, ? super V>> Object i0(@g i0<? extends u0<? extends K, ? extends V>> i0Var, @g M m10, @g d<? super M> dVar) {
        return v.Z(i0Var, m10, dVar);
    }

    @g
    @a1
    public static final <E, K> i0<E> k(@g i0<? extends E> i0Var, @g ie.g gVar, @g p<? super E, ? super d<? super K>, ? extends Object> pVar) {
        return v.f(i0Var, gVar, pVar);
    }

    @a1
    @h
    public static final <E> Object k0(@g i0<? extends E> i0Var, @g d<? super Set<E>> dVar) {
        return v.b0(i0Var, dVar);
    }

    @g
    public static final <E> Object m0(@g m0<? super E> m0Var, E e10) {
        return t.b(m0Var, e10);
    }

    @g
    @a1
    public static final <E, R, V> i0<V> q0(@g i0<? extends E> i0Var, @g i0<? extends R> i0Var2, @g ie.g gVar, @g p<? super E, ? super R, ? extends V> pVar) {
        return v.g0(i0Var, i0Var2, gVar, pVar);
    }

    @g
    @a1
    public static final <E> i0<E> s(@g i0<? extends E> i0Var, @g ie.g gVar, @g p<? super E, ? super d<? super Boolean>, ? extends Object> pVar) {
        return v.n(i0Var, gVar, pVar);
    }

    @g
    @a1
    public static final <E> i0<E> y(@g i0<? extends E> i0Var) {
        return v.t(i0Var);
    }
}
