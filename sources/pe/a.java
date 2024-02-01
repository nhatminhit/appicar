package pe;

import be.o;
import fh.g;
import fh.h;
import java.util.List;
import oe.l;
import ve.e;
import xe.l0;

public class a extends l {

    /* renamed from: pe.a$a  reason: collision with other inner class name */
    public static final class C0386a {
        @g

        /* renamed from: a  reason: collision with root package name */
        public static final C0386a f21981a = new C0386a();
        @e
        @h

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f21982b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                pe.a$a r0 = new pe.a$a
                r0.<init>()
                f21981a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f21982b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.a.C0386a.<clinit>():void");
        }
    }

    public void a(@g Throwable th2, @g Throwable th3) {
        l0.p(th2, "cause");
        l0.p(th3, "exception");
        if (e(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }

    @g
    public List<Throwable> d(@g Throwable th2) {
        l0.p(th2, "exception");
        if (!e(19)) {
            return super.d(th2);
        }
        Throwable[] suppressed = th2.getSuppressed();
        l0.o(suppressed, "exception.suppressed");
        return o.t(suppressed);
    }

    public final boolean e(int i10) {
        Integer num = C0386a.f21982b;
        return num == null || num.intValue() >= i10;
    }
}
