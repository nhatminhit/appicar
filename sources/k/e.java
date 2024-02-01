package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import d.m0;
import d.x0;
import java.lang.ref.WeakReference;
import k.b;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class e extends b implements e.a {
    public Context Q;
    public ActionBarContextView R;
    public b.a S;
    public WeakReference<View> T;
    public boolean U;
    public boolean V;
    public androidx.appcompat.view.menu.e W;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.Q = context;
        this.R = actionBarContextView;
        this.S = aVar;
        androidx.appcompat.view.menu.e Z = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).Z(1);
        this.W = Z;
        Z.X(this);
        this.V = z10;
    }

    public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
        return this.S.a(this, menuItem);
    }

    public void b(@m0 androidx.appcompat.view.menu.e eVar) {
        k();
        this.R.o();
    }

    public void c() {
        if (!this.U) {
            this.U = true;
            this.R.sendAccessibilityEvent(32);
            this.S.d(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.T;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.W;
    }

    public MenuInflater f() {
        return new g(this.R.getContext());
    }

    public CharSequence g() {
        return this.R.getSubtitle();
    }

    public CharSequence i() {
        return this.R.getTitle();
    }

    public void k() {
        this.S.c(this, this.W);
    }

    public boolean l() {
        return this.R.s();
    }

    public boolean m() {
        return this.V;
    }

    public void n(View view) {
        this.R.setCustomView(view);
        this.T = view != null ? new WeakReference<>(view) : null;
    }

    public void o(int i10) {
        p(this.Q.getString(i10));
    }

    public void p(CharSequence charSequence) {
        this.R.setSubtitle(charSequence);
    }

    public void r(int i10) {
        s(this.Q.getString(i10));
    }

    public void s(CharSequence charSequence) {
        this.R.setTitle(charSequence);
    }

    public void t(boolean z10) {
        super.t(z10);
        this.R.setTitleOptional(z10);
    }

    public void u(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }

    public void v(m mVar) {
    }

    public boolean w(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return true;
        }
        new i(this.R.getContext(), mVar).l();
        return true;
    }
}
