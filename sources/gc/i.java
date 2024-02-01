package gc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import gc.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import m4.f;

public class i {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 10;
    public static final int D = 11;
    public static final int E = 12;
    public static final int F = 13;
    public static final String G = "Dispatcher";
    public static final int H = 200;

    /* renamed from: q  reason: collision with root package name */
    public static final int f19033q = 500;

    /* renamed from: r  reason: collision with root package name */
    public static final int f19034r = 1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f19035s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f19036t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f19037u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f19038v = 3;

    /* renamed from: w  reason: collision with root package name */
    public static final int f19039w = 4;

    /* renamed from: x  reason: collision with root package name */
    public static final int f19040x = 5;

    /* renamed from: y  reason: collision with root package name */
    public static final int f19041y = 6;

    /* renamed from: z  reason: collision with root package name */
    public static final int f19042z = 7;

    /* renamed from: a  reason: collision with root package name */
    public final c f19043a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f19044b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f19045c;

    /* renamed from: d  reason: collision with root package name */
    public final j f19046d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, c> f19047e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map<Object, a> f19048f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<Object, a> f19049g = new WeakHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Set<Object> f19050h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    public final Handler f19051i;

    /* renamed from: j  reason: collision with root package name */
    public final Handler f19052j;

    /* renamed from: k  reason: collision with root package name */
    public final d f19053k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f19054l;

    /* renamed from: m  reason: collision with root package name */
    public final List<c> f19055m;

    /* renamed from: n  reason: collision with root package name */
    public final d f19056n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f19057o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f19058p;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i.this.f19056n.b();
        }
    }

    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final i f19059a;

        public class a implements Runnable {
            public final /* synthetic */ Message O;

            public a(Message message) {
                this.O = message;
            }

            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.O.what);
            }
        }

        public b(Looper looper, i iVar) {
            super(looper);
            this.f19059a = iVar;
        }

        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 1:
                    this.f19059a.x((a) message.obj);
                    return;
                case 2:
                    this.f19059a.q((a) message.obj);
                    return;
                case 4:
                    this.f19059a.r((c) message.obj);
                    return;
                case 5:
                    this.f19059a.w((c) message.obj);
                    return;
                case 6:
                    this.f19059a.s((c) message.obj, false);
                    return;
                case 7:
                    this.f19059a.p();
                    return;
                case 9:
                    this.f19059a.t((NetworkInfo) message.obj);
                    return;
                case 10:
                    i iVar = this.f19059a;
                    if (message.arg1 == 1) {
                        z10 = true;
                    }
                    iVar.o(z10);
                    return;
                case 11:
                    this.f19059a.u(message.obj);
                    return;
                case 12:
                    this.f19059a.v(message.obj);
                    return;
                default:
                    v.f19116q.post(new a(message));
                    return;
            }
        }
    }

    public static class c extends HandlerThread {
        public c() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final String f19060b = "state";

        /* renamed from: a  reason: collision with root package name */
        public final i f19061a;

        public d(i iVar) {
            this.f19061a = iVar;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f19061a.f19057o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f19061a.f19044b.registerReceiver(this, intentFilter);
        }

        public void b() {
            this.f19061a.f19044b.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        this.f19061a.b(intent.getBooleanExtra("state", false));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    this.f19061a.f(((ConnectivityManager) j0.q(context, "connectivity")).getActiveNetworkInfo());
                }
            }
        }
    }

    public i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, d0 d0Var) {
        c cVar = new c();
        this.f19043a = cVar;
        cVar.start();
        j0.k(cVar.getLooper());
        this.f19044b = context;
        this.f19045c = executorService;
        this.f19051i = new b(cVar.getLooper(), this);
        this.f19046d = jVar;
        this.f19052j = handler;
        this.f19053k = dVar;
        this.f19054l = d0Var;
        this.f19055m = new ArrayList(4);
        this.f19058p = j0.s(context);
        this.f19057o = j0.r(context, f.f10350b);
        d dVar2 = new d(this);
        this.f19056n = dVar2;
        dVar2.a();
    }

    public final void a(c cVar) {
        if (!cVar.s()) {
            this.f19055m.add(cVar);
            if (!this.f19051i.hasMessages(7)) {
                this.f19051i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    public void b(boolean z10) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    public void c(a aVar) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    public void d(c cVar) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void e(c cVar) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(Object obj) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(11, obj));
    }

    public void h(Object obj) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(12, obj));
    }

    public void i(c cVar) {
        Handler handler = this.f19051i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500);
    }

    public void j(a aVar) {
        Handler handler = this.f19051i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public final void k() {
        if (!this.f19048f.isEmpty()) {
            Iterator<a> it = this.f19048f.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.g().f19131n) {
                    j0.v("Dispatcher", j0.C, next.i().e());
                }
                y(next, false);
            }
        }
    }

    public final void l(List<c> list) {
        if (list != null && !list.isEmpty() && list.get(0).o().f19131n) {
            StringBuilder sb2 = new StringBuilder();
            for (c next : list) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(j0.m(next));
            }
            j0.v("Dispatcher", j0.B, sb2.toString());
        }
    }

    public final void m(a aVar) {
        Object k10 = aVar.k();
        if (k10 != null) {
            aVar.f18955k = true;
            this.f19048f.put(k10, aVar);
        }
    }

    public final void n(c cVar) {
        a h10 = cVar.h();
        if (h10 != null) {
            m(h10);
        }
        List<a> i10 = cVar.i();
        if (i10 != null) {
            int size = i10.size();
            for (int i11 = 0; i11 < size; i11++) {
                m(i10.get(i11));
            }
        }
    }

    public void o(boolean z10) {
        this.f19058p = z10;
    }

    public void p() {
        ArrayList arrayList = new ArrayList(this.f19055m);
        this.f19055m.clear();
        Handler handler = this.f19052j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        l(arrayList);
    }

    public void q(a aVar) {
        String d10 = aVar.d();
        c cVar = this.f19047e.get(d10);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f19047e.remove(d10);
                if (aVar.g().f19131n) {
                    j0.v("Dispatcher", j0.f19091t, aVar.i().e());
                }
            }
        }
        if (this.f19050h.contains(aVar.j())) {
            this.f19049g.remove(aVar.k());
            if (aVar.g().f19131n) {
                j0.w("Dispatcher", j0.f19091t, aVar.i().e(), "because paused request got canceled");
            }
        }
        a remove = this.f19048f.remove(aVar.k());
        if (remove != null && remove.g().f19131n) {
            j0.w("Dispatcher", j0.f19091t, remove.i().e(), "from replaying");
        }
    }

    public void r(c cVar) {
        if (r.b(cVar.n())) {
            this.f19053k.i(cVar.l(), cVar.q());
        }
        this.f19047e.remove(cVar.l());
        a(cVar);
        if (cVar.o().f19131n) {
            j0.w("Dispatcher", j0.f19092u, j0.m(cVar), "for completion");
        }
    }

    public void s(c cVar, boolean z10) {
        if (cVar.o().f19131n) {
            String m10 = j0.m(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            sb2.append(z10 ? " (will replay)" : "");
            j0.w("Dispatcher", j0.f19092u, m10, sb2.toString());
        }
        this.f19047e.remove(cVar.l());
        a(cVar);
    }

    public void t(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f19045c;
        if (executorService instanceof x) {
            ((x) executorService).a(networkInfo);
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            k();
        }
    }

    public void u(Object obj) {
        if (this.f19050h.add(obj)) {
            Iterator<c> it = this.f19047e.values().iterator();
            while (it.hasNext()) {
                c next = it.next();
                boolean z10 = next.o().f19131n;
                a h10 = next.h();
                List<a> i10 = next.i();
                boolean z11 = i10 != null && !i10.isEmpty();
                if (h10 != null || z11) {
                    if (h10 != null && h10.j().equals(obj)) {
                        next.f(h10);
                        this.f19049g.put(h10.k(), h10);
                        if (z10) {
                            j0.w("Dispatcher", j0.F, h10.f18946b.e(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z11) {
                        for (int size = i10.size() - 1; size >= 0; size--) {
                            a aVar = i10.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f19049g.put(aVar.k(), aVar);
                                if (z10) {
                                    j0.w("Dispatcher", j0.F, aVar.f18946b.e(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z10) {
                            j0.w("Dispatcher", j0.f19091t, j0.m(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void v(Object obj) {
        if (this.f19050h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<a> it = this.f19049g.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f19052j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void w(c cVar) {
        if (!cVar.s()) {
            boolean z10 = false;
            if (this.f19045c.isShutdown()) {
                s(cVar, false);
                return;
            }
            NetworkInfo networkInfo = null;
            if (this.f19057o) {
                networkInfo = ((ConnectivityManager) j0.q(this.f19044b, "connectivity")).getActiveNetworkInfo();
            }
            boolean z11 = networkInfo != null && networkInfo.isConnected();
            boolean u10 = cVar.u(this.f19058p, networkInfo);
            boolean v10 = cVar.v();
            if (!u10) {
                if (this.f19057o && v10) {
                    z10 = true;
                }
                s(cVar, z10);
                if (z10) {
                    n(cVar);
                }
            } else if (!this.f19057o || z11) {
                if (cVar.o().f19131n) {
                    j0.v("Dispatcher", j0.f19093v, j0.m(cVar));
                }
                if (cVar.k() instanceof t.a) {
                    cVar.W |= s.NO_CACHE.O;
                }
                cVar.f18983b0 = this.f19045c.submit(cVar);
            } else {
                s(cVar, v10);
                if (v10) {
                    n(cVar);
                }
            }
        }
    }

    public void x(a aVar) {
        y(aVar, true);
    }

    public void y(a aVar, boolean z10) {
        if (this.f19050h.contains(aVar.j())) {
            this.f19049g.put(aVar.k(), aVar);
            if (aVar.g().f19131n) {
                String e10 = aVar.f18946b.e();
                j0.w("Dispatcher", j0.F, e10, "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        c cVar = this.f19047e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
        } else if (!this.f19045c.isShutdown()) {
            c g10 = c.g(aVar.g(), this, this.f19053k, this.f19054l, aVar);
            g10.f18983b0 = this.f19045c.submit(g10);
            this.f19047e.put(aVar.d(), g10);
            if (z10) {
                this.f19048f.remove(aVar.k());
            }
            if (aVar.g().f19131n) {
                j0.v("Dispatcher", j0.f19090s, aVar.f18946b.e());
            }
        } else if (aVar.g().f19131n) {
            j0.w("Dispatcher", j0.f19089r, aVar.f18946b.e(), "because shut down");
        }
    }

    public void z() {
        ExecutorService executorService = this.f19045c;
        if (executorService instanceof x) {
            executorService.shutdown();
        }
        this.f19046d.shutdown();
        this.f19043a.quit();
        v.f19116q.post(new a());
    }
}
