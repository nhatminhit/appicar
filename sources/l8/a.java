package l8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import d.m0;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: l8.a$a  reason: collision with other inner class name */
    public static class C0175a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0175a(@d.m0 java.lang.String r3, @d.m0 android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.a.C0175a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    @m0
    public static ArrayList<Parcel> A(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                arrayList.add(obtain);
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList.add((Object) null);
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @m0
    public static SparseArray<Parcel> B(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt3);
                sparseArray.append(readInt2, obtain);
                parcel.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray.append(readInt2, (Object) null);
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @m0
    public static <T extends Parcelable> T C(@m0 Parcel parcel, int i10, @m0 Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        T t10 = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g02);
        return t10;
    }

    @m0
    public static SparseBooleanArray D(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(dataPosition + g02);
        return readSparseBooleanArray;
    }

    @m0
    public static SparseIntArray E(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseIntArray;
    }

    @m0
    public static SparseLongArray F(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseLongArray;
    }

    @m0
    public static String G(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g02);
        return readString;
    }

    @m0
    public static String[] H(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g02);
        return createStringArray;
    }

    @m0
    public static ArrayList<String> I(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g02);
        return createStringArrayList;
    }

    @m0
    public static SparseArray<String> J(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @m0
    public static <T> T[] K(@m0 Parcel parcel, int i10, @m0 Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g02);
        return createTypedArray;
    }

    @m0
    public static <T> ArrayList<T> L(@m0 Parcel parcel, int i10, @m0 Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g02);
        return createTypedArrayList;
    }

    @m0
    public static <T> SparseArray<T> M(@m0 Parcel parcel, int i10, @m0 Parcelable.Creator<T> creator) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    public static void N(@m0 Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new C0175a("Overread allowed size end=" + i10, parcel);
        }
    }

    public static int O(int i10) {
        return (char) i10;
    }

    public static boolean P(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @m0
    public static Boolean Q(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i10, g02, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte R(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static char S(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (char) parcel.readInt();
    }

    public static double T(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readDouble();
    }

    @m0
    public static Double U(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i10, g02, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float V(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readFloat();
    }

    @m0
    public static Float W(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i10, g02, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int X(@m0 Parcel parcel) {
        return parcel.readInt();
    }

    @m0
    public static IBinder Y(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g02);
        return readStrongBinder;
    }

    public static int Z(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return parcel.readInt();
    }

    @m0
    public static BigDecimal a(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + g02);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @m0
    public static Integer a0(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i10, g02, 4);
        return Integer.valueOf(parcel.readInt());
    }

    @m0
    public static BigDecimal[] b(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + g02);
        return bigDecimalArr;
    }

    public static void b0(@m0 Parcel parcel, int i10, @m0 List list, @m0 ClassLoader classLoader) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + g02);
        }
    }

    @m0
    public static BigInteger c(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g02);
        return new BigInteger(createByteArray);
    }

    public static long c0(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 8);
        return parcel.readLong();
    }

    @m0
    public static BigInteger[] d(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g02);
        return bigIntegerArr;
    }

    @m0
    public static Long d0(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        if (g02 == 0) {
            return null;
        }
        j0(parcel, i10, g02, 8);
        return Long.valueOf(parcel.readLong());
    }

    @m0
    public static boolean[] e(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + g02);
        return createBooleanArray;
    }

    @m0
    public static PendingIntent e0(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g02);
        return readPendingIntentOrNullFromParcel;
    }

    @m0
    public static ArrayList<Boolean> f(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    public static short f0(@m0 Parcel parcel, int i10) {
        k0(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    @m0
    public static Bundle g(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g02);
        return readBundle;
    }

    public static int g0(@m0 Parcel parcel, int i10) {
        return (i10 & s0.a.f12612c) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    @m0
    public static byte[] h(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g02);
        return createByteArray;
    }

    public static void h0(@m0 Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + g0(parcel, i10));
    }

    @m0
    public static byte[][] i(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g02);
        return bArr;
    }

    public static int i0(@m0 Parcel parcel) {
        int X = X(parcel);
        int g02 = g0(parcel, X);
        int dataPosition = parcel.dataPosition();
        if (O(X) == 20293) {
            int i10 = g02 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new C0175a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new C0175a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(X))), parcel);
    }

    @m0
    public static SparseArray<byte[]> j(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<byte[]> sparseArray = new SparseArray<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    public static void j0(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            throw new C0175a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
        }
    }

    @m0
    public static char[] k(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        char[] createCharArray = parcel.createCharArray();
        parcel.setDataPosition(dataPosition + g02);
        return createCharArray;
    }

    public static void k0(Parcel parcel, int i10, int i11) {
        int g02 = g0(parcel, i10);
        if (g02 != i11) {
            String hexString = Integer.toHexString(g02);
            throw new C0175a("Expected size " + i11 + " got " + g02 + " (0x" + hexString + ")", parcel);
        }
    }

    @m0
    public static double[] l(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + g02);
        return createDoubleArray;
    }

    @m0
    public static ArrayList<Double> m(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @m0
    public static SparseArray<Double> n(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<Double> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @m0
    public static float[] o(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + g02);
        return createFloatArray;
    }

    @m0
    public static ArrayList<Float> p(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @m0
    public static SparseArray<Float> q(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        SparseArray<Float> sparseArray = new SparseArray<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @m0
    public static IBinder[] r(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        IBinder[] createBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(dataPosition + g02);
        return createBinderArray;
    }

    @m0
    public static ArrayList<IBinder> s(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<IBinder> createBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(dataPosition + g02);
        return createBinderArrayList;
    }

    @m0
    public static SparseArray<IBinder> t(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        SparseArray<IBinder> sparseArray = new SparseArray<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(dataPosition + g02);
        return sparseArray;
    }

    @m0
    public static int[] u(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g02);
        return createIntArray;
    }

    @m0
    public static ArrayList<Integer> v(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @m0
    public static long[] w(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g02);
        return createLongArray;
    }

    @m0
    public static ArrayList<Long> x(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g02);
        return arrayList;
    }

    @m0
    public static Parcel y(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, g02);
        parcel.setDataPosition(dataPosition + g02);
        return obtain;
    }

    @m0
    public static Parcel[] z(@m0 Parcel parcel, int i10) {
        int g02 = g0(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (g02 == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + g02);
        return parcelArr;
    }
}
