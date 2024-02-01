package pl.droidsonroids.gif;

import d.m0;
import java.io.IOException;

public class GifIOException extends IOException {
    public static final long Q = 13038402904505L;
    @m0
    public final h O;
    public final String P;

    public GifIOException(int i10, String str) {
        this.O = h.b(i10);
        this.P = str;
    }

    public static GifIOException a(int i10) {
        if (i10 == h.NO_ERROR.P) {
            return null;
        }
        return new GifIOException(i10, (String) null);
    }

    public String getMessage() {
        if (this.P == null) {
            return this.O.e();
        }
        return this.O.e() + ": " + this.P;
    }
}
