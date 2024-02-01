package b9;

import android.graphics.drawable.Drawable;
import d.o0;

public final class j extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f4749a;

    /* renamed from: b  reason: collision with root package name */
    public int f4750b;

    public j(@o0 j jVar) {
        if (jVar != null) {
            this.f4749a = jVar.f4749a;
            this.f4750b = jVar.f4750b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f4749a;
    }

    public final Drawable newDrawable() {
        return new k(this);
    }
}
