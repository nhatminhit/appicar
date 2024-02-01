package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.x0;
import androidx.appcompat.widget.z;
import d.m0;
import d.o0;
import f1.w1;
import java.util.ArrayList;
import k.k;

public class l extends a {

    /* renamed from: i  reason: collision with root package name */
    public z f844i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f845j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f846k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f847l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f848m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<a.d> f849n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f850o = new a();

    /* renamed from: p  reason: collision with root package name */
    public final Toolbar.f f851p;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            l.this.G0();
        }
    }

    public class b implements Toolbar.f {
        public b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return l.this.f846k.onMenuItemSelected(0, menuItem);
        }
    }

    public final class c implements j.a {
        public boolean O;

        public c() {
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (!this.O) {
                this.O = true;
                l.this.f844i.o();
                Window.Callback callback = l.this.f846k;
                if (callback != null) {
                    callback.onPanelClosed(108, eVar);
                }
                this.O = false;
            }
        }

        public boolean c(@m0 androidx.appcompat.view.menu.e eVar) {
            Window.Callback callback = l.this.f846k;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, eVar);
            return true;
        }
    }

    public final class d implements e.a {
        public d() {
        }

        public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
            return false;
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar) {
            l lVar = l.this;
            if (lVar.f846k == null) {
                return;
            }
            if (lVar.f844i.f()) {
                l.this.f846k.onPanelClosed(108, eVar);
            } else if (l.this.f846k.onPreparePanel(0, (View) null, eVar)) {
                l.this.f846k.onMenuOpened(108, eVar);
            }
        }
    }

    public class e extends k {
        public e(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i10) {
            return i10 == 0 ? new View(l.this.f844i.e()) : super.onCreatePanelView(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (onPreparePanel) {
                l lVar = l.this;
                if (!lVar.f845j) {
                    lVar.f844i.g();
                    l.this.f845j = true;
                }
            }
            return onPreparePanel;
        }
    }

    public l(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f851p = bVar;
        this.f844i = new x0(toolbar, false);
        e eVar = new e(callback);
        this.f846k = eVar;
        this.f844i.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f844i.setWindowTitle(charSequence);
    }

    public Context A() {
        return this.f844i.e();
    }

    public void A0(CharSequence charSequence) {
        this.f844i.setTitle(charSequence);
    }

    public CharSequence B() {
        return this.f844i.getTitle();
    }

    public void B0(CharSequence charSequence) {
        this.f844i.setWindowTitle(charSequence);
    }

    public void C() {
        this.f844i.setVisibility(8);
    }

    public void C0() {
        this.f844i.setVisibility(0);
    }

    public boolean D() {
        this.f844i.I().removeCallbacks(this.f850o);
        w1.n1(this.f844i.I(), this.f850o);
        return true;
    }

    public final Menu E0() {
        if (!this.f847l) {
            this.f844i.H(new c(), new d());
            this.f847l = true;
        }
        return this.f844i.A();
    }

    public boolean F() {
        return this.f844i.d() == 0;
    }

    public Window.Callback F0() {
        return this.f846k;
    }

    public boolean G() {
        return super.G();
    }

    public void G0() {
        Menu E0 = E0();
        androidx.appcompat.view.menu.e eVar = E0 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) E0 : null;
        if (eVar != null) {
            eVar.m0();
        }
        try {
            E0.clear();
            if (!this.f846k.onCreatePanelMenu(0, E0) || !this.f846k.onPreparePanel(0, (View) null, E0)) {
                E0.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.l0();
            }
        }
    }

    public a.f H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void I(Configuration configuration) {
        super.I(configuration);
    }

    public void J() {
        this.f844i.I().removeCallbacks(this.f850o);
    }

    public boolean K(int i10, KeyEvent keyEvent) {
        Menu E0 = E0();
        if (E0 == null) {
            return false;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z10 = false;
        }
        E0.setQwertyMode(z10);
        return E0.performShortcut(i10, keyEvent, 0);
    }

    public boolean L(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            M();
        }
        return true;
    }

    public boolean M() {
        return this.f844i.m();
    }

    public void N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void O(a.d dVar) {
        this.f849n.remove(dVar);
    }

    public void P(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void Q(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public boolean R() {
        ViewGroup I = this.f844i.I();
        if (I == null || I.hasFocus()) {
            return false;
        }
        I.requestFocus();
        return true;
    }

    public void S(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void T(@o0 Drawable drawable) {
        this.f844i.b(drawable);
    }

    public void U(int i10) {
        V(LayoutInflater.from(this.f844i.e()).inflate(i10, this.f844i.I(), false));
    }

    public void V(View view) {
        W(view, new a.b(-2, -2));
    }

    public void W(View view, a.b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f844i.Q(view);
    }

    public void X(boolean z10) {
    }

    public void Y(boolean z10) {
        a0(z10 ? 4 : 0, 4);
    }

    @SuppressLint({"WrongConstant"})
    public void Z(int i10) {
        a0(i10, -1);
    }

    public void a0(int i10, int i11) {
        this.f844i.u((i10 & i11) | ((~i11) & this.f844i.N()));
    }

    public void b0(boolean z10) {
        a0(z10 ? 16 : 0, 16);
    }

    public void c0(boolean z10) {
        a0(z10 ? 2 : 0, 2);
    }

    public void d0(boolean z10) {
        a0(z10 ? 8 : 0, 8);
    }

    public void e0(boolean z10) {
        a0(z10 ? 1 : 0, 1);
    }

    public void f0(float f10) {
        w1.L1(this.f844i.I(), f10);
    }

    public void g(a.d dVar) {
        this.f849n.add(dVar);
    }

    public void h(a.f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void i(a.f fVar, int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void i0(int i10) {
        this.f844i.P(i10);
    }

    public void j(a.f fVar, int i10, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void j0(CharSequence charSequence) {
        this.f844i.v(charSequence);
    }

    public void k(a.f fVar, boolean z10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void k0(int i10) {
        this.f844i.G(i10);
    }

    public boolean l() {
        return this.f844i.l();
    }

    public void l0(Drawable drawable) {
        this.f844i.U(drawable);
    }

    public boolean m() {
        if (!this.f844i.s()) {
            return false;
        }
        this.f844i.collapseActionView();
        return true;
    }

    public void m0(boolean z10) {
    }

    public void n(boolean z10) {
        if (z10 != this.f848m) {
            this.f848m = z10;
            int size = this.f849n.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f849n.get(i10).onMenuVisibilityChanged(z10);
            }
        }
    }

    public void n0(int i10) {
        this.f844i.setIcon(i10);
    }

    public View o() {
        return this.f844i.p();
    }

    public void o0(Drawable drawable) {
        this.f844i.setIcon(drawable);
    }

    public int p() {
        return this.f844i.N();
    }

    public void p0(SpinnerAdapter spinnerAdapter, a.e eVar) {
        this.f844i.K(spinnerAdapter, new j(eVar));
    }

    public float q() {
        return w1.P(this.f844i.I());
    }

    public void q0(int i10) {
        this.f844i.setLogo(i10);
    }

    public int r() {
        return this.f844i.a();
    }

    public void r0(Drawable drawable) {
        this.f844i.r(drawable);
    }

    public void s0(int i10) {
        if (i10 != 2) {
            this.f844i.F(i10);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    public int t() {
        return 0;
    }

    public void t0(int i10) {
        if (this.f844i.C() == 1) {
            this.f844i.z(i10);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    public int u() {
        return 0;
    }

    public void u0(boolean z10) {
    }

    public int v() {
        return -1;
    }

    public void v0(Drawable drawable) {
    }

    public a.f w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void w0(Drawable drawable) {
    }

    public CharSequence x() {
        return this.f844i.M();
    }

    public void x0(int i10) {
        z zVar = this.f844i;
        zVar.w(i10 != 0 ? zVar.e().getText(i10) : null);
    }

    public a.f y(int i10) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    public void y0(CharSequence charSequence) {
        this.f844i.w(charSequence);
    }

    public int z() {
        return 0;
    }

    public void z0(int i10) {
        z zVar = this.f844i;
        zVar.setTitle(i10 != 0 ? zVar.e().getText(i10) : null);
    }
}
