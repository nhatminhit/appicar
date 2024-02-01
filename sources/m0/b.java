package m0;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import d.m0;

public final class b {
    public static void a(@m0 SQLiteCursor sQLiteCursor, boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            sQLiteCursor.setFillWindowForwardOnly(z10);
        }
    }
}
