package l4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d.m0;
import d.o0;
import g4.z;
import t4.k;
import v3.i;
import y3.v;
import z3.e;

public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f10116a;

    public b(@m0 Context context) {
        this(context.getResources());
    }

    public b(@m0 Resources resources) {
        this.f10116a = (Resources) k.d(resources);
    }

    @Deprecated
    public b(@m0 Resources resources, e eVar) {
        this(resources);
    }

    @o0
    public v<BitmapDrawable> a(@m0 v<Bitmap> vVar, @m0 i iVar) {
        return z.h(this.f10116a, vVar);
    }
}
