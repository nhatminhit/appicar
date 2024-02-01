package vj;

import aj.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import oi.h;
import rj.j0;
import rj.p;
import sj.i;
import sj.k;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.service.RemoteService;
import vn.icar.entertaiment.view.activity.HomeActivity;
import vn.icar.entertaiment.view.fragment.OfflineFragment;
import vn.icar.entertaiment.view.fragment.TvFragment;
import vn.icar.entertaiment.view.fragment.YoutubeFragment;

public class g {

    /* renamed from: f  reason: collision with root package name */
    public static final String f23754f = "TabHome";

    /* renamed from: a  reason: collision with root package name */
    public HomeActivity f23755a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23756b;

    /* renamed from: c  reason: collision with root package name */
    public zi.a f23757c;

    /* renamed from: d  reason: collision with root package name */
    public uj.a f23758d;

    /* renamed from: e  reason: collision with root package name */
    public cd.b f23759e = new cd.b(this.f23756b);

    public class a implements TextWatcher {
        public final /* synthetic */ zi.a O;

        public a(zi.a aVar) {
            this.O = aVar;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            try {
                if (!ui.a.b().f23398a.equals("TV")) {
                    if (!ui.a.b().f23398a.equals("Radio")) {
                        if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                            g.this.w().H1(this.O.f25129t0.getText().toString().trim());
                            return;
                        }
                        return;
                    }
                }
                g.this.x().N1(this.O.f25129t0.getText().toString().trim());
            } catch (Exception unused) {
            }
        }
    }

    public class b implements pj.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f23760a;

        public b(a aVar) {
            this.f23760a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
            r3.n(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
            r3.n(r1);
            r2.f23760a.e(true);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(int r3) {
            /*
                r2 = this;
                r0 = 1
                switch(r3) {
                    case 0: goto L_0x0035;
                    case 1: goto L_0x0030;
                    case 2: goto L_0x002b;
                    case 3: goto L_0x001e;
                    case 4: goto L_0x0019;
                    case 5: goto L_0x0014;
                    case 6: goto L_0x000f;
                    case 7: goto L_0x000a;
                    case 8: goto L_0x0005;
                    default: goto L_0x0004;
                }
            L_0x0004:
                goto L_0x003c
            L_0x0005:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "car"
                goto L_0x0022
            L_0x000a:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "kid"
                goto L_0x0022
            L_0x000f:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "news"
                goto L_0x0022
            L_0x0014:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "history"
                goto L_0x0022
            L_0x0019:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "story"
                goto L_0x0022
            L_0x001e:
                vj.g r3 = vj.g.this
                java.lang.String r1 = "review_film"
            L_0x0022:
                r3.n(r1)
                vj.a r3 = r2.f23760a
                r3.e(r0)
                goto L_0x003c
            L_0x002b:
                vj.g r3 = vj.g.this
                java.lang.String r0 = "offline"
                goto L_0x0039
            L_0x0030:
                vj.g r3 = vj.g.this
                java.lang.String r0 = "Radio"
                goto L_0x0039
            L_0x0035:
                vj.g r3 = vj.g.this
                java.lang.String r0 = "TV"
            L_0x0039:
                r3.n(r0)
            L_0x003c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vj.g.b.a(int):void");
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public boolean O;
        public final int P = 100;
        public final int Q = (48 + 100);
        public final Rect R = new Rect();
        public final /* synthetic */ View S;
        public final /* synthetic */ zi.a T;

        public c(View view, zi.a aVar) {
            this.S = view;
            this.T = aVar;
        }

        public void onGlobalLayout() {
            boolean z10 = true;
            int applyDimension = (int) TypedValue.applyDimension(1, (float) this.Q, this.S.getResources().getDisplayMetrics());
            this.S.getWindowVisibleDisplayFrame(this.R);
            int height = this.S.getRootView().getHeight();
            Rect rect = this.R;
            if (height - (rect.bottom - rect.top) < applyDimension) {
                z10 = false;
            }
            if (z10 != this.O) {
                this.O = z10;
                if (!z10) {
                    this.T.D0.setVisibility(8);
                } else if (ui.a.b().f23398a.equals(a.e.f16172d) && !ui.a.b().f23422y) {
                    g.this.s(this.T);
                }
            }
        }
    }

    public class d implements TextView.OnEditorActionListener {
        public final /* synthetic */ zi.a O;

        public d(zi.a aVar) {
            this.O = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x006d, code lost:
            if (ui.a.b().f23398a.equals(aj.a.e.f16172d) != false) goto L_0x006f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onEditorAction(android.widget.TextView r2, int r3, android.view.KeyEvent r4) {
            /*
                r1 = this;
                r2 = 0
                r4 = 3
                if (r3 != r4) goto L_0x0080
                zi.a r3 = r1.O
                android.widget.EditText r3 = r3.f25129t0
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                java.lang.String r4 = ""
                boolean r3 = r3.equals(r4)
                r4 = 8
                java.lang.String r0 = "Youtube"
                if (r3 != 0) goto L_0x0063
                ui.a r3 = ui.a.b()
                java.lang.String r3 = r3.f23398a
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0076
                vj.g r3 = vj.g.this
                vn.icar.entertaiment.view.fragment.YoutubeFragment r3 = r3.z()
                zi.a r0 = r1.O
                android.widget.EditText r0 = r0.f25129t0
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                r3.v1(r0, r2)
                vj.g r2 = vj.g.this
                android.content.Context r2 = r2.f23756b
                sj.i r2 = sj.i.r(r2)
                zi.a r3 = r1.O
                android.widget.EditText r3 = r3.f25129t0
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r3 = r3.trim()
                r2.r0(r3)
                goto L_0x006f
            L_0x0063:
                ui.a r2 = ui.a.b()
                java.lang.String r2 = r2.f23398a
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L_0x0076
            L_0x006f:
                zi.a r2 = r1.O
                android.widget.ListView r2 = r2.D0
                r2.setVisibility(r4)
            L_0x0076:
                vj.g r2 = vj.g.this
                vn.icar.entertaiment.view.activity.HomeActivity r2 = r2.f23755a
                id.c.d(r2)
                r2 = 1
            L_0x0080:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: vj.g.d.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }
    }

    public class e implements AdapterView.OnItemClickListener {
        public final /* synthetic */ zi.a O;
        public final /* synthetic */ ArrayAdapter P;

        public e(zi.a aVar, ArrayAdapter arrayAdapter) {
            this.O = aVar;
            this.P = arrayAdapter;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            this.O.f25129t0.setText((CharSequence) this.P.getItem(i10));
            EditText editText = this.O.f25129t0;
            editText.setSelection(editText.getText().length());
            this.O.D0.setVisibility(8);
            if (ui.a.b().f23398a.equals(a.e.f16172d)) {
                ((YoutubeFragment) g.this.f23755a.X().q0(YoutubeFragment.class.getName())).v1((String) this.P.getItem(i10), false);
            }
            id.c.d(g.this.f23755a);
        }
    }

    public class f implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                if (!g.this.x().N1) {
                    g.this.x().N1 = true;
                }
            }
        }

        public f() {
        }

        public void run() {
            g.this.x().N1 = false;
            g.this.x().F1();
            new Handler().postDelayed(new a(), 10000);
        }
    }

    /* renamed from: vj.g$g  reason: collision with other inner class name */
    public class C0472g implements ErrorDialog.a {
        public C0472g() {
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }

        public void v(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }
    }

    public g(HomeActivity homeActivity, zi.a aVar, uj.a aVar2) {
        this.f23755a = homeActivity;
        this.f23757c = aVar;
        this.f23756b = homeActivity;
        this.f23758d = aVar2;
        f();
    }

    public void c() {
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.tv)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.radio)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.offline)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.review)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.short_story)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.knowledge)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.news)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.children)));
        ui.a.b().f23420w.add(new qj.c(this.f23756b.getString(R.string.love_car)));
    }

    public void d() {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            x().n1();
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            w().k1();
        } else {
            z().Z0();
        }
    }

    public void e(boolean z10) {
        new p().a(this.f23756b);
        new j0().a(this.f23756b);
        if (w() != null) {
            w().m1(z10);
        }
    }

    public final void f() {
        try {
            Bundle extras = this.f23755a.getIntent().getExtras();
            if (extras.getString("open_News") != null && extras.getString("open_News").equals("true") && i.r(this.f23756b).i()) {
                k.g(this.f23756b);
            }
        } catch (Exception unused) {
        }
    }

    public void g(String str) {
        RecyclerView recyclerView;
        int i10;
        for (int i11 = 0; i11 < ui.a.b().f23420w.size(); i11++) {
            if (ui.a.b().f23420w.get(i11).getTab().equals(str)) {
                ui.a.b().f23420w.get(i11).setClick(true);
                if (i11 != ui.a.b().f23420w.size() - 1) {
                    if (i11 == ui.a.b().f23420w.size() - 2) {
                        recyclerView = this.f23757c.G0;
                        i10 = i11 + 1;
                    } else if (i11 == ui.a.b().f23420w.size() - 3) {
                        recyclerView = this.f23757c.G0;
                        i10 = i11 + 2;
                    }
                    recyclerView.C1(i10);
                }
                this.f23757c.G0.C1(i11);
            } else {
                ui.a.b().f23420w.get(i11).setClick(false);
            }
        }
        ui.a.b().f23421x.j();
    }

    public void h() {
        if ((ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) && x() != null && x().N1) {
            this.f23755a.runOnUiThread(new f());
        }
    }

    public void i() {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            if (x() != null) {
                x().E1();
            }
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            if (w() != null) {
                w().y1();
            }
        } else if (z() != null) {
            z().p1();
        }
    }

    public final void j() {
        new ErrorDialog(this.f23756b, new C0472g()).l("Ok").n(false).k("Vui lòng kiểm tra internet để mở các tab online !").show();
    }

    public void k() {
        if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
            x().y1();
        } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
            w().u1();
        } else {
            z().o1();
        }
    }

    public void l(zi.a aVar) {
        aVar.f25129t0.setOnEditorActionListener(new d(aVar));
    }

    public void m() {
        ad.d.b(f23754f, "mở: Offline", "mở tab");
        u();
        ui.a.b().f23398a = a.e.f16179k;
        if (this.f23758d.b(TvFragment.class)) {
            x().z1();
        }
        if (this.f23758d.b(YoutubeFragment.class) && oj.c.v(this.f23756b).y() != null) {
            oj.c.v(this.f23756b).y().pause();
        }
        if (this.f23758d.c(R.id.layout_content, OfflineFragment.class, (Bundle) null, true, this.f23756b)) {
            w().q1();
            w().z1();
        }
        this.f23757c.C0.setVisibility(0);
        this.f23757c.H0.setVisibility(8);
        this.f23757c.O0.setVisibility(0);
        this.f23757c.f25129t0.setVisibility(0);
        this.f23757c.I0.setVisibility(8);
        this.f23757c.f25130u0.setVisibility(4);
        this.f23757c.f25134y0.setImageDrawable(this.f23756b.getResources().getDrawable(R.drawable.ic_youtube));
        i.r(this.f23756b).m0(ui.a.b().f23398a);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        if (r6.equals("TV") == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            vn.icar.entertaiment.service.RemoteService.H(r0)
            java.lang.String r1 = "offline"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x0021
            r5.m()
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820791(0x7f1100f7, float:1.9274307E38)
        L_0x0018:
            java.lang.String r6 = r6.getString(r0)
        L_0x001c:
            r5.g(r6)
            goto L_0x011d
        L_0x0021:
            cd.b r1 = r5.f23759e
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x011a
            r1 = -1
            int r2 = r6.hashCode()
            java.lang.String r3 = "Radio"
            java.lang.String r4 = "TV"
            switch(r2) {
                case 2690: goto L_0x008f;
                case 98260: goto L_0x0084;
                case 106182: goto L_0x0079;
                case 3377875: goto L_0x006e;
                case 78717915: goto L_0x0065;
                case 109770997: goto L_0x005a;
                case 672908035: goto L_0x004f;
                case 926934164: goto L_0x0044;
                case 1359515147: goto L_0x0038;
                default: goto L_0x0035;
            }
        L_0x0035:
            r0 = r1
            goto L_0x0096
        L_0x0038:
            java.lang.String r0 = "review_film"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0041
            goto L_0x0035
        L_0x0041:
            r0 = 8
            goto L_0x0096
        L_0x0044:
            java.lang.String r0 = "history"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x004d
            goto L_0x0035
        L_0x004d:
            r0 = 7
            goto L_0x0096
        L_0x004f:
            java.lang.String r0 = "Youtube"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0058
            goto L_0x0035
        L_0x0058:
            r0 = 6
            goto L_0x0096
        L_0x005a:
            java.lang.String r0 = "story"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0063
            goto L_0x0035
        L_0x0063:
            r0 = 5
            goto L_0x0096
        L_0x0065:
            boolean r0 = r6.equals(r3)
            if (r0 != 0) goto L_0x006c
            goto L_0x0035
        L_0x006c:
            r0 = 4
            goto L_0x0096
        L_0x006e:
            java.lang.String r0 = "news"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0077
            goto L_0x0035
        L_0x0077:
            r0 = 3
            goto L_0x0096
        L_0x0079:
            java.lang.String r0 = "kid"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0082
            goto L_0x0035
        L_0x0082:
            r0 = 2
            goto L_0x0096
        L_0x0084:
            java.lang.String r0 = "car"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x008d
            goto L_0x0035
        L_0x008d:
            r0 = 1
            goto L_0x0096
        L_0x008f:
            boolean r2 = r6.equals(r4)
            if (r2 != 0) goto L_0x0096
            goto L_0x0035
        L_0x0096:
            switch(r0) {
                case 0: goto L_0x010c;
                case 1: goto L_0x00fe;
                case 2: goto L_0x00f0;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00d4;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00aa;
                case 8: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            java.lang.String r6 = ""
            goto L_0x001c
        L_0x009c:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820825(0x7f110119, float:1.9274376E38)
            goto L_0x0018
        L_0x00aa:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820707(0x7f1100a3, float:1.9274137E38)
            goto L_0x0018
        L_0x00b8:
            r5.r()
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820874(0x7f11014a, float:1.9274475E38)
            goto L_0x0018
        L_0x00c6:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820831(0x7f11011f, float:1.9274388E38)
            goto L_0x0018
        L_0x00d4:
            r5.p(r3)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820815(0x7f11010f, float:1.9274356E38)
            goto L_0x0018
        L_0x00e2:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820784(0x7f1100f0, float:1.9274293E38)
            goto L_0x0018
        L_0x00f0:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820587(0x7f11002b, float:1.9273893E38)
            goto L_0x0018
        L_0x00fe:
            r5.o(r6)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820728(0x7f1100b8, float:1.927418E38)
            goto L_0x0018
        L_0x010c:
            r5.p(r4)
            android.content.Context r6 = r5.f23756b
            android.content.res.Resources r6 = r6.getResources()
            r0 = 2131820863(0x7f11013f, float:1.9274453E38)
            goto L_0x0018
        L_0x011a:
            r5.j()
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.g.n(java.lang.String):void");
    }

    public void o(String str) {
        ad.d.b(f23754f, "mở: " + str, "mở tab");
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
            case 926934164:
                if (str.equals(a.e.f16175g)) {
                    c10 = 4;
                    break;
                }
                break;
            case 1359515147:
                if (str.equals(a.e.f16173e)) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ui.a.b().f23398a = a.e.f16178j;
                break;
            case 1:
                ui.a.b().f23398a = a.e.f16177i;
                break;
            case 2:
                ui.a.b().f23398a = a.e.f16176h;
                break;
            case 3:
                ui.a.b().f23398a = a.e.f16174f;
                break;
            case 4:
                ui.a.b().f23398a = a.e.f16175g;
                break;
            case 5:
                ui.a.b().f23398a = a.e.f16173e;
                break;
        }
        if (this.f23758d.b(TvFragment.class)) {
            x().z1();
        }
        if (this.f23758d.b(OfflineFragment.class)) {
            w().x1();
        }
        if (this.f23758d.c(R.id.layout_content, YoutubeFragment.class, (Bundle) null, true, this.f23756b)) {
            z().l1();
            z().e1();
        }
        this.f23757c.C0.setVisibility(0);
        this.f23757c.H0.setVisibility(8);
        this.f23757c.O0.setVisibility(0);
        this.f23757c.I0.setVisibility(0);
        this.f23757c.f25130u0.setVisibility(4);
        this.f23757c.f25129t0.setVisibility(4);
        this.f23757c.f25134y0.setImageDrawable(this.f23756b.getResources().getDrawable(R.drawable.ic_youtube));
        i.r(this.f23756b).m0(ui.a.b().f23398a);
    }

    public void p(String str) {
        ui.a aVar;
        ad.d.b(f23754f, "mở: " + str, "mở tab");
        u();
        String str2 = "TV";
        if (str.equals(str2)) {
            aVar = ui.a.b();
        } else {
            aVar = ui.a.b();
            str2 = "Radio";
        }
        aVar.f23398a = str2;
        if (this.f23758d.b(YoutubeFragment.class) && oj.c.v(this.f23756b).y() != null) {
            oj.c.v(this.f23756b).y().pause();
        }
        if (this.f23758d.b(OfflineFragment.class)) {
            w().x1();
        }
        if (this.f23758d.c(R.id.layout_content, TvFragment.class, (Bundle) null, true, this.f23756b)) {
            x().u1();
            x().o1();
        }
        this.f23757c.C0.setVisibility(4);
        this.f23757c.H0.setVisibility(0);
        this.f23757c.H0.setImageResource(R.drawable.ic_baseline_search_24);
        this.f23757c.O0.setVisibility(0);
        this.f23757c.f25130u0.setVisibility(4);
        this.f23757c.f25129t0.setVisibility(4);
        this.f23757c.I0.setVisibility(0);
        this.f23757c.f25134y0.setImageDrawable(this.f23756b.getResources().getDrawable(R.drawable.ic_youtube));
        i.r(this.f23756b).m0(ui.a.b().f23398a);
    }

    public void q(String str) {
        if (str != null) {
            int parseInt = Integer.parseInt(str);
            if (ui.a.b().f23398a.equals("TV") || ui.a.b().f23398a.equals("Radio")) {
                x().B1(parseInt);
            } else if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                w().w1(parseInt);
            } else {
                z().r1(parseInt);
            }
        }
    }

    public void r() {
        ui.a.b().f23398a = a.e.f16172d;
        RemoteService.H(false);
        u();
        if (this.f23758d.b(TvFragment.class)) {
            x().z1();
        }
        if (this.f23758d.b(OfflineFragment.class)) {
            w().x1();
        }
        if (this.f23758d.c(R.id.layout_content, YoutubeFragment.class, (Bundle) null, true, this.f23756b)) {
            z().l1();
            z().e1();
        }
        this.f23757c.I0.setVisibility(4);
        this.f23757c.f25134y0.setImageDrawable(this.f23756b.getResources().getDrawable(R.drawable.ic_clickyoutube));
        this.f23757c.O0.setVisibility(0);
        this.f23757c.f25129t0.setVisibility(0);
        this.f23757c.C0.setVisibility(4);
        this.f23757c.H0.setVisibility(0);
        this.f23757c.f25130u0.setVisibility(4);
        this.f23757c.H0.setImageResource(R.drawable.ic_baseline_mic_24);
        for (int i10 = 0; i10 < ui.a.b().f23420w.size(); i10++) {
            ui.a.b().f23420w.get(i10).setClick(false);
        }
        ui.a.b().f23421x.j();
        i.r(this.f23756b).m0(ui.a.b().f23398a);
    }

    public void s(zi.a aVar) {
        Context context = this.f23756b;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367043, i.r(context).j());
        if (arrayAdapter.getCount() == 0) {
            aVar.D0.setVisibility(8);
            return;
        }
        aVar.D0.setVisibility(0);
        aVar.D0.setAdapter(arrayAdapter);
        aVar.D0.setOnItemClickListener(new e(aVar, arrayAdapter));
    }

    public void t(zi.a aVar) {
        aVar.f25129t0.addTextChangedListener(new a(aVar));
    }

    public void u() {
        this.f23757c.f25129t0.setText("");
        this.f23757c.f25129t0.setHint(R.string.search);
    }

    public void v(zi.a aVar) {
        View childAt = ((ViewGroup) this.f23755a.findViewById(16908290)).getChildAt(0);
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new c(childAt, aVar));
    }

    public OfflineFragment w() {
        return (OfflineFragment) this.f23755a.X().q0(OfflineFragment.class.getName());
    }

    public TvFragment x() {
        return (TvFragment) this.f23755a.X().q0(TvFragment.class.getName());
    }

    public void y(zi.a aVar, a aVar2) {
        ui.a.b().f23421x = new h(ui.a.b().f23420w, this.f23756b);
        ui.a.b().f23421x.F(new b(aVar2));
        aVar.G0.setLayoutManager(new GridLayoutManager(this.f23756b, 1, 0, false));
        aVar.G0.setAdapter(ui.a.b().f23421x);
    }

    public YoutubeFragment z() {
        return (YoutubeFragment) this.f23755a.X().q0(YoutubeFragment.class.getName());
    }
}
