package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class k implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final ImageView Q;
    @m0
    public final ImageView R;
    @m0
    public final RecyclerView S;
    @m0
    public final TextView T;
    @m0
    public final TextView U;
    @m0
    public final TextView V;
    @m0
    public final View W;
    @m0
    public final LinearLayout X;
    @m0
    public final LinearLayout Y;
    @m0
    public final LinearLayout Z;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final LinearLayout f25173a0;

    public k(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 ImageView imageView3, @m0 RecyclerView recyclerView, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3, @m0 View view, @m0 LinearLayout linearLayout, @m0 LinearLayout linearLayout2, @m0 LinearLayout linearLayout3, @m0 LinearLayout linearLayout4) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = imageView3;
        this.S = recyclerView;
        this.T = textView;
        this.U = textView2;
        this.V = textView3;
        this.W = view;
        this.X = linearLayout;
        this.Y = linearLayout2;
        this.Z = linearLayout3;
        this.f25173a0 = linearLayout4;
    }

    @m0
    public static k a(@m0 View view) {
        View view2 = view;
        int i10 = R.id.image_radio_button_all;
        ImageView imageView = (ImageView) d.a(view2, R.id.image_radio_button_all);
        if (imageView != null) {
            i10 = R.id.image_radio_button_music;
            ImageView imageView2 = (ImageView) d.a(view2, R.id.image_radio_button_music);
            if (imageView2 != null) {
                i10 = R.id.image_radio_button_video;
                ImageView imageView3 = (ImageView) d.a(view2, R.id.image_radio_button_video);
                if (imageView3 != null) {
                    i10 = R.id.recycler_folder;
                    RecyclerView recyclerView = (RecyclerView) d.a(view2, R.id.recycler_folder);
                    if (recyclerView != null) {
                        i10 = R.id.tv_folder;
                        TextView textView = (TextView) d.a(view2, R.id.tv_folder);
                        if (textView != null) {
                            i10 = R.id.txt_model;
                            TextView textView2 = (TextView) d.a(view2, R.id.txt_model);
                            if (textView2 != null) {
                                i10 = R.id.txt_title;
                                TextView textView3 = (TextView) d.a(view2, R.id.txt_title);
                                if (textView3 != null) {
                                    i10 = R.id.view;
                                    View a10 = d.a(view2, R.id.view);
                                    if (a10 != null) {
                                        i10 = R.id.view_radio_button_all;
                                        LinearLayout linearLayout = (LinearLayout) d.a(view2, R.id.view_radio_button_all);
                                        if (linearLayout != null) {
                                            i10 = R.id.view_radio_button_music;
                                            LinearLayout linearLayout2 = (LinearLayout) d.a(view2, R.id.view_radio_button_music);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.view_radio_button_video;
                                                LinearLayout linearLayout3 = (LinearLayout) d.a(view2, R.id.view_radio_button_video);
                                                if (linearLayout3 != null) {
                                                    i10 = R.id.view_type;
                                                    LinearLayout linearLayout4 = (LinearLayout) d.a(view2, R.id.view_type);
                                                    if (linearLayout4 != null) {
                                                        return new k((RelativeLayout) view2, imageView, imageView2, imageView3, recyclerView, textView, textView2, textView3, a10, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static k c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static k d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_music_offline, viewGroup, false);
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
