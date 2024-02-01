package be;

import fh.g;
import fh.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oe.f;
import xe.l0;
import zd.a1;
import zd.r1;
import zd.u0;

public class x extends w {

    public static final class a implements Iterable<T>, ye.a {
        public final /* synthetic */ we.a<Iterator<T>> O;

        public a(we.a<? extends Iterator<? extends T>> aVar) {
            this.O = aVar;
        }

        @g
        public Iterator<T> iterator() {
            return this.O.n();
        }
    }

    @f
    public static final <T> Iterable<T> X(we.a<? extends Iterator<? extends T>> aVar) {
        l0.p(aVar, "iterator");
        return new a(aVar);
    }

    @a1
    public static final <T> int Y(@g Iterable<? extends T> iterable, int i10) {
        l0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    @a1
    @h
    public static final <T> Integer Z(@g Iterable<? extends T> iterable) {
        l0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @g
    public static final <T> List<T> a0(@g Iterable<? extends Iterable<? extends T>> iterable) {
        l0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable o02 : iterable) {
            b0.o0(arrayList, o02);
        }
        return arrayList;
    }

    @g
    public static final <T, R> u0<List<T>, List<R>> b0(@g Iterable<? extends u0<? extends T, ? extends R>> iterable) {
        l0.p(iterable, "<this>");
        int Y = Y(iterable, 10);
        ArrayList arrayList = new ArrayList(Y);
        ArrayList arrayList2 = new ArrayList(Y);
        for (u0 u0Var : iterable) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return r1.a(arrayList, arrayList2);
    }
}
