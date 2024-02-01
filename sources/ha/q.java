package ha;

import ja.a;
import ja.h;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class q extends k {
    public final Object O;

    public q(Boolean bool) {
        this.O = a.b(bool);
    }

    public q(Character ch2) {
        this.O = ((Character) a.b(ch2)).toString();
    }

    public q(Number number) {
        this.O = a.b(number);
    }

    public q(String str) {
        this.O = a.b(str);
    }

    public static boolean B(q qVar) {
        Object obj = qVar.O;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean A() {
        return this.O instanceof Boolean;
    }

    public boolean C() {
        return this.O instanceof Number;
    }

    public boolean D() {
        return this.O instanceof String;
    }

    public BigDecimal c() {
        Object obj = this.O;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(this.O.toString());
    }

    public BigInteger e() {
        Object obj = this.O;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(this.O.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.O == null) {
            return qVar.O == null;
        }
        if (B(this) && B(qVar)) {
            return s().longValue() == qVar.s().longValue();
        }
        Object obj2 = this.O;
        if (!(obj2 instanceof Number) || !(qVar.O instanceof Number)) {
            return obj2.equals(qVar.O);
        }
        double doubleValue = s().doubleValue();
        double doubleValue2 = qVar.s().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public boolean f() {
        return A() ? ((Boolean) this.O).booleanValue() : Boolean.parseBoolean(u());
    }

    public byte h() {
        return C() ? s().byteValue() : Byte.parseByte(u());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.O == null) {
            return 31;
        }
        if (B(this)) {
            doubleToLongBits = s().longValue();
        } else {
            Object obj = this.O;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(s().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public char i() {
        return u().charAt(0);
    }

    public double j() {
        return C() ? s().doubleValue() : Double.parseDouble(u());
    }

    public float l() {
        return C() ? s().floatValue() : Float.parseFloat(u());
    }

    public int m() {
        return C() ? s().intValue() : Integer.parseInt(u());
    }

    public long r() {
        return C() ? s().longValue() : Long.parseLong(u());
    }

    public Number s() {
        Object obj = this.O;
        return obj instanceof String ? new h((String) obj) : (Number) obj;
    }

    public short t() {
        return C() ? s().shortValue() : Short.parseShort(u());
    }

    public String u() {
        return C() ? s().toString() : A() ? ((Boolean) this.O).toString() : (String) this.O;
    }

    /* renamed from: z */
    public q b() {
        return this;
    }
}
