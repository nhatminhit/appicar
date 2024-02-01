package g4;

import android.graphics.drawable.BitmapDrawable;
import d.m0;
import i4.b;
import t4.m;
import y3.r;
import z3.e;

public class c extends b<BitmapDrawable> implements r {
    public final e P;

    public c(BitmapDrawable bitmapDrawable, e eVar) {
        super(bitmapDrawable);
        this.P = eVar;
    }

    public void a() {
        this.P.d(((BitmapDrawable) this.O).getBitmap());
    }

    public void b() {
        ((BitmapDrawable) this.O).getBitmap().prepareToDraw();
    }

    public int c() {
        return m.h(((BitmapDrawable) this.O).getBitmap());
    }

    @m0
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }
}
