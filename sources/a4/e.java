package a4;

import a4.a;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import t3.b;
import v3.f;

public class e implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f151f = "DiskLruCacheWrapper";

    /* renamed from: g  reason: collision with root package name */
    public static final int f152g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f153h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static e f154i;

    /* renamed from: a  reason: collision with root package name */
    public final m f155a;

    /* renamed from: b  reason: collision with root package name */
    public final File f156b;

    /* renamed from: c  reason: collision with root package name */
    public final long f157c;

    /* renamed from: d  reason: collision with root package name */
    public final c f158d = new c();

    /* renamed from: e  reason: collision with root package name */
    public b f159e;

    @Deprecated
    public e(File file, long j10) {
        this.f156b = file;
        this.f157c = j10;
        this.f155a = new m();
    }

    public static a d(File file, long j10) {
        return new e(file, j10);
    }

    @Deprecated
    public static synchronized a e(File file, long j10) {
        e eVar;
        synchronized (e.class) {
            if (f154i == null) {
                f154i = new e(file, j10);
            }
            eVar = f154i;
        }
        return eVar;
    }

    public void a(f fVar) {
        try {
            f().f1(this.f155a.b(fVar));
        } catch (IOException unused) {
            Log.isLoggable(f151f, 5);
        }
    }

    public File b(f fVar) {
        String b10 = this.f155a.b(fVar);
        if (Log.isLoggable(f151f, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get: Obtained: ");
            sb2.append(b10);
            sb2.append(" for for Key: ");
            sb2.append(fVar);
        }
        try {
            b.e c02 = f().c0(b10);
            if (c02 != null) {
                return c02.b(0);
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable(f151f, 5);
            return null;
        }
    }

    public void c(f fVar, a.b bVar) {
        b.c Q;
        String b10 = this.f155a.b(fVar);
        this.f158d.a(b10);
        try {
            if (Log.isLoggable(f151f, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Put: Obtained: ");
                sb2.append(b10);
                sb2.append(" for for Key: ");
                sb2.append(fVar);
            }
            try {
                b f10 = f();
                if (f10.c0(b10) == null) {
                    Q = f10.Q(b10);
                    if (Q != null) {
                        if (bVar.a(Q.f(0))) {
                            Q.e();
                        }
                        Q.b();
                        this.f158d.b(b10);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b10);
                }
            } catch (IOException unused) {
                boolean isLoggable = Log.isLoggable(f151f, 5);
            } catch (Throwable th2) {
                Q.b();
                throw th2;
            }
        } finally {
            this.f158d.b(b10);
        }
    }

    public synchronized void clear() {
        try {
            f().N();
        } catch (IOException unused) {
            try {
                boolean isLoggable = Log.isLoggable(f151f, 5);
            } catch (Throwable th2) {
                g();
                throw th2;
            }
        }
        g();
    }

    public final synchronized b f() throws IOException {
        if (this.f159e == null) {
            this.f159e = b.H0(this.f156b, 1, 1, this.f157c);
        }
        return this.f159e;
    }

    public final synchronized void g() {
        this.f159e = null;
    }
}
