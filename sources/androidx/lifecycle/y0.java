package androidx.lifecycle;

import androidx.lifecycle.x0;
import fh.g;
import i2.a;
import i2.h;
import ve.m;
import xe.l0;

public final /* synthetic */ class y0 {
    static {
        x0.b.a aVar = x0.b.f2866a;
    }

    @g
    public static v0 a(x0.b bVar, @g Class cls) {
        l0.p(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @g
    public static v0 b(x0.b bVar, @g Class cls, @g a aVar) {
        l0.p(cls, "modelClass");
        l0.p(aVar, "extras");
        return bVar.a(cls);
    }

    @g
    @m
    public static x0.b c(@g h<?>... hVarArr) {
        return x0.b.f2866a.a(hVarArr);
    }
}
