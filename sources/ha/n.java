package ha;

import ja.j;
import java.util.Map;
import java.util.Set;

public final class n extends k {
    public final j<String, k> O = new j<>();

    public void A(String str, Boolean bool) {
        z(str, bool == null ? m.O : new q(bool));
    }

    public void B(String str, Character ch2) {
        z(str, ch2 == null ? m.O : new q(ch2));
    }

    public void C(String str, Number number) {
        z(str, number == null ? m.O : new q(number));
    }

    public void D(String str, String str2) {
        z(str, str2 == null ? m.O : new q(str2));
    }

    /* renamed from: E */
    public n b() {
        n nVar = new n();
        for (Map.Entry next : this.O.entrySet()) {
            nVar.z((String) next.getKey(), ((k) next.getValue()).b());
        }
        return nVar;
    }

    public Set<Map.Entry<String, k>> F() {
        return this.O.entrySet();
    }

    public k G(String str) {
        return this.O.get(str);
    }

    public h H(String str) {
        return (h) this.O.get(str);
    }

    public n I(String str) {
        return (n) this.O.get(str);
    }

    public q J(String str) {
        return (q) this.O.get(str);
    }

    public boolean K(String str) {
        return this.O.containsKey(str);
    }

    public Set<String> L() {
        return this.O.keySet();
    }

    public k M(String str) {
        return this.O.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).O.equals(this.O));
    }

    public int hashCode() {
        return this.O.hashCode();
    }

    public int size() {
        return this.O.size();
    }

    public void z(String str, k kVar) {
        j<String, k> jVar = this.O;
        if (kVar == null) {
            kVar = m.O;
        }
        jVar.put(str, kVar);
    }
}
