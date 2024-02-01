package d8;

import android.os.RemoteException;
import d.o0;
import j8.j2;
import j8.k2;
import j8.s;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import z8.d;
import z8.f;

public abstract class k0 extends j2 {
    public final int O;

    public k0(byte[] bArr) {
        s.a(bArr.length == 25);
        this.O = Arrays.hashCode(bArr);
    }

    public static byte[] J(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] b0();

    public final d c() {
        return f.b0(b0());
    }

    public final boolean equals(@o0 Object obj) {
        d c10;
        if (obj != null && (obj instanceof k2)) {
            try {
                k2 k2Var = (k2) obj;
                if (k2Var.o() != this.O || (c10 = k2Var.c()) == null) {
                    return false;
                }
                return Arrays.equals(b0(), (byte[]) f.J(c10));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.O;
    }

    public final int o() {
        return this.O;
    }
}
