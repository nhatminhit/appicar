package vn.icar.entertaiment.view.fragment;

import aj.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b6.h;
import bc.a;
import bc.p;
import com.google.android.material.badge.BadgeDrawable;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import d.m0;
import gj.a;
import h0.u0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import kj.a;
import oi.i;
import oj.c;
import qj.a;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.view.activity.HomeActivity;
import wi.k;
import wi.l;
import wi.m;
import yi.b;

public class YoutubeFragment extends Fragment implements View.OnClickListener, m, c.b, a.c, yi.c, a.g {
    public static ArrayList<b.a> P1;
    public boolean A1 = false;
    public boolean B1 = false;
    public boolean C1 = true;
    public boolean D1 = false;
    public boolean E1 = false;
    public boolean F1 = false;
    public boolean G1 = false;
    public boolean H1 = false;
    public boolean I1 = false;
    public Handler J1 = new Handler();
    public int K1 = 0;
    public i L1;
    public SwipeRefreshLayout M1;
    public ArrayList<qj.b> N1 = new ArrayList<>();
    public sj.d O1 = new sj.d();
    public Context Y0;
    public String Z0 = YoutubeFragment.class.getSimpleName();

    /* renamed from: a1  reason: collision with root package name */
    public String f23890a1 = "";

    /* renamed from: b1  reason: collision with root package name */
    public String f23891b1 = "";

    /* renamed from: c1  reason: collision with root package name */
    public String f23892c1 = "";

    /* renamed from: d1  reason: collision with root package name */
    public String f23893d1 = "";

    /* renamed from: e1  reason: collision with root package name */
    public String f23894e1 = "";

    /* renamed from: f1  reason: collision with root package name */
    public String f23895f1 = "";

    /* renamed from: g1  reason: collision with root package name */
    public ImageView f23896g1;

    /* renamed from: h1  reason: collision with root package name */
    public ImageView f23897h1;

    /* renamed from: i1  reason: collision with root package name */
    public RelativeLayout f23898i1;

    /* renamed from: j1  reason: collision with root package name */
    public RelativeLayout f23899j1;

    /* renamed from: k1  reason: collision with root package name */
    public RelativeLayout f23900k1;

    /* renamed from: l1  reason: collision with root package name */
    public RelativeLayout f23901l1;

    /* renamed from: m1  reason: collision with root package name */
    public RelativeLayout f23902m1;

    /* renamed from: n1  reason: collision with root package name */
    public RelativeLayout f23903n1;

    /* renamed from: o1  reason: collision with root package name */
    public YouTubePlayerView f23904o1;

    /* renamed from: p1  reason: collision with root package name */
    public TextView f23905p1;

    /* renamed from: q1  reason: collision with root package name */
    public TextView f23906q1;

    /* renamed from: r1  reason: collision with root package name */
    public TextView f23907r1;

    /* renamed from: s1  reason: collision with root package name */
    public TextView f23908s1;

    /* renamed from: t1  reason: collision with root package name */
    public RecyclerView f23909t1;

    /* renamed from: u1  reason: collision with root package name */
    public SeekBar f23910u1;

    /* renamed from: v1  reason: collision with root package name */
    public View f23911v1;

    /* renamed from: w1  reason: collision with root package name */
    public View f23912w1;

    /* renamed from: x1  reason: collision with root package name */
    public float f23913x1 = 0.0f;

    /* renamed from: y1  reason: collision with root package name */
    public float f23914y1 = 0.0f;

    /* renamed from: z1  reason: collision with root package name */
    public boolean f23915z1 = false;

    public class a implements SwipeRefreshLayout.j {
        public a() {
        }

        public void a() {
            YoutubeFragment youtubeFragment;
            ArrayList<String> arrayList;
            String str = ui.a.b().f23398a;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case 98260:
                    if (str.equals(a.e.f16178j)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 106182:
                    if (str.equals(a.e.f16177i)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3377875:
                    if (str.equals(a.e.f16176h)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109770997:
                    if (str.equals(a.e.f16174f)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 672908035:
                    if (str.equals(a.e.f16172d)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 926934164:
                    if (str.equals(a.e.f16175g)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1359515147:
                    if (str.equals(a.e.f16173e)) {
                        c10 = 6;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23410m;
                    break;
                case 1:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23405h;
                    break;
                case 2:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23409l;
                    break;
                case 3:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23407j;
                    break;
                case 4:
                    YoutubeFragment.this.j1();
                    return;
                case 5:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23408k;
                    break;
                case 6:
                    youtubeFragment = YoutubeFragment.this;
                    arrayList = ui.a.b().f23406i;
                    break;
                default:
                    return;
            }
            youtubeFragment.c1(arrayList);
        }
    }

    public class b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f23917a;

        public b(int[] iArr) {
            this.f23917a = iArr;
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            this.f23917a[0] = i10;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            boolean unused = YoutubeFragment.this.E1 = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            boolean unused = YoutubeFragment.this.E1 = false;
            YoutubeFragment.this.f23910u1.setProgress(this.f23917a[0]);
            oj.c.v(YoutubeFragment.this.Y0).y().u((float) this.f23917a[0]);
        }
    }

    public class c implements View.OnTouchListener {
        public final /* synthetic */ int[] O;
        public final /* synthetic */ int[] P;
        public final /* synthetic */ int[] Q;
        public final /* synthetic */ int[] R;
        public final /* synthetic */ boolean[] S;
        public final /* synthetic */ int[] T;
        public final /* synthetic */ int[] U;
        public final /* synthetic */ Handler V;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                c.this.U[0] = 0;
            }
        }

        public c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean[] zArr, int[] iArr5, int[] iArr6, Handler handler) {
            this.O = iArr;
            this.P = iArr2;
            this.Q = iArr3;
            this.R = iArr4;
            this.S = zArr;
            this.T = iArr5;
            this.U = iArr6;
            this.V = handler;
        }

        @SuppressLint({"DefaultLocale"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.O[0] = (int) motionEvent.getX();
            this.P[0] = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.Q[0] = (int) YoutubeFragment.this.f23913x1;
            } else if (action == 1) {
                int[] iArr = this.U;
                int i10 = iArr[0] + 1;
                iArr[0] = i10;
                if (i10 == 1) {
                    boolean[] zArr = this.S;
                    if (zArr[0]) {
                        iArr[0] = 0;
                        zArr[0] = false;
                        YoutubeFragment.this.f23901l1.setVisibility(8);
                        this.R[0] = 9999;
                        if (((float) this.T[0]) >= YoutubeFragment.this.f23914y1) {
                            this.T[0] = (int) (YoutubeFragment.this.f23914y1 - 1.0f);
                        }
                        if (oj.c.v(YoutubeFragment.this.Y0).y() != null) {
                            oj.c.v(YoutubeFragment.this.Y0).y().u((float) this.T[0]);
                        }
                    } else {
                        YoutubeFragment.this.B1();
                        this.R[0] = 9999;
                        YoutubeFragment.this.f23901l1.setVisibility(8);
                        this.V.postDelayed(new a(), 500);
                    }
                } else if (i10 == 2) {
                    YoutubeFragment.this.F1();
                    this.U[0] = 0;
                    this.R[0] = 9999;
                    YoutubeFragment.this.f23901l1.setVisibility(8);
                }
            } else if (action == 2) {
                int[] iArr2 = this.R;
                int i11 = iArr2[0];
                if (i11 == 9999) {
                    iArr2[0] = this.O[0];
                } else if ((this.O[0] - i11) / 5 == 0) {
                    this.S[0] = false;
                } else {
                    this.S[0] = true;
                    YoutubeFragment.this.f23901l1.setVisibility(0);
                    int i12 = this.O[0];
                    int i13 = this.R[0];
                    if (i12 > i13) {
                        int i14 = (i12 - i13) / 5;
                        if (((float) (this.Q[0] + i14)) < YoutubeFragment.this.f23914y1) {
                            this.T[0] = this.Q[0] + i14;
                            TextView X0 = YoutubeFragment.this.f23905p1;
                            X0.setText(BadgeDrawable.f16655n0 + YoutubeFragment.this.h1((float) i14) + "(" + YoutubeFragment.this.h1((float) this.T[0]) + ")");
                        }
                    } else {
                        int i15 = (i13 - i12) / 5;
                        int i16 = this.Q[0];
                        if (i16 - i15 >= 0) {
                            this.T[0] = i16 - i15;
                            TextView X02 = YoutubeFragment.this.f23905p1;
                            X02.setText("-" + YoutubeFragment.this.h1((float) i15) + "(" + YoutubeFragment.this.h1((float) this.T[0]) + ")");
                        }
                    }
                }
            }
            return true;
        }
    }

    public class d implements pj.f {
        public d() {
        }

        @SuppressLint({"UseRequireInsteadOfGet"})
        public void a(int i10) {
            YoutubeFragment.this.f23902m1.setVisibility(8);
            YoutubeFragment.this.q1(YoutubeFragment.P1.get(i10).c(), 0.0f);
            String unused = YoutubeFragment.this.f23891b1 = YoutubeFragment.P1.get(i10).c();
            YoutubeFragment.this.A1(YoutubeFragment.P1.get(i10).f(), YoutubeFragment.P1.get(i10).b().b(), YoutubeFragment.P1.get(i10).k(), YoutubeFragment.P1.get(i10).c());
            if (ui.a.b().f23398a.equals(a.e.f16172d)) {
                YoutubeFragment.this.j1();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            if (!YoutubeFragment.this.f23893d1.equals(p.f16188g)) {
                YoutubeFragment.this.f23896g1.setVisibility(8);
                YoutubeFragment.this.f23898i1.setVisibility(8);
            }
        }
    }

    public class f implements wi.d {
        public f() {
        }

        public void a(yi.b bVar, int i10, String str) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            YoutubeFragment.this.z1();
        }
    }

    public final void A1(String str, String str2, String str3, String str4) {
        this.f23906q1.setText(str);
        this.f23892c1 = str2;
        this.f23895f1 = str3;
        String str5 = ui.a.b().f23398a;
        str5.hashCode();
        char c10 = 65535;
        switch (str5.hashCode()) {
            case 98260:
                if (str5.equals(a.e.f16178j)) {
                    c10 = 0;
                    break;
                }
                break;
            case 106182:
                if (str5.equals(a.e.f16177i)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3377875:
                if (str5.equals(a.e.f16176h)) {
                    c10 = 2;
                    break;
                }
                break;
            case 109770997:
                if (str5.equals(a.e.f16174f)) {
                    c10 = 3;
                    break;
                }
                break;
            case 672908035:
                if (str5.equals(a.e.f16172d)) {
                    c10 = 4;
                    break;
                }
                break;
            case 926934164:
                if (str5.equals(a.e.f16175g)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1359515147:
                if (str5.equals(a.e.f16173e)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                sj.i.r(this.Y0).s0(str4);
                return;
            case 1:
                sj.i.r(this.Y0).u0(str4);
                return;
            case 2:
                sj.i.r(this.Y0).v0(str4);
                return;
            case 3:
                sj.i.r(this.Y0).x0(str4);
                return;
            case 4:
                sj.i.r(this.Y0).N0(str);
                sj.i.r(this.Y0).L0(str2);
                sj.i.r(this.Y0).X0(str3);
                sj.i.r(this.Y0).y0(str4);
                return;
            case 5:
                sj.i.r(this.Y0).t0(str4);
                return;
            case 6:
                sj.i.r(this.Y0).w0(str4);
                return;
            default:
                return;
        }
    }

    public final void B1() {
        this.f23896g1.setVisibility(0);
        this.f23898i1.setVisibility(0);
        Handler handler = this.J1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.J1.postDelayed(new e(), h.f4357h);
    }

    public final void C1() {
        this.f23910u1.setOnSeekBarChangeListener(new b(new int[]{0}));
    }

    public final void D1() {
        this.M1.setOnRefreshListener(new a());
    }

    public final void E1() {
        nj.a d10;
        boolean z10;
        String string;
        String str;
        float f10;
        float f11;
        String charSequence;
        String charSequence2;
        CharSequence text;
        try {
            String str2 = ui.a.b().f23398a;
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 98260:
                    if (str2.equals(a.e.f16178j)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 106182:
                    if (str2.equals(a.e.f16177i)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 3377875:
                    if (str2.equals(a.e.f16176h)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109770997:
                    if (str2.equals(a.e.f16174f)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 672908035:
                    if (str2.equals(a.e.f16172d)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 926934164:
                    if (str2.equals(a.e.f16175g)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 1359515147:
                    if (str2.equals(a.e.f16173e)) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.youtube);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 1:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.review);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 2:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.short_story);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 3:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.news);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 4:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.children);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 5:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.knowledge);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                case 6:
                    d10 = nj.a.d(this.Y0);
                    z10 = this.H1;
                    string = getResources().getString(R.string.love_car);
                    str = this.f23892c1;
                    f10 = this.f23913x1;
                    f11 = this.f23914y1;
                    charSequence = this.f23906q1.getText().toString();
                    charSequence2 = this.f23908s1.getText().toString();
                    text = this.f23907r1.getText();
                    break;
                default:
                    return;
            }
            d10.l(z10, string, str, f10, f11, charSequence, charSequence2, text.toString());
        } catch (Exception unused) {
        }
    }

    public void F1() {
        if (!this.D1) {
            I1();
        } else {
            H1();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void G1() {
        boolean[] zArr = {false};
        this.f23900k1.setOnTouchListener(new c(new int[1], new int[1], new int[]{0}, new int[]{9999}, zArr, new int[]{0}, new int[]{0}, new Handler()));
    }

    public void H1() {
        this.M1.setVisibility(0);
        this.f23903n1.setVisibility(0);
        if (ui.a.b().B >= 1.3d) {
            this.f23912w1.setVisibility(0);
        }
        ((HomeActivity) getActivity()).f1(false);
        this.D1 = false;
    }

    public void I1() {
        this.M1.setVisibility(8);
        this.f23903n1.setVisibility(8);
        this.f23912w1.setVisibility(8);
        ((HomeActivity) getActivity()).f1(true);
        this.D1 = true;
    }

    @SuppressLint({"UseRequireInsteadOfGet"})
    public void Z0() {
        int i10;
        ArrayList<b.a> arrayList;
        if (!ui.a.b().f23398a.equals(a.e.f16172d)) {
            int i11 = this.K1;
            if (i11 == 0) {
                ArrayList<b.a> arrayList2 = P1;
                String f10 = arrayList2.get(arrayList2.size() - 1).f();
                ArrayList<b.a> arrayList3 = P1;
                String b10 = arrayList3.get(arrayList3.size() - 1).b().b();
                ArrayList<b.a> arrayList4 = P1;
                String k10 = arrayList4.get(arrayList4.size() - 1).k();
                ArrayList<b.a> arrayList5 = P1;
                A1(f10, b10, k10, arrayList5.get(arrayList5.size() - 1).c());
                arrayList = P1;
                i10 = arrayList.size();
            } else {
                A1(P1.get(i11 - 1).f(), P1.get(this.K1 - 1).b().b(), P1.get(this.K1 - 1).k(), P1.get(this.K1 - 1).c());
                arrayList = P1;
                i10 = this.K1;
            }
            q1(arrayList.get(i10 - 1).c(), 0.0f);
        } else if (this.N1.size() > 1) {
            this.F1 = true;
            ArrayList<qj.b> arrayList6 = this.N1;
            String idVideo = arrayList6.get(arrayList6.size() - 2).getIdVideo();
            ArrayList<qj.b> arrayList7 = this.N1;
            q1(idVideo, arrayList7.get(arrayList7.size() - 2).getTimeVideo());
            ArrayList<qj.b> arrayList8 = this.N1;
            String nameVideo = arrayList8.get(arrayList8.size() - 2).getNameVideo();
            ArrayList<qj.b> arrayList9 = this.N1;
            String nameChannelVideo = arrayList9.get(arrayList9.size() - 2).getNameChannelVideo();
            ArrayList<qj.b> arrayList10 = this.N1;
            String thumb = arrayList10.get(arrayList10.size() - 2).getThumb();
            ArrayList<qj.b> arrayList11 = this.N1;
            A1(nameVideo, nameChannelVideo, thumb, arrayList11.get(arrayList11.size() - 2).getIdVideo());
            ArrayList<qj.b> arrayList12 = this.N1;
            this.f23891b1 = arrayList12.get(arrayList12.size() - 1).getIdVideo();
            j1();
            ArrayList<qj.b> arrayList13 = this.N1;
            arrayList13.remove(arrayList13.size() - 1);
            FragmentActivity activity = getActivity();
            Objects.requireNonNull(activity);
            ((HomeActivity) activity).a1();
        }
    }

    public void a(@m0 bc.c cVar, float f10) {
        this.f23914y1 = f10;
        this.f23908s1.setText(h1(f10));
        this.f23910u1.setMax((int) f10);
        E1();
    }

    public final void a1(String str, String str2) {
        StringBuilder sb2;
        String str3;
        wi.b bVar;
        if (str2.length() > 15) {
            str3 = this.Z0;
            sb2 = new StringBuilder();
            sb2.append("SearchYoutube: ");
            sb2.append(str);
            sb2.append("//");
            sb2.append(str2.substring(0, 10));
            sb2.append("...");
            sb2.append(str2.substring(str2.length() - 10, str2.length()));
        } else {
            str3 = this.Z0;
            sb2 = new StringBuilder();
            sb2.append("SearchYoutube: ");
            sb2.append(str);
            sb2.append("//");
            sb2.append(str2);
        }
        ad.d.e(str3, sb2.toString());
        Deflater deflater = new Deflater();
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            deflater.setInput(bytes);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bytes);
            deflaterOutputStream.finish();
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            bVar = new wi.b(str, "", sj.i.r(this.Y0).s(), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } catch (IOException unused) {
            bVar = new wi.b(str, "", sj.i.r(this.Y0).s(), "");
        }
        new k(this).f(bVar, this.Y0, getActivity());
        deflater.end();
    }

    public final void b1(String str, String str2) {
        StringBuilder sb2;
        String str3;
        wi.c cVar;
        if (str2.length() > 15) {
            str3 = this.Z0;
            sb2 = new StringBuilder();
            sb2.append("SuggestYoutube: ");
            sb2.append(str);
            sb2.append("//");
            sb2.append(str2.substring(0, 10));
            sb2.append("...");
            sb2.append(str2.substring(str2.length() - 10, str2.length()));
        } else {
            str3 = this.Z0;
            sb2 = new StringBuilder();
            sb2.append("SuggestYoutube: ");
            sb2.append(str);
            sb2.append("//");
            sb2.append(str2);
        }
        ad.d.e(str3, sb2.toString());
        Deflater deflater = new Deflater();
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            deflater.setInput(bytes);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bytes);
            deflaterOutputStream.finish();
            deflaterOutputStream.close();
            byteArrayOutputStream.close();
            cVar = new wi.c(str, "", sj.i.r(this.Y0).s(), Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        } catch (IOException unused) {
            cVar = new wi.c(str, "", sj.i.r(this.Y0).s(), "");
        }
        new l(this).f(cVar, this.Y0, getActivity());
        deflater.end();
    }

    public void c(@m0 bc.c cVar, @m0 String str) {
        this.f23894e1 = str;
        t1();
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            if (this.F1) {
                this.F1 = false;
            } else {
                this.N1.add(new qj.b(str, this.f23913x1, this.f23906q1.getText().toString(), this.f23892c1, sj.i.r(this.Y0).R()));
            }
            if (this.N1.size() > 1) {
                ((HomeActivity) getActivity()).X0();
            } else {
                ((HomeActivity) getActivity()).W0();
            }
        } else if (ui.a.b().f23398a.equals(a.e.f16176h)) {
            sj.i.r(this.Y0).o1(new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date()));
        }
    }

    public void c1(ArrayList<String> arrayList) {
        new yi.d(this).g(new yi.a(arrayList, sj.i.r(this.Y0).s()), this.Y0, getActivity(), ui.a.b().f23398a);
    }

    public void d(@m0 bc.c cVar, float f10) {
        this.f23913x1 = f10;
        this.f23907r1.setText(h1(f10));
        if (!this.E1) {
            this.f23910u1.setProgress((int) f10);
        }
        u1(f10);
        E1();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ba, code lost:
        A1("", "", "", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02b8, code lost:
        if (r2.equals(aj.a.e.f16172d) == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x02bd, code lost:
        v1(getString(vn.icar.entertaiment.R.string.music), false);
        r0.f23902m1.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x030c, code lost:
        if (r2.equals(aj.a.e.f16178j) == false) goto L_0x02d9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d1() {
        /*
            r17 = this;
            r0 = r17
            java.lang.Class<yi.b> r1 = yi.b.class
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            boolean r2 = r2.f()
            r3 = 2131820782(0x7f1100ee, float:1.9274289E38)
            java.lang.String r4 = "review_film"
            java.lang.String r6 = "history"
            java.lang.String r9 = "story"
            java.lang.String r11 = "news"
            java.lang.String r12 = "kid"
            java.lang.String r13 = "car"
            r14 = -1
            java.lang.String r15 = "Youtube"
            r5 = 0
            r7 = 1
            java.lang.String r8 = ""
            if (r2 == 0) goto L_0x02ab
            ui.a r2 = ui.a.b()
            java.lang.String r2 = r2.f23398a
            r2.hashCode()
            int r16 = r2.hashCode()
            switch(r16) {
                case 98260: goto L_0x006e;
                case 106182: goto L_0x0065;
                case 3377875: goto L_0x005c;
                case 109770997: goto L_0x0053;
                case 672908035: goto L_0x004a;
                case 926934164: goto L_0x0041;
                case 1359515147: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            r2 = r14
            goto L_0x0076
        L_0x0038:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x003f
            goto L_0x0036
        L_0x003f:
            r2 = 6
            goto L_0x0076
        L_0x0041:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x0048
            goto L_0x0036
        L_0x0048:
            r2 = 5
            goto L_0x0076
        L_0x004a:
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x0051
            goto L_0x0036
        L_0x0051:
            r2 = 4
            goto L_0x0076
        L_0x0053:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x005a
            goto L_0x0036
        L_0x005a:
            r2 = 3
            goto L_0x0076
        L_0x005c:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x0063
            goto L_0x0036
        L_0x0063:
            r2 = 2
            goto L_0x0076
        L_0x0065:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x006c
            goto L_0x0036
        L_0x006c:
            r2 = r7
            goto L_0x0076
        L_0x006e:
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x0075
            goto L_0x0036
        L_0x0075:
            r2 = r5
        L_0x0076:
            switch(r2) {
                case 0: goto L_0x026b;
                case 1: goto L_0x022b;
                case 2: goto L_0x01b8;
                case 3: goto L_0x0177;
                case 4: goto L_0x00ff;
                case 5: goto L_0x00bf;
                case 6: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x02c9
        L_0x007b:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.o()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.o()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0099
            goto L_0x02ba
        L_0x0099:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.o()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.Z()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.o()
        L_0x00ba:
            r0.A1(r8, r8, r8, r2)
            goto L_0x02c9
        L_0x00bf:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.l()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.l()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00dd
            goto L_0x02ba
        L_0x00dd:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.l()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.W()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.l()
            goto L_0x00ba
        L_0x00ff:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.q()
            if (r2 == 0) goto L_0x02bd
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.q()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x011d
            goto L_0x02bd
        L_0x011d:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.q()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.b0()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.G()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.E()
            android.content.Context r15 = r0.Y0
            sj.i r15 = sj.i.r(r15)
            java.lang.String r15 = r15.R()
            android.content.Context r10 = r0.Y0
            sj.i r10 = sj.i.r(r10)
            java.lang.String r10 = r10.q()
            r0.A1(r2, r3, r15, r10)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.q()
            r0.f23891b1 = r2
            r17.j1()
            android.widget.RelativeLayout r2 = r0.f23902m1
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x02c9
        L_0x0177:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.p()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.p()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0195
            goto L_0x02ba
        L_0x0195:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.p()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.a0()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.p()
            goto L_0x00ba
        L_0x01b8:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r10 = "dd-MM-yyyy"
            r2.<init>(r10, r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x01ea
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.i0()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01ea
            goto L_0x02ba
        L_0x01ea:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.n()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.n()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0208
            goto L_0x02ba
        L_0x0208:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.n()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.Y()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.n()
            goto L_0x00ba
        L_0x022b:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.m()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.m()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0248
            goto L_0x02ba
        L_0x0248:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.m()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.X()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.m()
            goto L_0x00ba
        L_0x026b:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.k()
            if (r2 == 0) goto L_0x02ba
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.k()
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0288
            goto L_0x02ba
        L_0x0288:
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.k()
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            float r3 = r3.V()
            r0.q1(r2, r3)
            android.content.Context r2 = r0.Y0
            sj.i r2 = sj.i.r(r2)
            java.lang.String r2 = r2.k()
            goto L_0x00ba
        L_0x02ab:
            ui.a r2 = ui.a.b()
            java.lang.String r2 = r2.f23398a
            r2.hashCode()
            boolean r2 = r2.equals(r15)
            if (r2 != 0) goto L_0x02bd
        L_0x02ba:
            r0.f23915z1 = r7
            goto L_0x02c9
        L_0x02bd:
            java.lang.String r2 = r0.getString(r3)
            r0.v1(r2, r5)
            android.widget.RelativeLayout r2 = r0.f23902m1
            r2.setVisibility(r5)
        L_0x02c9:
            ui.a r2 = ui.a.b()
            java.lang.String r2 = r2.f23398a
            r2.hashCode()
            int r3 = r2.hashCode()
            switch(r3) {
                case 98260: goto L_0x0308;
                case 106182: goto L_0x02ff;
                case 3377875: goto L_0x02f6;
                case 109770997: goto L_0x02ed;
                case 926934164: goto L_0x02e4;
                case 1359515147: goto L_0x02db;
                default: goto L_0x02d9;
            }
        L_0x02d9:
            r5 = r14
            goto L_0x030f
        L_0x02db:
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x02e2
            goto L_0x02d9
        L_0x02e2:
            r5 = 5
            goto L_0x030f
        L_0x02e4:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x02eb
            goto L_0x02d9
        L_0x02eb:
            r5 = 4
            goto L_0x030f
        L_0x02ed:
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L_0x02f4
            goto L_0x02d9
        L_0x02f4:
            r5 = 3
            goto L_0x030f
        L_0x02f6:
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x02fd
            goto L_0x02d9
        L_0x02fd:
            r5 = 2
            goto L_0x030f
        L_0x02ff:
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x0306
            goto L_0x02d9
        L_0x0306:
            r5 = r7
            goto L_0x030f
        L_0x0308:
            boolean r2 = r2.equals(r13)
            if (r2 != 0) goto L_0x030f
            goto L_0x02d9
        L_0x030f:
            r2 = 200(0xc8, float:2.8E-43)
            switch(r5) {
                case 0: goto L_0x044f;
                case 1: goto L_0x0412;
                case 2: goto L_0x03d5;
                case 3: goto L_0x0394;
                case 4: goto L_0x0357;
                case 5: goto L_0x0316;
                default: goto L_0x0314;
            }
        L_0x0314:
            goto L_0x048d
        L_0x0316:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.z()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x033b
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.z()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x033b:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.l()
            if (r1 != 0) goto L_0x048d
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23406i
            r0.c1(r1)
            ej.a r1 = ej.a.b()
            r1.A(r7)
            goto L_0x048d
        L_0x0357:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.v()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x037c
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.v()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x037c:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.g()
            if (r1 != 0) goto L_0x048d
            ej.a r1 = ej.a.b()
            r1.v(r7)
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23408k
            goto L_0x03d0
        L_0x0394:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.A()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x03b9
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.A()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x03b9:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.m()
            if (r1 != 0) goto L_0x048d
            ej.a r1 = ej.a.b()
            r1.B(r7)
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23407j
        L_0x03d0:
            r0.c1(r1)
            goto L_0x048d
        L_0x03d5:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.x()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x03fa
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.x()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x03fa:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.i()
            if (r1 != 0) goto L_0x048d
            ej.a r1 = ej.a.b()
            r1.x(r7)
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23409l
            goto L_0x03d0
        L_0x0412:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.w()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0437
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.w()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x0437:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.h()
            if (r1 != 0) goto L_0x048d
            ej.a r1 = ej.a.b()
            r1.w(r7)
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23405h
            goto L_0x03d0
        L_0x044f:
            android.content.Context r3 = r0.Y0
            sj.i r3 = sj.i.r(r3)
            java.lang.String r3 = r3.u()
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L_0x0474
            sj.d r3 = r0.O1
            android.content.Context r4 = r0.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.u()
            java.lang.Object r1 = r3.b(r4, r1)
            yi.b r1 = (yi.b) r1
            r0.m1(r2, r1, r8)
        L_0x0474:
            ej.a r1 = ej.a.b()
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x048d
            ej.a r1 = ej.a.b()
            r1.t(r7)
            ui.a r1 = ui.a.b()
            java.util.ArrayList<java.lang.String> r1 = r1.f23410m
            goto L_0x03d0
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.icar.entertaiment.view.fragment.YoutubeFragment.d1():void");
    }

    public void e(@m0 bc.c cVar, @m0 a.d dVar) {
        if (String.valueOf(dVar).equals(p.f16187f) || String.valueOf(dVar).equals(p.f16186e) || String.valueOf(dVar).equals(p.f16188g) || String.valueOf(dVar).equals(p.f16189h)) {
            this.f23893d1 = String.valueOf(dVar);
            f1(dVar);
        }
        B1();
        E1();
        y1();
    }

    public void e1() {
        if (!ui.a.b().E.equals("")) {
            v1(ui.a.b().E, true);
            ui.a.b().E = "";
            return;
        }
        d1();
    }

    public final void f1(a.d dVar) {
        if (this.f23893d1.equals(p.f16187f)) {
            this.f23896g1.setImageResource(R.drawable.ic_baseline_pause_24);
            this.H1 = true;
        } else {
            this.H1 = false;
            this.f23896g1.setImageResource(R.drawable.ic_baseline_play_arrow_24);
            if (this.f23893d1.equals(p.f16186e)) {
                try {
                    if (ui.a.b().f23398a.equals(a.e.f16172d)) {
                        q1(P1.get(0).c(), 0.0f);
                        this.f23891b1 = P1.get(0).c();
                        j1();
                        A1(P1.get(0).f(), P1.get(0).b().b(), P1.get(0).k(), P1.get(0).c());
                    } else {
                        o1();
                    }
                } catch (Exception unused) {
                }
            }
        }
        ej.a.b().F(this.H1);
    }

    public void g(@m0 bc.c cVar, @m0 a.c cVar2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("error: ");
        sb2.append(cVar2.name());
        x1(this.f23891b1, cVar2.name());
    }

    public final void g1(String str) {
        Iterator<b.a> it = P1.iterator();
        while (it.hasNext()) {
            b.a next = it.next();
            if (next.c().equals(str)) {
                A1(next.f(), next.b().b(), next.k(), next.c());
                return;
            }
        }
    }

    public final String h1(float f10) {
        int i10 = (int) (f10 / 3600.0f);
        int i11 = (int) ((f10 % 3600.0f) / 60.0f);
        int i12 = (int) (f10 % 60.0f);
        if (i10 > 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public final void i1() {
        this.I1 = true;
        this.f23899j1.setVisibility(0);
        kj.a.j(this.Y0).h(new wi.b(this.f23890a1, "{}", sj.i.r(this.Y0).s(), ""));
        gj.a e10 = gj.a.e();
        e10.d(this, sj.i.r(this.Y0).e0() + this.f23890a1, sj.i.r(this.Y0).M(), sj.i.r(this.Y0).b(), true);
    }

    public void j(yi.b bVar) {
        gj.a.e().b();
        m1(200, bVar, "");
    }

    public final void j1() {
        if (sj.i.r(this.Y0).C().equals("") || this.I1) {
            this.I1 = false;
        } else {
            m1(200, (yi.b) this.O1.b(sj.i.r(this.Y0).C(), yi.b.class), "");
        }
        kj.a.j(this.Y0).i(new wi.c(this.f23891b1, "{}", sj.i.r(this.Y0).s(), ""));
        gj.a e10 = gj.a.e();
        e10.d(this, sj.i.r(this.Y0).f0() + this.f23891b1, sj.i.r(this.Y0).N(), sj.i.r(this.Y0).b(), false);
    }

    @SuppressLint({"SuspiciousIndentation"})
    public void k1(int i10) {
        if (i10 == 87) {
            o1();
        } else if (i10 == 85) {
            p1();
        } else if (i10 == 88) {
            Z0();
        } else if (i10 == 127) {
            if (oj.c.v(this.Y0).y() != null) {
                oj.c.v(this.Y0).y().pause();
            }
        } else if (i10 == 126 && oj.c.v(this.Y0).y() != null) {
            oj.c.v(this.Y0).y().f();
        }
    }

    public void l(boolean z10, String str, boolean z11) {
        if (z11) {
            a1(this.f23890a1, str);
        } else {
            b1(this.f23891b1, str);
        }
    }

    public void l1() {
        if (((HomeActivity) getActivity()).V0()) {
            I1();
        } else {
            H1();
        }
    }

    public void m(yi.b bVar, int i10, String str, String str2) {
        if (str2.equals(ui.a.b().f23398a)) {
            m1(i10, bVar, str);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void m1(int i10, yi.b bVar, String str) {
        RecyclerView recyclerView;
        RecyclerView.o gridLayoutManager;
        this.f23899j1.setVisibility(8);
        this.M1.setRefreshing(false);
        if (i10 == 200) {
            try {
                if (bVar.a().size() == 0) {
                    Toast.makeText(this.Y0, R.string.list_data_error, 1).show();
                } else {
                    P1 = (ArrayList) bVar.a();
                    if (ui.a.b().B < 1.3d) {
                        this.L1 = new i(P1, this.Y0, true);
                        recyclerView = this.f23909t1;
                        gridLayoutManager = new LinearLayoutManager(this.Y0, 0, false);
                    } else {
                        this.L1 = new i(P1, this.Y0, false);
                        recyclerView = this.f23909t1;
                        gridLayoutManager = new GridLayoutManager(this.Y0, 1);
                    }
                    recyclerView.setLayoutManager(gridLayoutManager);
                    this.f23909t1.setAdapter(this.L1);
                    this.L1.F(new d());
                    if (this.f23915z1) {
                        this.f23915z1 = false;
                        this.f23902m1.setVisibility(8);
                        q1(P1.get(0).c(), 0.0f);
                        A1(P1.get(0).f(), P1.get(0).b().b(), P1.get(0).k(), P1.get(0).c());
                        this.f23891b1 = P1.get(0).c();
                        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
                            j1();
                        }
                    }
                }
                t1();
            } catch (Exception unused) {
            }
        }
    }

    public void n(YouTubePlayerView youTubePlayerView) {
        if (!this.B1) {
            this.f23904o1.removeAllViews();
            this.f23904o1.addView(youTubePlayerView);
        }
    }

    public final void n1() {
        int i10;
        ImageView imageView;
        this.f23896g1 = (ImageView) this.f23911v1.findViewById(R.id.img_play);
        this.f23897h1 = (ImageView) this.f23911v1.findViewById(R.id.img_news);
        this.f23898i1 = (RelativeLayout) this.f23911v1.findViewById(R.id.view_progress_bar);
        this.f23899j1 = (RelativeLayout) this.f23911v1.findViewById(R.id.view_loading_data);
        this.f23900k1 = (RelativeLayout) this.f23911v1.findViewById(R.id.view_on_touch_listener);
        this.f23901l1 = (RelativeLayout) this.f23911v1.findViewById(R.id.view_time);
        this.f23902m1 = (RelativeLayout) this.f23911v1.findViewById(R.id.view_click_video);
        this.f23903n1 = (RelativeLayout) this.f23911v1.findViewById(R.id.layout_advertisement);
        this.f23905p1 = (TextView) this.f23911v1.findViewById(R.id.txt_time);
        this.f23906q1 = (TextView) this.f23911v1.findViewById(R.id.txt_playing);
        this.f23907r1 = (TextView) this.f23911v1.findViewById(R.id.txt_time_play);
        this.f23908s1 = (TextView) this.f23911v1.findViewById(R.id.txt_time_video);
        this.f23909t1 = (RecyclerView) this.f23911v1.findViewById(R.id.recycler_video);
        this.f23910u1 = (SeekBar) this.f23911v1.findViewById(R.id.progress_bar);
        this.f23904o1 = (YouTubePlayerView) this.f23911v1.findViewById(R.id.youtube_player_view);
        this.M1 = (SwipeRefreshLayout) this.f23911v1.findViewById(R.id.refresh_recycler_video);
        this.f23912w1 = this.f23911v1.findViewById(R.id.view);
        if (oj.c.v(this.Y0).y() != null) {
            this.f23904o1.addView(oj.c.v(this.Y0).q());
            this.B1 = true;
        }
        if (sj.i.r(this.Y0).s().equals("vi-VN")) {
            imageView = this.f23897h1;
            i10 = R.drawable.ic_playing;
        } else {
            imageView = this.f23897h1;
            i10 = R.drawable.ic_playing_en;
        }
        imageView.setImageResource(i10);
        oj.c.v(this.Y0).z(this);
        this.f23896g1.setOnClickListener(this);
        G1();
        C1();
        D1();
    }

    public void o1() {
        ArrayList<b.a> arrayList;
        int i10 = 0;
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            q1(P1.get(0).c(), 0.0f);
            this.f23891b1 = P1.get(0).c();
            j1();
            A1(P1.get(0).f(), P1.get(0).b().b(), P1.get(0).k(), P1.get(0).c());
            return;
        }
        if (this.K1 == P1.size() - 1) {
            A1(P1.get(0).f(), P1.get(0).b().b(), P1.get(0).k(), P1.get(0).c());
            arrayList = P1;
        } else {
            A1(P1.get(this.K1 + 1).f(), P1.get(this.K1 + 1).b().b(), P1.get(this.K1 + 1).k(), P1.get(this.K1 + 1).c());
            arrayList = P1;
            i10 = this.K1 + 1;
        }
        q1(arrayList.get(i10).c(), 0.0f);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.img_play) {
            p1();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23911v1 = layoutInflater.inflate(ui.a.b().B < 1.3d ? R.layout.fragment_youtobe_square_screen : R.layout.fragment_youtobe, viewGroup, false);
        this.Y0 = getContext();
        n1();
        kj.a.j(this.Y0).o(this);
        e1();
        l1();
        return this.f23911v1;
    }

    public void onDestroyView() {
        oj.c.v(this.Y0).q().v();
        oj.c.v(this.Y0).u();
        super.onDestroyView();
    }

    public void onResume() {
        l1();
        super.onResume();
    }

    @SuppressLint({"SuspiciousIndentation"})
    public void p1() {
        if (this.f23893d1.equals(p.f16187f)) {
            if (oj.c.v(this.Y0).y() != null) {
                oj.c.v(this.Y0).y().pause();
            }
        } else if (oj.c.v(this.Y0).y() != null) {
            oj.c.v(this.Y0).y().f();
        }
    }

    public void q1(String str, float f10) {
        oj.c.v(this.Y0).w(str, f10);
    }

    public void r(yi.b bVar, int i10, String str) {
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            m1(i10, bVar, str);
        }
    }

    public void r1(int i10) {
        if (P1.size() > i10) {
            oj.c.v(this.Y0).w(P1.get(i10).c(), 0.0f);
        }
    }

    public void s1(String str, float f10) {
        this.f23902m1.setVisibility(8);
        oj.c.v(this.Y0).w(str, f10);
        g1(str);
        this.f23891b1 = str;
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            j1();
        }
    }

    public void t(yi.b bVar, int i10, String str) {
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            m1(i10, bVar, str);
        }
    }

    public final void t1() {
        String str;
        nj.a aVar;
        ArrayList<b.a> arrayList = P1;
        if (arrayList != null) {
            Iterator<b.a> it = arrayList.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (it.next().c().equals(this.f23894e1)) {
                    P1.get(i10).t(true);
                    this.K1 = i10;
                    this.f23909t1.C1(i10);
                    A1(P1.get(i10).f(), P1.get(i10).b().b(), P1.get(i10).k(), P1.get(i10).c());
                } else {
                    P1.get(i10).t(false);
                }
                i10++;
            }
        }
        i iVar = this.L1;
        if (iVar != null) {
            iVar.j();
        }
        nj.a.d(this.Y0).m();
        if (ui.a.b().f23398a.equals(a.e.f16172d)) {
            aVar = nj.a.d(this.Y0);
            str = sj.i.r(this.Y0).R();
        } else {
            aVar = nj.a.d(this.Y0);
            str = this.f23895f1;
        }
        aVar.i(str);
        w1();
    }

    public final void u1(float f10) {
        String str = ui.a.b().f23398a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 98260:
                if (str.equals(a.e.f16178j)) {
                    c10 = 0;
                    break;
                }
                break;
            case 106182:
                if (str.equals(a.e.f16177i)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3377875:
                if (str.equals(a.e.f16176h)) {
                    c10 = 2;
                    break;
                }
                break;
            case 109770997:
                if (str.equals(a.e.f16174f)) {
                    c10 = 3;
                    break;
                }
                break;
            case 672908035:
                if (str.equals(a.e.f16172d)) {
                    c10 = 4;
                    break;
                }
                break;
            case 926934164:
                if (str.equals(a.e.f16175g)) {
                    c10 = 5;
                    break;
                }
                break;
            case 1359515147:
                if (str.equals(a.e.f16173e)) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                sj.i.r(this.Y0).b1(f10);
                return;
            case 1:
                sj.i.r(this.Y0).d1(f10);
                return;
            case 2:
                sj.i.r(this.Y0).e1(f10);
                return;
            case 3:
                sj.i.r(this.Y0).g1(f10);
                return;
            case 4:
                sj.i.r(this.Y0).h1(f10);
                return;
            case 5:
                sj.i.r(this.Y0).c1(f10);
                return;
            case 6:
                sj.i.r(this.Y0).f1(f10);
                return;
            default:
                return;
        }
    }

    public void v1(String str, boolean z10) {
        if (!str.equals("")) {
            this.f23915z1 = z10;
            this.f23890a1 = str;
            i1();
        }
    }

    public void w1() {
        try {
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTab(ui.a.b().f23398a);
            aVar.setChannel(this.f23892c1);
            aVar.setName(this.f23906q1.getText().toString());
            aVar.setId(this.f23891b1);
            aVar.setThumbnail(ui.a.b().f23398a.equals(a.e.f16172d) ? sj.i.r(this.Y0).R() : this.f23895f1);
            aVar.setTotal(String.valueOf(this.f23914y1));
            aVar.setCurrent(String.valueOf(this.f23913x1));
            if (this.f23893d1.equals(p.f16187f)) {
                aVar.setStatus(true);
            } else {
                aVar.setStatus(false);
            }
            aVar.setVolume(mj.a.d(this.Y0).g());
            aVar.setVolume_max(mj.a.d(this.Y0).e());
            arrayList.add(aVar);
            ArrayList arrayList2 = new ArrayList();
            ArrayList<b.a> arrayList3 = P1;
            if (arrayList3 != null) {
                Iterator<b.a> it = arrayList3.iterator();
                while (it.hasNext()) {
                    b.a next = it.next();
                    arrayList2.add(new a.C0395a.b(next.f(), next.c(), next.k(), next.b().b(), next.i(), next.g(), ""));
                }
            } else {
                arrayList2.add(new a.C0395a.b("", "", "", "", "", "", ""));
            }
            kj.a.j(this.Y0).l(new a.C0395a("data", false, arrayList2, arrayList));
            RemoteService.I(mj.a.d(this.Y0).g(), mj.a.d(this.Y0).e());
            RemoteService.F(this.f23906q1.getText().toString(), this.f23892c1, (int) this.f23914y1);
        } catch (Exception e10) {
            e10.getMessage();
            e10.printStackTrace();
        }
    }

    public final void x1(String str, String str2) {
        f fVar = new f();
        wi.a aVar = new wi.a(str, str2);
        wi.e eVar = new wi.e(fVar);
        Context context = this.Y0;
        eVar.a(aVar, context, context);
    }

    public void y1() {
        try {
            if (!ui.a.b().f23398a.equals(a.e.f16179k) && !ui.a.b().f23398a.equals("TV") && !ui.a.b().f23398a.equals("Radio")) {
                boolean z10 = this.f23893d1.equals(p.f16187f);
                kj.a.j(this.Y0).l(new a.C0395a(u0.C0, z10, (List<a.C0395a.b>) null, (List<a.C0395a.C0396a>) null));
                RemoteService.H(z10);
                if (this.f23893d1.equals(p.f16187f)) {
                    new Handler().postDelayed(new g(), 500);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void z1() {
        try {
            RemoteService.C((int) this.f23913x1, (int) this.f23914y1);
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTotal(String.valueOf(this.f23914y1));
            aVar.setCurrent(String.valueOf(this.f23913x1));
            arrayList.add(aVar);
            kj.a.j(this.Y0).l(new a.C0395a("time", false, (List<a.C0395a.b>) null, arrayList));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("sendTime error: ");
            sb2.append(e10.getMessage());
            e10.printStackTrace();
        }
    }
}
