package le;

import fh.g;
import ie.d;

public final class c implements d<Object> {
    @g
    public static final c O = new c();

    @g
    public ie.g e() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @g
    public String toString() {
        return "This continuation is already complete";
    }

    public void x(@g Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
