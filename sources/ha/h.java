package ha;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h extends k implements Iterable<k> {
    public final List<k> O;

    public h() {
        this.O = new ArrayList();
    }

    public h(int i10) {
        this.O = new ArrayList(i10);
    }

    public void A(Boolean bool) {
        this.O.add(bool == null ? m.O : new q(bool));
    }

    public void B(Character ch2) {
        this.O.add(ch2 == null ? m.O : new q(ch2));
    }

    public void C(Number number) {
        this.O.add(number == null ? m.O : new q(number));
    }

    public void D(String str) {
        this.O.add(str == null ? m.O : new q(str));
    }

    public void E(h hVar) {
        this.O.addAll(hVar.O);
    }

    public boolean F(k kVar) {
        return this.O.contains(kVar);
    }

    /* renamed from: G */
    public h b() {
        if (this.O.isEmpty()) {
            return new h();
        }
        h hVar = new h(this.O.size());
        for (k b10 : this.O) {
            hVar.z(b10.b());
        }
        return hVar;
    }

    public k H(int i10) {
        return this.O.get(i10);
    }

    public k I(int i10) {
        return this.O.remove(i10);
    }

    public boolean J(k kVar) {
        return this.O.remove(kVar);
    }

    public k K(int i10, k kVar) {
        return this.O.set(i10, kVar);
    }

    public BigDecimal c() {
        if (this.O.size() == 1) {
            return this.O.get(0).c();
        }
        throw new IllegalStateException();
    }

    public BigInteger e() {
        if (this.O.size() == 1) {
            return this.O.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).O.equals(this.O));
    }

    public boolean f() {
        if (this.O.size() == 1) {
            return this.O.get(0).f();
        }
        throw new IllegalStateException();
    }

    public byte h() {
        if (this.O.size() == 1) {
            return this.O.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.O.hashCode();
    }

    public char i() {
        if (this.O.size() == 1) {
            return this.O.get(0).i();
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.O.isEmpty();
    }

    public Iterator<k> iterator() {
        return this.O.iterator();
    }

    public double j() {
        if (this.O.size() == 1) {
            return this.O.get(0).j();
        }
        throw new IllegalStateException();
    }

    public float l() {
        if (this.O.size() == 1) {
            return this.O.get(0).l();
        }
        throw new IllegalStateException();
    }

    public int m() {
        if (this.O.size() == 1) {
            return this.O.get(0).m();
        }
        throw new IllegalStateException();
    }

    public long r() {
        if (this.O.size() == 1) {
            return this.O.get(0).r();
        }
        throw new IllegalStateException();
    }

    public Number s() {
        if (this.O.size() == 1) {
            return this.O.get(0).s();
        }
        throw new IllegalStateException();
    }

    public int size() {
        return this.O.size();
    }

    public short t() {
        if (this.O.size() == 1) {
            return this.O.get(0).t();
        }
        throw new IllegalStateException();
    }

    public String u() {
        if (this.O.size() == 1) {
            return this.O.get(0).u();
        }
        throw new IllegalStateException();
    }

    public void z(k kVar) {
        if (kVar == null) {
            kVar = m.O;
        }
        this.O.add(kVar);
    }
}
