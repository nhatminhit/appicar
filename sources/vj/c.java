package vj;

import aj.a;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import bj.b;
import dj.a;
import ij.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import lj.a;
import mj.a;
import pl.droidsonroids.gif.GifTextView;
import qj.a;
import sj.c;
import sj.i;
import sj.j;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.MediaPlayerService;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class c implements a.c, a.C0295a {

    /* renamed from: n  reason: collision with root package name */
    public static final String f23724n = "ServiceHome";

    /* renamed from: a  reason: collision with root package name */
    public dj.a f23725a;

    /* renamed from: b  reason: collision with root package name */
    public ServiceConnection f23726b;

    /* renamed from: c  reason: collision with root package name */
    public HomeActivity f23727c;

    /* renamed from: d  reason: collision with root package name */
    public Context f23728d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23729e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23730f = false;

    /* renamed from: g  reason: collision with root package name */
    public GifTextView f23731g;

    /* renamed from: h  reason: collision with root package name */
    public GifTextView f23732h;

    /* renamed from: i  reason: collision with root package name */
    public GifTextView f23733i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f23734j;

    /* renamed from: k  reason: collision with root package name */
    public String f23735k = "";

    /* renamed from: l  reason: collision with root package name */
    public Dialog f23736l;

    /* renamed from: m  reason: collision with root package name */
    public final String[] f23737m = {"12"};

    public class a implements ServiceConnection {
        public final /* synthetic */ b.c O;

        public a(b.c cVar) {
            this.O = cVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.this.f23727c.f23819q0 = ((MediaPlayerService.a) iBinder).a();
            jj.a.b(c.this.f23728d).m(c.this.f23727c);
            bj.b.i(c.this.f23728d).l(this.O);
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public class b implements c.b {
        public b() {
        }

        public void a() {
        }

        public void b() {
            if (i.r(c.this.f23728d).I() && !ui.a.b().f23422y && ej.a.b().q()) {
                c.this.z();
            }
        }
    }

    /* renamed from: vj.c$c  reason: collision with other inner class name */
    public class C0471c implements Runnable {
        public final /* synthetic */ long O;
        public final /* synthetic */ zi.a P;

        public C0471c(long j10, zi.a aVar) {
            this.O = j10;
            this.P = aVar;
        }

        public void run() {
            c.this.K(this.O, this.P);
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            lj.a.a(c.this.f23728d).e();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            if (c.this.f23735k.length() == 0) {
                lj.a.a(c.this.f23728d).e();
                if (c.this.f23736l != null && c.this.f23736l.isShowing()) {
                    c.this.f23736l.dismiss();
                }
            }
        }
    }

    public class f implements a.C0363a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zi.a f23739a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f23740b;

        public f(zi.a aVar, g gVar) {
            this.f23739a = aVar;
            this.f23740b = gVar;
        }

        public void a(Bundle bundle) {
            c.this.D(this.f23739a, this.f23740b);
            boolean unused = c.this.f23729e = true;
            c.this.f23731g.setVisibility(8);
            c.this.f23732h.setVisibility(0);
            c.this.E(bundle);
        }

        public void b(Bundle bundle) {
            boolean unused = c.this.f23730f = true;
            c.this.f23732h.setVisibility(8);
            c.this.f23733i.setVisibility(0);
            c.this.E(bundle);
            c.this.B(this.f23739a, this.f23740b);
        }

        public void onBeginningOfSpeech() {
        }

        public void onError(int i10) {
            Context context;
            int i11;
            if (i10 == 1) {
                context = c.this.f23728d;
                i11 = R.string.internet_false;
            } else if (i10 == 2) {
                context = c.this.f23728d;
                i11 = R.string.error_internet;
            } else if (i10 == 3) {
                context = c.this.f23728d;
                i11 = R.string.micro_error;
            } else if (i10 == 7) {
                c.this.f23736l.dismiss();
                return;
            } else {
                return;
            }
            Toast.makeText(context, i11, 0).show();
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ zi.a O;
        public final /* synthetic */ g P;

        public g(zi.a aVar, g gVar) {
            this.O = aVar;
            this.P = gVar;
        }

        public void run() {
            c.this.f23736l.dismiss();
            this.O.f25129t0.setText(c.this.f23735k);
            EditText editText = this.O.f25129t0;
            editText.setSelection(editText.getText().length());
            this.P.z().v1(c.this.f23735k, true);
            i.r(c.this.f23728d).r0(c.this.f23735k);
        }
    }

    public class h extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zi.a f23742a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g f23743b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(long j10, long j11, zi.a aVar, g gVar) {
            super(j10, j11);
            this.f23742a = aVar;
            this.f23743b = gVar;
        }

        public void onFinish() {
            lj.a.a(c.this.f23728d).e();
            c.this.f23736l.dismiss();
        }

        public void onTick(long j10) {
            if (!c.this.f23730f) {
                if (c.this.f23735k.length() > 0) {
                    c cVar = c.this;
                    if (Objects.equals(cVar.f23737m[0], cVar.f23735k)) {
                        c.this.f23732h.setVisibility(8);
                        c.this.f23733i.setVisibility(0);
                        lj.a.a(c.this.f23728d).e();
                        c.this.B(this.f23742a, this.f23743b);
                    } else {
                        c cVar2 = c.this;
                        cVar2.f23737m[0] = cVar2.f23735k;
                        return;
                    }
                } else {
                    return;
                }
            }
            cancel();
        }
    }

    public c(HomeActivity homeActivity) {
        this.f23727c = homeActivity;
        this.f23728d = homeActivity;
    }

    public void A(wi.f fVar) {
        i.r(this.f23728d).T0(fVar.a().b().a());
        i.r(this.f23728d).U0(fVar.a().c().a());
        i.r(this.f23728d).k0(fVar.a().a().get(0));
        i.r(this.f23728d).k1(fVar.a().b().b());
        i.r(this.f23728d).l1(fVar.a().c().b());
        ad.d.c(f23724n, "onStart");
        ej.a.b().z(true);
    }

    public final void B(zi.a aVar, g gVar) {
        new Handler().postDelayed(new g(aVar, gVar), 1000);
    }

    public void C(boolean z10) {
        try {
            kj.a.j(this.f23728d).l(new a.C0395a("fullscreen", z10, (List<a.C0395a.b>) null, (List<a.C0395a.C0396a>) null));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void D(zi.a aVar, g gVar) {
        if (!this.f23729e) {
            new h(14000, 2000, aVar, gVar).start();
        }
    }

    public final void E(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        this.f23734j.setText(stringArrayList.get(0));
        this.f23735k = stringArrayList.get(0);
    }

    public void F() {
        this.f23727c.getWindow().getDecorView().setSystemUiVisibility(256);
    }

    public void G(zi.a aVar, g gVar) {
        this.f23730f = false;
        this.f23729e = false;
        this.f23735k = "";
        Dialog dialog = this.f23736l;
        if (dialog != null) {
            dialog.cancel();
        }
        Dialog dialog2 = new Dialog(this.f23728d);
        this.f23736l = dialog2;
        dialog2.setContentView(R.layout.dialog_speech_to_text);
        this.f23736l.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.f23736l.show();
        ((TextView) this.f23736l.findViewById(R.id.txt_language)).setText(Locale.getDefault().getDisplayName());
        this.f23734j = (TextView) this.f23736l.findViewById(R.id.txt_content);
        this.f23732h = (GifTextView) this.f23736l.findViewById(R.id.gif_speaking);
        this.f23731g = (GifTextView) this.f23736l.findViewById(R.id.gif_waiting);
        this.f23733i = (GifTextView) this.f23736l.findViewById(R.id.gif_done);
        lj.a.a(this.f23728d).c(H(aVar, gVar));
        lj.a.a(this.f23728d).d(this.f23728d);
        this.f23736l.setOnDismissListener(new d());
        new Handler().postDelayed(new e(), 10000);
    }

    public final a.C0363a H(zi.a aVar, g gVar) {
        return new f(aVar, gVar);
    }

    public void I(b.c cVar) {
        this.f23726b = new a(cVar);
        this.f23728d.bindService(new Intent(this.f23727c, MediaPlayerService.class), this.f23726b, 1);
    }

    public void J() {
        this.f23728d.unbindService(this.f23726b);
    }

    public final void K(long j10, zi.a aVar) {
        int i10;
        ImageView imageView;
        if (j10 >= 0 && j10 <= 100) {
            imageView = aVar.f25132w0;
            i10 = R.drawable.ic_ping_green;
        } else if (j10 <= 100 || j10 > 250) {
            imageView = aVar.f25132w0;
            i10 = R.drawable.ic_ping_red;
        } else {
            imageView = aVar.f25132w0;
            i10 = R.drawable.ic_ping_yellow;
        }
        imageView.setImageResource(i10);
    }

    public void a(int i10) {
        mj.a.d(this.f23728d).l(i10);
    }

    public void b(int i10) {
        if (this.f23725a == null) {
            this.f23725a = new dj.a(this.f23728d, this);
        }
        this.f23725a.a(i10);
    }

    public void q(zi.a aVar) {
        aVar.f25132w0.setVisibility(i.r(this.f23728d).J() ? 0 : 8);
    }

    public void r() {
        ui.a.b().A = new sj.c(this.f23728d);
        ui.a.b().A.b(new b());
        ui.a.b().A.c();
    }

    public void s() {
        this.f23727c.getWindow().getDecorView().setSystemUiVisibility(7942);
    }

    public void t(a.b bVar, b.c cVar) {
        ej.a.b().G(this.f23728d);
        ij.a.d(this.f23728d).e(bVar);
        mj.a.d(this.f23728d).m(this);
        I(cVar);
        v();
        ej.a.b().H(true);
    }

    public void u(View.OnClickListener onClickListener, zi.a aVar) {
        aVar.f25131v0.setOnClickListener(onClickListener);
        aVar.B0.f25188a1.setOnClickListener(onClickListener);
        aVar.B0.f25192w0.setOnClickListener(onClickListener);
        aVar.B0.T0.setOnClickListener(onClickListener);
        aVar.C0.setOnClickListener(onClickListener);
        aVar.f25134y0.setOnClickListener(onClickListener);
        aVar.B0.f25190u0.setOnClickListener(onClickListener);
        aVar.B0.f25191v0.setOnClickListener(onClickListener);
        aVar.B0.f25195z0.setOnClickListener(onClickListener);
        aVar.f25133x0.setOnClickListener(onClickListener);
        aVar.H0.setOnClickListener(onClickListener);
        aVar.f25130u0.setOnClickListener(onClickListener);
        aVar.B0.f25193x0.setOnClickListener(onClickListener);
        aVar.B0.f25194y0.setOnClickListener(onClickListener);
        aVar.B0.H0.setOnClickListener(onClickListener);
        aVar.B0.F0.setOnClickListener(onClickListener);
        aVar.B0.f25189t0.setOnClickListener(onClickListener);
    }

    public final void v() {
        String b10 = vc.c.g().d().b();
        b10.hashCode();
        char c10 = 65535;
        switch (b10.hashCode()) {
            case -1864985417:
                if (b10.equals("ELLIVIEW S3")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1864985416:
                if (b10.equals("ELLIVIEW S4")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1864985355:
                if (b10.equals("ELLIVIEW U3")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1864985354:
                if (b10.equals("ELLIVIEW U4")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                try {
                    this.f23725a = new dj.a(this.f23728d, this);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                return;
        }
    }

    public String w() {
        if (i.r(this.f23728d).h().equals("")) {
            i.r(this.f23728d).p0(this.f23728d.getResources().getString(R.string.continue_playing));
        } else {
            String h10 = i.r(this.f23728d).h();
            h10.hashCode();
            char c10 = 65535;
            switch (h10.hashCode()) {
                case -1561559170:
                    if (h10.equals(j.f23088x)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1527348823:
                    if (h10.equals(j.f23079o)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1480040898:
                    if (h10.equals(j.f23076l)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1325468476:
                    if (h10.equals(j.f23069e)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -1243269116:
                    if (h10.equals(j.f23086v)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -819587589:
                    if (h10.equals(j.f23083s)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -646397310:
                    if (h10.equals(j.f23084t)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 2690:
                    if (h10.equals("TV")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 78717915:
                    if (h10.equals("Radio")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 147414783:
                    if (h10.equals(j.f23081q)) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 170797306:
                    if (h10.equals(j.f23077m)) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 349856231:
                    if (h10.equals(j.f23075k)) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 672908035:
                    if (h10.equals(a.e.f16172d)) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1080341942:
                    if (h10.equals(j.f23082r)) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 1115713592:
                    if (h10.equals(j.f23070f)) {
                        c10 = 14;
                        break;
                    }
                    break;
                case 1425334010:
                    if (h10.equals(j.f23080p)) {
                        c10 = 15;
                        break;
                    }
                    break;
                case 1447914017:
                    if (h10.equals(j.f23078n)) {
                        c10 = 16;
                        break;
                    }
                    break;
                case 1477240079:
                    if (h10.equals(j.f23071g)) {
                        c10 = 17;
                        break;
                    }
                    break;
                case 1477842786:
                    if (h10.equals(j.f23074j)) {
                        c10 = 18;
                        break;
                    }
                    break;
                case 1502799235:
                    if (h10.equals(j.f23073i)) {
                        c10 = 19;
                        break;
                    }
                    break;
                case 1570940141:
                    if (h10.equals(j.f23072h)) {
                        c10 = 20;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 8:
                    return "Radio";
                case 1:
                case 15:
                    return a.e.f16178j;
                case 2:
                case 11:
                    return a.e.f16176h;
                case 3:
                case 14:
                    return a.e.f16173e;
                case 4:
                case 7:
                    break;
                case 5:
                case 6:
                    return i.r(this.f23728d).e();
                case 9:
                case 13:
                    return a.e.f16179k;
                case 10:
                case 16:
                    return a.e.f16177i;
                case 12:
                    return a.e.f16172d;
                case 17:
                case 20:
                    return a.e.f16174f;
                case 18:
                case 19:
                    return a.e.f16175g;
                default:
                    return "";
            }
        }
        return "TV";
    }

    public void x(long j10, zi.a aVar) {
        if (j10 >= 0) {
            this.f23727c.runOnUiThread(new C0471c(j10, aVar));
        }
    }

    public void y(boolean z10, g gVar) {
        boolean z11;
        ui.a aVar;
        if (z10) {
            if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
                gVar.x().U1();
            } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                gVar.w().M1();
            } else {
                gVar.z().I1();
            }
            aVar = ui.a.b();
            z11 = true;
        } else {
            if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
                gVar.x().T1();
            } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                gVar.w().Q1();
            } else {
                gVar.z().H1();
            }
            aVar = ui.a.b();
            z11 = false;
        }
        aVar.f23422y = z11;
    }

    public void z() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ui.a.b().f23423z.build();
                this.f23727c.enterPictureInPictureMode(ui.a.b().f23423z.build());
            } catch (Exception unused) {
            }
        }
    }
}
