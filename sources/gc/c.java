package gc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import gc.b0;
import gc.j;
import gc.t;
import gc.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class c implements Runnable {

    /* renamed from: h0  reason: collision with root package name */
    public static final Object f18978h0 = new Object();

    /* renamed from: i0  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f18979i0 = new a();

    /* renamed from: j0  reason: collision with root package name */
    public static final AtomicInteger f18980j0 = new AtomicInteger();

    /* renamed from: k0  reason: collision with root package name */
    public static final b0 f18981k0 = new b();
    public final int O = f18980j0.incrementAndGet();
    public final v P;
    public final i Q;
    public final d R;
    public final d0 S;
    public final String T;
    public final z U;
    public final int V;
    public int W;
    public final b0 X;
    public a Y;
    public List<a> Z;

    /* renamed from: a0  reason: collision with root package name */
    public Bitmap f18982a0;

    /* renamed from: b0  reason: collision with root package name */
    public Future<?> f18983b0;

    /* renamed from: c0  reason: collision with root package name */
    public v.e f18984c0;

    /* renamed from: d0  reason: collision with root package name */
    public Exception f18985d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f18986e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f18987f0;

    /* renamed from: g0  reason: collision with root package name */
    public v.f f18988g0;

    public static class a extends ThreadLocal<StringBuilder> {
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder(j0.f19072a);
        }
    }

    public static class b extends b0 {
        public boolean c(z zVar) {
            return true;
        }

        public b0.a f(z zVar, int i10) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + zVar);
        }
    }

    /* renamed from: gc.c$c  reason: collision with other inner class name */
    public static class C0311c implements Runnable {
        public final /* synthetic */ h0 O;
        public final /* synthetic */ RuntimeException P;

        public C0311c(h0 h0Var, RuntimeException runtimeException) {
            this.O = h0Var;
            this.P = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.O.a() + " crashed with exception.", this.P);
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ StringBuilder O;

        public d(StringBuilder sb2) {
            this.O = sb2;
        }

        public void run() {
            throw new NullPointerException(this.O.toString());
        }
    }

    public static class e implements Runnable {
        public final /* synthetic */ h0 O;

        public e(h0 h0Var) {
            this.O = h0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.O.a() + " returned input Bitmap but recycled it.");
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ h0 O;

        public f(h0 h0Var) {
            this.O = h0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.O.a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    public c(v vVar, i iVar, d dVar, d0 d0Var, a aVar, b0 b0Var) {
        this.P = vVar;
        this.Q = iVar;
        this.R = dVar;
        this.S = d0Var;
        this.Y = aVar;
        this.T = aVar.d();
        this.U = aVar.i();
        this.f18988g0 = aVar.h();
        this.V = aVar.e();
        this.W = aVar.f();
        this.X = b0Var;
        this.f18987f0 = b0Var.e();
    }

    public static Bitmap a(List<h0> list, Bitmap bitmap) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            h0 h0Var = list.get(i10);
            try {
                Bitmap b10 = h0Var.b(bitmap);
                if (b10 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(h0Var.a());
                    sb2.append(" returned null after ");
                    sb2.append(i10);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (h0 a10 : list) {
                        sb2.append(a10.a());
                        sb2.append(10);
                    }
                    v.f19116q.post(new d(sb2));
                    return null;
                } else if (b10 == bitmap && bitmap.isRecycled()) {
                    v.f19116q.post(new e(h0Var));
                    return null;
                } else if (b10 == bitmap || bitmap.isRecycled()) {
                    i10++;
                    bitmap = b10;
                } else {
                    v.f19116q.post(new f(h0Var));
                    return null;
                }
            } catch (RuntimeException e10) {
                v.f19116q.post(new C0311c(h0Var, e10));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap e(InputStream inputStream, z zVar) throws IOException {
        p pVar = new p(inputStream);
        long f10 = pVar.f(65536);
        BitmapFactory.Options d10 = b0.d(zVar);
        boolean g10 = b0.g(d10);
        boolean u10 = j0.u(pVar);
        pVar.c(f10);
        if (u10) {
            byte[] y10 = j0.y(pVar);
            if (g10) {
                BitmapFactory.decodeByteArray(y10, 0, y10.length, d10);
                b0.b(zVar.f19169h, zVar.f19170i, d10, zVar);
            }
            return BitmapFactory.decodeByteArray(y10, 0, y10.length, d10);
        }
        if (g10) {
            BitmapFactory.decodeStream(pVar, (Rect) null, d10);
            b0.b(zVar.f19169h, zVar.f19170i, d10, zVar);
            pVar.c(f10);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(pVar, (Rect) null, d10);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static c g(v vVar, i iVar, d dVar, d0 d0Var, a aVar) {
        z i10 = aVar.i();
        List<b0> l10 = vVar.l();
        int size = l10.size();
        for (int i11 = 0; i11 < size; i11++) {
            b0 b0Var = l10.get(i11);
            if (b0Var.c(i10)) {
                return new c(vVar, iVar, dVar, d0Var, aVar, b0Var);
            }
        }
        return new c(vVar, iVar, dVar, d0Var, aVar, f18981k0);
    }

    public static boolean t(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 || i10 > i12 || i11 > i13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap w(gc.z r16, android.graphics.Bitmap r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r17.getWidth()
            int r3 = r17.getHeight()
            boolean r4 = r0.f19173l
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r16.f()
            r6 = 0
            if (r5 == 0) goto L_0x00b2
            int r5 = r0.f19169h
            int r7 = r0.f19170i
            float r8 = r0.f19174m
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0034
            boolean r9 = r0.f19177p
            if (r9 == 0) goto L_0x0031
            float r9 = r0.f19175n
            float r11 = r0.f19176o
            r10.setRotate(r8, r9, r11)
            goto L_0x0034
        L_0x0031:
            r10.setRotate(r8)
        L_0x0034:
            boolean r8 = r0.f19171j
            if (r8 == 0) goto L_0x0077
            float r0 = (float) r5
            float r8 = (float) r2
            float r9 = r0 / r8
            float r11 = (float) r7
            float r12 = (float) r3
            float r13 = r11 / r12
            int r14 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r14 <= 0) goto L_0x0056
            float r13 = r13 / r9
            float r12 = r12 * r13
            double r12 = (double) r12
            double r12 = java.lang.Math.ceil(r12)
            int r0 = (int) r12
            int r8 = r3 - r0
            int r8 = r8 / 2
            float r12 = (float) r0
            float r13 = r11 / r12
            r11 = r9
            r9 = r2
            goto L_0x006a
        L_0x0056:
            float r9 = r9 / r13
            float r8 = r8 * r9
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r8 = (int) r8
            int r9 = r2 - r8
            int r9 = r9 / 2
            float r11 = (float) r8
            float r0 = r0 / r11
            r11 = r0
            r0 = r3
            r15 = r8
            r8 = r6
            r6 = r9
            r9 = r15
        L_0x006a:
            boolean r2 = t(r4, r2, r3, r5, r7)
            if (r2 == 0) goto L_0x0073
            r10.preScale(r11, r13)
        L_0x0073:
            r7 = r8
            r8 = r9
            r9 = r0
            goto L_0x00b5
        L_0x0077:
            boolean r0 = r0.f19172k
            if (r0 == 0) goto L_0x0091
            float r0 = (float) r5
            float r8 = (float) r2
            float r0 = r0 / r8
            float r8 = (float) r7
            float r9 = (float) r3
            float r8 = r8 / r9
            int r9 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r9 >= 0) goto L_0x0086
            goto L_0x0087
        L_0x0086:
            r0 = r8
        L_0x0087:
            boolean r4 = t(r4, r2, r3, r5, r7)
            if (r4 == 0) goto L_0x00b2
            r10.preScale(r0, r0)
            goto L_0x00b2
        L_0x0091:
            if (r5 != 0) goto L_0x0095
            if (r7 == 0) goto L_0x00b2
        L_0x0095:
            if (r5 != r2) goto L_0x0099
            if (r7 == r3) goto L_0x00b2
        L_0x0099:
            if (r5 == 0) goto L_0x009e
            float r0 = (float) r5
            float r8 = (float) r2
            goto L_0x00a0
        L_0x009e:
            float r0 = (float) r7
            float r8 = (float) r3
        L_0x00a0:
            float r0 = r0 / r8
            if (r7 == 0) goto L_0x00a6
            float r8 = (float) r7
            float r9 = (float) r3
            goto L_0x00a8
        L_0x00a6:
            float r8 = (float) r5
            float r9 = (float) r2
        L_0x00a8:
            float r8 = r8 / r9
            boolean r4 = t(r4, r2, r3, r5, r7)
            if (r4 == 0) goto L_0x00b2
            r10.preScale(r0, r8)
        L_0x00b2:
            r8 = r2
            r9 = r3
            r7 = r6
        L_0x00b5:
            if (r1 == 0) goto L_0x00bb
            float r0 = (float) r1
            r10.preRotate(r0)
        L_0x00bb:
            r11 = 1
            r5 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r17
            if (r0 == r1) goto L_0x00ca
            r17.recycle()
            goto L_0x00cb
        L_0x00ca:
            r0 = r1
        L_0x00cb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.c.w(gc.z, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void x(z zVar) {
        String b10 = zVar.b();
        StringBuilder sb2 = f18979i0.get();
        sb2.ensureCapacity(b10.length() + 8);
        sb2.replace(8, sb2.length(), b10);
        Thread.currentThread().setName(sb2.toString());
    }

    public void b(a aVar) {
        String str;
        String str2;
        boolean z10 = this.P.f19131n;
        z zVar = aVar.f18946b;
        if (this.Y == null) {
            this.Y = aVar;
            if (z10) {
                List<a> list = this.Z;
                if (list == null || list.isEmpty()) {
                    str = zVar.e();
                    str2 = "to empty hunter";
                } else {
                    str = zVar.e();
                    str2 = j0.n(this, "to ");
                }
                j0.w(j0.f19086o, j0.f19097z, str, str2);
                return;
            }
            return;
        }
        if (this.Z == null) {
            this.Z = new ArrayList(3);
        }
        this.Z.add(aVar);
        if (z10) {
            j0.w(j0.f19086o, j0.f19097z, zVar.e(), j0.n(this, "to "));
        }
        v.f h10 = aVar.h();
        if (h10.ordinal() > this.f18988g0.ordinal()) {
            this.f18988g0 = h10;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f18983b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r2 = this;
            gc.a r0 = r2.Y
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.List<gc.a> r0 = r2.Z
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f18983b0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.c.c():boolean");
    }

    public final v.f d() {
        v.f fVar = v.f.LOW;
        List<a> list = this.Z;
        boolean z10 = true;
        boolean z11 = list != null && !list.isEmpty();
        a aVar = this.Y;
        if (aVar == null && !z11) {
            z10 = false;
        }
        if (!z10) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z11) {
            int size = this.Z.size();
            for (int i10 = 0; i10 < size; i10++) {
                v.f h10 = this.Z.get(i10).h();
                if (h10.ordinal() > fVar.ordinal()) {
                    fVar = h10;
                }
            }
        }
        return fVar;
    }

    public void f(a aVar) {
        boolean z10;
        if (this.Y == aVar) {
            this.Y = null;
            z10 = true;
        } else {
            List<a> list = this.Z;
            z10 = list != null ? list.remove(aVar) : false;
        }
        if (z10 && aVar.h() == this.f18988g0) {
            this.f18988g0 = d();
        }
        if (this.P.f19131n) {
            j0.w(j0.f19086o, j0.A, aVar.f18946b.e(), j0.n(this, "from "));
        }
    }

    public a h() {
        return this.Y;
    }

    public List<a> i() {
        return this.Z;
    }

    public z j() {
        return this.U;
    }

    public Exception k() {
        return this.f18985d0;
    }

    public String l() {
        return this.T;
    }

    public v.e m() {
        return this.f18984c0;
    }

    public int n() {
        return this.V;
    }

    public v o() {
        return this.P;
    }

    public v.f p() {
        return this.f18988g0;
    }

    public Bitmap q() {
        return this.f18982a0;
    }

    /* JADX INFO: finally extract failed */
    public Bitmap r() throws IOException {
        Bitmap bitmap;
        if (r.a(this.V)) {
            bitmap = this.R.g(this.T);
            if (bitmap != null) {
                this.S.d();
                this.f18984c0 = v.e.MEMORY;
                if (this.P.f19131n) {
                    j0.w(j0.f19086o, j0.f19095x, this.U.e(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        z zVar = this.U;
        zVar.f19164c = this.f18987f0 == 0 ? s.OFFLINE.O : this.W;
        b0.a f10 = this.X.f(zVar, this.W);
        if (f10 != null) {
            this.f18984c0 = f10.c();
            this.f18986e0 = f10.b();
            bitmap = f10.a();
            if (bitmap == null) {
                InputStream d10 = f10.d();
                try {
                    Bitmap e10 = e(d10, this.U);
                    j0.f(d10);
                    bitmap = e10;
                } catch (Throwable th2) {
                    j0.f(d10);
                    throw th2;
                }
            }
        }
        if (bitmap != null) {
            if (this.P.f19131n) {
                j0.v(j0.f19086o, j0.f19095x, this.U.e());
            }
            this.S.b(bitmap);
            if (this.U.g() || this.f18986e0 != 0) {
                synchronized (f18978h0) {
                    if (this.U.f() || this.f18986e0 != 0) {
                        bitmap = w(this.U, bitmap, this.f18986e0);
                        if (this.P.f19131n) {
                            j0.v(j0.f19086o, j0.f19096y, this.U.e());
                        }
                    }
                    if (this.U.c()) {
                        bitmap = a(this.U.f19168g, bitmap);
                        if (this.P.f19131n) {
                            j0.w(j0.f19086o, j0.f19096y, this.U.e(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.S.c(bitmap);
                }
            }
        }
        return bitmap;
    }

    public void run() {
        i iVar;
        i iVar2;
        try {
            x(this.U);
            if (this.P.f19131n) {
                j0.v(j0.f19086o, j0.f19094w, j0.m(this));
            }
            Bitmap r10 = r();
            this.f18982a0 = r10;
            if (r10 == null) {
                this.Q.e(this);
            } else {
                this.Q.d(this);
            }
        } catch (j.b e10) {
            if (!e10.O || e10.P != 504) {
                this.f18985d0 = e10;
            }
            iVar = this.Q;
        } catch (t.a e11) {
            this.f18985d0 = e11;
            iVar2 = this.Q;
            iVar2.i(this);
            Thread.currentThread().setName(j0.f19073b);
        } catch (IOException e12) {
            this.f18985d0 = e12;
            iVar2 = this.Q;
            iVar2.i(this);
            Thread.currentThread().setName(j0.f19073b);
        } catch (OutOfMemoryError e13) {
            StringWriter stringWriter = new StringWriter();
            this.S.a().b(new PrintWriter(stringWriter));
            this.f18985d0 = new RuntimeException(stringWriter.toString(), e13);
            iVar = this.Q;
        } catch (Exception e14) {
            this.f18985d0 = e14;
            iVar = this.Q;
        } catch (Throwable th2) {
            Thread.currentThread().setName(j0.f19073b);
            throw th2;
        }
        Thread.currentThread().setName(j0.f19073b);
        iVar.e(this);
        Thread.currentThread().setName(j0.f19073b);
    }

    public boolean s() {
        Future<?> future = this.f18983b0;
        return future != null && future.isCancelled();
    }

    public boolean u(boolean z10, NetworkInfo networkInfo) {
        int i10 = this.f18987f0;
        if (!(i10 > 0)) {
            return false;
        }
        this.f18987f0 = i10 - 1;
        return this.X.h(z10, networkInfo);
    }

    public boolean v() {
        return this.X.i();
    }
}
