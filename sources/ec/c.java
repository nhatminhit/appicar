package ec;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d.t0;
import fh.g;
import fh.h;
import java.util.ArrayList;
import java.util.List;
import xe.l0;
import xe.n0;
import xe.r1;
import zd.d1;
import zd.e1;
import zd.u2;

@r1({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class c {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Context f18587a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f18588b = new ArrayList();
    @h

    /* renamed from: c  reason: collision with root package name */
    public a f18589c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f18590d;

    public interface a {
        void a();

        void b();
    }

    @r1({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n*L\n62#1:123,2\n69#1:125,2\n*E\n"})
    public static final class b extends ConnectivityManager.NetworkCallback {
        @g

        /* renamed from: a  reason: collision with root package name */
        public final Handler f18591a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f18592b;

        public b(c cVar) {
            this.f18592b = cVar;
        }

        public static final void c(c cVar) {
            l0.p(cVar, "this$0");
            for (a a10 : cVar.d()) {
                a10.a();
            }
        }

        public static final void d(c cVar) {
            l0.p(cVar, "this$0");
            for (a b10 : cVar.d()) {
                b10.b();
            }
        }

        public void onAvailable(@g Network network) {
            l0.p(network, "network");
            this.f18591a.post(new d(this.f18592b));
        }

        public void onLost(@g Network network) {
            l0.p(network, "network");
            this.f18591a.post(new e(this.f18592b));
        }
    }

    @r1({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$1\n*L\n81#1:123,2\n*E\n"})
    /* renamed from: ec.c$c  reason: collision with other inner class name */
    public static final class C0297c extends n0 implements we.a<u2> {
        public final /* synthetic */ c P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0297c(c cVar) {
            super(0);
            this.P = cVar;
        }

        public final void c() {
            for (a a10 : this.P.d()) {
                a10.a();
            }
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    @r1({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$2\n*L\n82#1:123,2\n*E\n"})
    public static final class d extends n0 implements we.a<u2> {
        public final /* synthetic */ c P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.P = cVar;
        }

        public final void c() {
            for (a b10 : this.P.d()) {
                b10.b();
            }
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    public c(@g Context context) {
        l0.p(context, "context");
        this.f18587a = context;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback networkCallback = this.f18590d;
            if (networkCallback != null) {
                Object systemService = this.f18587a.getSystemService("connectivity");
                l0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ((ConnectivityManager) systemService).unregisterNetworkCallback(networkCallback);
            } else {
                return;
            }
        } else {
            a aVar = this.f18589c;
            if (aVar != null) {
                try {
                    d1.a aVar2 = d1.P;
                    this.f18587a.unregisterReceiver(aVar);
                    d1.b(u2.f25116a);
                } catch (Throwable th2) {
                    d1.a aVar3 = d1.P;
                    d1.b(e1.a(th2));
                }
            } else {
                return;
            }
        }
        this.f18588b.clear();
        this.f18590d = null;
        this.f18589c = null;
    }

    @t0(24)
    public final void b(Context context) {
        b bVar = new b(this);
        this.f18590d = bVar;
        Object systemService = context.getSystemService("connectivity");
        l0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerDefaultNetworkCallback(bVar);
    }

    public final void c(Context context) {
        a aVar = new a(new C0297c(this), new d(this));
        this.f18589c = aVar;
        context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @g
    public final List<a> d() {
        return this.f18588b;
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 24) {
            b(this.f18587a);
        } else {
            c(this.f18587a);
        }
    }
}
