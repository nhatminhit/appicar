package f1;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.x0;

public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    public static final String f7036d = "ActionProvider(support)";

    /* renamed from: a  reason: collision with root package name */
    public final Context f7037a;

    /* renamed from: b  reason: collision with root package name */
    public a f7038b;

    /* renamed from: c  reason: collision with root package name */
    public C0119b f7039c;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void a(boolean z10);
    }

    /* renamed from: f1.b$b  reason: collision with other inner class name */
    public interface C0119b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(Context context) {
        this.f7037a = context;
    }

    public Context a() {
        return this.f7037a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public void g(SubMenu subMenu) {
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f7039c != null && h()) {
            this.f7039c.onActionProviderVisibilityChanged(c());
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f7039c = null;
        this.f7038b = null;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void k(a aVar) {
        this.f7038b = aVar;
    }

    public void l(C0119b bVar) {
        if (!(this.f7039c == null || bVar == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb2.append(getClass().getSimpleName());
            sb2.append(" instance while it is still in use somewhere else?");
        }
        this.f7039c = bVar;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
        a aVar = this.f7038b;
        if (aVar != null) {
            aVar.a(z10);
        }
    }
}
