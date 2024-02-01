package androidx.fragment.app;

import java.io.Writer;

public final class z extends Writer {
    public final String O;
    public StringBuilder P = new StringBuilder(128);

    public z(String str) {
        this.O = str;
    }

    public final void c() {
        if (this.P.length() > 0) {
            this.P.toString();
            StringBuilder sb2 = this.P;
            sb2.delete(0, sb2.length());
        }
    }

    public void close() {
        c();
    }

    public void flush() {
        c();
    }

    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == 10) {
                c();
            } else {
                this.P.append(c10);
            }
        }
    }
}
