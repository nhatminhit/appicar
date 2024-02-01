package xf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import le.h;
import pf.e0;
import pf.w2;
import pf.y3;
import we.a;
import we.l;
import we.p;
import wf.n0;
import wf.w0;
import xe.u1;
import xe.w;
import zd.d1;
import zd.e1;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u001aT\u0010\u000e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\b\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"T", "Lkotlin/Function1;", "Lie/d;", "", "completion", "Lzd/u2;", "c", "(Lwe/l;Lie/d;)V", "R", "Lkotlin/Function2;", "receiver", "d", "(Lwe/p;Ljava/lang/Object;Lie/d;)V", "a", "b", "block", "e", "Lwf/n0;", "Lzd/u;", "f", "(Lwf/n0;Ljava/lang/Object;Lwe/p;)Ljava/lang/Object;", "g", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", "h", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b {
    public static final <T> void a(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        Object obj;
        ie.g e10;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            e10 = dVar.e();
            c10 = w0.c(e10, (Object) null);
            obj = ((l) u1.q(lVar, 1)).A(a10);
            w0.a(e10, c10);
            if (obj != ke.d.h()) {
                d1.a aVar = d1.P;
                a10.x(d1.b(obj));
            }
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = e1.a(th2);
        }
    }

    public static final <R, T> void b(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar) {
        Object obj;
        ie.g e10;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            e10 = dVar.e();
            c10 = w0.c(e10, (Object) null);
            obj = ((p) u1.q(pVar, 2)).g0(r10, a10);
            w0.a(e10, c10);
            if (obj != ke.d.h()) {
                d1.a aVar = d1.P;
                a10.x(d1.b(obj));
            }
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = e1.a(th2);
        }
    }

    public static final <T> void c(@g l<? super d<? super T>, ? extends Object> lVar, @g d<? super T> dVar) {
        Object obj;
        d<? super T> a10 = h.a(dVar);
        try {
            obj = ((l) u1.q(lVar, 1)).A(a10);
            if (obj != ke.d.h()) {
                d1.a aVar = d1.P;
                a10.x(d1.b(obj));
            }
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = e1.a(th2);
        }
    }

    public static final <R, T> void d(@g p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, @g d<? super T> dVar) {
        Object obj;
        d<? super T> a10 = h.a(dVar);
        try {
            obj = ((p) u1.q(pVar, 2)).g0(r10, a10);
            if (obj != ke.d.h()) {
                d1.a aVar = d1.P;
                a10.x(d1.b(obj));
            }
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = e1.a(th2);
        }
    }

    public static final <T> void e(d<? super T> dVar, l<? super d<? super T>, ? extends Object> lVar) {
        d<? super T> a10 = h.a(dVar);
        try {
            Object A = lVar.A(a10);
            if (A != ke.d.h()) {
                d1.a aVar = d1.P;
                a10.x(d1.b(A));
            }
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            a10.x(d1.b(e1.a(th2)));
        }
    }

    @fh.h
    public static final <T, R> Object f(@g n0<? super T> n0Var, R r10, @g p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object W0;
        try {
            obj = ((p) u1.q(pVar, 2)).g0(r10, n0Var);
        } catch (Throwable th2) {
            obj = new e0(th2, false, 2, (w) null);
        }
        if (obj == ke.d.h() || (W0 = n0Var.W0(obj)) == w2.f22036b) {
            return ke.d.h();
        }
        if (!(W0 instanceof e0)) {
            return w2.o(W0);
        }
        throw ((e0) W0).f21998a;
    }

    @fh.h
    public static final <T, R> Object g(@g n0<? super T> n0Var, R r10, @g p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object W0;
        boolean z10 = false;
        try {
            obj = ((p) u1.q(pVar, 2)).g0(r10, n0Var);
        } catch (Throwable th2) {
            obj = new e0(th2, false, 2, (w) null);
        }
        if (obj == ke.d.h() || (W0 = n0Var.W0(obj)) == w2.f22036b) {
            return ke.d.h();
        }
        if (W0 instanceof e0) {
            Throwable th3 = ((e0) W0).f21998a;
            if (!(th3 instanceof y3) || ((y3) th3).O != n0Var) {
                z10 = true;
            }
            if (z10) {
                throw th3;
            } else if (obj instanceof e0) {
                throw ((e0) obj).f21998a;
            }
        } else {
            obj = w2.o(W0);
        }
        return obj;
    }

    public static final <T> Object h(n0<? super T> n0Var, l<? super Throwable, Boolean> lVar, a<? extends Object> aVar) {
        Object obj;
        try {
            obj = aVar.n();
        } catch (Throwable th2) {
            obj = new e0(th2, false, 2, (w) null);
        }
        if (obj == ke.d.h()) {
            return ke.d.h();
        }
        Object W0 = n0Var.W0(obj);
        if (W0 == w2.f22036b) {
            return ke.d.h();
        }
        if (!(W0 instanceof e0)) {
            return w2.o(W0);
        }
        e0 e0Var = (e0) W0;
        if (lVar.A(e0Var.f21998a).booleanValue()) {
            throw e0Var.f21998a;
        } else if (!(obj instanceof e0)) {
            return obj;
        } else {
            throw ((e0) obj).f21998a;
        }
    }
}
