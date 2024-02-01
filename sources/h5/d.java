package h5;

import h5.e;
import java.io.IOException;
import w4.i;
import y3.q;

public class d extends e.c {
    public static final long S = 1;
    public static final String T;
    public static final d U;
    public static final int V = 16;
    public final char[] P;
    public final int Q;
    public final String R;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        T = str;
        U = new d(q.a.R, str);
    }

    public d() {
        this(q.a.R, T);
    }

    public d(String str, String str2) {
        this.Q = str.length();
        this.P = new char[(str.length() * 16)];
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            str.getChars(0, str.length(), this.P, i10);
            i10 += str.length();
        }
        this.R = str2;
    }

    public String a() {
        return this.R;
    }

    public String b() {
        return new String(this.P, 0, this.Q);
    }

    public d c(String str) {
        return str.equals(b()) ? this : new d(str, this.R);
    }

    public d d(String str) {
        return str.equals(this.R) ? this : new d(b(), str);
    }

    public boolean l() {
        return false;
    }

    public void m(i iVar, int i10) throws IOException {
        iVar.I2(this.R);
        if (i10 > 0) {
            int i11 = i10 * this.Q;
            while (true) {
                char[] cArr = this.P;
                if (i11 > cArr.length) {
                    iVar.L2(cArr, 0, cArr.length);
                    i11 -= this.P.length;
                } else {
                    iVar.L2(cArr, 0, i11);
                    return;
                }
            }
        }
    }
}
