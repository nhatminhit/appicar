package v5;

import i5.j;
import u5.f;
import u5.g;
import v4.f0;

public class d extends a {
    public static final long Y = 1;

    public d(j jVar, g gVar, String str, boolean z10, j jVar2) {
        super(jVar, gVar, str, z10, jVar2);
    }

    public d(d dVar, i5.d dVar2) {
        super(dVar, dVar2);
    }

    public f g(i5.d dVar) {
        return dVar == this.Q ? this : new d(this, dVar);
    }

    public f0.a k() {
        return f0.a.EXTERNAL_PROPERTY;
    }

    public boolean v() {
        return true;
    }
}
