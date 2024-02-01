package b3;

import a3.e;
import android.database.sqlite.SQLiteProgram;

public class d implements e {
    public final SQLiteProgram O;

    public d(SQLiteProgram sQLiteProgram) {
        this.O = sQLiteProgram;
    }

    public void B0(int i10, byte[] bArr) {
        this.O.bindBlob(i10, bArr);
    }

    public void F(int i10, String str) {
        this.O.bindString(i10, str);
    }

    public void R(int i10, double d10) {
        this.O.bindDouble(i10, d10);
    }

    public void a1(int i10) {
        this.O.bindNull(i10);
    }

    public void close() {
        this.O.close();
    }

    public void q0(int i10, long j10) {
        this.O.bindLong(i10, j10);
    }

    public void z1() {
        this.O.clearBindings();
    }
}
