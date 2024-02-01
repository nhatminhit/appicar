package t2;

import android.util.SparseArray;
import android.view.View;
import androidx.collection.f;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;

public final class g0 extends o<Long> {

    /* renamed from: g  reason: collision with root package name */
    public static final String f12831g = "StableIdKeyProvider";

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<Long> f12832d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public final f<Integer> f12833e = new f<>();

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f12834f;

    public class a implements RecyclerView.q {
        public a() {
        }

        public void b(View view) {
            g0.this.g(view);
        }

        public void d(View view) {
            g0.this.f(view);
        }
    }

    public g0(@m0 RecyclerView recyclerView) {
        super(1);
        this.f12834f = recyclerView;
        recyclerView.p(new a());
    }

    @o0
    /* renamed from: d */
    public Long a(int i10) {
        return this.f12832d.get(i10, (Object) null);
    }

    /* renamed from: e */
    public int b(@m0 Long l10) {
        return this.f12833e.p(l10.longValue(), -1).intValue();
    }

    public void f(@m0 View view) {
        RecyclerView.e0 b02 = this.f12834f.b0(view);
        if (b02 != null) {
            int j10 = b02.j();
            long k10 = b02.k();
            if (j10 != -1 && k10 != -1) {
                this.f12832d.put(j10, Long.valueOf(k10));
                this.f12833e.u(k10, Integer.valueOf(j10));
            }
        }
    }

    public void g(@m0 View view) {
        RecyclerView.e0 b02 = this.f12834f.b0(view);
        if (b02 != null) {
            int j10 = b02.j();
            long k10 = b02.k();
            if (j10 != -1 && k10 != -1) {
                this.f12832d.delete(j10);
                this.f12833e.x(k10);
            }
        }
    }
}
