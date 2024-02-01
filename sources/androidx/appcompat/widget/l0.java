package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import d.b1;
import d.k0;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import k.g;
import l.f;

public class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1347a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f1348b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1349c;

    /* renamed from: d  reason: collision with root package name */
    public final i f1350d;

    /* renamed from: e  reason: collision with root package name */
    public e f1351e;

    /* renamed from: f  reason: collision with root package name */
    public d f1352f;

    /* renamed from: g  reason: collision with root package name */
    public View.OnTouchListener f1353g;

    public class a implements e.a {
        public a() {
        }

        public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
            e eVar2 = l0.this.f1351e;
            if (eVar2 != null) {
                return eVar2.onMenuItemClick(menuItem);
            }
            return false;
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar) {
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        public void onDismiss() {
            l0 l0Var = l0.this;
            d dVar = l0Var.f1352f;
            if (dVar != null) {
                dVar.a(l0Var);
            }
        }
    }

    public class c extends e0 {
        public c(View view) {
            super(view);
        }

        public f b() {
            return l0.this.f1350d.e();
        }

        public boolean c() {
            l0.this.k();
            return true;
        }

        public boolean d() {
            l0.this.a();
            return true;
        }
    }

    public interface d {
        void a(l0 l0Var);
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public l0(@m0 Context context, @m0 View view) {
        this(context, view, 0);
    }

    public l0(@m0 Context context, @m0 View view, int i10) {
        this(context, view, i10, a.c.popupMenuStyle, 0);
    }

    public l0(@m0 Context context, @m0 View view, int i10, @d.f int i11, @b1 int i12) {
        this.f1347a = context;
        this.f1349c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f1348b = eVar;
        eVar.X(new a());
        i iVar = new i(context, eVar, view, false, i11, i12);
        this.f1350d = iVar;
        iVar.j(i10);
        iVar.k(new b());
    }

    public void a() {
        this.f1350d.dismiss();
    }

    @m0
    public View.OnTouchListener b() {
        if (this.f1353g == null) {
            this.f1353g = new c(this.f1349c);
        }
        return this.f1353g;
    }

    public int c() {
        return this.f1350d.c();
    }

    @m0
    public Menu d() {
        return this.f1348b;
    }

    @m0
    public MenuInflater e() {
        return new g(this.f1347a);
    }

    @x0({x0.a.Q})
    public ListView f() {
        if (!this.f1350d.f()) {
            return null;
        }
        return this.f1350d.d();
    }

    public void g(@k0 int i10) {
        e().inflate(i10, this.f1348b);
    }

    public void h(int i10) {
        this.f1350d.j(i10);
    }

    public void i(@o0 d dVar) {
        this.f1352f = dVar;
    }

    public void j(@o0 e eVar) {
        this.f1351e = eVar;
    }

    public void k() {
        this.f1350d.l();
    }
}
