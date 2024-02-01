package p5;

import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.s;
import i5.c;
import i5.c0;
import i5.d;
import i5.e0;
import i5.l;
import i5.o;
import java.io.IOException;
import java.util.Calendar;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import s5.g;
import w4.i;
import y5.h;
import y5.m0;
import y5.p0;

public class b extends s.a {

    public static class a extends m0<XMLGregorianCalendar> implements j {
        public static final a S = new a();
        public final o<Object> R;

        public a() {
            this(h.U);
        }

        public a(o<?> oVar) {
            super(XMLGregorianCalendar.class);
            this.R = oVar;
        }

        public Calendar M(XMLGregorianCalendar xMLGregorianCalendar) {
            if (xMLGregorianCalendar == null) {
                return null;
            }
            return xMLGregorianCalendar.toGregorianCalendar();
        }

        /* renamed from: N */
        public boolean h(e0 e0Var, XMLGregorianCalendar xMLGregorianCalendar) {
            return this.R.h(e0Var, M(xMLGregorianCalendar));
        }

        /* renamed from: O */
        public void m(XMLGregorianCalendar xMLGregorianCalendar, i iVar, e0 e0Var) throws IOException {
            this.R.m(M(xMLGregorianCalendar), iVar, e0Var);
        }

        /* renamed from: P */
        public void n(XMLGregorianCalendar xMLGregorianCalendar, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
            this.R.n(M(xMLGregorianCalendar), iVar, e0Var, iVar2);
        }

        public o<?> d(e0 e0Var, d dVar) throws l {
            o<?> r02 = e0Var.r0(this.R, dVar);
            return r02 != this.R ? new a(r02) : this;
        }

        public void e(g gVar, i5.j jVar) throws l {
            this.R.e(gVar, (i5.j) null);
        }

        public o<?> f() {
            return this.R;
        }
    }

    public o<?> a(c0 c0Var, i5.j jVar, c cVar) {
        Class<?> g10 = jVar.g();
        if (Duration.class.isAssignableFrom(g10) || QName.class.isAssignableFrom(g10)) {
            return p0.R;
        }
        if (XMLGregorianCalendar.class.isAssignableFrom(g10)) {
            return a.S;
        }
        return null;
    }
}
