package x2;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import d.g1;
import d.m0;
import d.x0;
import java.util.Arrays;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class b {
    @m0
    public static Cursor a(@m0 Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i10 = 0; i10 < cursor.getColumnCount(); i10++) {
                    int type = cursor.getType(i10);
                    if (type == 0) {
                        objArr[i10] = null;
                    } else if (type == 1) {
                        objArr[i10] = Long.valueOf(cursor.getLong(i10));
                    } else if (type == 2) {
                        objArr[i10] = Double.valueOf(cursor.getDouble(i10));
                    } else if (type == 3) {
                        objArr[i10] = cursor.getString(i10);
                    } else if (type == 4) {
                        objArr[i10] = cursor.getBlob(i10);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static int b(@m0 Cursor cursor, @m0 String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    @g1(otherwise = 2)
    public static int c(String[] strArr, String str) {
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str4 = strArr[i10];
            if (str4.length() >= str.length() + 2) {
                if (str4.endsWith(str2)) {
                    return i10;
                }
                if (str4.charAt(0) == '`' && str4.endsWith(str3)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public static int d(@m0 Cursor cursor, @m0 String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        return columnIndex2 >= 0 ? columnIndex2 : b(cursor, str);
    }

    public static int e(@m0 Cursor cursor, @m0 String str) {
        String str2;
        int d10 = d(cursor, str);
        if (d10 >= 0) {
            return d10;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
