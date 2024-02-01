package vj;

import ad.c;
import android.content.Context;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tatv.baseapp.view.dialog.ReportDialog;
import java.util.ArrayList;
import java.util.Iterator;
import pj.g;
import sj.h;
import sj.i;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public HomeActivity f23745a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23746b;

    /* renamed from: c  reason: collision with root package name */
    public zi.a f23747c;

    /* renamed from: d  reason: collision with root package name */
    public String[] f23748d = {"OWNICE C970", "OWNICE C970 (+360)", "OWNICE C960", "OWNICE C800", "OWNICE C500+", "ELLIVIEW S4", "ELLIVIEW U4", "ELLIVIEW S3", "MOBILE PHONE", "ANDROID BOX", "ELLIVIEW U3", "ELLIVIEW D4", "ELLIVIEW D5", "ELLIVIEW DE"};

    /* renamed from: e  reason: collision with root package name */
    public ReportDialog f23749e;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            vc.c.g().n(d.this.f23748d[i10]);
            jj.a.b(d.this.f23746b).k();
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f23750a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oi.g f23751b;

        public b(ArrayList arrayList, oi.g gVar) {
            this.f23750a = arrayList;
            this.f23751b = gVar;
        }

        public void a(int i10) {
            Iterator it = this.f23750a.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (((qj.c) it.next()).getTab().equals(((qj.c) this.f23750a.get(i10)).getTab())) {
                    ((qj.c) this.f23750a.get(i11)).setClick(true);
                    i.r(d.this.f23746b).p0(((qj.c) this.f23750a.get(i11)).getTab());
                } else {
                    ((qj.c) this.f23750a.get(i11)).setClick(false);
                }
                i11++;
            }
            this.f23751b.j();
        }
    }

    public class c implements c.b {
        public c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void e(String str) {
            Toast.makeText(d.this.f23746b, str, 0).show();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            Toast.makeText(d.this.f23746b, d.this.f23746b.getString(R.string.text_send_report_success), 0).show();
        }

        public void a(String str) {
            d.this.f23745a.runOnUiThread(new f(this, str));
            if (d.this.f23749e != null) {
                d.this.f23749e.hide();
            }
        }

        public void b(String str) {
            if (d.this.f23749e == null) {
                ReportDialog unused = d.this.f23749e = new ReportDialog(d.this.f23746b);
            } else if (d.this.f23749e.isShowing()) {
                d.this.f23749e.e(str);
                return;
            }
            d.this.f23749e.show();
        }

        public void onSuccess() {
            d.this.f23745a.runOnUiThread(new e(this));
            if (d.this.f23749e != null) {
                d.this.f23749e.hide();
            }
        }
    }

    public d(HomeActivity homeActivity, zi.a aVar) {
        HomeActivity homeActivity2 = homeActivity;
        this.f23745a = homeActivity2;
        this.f23747c = aVar;
        this.f23746b = homeActivity2;
        g();
    }

    public void f() {
        int i10;
        ImageView imageView;
        if (i.r(this.f23746b).g()) {
            i.r(this.f23746b).o0(false);
            imageView = this.f23747c.B0.f25191v0;
            i10 = R.drawable.ic_tg_off;
        } else {
            i.r(this.f23746b).o0(true);
            imageView = this.f23747c.B0.f25191v0;
            i10 = R.drawable.ic_tg_on;
        }
        imageView.setImageResource(i10);
    }

    public void g() {
        if (i.r(this.f23746b).i()) {
            this.f23747c.B0.f25193x0.setImageResource(R.drawable.ic_tg_on);
        } else {
            this.f23747c.B0.f25193x0.setImageResource(R.drawable.ic_tg_off);
        }
        if (i.r(this.f23746b).I()) {
            this.f23747c.B0.f25194y0.setImageResource(R.drawable.ic_tg_on);
        } else {
            this.f23747c.B0.f25194y0.setImageResource(R.drawable.ic_tg_off);
        }
        if (i.r(this.f23746b).J()) {
            this.f23747c.B0.f25195z0.setImageResource(R.drawable.ic_tg_on);
        } else {
            this.f23747c.B0.f25195z0.setImageResource(R.drawable.ic_tg_off);
        }
        int i10 = 0;
        if (i.r(this.f23746b).f()) {
            this.f23747c.B0.f25190u0.setImageResource(R.drawable.ic_tg_on);
            this.f23747c.B0.E0.setVisibility(0);
            this.f23747c.B0.f25191v0.setVisibility(0);
            this.f23747c.B0.K0.setVisibility(0);
            this.f23747c.B0.Z0.setVisibility(0);
            if (i.r(this.f23746b).g()) {
                this.f23747c.B0.f25191v0.setImageResource(R.drawable.ic_tg_on);
            } else {
                this.f23747c.B0.f25191v0.setImageResource(R.drawable.ic_tg_off);
            }
        } else {
            i.r(this.f23746b).o0(false);
            this.f23747c.B0.f25190u0.setImageResource(R.drawable.ic_tg_off);
            this.f23747c.B0.E0.setVisibility(8);
            this.f23747c.B0.f25191v0.setVisibility(8);
            this.f23747c.B0.K0.setVisibility(8);
            this.f23747c.B0.Z0.setVisibility(8);
        }
        if (h.a(this.f23745a)) {
            this.f23747c.B0.C0.setAdapter(new oi.c(this.f23746b, this.f23748d));
            if (!vc.c.g().d().b().equals("")) {
                while (true) {
                    String[] strArr = this.f23748d;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if (strArr[i10].equals(vc.c.g().d().b())) {
                        this.f23747c.B0.C0.setSelection(i10);
                    }
                    i10++;
                }
            } else {
                vc.c.g().n("ELLIVIEW S4");
            }
            this.f23747c.B0.C0.setOnItemSelectedListener(new a());
        }
    }

    public void h(PopupMenu.OnMenuItemClickListener onMenuItemClickListener) {
        PopupMenu popupMenu = new PopupMenu(this.f23745a, this.f23747c.f25133x0);
        popupMenu.getMenuInflater().inflate(R.menu.menu_selection, popupMenu.getMenu());
        popupMenu.setGravity(8388613);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void i() {
        di.a aVar = new di.a(this.f23746b);
        ad.c n10 = ad.c.n();
        String N = aVar.N();
        n10.w(N, i.f23063d + vc.c.g().a(), this.f23746b.getString(R.string.app_name), new c());
    }

    public void j() {
        if (i.r(this.f23746b).f()) {
            i.r(this.f23746b).n0(false);
            i.r(this.f23746b).o0(false);
            this.f23747c.B0.f25190u0.setImageResource(R.drawable.ic_tg_off);
            this.f23747c.B0.f25191v0.setImageResource(R.drawable.ic_tg_off);
            this.f23747c.B0.E0.setVisibility(8);
            this.f23747c.B0.f25191v0.setVisibility(8);
            this.f23747c.B0.K0.setVisibility(8);
            this.f23747c.B0.Z0.setVisibility(8);
            return;
        }
        i.r(this.f23746b).n0(true);
        i.r(this.f23746b).o0(false);
        this.f23747c.B0.f25191v0.setImageResource(R.drawable.ic_tg_off);
        this.f23747c.B0.f25190u0.setImageResource(R.drawable.ic_tg_on);
        this.f23747c.B0.E0.setVisibility(0);
        this.f23747c.B0.f25191v0.setVisibility(0);
        this.f23747c.B0.K0.setVisibility(0);
        this.f23747c.B0.Z0.setVisibility(0);
    }

    public void k() {
        int i10;
        ImageView imageView;
        if (i.r(this.f23746b).i()) {
            i.r(this.f23746b).q0(false);
            imageView = this.f23747c.B0.f25193x0;
            i10 = R.drawable.ic_tg_off;
        } else {
            i.r(this.f23746b).q0(true);
            imageView = this.f23747c.B0.f25193x0;
            i10 = R.drawable.ic_tg_on;
        }
        imageView.setImageResource(i10);
    }

    public void l() {
        int i10;
        ImageView imageView;
        if (i.r(this.f23746b).I()) {
            i.r(this.f23746b).P0(false);
            imageView = this.f23747c.B0.f25194y0;
            i10 = R.drawable.ic_tg_off;
        } else {
            i.r(this.f23746b).P0(true);
            imageView = this.f23747c.B0.f25194y0;
            i10 = R.drawable.ic_tg_on;
        }
        imageView.setImageResource(i10);
    }

    public void m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qj.c(this.f23746b.getString(R.string.continue_playing)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.youtube)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.tv)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.radio)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.offline)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.review)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.short_story)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.knowledge)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.news)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.children)));
        arrayList.add(new qj.c(this.f23746b.getResources().getString(R.string.love_car)));
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((qj.c) it.next()).getTab().equals(i.r(this.f23746b).h())) {
                ((qj.c) arrayList.get(i10)).setClick(true);
            } else {
                ((qj.c) arrayList.get(i10)).setClick(false);
            }
            i10++;
        }
        oi.g gVar = new oi.g(arrayList, this.f23746b);
        gVar.F(new b(arrayList, gVar));
        this.f23747c.B0.B0.setLayoutManager(new LinearLayoutManager(this.f23746b));
        this.f23747c.B0.B0.setAdapter(gVar);
    }

    public void n() {
        int i10;
        ImageView imageView;
        if (i.r(this.f23746b).J()) {
            i.r(this.f23746b).Q0(false);
            imageView = this.f23747c.B0.f25195z0;
            i10 = R.drawable.ic_tg_off;
        } else {
            i.r(this.f23746b).Q0(true);
            imageView = this.f23747c.B0.f25195z0;
            i10 = R.drawable.ic_tg_on;
        }
        imageView.setImageResource(i10);
    }

    public void o() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OWNICE C970");
        arrayList.add("OWNICE C970 (+360)");
        arrayList.add("OWNICE C960");
        arrayList.add("OWNICE C800");
        arrayList.add("OWNICE C500+");
        arrayList.add("ELLIVIEW S4");
        arrayList.add("ELLIVIEW U4");
        arrayList.add("ELLIVIEW S3");
        arrayList.add("MOBILE PHONE");
        arrayList.add("ANDROID BOX");
        arrayList.add("ELLIVIEW U3");
        arrayList.add("ELLIVIEW D4");
    }

    public void p(boolean z10) {
        Slide slide = new Slide(5);
        slide.setDuration(600);
        slide.addTarget(R.id.view_setting);
        TransitionManager.beginDelayedTransition(this.f23747c.M0, slide);
        int i10 = 0;
        this.f23747c.B0.f25188a1.setVisibility(z10 ? 0 : 8);
        RelativeLayout relativeLayout = this.f23747c.B0.T0;
        if (!z10) {
            i10 = 8;
        }
        relativeLayout.setVisibility(i10);
    }
}
