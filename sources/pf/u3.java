package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpf/u3;", "", "Lpf/t1;", "a", "()Lpf/t1;", "Lzd/u2;", "c", "()V", "eventLoop", "d", "(Lpf/t1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class u3 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final u3 f22027a = new u3();
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<t1> f22028b = new ThreadLocal<>();

    @h
    public final t1 a() {
        return f22028b.get();
    }

    @g
    public final t1 b() {
        ThreadLocal<t1> threadLocal = f22028b;
        t1 t1Var = threadLocal.get();
        if (t1Var != null) {
            return t1Var;
        }
        t1 a10 = w1.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f22028b.set((Object) null);
    }

    public final void d(@g t1 t1Var) {
        f22028b.set(t1Var);
    }
}
