package n1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.databinding.y;
import d.x0;
import java.util.List;

@x0({x0.a.LIBRARY})
public class t<T> extends BaseAdapter {
    public List<T> O;
    public y.a P;
    public final Context Q;
    public final int R;
    public final int S;
    public final int T;
    public final LayoutInflater U;

    public class a extends y.a {
        public a() {
        }

        public void a(y yVar) {
            t.this.notifyDataSetChanged();
        }

        public void f(y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        public void g(y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }

        public void h(y yVar, int i10, int i11, int i12) {
            t.this.notifyDataSetChanged();
        }

        public void i(y yVar, int i10, int i11) {
            t.this.notifyDataSetChanged();
        }
    }

    public t(Context context, List<T> list, int i10, int i11, int i12) {
        this.Q = context;
        this.S = i10;
        this.R = i11;
        this.T = i12;
        this.U = i10 == 0 ? null : (LayoutInflater) context.getSystemService("layout_inflater");
        b(list);
    }

    public View a(int i10, int i11, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = i10 == 0 ? new TextView(this.Q) : this.U.inflate(i10, viewGroup, false);
        }
        int i12 = this.T;
        TextView textView = (TextView) (i12 == 0 ? view : view.findViewById(i12));
        T t10 = this.O.get(i11);
        textView.setText(t10 instanceof CharSequence ? (CharSequence) t10 : String.valueOf(t10));
        return view;
    }

    public void b(List<T> list) {
        List<T> list2 = this.O;
        if (list2 != list) {
            if (list2 instanceof y) {
                ((y) list2).k(this.P);
            }
            this.O = list;
            if (list instanceof y) {
                if (this.P == null) {
                    this.P = new a();
                }
                ((y) this.O).N(this.P);
            }
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.O.size();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return a(this.R, i10, view, viewGroup);
    }

    public Object getItem(int i10) {
        return this.O.get(i10);
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        return a(this.S, i10, view, viewGroup);
    }
}
