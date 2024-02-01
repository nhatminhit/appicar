package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.f0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class u<T> implements e0<T> {

    public class a implements e0.b<T> {

        /* renamed from: f  reason: collision with root package name */
        public static final int f3698f = 1;

        /* renamed from: g  reason: collision with root package name */
        public static final int f3699g = 2;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3700h = 3;

        /* renamed from: a  reason: collision with root package name */
        public final c f3701a = new c();

        /* renamed from: b  reason: collision with root package name */
        public final Handler f3702b = new Handler(Looper.getMainLooper());

        /* renamed from: c  reason: collision with root package name */
        public Runnable f3703c = new C0049a();

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e0.b f3704d;

        /* renamed from: androidx.recyclerview.widget.u$a$a  reason: collision with other inner class name */
        public class C0049a implements Runnable {
            public C0049a() {
            }

            public void run() {
                while (true) {
                    d a10 = a.this.f3701a.a();
                    if (a10 != null) {
                        int i10 = a10.f3720b;
                        if (i10 == 1) {
                            a.this.f3704d.c(a10.f3721c, a10.f3722d);
                        } else if (i10 == 2) {
                            a.this.f3704d.a(a10.f3721c, (f0.a) a10.f3726h);
                        } else if (i10 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unsupported message, what=");
                            sb2.append(a10.f3720b);
                        } else {
                            a.this.f3704d.b(a10.f3721c, a10.f3722d);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public a(e0.b bVar) {
            this.f3704d = bVar;
        }

        public void a(int i10, f0.a<T> aVar) {
            d(d.c(2, i10, aVar));
        }

        public void b(int i10, int i11) {
            d(d.a(3, i10, i11));
        }

        public void c(int i10, int i11) {
            d(d.a(1, i10, i11));
        }

        public final void d(d dVar) {
            this.f3701a.c(dVar);
            this.f3702b.post(this.f3703c);
        }
    }

    public class b implements e0.a<T> {

        /* renamed from: g  reason: collision with root package name */
        public static final int f3706g = 1;

        /* renamed from: h  reason: collision with root package name */
        public static final int f3707h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f3708i = 3;

        /* renamed from: j  reason: collision with root package name */
        public static final int f3709j = 4;

        /* renamed from: a  reason: collision with root package name */
        public final c f3710a = new c();

        /* renamed from: b  reason: collision with root package name */
        public final Executor f3711b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c  reason: collision with root package name */
        public AtomicBoolean f3712c = new AtomicBoolean(false);

        /* renamed from: d  reason: collision with root package name */
        public Runnable f3713d = new a();

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e0.a f3714e;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                while (true) {
                    d a10 = b.this.f3710a.a();
                    if (a10 == null) {
                        b.this.f3712c.set(false);
                        return;
                    }
                    int i10 = a10.f3720b;
                    if (i10 == 1) {
                        b.this.f3710a.b(1);
                        b.this.f3714e.d(a10.f3721c);
                    } else if (i10 == 2) {
                        b.this.f3710a.b(2);
                        b.this.f3710a.b(3);
                        b.this.f3714e.a(a10.f3721c, a10.f3722d, a10.f3723e, a10.f3724f, a10.f3725g);
                    } else if (i10 == 3) {
                        b.this.f3714e.c(a10.f3721c, a10.f3722d);
                    } else if (i10 != 4) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported message, what=");
                        sb2.append(a10.f3720b);
                    } else {
                        b.this.f3714e.b((f0.a) a10.f3726h);
                    }
                }
            }
        }

        public b(e0.a aVar) {
            this.f3714e = aVar;
        }

        public void a(int i10, int i11, int i12, int i13, int i14) {
            g(d.b(2, i10, i11, i12, i13, i14, (Object) null));
        }

        public void b(f0.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        public void c(int i10, int i11) {
            f(d.a(3, i10, i11));
        }

        public void d(int i10) {
            g(d.c(1, i10, (Object) null));
        }

        public final void e() {
            if (this.f3712c.compareAndSet(false, true)) {
                this.f3711b.execute(this.f3713d);
            }
        }

        public final void f(d dVar) {
            this.f3710a.c(dVar);
            e();
        }

        public final void g(d dVar) {
            this.f3710a.d(dVar);
            e();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public d f3716a;

        public synchronized d a() {
            d dVar = this.f3716a;
            if (dVar == null) {
                return null;
            }
            this.f3716a = dVar.f3719a;
            return dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void b(int r5) {
            /*
                r4 = this;
                monitor-enter(r4)
            L_0x0001:
                androidx.recyclerview.widget.u$d r0 = r4.f3716a     // Catch:{ all -> 0x0028 }
                if (r0 == 0) goto L_0x0011
                int r1 = r0.f3720b     // Catch:{ all -> 0x0028 }
                if (r1 != r5) goto L_0x0011
                androidx.recyclerview.widget.u$d r1 = r0.f3719a     // Catch:{ all -> 0x0028 }
                r4.f3716a = r1     // Catch:{ all -> 0x0028 }
                r0.d()     // Catch:{ all -> 0x0028 }
                goto L_0x0001
            L_0x0011:
                if (r0 == 0) goto L_0x0026
                androidx.recyclerview.widget.u$d r1 = r0.f3719a     // Catch:{ all -> 0x0028 }
            L_0x0015:
                if (r1 == 0) goto L_0x0026
                androidx.recyclerview.widget.u$d r2 = r1.f3719a     // Catch:{ all -> 0x0028 }
                int r3 = r1.f3720b     // Catch:{ all -> 0x0028 }
                if (r3 != r5) goto L_0x0023
                r0.f3719a = r2     // Catch:{ all -> 0x0028 }
                r1.d()     // Catch:{ all -> 0x0028 }
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                r1 = r2
                goto L_0x0015
            L_0x0026:
                monitor-exit(r4)
                return
            L_0x0028:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.u.c.b(int):void");
        }

        public synchronized void c(d dVar) {
            d dVar2 = this.f3716a;
            if (dVar2 == null) {
                this.f3716a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.f3719a;
                if (dVar3 != null) {
                    dVar2 = dVar3;
                } else {
                    dVar2.f3719a = dVar;
                    return;
                }
            }
        }

        public synchronized void d(d dVar) {
            dVar.f3719a = this.f3716a;
            this.f3716a = dVar;
        }
    }

    public static class d {

        /* renamed from: i  reason: collision with root package name */
        public static d f3717i;

        /* renamed from: j  reason: collision with root package name */
        public static final Object f3718j = new Object();

        /* renamed from: a  reason: collision with root package name */
        public d f3719a;

        /* renamed from: b  reason: collision with root package name */
        public int f3720b;

        /* renamed from: c  reason: collision with root package name */
        public int f3721c;

        /* renamed from: d  reason: collision with root package name */
        public int f3722d;

        /* renamed from: e  reason: collision with root package name */
        public int f3723e;

        /* renamed from: f  reason: collision with root package name */
        public int f3724f;

        /* renamed from: g  reason: collision with root package name */
        public int f3725g;

        /* renamed from: h  reason: collision with root package name */
        public Object f3726h;

        public static d a(int i10, int i11, int i12) {
            return b(i10, i11, i12, 0, 0, 0, (Object) null);
        }

        public static d b(int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            d dVar;
            synchronized (f3718j) {
                dVar = f3717i;
                if (dVar == null) {
                    dVar = new d();
                } else {
                    f3717i = dVar.f3719a;
                    dVar.f3719a = null;
                }
                dVar.f3720b = i10;
                dVar.f3721c = i11;
                dVar.f3722d = i12;
                dVar.f3723e = i13;
                dVar.f3724f = i14;
                dVar.f3725g = i15;
                dVar.f3726h = obj;
            }
            return dVar;
        }

        public static d c(int i10, int i11, Object obj) {
            return b(i10, i11, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.f3719a = null;
            this.f3725g = 0;
            this.f3724f = 0;
            this.f3723e = 0;
            this.f3722d = 0;
            this.f3721c = 0;
            this.f3720b = 0;
            this.f3726h = null;
            synchronized (f3718j) {
                d dVar = f3717i;
                if (dVar != null) {
                    this.f3719a = dVar;
                }
                f3717i = this;
            }
        }
    }

    public e0.a<T> a(e0.a<T> aVar) {
        return new b(aVar);
    }

    public e0.b<T> b(e0.b<T> bVar) {
        return new a(bVar);
    }
}
