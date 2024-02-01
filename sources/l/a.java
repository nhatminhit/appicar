package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.o0;
import d.x0;
import f1.b;
import o0.d;
import s0.c;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a implements c {
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 4;
    public static final int I = 8;
    public static final int J = 16;
    public ColorStateList A = null;
    public PorterDuff.Mode B = null;
    public boolean C = false;
    public boolean D = false;
    public int E = 16;

    /* renamed from: l  reason: collision with root package name */
    public final int f10064l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10065m;

    /* renamed from: n  reason: collision with root package name */
    public final int f10066n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f10067o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f10068p;

    /* renamed from: q  reason: collision with root package name */
    public Intent f10069q;

    /* renamed from: r  reason: collision with root package name */
    public char f10070r;

    /* renamed from: s  reason: collision with root package name */
    public int f10071s = 4096;

    /* renamed from: t  reason: collision with root package name */
    public char f10072t;

    /* renamed from: u  reason: collision with root package name */
    public int f10073u = 4096;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f10074v;

    /* renamed from: w  reason: collision with root package name */
    public Context f10075w;

    /* renamed from: x  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f10076x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f10077y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f10078z;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f10075w = context;
        this.f10064l = i11;
        this.f10065m = i10;
        this.f10066n = i13;
        this.f10067o = charSequence;
    }

    public b a() {
        return null;
    }

    public boolean b() {
        return false;
    }

    public c c(b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public final void e() {
        Drawable drawable = this.f10074v;
        if (drawable == null) {
            return;
        }
        if (this.C || this.D) {
            Drawable r10 = d.r(drawable);
            this.f10074v = r10;
            Drawable mutate = r10.mutate();
            this.f10074v = mutate;
            if (this.C) {
                d.o(mutate, this.A);
            }
            if (this.D) {
                d.p(this.f10074v, this.B);
            }
        }
    }

    public boolean expandActionView() {
        return false;
    }

    public boolean f() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f10076x;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f10069q;
        if (intent == null) {
            return false;
        }
        this.f10075w.startActivity(intent);
        return true;
    }

    /* renamed from: g */
    public c setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f10073u;
    }

    public char getAlphabeticShortcut() {
        return this.f10072t;
    }

    public CharSequence getContentDescription() {
        return this.f10077y;
    }

    public int getGroupId() {
        return this.f10065m;
    }

    public Drawable getIcon() {
        return this.f10074v;
    }

    public ColorStateList getIconTintList() {
        return this.A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    public Intent getIntent() {
        return this.f10069q;
    }

    public int getItemId() {
        return this.f10064l;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f10071s;
    }

    public char getNumericShortcut() {
        return this.f10070r;
    }

    public int getOrder() {
        return this.f10066n;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f10067o;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10068p;
        return charSequence != null ? charSequence : this.f10067o;
    }

    public CharSequence getTooltipText() {
        return this.f10078z;
    }

    /* renamed from: h */
    public c setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean hasSubMenu() {
        return false;
    }

    public a i(boolean z10) {
        this.E = (z10 ? 4 : 0) | (this.E & -5);
        return this;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.E & 1) != 0;
    }

    public boolean isChecked() {
        return (this.E & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.E & 16) != 0;
    }

    public boolean isVisible() {
        return (this.E & 8) == 0;
    }

    /* renamed from: j */
    public c setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10072t = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10072t = Character.toLowerCase(c10);
        this.f10073u = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setCheckable(boolean z10) {
        this.E = z10 | (this.E & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z10) {
        this.E = (z10 ? 2 : 0) | (this.E & -3);
        return this;
    }

    public c setContentDescription(CharSequence charSequence) {
        this.f10077y = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z10) {
        this.E = (z10 ? 16 : 0) | (this.E & -17);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10074v = i0.d.i(this.f10075w, i10);
        e();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10074v = drawable;
        e();
        return this;
    }

    public MenuItem setIconTintList(@o0 ColorStateList colorStateList) {
        this.A = colorStateList;
        this.C = true;
        e();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B = mode;
        this.D = true;
        e();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10069q = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10070r = c10;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10070r = c10;
        this.f10071s = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10076x = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10070r = c10;
        this.f10072t = Character.toLowerCase(c11);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10070r = c10;
        this.f10071s = KeyEvent.normalizeMetaState(i10);
        this.f10072t = Character.toLowerCase(c11);
        this.f10073u = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(int i10) {
        this.f10067o = this.f10075w.getResources().getString(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10067o = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10068p = charSequence;
        return this;
    }

    public c setTooltipText(CharSequence charSequence) {
        this.f10078z = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z10) {
        int i10 = 8;
        int i11 = this.E & 8;
        if (z10) {
            i10 = 0;
        }
        this.E = i11 | i10;
        return this;
    }
}
