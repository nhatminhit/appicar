package f6;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class c implements b {
    public final SQLiteOpenHelper O;

    public c(SQLiteOpenHelper sQLiteOpenHelper) {
        this.O = sQLiteOpenHelper;
    }

    public SQLiteDatabase getReadableDatabase() {
        return this.O.getReadableDatabase();
    }

    public SQLiteDatabase getWritableDatabase() {
        return this.O.getWritableDatabase();
    }
}
