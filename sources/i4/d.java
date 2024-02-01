package i4;

import android.graphics.drawable.Drawable;
import d.m0;
import d.o0;
import y3.v;

public final class d extends b<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    @o0
    public static v<Drawable> f(@o0 Drawable drawable) {
        if (drawable != null) {
            return new d(drawable);
        }
        return null;
    }

    public void a() {
    }

    public int c() {
        return Math.max(1, this.O.getIntrinsicWidth() * this.O.getIntrinsicHeight() * 4);
    }

    @m0
    public Class<Drawable> d() {
        return this.O.getClass();
    }
}
