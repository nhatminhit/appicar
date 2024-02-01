package f8;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f8.u;

public final class f0<R extends u> extends BasePendingResult<R> {

    /* renamed from: r  reason: collision with root package name */
    public final u f7436r;

    public f0(u uVar) {
        super(Looper.getMainLooper());
        this.f7436r = uVar;
    }

    public final R k(Status status) {
        if (status.f1() == this.f7436r.g().f1()) {
            return this.f7436r;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
