package a3;

import d.o0;

public final class b implements f {
    public final String O;
    @o0
    public final Object[] P;

    public b(String str) {
        this(str, (Object[]) null);
    }

    public b(String str, @o0 Object[] objArr) {
        this.O = str;
        this.P = objArr;
    }

    public static void a(e eVar, int i10, Object obj) {
        long j10;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            eVar.a1(i10);
        } else if (obj instanceof byte[]) {
            eVar.B0(i10, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        eVar.F(i10, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j10 = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    }
                    j10 = (long) byteValue;
                }
                eVar.q0(i10, j10);
                return;
            }
            eVar.R(i10, doubleValue);
        }
    }

    public static void b(e eVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                a(eVar, i10, obj);
            }
        }
    }

    public int c() {
        Object[] objArr = this.P;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public String f() {
        return this.O;
    }

    public void g(e eVar) {
        b(eVar, this.P);
    }
}
