package s7;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import w7.i0;
import w7.m;
import x7.e;
import y7.a;
import y7.c;
import y7.d;

public final class f implements e, a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f12714a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f12715b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    public final d f12716c = new d();

    /* renamed from: d  reason: collision with root package name */
    public final c f12717d = new c();

    /* renamed from: e  reason: collision with root package name */
    public final i0<Long> f12718e = new i0<>();

    /* renamed from: f  reason: collision with root package name */
    public final i0<d> f12719f = new i0<>();

    /* renamed from: g  reason: collision with root package name */
    public final float[] f12720g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f12721h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    public int f12722i;

    /* renamed from: j  reason: collision with root package name */
    public SurfaceTexture f12723j;

    /* renamed from: k  reason: collision with root package name */
    public volatile int f12724k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f12725l = -1;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public byte[] f12726m;

    /* access modifiers changed from: private */
    public /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f12714a.set(true);
    }

    public void a(long j10, float[] fArr) {
        this.f12717d.e(j10, fArr);
    }

    public void b(long j10, long j11, Format format) {
        this.f12718e.a(j11, Long.valueOf(j10));
        i(format.f5075h0, format.f5074g0, j11);
    }

    public void c() {
        this.f12718e.c();
        this.f12717d.d();
        this.f12715b.set(true);
    }

    public void e(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        m.b();
        if (this.f12714a.compareAndSet(true, false)) {
            ((SurfaceTexture) w7.a.g(this.f12723j)).updateTexImage();
            m.b();
            if (this.f12715b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f12720g, 0);
            }
            long timestamp = this.f12723j.getTimestamp();
            Long g10 = this.f12718e.g(timestamp);
            if (g10 != null) {
                this.f12717d.c(this.f12720g, g10.longValue());
            }
            d i10 = this.f12719f.i(timestamp);
            if (i10 != null) {
                this.f12716c.d(i10);
            }
        }
        Matrix.multiplyMM(this.f12721h, 0, fArr, 0, this.f12720g, 0);
        this.f12716c.a(this.f12722i, this.f12721h, z10);
    }

    public SurfaceTexture f() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        m.b();
        this.f12716c.b();
        m.b();
        this.f12722i = m.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12722i);
        this.f12723j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new e(this));
        return this.f12723j;
    }

    public void h(int i10) {
        this.f12724k = i10;
    }

    public final void i(@o0 byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f12726m;
        int i11 = this.f12725l;
        this.f12726m = bArr;
        if (i10 == -1) {
            i10 = this.f12724k;
        }
        this.f12725l = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.f12726m)) {
            d dVar = null;
            byte[] bArr3 = this.f12726m;
            if (bArr3 != null) {
                dVar = y7.e.a(bArr3, this.f12725l);
            }
            if (dVar == null || !d.c(dVar)) {
                dVar = d.b(this.f12725l);
            }
            this.f12719f.a(j10, dVar);
        }
    }

    public void j() {
        this.f12716c.e();
    }
}
