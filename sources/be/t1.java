package be;

import fh.g;
import java.util.Collection;
import ve.h;
import xe.l0;
import zd.a2;
import zd.b2;
import zd.e2;
import zd.f2;
import zd.h1;
import zd.j2;
import zd.k2;
import zd.p2;
import zd.q2;
import zd.t;
import zd.y2;

public class t1 {
    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUByte")
    public static final int a(@g Iterable<a2> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (a2 j02 : iterable) {
            i10 = e2.l(i10 + e2.l(j02.j0() & 255));
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUInt")
    public static final int b(@g Iterable<e2> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (e2 l02 : iterable) {
            i10 = e2.l(i10 + l02.l0());
        }
        return i10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfULong")
    public static final long c(@g Iterable<j2> iterable) {
        l0.p(iterable, "<this>");
        long j10 = 0;
        for (j2 l02 : iterable) {
            j10 = j2.l(j10 + l02.l0());
        }
        return j10;
    }

    @h1(version = "1.5")
    @y2(markerClass = {t.class})
    @h(name = "sumOfUShort")
    public static final int d(@g Iterable<p2> iterable) {
        l0.p(iterable, "<this>");
        int i10 = 0;
        for (p2 j02 : iterable) {
            i10 = e2.l(i10 + e2.l(j02.j0() & p2.R));
        }
        return i10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final byte[] e(@g Collection<a2> collection) {
        l0.p(collection, "<this>");
        byte[] e10 = b2.e(collection.size());
        int i10 = 0;
        for (a2 j02 : collection) {
            b2.w(e10, i10, j02.j0());
            i10++;
        }
        return e10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final int[] f(@g Collection<e2> collection) {
        l0.p(collection, "<this>");
        int[] e10 = f2.e(collection.size());
        int i10 = 0;
        for (e2 l02 : collection) {
            f2.w(e10, i10, l02.l0());
            i10++;
        }
        return e10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final long[] g(@g Collection<j2> collection) {
        l0.p(collection, "<this>");
        long[] e10 = k2.e(collection.size());
        int i10 = 0;
        for (j2 l02 : collection) {
            k2.w(e10, i10, l02.l0());
            i10++;
        }
        return e10;
    }

    @h1(version = "1.3")
    @t
    @g
    public static final short[] h(@g Collection<p2> collection) {
        l0.p(collection, "<this>");
        short[] e10 = q2.e(collection.size());
        int i10 = 0;
        for (p2 j02 : collection) {
            q2.w(e10, i10, j02.j0());
            i10++;
        }
        return e10;
    }
}
