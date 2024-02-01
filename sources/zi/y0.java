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

public final class y0 implements c {
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
    public final ImageView U;
    @m0
    public final ImageView V;
    @m0
    public final LinearLayout W;
    @m0
    public final LinearLayout X;
    @m0
    public final RelativeLayout Y;
    @m0
    public final RelativeLayout Z;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final RelativeLayout f25254a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f25255b0;
    @m0

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f25256c0;
    @m0

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f25257d0;

    public y0(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 ImageView imageView3, @m0 ImageView imageView4, @m0 ImageView imageView5, @m0 ImageView imageView6, @m0 ImageView imageView7, @m0 LinearLayout linearLayout, @m0 LinearLayout linearLayout2, @m0 RelativeLayout relativeLayout2, @m0 RelativeLayout relativeLayout3, @m0 RelativeLayout relativeLayout4, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = imageView3;
        this.S = imageView4;
        this.T = imageView5;
        this.U = imageView6;
        this.V = imageView7;
        this.W = linearLayout;
        this.X = linearLayout2;
        this.Y = relativeLayout2;
        this.Z = relativeLayout3;
        this.f25254a0 = relativeLayout4;
        this.f25255b0 = textView;
        this.f25256c0 = textView2;
        this.f25257d0 = textView3;
    }

    @m0
    public static y0 a(@m0 View view) {
        View view2 = view;
        int i10 = R.id.btn_next;
        ImageView imageView = (ImageView) d.a(view2, R.id.btn_next);
        if (imageView != null) {
            i10 = R.id.btn_play;
            ImageView imageView2 = (ImageView) d.a(view2, R.id.btn_play);
            if (imageView2 != null) {
                i10 = R.id.btn_prev;
                ImageView imageView3 = (ImageView) d.a(view2, R.id.btn_prev);
                if (imageView3 != null) {
                    i10 = R.id.img_app_icon;
                    ImageView imageView4 = (ImageView) d.a(view2, R.id.img_app_icon);
                    if (imageView4 != null) {
                        i10 = R.id.img_background;
                        ImageView imageView5 = (ImageView) d.a(view2, R.id.img_background);
                        if (imageView5 != null) {
                            i10 = R.id.img_logo;
                            ImageView imageView6 = (ImageView) d.a(view2, R.id.img_logo);
                            if (imageView6 != null) {
                                i10 = R.id.img_thumbnail;
                                ImageView imageView7 = (ImageView) d.a(view2, R.id.img_thumbnail);
                                if (imageView7 != null) {
                                    i10 = R.id.layout_app;
                                    LinearLayout linearLayout = (LinearLayout) d.a(view2, R.id.layout_app);
                                    if (linearLayout != null) {
                                        i10 = R.id.layout_main;
                                        LinearLayout linearLayout2 = (LinearLayout) d.a(view2, R.id.layout_main);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.layout_space1;
                                            RelativeLayout relativeLayout = (RelativeLayout) d.a(view2, R.id.layout_space1);
                                            if (relativeLayout != null) {
                                                i10 = R.id.layout_space2;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) d.a(view2, R.id.layout_space2);
                                                if (relativeLayout2 != null) {
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) view2;
                                                    i10 = R.id.txt_app_name;
                                                    TextView textView = (TextView) d.a(view2, R.id.txt_app_name);
                                                    if (textView != null) {
                                                        i10 = R.id.txt_channel;
                                                        TextView textView2 = (TextView) d.a(view2, R.id.txt_channel);
                                                        if (textView2 != null) {
                                                            i10 = R.id.txt_title;
                                                            TextView textView3 = (TextView) d.a(view2, R.id.txt_title);
                                                            if (textView3 != null) {
                                                                return new y0(relativeLayout3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, linearLayout, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static y0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static y0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_entertainment_s4_gold, viewGroup, false);
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
