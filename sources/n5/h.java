package n5;

import a6.a0;
import i5.g;
import i5.k;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;
import l5.i;
import v4.n;
import w4.l;
import w4.p;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f10839a = new HashSet<>();

    @j5.a
    public static class a extends b<Calendar> {
        public final Constructor<Calendar> W;

        public a() {
            super(Calendar.class);
            this.W = null;
        }

        public a(Class<? extends Calendar> cls) {
            super(cls);
            this.W = a6.h.q(cls, false);
        }

        public a(a aVar, DateFormat dateFormat, String str) {
            super(aVar, dateFormat, str);
            this.W = aVar.W;
        }

        /* renamed from: F0 */
        public Calendar f(l lVar, g gVar) throws IOException {
            Date V = V(lVar, gVar);
            if (V == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.W;
            if (constructor == null) {
                return gVar.G(V);
            }
            try {
                Calendar newInstance = constructor.newInstance(new Object[0]);
                newInstance.setTimeInMillis(V.getTime());
                TimeZone t10 = gVar.t();
                if (t10 != null) {
                    newInstance.setTimeZone(t10);
                }
                return newInstance;
            } catch (Exception e10) {
                return (Calendar) gVar.b0(r(), V, e10);
            }
        }

        /* renamed from: G0 */
        public a E0(DateFormat dateFormat, String str) {
            return new a(this, dateFormat, str);
        }

        public /* bridge */ /* synthetic */ k a(g gVar, i5.d dVar) throws i5.l {
            return super.a(gVar, dVar);
        }
    }

    public static abstract class b<T> extends e0<T> implements i {
        public final DateFormat U;
        public final String V;

        public b(Class<?> cls) {
            super(cls);
            this.U = null;
            this.V = null;
        }

        public b(b<T> bVar, DateFormat dateFormat, String str) {
            super(bVar.O);
            this.U = dateFormat;
            this.V = str;
        }

        public abstract b<T> E0(DateFormat dateFormat, String str);

        public Date V(l lVar, g gVar) throws IOException {
            Date parse;
            if (this.U == null || !lVar.q2(p.VALUE_STRING)) {
                return super.V(lVar, gVar);
            }
            String trim = lVar.Y1().trim();
            if (trim.length() == 0) {
                return (Date) n(gVar);
            }
            synchronized (this.U) {
                try {
                    parse = this.U.parse(trim);
                } catch (ParseException unused) {
                    return (Date) gVar.p0(r(), trim, "expected format \"%s\"", this.V);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return parse;
        }

        public k<?> a(g gVar, i5.d dVar) throws i5.l {
            a0 a0Var;
            a0 a0Var2;
            n.d u02 = u0(gVar, dVar, r());
            if (u02 != null) {
                TimeZone n10 = u02.n();
                Boolean j10 = u02.j();
                if (u02.q()) {
                    String l10 = u02.l();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(l10, u02.p() ? u02.k() : gVar.s());
                    if (n10 == null) {
                        n10 = gVar.t();
                    }
                    simpleDateFormat.setTimeZone(n10);
                    if (j10 != null) {
                        simpleDateFormat.setLenient(j10.booleanValue());
                    }
                    return E0(simpleDateFormat, l10);
                } else if (n10 != null) {
                    DateFormat r10 = gVar.q().r();
                    if (r10.getClass() == a0.class) {
                        a0 G = ((a0) r10).H(n10).G(u02.p() ? u02.k() : gVar.s());
                        a0Var2 = G;
                        if (j10 != null) {
                            a0Var2 = G.F(j10);
                        }
                    } else {
                        DateFormat dateFormat = (DateFormat) r10.clone();
                        dateFormat.setTimeZone(n10);
                        a0Var2 = dateFormat;
                        if (j10 != null) {
                            dateFormat.setLenient(j10.booleanValue());
                            a0Var2 = dateFormat;
                        }
                    }
                    return E0(a0Var2, this.V);
                } else if (j10 != null) {
                    DateFormat r11 = gVar.q().r();
                    String str = this.V;
                    if (r11.getClass() == a0.class) {
                        a0 F = ((a0) r11).F(j10);
                        str = F.D();
                        a0Var = F;
                    } else {
                        DateFormat dateFormat2 = (DateFormat) r11.clone();
                        dateFormat2.setLenient(j10.booleanValue());
                        boolean z10 = dateFormat2 instanceof SimpleDateFormat;
                        a0Var = dateFormat2;
                        if (z10) {
                            ((SimpleDateFormat) dateFormat2).toPattern();
                            a0Var = dateFormat2;
                        }
                    }
                    if (str == null) {
                        str = "[unknown]";
                    }
                    return E0(a0Var, str);
                }
            }
            return this;
        }
    }

    @j5.a
    public static class c extends b<Date> {
        public static final c W = new c();

        public c() {
            super(Date.class);
        }

        public c(c cVar, DateFormat dateFormat, String str) {
            super(cVar, dateFormat, str);
        }

        /* renamed from: F0 */
        public Date f(l lVar, g gVar) throws IOException {
            return V(lVar, gVar);
        }

        /* renamed from: G0 */
        public c E0(DateFormat dateFormat, String str) {
            return new c(this, dateFormat, str);
        }

        public /* bridge */ /* synthetic */ k a(g gVar, i5.d dVar) throws i5.l {
            return super.a(gVar, dVar);
        }
    }

    public static class d extends b<java.sql.Date> {
        public d() {
            super(java.sql.Date.class);
        }

        public d(d dVar, DateFormat dateFormat, String str) {
            super(dVar, dateFormat, str);
        }

        /* renamed from: F0 */
        public java.sql.Date f(l lVar, g gVar) throws IOException {
            Date V = V(lVar, gVar);
            if (V == null) {
                return null;
            }
            return new java.sql.Date(V.getTime());
        }

        /* renamed from: G0 */
        public d E0(DateFormat dateFormat, String str) {
            return new d(this, dateFormat, str);
        }

        public /* bridge */ /* synthetic */ k a(g gVar, i5.d dVar) throws i5.l {
            return super.a(gVar, dVar);
        }
    }

    public static class e extends b<Timestamp> {
        public e() {
            super(Timestamp.class);
        }

        public e(e eVar, DateFormat dateFormat, String str) {
            super(eVar, dateFormat, str);
        }

        /* renamed from: F0 */
        public Timestamp f(l lVar, g gVar) throws IOException {
            Date V = V(lVar, gVar);
            if (V == null) {
                return null;
            }
            return new Timestamp(V.getTime());
        }

        /* renamed from: G0 */
        public e E0(DateFormat dateFormat, String str) {
            return new e(this, dateFormat, str);
        }

        public /* bridge */ /* synthetic */ k a(g gVar, i5.d dVar) throws i5.l {
            return super.a(gVar, dVar);
        }
    }

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, java.sql.Date.class, Date.class, Timestamp.class};
        for (int i10 = 0; i10 < 5; i10++) {
            f10839a.add(clsArr[i10].getName());
        }
    }

    public static k<?> a(Class<?> cls, String str) {
        if (!f10839a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new a();
        }
        if (cls == Date.class) {
            return c.W;
        }
        if (cls == java.sql.Date.class) {
            return new d();
        }
        if (cls == Timestamp.class) {
            return new e();
        }
        if (cls == GregorianCalendar.class) {
            return new a(GregorianCalendar.class);
        }
        return null;
    }

    public static boolean b(Class<?> cls) {
        return f10839a.contains(cls.getName());
    }
}
