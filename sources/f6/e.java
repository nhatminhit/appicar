package f6;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import d.g1;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7409a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7410b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f7411c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f7412d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final String f7413e = "ExoPlayerVersions";

    /* renamed from: f  reason: collision with root package name */
    public static final String f7414f = "feature";

    /* renamed from: g  reason: collision with root package name */
    public static final String f7415g = "instance_uid";

    /* renamed from: h  reason: collision with root package name */
    public static final String f7416h = "version";

    /* renamed from: i  reason: collision with root package name */
    public static final String f7417i = "feature = ? AND instance_uid = ?";

    /* renamed from: j  reason: collision with root package name */
    public static final String f7418j = "PRIMARY KEY (feature, instance_uid)";

    /* renamed from: k  reason: collision with root package name */
    public static final String f7419k = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    public static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r10 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        throw r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.database.sqlite.SQLiteDatabase r10, int r11, java.lang.String r12) throws f6.a {
        /*
            java.lang.String r0 = "ExoPlayerVersions"
            boolean r0 = e(r10, r0)     // Catch:{ SQLException -> 0x0044 }
            r1 = -1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r3 = "ExoPlayerVersions"
            java.lang.String r0 = "version"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch:{ SQLException -> 0x0044 }
            java.lang.String r5 = "feature = ? AND instance_uid = ?"
            java.lang.String[] r6 = a(r11, r12)     // Catch:{ SQLException -> 0x0044 }
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLException -> 0x0044 }
            int r11 = r10.getCount()     // Catch:{ all -> 0x0036 }
            if (r11 != 0) goto L_0x002a
            r10.close()     // Catch:{ SQLException -> 0x0044 }
            return r1
        L_0x002a:
            r10.moveToNext()     // Catch:{ all -> 0x0036 }
            r11 = 0
            int r11 = r10.getInt(r11)     // Catch:{ all -> 0x0036 }
            r10.close()     // Catch:{ SQLException -> 0x0044 }
            return r11
        L_0x0036:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r12 = move-exception
            if (r10 == 0) goto L_0x0043
            r10.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r10 = move-exception
            r11.addSuppressed(r10)     // Catch:{ SQLException -> 0x0044 }
        L_0x0043:
            throw r12     // Catch:{ SQLException -> 0x0044 }
        L_0x0044:
            r10 = move-exception
            f6.a r11 = new f6.a
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.e.b(android.database.sqlite.SQLiteDatabase, int, java.lang.String):int");
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws a {
        try {
            if (e(sQLiteDatabase, f7413e)) {
                sQLiteDatabase.delete(f7413e, f7417i, a(i10, str));
            }
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws a {
        try {
            sQLiteDatabase.execSQL(f7419k);
            ContentValues contentValues = new ContentValues();
            contentValues.put(f7414f, Integer.valueOf(i10));
            contentValues.put(f7415g, str);
            contentValues.put(f7416h, Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow(f7413e, (String) null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    @g1
    public static boolean e(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }
}
