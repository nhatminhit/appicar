package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.m;
import d.m0;
import r4.b;
import r4.c;
import r4.g;

public final class i extends m<i, Bitmap> {
    @m0
    public static i t(@m0 g<Bitmap> gVar) {
        return (i) new i().k(gVar);
    }

    @m0
    public static i u() {
        return new i().n();
    }

    @m0
    public static i v(int i10) {
        return new i().p(i10);
    }

    @m0
    public static i w(@m0 c.a aVar) {
        return new i().q(aVar);
    }

    @m0
    public static i x(@m0 c cVar) {
        return new i().r(cVar);
    }

    @m0
    public static i y(@m0 g<Drawable> gVar) {
        return new i().s(gVar);
    }

    @m0
    public i n() {
        return q(new c.a());
    }

    @m0
    public i p(int i10) {
        return q(new c.a(i10));
    }

    @m0
    public i q(@m0 c.a aVar) {
        return s(aVar.a());
    }

    @m0
    public i r(@m0 c cVar) {
        return s(cVar);
    }

    @m0
    public i s(@m0 g<Drawable> gVar) {
        return (i) k(new b(gVar));
    }
}
