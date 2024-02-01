package og;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import og.i0;
import pg.e;

public final class s {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ boolean f21768h = false;

    /* renamed from: a  reason: collision with root package name */
    public int f21769a = 64;

    /* renamed from: b  reason: collision with root package name */
    public int f21770b = 5;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Runnable f21771c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public ExecutorService f21772d;

    /* renamed from: e  reason: collision with root package name */
    public final Deque<i0.a> f21773e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final Deque<i0.a> f21774f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final Deque<i0> f21775g = new ArrayDeque();

    public s() {
    }

    public s(ExecutorService executorService) {
        this.f21772d = executorService;
    }

    public synchronized void a() {
        for (i0.a o10 : this.f21773e) {
            o10.o().cancel();
        }
        for (i0.a o11 : this.f21774f) {
            o11.o().cancel();
        }
        for (i0 cancel : this.f21775g) {
            cancel.cancel();
        }
    }

    public void b(i0.a aVar) {
        i0.a e10;
        synchronized (this) {
            this.f21773e.add(aVar);
            if (!aVar.o().R && (e10 = e(aVar.p())) != null) {
                aVar.r(e10);
            }
        }
        k();
    }

    public synchronized void c(i0 i0Var) {
        this.f21775g.add(i0Var);
    }

    public synchronized ExecutorService d() {
        if (this.f21772d == null) {
            this.f21772d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.J("OkHttp Dispatcher", false));
        }
        return this.f21772d;
    }

    @Nullable
    public final i0.a e(String str) {
        for (i0.a next : this.f21774f) {
            if (next.p().equals(str)) {
                return next;
            }
        }
        for (i0.a next2 : this.f21773e) {
            if (next2.p().equals(str)) {
                return next2;
            }
        }
        return null;
    }

    public final <T> void f(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f21771c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!k() && runnable != null) {
            runnable.run();
        }
    }

    public void g(i0.a aVar) {
        aVar.m().decrementAndGet();
        f(this.f21774f, aVar);
    }

    public void h(i0 i0Var) {
        f(this.f21775g, i0Var);
    }

    public synchronized int i() {
        return this.f21769a;
    }

    public synchronized int j() {
        return this.f21770b;
    }

    public final boolean k() {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<i0.a> it = this.f21773e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i0.a next = it.next();
                if (this.f21774f.size() >= this.f21769a) {
                    break;
                } else if (next.m().get() < this.f21770b) {
                    it.remove();
                    next.m().incrementAndGet();
                    arrayList.add(next);
                    this.f21774f.add(next);
                }
            }
            z10 = o() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((i0.a) arrayList.get(i10)).n(d());
        }
        return z10;
    }

    public synchronized List<g> l() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (i0.a o10 : this.f21773e) {
            arrayList.add(o10.o());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int m() {
        return this.f21773e.size();
    }

    public synchronized List<g> n() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f21775g);
        for (i0.a o10 : this.f21774f) {
            arrayList.add(o10.o());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public synchronized int o() {
        return this.f21774f.size() + this.f21775g.size();
    }

    public synchronized void p(@Nullable Runnable runnable) {
        this.f21771c = runnable;
    }

    public void q(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f21769a = i10;
            }
            k();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + i10);
    }

    public void r(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f21770b = i10;
            }
            k();
            return;
        }
        throw new IllegalArgumentException("max < 1: " + i10);
    }
}
