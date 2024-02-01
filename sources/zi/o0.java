package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class o0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;

    public o0(@m0 RelativeLayout relativeLayout, @m0 TextView textView) {
        this.O = relativeLayout;
        this.P = textView;
    }

    @m0
    public static o0 a(@m0 View view) {
        TextView textView = (TextView) d.a(view, R.id.txt_tab);
        if (textView != null) {
            return new o0((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.txt_tab)));
    }

    @m0
    public static o0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static o0 d(@m0 LayoutInflater layoutInflater, @d.o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_tab, viewGroup, false);
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
