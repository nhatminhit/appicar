package wf;

import fh.g;
import fh.h;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import we.a;
import xe.i0;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000H\u0000\u001a,\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0005j\u0002`\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000bH\b\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000\"\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015*\f\b\u0000\u0010\u0017\"\u00020\u00052\u00020\u0005¨\u0006\u0018"}, d2 = {"E", "", "Lkotlinx/coroutines/internal/SubscribersList;", "d", "T", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "Lkotlin/Function0;", "action", "e", "(Ljava/util/concurrent/locks/ReentrantLock;Lwe/a;)Ljava/lang/Object;", "", "expectedSize", "", "b", "Ljava/util/concurrent/Executor;", "executor", "", "c", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "REMOVE_FUTURE_ON_CANCEL", "ReentrantLock", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f {
    @h

    /* renamed from: a  reason: collision with root package name */
    public static final Method f24097a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f24097a = method;
    }

    public static /* synthetic */ void a() {
    }

    @g
    public static final <E> Set<E> b(int i10) {
        return Collections.newSetFromMap(new IdentityHashMap(i10));
    }

    public static final boolean c(@g Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f24097a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @g
    public static final <E> List<E> d() {
        return new CopyOnWriteArrayList();
    }

    public static final <T> T e(@g ReentrantLock reentrantLock, @g a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            reentrantLock.unlock();
            i0.c(1);
        }
    }
}
