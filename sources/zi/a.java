package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public abstract class a extends ViewDataBinding {
    @m0
    public final LinearLayout A0;
    @m0
    public final s0 B0;
    @m0
    public final ImageView C0;
    @m0
    public final ListView D0;
    @m0
    public final View E0;
    @m0
    public final ProgressBar F0;
    @m0
    public final RecyclerView G0;
    @m0
    public final ImageView H0;
    @m0
    public final TextView I0;
    @m0
    public final TextView J0;
    @m0
    public final TextView K0;
    @m0
    public final View L0;
    @m0
    public final RelativeLayout M0;
    @m0
    public final CardView N0;
    @m0
    public final RelativeLayout O0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final EditText f25129t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f25130u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f25131v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f25132w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final ImageView f25133x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f25134y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final FrameLayout f25135z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Object obj, View view, int i10, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, FrameLayout frameLayout, LinearLayout linearLayout, s0 s0Var, ImageView imageView6, ListView listView, View view2, ProgressBar progressBar, RecyclerView recyclerView, ImageView imageView7, TextView textView, TextView textView2, TextView textView3, View view3, RelativeLayout relativeLayout, CardView cardView, RelativeLayout relativeLayout2) {
        super(obj, view, i10);
        this.f25129t0 = editText;
        this.f25130u0 = imageView;
        this.f25131v0 = imageView2;
        this.f25132w0 = imageView3;
        this.f25133x0 = imageView4;
        this.f25134y0 = imageView5;
        this.f25135z0 = frameLayout;
        this.A0 = linearLayout;
        this.B0 = s0Var;
        this.C0 = imageView6;
        this.D0 = listView;
        this.E0 = view2;
        this.F0 = progressBar;
        this.G0 = recyclerView;
        this.H0 = imageView7;
        this.I0 = textView;
        this.J0 = textView2;
        this.K0 = textView3;
        this.L0 = view3;
        this.M0 = relativeLayout;
        this.N0 = cardView;
        this.O0 = relativeLayout2;
    }

    public static a m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static a n1(@m0 View view, @o0 Object obj) {
        return (a) ViewDataBinding.o(obj, view, R.layout.activity_home);
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
        return (a) ViewDataBinding.a0(layoutInflater, R.layout.activity_home, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static a r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (a) ViewDataBinding.a0(layoutInflater, R.layout.activity_home, (ViewGroup) null, false, obj);
    }
}
