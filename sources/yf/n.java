package yf;

import fh.g;
import kotlin.Metadata;
import pf.z0;
import ve.e;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lyf/n;", "Lyf/k;", "Lzd/u2;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Q", "Ljava/lang/Runnable;", "block", "", "submissionTime", "Lyf/l;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLyf/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n extends k {
    @g
    @e
    public final Runnable Q;

    public n(@g Runnable runnable, long j10, @g l lVar) {
        super(j10, lVar);
        this.Q = runnable;
    }

    public void run() {
        try {
            this.Q.run();
        } finally {
            this.P.c0();
        }
    }

    @g
    public String toString() {
        return "Task[" + z0.a(this.Q) + '@' + z0.b(this.Q) + ", " + this.O + ", " + this.P + ']';
    }
}
