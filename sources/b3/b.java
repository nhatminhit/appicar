package b3;

import a3.c;
import a3.d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import d.t0;
import java.io.File;

public class b implements d {
    public final Context O;
    public final String P;
    public final d.a Q;
    public final boolean R;
    public final Object S;
    public a T;
    public boolean U;

    public static class a extends SQLiteOpenHelper {
        public final a[] O;
        public final d.a P;
        public boolean Q;

        /* renamed from: b3.b$a$a  reason: collision with other inner class name */
        public class C0061a implements DatabaseErrorHandler {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d.a f4111a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a[] f4112b;

            public C0061a(d.a aVar, a[] aVarArr) {
                this.f4111a = aVar;
                this.f4112b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f4111a.c(a.g(this.f4112b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, a[] aVarArr, d.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f119a, new C0061a(aVar, aVarArr));
            this.P = aVar;
            this.O = aVarArr;
        }

        public static a g(a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            a aVar = aVarArr[0];
            if (aVar == null || !aVar.c(sQLiteDatabase)) {
                aVarArr[0] = new a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public synchronized c c() {
            this.Q = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.Q) {
                close();
                return c();
            }
            return f(readableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.O[0] = null;
        }

        public a f(SQLiteDatabase sQLiteDatabase) {
            return g(this.O, sQLiteDatabase);
        }

        public synchronized c h() {
            this.Q = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.Q) {
                close();
                return h();
            }
            return f(writableDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.P.b(f(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.P.d(f(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.Q = true;
            this.P.e(f(sQLiteDatabase), i10, i11);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.Q) {
                this.P.f(f(sQLiteDatabase));
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.Q = true;
            this.P.g(f(sQLiteDatabase), i10, i11);
        }
    }

    public b(Context context, String str, d.a aVar) {
        this(context, str, aVar, false);
    }

    public b(Context context, String str, d.a aVar, boolean z10) {
        this.O = context;
        this.P = str;
        this.Q = aVar;
        this.R = z10;
        this.S = new Object();
    }

    public final a c() {
        a aVar;
        synchronized (this.S) {
            if (this.T == null) {
                a[] aVarArr = new a[1];
                if (this.P == null || !this.R) {
                    this.T = new a(this.O, this.P, aVarArr, this.Q);
                } else {
                    this.T = new a(this.O, new File(this.O.getNoBackupFilesDir(), this.P).getAbsolutePath(), aVarArr, this.Q);
                }
                this.T.setWriteAheadLoggingEnabled(this.U);
            }
            aVar = this.T;
        }
        return aVar;
    }

    public void close() {
        c().close();
    }

    public String getDatabaseName() {
        return this.P;
    }

    public c getReadableDatabase() {
        return c().c();
    }

    public c getWritableDatabase() {
        return c().h();
    }

    @t0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.S) {
            a aVar = this.T;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z10);
            }
            this.U = z10;
        }
    }
}
