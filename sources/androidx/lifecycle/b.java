package androidx.lifecycle;

import android.app.Application;
import fh.g;
import w7.s;
import xe.l0;

public class b extends v0 {
    @g

    /* renamed from: d  reason: collision with root package name */
    public final Application f2778d;

    public b(@g Application application) {
        l0.p(application, s.f14805d);
        this.f2778d = application;
    }

    @g
    public <T extends Application> T g() {
        T t10 = this.f2778d;
        l0.n(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
