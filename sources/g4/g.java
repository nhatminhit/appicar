package g4;

import android.graphics.Bitmap;
import d.m0;
import d.o0;
import t4.k;
import t4.m;
import y3.r;
import y3.v;
import z3.e;

public class g implements v<Bitmap>, r {
    public final Bitmap O;
    public final e P;

    public g(@m0 Bitmap bitmap, @m0 e eVar) {
        this.O = (Bitmap) k.e(bitmap, "Bitmap must not be null");
        this.P = (e) k.e(eVar, "BitmapPool must not be null");
    }

    @o0
    public static g f(@o0 Bitmap bitmap, @m0 e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, eVar);
    }

    public void a() {
        this.P.d(this.O);
    }

    public void b() {
        this.O.prepareToDraw();
    }

    public int c() {
        return m.h(this.O);
    }

    @m0
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @m0
    /* renamed from: e */
    public Bitmap get() {
        return this.O;
    }
}
