package h5;

import java.io.IOException;
import java.io.Serializable;

public class l implements Serializable {
    public static final long R = 1;
    public byte[] O;
    public CharSequence P;
    public String Q;

    public l(CharSequence charSequence) {
        if (charSequence != null) {
            this.P = charSequence;
            return;
        }
        throw new IllegalArgumentException();
    }

    public l(byte[] bArr, String str) {
        if (bArr != null) {
            this.O = bArr;
            this.Q = (str == null || str.isEmpty()) ? "UTF-8" : str;
            return;
        }
        throw new IllegalArgumentException();
    }

    public Object a() {
        byte[] bArr = this.O;
        return bArr != null ? bArr : this.P;
    }

    public String toString() {
        byte[] bArr = this.O;
        if (bArr == null) {
            return this.P.toString();
        }
        try {
            return new String(bArr, this.Q);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
