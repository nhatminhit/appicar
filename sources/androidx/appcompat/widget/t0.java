package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import d.m0;
import d.x0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@x0({x0.a.Q})
public class t0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1436c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<WeakReference<t0>> f1437d;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f1438a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f1439b;

    public t0(@m0 Context context) {
        super(context);
        if (c1.c()) {
            c1 c1Var = new c1(this, context.getResources());
            this.f1438a = c1Var;
            Resources.Theme newTheme = c1Var.newTheme();
            this.f1439b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1438a = new v0(this, context.getResources());
        this.f1439b = null;
    }

    public static boolean a(@m0 Context context) {
        return !(context instanceof t0) && !(context.getResources() instanceof v0) && !(context.getResources() instanceof c1) && c1.c();
    }

    public static Context b(@m0 Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1436c) {
            ArrayList<WeakReference<t0>> arrayList = f1437d;
            if (arrayList == null) {
                f1437d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1437d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1437d.remove(size);
                    }
                }
                for (int size2 = f1437d.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1437d.get(size2);
                    t0 t0Var = weakReference2 != null ? (t0) weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            t0 t0Var2 = new t0(context);
            f1437d.add(new WeakReference(t0Var2));
            return t0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1438a.getAssets();
    }

    public Resources getResources() {
        return this.f1438a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1439b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f1439b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
