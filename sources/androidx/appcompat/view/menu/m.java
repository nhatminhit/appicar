package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import d.m0;
import d.x0;

@x0({x0.a.Q})
public class m extends e implements SubMenu {
    public e Q;
    public h R;

    public m(Context context, e eVar, h hVar) {
        super(context);
        this.Q = eVar;
        this.R = hVar;
    }

    public e G() {
        return this.Q.G();
    }

    public boolean I() {
        return this.Q.I();
    }

    public boolean J() {
        return this.Q.J();
    }

    public boolean K() {
        return this.Q.K();
    }

    public void X(e.a aVar) {
        this.Q.X(aVar);
    }

    public boolean g(h hVar) {
        return this.Q.g(hVar);
    }

    public MenuItem getItem() {
        return this.R;
    }

    public boolean i(@m0 e eVar, @m0 MenuItem menuItem) {
        return super.i(eVar, menuItem) || this.Q.i(eVar, menuItem);
    }

    public void j0(boolean z10) {
        this.Q.j0(z10);
    }

    public boolean n(h hVar) {
        return this.Q.n(hVar);
    }

    public Menu n0() {
        return this.Q;
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.Q.setGroupDividerEnabled(z10);
    }

    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.b0(i10);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.c0(drawable);
    }

    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.e0(i10);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.f0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.g0(view);
    }

    public SubMenu setIcon(int i10) {
        this.R.setIcon(i10);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.R.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z10) {
        this.Q.setQwertyMode(z10);
    }

    public String w() {
        h hVar = this.R;
        int itemId = hVar != null ? hVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.w() + ":" + itemId;
    }
}
