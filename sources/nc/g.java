package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.tatv.baseapp.a;
import com.tatv.baseapp.view.tview.rounded.RoundedRelativeLayout;
import d.m0;
import d.o0;

public abstract class g extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final RoundedRelativeLayout f21231t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f21232u0;

    public g(Object obj, View view, int i10, RoundedRelativeLayout roundedRelativeLayout, TextView textView) {
        super(obj, view, i10);
        this.f21231t0 = roundedRelativeLayout;
        this.f21232u0 = textView;
    }

    public static g m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static g n1(@m0 View view, @o0 Object obj) {
        return (g) ViewDataBinding.o(obj, view, a.l.dialog_report);
    }

    @m0
    public static g o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static g p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static g q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (g) ViewDataBinding.a0(layoutInflater, a.l.dialog_report, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static g r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (g) ViewDataBinding.a0(layoutInflater, a.l.dialog_report, (ViewGroup) null, false, obj);
    }
}
