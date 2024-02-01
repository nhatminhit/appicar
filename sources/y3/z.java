package y3;

import android.util.Log;
import d.m0;
import d.o0;
import d4.n;
import java.util.Collections;
import java.util.List;
import t4.g;
import w3.d;
import y3.f;

public class z implements f, f.a {
    public static final String V = "SourceGenerator";
    public final g<?> O;
    public final f.a P;
    public int Q;
    public c R;
    public Object S;
    public volatile n.a<?> T;
    public d U;

    public class a implements d.a<Object> {
        public final /* synthetic */ n.a O;

        public a(n.a aVar) {
            this.O = aVar;
        }

        public void c(@m0 Exception exc) {
            if (z.this.g(this.O)) {
                z.this.i(this.O, exc);
            }
        }

        public void e(@o0 Object obj) {
            if (z.this.g(this.O)) {
                z.this.h(this.O, obj);
            }
        }
    }

    public z(g<?> gVar, f.a aVar) {
        this.O = gVar;
        this.P = aVar;
    }

    public boolean a() {
        Object obj = this.S;
        if (obj != null) {
            this.S = null;
            c(obj);
        }
        c cVar = this.R;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.R = null;
        this.T = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List<n.a<?>> g10 = this.O.g();
            int i10 = this.Q;
            this.Q = i10 + 1;
            this.T = g10.get(i10);
            if (this.T != null && (this.O.e().c(this.T.f6054c.d()) || this.O.t(this.T.f6054c.a()))) {
                j(this.T);
                z10 = true;
            }
        }
        return z10;
    }

    public void b(v3.f fVar, Object obj, d<?> dVar, v3.a aVar, v3.f fVar2) {
        this.P.b(fVar, obj, dVar, this.T.f6054c.d(), fVar);
    }

    /* JADX INFO: finally extract failed */
    public final void c(Object obj) {
        long b10 = g.b();
        try {
            v3.d<X> p10 = this.O.p(obj);
            e eVar = new e(p10, obj, this.O.k());
            this.U = new d(this.T.f6052a, this.O.o());
            this.O.d().c(this.U, eVar);
            if (Log.isLoggable(V, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished encoding source to cache, key: ");
                sb2.append(this.U);
                sb2.append(", data: ");
                sb2.append(obj);
                sb2.append(", encoder: ");
                sb2.append(p10);
                sb2.append(", duration: ");
                sb2.append(g.a(b10));
            }
            this.T.f6054c.b();
            this.R = new c(Collections.singletonList(this.T.f6052a), this.O, this);
        } catch (Throwable th2) {
            this.T.f6054c.b();
            throw th2;
        }
    }

    public void cancel() {
        n.a<?> aVar = this.T;
        if (aVar != null) {
            aVar.f6054c.cancel();
        }
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void e(v3.f fVar, Exception exc, d<?> dVar, v3.a aVar) {
        this.P.e(fVar, exc, dVar, this.T.f6054c.d());
    }

    public final boolean f() {
        return this.Q < this.O.g().size();
    }

    public boolean g(n.a<?> aVar) {
        n.a<?> aVar2 = this.T;
        return aVar2 != null && aVar2 == aVar;
    }

    public void h(n.a<?> aVar, Object obj) {
        j e10 = this.O.e();
        if (obj == null || !e10.c(aVar.f6054c.d())) {
            f.a aVar2 = this.P;
            v3.f fVar = aVar.f6052a;
            d<Data> dVar = aVar.f6054c;
            aVar2.b(fVar, obj, dVar, dVar.d(), this.U);
            return;
        }
        this.S = obj;
        this.P.d();
    }

    public void i(n.a<?> aVar, @m0 Exception exc) {
        f.a aVar2 = this.P;
        d dVar = this.U;
        d<Data> dVar2 = aVar.f6054c;
        aVar2.e(dVar, exc, dVar2, dVar2.d());
    }

    public final void j(n.a<?> aVar) {
        this.T.f6054c.f(this.O.l(), new a(aVar));
    }
}
