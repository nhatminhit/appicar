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

public final class g implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;
    @m0
    public final TextView Q;
    @m0
    public final ProgressBar R;
    @m0
    public final TextView S;
    @m0
    public final TextView T;

    public g(@m0 RelativeLayout relativeLayout, @m0 TextView textView, @m0 TextView textView2, @m0 ProgressBar progressBar, @m0 TextView textView3, @m0 TextView textView4) {
        this.O = relativeLayout;
        this.P = textView;
        this.Q = textView2;
        this.R = progressBar;
        this.S = textView3;
        this.T = textView4;
    }

    @m0
    public static g a(@m0 View view) {
        int i10 = R.id.bt_cancel;
        TextView textView = (TextView) d.a(view, R.id.bt_cancel);
        if (textView != null) {
            i10 = R.id.bt_logout_device;
            TextView textView2 = (TextView) d.a(view, R.id.bt_logout_device);
            if (textView2 != null) {
                i10 = R.id.progress_bar_device_limit;
                ProgressBar progressBar = (ProgressBar) d.a(view, R.id.progress_bar_device_limit);
                if (progressBar != null) {
                    i10 = R.id.txt_note_title_Device;
                    TextView textView3 = (TextView) d.a(view, R.id.txt_note_title_Device);
                    if (textView3 != null) {
                        i10 = R.id.txt_title_device;
                        TextView textView4 = (TextView) d.a(view, R.id.txt_title_device);
                        if (textView4 != null) {
                            return new g((RelativeLayout) view, textView, textView2, progressBar, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static g c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static g d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_device, viewGroup, false);
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
