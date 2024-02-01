package ic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import java.util.List;

public abstract class a<V extends ViewDataBinding, T, I> extends RecyclerView.g<a<V, T, I>.a> {

    /* renamed from: c  reason: collision with root package name */
    public Context f19689c;

    /* renamed from: d  reason: collision with root package name */
    public List<T> f19690d;

    /* renamed from: e  reason: collision with root package name */
    public I f19691e;

    /* renamed from: ic.a$a  reason: collision with other inner class name */
    public class C0323a extends RecyclerView.e0 {
        public V H;

        public C0323a(V v10) {
            super(v10.getRoot());
            this.H = v10;
        }
    }

    public a(Context context, List<T> list, I i10) {
        this.f19689c = context;
        this.f19690d = list;
        this.f19691e = i10;
    }

    public abstract int F();

    @m0
    /* renamed from: G */
    public a<V, T, I>.a w(@m0 ViewGroup viewGroup, int i10) {
        return new C0323a(m.j(LayoutInflater.from(this.f19689c), F(), viewGroup, false));
    }

    public int e() {
        List<T> list = this.f19690d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
