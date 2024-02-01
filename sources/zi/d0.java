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

public final class d0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;

    public d0(@m0 RelativeLayout relativeLayout, @m0 TextView textView) {
        this.O = relativeLayout;
        this.P = textView;
    }

    @m0
    public static d0 a(@m0 View view) {
        TextView textView = (TextView) d.a(view, R.id.txt_news);
        if (textView != null) {
            return new d0((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.txt_news)));
    }

    @m0
    public static d0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static d0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_advertisement_square_screen, viewGroup, false);
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
