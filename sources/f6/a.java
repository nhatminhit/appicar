package f6;

import android.database.SQLException;
import java.io.IOException;

public final class a extends IOException {
    public a(SQLException sQLException) {
        super(sQLException);
    }

    public a(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
