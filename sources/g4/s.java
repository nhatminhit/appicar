package g4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b;
import d.m0;
import java.security.MessageDigest;
import v3.m;
import y3.v;
import z3.e;

public class s implements m<Drawable> {

    /* renamed from: c  reason: collision with root package name */
    public final m<Bitmap> f8010c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8011d;

    public s(m<Bitmap> mVar, boolean z10) {
        this.f8010c = mVar;
        this.f8011d = z10;
    }

    public void a(@m0 MessageDigest messageDigest) {
        this.f8010c.a(messageDigest);
    }

    @m0
    public v<Drawable> b(@m0 Context context, @m0 v<Drawable> vVar, int i10, int i11) {
        e g10 = b.d(context).g();
        Drawable drawable = vVar.get();
        v<Bitmap> a10 = r.a(g10, drawable, i10, i11);
        if (a10 != null) {
            v<Bitmap> b10 = this.f8010c.b(context, a10, i10, i11);
            if (!b10.equals(a10)) {
                return d(context, b10);
            }
            b10.a();
            return vVar;
        } else if (!this.f8011d) {
            return vVar;
        } else {
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
    }

    public m<BitmapDrawable> c() {
        return this;
    }

    public final v<Drawable> d(Context context, v<Bitmap> vVar) {
        return z.h(context.getResources(), vVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f8010c.equals(((s) obj).f8010c);
        }
        return false;
    }

    public int hashCode() {
        return this.f8010c.hashCode();
    }
}
