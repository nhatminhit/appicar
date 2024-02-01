package lf;

import be.s0;
import fh.g;
import gf.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import oe.f;
import ve.h;
import xe.l0;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.t0;

public class d0 extends c0 {
    @f
    public static final char X5(CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        return charSequence.charAt(i10);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxByOrNull instead.", replaceWith = @b1(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Z5(CharSequence charSequence, we.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 != 0) {
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
            s0 o10 = new m(1, j32).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) < 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use maxWithOrNull instead.", replaceWith = @b1(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character a6(CharSequence charSequence, Comparator comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        return e0.S7(charSequence, comparator);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minByOrNull instead.", replaceWith = @b1(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character c6(CharSequence charSequence, we.l<? super Character, ? extends R> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int j32 = c0.j3(charSequence);
        if (j32 != 0) {
            Comparable comparable = (Comparable) lVar.A(Character.valueOf(charAt));
            s0 o10 = new m(1, j32).iterator();
            while (o10.hasNext()) {
                char charAt2 = charSequence.charAt(o10.nextInt());
                Comparable comparable2 = (Comparable) lVar.A(Character.valueOf(charAt2));
                if (comparable.compareTo(comparable2) > 0) {
                    charAt = charAt2;
                    comparable = comparable2;
                }
            }
        }
        return Character.valueOf(charAt);
    }

    @l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @k(message = "Use minWithOrNull instead.", replaceWith = @b1(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character d6(CharSequence charSequence, Comparator comparator) {
        l0.p(charSequence, "<this>");
        l0.p(comparator, "comparator");
        return e0.g8(charSequence, comparator);
    }

    @h1(version = "1.4")
    @f
    @t0
    @h(name = "sumOfBigDecimal")
    public static final BigDecimal e6(CharSequence charSequence, we.l<? super Character, ? extends BigDecimal> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            valueOf = valueOf.add((BigDecimal) lVar.A(Character.valueOf(charSequence.charAt(i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @h1(version = "1.4")
    @f
    @t0
    @h(name = "sumOfBigInteger")
    public static final BigInteger f6(CharSequence charSequence, we.l<? super Character, ? extends BigInteger> lVar) {
        l0.p(charSequence, "<this>");
        l0.p(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        l0.o(valueOf, "valueOf(this.toLong())");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            valueOf = valueOf.add((BigInteger) lVar.A(Character.valueOf(charSequence.charAt(i10))));
            l0.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @g
    public static final SortedSet<Character> g6(@g CharSequence charSequence) {
        l0.p(charSequence, "<this>");
        return (SortedSet) e0.f9(charSequence, new TreeSet());
    }
}
