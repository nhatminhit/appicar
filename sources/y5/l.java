package y5;

import a6.a0;
import androidx.lifecycle.v;
import com.fasterxml.jackson.databind.ser.j;
import i5.d;
import i5.d0;
import i5.e0;
import i5.m;
import i5.o;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import s5.g;
import s5.n;
import v4.n;
import w4.i;
import w4.l;

public abstract class l<T> extends l0<T> implements j {
    public final Boolean R;
    public final DateFormat S;
    public final AtomicReference<DateFormat> T;

    public l(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.R = bool;
        this.S = dateFormat;
        this.T = dateFormat == null ? null : new AtomicReference<>();
    }

    public void M(g gVar, i5.j jVar, boolean z10) throws i5.l {
        if (z10) {
            H(gVar, jVar, l.b.LONG, n.UTC_MILLISEC);
        } else {
            J(gVar, jVar, n.DATE_TIME);
        }
    }

    public boolean N(e0 e0Var) {
        Boolean bool = this.R;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.S != null) {
            return false;
        }
        if (e0Var != null) {
            return e0Var.w0(d0.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + g().getName());
    }

    public void O(Date date, i iVar, e0 e0Var) throws IOException {
        if (this.S == null) {
            e0Var.P(date, iVar);
            return;
        }
        DateFormat andSet = this.T.getAndSet((Object) null);
        if (andSet == null) {
            andSet = (DateFormat) this.S.clone();
        }
        iVar.Z2(andSet.format(date));
        v.a(this.T, (Object) null, andSet);
    }

    public abstract long P(T t10);

    public abstract l<T> Q(Boolean bool, DateFormat dateFormat);

    public m a(e0 e0Var, Type type) {
        return u(N(e0Var) ? "number" : "string", true);
    }

    public o<?> d(e0 e0Var, d dVar) throws i5.l {
        n.d z10 = z(e0Var, dVar, g());
        if (z10 == null) {
            return this;
        }
        n.c m10 = z10.m();
        if (m10.a()) {
            return Q(Boolean.TRUE, (DateFormat) null);
        }
        if (z10.q()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(z10.l(), z10.p() ? z10.k() : e0Var.s());
            simpleDateFormat.setTimeZone(z10.s() ? z10.n() : e0Var.t());
            return Q(Boolean.FALSE, simpleDateFormat);
        }
        boolean p10 = z10.p();
        boolean s10 = z10.s();
        boolean z11 = true;
        boolean z12 = m10 == n.c.STRING;
        if (!p10 && !s10 && !z12) {
            return this;
        }
        DateFormat r10 = e0Var.q().r();
        if (r10 instanceof a0) {
            a0 a0Var = (a0) r10;
            if (z10.p()) {
                a0Var = a0Var.G(z10.k());
            }
            if (z10.s()) {
                a0Var = a0Var.H(z10.n());
            }
            return Q(Boolean.FALSE, a0Var);
        }
        if (!(r10 instanceof SimpleDateFormat)) {
            e0Var.A(g(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", new Object[]{r10.getClass().getName()}));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) r10;
        SimpleDateFormat simpleDateFormat3 = p10 ? new SimpleDateFormat(simpleDateFormat2.toPattern(), z10.k()) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone n10 = z10.n();
        if (n10 == null || n10.equals(simpleDateFormat3.getTimeZone())) {
            z11 = false;
        }
        if (z11) {
            simpleDateFormat3.setTimeZone(n10);
        }
        return Q(Boolean.FALSE, simpleDateFormat3);
    }

    public void e(g gVar, i5.j jVar) throws i5.l {
        M(gVar, jVar, N(gVar.c()));
    }

    public boolean h(e0 e0Var, T t10) {
        return false;
    }

    public abstract void m(T t10, i iVar, e0 e0Var) throws IOException;
}
