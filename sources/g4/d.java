package g4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d.m0;
import java.security.MessageDigest;
import t4.k;
import v3.m;
import y3.v;

@Deprecated
public class d implements m<BitmapDrawable> {

    /* renamed from: c  reason: collision with root package name */
    public final m<Drawable> f7906c;

    public d(m<Bitmap> mVar) {
        this.f7906c = (m) k.d(new s(mVar, false));
    }

    public static v<BitmapDrawable> c(v<Drawable> vVar) {
        if (vVar.get() instanceof BitmapDrawable) {
            return vVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + vVar.get());
    }

    public static v<Drawable> d(v<BitmapDrawable> vVar) {
        return vVar;
    }

    public void a(@m0 MessageDigest messageDigest) {
        this.f7906c.a(messageDigest);
    }

    @m0
    public v<BitmapDrawable> b(@m0 Context context, @m0 v<BitmapDrawable> vVar, int i10, int i11) {
        return c(this.f7906c.b(context, d(vVar), i10, i11));
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f7906c.equals(((d) obj).f7906c);
        }
        return false;
    }

    public int hashCode() {
        return this.f7906c.hashCode();
    }
}
