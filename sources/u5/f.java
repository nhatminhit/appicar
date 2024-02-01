package u5;

import i5.d;
import i5.g;
import i5.j;
import java.io.IOException;
import v4.f0;
import w4.l;
import w4.p;

public abstract class f {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13752a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                w4.p[] r0 = w4.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13752a = r0
                w4.p r1 = w4.p.VALUE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x001d }
                w4.p r1 = w4.p.VALUE_NUMBER_INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w4.p r1 = w4.p.VALUE_NUMBER_FLOAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x0033 }
                w4.p r1 = w4.p.VALUE_TRUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13752a     // Catch:{ NoSuchFieldError -> 0x003e }
                w4.p r1 = w4.p.VALUE_FALSE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.f.a.<clinit>():void");
        }
    }

    public static Object a(l lVar, g gVar, j jVar) throws IOException {
        return b(lVar, gVar, jVar.g());
    }

    public static Object b(l lVar, g gVar, Class<?> cls) throws IOException {
        Class<Boolean> cls2 = Boolean.class;
        p P = lVar.P();
        if (P == null) {
            return null;
        }
        int i10 = a.f13752a[P.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && cls.isAssignableFrom(cls2)) {
                            return Boolean.FALSE;
                        }
                    } else if (cls.isAssignableFrom(cls2)) {
                        return Boolean.TRUE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(lVar.m1());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(lVar.N1());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return lVar.Y1();
        }
        return null;
    }

    public abstract Object c(l lVar, g gVar) throws IOException;

    public abstract Object d(l lVar, g gVar) throws IOException;

    public abstract Object e(l lVar, g gVar) throws IOException;

    public abstract Object f(l lVar, g gVar) throws IOException;

    public abstract f g(d dVar);

    public abstract Class<?> h();

    public abstract String i();

    public abstract g j();

    public abstract f0.a k();
}
