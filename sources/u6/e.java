package u6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import b6.b;
import b6.c0;
import b6.i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import h6.l;
import java.util.Arrays;
import w7.q0;

public final class e extends b implements Handler.Callback {

    /* renamed from: i0  reason: collision with root package name */
    public static final int f13755i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f13756j0 = 5;
    public final b X;
    public final d Y;
    @o0
    public final Handler Z;

    /* renamed from: a0  reason: collision with root package name */
    public final c0 f13757a0;

    /* renamed from: b0  reason: collision with root package name */
    public final c f13758b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Metadata[] f13759c0;

    /* renamed from: d0  reason: collision with root package name */
    public final long[] f13760d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f13761e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f13762f0;

    /* renamed from: g0  reason: collision with root package name */
    public a f13763g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13764h0;

    @Deprecated
    public interface a extends d {
    }

    public e(d dVar, @o0 Looper looper) {
        this(dVar, looper, b.f13754a);
    }

    public e(d dVar, @o0 Looper looper, b bVar) {
        super(4);
        this.Y = (d) w7.a.g(dVar);
        this.Z = looper == null ? null : q0.z(looper, this);
        this.X = (b) w7.a.g(bVar);
        this.f13757a0 = new c0();
        this.f13758b0 = new c();
        this.f13759c0 = new Metadata[5];
        this.f13760d0 = new long[5];
    }

    public void A() {
        K();
        this.f13763g0 = null;
    }

    public void C(long j10, boolean z10) {
        K();
        this.f13764h0 = false;
    }

    public void G(Format[] formatArr, long j10) throws i {
        this.f13763g0 = this.X.a(formatArr[0]);
    }

    public final void K() {
        Arrays.fill(this.f13759c0, (Object) null);
        this.f13761e0 = 0;
        this.f13762f0 = 0;
    }

    public final void L(Metadata metadata) {
        Handler handler = this.Z;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            M(metadata);
        }
    }

    public final void M(Metadata metadata) {
        this.Y.u(metadata);
    }

    public boolean a() {
        return this.f13764h0;
    }

    public int b(Format format) {
        if (this.X.b(format)) {
            return b.J((l<?>) null, format.Z) ? 4 : 2;
        }
        return 0;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            M((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public boolean isReady() {
        return true;
    }

    public void m(long j10, long j11) throws i {
        if (!this.f13764h0 && this.f13762f0 < 5) {
            this.f13758b0.j();
            if (H(this.f13757a0, this.f13758b0, false) == -4) {
                if (this.f13758b0.n()) {
                    this.f13764h0 = true;
                } else if (!this.f13758b0.m()) {
                    c cVar = this.f13758b0;
                    cVar.W = this.f13757a0.f4302c.f5068a0;
                    cVar.s();
                    int i10 = (this.f13761e0 + this.f13762f0) % 5;
                    Metadata a10 = this.f13763g0.a(this.f13758b0);
                    if (a10 != null) {
                        this.f13759c0[i10] = a10;
                        this.f13760d0[i10] = this.f13758b0.R;
                        this.f13762f0++;
                    }
                }
            }
        }
        if (this.f13762f0 > 0) {
            long[] jArr = this.f13760d0;
            int i11 = this.f13761e0;
            if (jArr[i11] <= j10) {
                L(this.f13759c0[i11]);
                Metadata[] metadataArr = this.f13759c0;
                int i12 = this.f13761e0;
                metadataArr[i12] = null;
                this.f13761e0 = (i12 + 1) % 5;
                this.f13762f0--;
            }
        }
    }
}
