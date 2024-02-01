package f8;

import com.google.android.gms.common.api.Status;
import d.m0;
import j8.s;
import java.util.concurrent.TimeUnit;

public final class e implements u {
    public final Status O;
    public final o[] P;

    public e(Status status, o[] oVarArr) {
        this.O = status;
        this.P = oVarArr;
    }

    @m0
    public <R extends u> R a(@m0 f<R> fVar) {
        s.b(fVar.f7435a < this.P.length, "The result token does not belong to this batch");
        return this.P[fVar.f7435a].e(0, TimeUnit.MILLISECONDS);
    }

    @m0
    public Status g() {
        return this.O;
    }
}
