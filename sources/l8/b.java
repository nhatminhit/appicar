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
import java.util.List;
import s0.a;

public class b {
    public static void A(@m0 Parcel parcel, int i10, @m0 SparseArray<Float> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                parcel.writeFloat(sparseArray.valueAt(i11).floatValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void B(@m0 Parcel parcel, int i10, @m0 IBinder iBinder, boolean z10) {
        if (iBinder != null) {
            int f02 = f0(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void C(@m0 Parcel parcel, int i10, @m0 IBinder[] iBinderArr, boolean z10) {
        if (iBinderArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeBinderArray(iBinderArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void D(@m0 Parcel parcel, int i10, @m0 List<IBinder> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            parcel.writeBinderList(list);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void E(@m0 Parcel parcel, int i10, @m0 SparseArray<IBinder> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                parcel.writeStrongBinder(sparseArray.valueAt(i11));
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void F(@m0 Parcel parcel, int i10, int i11) {
        h0(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void G(@m0 Parcel parcel, int i10, @m0 int[] iArr, boolean z10) {
        if (iArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeIntArray(iArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void H(@m0 Parcel parcel, int i10, @m0 List<Integer> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(list.get(i11).intValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void I(@m0 Parcel parcel, int i10, @m0 Integer num, boolean z10) {
        if (num != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void J(@m0 Parcel parcel, int i10, @m0 List list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            parcel.writeList(list);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void K(@m0 Parcel parcel, int i10, long j10) {
        h0(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void L(@m0 Parcel parcel, int i10, @m0 long[] jArr, boolean z10) {
        if (jArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeLongArray(jArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void M(@m0 Parcel parcel, int i10, @m0 List<Long> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeLong(list.get(i11).longValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void N(@m0 Parcel parcel, int i10, @m0 Long l10, boolean z10) {
        if (l10 != null) {
            h0(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void O(@m0 Parcel parcel, int i10, @m0 Parcel parcel2, boolean z10) {
        if (parcel2 != null) {
            int f02 = f0(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void P(@m0 Parcel parcel, int i10, @m0 Parcel[] parcelArr, boolean z10) {
        if (parcelArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeInt(r7);
            for (Parcel parcel2 : parcelArr) {
                if (parcel2 != null) {
                    parcel.writeInt(parcel2.dataSize());
                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void Q(@m0 Parcel parcel, int i10, @m0 List<Parcel> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcel parcel2 = list.get(i11);
                if (parcel2 != null) {
                    parcel.writeInt(parcel2.dataSize());
                    parcel.appendFrom(parcel2, 0, parcel2.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void R(@m0 Parcel parcel, int i10, @m0 SparseArray<Parcel> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                Parcel valueAt = sparseArray.valueAt(i11);
                if (valueAt != null) {
                    parcel.writeInt(valueAt.dataSize());
                    parcel.appendFrom(valueAt, 0, valueAt.dataSize());
                } else {
                    parcel.writeInt(0);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void S(@m0 Parcel parcel, int i10, @m0 Parcelable parcelable, int i11, boolean z10) {
        if (parcelable != null) {
            int f02 = f0(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void T(@m0 Parcel parcel, int i10, @m0 PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent != null) {
            int f02 = f0(parcel, i10);
            PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void U(@m0 Parcel parcel, int i10, short s10) {
        h0(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    public static void V(@m0 Parcel parcel, int i10, @m0 SparseBooleanArray sparseBooleanArray, boolean z10) {
        if (sparseBooleanArray != null) {
            int f02 = f0(parcel, i10);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void W(@m0 Parcel parcel, int i10, @m0 SparseIntArray sparseIntArray, boolean z10) {
        if (sparseIntArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseIntArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseIntArray.keyAt(i11));
                parcel.writeInt(sparseIntArray.valueAt(i11));
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void X(@m0 Parcel parcel, int i10, @m0 SparseLongArray sparseLongArray, boolean z10) {
        if (sparseLongArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseLongArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseLongArray.keyAt(i11));
                parcel.writeLong(sparseLongArray.valueAt(i11));
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void Y(@m0 Parcel parcel, int i10, @m0 String str, boolean z10) {
        if (str != null) {
            int f02 = f0(parcel, i10);
            parcel.writeString(str);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void Z(@m0 Parcel parcel, int i10, @m0 String[] strArr, boolean z10) {
        if (strArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeStringArray(strArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static int a(@m0 Parcel parcel) {
        return f0(parcel, 20293);
    }

    public static void a0(@m0 Parcel parcel, int i10, @m0 List<String> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            parcel.writeStringList(list);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void b(@m0 Parcel parcel, int i10) {
        g0(parcel, i10);
    }

    public static void b0(@m0 Parcel parcel, int i10, @m0 SparseArray<String> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                parcel.writeString(sparseArray.valueAt(i11));
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void c(@m0 Parcel parcel, int i10, @m0 BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal != null) {
            int f02 = f0(parcel, i10);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void c0(@m0 Parcel parcel, int i10, @m0 T[] tArr, int i11, boolean z10) {
        if (tArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeInt(r7);
            for (T t10 : tArr) {
                if (t10 == null) {
                    parcel.writeInt(0);
                } else {
                    i0(parcel, t10, i11);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void d(@m0 Parcel parcel, int i10, @m0 BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr != null) {
            int f02 = f0(parcel, i10);
            int length = bigDecimalArr.length;
            parcel.writeInt(length);
            for (int i11 = 0; i11 < length; i11++) {
                parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
                parcel.writeInt(bigDecimalArr[i11].scale());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void d0(@m0 Parcel parcel, int i10, @m0 List<T> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    i0(parcel, parcelable, 0);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void e(@m0 Parcel parcel, int i10, @m0 BigInteger bigInteger, boolean z10) {
        if (bigInteger != null) {
            int f02 = f0(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void e0(@m0 Parcel parcel, int i10, @m0 SparseArray<T> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                Parcelable parcelable = (Parcelable) sparseArray.valueAt(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    i0(parcel, parcelable, 0);
                }
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void f(@m0 Parcel parcel, int i10, @m0 BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeInt(r5);
            for (BigInteger byteArray : bigIntegerArr) {
                parcel.writeByteArray(byteArray.toByteArray());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static int f0(Parcel parcel, int i10) {
        parcel.writeInt(i10 | a.f12612c);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(@m0 Parcel parcel, int i10, boolean z10) {
        h0(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void g0(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void h(@m0 Parcel parcel, int i10, @m0 boolean[] zArr, boolean z10) {
        if (zArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeBooleanArray(zArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void h0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void i(@m0 Parcel parcel, int i10, @m0 List<Boolean> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(list.get(i11).booleanValue() ? 1 : 0);
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void i0(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void j(@m0 Parcel parcel, int i10, @m0 Boolean bool, boolean z10) {
        if (bool != null) {
            h0(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void k(@m0 Parcel parcel, int i10, @m0 Bundle bundle, boolean z10) {
        if (bundle != null) {
            int f02 = f0(parcel, i10);
            parcel.writeBundle(bundle);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void l(@m0 Parcel parcel, int i10, byte b10) {
        h0(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void m(@m0 Parcel parcel, int i10, @m0 byte[] bArr, boolean z10) {
        if (bArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeByteArray(bArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void n(@m0 Parcel parcel, int i10, @m0 byte[][] bArr, boolean z10) {
        if (bArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeInt(r5);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void o(@m0 Parcel parcel, int i10, @m0 SparseArray<byte[]> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                parcel.writeByteArray(sparseArray.valueAt(i11));
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void p(@m0 Parcel parcel, int i10, char c10) {
        h0(parcel, i10, 4);
        parcel.writeInt(c10);
    }

    public static void q(@m0 Parcel parcel, int i10, @m0 char[] cArr, boolean z10) {
        if (cArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeCharArray(cArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void r(@m0 Parcel parcel, int i10, double d10) {
        h0(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void s(@m0 Parcel parcel, int i10, @m0 double[] dArr, boolean z10) {
        if (dArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeDoubleArray(dArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void t(@m0 Parcel parcel, int i10, @m0 List<Double> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeDouble(list.get(i11).doubleValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void u(@m0 Parcel parcel, int i10, @m0 Double d10, boolean z10) {
        if (d10 != null) {
            h0(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void v(@m0 Parcel parcel, int i10, @m0 SparseArray<Double> sparseArray, boolean z10) {
        if (sparseArray != null) {
            int f02 = f0(parcel, i10);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(sparseArray.keyAt(i11));
                parcel.writeDouble(sparseArray.valueAt(i11).doubleValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void w(@m0 Parcel parcel, int i10, float f10) {
        h0(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void x(@m0 Parcel parcel, int i10, @m0 float[] fArr, boolean z10) {
        if (fArr != null) {
            int f02 = f0(parcel, i10);
            parcel.writeFloatArray(fArr);
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void y(@m0 Parcel parcel, int i10, @m0 List<Float> list, boolean z10) {
        if (list != null) {
            int f02 = f0(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeFloat(list.get(i11).floatValue());
            }
            g0(parcel, f02);
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }

    public static void z(@m0 Parcel parcel, int i10, @m0 Float f10, boolean z10) {
        if (f10 != null) {
            h0(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            h0(parcel, i10, 0);
        }
    }
}
