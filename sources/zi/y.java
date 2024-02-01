package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import d.m0;
import d.o0;
import vn.icar.entertaiment.R;

public abstract class y extends ViewDataBinding {
    @m0
    public final TextView A0;
    @m0
    public final TextView B0;
    @m0
    public final TextView C0;
    @m0
    public final TextView D0;
    @m0
    public final View E0;
    @m0
    public final RelativeLayout F0;
    @m0
    public final RelativeLayout G0;
    @m0
    public final RelativeLayout H0;
    @m0
    public final RelativeLayout I0;
    @m0
    public final RelativeLayout J0;
    @m0
    public final YouTubePlayerView K0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f25247t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageButton f25248u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final RelativeLayout f25249v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final SeekBar f25250w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final RecyclerView f25251x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final SwipeRefreshLayout f25252y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final RelativeLayout f25253z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(Object obj, View view, int i10, ImageView imageView, ImageButton imageButton, RelativeLayout relativeLayout, SeekBar seekBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, YouTubePlayerView youTubePlayerView) {
        super(obj, view, i10);
        this.f25247t0 = imageView;
        this.f25248u0 = imageButton;
        this.f25249v0 = relativeLayout;
        this.f25250w0 = seekBar;
        this.f25251x0 = recyclerView;
        this.f25252y0 = swipeRefreshLayout;
        this.f25253z0 = relativeLayout2;
        this.A0 = textView;
        this.B0 = textView2;
        this.C0 = textView3;
        this.D0 = textView4;
        this.E0 = view2;
        this.F0 = relativeLayout3;
        this.G0 = relativeLayout4;
        this.H0 = relativeLayout5;
        this.I0 = relativeLayout6;
        this.J0 = relativeLayout7;
        this.K0 = youTubePlayerView;
    }

    public static y m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static y n1(@m0 View view, @o0 Object obj) {
        return (y) ViewDataBinding.o(obj, view, R.layout.fragment_youtobe);
    }

    @m0
    public static y o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static y p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static y q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (y) ViewDataBinding.a0(layoutInflater, R.layout.fragment_youtobe, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static y r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (y) ViewDataBinding.a0(layoutInflater, R.layout.fragment_youtobe, (ViewGroup) null, false, obj);
    }
}
