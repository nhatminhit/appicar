package pf;

import fh.g;
import ie.i;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ve.e;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lpf/l1;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lzd/u2;", "execute", "", "toString", "Lpf/o0;", "O", "Lpf/o0;", "dispatcher", "<init>", "(Lpf/o0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class l1 implements Executor {
    @g
    @e
    public final o0 O;

    public l1(@g o0 o0Var) {
        this.O = o0Var;
    }

    public void execute(@g Runnable runnable) {
        this.O.N1(i.O, runnable);
    }

    @g
    public String toString() {
        return this.O.toString();
    }
}
