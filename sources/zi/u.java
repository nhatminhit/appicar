package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public abstract class u extends ViewDataBinding {
    @m0
    public final RelativeLayout A0;
    @m0
    public final PlayerView B0;
    @m0
    public final ProgressBar C0;
    @m0
    public final RecyclerView D0;
    @m0
    public final SwipeRefreshLayout E0;
    @m0
    public final TextView F0;
    @m0
    public final TextView G0;
    @m0
    public final TextView H0;
    @m0
    public final View I0;
    @m0
    public final RelativeLayout J0;
    @m0
    public final RelativeLayout K0;
    @m0
    public final RelativeLayout L0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final CardView f25200t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f25201u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageView f25202v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f25203w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final ImageView f25204x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f25205y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final ImageView f25206z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Object obj, View view, int i10, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, RelativeLayout relativeLayout, PlayerView playerView, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, View view2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4) {
        super(obj, view, i10);
        this.f25200t0 = cardView;
        this.f25201u0 = imageView;
        this.f25202v0 = imageView2;
        this.f25203w0 = imageView3;
        this.f25204x0 = imageView4;
        this.f25205y0 = imageView5;
        this.f25206z0 = imageView6;
        this.A0 = relativeLayout;
        this.B0 = playerView;
        this.C0 = progressBar;
        this.D0 = recyclerView;
        this.E0 = swipeRefreshLayout;
        this.F0 = textView;
        this.G0 = textView2;
        this.H0 = textView3;
        this.I0 = view2;
        this.J0 = relativeLayout2;
        this.K0 = relativeLayout3;
        this.L0 = relativeLayout4;
    }

    public static u m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static u n1(@m0 View view, @o0 Object obj) {
        return (u) ViewDataBinding.o(obj, view, R.layout.fragment_tv);
    }

    @m0
    public static u o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static u p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static u q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (u) ViewDataBinding.a0(layoutInflater, R.layout.fragment_tv, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static u r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (u) ViewDataBinding.a0(layoutInflater, R.layout.fragment_tv, (ViewGroup) null, false, obj);
    }
}
