package vj;

import aj.a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import java.util.Iterator;
import rj.c0;
import rj.g0;
import rj.j0;
import rj.y;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.utils.UpdateDialog;
import vn.icar.entertaiment.view.activity.HomeActivity;
import vn.icar.entertaiment.view.activity.LoginActivity;

public class b implements si.a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f23712f = "DialogHome";

    /* renamed from: a  reason: collision with root package name */
    public HomeActivity f23713a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23714b;

    /* renamed from: c  reason: collision with root package name */
    public Dialog f23715c;

    /* renamed from: d  reason: collision with root package name */
    public ErrorDialog f23716d;

    /* renamed from: e  reason: collision with root package name */
    public Dialog f23717e;

    public class a implements pj.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f23718a;

        public a(a aVar) {
            this.f23718a = aVar;
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public void a(int i10) {
            if (!ui.a.b().f23418u.get(i10).j()) {
                if (ui.a.b().f23398a.equals(a.e.f16173e)) {
                    ui.a.b().f23403f.d(new y(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                } else if (ui.a.b().f23398a.equals(a.e.f16175g)) {
                    ui.a.b().f23400c.d(new rj.e(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                } else if (ui.a.b().f23398a.equals(a.e.f16174f)) {
                    ui.a.b().f23404g.d(new c0(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                } else if (ui.a.b().f23398a.equals(a.e.f16176h)) {
                    ui.a.b().f23402e.d(new rj.q(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                } else if (ui.a.b().f23398a.equals(a.e.f16177i)) {
                    ui.a.b().f23401d.d(new rj.i(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                } else if (ui.a.b().f23398a.equals(a.e.f16178j)) {
                    ui.a.b().f23399b.d(new rj.a(ui.a.b().f23418u.get(i10).d()), b.this.f23714b);
                }
            } else if (ui.a.b().f23419v == 1) {
                Toast.makeText(b.this.f23714b, R.string.minimum_number_of_channels, 0).show();
                return;
            } else if (ui.a.b().f23398a.equals(a.e.f16173e)) {
                ui.a.b().f23403f.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            } else if (ui.a.b().f23398a.equals(a.e.f16175g)) {
                ui.a.b().f23400c.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            } else if (ui.a.b().f23398a.equals(a.e.f16174f)) {
                ui.a.b().f23404g.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            } else if (ui.a.b().f23398a.equals(a.e.f16176h)) {
                ui.a.b().f23402e.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            } else if (ui.a.b().f23398a.equals(a.e.f16177i)) {
                ui.a.b().f23401d.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            } else if (ui.a.b().f23398a.equals(a.e.f16178j)) {
                ui.a.b().f23399b.b(ui.a.b().f23418u.get(i10).d(), b.this.f23714b);
            }
            this.f23718a.d();
            this.f23718a.e(true);
            ui.a.b().H.j();
        }
    }

    /* renamed from: vj.b$b  reason: collision with other inner class name */
    public class C0470b implements View.OnClickListener {
        public C0470b() {
        }

        public void onClick(View view) {
            b.this.f23715c.dismiss();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ zi.a O;

        public c(zi.a aVar) {
            this.O = aVar;
        }

        public void run() {
            this.O.N0.setVisibility(8);
        }
    }

    public class d implements ErrorDialog.a {
        public final /* synthetic */ fj.a O;

        public d(fj.a aVar) {
            this.O = aVar;
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
            ej.a.b().E(true);
            this.O.F();
            this.O.H(a.e.f16179k);
            this.O.Z = true;
            sj.i.r(b.this.f23714b).O0(true);
        }

        public void v(ErrorDialog errorDialog) {
            b.this.f23716d.dismiss();
            b.this.f23713a.finish();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            b.this.f23717e.dismiss();
            if (sj.h.b(b.this.f23713a)) {
                new UpdateDialog(b.this.f23714b).show();
            }
        }
    }

    public class f implements ri.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f23720a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f23721b;

        public f(TextView textView, TextView textView2) {
            this.f23720a = textView;
            this.f23721b = textView2;
        }

        public void a(ri.d dVar, int i10) {
            if (i10 == 200) {
                this.f23720a.setText(dVar.a().get(0).a());
                this.f23721b.setText(dVar.a().get(0).c());
            }
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ Dialog O;

        public g(Dialog dialog) {
            this.O = dialog;
        }

        public void onClick(View view) {
            this.O.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public final /* synthetic */ Dialog O;

        public h(Dialog dialog) {
            this.O = dialog;
        }

        public void onClick(View view) {
            this.O.dismiss();
            if (sj.h.b(b.this.f23713a)) {
                new UpdateDialog(b.this.f23714b).show();
            }
        }
    }

    public class i implements View.OnClickListener {
        public final /* synthetic */ Dialog O;

        public i(Dialog dialog) {
            this.O = dialog;
        }

        public void onClick(View view) {
            this.O.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public final /* synthetic */ ProgressBar O;
        public final /* synthetic */ Dialog P;

        public j(ProgressBar progressBar, Dialog dialog) {
            this.O = progressBar;
            this.P = dialog;
        }

        public void onClick(View view) {
            this.O.setVisibility(0);
            view.setClickable(false);
            b.this.h(this.P, view, this.O);
        }
    }

    public class k implements View.OnClickListener {
        public final /* synthetic */ ImageView O;
        public final /* synthetic */ ImageView P;
        public final /* synthetic */ ImageView Q;

        public k(ImageView imageView, ImageView imageView2, ImageView imageView3) {
            this.O = imageView;
            this.P = imageView2;
            this.Q = imageView3;
        }

        public void onClick(View view) {
            this.O.setImageResource(R.drawable.ic_radio_button_on);
            this.P.setImageResource(R.drawable.ic_radio_button_off);
            this.Q.setImageResource(R.drawable.ic_radio_button_off);
            sj.i.r(b.this.f23714b).j1("All");
            cj.a.r(b.this.f23714b).w();
        }
    }

    public class l implements View.OnClickListener {
        public final /* synthetic */ ImageView O;
        public final /* synthetic */ ImageView P;
        public final /* synthetic */ ImageView Q;

        public l(ImageView imageView, ImageView imageView2, ImageView imageView3) {
            this.O = imageView;
            this.P = imageView2;
            this.Q = imageView3;
        }

        public void onClick(View view) {
            this.O.setImageResource(R.drawable.ic_radio_button_off);
            this.P.setImageResource(R.drawable.ic_radio_button_on);
            this.Q.setImageResource(R.drawable.ic_radio_button_off);
            sj.i.r(b.this.f23714b).j1("Music");
            cj.a.r(b.this.f23714b).w();
        }
    }

    public class m implements View.OnClickListener {
        public final /* synthetic */ ImageView O;
        public final /* synthetic */ ImageView P;
        public final /* synthetic */ ImageView Q;

        public m(ImageView imageView, ImageView imageView2, ImageView imageView3) {
            this.O = imageView;
            this.P = imageView2;
            this.Q = imageView3;
        }

        public void onClick(View view) {
            this.O.setImageResource(R.drawable.ic_radio_button_off);
            this.P.setImageResource(R.drawable.ic_radio_button_off);
            this.Q.setImageResource(R.drawable.ic_radio_button_on);
            sj.i.r(b.this.f23714b).j1("Video");
            cj.a.r(b.this.f23714b).w();
        }
    }

    public class n implements pj.b {
        public n() {
        }

        public void a(int i10) {
            if (!ui.a.b().F.get(i10).h()) {
                ui.a.b().F.get(i10).m(true);
                if (ui.a.b().F.get(i10).f().equals(e7.d.f6880h)) {
                    new rj.p().d(new rj.m(ui.a.b().F.get(i10).a(), ui.a.b().F.get(i10).c()), b.this.f23714b);
                } else {
                    new j0().d(new g0(ui.a.b().F.get(i10).a(), ui.a.b().F.get(i10).c()), b.this.f23714b);
                }
            } else if (b.this.j() > 1) {
                ui.a.b().F.get(i10).m(false);
                if (ui.a.b().F.get(i10).f().equals(e7.d.f6880h)) {
                    new rj.p().b(ui.a.b().F.get(i10).a(), ui.a.b().F.get(i10).c(), b.this.f23714b);
                } else {
                    new j0().b(ui.a.b().F.get(i10).a(), ui.a.b().F.get(i10).c(), b.this.f23714b);
                }
            } else {
                Toast.makeText(b.this.f23714b, "Cần ít nhất 1 folder được chọn", 0).show();
            }
            ui.a.b().G.j();
        }
    }

    public class o implements DialogInterface.OnDismissListener {
        public o() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            cj.a.r(b.this.f23714b).w();
            cj.a.r(b.this.f23714b).v();
        }
    }

    public class p implements TextWatcher {
        public final /* synthetic */ EditText O;
        public final /* synthetic */ a P;

        public p(EditText editText, a aVar) {
            this.O = editText;
            this.P = aVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
        @android.annotation.SuppressLint({"NotifyDataSetChanged"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            /*
                r0 = this;
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "review_film"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x001d
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23412o
            L_0x0019:
                r1.addAll(r2)
                goto L_0x0086
            L_0x001d:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "history"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0032
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23415r
                goto L_0x0019
            L_0x0032:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "story"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0047
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23416s
                goto L_0x0019
            L_0x0047:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "news"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x005c
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23417t
                goto L_0x0019
            L_0x005c:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "kid"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0071
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23413p
                goto L_0x0019
            L_0x0071:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                java.lang.String r3 = "car"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0086
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23414q
                goto L_0x0019
            L_0x0086:
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23418u
                r2.clear()
                android.widget.EditText r2 = r0.O
                android.text.Editable r2 = r2.getText()
                java.lang.String r2 = r2.toString()
                java.lang.String r2 = r2.trim()
                java.lang.String r3 = ""
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00af
                ui.a r2 = ui.a.b()
                java.util.ArrayList<xi.a$a> r2 = r2.f23418u
                r2.addAll(r1)
                goto L_0x00e5
            L_0x00af:
                java.util.Iterator r1 = r1.iterator()
            L_0x00b3:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00e5
                java.lang.Object r2 = r1.next()
                xi.a$a r2 = (xi.a.C0490a) r2
                java.lang.String r3 = r2.f()
                android.widget.EditText r4 = r0.O
                android.text.Editable r4 = r4.getText()
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = r4.toLowerCase()
                boolean r3 = sj.k.d(r3, r4)
                if (r3 == 0) goto L_0x00b3
                ui.a r3 = ui.a.b()
                java.util.ArrayList<xi.a$a> r3 = r3.f23418u
                r3.add(r2)
                goto L_0x00b3
            L_0x00e5:
                vj.a r1 = r0.P
                r2 = 0
                r1.e(r2)
                ui.a r1 = ui.a.b()
                oi.a r1 = r1.H
                r1.j()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vj.b.p.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public final /* synthetic */ a O;
        public final /* synthetic */ g P;

        public q(a aVar, g gVar) {
            this.O = aVar;
            this.P = gVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            this.O.c(this.P);
        }
    }

    public b(HomeActivity homeActivity) {
        this.f23713a = homeActivity;
        this.f23714b = homeActivity;
    }

    public void a(qi.a aVar, int i10, String str) {
        if (i10 == 200) {
            RemoteService.D();
            ad.d.c(f23712f, "đăng xuất thành công, chuyển sang màn đăng nhập");
            sj.i.r(this.f23714b).j0("");
            sj.i.r(this.f23714b).Y0(0);
            sj.i.r(this.f23714b).S0("");
            sj.i.r(this.f23714b).a1(0);
            new di.a(this.f23714b).a();
            RemoteService.D();
            this.f23713a.startActivity(new Intent(this.f23714b, LoginActivity.class));
            this.f23713a.finish();
            return;
        }
        Toast.makeText(this.f23714b, str, 0).show();
    }

    public final void h(Dialog dialog, View view, ProgressBar progressBar) {
        new si.b(this).a(this.f23714b);
        progressBar.setVisibility(8);
        view.setClickable(true);
        dialog.dismiss();
    }

    public void i() {
        ErrorDialog errorDialog = this.f23716d;
        if (errorDialog != null) {
            errorDialog.dismiss();
            this.f23716d.cancel();
        }
    }

    public final int j() {
        int i10 = 0;
        if (ui.a.b().F.size() > 0) {
            Iterator<ti.a> it = ui.a.b().F.iterator();
            while (it.hasNext()) {
                if (it.next().h()) {
                    i10++;
                }
            }
        }
        return i10;
    }

    public void k() {
        Dialog dialog = this.f23715c;
        if (dialog != null && dialog.isShowing()) {
            this.f23715c.cancel();
        }
    }

    public void l() {
        Dialog dialog = new Dialog(this.f23714b);
        dialog.setContentView(R.layout.dialog_device);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        ((TextView) dialog.findViewById(R.id.txt_title_device)).setText(R.string.sign_out_of_this_device);
        ((TextView) dialog.findViewById(R.id.bt_cancel)).setOnClickListener(new i(dialog));
        ((TextView) dialog.findViewById(R.id.bt_logout_device)).setOnClickListener(new j((ProgressBar) dialog.findViewById(R.id.progress_bar_device_limit), dialog));
    }

    public void m(fj.a aVar) {
        ErrorDialog errorDialog = this.f23716d;
        if (errorDialog != null && errorDialog.isShowing()) {
            this.f23716d.cancel();
        }
        ErrorDialog errorDialog2 = new ErrorDialog(this.f23714b, new d(aVar));
        this.f23716d = errorDialog2;
        errorDialog2.setCanceledOnTouchOutside(false);
        this.f23716d.k("Hiện đang không có kết nối mạng. Vui lòng kiểm tra lại kết nối internet hoặc chuyển sang sử dụng offline").l("Chuyển Offline").n(true).show();
    }

    public void n() {
        Dialog dialog = new Dialog(this.f23714b);
        dialog.setContentView(R.layout.dialog_music_offline);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 51;
        attributes.x = 250;
        attributes.y = 70;
        attributes.flags &= -3;
        window.setAttributes(attributes);
        RecyclerView recyclerView = (RecyclerView) dialog.findViewById(R.id.recycler_folder);
        ImageView imageView = (ImageView) dialog.findViewById(R.id.image_radio_button_all);
        ImageView imageView2 = (ImageView) dialog.findViewById(R.id.image_radio_button_music);
        ImageView imageView3 = (ImageView) dialog.findViewById(R.id.image_radio_button_video);
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.view_radio_button_all);
        LinearLayout linearLayout2 = (LinearLayout) dialog.findViewById(R.id.view_radio_button_music);
        LinearLayout linearLayout3 = (LinearLayout) dialog.findViewById(R.id.view_radio_button_video);
        if (sj.i.r(this.f23714b).d0().equals("Video")) {
            imageView.setImageResource(R.drawable.ic_radio_button_off);
            imageView2.setImageResource(R.drawable.ic_radio_button_off);
            imageView3.setImageResource(R.drawable.ic_radio_button_on);
        } else {
            if (sj.i.r(this.f23714b).d0().equals("Music")) {
                imageView.setImageResource(R.drawable.ic_radio_button_off);
                imageView2.setImageResource(R.drawable.ic_radio_button_on);
            } else {
                imageView.setImageResource(R.drawable.ic_radio_button_on);
                imageView2.setImageResource(R.drawable.ic_radio_button_off);
            }
            imageView3.setImageResource(R.drawable.ic_radio_button_off);
        }
        linearLayout.setOnClickListener(new k(imageView, imageView2, imageView3));
        linearLayout2.setOnClickListener(new l(imageView, imageView2, imageView3));
        linearLayout3.setOnClickListener(new m(imageView, imageView2, imageView3));
        ui.a.b().F.clear();
        ui.a.b().F.addAll(cj.a.r(this.f23714b).p());
        ui.a.b().G = new oi.e(ui.a.b().F, this.f23714b);
        ui.a.b().G.F(new n());
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f23714b));
        recyclerView.setAdapter(ui.a.b().G);
        dialog.setOnDismissListener(new o());
    }

    public void o(a aVar, g gVar) {
        Dialog dialog = new Dialog(this.f23714b);
        dialog.setContentView(R.layout.dialog_list_channels);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 51;
        attributes.x = 250;
        attributes.y = 70;
        attributes.flags &= -3;
        window.setAttributes(attributes);
        try {
            p((RecyclerView) dialog.findViewById(R.id.recycler_channel), aVar);
        } catch (Exception unused) {
        }
        EditText editText = (EditText) dialog.findViewById(R.id.edt_search_channels);
        editText.addTextChangedListener(new p(editText, aVar));
        dialog.setOnDismissListener(new q(aVar, gVar));
    }

    public final void p(RecyclerView recyclerView, a aVar) {
        ui.a.b().H = new oi.a(ui.a.b().f23418u, this.f23714b);
        ui.a.b().H.F(new a(aVar));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f23714b));
        recyclerView.setAdapter(ui.a.b().H);
    }

    public void q(fj.a aVar) {
        Dialog dialog = new Dialog(this.f23714b);
        dialog.setContentView(R.layout.dialog_introduce);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();
        Context context = this.f23714b;
        ((TextView) dialog.findViewById(R.id.text_version)).setText(sj.k.f(context, context.getPackageName()));
        RelativeLayout relativeLayout = (RelativeLayout) dialog.findViewById(R.id.view_update);
        new ri.f(new f((TextView) dialog.findViewById(R.id.txt_time_license), (TextView) dialog.findViewById(R.id.text_license_type_string))).b(this.f23714b);
        aVar.C((TextView) dialog.findViewById(R.id.txt_update), relativeLayout);
        ((ImageView) dialog.findViewById(R.id.img_back)).setOnClickListener(new g(dialog));
        relativeLayout.setOnClickListener(new h(dialog));
    }

    public void r(String str, String str2) {
        Dialog dialog = new Dialog(this.f23714b);
        this.f23715c = dialog;
        dialog.setContentView(R.layout.dialog_notification);
        this.f23715c.setCanceledOnTouchOutside(true);
        this.f23715c.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((TextView) this.f23715c.findViewById(R.id.txt_title)).setText(str);
        ((TextView) this.f23715c.findViewById(R.id.txt_content)).setText(str2);
        ((TextView) this.f23715c.findViewById(R.id.bt_exit)).setOnClickListener(new C0470b());
        this.f23715c.show();
    }

    public void s() {
        if (this.f23717e == null) {
            Dialog dialog = new Dialog(this.f23714b);
            this.f23717e = dialog;
            dialog.setContentView(R.layout.dialog_update_version);
            this.f23717e.setCancelable(false);
            this.f23717e.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            this.f23717e.show();
            ((TextView) this.f23717e.findViewById(R.id.bt_update_version)).setOnClickListener(new e());
        }
    }

    public void t(zi.a aVar, String str, String str2, long j10) {
        Slide slide = new Slide(5);
        slide.setDuration(600);
        slide.addTarget(R.id.view_notification);
        TransitionManager.beginDelayedTransition(aVar.M0, slide);
        aVar.N0.setVisibility(0);
        aVar.J0.setText(str);
        aVar.J0.setText(str2);
        new Handler().postDelayed(new c(aVar), j10);
    }
}
