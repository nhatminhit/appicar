package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import d.o0;
import d.x0;
import f.a;
import f1.b;
import o0.d;
import s0.c;

@x0({x0.a.Q})
public final class h implements c {
    public static final String Q = "MenuItemImpl";
    public static final int R = 3;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    public static final int V = 8;
    public static final int W = 16;
    public static final int X = 32;
    public static final int Y = 0;
    public Runnable A;
    public MenuItem.OnMenuItemClickListener B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E = null;
    public PorterDuff.Mode F = null;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public int J = 16;
    public int K;
    public View L;
    public b M;
    public MenuItem.OnActionExpandListener N;
    public boolean O = false;
    public ContextMenu.ContextMenuInfo P;

    /* renamed from: l  reason: collision with root package name */
    public final int f964l;

    /* renamed from: m  reason: collision with root package name */
    public final int f965m;

    /* renamed from: n  reason: collision with root package name */
    public final int f966n;

    /* renamed from: o  reason: collision with root package name */
    public final int f967o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f968p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f969q;

    /* renamed from: r  reason: collision with root package name */
    public Intent f970r;

    /* renamed from: s  reason: collision with root package name */
    public char f971s;

    /* renamed from: t  reason: collision with root package name */
    public int f972t = 4096;

    /* renamed from: u  reason: collision with root package name */
    public char f973u;

    /* renamed from: v  reason: collision with root package name */
    public int f974v = 4096;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f975w;

    /* renamed from: x  reason: collision with root package name */
    public int f976x = 0;

    /* renamed from: y  reason: collision with root package name */
    public e f977y;

    /* renamed from: z  reason: collision with root package name */
    public m f978z;

    public class a implements b.C0119b {
        public a() {
        }

        public void onActionProviderVisibilityChanged(boolean z10) {
            h hVar = h.this;
            hVar.f977y.M(hVar);
        }
    }

    public h(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f977y = eVar;
        this.f964l = i11;
        this.f965m = i10;
        this.f966n = i12;
        this.f967o = i13;
        this.f968p = charSequence;
        this.K = i14;
    }

    public static void f(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public void A(m mVar) {
        this.f978z = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 0 : 8) | (i10 & -9);
        this.J = i11;
        return i10 != i11;
    }

    public boolean C() {
        return this.f977y.D();
    }

    public boolean D() {
        return this.f977y.K() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    public b a() {
        return this.M;
    }

    public boolean b() {
        return !d() && !q();
    }

    public c c(b bVar) {
        b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f977y.N(true);
        b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f977y.g(this);
        }
        return false;
    }

    public boolean d() {
        return (this.K & 2) == 2;
    }

    public void e() {
        this.f977y.L(this);
    }

    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f977y.n(this);
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = d.r(drawable).mutate();
            if (this.G) {
                d.o(drawable, this.E);
            }
            if (this.H) {
                d.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View e10 = bVar.e(this);
        this.L = e10;
        return e10;
    }

    public int getAlphabeticModifiers() {
        return this.f974v;
    }

    public char getAlphabeticShortcut() {
        return this.f973u;
    }

    public CharSequence getContentDescription() {
        return this.C;
    }

    public int getGroupId() {
        return this.f965m;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f975w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f976x == 0) {
            return null;
        }
        Drawable d10 = g.a.d(this.f977y.x(), this.f976x);
        this.f976x = 0;
        this.f975w = d10;
        return g(d10);
    }

    public ColorStateList getIconTintList() {
        return this.E;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    public Intent getIntent() {
        return this.f970r;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f964l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    public int getNumericModifiers() {
        return this.f972t;
    }

    public char getNumericShortcut() {
        return this.f971s;
    }

    public int getOrder() {
        return this.f966n;
    }

    public SubMenu getSubMenu() {
        return this.f978z;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f968p;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f969q;
        return charSequence != null ? charSequence : this.f968p;
    }

    public CharSequence getTooltipText() {
        return this.D;
    }

    public Runnable h() {
        return this.A;
    }

    public boolean hasSubMenu() {
        return this.f978z != null;
    }

    public int i() {
        return this.f967o;
    }

    public boolean isActionViewExpanded() {
        return this.O;
    }

    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    public boolean isVisible() {
        b bVar = this.M;
        return (bVar == null || !bVar.h()) ? (this.J & 8) == 0 : (this.J & 8) == 0 && this.M.c();
    }

    public char j() {
        return this.f977y.J() ? this.f973u : this.f971s;
    }

    public String k() {
        int i10;
        char j10 = j();
        if (j10 == 0) {
            return "";
        }
        Resources resources = this.f977y.x().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f977y.x()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(a.l.abc_prepend_shortcut_label));
        }
        int i11 = this.f977y.J() ? this.f974v : this.f972t;
        f(sb2, i11, 65536, resources.getString(a.l.abc_menu_meta_shortcut_label));
        f(sb2, i11, 4096, resources.getString(a.l.abc_menu_ctrl_shortcut_label));
        f(sb2, i11, 2, resources.getString(a.l.abc_menu_alt_shortcut_label));
        f(sb2, i11, 1, resources.getString(a.l.abc_menu_shift_shortcut_label));
        f(sb2, i11, 4, resources.getString(a.l.abc_menu_sym_shortcut_label));
        f(sb2, i11, 8, resources.getString(a.l.abc_menu_function_shortcut_label));
        if (j10 == 8) {
            i10 = a.l.abc_menu_delete_shortcut_label;
        } else if (j10 == 10) {
            i10 = a.l.abc_menu_enter_shortcut_label;
        } else if (j10 != ' ') {
            sb2.append(j10);
            return sb2.toString();
        } else {
            i10 = a.l.abc_menu_space_shortcut_label;
        }
        sb2.append(resources.getString(i10));
        return sb2.toString();
    }

    public CharSequence l(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        b bVar;
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null && (bVar = this.M) != null) {
            this.L = bVar.e(this);
        }
        return this.L != null;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f977y;
        if (eVar.i(eVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f970r != null) {
            try {
                this.f977y.x().startActivity(this.f970r);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    /* renamed from: r */
    public c setActionView(int i10) {
        Context x10 = this.f977y.x();
        setActionView(LayoutInflater.from(x10).inflate(i10, new LinearLayout(x10), false));
        return this;
    }

    /* renamed from: s */
    public c setActionView(View view) {
        int i10;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i10 = this.f964l) > 0) {
            view.setId(i10);
        }
        this.f977y.L(this);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f973u == c10) {
            return this;
        }
        this.f973u = Character.toLowerCase(c10);
        this.f977y.N(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f973u == c10 && this.f974v == i10) {
            return this;
        }
        this.f973u = Character.toLowerCase(c10);
        this.f974v = KeyEvent.normalizeMetaState(i10);
        this.f977y.N(false);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        int i10 = this.J;
        boolean z11 = z10 | (i10 & true);
        this.J = z11 ? 1 : 0;
        if (i10 != z11) {
            this.f977y.N(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        if ((this.J & 4) != 0) {
            this.f977y.a0(this);
        } else {
            v(z10);
        }
        return this;
    }

    public c setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.J = z10 ? this.J | 16 : this.J & -17;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f975w = null;
        this.f976x = i10;
        this.I = true;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f976x = 0;
        this.f975w = drawable;
        this.I = true;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setIconTintList(@o0 ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f970r = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f971s == c10) {
            return this;
        }
        this.f971s = c10;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f971s == c10 && this.f972t == i10) {
            return this;
        }
        this.f971s = c10;
        this.f972t = KeyEvent.normalizeMetaState(i10);
        this.f977y.N(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f971s = c10;
        this.f973u = Character.toLowerCase(c11);
        this.f977y.N(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f971s = c10;
        this.f972t = KeyEvent.normalizeMetaState(i10);
        this.f973u = Character.toLowerCase(c11);
        this.f974v = KeyEvent.normalizeMetaState(i11);
        this.f977y.N(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.K = i10;
            this.f977y.L(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f977y.x().getString(i10));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f968p = charSequence;
        this.f977y.N(false);
        m mVar = this.f978z;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f969q = charSequence;
        this.f977y.N(false);
        return this;
    }

    public c setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f977y.N(false);
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        if (B(z10)) {
            this.f977y.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.O = z10;
        this.f977y.N(false);
    }

    public String toString() {
        CharSequence charSequence = this.f968p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    public void v(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 2 : 0) | (i10 & -3);
        this.J = i11;
        if (i10 != i11) {
            this.f977y.N(false);
        }
    }

    public void w(boolean z10) {
        this.J = (z10 ? 4 : 0) | (this.J & -5);
    }

    public void x(boolean z10) {
        this.J = z10 ? this.J | 32 : this.J & -33;
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    /* renamed from: z */
    public c setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }
}
