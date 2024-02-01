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

public final class e0 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final CardView P;
    @m0
    public final ImageView Q;
    @m0
    public final ImageView R;
    @m0
    public final TextView S;

    public e0(@m0 RelativeLayout relativeLayout, @m0 CardView cardView, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 TextView textView) {
        this.O = relativeLayout;
        this.P = cardView;
        this.Q = imageView;
        this.R = imageView2;
        this.S = textView;
    }

    @m0
    public static e0 a(@m0 View view) {
        int i10 = R.id.card_channel;
        CardView cardView = (CardView) d.a(view, R.id.card_channel);
        if (cardView != null) {
            i10 = R.id.img_channel;
            ImageView imageView = (ImageView) d.a(view, R.id.img_channel);
            if (imageView != null) {
                i10 = R.id.tg_channel;
                ImageView imageView2 = (ImageView) d.a(view, R.id.tg_channel);
                if (imageView2 != null) {
                    i10 = R.id.txt_channel;
                    TextView textView = (TextView) d.a(view, R.id.txt_channel);
                    if (textView != null) {
                        return new e0((RelativeLayout) view, cardView, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static e0 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static e0 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_channel, viewGroup, false);
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
