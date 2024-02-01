package ch;

import java.io.IOException;

public abstract class h implements z {
    public final z O;

    public h(z zVar) {
        if (zVar != null) {
            this.O = zVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public b0 b() {
        return this.O.b();
    }

    public final z c() {
        return this.O;
    }

    public void close() throws IOException {
        this.O.close();
    }

    public void d1(c cVar, long j10) throws IOException {
        this.O.d1(cVar, j10);
    }

    public void flush() throws IOException {
        this.O.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.O.toString() + ")";
    }
}
