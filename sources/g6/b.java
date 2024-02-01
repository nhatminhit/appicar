package g6;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import w7.q0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f8047a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f8048b;

    /* renamed from: c  reason: collision with root package name */
    public int f8049c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f8050d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f8051e;

    /* renamed from: f  reason: collision with root package name */
    public int f8052f;

    /* renamed from: g  reason: collision with root package name */
    public int f8053g;

    /* renamed from: h  reason: collision with root package name */
    public int f8054h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f8055i;

    /* renamed from: j  reason: collision with root package name */
    public final C0136b f8056j;

    @TargetApi(24)
    /* renamed from: g6.b$b  reason: collision with other inner class name */
    public static final class C0136b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f8057a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaCodec$CryptoInfo$Pattern f8058b;

        public C0136b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f8057a = cryptoInfo;
            this.f8058b = new MediaCodec$CryptoInfo$Pattern(0, 0);
        }

        public final void b(int i10, int i11) {
            this.f8058b.set(i10, i11);
            this.f8057a.setPattern(this.f8058b);
        }
    }

    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f8055i = cryptoInfo;
        this.f8056j = q0.f14786a >= 24 ? new C0136b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f8055i;
    }

    @Deprecated
    public MediaCodec.CryptoInfo b() {
        return a();
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f8052f = i10;
        this.f8050d = iArr;
        this.f8051e = iArr2;
        this.f8048b = bArr;
        this.f8047a = bArr2;
        this.f8049c = i11;
        this.f8053g = i12;
        this.f8054h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f8055i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (q0.f14786a >= 24) {
            this.f8056j.b(i12, i13);
        }
    }
}
