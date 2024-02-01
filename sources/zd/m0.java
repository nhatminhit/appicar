package zd;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import oe.f;
import xe.l0;

public class m0 {
    @h1(version = "1.2")
    @f
    public static final BigDecimal a(BigDecimal bigDecimal) {
        l0.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        l0.o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @f
    public static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        l0.p(bigDecimal, "<this>");
        l0.p(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        l0.o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal c(BigDecimal bigDecimal) {
        l0.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        l0.o(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @f
    public static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        l0.p(bigDecimal, "<this>");
        l0.p(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @f
    public static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        l0.p(bigDecimal, "<this>");
        l0.p(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        l0.o(add, "this.add(other)");
        return add;
    }

    @f
    public static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        l0.p(bigDecimal, "<this>");
        l0.p(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @f
    public static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        l0.p(bigDecimal, "<this>");
        l0.p(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal h(double d10) {
        return new BigDecimal(String.valueOf(d10));
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal i(double d10, MathContext mathContext) {
        l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d10), mathContext);
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal j(float f10) {
        return new BigDecimal(String.valueOf(f10));
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal k(float f10, MathContext mathContext) {
        l0.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f10), mathContext);
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal l(int i10) {
        BigDecimal valueOf = BigDecimal.valueOf((long) i10);
        l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal m(int i10, MathContext mathContext) {
        l0.p(mathContext, "mathContext");
        return new BigDecimal(i10, mathContext);
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal n(long j10) {
        BigDecimal valueOf = BigDecimal.valueOf(j10);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal o(long j10, MathContext mathContext) {
        l0.p(mathContext, "mathContext");
        return new BigDecimal(j10, mathContext);
    }

    @f
    public static final BigDecimal p(BigDecimal bigDecimal) {
        l0.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        l0.o(negate, "this.negate()");
        return negate;
    }
}
