package zi;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import d.m0;
import d.o0;
import pl.droidsonroids.gif.GifTextView;
import vn.icar.entertaiment.R;

public abstract class q extends ViewDataBinding {
    @m0
    public final RecyclerView A0;
    @m0
    public final SwipeRefreshLayout B0;
    @m0
    public final SurfaceView C0;
    @m0
    public final TextView D0;
    @m0
    public final TextView E0;
    @m0
    public final TextView F0;
    @m0
    public final TextView G0;
    @m0
    public final View H0;
    @m0
    public final RelativeLayout I0;
    @m0
    public final GifTextView J0;
    @m0
    public final RelativeLayout K0;
    @m0
    public final RelativeLayout L0;
    @m0
    public final RelativeLayout M0;
    @m0
    public final RelativeLayout N0;
    @m0

    /* renamed from: t0  reason: collision with root package name */
    public final ViewPager f25174t0;
    @m0

    /* renamed from: u0  reason: collision with root package name */
    public final ImageView f25175u0;
    @m0

    /* renamed from: v0  reason: collision with root package name */
    public final ImageButton f25176v0;
    @m0

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f25177w0;
    @m0

    /* renamed from: x0  reason: collision with root package name */
    public final RelativeLayout f25178x0;
    @m0

    /* renamed from: y0  reason: collision with root package name */
    public final SeekBar f25179y0;
    @m0

    /* renamed from: z0  reason: collision with root package name */
    public final ProgressBar f25180z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Object obj, View view, int i10, ViewPager viewPager, ImageView imageView, ImageButton imageButton, ImageView imageView2, RelativeLayout relativeLayout, SeekBar seekBar, ProgressBar progressBar, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SurfaceView surfaceView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2, RelativeLayout relativeLayout2, GifTextView gifTextView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6) {
        super(obj, view, i10);
        this.f25174t0 = viewPager;
        this.f25175u0 = imageView;
        this.f25176v0 = imageButton;
        this.f25177w0 = imageView2;
        this.f25178x0 = relativeLayout;
        this.f25179y0 = seekBar;
        this.f25180z0 = progressBar;
        this.A0 = recyclerView;
        this.B0 = swipeRefreshLayout;
        this.C0 = surfaceView;
        this.D0 = textView;
        this.E0 = textView2;
        this.F0 = textView3;
        this.G0 = textView4;
        this.H0 = view2;
        this.I0 = relativeLayout2;
        this.J0 = gifTextView;
        this.K0 = relativeLayout3;
        this.L0 = relativeLayout4;
        this.M0 = relativeLayout5;
        this.N0 = relativeLayout6;
    }

    public static q m1(@m0 View view) {
        return n1(view, m.i());
    }

    @Deprecated
    public static q n1(@m0 View view, @o0 Object obj) {
        return (q) ViewDataBinding.o(obj, view, R.layout.fragment_music_and_video_offline);
    }

    @m0
    public static q o1(@m0 LayoutInflater layoutInflater) {
        return r1(layoutInflater, m.i());
    }

    @m0
    public static q p1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        return q1(layoutInflater, viewGroup, z10, m.i());
    }

    @Deprecated
    @m0
    public static q q1(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10, @o0 Object obj) {
        return (q) ViewDataBinding.a0(layoutInflater, R.layout.fragment_music_and_video_offline, viewGroup, z10, obj);
    }

    @Deprecated
    @m0
    public static q r1(@m0 LayoutInflater layoutInflater, @o0 Object obj) {
        return (q) ViewDataBinding.a0(layoutInflater, R.layout.fragment_music_and_video_offline, (ViewGroup) null, false, obj);
    }
}
