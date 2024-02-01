package pf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import ve.e;
import wf.n0;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lpf/z3;", "U", "T", "Lwf/n0;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "Lzd/u2;", "run", "", "a1", "()Ljava/lang/String;", "", "R", "J", "time", "Lie/d;", "uCont", "<init>", "(JLie/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class z3<U, T extends U> extends n0<T> implements Runnable {
    @e
    public final long R;

    public z3(long j10, @g d<? super U> dVar) {
        super(dVar.e(), dVar);
        this.R = j10;
    }

    @g
    public String a1() {
        return super.a1() + "(timeMillis=" + this.R + ')';
    }

    public void run() {
        i0(a4.a(this.R, this));
    }
}
