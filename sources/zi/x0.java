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

public final class x0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final ImageView Q;
    @m0
    public final ImageView R;
    @m0
    public final ImageView S;
    @m0
    public final ImageView T;
    @m0
    public final RelativeLayout U;
    @m0
    public final TextView V;
    @m0
    public final TextView W;
    @m0
    public final TextView X;

    public x0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 ImageView imageView3, @m0 ImageView imageView4, @m0 ImageView imageView5, @m0 RelativeLayout relativeLayout2, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = imageView3;
        this.S = imageView4;
        this.T = imageView5;
        this.U = relativeLayout2;
        this.V = textView;
        this.W = textView2;
        this.X = textView3;
    }

    @m0
    public static x0 a(@m0 View view) {
        int i10 = R.id.btn_next;
        ImageView imageView = (ImageView) d.a(view, R.id.btn_next);
        if (imageView != null) {
            i10 = R.id.btn_play;
            ImageView imageView2 = (ImageView) d.a(view, R.id.btn_play);
            if (imageView2 != null) {
                i10 = R.id.btn_prev;
                ImageView imageView3 = (ImageView) d.a(view, R.id.btn_prev);
                if (imageView3 != null) {
                    i10 = R.id.img_background;
                    ImageView imageView4 = (ImageView) d.a(view, R.id.img_background);
                    if (imageView4 != null) {
                        i10 = R.id.img_thumbnail;
                        ImageView imageView5 = (ImageView) d.a(view, R.id.img_thumbnail);
                        if (imageView5 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i10 = R.id.txt_app_name;
                            TextView textView = (TextView) d.a(view, R.id.txt_app_name);
                            if (textView != null) {
                                i10 = R.id.txt_channel;
                                TextView textView2 = (TextView) d.a(view, R.id.txt_channel);
                                if (textView2 != null) {
                                    i10 = R.id.txt_title;
                                    TextView textView3 = (TextView) d.a(view, R.id.txt_title);
                                    if (textView3 != null) {
                                        return new x0(relativeLayout, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static x0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static x0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_entertainment_q5, viewGroup, false);
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
