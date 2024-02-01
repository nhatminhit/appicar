package f1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import s0.a;

public final class q {
    @SuppressLint({"NewApi"})
    public static void a(Menu menu, boolean z10) {
        if (menu instanceof a) {
            ((a) menu).setGroupDividerEnabled(z10);
        } else if (Build.VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z10);
        }
    }

    @Deprecated
    public static void b(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }
}
