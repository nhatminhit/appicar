package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class c extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f19627t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f19628u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f19629v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ProgressBar f19630w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final TextView f19631x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f19632y0;

    public c(Object obj, View view, int i10, ImageView imageView, TextView textView, ImageView imageView2, ProgressBar progressBar, TextView textView2, ImageView imageView3) {
        super(obj, view, i10);
        this.f19627t0 = imageView;
        this.f19628u0 = textView;
        this.f19629v0 = imageView2;
        this.f19630w0 = progressBar;
        this.f19631x0 = textView2;
        this.f19632y0 = imageView3;
    }

    public static c m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static c n1(@m0 View view, @o0 Object obj) {
        return (c) ViewDataBinding.o(obj, view, a.l.activity_qr_auth);
    }

    @m0
    public static c o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static c p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static c q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (c) ViewDataBinding.a0(layoutInflater, a.l.activity_qr_auth, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static c r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (c) ViewDataBinding.a0(layoutInflater, a.l.activity_qr_auth, (ViewGroup) null, false, obj);
    }
}
