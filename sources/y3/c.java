package y3;

import d.m0;
import d4.n;
import java.io.File;
import java.util.List;
import v3.a;
import v3.f;
import w3.d;
import y3.f;

public class c implements f, d.a<Object> {
    public final List<f> O;
    public final g<?> P;
    public final f.a Q;
    public int R;
    public v3.f S;
    public List<n<File, ?>> T;
    public int U;
    public volatile n.a<?> V;
    public File W;

    public c(List<v3.f> list, g<?> gVar, f.a aVar) {
        this.R = -1;
        this.O = list;
        this.P = gVar;
        this.Q = aVar;
    }

    public c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    public boolean a() {
        while (true) {
            boolean z10 = false;
            if (this.T == null || !b()) {
                int i10 = this.R + 1;
                this.R = i10;
                if (i10 >= this.O.size()) {
                    return false;
                }
                v3.f fVar = this.O.get(this.R);
                File b10 = this.P.d().b(new d(fVar, this.P.o()));
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
                    int i11 = this.U;
                    this.U = i11 + 1;
                    this.V = list.get(i11).b(this.W, this.P.s(), this.P.f(), this.P.k());
                    if (this.V != null && this.P.t(this.V.f6054c.a())) {
                        this.V.f6054c.f(this.P.l(), this);
                        z10 = true;
                    }
                }
                return z10;
            }
        }
    }

    public final boolean b() {
        return this.U < this.T.size();
    }

    public void c(@m0 Exception exc) {
        this.Q.e(this.S, exc, this.V.f6054c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        n.a<?> aVar = this.V;
        if (aVar != null) {
            aVar.f6054c.cancel();
        }
    }

    public void e(Object obj) {
        this.Q.b(this.S, obj, this.V.f6054c, a.DATA_DISK_CACHE, this.S);
    }
}
