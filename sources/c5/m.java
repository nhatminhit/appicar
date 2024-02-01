package c5;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import w4.u;

public class m implements u, Serializable {
    public static final long T = 1;
    public static final g U = g.i();
    public final String O;
    public byte[] P;
    public byte[] Q;
    public char[] R;
    public transient String S;

    public m(String str) {
        if (str != null) {
            this.O = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final char[] a() {
        char[] cArr = this.R;
        if (cArr != null) {
            return cArr;
        }
        char[] l10 = U.l(this.O);
        this.R = l10;
        return l10;
    }

    public final byte[] b() {
        byte[] bArr = this.P;
        if (bArr != null) {
            return bArr;
        }
        byte[] m10 = U.m(this.O);
        this.P = m10;
        return m10;
    }

    public int c(byte[] bArr, int i10) {
        byte[] bArr2 = this.P;
        if (bArr2 == null) {
            bArr2 = U.m(this.O);
            this.P = bArr2;
        }
        int length = bArr2.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i10, length);
        return length;
    }

    public int d(char[] cArr, int i10) {
        String str = this.O;
        int length = str.length();
        if (i10 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i10);
        return length;
    }

    public int e(OutputStream outputStream) throws IOException {
        byte[] bArr = this.P;
        if (bArr == null) {
            bArr = U.m(this.O);
            this.P = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.O.equals(((m) obj).O);
    }

    public int f(byte[] bArr, int i10) {
        byte[] bArr2 = this.Q;
        if (bArr2 == null) {
            bArr2 = U.h(this.O);
            this.Q = bArr2;
        }
        int length = bArr2.length;
        if (i10 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i10, length);
        return length;
    }

    public int g(ByteBuffer byteBuffer) {
        byte[] bArr = this.Q;
        if (bArr == null) {
            bArr = U.h(this.O);
            this.Q = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    public final String getValue() {
        return this.O;
    }

    public int h(char[] cArr, int i10) {
        char[] cArr2 = this.R;
        if (cArr2 == null) {
            cArr2 = U.l(this.O);
            this.R = cArr2;
        }
        int length = cArr2.length;
        if (i10 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i10, length);
        return length;
    }

    public final int hashCode() {
        return this.O.hashCode();
    }

    public int i(OutputStream outputStream) throws IOException {
        byte[] bArr = this.Q;
        if (bArr == null) {
            bArr = U.h(this.O);
            this.Q = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    public int j(ByteBuffer byteBuffer) {
        byte[] bArr = this.P;
        if (bArr == null) {
            bArr = U.m(this.O);
            this.P = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    public final byte[] k() {
        byte[] bArr = this.Q;
        if (bArr != null) {
            return bArr;
        }
        byte[] h10 = U.h(this.O);
        this.Q = h10;
        return h10;
    }

    public final int l() {
        return this.O.length();
    }

    public final void m(ObjectInputStream objectInputStream) throws IOException {
        this.S = objectInputStream.readUTF();
    }

    public Object n() {
        return new m(this.S);
    }

    public final void o(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.O);
    }

    public final String toString() {
        return this.O;
    }
}
