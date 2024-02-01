package b3;

import a3.h;
import android.database.sqlite.SQLiteStatement;

public class e extends d implements h {
    public final SQLiteStatement P;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.P = sQLiteStatement;
    }

    public String E0() {
        return this.P.simpleQueryForString();
    }

    public long I1() {
        return this.P.executeInsert();
    }

    public int K() {
        return this.P.executeUpdateDelete();
    }

    public void e() {
        this.P.execute();
    }

    public long x() {
        return this.P.simpleQueryForLong();
    }
}
