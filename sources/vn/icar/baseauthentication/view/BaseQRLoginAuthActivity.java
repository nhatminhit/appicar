package vn.icar.baseauthentication.view;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi.a;
import com.tatv.baseapp.view.dialog.ConfirmDialog;
import com.tatv.baseapp.view.dialog.ErrorDialog;
import d.o0;
import java.util.ArrayList;
import java.util.Date;
import li.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vn.icar.baseauthentication.a;
import vn.icar.baseauthentication.data.model.Device;

public abstract class BaseQRLoginAuthActivity extends BaseAuthActivity<hi.e> implements ai.c, ei.d, ei.f, ii.f, ii.d {
    public static String C0 = "BaseQRLoginAuthActivity";
    public boolean A0 = false;
    public boolean B0 = true;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f23774q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f23775r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f23776s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f23777t0 = false;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f23778u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f23779v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public cd.b f23780w0;

    /* renamed from: x0  reason: collision with root package name */
    public String f23781x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    public String f23782y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    public boolean f23783z0 = false;

    public class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f23784a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, long j11, int[] iArr) {
            super(j10, j11);
            this.f23784a = iArr;
        }

        public void onFinish() {
            ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.H0.setVisibility(8);
        }

        @SuppressLint({"SetTextI18n"})
        public void onTick(long j10) {
            if (this.f23784a[0] > 0) {
                TextView textView = ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.H0;
                textView.setText("OTP (" + this.f23784a[0] + "s)");
                int[] iArr = this.f23784a;
                iArr[0] = iArr[0] + -1;
            }
        }
    }

    public class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int[] f23786a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(long j10, long j11, int[] iArr) {
            super(j10, j11);
            this.f23786a = iArr;
        }

        public void onFinish() {
            ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.H0.setVisibility(8);
        }

        @SuppressLint({"SetTextI18n"})
        public void onTick(long j10) {
            if (this.f23786a[0] > 0) {
                TextView textView = ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.H0;
                textView.setText("OTP (" + this.f23786a[0] + "s)");
                int[] iArr = this.f23786a;
                iArr[0] = iArr[0] + -1;
            }
        }
    }

    public class c implements ErrorDialog.a {
        public c() {
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }

        public void v(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (BaseQRLoginAuthActivity.this.f23774q0) {
                boolean unused = BaseQRLoginAuthActivity.this.f23774q0 = false;
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19669t0.setBackground(i0.d.i(BaseQRLoginAuthActivity.this.f17785k0, a.g.bg_bt_login));
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.G0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.H0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19670u0.setBackground(i0.d.i(BaseQRLoginAuthActivity.this.f17785k0, a.g.bg_bt_signout));
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.C0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19673x0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19674y0.setVisibility(8);
                boolean unused2 = BaseQRLoginAuthActivity.this.f23776s0 = false;
                boolean unused3 = BaseQRLoginAuthActivity.this.f23775r0 = false;
            }
        }
    }

    public class e implements TextWatcher {
        public e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (BaseQRLoginAuthActivity.this.f23777t0) {
                boolean unused = BaseQRLoginAuthActivity.this.f23777t0 = false;
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19649u0.setBackground(i0.d.i(BaseQRLoginAuthActivity.this.f17785k0, a.g.bg_bt_login));
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.G0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.H0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19648t0.setBackground(i0.d.i(BaseQRLoginAuthActivity.this.f17785k0, a.g.bg_bt_signout));
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.C0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19652x0.setVisibility(8);
                ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19653y0.setVisibility(8);
                boolean unused2 = BaseQRLoginAuthActivity.this.f23779v0 = false;
                boolean unused3 = BaseQRLoginAuthActivity.this.f23778u0 = false;
            }
        }
    }

    public class f implements TextWatcher {
        public f() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19672w0.getText().length() == 6 && BaseQRLoginAuthActivity.this.f23775r0) {
                ei.c cVar = new ei.c(((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19675z0.getText().toString().trim(), ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19638x0.f19672w0.getText().toString().trim(), BaseQRLoginAuthActivity.this.L1());
                ei.h hVar = new ei.h(BaseQRLoginAuthActivity.this);
                BaseQRLoginAuthActivity baseQRLoginAuthActivity = BaseQRLoginAuthActivity.this;
                hVar.a(cVar, baseQRLoginAuthActivity.f17785k0, baseQRLoginAuthActivity.O1());
            }
        }
    }

    public class g implements TextWatcher {
        public g() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19651w0.getText().length() == 6 && BaseQRLoginAuthActivity.this.f23778u0) {
                ii.c cVar = new ii.c(((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19654z0.getText().toString().trim(), ((hi.e) BaseQRLoginAuthActivity.this.f17786l0).f19635u0.f19651w0.getText().toString().trim(), BaseQRLoginAuthActivity.this.L1());
                ii.h hVar = new ii.h(BaseQRLoginAuthActivity.this);
                BaseQRLoginAuthActivity baseQRLoginAuthActivity = BaseQRLoginAuthActivity.this;
                hVar.a(cVar, baseQRLoginAuthActivity.f17785k0, baseQRLoginAuthActivity.O1());
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 5) {
                return false;
            }
            BaseQRLoginAuthActivity.this.J1();
            return false;
        }
    }

    public class i implements TextView.OnEditorActionListener {
        public i() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 5) {
                return false;
            }
            BaseQRLoginAuthActivity.this.K1();
            return false;
        }
    }

    public class j implements ErrorDialog.a {
        public final /* synthetic */ View O;

        public j(View view) {
            this.O = view;
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
            BaseQRLoginAuthActivity.this.onTrial(this.O);
        }

        public void v(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }
    }

    public class k implements ErrorDialog.a {
        public k() {
        }

        public void l(ErrorDialog errorDialog) {
            errorDialog.dismiss();
            BaseQRLoginAuthActivity.this.d2();
        }

        public void v(ErrorDialog errorDialog) {
            errorDialog.dismiss();
        }
    }

    public class l implements ki.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f23788a;

        public class a implements ConfirmDialog.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f23790a;

            public a(int i10) {
                this.f23790a = i10;
            }

            public void a(ConfirmDialog confirmDialog) {
                confirmDialog.dismiss();
            }

            public void b(ConfirmDialog confirmDialog) {
                bi.a aVar = new bi.a(new a.b(((Device) l.this.f23788a.get(this.f23790a)).getAppId(), ((Device) l.this.f23788a.get(this.f23790a)).getAccessToken()), new a.C0264a(BaseQRLoginAuthActivity.this.f23781x0, BaseQRLoginAuthActivity.this.f23782y0, BaseQRLoginAuthActivity.this.L1(), BaseQRLoginAuthActivity.this.M1(), BaseQRLoginAuthActivity.this.N1(), "fcm"));
                bi.b bVar = new bi.b(BaseQRLoginAuthActivity.this);
                BaseQRLoginAuthActivity baseQRLoginAuthActivity = BaseQRLoginAuthActivity.this;
                bVar.a(aVar, baseQRLoginAuthActivity.f17785k0, baseQRLoginAuthActivity.O1());
            }
        }

        public l(ArrayList arrayList) {
            this.f23788a = arrayList;
        }

        public void a(int i10) {
            ConfirmDialog confirmDialog = new ConfirmDialog(BaseQRLoginAuthActivity.this.f17785k0, new a(i10));
            confirmDialog.l(BaseQRLoginAuthActivity.this.getString(a.o.logout_device) + ((Device) this.f23788a.get(i10)).getDeviceName()).k(BaseQRLoginAuthActivity.this.getString(a.o.content_logout_device)).j(a.e.black).show();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q1() {
        X1(true);
    }

    public void B() {
        X1(true);
    }

    public void D(ci.a aVar, int i10, String str) {
        id.c.d(this);
        if (i10 == 200) {
            S1(getString(a.o.otp_success));
            g2();
            return;
        }
        S1(str);
    }

    public final void J1() {
        int i10;
        if (((hi.e) this.f17786l0).f19638x0.f19675z0.getText().toString().trim().equals("")) {
            i10 = a.o.phone_number_error;
        } else if (((hi.e) this.f17786l0).f19638x0.f19675z0.getText().toString().trim().length() < 10) {
            i10 = a.o.long_phone_number;
        } else {
            new ei.e(this).a(new ei.a(((hi.e) this.f17786l0).f19638x0.f19675z0.getText().toString().trim()), this.f17785k0, O1());
            return;
        }
        S1(getString(i10));
    }

    public final void K1() {
        int i10;
        if (((hi.e) this.f17786l0).f19635u0.f19654z0.getText().toString().trim().equals("")) {
            i10 = a.o.phone_number_error;
        } else if (((hi.e) this.f17786l0).f19635u0.f19654z0.getText().toString().trim().length() < 10) {
            i10 = a.o.long_phone_number;
        } else {
            new ii.g(this).a(new ii.b(((hi.e) this.f17786l0).f19635u0.f19654z0.getText().toString().trim()), this.f17785k0, O1());
            return;
        }
        S1(getString(i10));
    }

    public abstract String L1();

    public abstract String M1();

    public void N(ci.a aVar, int i10, String str, JSONObject jSONObject) {
        TextView textView;
        String string;
        P1();
        if (i10 == 200) {
            new ai.d(this).a(new ai.a(id.c.c(), this.f23781x0, this.f23782y0, L1(), M1(), N1(), ""), this.f17785k0, O1());
            V1();
        } else if (i10 == 400) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2.getString("field").equals("password")) {
                        ((hi.e) this.f17786l0).f19635u0.F0.setVisibility(0);
                        textView = ((hi.e) this.f17786l0).f19635u0.F0;
                        string = jSONObject2.getString("error");
                    } else if (jSONObject2.getString("field").equals("rePassword")) {
                        ((hi.e) this.f17786l0).f19635u0.E0.setVisibility(0);
                        textView = ((hi.e) this.f17786l0).f19635u0.E0;
                        string = jSONObject2.getString("error");
                    }
                    textView.setText(string);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            V1();
            S1(str);
        }
    }

    public void N0() {
        super.N0();
    }

    public abstract String N1();

    public void O0() {
        super.O0();
        ((hi.e) this.f17786l0).f19638x0.f19675z0.addTextChangedListener(new d());
        ((hi.e) this.f17786l0).f19635u0.f19654z0.addTextChangedListener(new e());
        ((hi.e) this.f17786l0).f19638x0.f19672w0.addTextChangedListener(new f());
        ((hi.e) this.f17786l0).f19635u0.f19651w0.addTextChangedListener(new g());
        ((hi.e) this.f17786l0).f19638x0.f19675z0.setOnEditorActionListener(new h());
        ((hi.e) this.f17786l0).f19635u0.f19654z0.setOnEditorActionListener(new i());
    }

    public abstract String O1();

    public void P1() {
        ((hi.e) this.f17786l0).f19636v0.f19661z0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.B0.setVisibility(8);
        ((hi.e) this.f17786l0).f19637w0.f19664v0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.B0.setVisibility(8);
    }

    public abstract void R1(ai.b bVar);

    public void S1(String str) {
        new ErrorDialog(this.f17785k0, new c()).k(str).n(false).l("Ok").show();
    }

    public void T1() {
        this.f23777t0 = true;
        this.f23778u0 = true;
        ((hi.e) this.f17786l0).f19635u0.f19649u0.setBackground(i0.d.i(this.f17785k0, a.g.bg_bt_signout));
        ((hi.e) this.f17786l0).f19635u0.G0.setVisibility(0);
        ((hi.e) this.f17786l0).f19635u0.H0.setVisibility(0);
        new b(60000, 1000, new int[]{60}).start();
    }

    public void U1() {
        this.f23774q0 = true;
        this.f23775r0 = true;
        ((hi.e) this.f17786l0).f19638x0.f19669t0.setBackground(i0.d.i(this.f17785k0, a.g.bg_bt_signout));
        ((hi.e) this.f17786l0).f19638x0.G0.setVisibility(0);
        ((hi.e) this.f17786l0).f19638x0.H0.setVisibility(0);
        new a(60000, 1000, new int[]{60}).start();
    }

    public void V1() {
        ((hi.e) this.f17786l0).f19635u0.F0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.E0.setVisibility(8);
    }

    public void W1() {
        ((hi.e) this.f17786l0).f19638x0.E0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.F0.setVisibility(8);
    }

    public void X1(boolean z10) {
        this.A0 = z10;
        if (this.B0) {
            if (z10) {
                ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(0);
                ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(8);
            } else {
                ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(0);
                ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(8);
            }
            ((hi.e) this.f17786l0).f19636v0.f19661z0.setVisibility(8);
        }
    }

    public void Y1(ArrayList<Device> arrayList) {
        yh.a aVar = new yh.a(arrayList, this.f17785k0);
        aVar.F(new l(arrayList));
        ((hi.e) this.f17786l0).f19634t0.f19643v0.setLayoutManager(new LinearLayoutManager(this.f17785k0));
        ((hi.e) this.f17786l0).f19634t0.f19643v0.setAdapter(aVar);
        b2();
    }

    public final void Z1() {
        ((hi.e) this.f17786l0).f19636v0.F0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.E0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.D0.setTextColor(Color.parseColor("#CCCCCC"));
        ((hi.e) this.f17786l0).f19636v0.C0.setTextColor(Color.parseColor("#000000"));
        ((hi.e) this.f17786l0).f19636v0.I0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.J0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.M0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.L0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.A0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.f19655t0.setVisibility(4);
        this.B0 = true;
        if (this.A0) {
            ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(4);
            ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(0);
            return;
        }
        ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(8);
    }

    public void a2() {
        ((hi.e) this.f17786l0).f19636v0.F0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.E0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.C0.setTextColor(Color.parseColor("#CCCCCC"));
        ((hi.e) this.f17786l0).f19636v0.D0.setTextColor(Color.parseColor("#000000"));
        ((hi.e) this.f17786l0).f19636v0.I0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.J0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.f19660y0.setVisibility(4);
        ((hi.e) this.f17786l0).f19636v0.M0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.L0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.A0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.f19655t0.setVisibility(0);
        this.B0 = false;
    }

    public int b() {
        return a.l.activity_qr_login_auth;
    }

    public void b2() {
        ((hi.e) this.f17786l0).f19637w0.f19667y0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.J0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.K0.setVisibility(8);
        ((hi.e) this.f17786l0).f19634t0.f19646y0.setVisibility(0);
    }

    public void c2() {
        ((hi.e) this.f17786l0).f19637w0.f19667y0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.J0.setVisibility(0);
        ((hi.e) this.f17786l0).f19638x0.K0.setVisibility(8);
        ((hi.e) this.f17786l0).f19634t0.f19646y0.setVisibility(8);
    }

    public void d2() {
        ((hi.e) this.f17786l0).f19637w0.f19667y0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.H0.setVisibility(0);
        ((hi.e) this.f17786l0).f19635u0.J0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.K0.setVisibility(8);
        ((hi.e) this.f17786l0).f19634t0.f19646y0.setVisibility(8);
    }

    public void e2() {
        ((hi.e) this.f17786l0).f19637w0.f19667y0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.J0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.K0.setVisibility(8);
        ((hi.e) this.f17786l0).f19634t0.f19646y0.setVisibility(8);
    }

    public void f2() {
        ((hi.e) this.f17786l0).f19637w0.f19667y0.setVisibility(8);
        ((hi.e) this.f17786l0).f19636v0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.J0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.K0.setVisibility(0);
        ((hi.e) this.f17786l0).f19634t0.f19646y0.setVisibility(8);
    }

    public void g2() {
        ((hi.e) this.f17786l0).f19635u0.f19648t0.setBackground(i0.d.i(this.f17785k0, a.g.bg_bt_login));
        ((hi.e) this.f17786l0).f19635u0.C0.setVisibility(0);
        ((hi.e) this.f17786l0).f19635u0.f19652x0.setVisibility(0);
        ((hi.e) this.f17786l0).f19635u0.f19653y0.setVisibility(0);
        ((hi.e) this.f17786l0).f19635u0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19635u0.G0.setVisibility(8);
        this.f23779v0 = true;
    }

    public void h2() {
        ((hi.e) this.f17786l0).f19638x0.f19670u0.setBackground(i0.d.i(this.f17785k0, a.g.bg_bt_login));
        ((hi.e) this.f17786l0).f19638x0.C0.setVisibility(0);
        ((hi.e) this.f17786l0).f19638x0.f19673x0.setVisibility(0);
        ((hi.e) this.f17786l0).f19638x0.f19674y0.setVisibility(0);
        ((hi.e) this.f17786l0).f19638x0.H0.setVisibility(8);
        ((hi.e) this.f17786l0).f19638x0.G0.setVisibility(8);
        this.f23776s0 = true;
    }

    public void k(ci.a aVar, int i10, String str, JSONObject jSONObject) {
        TextView textView;
        String string;
        P1();
        if (i10 == 200) {
            new ai.d(this).a(new ai.a(id.c.c(), this.f23781x0, this.f23782y0, L1(), M1(), N1(), ""), this.f17785k0, O1());
            W1();
        } else if (i10 == 400) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    if (jSONObject2.getString("field").equals("password")) {
                        ((hi.e) this.f17786l0).f19638x0.E0.setVisibility(0);
                        textView = ((hi.e) this.f17786l0).f19638x0.E0;
                        string = jSONObject2.getString("error");
                    } else if (jSONObject2.getString("field").equals("rePassword")) {
                        ((hi.e) this.f17786l0).f19638x0.F0.setVisibility(0);
                        textView = ((hi.e) this.f17786l0).f19638x0.F0;
                        string = jSONObject2.getString("error");
                    }
                    textView.setText(string);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        } else {
            W1();
            S1(str);
        }
    }

    public <T> void m(T t10) {
        M0().Q(2);
        ci.d dVar = (ci.d) t10;
        M0().P(dVar);
        M0().S(dVar.getData().get(0).getAccount());
        p.A().B(this.f17785k0, V0(), (ci.e) null);
        p.A().x();
    }

    public void o(ai.b bVar, int i10, String str, JSONObject jSONObject) {
        P1();
        if (i10 == 200) {
            M0().S(this.f23781x0);
            R1(bVar);
        } else if (i10 == 403) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    arrayList.add(new Device(jSONObject2.getString("deviceMac"), jSONObject2.getString("deviceName"), jSONObject2.getString("accessToken"), jSONObject2.getString("appId")));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            Y1(arrayList);
        } else {
            S1(str);
        }
    }

    public void onCloseForgotPassword(View view) {
        d2();
    }

    public void onCloseNoteDeviceLimit(View view) {
        d2();
    }

    public void onCloseSignUp(View view) {
        d2();
    }

    public void onConfirmForgotPassword(View view) {
        int i10;
        if (this.f23779v0) {
            V1();
            if (((hi.e) this.f17786l0).f19635u0.f19651w0.getText().toString().trim().length() != 6) {
                i10 = a.o.otp_error;
            } else if (((hi.e) this.f17786l0).f19635u0.f19652x0.getText().toString().trim().length() < 1) {
                i10 = a.o.password_error;
            } else if (((hi.e) this.f17786l0).f19635u0.f19653y0.getText().toString().trim().length() < 1) {
                i10 = a.o.repassword_error;
            } else if (!((hi.e) this.f17786l0).f19635u0.f19652x0.getText().toString().trim().equals(((hi.e) this.f17786l0).f19635u0.f19653y0.getText().toString().trim())) {
                i10 = a.o.repasswork_not_match;
            } else {
                ((hi.e) this.f17786l0).f19635u0.B0.setVisibility(0);
                this.f23781x0 = ((hi.e) this.f17786l0).f19635u0.f19654z0.getText().toString().trim();
                this.f23782y0 = ((hi.e) this.f17786l0).f19635u0.f19652x0.getText().toString().trim();
                new ii.e(this).a(new ii.a(((hi.e) this.f17786l0).f19635u0.f19654z0.getText().toString().trim(), ((hi.e) this.f17786l0).f19635u0.f19651w0.getText().toString().trim(), L1(), this.f23782y0, ((hi.e) this.f17786l0).f19635u0.f19653y0.getText().toString().trim(), "fcm"), this.f17785k0, O1());
                return;
            }
            S1(getString(i10));
        }
    }

    public void onConfirmLogin(View view) {
        int i10;
        id.c.a(view);
        this.f23781x0 = ((hi.e) this.f17786l0).f19636v0.f19658w0.getText().toString().trim();
        this.f23782y0 = ((hi.e) this.f17786l0).f19636v0.f19657v0.getText().toString().trim();
        ((hi.e) this.f17786l0).f19636v0.f19661z0.setVisibility(0);
        if (this.f23781x0.equals("")) {
            i10 = a.o.phone_number_error;
        } else if (this.f23782y0.equals("")) {
            i10 = a.o.password_error;
        } else {
            new ai.d(this).a(new ai.a(id.c.c(), this.f23781x0, this.f23782y0, L1(), M1(), N1(), "fcm"), this.f17785k0, O1());
            return;
        }
        S1(getString(i10));
        ((hi.e) this.f17786l0).f19636v0.f19661z0.setVisibility(8);
    }

    public void onConfirmSignup(View view) {
        int i10;
        if (this.f23776s0) {
            W1();
            if (((hi.e) this.f17786l0).f19638x0.f19672w0.getText().toString().trim().length() != 6) {
                i10 = a.o.otp_error;
            } else if (((hi.e) this.f17786l0).f19638x0.f19673x0.getText().toString().trim().length() < 1) {
                i10 = a.o.password_error;
            } else if (((hi.e) this.f17786l0).f19638x0.f19674y0.getText().toString().trim().length() < 1) {
                i10 = a.o.repassword_error;
            } else if (!((hi.e) this.f17786l0).f19638x0.f19673x0.getText().toString().trim().equals(((hi.e) this.f17786l0).f19638x0.f19674y0.getText().toString().trim())) {
                i10 = a.o.repasswork_not_match;
            } else {
                ((hi.e) this.f17786l0).f19638x0.B0.setVisibility(0);
                this.f23781x0 = ((hi.e) this.f17786l0).f19638x0.f19675z0.getText().toString().trim();
                this.f23782y0 = ((hi.e) this.f17786l0).f19638x0.f19673x0.getText().toString().trim();
                new ei.g(this).a(new ei.b(((hi.e) this.f17786l0).f19638x0.f19675z0.getText().toString().trim(), ((hi.e) this.f17786l0).f19638x0.f19672w0.getText().toString().trim(), L1(), ((hi.e) this.f17786l0).f19638x0.f19673x0.getText().toString().trim(), ((hi.e) this.f17786l0).f19638x0.f19674y0.getText().toString().trim(), "fcm"), this.f17785k0, O1());
                return;
            }
            S1(getString(i10));
        }
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        O0();
        N0();
        this.f23780w0 = new cd.b(this.f17785k0);
    }

    public void onEye(View view) {
        boolean z10;
        if (!this.f23783z0) {
            ((hi.e) this.f17786l0).f19636v0.f19657v0.setInputType(144);
            V v10 = this.f17786l0;
            ((hi.e) v10).f19636v0.f19657v0.setSelection(((hi.e) v10).f19636v0.f19657v0.getText().length());
            ((hi.e) this.f17786l0).f19636v0.f19659x0.setImageResource(a.g.ic_eye_open);
            z10 = true;
        } else {
            ((hi.e) this.f17786l0).f19636v0.f19657v0.setInputType(129);
            V v11 = this.f17786l0;
            ((hi.e) v11).f19636v0.f19657v0.setSelection(((hi.e) v11).f19636v0.f19657v0.getText().length());
            ((hi.e) this.f17786l0).f19636v0.f19659x0.setImageResource(a.g.ic_eye_close);
            z10 = false;
        }
        this.f23783z0 = z10;
    }

    public void onForgotPassword(View view) {
        id.c.a(view);
        c2();
    }

    public void onGetQRCode(View view) {
        id.c.a(view);
        p.A().Q();
        ((hi.e) this.f17786l0).f19636v0.f19661z0.setVisibility(0);
        ((hi.e) this.f17786l0).f19636v0.f19656u0.setVisibility(8);
    }

    public void onLogin(View view) {
        id.c.a(view);
        if (this.f23780w0.k()) {
            d2();
            return;
        }
        P1();
        new ErrorDialog(this.f17785k0, new k()).k("Vui lòng kiểm tra kết nối internet").n(true).show();
    }

    public void onLoginQR(View view) {
        Z1();
    }

    public void onLoginSdt(View view) {
        a2();
    }

    public void onResendOTP(View view) {
        J1();
    }

    public void onResendOTPForgotPassword(View view) {
        K1();
    }

    public void onSendOTP(View view) {
        id.c.a(view);
        if (!this.f23774q0) {
            J1();
        }
    }

    public void onSendOTPForgotPassword(View view) {
        if (!this.f23777t0) {
            K1();
        }
    }

    public void onSignup(View view) {
        f2();
    }

    public void onTrial(View view) {
        id.c.a(view);
        ((hi.e) this.f17786l0).f19637w0.f19664v0.setVisibility(0);
        if (this.f23780w0.k()) {
            new ai.e(this).a(new ai.a(id.c.c(), "", "", L1(), M1(), N1(), "fcm"), this.f17785k0, O1());
            return;
        }
        P1();
        new ErrorDialog(this.f17785k0, new j(view)).k(getString(a.o.internet_error)).n(true).show();
    }

    public void p(ci.a aVar, int i10, String str) {
        if (i10 == 200) {
            S1(getString(a.o.send_otp_success));
            T1();
            return;
        }
        S1(str);
    }

    public void r(ci.a aVar, int i10, String str) {
        id.c.d(this);
        if (i10 == 200) {
            S1(getString(a.o.otp_success));
            h2();
        } else if (i10 == 201) {
            S1(getString(a.o.note_user_partner));
            d2();
        } else {
            S1(str);
        }
    }

    public void x(ci.a aVar, int i10, String str) {
        if (i10 == 200) {
            S1(getString(a.o.send_otp_success));
            U1();
            return;
        }
        S1(str);
    }

    public void z(String str, long j10) {
        new dd.a().a(str, ((hi.e) this.f17786l0).f19636v0.f19660y0, 500);
        X1(false);
        new Handler().postDelayed(new mi.b(this), (j10 * 1000) - new Date().getTime());
    }
}
