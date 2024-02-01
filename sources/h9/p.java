package h9;

import android.os.Looper;
import c9.a;
import d.m0;
import d.o0;
import j8.s;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class p {
    public static <TResult> TResult a(@m0 m<TResult> mVar) throws ExecutionException, InterruptedException {
        s.j();
        s.m(mVar, "Task must not be null");
        if (mVar.u()) {
            return o(mVar);
        }
        u uVar = new u((t) null);
        p(mVar, uVar);
        uVar.d();
        return o(mVar);
    }

    public static <TResult> TResult b(@m0 m<TResult> mVar, long j10, @m0 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        s.j();
        s.m(mVar, "Task must not be null");
        s.m(timeUnit, "TimeUnit must not be null");
        if (mVar.u()) {
            return o(mVar);
        }
        u uVar = new u((t) null);
        p(mVar, uVar);
        if (uVar.e(j10, timeUnit)) {
            return o(mVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    @m0
    public static <TResult> m<TResult> c(@m0 Callable<TResult> callable) {
        return d(o.f8939a, callable);
    }

    @Deprecated
    @m0
    public static <TResult> m<TResult> d(@m0 Executor executor, @m0 Callable<TResult> callable) {
        s.m(executor, "Executor must not be null");
        s.m(callable, "Callback must not be null");
        s0 s0Var = new s0();
        executor.execute(new v0(s0Var, callable));
        return s0Var;
    }

    @m0
    public static <TResult> m<TResult> e() {
        s0 s0Var = new s0();
        s0Var.A();
        return s0Var;
    }

    @m0
    public static <TResult> m<TResult> f(@m0 Exception exc) {
        s0 s0Var = new s0();
        s0Var.y(exc);
        return s0Var;
    }

    @m0
    public static <TResult> m<TResult> g(TResult tresult) {
        s0 s0Var = new s0();
        s0Var.z(tresult);
        return s0Var;
    }

    @m0
    public static m<Void> h(@o0 Collection<? extends m<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g((Object) null);
        }
        for (m mVar : collection) {
            if (mVar == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        s0 s0Var = new s0();
        w wVar = new w(collection.size(), s0Var);
        for (m p10 : collection) {
            p(p10, wVar);
        }
        return s0Var;
    }

    @m0
    public static m<Void> i(@o0 m<?>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g((Object) null) : h(Arrays.asList(mVarArr));
    }

    @m0
    public static m<List<m<?>>> j(@o0 Collection<? extends m<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(Collections.emptyList());
        }
        return h(collection).p(o.f8939a, new s(collection));
    }

    @m0
    public static m<List<m<?>>> k(@o0 m<?>... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g(Collections.emptyList()) : j(Arrays.asList(mVarArr));
    }

    @m0
    public static <TResult> m<List<TResult>> l(@o0 Collection<? extends m> collection) {
        if (collection == null || collection.isEmpty()) {
            return g(Collections.emptyList());
        }
        return h(collection).n(o.f8939a, new r(collection));
    }

    @m0
    public static <TResult> m<List<TResult>> m(@o0 m... mVarArr) {
        return (mVarArr == null || mVarArr.length == 0) ? g(Collections.emptyList()) : l(Arrays.asList(mVarArr));
    }

    @m0
    public static <T> m<T> n(@m0 m<T> mVar, long j10, @m0 TimeUnit timeUnit) {
        s.m(mVar, "Task must not be null");
        s.b(j10 > 0, "Timeout must be positive");
        s.m(timeUnit, "TimeUnit must not be null");
        x xVar = new x();
        n nVar = new n(xVar);
        a aVar = new a(Looper.getMainLooper());
        aVar.postDelayed(new t0(nVar), timeUnit.toMillis(j10));
        mVar.e(new u0(aVar, nVar, xVar));
        return nVar.a();
    }

    public static Object o(@m0 m mVar) throws ExecutionException {
        if (mVar.v()) {
            return mVar.r();
        }
        if (mVar.t()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(mVar.q());
    }

    public static void p(m mVar, v vVar) {
        Executor executor = o.f8940b;
        mVar.l(executor, vVar);
        mVar.i(executor, vVar);
        mVar.c(executor, vVar);
    }
}
