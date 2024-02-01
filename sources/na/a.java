package na;

import ha.e;
import ha.u;
import ha.y;
import ha.z;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import pa.c;
import pa.d;

public final class a extends y<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f21176b = new C0371a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f21177a;

    /* renamed from: na.a$a  reason: collision with other inner class name */
    public class C0371a implements z {
        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new a((C0371a) null);
            }
            return null;
        }
    }

    public a() {
        this.f21177a = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ a(C0371a aVar) {
        this();
    }

    /* renamed from: j */
    public synchronized Date e(pa.a aVar) throws IOException {
        if (aVar.z0() == c.NULL) {
            aVar.c0();
            return null;
        }
        try {
            return new Date(this.f21177a.parse(aVar.k0()).getTime());
        } catch (ParseException e10) {
            throw new u((Throwable) e10);
        }
    }

    /* renamed from: k */
    public synchronized void i(d dVar, Date date) throws IOException {
        dVar.Z0(date == null ? null : this.f21177a.format(date));
    }
}
