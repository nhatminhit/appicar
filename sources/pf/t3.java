package pf;

import fh.g;
import fh.h;
import ie.d;
import kotlin.Metadata;
import le.b;
import wf.x0;
import wf.y0;
import xe.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\u0001HHø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"T", "Ljava/lang/ThreadLocal;", "value", "Lpf/s3;", "a", "(Ljava/lang/ThreadLocal;Ljava/lang/Object;)Lpf/s3;", "", "e", "(Ljava/lang/ThreadLocal;Lie/d;)Ljava/lang/Object;", "Lzd/u2;", "c", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class t3 {
    @g
    public static final <T> s3<T> a(@g ThreadLocal<T> threadLocal, T t10) {
        return new x0(t10, threadLocal);
    }

    public static /* synthetic */ s3 b(ThreadLocal threadLocal, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = threadLocal.get();
        }
        return a(threadLocal, obj);
    }

    @h
    public static final Object c(@g ThreadLocal<?> threadLocal, @g d<? super u2> dVar) {
        if (dVar.e().g(new y0(threadLocal)) != null) {
            return u2.f25116a;
        }
        throw new IllegalStateException(("ThreadLocal " + threadLocal + " is missing from context " + dVar.e()).toString());
    }

    public static final Object d(ThreadLocal<?> threadLocal, d<? super u2> dVar) {
        i0.e(3);
        throw null;
    }

    @h
    public static final Object e(@g ThreadLocal<?> threadLocal, @g d<? super Boolean> dVar) {
        return b.a(dVar.e().g(new y0(threadLocal)) != null);
    }

    public static final Object f(ThreadLocal<?> threadLocal, d<? super Boolean> dVar) {
        i0.e(3);
        throw null;
    }
}
