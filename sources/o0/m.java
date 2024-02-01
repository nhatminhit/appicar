package o0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import d.m0;
import d.t0;

@t0(21)
public class m extends n {
    public m(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public void f(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    public void getOutline(@m0 Outline outline) {
        t();
        outline.setRoundRect(this.f11021h, c());
    }

    public boolean h() {
        Bitmap bitmap = this.f11014a;
        return bitmap != null && bitmap.hasMipMap();
    }

    public void o(boolean z10) {
        Bitmap bitmap = this.f11014a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z10);
            invalidateSelf();
        }
    }
}
