package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class h0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final TextView Q;

    public h0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 TextView textView) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = textView;
    }

    @m0
    public static h0 a(@m0 View view) {
        int i10 = R.id.img_check;
        ImageView imageView = (ImageView) d.a(view, R.id.img_check);
        if (imageView != null) {
            i10 = R.id.txt_default;
            TextView textView = (TextView) d.a(view, R.id.txt_default);
            if (textView != null) {
                return new h0((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static h0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static h0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_default_play, viewGroup, false);
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
