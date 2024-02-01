package bf;

import be.k1;
import be.l1;
import be.v;
import be.w;
import fh.g;
import fh.h;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import p000if.m;
import p000if.s;
import xe.l0;
import zd.h1;
import zd.r;
import zd.y2;

public final class a {
    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @g
    public static final <T> m<T> a(@g Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        if (!optional.isPresent()) {
            return s.g();
        }
        return s.q(optional.get());
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    public static final <T> T b(@g Optional<? extends T> optional, T t10) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? optional.get() : t10;
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    public static final <T> T c(@g Optional<? extends T> optional, @g we.a<? extends T> aVar) {
        l0.p(optional, "<this>");
        l0.p(aVar, "defaultValue");
        return optional.isPresent() ? optional.get() : aVar.n();
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @h
    public static final <T> T d(@g Optional<T> optional) {
        l0.p(optional, "<this>");
        return optional.orElse((Object) null);
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @g
    public static final <T, C extends Collection<? super T>> C e(@g Optional<T> optional, @g C c10) {
        l0.p(optional, "<this>");
        l0.p(c10, "destination");
        if (optional.isPresent()) {
            T t10 = optional.get();
            l0.o(t10, "get()");
            c10.add(t10);
        }
        return c10;
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @g
    public static final <T> List<T> f(@g Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? v.k(optional.get()) : w.E();
    }

    @h1(version = "1.8")
    @y2(markerClass = {r.class})
    @g
    public static final <T> Set<T> g(@g Optional<? extends T> optional) {
        l0.p(optional, "<this>");
        return optional.isPresent() ? k1.f(optional.get()) : l1.k();
    }
}
