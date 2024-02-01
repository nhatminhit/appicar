package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public abstract class s0 extends ViewDataBinding {
    @m0
    public final ListView A0;
    @m0
    public final RecyclerView B0;
    @m0
    public final Spinner C0;
    @m0
    public final TextView D0;
    @m0
    public final TextView E0;
    @m0
    public final RelativeLayout F0;
    @m0
    public final TextView G0;
    @m0
    public final TextView H0;
    @m0
    public final TextView I0;
    @m0
    public final TextView J0;
    @m0
    public final TextView K0;
    @m0
    public final TextView L0;
    @m0
    public final TextView M0;
    @m0
    public final TextView N0;
    @m0
    public final TextView O0;
    @m0
    public final TextView P0;
    @m0
    public final TextView Q0;
    @m0
    public final TextView R0;
    @m0
    public final TextView S0;
    @m0
    public final RelativeLayout T0;
    @m0
    public final RelativeLayout U0;
    @m0
    public final RelativeLayout V0;
    @m0
    public final RelativeLayout W0;
    @m0
    public final RelativeLayout X0;
    @m0
    public final RelativeLayout Y0;
    @m0
    public final View Z0;
    @m0

    /* renamed from: a1  reason: collision with root package name */
    public final RelativeLayout f25188a1;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final TextView f25189t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f25190u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f25191v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f25192w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final ImageView f25193x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f25194y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final ImageView f25195z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s0(Object obj, View view, int i10, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ListView listView, RecyclerView recyclerView, Spinner spinner, TextView textView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, View view2, RelativeLayout relativeLayout8) {
        super(obj, view, i10);
        this.f25189t0 = textView;
        this.f25190u0 = imageView;
        this.f25191v0 = imageView2;
        this.f25192w0 = imageView3;
        this.f25193x0 = imageView4;
        this.f25194y0 = imageView5;
        this.f25195z0 = imageView6;
        this.A0 = listView;
        this.B0 = recyclerView;
        this.C0 = spinner;
        this.D0 = textView2;
        this.E0 = textView3;
        this.F0 = relativeLayout;
        this.G0 = textView4;
        this.H0 = textView5;
        this.I0 = textView6;
        this.J0 = textView7;
        this.K0 = textView8;
        this.L0 = textView9;
        this.M0 = textView10;
        this.N0 = textView11;
        this.O0 = textView12;
        this.P0 = textView13;
        this.Q0 = textView14;
        this.R0 = textView15;
        this.S0 = textView16;
        this.T0 = relativeLayout2;
        this.U0 = relativeLayout3;
        this.V0 = relativeLayout4;
        this.W0 = relativeLayout5;
        this.X0 = relativeLayout6;
        this.Y0 = relativeLayout7;
        this.Z0 = view2;
        this.f25188a1 = relativeLayout8;
    }

    public static s0 m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static s0 n1(@m0 View view, @o0 Object obj) {
        return (s0) ViewDataBinding.o(obj, view, R.layout.setting);
    }

    @m0
    public static s0 o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static s0 p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static s0 q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (s0) ViewDataBinding.a0(layoutInflater, R.layout.setting, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static s0 r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (s0) ViewDataBinding.a0(layoutInflater, R.layout.setting, (ViewGroup) null, false, obj);
    }
}
