package x0;

import android.os.PersistableBundle;
import d.t0;
import fh.g;
import kotlin.Metadata;
import xe.l0;
import zd.u0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lzd/u0;", "", "", "pairs", "Landroid/os/PersistableBundle;", "a", "([Lzd/u0;)Landroid/os/PersistableBundle;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class u {
    @t0(21)
    @g
    public static final PersistableBundle a(@g u0<String, ? extends Object>... u0VarArr) {
        String str;
        l0.p(u0VarArr, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(u0VarArr.length);
        int length = u0VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            u0<String, ? extends Object> u0Var = u0VarArr[i10];
            i10++;
            String a10 = u0Var.a();
            Object b10 = u0Var.b();
            if (b10 == null) {
                str = null;
            } else if (b10 instanceof Boolean) {
                persistableBundle.putBoolean(a10, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Double) {
                persistableBundle.putDouble(a10, ((Number) b10).doubleValue());
            } else if (b10 instanceof Integer) {
                persistableBundle.putInt(a10, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                persistableBundle.putLong(a10, ((Number) b10).longValue());
            } else if (b10 instanceof String) {
                str = (String) b10;
            } else if (b10 instanceof boolean[]) {
                persistableBundle.putBooleanArray(a10, (boolean[]) b10);
            } else if (b10 instanceof double[]) {
                persistableBundle.putDoubleArray(a10, (double[]) b10);
            } else if (b10 instanceof int[]) {
                persistableBundle.putIntArray(a10, (int[]) b10);
            } else if (b10 instanceof long[]) {
                persistableBundle.putLongArray(a10, (long[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                l0.m(componentType);
                if (String.class.isAssignableFrom(componentType)) {
                    persistableBundle.putStringArray(a10, (String[]) b10);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    throw new IllegalArgumentException("Illegal value array type " + canonicalName + " for key \"" + a10 + '\"');
                }
            } else {
                String canonicalName2 = b10.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName2 + " for key \"" + a10 + '\"');
            }
            persistableBundle.putString(a10, str);
        }
        return persistableBundle;
    }
}
