package e1;

import d.x0;
import java.io.Writer;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
@Deprecated
public class f extends Writer {
    public final String O;
    public StringBuilder P = new StringBuilder(128);

    public f(String str) {
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
