package g4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.b;
import d.m0;
import d.o0;
import t4.k;
import y3.r;
import y3.v;
import z3.e;

public final class z implements v<BitmapDrawable>, r {
    public final Resources O;
    public final v<Bitmap> P;

    public z(@m0 Resources resources, @m0 v<Bitmap> vVar) {
        this.O = (Resources) k.d(resources);
        this.P = (v) k.d(vVar);
    }

    @Deprecated
    public static z f(Context context, Bitmap bitmap) {
        return (z) h(context.getResources(), g.f(bitmap, b.d(context).g()));
    }

    @Deprecated
    public static z g(Resources resources, e eVar, Bitmap bitmap) {
        return (z) h(resources, g.f(bitmap, eVar));
    }

    @o0
    public static v<BitmapDrawable> h(@m0 Resources resources, @o0 v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new z(resources, vVar);
    }

    public void a() {
        this.P.a();
    }

    public void b() {
        v<Bitmap> vVar = this.P;
        if (vVar instanceof r) {
            ((r) vVar).b();
        }
    }

    public int c() {
        return this.P.c();
    }

    @m0
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @m0
    /* renamed from: e */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.O, this.P.get());
    }
}
