package b7;

import android.net.Uri;
import android.os.Handler;
import b6.x0;
import b7.i0;
import b7.y;
import c7.f;
import d.o0;
import java.io.IOException;
import t7.g0;
import t7.l;
import t7.r0;
import t7.x;

@Deprecated
public final class r extends c implements y.b {
    @Deprecated
    public static final int U = 1048576;
    public final o0 T;

    @Deprecated
    public interface b {
        void a(IOException iOException);
    }

    @Deprecated
    public static final class c extends n {
        public final b O;

        public c(b bVar) {
            this.O = (b) w7.a.g(bVar);
        }

        public void w(int i10, @o0 y.a aVar, i0.b bVar, i0.c cVar, IOException iOException, boolean z10) {
            this.O.a(iOException);
        }
    }

    @Deprecated
    public static final class d implements f.d {

        /* renamed from: a  reason: collision with root package name */
        public final l.a f4687a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public j6.l f4688b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public String f4689c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public Object f4690d;

        /* renamed from: e  reason: collision with root package name */
        public g0 f4691e = new x();

        /* renamed from: f  reason: collision with root package name */
        public int f4692f = 1048576;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4693g;

        public d(l.a aVar) {
            this.f4687a = aVar;
        }

        public int[] a() {
            return new int[]{3};
        }

        /* renamed from: c */
        public r b(Uri uri) {
            this.f4693g = true;
            if (this.f4688b == null) {
                this.f4688b = new j6.f();
            }
            return new r(uri, this.f4687a, this.f4688b, this.f4691e, this.f4689c, this.f4692f, this.f4690d);
        }

        @Deprecated
        public r d(Uri uri, @o0 Handler handler, @o0 i0 i0Var) {
            r c10 = b(uri);
            if (!(handler == null || i0Var == null)) {
                c10.f(handler, i0Var);
            }
            return c10;
        }

        public d e(int i10) {
            w7.a.i(!this.f4693g);
            this.f4692f = i10;
            return this;
        }

        public d f(String str) {
            w7.a.i(!this.f4693g);
            this.f4689c = str;
            return this;
        }

        public d g(j6.l lVar) {
            w7.a.i(!this.f4693g);
            this.f4688b = lVar;
            return this;
        }

        public d h(g0 g0Var) {
            w7.a.i(!this.f4693g);
            this.f4691e = g0Var;
            return this;
        }

        @Deprecated
        public d i(int i10) {
            return h(new x(i10));
        }

        public d j(Object obj) {
            w7.a.i(!this.f4693g);
            this.f4690d = obj;
            return this;
        }
    }

    @Deprecated
    public r(Uri uri, l.a aVar, j6.l lVar, Handler handler, b bVar) {
        this(uri, aVar, lVar, handler, bVar, (String) null);
    }

    @Deprecated
    public r(Uri uri, l.a aVar, j6.l lVar, Handler handler, b bVar, String str) {
        this(uri, aVar, lVar, handler, bVar, str, 1048576);
    }

    @Deprecated
    public r(Uri uri, l.a aVar, j6.l lVar, Handler handler, b bVar, String str, int i10) {
        this(uri, aVar, lVar, (g0) new x(), str, i10, (Object) null);
        if (bVar != null && handler != null) {
            f(handler, new c(bVar));
        }
    }

    public r(Uri uri, l.a aVar, j6.l lVar, g0 g0Var, @o0 String str, int i10, @o0 Object obj) {
        this.T = new o0(uri, aVar, lVar, g0Var, str, i10, obj);
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        return this.T.c(aVar, bVar, j10);
    }

    @o0
    public Object g() {
        return this.T.g();
    }

    public void h() throws IOException {
        this.T.h();
    }

    public void i(w wVar) {
        this.T.i(wVar);
    }

    public void j(y yVar, x0 x0Var, @o0 Object obj) {
        p(x0Var, obj);
    }

    public void o(@o0 r0 r0Var) {
        this.T.e(this, r0Var);
    }

    public void q() {
        this.T.b(this);
    }
}
