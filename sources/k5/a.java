package k5;

import a6.a0;
import i5.b;
import i5.z;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import q5.o;
import q5.t;
import u5.d;
import u5.h;
import z5.n;

public final class a implements Serializable {
    public static final long Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final TimeZone f10013a0 = TimeZone.getTimeZone("UTC");
    public final t O;
    public final b P;
    public final z Q;
    public final n R;
    public final h<?> S;
    public final d T;
    public final DateFormat U;
    public final g V;
    public final Locale W;
    public final TimeZone X;
    public final w4.a Y;

    @Deprecated
    public a(t tVar, b bVar, z zVar, n nVar, h<?> hVar, DateFormat dateFormat, g gVar, Locale locale, TimeZone timeZone, w4.a aVar) {
        this(tVar, bVar, zVar, nVar, hVar, dateFormat, gVar, locale, timeZone, aVar, (d) null);
    }

    public a(t tVar, b bVar, z zVar, n nVar, h<?> hVar, DateFormat dateFormat, g gVar, Locale locale, TimeZone timeZone, w4.a aVar, d dVar) {
        this.O = tVar;
        this.P = bVar;
        this.Q = zVar;
        this.R = nVar;
        this.S = hVar;
        this.U = dateFormat;
        this.V = gVar;
        this.W = locale;
        this.X = timeZone;
        this.Y = aVar;
        this.T = dVar;
    }

    public a A(h<?> hVar) {
        if (this.S == hVar) {
            return this;
        }
        return new a(this.O, this.P, this.Q, this.R, hVar, this.U, this.V, this.W, this.X, this.Y, this.T);
    }

    public final DateFormat a(DateFormat dateFormat, TimeZone timeZone) {
        if (dateFormat instanceof a0) {
            return ((a0) dateFormat).H(timeZone);
        }
        DateFormat dateFormat2 = (DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(timeZone);
        return dateFormat2;
    }

    public a b() {
        return new a(this.O.a(), this.P, this.Q, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.T);
    }

    public b c() {
        return this.P;
    }

    public w4.a d() {
        return this.Y;
    }

    public t e() {
        return this.O;
    }

    public DateFormat f() {
        return this.U;
    }

    public g g() {
        return this.V;
    }

    public Locale h() {
        return this.W;
    }

    public d i() {
        return this.T;
    }

    public z j() {
        return this.Q;
    }

    public TimeZone k() {
        TimeZone timeZone = this.X;
        return timeZone == null ? f10013a0 : timeZone;
    }

    public n l() {
        return this.R;
    }

    public h<?> m() {
        return this.S;
    }

    public boolean n() {
        return this.X != null;
    }

    public a o(Locale locale) {
        if (this.W == locale) {
            return this;
        }
        return new a(this.O, this.P, this.Q, this.R, this.S, this.U, this.V, locale, this.X, this.Y, this.T);
    }

    public a p(TimeZone timeZone) {
        if (timeZone == null) {
            throw new IllegalArgumentException();
        } else if (timeZone == this.X) {
            return this;
        } else {
            return new a(this.O, this.P, this.Q, this.R, this.S, a(this.U, timeZone), this.V, this.W, timeZone, this.Y, this.T);
        }
    }

    public a q(d dVar) {
        return dVar == this.T ? this : new a(this.O, this.P, this.Q, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, dVar);
    }

    public a r(w4.a aVar) {
        if (aVar == this.Y) {
            return this;
        }
        return new a(this.O, this.P, this.Q, this.R, this.S, this.U, this.V, this.W, this.X, aVar, this.T);
    }

    public a s(b bVar) {
        if (this.P == bVar) {
            return this;
        }
        return new a(this.O, bVar, this.Q, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.T);
    }

    public a t(b bVar) {
        return s(o.N0(this.P, bVar));
    }

    public a u(t tVar) {
        if (this.O == tVar) {
            return this;
        }
        return new a(tVar, this.P, this.Q, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.T);
    }

    public a v(DateFormat dateFormat) {
        if (this.U == dateFormat) {
            return this;
        }
        if (dateFormat != null && n()) {
            dateFormat = a(dateFormat, this.X);
        }
        return new a(this.O, this.P, this.Q, this.R, this.S, dateFormat, this.V, this.W, this.X, this.Y, this.T);
    }

    public a w(g gVar) {
        if (this.V == gVar) {
            return this;
        }
        return new a(this.O, this.P, this.Q, this.R, this.S, this.U, gVar, this.W, this.X, this.Y, this.T);
    }

    public a x(b bVar) {
        return s(o.N0(bVar, this.P));
    }

    public a y(z zVar) {
        if (this.Q == zVar) {
            return this;
        }
        return new a(this.O, this.P, zVar, this.R, this.S, this.U, this.V, this.W, this.X, this.Y, this.T);
    }

    public a z(n nVar) {
        if (this.R == nVar) {
            return this;
        }
        return new a(this.O, this.P, this.Q, nVar, this.S, this.U, this.V, this.W, this.X, this.Y, this.T);
    }
}
