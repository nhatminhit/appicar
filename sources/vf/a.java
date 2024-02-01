package vf;

import fh.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import uf.j;
import ve.e;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lvf/a;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "Luf/j;", "O", "Luf/j;", "owner", "<init>", "(Luf/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a extends CancellationException {
    @g
    @e
    public final transient j<?> O;

    public a(@g j<?> jVar) {
        super("Flow was aborted, no more elements needed");
        this.O = jVar;
    }

    @g
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
