package zd;

import fh.g;
import fh.h;
import xe.l0;
import xe.w;

public class f0 {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25112a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                zd.h0[] r0 = zd.h0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                zd.h0 r1 = zd.h0.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                zd.h0 r1 = zd.h0.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                zd.h0 r1 = zd.h0.Q     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f25112a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zd.f0.a.<clinit>():void");
        }
    }

    @g
    public static final <T> d0<T> a(@h Object obj, @g we.a<? extends T> aVar) {
        l0.p(aVar, "initializer");
        return new o1(aVar, obj);
    }

    @g
    public static final <T> d0<T> b(@g we.a<? extends T> aVar) {
        l0.p(aVar, "initializer");
        return new o1(aVar, (Object) null, 2, (w) null);
    }

    @g
    public static final <T> d0<T> c(@g h0 h0Var, @g we.a<? extends T> aVar) {
        l0.p(h0Var, "mode");
        l0.p(aVar, "initializer");
        int i10 = a.f25112a[h0Var.ordinal()];
        if (i10 == 1) {
            return new o1(aVar, (Object) null, 2, (w) null);
        }
        if (i10 == 2) {
            return new g1(aVar);
        }
        if (i10 == 3) {
            return new v2(aVar);
        }
        throw new j0();
    }
}
