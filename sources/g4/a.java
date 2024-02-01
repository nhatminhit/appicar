package g4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import d.m0;
import java.io.IOException;
import v3.i;
import v3.k;
import y3.v;
import z3.e;

public class a<DataType> implements k<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final k<DataType, Bitmap> f7899a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f7900b;

    public a(Context context, k<DataType, Bitmap> kVar) {
        this(context.getResources(), kVar);
    }

    public a(@m0 Resources resources, @m0 k<DataType, Bitmap> kVar) {
        this.f7900b = (Resources) t4.k.d(resources);
        this.f7899a = (k) t4.k.d(kVar);
    }

    @Deprecated
    public a(Resources resources, e eVar, k<DataType, Bitmap> kVar) {
        this(resources, kVar);
    }

    public v<BitmapDrawable> a(@m0 DataType datatype, int i10, int i11, @m0 i iVar) throws IOException {
        return z.h(this.f7900b, this.f7899a.a(datatype, i10, i11, iVar));
    }

    public boolean b(@m0 DataType datatype, @m0 i iVar) throws IOException {
        return this.f7899a.b(datatype, iVar);
    }
}
