package g8;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.s;

public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final r f8273a;

    public t0(r rVar) {
        this.f8273a = rVar;
    }

    public abstract void a();

    public final void b(s sVar) {
        sVar.O.lock();
        try {
            if (sVar.Y == this.f8273a) {
                a();
            }
        } finally {
            sVar.O.unlock();
        }
    }
}
