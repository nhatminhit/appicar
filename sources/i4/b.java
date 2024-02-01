package i4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d.m0;
import k4.c;
import t4.k;
import y3.r;
import y3.v;

public abstract class b<T extends Drawable> implements v<T>, r {
    public final T O;

    public b(T t10) {
        this.O = (Drawable) k.d(t10);
    }

    public void b() {
        Bitmap g10;
        T t10 = this.O;
        if (t10 instanceof BitmapDrawable) {
            g10 = ((BitmapDrawable) t10).getBitmap();
        } else if (t10 instanceof c) {
            g10 = ((c) t10).g();
        } else {
            return;
        }
        g10.prepareToDraw();
    }

    @m0
    /* renamed from: e */
    public final T get() {
        Drawable.ConstantState constantState = this.O.getConstantState();
        return constantState == null ? this.O : constantState.newDrawable();
    }
}
