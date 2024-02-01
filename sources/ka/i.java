package ka;

import ha.e;
import ha.u;
import ha.w;
import ha.x;
import ha.y;
import ha.z;
import java.io.IOException;
import pa.c;
import pa.d;

public final class i extends y<Number> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f20023b = k(w.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    public final x f20024a;

    public class a implements z {
        public a() {
        }

        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Number.class) {
                return i.this;
            }
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20025a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                pa.c[] r0 = pa.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20025a = r0
                pa.c r1 = pa.c.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20025a     // Catch:{ NoSuchFieldError -> 0x001d }
                pa.c r1 = pa.c.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20025a     // Catch:{ NoSuchFieldError -> 0x0028 }
                pa.c r1 = pa.c.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ka.i.b.<clinit>():void");
        }
    }

    public i(x xVar) {
        this.f20024a = xVar;
    }

    public static z j(x xVar) {
        return xVar == w.LAZILY_PARSED_NUMBER ? f20023b : k(xVar);
    }

    public static z k(x xVar) {
        return new a();
    }

    /* renamed from: l */
    public Number e(pa.a aVar) throws IOException {
        c z02 = aVar.z0();
        int i10 = b.f20025a[z02.ordinal()];
        if (i10 == 1) {
            aVar.c0();
            return null;
        } else if (i10 == 2 || i10 == 3) {
            return this.f20024a.a(aVar);
        } else {
            throw new u("Expecting number, got: " + z02);
        }
    }

    /* renamed from: m */
    public void i(d dVar, Number number) throws IOException {
        dVar.X0(number);
    }
}
