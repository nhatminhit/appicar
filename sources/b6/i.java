package b6;

import d.o0;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class i extends Exception {
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 3;
    public static final int V = 4;
    public final int O;
    public final int P;
    @o0
    public final Throwable Q;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public i(int i10, String str) {
        super(str);
        this.O = i10;
        this.P = -1;
        this.Q = null;
    }

    public i(int i10, Throwable th2, int i11) {
        super(th2);
        this.O = i10;
        this.Q = th2;
        this.P = i11;
    }

    public static i a(OutOfMemoryError outOfMemoryError) {
        return new i(4, outOfMemoryError, -1);
    }

    public static i b(String str) {
        return new i(3, str);
    }

    public static i c(Exception exc, int i10) {
        return new i(1, exc, i10);
    }

    public static i d(IOException iOException) {
        return new i(0, iOException, -1);
    }

    public static i e(RuntimeException runtimeException) {
        return new i(2, runtimeException, -1);
    }

    public OutOfMemoryError f() {
        w7.a.i(this.O == 4);
        return (OutOfMemoryError) w7.a.g(this.Q);
    }

    public Exception g() {
        boolean z10 = true;
        if (this.O != 1) {
            z10 = false;
        }
        w7.a.i(z10);
        return (Exception) w7.a.g(this.Q);
    }

    public IOException h() {
        w7.a.i(this.O == 0);
        return (IOException) w7.a.g(this.Q);
    }

    public RuntimeException i() {
        w7.a.i(this.O == 2);
        return (RuntimeException) w7.a.g(this.Q);
    }
}
