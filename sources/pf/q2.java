package pf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import xe.w;
import zd.a1;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0003R\u001a\u0010\r\u001a\u00020\u00038\u0010X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00038PX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lpf/q2;", "Lpf/v2;", "Lpf/c0;", "", "k", "", "exception", "l", "E1", "P", "Z", "F0", "()Z", "handlesException", "G0", "onCancelComplete", "Lpf/n2;", "parent", "<init>", "(Lpf/n2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public class q2 extends v2 implements c0 {
    public final boolean P = E1();

    public q2(@h n2 n2Var) {
        super(true);
        M0(n2Var);
    }

    public final boolean E1() {
        v2 Y0;
        w I0 = I0();
        x xVar = I0 instanceof x ? (x) I0 : null;
        if (!(xVar == null || (Y0 = xVar.Y0()) == null)) {
            while (!Y0.F0()) {
                w I02 = Y0.I0();
                x xVar2 = I02 instanceof x ? (x) I02 : null;
                if (xVar2 != null) {
                    Y0 = xVar2.Y0();
                    if (Y0 == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean F0() {
        return this.P;
    }

    public boolean G0() {
        return true;
    }

    public boolean k() {
        return V0(u2.f25116a);
    }

    public boolean l(@g Throwable th2) {
        return V0(new e0(th2, false, 2, (w) null));
    }
}
