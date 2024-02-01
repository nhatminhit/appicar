package c7;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import b6.x0;
import b7.h;
import b7.o;
import b7.o0;
import b7.w;
import b7.y;
import c7.b;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t7.l;
import t7.r0;

public final class f extends h<y.a> {

    /* renamed from: j0  reason: collision with root package name */
    public static final y.a f4904j0 = new y.a(new Object());
    public final y W;
    public final d X;
    public final b Y;
    public final b.a Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Handler f4905a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Map<y, List<o>> f4906b0;

    /* renamed from: c0  reason: collision with root package name */
    public final x0.b f4907c0;

    /* renamed from: d0  reason: collision with root package name */
    public c f4908d0;

    /* renamed from: e0  reason: collision with root package name */
    public x0 f4909e0;

    /* renamed from: f0  reason: collision with root package name */
    public Object f4910f0;

    /* renamed from: g0  reason: collision with root package name */
    public a f4911g0;

    /* renamed from: h0  reason: collision with root package name */
    public y[][] f4912h0;

    /* renamed from: i0  reason: collision with root package name */
    public x0[][] f4913i0;

    public static final class a extends IOException {
        public static final int P = 0;
        public static final int Q = 1;
        public static final int R = 2;
        public static final int S = 3;
        public final int O;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: c7.f$a$a  reason: collision with other inner class name */
        public @interface C0080a {
        }

        public a(int i10, Exception exc) {
            super(exc);
            this.O = i10;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        public static a b(Exception exc, int i10) {
            return new a(1, new IOException("Failed to load ad group " + i10, exc));
        }

        public static a c(Exception exc) {
            return new a(2, exc);
        }

        public static a d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        public RuntimeException e() {
            w7.a.i(this.O == 3);
            return (RuntimeException) getCause();
        }
    }

    public final class b implements o.a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f4914a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4915b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4916c;

        public b(Uri uri, int i10, int i11) {
            this.f4914a = uri;
            this.f4915b = i10;
            this.f4916c = i11;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(IOException iOException) {
            f.this.Y.b(this.f4915b, this.f4916c, iOException);
        }

        public void a(y.a aVar, IOException iOException) {
            f.this.m(aVar).E(new t7.o(this.f4914a), this.f4914a, Collections.emptyMap(), 6, -1, 0, 0, a.a(iOException), true);
            f.this.f4905a0.post(new g(this, iOException));
        }
    }

    public final class c implements b.C0079b {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f4918a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        public volatile boolean f4919b;

        public c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(a aVar) {
            if (!this.f4919b) {
                f.this.J(aVar);
            }
        }

        public void a(a aVar) {
            if (!this.f4919b) {
                this.f4918a.post(new h(this, aVar));
            }
        }

        public /* synthetic */ void b() {
            c.a(this);
        }

        public /* synthetic */ void c() {
            c.d(this);
        }

        public void d(a aVar, t7.o oVar) {
            if (!this.f4919b) {
                f.this.m((y.a) null).E(oVar, oVar.f13130a, Collections.emptyMap(), 6, -1, 0, 0, aVar, true);
            }
        }

        public void g() {
            this.f4919b = true;
            this.f4918a.removeCallbacksAndMessages((Object) null);
        }
    }

    public interface d {
        int[] a();

        y b(Uri uri);
    }

    public f(y yVar, d dVar, b bVar, b.a aVar) {
        this.W = yVar;
        this.X = dVar;
        this.Y = bVar;
        this.Z = aVar;
        this.f4905a0 = new Handler(Looper.getMainLooper());
        this.f4906b0 = new HashMap();
        this.f4907c0 = new x0.b();
        this.f4912h0 = new y[0][];
        this.f4913i0 = new x0[0][];
        bVar.e(dVar.a());
    }

    public f(y yVar, l.a aVar, b bVar, b.a aVar2) {
        this(yVar, (d) new o0.a(aVar), bVar, aVar2);
    }

    public static long[][] F(x0[][] x0VarArr, x0.b bVar) {
        long[][] jArr = new long[x0VarArr.length][];
        for (int i10 = 0; i10 < x0VarArr.length; i10++) {
            jArr[i10] = new long[x0VarArr[i10].length];
            int i11 = 0;
            while (true) {
                x0[] x0VarArr2 = x0VarArr[i10];
                if (i11 >= x0VarArr2.length) {
                    break;
                }
                long[] jArr2 = jArr[i10];
                x0 x0Var = x0VarArr2[i11];
                jArr2[i11] = x0Var == null ? b6.c.f4201b : x0Var.f(0, bVar).i();
                i11++;
            }
        }
        return jArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(c cVar) {
        this.Y.c(cVar, this.Z);
    }

    @d.o0
    /* renamed from: G */
    public y.a s(y.a aVar, y.a aVar2) {
        return aVar.b() ? aVar : aVar2;
    }

    public final void I() {
        a aVar = this.f4911g0;
        if (aVar != null && this.f4909e0 != null) {
            a e10 = aVar.e(F(this.f4913i0, this.f4907c0));
            this.f4911g0 = e10;
            p(e10.f4895a == 0 ? this.f4909e0 : new i(this.f4909e0, this.f4911g0), this.f4910f0);
        }
    }

    public final void J(a aVar) {
        if (this.f4911g0 == null) {
            y[][] yVarArr = new y[aVar.f4895a][];
            this.f4912h0 = yVarArr;
            Arrays.fill(yVarArr, new y[0]);
            x0[][] x0VarArr = new x0[aVar.f4895a][];
            this.f4913i0 = x0VarArr;
            Arrays.fill(x0VarArr, new x0[0]);
        }
        this.f4911g0 = aVar;
        I();
    }

    public final void K(y yVar, int i10, int i11, x0 x0Var) {
        boolean z10 = true;
        if (x0Var.i() != 1) {
            z10 = false;
        }
        w7.a.a(z10);
        this.f4913i0[i10][i11] = x0Var;
        List remove = this.f4906b0.remove(yVar);
        if (remove != null) {
            Object m10 = x0Var.m(0);
            for (int i12 = 0; i12 < remove.size(); i12++) {
                o oVar = (o) remove.get(i12);
                oVar.g(new y.a(m10, oVar.P.f4736d));
            }
        }
        I();
    }

    /* renamed from: L */
    public void w(y.a aVar, y yVar, x0 x0Var, @d.o0 Object obj) {
        if (aVar.b()) {
            K(yVar, aVar.f4734b, aVar.f4735c, x0Var);
        } else {
            M(x0Var, obj);
        }
    }

    public final void M(x0 x0Var, Object obj) {
        boolean z10 = true;
        if (x0Var.i() != 1) {
            z10 = false;
        }
        w7.a.a(z10);
        this.f4909e0 = x0Var;
        this.f4910f0 = obj;
        I();
    }

    public w c(y.a aVar, t7.b bVar, long j10) {
        if (this.f4911g0.f4895a <= 0 || !aVar.b()) {
            o oVar = new o(this.W, aVar, bVar, j10);
            oVar.g(aVar);
            return oVar;
        }
        int i10 = aVar.f4734b;
        int i11 = aVar.f4735c;
        Uri uri = this.f4911g0.f4897c[i10].f4901b[i11];
        if (this.f4912h0[i10].length <= i11) {
            y b10 = this.X.b(uri);
            y[][] yVarArr = this.f4912h0;
            y[] yVarArr2 = yVarArr[i10];
            if (i11 >= yVarArr2.length) {
                int i12 = i11 + 1;
                yVarArr[i10] = (y[]) Arrays.copyOf(yVarArr2, i12);
                x0[][] x0VarArr = this.f4913i0;
                x0VarArr[i10] = (x0[]) Arrays.copyOf(x0VarArr[i10], i12);
            }
            this.f4912h0[i10][i11] = b10;
            this.f4906b0.put(b10, new ArrayList());
            x(aVar, b10);
        }
        y yVar = this.f4912h0[i10][i11];
        o oVar2 = new o(yVar, aVar, bVar, j10);
        oVar2.x(new b(uri, i10, i11));
        List list = this.f4906b0.get(yVar);
        if (list == null) {
            oVar2.g(new y.a(this.f4913i0[i10][i11].m(0), aVar.f4736d));
        } else {
            list.add(oVar2);
        }
        return oVar2;
    }

    @d.o0
    public Object g() {
        return this.W.g();
    }

    public void i(w wVar) {
        o oVar = (o) wVar;
        List list = this.f4906b0.get(oVar.O);
        if (list != null) {
            list.remove(oVar);
        }
        oVar.w();
    }

    public void o(@d.o0 r0 r0Var) {
        super.o(r0Var);
        c cVar = new c();
        this.f4908d0 = cVar;
        x(f4904j0, this.W);
        this.f4905a0.post(new e(this, cVar));
    }

    public void q() {
        super.q();
        this.f4908d0.g();
        this.f4908d0 = null;
        this.f4906b0.clear();
        this.f4909e0 = null;
        this.f4910f0 = null;
        this.f4911g0 = null;
        this.f4912h0 = new y[0][];
        this.f4913i0 = new x0[0][];
        Handler handler = this.f4905a0;
        b bVar = this.Y;
        bVar.getClass();
        handler.post(new d(bVar));
    }
}
