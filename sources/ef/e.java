package ef;

import fh.g;
import java.util.Random;
import oe.f;
import oe.m;
import xe.l0;
import zd.h1;

public final class e {
    @g
    @h1(version = "1.3")
    public static final Random a(@g f fVar) {
        Random r10;
        l0.p(fVar, "<this>");
        a aVar = fVar instanceof a ? (a) fVar : null;
        return (aVar == null || (r10 = aVar.r()) == null) ? new c(fVar) : r10;
    }

    @g
    @h1(version = "1.3")
    public static final f b(@g Random random) {
        f a10;
        l0.p(random, "<this>");
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (a10 = cVar.a()) == null) ? new d(random) : a10;
    }

    @f
    public static final f c() {
        return m.f21456a.b();
    }

    public static final double d(int i10, int i11) {
        return ((double) ((((long) i10) << 27) + ((long) i11))) / 9.007199254740992E15d;
    }
}
