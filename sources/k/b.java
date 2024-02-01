package k;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import d.x0;

public abstract class b {
    public Object O;
    public boolean P;

    public interface a {
        boolean a(b bVar, MenuItem menuItem);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, Menu menu);

        void d(b bVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.O;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.P;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public boolean m() {
        return true;
    }

    public abstract void n(View view);

    public abstract void o(int i10);

    public abstract void p(CharSequence charSequence);

    public void q(Object obj) {
        this.O = obj;
    }

    public abstract void r(int i10);

    public abstract void s(CharSequence charSequence);

    public void t(boolean z10) {
        this.P = z10;
    }
}
