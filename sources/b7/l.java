package b7;

import android.os.Handler;
import android.os.Message;
import b6.x0;
import b7.t0;
import b7.y;
import d.m0;
import d.o0;
import d.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t7.r0;
import w7.q0;

public class l extends h<g> {

    /* renamed from: l0  reason: collision with root package name */
    public static final int f4550l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f4551m0 = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f4552n0 = 2;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f4553o0 = 3;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f4554p0 = 4;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f4555q0 = 5;
    @z("this")
    public final List<g> W;
    @z("this")
    public final Set<f> X;
    @o0
    @z("this")
    public Handler Y;
    public final List<g> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Map<w, g> f4556a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Map<Object, g> f4557b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f4558c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f4559d0;

    /* renamed from: e0  reason: collision with root package name */
    public final x0.c f4560e0;

    /* renamed from: f0  reason: collision with root package name */
    public final x0.b f4561f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4562g0;

    /* renamed from: h0  reason: collision with root package name */
    public Set<f> f4563h0;

    /* renamed from: i0  reason: collision with root package name */
    public t0 f4564i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f4565j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4566k0;

    public static final class b extends a {

        /* renamed from: e  reason: collision with root package name */
        public final int f4567e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4568f;

        /* renamed from: g  reason: collision with root package name */
        public final int[] f4569g;

        /* renamed from: h  reason: collision with root package name */
        public final int[] f4570h;

        /* renamed from: i  reason: collision with root package name */
        public final x0[] f4571i;

        /* renamed from: j  reason: collision with root package name */
        public final Object[] f4572j;

        /* renamed from: k  reason: collision with root package name */
        public final HashMap<Object, Integer> f4573k = new HashMap<>();

        public b(Collection<g> collection, int i10, int i11, t0 t0Var, boolean z10) {
            super(z10, t0Var);
            this.f4567e = i10;
            this.f4568f = i11;
            int size = collection.size();
            this.f4569g = new int[size];
            this.f4570h = new int[size];
            this.f4571i = new x0[size];
            this.f4572j = new Object[size];
            int i12 = 0;
            for (g next : collection) {
                this.f4571i[i12] = next.R;
                this.f4569g[i12] = next.U;
                this.f4570h[i12] = next.T;
                Object[] objArr = this.f4572j;
                Object obj = next.P;
                objArr[i12] = obj;
                this.f4573k.put(obj, Integer.valueOf(i12));
                i12++;
            }
        }

        public int A(int i10) {
            return this.f4569g[i10];
        }

        public int B(int i10) {
            return this.f4570h[i10];
        }

        public x0 E(int i10) {
            return this.f4571i[i10];
        }

        public int i() {
            return this.f4568f;
        }

        public int q() {
            return this.f4567e;
        }

        public int t(Object obj) {
            Integer num = this.f4573k.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public int u(int i10) {
            return q0.j(this.f4569g, i10 + 1, false, false);
        }

        public int v(int i10) {
            return q0.j(this.f4570h, i10 + 1, false, false);
        }

        public Object y(int i10) {
            return this.f4572j[i10];
        }
    }

    public static final class c extends s {

        /* renamed from: d  reason: collision with root package name */
        public static final Object f4574d = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final Object f4575c;

        public c(x0 x0Var, Object obj) {
            super(x0Var);
            this.f4575c = obj;
        }

        public static c w(@o0 Object obj) {
            return new c(new e(obj), f4574d);
        }

        public static c x(x0 x0Var, Object obj) {
            return new c(x0Var, obj);
        }

        public int b(Object obj) {
            x0 x0Var = this.f4694b;
            if (f4574d.equals(obj)) {
                obj = this.f4575c;
            }
            return x0Var.b(obj);
        }

        public x0.b g(int i10, x0.b bVar, boolean z10) {
            this.f4694b.g(i10, bVar, z10);
            if (q0.e(bVar.f4493b, this.f4575c)) {
                bVar.f4493b = f4574d;
            }
            return bVar;
        }

        public Object m(int i10) {
            Object m10 = this.f4694b.m(i10);
            return q0.e(m10, this.f4575c) ? f4574d : m10;
        }

        public c v(x0 x0Var) {
            return new c(x0Var, this.f4575c);
        }

        public x0 y() {
            return this.f4694b;
        }
    }

    public static final class d extends c {
        public d() {
        }

        public w c(y.a aVar, t7.b bVar, long j10) {
            throw new UnsupportedOperationException();
        }

        @o0
        public Object g() {
            return null;
        }

        public void h() throws IOException {
        }

        public void i(w wVar) {
        }

        public void o(@o0 r0 r0Var) {
        }

        public void q() {
        }
    }

    public static final class e extends x0 {
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final Object f4576b;

        public e(@o0 Object obj) {
            this.f4576b = obj;
        }

        public int b(Object obj) {
            return obj == c.f4574d ? 0 : -1;
        }

        public x0.b g(int i10, x0.b bVar, boolean z10) {
            return bVar.p(0, c.f4574d, 0, b6.c.f4201b, 0);
        }

        public int i() {
            return 1;
        }

        public Object m(int i10) {
            return c.f4574d;
        }

        public x0.c p(int i10, x0.c cVar, boolean z10, long j10) {
            return cVar.g(this.f4576b, b6.c.f4201b, b6.c.f4201b, false, true, 0, b6.c.f4201b, 0, 0, 0);
        }

        public int q() {
            return 1;
        }
    }

    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f4577a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f4578b;

        public f(Handler handler, Runnable runnable) {
            this.f4577a = handler;
            this.f4578b = runnable;
        }

        public void a() {
            this.f4577a.post(this.f4578b);
        }
    }

    public static final class g implements Comparable<g> {
        public final y O;
        public final Object P = new Object();
        public final List<o> Q = new ArrayList();
        public c R;
        public int S;
        public int T;
        public int U;
        public boolean V;
        public boolean W;
        public boolean X;

        public g(y yVar) {
            this.O = yVar;
            this.R = c.w(yVar.g());
        }

        /* renamed from: a */
        public int compareTo(@m0 g gVar) {
            return this.U - gVar.U;
        }

        public void b(int i10, int i11, int i12) {
            this.S = i10;
            this.T = i11;
            this.U = i12;
            this.V = false;
            this.W = false;
            this.X = false;
            this.Q.clear();
        }
    }

    public static final class h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f4579a;

        /* renamed from: b  reason: collision with root package name */
        public final T f4580b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final f f4581c;

        public h(int i10, T t10, @o0 f fVar) {
            this.f4579a = i10;
            this.f4580b = t10;
            this.f4581c = fVar;
        }
    }

    public l(boolean z10, t0 t0Var, y... yVarArr) {
        this(z10, false, t0Var, yVarArr);
    }

    public l(boolean z10, boolean z11, t0 t0Var, y... yVarArr) {
        for (y g10 : yVarArr) {
            w7.a.g(g10);
        }
        this.f4564i0 = t0Var.getLength() > 0 ? t0Var.g() : t0Var;
        this.f4556a0 = new IdentityHashMap();
        this.f4557b0 = new HashMap();
        this.W = new ArrayList();
        this.Z = new ArrayList();
        this.f4563h0 = new HashSet();
        this.X = new HashSet();
        this.f4558c0 = z10;
        this.f4559d0 = z11;
        this.f4560e0 = new x0.c();
        this.f4561f0 = new x0.b();
        H(Arrays.asList(yVarArr));
    }

    public l(boolean z10, y... yVarArr) {
        this(z10, new t0.a(0), yVarArr);
    }

    public l(y... yVarArr) {
        this(false, yVarArr);
    }

    public static Object Q(g gVar, Object obj) {
        Object w10 = a.w(obj);
        return w10.equals(c.f4574d) ? gVar.R.f4575c : w10;
    }

    public static Object T(Object obj) {
        return a.x(obj);
    }

    public static Object U(g gVar, Object obj) {
        if (gVar.R.f4575c.equals(obj)) {
            obj = c.f4574d;
        }
        return a.z(gVar.P, obj);
    }

    public final synchronized void A(int i10, y yVar) {
        K(i10, Collections.singletonList(yVar), (Handler) null, (Runnable) null);
    }

    public final synchronized void B(int i10, y yVar, Handler handler, Runnable runnable) {
        K(i10, Collections.singletonList(yVar), handler, runnable);
    }

    public final synchronized void C(y yVar) {
        A(this.W.size(), yVar);
    }

    public final synchronized void D(y yVar, Handler handler, Runnable runnable) {
        B(this.W.size(), yVar, handler, runnable);
    }

    public final void E(int i10, g gVar) {
        if (i10 > 0) {
            g gVar2 = this.Z.get(i10 - 1);
            gVar.b(i10, gVar2.T + gVar2.R.q(), gVar2.U + gVar2.R.i());
        } else {
            gVar.b(i10, 0, 0);
        }
        N(i10, 1, gVar.R.q(), gVar.R.i());
        this.Z.add(i10, gVar);
        this.f4557b0.put(gVar.P, gVar);
        if (!this.f4559d0) {
            gVar.V = true;
            x(gVar, gVar.O);
        }
    }

    public final synchronized void F(int i10, Collection<y> collection) {
        K(i10, collection, (Handler) null, (Runnable) null);
    }

    public final synchronized void G(int i10, Collection<y> collection, Handler handler, Runnable runnable) {
        K(i10, collection, handler, runnable);
    }

    public final synchronized void H(Collection<y> collection) {
        K(this.W.size(), collection, (Handler) null, (Runnable) null);
    }

    public final synchronized void I(Collection<y> collection, Handler handler, Runnable runnable) {
        K(this.W.size(), collection, handler, runnable);
    }

    public final void J(int i10, Collection<g> collection) {
        for (g E : collection) {
            E(i10, E);
            i10++;
        }
    }

    @z("this")
    public final void K(int i10, Collection<y> collection, @o0 Handler handler, @o0 Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        w7.a.a(z10);
        Handler handler2 = this.Y;
        for (y g10 : collection) {
            w7.a.g(g10);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (y gVar : collection) {
            arrayList.add(new g(gVar));
        }
        this.W.addAll(i10, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new h(i10, arrayList, O(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public final synchronized void L() {
        i0(0, W());
    }

    public final synchronized void M(Handler handler, Runnable runnable) {
        j0(0, W(), handler, runnable);
    }

    public final void N(int i10, int i11, int i12, int i13) {
        this.f4565j0 += i12;
        this.f4566k0 += i13;
        while (i10 < this.Z.size()) {
            this.Z.get(i10).S += i11;
            this.Z.get(i10).T += i12;
            this.Z.get(i10).U += i13;
            i10++;
        }
    }

    @o0
    @z("this")
    public final f O(@o0 Handler handler, @o0 Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        f fVar = new f(handler, runnable);
        this.X.add(fVar);
        return fVar;
    }

    public final synchronized void P(Set<f> set) {
        for (f a10 : set) {
            a10.a();
        }
        this.X.removeAll(set);
    }

    @o0
    /* renamed from: R */
    public y.a s(g gVar, y.a aVar) {
        for (int i10 = 0; i10 < gVar.Q.size(); i10++) {
            if (gVar.Q.get(i10).P.f4736d == aVar.f4736d) {
                return aVar.a(U(gVar, aVar.f4733a));
            }
        }
        return null;
    }

    public final synchronized y S(int i10) {
        return this.W.get(i10).O;
    }

    public final Handler V() {
        return (Handler) w7.a.g(this.Y);
    }

    public final synchronized int W() {
        return this.W.size();
    }

    /* renamed from: X */
    public int u(g gVar, int i10) {
        return i10 + gVar.T;
    }

    public final boolean Y(Message message) {
        h hVar;
        int i10 = message.what;
        if (i10 == 0) {
            hVar = (h) q0.l(message.obj);
            this.f4564i0 = this.f4564i0.e(hVar.f4579a, ((Collection) hVar.f4580b).size());
            J(hVar.f4579a, (Collection) hVar.f4580b);
        } else if (i10 == 1) {
            hVar = (h) q0.l(message.obj);
            int i11 = hVar.f4579a;
            int intValue = ((Integer) hVar.f4580b).intValue();
            this.f4564i0 = (i11 == 0 && intValue == this.f4564i0.getLength()) ? this.f4564i0.g() : this.f4564i0.a(i11, intValue);
            for (int i12 = intValue - 1; i12 >= i11; i12--) {
                h0(i12);
            }
        } else if (i10 == 2) {
            hVar = (h) q0.l(message.obj);
            t0 t0Var = this.f4564i0;
            int i13 = hVar.f4579a;
            t0 a10 = t0Var.a(i13, i13 + 1);
            this.f4564i0 = a10;
            this.f4564i0 = a10.e(((Integer) hVar.f4580b).intValue(), 1);
            c0(hVar.f4579a, ((Integer) hVar.f4580b).intValue());
        } else if (i10 != 3) {
            if (i10 == 4) {
                r0();
            } else if (i10 == 5) {
                P((Set) q0.l(message.obj));
            } else {
                throw new IllegalStateException();
            }
            return true;
        } else {
            hVar = (h) q0.l(message.obj);
            this.f4564i0 = (t0) hVar.f4580b;
        }
        m0(hVar.f4581c);
        return true;
    }

    public final void Z(g gVar) {
        if (gVar.X && gVar.V && gVar.Q.isEmpty()) {
            y(gVar);
        }
    }

    public final synchronized void a0(int i10, int i11) {
        d0(i10, i11, (Handler) null, (Runnable) null);
    }

    public final synchronized void b0(int i10, int i11, Handler handler, Runnable runnable) {
        d0(i10, i11, handler, runnable);
    }

    public final w c(y.a aVar, t7.b bVar, long j10) {
        g gVar = this.f4557b0.get(T(aVar.f4733a));
        if (gVar == null) {
            gVar = new g(new d());
            gVar.V = true;
        }
        o oVar = new o(gVar.O, aVar, bVar, j10);
        this.f4556a0.put(oVar, gVar);
        gVar.Q.add(oVar);
        if (!gVar.V) {
            gVar.V = true;
            x(gVar, gVar.O);
        } else if (gVar.W) {
            oVar.g(aVar.a(Q(gVar, aVar.f4733a)));
        }
        return oVar;
    }

    public final void c0(int i10, int i11) {
        int min = Math.min(i10, i11);
        int max = Math.max(i10, i11);
        int i12 = this.Z.get(min).T;
        int i13 = this.Z.get(min).U;
        List<g> list = this.Z;
        list.add(i11, list.remove(i10));
        while (min <= max) {
            g gVar = this.Z.get(min);
            gVar.T = i12;
            gVar.U = i13;
            i12 += gVar.R.q();
            i13 += gVar.R.i();
            min++;
        }
    }

    @z("this")
    public final void d0(int i10, int i11, @o0 Handler handler, @o0 Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        w7.a.a(z10);
        Handler handler2 = this.Y;
        List<g> list = this.W;
        list.add(i11, list.remove(i10));
        if (handler2 != null) {
            handler2.obtainMessage(2, new h(i10, Integer.valueOf(i11), O(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: e0 */
    public final void w(g gVar, y yVar, x0 x0Var, @o0 Object obj) {
        q0(gVar, x0Var);
    }

    public final synchronized void f0(int i10) {
        k0(i10, i10 + 1, (Handler) null, (Runnable) null);
    }

    @o0
    public Object g() {
        return null;
    }

    public final synchronized void g0(int i10, Handler handler, Runnable runnable) {
        k0(i10, i10 + 1, handler, runnable);
    }

    public void h() throws IOException {
    }

    public final void h0(int i10) {
        g remove = this.Z.remove(i10);
        this.f4557b0.remove(remove.P);
        c cVar = remove.R;
        N(i10, -1, -cVar.q(), -cVar.i());
        remove.X = true;
        Z(remove);
    }

    public final void i(w wVar) {
        g gVar = (g) w7.a.g(this.f4556a0.remove(wVar));
        ((o) wVar).w();
        gVar.Q.remove(wVar);
        Z(gVar);
    }

    public final synchronized void i0(int i10, int i11) {
        k0(i10, i11, (Handler) null, (Runnable) null);
    }

    public final synchronized void j0(int i10, int i11, Handler handler, Runnable runnable) {
        k0(i10, i11, handler, runnable);
    }

    @z("this")
    public final void k0(int i10, int i11, @o0 Handler handler, @o0 Runnable runnable) {
        boolean z10 = false;
        if ((handler == null) == (runnable == null)) {
            z10 = true;
        }
        w7.a.a(z10);
        Handler handler2 = this.Y;
        q0.J0(this.W, i10, i11);
        if (handler2 != null) {
            handler2.obtainMessage(1, new h(i10, Integer.valueOf(i11), O(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public final void l0() {
        m0((f) null);
    }

    public final void m0(@o0 f fVar) {
        if (!this.f4562g0) {
            V().obtainMessage(4).sendToTarget();
            this.f4562g0 = true;
        }
        if (fVar != null) {
            this.f4563h0.add(fVar);
        }
    }

    @z("this")
    public final void n0(t0 t0Var, @o0 Handler handler, @o0 Runnable runnable) {
        boolean z10 = true;
        if ((handler == null) != (runnable == null)) {
            z10 = false;
        }
        w7.a.a(z10);
        Handler handler2 = this.Y;
        if (handler2 != null) {
            int W2 = W();
            if (t0Var.getLength() != W2) {
                t0Var = t0Var.g().e(0, W2);
            }
            handler2.obtainMessage(3, new h(0, t0Var, O(handler, runnable))).sendToTarget();
            return;
        }
        if (t0Var.getLength() > 0) {
            t0Var = t0Var.g();
        }
        this.f4564i0 = t0Var;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    public final synchronized void o(@o0 r0 r0Var) {
        super.o(r0Var);
        this.Y = new Handler(new k(this));
        if (this.W.isEmpty()) {
            r0();
        } else {
            this.f4564i0 = this.f4564i0.e(0, this.W.size());
            J(0, this.W);
            l0();
        }
    }

    public final synchronized void o0(t0 t0Var) {
        n0(t0Var, (Handler) null, (Runnable) null);
    }

    public final synchronized void p0(t0 t0Var, Handler handler, Runnable runnable) {
        n0(t0Var, handler, runnable);
    }

    public final synchronized void q() {
        super.q();
        this.Z.clear();
        this.f4557b0.clear();
        this.f4564i0 = this.f4564i0.g();
        this.f4565j0 = 0;
        this.f4566k0 = 0;
        Handler handler = this.Y;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.Y = null;
        }
        this.f4562g0 = false;
        this.f4563h0.clear();
        P(this.X);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q0(b7.l.g r14, b6.x0 r15) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x00b2
            b7.l$c r0 = r14.R
            b6.x0 r1 = r0.y()
            if (r1 != r15) goto L_0x000b
            return
        L_0x000b:
            int r1 = r15.q()
            int r2 = r0.q()
            int r1 = r1 - r2
            int r2 = r15.i()
            int r3 = r0.i()
            int r2 = r2 - r3
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0023
            if (r2 == 0) goto L_0x0029
        L_0x0023:
            int r5 = r14.S
            int r5 = r5 + r4
            r13.N(r5, r3, r1, r2)
        L_0x0029:
            boolean r1 = r14.W
            if (r1 == 0) goto L_0x0035
            b7.l$c r15 = r0.v(r15)
        L_0x0031:
            r14.R = r15
            goto L_0x00ac
        L_0x0035:
            boolean r0 = r15.r()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = b7.l.c.f4574d
            b7.l$c r15 = b7.l.c.x(r15, r0)
            goto L_0x0031
        L_0x0044:
            java.util.List<b7.o> r0 = r14.Q
            int r0 = r0.size()
            if (r0 > r4) goto L_0x004e
            r0 = r4
            goto L_0x004f
        L_0x004e:
            r0 = r3
        L_0x004f:
            w7.a.i(r0)
            java.util.List<b7.o> r0 = r14.Q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x005c
            r0 = 0
            goto L_0x0064
        L_0x005c:
            java.util.List<b7.o> r0 = r14.Q
            java.lang.Object r0 = r0.get(r3)
            b7.o r0 = (b7.o) r0
        L_0x0064:
            b6.x0$c r1 = r13.f4560e0
            r15.n(r3, r1)
            b6.x0$c r1 = r13.f4560e0
            long r1 = r1.b()
            if (r0 == 0) goto L_0x007d
            long r5 = r0.j()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x007d
            r11 = r5
            goto L_0x007e
        L_0x007d:
            r11 = r1
        L_0x007e:
            b6.x0$c r8 = r13.f4560e0
            b6.x0$b r9 = r13.f4561f0
            r10 = 0
            r7 = r15
            android.util.Pair r1 = r7.j(r8, r9, r10, r11)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            b7.l$c r15 = b7.l.c.x(r15, r2)
            r14.R = r15
            if (r0 == 0) goto L_0x00ac
            r0.v(r5)
            b7.y$a r15 = r0.P
            java.lang.Object r1 = r15.f4733a
            java.lang.Object r1 = Q(r14, r1)
            b7.y$a r15 = r15.a(r1)
            r0.g(r15)
        L_0x00ac:
            r14.W = r4
            r13.l0()
            return
        L_0x00b2:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.l.q0(b7.l$g, b6.x0):void");
    }

    public final void r0() {
        this.f4562g0 = false;
        Set<f> set = this.f4563h0;
        this.f4563h0 = new HashSet();
        p(new b(this.Z, this.f4565j0, this.f4566k0, this.f4564i0, this.f4558c0), (Object) null);
        V().obtainMessage(5, set).sendToTarget();
    }
}
