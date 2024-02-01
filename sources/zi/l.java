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

public final class l implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;
    @m0
    public final ProgressBar Q;
    @m0
    public final TextView R;
    @m0
    public final TextView S;

    public l(@m0 RelativeLayout relativeLayout, @m0 TextView textView, @m0 ProgressBar progressBar, @m0 TextView textView2, @m0 TextView textView3) {
        this.O = relativeLayout;
        this.P = textView;
        this.Q = progressBar;
        this.R = textView2;
        this.S = textView3;
    }

    @m0
    public static l a(@m0 View view) {
        int i10 = R.id.bt_exit;
        TextView textView = (TextView) d.a(view, R.id.bt_exit);
        if (textView != null) {
            i10 = R.id.progressBarDeviceLimit;
            ProgressBar progressBar = (ProgressBar) d.a(view, R.id.progressBarDeviceLimit);
            if (progressBar != null) {
                i10 = R.id.txt_content;
                TextView textView2 = (TextView) d.a(view, R.id.txt_content);
                if (textView2 != null) {
                    i10 = R.id.txt_title;
                    TextView textView3 = (TextView) d.a(view, R.id.txt_title);
                    if (textView3 != null) {
                        return new l((RelativeLayout) view, textView, progressBar, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static l c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static l d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_notification, viewGroup, false);
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
