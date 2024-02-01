package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d.m0;
import d.o0;
import i4.e;
import v3.i;
import v3.k;
import y3.v;

public class c0 implements k<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final e f7904a;

    /* renamed from: b  reason: collision with root package name */
    public final z3.e f7905b;

    public c0(e eVar, z3.e eVar2) {
        this.f7904a = eVar;
        this.f7905b = eVar2;
    }

    @o0
    /* renamed from: c */
    public v<Bitmap> a(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        v<Drawable> c10 = this.f7904a.a(uri, i10, i11, iVar);
        if (c10 == null) {
            return null;
        }
        return r.a(this.f7905b, c10.get(), i10, i11);
    }

    /* renamed from: d */
    public boolean b(@m0 Uri uri, @m0 i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
