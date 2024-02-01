package b3;

import a3.c;
import a3.f;
import a3.h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import d.t0;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class a implements c {
    public static final String[] P = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] Q = new String[0];
    public final SQLiteDatabase O;

    /* renamed from: b3.a$a  reason: collision with other inner class name */
    public class C0060a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f4107a;

        public C0060a(f fVar) {
            this.f4107a = fVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f4107a.g(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f4109a;

        public b(f fVar) {
            this.f4109a = fVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f4109a.g(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.O = sQLiteDatabase;
    }

    public void C(int i10) {
        this.O.setVersion(i10);
    }

    public int C1() {
        return this.O.getVersion();
    }

    @t0(api = 16)
    public void D() {
        this.O.disableWriteAheadLogging();
    }

    public void E(String str) throws SQLException {
        this.O.execSQL(str);
    }

    public boolean F0() {
        return this.O.yieldIfContendedSafely();
    }

    public Cursor G(f fVar) {
        return this.O.rawQueryWithFactory(new C0060a(fVar), fVar.f(), Q, (String) null);
    }

    public Cursor G0(String str) {
        return G(new a3.b(str));
    }

    public boolean I() {
        return this.O.isDatabaseIntegrityOk();
    }

    public long J0(String str, int i10, ContentValues contentValues) throws SQLException {
        return this.O.insertWithOnConflict(str, (String) null, contentValues, i10);
    }

    public void K0(SQLiteTransactionListener sQLiteTransactionListener) {
        this.O.beginTransactionWithListener(sQLiteTransactionListener);
    }

    public h L(String str) {
        return new e(this.O.compileStatement(str));
    }

    public boolean L0() {
        return this.O.isDbLockedByCurrentThread();
    }

    public void M0() {
        this.O.endTransaction();
    }

    public boolean S0(int i10) {
        return this.O.needUpgrade(i10);
    }

    @t0(api = 16)
    public Cursor Y0(f fVar, CancellationSignal cancellationSignal) {
        return this.O.rawQueryWithFactory(new b(fVar), fVar.f(), Q, (String) null, cancellationSignal);
    }

    public boolean b0() {
        return this.O.isReadOnly();
    }

    public boolean c(SQLiteDatabase sQLiteDatabase) {
        return this.O == sQLiteDatabase;
    }

    public void c1(Locale locale) {
        this.O.setLocale(locale);
    }

    public void close() throws IOException {
        this.O.close();
    }

    public void i1(SQLiteTransactionListener sQLiteTransactionListener) {
        this.O.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    public boolean isOpen() {
        return this.O.isOpen();
    }

    public String j1() {
        return this.O.getPath();
    }

    @t0(api = 16)
    public void l0(boolean z10) {
        this.O.setForeignKeyConstraintsEnabled(z10);
    }

    public long n0() {
        return this.O.getPageSize();
    }

    public boolean n1() {
        return this.O.inTransaction();
    }

    public int p(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb2.append(str3);
        h L = L(sb2.toString());
        a3.b.b(L, objArr);
        return L.K();
    }

    public boolean r0() {
        return this.O.enableWriteAheadLogging();
    }

    public void s() {
        this.O.beginTransaction();
    }

    public void s0() {
        this.O.setTransactionSuccessful();
    }

    public void u0(String str, Object[] objArr) throws SQLException {
        this.O.execSQL(str, objArr);
    }

    @t0(api = 16)
    public boolean u1() {
        return this.O.isWriteAheadLoggingEnabled();
    }

    public boolean v(long j10) {
        return this.O.yieldIfContendedSafely(j10);
    }

    public long v0() {
        return this.O.getMaximumSize();
    }

    public void w0() {
        this.O.beginTransactionNonExclusive();
    }

    public void w1(int i10) {
        this.O.setMaxSqlCacheSize(i10);
    }

    public int x0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb2 = new StringBuilder(120);
        sb2.append("UPDATE ");
        sb2.append(P[i10]);
        sb2.append(str);
        sb2.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i11 = 0;
        for (String next : contentValues.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(next);
            objArr2[i11] = contentValues.get(next);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(" WHERE ");
            sb2.append(str2);
        }
        h L = L(sb2.toString());
        a3.b.b(L, objArr2);
        return L.K();
    }

    public void x1(long j10) {
        this.O.setPageSize(j10);
    }

    public Cursor y(String str, Object[] objArr) {
        return G(new a3.b(str, objArr));
    }

    public long y0(long j10) {
        return this.O.setMaximumSize(j10);
    }

    public List<Pair<String, String>> z() {
        return this.O.getAttachedDbs();
    }
}
