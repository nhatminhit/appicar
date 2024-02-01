package yf;

import fh.g;
import kotlin.Metadata;
import ve.h;
import yf.a;

@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0005"}, d2 = {"Ljava/lang/Thread;", "thread", "", "a", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b {
    @h(name = "isSchedulerWorker")
    public static final boolean a(@g Thread thread) {
        return thread instanceof a.c;
    }

    @h(name = "mayNotBlock")
    public static final boolean b(@g Thread thread) {
        return (thread instanceof a.c) && ((a.c) thread).P == a.d.CPU_ACQUIRED;
    }
}
