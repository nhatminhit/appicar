package b6;

import android.content.Context;
import android.os.Looper;
import c6.a;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import d.o0;
import h6.l;
import q7.n;
import t7.d;
import t7.r;
import w7.c;
import w7.q0;

public final class k {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public static d f4386a;

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (k.class) {
            if (f4386a == null) {
                f4386a = new r.b(context).a();
            }
            dVar = f4386a;
        }
        return dVar;
    }

    public static j b(Context context, r0[] r0VarArr, n nVar) {
        return c(context, r0VarArr, nVar, new f());
    }

    public static j c(Context context, r0[] r0VarArr, n nVar, e0 e0Var) {
        return d(context, r0VarArr, nVar, e0Var, q0.U());
    }

    public static j d(Context context, r0[] r0VarArr, n nVar, e0 e0Var, Looper looper) {
        return e(context, r0VarArr, nVar, e0Var, a(context), looper);
    }

    public static j e(Context context, r0[] r0VarArr, n nVar, e0 e0Var, d dVar, Looper looper) {
        return new s(r0VarArr, nVar, e0Var, dVar, c.f14695a, looper);
    }

    public static w0 f(Context context) {
        return p(context, new DefaultTrackSelector());
    }

    public static w0 g(Context context, u0 u0Var, n nVar) {
        return h(context, u0Var, nVar, new f());
    }

    public static w0 h(Context context, u0 u0Var, n nVar, e0 e0Var) {
        return j(context, u0Var, nVar, e0Var, (l<h6.n>) null, q0.U());
    }

    public static w0 i(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar) {
        return j(context, u0Var, nVar, e0Var, lVar, q0.U());
    }

    public static w0 j(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, Looper looper) {
        return l(context, u0Var, nVar, e0Var, lVar, new a.C0077a(), looper);
    }

    public static w0 k(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, a.C0077a aVar) {
        return l(context, u0Var, nVar, e0Var, lVar, aVar, q0.U());
    }

    public static w0 l(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, a.C0077a aVar, Looper looper) {
        return n(context, u0Var, nVar, e0Var, lVar, a(context), aVar, looper);
    }

    public static w0 m(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, d dVar) {
        return n(context, u0Var, nVar, e0Var, lVar, dVar, new a.C0077a(), q0.U());
    }

    public static w0 n(Context context, u0 u0Var, n nVar, e0 e0Var, @o0 l<h6.n> lVar, d dVar, a.C0077a aVar, Looper looper) {
        return new w0(context, u0Var, nVar, e0Var, lVar, dVar, aVar, looper);
    }

    public static w0 o(Context context, u0 u0Var, n nVar, @o0 l<h6.n> lVar) {
        return i(context, u0Var, nVar, new f(), lVar);
    }

    public static w0 p(Context context, n nVar) {
        return g(context, new h(context), nVar);
    }

    public static w0 q(Context context, n nVar, e0 e0Var) {
        return h(context, new h(context), nVar, e0Var);
    }

    public static w0 r(Context context, n nVar, e0 e0Var, @o0 l<h6.n> lVar) {
        return i(context, new h(context), nVar, e0Var, lVar);
    }

    @Deprecated
    public static w0 s(Context context, n nVar, e0 e0Var, @o0 l<h6.n> lVar, int i10) {
        return i(context, new h(context).k(i10), nVar, e0Var, lVar);
    }

    @Deprecated
    public static w0 t(Context context, n nVar, e0 e0Var, @o0 l<h6.n> lVar, int i10, long j10) {
        return i(context, new h(context).k(i10).i(j10), nVar, e0Var, lVar);
    }
}
