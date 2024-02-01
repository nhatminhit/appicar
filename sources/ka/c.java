package ka;

import ha.e;
import ha.u;
import ha.y;
import ha.z;
import ja.f;
import ja.l;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import pa.d;

public final class c extends y<Date> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f20008b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<DateFormat> f20009a;

    public class a implements z {
        public <T> y<T> a(e eVar, oa.a<T> aVar) {
            if (aVar.f() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f20009a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (f.e()) {
            arrayList.add(l.e(2, 2));
        }
    }

    public final synchronized Date j(String str) {
        for (DateFormat parse : this.f20009a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return la.a.g(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new u(str, e10);
        }
    }

    /* renamed from: k */
    public Date e(pa.a aVar) throws IOException {
        if (aVar.z0() != pa.c.NULL) {
            return j(aVar.k0());
        }
        aVar.c0();
        return null;
    }

    /* renamed from: l */
    public synchronized void i(d dVar, Date date) throws IOException {
        if (date == null) {
            dVar.N();
        } else {
            dVar.Z0(this.f20009a.get(0).format(date));
        }
    }
}
