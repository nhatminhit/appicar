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

public final class j0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final ImageView Q;
    @m0
    public final TextView R;
    @m0
    public final TextView S;

    public j0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 TextView textView, @m0 TextView textView2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = textView;
        this.S = textView2;
    }

    @m0
    public static j0 a(@m0 View view) {
        int i10 = R.id.img_folder;
        ImageView imageView = (ImageView) d.a(view, R.id.img_folder);
        if (imageView != null) {
            i10 = R.id.tg_folder;
            ImageView imageView2 = (ImageView) d.a(view, R.id.tg_folder);
            if (imageView2 != null) {
                i10 = R.id.txt_folder;
                TextView textView = (TextView) d.a(view, R.id.txt_folder);
                if (textView != null) {
                    i10 = R.id.txt_source;
                    TextView textView2 = (TextView) d.a(view, R.id.txt_source);
                    if (textView2 != null) {
                        return new j0((RelativeLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static j0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static j0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_folder, viewGroup, false);
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
