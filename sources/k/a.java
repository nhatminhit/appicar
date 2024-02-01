package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import d.x0;
import f.a;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f9821a;

    public a(Context context) {
        this.f9821a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f9821a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f9821a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f9821a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f9821a.getResources().getDimensionPixelSize(a.f.abc_action_bar_stacked_tab_max_width);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f9821a.obtainStyledAttributes((AttributeSet) null, a.n.ActionBar, a.c.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.n.ActionBar_height, 0);
        Resources resources = this.f9821a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.f.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f9821a.getResources().getBoolean(a.d.abc_action_bar_embed_tabs);
    }

    public boolean h() {
        return true;
    }
}
