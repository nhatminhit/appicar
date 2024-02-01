package rg;

import ch.c;
import ch.h;
import ch.z;
import java.io.IOException;

public class e extends h {
    public boolean P;

    public e(z zVar) {
        super(zVar);
    }

    public void close() throws IOException {
        if (!this.P) {
            try {
                super.close();
            } catch (IOException e10) {
                this.P = true;
                f(e10);
            }
        }
    }

    public void d1(c cVar, long j10) throws IOException {
        if (this.P) {
            cVar.skip(j10);
            return;
        }
        try {
            super.d1(cVar, j10);
        } catch (IOException e10) {
            this.P = true;
            f(e10);
        }
    }

    public void f(IOException iOException) {
    }

    public void flush() throws IOException {
        if (!this.P) {
            try {
                super.flush();
            } catch (IOException e10) {
                this.P = true;
                f(e10);
            }
        }
    }
}
