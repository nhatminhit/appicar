package p000if;

import fh.g;
import ve.h;
import xe.l0;
import zd.a2;
import zd.e2;
import zd.h1;
import zd.j2;
import zd.p2;
import zd.t;
import zd.y2;

/* renamed from: if.b0  reason: invalid package */
public class b0 {
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUByte")
    public static final int a(@g m<a2> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (a2 j02 : mVar) {
            i10 = e2.l(i10 + e2.l(j02.j0() & 255));
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUInt")
    public static final int b(@g m<e2> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (e2 l02 : mVar) {
            i10 = e2.l(i10 + l02.l0());
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfULong")
    public static final long c(@g m<j2> mVar) {
        l0.p(mVar, "<this>");
        long j10 = 0;
        for (j2 l02 : mVar) {
            j10 = j2.l(j10 + l02.l0());
        }
        return j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUShort")
    public static final int d(@g m<p2> mVar) {
        l0.p(mVar, "<this>");
        int i10 = 0;
        for (p2 j02 : mVar) {
            i10 = e2.l(i10 + e2.l(j02.j0() & p2.R));
        }
        return i10;
    }
}
