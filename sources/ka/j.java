package ka;

import ha.e;
import ha.w;
import ha.x;
import ha.y;
import ha.z;
import java.io.IOException;
import java.util.ArrayList;
import pa.d;

public final class j extends y<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final z f20026c = k(w.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    public final e f20027a;

    /* renamed from: b  reason: collision with root package name */
    public final x f20028b;

    public class a implements z {
        public final /* synthetic */ x O;

        public a(x xVar) {
            this.O = xVar;
        }

        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Object.class) {
                return new j(eVar, this.O, (a) null);
            }
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20029a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                pa.c[] r0 = pa.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20029a = r0
                pa.c r1 = pa.c.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20029a     // Catch:{ NoSuchFieldError -> 0x001d }
                pa.c r1 = pa.c.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20029a     // Catch:{ NoSuchFieldError -> 0x0028 }
                pa.c r1 = pa.c.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20029a     // Catch:{ NoSuchFieldError -> 0x0033 }
                pa.c r1 = pa.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20029a     // Catch:{ NoSuchFieldError -> 0x003e }
                pa.c r1 = pa.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20029a     // Catch:{ NoSuchFieldError -> 0x0049 }
                pa.c r1 = pa.c.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.j.b.<clinit>():void");
        }
    }

    public j(e eVar, x xVar) {
        this.f20027a = eVar;
        this.f20028b = xVar;
    }

    public /* synthetic */ j(e eVar, x xVar, a aVar) {
        this(eVar, xVar);
    }

    public static z j(x xVar) {
        return xVar == w.DOUBLE ? f20026c : k(xVar);
    }

    public static z k(x xVar) {
        return new a(xVar);
    }

    public Object e(pa.a aVar) throws IOException {
        switch (b.f20029a[aVar.z0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.o()) {
                    arrayList.add(e(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                ja.j jVar = new ja.j();
                aVar.f();
                while (aVar.o()) {
                    jVar.put(aVar.Y(), e(aVar));
                }
                aVar.l();
                return jVar;
            case 3:
                return aVar.k0();
            case 4:
                return this.f20028b.a(aVar);
            case 5:
                return Boolean.valueOf(aVar.A());
            case 6:
                aVar.c0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void i(d dVar, Object obj) throws IOException {
        if (obj == null) {
            dVar.N();
            return;
        }
        y<?> p10 = this.f20027a.p(obj.getClass());
        if (p10 instanceof j) {
            dVar.h();
            dVar.l();
            return;
        }
        p10.i(dVar, obj);
    }
}
