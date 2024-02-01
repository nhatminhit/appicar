package t5;

import com.fasterxml.jackson.databind.node.u;
import i5.m;
import v4.i0;
import v4.k;

@Deprecated
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final u f12961a;

    @k
    public a(u uVar) {
        this.f12961a = uVar;
    }

    public static m a() {
        u A = com.fasterxml.jackson.databind.node.m.S.A();
        A.T1("type", "any");
        return A;
    }

    @i0
    public u b() {
        return this.f12961a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        u uVar = this.f12961a;
        u uVar2 = ((a) obj).f12961a;
        return uVar == null ? uVar2 == null : uVar.equals(uVar2);
    }

    public int hashCode() {
        return this.f12961a.hashCode();
    }

    public String toString() {
        return this.f12961a.toString();
    }
}
