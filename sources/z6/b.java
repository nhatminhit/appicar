package z6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import d.g1;
import d.o0;
import f6.e;
import java.util.ArrayList;
import java.util.List;
import w7.q0;

public final class b implements y {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    public static final int D = 9;
    public static final int E = 10;
    public static final int F = 11;
    public static final int G = 12;
    public static final int H = 13;
    public static final String I = "id = ?";
    public static final String J = "state = 2";
    public static final String K = o(3, 4);
    public static final String[] L = {"id", "title", "uri", f15909j, f15910k, "data", "state", f15913n, f15914o, f15915p, "stop_reason", f15917r, f15918s, f15919t};
    public static final String M = "(id TEXT PRIMARY KEY NOT NULL,title TEXT NOT NULL,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL)";
    public static final String N = "1";

    /* renamed from: e  reason: collision with root package name */
    public static final String f15904e = "ExoPlayerDownloads";
    @g1

    /* renamed from: f  reason: collision with root package name */
    public static final int f15905f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final String f15906g = "id";

    /* renamed from: h  reason: collision with root package name */
    public static final String f15907h = "title";

    /* renamed from: i  reason: collision with root package name */
    public static final String f15908i = "uri";

    /* renamed from: j  reason: collision with root package name */
    public static final String f15909j = "stream_keys";

    /* renamed from: k  reason: collision with root package name */
    public static final String f15910k = "custom_cache_key";

    /* renamed from: l  reason: collision with root package name */
    public static final String f15911l = "data";

    /* renamed from: m  reason: collision with root package name */
    public static final String f15912m = "state";

    /* renamed from: n  reason: collision with root package name */
    public static final String f15913n = "start_time_ms";

    /* renamed from: o  reason: collision with root package name */
    public static final String f15914o = "update_time_ms";

    /* renamed from: p  reason: collision with root package name */
    public static final String f15915p = "content_length";

    /* renamed from: q  reason: collision with root package name */
    public static final String f15916q = "stop_reason";

    /* renamed from: r  reason: collision with root package name */
    public static final String f15917r = "failure_reason";

    /* renamed from: s  reason: collision with root package name */
    public static final String f15918s = "percent_downloaded";

    /* renamed from: t  reason: collision with root package name */
    public static final String f15919t = "bytes_downloaded";

    /* renamed from: u  reason: collision with root package name */
    public static final int f15920u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f15921v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f15922w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f15923x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f15924y = 4;

    /* renamed from: z  reason: collision with root package name */
    public static final int f15925z = 5;

    /* renamed from: a  reason: collision with root package name */
    public final String f15926a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15927b;

    /* renamed from: c  reason: collision with root package name */
    public final f6.b f15928c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15929d;

    /* renamed from: z6.b$b  reason: collision with other inner class name */
    public static final class C0253b implements f {
        public final Cursor O;

        public C0253b(Cursor cursor) {
            this.O = cursor;
        }

        public void close() {
            this.O.close();
        }

        public int getCount() {
            return this.O.getCount();
        }

        public int getPosition() {
            return this.O.getPosition();
        }

        public /* synthetic */ boolean isAfterLast() {
            return e.a(this);
        }

        public /* synthetic */ boolean isBeforeFirst() {
            return e.b(this);
        }

        public boolean isClosed() {
            return this.O.isClosed();
        }

        public /* synthetic */ boolean isFirst() {
            return e.c(this);
        }

        public /* synthetic */ boolean isLast() {
            return e.d(this);
        }

        public /* synthetic */ boolean moveToFirst() {
            return e.e(this);
        }

        public /* synthetic */ boolean moveToLast() {
            return e.f(this);
        }

        public /* synthetic */ boolean moveToNext() {
            return e.g(this);
        }

        public boolean moveToPosition(int i10) {
            return this.O.moveToPosition(i10);
        }

        public /* synthetic */ boolean moveToPrevious() {
            return e.h(this);
        }

        public d s1() {
            return b.n(this.O);
        }
    }

    public b(f6.b bVar) {
        this(bVar, "");
    }

    public b(f6.b bVar, String str) {
        this.f15926a = str;
        this.f15928c = bVar;
        this.f15927b = f15904e + str;
    }

    public static List<StreamKey> j(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.isEmpty()) {
            return arrayList;
        }
        for (String R0 : q0.R0(str, ",")) {
            String[] R02 = q0.R0(R0, "\\.");
            w7.a.i(R02.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(R02[0]), Integer.parseInt(R02[1]), Integer.parseInt(R02[2])));
        }
        return arrayList;
    }

    public static String k(List<StreamKey> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            StreamKey streamKey = list.get(i10);
            sb2.append(streamKey.O);
            sb2.append('.');
            sb2.append(streamKey.P);
            sb2.append('.');
            sb2.append(streamKey.Q);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public static d n(Cursor cursor) {
        DownloadRequest downloadRequest = new DownloadRequest(cursor.getString(0), cursor.getString(1), Uri.parse(cursor.getString(2)), j(cursor.getString(3)), cursor.getString(4), cursor.getBlob(5));
        s sVar = new s();
        sVar.f15980a = cursor.getLong(13);
        sVar.f15981b = cursor.getFloat(12);
        return new d(downloadRequest, cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), cursor.getInt(11), sVar);
    }

    public static String o(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("state");
        sb2.append(" IN (");
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i10]);
        }
        sb2.append(')');
        return sb2.toString();
    }

    public void a(d dVar) throws f6.a {
        l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", dVar.f15944a.O);
        contentValues.put("title", dVar.f15944a.P);
        contentValues.put("uri", dVar.f15944a.Q.toString());
        contentValues.put(f15909j, k(dVar.f15944a.R));
        contentValues.put(f15910k, dVar.f15944a.S);
        contentValues.put("data", dVar.f15944a.T);
        contentValues.put("state", Integer.valueOf(dVar.f15945b));
        contentValues.put(f15913n, Long.valueOf(dVar.f15946c));
        contentValues.put(f15914o, Long.valueOf(dVar.f15947d));
        contentValues.put(f15915p, Long.valueOf(dVar.f15948e));
        contentValues.put("stop_reason", Integer.valueOf(dVar.f15949f));
        contentValues.put(f15917r, Integer.valueOf(dVar.f15950g));
        contentValues.put(f15918s, Float.valueOf(dVar.b()));
        contentValues.put(f15919t, Long.valueOf(dVar.a()));
        try {
            this.f15928c.getWritableDatabase().replaceOrThrow(this.f15927b, (String) null, contentValues);
        } catch (SQLiteException e10) {
            throw new f6.a(e10);
        }
    }

    public f b(int... iArr) throws f6.a {
        l();
        return new C0253b(m(o(iArr), (String[]) null));
    }

    public void c() throws f6.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 5);
            this.f15928c.getWritableDatabase().update(this.f15927b, contentValues, (String) null, (String[]) null);
        } catch (SQLException e10) {
            throw new f6.a(e10);
        }
    }

    public void d(String str, int i10) throws f6.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            SQLiteDatabase writableDatabase = this.f15928c.getWritableDatabase();
            String str2 = this.f15927b;
            writableDatabase.update(str2, contentValues, K + " AND " + "id = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new f6.a(e10);
        }
    }

    public void e() throws f6.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", 0);
            this.f15928c.getWritableDatabase().update(this.f15927b, contentValues, J, (String[]) null);
        } catch (SQLException e10) {
            throw new f6.a(e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        if (r4 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r1;
     */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z6.d f(java.lang.String r4) throws f6.a {
        /*
            r3 = this;
            r3.l()
            java.lang.String r0 = "id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ SQLiteException -> 0x0033 }
            r2 = 0
            r1[r2] = r4     // Catch:{ SQLiteException -> 0x0033 }
            android.database.Cursor r4 = r3.m(r0, r1)     // Catch:{ SQLiteException -> 0x0033 }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001a
            r0 = 0
            r4.close()     // Catch:{ SQLiteException -> 0x0033 }
            return r0
        L_0x001a:
            r4.moveToNext()     // Catch:{ all -> 0x0025 }
            z6.d r0 = n(r4)     // Catch:{ all -> 0x0025 }
            r4.close()     // Catch:{ SQLiteException -> 0x0033 }
            return r0
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r1 = move-exception
            if (r4 == 0) goto L_0x0032
            r4.close()     // Catch:{ all -> 0x002e }
            goto L_0x0032
        L_0x002e:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch:{ SQLiteException -> 0x0033 }
        L_0x0032:
            throw r1     // Catch:{ SQLiteException -> 0x0033 }
        L_0x0033:
            r4 = move-exception
            f6.a r0 = new f6.a
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.b.f(java.lang.String):z6.d");
    }

    public void g(String str) throws f6.a {
        l();
        try {
            this.f15928c.getWritableDatabase().delete(this.f15927b, "id = ?", new String[]{str});
        } catch (SQLiteException e10) {
            throw new f6.a(e10);
        }
    }

    public void h(int i10) throws f6.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f15928c.getWritableDatabase().update(this.f15927b, contentValues, K, (String[]) null);
        } catch (SQLException e10) {
            throw new f6.a(e10);
        }
    }

    public final void l() throws f6.a {
        SQLiteDatabase writableDatabase;
        if (!this.f15929d) {
            try {
                if (e.b(this.f15928c.getReadableDatabase(), 0, this.f15926a) != 2) {
                    writableDatabase = this.f15928c.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    e.d(writableDatabase, 0, this.f15926a, 2);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f15927b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f15927b + " " + M);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                this.f15929d = true;
            } catch (SQLException e10) {
                throw new f6.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }
    }

    public final Cursor m(String str, @o0 String[] strArr) throws f6.a {
        try {
            return this.f15928c.getReadableDatabase().query(this.f15927b, L, str, strArr, (String) null, (String) null, "start_time_ms ASC");
        } catch (SQLiteException e10) {
            throw new f6.a(e10);
        }
    }
}
