package l0;

import android.database.CursorWindow;
import android.os.Build;
import d.m0;
import d.o0;

public final class b {
    @m0
    public static CursorWindow a(@o0 String str, long j10) {
        return Build.VERSION.SDK_INT >= 28 ? new CursorWindow(str, j10) : new CursorWindow(str);
    }
}
