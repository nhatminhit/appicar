package w7;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class b0 extends BufferedOutputStream {
    public boolean O;

    public b0(OutputStream outputStream) {
        super(outputStream);
    }

    public b0(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }

    public void c(OutputStream outputStream) {
        a.i(this.O);
        this.out = outputStream;
        this.count = 0;
        this.O = false;
    }

    public void close() throws IOException {
        this.O = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            q0.P0(th);
        }
    }
}
