package vn.icar.entertaiment.view.fragment;

import aj.a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cj.a;
import com.google.android.material.badge.BadgeDrawable;
import d.m0;
import h0.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pl.droidsonroids.gif.GifTextView;
import qj.a;
import sj.k;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.view.activity.HomeActivity;
import w7.s;

public class OfflineFragment extends Fragment implements View.OnClickListener, SurfaceHolder.Callback, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener {
    public static ArrayList<ti.a> M1 = new ArrayList<>();
    public static SurfaceView N1;
    public int A1 = 0;
    public int B1 = 0;
    public int C1 = 0;
    public Handler D1 = new Handler();
    public SwipeRefreshLayout E1;
    public AudioManager F1;
    public AudioManager.OnAudioFocusChangeListener G1;
    public GifTextView H1;
    public ImageView I1;
    public ImageView J1;
    public Dialog K1;
    public qc.c L1;
    public Context Y0;
    public String Z0 = OfflineFragment.class.getSimpleName();

    /* renamed from: a1  reason: collision with root package name */
    public String f23830a1 = "";

    /* renamed from: b1  reason: collision with root package name */
    public View f23831b1;

    /* renamed from: c1  reason: collision with root package name */
    public View f23832c1;

    /* renamed from: d1  reason: collision with root package name */
    public ArrayList<ti.a> f23833d1 = new ArrayList<>();

    /* renamed from: e1  reason: collision with root package name */
    public oi.f f23834e1;

    /* renamed from: f1  reason: collision with root package name */
    public RecyclerView f23835f1;

    /* renamed from: g1  reason: collision with root package name */
    public RelativeLayout f23836g1;

    /* renamed from: h1  reason: collision with root package name */
    public RelativeLayout f23837h1;

    /* renamed from: i1  reason: collision with root package name */
    public RelativeLayout f23838i1;

    /* renamed from: j1  reason: collision with root package name */
    public RelativeLayout f23839j1;

    /* renamed from: k1  reason: collision with root package name */
    public RelativeLayout f23840k1;

    /* renamed from: l1  reason: collision with root package name */
    public SeekBar f23841l1;

    /* renamed from: m1  reason: collision with root package name */
    public TextView f23842m1;

    /* renamed from: n1  reason: collision with root package name */
    public TextView f23843n1;

    /* renamed from: o1  reason: collision with root package name */
    public TextView f23844o1;

    /* renamed from: p1  reason: collision with root package name */
    public TextView f23845p1;

    /* renamed from: q1  reason: collision with root package name */
    public RelativeLayout f23846q1;

    /* renamed from: r1  reason: collision with root package name */
    public ImageButton f23847r1;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f23848s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f23849t1 = false;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f23850u1 = false;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f23851v1 = false;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f23852w1 = false;

    /* renamed from: x1  reason: collision with root package name */
    public CountDownTimer f23853x1;

    /* renamed from: y1  reason: collision with root package name */
    public int f23854y1 = 0;

    /* renamed from: z1  reason: collision with root package name */
    public int f23855z1 = 0;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            OfflineFragment.this.E1();
        }
    }

    public class b implements SwipeRefreshLayout.j {
        public b() {
        }

        public void a() {
            cj.a.r(OfflineFragment.this.Y0).s();
        }
    }

    public class c implements a.c {

        public class a implements Runnable {
            public final /* synthetic */ ArrayList O;

            public a(ArrayList arrayList) {
                this.O = arrayList;
            }

            public void run() {
                OfflineFragment.this.f23833d1.clear();
                OfflineFragment.this.f23833d1.addAll(this.O);
                OfflineFragment.M1.clear();
                OfflineFragment.M1.addAll(this.O);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("data: ");
                sb2.append(OfflineFragment.M1.toString());
                if (OfflineFragment.this.f23834e1 != null) {
                    OfflineFragment.this.f23834e1.j();
                }
            }
        }

        public c() {
        }

        public void a() {
            OfflineFragment.this.f23836g1.setVisibility(8);
            OfflineFragment.this.E1.setRefreshing(false);
            ((HomeActivity) OfflineFragment.this.getActivity()).a1();
            OfflineFragment.this.l1();
            OfflineFragment.this.o1();
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void b(ArrayList<ti.a> arrayList) {
            new Handler(Looper.getMainLooper()).post(new a(arrayList));
        }
    }

    public class d implements pj.f {
        public d() {
        }

        public void a(int i10) {
            OfflineFragment.this.O1(i10);
        }
    }

    public class e implements View.OnTouchListener {
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
                e.this.U[0] = 0;
            }
        }

        public e(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, boolean[] zArr, int[] iArr5, int[] iArr6, Handler handler) {
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
                this.Q[0] = OfflineFragment.this.f23854y1;
            } else if (action == 1) {
                int[] iArr = this.U;
                int i10 = iArr[0] + 1;
                iArr[0] = i10;
                if (i10 == 1) {
                    boolean[] zArr = this.S;
                    if (zArr[0]) {
                        iArr[0] = 0;
                        zArr[0] = false;
                        OfflineFragment.this.f23839j1.setVisibility(8);
                        this.R[0] = 9999;
                        if (this.T[0] >= OfflineFragment.this.A1) {
                            this.T[0] = OfflineFragment.this.A1 - 1;
                        }
                        if (!OfflineFragment.this.f23848s1) {
                            OfflineFragment.this.x1();
                        }
                        ((HomeActivity) OfflineFragment.this.getActivity()).f23819q0.q().seekTo(this.T[0] * 1000);
                        int unused = OfflineFragment.this.f23855z1 = this.T[0];
                    } else {
                        OfflineFragment.this.N1();
                        this.R[0] = 9999;
                        OfflineFragment.this.f23839j1.setVisibility(8);
                        this.V.postDelayed(new a(), 500);
                    }
                } else if (i10 == 2) {
                    OfflineFragment.this.M1();
                    this.U[0] = 0;
                    this.R[0] = 9999;
                    OfflineFragment.this.f23839j1.setVisibility(8);
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
                    OfflineFragment.this.f23839j1.setVisibility(0);
                    int i12 = this.O[0];
                    int i13 = this.R[0];
                    if (i12 > i13) {
                        int i14 = (i12 - i13) / 5;
                        if (this.Q[0] + i14 < OfflineFragment.this.A1) {
                            this.T[0] = this.Q[0] + i14;
                            TextView O0 = OfflineFragment.this.f23844o1;
                            O0.setText(BadgeDrawable.f16655n0 + OfflineFragment.this.n1((float) i14) + "(" + OfflineFragment.this.n1((float) this.T[0]) + ")");
                        }
                    } else {
                        int i15 = (i13 - i12) / 5;
                        int i16 = this.Q[0];
                        if (i16 - i15 >= 0) {
                            this.T[0] = i16 - i15;
                            TextView O02 = OfflineFragment.this.f23844o1;
                            O02.setText("-" + OfflineFragment.this.n1((float) i15) + "(" + OfflineFragment.this.n1((float) this.T[0]) + ")");
                        }
                    }
                }
            }
            return true;
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void run() {
            OfflineFragment.this.J1();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            OfflineFragment.this.J1();
        }
    }

    public class h extends CountDownTimer {
        public h(long j10, long j11) {
            super(j10, j11);
        }

        public void onFinish() {
            OfflineFragment.this.f23841l1.setProgress(OfflineFragment.this.f23854y1);
            TextView V0 = OfflineFragment.this.f23842m1;
            OfflineFragment offlineFragment = OfflineFragment.this;
            V0.setText(offlineFragment.n1((float) OfflineFragment.h1(offlineFragment)));
        }

        public void onTick(long j10) {
            if (OfflineFragment.this.f23854y1 <= OfflineFragment.this.A1) {
                OfflineFragment.this.f23841l1.setProgress(OfflineFragment.this.f23854y1);
                TextView V0 = OfflineFragment.this.f23842m1;
                OfflineFragment offlineFragment = OfflineFragment.this;
                V0.setText(offlineFragment.n1((float) OfflineFragment.h1(offlineFragment)));
                OfflineFragment.this.L1();
                return;
            }
            cancel();
        }
    }

    public class i implements SeekBar.OnSeekBarChangeListener {
        public i() {
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            int unused = OfflineFragment.this.f23855z1 = i10;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            OfflineFragment.this.f23841l1.setProgress(OfflineFragment.this.f23855z1);
            if (!OfflineFragment.this.f23848s1) {
                OfflineFragment.this.z1();
            }
            String unused = OfflineFragment.this.Z0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("timeSeekBar: ");
            sb2.append(OfflineFragment.this.f23855z1);
            ((HomeActivity) OfflineFragment.this.getActivity()).f23819q0.q().seekTo(OfflineFragment.this.f23855z1 * 1000);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        public void run() {
            if (OfflineFragment.this.f23848s1) {
                OfflineFragment.this.f23837h1.setVisibility(8);
                OfflineFragment.this.f23847r1.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ int h1(OfflineFragment offlineFragment) {
        int i10 = offlineFragment.f23854y1;
        offlineFragment.f23854y1 = i10 + 1;
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s1(int i10) {
        if (i10 == -1) {
            if (this.f23850u1) {
                this.f23850u1 = false;
                return;
            }
        } else if (i10 == 1) {
            if (this.f23848s1) {
                z1();
                return;
            }
            return;
        } else if (i10 == -2) {
            this.f23850u1 = true;
        } else {
            return;
        }
        x1();
    }

    public void A1(boolean z10) {
        if (M1.size() > 1) {
            int random = (int) ((Math.random() * ((double) ((M1.size() - 1) + 0 + 1))) + 0.0d);
            if (random != this.B1) {
                O1(random);
            } else if (z10) {
                u1();
            } else {
                k1();
            }
        }
    }

    public final void B1() {
        if (Build.VERSION.SDK_INT >= 26) {
            int unused = this.F1.requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this.G1).build());
        } else {
            this.F1.requestAudioFocus(this.G1, 3, 1);
        }
    }

    public void C1() {
        try {
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTab(ui.a.b().f23398a);
            aVar.setChannel(this.f23830a1);
            aVar.setName(this.f23845p1.getText().toString());
            aVar.setId(this.f23845p1.getText().toString());
            aVar.setThumbnail("");
            aVar.setTotal(String.valueOf(this.A1));
            aVar.setCurrent(String.valueOf(this.f23854y1));
            aVar.setStatus(this.f23848s1);
            aVar.setVolume(mj.a.d(this.Y0).g());
            aVar.setVolume_max(mj.a.d(this.Y0).e());
            arrayList.add(aVar);
            ArrayList arrayList2 = new ArrayList();
            ArrayList<ti.a> arrayList3 = M1;
            if (arrayList3 != null) {
                Iterator<ti.a> it = arrayList3.iterator();
                while (it.hasNext()) {
                    ti.a next = it.next();
                    arrayList2.add(new a.C0395a.b(next.e(), next.e(), "", next.a(), "", String.valueOf(next.d()), ""));
                }
            } else {
                arrayList2.add(new a.C0395a.b("", "", "", "", "", "", ""));
            }
            kj.a.j(this.Y0).l(new a.C0395a("data", this.f23848s1, arrayList2, arrayList));
            RemoteService.I(mj.a.d(this.Y0).g(), mj.a.d(this.Y0).e());
            RemoteService.F(this.f23845p1.getText().toString(), this.f23830a1, this.A1);
            nj.a.d(this.Y0).i(a.e.f16179k);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void D1() {
        try {
            if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                kj.a.j(this.Y0).l(new a.C0395a(u0.C0, this.f23848s1, (List<a.C0395a.b>) null, (List<a.C0395a.C0396a>) null));
                RemoteService.H(this.f23848s1);
                if (this.f23848s1) {
                    new Handler().postDelayed(new a(), 500);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void E1() {
        try {
            RemoteService.C(this.f23854y1, this.A1);
            ArrayList arrayList = new ArrayList();
            a.C0395a.C0396a aVar = new a.C0395a.C0396a();
            aVar.setTotal(String.valueOf(this.A1));
            aVar.setCurrent(String.valueOf(this.f23854y1));
            arrayList.add(aVar);
            kj.a.j(this.Y0).l(new a.C0395a("time", this.f23848s1, (List<a.C0395a.b>) null, arrayList));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void F1(int i10) {
        this.f23854y1 = i10;
        int duration = ((HomeActivity) getActivity()).f23819q0.q().getDuration() / 1000;
        this.A1 = duration;
        this.f23841l1.setMax(duration);
        this.f23843n1.setText(n1((float) this.A1));
        this.f23847r1.setImageResource(R.drawable.ic_baseline_pause_24);
        CountDownTimer countDownTimer = this.f23853x1;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        h hVar = new h(1000 * ((long) (this.A1 - i10)), 1000);
        this.f23853x1 = hVar;
        hVar.start();
        this.f23848s1 = true;
        ej.a.b().F(this.f23848s1);
        N1();
        D1();
    }

    public void G1() {
        this.f23833d1.clear();
        M1.clear();
        this.f23833d1.addAll(cj.a.r(this.Y0).t());
        M1.addAll(this.f23833d1);
        this.f23834e1 = ui.a.b().B < 1.3d ? new oi.f(M1, this.Y0, true) : new oi.f(M1, this.Y0, false);
        this.f23834e1.F(new d());
        this.f23835f1.setAdapter(this.f23834e1);
        l1();
    }

    public void H1(String str) {
        M1.clear();
        if (this.f23833d1.size() > 0) {
            if (str.equals("")) {
                M1.addAll(this.f23833d1);
            } else {
                Iterator<ti.a> it = this.f23833d1.iterator();
                while (it.hasNext()) {
                    ti.a next = it.next();
                    if (k.d(next.e(), str)) {
                        M1.add(next);
                    }
                }
            }
            oi.f fVar = this.f23834e1;
            if (fVar != null) {
                fVar.j();
            }
            o1();
        }
    }

    public final void I1() {
        this.f23841l1.setOnSeekBarChangeListener(new i());
    }

    public final void J1() {
        int i10;
        int videoWidth = ((HomeActivity) getActivity()).f23819q0.q().getVideoWidth();
        int videoHeight = ((HomeActivity) getActivity()).f23819q0.q().getVideoHeight();
        ViewGroup.LayoutParams layoutParams = N1.getLayoutParams();
        if (this.f23846q1.getWidth() > this.f23846q1.getHeight()) {
            layoutParams.width = (int) ((((float) videoWidth) / ((float) videoHeight)) * ((float) this.f23846q1.getHeight()));
            i10 = this.f23846q1.getHeight();
        } else {
            layoutParams.width = this.f23846q1.getWidth();
            i10 = (int) ((((float) videoHeight) / ((float) videoWidth)) * ((float) this.f23846q1.getWidth()));
        }
        layoutParams.height = i10;
        N1.setLayoutParams(layoutParams);
    }

    public final void K1() {
        this.E1.setOnRefreshListener(new b());
    }

    public final void L1() {
        nj.a.d(this.Y0).l(this.f23848s1, this.Y0.getResources().getString(R.string.offline), this.f23830a1, (float) this.f23854y1, (float) this.A1, this.f23845p1.getText().toString(), this.f23843n1.getText().toString(), this.f23842m1.getText().toString());
    }

    public void M1() {
        if (!this.f23849t1) {
            R1();
        } else {
            Q1();
        }
    }

    public final void N1() {
        this.f23837h1.setVisibility(0);
        this.f23847r1.setVisibility(0);
        Handler handler = this.D1;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        this.D1.postDelayed(new j(), b6.h.f4357h);
    }

    public final void O1(int i10) {
        int i11;
        GifTextView gifTextView;
        if (M1.size() > i10) {
            ((HomeActivity) getActivity()).f23819q0.r(Uri.parse(M1.get(i10).b()));
            if (M1.get(i10).f().equals(e7.d.f6880h)) {
                gifTextView = this.H1;
                i11 = 0;
            } else {
                gifTextView = this.H1;
                i11 = 8;
            }
            gifTextView.setVisibility(i11);
            this.f23848s1 = true;
            ej.a.b().F(this.f23848s1);
            this.f23830a1 = M1.get(i10).a();
            this.f23845p1.setText(M1.get(i10).e());
            sj.i.r(this.Y0).M0(M1.get(i10).e());
            B1();
            o1();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void P1() {
        boolean[] zArr = {false};
        this.f23838i1.setOnTouchListener(new e(new int[1], new int[1], new int[]{0}, new int[]{9999}, zArr, new int[]{0}, new int[]{0}, new Handler()));
    }

    public void Q1() {
        this.E1.setVisibility(0);
        this.f23840k1.setVisibility(0);
        if (ui.a.b().B >= 1.3d) {
            this.f23832c1.setVisibility(0);
        }
        ((HomeActivity) getActivity()).f1(false);
        this.f23849t1 = false;
        new Handler().postDelayed(new g(), 100);
    }

    public void R1() {
        this.E1.setVisibility(8);
        this.f23840k1.setVisibility(8);
        this.f23832c1.setVisibility(8);
        ((HomeActivity) getActivity()).f1(true);
        this.f23849t1 = true;
        new Handler().postDelayed(new f(), 100);
    }

    public final void j1() {
        this.F1 = (AudioManager) this.Y0.getSystemService(s.f14801b);
        this.G1 = new uj.b(this);
    }

    public void k1() {
        if (this.C1 == 1) {
            A1(false);
        } else if (M1.size() != 0) {
            int i10 = this.B1;
            if (i10 == 0) {
                i10 = M1.size();
            }
            O1(i10 - 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r5.f23851v1 == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l1() {
        /*
            r5 = this;
            java.util.ArrayList<ti.a> r0 = M1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x004d
            android.content.Context r0 = r5.Y0
            sj.i r0 = sj.i.r(r0)
            boolean r0 = r0.f()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0048
            r0 = r1
        L_0x0017:
            java.util.ArrayList<ti.a> r3 = M1
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0044
            java.util.ArrayList<ti.a> r3 = M1
            java.lang.Object r3 = r3.get(r0)
            ti.a r3 = (ti.a) r3
            java.lang.String r3 = r3.e()
            android.content.Context r4 = r5.Y0
            sj.i r4 = sj.i.r(r4)
            java.lang.String r4 = r4.F()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0041
            r5.O1(r0)
            r5.f23851v1 = r2
            goto L_0x0044
        L_0x0041:
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0044:
            boolean r0 = r5.f23851v1
            if (r0 != 0) goto L_0x004d
        L_0x0048:
            r5.O1(r1)
            r5.f23851v1 = r2
        L_0x004d:
            android.widget.RelativeLayout r0 = r5.f23836g1
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vn.icar.entertaiment.view.fragment.OfflineFragment.l1():void");
    }

    public void m1(boolean z10) {
        if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            this.f23851v1 = false;
        }
        this.f23836g1.setVisibility(0);
    }

    public final String n1(float f10) {
        int i10 = (int) (f10 / 3600.0f);
        int i11 = (int) ((f10 % 3600.0f) / 60.0f);
        int i12 = (int) (f10 % 60.0f);
        if (i10 > 0) {
            return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        }
        return String.format("%02d:%02d", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12)});
    }

    public final void o1() {
        Iterator<ti.a> it = M1.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (it.hasNext()) {
            if (it.next().e().equals(sj.i.r(this.Y0).F())) {
                M1.get(i10).k(true);
                this.B1 = i10;
                this.f23835f1.C1(i10);
                z10 = true;
            } else {
                M1.get(i10).k(false);
            }
            i10++;
        }
        if (!z10) {
            this.B1 = 0;
        }
        oi.f fVar = this.f23834e1;
        if (fVar != null) {
            fVar.j();
        }
        nj.a.d(this.Y0).m();
        C1();
    }

    public void onClick(View view) {
        ImageView imageView;
        int i10;
        switch (view.getId()) {
            case R.id.img_play:
                if (this.f23848s1) {
                    x1();
                    this.f23848s1 = false;
                } else {
                    z1();
                    this.f23848s1 = true;
                }
                ej.a.b().F(this.f23848s1);
                return;
            case R.id.img_play_type:
                int i11 = this.C1;
                if (i11 == 0) {
                    this.C1 = 1;
                    imageView = this.J1;
                    i10 = R.drawable.ic_play_random;
                } else if (i11 == 1) {
                    this.C1 = 2;
                    imageView = this.J1;
                    i10 = R.drawable.ic_play_again;
                } else {
                    this.C1 = 0;
                    imageView = this.J1;
                    i10 = R.drawable.ic_play_all;
                }
                imageView.setImageResource(i10);
                return;
            default:
                return;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f23848s1 = false;
        this.f23847r1.setImageResource(R.drawable.ic_baseline_play_arrow_24);
        if (this.f23854y1 < this.A1) {
            Toast.makeText(this.Y0, "Lỗi dữ liệu phát! có phải bạn vừa tháo usb?", 0).show();
            mediaPlayer.reset();
            CountDownTimer countDownTimer = this.f23853x1;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        } else if (this.C1 == 2) {
            O1(this.B1);
        } else {
            u1();
        }
        ej.a.b().F(this.f23848s1);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23831b1 = layoutInflater.inflate(ui.a.b().B < 1.3d ? R.layout.fragment_music_and_video_offline_square_screen : R.layout.fragment_music_and_video_offline, viewGroup, false);
        this.Y0 = getContext();
        r1();
        q1();
        return this.f23831b1;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        F1(0);
    }

    public void onResume() {
        q1();
        super.onResume();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        F1(mediaPlayer.getCurrentPosition() / 1000);
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        J1();
    }

    public void p1(int i10) {
        if (i10 == 87) {
            u1();
        } else if (i10 == 85) {
            y1();
        } else if (i10 == 88) {
            k1();
        } else if (i10 == 127) {
            x1();
        } else if (i10 == 126) {
            z1();
        }
    }

    public void q1() {
        if (((HomeActivity) getActivity()).V0()) {
            R1();
        } else {
            Q1();
        }
    }

    public final void r1() {
        int i10;
        ImageView imageView;
        this.f23835f1 = (RecyclerView) this.f23831b1.findViewById(R.id.recycler_offline);
        this.f23845p1 = (TextView) this.f23831b1.findViewById(R.id.txt_playing);
        this.I1 = (ImageView) this.f23831b1.findViewById(R.id.img_news);
        this.H1 = (GifTextView) this.f23831b1.findViewById(R.id.view_music);
        this.f23836g1 = (RelativeLayout) this.f23831b1.findViewById(R.id.view_loading_data);
        N1 = (SurfaceView) this.f23831b1.findViewById(R.id.surface_view);
        this.f23846q1 = (RelativeLayout) this.f23831b1.findViewById(R.id.view_play_music);
        this.f23837h1 = (RelativeLayout) this.f23831b1.findViewById(R.id.view_progress_bar);
        this.f23847r1 = (ImageButton) this.f23831b1.findViewById(R.id.img_play);
        this.f23841l1 = (SeekBar) this.f23831b1.findViewById(R.id.progress_bar);
        this.f23842m1 = (TextView) this.f23831b1.findViewById(R.id.txt_time_play);
        this.f23843n1 = (TextView) this.f23831b1.findViewById(R.id.txt_time_video);
        this.f23838i1 = (RelativeLayout) this.f23831b1.findViewById(R.id.view_on_touch_listener);
        this.f23844o1 = (TextView) this.f23831b1.findViewById(R.id.txt_time);
        this.f23839j1 = (RelativeLayout) this.f23831b1.findViewById(R.id.view_time);
        this.f23840k1 = (RelativeLayout) this.f23831b1.findViewById(R.id.layout_advertisement);
        this.f23832c1 = this.f23831b1.findViewById(R.id.view);
        this.E1 = (SwipeRefreshLayout) this.f23831b1.findViewById(R.id.refresh_recycler_offline);
        this.J1 = (ImageView) this.f23831b1.findViewById(R.id.img_play_type);
        this.f23847r1.setOnClickListener(this);
        this.J1.setOnClickListener(this);
        if (sj.i.r(this.Y0).s().equals("vi-VN")) {
            imageView = this.I1;
            i10 = R.drawable.ic_playing;
        } else {
            imageView = this.I1;
            i10 = R.drawable.ic_playing_en;
        }
        imageView.setImageResource(i10);
        ((HomeActivity) requireActivity()).f23819q0.q().setOnCompletionListener(this);
        ((HomeActivity) requireActivity()).f23819q0.q().setOnPreparedListener(this);
        ((HomeActivity) requireActivity()).f23819q0.q().setOnVideoSizeChangedListener(this);
        ((HomeActivity) requireActivity()).f23819q0.q().setOnSeekCompleteListener(this);
        j1();
        G1();
        P1();
        I1();
        N1.getHolder().addCallback(this);
        K1();
        t1();
        if (!this.f23852w1) {
            this.f23836g1.setVisibility(0);
            cj.a.r(this.Y0).s();
            this.f23852w1 = true;
        }
    }

    public void surfaceChanged(@m0 SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ((HomeActivity) getActivity()).f23819q0.q().setDisplay(surfaceHolder);
    }

    public void surfaceCreated(@m0 SurfaceHolder surfaceHolder) {
    }

    public void surfaceDestroyed(@m0 SurfaceHolder surfaceHolder) {
    }

    public final void t1() {
        cj.a.r(this.Y0).x(new c());
    }

    public void u1() {
        if (this.C1 == 1) {
            A1(true);
        } else if (M1.size() != 0) {
            O1(this.B1 == M1.size() - 1 ? 0 : this.B1 + 1);
        }
    }

    public void v1(String str) {
        if (M1.size() > 0) {
            for (int i10 = 0; i10 < M1.size(); i10++) {
                if (M1.get(i10).e().equals(str)) {
                    O1(i10);
                    this.f23851v1 = true;
                    return;
                }
            }
        }
    }

    public void w1(int i10) {
        if (M1.size() > i10) {
            O1(i10);
            this.f23851v1 = true;
        }
    }

    public void x1() {
        if (((HomeActivity) getActivity()) != null && ((HomeActivity) getActivity()).f23819q0 != null) {
            ((HomeActivity) getActivity()).f23819q0.q().pause();
            CountDownTimer countDownTimer = this.f23853x1;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f23848s1 = false;
            ej.a.b().F(this.f23848s1);
            this.f23847r1.setImageResource(R.drawable.ic_baseline_play_arrow_24);
            N1();
            L1();
            D1();
        }
    }

    public void y1() {
        if (!this.f23848s1) {
            z1();
        } else {
            x1();
        }
    }

    public void z1() {
        if (this.f23851v1) {
            ((HomeActivity) getActivity()).f23819q0.q().start();
            F1(this.f23854y1);
            this.f23848s1 = true;
            ej.a.b().F(this.f23848s1);
            B1();
            L1();
            D1();
        } else {
            l1();
        }
        C1();
    }
}
