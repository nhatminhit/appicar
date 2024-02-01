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

public final class r0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final TextView Q;
    @m0
    public final RelativeLayout R;

    public r0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 TextView textView, @m0 RelativeLayout relativeLayout2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = textView;
        this.R = relativeLayout2;
    }

    @m0
    public static r0 a(@m0 View view) {
        int i10 = R.id.imgPlayRadio;
        ImageView imageView = (ImageView) d.a(view, R.id.imgPlayRadio);
        if (imageView != null) {
            i10 = R.id.txtChannelRadio;
            TextView textView = (TextView) d.a(view, R.id.txtChannelRadio);
            if (textView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                return new r0(relativeLayout, imageView, textView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static r0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static r0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_widget_radio, viewGroup, false);
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
