package f6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class d extends SQLiteOpenHelper implements b {
    public static final String O = "exoplayer_internal.db";
    public static final int P = 1;
    public static final String Q = "ExoDatabaseProvider";

    public d(Context context) {
        super(context.getApplicationContext(), O, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r0 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r10.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.database.sqlite.SQLiteDatabase r10) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0, r1}
            java.lang.String r3 = "sqlite_master"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8, r9)
        L_0x0014:
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0065 }
            if (r1 == 0) goto L_0x0061
            r1 = 0
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0065 }
            r2 = 1
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r3 = "sqlite_sequence"
            boolean r3 = r3.equals(r2)     // Catch:{ all -> 0x0065 }
            if (r3 != 0) goto L_0x0014
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r3.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r4 = "DROP "
            r3.append(r4)     // Catch:{ all -> 0x0065 }
            r3.append(r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = " IF EXISTS "
            r3.append(r1)     // Catch:{ all -> 0x0065 }
            r3.append(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0065 }
            r10.execSQL(r1)     // Catch:{ SQLException -> 0x0049 }
            goto L_0x0014
        L_0x0049:
            r2 = move-exception
            java.lang.String r3 = "ExoDatabaseProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r4.<init>()     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "Error executing "
            r4.append(r5)     // Catch:{ all -> 0x0065 }
            r4.append(r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0065 }
            w7.p.e(r3, r1, r2)     // Catch:{ all -> 0x0065 }
            goto L_0x0014
        L_0x0061:
            r0.close()
            return
        L_0x0065:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r10.addSuppressed(r0)
        L_0x0072:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.d.c(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        c(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
