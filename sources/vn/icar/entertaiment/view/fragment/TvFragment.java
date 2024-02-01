package vn.icar.entertaiment.view.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b6.j;
import b6.l0;
import b6.n0;
import b6.x0;
import b7.r;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import h0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q7.m;
import qj.a;
import rj.u;
import rj.x;
import sj.i;
import sj.k;
import t7.l;
import vi.c;
import vi.g;
import vi.h;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.view.activity.HomeActivity;
import w7.q0;
import w7.s;

public class TvFragment extends Fragment implements g, View.OnClickListener {
    public static final String R1 = "TvFragment";
    public static ArrayList<c.a> S1 = new ArrayList<>();
    public oi.b A1;
    public String B1 = "";
    public String C1 = "";
    public String D1 = "";
    public String E1 = "";
    public AudioManager.OnAudioFocusChangeListener F1;
    public int G1 = 0;
    public int H1 = 0;
    public l.a I1;
    public TextView J1;
    public TextView K1;
    public TextView L1;
    public x M1 = new x();
    public boolean N1 = false;
    public sj.d O1 = new sj.d();
    public int P1 = 0;
    public ErrorDialog Q1;
    public Context Y0;
    public View Z0;

    /* renamed from: a1  reason: collision with root package name */
    public View f23861a1;

    /* renamed from: b1  reason: collision with root package name */
    public ImageView f23862b1;

    /* renamed from: c1  reason: collision with root package name */
    public ImageView f23863c1;

    /* renamed from: d1  reason: collision with root package name */
    public ImageView f23864d1;

    /* renamed from: e1  reason: collision with root package name */
    public ImageView f23865e1;

    /* renamed from: f1  reason: collision with root package name */
    public ImageView f23866f1;

    /* renamed from: g1  reason: collision with root package name */
    public ImageView f23867g1;

    /* renamed from: h1  reason: collision with root package name */
    public ProgressBar f23868h1;

    /* renamed from: i1  reason: collision with root package name */
    public RecyclerView f23869i1;

    /* renamed from: j1  reason: collision with root package name */
    public RelativeLayout f23870j1;

    /* renamed from: k1  reason: collision with root package name */
    public RelativeLayout f23871k1;

    /* renamed from: l1  reason: collision with root package name */
    public RelativeLayout f23872l1;

    /* renamed from: m1  reason: collision with root package name */
    public PlayerView f23873m1;

    /* renamed from: n1  reason: collision with root package name */
    public j f23874n1;

    /* renamed from: o1  reason: collision with root package name */
    public SwipeRefreshLayout f23875o1;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f23876p1 = false;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f23877q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    public boolean f23878r1 = false;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f23879s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f23880t1 = true;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f23881u1 = false;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f23882v1 = false;

    /* renamed from: w1  reason: collision with root package name */
    public AudioManager f23883w1;

    /* renamed from: x1  reason: collision with root package name */
    public Handler f23884x1 = new Handler();

    /* renamed from: y1  reason: collision with root package name */
    public ArrayList<c.a> f23885y1 = new ArrayList<>();

    /* renamed from: z1  reason: collision with root package name */
    public ArrayList<String> f23886z1 = new ArrayList<>();

    public class a implements View.OnTouchListener {
        public final /* synthetic */ int[] O;

        /* renamed from: vn.icar.entertaiment.view.fragment.TvFragment$a$a  reason: collision with other inner class name */
        public class C0475a implements Runnable {
            public C0475a() {
            }

            public void run() {
                a.this.O[0] = 0;
            }
        }

        public a(int[] iArr) {
            this.O = iArr;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int[] iArr = this.O;
                int i10 = iArr[0] + 1;
                iArr[0] = i10;
                if (i10 == 1) {
                    TvFragment.this.f23884x1.postDelayed(new C0475a(), 500);
                } else if (i10 == 2) {
                    TvFragment.this.P1();
                    this.O[0] = 0;
                }
            }
            return false;
        }
    }

    public class b implements SwipeRefreshLayout.j {
        public b() {
        }

        public void a() {
            boolean unused = TvFragment.this.f23878r1 = true;
            TvFragment.this.o1();
        }
    }

    public class c implements pj.c {
        public c() {
        }

        public void a(int i10) {
            String unused = TvFragment.this.B1 = TvFragment.S1.get(i10).h().get(0).b();
            TvFragment.this.J1.setText(TvFragment.S1.get(i10).d());
            TvFragment.this.F1();
            TvFragment.this.J1.setText(TvFragment.S1.get(i10).d());
            TvFragment.this.I1(TvFragment.S1.get(i10).d());
            TvFragment.this.p1();
        }

        public void b(int i10) {
            if (TvFragment.S1.get(i10).j()) {
                TvFragment.this.M1.b(TvFragment.S1.get(i10).d(), TvFragment.this.Y0);
            } else if (TvFragment.this.G1 >= 5) {
                Toast.makeText(TvFragment.this.Y0, R.string.priority_channel, 0).show();
                return;
            } else {
                TvFragment.this.M1.d(new u(TvFragment.S1.get(i10).d()), TvFragment.this.Y0);
            }
            TvFragment.this.s1();
            TvFragment.this.R1();
            TvFragment.this.A1.j();
        }
    }

    public class d implements n0.d {
        public d() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c() {
            TvFragment.Z0(TvFragment.this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("retryTV: ");
            sb2.append(TvFragment.this.P1);
            new h(TvFragment.this).f(new vi.a(i.r(TvFragment.this.Y0).s()), TvFragment.this.Y0, TvFragment.this.getActivity());
        }

        public void A(boolean z10, int i10) {
            nj.a d10;
            boolean T0;
            String string;
            String a12;
            float f10;
            float f11;
            String b12;
            String str;
            if (i10 == 3) {
                ImageView P0 = TvFragment.this.f23866f1;
                if (!z10) {
                    P0.setVisibility(4);
                    TvFragment.this.f23863c1.setVisibility(0);
                    boolean unused = TvFragment.this.f23876p1 = true;
                } else {
                    P0.setVisibility(0);
                    TvFragment.this.f23863c1.setVisibility(4);
                    TvFragment.this.H1();
                    boolean unused2 = TvFragment.this.f23876p1 = false;
                }
                if (z10) {
                    TvFragment.this.N1 = false;
                }
                boolean unused3 = TvFragment.this.f23879s1 = z10;
            } else {
                boolean unused4 = TvFragment.this.f23879s1 = false;
            }
            if (i10 == 3 && TvFragment.this.f23880t1) {
                int unused5 = TvFragment.this.P1 = 0;
                TvFragment.this.getActivity().setResult(-1);
                boolean unused6 = TvFragment.this.f23880t1 = false;
            }
            try {
                if (ui.a.b().f23398a.equals("TV")) {
                    d10 = nj.a.d(TvFragment.this.Y0);
                    T0 = TvFragment.this.f23879s1;
                    string = TvFragment.this.getResources().getString(R.string.tv_online);
                    a12 = TvFragment.this.C1;
                    f10 = 100.0f;
                    f11 = 0.0f;
                    b12 = TvFragment.this.D1;
                    str = "";
                } else {
                    if (ui.a.b().f23398a.equals("Radio")) {
                        d10 = nj.a.d(TvFragment.this.Y0);
                        T0 = TvFragment.this.f23879s1;
                        string = TvFragment.this.getResources().getString(R.string.radio_online);
                        a12 = TvFragment.this.C1;
                        f10 = 100.0f;
                        f11 = 0.0f;
                        b12 = TvFragment.this.D1;
                        str = "";
                    }
                    TvFragment.this.L1();
                    ej.a.b().F(TvFragment.this.f23879s1);
                }
                d10.l(T0, string, a12, f10, f11, b12, str, "");
            } catch (Exception unused7) {
            }
            TvFragment.this.L1();
            ej.a.b().F(TvFragment.this.f23879s1);
        }

        public void C(int i10) {
        }

        public void K(TrackGroupArray trackGroupArray, m mVar) {
        }

        public void N(b6.i iVar) {
            ad.d.c(TvFragment.R1, "Mở tv Error: " + iVar.toString());
            if (!k.i(iVar.toString().trim(), "(404)") && !k.i(iVar.toString().trim(), "(403)")) {
                TvFragment.this.N1 = true;
            } else if (ui.a.b().f23398a.equals("TV")) {
                if (TvFragment.this.P1 > 3) {
                    TvFragment.this.Q1();
                } else {
                    new Handler().postDelayed(new uj.d(this), 3000);
                }
            }
            TvFragment.this.K1();
        }

        public void b(l0 l0Var) {
        }

        public void d(boolean z10) {
        }

        public void e(int i10) {
        }

        public void i() {
        }

        public void k(x0 x0Var, Object obj, int i10) {
        }

        public void t(boolean z10) {
        }
    }

    public class e implements ErrorDialog.a {
        public e() {
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }

        public void v(ErrorDialog errorDialog) {
        }
    }

    public class f implements vi.d {
        public f() {
        }

        public void a(vi.c cVar, int i10, String str) {
        }
    }

    public static /* synthetic */ int Z0(TvFragment tvFragment) {
        int i10 = tvFragment.P1;
        tvFragment.P1 = i10 + 1;
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x1(int i10) {
        j jVar;
        if (i10 == -1) {
            if (this.f23882v1) {
                this.f23882v1 = false;
                return;
            }
            jVar = this.f23874n1;
            if (jVar == null) {
                return;
            }
        } else if (i10 == 1) {
            if (this.f23876p1) {
                this.f23874n1.V(true);
                return;
            }
            return;
        } else if (i10 == -2) {
            this.f23882v1 = true;
            jVar = this.f23874n1;
        } else {
            return;
        }
        jVar.V(false);
    }

    public final void A1() {
        String K;
        if (ui.a.b().f23398a.equals("TV")) {
            if (i.r(this.Y0).Q() != null && !i.r(this.Y0).Q().equals("")) {
                K = i.r(this.Y0).Q();
            }
            this.B1 = S1.get(0).h().get(0).b();
            I1(S1.get(0).d());
            this.J1.setText(S1.get(0).d());
            F1();
            p1();
        }
        if (ui.a.b().f23398a.equals("Radio")) {
            if (i.r(this.Y0).K() != null && !i.r(this.Y0).K().equals("")) {
                K = i.r(this.Y0).K();
            }
            this.B1 = S1.get(0).h().get(0).b();
            I1(S1.get(0).d());
            this.J1.setText(S1.get(0).d());
            F1();
        }
        p1();
        q1(K);
        p1();
    }

    public void B1(int i10) {
        if (S1.size() > i10) {
            this.B1 = S1.get(i10).h().get(0).b();
            this.J1.setText(S1.get(i10).d());
            F1();
            I1(S1.get(i10).d());
            p1();
            this.f23869i1.C1(i10);
            this.f23869i1.C1(i10);
        }
    }

    public void C1(String str) {
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= S1.size()) {
                break;
            }
            if (k.i(S1.get(i10).d().toLowerCase(), "(" + str + ")")) {
                this.B1 = S1.get(i10).h().get(0).b();
                this.J1.setText(S1.get(i10).d());
                F1();
                I1(S1.get(i10).d());
                this.f23869i1.C1(i10);
                z10 = true;
                break;
            }
            if (i10 == S1.size() - 1) {
                Toast.makeText(this.Y0, R.string.error_channel, 0).show();
                A1();
            }
            i10++;
        }
        if (z10) {
            p1();
            this.A1.j();
        }
    }

    public final void D1() {
        y yVar;
        ad.d.c(R1, "Mở tv: " + this.B1);
        int n02 = q0.n0(Uri.parse(this.B1));
        if (n02 == 2) {
            yVar = new HlsMediaSource.Factory(this.I1).b(Uri.parse(this.B1));
        } else if (n02 != 3) {
            ((HomeActivity) getActivity()).setResult(0);
            ((HomeActivity) getActivity()).finish();
            return;
        } else {
            yVar = new r.d(this.I1).b(Uri.parse(this.B1));
        }
        this.f23874n1.U(yVar);
        this.f23874n1.V(true);
    }

    public void E1() {
        boolean z10;
        j jVar;
        if (this.f23876p1) {
            jVar = this.f23874n1;
            z10 = true;
        } else {
            jVar = this.f23874n1;
            z10 = false;
        }
        jVar.V(z10);
    }

    public void F1() {
        if (!this.f23881u1) {
            this.f23874n1 = b6.k.p(this.Y0, new DefaultTrackSelector());
            Context context = this.Y0;
            this.I1 = new t7.u(context, q0.l0(context, getActivity().getApplicationInfo().loadLabel(getActivity().getPackageManager()).toString()));
            this.f23873m1.setPlayer(this.f23874n1);
            D1();
            this.f23874n1.P(new d());
            this.f23881u1 = true;
            return;
        }
        D1();
    }

    public void G1() {
        j jVar = this.f23874n1;
        if (jVar != null) {
            jVar.V(true);
        }
    }

    public final void H1() {
        if (Build.VERSION.SDK_INT >= 26) {
            int unused = this.f23883w1.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.F1).build());
        } else {
            this.f23883w1.requestAudioFocus(this.F1, 3, 1);
        }
    }

    public final void I1(String str) {
        if (ui.a.b().f23398a.equals("TV")) {
            i.r(this.Y0).W0(str);
        } else if (ui.a.b().f23398a.equals("Radio")) {
            i.r(this.Y0).R0(str);
        }
    }

    public void J1() {
        try {
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTab(ui.a.b().f23398a);
            aVar.setChannel(this.K1.getText().toString());
            aVar.setName(this.D1);
            aVar.setId(this.D1);
            aVar.setThumbnail(this.E1);
            aVar.setTotal("");
            aVar.setCurrent("");
            aVar.setStatus(this.f23879s1);
            aVar.setVolume(mj.a.d(this.Y0).g());
            aVar.setVolume_max(mj.a.d(this.Y0).e());
            arrayList.add(aVar);
            ArrayList arrayList2 = new ArrayList();
            ArrayList<c.a> arrayList3 = S1;
            if (arrayList3 != null) {
                Iterator<c.a> it = arrayList3.iterator();
                while (it.hasNext()) {
                    c.a next = it.next();
                    arrayList2.add(new a.C0395a.b(next.d(), next.d(), next.f(), next.a().a(), "", "", ""));
                }
            } else {
                arrayList2.add(new a.C0395a.b("", "", "", "", "", "", ""));
            }
            kj.a.j(this.Y0).l(new a.C0395a("data", this.f23879s1, arrayList2, arrayList));
            RemoteService.I(mj.a.d(this.Y0).g(), mj.a.d(this.Y0).e());
            RemoteService.F(this.D1, this.K1.getText().toString(), -1);
            nj.a.d(this.Y0).i(this.E1);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void K0() {
        if (this.f23878r1) {
            this.f23878r1 = false;
            p1();
        } else if (ui.a.b().C.equals("") && ui.a.b().D.equals("")) {
            A1();
        } else if (ui.a.b().f23398a.equals("TV")) {
            C1(ui.a.b().C);
            ui.a.b().C = "";
        } else if (ui.a.b().f23398a.equals("Radio")) {
            C1(ui.a.b().D);
            ui.a.b().D = "";
        }
    }

    public final void K1() {
        f fVar = new f();
        new vi.e(fVar).a(new vi.b(S1.get(this.H1).b(), this.B1), this.Y0);
    }

    public void L1() {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            try {
                kj.a.j(this.Y0).l(new a.C0395a(u0.C0, this.f23879s1, (List<a.C0395a.b>) null, (List<a.C0395a.C0396a>) null));
                RemoteService.H(this.f23879s1);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            M1();
        }
    }

    public void M1() {
        try {
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTotal("0");
            aVar.setCurrent("0");
            arrayList.add(aVar);
            kj.a.j(this.Y0).l(new a.C0395a("time", this.f23879s1, (List<a.C0395a.b>) null, arrayList));
            RemoteService.C(0, -1);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void N1(String str) {
        S1.clear();
        if (this.f23885y1.size() <= 0) {
            return;
        }
        if (str.equals("")) {
            r1();
            R1();
            return;
        }
        if (this.f23886z1.size() > 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<c.a> it = this.f23885y1.iterator();
            while (it.hasNext()) {
                c.a next = it.next();
                if (k.d(next.d(), str)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c.a aVar = (c.a) it2.next();
                Iterator<String> it3 = this.f23886z1.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    if (aVar.d().equals(it3.next())) {
                        S1.add(aVar);
                        break;
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                c.a aVar2 = (c.a) it4.next();
                int i10 = 0;
                Iterator<String> it5 = this.f23886z1.iterator();
                while (it5.hasNext()) {
                    i10++;
                    if (aVar2.d().equals(it5.next())) {
                        break;
                    } else if (i10 == this.f23886z1.size()) {
                        S1.add(aVar2);
                    }
                }
            }
        } else {
            Iterator<c.a> it6 = this.f23885y1.iterator();
            while (it6.hasNext()) {
                c.a next2 = it6.next();
                if (k.d(next2.d(), str)) {
                    S1.add(next2);
                }
            }
        }
        R1();
        this.A1.j();
    }

    public final void O1() {
        this.f23875o1.setOnRefreshListener(new b());
    }

    public void P1() {
        if (!this.f23877q1) {
            U1();
        } else {
            T1();
        }
    }

    public final void Q1() {
        ErrorDialog errorDialog = this.Q1;
        if (errorDialog == null || !errorDialog.isShowing()) {
            new ErrorDialog(this.Y0, new e()).k("Kênh đã tạm ngừng hoạt động! Vui lòng chuyển kênh để tiếp tục sử dụng.").m("Thông báo").l("Ok").show();
        }
    }

    public final void R1() {
        this.G1 = 0;
        if (this.f23886z1.size() > 0) {
            Iterator<c.a> it = S1.iterator();
            while (it.hasNext()) {
                c.a next = it.next();
                Iterator<String> it2 = this.f23886z1.iterator();
                int i10 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.d().equals(it2.next())) {
                        this.G1++;
                        next.p(true);
                        break;
                    }
                    if (i10 == this.f23886z1.size() - 1) {
                        next.p(false);
                    }
                    i10++;
                }
            }
            return;
        }
        this.G1 = 0;
        Iterator<c.a> it3 = S1.iterator();
        int i11 = 0;
        while (it3.hasNext()) {
            c.a next2 = it3.next();
            S1.get(i11).p(false);
            i11++;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void S1() {
        this.f23871k1.setOnTouchListener(new a(new int[]{0}));
    }

    public void T1() {
        this.f23875o1.setVisibility(0);
        this.f23870j1.setVisibility(0);
        if (ui.a.b().B >= 1.3d) {
            this.Z0.setVisibility(0);
        }
        ((HomeActivity) getActivity()).f1(false);
        this.f23877q1 = false;
    }

    public void U1() {
        this.f23875o1.setVisibility(8);
        this.f23870j1.setVisibility(8);
        this.Z0.setVisibility(8);
        ((HomeActivity) getActivity()).f1(true);
        this.f23877q1 = true;
    }

    public void k(vi.c cVar, int i10, String str) {
        v1(i10, cVar, str);
    }

    public final void m1() {
        this.f23883w1 = (AudioManager) this.Y0.getSystemService(s.f14801b);
        this.F1 = new uj.c(this);
    }

    public void n1() {
        int i10;
        int i11 = this.H1;
        if (i11 == 0) {
            ArrayList<c.a> arrayList = S1;
            this.B1 = arrayList.get(arrayList.size() - 1).h().get(0).b();
            TextView textView = this.J1;
            ArrayList<c.a> arrayList2 = S1;
            textView.setText(arrayList2.get(arrayList2.size() - 1).d());
            F1();
            this.f23869i1.C1(S1.size() - 1);
            i10 = S1.size();
        } else {
            this.B1 = S1.get(i11 - 1).h().get(0).b();
            this.J1.setText(S1.get(this.H1 - 1).d());
            F1();
            this.f23869i1.C1(this.H1 - 1);
            i10 = this.H1;
        }
        I1(S1.get(i10 - 1).d());
        p1();
    }

    public void o1() {
        View view;
        vi.a aVar = new vi.a(i.r(this.Y0).s());
        if (ui.a.b().f23398a.equals("TV")) {
            new h(this).f(aVar, this.Y0, getActivity());
            this.f23872l1.setVisibility(8);
        } else if (ui.a.b().f23398a.equals("Radio")) {
            if (!i.r(this.Y0).y().equals("")) {
                v1(200, (vi.c) this.O1.b(i.r(this.Y0).y(), vi.c.class), "");
                view = this.f23872l1;
            } else {
                S1.clear();
                oi.b bVar = this.A1;
                if (bVar != null) {
                    bVar.j();
                }
                view = this.f23868h1;
            }
            view.setVisibility(0);
            if (!ej.a.b().j()) {
                ej.a.b().y(true);
                new vi.f(this).f(aVar, this.Y0, getActivity());
                this.f23872l1.setVisibility(0);
            }
        }
    }

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        j jVar;
        boolean z10;
        switch (view.getId()) {
            case R.id.img_back:
                n1();
                return;
            case R.id.img_next:
                y1();
                return;
            case R.id.img_pause:
                jVar = this.f23874n1;
                z10 = false;
                break;
            case R.id.img_play:
                jVar = this.f23874n1;
                z10 = true;
                break;
            default:
                return;
        }
        jVar.V(z10);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23861a1 = layoutInflater.inflate(ui.a.b().B < 1.3d ? R.layout.fragment_tv_square_screen : R.layout.fragment_tv, viewGroup, false);
        this.Y0 = getContext();
        w1();
        s1();
        o1();
        m1();
        u1();
        return this.f23861a1;
    }

    public void onDestroyView() {
        j jVar = this.f23874n1;
        if (jVar != null) {
            jVar.a();
            this.f23874n1 = null;
        }
        if (this.I1 != null) {
            this.I1 = null;
        }
        super.onDestroyView();
    }

    public void onResume() {
        u1();
        super.onResume();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void p1() {
        String Q = ui.a.b().f23398a.equals("TV") ? i.r(this.Y0).Q() : ui.a.b().f23398a.equals("Radio") ? i.r(this.Y0).K() : "";
        Iterator<c.a> it = S1.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().d().equals(Q)) {
                this.H1 = i10;
                S1.get(i10).o(true);
                this.C1 = S1.get(i10).a().a();
                this.D1 = S1.get(i10).d();
                this.E1 = S1.get(i10).f();
                if (ui.a.b().f23398a.equals("Radio")) {
                    ((com.bumptech.glide.k) com.bumptech.glide.b.D(this.Y0).t(S1.get(i10).f()).L0(new s4.e(String.valueOf(System.currentTimeMillis())))).p1(this.f23867g1);
                    this.K1.setText(S1.get(i10).a().a());
                    this.L1.setText(this.f23885y1.get(i10).d());
                }
            } else {
                S1.get(i10).o(false);
            }
            i10++;
        }
        this.A1.j();
        nj.a.d(this.Y0).m();
        J1();
    }

    public final void q1(String str) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= S1.size()) {
                break;
            } else if (S1.get(i11).d().equals(str)) {
                this.B1 = S1.get(i11).h().get(0).b();
                this.J1.setText(S1.get(i11).d());
                F1();
                i10 = i11;
                break;
            } else {
                if (i11 == S1.size() - 1) {
                    this.B1 = S1.get(0).h().get(0).b();
                    this.J1.setText(S1.get(0).d());
                    F1();
                    I1(S1.get(0).d());
                }
                i11++;
            }
        }
        this.f23869i1.C1(i10);
    }

    public final void r1() {
        if (this.f23886z1.size() > 0) {
            Iterator<c.a> it = this.f23885y1.iterator();
            while (it.hasNext()) {
                c.a next = it.next();
                Iterator<String> it2 = this.f23886z1.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (next.d().equals(it2.next())) {
                        S1.add(next);
                        break;
                    }
                }
            }
            Iterator<c.a> it3 = this.f23885y1.iterator();
            while (it3.hasNext()) {
                c.a next2 = it3.next();
                int i10 = 0;
                Iterator<String> it4 = this.f23886z1.iterator();
                while (it4.hasNext()) {
                    i10++;
                    if (next2.d().equals(it4.next())) {
                        break;
                    } else if (i10 == this.f23886z1.size()) {
                        S1.add(next2);
                    }
                }
            }
            return;
        }
        S1.addAll(this.f23885y1);
    }

    public final void s1() {
        this.f23886z1.clear();
        this.f23886z1.addAll(this.M1.c(this.Y0));
    }

    public void t1(int i10) {
        if (i10 == 87) {
            y1();
        } else if (i10 == 85) {
            E1();
        } else if (i10 == 88) {
            n1();
        } else if (i10 == 127) {
            z1();
        } else if (i10 == 126) {
            G1();
        }
    }

    public void u1() {
        if (((HomeActivity) getActivity()).V0()) {
            U1();
        } else {
            T1();
        }
    }

    public final void v1(int i10, vi.c cVar, String str) {
        cVar.toString();
        this.f23868h1.setVisibility(8);
        this.f23875o1.setRefreshing(false);
        if (i10 == 200) {
            S1.clear();
            this.f23885y1 = (ArrayList) cVar.a();
            r1();
            R1();
            this.A1 = ui.a.b().B < 1.3d ? new oi.b(S1, this.Y0, true) : new oi.b(S1, this.Y0, false);
            this.A1.F(new c());
            this.f23869i1.setAdapter(this.A1);
            K0();
            nj.a.d(this.Y0).m();
            return;
        }
        Toast.makeText(this.Y0, str, 0).show();
    }

    public final void w1() {
        int i10;
        ImageView imageView;
        this.f23862b1 = (ImageView) this.f23861a1.findViewById(R.id.img_news);
        this.f23869i1 = (RecyclerView) this.f23861a1.findViewById(R.id.recycler_channels);
        this.f23870j1 = (RelativeLayout) this.f23861a1.findViewById(R.id.layout_advertisement);
        this.f23871k1 = (RelativeLayout) this.f23861a1.findViewById(R.id.view_on_touch_listener);
        this.f23872l1 = (RelativeLayout) this.f23861a1.findViewById(R.id.view_on_touch_listener_radio);
        this.f23873m1 = (PlayerView) this.f23861a1.findViewById(R.id.player_view);
        this.Z0 = this.f23861a1.findViewById(R.id.view);
        this.f23875o1 = (SwipeRefreshLayout) this.f23861a1.findViewById(R.id.refresh_recycler_channels);
        this.f23863c1 = (ImageView) this.f23861a1.findViewById(R.id.img_play);
        this.f23864d1 = (ImageView) this.f23861a1.findViewById(R.id.img_back);
        this.f23865e1 = (ImageView) this.f23861a1.findViewById(R.id.img_next);
        this.f23866f1 = (ImageView) this.f23861a1.findViewById(R.id.img_pause);
        this.f23867g1 = (ImageView) this.f23861a1.findViewById(R.id.img_logo_channel);
        this.J1 = (TextView) this.f23861a1.findViewById(R.id.txt_playing);
        this.K1 = (TextView) this.f23861a1.findViewById(R.id.txt_categories);
        this.L1 = (TextView) this.f23861a1.findViewById(R.id.txt_name_channels);
        this.f23868h1 = (ProgressBar) this.f23861a1.findViewById(R.id.progress_bar);
        this.f23863c1.setOnClickListener(this);
        this.f23864d1.setOnClickListener(this);
        this.f23865e1.setOnClickListener(this);
        this.f23866f1.setOnClickListener(this);
        O1();
        S1();
        if (i.r(this.Y0).s().equals("vi-VN")) {
            imageView = this.f23862b1;
            i10 = R.drawable.ic_playing;
        } else {
            imageView = this.f23862b1;
            i10 = R.drawable.ic_playing_en;
        }
        imageView.setImageResource(i10);
    }

    public void y1() {
        int i10 = 0;
        if (this.H1 == S1.size() - 1) {
            this.B1 = S1.get(0).h().get(0).b();
            this.J1.setText(S1.get(0).d());
            F1();
            this.f23869i1.C1(0);
        } else {
            this.B1 = S1.get(this.H1 + 1).h().get(0).b();
            this.J1.setText(S1.get(this.H1 + 1).d());
            F1();
            this.f23869i1.C1(this.H1 + 1);
            i10 = this.H1 + 1;
        }
        I1(S1.get(i10).d());
        p1();
    }

    public void z1() {
        j jVar = this.f23874n1;
        if (jVar != null) {
            jVar.V(false);
        }
    }
}
