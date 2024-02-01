package l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.i;
import s0.c;
import s0.d;

public abstract class b {

    /* renamed from: l  reason: collision with root package name */
    public final Context f10079l;

    /* renamed from: m  reason: collision with root package name */
    public i<c, MenuItem> f10080m;

    /* renamed from: n  reason: collision with root package name */
    public i<d, SubMenu> f10081n;

    public b(Context context) {
        this.f10079l = context;
    }

    public final MenuItem e(MenuItem menuItem) {
        if (!(menuItem instanceof c)) {
            return menuItem;
        }
        c cVar = (c) menuItem;
        if (this.f10080m == null) {
            this.f10080m = new i<>();
        }
        MenuItem menuItem2 = this.f10080m.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar2 = new c(this.f10079l, cVar);
        this.f10080m.put(cVar, cVar2);
        return cVar2;
    }

    public final SubMenu f(SubMenu subMenu) {
        if (!(subMenu instanceof d)) {
            return subMenu;
        }
        d dVar = (d) subMenu;
        if (this.f10081n == null) {
            this.f10081n = new i<>();
        }
        SubMenu subMenu2 = this.f10081n.get(dVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f10079l, dVar);
        this.f10081n.put(dVar, gVar);
        return gVar;
    }

    public final void g() {
        i<c, MenuItem> iVar = this.f10080m;
        if (iVar != null) {
            iVar.clear();
        }
        i<d, SubMenu> iVar2 = this.f10081n;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    public final void h(int i10) {
        if (this.f10080m != null) {
            int i11 = 0;
            while (i11 < this.f10080m.size()) {
                if (this.f10080m.m(i11).getGroupId() == i10) {
                    this.f10080m.o(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    public final void i(int i10) {
        if (this.f10080m != null) {
            for (int i11 = 0; i11 < this.f10080m.size(); i11++) {
                if (this.f10080m.m(i11).getItemId() == i10) {
                    this.f10080m.o(i11);
                    return;
                }
            }
        }
    }
}
