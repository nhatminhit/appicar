package hi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import d.m0;
import d.o0;
import vn.icar.baseauthentication.a;

public abstract class i extends ViewDataBinding {
    @m0
    public final ImageView A0;
    @m0
    public final ProgressBar B0;
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
    public final TextView H0;
    @m0
    public final TextView I0;
    @m0
    public final RelativeLayout J0;
    @m0
    public final RelativeLayout K0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f19648t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final TextView f19649u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final CardView f19650v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final EditText f19651w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final EditText f19652x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final EditText f19653y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final EditText f19654z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Object obj, View view, int i10, TextView textView, TextView textView2, CardView cardView, EditText editText, EditText editText2, EditText editText3, EditText editText4, ImageView imageView, ProgressBar progressBar, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, RelativeLayout relativeLayout, RelativeLayout relativeLayout2) {
        super(obj, view, i10);
        this.f19648t0 = textView;
        this.f19649u0 = textView2;
        this.f19650v0 = cardView;
        this.f19651w0 = editText;
        this.f19652x0 = editText2;
        this.f19653y0 = editText3;
        this.f19654z0 = editText4;
        this.A0 = imageView;
        this.B0 = progressBar;
        this.C0 = textView3;
        this.D0 = textView4;
        this.E0 = textView5;
        this.F0 = textView6;
        this.G0 = textView7;
        this.H0 = textView8;
        this.I0 = textView9;
        this.J0 = relativeLayout;
        this.K0 = relativeLayout2;
    }

    public static i m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static i n1(@m0 View view, @o0 Object obj) {
        return (i) ViewDataBinding.o(obj, view, a.l.view_forgot_password);
    }

    @m0
    public static i o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static i p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static i q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (i) ViewDataBinding.a0(layoutInflater, a.l.view_forgot_password, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static i r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (i) ViewDataBinding.a0(layoutInflater, a.l.view_forgot_password, (ViewGroup) null, false, obj);
    }
}
