package na;

import ha.e;
import ha.y;
import ha.z;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import pa.d;

public class c extends y<Timestamp> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f21180b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final y<Date> f21181a;

    public class a implements z {
        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Timestamp.class) {
                return new c(eVar.p(Date.class), (a) null);
            }
            return null;
        }
    }

    public c(y<Date> yVar) {
        this.f21181a = yVar;
    }

    public /* synthetic */ c(y yVar, a aVar) {
        this(yVar);
    }

    /* renamed from: j */
    public Timestamp e(pa.a aVar) throws IOException {
        Date e10 = this.f21181a.e(aVar);
        if (e10 != null) {
            return new Timestamp(e10.getTime());
        }
        return null;
    }

    /* renamed from: k */
    public void i(d dVar, Timestamp timestamp) throws IOException {
        this.f21181a.i(dVar, timestamp);
    }
}
