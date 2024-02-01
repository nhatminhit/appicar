package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c;
import f.a;

public class p0 extends f1.b {

    /* renamed from: k  reason: collision with root package name */
    public static final int f1386k = 4;

    /* renamed from: l  reason: collision with root package name */
    public static final String f1387l = "share_history.xml";

    /* renamed from: e  reason: collision with root package name */
    public int f1388e = 4;

    /* renamed from: f  reason: collision with root package name */
    public final c f1389f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final Context f1390g;

    /* renamed from: h  reason: collision with root package name */
    public String f1391h = f1387l;

    /* renamed from: i  reason: collision with root package name */
    public a f1392i;

    /* renamed from: j  reason: collision with root package name */
    public c.f f1393j;

    public interface a {
        boolean a(p0 p0Var, Intent intent);
    }

    public class b implements c.f {
        public b() {
        }

        public boolean a(c cVar, Intent intent) {
            p0 p0Var = p0.this;
            a aVar = p0Var.f1392i;
            if (aVar == null) {
                return false;
            }
            aVar.a(p0Var, intent);
            return false;
        }
    }

    public class c implements MenuItem.OnMenuItemClickListener {
        public c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            p0 p0Var = p0.this;
            Intent b10 = c.d(p0Var.f1390g, p0Var.f1391h).b(menuItem.getItemId());
            if (b10 == null) {
                return true;
            }
            String action = b10.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                p0.this.r(b10);
            }
            p0.this.f1390g.startActivity(b10);
            return true;
        }
    }

    public p0(Context context) {
        super(context);
        this.f1390g = context;
    }

    public boolean b() {
        return true;
    }

    public View d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1390g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(c.d(this.f1390g, this.f1391h));
        }
        TypedValue typedValue = new TypedValue();
        this.f1390g.getTheme().resolveAttribute(a.c.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(g.a.d(this.f1390g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(a.l.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(a.l.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    public void g(SubMenu subMenu) {
        subMenu.clear();
        c d10 = c.d(this.f1390g, this.f1391h);
        PackageManager packageManager = this.f1390g.getPackageManager();
        int f10 = d10.f();
        int min = Math.min(f10, this.f1388e);
        for (int i10 = 0; i10 < min; i10++) {
            ResolveInfo e10 = d10.e(i10);
            subMenu.add(0, i10, i10, e10.loadLabel(packageManager)).setIcon(e10.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1389f);
        }
        if (min < f10) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1390g.getString(a.l.abc_activity_chooser_view_see_all));
            for (int i11 = 0; i11 < f10; i11++) {
                ResolveInfo e11 = d10.e(i11);
                addSubMenu.add(0, i11, i11, e11.loadLabel(packageManager)).setIcon(e11.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1389f);
            }
        }
    }

    public final void n() {
        if (this.f1392i != null) {
            if (this.f1393j == null) {
                this.f1393j = new b();
            }
            c.d(this.f1390g, this.f1391h).u(this.f1393j);
        }
    }

    public void o(a aVar) {
        this.f1392i = aVar;
        n();
    }

    public void p(String str) {
        this.f1391h = str;
        n();
    }

    public void q(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                r(intent);
            }
        }
        c.d(this.f1390g, this.f1391h).t(intent);
    }

    public void r(Intent intent) {
        intent.addFlags(134742016);
    }
}
