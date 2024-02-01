package zi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import l3.c;
import l3.d;
import vn.icar.entertaiment.R;

public final class b1 implements c {
    @m0
    public final RelativeLayout O;
    @m0
    public final ImageView P;
    @m0
    public final ImageView Q;
    @m0
    public final ImageView R;
    @m0
    public final ImageView S;
    @m0
    public final ImageView T;
    @m0
    public final ImageView U;
    @m0
    public final ImageView V;
    @m0
    public final ImageView W;
    @m0
    public final ListView X;
    @m0
    public final ProgressBar Y;
    @m0
    public final TextView Z;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public final TextView f25147a0;
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f25148b0;
    @m0

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f25149c0;
    @m0

    /* renamed from: d0  reason: collision with root package name */
    public final TextView f25150d0;
    @m0

    /* renamed from: e0  reason: collision with root package name */
    public final TextView f25151e0;
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public final LinearLayout f25152f0;
    @m0

    /* renamed from: g0  reason: collision with root package name */
    public final RelativeLayout f25153g0;
    @m0

    /* renamed from: h0  reason: collision with root package name */
    public final RelativeLayout f25154h0;
    @m0

    /* renamed from: i0  reason: collision with root package name */
    public final RelativeLayout f25155i0;
    @m0

    /* renamed from: j0  reason: collision with root package name */
    public final RelativeLayout f25156j0;
    @m0

    /* renamed from: k0  reason: collision with root package name */
    public final ListView f25157k0;

    public b1(@m0 RelativeLayout relativeLayout, @m0 ImageView imageView, @m0 ImageView imageView2, @m0 ImageView imageView3, @m0 ImageView imageView4, @m0 ImageView imageView5, @m0 ImageView imageView6, @m0 ImageView imageView7, @m0 ImageView imageView8, @m0 ListView listView, @m0 ProgressBar progressBar, @m0 TextView textView, @m0 TextView textView2, @m0 TextView textView3, @m0 TextView textView4, @m0 TextView textView5, @m0 TextView textView6, @m0 LinearLayout linearLayout, @m0 RelativeLayout relativeLayout2, @m0 RelativeLayout relativeLayout3, @m0 RelativeLayout relativeLayout4, @m0 RelativeLayout relativeLayout5, @m0 ListView listView2) {
        this.O = relativeLayout;
        this.P = imageView;
        this.Q = imageView2;
        this.R = imageView3;
        this.S = imageView4;
        this.T = imageView5;
        this.U = imageView6;
        this.V = imageView7;
        this.W = imageView8;
        this.X = listView;
        this.Y = progressBar;
        this.Z = textView;
        this.f25147a0 = textView2;
        this.f25148b0 = textView3;
        this.f25149c0 = textView4;
        this.f25150d0 = textView5;
        this.f25151e0 = textView6;
        this.f25152f0 = linearLayout;
        this.f25153g0 = relativeLayout2;
        this.f25154h0 = relativeLayout3;
        this.f25155i0 = relativeLayout4;
        this.f25156j0 = relativeLayout5;
        this.f25157k0 = listView2;
    }

    @m0
    public static b1 a(@m0 View view) {
        View view2 = view;
        int i10 = R.id.imgBackground;
        ImageView imageView = (ImageView) d.a(view2, R.id.imgBackground);
        if (imageView != null) {
            i10 = R.id.imgClose;
            ImageView imageView2 = (ImageView) d.a(view2, R.id.imgClose);
            if (imageView2 != null) {
                i10 = R.id.imgDown;
                ImageView imageView3 = (ImageView) d.a(view2, R.id.imgDown);
                if (imageView3 != null) {
                    i10 = R.id.imgList;
                    ImageView imageView4 = (ImageView) d.a(view2, R.id.imgList);
                    if (imageView4 != null) {
                        i10 = R.id.imgLogo;
                        ImageView imageView5 = (ImageView) d.a(view2, R.id.imgLogo);
                        if (imageView5 != null) {
                            i10 = R.id.imgPlay;
                            ImageView imageView6 = (ImageView) d.a(view2, R.id.imgPlay);
                            if (imageView6 != null) {
                                i10 = R.id.imgback;
                                ImageView imageView7 = (ImageView) d.a(view2, R.id.imgback);
                                if (imageView7 != null) {
                                    i10 = R.id.imgnext;
                                    ImageView imageView8 = (ImageView) d.a(view2, R.id.imgnext);
                                    if (imageView8 != null) {
                                        i10 = R.id.listTab;
                                        ListView listView = (ListView) d.a(view2, R.id.listTab);
                                        if (listView != null) {
                                            i10 = R.id.progressBar;
                                            ProgressBar progressBar = (ProgressBar) d.a(view2, R.id.progressBar);
                                            if (progressBar != null) {
                                                i10 = R.id.txtCategories;
                                                TextView textView = (TextView) d.a(view2, R.id.txtCategories);
                                                if (textView != null) {
                                                    i10 = R.id.txtChannel;
                                                    TextView textView2 = (TextView) d.a(view2, R.id.txtChannel);
                                                    if (textView2 != null) {
                                                        i10 = R.id.txtChannels;
                                                        TextView textView3 = (TextView) d.a(view2, R.id.txtChannels);
                                                        if (textView3 != null) {
                                                            i10 = R.id.txtList;
                                                            TextView textView4 = (TextView) d.a(view2, R.id.txtList);
                                                            if (textView4 != null) {
                                                                i10 = R.id.txtTimePlaingVideo;
                                                                TextView textView5 = (TextView) d.a(view2, R.id.txtTimePlaingVideo);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.txtTimeVideo;
                                                                    TextView textView6 = (TextView) d.a(view2, R.id.txtTimeVideo);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.viewControl;
                                                                        LinearLayout linearLayout = (LinearLayout) d.a(view2, R.id.viewControl);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.viewDown;
                                                                            RelativeLayout relativeLayout = (RelativeLayout) d.a(view2, R.id.viewDown);
                                                                            if (relativeLayout != null) {
                                                                                i10 = R.id.viewListRadio;
                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) d.a(view2, R.id.viewListRadio);
                                                                                if (relativeLayout2 != null) {
                                                                                    i10 = R.id.viewRadio;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) d.a(view2, R.id.viewRadio);
                                                                                    if (relativeLayout3 != null) {
                                                                                        i10 = R.id.viewTab;
                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) d.a(view2, R.id.viewTab);
                                                                                        if (relativeLayout4 != null) {
                                                                                            i10 = R.id.widgetListchannels;
                                                                                            ListView listView2 = (ListView) d.a(view2, R.id.widgetListchannels);
                                                                                            if (listView2 != null) {
                                                                                                return new b1((RelativeLayout) view2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, listView, progressBar, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, listView2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @m0
    public static b1 c(@m0 LayoutInflater layoutInflater) {
        return d(layoutInflater, (ViewGroup) null, false);
    }

    @m0
    public static b1 d(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.widget_entertainment_vinfast, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @m0
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.O;
    }
}
