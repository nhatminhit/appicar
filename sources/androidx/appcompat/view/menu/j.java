package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import d.m0;
import d.x0;

@x0({x0.a.Q})
public interface j {

    public interface a {
        void b(@m0 e eVar, boolean z10);

        boolean c(@m0 e eVar);
    }

    void b(e eVar, boolean z10);

    void d(boolean z10);

    boolean e();

    boolean f(e eVar, h hVar);

    boolean g(e eVar, h hVar);

    int getId();

    void h(a aVar);

    void i(Context context, e eVar);

    void j(Parcelable parcelable);

    boolean l(m mVar);

    k m(ViewGroup viewGroup);

    Parcelable n();
}
