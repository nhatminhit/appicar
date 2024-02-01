package ha;

import ja.n;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import pa.d;

public abstract class k {
    public abstract k b();

    public BigDecimal c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    @Deprecated
    public char i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public h n() {
        if (v()) {
            return (h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public m o() {
        if (w()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Null: " + this);
    }

    public n p() {
        if (x()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public q q() {
        if (y()) {
            return (q) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long r() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short t() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            d dVar = new d(stringWriter);
            dVar.k0(true);
            n.b(this, dVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String u() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean v() {
        return this instanceof h;
    }

    public boolean w() {
        return this instanceof m;
    }

    public boolean x() {
        return this instanceof n;
    }

    public boolean y() {
        return this instanceof q;
    }
}
