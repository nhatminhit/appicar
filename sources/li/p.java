package li;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import d.m0;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import od.b;
import od.e;
import org.json.JSONObject;
import pd.a;
import rh.u;

public class p {

    /* renamed from: s  reason: collision with root package name */
    public static p f20968s;

    /* renamed from: a  reason: collision with root package name */
    public final String f20969a = "SocketManager";

    /* renamed from: b  reason: collision with root package name */
    public e f20970b;

    /* renamed from: c  reason: collision with root package name */
    public String f20971c = "";

    /* renamed from: d  reason: collision with root package name */
    public b.a f20972d;

    /* renamed from: e  reason: collision with root package name */
    public Context f20973e;

    /* renamed from: f  reason: collision with root package name */
    public di.a f20974f;

    /* renamed from: g  reason: collision with root package name */
    public String f20975g;

    /* renamed from: h  reason: collision with root package name */
    public ci.e f20976h;

    /* renamed from: i  reason: collision with root package name */
    public cd.b f20977i;

    /* renamed from: j  reason: collision with root package name */
    public a f20978j;

    /* renamed from: k  reason: collision with root package name */
    public CountDownTimer f20979k;

    /* renamed from: l  reason: collision with root package name */
    public a.C0385a f20980l = new b();

    /* renamed from: m  reason: collision with root package name */
    public a.C0385a f20981m = new m(this);

    /* renamed from: n  reason: collision with root package name */
    public a.C0385a f20982n = new n(this);

    /* renamed from: o  reason: collision with root package name */
    public a.C0385a f20983o = new o(this);

    /* renamed from: p  reason: collision with root package name */
    public a.C0385a f20984p = new e(this);

    /* renamed from: q  reason: collision with root package name */
    public a.C0385a f20985q = new f(this);

    /* renamed from: r  reason: collision with root package name */
    public List<b> f20986r = new ArrayList();

    public class a extends CountDownTimer {
        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void onFinish() {
            if (p.this.f20978j != null) {
                p.this.f20978j.B();
            }
        }

        public void onTick(long j10) {
        }
    }

    public class b implements a.C0385a {
        public b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Object[] objArr) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onConnect ");
            sb2.append(objArr.length > 0 ? objArr[0].toString() : "");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("socketId: ");
            sb3.append(p.this.f20970b.G());
            if (p.this.f20970b.G() != null) {
                if (!p.this.f20971c.equals(p.this.f20970b.G())) {
                    p pVar = p.this;
                    String unused = pVar.f20971c = pVar.f20970b.G();
                    if (p.this.f20978j != null) {
                        p.this.f20978j.O(p.this.f20971c);
                    }
                    p.this.f20970b.g(p.this.f20971c, p.this.f20985q);
                    if (p.this.f20976h != null) {
                        e n10 = p.this.f20970b;
                        n10.h("get-qr-login-" + p.this.f20971c, p.this.f20983o);
                    } else {
                        p.this.b0();
                    }
                }
                p.this.w();
                return;
            }
            ad.d.c("SocketManager", "socketId null");
        }

        public void c(Object... objArr) {
            new Handler(Looper.getMainLooper()).post(new q(this, objArr));
        }
    }

    public class c implements pc.b {
        public c() {
        }

        public <T> void a(T t10) {
            if (t10 == null) {
                if (p.this.f20978j != null) {
                    p.this.f20978j.d();
                }
                p.this.Z();
                return;
            }
            p.this.Y((ci.d) t10);
            p pVar = p.this;
            pVar.B(pVar.f20973e, p.this.f20975g, (ci.e) null);
            p.this.x();
        }
    }

    public class d implements rh.d<ci.d> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pc.b f20990a;

        public d(pc.b bVar) {
            this.f20990a = bVar;
        }

        public void a(@m0 rh.b<ci.d> bVar, @m0 u<ci.d> uVar) {
            pc.b bVar2;
            ci.d dVar;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onResponse: ");
            sb2.append(uVar.b());
            sb2.append("-");
            sb2.append(uVar.a() != null ? uVar.a().toString() : "");
            if (uVar.b() == 200) {
                bVar2 = this.f20990a;
                if (bVar2 != null) {
                    dVar = uVar.a();
                } else {
                    return;
                }
            } else if (uVar.b() != 401) {
                bVar2 = this.f20990a;
                if (bVar2 != null) {
                    dVar = null;
                } else {
                    return;
                }
            } else if (p.this.f20974f.L() == 2) {
                p.this.f20974f.a();
                if (p.this.f20978j != null) {
                    p.this.f20978j.a();
                }
                ad.d.a("SocketManager", "onLogout");
                return;
            } else {
                return;
            }
            bVar2.a(dVar);
        }

        public void b(@m0 rh.b<ci.d> bVar, @m0 Throwable th2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onFailure: ");
            sb2.append(th2.getMessage());
            pc.b bVar2 = this.f20990a;
            if (bVar2 != null) {
                bVar2.a(null);
            }
        }
    }

    public static p A() {
        if (f20968s == null) {
            f20968s = new p();
        }
        return f20968s;
    }

    public static /* synthetic */ void D(pc.b bVar, Object[] objArr) {
        if (bVar != null) {
            bVar.a(objArr[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("tokenError: ");
        sb2.append(objArr[0].toString());
        new xc.a();
        if (((ci.b) xc.a.c(objArr[0].toString(), ci.b.class)).getStatusCode() == 401) {
            S();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new j(this, objArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H(Object[] objArr) {
        if (this.f20977i.k()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onConnectError: ");
            sb2.append(objArr[0].toString());
            new xc.a();
            ci.b bVar = (ci.b) xc.a.c(objArr[0].toString(), ci.b.class);
            a aVar = this.f20978j;
            if (aVar != null) {
                aVar.n(bVar);
            }
        } else {
            a aVar2 = this.f20978j;
            if (aVar2 != null) {
                aVar2.n(new ci.b());
            }
        }
        a0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new d(this, objArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J() {
        a aVar = this.f20978j;
        if (aVar != null) {
            aVar.e();
        }
        c0();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void K(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new i(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void L(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onReceiveQRCode: ");
        sb2.append(objArr[0].toString());
        new xc.a();
        ci.c cVar = (ci.c) xc.a.c(objArr[0].toString(), ci.c.class);
        a aVar = this.f20978j;
        if (aVar != null) {
            aVar.z(cVar.getData().get(0).getQrCode(), cVar.getData().get(0).getQrExpiresAt());
        }
        e eVar = this.f20970b;
        if (eVar != null) {
            eVar.h(cVar.getData().get(0).getAuthEvent(), A().f20984p);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void M(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new h(this, objArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N(Object[] objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onScanQRCode: ");
        sb2.append(objArr[0].toString());
        new xc.a();
        ci.d dVar = (ci.d) xc.a.c(objArr[0].toString(), ci.d.class);
        Y(dVar);
        a aVar = this.f20978j;
        if (aVar != null) {
            aVar.m(dVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void O(Object[] objArr) {
        new Handler(Looper.getMainLooper()).post(new k(this, objArr));
    }

    public void B(Context context, String str, ci.e eVar) {
        List list;
        ad.d.b("SocketManager", "Socket init", eVar != null ? "Khởi tạo kết nối quét mã QR" : "Khởi tạo kết nối thời gian thực");
        this.f20973e = context;
        this.f20975g = str;
        this.f20976h = eVar;
        if (this.f20974f == null) {
            this.f20974f = new di.a(context);
        }
        if (this.f20977i == null) {
            this.f20977i = new cd.b(context);
        }
        b.a aVar = new b.a();
        this.f20972d = aVar;
        aVar.f22332m = new String[]{rd.c.f22474x};
        HashMap hashMap = new HashMap();
        hashMap.put("accept-language", Arrays.asList(new String[]{this.f20974f.c()}));
        if (eVar != null) {
            new xc.a();
            String encodeToString = Base64.encodeToString(xc.a.a(eVar).getBytes(StandardCharsets.UTF_8), 2);
            list = Arrays.asList(new String[]{"QR " + encodeToString});
        } else {
            T();
            list = Arrays.asList(new String[]{"Bearer " + this.f20974f.q()});
        }
        hashMap.put("authorization", list);
        b.a aVar2 = this.f20972d;
        aVar2.f22370l = hashMap;
        aVar2.f21414s = true;
        aVar2.f21415t = 9999;
        aVar2.f21416u = 1000;
        aVar2.f21417v = 8000;
        aVar2.f21418w = 0.5d;
        try {
            e eVar2 = this.f20970b;
            if (eVar2 != null) {
                if (eVar2.B()) {
                    this.f20970b.D();
                }
                this.f20970b.z();
            }
            this.f20970b = null;
            this.f20970b = od.b.d(str, this.f20972d);
        } catch (URISyntaxException e10) {
            ad.d.c("SocketManager", e10.getMessage());
        }
    }

    public boolean C() {
        e eVar = this.f20970b;
        if (eVar == null) {
            return false;
        }
        return eVar.B();
    }

    public void P() {
        String str;
        ad.d.a("SocketManager", "reInit");
        Context context = this.f20973e;
        if (context != null && (str = this.f20975g) != null) {
            B(context, str, this.f20976h);
        }
    }

    public void Q() {
        e eVar = this.f20970b;
        if (eVar != null && this.f20976h != null) {
            eVar.D();
            this.f20970b.A();
        }
    }

    public void R(pc.b bVar) {
        ((zh.a) jc.b.b(this.f20973e, this.f20975g, zh.a.class)).j(new fi.a(this.f20974f.j())).l(new d(bVar));
    }

    public final void S() {
        R(new c());
    }

    public final void T() {
        if (yc.a.c(this.f20974f.q()) - uc.a.a() < 21600) {
            R((pc.b) null);
        }
    }

    public void U(b bVar) {
        this.f20986r.add(bVar);
    }

    public void V(a aVar) {
        this.f20978j = aVar;
    }

    public void W() {
        w();
        if (this.f20979k == null) {
            this.f20979k = new a(8000, 1000);
        }
        this.f20979k.start();
    }

    public void X(String str) {
        for (int i10 = 0; i10 < this.f20986r.size(); i10++) {
            if (this.f20986r.get(i10).f20960a.equals(str)) {
                this.f20986r.remove(i10);
                return;
            }
        }
    }

    public final void Y(ci.d dVar) {
        this.f20974f.H(dVar.getData().get(0).getAccessToken());
        this.f20974f.B(dVar.getData().get(0).getRefreshToken());
        this.f20974f.D(dVar.getData().get(0).getSub());
        this.f20974f.I(dVar.getData().get(0).getUserId());
        this.f20974f.G(dVar.getData().get(0).getExp().longValue());
    }

    public void Z() {
        for (int i10 = 0; i10 < this.f20986r.size(); i10++) {
            this.f20986r.get(i10).f20961b.d();
        }
    }

    public void a0() {
        for (int i10 = 0; i10 < this.f20986r.size(); i10++) {
            this.f20986r.get(i10).f20961b.a();
        }
    }

    public void b0() {
        for (int i10 = 0; i10 < this.f20986r.size(); i10++) {
            this.f20986r.get(i10).f20961b.c();
        }
    }

    public void c0() {
        for (int i10 = 0; i10 < this.f20986r.size(); i10++) {
            this.f20986r.get(i10).f20961b.e();
        }
    }

    public void v(String str, pc.b bVar) {
        e eVar = this.f20970b;
        if (eVar != null) {
            eVar.g(str, new g(bVar));
        }
    }

    public void w() {
        CountDownTimer countDownTimer = this.f20979k;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void x() {
        this.f20970b.g(e.f21426m, this.f20980l);
        this.f20970b.g(e.f21428o, this.f20981m);
        this.f20970b.g(e.f21427n, this.f20982n);
        this.f20970b.A();
        W();
    }

    public void y(String str, String str2) {
        e eVar = this.f20970b;
        if (eVar != null) {
            eVar.a(str, str2);
        }
    }

    public void z(String str, JSONObject jSONObject) {
        e eVar = this.f20970b;
        if (eVar != null) {
            eVar.a(str, jSONObject);
        }
    }
}
