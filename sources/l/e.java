package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import d.x0;
import s0.a;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class e extends b implements Menu {

    /* renamed from: o  reason: collision with root package name */
    public final a f10093o;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f10093o = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i10) {
        return e(this.f10093o.add(i10));
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return e(this.f10093o.add(i10, i11, i12, i13));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return e(this.f10093o.add(i10, i11, i12, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return e(this.f10093o.add(charSequence));
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f10093o.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr2[i14] = e(menuItemArr3[i14]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i10) {
        return f(this.f10093o.addSubMenu(i10));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return f(this.f10093o.addSubMenu(i10, i11, i12, i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return f(this.f10093o.addSubMenu(i10, i11, i12, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return f(this.f10093o.addSubMenu(charSequence));
    }

    public void clear() {
        g();
        this.f10093o.clear();
    }

    public void close() {
        this.f10093o.close();
    }

    public MenuItem findItem(int i10) {
        return e(this.f10093o.findItem(i10));
    }

    public MenuItem getItem(int i10) {
        return e(this.f10093o.getItem(i10));
    }

    public boolean hasVisibleItems() {
        return this.f10093o.hasVisibleItems();
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f10093o.isShortcutKey(i10, keyEvent);
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return this.f10093o.performIdentifierAction(i10, i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f10093o.performShortcut(i10, keyEvent, i11);
    }

    public void removeGroup(int i10) {
        h(i10);
        this.f10093o.removeGroup(i10);
    }

    public void removeItem(int i10) {
        i(i10);
        this.f10093o.removeItem(i10);
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f10093o.setGroupCheckable(i10, z10, z11);
    }

    public void setGroupEnabled(int i10, boolean z10) {
        this.f10093o.setGroupEnabled(i10, z10);
    }

    public void setGroupVisible(int i10, boolean z10) {
        this.f10093o.setGroupVisible(i10, z10);
    }

    public void setQwertyMode(boolean z10) {
        this.f10093o.setQwertyMode(z10);
    }

    public int size() {
        return this.f10093o.size();
    }
}
