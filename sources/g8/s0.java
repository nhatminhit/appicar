package g8;

import com.google.android.gms.common.api.internal.q;
import java.lang.ref.WeakReference;

public final class s0 extends f1 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f8270a;

    public s0(q qVar) {
        this.f8270a = new WeakReference(qVar);
    }

    public final void a() {
        q qVar = (q) this.f8270a.get();
        if (qVar != null) {
            q.P(qVar);
        }
    }
}
