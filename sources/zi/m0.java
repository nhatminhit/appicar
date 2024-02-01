package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class m0 implements c {
    @d.m0
    public final RelativeLayout O;
    @d.m0
    public final ImageView P;
    @d.m0
    public final TextView Q;
    @d.m0
    public final TextView R;
    @d.m0
    public final RelativeLayout S;

    public m0(@d.m0 RelativeLayout relativeLayout, @d.m0 ImageView imageView, @d.m0 TextView textView, @d.m0 TextView textView2, @d.m0 RelativeLayout relativeLayout2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = textView;
        this.R = textView2;
        this.S = relativeLayout2;
    }

    @d.m0
    public static m0 a(@d.m0 View view) {
        int i10 = R.id.img_music;
        ImageView imageView = (ImageView) d.a(view, R.id.img_music);
        if (imageView != null) {
            i10 = R.id.txt_name;
            TextView textView = (TextView) d.a(view, R.id.txt_name);
            if (textView != null) {
                i10 = R.id.txt_time;
                TextView textView2 = (TextView) d.a(view, R.id.txt_time);
                if (textView2 != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new m0(relativeLayout, imageView, textView, textView2, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @d.m0
    public static m0 c(@d.m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @d.m0
    public static m0 d(@d.m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_music_and_video_offline, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @d.m0
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.O;
    }
}
