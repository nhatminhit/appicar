package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import d.m0;
import d.o0;
import l3.c;
import vn.icar.entertaiment.R;

public final class c1 implements c {
    @m0
    public final RelativeLayout O;

    public c1(@m0 RelativeLayout relativeLayout) {
        this.O = relativeLayout;
    }

    @m0
    public static c1 a(@m0 View view) {
        if (view != null) {
            return new c1((RelativeLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @m0
    public static c1 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static c1 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_initial_layout, viewGroup, false);
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
