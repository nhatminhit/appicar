package gc;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import gc.a;
import gc.y;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class v {

    /* renamed from: p  reason: collision with root package name */
    public static final String f19115p = "Picasso";

    /* renamed from: q  reason: collision with root package name */
    public static final Handler f19116q = new a(Looper.getMainLooper());

    /* renamed from: r  reason: collision with root package name */
    public static volatile v f19117r = null;

    /* renamed from: a  reason: collision with root package name */
    public final d f19118a;

    /* renamed from: b  reason: collision with root package name */
    public final g f19119b;

    /* renamed from: c  reason: collision with root package name */
    public final c f19120c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b0> f19121d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f19122e;

    /* renamed from: f  reason: collision with root package name */
    public final i f19123f;

    /* renamed from: g  reason: collision with root package name */
    public final d f19124g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f19125h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<Object, a> f19126i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<ImageView, h> f19127j;

    /* renamed from: k  reason: collision with root package name */
    public final ReferenceQueue<Object> f19128k;

    /* renamed from: l  reason: collision with root package name */
    public final Bitmap.Config f19129l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f19130m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f19131n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f19132o;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 3) {
                int i11 = 0;
                if (i10 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i11 < size) {
                        c cVar = (c) list.get(i11);
                        cVar.P.h(cVar);
                        i11++;
                    }
                } else if (i10 == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i11 < size2) {
                        a aVar = (a) list2.get(i11);
                        aVar.f18945a.y(aVar);
                        i11++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                a aVar2 = (a) message.obj;
                if (aVar2.g().f19131n) {
                    j0.w(j0.f19084m, j0.f19091t, aVar2.f18946b.e(), "target got garbage collected");
                }
                aVar2.f18945a.c(aVar2.k());
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f19133a;

        /* renamed from: b  reason: collision with root package name */
        public j f19134b;

        /* renamed from: c  reason: collision with root package name */
        public ExecutorService f19135c;

        /* renamed from: d  reason: collision with root package name */
        public d f19136d;

        /* renamed from: e  reason: collision with root package name */
        public d f19137e;

        /* renamed from: f  reason: collision with root package name */
        public g f19138f;

        /* renamed from: g  reason: collision with root package name */
        public List<b0> f19139g;

        /* renamed from: h  reason: collision with root package name */
        public Bitmap.Config f19140h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f19141i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f19142j;

        public b(Context context) {
            if (context != null) {
                this.f19133a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public b a(b0 b0Var) {
            if (b0Var != null) {
                if (this.f19139g == null) {
                    this.f19139g = new ArrayList();
                }
                if (!this.f19139g.contains(b0Var)) {
                    this.f19139g.add(b0Var);
                    return this;
                }
                throw new IllegalStateException("RequestHandler already registered.");
            }
            throw new IllegalArgumentException("RequestHandler must not be null.");
        }

        public v b() {
            Context context = this.f19133a;
            if (this.f19134b == null) {
                this.f19134b = j0.h(context);
            }
            if (this.f19136d == null) {
                this.f19136d = new o(context);
            }
            if (this.f19135c == null) {
                this.f19135c = new x();
            }
            if (this.f19138f == null) {
                this.f19138f = g.f19143a;
            }
            d0 d0Var = new d0(this.f19136d);
            Context context2 = context;
            return new v(context2, new i(context2, this.f19135c, v.f19116q, this.f19134b, this.f19136d, d0Var), this.f19136d, this.f19137e, this.f19138f, this.f19139g, d0Var, this.f19140h, this.f19141i, this.f19142j);
        }

        @Deprecated
        public b c(boolean z10) {
            return g(z10);
        }

        public b d(Bitmap.Config config) {
            if (config != null) {
                this.f19140h = config;
                return this;
            }
            throw new IllegalArgumentException("Bitmap config must not be null.");
        }

        public b e(j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            } else if (this.f19134b == null) {
                this.f19134b = jVar;
                return this;
            } else {
                throw new IllegalStateException("Downloader already set.");
            }
        }

        public b f(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            } else if (this.f19135c == null) {
                this.f19135c = executorService;
                return this;
            } else {
                throw new IllegalStateException("Executor service already set.");
            }
        }

        public b g(boolean z10) {
            this.f19141i = z10;
            return this;
        }

        public b h(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            } else if (this.f19137e == null) {
                this.f19137e = dVar;
                return this;
            } else {
                throw new IllegalStateException("Listener already set.");
            }
        }

        public b i(boolean z10) {
            this.f19142j = z10;
            return this;
        }

        public b j(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            } else if (this.f19136d == null) {
                this.f19136d = dVar;
                return this;
            } else {
                throw new IllegalStateException("Memory cache already set.");
            }
        }

        public b k(g gVar) {
            if (gVar == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            } else if (this.f19138f == null) {
                this.f19138f = gVar;
                return this;
            } else {
                throw new IllegalStateException("Transformer already set.");
            }
        }
    }

    public static class c extends Thread {
        public final ReferenceQueue<Object> O;
        public final Handler P;

        public class a implements Runnable {
            public final /* synthetic */ Exception O;

            public a(Exception exc) {
                this.O = exc;
            }

            public void run() {
                throw new RuntimeException(this.O);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.O = referenceQueue;
            this.P = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void a() {
            interrupt();
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0310a aVar = (a.C0310a) this.O.remove(1000);
                    Message obtainMessage = this.P.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f18957a;
                        this.P.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.P.post(new a(e10));
                    return;
                }
            }
        }
    }

    public interface d {
        void a(v vVar, Uri uri, Exception exc);
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(s0.a.f12612c);
        
        public final int O;

        /* access modifiers changed from: public */
        e(int i10) {
            this.O = i10;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f19143a = new a();

        public static class a implements g {
            public z a(z zVar) {
                return zVar;
            }
        }

        z a(z zVar);
    }

    public v(Context context, i iVar, d dVar, d dVar2, g gVar, List<b0> list, d0 d0Var, Bitmap.Config config, boolean z10, boolean z11) {
        this.f19122e = context;
        this.f19123f = iVar;
        this.f19124g = dVar;
        this.f19118a = dVar2;
        this.f19119b = gVar;
        this.f19129l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new c0(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new q(context));
        arrayList.add(new g(context));
        arrayList.add(new b(context));
        arrayList.add(new l(context));
        arrayList.add(new t(iVar.f19046d, d0Var));
        this.f19121d = Collections.unmodifiableList(arrayList);
        this.f19125h = d0Var;
        this.f19126i = new WeakHashMap();
        this.f19127j = new WeakHashMap();
        this.f19130m = z10;
        this.f19131n = z11;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f19128k = referenceQueue;
        c cVar = new c(referenceQueue, f19116q);
        this.f19120c = cVar;
        cVar.start();
    }

    public static void D(v vVar) {
        synchronized (v.class) {
            if (f19117r == null) {
                f19117r = vVar;
            } else {
                throw new IllegalStateException("Singleton instance already exists.");
            }
        }
    }

    public static v H(Context context) {
        if (f19117r == null) {
            synchronized (v.class) {
                if (f19117r == null) {
                    f19117r = new b(context).b();
                }
            }
        }
        return f19117r;
    }

    @Deprecated
    public void A(boolean z10) {
        B(z10);
    }

    public void B(boolean z10) {
        this.f19130m = z10;
    }

    public void C(boolean z10) {
        this.f19131n = z10;
    }

    public void E() {
        if (this == f19117r) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        } else if (!this.f19132o) {
            this.f19124g.clear();
            this.f19120c.a();
            this.f19125h.n();
            this.f19123f.z();
            for (h a10 : this.f19127j.values()) {
                a10.a();
            }
            this.f19127j.clear();
            this.f19132o = true;
        }
    }

    public void F(a aVar) {
        this.f19123f.j(aVar);
    }

    public z G(z zVar) {
        z a10 = this.f19119b.a(zVar);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Request transformer " + this.f19119b.getClass().getCanonicalName() + " returned null for " + zVar);
    }

    public boolean b() {
        return this.f19130m;
    }

    public final void c(Object obj) {
        h remove;
        j0.c();
        a remove2 = this.f19126i.remove(obj);
        if (remove2 != null) {
            remove2.a();
            this.f19123f.c(remove2);
        }
        if ((obj instanceof ImageView) && (remove = this.f19127j.remove((ImageView) obj)) != null) {
            remove.a();
        }
    }

    public void d(ImageView imageView) {
        c(imageView);
    }

    public void e(RemoteViews remoteViews, int i10) {
        c(new y.c(remoteViews, i10));
    }

    public void f(f0 f0Var) {
        c(f0Var);
    }

    public void g(Object obj) {
        j0.c();
        ArrayList arrayList = new ArrayList(this.f19126i.values());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.j().equals(obj)) {
                c(aVar.k());
            }
        }
    }

    public void h(c cVar) {
        a h10 = cVar.h();
        List<a> i10 = cVar.i();
        boolean z10 = true;
        boolean z11 = i10 != null && !i10.isEmpty();
        if (h10 == null && !z11) {
            z10 = false;
        }
        if (z10) {
            Uri uri = cVar.j().f19165d;
            Exception k10 = cVar.k();
            Bitmap q10 = cVar.q();
            e m10 = cVar.m();
            if (h10 != null) {
                j(q10, m10, h10);
            }
            if (z11) {
                int size = i10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    j(q10, m10, i10.get(i11));
                }
            }
            d dVar = this.f19118a;
            if (dVar != null && k10 != null) {
                dVar.a(this, uri, k10);
            }
        }
    }

    public void i(ImageView imageView, h hVar) {
        this.f19127j.put(imageView, hVar);
    }

    public final void j(Bitmap bitmap, e eVar, a aVar) {
        if (!aVar.l()) {
            if (!aVar.m()) {
                this.f19126i.remove(aVar.k());
            }
            if (bitmap == null) {
                aVar.c();
                if (this.f19131n) {
                    j0.v(j0.f19084m, j0.E, aVar.f18946b.e());
                }
            } else if (eVar != null) {
                aVar.b(bitmap, eVar);
                if (this.f19131n) {
                    String e10 = aVar.f18946b.e();
                    j0.w(j0.f19084m, j0.D, e10, "from " + eVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public void k(a aVar) {
        Object k10 = aVar.k();
        if (!(k10 == null || this.f19126i.get(k10) == aVar)) {
            c(k10);
            this.f19126i.put(k10, aVar);
        }
        F(aVar);
    }

    public List<b0> l() {
        return this.f19121d;
    }

    public e0 m() {
        return this.f19125h.a();
    }

    public void n(Uri uri) {
        if (uri != null) {
            this.f19124g.j(uri.toString());
            return;
        }
        throw new IllegalArgumentException("uri == null");
    }

    public void o(File file) {
        if (file != null) {
            n(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public void p(String str) {
        if (str != null) {
            n(Uri.parse(str));
            return;
        }
        throw new IllegalArgumentException("path == null");
    }

    @Deprecated
    public boolean q() {
        return b() && r();
    }

    public boolean r() {
        return this.f19131n;
    }

    public a0 s(int i10) {
        if (i10 != 0) {
            return new a0(this, (Uri) null, i10);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public a0 t(Uri uri) {
        return new a0(this, uri, 0);
    }

    public a0 u(File file) {
        return file == null ? new a0(this, (Uri) null, 0) : t(Uri.fromFile(file));
    }

    public a0 v(String str) {
        if (str == null) {
            return new a0(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return t(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void w(Object obj) {
        this.f19123f.g(obj);
    }

    public Bitmap x(String str) {
        Bitmap g10 = this.f19124g.g(str);
        d0 d0Var = this.f19125h;
        if (g10 != null) {
            d0Var.d();
        } else {
            d0Var.e();
        }
        return g10;
    }

    public void y(a aVar) {
        Bitmap x10 = r.a(aVar.f18949e) ? x(aVar.d()) : null;
        if (x10 != null) {
            e eVar = e.MEMORY;
            j(x10, eVar, aVar);
            if (this.f19131n) {
                String e10 = aVar.f18946b.e();
                j0.w(j0.f19084m, j0.D, e10, "from " + eVar);
                return;
            }
            return;
        }
        k(aVar);
        if (this.f19131n) {
            j0.v(j0.f19084m, j0.G, aVar.f18946b.e());
        }
    }

    public void z(Object obj) {
        this.f19123f.h(obj);
    }
}
