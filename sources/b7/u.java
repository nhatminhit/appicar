package b7;

import b6.x0;
import b7.t0;
import b7.y;
import d.o0;
import java.util.HashMap;
import java.util.Map;
import t7.r0;

public final class u extends h<Void> {
    public final y W;
    public final int X;
    public final Map<y.a, y.a> Y;
    public final Map<w, y.a> Z;

    public static final class a extends s {
        public a(x0 x0Var) {
            super(x0Var);
        }

        public int e(int i10, int i11, boolean z10) {
            int e10 = this.f4694b.e(i10, i11, z10);
            return e10 == -1 ? a(z10) : e10;
        }

        public int l(int i10, int i11, boolean z10) {
            int l10 = this.f4694b.l(i10, i11, z10);
            return l10 == -1 ? c(z10) : l10;
        }
    }

    public static final class b extends a {

        /* renamed from: e  reason: collision with root package name */
        public final x0 f4704e;

        /* renamed from: f  reason: collision with root package name */
        public final int f4705f;

        /* renamed from: g  reason: collision with root package name */
        public final int f4706g;

        /* renamed from: h  reason: collision with root package name */
        public final int f4707h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(x0 x0Var, int i10) {
            super(false, new t0.b(i10));
            boolean z10 = false;
            this.f4704e = x0Var;
            int i11 = x0Var.i();
            this.f4705f = i11;
            this.f4706g = x0Var.q();
            this.f4707h = i10;
            if (i11 > 0) {
                w7.a.j(i10 <= Integer.MAX_VALUE / i11 ? true : z10, "LoopingMediaSource contains too many periods");
            }
        }

        public int A(int i10) {
            return i10 * this.f4705f;
        }

        public int B(int i10) {
            return i10 * this.f4706g;
        }

        public x0 E(int i10) {
            return this.f4704e;
        }

        public int i() {
            return this.f4705f * this.f4707h;
        }

        public int q() {
            return this.f4706g * this.f4707h;
        }

        public int t(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        }

        public int u(int i10) {
            return i10 / this.f4705f;
        }

        public int v(int i10) {
            return i10 / this.f4706g;
        }

        public Object y(int i10) {
            return Integer.valueOf(i10);
        }
    }

    public u(y yVar) {
        this(yVar, Integer.MAX_VALUE);
    }

    public u(y yVar, int i10) {
        w7.a.a(i10 > 0);
        this.W = yVar;
        this.X = i10;
        this.Y = new HashMap();
        this.Z = new HashMap();
    }

    /* renamed from: A */
    public void w(Void voidR, y yVar, x0 x0Var, @o0 Object obj) {
        p(this.X != Integer.MAX_VALUE ? new b(x0Var, this.X) : new a(x0Var), obj);
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        if (this.X == Integer.MAX_VALUE) {
            return this.W.c(aVar, bVar, j10);
        }
        y.a a10 = aVar.a(a.w(aVar.f4733a));
        this.Y.put(a10, aVar);
        w c10 = this.W.c(a10, bVar, j10);
        this.Z.put(c10, a10);
        return c10;
    }

    @o0
    public Object g() {
        return this.W.g();
    }

    public void i(w wVar) {
        this.W.i(wVar);
        y.a remove = this.Z.remove(wVar);
        if (remove != null) {
            this.Y.remove(remove);
        }
    }

    public void o(@o0 r0 r0Var) {
        super.o(r0Var);
        x(null, this.W);
    }

    @o0
    /* renamed from: z */
    public y.a s(Void voidR, y.a aVar) {
        return this.X != Integer.MAX_VALUE ? this.Y.get(aVar) : aVar;
    }
}
