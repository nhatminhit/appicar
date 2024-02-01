package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class z0 implements c {
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
    public final LinearLayout U;
    @m0
    public final RelativeLayout V;
    @m0
    public final RelativeLayout W;
    @m0
    public final RelativeLayout X;
    @m0
    public final TextView Y;
    @m0
    public final TextView Z;

    public z0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 ImageView imageView3, @m0 ImageView imageView4, @m0 ImageView imageView5, @m0 LinearLayout linearLayout, @m0 RelativeLayout relativeLayout2, @m0 RelativeLayout relativeLayout3, @m0 RelativeLayout relativeLayout4, @m0 TextView textView, @m0 TextView textView2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = imageView3;
        this.S = imageView4;
        this.T = imageView5;
        this.U = linearLayout;
        this.V = relativeLayout2;
        this.W = relativeLayout3;
        this.X = relativeLayout4;
        this.Y = textView;
        this.Z = textView2;
    }

    @m0
    public static z0 a(@m0 View view) {
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
                            i10 = R.id.layout_main;
                            LinearLayout linearLayout = (LinearLayout) d.a(view, R.id.layout_main);
                            if (linearLayout != null) {
                                i10 = R.id.layout_space1;
                                RelativeLayout relativeLayout = (RelativeLayout) d.a(view, R.id.layout_space1);
                                if (relativeLayout != null) {
                                    i10 = R.id.layout_space2;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) d.a(view, R.id.layout_space2);
                                    if (relativeLayout2 != null) {
                                        RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                        i10 = R.id.txt_channel;
                                        TextView textView = (TextView) d.a(view, R.id.txt_channel);
                                        if (textView != null) {
                                            i10 = R.id.txt_title;
                                            TextView textView2 = (TextView) d.a(view, R.id.txt_title);
                                            if (textView2 != null) {
                                                return new z0(relativeLayout3, imageView, imageView2, imageView3, imageView4, imageView5, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2);
                                            }
                                        }
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
    public static z0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static z0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_entertainment_s503, viewGroup, false);
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
