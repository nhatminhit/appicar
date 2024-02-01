package u7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import f6.a;
import f6.b;
import f6.e;
import java.util.Set;

public final class h {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13818c = "ExoPlayerCacheFileMetadata";

    /* renamed from: d  reason: collision with root package name */
    public static final int f13819d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final String f13820e = "name";

    /* renamed from: f  reason: collision with root package name */
    public static final String f13821f = "length";

    /* renamed from: g  reason: collision with root package name */
    public static final String f13822g = "last_touch_timestamp";

    /* renamed from: h  reason: collision with root package name */
    public static final int f13823h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final int f13824i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f13825j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final String f13826k = "0 = ?";

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f13827l = {"name", f13821f, f13822g};

    /* renamed from: m  reason: collision with root package name */
    public static final String f13828m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* renamed from: a  reason: collision with root package name */
    public final b f13829a;

    /* renamed from: b  reason: collision with root package name */
    public String f13830b;

    public h(b bVar) {
        this.f13829a = bVar;
    }

    public static void a(b bVar, long j10) throws a {
        SQLiteDatabase writableDatabase;
        String hexString = Long.toHexString(j10);
        try {
            String e10 = e(hexString);
            writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransaction();
            e.c(writableDatabase, 2, hexString);
            b(writableDatabase, e10);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e11) {
            throw new a(e11);
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String e(String str) {
        return f13818c + str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, u7.g> c() throws f6.a {
        /*
            r8 = this;
            android.database.Cursor r0 = r8.d()     // Catch:{ SQLException -> 0x003d }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x002f }
            int r2 = r0.getCount()     // Catch:{ all -> 0x002f }
            r1.<init>(r2)     // Catch:{ all -> 0x002f }
        L_0x000d:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x002b
            r2 = 0
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x002f }
            r3 = 1
            long r3 = r0.getLong(r3)     // Catch:{ all -> 0x002f }
            r5 = 2
            long r5 = r0.getLong(r5)     // Catch:{ all -> 0x002f }
            u7.g r7 = new u7.g     // Catch:{ all -> 0x002f }
            r7.<init>(r3, r5)     // Catch:{ all -> 0x002f }
            r1.put(r2, r7)     // Catch:{ all -> 0x002f }
            goto L_0x000d
        L_0x002b:
            r0.close()     // Catch:{ SQLException -> 0x003d }
            return r1
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r2 = move-exception
            if (r0 == 0) goto L_0x003c
            r0.close()     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x003d }
        L_0x003c:
            throw r2     // Catch:{ SQLException -> 0x003d }
        L_0x003d:
            r0 = move-exception
            f6.a r1 = new f6.a
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.h.c():java.util.Map");
    }

    public final Cursor d() {
        w7.a.g(this.f13830b);
        return this.f13829a.getReadableDatabase().query(this.f13830b, f13827l, (String) null, (String[]) null, (String) null, (String) null, (String) null);
    }

    public void f(long j10) throws a {
        SQLiteDatabase writableDatabase;
        try {
            String hexString = Long.toHexString(j10);
            this.f13830b = e(hexString);
            if (e.b(this.f13829a.getReadableDatabase(), 2, hexString) != 1) {
                writableDatabase = this.f13829a.getWritableDatabase();
                writableDatabase.beginTransaction();
                e.d(writableDatabase, 2, hexString, 1);
                b(writableDatabase, this.f13830b);
                writableDatabase.execSQL("CREATE TABLE " + this.f13830b + " " + f13828m);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public void g(String str) throws a {
        w7.a.g(this.f13830b);
        try {
            this.f13829a.getWritableDatabase().delete(this.f13830b, f13826k, new String[]{str});
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public void h(Set<String> set) throws a {
        SQLiteDatabase writableDatabase;
        w7.a.g(this.f13830b);
        try {
            writableDatabase = this.f13829a.getWritableDatabase();
            writableDatabase.beginTransaction();
            for (String str : set) {
                writableDatabase.delete(this.f13830b, f13826k, new String[]{str});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new a(e10);
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public void i(String str, long j10, long j11) throws a {
        w7.a.g(this.f13830b);
        try {
            SQLiteDatabase writableDatabase = this.f13829a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(f13821f, Long.valueOf(j10));
            contentValues.put(f13822g, Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f13830b, (String) null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }
}
