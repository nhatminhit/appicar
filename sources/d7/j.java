package d7;

import b6.c;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import t7.l;
import t7.o;
import w7.q0;

public abstract class j extends d {

    /* renamed from: k  reason: collision with root package name */
    public static final int f6550k = 16384;

    /* renamed from: i  reason: collision with root package name */
    public byte[] f6551i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f6552j;

    public j(l lVar, o oVar, int i10, Format format, int i11, Object obj, byte[] bArr) {
        super(lVar, oVar, i10, format, i11, obj, c.f4201b, c.f4201b);
        this.f6551i = bArr;
    }

    public final void b() throws IOException, InterruptedException {
        try {
            this.f6522h.a(this.f6515a);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f6552j) {
                i(i11);
                i10 = this.f6522h.read(this.f6551i, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f6552j) {
                g(this.f6551i, i11);
            }
        } finally {
            q0.r(this.f6522h);
        }
    }

    public final void c() {
        this.f6552j = true;
    }

    public abstract void g(byte[] bArr, int i10) throws IOException;

    public byte[] h() {
        return this.f6551i;
    }

    public final void i(int i10) {
        byte[] bArr = this.f6551i;
        if (bArr == null) {
            this.f6551i = new byte[16384];
        } else if (bArr.length < i10 + 16384) {
            this.f6551i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
