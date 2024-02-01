package qf;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d.g1;
import fh.h;
import ie.d;
import ie.i;
import ke.c;
import kotlin.Metadata;
import pf.m1;
import pf.q;
import pf.r;
import ve.e;
import xe.l0;
import xe.w;
import zd.d1;
import zd.e1;
import zd.k;
import zd.m;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u0013\u0010\u000b\u001a\u00020\nH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\u001a\u001e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0002\"\u0014\u0010\u0016\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001c\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroid/os/Handler;", "", "name", "Lqf/e;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lqf/e;", "Landroid/os/Looper;", "", "async", "d", "", "e", "(Lie/d;)Ljava/lang/Object;", "Lpf/q;", "cont", "Lzd/u2;", "l", "Landroid/view/Choreographer;", "choreographer", "j", "a", "J", "MAX_DELAY", "b", "Lqf/e;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final long f22373a = 4611686018427387903L;
    @e
    @h

    /* renamed from: b  reason: collision with root package name */
    public static final e f22374b;
    @h
    private static volatile Choreographer choreographer;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lzd/u2;", "run", "()V", "pf/k3$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a implements Runnable {
        public final /* synthetic */ q O;

        public a(q qVar) {
            this.O = qVar;
        }

        public final void run() {
            g.l(this.O);
        }
    }

    static {
        Object obj;
        e eVar = null;
        try {
            d1.a aVar = d1.P;
            obj = d1.b(new d(d(Looper.getMainLooper(), true), (String) null, 2, (w) null));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        if (!d1.i(obj)) {
            eVar = obj;
        }
        f22374b = eVar;
    }

    @fh.g
    @g1
    public static final Handler d(@fh.g Looper looper, boolean z10) {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    @h
    public static final Object e(@fh.g d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            r rVar = new r(c.d(dVar), 1);
            rVar.Z();
            j(choreographer2, rVar);
            Object z10 = rVar.z();
            if (z10 == ke.d.h()) {
                le.h.c(dVar);
            }
            return z10;
        }
        r rVar2 = new r(c.d(dVar), 1);
        rVar2.Z();
        m1.e().N1(i.O, new a(rVar2));
        Object z11 = rVar2.z();
        if (z11 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z11;
    }

    @fh.g
    @ve.i
    @ve.h(name = "from")
    public static final e f(@fh.g Handler handler) {
        return h(handler, (String) null, 1, (Object) null);
    }

    @fh.g
    @ve.i
    @ve.h(name = "from")
    public static final e g(@fh.g Handler handler, @h String str) {
        return new d(handler, str);
    }

    public static /* synthetic */ e h(Handler handler, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return g(handler, str);
    }

    @k(level = m.Q, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void i() {
    }

    public static final void j(Choreographer choreographer2, q<? super Long> qVar) {
        choreographer2.postFrameCallback(new f(qVar));
    }

    public static final void k(q qVar, long j10) {
        qVar.W(m1.e(), Long.valueOf(j10));
    }

    public static final void l(q<? super Long> qVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            l0.m(choreographer2);
            choreographer = choreographer2;
        }
        j(choreographer2, qVar);
    }
}
