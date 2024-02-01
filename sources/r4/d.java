package r4;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import r4.f;

public class d implements f<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f12105a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12106b;

    public d(int i10, boolean z10) {
        this.f12105a = i10;
        this.f12106b = z10;
    }

    /* renamed from: b */
    public boolean a(Drawable drawable, f.a aVar) {
        Drawable g10 = aVar.g();
        if (g10 == null) {
            g10 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{g10, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f12106b);
        transitionDrawable.startTransition(this.f12105a);
        aVar.c(transitionDrawable);
        return true;
    }
}
