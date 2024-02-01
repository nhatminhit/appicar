package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class k0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;
    @m0
    public final RelativeLayout Q;

    public k0(@m0 RelativeLayout relativeLayout, @m0 TextView textView, @m0 RelativeLayout relativeLayout2) {
        this.O = relativeLayout;
        this.P = textView;
        this.Q = relativeLayout2;
    }

    @m0
    public static k0 a(@m0 View view) {
        TextView textView = (TextView) d.a(view, R.id.txtTabName);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new k0(relativeLayout, textView, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.txtTabName)));
    }

    @m0
    public static k0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static k0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_list_tab_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @m0
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.O;
    }
}
