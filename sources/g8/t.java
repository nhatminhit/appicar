package g8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import f8.o;

public final class t implements o.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f8271a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f8272b;

    public t(v vVar, BasePendingResult basePendingResult) {
        this.f8272b = vVar;
        this.f8271a = basePendingResult;
    }

    public final void a(Status status) {
        this.f8272b.f8280a.remove(this.f8271a);
    }
}
