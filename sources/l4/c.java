package l4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import d.m0;
import d.o0;
import g4.g;
import v3.i;
import y3.v;
import z3.e;

public final class c implements e<Drawable, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final e f10117a;

    /* renamed from: b  reason: collision with root package name */
    public final e<Bitmap, byte[]> f10118b;

    /* renamed from: c  reason: collision with root package name */
    public final e<k4.c, byte[]> f10119c;

    public c(@m0 e eVar, @m0 e<Bitmap, byte[]> eVar2, @m0 e<k4.c, byte[]> eVar3) {
        this.f10117a = eVar;
        this.f10118b = eVar2;
        this.f10119c = eVar3;
    }

    @m0
    public static v<k4.c> b(@m0 v<Drawable> vVar) {
        return vVar;
    }

    @o0
    public v<byte[]> a(@m0 v<Drawable> vVar, @m0 i iVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f10118b.a(g.f(((BitmapDrawable) drawable).getBitmap(), this.f10117a), iVar);
        }
        if (drawable instanceof k4.c) {
            return this.f10119c.a(b(vVar), iVar);
        }
        return null;
    }
}
