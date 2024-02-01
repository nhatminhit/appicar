package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import d.m0;
import java.lang.ref.WeakReference;

public class v0 extends n0 {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<Context> f1485b;

    public v0(@m0 Context context, @m0 Resources resources) {
        super(resources);
        this.f1485b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i10);
        Context context = this.f1485b.get();
        if (!(drawable == null || context == null)) {
            m0.h().x(context, i10, drawable);
        }
        return drawable;
    }
}
