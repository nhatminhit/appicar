package d4;

import com.bumptech.glide.h;
import d.m0;
import d.o0;
import d4.n;
import e1.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t4.k;
import v3.f;
import v3.i;
import w3.d;

public class q<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<n<Model, Data>> f6059a;

    /* renamed from: b  reason: collision with root package name */
    public final m.a<List<Throwable>> f6060b;

    public static class a<Data> implements d<Data>, d.a<Data> {
        public final List<d<Data>> O;
        public final m.a<List<Throwable>> P;
        public int Q = 0;
        public h R;
        public d.a<? super Data> S;
        @o0
        public List<Throwable> T;
        public boolean U;

        public a(@m0 List<d<Data>> list, @m0 m.a<List<Throwable>> aVar) {
            this.P = aVar;
            k.c(list);
            this.O = list;
        }

        @m0
        public Class<Data> a() {
            return this.O.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.T;
            if (list != null) {
                this.P.a(list);
            }
            this.T = null;
            for (d<Data> b10 : this.O) {
                b10.b();
            }
        }

        public void c(@m0 Exception exc) {
            ((List) k.d(this.T)).add(exc);
            g();
        }

        public void cancel() {
            this.U = true;
            for (d<Data> cancel : this.O) {
                cancel.cancel();
            }
        }

        @m0
        public v3.a d() {
            return this.O.get(0).d();
        }

        public void e(@o0 Data data) {
            if (data != null) {
                this.S.e(data);
            } else {
                g();
            }
        }

        public void f(@m0 h hVar, @m0 d.a<? super Data> aVar) {
            this.R = hVar;
            this.S = aVar;
            this.T = this.P.b();
            this.O.get(this.Q).f(hVar, this);
            if (this.U) {
                cancel();
            }
        }

        public final void g() {
            if (!this.U) {
                if (this.Q < this.O.size() - 1) {
                    this.Q++;
                    f(this.R, this.S);
                    return;
                }
                k.d(this.T);
                this.S.c(new y3.q("Fetch failed", (List<Throwable>) new ArrayList(this.T)));
            }
        }
    }

    public q(@m0 List<n<Model, Data>> list, @m0 m.a<List<Throwable>> aVar) {
        this.f6059a = list;
        this.f6060b = aVar;
    }

    public boolean a(@m0 Model model) {
        for (n<Model, Data> a10 : this.f6059a) {
            if (a10.a(model)) {
                return true;
            }
        }
        return false;
    }

    public n.a<Data> b(@m0 Model model, int i10, int i11, @m0 i iVar) {
        n.a b10;
        int size = this.f6059a.size();
        ArrayList arrayList = new ArrayList(size);
        f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = this.f6059a.get(i12);
            if (nVar.a(model) && (b10 = nVar.b(model, i10, i11, iVar)) != null) {
                fVar = b10.f6052a;
                arrayList.add(b10.f6054c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a<>(fVar, new a(arrayList, this.f6060b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f6059a.toArray()) + '}';
    }
}
