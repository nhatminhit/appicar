package f8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f8.u;

public final class g0<R extends u> extends BasePendingResult<R> {

    /* renamed from: r  reason: collision with root package name */
    public final u f7437r;

    public g0(k kVar, u uVar) {
        super(kVar);
        this.f7437r = uVar;
    }

    public final R k(Status status) {
        return this.f7437r;
    }
}
