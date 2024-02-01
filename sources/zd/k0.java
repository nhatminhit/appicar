package zd;

import fh.g;
import xe.l0;
import xe.w;

public final class k0 extends Error {
    public k0() {
        this((String) null, 1, (w) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k0(@g String str) {
        super(str);
        l0.p(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(String str, int i10, w wVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
