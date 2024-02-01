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

public final class h implements c {
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
    @m0
    public final TextView T;
    @m0
    public final TextView U;
    @m0
    public final TextView V;
    @m0
    public final TextView W;
    @m0
    public final TextView X;
    @m0
    public final TextView Y;
    @m0
    public final TextView Z;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final View f25171a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public final RelativeLayout f25172b0;

    public h(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3, @m0 TextView textView4, @m0 TextView textView5, @m0 TextView textView6, @m0 TextView textView7, @m0 TextView textView8, @m0 TextView textView9, @m0 View view, @m0 RelativeLayout relativeLayout2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = textView;
        this.S = textView2;
        this.T = textView3;
        this.U = textView4;
        this.V = textView5;
        this.W = textView6;
        this.X = textView7;
        this.Y = textView8;
        this.Z = textView9;
        this.f25171a0 = view;
        this.f25172b0 = relativeLayout2;
    }

    @m0
    public static h a(@m0 View view) {
        View view2 = view;
        int i10 = R.id.img_back;
        ImageView imageView = (ImageView) d.a(view2, R.id.img_back);
        if (imageView != null) {
            i10 = R.id.img_update;
            ImageView imageView2 = (ImageView) d.a(view2, R.id.img_update);
            if (imageView2 != null) {
                i10 = R.id.text_license_type_string;
                TextView textView = (TextView) d.a(view2, R.id.text_license_type_string);
                if (textView != null) {
                    i10 = R.id.text_version;
                    TextView textView2 = (TextView) d.a(view2, R.id.text_version);
                    if (textView2 != null) {
                        i10 = R.id.title;
                        TextView textView3 = (TextView) d.a(view2, R.id.title);
                        if (textView3 != null) {
                            i10 = R.id.txt_developers;
                            TextView textView4 = (TextView) d.a(view2, R.id.txt_developers);
                            if (textView4 != null) {
                                i10 = R.id.txt_feature;
                                TextView textView5 = (TextView) d.a(view2, R.id.txt_feature);
                                if (textView5 != null) {
                                    i10 = R.id.txt_license;
                                    TextView textView6 = (TextView) d.a(view2, R.id.txt_license);
                                    if (textView6 != null) {
                                        i10 = R.id.txt_time_license;
                                        TextView textView7 = (TextView) d.a(view2, R.id.txt_time_license);
                                        if (textView7 != null) {
                                            i10 = R.id.txt_update;
                                            TextView textView8 = (TextView) d.a(view2, R.id.txt_update);
                                            if (textView8 != null) {
                                                i10 = R.id.txt_version;
                                                TextView textView9 = (TextView) d.a(view2, R.id.txt_version);
                                                if (textView9 != null) {
                                                    i10 = R.id.view;
                                                    View a10 = d.a(view2, R.id.view);
                                                    if (a10 != null) {
                                                        i10 = R.id.view_update;
                                                        RelativeLayout relativeLayout = (RelativeLayout) d.a(view2, R.id.view_update);
                                                        if (relativeLayout != null) {
                                                            return new h((RelativeLayout) view2, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, a10, relativeLayout);
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
    public static h c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static h d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_introduce, viewGroup, false);
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
