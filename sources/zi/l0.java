package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import vn.icar.entertaiment.R;

public final class l0 implements c {
    @m0
    public final TextView O;
    @m0
    public final TextView P;

    public l0(@m0 TextView textView, @m0 TextView textView2) {
        this.O = textView;
        this.P = textView2;
    }

    @m0
    public static l0 a(@m0 View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new l0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @m0
    public static l0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static l0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_listview, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @m0
    /* renamed from: b */
    public TextView getRoot() {
        return this.O;
    }
}
