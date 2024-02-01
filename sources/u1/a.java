package u1;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.i;
import d.t0;
import java.util.ArrayList;

public class a {

    /* renamed from: g  reason: collision with root package name */
    public static final long f13405g = 10;

    /* renamed from: h  reason: collision with root package name */
    public static final ThreadLocal<a> f13406h = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final i<b, Long> f13407a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f13408b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final C0222a f13409c = new C0222a();

    /* renamed from: d  reason: collision with root package name */
    public c f13410d;

    /* renamed from: e  reason: collision with root package name */
    public long f13411e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13412f = false;

    /* renamed from: u1.a$a  reason: collision with other inner class name */
    public class C0222a {
        public C0222a() {
        }

        public void a() {
            a.this.f13411e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f13411e);
            if (a.this.f13408b.size() > 0) {
                a.this.f().a();
            }
        }
    }

    public interface b {
        boolean a(long j10);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0222a f13414a;

        public c(C0222a aVar) {
            this.f13414a = aVar;
        }

        public abstract void a();
    }

    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f13415b = new C0223a();

        /* renamed from: c  reason: collision with root package name */
        public final Handler f13416c = new Handler(Looper.myLooper());

        /* renamed from: d  reason: collision with root package name */
        public long f13417d = -1;

        /* renamed from: u1.a$d$a  reason: collision with other inner class name */
        public class C0223a implements Runnable {
            public C0223a() {
            }

            public void run() {
                d.this.f13417d = SystemClock.uptimeMillis();
                d.this.f13414a.a();
            }
        }

        public d(C0222a aVar) {
            super(aVar);
        }

        public void a() {
            this.f13416c.postDelayed(this.f13415b, Math.max(10 - (SystemClock.uptimeMillis() - this.f13417d), 0));
        }
    }

    @t0(16)
    public static class e extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f13418b = Choreographer.getInstance();

        /* renamed from: c  reason: collision with root package name */
        public final Choreographer.FrameCallback f13419c = new C0224a();

        /* renamed from: u1.a$e$a  reason: collision with other inner class name */
        public class C0224a implements Choreographer.FrameCallback {
            public C0224a() {
            }

            public void doFrame(long j10) {
                e.this.f13414a.a();
            }
        }

        public e(C0222a aVar) {
            super(aVar);
        }

        public void a() {
            this.f13418b.postFrameCallback(this.f13419c);
        }
    }

    public static long d() {
        ThreadLocal<a> threadLocal = f13406h;
        if (threadLocal.get() == null) {
            return 0;
        }
        return threadLocal.get().f13411e;
    }

    public static a e() {
        ThreadLocal<a> threadLocal = f13406h;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    public void a(b bVar, long j10) {
        if (this.f13408b.size() == 0) {
            f().a();
        }
        if (!this.f13408b.contains(bVar)) {
            this.f13408b.add(bVar);
        }
        if (j10 > 0) {
            this.f13407a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    public final void b() {
        if (this.f13412f) {
            for (int size = this.f13408b.size() - 1; size >= 0; size--) {
                if (this.f13408b.get(size) == null) {
                    this.f13408b.remove(size);
                }
            }
            this.f13412f = false;
        }
    }

    public void c(long j10) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f13408b.size(); i10++) {
            b bVar = this.f13408b.get(i10);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j10);
            }
        }
        b();
    }

    public c f() {
        if (this.f13410d == null) {
            this.f13410d = new e(this.f13409c);
        }
        return this.f13410d;
    }

    public final boolean g(b bVar, long j10) {
        Long l10 = this.f13407a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f13407a.remove(bVar);
        return true;
    }

    public void h(b bVar) {
        this.f13407a.remove(bVar);
        int indexOf = this.f13408b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f13408b.set(indexOf, (Object) null);
            this.f13412f = true;
        }
    }

    public void i(c cVar) {
        this.f13410d = cVar;
    }
}
