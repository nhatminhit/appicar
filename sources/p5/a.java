package p5;

import i5.c;
import i5.f;
import i5.g;
import i5.j;
import i5.k;
import i5.l;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import l5.q;
import n5.n;
import w4.p;

public class a extends q.a {
    public static final DatatypeFactory O;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;

    /* renamed from: p5.a$a  reason: collision with other inner class name */
    public static class C0196a extends n<Object> {
        public static final long V = 1;
        public final int U;

        public C0196a(Class<?> cls, int i10) {
            super(cls);
            this.U = i10;
        }

        public Object E0(String str, g gVar) throws IOException {
            int i10 = this.U;
            if (i10 == 1) {
                return a.O.newDuration(str);
            }
            if (i10 == 2) {
                try {
                    return J0(gVar, U(str, gVar));
                } catch (l unused) {
                    return a.O.newXMLGregorianCalendar(str);
                }
            } else if (i10 == 3) {
                return QName.valueOf(str);
            } else {
                throw new IllegalStateException();
            }
        }

        public XMLGregorianCalendar J0(g gVar, Date date) {
            if (date == null) {
                return null;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(date);
            TimeZone t10 = gVar.t();
            if (t10 != null) {
                gregorianCalendar.setTimeZone(t10);
            }
            return a.O.newXMLGregorianCalendar(gregorianCalendar);
        }

        public Object f(w4.l lVar, g gVar) throws IOException {
            return (this.U != 2 || !lVar.q2(p.VALUE_NUMBER_INT)) ? super.f(lVar, gVar) : J0(gVar, V(lVar, gVar));
        }
    }

    static {
        try {
            O = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e10) {
            throw new RuntimeException(e10);
        }
    }

    public k<?> f(j jVar, f fVar, c cVar) {
        Class<?> g10 = jVar.g();
        if (g10 == QName.class) {
            return new C0196a(g10, 3);
        }
        if (g10 == XMLGregorianCalendar.class) {
            return new C0196a(g10, 2);
        }
        if (g10 == Duration.class) {
            return new C0196a(g10, 1);
        }
        return null;
    }

    public boolean j(f fVar, Class<?> cls) {
        return cls == QName.class || cls == XMLGregorianCalendar.class || cls == Duration.class;
    }
}
