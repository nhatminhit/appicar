package ch;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class f implements Serializable, Comparable<f> {
    public static final char[] R = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final long S = 1;
    public static final f T = I(new byte[0]);
    public final byte[] O;
    public transient int P;
    public transient String Q;

    public f(byte[] bArr) {
        this.O = bArr;
    }

    public static f H(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new f(bArr);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f I(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f J(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            d0.b((long) bArr.length, (long) i10, (long) i11);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new f(bArr2);
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f M(InputStream inputStream, int i10) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i10 >= 0) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read != -1) {
                    i11 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new f(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + i10);
        }
    }

    public static int e(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    @Nullable
    public static f j(String str) {
        if (str != null) {
            byte[] a10 = b.a(str);
            if (a10 != null) {
                return new f(a10);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static f k(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((l(str.charAt(i11)) << 4) + l(str.charAt(i11 + 1)));
            }
            return I(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    public static int l(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static f n(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new f(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public static f o(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(d0.f16511a));
            fVar.Q = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public int A(byte[] bArr, int i10) {
        int length = this.O.length - bArr.length;
        for (int max = Math.max(i10, 0); max <= length; max++) {
            if (d0.a(this.O, max, bArr, 0, bArr.length)) {
                return max;
            }
        }
        return -1;
    }

    public byte[] B() {
        return this.O;
    }

    public final int C(f fVar) {
        return F(fVar.B(), R());
    }

    public final int D(f fVar, int i10) {
        return F(fVar.B(), i10);
    }

    public final int E(byte[] bArr) {
        return F(bArr, R());
    }

    public int F(byte[] bArr, int i10) {
        for (int min = Math.min(i10, this.O.length - bArr.length); min >= 0; min--) {
            if (d0.a(this.O, min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public f G() {
        return m("MD5");
    }

    public boolean K(int i10, f fVar, int i11, int i12) {
        return fVar.L(i11, this.O, i10, i12);
    }

    public boolean L(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.O;
            return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && d0.a(bArr2, i10, bArr, i11, i12);
        }
    }

    public final void N(ObjectInputStream objectInputStream) throws IOException {
        f M = M(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = f.class.getDeclaredField("O");
            declaredField.setAccessible(true);
            declaredField.set(this, M.O);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    public f O() {
        return m("SHA-1");
    }

    public f P() {
        return m("SHA-256");
    }

    public f Q() {
        return m("SHA-512");
    }

    public int R() {
        return this.O.length;
    }

    public final boolean S(f fVar) {
        return K(0, fVar, 0, fVar.R());
    }

    public final boolean T(byte[] bArr) {
        return L(0, bArr, 0, bArr.length);
    }

    public String U(Charset charset) {
        if (charset != null) {
            return new String(this.O, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public f V(int i10) {
        return W(i10, this.O.length);
    }

    public f W(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.O;
            if (i11 <= bArr.length) {
                int i12 = i11 - i10;
                if (i12 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i10 == 0 && i11 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i10, bArr2, 0, i12);
                    return new f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.O.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public f X() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.O;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 65 || b10 > 90) {
                i10++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(bArr2);
            }
        }
    }

    public f Y() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.O;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 < 97 || b10 > 122) {
                i10++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArr2[i11] = (byte) (b11 - 32);
                    }
                }
                return new f(bArr2);
            }
        }
    }

    public byte[] Z() {
        return (byte[]) this.O.clone();
    }

    public ByteBuffer a() {
        return ByteBuffer.wrap(this.O).asReadOnlyBuffer();
    }

    public String a0() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.O, d0.f16511a);
        this.Q = str2;
        return str2;
    }

    public String b() {
        return b.b(this.O);
    }

    public void b0(c cVar) {
        byte[] bArr = this.O;
        cVar.write(bArr, 0, bArr.length);
    }

    public void c0(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.O);
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public String d() {
        return b.d(this.O);
    }

    public final void d0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.O.length);
        objectOutputStream.write(this.O);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int R2 = fVar.R();
            byte[] bArr = this.O;
            if (R2 == bArr.length && fVar.L(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.P;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.O);
        this.P = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public int compareTo(f fVar) {
        int R2 = R();
        int R3 = fVar.R();
        int min = Math.min(R2, R3);
        for (int i10 = 0; i10 < min; i10++) {
            byte r10 = r(i10) & 255;
            byte r11 = fVar.r(i10) & 255;
            if (r10 != r11) {
                return r10 < r11 ? -1 : 1;
            }
        }
        if (R2 == R3) {
            return 0;
        }
        return R2 < R3 ? -1 : 1;
    }

    public final f m(String str) {
        try {
            return I(MessageDigest.getInstance(str).digest(this.O));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean p(f fVar) {
        return K(R() - fVar.R(), fVar, 0, fVar.R());
    }

    public final boolean q(byte[] bArr) {
        return L(R() - bArr.length, bArr, 0, bArr.length);
    }

    public byte r(int i10) {
        return this.O[i10];
    }

    public String s() {
        byte[] bArr = this.O;
        char[] cArr = new char[(bArr.length * 2)];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = R;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public final f t(String str, f fVar) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(fVar.Z(), str));
            return I(instance.doFinal(this.O));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        } catch (InvalidKeyException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public String toString() {
        StringBuilder sb2;
        StringBuilder sb3;
        if (this.O.length == 0) {
            return "[size=0]";
        }
        String a02 = a0();
        int e10 = e(a02, 64);
        if (e10 == -1) {
            if (this.O.length <= 64) {
                sb3 = new StringBuilder();
                sb3.append("[hex=");
                sb3.append(s());
                sb3.append("]");
            } else {
                sb3 = new StringBuilder();
                sb3.append("[size=");
                sb3.append(this.O.length);
                sb3.append(" hex=");
                sb3.append(W(0, 64).s());
                sb3.append("…]");
            }
            return sb3.toString();
        }
        String replace = a02.substring(0, e10).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (e10 < a02.length()) {
            sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(this.O.length);
            sb2.append(" text=");
            sb2.append(replace);
            sb2.append("…]");
        } else {
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
        }
        return sb2.toString();
    }

    public f u(f fVar) {
        return t("HmacSHA1", fVar);
    }

    public f v(f fVar) {
        return t("HmacSHA256", fVar);
    }

    public f w(f fVar) {
        return t("HmacSHA512", fVar);
    }

    public final int x(f fVar) {
        return A(fVar.B(), 0);
    }

    public final int y(f fVar, int i10) {
        return A(fVar.B(), i10);
    }

    public final int z(byte[] bArr) {
        return A(bArr, 0);
    }
}
