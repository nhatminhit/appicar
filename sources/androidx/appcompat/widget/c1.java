package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import d.m0;
import d.x0;
import java.lang.ref.WeakReference;

@x0({x0.a.Q})
public class c1 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1279b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final int f1280c = 20;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f1281a;

    public c1(@m0 Context context, @m0 Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1281a = new WeakReference<>(context);
    }

    public static boolean a() {
        return f1279b;
    }

    public static void b(boolean z10) {
        f1279b = z10;
    }

    public static boolean c() {
        boolean a10 = a();
        return false;
    }

    public final Drawable d(int i10) {
        return super.getDrawable(i10);
    }

    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Context context = this.f1281a.get();
        return context != null ? m0.h().t(context, this, i10) : super.getDrawable(i10);
    }
}
