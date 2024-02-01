package wf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import w1.a;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\fJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\bJ\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0014J\u000f\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lwf/w;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "Lzd/u2;", "block", "X0", "", "Z0", "P0", "a1", "()V", "", "Y0", "()Z", "isEmpty", "N0", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class w extends y {
    public boolean N0() {
        return false;
    }

    @h
    public y P0() {
        return null;
    }

    public /* bridge */ /* synthetic */ boolean Q0() {
        return ((Boolean) Z0()).booleanValue();
    }

    public final /* synthetic */ <T extends y> void X0(l<? super T, u2> lVar) {
        for (y yVar = (y) I0(); !l0.g(yVar, this); yVar = yVar.J0()) {
            l0.y(3, a.X4);
            if (yVar instanceof y) {
                lVar.A(yVar);
            }
        }
    }

    public final boolean Y0() {
        return I0() == this;
    }

    @g
    public final Void Z0() {
        throw new IllegalStateException("head cannot be removed".toString());
    }

    public final void a1() {
        y yVar = (y) I0();
        w wVar = this;
        while (!l0.g(yVar, this)) {
            y J0 = yVar.J0();
            yVar.W0(wVar, J0);
            wVar = yVar;
            yVar = J0;
        }
        W0(wVar, (y) I0());
    }
}
