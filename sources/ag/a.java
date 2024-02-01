package ag;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.o;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lag/a;", "Lpf/o;", "", "cause", "Lzd/u2;", "c", "", "toString", "Lag/i;", "O", "Lag/i;", "segment", "", "P", "I", "index", "<init>", "(Lag/i;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class a extends o {
    @g
    public final i O;
    public final int P;

    public a(@g i iVar, int i10) {
        this.O = iVar;
        this.P = i10;
    }

    public /* bridge */ /* synthetic */ Object A(Object obj) {
        c((Throwable) obj);
        return u2.f25116a;
    }

    public void c(@h Throwable th2) {
        this.O.s(this.P);
    }

    @g
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.O + ", " + this.P + ']';
    }
}
