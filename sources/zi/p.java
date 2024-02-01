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

public final class p implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final TextView Q;
    @m0
    public final TextView R;

    public p(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 TextView textView, @m0 TextView textView2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = textView;
        this.R = textView2;
    }

    @m0
    public static p a(@m0 View view) {
        int i10 = R.id.img_icon;
        ImageView imageView = (ImageView) d.a(view, R.id.img_icon);
        if (imageView != null) {
            i10 = R.id.txt_content;
            TextView textView = (TextView) d.a(view, R.id.txt_content);
            if (textView != null) {
                i10 = R.id.txt_title;
                TextView textView2 = (TextView) d.a(view, R.id.txt_title);
                if (textView2 != null) {
                    return new p((RelativeLayout) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static p c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static p d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_usb, viewGroup, false);
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
