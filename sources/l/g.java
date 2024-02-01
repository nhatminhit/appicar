package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.x0;
import s0.d;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class g extends e implements SubMenu {

    /* renamed from: p  reason: collision with root package name */
    public final d f10094p;

    public g(Context context, d dVar) {
        super(context, dVar);
        this.f10094p = dVar;
    }

    public void clearHeader() {
        this.f10094p.clearHeader();
    }

    public MenuItem getItem() {
        return e(this.f10094p.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f10094p.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f10094p.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f10094p.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f10094p.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f10094p.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f10094p.setIcon(i10);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f10094p.setIcon(drawable);
        return this;
    }
}
