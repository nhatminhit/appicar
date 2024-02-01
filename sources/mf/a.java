package mf;

import fh.g;
import lf.j;
import lf.k;
import lf.l;
import ve.h;
import xe.l0;
import zd.h1;

@h(name = "RegexExtensionsJDK8Kt")
public final class a {
    @h1(version = "1.2")
    @fh.h
    public static final j a(@g k kVar, @g String str) {
        l0.p(kVar, "<this>");
        l0.p(str, "name");
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar != null) {
            return lVar.g(str);
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }
}
