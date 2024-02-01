package z3;

import android.graphics.Bitmap;
import d.m0;

public class f implements e {
    public void a(int i10) {
    }

    public void b() {
    }

    public void c(float f10) {
    }

    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    public long e() {
        return 0;
    }

    @m0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @m0
    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        return f(i10, i11, config);
    }
}
