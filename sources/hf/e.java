package hf;

import fh.g;
import ve.h;
import xe.l0;
import zd.h1;
import zd.r;
import zd.y2;

@h(name = "KClasses")
public final class e {
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @oe.h
    @g
    public static final <T> T a(@g d<T> dVar, @fh.h Object obj) {
        l0.p(dVar, "<this>");
        if (dVar.Z(obj)) {
            l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + dVar.m());
    }

    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    @fh.h
    @oe.h
    public static final <T> T b(@g d<T> dVar, @fh.h Object obj) {
        l0.p(dVar, "<this>");
        if (!dVar.Z(obj)) {
            return null;
        }
        l0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
