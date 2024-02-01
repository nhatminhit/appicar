package p0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import d.m0;
import d.o0;
import java.util.WeakHashMap;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, a> f11352b = new WeakHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final String f11353c = "android.hardware.display.category.PRESENTATION";

    /* renamed from: a  reason: collision with root package name */
    public final Context f11354a;

    public a(Context context) {
        this.f11354a = context;
    }

    @m0
    public static a d(@m0 Context context) {
        a aVar;
        WeakHashMap<Context, a> weakHashMap = f11352b;
        synchronized (weakHashMap) {
            aVar = weakHashMap.get(context);
            if (aVar == null) {
                aVar = new a(context);
                weakHashMap.put(context, aVar);
            }
        }
        return aVar;
    }

    @o0
    public Display a(int i10) {
        return ((DisplayManager) this.f11354a.getSystemService("display")).getDisplay(i10);
    }

    @m0
    public Display[] b() {
        return ((DisplayManager) this.f11354a.getSystemService("display")).getDisplays();
    }

    @m0
    public Display[] c(@o0 String str) {
        return ((DisplayManager) this.f11354a.getSystemService("display")).getDisplays(str);
    }
}
