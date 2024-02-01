package l0;

import android.database.Cursor;
import fh.g;
import fh.h;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\b¨\u0006\u0015"}, d2 = {"Landroid/database/Cursor;", "", "index", "", "a", "", "b", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "c", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "d", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "e", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", "f", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "g", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class a {
    @h
    public static final byte[] a(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getBlob(i10);
    }

    @h
    public static final Double b(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i10));
    }

    @h
    public static final Float c(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i10));
    }

    @h
    public static final Integer d(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i10));
    }

    @h
    public static final Long e(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i10));
    }

    @h
    public static final Short f(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i10));
    }

    @h
    public static final String g(@g Cursor cursor, int i10) {
        l0.p(cursor, "<this>");
        if (cursor.isNull(i10)) {
            return null;
        }
        return cursor.getString(i10);
    }
}
