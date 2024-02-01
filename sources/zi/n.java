package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class n implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ProgressBar P;
    @m0
    public final TextView Q;

    public n(@m0 RelativeLayout relativeLayout, @m0 ProgressBar progressBar, @m0 TextView textView) {
        this.O = relativeLayout;
        this.P = progressBar;
        this.Q = textView;
    }

    @m0
    public static n a(@m0 View view) {
        int i10 = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) d.a(view, R.id.progress_bar);
        if (progressBar != null) {
            i10 = R.id.txt_title;
            TextView textView = (TextView) d.a(view, R.id.txt_title);
            if (textView != null) {
                return new n((RelativeLayout) view, progressBar, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static n c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static n d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_update, viewGroup, false);
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
