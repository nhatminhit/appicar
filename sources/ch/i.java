package ch;

import java.io.IOException;

public abstract class i implements a0 {
    public final a0 O;

    public i(a0 a0Var) {
        if (a0Var != null) {
            this.O = a0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public long C0(c cVar, long j10) throws IOException {
        return this.O.C0(cVar, j10);
    }

    public b0 b() {
        return this.O.b();
    }

    public final a0 c() {
        return this.O;
    }

    public void close() throws IOException {
        this.O.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.O.toString() + ")";
    }
}
