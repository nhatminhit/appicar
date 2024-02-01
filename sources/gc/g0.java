package gc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gc.v;

public final class g0 extends a<f0> {
    public g0(v vVar, f0 f0Var, z zVar, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(vVar, f0Var, zVar, i10, i11, i12, drawable, str, obj, false);
    }

    public void b(Bitmap bitmap, v.e eVar) {
        if (bitmap != null) {
            f0 f0Var = (f0) k();
            if (f0Var != null) {
                f0Var.a(bitmap, eVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void c() {
        f0 f0Var = (f0) k();
        if (f0Var != null) {
            f0Var.b(this.f18951g != 0 ? this.f18945a.f19122e.getResources().getDrawable(this.f18951g) : this.f18952h);
        }
    }
}
