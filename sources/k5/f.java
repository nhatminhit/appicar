package k5;

import a6.c;
import a6.d;
import i5.a;
import java.io.Serializable;
import l5.g;
import l5.q;
import l5.r;
import l5.z;
import n5.c0;

public class f implements Serializable {
    public static final long T = 1;
    public static final q[] U = new q[0];
    public static final g[] V = new g[0];
    public static final a[] W = new a[0];
    public static final z[] X = new z[0];
    public static final r[] Y = {new c0()};
    public final q[] O;
    public final r[] P;
    public final g[] Q;
    public final a[] R;
    public final z[] S;

    public f() {
        this((q[]) null, (r[]) null, (g[]) null, (a[]) null, (z[]) null);
    }

    public f(q[] qVarArr, r[] rVarArr, g[] gVarArr, a[] aVarArr, z[] zVarArr) {
        this.O = qVarArr == null ? U : qVarArr;
        this.P = rVarArr == null ? Y : rVarArr;
        this.Q = gVarArr == null ? V : gVarArr;
        this.R = aVarArr == null ? W : aVarArr;
        this.S = zVarArr == null ? X : zVarArr;
    }

    public Iterable<a> a() {
        return new d(this.R);
    }

    public Iterable<g> b() {
        return new d(this.Q);
    }

    public Iterable<q> c() {
        return new d(this.O);
    }

    public boolean d() {
        return this.R.length > 0;
    }

    public boolean e() {
        return this.Q.length > 0;
    }

    public boolean f() {
        return this.O.length > 0;
    }

    public boolean g() {
        return this.P.length > 0;
    }

    public boolean h() {
        return this.S.length > 0;
    }

    public Iterable<r> i() {
        return new d(this.P);
    }

    public Iterable<z> j() {
        return new d(this.S);
    }

    public f k(a aVar) {
        if (aVar != null) {
            return new f(this.O, this.P, this.Q, (a[]) c.j(this.R, aVar), this.S);
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }

    public f l(q qVar) {
        if (qVar != null) {
            return new f((q[]) c.j(this.O, qVar), this.P, this.Q, this.R, this.S);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    public f m(r rVar) {
        if (rVar != null) {
            return new f(this.O, (r[]) c.j(this.P, rVar), this.Q, this.R, this.S);
        }
        throw new IllegalArgumentException("Cannot pass null KeyDeserializers");
    }

    public f n(g gVar) {
        if (gVar != null) {
            return new f(this.O, this.P, (g[]) c.j(this.Q, gVar), this.R, this.S);
        }
        throw new IllegalArgumentException("Cannot pass null modifier");
    }

    public f o(z zVar) {
        if (zVar != null) {
            return new f(this.O, this.P, this.Q, this.R, (z[]) c.j(this.S, zVar));
        }
        throw new IllegalArgumentException("Cannot pass null resolver");
    }
}
