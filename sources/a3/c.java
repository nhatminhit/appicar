package a3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import d.t0;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;

public interface c extends Closeable {
    void C(int i10);

    int C1();

    @t0(api = 16)
    void D();

    void E(String str) throws SQLException;

    boolean F0();

    Cursor G(f fVar);

    Cursor G0(String str);

    boolean I();

    long J0(String str, int i10, ContentValues contentValues) throws SQLException;

    void K0(SQLiteTransactionListener sQLiteTransactionListener);

    h L(String str);

    boolean L0();

    void M0();

    boolean S0(int i10);

    @t0(api = 16)
    Cursor Y0(f fVar, CancellationSignal cancellationSignal);

    boolean b0();

    void c1(Locale locale);

    void i1(SQLiteTransactionListener sQLiteTransactionListener);

    boolean isOpen();

    String j1();

    @t0(api = 16)
    void l0(boolean z10);

    long n0();

    boolean n1();

    int p(String str, String str2, Object[] objArr);

    boolean r0();

    void s();

    void s0();

    void u0(String str, Object[] objArr) throws SQLException;

    @t0(api = 16)
    boolean u1();

    boolean v(long j10);

    long v0();

    void w0();

    void w1(int i10);

    int x0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    void x1(long j10);

    Cursor y(String str, Object[] objArr);

    long y0(long j10);

    List<Pair<String, String>> z();
}
