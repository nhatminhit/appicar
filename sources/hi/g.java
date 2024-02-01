package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class g extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final CardView f19641t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f19642u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RecyclerView f19643v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final TextView f19644w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f19645x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final RelativeLayout f19646y0;

    public g(Object obj, View view, int i10, CardView cardView, ImageView imageView, RecyclerView recyclerView, TextView textView, TextView textView2, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.f19641t0 = cardView;
        this.f19642u0 = imageView;
        this.f19643v0 = recyclerView;
        this.f19644w0 = textView;
        this.f19645x0 = textView2;
        this.f19646y0 = relativeLayout;
    }

    public static g m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static g n1(@m0 View view, @o0 Object obj) {
        return (g) ViewDataBinding.o(obj, view, a.l.view_device_limit);
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
        return (g) ViewDataBinding.a0(layoutInflater, a.l.view_device_limit, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static g r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (g) ViewDataBinding.a0(layoutInflater, a.l.view_device_limit, (ViewGroup) null, false, obj);
    }
}
