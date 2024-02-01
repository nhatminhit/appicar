package n0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.g;
import d.g1;
import d.m0;
import d.o0;
import d.x0;
import k0.d;
import k0.g;
import y0.f;

@SuppressLint({"NewApi"})
public class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f10738a;

    /* renamed from: b  reason: collision with root package name */
    public static final g<String, Typeface> f10739b = new g<>(16);

    @d.x0({x0.a.LIBRARY})
    public static class a extends f.d {
        @o0

        /* renamed from: j  reason: collision with root package name */
        public g.c f10740j;

        public a(@o0 g.c cVar) {
            this.f10740j = cVar;
        }

        public void a(int i10) {
            g.c cVar = this.f10740j;
            if (cVar != null) {
                cVar.d(i10);
            }
        }

        public void b(@m0 Typeface typeface) {
            g.c cVar = this.f10740j;
            if (cVar != null) {
                cVar.e(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f10738a = i10 >= 29 ? new c1() : i10 >= 28 ? new b1() : i10 >= 26 ? new a1() : (i10 < 24 || !z0.m()) ? new y0() : new z0();
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @g1
    public static void a() {
        f10739b.d();
    }

    @m0
    public static Typeface b(@m0 Context context, @o0 Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static Typeface c(@m0 Context context, @o0 CancellationSignal cancellationSignal, @m0 f.c[] cVarArr, int i10) {
        return f10738a.c(context, cancellationSignal, cVarArr, i10);
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static Typeface d(@m0 Context context, @m0 d.a aVar, @m0 Resources resources, int i10, int i11, @o0 g.c cVar, @o0 Handler handler, boolean z10) {
        Typeface typeface;
        d.a aVar2 = aVar;
        g.c cVar2 = cVar;
        Handler handler2 = handler;
        if (aVar2 instanceof d.e) {
            d.e eVar = (d.e) aVar2;
            Typeface i12 = i(eVar.c());
            if (i12 != null) {
                if (cVar2 != null) {
                    cVar2.b(i12, handler2);
                }
                return i12;
            }
            typeface = f.f(context, eVar.b(), i11, !z10 ? cVar2 == null : eVar.a() == 0, z10 ? eVar.d() : -1, g.c.c(handler), new a(cVar2));
            Resources resources2 = resources;
            int i13 = i11;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f10738a.b(context, (d.c) aVar2, resources, i11);
            if (cVar2 != null) {
                if (typeface != null) {
                    cVar2.b(typeface, handler2);
                } else {
                    cVar2.a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f10739b.j(f(resources, i10, i11), typeface);
        }
        return typeface;
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static Typeface e(@m0 Context context, @m0 Resources resources, int i10, String str, int i11) {
        Typeface e10 = f10738a.e(context, resources, i10, str, i11);
        if (e10 != null) {
            f10739b.j(f(resources, i10, i11), e10);
        }
        return e10;
    }

    public static String f(Resources resources, int i10, int i11) {
        return resources.getResourcePackageName(i10) + "-" + i10 + "-" + i11;
    }

    @d.x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static Typeface g(@m0 Resources resources, int i10, int i11) {
        return f10739b.f(f(resources, i10, i11));
    }

    @o0
    public static Typeface h(Context context, Typeface typeface, int i10) {
        d1 d1Var = f10738a;
        d.c i11 = d1Var.i(typeface);
        if (i11 == null) {
            return null;
        }
        return d1Var.b(context, i11, context.getResources(), i10);
    }

    public static Typeface i(@o0 String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
