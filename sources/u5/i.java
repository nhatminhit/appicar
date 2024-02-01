package u5;

import g5.c;
import i5.d;
import java.io.IOException;
import v4.f0;
import w4.p;

public abstract class i {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13753a;

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
                v4.f0$a[] r0 = v4.f0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13753a = r0
                v4.f0$a r1 = v4.f0.a.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13753a     // Catch:{ NoSuchFieldError -> 0x001d }
                v4.f0$a r1 = v4.f0.a.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13753a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v4.f0$a r1 = v4.f0.a.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13753a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v4.f0$a r1 = v4.f0.a.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13753a     // Catch:{ NoSuchFieldError -> 0x003e }
                v4.f0$a r1 = v4.f0.a.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u5.i.a.<clinit>():void");
        }
    }

    public final void a(w4.i iVar, c cVar) throws IOException {
        cVar.f8045g = !iVar.w();
        v(iVar, cVar);
    }

    public abstract i b(d dVar);

    public abstract String c();

    public abstract g d();

    public abstract f0.a e();

    public c f(Object obj, Class<?> cls, p pVar) {
        c g10 = g(obj, pVar);
        g10.f8040b = cls;
        return g10;
    }

    public c g(Object obj, p pVar) {
        c.a aVar;
        c.a aVar2;
        c cVar = new c(obj, pVar);
        int i10 = a.f13753a[e().ordinal()];
        if (i10 == 1) {
            aVar = c.a.PAYLOAD_PROPERTY;
        } else if (i10 == 2) {
            aVar = c.a.PARENT_PROPERTY;
        } else if (i10 != 3) {
            if (i10 == 4) {
                aVar2 = c.a.WRAPPER_ARRAY;
            } else if (i10 != 5) {
                h5.p.f();
                return cVar;
            } else {
                aVar2 = c.a.WRAPPER_OBJECT;
            }
            cVar.f8043e = aVar2;
            return cVar;
        } else {
            aVar = c.a.METADATA_PROPERTY;
        }
        cVar.f8043e = aVar;
        cVar.f8042d = c();
        return cVar;
    }

    public c h(Object obj, p pVar, Object obj2) {
        c g10 = g(obj, pVar);
        g10.f8041c = obj2;
        return g10;
    }

    @Deprecated
    public void i(Object obj, w4.i iVar, String str) throws IOException {
        o(iVar, h(obj, p.START_ARRAY, str));
    }

    @Deprecated
    public void j(Object obj, w4.i iVar, String str) throws IOException {
        o(iVar, h(obj, p.START_OBJECT, str));
    }

    @Deprecated
    public void k(Object obj, w4.i iVar, String str) throws IOException {
        o(iVar, h(obj, p.VALUE_STRING, str));
    }

    @Deprecated
    public void l(Object obj, w4.i iVar, String str) throws IOException {
        a(iVar, h(obj, p.START_ARRAY, str));
    }

    @Deprecated
    public void m(Object obj, w4.i iVar, String str) throws IOException {
        a(iVar, h(obj, p.START_OBJECT, str));
    }

    @Deprecated
    public void n(Object obj, w4.i iVar, String str) throws IOException {
        a(iVar, h(obj, p.VALUE_STRING, str));
    }

    public abstract c o(w4.i iVar, c cVar) throws IOException;

    @Deprecated
    public void p(Object obj, w4.i iVar) throws IOException {
        o(iVar, g(obj, p.START_ARRAY));
    }

    @Deprecated
    public void q(Object obj, w4.i iVar, Class<?> cls) throws IOException {
        o(iVar, f(obj, cls, p.START_ARRAY));
    }

    @Deprecated
    public void r(Object obj, w4.i iVar) throws IOException {
        o(iVar, g(obj, p.START_OBJECT));
    }

    @Deprecated
    public void s(Object obj, w4.i iVar, Class<?> cls) throws IOException {
        o(iVar, f(obj, cls, p.START_OBJECT));
    }

    @Deprecated
    public void t(Object obj, w4.i iVar) throws IOException {
        o(iVar, g(obj, p.VALUE_STRING));
    }

    @Deprecated
    public void u(Object obj, w4.i iVar, Class<?> cls) throws IOException {
        o(iVar, f(obj, cls, p.VALUE_STRING));
    }

    public abstract c v(w4.i iVar, c cVar) throws IOException;

    @Deprecated
    public void w(Object obj, w4.i iVar) throws IOException {
        a(iVar, g(obj, p.START_ARRAY));
    }

    @Deprecated
    public void x(Object obj, w4.i iVar) throws IOException {
        a(iVar, g(obj, p.START_OBJECT));
    }

    @Deprecated
    public void y(Object obj, w4.i iVar) throws IOException {
        a(iVar, g(obj, p.VALUE_STRING));
    }
}
