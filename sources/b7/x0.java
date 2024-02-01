package b7;

import android.net.Uri;
import android.os.Handler;
import b7.i0;
import b7.y;
import com.google.android.exoplayer2.Format;
import d.o0;
import java.io.IOException;
import t7.g0;
import t7.l;
import t7.o;
import t7.r0;
import t7.x;

public final class x0 extends c {
    public final o T;
    public final l.a U;
    public final Format V;
    public final long W;
    public final g0 X;
    public final boolean Y;
    public final b6.x0 Z;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public final Object f4726a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public r0 f4727b0;

    @Deprecated
    public interface b {
        void a(int i10, IOException iOException);
    }

    @Deprecated
    public static final class c extends n {
        public final b O;
        public final int P;

        public c(b bVar, int i10) {
            this.O = (b) w7.a.g(bVar);
            this.P = i10;
        }

        public void w(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
            this.O.a(this.P, iOException);
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final l.a f4728a;

        /* renamed from: b  reason: collision with root package name */
        public g0 f4729b = new x();

        /* renamed from: c  reason: collision with root package name */
        public boolean f4730c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4731d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public Object f4732e;

        public d(l.a aVar) {
            this.f4728a = (l.a) w7.a.g(aVar);
        }

        public x0 a(Uri uri, Format format, long j10) {
            this.f4731d = true;
            return new x0(uri, this.f4728a, format, j10, this.f4729b, this.f4730c, this.f4732e);
        }

        @Deprecated
        public x0 b(Uri uri, Format format, long j10, @o0 Handler handler, @o0 i0 i0Var) {
            x0 a10 = a(uri, format, j10);
            if (!(handler == null || i0Var == null)) {
                a10.f(handler, i0Var);
            }
            return a10;
        }

        public d c(g0 g0Var) {
            w7.a.i(!this.f4731d);
            this.f4729b = g0Var;
            return this;
        }

        @Deprecated
        public d d(int i10) {
            return c(new x(i10));
        }

        public d e(Object obj) {
            w7.a.i(!this.f4731d);
            this.f4732e = obj;
            return this;
        }

        public d f(boolean z10) {
            w7.a.i(!this.f4731d);
            this.f4730c = z10;
            return this;
        }
    }

    @Deprecated
    public x0(Uri uri, l.a aVar, Format format, long j10) {
        this(uri, aVar, format, j10, 3);
    }

    @Deprecated
    public x0(Uri uri, l.a aVar, Format format, long j10, int i10) {
        this(uri, aVar, format, j10, new x(i10), false, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public x0(Uri uri, l.a aVar, Format format, long j10, int i10, Handler handler, b bVar, int i11, boolean z10) {
        this(uri, aVar, format, j10, new x(i10), z10, (Object) null);
        Handler handler2 = handler;
        b bVar2 = bVar;
        if (handler2 == null || bVar2 == null) {
            return;
        }
        c cVar = new c(bVar2, i11);
        f(handler2, cVar);
    }

    public x0(Uri uri, l.a aVar, Format format, long j10, g0 g0Var, boolean z10, @o0 Object obj) {
        this.U = aVar;
        this.V = format;
        this.W = j10;
        this.X = g0Var;
        this.Y = z10;
        this.f4726a0 = obj;
        this.T = new o(uri, 1);
        this.Z = new v0(j10, true, false, obj);
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        return new w0(this.T, this.U, this.f4727b0, this.V, this.W, this.X, m(aVar), this.Y);
    }

    @o0
    public Object g() {
        return this.f4726a0;
    }

    public void h() throws IOException {
    }

    public void i(w wVar) {
        ((w0) wVar).r();
    }

    public void o(@o0 r0 r0Var) {
        this.f4727b0 = r0Var;
        p(this.Z, (Object) null);
    }

    public void q() {
    }
}
