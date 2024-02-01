package tg;

import java.io.IOException;
import pg.e;

public final class i extends RuntimeException {
    public IOException O;
    public IOException P;

    public i(IOException iOException) {
        super(iOException);
        this.O = iOException;
        this.P = iOException;
    }

    public void a(IOException iOException) {
        e.b(this.O, iOException);
        this.P = iOException;
    }

    public IOException b() {
        return this.O;
    }

    public IOException c() {
        return this.P;
    }
}
