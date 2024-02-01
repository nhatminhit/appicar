package vb;

import qa.t;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f23593a;

    public i(boolean z10) {
        this.f23593a = z10;
    }

    public void a(t[] tVarArr) {
        if (this.f23593a && tVarArr != null && tVarArr.length >= 3) {
            t tVar = tVarArr[0];
            tVarArr[0] = tVarArr[2];
            tVarArr[2] = tVar;
        }
    }

    public boolean b() {
        return this.f23593a;
    }
}
