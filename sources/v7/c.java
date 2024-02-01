package v7;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w7.a;
import w7.q0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Cipher f14208a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14209b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14210c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f14211d;

    /* renamed from: e  reason: collision with root package name */
    public int f14212e;

    public c(int i10, byte[] bArr, long j10, long j11) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            this.f14208a = instance;
            int blockSize = instance.getBlockSize();
            this.f14209b = blockSize;
            this.f14210c = new byte[blockSize];
            this.f14211d = new byte[blockSize];
            long j12 = j11 / ((long) blockSize);
            int i11 = (int) (j11 % ((long) blockSize));
            instance.init(i10, new SecretKeySpec(bArr, q0.S0(instance.getAlgorithm(), "/")[0]), new IvParameterSpec(a(j10, j12)));
            if (i11 != 0) {
                d(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final byte[] a(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    public final int b(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.f14208a.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10;
        do {
            int i14 = this.f14212e;
            if (i14 > 0) {
                bArr2[i12] = (byte) (bArr[i13] ^ this.f14211d[this.f14209b - i14]);
                i12++;
                i13++;
                this.f14212e = i14 - 1;
                i11--;
            } else {
                int b10 = b(bArr, i13, i11, bArr2, i12);
                if (i11 != b10) {
                    int i15 = i11 - b10;
                    int i16 = 0;
                    boolean z10 = true;
                    a.i(i15 < this.f14209b);
                    int i17 = i12 + b10;
                    int i18 = this.f14209b - i15;
                    this.f14212e = i18;
                    if (b(this.f14210c, 0, i18, this.f14211d, 0) != this.f14209b) {
                        z10 = false;
                    }
                    a.i(z10);
                    while (i16 < i15) {
                        bArr2[i17] = this.f14211d[i16];
                        i16++;
                        i17++;
                    }
                    return;
                }
                return;
            }
        } while (i11 != 0);
    }

    public void d(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, bArr, i10);
    }
}
