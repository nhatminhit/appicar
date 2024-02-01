package fe;

import java.util.Comparator;
import we.l;
import we.p;
import xe.l0;

public class g {

    public static final class a<T> implements Comparator {
        public final /* synthetic */ l<T, Comparable<?>> O;

        public a(l<? super T, ? extends Comparable<?>> lVar) {
            this.O = lVar;
        }

        public final int compare(T t10, T t11) {
            l<T, Comparable<?>> lVar = this.O;
            return g.l(lVar.A(t10), lVar.A(t11));
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> O;
        public final /* synthetic */ l<T, K> P;

        public b(Comparator<? super K> comparator, l<? super T, ? extends K> lVar) {
            this.O = comparator;
            this.P = lVar;
        }

        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.O;
            l<T, K> lVar = this.P;
            return comparator.compare(lVar.A(t10), lVar.A(t11));
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ l<T, Comparable<?>> O;

        public c(l<? super T, ? extends Comparable<?>> lVar) {
            this.O = lVar;
        }

        public final int compare(T t10, T t11) {
            l<T, Comparable<?>> lVar = this.O;
            return g.l(lVar.A(t11), lVar.A(t10));
        }
    }

    public static final class d<T> implements Comparator {
        public final /* synthetic */ Comparator<? super K> O;
        public final /* synthetic */ l<T, K> P;

        public d(Comparator<? super K> comparator, l<? super T, ? extends K> lVar) {
            this.O = comparator;
            this.P = lVar;
        }

        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.O;
            l<T, K> lVar = this.P;
            return comparator.compare(lVar.A(t11), lVar.A(t10));
        }
    }

    public static final class e<T> implements Comparator {
        public final /* synthetic */ Comparator<T> O;
        public final /* synthetic */ l<T, Comparable<?>> P;

        public e(Comparator<T> comparator, l<? super T, ? extends Comparable<?>> lVar) {
            this.O = comparator;
            this.P = lVar;
        }

        public final int compare(T t10, T t11) {
            int compare = this.O.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            l<T, Comparable<?>> lVar = this.P;
            return g.l(lVar.A(t10), lVar.A(t11));
        }
    }

    public static final class f<T> implements Comparator {
        public final /* synthetic */ Comparator<T> O;
        public final /* synthetic */ Comparator<? super K> P;
        public final /* synthetic */ l<T, K> Q;

        public f(Comparator<T> comparator, Comparator<? super K> comparator2, l<? super T, ? extends K> lVar) {
            this.O = comparator;
            this.P = comparator2;
            this.Q = lVar;
        }

        public final int compare(T t10, T t11) {
            int compare = this.O.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.P;
            l<T, K> lVar = this.Q;
            return comparator.compare(lVar.A(t10), lVar.A(t11));
        }
    }

    /* renamed from: fe.g$g  reason: collision with other inner class name */
    public static final class C0304g<T> implements Comparator {
        public final /* synthetic */ Comparator<T> O;
        public final /* synthetic */ l<T, Comparable<?>> P;

        public C0304g(Comparator<T> comparator, l<? super T, ? extends Comparable<?>> lVar) {
            this.O = comparator;
            this.P = lVar;
        }

        public final int compare(T t10, T t11) {
            int compare = this.O.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            l<T, Comparable<?>> lVar = this.P;
            return g.l(lVar.A(t11), lVar.A(t10));
        }
    }

    public static final class h<T> implements Comparator {
        public final /* synthetic */ Comparator<T> O;
        public final /* synthetic */ Comparator<? super K> P;
        public final /* synthetic */ l<T, K> Q;

        public h(Comparator<T> comparator, Comparator<? super K> comparator2, l<? super T, ? extends K> lVar) {
            this.O = comparator;
            this.P = comparator2;
            this.Q = lVar;
        }

        public final int compare(T t10, T t11) {
            int compare = this.O.compare(t10, t11);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.P;
            l<T, K> lVar = this.Q;
            return comparator.compare(lVar.A(t11), lVar.A(t10));
        }
    }

    public static final class i<T> implements Comparator {
        public final /* synthetic */ Comparator<T> O;
        public final /* synthetic */ p<T, T, Integer> P;

        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.O = comparator;
            this.P = pVar;
        }

        public final int compare(T t10, T t11) {
            int compare = this.O.compare(t10, t11);
            return compare != 0 ? compare : this.P.g0(t10, t11).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, "$this_then");
        l0.p(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @oe.f
    public static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, l<? super T, ? extends K> lVar) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(lVar, "selector");
        return new f(comparator, comparator2, lVar);
    }

    @oe.f
    public static final <T> Comparator<T> C(Comparator<T> comparator, l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, "<this>");
        l0.p(lVar, "selector");
        return new e(comparator, lVar);
    }

    @oe.f
    public static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, l<? super T, ? extends K> lVar) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        l0.p(lVar, "selector");
        return new h(comparator, comparator2, lVar);
    }

    @oe.f
    public static final <T> Comparator<T> E(Comparator<T> comparator, l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(comparator, "<this>");
        l0.p(lVar, "selector");
        return new C0304g(comparator, lVar);
    }

    @oe.f
    public static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
        l0.p(comparator, "<this>");
        l0.p(pVar, "comparison");
        return new i(comparator, pVar);
    }

    @fh.g
    public static final <T> Comparator<T> G(@fh.g Comparator<T> comparator, @fh.g Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new d(comparator, comparator2);
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        l0.p(comparator, "$this_thenDescending");
        l0.p(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @oe.f
    public static final <T, K> Comparator<T> f(Comparator<? super K> comparator, l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return new b(comparator, lVar);
    }

    @oe.f
    public static final <T> Comparator<T> g(l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return new a(lVar);
    }

    @fh.g
    public static final <T> Comparator<T> h(@fh.g l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new c(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final int i(l[] lVarArr, Object obj, Object obj2) {
        l0.p(lVarArr, "$selectors");
        return p(obj, obj2, lVarArr);
    }

    @oe.f
    public static final <T, K> Comparator<T> j(Comparator<? super K> comparator, l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return new d(comparator, lVar);
    }

    @oe.f
    public static final <T> Comparator<T> k(l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return new c(lVar);
    }

    public static final <T extends Comparable<?>> int l(@fh.h T t10, @fh.h T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @oe.f
    public static final <T, K> int m(T t10, T t11, Comparator<? super K> comparator, l<? super T, ? extends K> lVar) {
        l0.p(comparator, "comparator");
        l0.p(lVar, "selector");
        return comparator.compare(lVar.A(t10), lVar.A(t11));
    }

    @oe.f
    public static final <T> int n(T t10, T t11, l<? super T, ? extends Comparable<?>> lVar) {
        l0.p(lVar, "selector");
        return l((Comparable) lVar.A(t10), (Comparable) lVar.A(t11));
    }

    public static final <T> int o(T t10, T t11, @fh.g l<? super T, ? extends Comparable<?>>... lVarArr) {
        l0.p(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return p(t10, t11, lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final <T> int p(T t10, T t11, l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l10 = l((Comparable) lVar.A(t10), (Comparable) lVar.A(t11));
            if (l10 != 0) {
                return l10;
            }
        }
        return 0;
    }

    @fh.g
    public static final <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.O;
        l0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @oe.f
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @fh.g
    public static final <T> Comparator<T> s(@fh.g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new e(comparator);
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @oe.f
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @fh.g
    public static final <T> Comparator<T> v(@fh.g Comparator<? super T> comparator) {
        l0.p(comparator, "comparator");
        return new f(comparator);
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        l0.p(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @fh.g
    public static final <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.O;
        l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @fh.g
    public static final <T> Comparator<T> y(@fh.g Comparator<T> comparator) {
        l0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        Comparator<T> comparator2 = j.O;
        if (l0.g(comparator, comparator2)) {
            k kVar = k.O;
            l0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (l0.g(comparator, k.O)) {
            l0.n(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new l<>(comparator);
        }
        return comparator2;
    }

    @fh.g
    public static final <T> Comparator<T> z(@fh.g Comparator<T> comparator, @fh.g Comparator<? super T> comparator2) {
        l0.p(comparator, "<this>");
        l0.p(comparator2, "comparator");
        return new b(comparator, comparator2);
    }
}
