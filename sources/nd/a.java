package nd;

import java.math.BigDecimal;
import java.math.BigInteger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public long f21237a = 100;

    /* renamed from: b  reason: collision with root package name */
    public long f21238b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public int f21239c = 2;

    /* renamed from: d  reason: collision with root package name */
    public double f21240d;

    /* renamed from: e  reason: collision with root package name */
    public int f21241e;

    public long a() {
        BigInteger valueOf = BigInteger.valueOf(this.f21237a);
        BigInteger valueOf2 = BigInteger.valueOf((long) this.f21239c);
        int i10 = this.f21241e;
        this.f21241e = i10 + 1;
        BigInteger multiply = valueOf.multiply(valueOf2.pow(i10));
        if (this.f21240d != 0.0d) {
            double random = Math.random();
            BigInteger bigInteger = BigDecimal.valueOf(random).multiply(BigDecimal.valueOf(this.f21240d)).multiply(new BigDecimal(multiply)).toBigInteger();
            multiply = (((int) Math.floor(random * 10.0d)) & 1) == 0 ? multiply.subtract(bigInteger) : multiply.add(bigInteger);
        }
        return multiply.min(BigInteger.valueOf(this.f21238b)).longValue();
    }

    public int b() {
        return this.f21241e;
    }

    public void c() {
        this.f21241e = 0;
    }

    public a d(int i10) {
        this.f21239c = i10;
        return this;
    }

    public a e(double d10) {
        this.f21240d = d10;
        return this;
    }

    public a f(long j10) {
        this.f21238b = j10;
        return this;
    }

    public a g(long j10) {
        this.f21237a = j10;
        return this;
    }
}
