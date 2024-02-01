package ka;

import ha.h;
import ha.k;
import ha.m;
import ha.n;
import ha.q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import pa.d;

public final class g extends d {

    /* renamed from: c0  reason: collision with root package name */
    public static final Writer f20015c0 = new a();

    /* renamed from: d0  reason: collision with root package name */
    public static final q f20016d0 = new q("closed");
    public final List<k> Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    public String f20017a0;

    /* renamed from: b0  reason: collision with root package name */
    public k f20018b0 = m.O;

    public class a extends Writer {
        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(f20015c0);
    }

    public d H0(double d10) throws IOException {
        if (q() || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            p1(new q((Number) Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    public d N() throws IOException {
        p1(m.O);
        return this;
    }

    public d T0(long j10) throws IOException {
        p1(new q((Number) Long.valueOf(j10)));
        return this;
    }

    public d W0(Boolean bool) throws IOException {
        if (bool == null) {
            return N();
        }
        p1(new q(bool));
        return this;
    }

    public d X0(Number number) throws IOException {
        if (number == null) {
            return N();
        }
        if (!q()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        p1(new q(number));
        return this;
    }

    public d Z0(String str) throws IOException {
        if (str == null) {
            return N();
        }
        p1(new q(str));
        return this;
    }

    public void close() throws IOException {
        if (this.Z.isEmpty()) {
            this.Z.add(f20016d0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public d f1(boolean z10) throws IOException {
        p1(new q(Boolean.valueOf(z10)));
        return this;
    }

    public void flush() throws IOException {
    }

    public d g() throws IOException {
        h hVar = new h();
        p1(hVar);
        this.Z.add(hVar);
        return this;
    }

    public d h() throws IOException {
        n nVar = new n();
        p1(nVar);
        this.Z.add(nVar);
        return this;
    }

    public k h1() {
        if (this.Z.isEmpty()) {
            return this.f20018b0;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.Z);
    }

    public d k() throws IOException {
        if (this.Z.isEmpty() || this.f20017a0 != null) {
            throw new IllegalStateException();
        } else if (m1() instanceof h) {
            List<k> list = this.Z;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public d l() throws IOException {
        if (this.Z.isEmpty() || this.f20017a0 != null) {
            throw new IllegalStateException();
        } else if (m1() instanceof n) {
            List<k> list = this.Z;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final k m1() {
        List<k> list = this.Z;
        return list.get(list.size() - 1);
    }

    public final void p1(k kVar) {
        if (this.f20017a0 != null) {
            if (!kVar.w() || m()) {
                ((n) m1()).z(this.f20017a0, kVar);
            }
            this.f20017a0 = null;
        } else if (this.Z.isEmpty()) {
            this.f20018b0 = kVar;
        } else {
            k m12 = m1();
            if (m12 instanceof h) {
                ((h) m12).z(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public d w(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.Z.isEmpty() || this.f20017a0 != null) {
            throw new IllegalStateException();
        } else if (m1() instanceof n) {
            this.f20017a0 = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }
}
