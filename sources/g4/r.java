package g4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import d.o0;
import java.util.concurrent.locks.Lock;
import y3.v;
import z3.e;
import z3.f;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8008a = "DrawableToBitmap";

    /* renamed from: b  reason: collision with root package name */
    public static final e f8009b = new a();

    public class a extends f {
        public void d(Bitmap bitmap) {
        }
    }

    @o0
    public static v<Bitmap> a(e eVar, Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(eVar, current, i10, i11);
            z10 = true;
        } else {
            bitmap = null;
        }
        if (!z10) {
            eVar = f8009b;
        }
        return g.f(bitmap, eVar);
    }

    @o0
    public static Bitmap b(e eVar, Drawable drawable, int i10, int i11) {
        if (i10 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(f8008a, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to draw ");
                sb2.append(drawable);
                sb2.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i11 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i10 = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i11 = drawable.getIntrinsicHeight();
            }
            Lock i12 = g0.i();
            i12.lock();
            Bitmap f10 = eVar.f(i10, i11, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(f10);
                drawable.setBounds(0, 0, i10, i11);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return f10;
            } finally {
                i12.unlock();
            }
        } else {
            if (Log.isLoggable(f8008a, 5)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to draw ");
                sb3.append(drawable);
                sb3.append(" to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
