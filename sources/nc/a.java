package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import com.tatv.baseapp.a;
import com.tatv.baseapp.view.tview.rounded.RoundedRelativeLayout;
import d.m0;
import d.o0;

public abstract class a extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final LinearLayout f21210t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final RoundedRelativeLayout f21211u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final TextView f21212v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f21213w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f21214x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final TextView f21215y0;

    public a(Object obj, View view, int i10, LinearLayout linearLayout, RoundedRelativeLayout roundedRelativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i10);
        this.f21210t0 = linearLayout;
        this.f21211u0 = roundedRelativeLayout;
        this.f21212v0 = textView;
        this.f21213w0 = textView2;
        this.f21214x0 = textView3;
        this.f21215y0 = textView4;
    }

    public static a m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static a n1(@m0 View view, @o0 Object obj) {
        return (a) ViewDataBinding.o(obj, view, a.l.dialog_confirm);
    }

    @m0
    public static a o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static a p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static a q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (a) ViewDataBinding.a0(layoutInflater, a.l.dialog_confirm, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static a r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (a) ViewDataBinding.a0(layoutInflater, a.l.dialog_confirm, (ViewGroup) null, false, obj);
    }
}
