package x0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import fh.g;
import java.io.Serializable;
import kotlin.Metadata;
import xe.l0;
import zd.u0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lzd/u0;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Lzd/u0;)Landroid/os/Bundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class b {
    @g
    public static final Bundle a(@g u0<String, ? extends Object>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        Bundle bundle = new Bundle(u0VarArr.length);
        int length = u0VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            u0<String, ? extends Object> u0Var = u0VarArr[i10];
            i10++;
            String a10 = u0Var.a();
            Object b10 = u0Var.b();
            if (b10 == null) {
                bundle.putString(a10, (String) null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(a10, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(a10, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(a10, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(a10, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(a10, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(a10, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(a10, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(a10, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(a10, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(a10, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(a10, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(a10, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(a10, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(a10, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(a10, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(a10, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(a10, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(a10, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(a10, (short[]) b10);
            } else {
                if (b10 instanceof Object[]) {
                    Class<?> componentType = b10.getClass().getComponentType();
                    l0.m(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(a10, (Parcelable[]) b10);
                    } else if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(a10, (String[]) b10);
                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(a10, (CharSequence[]) b10);
                    } else if (!Serializable.class.isAssignableFrom(componentType)) {
                        String canonicalName = componentType.getCanonicalName();
                        throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + a10 + '\"');
                    }
                } else if (!(b10 instanceof Serializable)) {
                    if (b10 instanceof IBinder) {
                        bundle.putBinder(a10, (IBinder) b10);
                    } else if (b10 instanceof Size) {
                        bundle.putSize(a10, (Size) b10);
                    } else if (b10 instanceof SizeF) {
                        bundle.putSizeF(a10, (SizeF) b10);
                    } else {
                        String canonicalName2 = b10.getClass().getCanonicalName();
                        throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + a10 + '\"');
                    }
                }
                bundle.putSerializable(a10, (Serializable) b10);
            }
        }
        return bundle;
    }
}
