package ch;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class m extends h {
    @Nullable
    public final MessageDigest P;
    @Nullable
    public final Mac Q;

    public m(z zVar, f fVar, String str) {
        super(zVar);
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

    public m(z zVar, String str) {
        super(zVar);
        try {
            this.P = MessageDigest.getInstance(str);
            this.Q = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static m g(z zVar, f fVar) {
        return new m(zVar, fVar, "HmacSHA1");
    }

    public static m h(z zVar, f fVar) {
        return new m(zVar, fVar, "HmacSHA256");
    }

    public static m i(z zVar, f fVar) {
        return new m(zVar, fVar, "HmacSHA512");
    }

    public static m k(z zVar) {
        return new m(zVar, "MD5");
    }

    public static m l(z zVar) {
        return new m(zVar, "SHA-1");
    }

    public static m m(z zVar) {
        return new m(zVar, "SHA-256");
    }

    public static m o(z zVar) {
        return new m(zVar, "SHA-512");
    }

    public void d1(c cVar, long j10) throws IOException {
        d0.b(cVar.P, 0, j10);
        w wVar = cVar.O;
        long j11 = 0;
        while (j11 < j10) {
            int min = (int) Math.min(j10 - j11, (long) (wVar.f16531c - wVar.f16530b));
            MessageDigest messageDigest = this.P;
            if (messageDigest != null) {
                messageDigest.update(wVar.f16529a, wVar.f16530b, min);
            } else {
                this.Q.update(wVar.f16529a, wVar.f16530b, min);
            }
            j11 += (long) min;
            wVar = wVar.f16534f;
        }
        super.d1(cVar, j10);
    }

    public final f f() {
        MessageDigest messageDigest = this.P;
        return f.I(messageDigest != null ? messageDigest.digest() : this.Q.doFinal());
    }
}
