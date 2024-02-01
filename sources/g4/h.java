package g4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import d.m0;
import v3.m;
import y3.v;
import z3.e;

public abstract class h implements m<Bitmap> {
    @m0
    public final v<Bitmap> b(@m0 Context context, @m0 v<Bitmap> vVar, int i10, int i11) {
        if (t4.m.v(i10, i11)) {
            e g10 = b.d(context).g();
            Bitmap bitmap = vVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(g10, bitmap, i10, i11);
            return bitmap.equals(c10) ? vVar : g.f(c10, g10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11);
}
