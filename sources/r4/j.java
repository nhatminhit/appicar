package r4;

import android.view.View;
import r4.f;

public class j<R> implements f<R> {

    /* renamed from: a  reason: collision with root package name */
    public final a f12115a;

    public interface a {
        void a(View view);
    }

    public j(a aVar) {
        this.f12115a = aVar;
    }

    public boolean a(R r10, f.a aVar) {
        if (aVar.d() == null) {
            return false;
        }
        this.f12115a.a(aVar.d());
        return false;
    }
}
