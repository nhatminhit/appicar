package h6;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class r extends Exception {
    public static final int P = 1;
    public static final int Q = 2;
    public final int O;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public r(int i10) {
        this.O = i10;
    }

    public r(int i10, Exception exc) {
        super(exc);
        this.O = i10;
    }
}
