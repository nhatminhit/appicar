package z3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import d.m0;
import d.o0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k implements e {

    /* renamed from: k  reason: collision with root package name */
    public static final String f15821k = "LruBitmapPool";

    /* renamed from: l  reason: collision with root package name */
    public static final Bitmap.Config f15822l = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    public final l f15823a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f15824b;

    /* renamed from: c  reason: collision with root package name */
    public final long f15825c;

    /* renamed from: d  reason: collision with root package name */
    public final a f15826d;

    /* renamed from: e  reason: collision with root package name */
    public long f15827e;

    /* renamed from: f  reason: collision with root package name */
    public long f15828f;

    /* renamed from: g  reason: collision with root package name */
    public int f15829g;

    /* renamed from: h  reason: collision with root package name */
    public int f15830h;

    /* renamed from: i  reason: collision with root package name */
    public int f15831i;

    /* renamed from: j  reason: collision with root package name */
    public int f15832j;

    public interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static final class b implements a {
        public void a(Bitmap bitmap) {
        }

        public void b(Bitmap bitmap) {
        }
    }

    public static class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Bitmap> f15833a = Collections.synchronizedSet(new HashSet());

        public void a(Bitmap bitmap) {
            if (this.f15833a.contains(bitmap)) {
                this.f15833a.remove(bitmap);
                return;
            }
            throw new IllegalStateException("Cannot remove bitmap not in tracker");
        }

        public void b(Bitmap bitmap) {
            if (!this.f15833a.contains(bitmap)) {
                this.f15833a.add(bitmap);
                return;
            }
            throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
        }
    }

    public k(long j10) {
        this(j10, p(), o());
    }

    public k(long j10, Set<Bitmap.Config> set) {
        this(j10, p(), set);
    }

    public k(long j10, l lVar, Set<Bitmap.Config> set) {
        this.f15825c = j10;
        this.f15827e = j10;
        this.f15823a = lVar;
        this.f15824b = set;
        this.f15826d = new b();
    }

    @TargetApi(26)
    public static void h(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @m0
    public static Bitmap i(int i10, int i11, @o0 Bitmap.Config config) {
        if (config == null) {
            config = f15822l;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @TargetApi(26)
    public static Set<Bitmap.Config> o() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static l p() {
        return new o();
    }

    @TargetApi(19)
    public static void s(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    public static void u(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        s(bitmap);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i10) {
        if (Log.isLoggable(f15821k, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trimMemory, level=");
            sb2.append(i10);
        }
        if (i10 >= 40 || i10 >= 20) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            v(e() / 2);
        }
    }

    public void b() {
        Log.isLoggable(f15821k, 3);
        v(0);
    }

    public synchronized void c(float f10) {
        this.f15827e = (long) Math.round(((float) this.f15825c) * f10);
        l();
    }

    public synchronized void d(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f15823a.b(bitmap)) <= this.f15827e) {
                        if (this.f15824b.contains(bitmap.getConfig())) {
                            int b10 = this.f15823a.b(bitmap);
                            this.f15823a.d(bitmap);
                            this.f15826d.b(bitmap);
                            this.f15831i++;
                            this.f15828f += (long) b10;
                            if (Log.isLoggable(f15821k, 2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Put bitmap in pool=");
                                sb2.append(this.f15823a.c(bitmap));
                            }
                            j();
                            l();
                            return;
                        }
                    }
                    if (Log.isLoggable(f15821k, 2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Reject bitmap from pool, bitmap: ");
                        sb3.append(this.f15823a.c(bitmap));
                        sb3.append(", is mutable: ");
                        sb3.append(bitmap.isMutable());
                        sb3.append(", is allowed config: ");
                        sb3.append(this.f15824b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th2) {
                throw th2;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public long e() {
        return this.f15827e;
    }

    @m0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap q10 = q(i10, i11, config);
        if (q10 == null) {
            return i(i10, i11, config);
        }
        q10.eraseColor(0);
        return q10;
    }

    @m0
    public Bitmap g(int i10, int i11, Bitmap.Config config) {
        Bitmap q10 = q(i10, i11, config);
        return q10 == null ? i(i10, i11, config) : q10;
    }

    public final void j() {
        if (Log.isLoggable(f15821k, 2)) {
            k();
        }
    }

    public final void k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hits=");
        sb2.append(this.f15829g);
        sb2.append(", misses=");
        sb2.append(this.f15830h);
        sb2.append(", puts=");
        sb2.append(this.f15831i);
        sb2.append(", evictions=");
        sb2.append(this.f15832j);
        sb2.append(", currentSize=");
        sb2.append(this.f15828f);
        sb2.append(", maxSize=");
        sb2.append(this.f15827e);
        sb2.append("\nStrategy=");
        sb2.append(this.f15823a);
    }

    public final void l() {
        v(this.f15827e);
    }

    public long m() {
        return (long) this.f15832j;
    }

    public long n() {
        return this.f15828f;
    }

    @o0
    public final synchronized Bitmap q(int i10, int i11, @o0 Bitmap.Config config) {
        Bitmap f10;
        h(config);
        f10 = this.f15823a.f(i10, i11, config != null ? config : f15822l);
        if (f10 == null) {
            if (Log.isLoggable(f15821k, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Missing bitmap=");
                sb2.append(this.f15823a.a(i10, i11, config));
            }
            this.f15830h++;
        } else {
            this.f15829g++;
            this.f15828f -= (long) this.f15823a.b(f10);
            this.f15826d.a(f10);
            u(f10);
        }
        if (Log.isLoggable(f15821k, 2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Get bitmap=");
            sb3.append(this.f15823a.a(i10, i11, config));
        }
        j();
        return f10;
    }

    public long r() {
        return (long) this.f15829g;
    }

    public long t() {
        return (long) this.f15830h;
    }

    public final synchronized void v(long j10) {
        while (this.f15828f > j10) {
            Bitmap removeLast = this.f15823a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable(f15821k, 5)) {
                    k();
                }
                this.f15828f = 0;
                return;
            }
            this.f15826d.a(removeLast);
            this.f15828f -= (long) this.f15823a.b(removeLast);
            this.f15832j++;
            if (Log.isLoggable(f15821k, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Evicting bitmap=");
                sb2.append(this.f15823a.c(removeLast));
            }
            j();
            removeLast.recycle();
        }
    }
}
