package u8;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.CursorWrapper;
import d.m0;
import d.o0;

@e8.a
public class a extends CursorWrapper implements CrossProcessCursor {
    public AbstractWindowedCursor O;

    @e8.a
    public a(@m0 Cursor cursor) {
        super(cursor);
        for (int i10 = 0; i10 < 10 && (cursor instanceof CursorWrapper); i10++) {
            cursor = ((CursorWrapper) cursor).getWrappedCursor();
        }
        if (cursor instanceof AbstractWindowedCursor) {
            this.O = (AbstractWindowedCursor) cursor;
            return;
        }
        throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
    }

    @e8.a
    public void c(@o0 CursorWindow cursorWindow) {
        this.O.setWindow(cursorWindow);
    }

    @e8.a
    public void fillWindow(int i10, @m0 CursorWindow cursorWindow) {
        this.O.fillWindow(i10, cursorWindow);
    }

    @e8.a
    @o0
    public CursorWindow getWindow() {
        return this.O.getWindow();
    }

    @m0
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.O;
    }

    public final boolean onMove(int i10, int i11) {
        return this.O.onMove(i10, i11);
    }
}
