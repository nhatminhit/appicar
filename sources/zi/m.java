package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import pl.droidsonroids.gif.GifTextView;
import vn.icar.entertaiment.R;

public final class m implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final GifTextView P;
    @m0
    public final GifTextView Q;
    @m0
    public final GifTextView R;
    @m0
    public final TextView S;
    @m0
    public final TextView T;
    @m0
    public final TextView U;
    @m0
    public final CardView V;

    public m(@m0 RelativeLayout relativeLayout, @m0 GifTextView gifTextView, @m0 GifTextView gifTextView2, @m0 GifTextView gifTextView3, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3, @m0 CardView cardView) {
        this.O = relativeLayout;
        this.P = gifTextView;
        this.Q = gifTextView2;
        this.R = gifTextView3;
        this.S = textView;
        this.T = textView2;
        this.U = textView3;
        this.V = cardView;
    }

    @m0
    public static m a(@m0 View view) {
        int i10 = R.id.gif_done;
        GifTextView gifTextView = (GifTextView) d.a(view, R.id.gif_done);
        if (gifTextView != null) {
            i10 = R.id.gif_speaking;
            GifTextView gifTextView2 = (GifTextView) d.a(view, R.id.gif_speaking);
            if (gifTextView2 != null) {
                i10 = R.id.gif_waiting;
                GifTextView gifTextView3 = (GifTextView) d.a(view, R.id.gif_waiting);
                if (gifTextView3 != null) {
                    i10 = R.id.txt_content;
                    TextView textView = (TextView) d.a(view, R.id.txt_content);
                    if (textView != null) {
                        i10 = R.id.txt_language;
                        TextView textView2 = (TextView) d.a(view, R.id.txt_language);
                        if (textView2 != null) {
                            i10 = R.id.txt_title;
                            TextView textView3 = (TextView) d.a(view, R.id.txt_title);
                            if (textView3 != null) {
                                i10 = R.id.view;
                                CardView cardView = (CardView) d.a(view, R.id.view);
                                if (cardView != null) {
                                    return new m((RelativeLayout) view, gifTextView, gifTextView2, gifTextView3, textView, textView2, textView3, cardView);
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
    public static m c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static m d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_speech_to_text, viewGroup, false);
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
