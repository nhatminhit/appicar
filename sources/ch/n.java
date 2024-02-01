package ch;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class n extends i {
    public final MessageDigest P;
    public final Mac Q;

    public n(a0 a0Var, f fVar, String str) {
        super(a0Var);
        try {
            Mac instance = Mac.getInstance(str);
            this.Q = instance;
            instance.init(new SecretKeySpec(fVar.Z(), str));
            this.P = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public n(a0 a0Var, String str) {
        super(a0Var);
        try {
            this.P = MessageDigest.getInstance(str);
            this.Q = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static n g(a0 a0Var, f fVar) {
        return new n(a0Var, fVar, "HmacSHA1");
    }

    public static n h(a0 a0Var, f fVar) {
        return new n(a0Var, fVar, "HmacSHA256");
    }

    public static n i(a0 a0Var) {
        return new n(a0Var, "MD5");
    }

    public static n k(a0 a0Var) {
        return new n(a0Var, "SHA-1");
    }

    public static n l(a0 a0Var) {
        return new n(a0Var, "SHA-256");
    }

    public long C0(c cVar, long j10) throws IOException {
        long C0 = super.C0(cVar, j10);
        if (C0 != -1) {
            long j11 = cVar.P;
            long j12 = j11 - C0;
            w wVar = cVar.O;
            while (j11 > j12) {
                wVar = wVar.f16535g;
                j11 -= (long) (wVar.f16531c - wVar.f16530b);
            }
            while (j11 < cVar.P) {
                int i10 = (int) ((((long) wVar.f16530b) + j12) - j11);
                MessageDigest messageDigest = this.P;
                if (messageDigest != null) {
                    messageDigest.update(wVar.f16529a, i10, wVar.f16531c - i10);
                } else {
                    this.Q.update(wVar.f16529a, i10, wVar.f16531c - i10);
                }
                j12 = ((long) (wVar.f16531c - wVar.f16530b)) + j11;
                wVar = wVar.f16534f;
                j11 = j12;
            }
        }
        return C0;
    }

    public final f f() {
        MessageDigest messageDigest = this.P;
        return f.I(messageDigest != null ? messageDigest.digest() : this.Q.doFinal());
    }
}
