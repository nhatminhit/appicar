package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class q0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final CardView P;
    @m0
    public final ImageView Q;
    @m0
    public final ImageView R;
    @m0
    public final RelativeLayout S;
    @m0
    public final TextView T;
    @m0
    public final TextView U;
    @m0
    public final TextView V;
    @m0
    public final TextView W;
    @m0
    public final RelativeLayout X;

    public q0(@m0 RelativeLayout relativeLayout, @m0 CardView cardView, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 RelativeLayout relativeLayout2, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3, @m0 TextView textView4, @m0 RelativeLayout relativeLayout3) {
        this.O = relativeLayout;
        this.P = cardView;
        this.Q = imageView;
        this.R = imageView2;
        this.S = relativeLayout2;
        this.T = textView;
        this.U = textView2;
        this.V = textView3;
        this.W = textView4;
        this.X = relativeLayout3;
    }

    @m0
    public static q0 a(@m0 View view) {
        int i10 = R.id.card_img;
        CardView cardView = (CardView) d.a(view, R.id.card_img);
        if (cardView != null) {
            i10 = R.id.img_logo_channels;
            ImageView imageView = (ImageView) d.a(view, R.id.img_logo_channels);
            if (imageView != null) {
                i10 = R.id.img_video;
                ImageView imageView2 = (ImageView) d.a(view, R.id.img_video);
                if (imageView2 != null) {
                    i10 = R.id.relative;
                    RelativeLayout relativeLayout = (RelativeLayout) d.a(view, R.id.relative);
                    if (relativeLayout != null) {
                        i10 = R.id.txt_name_channels;
                        TextView textView = (TextView) d.a(view, R.id.txt_name_channels);
                        if (textView != null) {
                            i10 = R.id.txt_name_video;
                            TextView textView2 = (TextView) d.a(view, R.id.txt_name_video);
                            if (textView2 != null) {
                                i10 = R.id.txt_posting_time_video;
                                TextView textView3 = (TextView) d.a(view, R.id.txt_posting_time_video);
                                if (textView3 != null) {
                                    i10 = R.id.txt_time_video;
                                    TextView textView4 = (TextView) d.a(view, R.id.txt_time_video);
                                    if (textView4 != null) {
                                        i10 = R.id.view_playing;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) d.a(view, R.id.view_playing);
                                        if (relativeLayout2 != null) {
                                            return new q0((RelativeLayout) view, cardView, imageView, imageView2, relativeLayout, textView, textView2, textView3, textView4, relativeLayout2);
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
    public static q0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static q0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_video_youtube_square_screen, viewGroup, false);
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
