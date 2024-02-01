package k4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.b;
import d.m0;
import g4.g;
import java.security.MessageDigest;
import v3.m;
import y3.v;

public class f implements m<c> {

    /* renamed from: c  reason: collision with root package name */
    public final m<Bitmap> f9986c;

    /* JADX WARNING: type inference failed for: r1v0, types: [v3.m<android.graphics.Bitmap>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(v3.m<android.graphics.Bitmap> r1) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = t4.k.d(r1)
            v3.m r1 = (v3.m) r1
            r0.f9986c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.f.<init>(v3.m):void");
    }

    public void a(@m0 MessageDigest messageDigest) {
        this.f9986c.a(messageDigest);
    }

    @m0
    public v<c> b(@m0 Context context, @m0 v<c> vVar, int i10, int i11) {
        c cVar = vVar.get();
        g gVar = new g(cVar.g(), b.d(context).g());
        v<Bitmap> b10 = this.f9986c.b(context, gVar, i10, i11);
        if (!gVar.equals(b10)) {
            gVar.a();
        }
        cVar.q(this.f9986c, b10.get());
        return vVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f9986c.equals(((f) obj).f9986c);
        }
        return false;
    }

    public int hashCode() {
        return this.f9986c.hashCode();
    }
}
