package gc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import gc.b0;
import gc.v;
import java.io.IOException;

public class c0 extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f18989a;

    public c0(Context context) {
        this.f18989a = context;
    }

    public static Bitmap j(Resources resources, int i10, z zVar) {
        BitmapFactory.Options d10 = b0.d(zVar);
        if (b0.g(d10)) {
            BitmapFactory.decodeResource(resources, i10, d10);
            b0.b(zVar.f19169h, zVar.f19170i, d10, zVar);
        }
        return BitmapFactory.decodeResource(resources, i10, d10);
    }

    public boolean c(z zVar) {
        if (zVar.f19166e != 0) {
            return true;
        }
        return "android.resource".equals(zVar.f19165d.getScheme());
    }

    public b0.a f(z zVar, int i10) throws IOException {
        Resources p10 = j0.p(this.f18989a, zVar);
        return new b0.a(j(p10, j0.o(p10, zVar), zVar), v.e.DISK);
    }
}
