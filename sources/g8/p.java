package g8;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d.m0;
import e8.a;
import f8.k;
import f8.u;

@a
public class p extends BasePendingResult<Status> {
    @Deprecated
    public p(@m0 Looper looper) {
        super(looper);
    }

    @a
    public p(@m0 k kVar) {
        super(kVar);
    }

    @m0
    public final /* bridge */ /* synthetic */ u k(@m0 Status status) {
        return status;
    }
}
