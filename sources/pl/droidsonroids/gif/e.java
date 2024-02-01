package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import d.e0;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import d.v;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class e extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    public final ScheduledThreadPoolExecutor O;
    public volatile boolean P;
    public long Q;
    public final Rect R;
    public final Paint S;
    public final Bitmap T;
    public final GifInfoHandle U;
    public final ConcurrentLinkedQueue<a> V;
    public ColorStateList W;
    public PorterDuffColorFilter X;
    public PorterDuff.Mode Y;
    public final boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public final n f22107a0;

    /* renamed from: b0  reason: collision with root package name */
    public final s f22108b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f22109c0;

    /* renamed from: d0  reason: collision with root package name */
    public ScheduledFuture<?> f22110d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f22111e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f22112f0;

    /* renamed from: g0  reason: collision with root package name */
    public oh.b f22113g0;

    public class a extends t {
        public a(e eVar) {
            super(eVar);
        }

        public void a() {
            if (e.this.U.C()) {
                e.this.start();
            }
        }
    }

    public class b extends t {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, int i10) {
            super(eVar);
            this.P = i10;
        }

        public void a() {
            e eVar = e.this;
            eVar.U.I(this.P, eVar.T);
            this.O.f22107a0.sendEmptyMessageAtTime(-1, 0);
        }
    }

    public class c extends t {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar, int i10) {
            super(eVar);
            this.P = i10;
        }

        public void a() {
            e eVar = e.this;
            eVar.U.G(this.P, eVar.T);
            e.this.f22107a0.sendEmptyMessageAtTime(-1, 0);
        }
    }

    public e(@o0 ContentResolver contentResolver, @m0 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(@m0 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(@m0 AssetManager assetManager, @m0 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public e(@m0 Resources resources, @s0 @u int i10) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i10));
        float b10 = l.b(resources, i10);
        this.f22112f0 = (int) (((float) this.U.i()) * b10);
        this.f22111e0 = (int) (((float) this.U.q()) * b10);
    }

    public e(@m0 File file) throws IOException {
        this(file.getPath());
    }

    public e(@m0 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(@m0 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(@m0 String str) throws IOException {
        this(new GifInfoHandle(str), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(@m0 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    public e(GifInfoHandle gifInfoHandle, e eVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.P = true;
        this.Q = Long.MIN_VALUE;
        this.R = new Rect();
        this.S = new Paint(6);
        this.V = new ConcurrentLinkedQueue<>();
        s sVar = new s(this);
        this.f22108b0 = sVar;
        this.Z = z10;
        this.O = scheduledThreadPoolExecutor == null ? j.a() : scheduledThreadPoolExecutor;
        this.U = gifInfoHandle;
        Bitmap bitmap = null;
        if (eVar != null) {
            synchronized (eVar.U) {
                if (!eVar.U.w() && eVar.U.i() >= gifInfoHandle.i() && eVar.U.q() >= gifInfoHandle.q()) {
                    eVar.K();
                    Bitmap bitmap2 = eVar.T;
                    bitmap2.eraseColor(0);
                    bitmap = bitmap2;
                }
            }
        }
        if (bitmap == null) {
            this.T = Bitmap.createBitmap(gifInfoHandle.q(), gifInfoHandle.i(), Bitmap.Config.ARGB_8888);
        } else {
            this.T = bitmap;
        }
        this.T.setHasAlpha(!gifInfoHandle.v());
        this.f22109c0 = new Rect(0, 0, gifInfoHandle.q(), gifInfoHandle.i());
        this.f22107a0 = new n(this);
        sVar.a();
        this.f22111e0 = gifInfoHandle.q();
        this.f22112f0 = gifInfoHandle.i();
    }

    public e(@m0 m mVar, @o0 e eVar, @o0 ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10, @m0 i iVar) throws IOException {
        this(mVar.b(iVar), eVar, scheduledThreadPoolExecutor, z10);
    }

    public e(@m0 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr), (e) null, (ScheduledThreadPoolExecutor) null, true);
    }

    @o0
    public static e e(@m0 Resources resources, @s0 @u int i10) {
        try {
            return new e(resources, i10);
        } catch (IOException unused) {
            return null;
        }
    }

    public void A() {
        this.O.execute(new a(this));
    }

    public final void B() {
        if (this.Z && this.P) {
            long j10 = this.Q;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0, j10 - SystemClock.uptimeMillis());
                this.Q = Long.MIN_VALUE;
                this.O.remove(this.f22108b0);
                this.f22110d0 = this.O.schedule(this.f22108b0, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public void C(@e0(from = 0, to = 2147483647L) int i10) {
        if (i10 >= 0) {
            synchronized (this.U) {
                this.U.I(i10, this.T);
            }
            this.f22107a0.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void D(@e0(from = 0, to = 2147483647L) int i10) {
        if (i10 >= 0) {
            this.O.execute(new c(this, i10));
            return;
        }
        throw new IndexOutOfBoundsException("Frame index is not positive");
    }

    public Bitmap E(@e0(from = 0, to = 2147483647L) int i10) {
        Bitmap i11;
        if (i10 >= 0) {
            synchronized (this.U) {
                this.U.G(i10, this.T);
                i11 = i();
            }
            this.f22107a0.sendEmptyMessageAtTime(-1, 0);
            return i11;
        }
        throw new IndexOutOfBoundsException("Frame index is not positive");
    }

    public Bitmap F(@e0(from = 0, to = 2147483647L) int i10) {
        Bitmap i11;
        if (i10 >= 0) {
            synchronized (this.U) {
                this.U.I(i10, this.T);
                i11 = i();
            }
            this.f22107a0.sendEmptyMessageAtTime(-1, 0);
            return i11;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void G(@v(from = 0.0d) float f10) {
        oh.a aVar = new oh.a(f10);
        this.f22113g0 = aVar;
        aVar.b(this.R);
    }

    public void H(@e0(from = 0, to = 65535) int i10) {
        this.U.J(i10);
    }

    public void I(@v(from = 0.0d, fromInclusive = false) float f10) {
        this.U.L(f10);
    }

    public void J(@o0 oh.b bVar) {
        this.f22113g0 = bVar;
        if (bVar != null) {
            bVar.b(this.R);
        }
    }

    public final void K() {
        this.P = false;
        this.f22107a0.removeMessages(-1);
        this.U.A();
    }

    public void L(long j10) {
        if (this.Z) {
            this.Q = 0;
            this.f22107a0.sendEmptyMessageAtTime(-1, 0);
            return;
        }
        d();
        this.f22110d0 = this.O.schedule(this.f22108b0, Math.max(j10, 0), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter M(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void a(@m0 a aVar) {
        this.V.add(aVar);
    }

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return r() > 1;
    }

    public boolean canSeekForward() {
        return r() > 1;
    }

    public final void d() {
        ScheduledFuture<?> scheduledFuture = this.f22110d0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f22107a0.removeMessages(-1);
    }

    public void draw(@m0 Canvas canvas) {
        boolean z10;
        if (this.X == null || this.S.getColorFilter() != null) {
            z10 = false;
        } else {
            this.S.setColorFilter(this.X);
            z10 = true;
        }
        oh.b bVar = this.f22113g0;
        if (bVar == null) {
            canvas.drawBitmap(this.T, this.f22109c0, this.R, this.S);
        } else {
            bVar.a(canvas, this.S, this.T);
        }
        if (z10) {
            this.S.setColorFilter((ColorFilter) null);
        }
    }

    public long f() {
        return this.U.b() + ((long) this.T.getAllocationByteCount());
    }

    @o0
    public String g() {
        return this.U.c();
    }

    public int getAlpha() {
        return this.S.getAlpha();
    }

    public int getAudioSessionId() {
        return 0;
    }

    public int getBufferPercentage() {
        return 100;
    }

    public ColorFilter getColorFilter() {
        return this.S.getColorFilter();
    }

    public int getCurrentPosition() {
        return this.U.f();
    }

    public int getDuration() {
        return this.U.g();
    }

    public int getIntrinsicHeight() {
        return this.f22112f0;
    }

    public int getIntrinsicWidth() {
        return this.f22111e0;
    }

    public int getOpacity() {
        return (!this.U.v() || this.S.getAlpha() < 255) ? -2 : -1;
    }

    @v(from = 0.0d)
    public float h() {
        oh.b bVar = this.f22113g0;
        if (bVar instanceof oh.a) {
            return ((oh.a) bVar).d();
        }
        return 0.0f;
    }

    public Bitmap i() {
        Bitmap bitmap = this.T;
        Bitmap copy = bitmap.copy(bitmap.getConfig(), this.T.isMutable());
        copy.setHasAlpha(this.T.hasAlpha());
        return copy;
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        B();
    }

    public boolean isPlaying() {
        return this.P;
    }

    public boolean isRunning() {
        return this.P;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.W;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0013
            android.content.res.ColorStateList r0 = r1.W
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.e.isStateful():boolean");
    }

    public int j() {
        return this.U.d();
    }

    public int k() {
        int e10 = this.U.e();
        return (e10 == 0 || e10 < this.U.j()) ? e10 : e10 - 1;
    }

    @m0
    public h l() {
        return h.b(this.U.l());
    }

    public int m() {
        return this.T.getRowBytes() * this.T.getHeight();
    }

    public int n(@e0(from = 0) int i10) {
        return this.U.h(i10);
    }

    public long o() {
        return this.U.p();
    }

    public void onBoundsChange(Rect rect) {
        this.R.set(rect);
        oh.b bVar = this.f22113g0;
        if (bVar != null) {
            bVar.b(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.W;
        if (colorStateList == null || (mode = this.Y) == null) {
            return false;
        }
        this.X = M(colorStateList, mode);
        return true;
    }

    public int p() {
        return this.U.j();
    }

    public void pause() {
        stop();
    }

    public long q() {
        return this.U.k();
    }

    public int r() {
        return this.U.n();
    }

    @m0
    public final Paint s() {
        return this.S;
    }

    public void seekTo(@e0(from = 0, to = 2147483647L) int i10) {
        if (i10 >= 0) {
            this.O.execute(new b(this, i10));
            return;
        }
        throw new IllegalArgumentException("Position is not positive");
    }

    public void setAlpha(@e0(from = 0, to = 255) int i10) {
        this.S.setAlpha(i10);
    }

    public void setColorFilter(@o0 ColorFilter colorFilter) {
        this.S.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.S.setDither(z10);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z10) {
        this.S.setFilterBitmap(z10);
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorStateList) {
        this.W = colorStateList;
        this.X = M(colorStateList, this.Y);
        invalidateSelf();
    }

    public void setTintMode(@o0 PorterDuff.Mode mode) {
        this.Y = mode;
        this.X = M(this.W, mode);
        invalidateSelf();
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.Z) {
            if (z10) {
                if (z11) {
                    A();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    public void start() {
        synchronized (this) {
            if (!this.P) {
                this.P = true;
                L(this.U.D());
            }
        }
    }

    public void stop() {
        synchronized (this) {
            if (this.P) {
                this.P = false;
                d();
                this.U.F();
            }
        }
    }

    public int t(@e0(from = 0) int i10, @e0(from = 0) int i11) {
        if (i10 >= this.U.q()) {
            throw new IllegalArgumentException("x must be < width");
        } else if (i11 < this.U.i()) {
            return this.T.getPixel(i10, i11);
        } else {
            throw new IllegalArgumentException("y must be < height");
        }
    }

    @m0
    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", new Object[]{Integer.valueOf(this.U.q()), Integer.valueOf(this.U.i()), Integer.valueOf(this.U.n()), Integer.valueOf(this.U.l())});
    }

    public void u(@m0 int[] iArr) {
        this.T.getPixels(iArr, 0, this.U.q(), 0, 0, this.U.q(), this.U.i());
    }

    @o0
    public oh.b v() {
        return this.f22113g0;
    }

    public boolean w() {
        return this.U.u();
    }

    public boolean x() {
        return this.U.w();
    }

    public void y() {
        K();
        this.T.recycle();
    }

    public boolean z(a aVar) {
        return this.V.remove(aVar);
    }
}
