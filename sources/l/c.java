package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import d.t0;
import d.x0;
import f1.b;
import java.lang.reflect.Method;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class c extends b implements MenuItem {

    /* renamed from: q  reason: collision with root package name */
    public static final String f10082q = "MenuItemWrapper";

    /* renamed from: o  reason: collision with root package name */
    public final s0.c f10083o;

    /* renamed from: p  reason: collision with root package name */
    public Method f10084p;

    public class a extends f1.b {

        /* renamed from: e  reason: collision with root package name */
        public final ActionProvider f10085e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f10085e = actionProvider;
        }

        public boolean b() {
            return this.f10085e.hasSubMenu();
        }

        public View d() {
            return this.f10085e.onCreateActionView();
        }

        public boolean f() {
            return this.f10085e.onPerformDefaultAction();
        }

        public void g(SubMenu subMenu) {
            this.f10085e.onPrepareSubMenu(c.this.f(subMenu));
        }
    }

    @t0(16)
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: g  reason: collision with root package name */
        public b.C0119b f10087g;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean c() {
            return this.f10085e.isVisible();
        }

        public View e(MenuItem menuItem) {
            return this.f10085e.onCreateActionView(menuItem);
        }

        public boolean h() {
            return this.f10085e.overridesItemVisibility();
        }

        public void i() {
            this.f10085e.refreshVisibility();
        }

        public void l(b.C0119b bVar) {
            this.f10087g = bVar;
            this.f10085e.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            b.C0119b bVar = this.f10087g;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* renamed from: l.c$c  reason: collision with other inner class name */
    public static class C0170c extends FrameLayout implements k.c {
        public final CollapsibleActionView O;

        public C0170c(View view) {
            super(view.getContext());
            this.O = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.O;
        }

        public void onActionViewCollapsed() {
            this.O.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.O.onActionViewExpanded();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f10089a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f10089a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10089a.onMenuItemActionCollapse(c.this.e(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10089a.onMenuItemActionExpand(c.this.e(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f10091a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f10091a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f10091a.onMenuItemClick(c.this.e(menuItem));
        }
    }

    public c(Context context, s0.c cVar) {
        super(context);
        if (cVar != null) {
            this.f10083o = cVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f10083o.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f10083o.expandActionView();
    }

    public ActionProvider getActionProvider() {
        f1.b a10 = this.f10083o.a();
        if (a10 instanceof a) {
            return ((a) a10).f10085e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f10083o.getActionView();
        return actionView instanceof C0170c ? ((C0170c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f10083o.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f10083o.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f10083o.getContentDescription();
    }

    public int getGroupId() {
        return this.f10083o.getGroupId();
    }

    public Drawable getIcon() {
        return this.f10083o.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f10083o.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10083o.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f10083o.getIntent();
    }

    public int getItemId() {
        return this.f10083o.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10083o.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f10083o.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f10083o.getNumericShortcut();
    }

    public int getOrder() {
        return this.f10083o.getOrder();
    }

    public SubMenu getSubMenu() {
        return f(this.f10083o.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f10083o.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f10083o.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f10083o.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f10083o.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f10083o.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f10083o.isCheckable();
    }

    public boolean isChecked() {
        return this.f10083o.isChecked();
    }

    public boolean isEnabled() {
        return this.f10083o.isEnabled();
    }

    public boolean isVisible() {
        return this.f10083o.isVisible();
    }

    public void j(boolean z10) {
        try {
            if (this.f10084p == null) {
                this.f10084p = this.f10083o.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f10084p.invoke(this.f10083o, new Object[]{Boolean.valueOf(z10)});
        } catch (Exception unused) {
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f10079l, actionProvider);
        s0.c cVar = this.f10083o;
        if (actionProvider == null) {
            bVar = null;
        }
        cVar.c(bVar);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f10083o.setActionView(i10);
        View actionView = this.f10083o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f10083o.setActionView((View) new C0170c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0170c(view);
        }
        this.f10083o.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10083o.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10083o.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.f10083o.setCheckable(z10);
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.f10083o.setChecked(z10);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f10083o.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.f10083o.setEnabled(z10);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10083o.setIcon(i10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10083o.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10083o.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10083o.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10083o.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10083o.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10083o.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10083o.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10083o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10083o.setShortcut(c10, c11);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10083o.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f10083o.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f10083o.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f10083o.setTitle(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10083o.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10083o.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f10083o.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        return this.f10083o.setVisible(z10);
    }
}
