package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class k extends ViewDataBinding {
    @m0
    public final TextView A0;
    @m0
    public final TextView B0;
    @m0
    public final TextView C0;
    @m0
    public final TextView D0;
    @m0
    public final TextView E0;
    @m0
    public final TextView F0;
    @m0
    public final TextView G0;
    @m0
    public final RelativeLayout H0;
    @m0
    public final View I0;
    @m0
    public final View J0;
    @m0
    public final RelativeLayout K0;
    @m0
    public final LinearLayout L0;
    @m0
    public final LinearLayout M0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f19655t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f19656u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final EditText f19657v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final EditText f19658w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final ImageView f19659x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f19660y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final ProgressBar f19661z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Object obj, View view, int i10, TextView textView, TextView textView2, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, ProgressBar progressBar, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, RelativeLayout relativeLayout, View view2, View view3, RelativeLayout relativeLayout2, LinearLayout linearLayout, LinearLayout linearLayout2) {
        super(obj, view, i10);
        this.f19655t0 = textView;
        this.f19656u0 = textView2;
        this.f19657v0 = editText;
        this.f19658w0 = editText2;
        this.f19659x0 = imageView;
        this.f19660y0 = imageView2;
        this.f19661z0 = progressBar;
        this.A0 = textView3;
        this.B0 = textView4;
        this.C0 = textView5;
        this.D0 = textView6;
        this.E0 = textView7;
        this.F0 = textView8;
        this.G0 = textView9;
        this.H0 = relativeLayout;
        this.I0 = view2;
        this.J0 = view3;
        this.K0 = relativeLayout2;
        this.L0 = linearLayout;
        this.M0 = linearLayout2;
    }

    public static k m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static k n1(@m0 View view, @o0 Object obj) {
        return (k) ViewDataBinding.o(obj, view, a.l.view_login);
    }

    @m0
    public static k o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static k p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static k q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (k) ViewDataBinding.a0(layoutInflater, a.l.view_login, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static k r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (k) ViewDataBinding.a0(layoutInflater, a.l.view_login, (ViewGroup) null, false, obj);
    }
}
