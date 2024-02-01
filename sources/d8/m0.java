package d8;

import java.lang.ref.WeakReference;

public abstract class m0 extends k0 {
    public static final WeakReference Q = new WeakReference((Object) null);
    public WeakReference P = Q;

    public m0(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] Y1();

    public final byte[] b0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.P.get();
            if (bArr == null) {
                bArr = Y1();
                this.P = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
