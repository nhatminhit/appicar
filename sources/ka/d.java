package ka;

import ha.u;
import ha.y;
import ha.z;
import ja.f;
import ja.l;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import pa.c;

public final class d<T extends Date> extends y<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final String f20010c = "DefaultDateTypeAdapter";

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f20011a;

    /* renamed from: b  reason: collision with root package name */
    public final List<DateFormat> f20012b;

    public static abstract class b<T extends Date> {

        /* renamed from: b  reason: collision with root package name */
        public static final b<Date> f20013b = new a(Date.class);

        /* renamed from: a  reason: collision with root package name */
        public final Class<T> f20014a;

        public class a extends b<Date> {
            public a(Class cls) {
                super(cls);
            }

            public Date f(Date date) {
                return date;
            }
        }

        public b(Class<T> cls) {
            this.f20014a = cls;
        }

        public final z a(int i10) {
            return e(new d(this, i10));
        }

        public final z b(int i10, int i11) {
            return e(new d(this, i10, i11));
        }

        public final z c(String str) {
            return e(new d(this, str));
        }

        public final z d() {
            return e(new d(this, 2, 2));
        }

        public final z e(d<T> dVar) {
            return n.a(this.f20014a, dVar);
        }

        public abstract T f(Date date);
    }

    public d(b<T> bVar, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f20012b = arrayList;
        this.f20011a = (b) ja.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i10, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i10));
        }
        if (f.e()) {
            arrayList.add(l.d(i10));
        }
    }

    public d(b<T> bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f20012b = arrayList;
        this.f20011a = (b) ja.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (f.e()) {
            arrayList.add(l.e(i10, i11));
        }
    }

    public d(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f20012b = arrayList;
        this.f20011a = (b) ja.a.b(bVar);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(new SimpleDateFormat(str));
        }
    }

    public final Date j(String str) {
        synchronized (this.f20012b) {
            for (DateFormat parse : this.f20012b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                return la.a.g(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new u(str, e10);
            }
        }
    }

    /* renamed from: k */
    public T e(pa.a aVar) throws IOException {
        if (aVar.z0() == c.NULL) {
            aVar.c0();
            return null;
        }
        return this.f20011a.f(j(aVar.k0()));
    }

    /* renamed from: l */
    public void i(pa.d dVar, Date date) throws IOException {
        if (date == null) {
            dVar.N();
            return;
        }
        synchronized (this.f20012b) {
            dVar.Z0(this.f20012b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb2;
        String simpleName;
        DateFormat dateFormat = this.f20012b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb2.append(simpleName);
        sb2.append(')');
        return sb2.toString();
    }
}
