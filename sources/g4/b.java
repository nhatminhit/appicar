package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d.m0;
import java.io.File;
import v3.c;
import v3.i;
import v3.l;
import y3.v;
import z3.e;

public class b implements l<BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final e f7902a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Bitmap> f7903b;

    public b(e eVar, l<Bitmap> lVar) {
        this.f7902a = eVar;
        this.f7903b = lVar;
    }

    @m0
    public c a(@m0 i iVar) {
        return this.f7903b.a(iVar);
    }

    /* renamed from: c */
    public boolean b(@m0 v<BitmapDrawable> vVar, @m0 File file, @m0 i iVar) {
        return this.f7903b.b(new g(vVar.get().getBitmap(), this.f7902a), file, iVar);
    }
}
