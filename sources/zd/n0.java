package zd;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import oe.f;
import xe.l0;

public class n0 extends m0 {
    @h1(version = "1.2")
    @f
    public static final BigInteger A(BigInteger bigInteger, int i10) {
        l0.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i10);
        l0.o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @f
    public static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        l0.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal C(BigInteger bigInteger) {
        l0.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @h1(version = "1.2")
    @f
    public static final BigDecimal D(BigInteger bigInteger, int i10, MathContext mathContext) {
        l0.p(bigInteger, "<this>");
        l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i10, MathContext mathContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            l0.o(mathContext, "UNLIMITED");
        }
        l0.p(bigInteger, "<this>");
        l0.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i10, mathContext);
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger F(int i10) {
        BigInteger valueOf = BigInteger.valueOf((long) i10);
        l0.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger G(long j10) {
        BigInteger valueOf = BigInteger.valueOf(j10);
        l0.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @f
    public static final BigInteger H(BigInteger bigInteger) {
        l0.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        l0.o(negate, "this.negate()");
        return negate;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        l0.o(xor, "this.xor(other)");
        return xor;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        l0.o(and, "this.and(other)");
        return and;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger r(BigInteger bigInteger) {
        l0.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        l0.o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @f
    public static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        l0.o(divide, "this.divide(other)");
        return divide;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger t(BigInteger bigInteger) {
        l0.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        l0.o(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger u(BigInteger bigInteger) {
        l0.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        l0.o(not, "this.not()");
        return not;
    }

    @f
    public static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        l0.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        l0.o(or, "this.or(other)");
        return or;
    }

    @f
    public static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        l0.o(add, "this.add(other)");
        return add;
    }

    @h1(version = "1.1")
    @f
    public static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        l0.p(bigInteger, "<this>");
        l0.p(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        l0.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @h1(version = "1.2")
    @f
    public static final BigInteger z(BigInteger bigInteger, int i10) {
        l0.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i10);
        l0.o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
