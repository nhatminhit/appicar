package pf;

import fh.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import ve.h;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005*\u0010\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001B\u0002\b\t¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lpf/z1;", "d", "(Ljava/util/concurrent/ExecutorService;)Lpf/z1;", "Ljava/util/concurrent/Executor;", "Lpf/o0;", "c", "(Ljava/util/concurrent/Executor;)Lpf/o0;", "b", "Lpf/c2;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b2 {
    @c2
    public static /* synthetic */ void a() {
    }

    @g
    public static final Executor b(@g o0 o0Var) {
        Executor S1;
        z1 z1Var = o0Var instanceof z1 ? (z1) o0Var : null;
        return (z1Var == null || (S1 = z1Var.S1()) == null) ? new l1(o0Var) : S1;
    }

    @g
    @h(name = "from")
    public static final o0 c(@g Executor executor) {
        o0 o0Var;
        l1 l1Var = executor instanceof l1 ? (l1) executor : null;
        return (l1Var == null || (o0Var = l1Var.O) == null) ? new a2(executor) : o0Var;
    }

    @g
    @h(name = "from")
    public static final z1 d(@g ExecutorService executorService) {
        return new a2(executorService);
    }
}
