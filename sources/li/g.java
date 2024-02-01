package li;

import android.os.Handler;
import android.os.Looper;
import pc.b;
import pd.a;

public final /* synthetic */ class g implements a.C0385a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f20964a;

    public /* synthetic */ g(b bVar) {
        this.f20964a = bVar;
    }

    public final void c(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new l(this.f20964a, objArr));
    }
}
