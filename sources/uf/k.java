package uf;

import be.p0;
import fh.g;
import fh.h;
import ie.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import nf.e;
import pf.c2;
import pf.d2;
import pf.n2;
import pf.u0;
import rf.g0;
import rf.i;
import rf.i0;
import we.a;
import we.l;
import we.p;
import we.q;
import we.r;
import we.s;
import we.t;
import we.u;
import zd.a1;
import zd.b;
import zd.b1;
import zd.m;
import zd.t0;
import zd.u2;

@Metadata(bv = {}, d1 = {"uf/l", "uf/m", "uf/n", "uf/o", "uf/p", "uf/q", "uf/r", "uf/s", "uf/t", "uf/u", "uf/v", "uf/w", "uf/x", "uf/y", "uf/z", "uf/a0", "uf/b0"}, d2 = {}, k = 4, mv = {1, 6, 0})
public final class k {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f23350a = "kotlinx.coroutines.flow.defaultConcurrency";

    @h
    public static final <T> Object A(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar, @g d<? super u2> dVar) {
        return n.f(iVar, pVar, dVar);
    }

    @g
    @d2
    public static final <T, R> i<R> A0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.a(iVar, pVar);
    }

    @g
    @d2
    public static final <T> i<T> A1(@g i<? extends T> iVar, long j10) {
        return r.h(iVar, j10);
    }

    @h
    public static final <T> Object B(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar, @g d<? super u2> dVar) {
        return v.b(iVar, pVar, dVar);
    }

    @g
    @c2
    public static final <T, R> i<R> B0(@g i<? extends T> iVar, @g @b p<? super T, ? super d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.b(iVar, pVar);
    }

    @g
    @d2
    public static final <T> i<T> B1(@g i<? extends T> iVar, long j10) {
        return r.i(iVar, j10);
    }

    @g
    @d2
    public static final <T, R> i<R> C0(@g i<? extends T> iVar, int i10, @g p<? super T, ? super d<? super i<? extends R>>, ? extends Object> pVar) {
        return w.c(iVar, i10, pVar);
    }

    @g
    public static final <T, R> i<R> C1(@g i<? extends T> iVar, R r10, @g @b q<? super R, ? super T, ? super d<? super R>, ? extends Object> qVar) {
        return a0.j(iVar, r10, qVar);
    }

    @g
    public static final <T1, T2, T3, T4, T5, R> i<R> D(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g i<? extends T5> iVar5, @g t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super R>, ? extends Object> tVar) {
        return b0.c(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> D1(@g i<? extends T> iVar, R r10, @g @b q<? super R, ? super T, ? super d<? super R>, ? extends Object> qVar) {
        return x.B(iVar, r10, qVar);
    }

    @g
    public static final <T1, T2, T3, T4, R> i<R> E(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g s<? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super R>, ? extends Object> sVar) {
        return b0.d(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> E0(@g i<? extends i<? extends T>> iVar) {
        return x.m(iVar);
    }

    @g
    @zd.k(level = m.P, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> E1(@g i<? extends T> iVar, @g q<? super T, ? super T, ? super d<? super T>, ? extends Object> qVar) {
        return x.C(iVar, qVar);
    }

    @g
    public static final <T1, T2, T3, R> i<R> F(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g @b r<? super T1, ? super T2, ? super T3, ? super d<? super R>, ? extends Object> rVar) {
        return b0.e(iVar, iVar2, iVar3, rVar);
    }

    @g
    @d2
    public static final <T> i<T> F0(@g i<? extends i<? extends T>> iVar) {
        return w.e(iVar);
    }

    @g
    public static final <T> i0<T> F1(@g i<? extends T> iVar, @g u0 u0Var, @g o0 o0Var, int i10) {
        return z.g(iVar, u0Var, o0Var, i10);
    }

    @g
    public static final <T1, T2, R> i<R> G(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return b0.f(iVar, iVar2, qVar);
    }

    @g
    @d2
    public static final <T> i<T> G0(@g i<? extends i<? extends T>> iVar, int i10) {
        return w.f(iVar, i10);
    }

    @h
    public static final <T> Object H1(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.j(iVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g i<? extends T5> iVar5, @g t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super R>, ? extends Object> tVar) {
        return x.b(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @g
    public static final <T> i<T> I0(@g @b p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return l.n(pVar);
    }

    @h
    public static final <T> Object I1(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.k(iVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> J(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g s<? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super R>, ? extends Object> sVar) {
        return x.c(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @g
    @ve.h(name = "flowCombine")
    public static final <T1, T2, R> i<R> J0(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return b0.p(iVar, iVar2, qVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> J1(@g i<? extends T> iVar, int i10) {
        return x.D(iVar, i10);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> K(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g r<? super T1, ? super T2, ? super T3, ? super d<? super R>, ? extends Object> rVar) {
        return x.d(iVar, iVar2, iVar3, rVar);
    }

    @g
    @ve.h(name = "flowCombineTransform")
    public static final <T1, T2, R> i<R> K0(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g @b r<? super j<? super R>, ? super T1, ? super T2, ? super d<? super u2>, ? extends Object> rVar) {
        return b0.q(iVar, iVar2, rVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> K1(@g i<? extends T> iVar, T t10) {
        return x.E(iVar, t10);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> L(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return x.e(iVar, iVar2, qVar);
    }

    @g
    public static final <T> i<T> L0(T t10) {
        return l.o(t10);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> L1(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        return x.F(iVar, iVar2);
    }

    @g
    public static final <T> i<T> M0(@g T... tArr) {
        return l.p(tArr);
    }

    @h
    public static final <T> Object M1(@g i<? extends T> iVar, @g u0 u0Var, @g d<? super t0<? extends T>> dVar) {
        return z.i(iVar, u0Var, dVar);
    }

    @g
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g i<? extends T5> iVar5, @g @b u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super u2>, ? extends Object> uVar) {
        return b0.i(iVar, iVar2, iVar3, iVar4, iVar5, uVar);
    }

    @g
    public static final <T> i<T> N0(@g i<? extends T> iVar, @g ie.g gVar) {
        return p.h(iVar, gVar);
    }

    @g
    public static final <T> t0<T> N1(@g i<? extends T> iVar, @g u0 u0Var, @g o0 o0Var, T t10) {
        return z.j(iVar, u0Var, o0Var, t10);
    }

    @g
    public static final <T1, T2, T3, T4, R> i<R> O(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g @b t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super u2>, ? extends Object> tVar) {
        return b0.j(iVar, iVar2, iVar3, iVar4, tVar);
    }

    @h
    public static final <T, R> Object O0(@g i<? extends T> iVar, R r10, @g q<? super R, ? super T, ? super d<? super R>, ? extends Object> qVar, @g d<? super R> dVar) {
        return y.e(iVar, r10, qVar, dVar);
    }

    @zd.k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@g i<? extends T> iVar) {
        x.G(iVar);
    }

    @g
    public static final <T1, T2, T3, R> i<R> P(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g @b s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super d<? super u2>, ? extends Object> sVar) {
        return b0.k(iVar, iVar2, iVar3, sVar);
    }

    @zd.k(level = m.P, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar) {
        x.n(iVar, pVar);
    }

    @zd.k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar) {
        x.H(iVar, pVar);
    }

    @g
    public static final <T1, T2, R> i<R> Q(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g @b r<? super j<? super R>, ? super T1, ? super T2, ? super d<? super u2>, ? extends Object> rVar) {
        return b0.l(iVar, iVar2, rVar);
    }

    public static final int Q0() {
        return w.h();
    }

    @zd.k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar, @g p<? super Throwable, ? super d<? super u2>, ? extends Object> pVar2) {
        x.I(iVar, pVar, pVar2);
    }

    @g
    @zd.k(level = m.P, message = "Use 'flowOn' instead")
    public static final <T> i<T> R1(@g i<? extends T> iVar, @g ie.g gVar) {
        return x.J(iVar, gVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> S(@g i<? extends T> iVar, @g l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        return x.f(iVar, lVar);
    }

    @h
    public static final <T> Object S0(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.g(iVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> S1(@g i<? extends T> iVar, @g p<? super T, ? super d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.K(iVar, pVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> T(@g i<? extends T> iVar, @g l<? super T, ? extends i<? extends R>> lVar) {
        return x.g(iVar, lVar);
    }

    @h
    public static final <T> Object T0(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.h(iVar, dVar);
    }

    @g
    public static final <T> i<T> T1(@g i<? extends T> iVar, int i10) {
        return v.g(iVar, i10);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> U(@g i<? extends T> iVar, T t10) {
        return x.h(iVar, t10);
    }

    @g
    public static final <T> n2 U0(@g i<? extends T> iVar, @g u0 u0Var) {
        return n.h(iVar, u0Var);
    }

    @g
    public static final <T> i<T> U1(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return v.h(iVar, pVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> V(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        return x.i(iVar, iVar2);
    }

    @g
    public static final <T, R> i<R> V0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super R>, ? extends Object> pVar) {
        return a0.e(iVar, pVar);
    }

    @h
    public static final <T, C extends Collection<? super T>> Object V1(@g i<? extends T> iVar, @g C c10, @g d<? super C> dVar) {
        return o.a(iVar, c10, dVar);
    }

    @g
    public static final <T> i<T> W(@g i<? extends T> iVar) {
        return p.g(iVar);
    }

    @g
    @c2
    public static final <T, R> i<R> W0(@g i<? extends T> iVar, @g @b p<? super T, ? super d<? super R>, ? extends Object> pVar) {
        return w.k(iVar, pVar);
    }

    @h
    public static final <T> Object W1(@g i<? extends T> iVar, @g List<T> list, @g d<? super List<? extends T>> dVar) {
        return o.b(iVar, list, dVar);
    }

    @g
    public static final <T> i<T> X(@g i0<? extends T> i0Var) {
        return m.c(i0Var);
    }

    @g
    public static final <T, R> i<R> X0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super R>, ? extends Object> pVar) {
        return a0.f(iVar, pVar);
    }

    @h
    public static final <T> Object Y(@g i<? extends T> iVar, @g d<? super Integer> dVar) {
        return q.a(iVar, dVar);
    }

    @g
    public static final <T> i<T> Y0(@g Iterable<? extends i<? extends T>> iterable) {
        return w.l(iterable);
    }

    @h
    public static final <T> Object Y1(@g i<? extends T> iVar, @g Set<T> set, @g d<? super Set<? extends T>> dVar) {
        return o.d(iVar, set, dVar);
    }

    @h
    public static final <T> Object Z(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar, @g d<? super Integer> dVar) {
        return q.b(iVar, pVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> Z0(@g i<? extends i<? extends T>> iVar) {
        return x.o(iVar);
    }

    @g
    public static final i<Integer> a(@g gf.m mVar) {
        return l.a(mVar);
    }

    @g
    @d2
    public static final <T> i<T> a0(@g i<? extends T> iVar, long j10) {
        return r.a(iVar, j10);
    }

    @g
    public static final <T> i<T> a1(@g i<? extends T>... iVarArr) {
        return w.m(iVarArr);
    }

    @g
    public static final <T, R> i<R> a2(@g i<? extends T> iVar, @g @b q<? super j<? super R>, ? super T, ? super d<? super u2>, ? extends Object> qVar) {
        return t.g(iVar, qVar);
    }

    @g
    public static final i<Long> b(@g gf.p pVar) {
        return l.b(pVar);
    }

    @g
    @t0
    @d2
    public static final <T> i<T> b0(@g i<? extends T> iVar, @g l<? super T, Long> lVar) {
        return r.b(iVar, lVar);
    }

    @g
    public static final Void b1() {
        return x.p();
    }

    @g
    @c2
    public static final <T, R> i<R> b2(@g i<? extends T> iVar, @g @b q<? super j<? super R>, ? super T, ? super d<? super u2>, ? extends Object> qVar) {
        return w.n(iVar, qVar);
    }

    @g
    public static final <T> i<T> c(@g p000if.m<? extends T> mVar) {
        return l.c(mVar);
    }

    @g
    @d2
    public static final <T> i<T> c0(@g i<? extends T> iVar, long j10) {
        return r.c(iVar, j10);
    }

    @g
    @zd.k(level = m.P, message = "Collect flow in the desired context instead")
    public static final <T> i<T> c1(@g i<? extends T> iVar, @g ie.g gVar) {
        return x.q(iVar, gVar);
    }

    @g
    public static final <T, R> i<R> c2(@g i<? extends T> iVar, @g @b q<? super j<? super R>, ? super T, ? super d<? super Boolean>, ? extends Object> qVar) {
        return v.i(iVar, qVar);
    }

    @g
    public static final <T> i<T> d(@g Iterable<? extends T> iterable) {
        return l.d(iterable);
    }

    @g
    @t0
    @ve.h(name = "debounceDuration")
    @d2
    public static final <T> i<T> d0(@g i<? extends T> iVar, @g l<? super T, e> lVar) {
        return r.d(iVar, lVar);
    }

    @g
    public static final <T> i<T> d1(@g i<? extends T> iVar, @g q<? super j<? super T>, ? super Throwable, ? super d<? super u2>, ? extends Object> qVar) {
        return t.d(iVar, qVar);
    }

    @g
    @a1
    public static final <T, R> i<R> d2(@g i<? extends T> iVar, @g @b q<? super j<? super R>, ? super T, ? super d<? super u2>, ? extends Object> qVar) {
        return t.h(iVar, qVar);
    }

    @g
    public static final <T> i<T> e(@g Iterator<? extends T> it) {
        return l.e(it);
    }

    @g
    @zd.k(level = m.P, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> e0(@g i<? extends T> iVar, long j10) {
        return x.j(iVar, j10);
    }

    @g
    public static final <T> i<T> e1(@g i<? extends T> iVar, @g p<? super T, ? super d<? super u2>, ? extends Object> pVar) {
        return a0.g(iVar, pVar);
    }

    @g
    public static final <T> i<p0<T>> e2(@g i<? extends T> iVar) {
        return a0.k(iVar);
    }

    @g
    @zd.k(level = m.O, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> i<T> f(@g i<T> iVar) {
        return m.b(iVar);
    }

    @g
    @zd.k(level = m.P, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> f0(@g i<? extends T> iVar, long j10) {
        return x.k(iVar, j10);
    }

    @g
    public static final <T> i<T> f1(@g i<? extends T> iVar, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return t.e(iVar, pVar);
    }

    @g
    public static final <T1, T2, R> i<R> f2(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super d<? super R>, ? extends Object> qVar) {
        return b0.s(iVar, iVar2, qVar);
    }

    @g
    @d2
    public static final <T> i<T> g(@g a<? extends T> aVar) {
        return l.f(aVar);
    }

    @g
    public static final <T> i<T> g0(@g i<? extends T> iVar) {
        return s.a(iVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> g1(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        return x.r(iVar, iVar2);
    }

    @g
    @d2
    public static final <T> i<T> h(@g l<? super d<? super T>, ? extends Object> lVar) {
        return l.g(lVar);
    }

    @g
    public static final <T> i<T> h0(@g i<? extends T> iVar, @g p<? super T, ? super T, Boolean> pVar) {
        return s.b(iVar, pVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> h1(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        return x.s(iVar, iVar2);
    }

    @g
    public static final i<Integer> i(@g int[] iArr) {
        return l.h(iArr);
    }

    @g
    public static final <T, K> i<T> i0(@g i<? extends T> iVar, @g l<? super T, ? extends K> lVar) {
        return s.c(iVar, lVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> i1(@g i<? extends T> iVar, T t10) {
        return x.t(iVar, t10);
    }

    @g
    public static final i<Long> j(@g long[] jArr) {
        return l.i(jArr);
    }

    @g
    public static final <T> i<T> j0(@g i<? extends T> iVar, int i10) {
        return v.d(iVar, i10);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> j1(@g i<? extends T> iVar, T t10, @g l<? super Throwable, Boolean> lVar) {
        return x.u(iVar, t10, lVar);
    }

    @g
    public static final <T> i<T> k(@g T[] tArr) {
        return l.j(tArr);
    }

    @g
    public static final <T> i<T> k0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return v.e(iVar, pVar);
    }

    @g
    public static final <T> i0<T> l(@g d0<T> d0Var) {
        return z.a(d0Var);
    }

    @h
    public static final <T> Object l0(@g j<? super T> jVar, @g i0<? extends T> i0Var, @g d<? super u2> dVar) {
        return m.d(jVar, i0Var, dVar);
    }

    @g
    public static final <T> i<T> l1(@g i<? extends T> iVar, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return t.f(iVar, pVar);
    }

    @g
    public static final <T> t0<T> m(@g e0<T> e0Var) {
        return z.b(e0Var);
    }

    @h
    public static final <T> Object m0(@g j<? super T> jVar, @g i<? extends T> iVar, @g d<? super u2> dVar) {
        return n.g(jVar, iVar, dVar);
    }

    @g
    public static final <T> i0<T> m1(@g i0<? extends T> i0Var, @g p<? super j<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return z.f(i0Var, pVar);
    }

    @g
    public static final <T> i<T> n0() {
        return l.m();
    }

    @g
    @d2
    public static final <T> i0<T> n1(@g i<? extends T> iVar, @g u0 u0Var) {
        return m.f(iVar, u0Var);
    }

    @g
    public static final <T> i<T> o(@g i<? extends T> iVar, int i10, @g rf.m mVar) {
        return p.b(iVar, i10, mVar);
    }

    public static final void o0(@g j<?> jVar) {
        t.b(jVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> o1(@g i<? extends T> iVar) {
        return x.w(iVar);
    }

    @g
    public static final <T> i<T> p0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return a0.a(iVar, pVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> p1(@g i<? extends T> iVar, int i10) {
        return x.x(iVar, i10);
    }

    @g
    @zd.k(level = m.P, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q1(@g i<? extends T> iVar, @g ie.g gVar) {
        return x.y(iVar, gVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> r(@g i<? extends T> iVar) {
        return x.a(iVar);
    }

    @g
    public static final <T> i<T> r0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return a0.c(iVar, pVar);
    }

    @g
    public static final <T> i<T> r1(@g i0<? extends T> i0Var) {
        return m.g(i0Var);
    }

    @g
    public static final <T> i<T> s(@g @b p<? super g0<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return l.k(pVar);
    }

    @g
    public static final <T> i<T> s0(@g i<? extends T> iVar) {
        return a0.d(iVar);
    }

    @h
    public static final <S, T extends S> Object s1(@g i<? extends T> iVar, @g q<? super S, ? super T, ? super d<? super S>, ? extends Object> qVar, @g d<? super S> dVar) {
        return y.i(iVar, qVar, dVar);
    }

    @g
    public static final <T> i<T> t(@g i<? extends T> iVar) {
        return p.e(iVar);
    }

    @h
    public static final <T> Object t0(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.a(iVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> t1(@g i<? extends T> iVar) {
        return x.z(iVar);
    }

    @g
    public static final <T> i<T> u(@g i<? extends T> iVar, @g q<? super j<? super T>, ? super Throwable, ? super d<? super u2>, ? extends Object> qVar) {
        return u.a(iVar, qVar);
    }

    @h
    public static final <T> Object u0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar, @g d<? super T> dVar) {
        return y.b(iVar, pVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> u1(@g i<? extends T> iVar, int i10) {
        return x.A(iVar, i10);
    }

    @h
    public static final <T> Object v(@g i<? extends T> iVar, @g j<? super T> jVar, @g d<? super Throwable> dVar) {
        return u.b(iVar, jVar, dVar);
    }

    @h
    public static final <T> Object v0(@g i<? extends T> iVar, @g d<? super T> dVar) {
        return y.c(iVar, dVar);
    }

    @g
    public static final <T> i<T> v1(@g i<? extends T> iVar, long j10, @g p<? super Throwable, ? super d<? super Boolean>, ? extends Object> pVar) {
        return u.e(iVar, j10, pVar);
    }

    @g
    public static final <T> i<T> w(@g @b p<? super g0<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        return l.l(pVar);
    }

    @h
    public static final <T> Object w0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super Boolean>, ? extends Object> pVar, @g d<? super T> dVar) {
        return y.d(iVar, pVar, dVar);
    }

    @h
    public static final Object x(@g i<?> iVar, @g d<? super u2> dVar) {
        return n.a(iVar, dVar);
    }

    @g
    public static final i0<u2> x0(@g u0 u0Var, long j10, long j11) {
        return r.f(u0Var, j10, j11);
    }

    @g
    public static final <T> i<T> x1(@g i<? extends T> iVar, @g r<? super j<? super T>, ? super Throwable, ? super Long, ? super d<? super Boolean>, ? extends Object> rVar) {
        return u.g(iVar, rVar);
    }

    @g
    public static final <T, R> i<R> y1(@g i<? extends T> iVar, R r10, @g @b q<? super R, ? super T, ? super d<? super R>, ? extends Object> qVar) {
        return a0.h(iVar, r10, qVar);
    }

    @h
    public static final <T> Object z(@g i<? extends T> iVar, @g q<? super Integer, ? super T, ? super d<? super u2>, ? extends Object> qVar, @g d<? super u2> dVar) {
        return n.d(iVar, qVar, dVar);
    }

    @g
    @zd.k(level = m.P, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> z0(@g i<? extends T> iVar, @g p<? super T, ? super d<? super i<? extends R>>, ? extends Object> pVar) {
        return x.l(iVar, pVar);
    }

    @g
    public static final <T> i<T> z1(@g i<? extends T> iVar, @g q<? super T, ? super T, ? super d<? super T>, ? extends Object> qVar) {
        return a0.i(iVar, qVar);
    }
}
