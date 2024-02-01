package pf;

import fh.g;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lpf/o1;", "Lpf/p1;", "Lzd/u2;", "P", "", "toString", "Ljava/util/concurrent/Future;", "O", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o1 implements p1 {
    @g
    public final Future<?> O;

    public o1(@g Future<?> future) {
        this.O = future;
    }

    public void P() {
        this.O.cancel(false);
    }

    @g
    public String toString() {
        return "DisposableFutureHandle[" + this.O + ']';
    }
}
