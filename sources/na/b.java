package na;

import ha.e;
import ha.u;
import ha.y;
import ha.z;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import pa.c;
import pa.d;

public final class b extends y<Time> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f21178b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f21179a;

    public class a implements z {
        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Time.class) {
                return new b((a) null);
            }
            return null;
        }
    }

    public b() {
        this.f21179a = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* renamed from: j */
    public synchronized Time e(pa.a aVar) throws IOException {
        if (aVar.z0() == c.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Time(this.f21179a.parse(aVar.k0()).getTime());
        } catch (ParseException e10) {
            throw new u((Throwable) e10);
        }
    }

    /* renamed from: k */
    public synchronized void i(d dVar, Time time) throws IOException {
        dVar.Z0(time == null ? null : this.f21179a.format(time));
    }
}
