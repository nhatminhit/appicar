package e7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t7.l;
import t7.n;
import t7.o;
import t7.r0;

public class a implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l f6865b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f6866c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f6867d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public CipherInputStream f6868e;

    public a(l lVar, byte[] bArr, byte[] bArr2) {
        this.f6865b = lVar;
        this.f6866c = bArr;
        this.f6867d = bArr2;
    }

    public final long a(o oVar) throws IOException {
        try {
            Cipher h10 = h();
            try {
                h10.init(2, new SecretKeySpec(this.f6866c, "AES"), new IvParameterSpec(this.f6867d));
                n nVar = new n(this.f6865b, oVar);
                this.f6868e = new CipherInputStream(nVar, h10);
                nVar.g();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final Map<String, List<String>> b() {
        return this.f6865b.b();
    }

    public void close() throws IOException {
        if (this.f6868e != null) {
            this.f6868e = null;
            this.f6865b.close();
        }
    }

    public final void d(r0 r0Var) {
        this.f6865b.d(r0Var);
    }

    @o0
    public final Uri g() {
        return this.f6865b.g();
    }

    public Cipher h() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        w7.a.g(this.f6868e);
        int read = this.f6868e.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
