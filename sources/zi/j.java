package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class j implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final EditText P;
    @m0
    public final RecyclerView Q;
    @m0
    public final RelativeLayout R;
    @m0
    public final TextView S;
    @m0
    public final View T;

    public j(@m0 RelativeLayout relativeLayout, @m0 EditText editText, @m0 RecyclerView recyclerView, @m0 RelativeLayout relativeLayout2, @m0 TextView textView, @m0 View view) {
        this.O = relativeLayout;
        this.P = editText;
        this.Q = recyclerView;
        this.R = relativeLayout2;
        this.S = textView;
        this.T = view;
    }

    @m0
    public static j a(@m0 View view) {
        int i10 = R.id.edt_search_channels;
        EditText editText = (EditText) d.a(view, R.id.edt_search_channels);
        if (editText != null) {
            i10 = R.id.recycler_channel;
            RecyclerView recyclerView = (RecyclerView) d.a(view, R.id.recycler_channel);
            if (recyclerView != null) {
                i10 = R.id.relative_search;
                RelativeLayout relativeLayout = (RelativeLayout) d.a(view, R.id.relative_search);
                if (relativeLayout != null) {
                    i10 = R.id.txt_title;
                    TextView textView = (TextView) d.a(view, R.id.txt_title);
                    if (textView != null) {
                        i10 = R.id.view;
                        View a10 = d.a(view, R.id.view);
                        if (a10 != null) {
                            return new j((RelativeLayout) view, editText, recyclerView, relativeLayout, textView, a10);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static j c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static j d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.dialog_list_channels, viewGroup, false);
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
