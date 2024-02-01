package t2;

import androidx.recyclerview.widget.RecyclerView;
import d.g1;
import d.m0;
import d.x0;
import e1.n;
import t2.e0;

@x0({x0.a.LIBRARY})
@g1(otherwise = 3)
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12828a = "EventsRelays";

    public static final class a<K> extends e0.b<K> {

        /* renamed from: a  reason: collision with root package name */
        public final o<K> f12829a;

        /* renamed from: b  reason: collision with root package name */
        public final RecyclerView.g<?> f12830b;

        public a(@m0 e0<K> e0Var, @m0 o<K> oVar, @m0 RecyclerView.g<?> gVar) {
            e0Var.a(this);
            boolean z10 = true;
            n.a(oVar != null);
            n.a(gVar == null ? false : z10);
            this.f12829a = oVar;
            this.f12830b = gVar;
        }

        public void a(@m0 K k10, boolean z10) {
            int b10 = this.f12829a.b(k10);
            if (b10 < 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Item change notification received for unknown item: ");
                sb2.append(k10);
                return;
            }
            this.f12830b.l(b10, e0.f12805b);
        }
    }

    public static <K> void a(@m0 RecyclerView.g<?> gVar, @m0 e0<K> e0Var, @m0 o<K> oVar) {
        new a(e0Var, oVar, gVar);
        gVar.C(e0Var.k());
    }
}
