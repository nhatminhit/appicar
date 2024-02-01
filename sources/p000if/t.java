package p000if;

import fh.g;
import fh.h;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import oe.f;
import we.l;
import xe.l0;
import xe.n0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.t0;

/* renamed from: if.t  reason: invalid package */
public class t extends s {

    /* renamed from: if.t$a */
    public static final class a extends n0 implements l<Object, Boolean> {
        public final /* synthetic */ Class<R> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<R> cls) {
            super(1);
            this.P = cls;
        }

        @g
        /* renamed from: c */
        public final Boolean A(@h Object obj) {
            return Boolean.valueOf(this.P.isInstance(obj));
        }
    }

    @zd.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object A(m mVar, Comparator comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return u.I1(mVar, comparator);
    }

    @zd.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T E(m<? extends T> mVar, l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @zd.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object F(m mVar, Comparator comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return u.a2(mVar, comparator);
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "sumOfBigDecimal")
    public static final <T> BigDecimal G(m<? extends T> mVar, l<? super T, ? extends BigDecimal> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (Object A : mVar) {
            valueOf = valueOf.add((BigDecimal) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @f
    @t0
    @ve.h(name = "sumOfBigInteger")
    public static final <T> BigInteger H(m<? extends T> mVar, l<? super T, ? extends BigInteger> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (Object A : mVar) {
            valueOf = valueOf.add((BigInteger) lVar.A(A));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @g
    public static final <T extends Comparable<? super T>> SortedSet<T> I(@g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return (SortedSet) u.a3(mVar, new TreeSet());
    }

    @g
    public static final <T> SortedSet<T> J(@g m<? extends T> mVar, @g Comparator<? super T> comparator) {
        l0.p(mVar, "<this>");
        l0.p(comparator, "comparator");
        return (SortedSet) u.a3(mVar, new TreeSet(comparator));
    }

    @g
    public static final <R> m<R> u(@g m<?> mVar, @g Class<R> cls) {
        l0.p(mVar, "<this>");
        l0.p(cls, "klass");
        m<R> p02 = u.p0(mVar, new a(cls));
        l0.n(p02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p02;
    }

    @g
    public static final <C extends Collection<? super R>, R> C v(@g m<?> mVar, @g C c10, @g Class<R> cls) {
        l0.p(mVar, "<this>");
        l0.p(c10, "destination");
        l0.p(cls, "klass");
        for (Object next : mVar) {
            if (cls.isInstance(next)) {
                c10.add(next);
            }
        }
        return c10;
    }

    @zd.l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T z(m<? extends T> mVar, l<? super T, ? extends R> lVar) {
        l0.p(mVar, "<this>");
        l0.p(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) lVar.A(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.A(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }
}
