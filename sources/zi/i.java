package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class i implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final TextView P;
    @m0
    public final TextView Q;
    @m0
    public final TextView R;

    public i(@m0 RelativeLayout relativeLayout, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3) {
        this.O = relativeLayout;
        this.P = textView;
        this.Q = textView2;
        this.R = textView3;
    }

    @m0
    public static i a(@m0 View view) {
        int i10 = R.id.bt_update;
        TextView textView = (TextView) d.a(view, R.id.bt_update);
        if (textView != null) {
            i10 = R.id.txt_note_license;
            TextView textView2 = (TextView) d.a(view, R.id.txt_note_license);
            if (textView2 != null) {
                i10 = R.id.txt_title_license;
                TextView textView3 = (TextView) d.a(view, R.id.txt_title_license);
                if (textView3 != null) {
                    return new i((RelativeLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static i c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static i d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_license, viewGroup, false);
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
