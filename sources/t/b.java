package t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import d.o0;
import d.t0;

@t0(21)
public class b implements e {
    public void a(d dVar, float f10) {
        p(dVar).g(f10, dVar.e(), dVar.d());
        n(dVar);
    }

    public float b(d dVar) {
        return j(dVar) * 2.0f;
    }

    public void c(d dVar, @o0 ColorStateList colorStateList) {
        p(dVar).f(colorStateList);
    }

    public float d(d dVar) {
        return dVar.g().getElevation();
    }

    public void e(d dVar) {
        a(dVar, g(dVar));
    }

    public void f(d dVar, float f10) {
        p(dVar).h(f10);
    }

    public float g(d dVar) {
        return p(dVar).c();
    }

    public void h(d dVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        dVar.c(new f(colorStateList, f10));
        View g10 = dVar.g();
        g10.setClipToOutline(true);
        g10.setElevation(f11);
        a(dVar, f12);
    }

    public float i(d dVar) {
        return j(dVar) * 2.0f;
    }

    public float j(d dVar) {
        return p(dVar).d();
    }

    public void k() {
    }

    public void l(d dVar, float f10) {
        dVar.g().setElevation(f10);
    }

    public ColorStateList m(d dVar) {
        return p(dVar).b();
    }

    public void n(d dVar) {
        if (!dVar.e()) {
            dVar.a(0, 0, 0, 0);
            return;
        }
        float g10 = g(dVar);
        float j10 = j(dVar);
        int ceil = (int) Math.ceil((double) g.c(g10, j10, dVar.d()));
        int ceil2 = (int) Math.ceil((double) g.d(g10, j10, dVar.d()));
        dVar.a(ceil, ceil2, ceil, ceil2);
    }

    public void o(d dVar) {
        a(dVar, g(dVar));
    }

    public final f p(d dVar) {
        return (f) dVar.f();
    }
}
