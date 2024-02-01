package f1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import s0.c;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7062a = "MenuItemCompat";
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final int f7063b = 0;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final int f7064c = 1;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final int f7065d = 2;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final int f7066e = 4;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final int f7067f = 8;

    public class a implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f7068a;

        public a(b bVar) {
            this.f7068a = bVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f7068a.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f7068a.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    public interface b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static b c(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).a();
        }
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }

    public static CharSequence f(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }

    public static ColorStateList g(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }

    public static PorterDuff.Mode h(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }

    public static int i(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }

    public static CharSequence j(MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem l(MenuItem menuItem, b bVar) {
        return menuItem instanceof c ? ((c) menuItem).c(bVar) : menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i10) {
        return menuItem.setActionView(i10);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof c) {
            ((c) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setAlphabeticShortcut(c10, i10);
        }
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof c) {
            ((c) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setContentDescription(charSequence);
        }
    }

    public static void q(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof c) {
            ((c) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setIconTintList(colorStateList);
        }
    }

    public static void r(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof c) {
            ((c) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setIconTintMode(mode);
        }
    }

    public static void s(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof c) {
            ((c) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setNumericShortcut(c10, i10);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, b bVar) {
        return menuItem.setOnActionExpandListener(new a(bVar));
    }

    public static void u(MenuItem menuItem, char c10, char c11, int i10, int i11) {
        if (menuItem instanceof c) {
            ((c) menuItem).setShortcut(c10, c11, i10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setShortcut(c10, c11, i10, i11);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }

    public static void w(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof c) {
            ((c) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            MenuItem unused = menuItem.setTooltipText(charSequence);
        }
    }
}
