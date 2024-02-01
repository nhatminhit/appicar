package y7;

import b6.c0;
import b6.i;
import com.google.android.exoplayer2.Format;
import d.o0;
import g6.f;
import java.nio.ByteBuffer;
import w7.q0;
import w7.s;
import w7.w;

public class b extends b6.b {

    /* renamed from: d0  reason: collision with root package name */
    public static final int f15545d0 = 100000;
    public final c0 X = new c0();
    public final f Y = new f(1);
    public final w Z = new w();

    /* renamed from: a0  reason: collision with root package name */
    public long f15546a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public a f15547b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f15548c0;

    public b() {
        super(5);
    }

    public void A() {
        L();
    }

    public void C(long j10, boolean z10) throws i {
        L();
    }

    public void G(Format[] formatArr, long j10) throws i {
        this.f15546a0 = j10;
    }

    @o0
    public final float[] K(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.Z.O(byteBuffer.array(), byteBuffer.limit());
        this.Z.Q(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.Z.o());
        }
        return fArr;
    }

    public final void L() {
        this.f15548c0 = 0;
        a aVar = this.f15547b0;
        if (aVar != null) {
            aVar.c();
        }
    }

    public boolean a() {
        return g();
    }

    public int b(Format format) {
        return s.f14822l0.equals(format.W) ? 4 : 0;
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) throws i {
        float[] K;
        while (!g() && this.f15548c0 < 100000 + j10) {
            this.Y.j();
            if (H(this.X, this.Y, false) == -4 && !this.Y.n()) {
                this.Y.s();
                f fVar = this.Y;
                this.f15548c0 = fVar.R;
                if (!(this.f15547b0 == null || (K = K(fVar.Q)) == null)) {
                    ((a) q0.l(this.f15547b0)).a(this.f15548c0 - this.f15546a0, K);
                }
            } else {
                return;
            }
        }
    }

    public void n(int i10, @o0 Object obj) throws i {
        if (i10 == 7) {
            this.f15547b0 = (a) obj;
        } else {
            super.n(i10, obj);
        }
    }
}
