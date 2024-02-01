package b7;

import android.net.Uri;
import b6.c;
import b7.n0;
import b7.y;
import c7.f;
import java.io.IOException;
import t7.b;
import t7.g0;
import t7.l;
import t7.r0;
import t7.x;

public final class o0 extends c implements n0.c {

    /* renamed from: d0  reason: collision with root package name */
    public static final int f4631d0 = 1048576;
    public final Uri T;
    public final l.a U;
    public final j6.l V;
    public final g0 W;
    @d.o0
    public final String X;
    public final int Y;
    @d.o0
    public final Object Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f4632a0 = c.f4201b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4633b0;
    @d.o0

    /* renamed from: c0  reason: collision with root package name */
    public r0 f4634c0;

    public static final class a implements f.d {

        /* renamed from: a  reason: collision with root package name */
        public final l.a f4635a;

        /* renamed from: b  reason: collision with root package name */
        public j6.l f4636b;
        @d.o0

        /* renamed from: c  reason: collision with root package name */
        public String f4637c;
        @d.o0

        /* renamed from: d  reason: collision with root package name */
        public Object f4638d;

        /* renamed from: e  reason: collision with root package name */
        public g0 f4639e;

        /* renamed from: f  reason: collision with root package name */
        public int f4640f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4641g;

        public a(l.a aVar) {
            this(aVar, new j6.f());
        }

        public a(l.a aVar, j6.l lVar) {
            this.f4635a = aVar;
            this.f4636b = lVar;
            this.f4639e = new x();
            this.f4640f = 1048576;
        }

        public int[] a() {
            return new int[]{3};
        }

        /* renamed from: c */
        public o0 b(Uri uri) {
            this.f4641g = true;
            return new o0(uri, this.f4635a, this.f4636b, this.f4639e, this.f4637c, this.f4640f, this.f4638d);
        }

        public a d(int i10) {
            w7.a.i(!this.f4641g);
            this.f4640f = i10;
            return this;
        }

        public a e(String str) {
            w7.a.i(!this.f4641g);
            this.f4637c = str;
            return this;
        }

        @Deprecated
        public a f(j6.l lVar) {
            w7.a.i(!this.f4641g);
            this.f4636b = lVar;
            return this;
        }

        public a g(g0 g0Var) {
            w7.a.i(!this.f4641g);
            this.f4639e = g0Var;
            return this;
        }

        public a h(Object obj) {
            w7.a.i(!this.f4641g);
            this.f4638d = obj;
            return this;
        }
    }

    public o0(Uri uri, l.a aVar, j6.l lVar, g0 g0Var, @d.o0 String str, int i10, @d.o0 Object obj) {
        this.T = uri;
        this.U = aVar;
        this.V = lVar;
        this.W = g0Var;
        this.X = str;
        this.Y = i10;
        this.Z = obj;
    }

    public w c(y.a aVar, b bVar, long j10) {
        l a10 = this.U.a();
        r0 r0Var = this.f4634c0;
        if (r0Var != null) {
            a10.d(r0Var);
        }
        return new n0(this.T, a10, this.V.a(), this.W, m(aVar), this, bVar, this.X, this.Y);
    }

    public void d(long j10, boolean z10) {
        if (j10 == c.f4201b) {
            j10 = this.f4632a0;
        }
        if (this.f4632a0 != j10 || this.f4633b0 != z10) {
            r(j10, z10);
        }
    }

    @d.o0
    public Object g() {
        return this.Z;
    }

    public void h() throws IOException {
    }

    public void i(w wVar) {
        ((n0) wVar).X();
    }

    public void o(@d.o0 r0 r0Var) {
        this.f4634c0 = r0Var;
        r(this.f4632a0, this.f4633b0);
    }

    public void q() {
    }

    public final void r(long j10, boolean z10) {
        this.f4632a0 = j10;
        this.f4633b0 = z10;
        p(new v0(this.f4632a0, this.f4633b0, false, this.Z), (Object) null);
    }
}
