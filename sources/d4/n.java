package d4;

import d.m0;
import d.o0;
import java.util.Collections;
import java.util.List;
import t4.k;
import v3.f;
import v3.i;
import w3.d;

public interface n<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f6052a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f6053b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f6054c;

        public a(@m0 f fVar, @m0 List<f> list, @m0 d<Data> dVar) {
            this.f6052a = (f) k.d(fVar);
            this.f6053b = (List) k.d(list);
            this.f6054c = (d) k.d(dVar);
        }

        public a(@m0 f fVar, @m0 d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }
    }

    boolean a(@m0 Model model);

    @o0
    a<Data> b(@m0 Model model, int i10, int i11, @m0 i iVar);
}
