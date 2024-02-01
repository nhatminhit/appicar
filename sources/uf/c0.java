package uf;

import fh.g;
import fh.h;
import ie.d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import le.b;
import le.f;
import le.o;
import we.p;
import we.q;
import we.r;
import xe.i0;
import zd.b1;
import zd.e1;
import zd.k;
import zd.m;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001HHø\u0001\u0000¢\u0006\u0004\b+\u0010'\"\"\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8FX\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"\"\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8FX\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"T", "Luf/i0;", "Luf/i;", "c", "Lie/g;", "context", "h", "Luf/t0;", "e", "g", "Luf/j;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lzd/u2;", "a", "Lkotlin/Function3;", "", "Lzd/v0;", "name", "Lie/d;", "", "Lzd/u;", "action", "d", "(Luf/i0;Lwe/q;)Luf/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Luf/i0;JLwe/p;)Luf/i;", "Lkotlin/Function4;", "attempt", "o", "(Luf/i0;Lwe/r;)Luf/i;", "", "p", "(Luf/i0;Lie/d;)Ljava/lang/Object;", "", "q", "", "f", "k", "(Luf/j;)Z", "isActive$annotations", "(Luf/j;)V", "isActive", "i", "(Luf/j;)Lie/g;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class c0 {

    @f(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<Throwable, d<? super Boolean>, Object> {
        public int S;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            return new a(dVar);
        }

        @h
        public final Object K(@g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return b.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @h
        /* renamed from: P */
        public final Object g0(@g Throwable th2, @h d<? super Boolean> dVar) {
            return ((a) H(th2, dVar)).K(u2.f25116a);
        }
    }

    @k(level = m.P, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @b1(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@g j<?> jVar, @h CancellationException cancellationException) {
        k.b1();
        throw new y();
    }

    public static /* synthetic */ void b(j jVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        a(jVar, cancellationException);
    }

    @g
    @k(level = m.P, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> c(@g i0<? extends T> i0Var) {
        k.b1();
        throw new y();
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> d(i0<? extends T> i0Var, q<? super j<? super T>, ? super Throwable, ? super d<? super u2>, ? extends Object> qVar) {
        return k.u(i0Var, qVar);
    }

    @g
    @k(level = m.P, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> e(@g t0<? extends T> t0Var) {
        k.b1();
        throw new y();
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object f(i0<? extends T> i0Var, d<? super Integer> dVar) {
        i0.e(0);
        Object Y = k.Y(i0Var, dVar);
        i0.e(1);
        return Y;
    }

    @g
    @k(level = m.P, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> g(@g t0<? extends T> t0Var) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> h(@g i0<? extends T> i0Var, @g ie.g gVar) {
        k.b1();
        throw new y();
    }

    @g
    public static final ie.g i(@g j<?> jVar) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @b1(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(j jVar) {
    }

    public static final boolean k(@g j<?> jVar) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @b1(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(j jVar) {
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> m(i0<? extends T> i0Var, long j10, p<? super Throwable, ? super d<? super Boolean>, ? extends Object> pVar) {
        return k.v1(i0Var, j10, pVar);
    }

    public static /* synthetic */ i n(i0 i0Var, long j10, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new a((d<? super a>) null);
        }
        return k.v1(i0Var, j10, pVar);
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @b1(expression = "this", imports = {}))
    public static final <T> i<T> o(i0<? extends T> i0Var, r<? super j<? super T>, ? super Throwable, ? super Long, ? super d<? super Boolean>, ? extends Object> rVar) {
        return k.x1(i0Var, rVar);
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object p(i0<? extends T> i0Var, d<? super List<? extends T>> dVar) {
        i0.e(0);
        Object X1 = o.c(i0Var, (List) null, dVar, 1, (Object) null);
        i0.e(1);
        return X1;
    }

    @oe.f
    @k(level = m.O, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object q(i0<? extends T> i0Var, d<? super Set<? extends T>> dVar) {
        i0.e(0);
        Object Z1 = o.e(i0Var, (Set) null, dVar, 1, (Object) null);
        i0.e(1);
        return Z1;
    }
}
