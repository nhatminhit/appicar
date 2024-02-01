package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import d.b1;
import f.a;

public class d extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f9822a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f9823b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f9824c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f9825d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f9826e;

    public d() {
        super((Context) null);
    }

    public d(Context context, @b1 int i10) {
        super(context);
        this.f9822a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f9823b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f9826e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f9825d == null) {
            this.f9825d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f9826e == null) {
            Configuration configuration = this.f9825d;
            this.f9826e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f9826e;
    }

    public int c() {
        return this.f9822a;
    }

    public final void d() {
        boolean z10 = this.f9823b == null;
        if (z10) {
            this.f9823b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9823b.setTo(theme);
            }
        }
        e(this.f9823b, this.f9822a, z10);
    }

    public void e(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9824c == null) {
            this.f9824c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9824c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f9823b;
        if (theme != null) {
            return theme;
        }
        if (this.f9822a == 0) {
            this.f9822a = a.m.Theme_AppCompat_Light;
        }
        d();
        return this.f9823b;
    }

    public void setTheme(int i10) {
        if (this.f9822a != i10) {
            this.f9822a = i10;
            d();
        }
    }
}
