package w8;

import d.m0;
import d.o0;
import e8.a;
import j8.q;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@a
@d0
public final class b {
    @a
    @m0
    public static <T> T[] a(@m0 T[]... tArr) {
        if (tArr.length == 0) {
            return (Object[]) Array.newInstance(tArr.getClass(), 0);
        }
        int i10 = 0;
        for (T[] length : tArr) {
            i10 += length.length;
        }
        T[] copyOf = Arrays.copyOf(tArr[0], i10);
        int length2 = tArr[0].length;
        for (int i11 = 1; i11 < tArr.length; i11++) {
            T[] tArr2 = tArr[i11];
            int length3 = tArr2.length;
            System.arraycopy(tArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    @a
    @m0
    public static byte[] b(@m0 byte[]... bArr) {
        if (bArr.length == 0) {
            return new byte[0];
        }
        int i10 = 0;
        for (byte[] length : bArr) {
            i10 += length.length;
        }
        byte[] copyOf = Arrays.copyOf(bArr[0], i10);
        int length2 = bArr[0].length;
        for (int i11 = 1; i11 < bArr.length; i11++) {
            byte[] bArr2 = bArr[i11];
            int length3 = bArr2.length;
            System.arraycopy(bArr2, 0, copyOf, length2, length3);
            length2 += length3;
        }
        return copyOf;
    }

    @a
    public static boolean c(@m0 int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @a
    public static <T> boolean d(@m0 T[] tArr, @m0 T t10) {
        int length = tArr != null ? tArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (!q.b(tArr[i10], t10)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    @a
    @m0
    public static <T> ArrayList<T> e() {
        return new ArrayList<>();
    }

    @a
    @o0
    public static <T> T[] f(@m0 T[] tArr, @m0 T... tArr2) {
        int length;
        int i10;
        if (tArr == null) {
            return null;
        }
        if (tArr2 == null || (length = tArr2.length) == 0) {
            return Arrays.copyOf(tArr, tArr.length);
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), r3);
        if (length == 1) {
            i10 = 0;
            for (T t10 : tArr) {
                if (!q.b(tArr2[0], t10)) {
                    tArr3[i10] = t10;
                    i10++;
                }
            }
        } else {
            int i11 = 0;
            for (T t11 : tArr) {
                if (!d(tArr2, t11)) {
                    tArr3[i11] = t11;
                    i11++;
                }
            }
            i10 = i11;
        }
        if (tArr3 == null) {
            return null;
        }
        return i10 == tArr3.length ? tArr3 : Arrays.copyOf(tArr3, i10);
    }

    @a
    @m0
    public static <T> ArrayList<T> g(@m0 T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(r0);
        for (T add : tArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    @a
    @m0
    public static int[] h(@m0 Collection<Integer> collection) {
        int i10 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        for (Integer intValue : collection) {
            iArr[i10] = intValue.intValue();
            i10++;
        }
        return iArr;
    }

    @a
    @o0
    public static Integer[] i(@m0 int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    @a
    public static void j(@m0 StringBuilder sb2, @m0 double[] dArr) {
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Double.toString(dArr[i10]));
        }
    }

    @a
    public static void k(@m0 StringBuilder sb2, @m0 float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Float.toString(fArr[i10]));
        }
    }

    @a
    public static void l(@m0 StringBuilder sb2, @m0 int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Integer.toString(iArr[i10]));
        }
    }

    @a
    public static void m(@m0 StringBuilder sb2, @m0 long[] jArr) {
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Long.toString(jArr[i10]));
        }
    }

    @a
    public static <T> void n(@m0 StringBuilder sb2, @m0 T[] tArr) {
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i10]);
        }
    }

    @a
    public static void o(@m0 StringBuilder sb2, @m0 boolean[] zArr) {
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append(Boolean.toString(zArr[i10]));
        }
    }

    @a
    public static void p(@m0 StringBuilder sb2, @m0 String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i10]);
            sb2.append("\"");
        }
    }
}
