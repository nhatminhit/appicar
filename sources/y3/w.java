package y3;

import d.m0;
import d4.n;
import java.io.File;
import java.util.List;
import v3.a;
import w3.d;
import y3.f;

public class w implements f, d.a<Object> {
    public final f.a O;
    public final g<?> P;
    public int Q;
    public int R = -1;
    public v3.f S;
    public List<n<File, ?>> T;
    public int U;
    public volatile n.a<?> V;
    public File W;
    public x X;

    public w(g<?> gVar, f.a aVar) {
        this.P = gVar;
        this.O = aVar;
    }

    public boolean a() {
        List<v3.f> c10 = this.P.c();
        boolean z10 = false;
        if (c10.isEmpty()) {
            return false;
        }
        List<Class<?>> m10 = this.P.m();
        if (!m10.isEmpty()) {
            while (true) {
                if (this.T == null || !b()) {
                    int i10 = this.R + 1;
                    this.R = i10;
                    if (i10 >= m10.size()) {
                        int i11 = this.Q + 1;
                        this.Q = i11;
                        if (i11 >= c10.size()) {
                            return false;
                        }
                        this.R = 0;
                    }
                    v3.f fVar = c10.get(this.Q);
                    Class cls = m10.get(this.R);
                    this.X = new x(this.P.b(), fVar, this.P.o(), this.P.s(), this.P.f(), this.P.r(cls), cls, this.P.k());
                    File b10 = this.P.d().b(this.X);
                    this.W = b10;
                    if (b10 != null) {
                        this.S = fVar;
                        this.T = this.P.j(b10);
                        this.U = 0;
                    }
                } else {
                    this.V = null;
                    while (!z10 && b()) {
                        List<n<File, ?>> list = this.T;
                        int i12 = this.U;
                        this.U = i12 + 1;
                        this.V = list.get(i12).b(this.W, this.P.s(), this.P.f(), this.P.k());
                        if (this.V != null && this.P.t(this.V.f6054c.a())) {
                            this.V.f6054c.f(this.P.l(), this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
        } else if (File.class.equals(this.P.q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.P.i() + " to " + this.P.q());
        }
    }

    public final boolean b() {
        return this.U < this.T.size();
    }

    public void c(@m0 Exception exc) {
        this.O.e(this.X, exc, this.V.f6054c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.V;
        if (aVar != null) {
            aVar.f6054c.cancel();
        }
    }

    public void e(Object obj) {
        this.O.b(this.S, obj, this.V.f6054c, a.RESOURCE_DISK_CACHE, this.X);
    }
}
