package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class a extends ViewDataBinding {
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f19620t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f19621u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final TextView f19622v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f19623w0;

    public a(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, ImageView imageView) {
        super(obj, view, i10);
        this.f19620t0 = textView;
        this.f19621u0 = textView2;
        this.f19622v0 = textView3;
        this.f19623w0 = imageView;
    }

    public static a m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static a n1(@m0 View view, @o0 Object obj) {
        return (a) ViewDataBinding.o(obj, view, a.l.activity_option_login);
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
        return (a) ViewDataBinding.a0(layoutInflater, a.l.activity_option_login, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static a r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (a) ViewDataBinding.a0(layoutInflater, a.l.activity_option_login, (ViewGroup) null, false, obj);
    }
}
