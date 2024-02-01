package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lpf/q1;", "Lpf/o;", "", "cause", "Lzd/u2;", "c", "", "toString", "Lpf/p1;", "O", "Lpf/p1;", "handle", "<init>", "(Lpf/p1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class q1 extends o {
    @g
    public final p1 O;

    public q1(@g p1 p1Var) {
        this.O = p1Var;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        c((Throwable) obj);
        return u2.f25116a;
    }

    public void c(@h Throwable th2) {
        this.O.P();
    }

    @g
    public String toString() {
        return "DisposeOnCancel[" + this.O + ']';
    }
}
