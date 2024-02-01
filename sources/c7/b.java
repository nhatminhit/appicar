package c7;

import android.view.View;
import android.view.ViewGroup;
import b6.n0;
import c7.f;
import d.o0;
import java.io.IOException;
import t7.o;

public interface b {

    public interface a {
        View[] getAdOverlayViews();

        ViewGroup getAdViewGroup();
    }

    /* renamed from: c7.b$b  reason: collision with other inner class name */
    public interface C0079b {
        void a(a aVar);

        void b();

        void c();

        void d(f.a aVar, o oVar);
    }

    void a();

    void b(int i10, int i11, IOException iOException);

    void c(C0079b bVar, a aVar);

    void d(@o0 n0 n0Var);

    void e(int... iArr);

    void stop();
}
