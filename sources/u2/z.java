package u2;

import a3.d;
import a3.f;
import a3.h;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import d.m0;
import d.o0;
import d.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class z implements d, p0 {
    @m0
    public final d O;
    @m0
    public final a P;
    @m0
    public final a Q;

    public static final class a implements a3.c {
        @m0
        public final a O;

        public a(@m0 a aVar) {
            this.O = aVar;
        }

        public static /* synthetic */ Object k0(a3.c cVar) {
            return null;
        }

        public void C(int i10) {
            this.O.c(new g(i10));
        }

        public int C1() {
            return ((Integer) this.O.c(new r())).intValue();
        }

        public void D() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        public void E(String str) throws SQLException {
            this.O.c(new d(str));
        }

        public boolean F0() {
            return ((Boolean) this.O.c(new p())).booleanValue();
        }

        public Cursor G(f fVar) {
            try {
                return new c(this.O.f().G(fVar), this.O);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public Cursor G0(String str) {
            try {
                return new c(this.O.f().G0(str), this.O);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public boolean I() {
            return ((Boolean) this.O.c(new f())).booleanValue();
        }

        public long J0(String str, int i10, ContentValues contentValues) throws SQLException {
            return ((Long) this.O.c(new q(str, i10, contentValues))).longValue();
        }

        public void K0(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.O.f().K0(sQLiteTransactionListener);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public h L(String str) {
            return new b(str, this.O);
        }

        public boolean L0() {
            if (this.O.d() == null) {
                return false;
            }
            return ((Boolean) this.O.c(new s())).booleanValue();
        }

        public void M0() {
            if (this.O.d() != null) {
                try {
                    this.O.d().M0();
                } finally {
                    this.O.b();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
        }

        public boolean S0(int i10) {
            return ((Boolean) this.O.c(new j(i10))).booleanValue();
        }

        @t0(api = 24)
        public Cursor Y0(f fVar, CancellationSignal cancellationSignal) {
            try {
                return new c(this.O.f().Y0(fVar, cancellationSignal), this.O);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public boolean b0() {
            return ((Boolean) this.O.c(new t())).booleanValue();
        }

        public void c1(Locale locale) {
            this.O.c(new w(locale));
        }

        public void close() throws IOException {
            this.O.a();
        }

        public void f1() {
            this.O.c(new c());
        }

        public void i1(SQLiteTransactionListener sQLiteTransactionListener) {
            try {
                this.O.f().i1(sQLiteTransactionListener);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public boolean isOpen() {
            a3.c d10 = this.O.d();
            if (d10 == null) {
                return false;
            }
            return d10.isOpen();
        }

        public String j1() {
            return (String) this.O.c(new o());
        }

        @t0(api = 16)
        @SuppressLint({"UnsafeNewApiCall"})
        public void l0(boolean z10) {
            this.O.c(new m(z10));
        }

        public long n0() {
            return ((Long) this.O.c(new l())).longValue();
        }

        public boolean n1() {
            if (this.O.d() == null) {
                return false;
            }
            return ((Boolean) this.O.c(new x())).booleanValue();
        }

        public int p(String str, String str2, Object[] objArr) {
            return ((Integer) this.O.c(new h(str, str2, objArr))).intValue();
        }

        public boolean r0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        public void s() {
            try {
                this.O.f().s();
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public void s0() {
            a3.c d10 = this.O.d();
            if (d10 != null) {
                d10.s0();
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }

        public void u0(String str, Object[] objArr) throws SQLException {
            this.O.c(new n(str, objArr));
        }

        @t0(api = 16)
        @SuppressLint({"UnsafeNewApiCall"})
        public boolean u1() {
            return ((Boolean) this.O.c(new b())).booleanValue();
        }

        public boolean v(long j10) {
            return ((Boolean) this.O.c(new p())).booleanValue();
        }

        public long v0() {
            return ((Long) this.O.c(new e())).longValue();
        }

        public void w0() {
            try {
                this.O.f().w0();
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public void w1(int i10) {
            this.O.c(new u(i10));
        }

        public int x0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
            return ((Integer) this.O.c(new v(str, i10, contentValues, str2, objArr))).intValue();
        }

        public void x1(long j10) {
            this.O.c(new k(j10));
        }

        public Cursor y(String str, Object[] objArr) {
            try {
                return new c(this.O.f().y(str, objArr), this.O);
            } catch (Throwable th2) {
                this.O.b();
                throw th2;
            }
        }

        public long y0(long j10) {
            return ((Long) this.O.c(new i(j10))).longValue();
        }

        public List<Pair<String, String>> z() {
            return (List) this.O.c(new y());
        }
    }

    public static class b implements h {
        public final String O;
        public final ArrayList<Object> P = new ArrayList<>();
        public final a Q;

        public b(String str, a aVar) {
            this.O = str;
            this.Q = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object k(p.a aVar, a3.c cVar) {
            h L = cVar.L(this.O);
            g(L);
            return aVar.apply(L);
        }

        public void B0(int i10, byte[] bArr) {
            l(i10, bArr);
        }

        public String E0() {
            return (String) h(new b0());
        }

        public void F(int i10, String str) {
            l(i10, str);
        }

        public long I1() {
            return ((Long) h(new d0())).longValue();
        }

        public int K() {
            return ((Integer) h(new a0())).intValue();
        }

        public void R(int i10, double d10) {
            l(i10, Double.valueOf(d10));
        }

        public void a1(int i10) {
            l(i10, (Object) null);
        }

        public void close() throws IOException {
        }

        public void e() {
            h(new f0());
        }

        public final void g(h hVar) {
            int i10 = 0;
            while (i10 < this.P.size()) {
                int i11 = i10 + 1;
                Object obj = this.P.get(i10);
                if (obj == null) {
                    hVar.a1(i11);
                } else if (obj instanceof Long) {
                    hVar.q0(i11, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    hVar.R(i11, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    hVar.F(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    hVar.B0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        public final <T> T h(p.a<h, T> aVar) {
            return this.Q.c(new c0(this, aVar));
        }

        public final void l(int i10, Object obj) {
            int i11 = i10 - 1;
            if (i11 >= this.P.size()) {
                for (int size = this.P.size(); size <= i11; size++) {
                    this.P.add((Object) null);
                }
            }
            this.P.set(i11, obj);
        }

        public void q0(int i10, long j10) {
            l(i10, Long.valueOf(j10));
        }

        public long x() {
            return ((Long) h(new e0())).longValue();
        }

        public void z1() {
            this.P.clear();
        }
    }

    public static final class c implements Cursor {
        public final Cursor O;
        public final a P;

        public c(Cursor cursor, a aVar) {
            this.O = cursor;
            this.P = aVar;
        }

        public void close() {
            this.O.close();
            this.P.b();
        }

        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.O.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Deprecated
        public void deactivate() {
            this.O.deactivate();
        }

        public byte[] getBlob(int i10) {
            return this.O.getBlob(i10);
        }

        public int getColumnCount() {
            return this.O.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.O.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
            return this.O.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i10) {
            return this.O.getColumnName(i10);
        }

        public String[] getColumnNames() {
            return this.O.getColumnNames();
        }

        public int getCount() {
            return this.O.getCount();
        }

        public double getDouble(int i10) {
            return this.O.getDouble(i10);
        }

        public Bundle getExtras() {
            return this.O.getExtras();
        }

        public float getFloat(int i10) {
            return this.O.getFloat(i10);
        }

        public int getInt(int i10) {
            return this.O.getInt(i10);
        }

        public long getLong(int i10) {
            return this.O.getLong(i10);
        }

        @t0(api = 19)
        @SuppressLint({"UnsafeNewApiCall"})
        public Uri getNotificationUri() {
            return this.O.getNotificationUri();
        }

        @t0(api = 29)
        @SuppressLint({"UnsafeNewApiCall"})
        @o0
        public List<Uri> getNotificationUris() {
            return this.O.getNotificationUris();
        }

        public int getPosition() {
            return this.O.getPosition();
        }

        public short getShort(int i10) {
            return this.O.getShort(i10);
        }

        public String getString(int i10) {
            return this.O.getString(i10);
        }

        public int getType(int i10) {
            return this.O.getType(i10);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.O.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.O.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.O.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.O.isClosed();
        }

        public boolean isFirst() {
            return this.O.isFirst();
        }

        public boolean isLast() {
            return this.O.isLast();
        }

        public boolean isNull(int i10) {
            return this.O.isNull(i10);
        }

        public boolean move(int i10) {
            return this.O.move(i10);
        }

        public boolean moveToFirst() {
            return this.O.moveToFirst();
        }

        public boolean moveToLast() {
            return this.O.moveToLast();
        }

        public boolean moveToNext() {
            return this.O.moveToNext();
        }

        public boolean moveToPosition(int i10) {
            return this.O.moveToPosition(i10);
        }

        public boolean moveToPrevious() {
            return this.O.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.O.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.O.registerDataSetObserver(dataSetObserver);
        }

        @Deprecated
        public boolean requery() {
            return this.O.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.O.respond(bundle);
        }

        @t0(api = 23)
        @SuppressLint({"UnsafeNewApiCall"})
        public void setExtras(Bundle bundle) {
            this.O.setExtras(bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.O.setNotificationUri(contentResolver, uri);
        }

        @t0(api = 29)
        @SuppressLint({"UnsafeNewApiCall"})
        public void setNotificationUris(@m0 ContentResolver contentResolver, @m0 List<Uri> list) {
            this.O.setNotificationUris(contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.O.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.O.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public z(@m0 d dVar, @m0 a aVar) {
        this.O = dVar;
        this.Q = aVar;
        aVar.g(dVar);
        this.P = new a(aVar);
    }

    @m0
    public a c() {
        return this.Q;
    }

    public void close() {
        try {
            this.P.close();
        } catch (IOException e10) {
            x2.f.a(e10);
        }
    }

    @m0
    public a3.c f() {
        return this.P;
    }

    @o0
    public String getDatabaseName() {
        return this.O.getDatabaseName();
    }

    @t0(api = 24)
    @m0
    public a3.c getReadableDatabase() {
        this.P.f1();
        return this.P;
    }

    @t0(api = 24)
    @m0
    public a3.c getWritableDatabase() {
        this.P.f1();
        return this.P;
    }

    @m0
    public d i() {
        return this.O;
    }

    @t0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.O.setWriteAheadLoggingEnabled(z10);
    }
}
