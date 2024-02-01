package s0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import d.x0;
import f1.b;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public interface c extends MenuItem {

    /* renamed from: g  reason: collision with root package name */
    public static final int f12616g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f12617h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f12618i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f12619j = 4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f12620k = 8;

    b a();

    boolean b();

    c c(b bVar);

    boolean collapseActionView();

    boolean d();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i10);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c10, int i10);

    /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence);

    c setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c10, int i10);

    MenuItem setShortcut(char c10, char c11, int i10, int i11);

    void setShowAsAction(int i10);

    MenuItem setShowAsActionFlags(int i10);

    /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence);

    c setTooltipText(CharSequence charSequence);
}
