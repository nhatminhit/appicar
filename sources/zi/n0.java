package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class n0 implements c {
    @m0
    public final LinearLayout O;
    @m0
    public final TextView P;

    public n0(@m0 LinearLayout linearLayout, @m0 TextView textView) {
        this.O = linearLayout;
        this.P = textView;
    }

    @m0
    public static n0 a(@m0 View view) {
        TextView textView = (TextView) d.a(view, R.id.txt_device);
        if (textView != null) {
            return new n0((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.txt_device)));
    }

    @m0
    public static n0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static n0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_spinner, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @m0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.O;
    }
}
