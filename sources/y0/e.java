package y0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.collection.g;
import androidx.collection.i;
import d.m0;
import d.z;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import n0.x0;
import y0.f;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final g<String, Typeface> f15250a = new g<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f15251b = g.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f15252c = new Object();
    @z("LOCK")

    /* renamed from: d  reason: collision with root package name */
    public static final i<String, ArrayList<e1.c<C0242e>>> f15253d = new i<>();

    public class a implements Callable<C0242e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15254a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f15255b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f15256c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f15257d;

        public a(String str, Context context, d dVar, int i10) {
            this.f15254a = str;
            this.f15255b = context;
            this.f15256c = dVar;
            this.f15257d = i10;
        }

        /* renamed from: a */
        public C0242e call() {
            return e.c(this.f15254a, this.f15255b, this.f15256c, this.f15257d);
        }
    }

    public class b implements e1.c<C0242e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f15258a;

        public b(a aVar) {
            this.f15258a = aVar;
        }

        /* renamed from: a */
        public void accept(C0242e eVar) {
            this.f15258a.b(eVar);
        }
    }

    public class c implements Callable<C0242e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15259a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f15260b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f15261c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f15262d;

        public c(String str, Context context, d dVar, int i10) {
            this.f15259a = str;
            this.f15260b = context;
            this.f15261c = dVar;
            this.f15262d = i10;
        }

        /* renamed from: a */
        public C0242e call() {
            return e.c(this.f15259a, this.f15260b, this.f15261c, this.f15262d);
        }
    }

    public class d implements e1.c<C0242e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15263a;

        public d(String str) {
            this.f15263a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((e1.c) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(y0.e.C0242e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = y0.e.f15252c
                monitor-enter(r0)
                androidx.collection.i<java.lang.String, java.util.ArrayList<e1.c<y0.e$e>>> r1 = y0.e.f15253d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f15263a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f15263a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                e1.c r1 = (e1.c) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.e.d.accept(y0.e$e):void");
        }
    }

    /* renamed from: y0.e$e  reason: collision with other inner class name */
    public static final class C0242e {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f15264a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15265b;

        public C0242e(int i10) {
            this.f15264a = null;
            this.f15265b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public C0242e(@m0 Typeface typeface) {
            this.f15264a = typeface;
            this.f15265b = 0;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f15265b == 0;
        }
    }

    public static String a(@m0 d dVar, int i10) {
        return dVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@m0 f.b bVar) {
        int i10 = 1;
        if (bVar.c() != 0) {
            return bVar.c() != 1 ? -3 : -2;
        }
        f.c[] b10 = bVar.b();
        if (!(b10 == null || b10.length == 0)) {
            int length = b10.length;
            i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                int b11 = b10[i11].b();
                if (b11 == 0) {
                    i11++;
                } else if (b11 < 0) {
                    return -3;
                } else {
                    return b11;
                }
            }
        }
        return i10;
    }

    @m0
    public static C0242e c(@m0 String str, @m0 Context context, @m0 d dVar, int i10) {
        g<String, Typeface> gVar = f15250a;
        Typeface f10 = gVar.f(str);
        if (f10 != null) {
            return new C0242e(f10);
        }
        try {
            f.b d10 = c.d(context, dVar, (CancellationSignal) null);
            int b10 = b(d10);
            if (b10 != 0) {
                return new C0242e(b10);
            }
            Typeface c10 = x0.c(context, (CancellationSignal) null, d10.b(), i10);
            if (c10 == null) {
                return new C0242e(-3);
            }
            gVar.j(str, c10);
            return new C0242e(c10);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0242e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new y0.e.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f15251b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        y0.g.c(r8, r9, new y0.e.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface d(@d.m0 android.content.Context r5, @d.m0 y0.d r6, int r7, @d.o0 java.util.concurrent.Executor r8, @d.m0 y0.a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            androidx.collection.g<java.lang.String, android.graphics.Typeface> r1 = f15250a
            java.lang.Object r1 = r1.f(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            y0.e$e r5 = new y0.e$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            y0.e$b r1 = new y0.e$b
            r1.<init>(r9)
            java.lang.Object r9 = f15252c
            monitor-enter(r9)
            androidx.collection.i<java.lang.String, java.util.ArrayList<e1.c<y0.e$e>>> r2 = f15253d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            y0.e$c r9 = new y0.e$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f15251b
        L_0x0044:
            y0.e$d r5 = new y0.e$d
            r5.<init>(r0)
            y0.g.c(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.e.d(android.content.Context, y0.d, int, java.util.concurrent.Executor, y0.a):android.graphics.Typeface");
    }

    public static Typeface e(@m0 Context context, @m0 d dVar, @m0 a aVar, int i10, int i11) {
        String a10 = a(dVar, i10);
        Typeface f10 = f15250a.f(a10);
        if (f10 != null) {
            aVar.b(new C0242e(f10));
            return f10;
        } else if (i11 == -1) {
            C0242e c10 = c(a10, context, dVar, i10);
            aVar.b(c10);
            return c10.f15264a;
        } else {
            try {
                C0242e eVar = (C0242e) g.d(f15251b, new a(a10, context, dVar, i10), i11);
                aVar.b(eVar);
                return eVar.f15264a;
            } catch (InterruptedException unused) {
                aVar.b(new C0242e(-3));
                return null;
            }
        }
    }

    public static void f() {
        f15250a.d();
    }
}
