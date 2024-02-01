package g8;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import f8.a;
import g8.q;
import h9.n;

public final class a2 extends q {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q.a f8184d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a2(q.a aVar, Feature[] featureArr, boolean z10, int i10) {
        super(featureArr, z10, i10);
        this.f8184d = aVar;
    }

    public final void b(a.b bVar, n nVar) throws RemoteException {
        this.f8184d.f8261a.accept(bVar, nVar);
    }
}
