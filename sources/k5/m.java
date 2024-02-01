package k5;

import a6.c;
import a6.d;
import com.fasterxml.jackson.databind.ser.h;
import com.fasterxml.jackson.databind.ser.s;
import java.io.Serializable;

public final class m implements Serializable {
    public static final long R = 1;
    public static final s[] S = new s[0];
    public static final h[] T = new h[0];
    public final s[] O;
    public final s[] P;
    public final h[] Q;

    public m() {
        this((s[]) null, (s[]) null, (h[]) null);
    }

    public m(s[] sVarArr, s[] sVarArr2, h[] hVarArr) {
        this.O = sVarArr == null ? S : sVarArr;
        this.P = sVarArr2 == null ? S : sVarArr2;
        this.Q = hVarArr == null ? T : hVarArr;
    }

    public boolean a() {
        return this.P.length > 0;
    }

    public boolean b() {
        return this.Q.length > 0;
    }

    public boolean c() {
        return this.O.length > 0;
    }

    public Iterable<s> d() {
        return new d(this.P);
    }

    public Iterable<h> e() {
        return new d(this.Q);
    }

    public Iterable<s> f() {
        return new d(this.O);
    }

    public m g(s sVar) {
        if (sVar != null) {
            return new m(this.O, (s[]) c.j(this.P, sVar), this.Q);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public m h(s sVar) {
        if (sVar != null) {
            return new m((s[]) c.j(this.O, sVar), this.P, this.Q);
        }
        throw new IllegalArgumentException("Cannot pass null Serializers");
    }

    public m i(h hVar) {
        if (hVar != null) {
            return new m(this.O, this.P, (h[]) c.j(this.Q, hVar));
        }
        throw new IllegalArgumentException("Cannot pass null modifier");
    }
}
