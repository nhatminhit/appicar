package i0;

import android.content.ContentValues;
import fh.g;
import kotlin.Metadata;
import xe.l0;
import zd.u0;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lzd/u0;", "", "", "pairs", "Landroid/content/ContentValues;", "a", "([Lzd/u0;)Landroid/content/ContentValues;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class c {
    @g
    public static final ContentValues a(@g u0<String, ? extends Object>... u0VarArr) {
        l0.p(u0VarArr, "pairs");
        ContentValues contentValues = new ContentValues(u0VarArr.length);
        int length = u0VarArr.length;
        int i10 = 0;
        while (i10 < length) {
            u0<String, ? extends Object> u0Var = u0VarArr[i10];
            i10++;
            String a10 = u0Var.a();
            Object b10 = u0Var.b();
            if (b10 == null) {
                contentValues.putNull(a10);
            } else if (b10 instanceof String) {
                contentValues.put(a10, (String) b10);
            } else if (b10 instanceof Integer) {
                contentValues.put(a10, (Integer) b10);
            } else if (b10 instanceof Long) {
                contentValues.put(a10, (Long) b10);
            } else if (b10 instanceof Boolean) {
                contentValues.put(a10, (Boolean) b10);
            } else if (b10 instanceof Float) {
                contentValues.put(a10, (Float) b10);
            } else if (b10 instanceof Double) {
                contentValues.put(a10, (Double) b10);
            } else if (b10 instanceof byte[]) {
                contentValues.put(a10, (byte[]) b10);
            } else if (b10 instanceof Byte) {
                contentValues.put(a10, (Byte) b10);
            } else if (b10 instanceof Short) {
                contentValues.put(a10, (Short) b10);
            } else {
                String canonicalName = b10.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + a10 + '\"');
            }
        }
        return contentValues;
    }
}
