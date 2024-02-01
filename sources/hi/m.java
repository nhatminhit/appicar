package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class m extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f19662t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f19663u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ProgressBar f19664v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f19665w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f19666x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final RelativeLayout f19667y0;

    public m(Object obj, View view, int i10, TextView textView, TextView textView2, ProgressBar progressBar, TextView textView3, TextView textView4, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f19662t0 = textView;
        this.f19663u0 = textView2;
        this.f19664v0 = progressBar;
        this.f19665w0 = textView3;
        this.f19666x0 = textView4;
        this.f19667y0 = relativeLayout;
    }

    public static m m1(@m0 View view) {
        return n1(view, androidx.databinding.m.i());
    }

    @Deprecated
    public static m n1(@m0 View view, @o0 Object obj) {
        return (m) ViewDataBinding.o(obj, view, a.l.view_option_login);
    }

    @m0
    public static m o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, androidx.databinding.m.i());
    }

    @m0
    public static m p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, androidx.databinding.m.i());
    }

    @Deprecated
    @m0
    public static m q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (m) ViewDataBinding.a0(layoutInflater, a.l.view_option_login, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static m r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (m) ViewDataBinding.a0(layoutInflater, a.l.view_option_login, (ViewGroup) null, false, obj);
    }
}
