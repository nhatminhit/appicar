package fj;

import aj.a;
import android.annotation.SuppressLint;
import android.app.PictureInPictureParams$Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import bj.b;
import cd.b;
import cd.d;
import cj.a;
import ij.a;
import java.util.ArrayList;
import kj.a;
import ri.i;
import sj.h;
import sj.k;
import vj.c;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;
import vn.icar.entertaiment.view.activity.LogoActivity;
import wi.f;
import wi.g;
import wi.j;

public class a implements a.b, b.c, g, View.OnClickListener, a.f, xi.b, a.d, d {

    /* renamed from: b0  reason: collision with root package name */
    public static final String f18935b0 = "HandleHome";
    public HomeActivity O;
    public Context P;
    public zi.a Q;
    public c R;
    public vj.g S;
    public vj.a T;
    public vj.d U;
    public vj.b V;
    public uj.a W;
    public di.a X;
    public cd.b Y;
    public boolean Z = false;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f18936a0 = false;

    /* renamed from: fj.a$a  reason: collision with other inner class name */
    public class C0309a implements PopupMenu.OnMenuItemClickListener {
        public C0309a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.exit:
                    a.this.O.finish();
                    return false;
                case R.id.introduce:
                    a.this.V.q(a.this);
                    return false;
                case R.id.loadNew:
                    a aVar = a.this;
                    aVar.H(aVar.R.w());
                    return false;
                case R.id.logout:
                    a.this.V.l();
                    return false;
                case R.id.setting:
                    a.this.U.p(true);
                    a.this.U.m();
                    a.this.U.o();
                    return false;
                default:
                    return false;
            }
        }
    }

    public class b implements ri.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f18938a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f18939b;

        public b(TextView textView, RelativeLayout relativeLayout) {
            this.f18938a = textView;
            this.f18939b = relativeLayout;
        }

        @SuppressLint({"SetTextI18n"})
        public void a(i iVar, int i10) {
            RelativeLayout relativeLayout;
            if (iVar != null) {
                ui.a.b().J = iVar;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("update: ");
                sb2.append(iVar.c());
                sb2.append("//");
                sb2.append(k.f(a.this.P, a.this.P.getPackageName()));
                if (!iVar.c().equals(k.f(a.this.P, a.this.P.getPackageName()))) {
                    if (!(this.f18938a == null || (relativeLayout = this.f18939b) == null)) {
                        relativeLayout.setVisibility(0);
                        TextView textView = this.f18938a;
                        textView.setText(a.this.P.getString(R.string.update_version) + ui.a.b().J.c() + ")");
                    }
                    if (iVar.a().equals("1")) {
                        a.this.V.s();
                        a.this.O.f23821s0 = true;
                    }
                }
            }
        }
    }

    public a(HomeActivity homeActivity, zi.a aVar) {
        this.O = homeActivity;
        this.Q = aVar;
        this.P = homeActivity;
        ui.a.b().B = k.b(homeActivity);
        O();
        this.W = new uj.a(homeActivity);
        this.X = new di.a(this.P);
        this.R = new c(homeActivity);
        this.V = new vj.b(homeActivity);
        this.R.t(this, this);
        this.S = new vj.g(homeActivity, aVar, this.W);
        this.T = new vj.a(homeActivity, aVar, this.W);
    }

    public void A(f fVar, int i10, String str) {
        this.Q.F0.setVisibility(8);
        if (i10 == 200) {
            this.R.A(fVar);
            if (!this.f18936a0) {
                this.T.d();
                z();
                return;
            }
            return;
        }
        Toast.makeText(this.P, str, 0).show();
    }

    public void B() {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            this.S.x().P1();
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            this.S.w().M1();
        } else {
            this.S.z().F1();
        }
    }

    public void C(TextView textView, RelativeLayout relativeLayout) {
        new ri.c(new b(textView, relativeLayout)).b(this.P);
    }

    public final void D() {
        Intent intent = this.O.getIntent();
        if (intent.getStringExtra("key") == null && intent.getStringExtra("key2") == null && intent.getStringExtra("key3") == null) {
            H("");
        } else {
            bj.b.i(this.P).g(intent);
        }
    }

    public final void E(int i10, xi.a aVar, String str) {
        if (i10 == 200) {
            ui.a.b().f23418u.clear();
            ui.a.b().f23411n = (ArrayList) aVar.a();
            this.T.a(ui.a.b().f23411n);
            ui.a.b().f23418u.addAll(ui.a.b().f23411n);
            this.T.b();
            this.T.e(true);
            if (!this.Z) {
                F();
                D();
                this.Z = true;
            } else if (ej.a.b().p()) {
                H("");
                ej.a.b().E(false);
            }
        } else {
            Toast.makeText(this.P, str, 0).show();
        }
    }

    public void F() {
        this.U = new vj.d(this.O, this.Q);
        if (Build.VERSION.SDK_INT >= 26) {
            ui.a.b().f23423z = new PictureInPictureParams$Builder();
        }
        this.R.u(this, this.Q);
        this.S.c();
        this.S.t(this.Q);
        this.S.y(this.Q, this.T);
        this.S.v(this.Q);
        this.S.l(this.Q);
        cj.a.r(this.P).y(this);
        this.R.r();
        cd.b bVar = new cd.b(this.P);
        this.Y = bVar;
        bVar.c(new b.C0267b(f18935b0, this));
        this.R.q(this.Q);
    }

    public /* synthetic */ void G(int i10) {
        cd.c.a(this, i10);
    }

    public void H(String str) {
        if (str.equals("")) {
            this.S.n(this.R.w());
        } else {
            this.S.n(str);
        }
        if (!ui.a.b().f23398a.equals("TV") && !ui.a.b().f23398a.equals(a.e.f16172d) && !ui.a.b().f23398a.equals("Radio")) {
            this.T.e(true);
        }
    }

    public void I() {
        if (!sj.i.r(this.P).I() || !ej.a.b().q()) {
            this.O.finish();
            System.exit(0);
            return;
        }
        this.R.z();
    }

    public void J(long j10) {
        this.R.x(j10, this.Q);
        if (this.Y.k()) {
            this.S.h();
        }
    }

    public void K() {
        ad.d.c(f18935b0, "onDestroy");
        this.V.k();
        mj.a.d(this.P).n();
        bj.b.i(this.P).m();
        ej.a.b().H(false);
        ej.a.b().a();
        cd.b bVar = this.Y;
        if (bVar != null) {
            bVar.o(f18935b0);
        }
        c cVar = this.R;
        if (cVar != null) {
            cVar.J();
        }
        if (ui.a.b().A != null) {
            ui.a.b().A.d();
        }
        ui.a.b().a();
        kj.a.j(this.P).g();
    }

    public final void L(boolean z10, boolean z11) {
        if (!this.X.q().equals("")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10);
            sb2.append("//");
            sb2.append(z11);
            if (z10 && z11) {
                sj.i.r(this.P).O0(false);
                this.V.i();
                y();
            } else if (z10) {
                this.V.i();
                Toast.makeText(this.P, R.string.connect_again, 0).show();
                H("");
            } else if (this.Z) {
            } else {
                if (sj.i.r(this.P).H()) {
                    F();
                    H(a.e.f16179k);
                    this.Z = true;
                    ej.a.b().E(true);
                    return;
                }
                this.V.m(this);
            }
        } else if (sj.i.r(this.P).a().equals("") || sj.i.r(this.P).L().equals("")) {
            if (!ej.a.b().d()) {
                this.O.startActivity(new Intent(this.O, LogoActivity.class));
            }
            this.O.finish();
        } else {
            this.X.H(sj.i.r(this.P).a());
            this.X.B(sj.i.r(this.P).L());
            L(z10, z11);
        }
    }

    public void M() {
        if (!ui.a.b().f23398a.equals(a.e.f16172d)) {
            this.Q.O0.setVisibility(0);
            this.Q.O0.setVisibility(0);
            this.Q.I0.setVisibility(4);
            this.Q.f25129t0.setVisibility(0);
        } else if (h.c(this.O)) {
            this.R.G(this.Q, this.S);
        }
    }

    public final void N() {
        this.U.h(new C0309a());
    }

    public final void O() {
        if (ui.a.b().B < 1.3d) {
            this.Q.L0.setVisibility(8);
        }
    }

    public void P(int i10) {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            this.S.x().t1(i10);
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            this.S.w().p1(i10);
        } else {
            this.S.z().k1(i10);
        }
    }

    public void Q(boolean z10) {
        ui.a aVar;
        boolean z11;
        if (z10) {
            this.Q.A0.setVisibility(8);
            this.Q.f25132w0.setVisibility(8);
            this.Q.E0.setVisibility(8);
            this.R.s();
            aVar = ui.a.b();
            z11 = true;
        } else {
            z11 = false;
            this.Q.A0.setVisibility(0);
            this.Q.f25132w0.setVisibility(0);
            this.Q.E0.setVisibility(0);
            this.R.q(this.Q);
            this.R.F();
            aVar = ui.a.b();
        }
        aVar.I = z11;
        this.R.C(z11);
    }

    public void a() {
        ad.d.c(f18935b0, "đăng xuất từ socket trả về");
        k.m(this.P, "");
    }

    public void b() {
        this.S.i();
    }

    public void c() {
        H(this.R.w());
        if (sj.i.r(this.P).i()) {
            ad.d.e(f18935b0, "ẩn app");
            k.g(this.P);
            return;
        }
        ad.d.e(f18935b0, "ko ẩn app");
    }

    public void d(String str, String str2) {
        this.V.r(str, str2);
    }

    public void e(boolean z10, boolean z11) {
        L(z10, z11);
    }

    public void f(boolean z10) {
    }

    public void g() {
        this.S.d();
    }

    public void h(String str, String str2, long j10) {
        this.V.t(this.Q, str, str2, j10);
    }

    public void i(xi.a aVar, int i10, String str) {
        E(i10, aVar, str);
    }

    public void j(ArrayList<ti.a> arrayList) {
        ui.a.b().F.clear();
        ui.a.b().F.addAll(arrayList);
        if (ui.a.b().G != null) {
            ui.a.b().G.j();
        }
    }

    public void k(String str) {
        ui.a.b().E = str;
        H(a.e.f16172d);
    }

    public void l(String str) {
        jj.a.b(this.P).f(this.O, str);
    }

    public void m() {
        int i10;
        jj.a aVar;
        if (mj.a.d(this.P).g() > 0) {
            aVar = jj.a.b(this.P);
            i10 = 0;
        } else {
            aVar = jj.a.b(this.P);
            i10 = 101;
        }
        aVar.o(i10);
    }

    public void n() {
        this.S.k();
    }

    public void o(String str) {
        ui.a.b().C = str;
        H("TV");
    }

    @SuppressLint({"NonConstantResourceId"})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send_report:
                this.U.p(false);
                this.U.i();
                return;
            case R.id.img_back:
                if (ui.a.b().f23398a.equals(a.e.f16172d)) {
                    this.S.z().Z0();
                    return;
                }
                return;
            case R.id.img_continue_play:
                this.U.j();
                return;
            case R.id.img_daily_news:
                this.U.f();
                return;
            case R.id.img_exit:
            case R.id.view_background_setting:
                this.U.p(false);
                return;
            case R.id.img_exit_notification:
                this.Q.N0.setVisibility(8);
                return;
            case R.id.img_hide_app:
                this.U.k();
                return;
            case R.id.img_picture_in_picture:
                this.U.l();
                return;
            case R.id.img_ping_internet:
                this.U.n();
                this.R.q(this.Q);
                return;
            case R.id.img_selection:
                N();
                return;
            case R.id.img_youtube:
                H(a.e.f16172d);
                return;
            case R.id.list_channels:
                if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                    this.V.n();
                    return;
                } else {
                    this.V.o(this.T, this.S);
                    return;
                }
            case R.id.search_channels:
                M();
                return;
            default:
                return;
        }
    }

    public void p(String str) {
        this.S.q(str);
    }

    public void q(boolean z10) {
        this.S.e(z10);
    }

    public void r(int i10) {
        P(i10);
    }

    public void s(String str) {
        H(str);
    }

    public void t(String str) {
        ui.a.b().D = str;
        H("Radio");
    }

    public final void y() {
        if (!sj.i.r(this.P).M().equals("")) {
            this.T.d();
            z();
            this.f18936a0 = true;
        } else {
            this.Q.F0.setVisibility(0);
        }
        if (!ej.a.b().k()) {
            new j(this).h(this.P);
        }
        kj.a.j(this.P).p(this);
    }

    public final void z() {
        if (!sj.i.r(this.P).t().equals("")) {
            E(200, (xi.a) new sj.d().b(sj.i.r(this.P).t(), xi.a.class), "");
        }
        if (!ej.a.b().f()) {
            new xi.c(this).f(new vi.a(sj.i.r(this.P).s()), this.P);
        }
    }
}
