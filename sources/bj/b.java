package bj;

import aj.a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import cd.b;
import cd.d;
import d.h1;
import ji.a;
import sj.e;
import sj.j;
import sj.k;

public class b implements d {
    public static final String Y = "BroadcastInternetAndRemoteController";
    public static b Z;
    public Context O;
    public c P;
    public BroadcastReceiver Q;
    public cd.b R;
    public boolean S = false;
    public boolean T = false;
    public boolean U = false;
    public boolean V = false;
    public boolean W = false;
    public boolean X = false;

    public class a extends BroadcastReceiver {

        /* renamed from: bj.b$a$a  reason: collision with other inner class name */
        public class C0265a implements Runnable {
            public final /* synthetic */ Context O;

            public C0265a(Context context) {
                this.O = context;
            }

            public void run() {
                cj.a.r(this.O).s();
            }
        }

        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("vn.icar.entertaiment.AUTOSTART_PLAY")) {
                if (b.this.P != null) {
                    b.this.P.c();
                }
            } else if (intent.getAction().equals("vn.icar.entertaiment.Playing")) {
                Intent intent2 = new Intent();
                intent2.setAction("vn.icar.entertaiment.Play");
                context.sendBroadcast(intent2);
            } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                e.b(context);
            } else if (intent.getAction().equals("vn.icar.entertaiment.ACTION_OPEN_LIST_TAB")) {
                String stringExtra = intent.getStringExtra("OPEN");
                if (stringExtra != null && !stringExtra.equals("")) {
                    b.this.j(stringExtra);
                }
            } else if (intent.getAction().equals("vn.icar.entertaiment.Interactive")) {
                b.this.g(intent);
            } else if (intent.getAction().equals("vn.icar.entertaiment.PLAY_PAUSE")) {
                if (b.this.P != null) {
                    b.this.P.b();
                }
            } else if (intent.getAction().equals("vn.icar.entertaiment.BACK")) {
                if (b.this.P != null) {
                    b.this.P.g();
                }
            } else if (intent.getAction().equals("vn.icar.entertaiment.NEXT")) {
                if (b.this.P != null) {
                    b.this.P.n();
                }
            } else if (!intent.getAction().equals("vn.icar.entertaiment.MUTE")) {
                if (intent.getAction().equals("vn.icar.entertaiment.OPEN_LIST") || intent.getAction().equals("vn.icar.entertaiment.CLOSE_LIST")) {
                    nj.a.d(context).k(false);
                } else if (intent.getAction().equals("vn.icar.entertaiment.EVENT_LIST_TAB")) {
                    nj.a.d(context).k(true);
                } else if (intent.getAction().equals(a.C0341a.f19973a)) {
                    nj.a.d(context).h();
                    return;
                } else if (intent.getAction().equals("vn.icar.entertaiment.ACTION_OPEN_LIST")) {
                    String stringExtra2 = intent.getStringExtra("OPEN");
                    if (b.this.P != null) {
                        b.this.P.p(stringExtra2);
                        return;
                    }
                    return;
                } else if (intent.getAction().equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                    if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                        if (b.this.P != null) {
                            b.this.P.q(true);
                        }
                        new Handler().postDelayed(new C0265a(context), 2000);
                        return;
                    }
                    return;
                } else if (intent.getAction().equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    if (ui.a.b().f23398a.equals(a.e.f16179k)) {
                        if (b.this.P != null) {
                            b.this.P.q(false);
                        }
                        cj.a.r(context).s();
                        return;
                    }
                    return;
                } else if (intent.getAction().equals("INTENT_CHECK_ENTERTAINMENT")) {
                    try {
                        context.sendBroadcast(new Intent("INTENT_ENTERTAINMENT"));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                } else {
                    return;
                }
                nj.a.d(context).m();
            } else if (b.this.P != null) {
                b.this.P.m();
            }
        }
    }

    /* renamed from: bj.b$b  reason: collision with other inner class name */
    public class C0266b implements Runnable {
        public C0266b() {
        }

        public void run() {
            if (!b.this.V && b.this.P != null) {
                b.this.P.e(false, false);
            }
        }
    }

    public interface c {
        void b();

        void c();

        void e(boolean z10, boolean z11);

        void g();

        void k(String str);

        void m();

        void n();

        void o(String str);

        void p(String str);

        void q(boolean z10);

        void s(String str);

        void t(String str);
    }

    public b(Context context) {
        this.O = context;
        this.R = new cd.b(context);
        if (this.Q != null) {
            o2.a.b(context).f(this.Q);
        }
        h();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("vn.icar.entertaiment.Interactive");
            intentFilter.addAction("vn.icar.entertaiment.Playing");
            intentFilter.addAction("vn.icar.entertaiment.ACTION_OPEN_LIST_TAB");
            intentFilter.addAction("vn.icar.entertaiment.PLAY_PAUSE");
            intentFilter.addAction("vn.icar.entertaiment.BACK");
            intentFilter.addAction("vn.icar.entertaiment.NEXT");
            intentFilter.addAction("vn.icar.entertaiment.MUTE");
            intentFilter.addAction("vn.icar.entertaiment.OPEN_LIST");
            intentFilter.addAction("vn.icar.entertaiment.CLOSE_LIST");
            intentFilter.addAction("vn.icar.entertaiment.ACTION_OPEN_LIST");
            intentFilter.addAction("vn.icar.entertaiment.EVENT_LIST_TAB");
            intentFilter.addAction(a.C0341a.f19973a);
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
            intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
            intentFilter.addAction("INTENT_CHECK_ENTERTAINMENT");
            intentFilter.addAction("vn.icar.entertaiment.AUTOSTART_PLAY");
            context.registerReceiver(this.Q, intentFilter);
        } catch (Exception unused) {
        }
    }

    public static b i(Context context) {
        if (Z == null) {
            Z = new b(context);
        }
        return Z;
    }

    public /* synthetic */ void G(int i10) {
        cd.c.a(this, i10);
    }

    public /* synthetic */ void J(long j10) {
        cd.c.b(this, j10);
    }

    /* renamed from: e */
    public final void k(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkInternet: ");
        sb2.append(z10);
        if (!z10) {
            if (this.V) {
                c cVar = this.P;
                if (cVar != null) {
                    cVar.e(false, false);
                }
                this.T = true;
            } else if (ej.a.b().d()) {
                new Handler().postDelayed(new C0266b(), 60000);
            } else {
                c cVar2 = this.P;
                if (cVar2 != null) {
                    cVar2.e(false, false);
                }
            }
        } else if (this.V) {
            this.T = false;
            if (this.U) {
                c cVar3 = this.P;
                if (cVar3 != null) {
                    cVar3.e(true, false);
                }
                this.U = false;
            }
        } else {
            c cVar4 = this.P;
            if (cVar4 != null) {
                cVar4.e(true, true);
            }
            this.V = true;
        }
    }

    public void f(boolean z10) {
        if (!this.X) {
            this.S = z10;
            this.X = true;
        } else if (z10 != this.S) {
            this.S = z10;
        } else {
            return;
        }
        n(z10);
    }

    public void g(Intent intent) {
        c cVar;
        c cVar2;
        String str;
        if (intent.getStringExtra("key") != null) {
            String stringExtra = intent.getStringExtra("key");
            stringExtra.hashCode();
            char c10 = 65535;
            switch (stringExtra.hashCode()) {
                case -1944775874:
                    if (stringExtra.equals("video offline")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1833170662:
                    if (stringExtra.equals("thiếu nhi")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1548612125:
                    if (stringExtra.equals(a.e.f16179k)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1314797049:
                    if (stringExtra.equals("tin tức")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -991745245:
                    if (stringExtra.equals("youtube")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -611215991:
                    if (stringExtra.equals("yêu xe")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -190628561:
                    if (stringExtra.equals("truyện ngắn")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case -16905505:
                    if (stringExtra.equals("nhạc offline")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 3714:
                    if (stringExtra.equals("tv")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 3202370:
                    if (stringExtra.equals("hide")) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 3560424:
                    if (stringExtra.equals("tivi")) {
                        c10 = 10;
                        break;
                    }
                    break;
                case 94756344:
                    if (stringExtra.equals("close")) {
                        c10 = 11;
                        break;
                    }
                    break;
                case 108270587:
                    if (stringExtra.equals("radio")) {
                        c10 = 12;
                        break;
                    }
                    break;
                case 1301630180:
                    if (stringExtra.equals("review phim")) {
                        c10 = 13;
                        break;
                    }
                    break;
                case 1438155107:
                    if (stringExtra.equals("tri thức")) {
                        c10 = 14;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 2:
                case 7:
                    c cVar3 = this.P;
                    if (cVar3 != null) {
                        cVar3.s(a.e.f16179k);
                        return;
                    }
                    return;
                case 1:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16177i;
                        break;
                    } else {
                        return;
                    }
                case 3:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16176h;
                        break;
                    } else {
                        return;
                    }
                case 4:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16172d;
                        break;
                    } else {
                        return;
                    }
                case 5:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16178j;
                        break;
                    } else {
                        return;
                    }
                case 6:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16174f;
                        break;
                    } else {
                        return;
                    }
                case 8:
                case 10:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = "TV";
                        break;
                    } else {
                        return;
                    }
                case 9:
                    k.g(this.O);
                    return;
                case 11:
                    ((Activity) this.O).finish();
                    return;
                case 12:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = "Radio";
                        break;
                    } else {
                        return;
                    }
                case 13:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16173e;
                        break;
                    } else {
                        return;
                    }
                case 14:
                    cVar2 = this.P;
                    if (cVar2 != null) {
                        str = a.e.f16175g;
                        break;
                    } else {
                        return;
                    }
                default:
                    c cVar4 = this.P;
                    if (cVar4 != null) {
                        cVar4.k(intent.getStringExtra("key").toString().trim());
                        return;
                    }
                    return;
            }
            cVar2.s(str);
        } else if (intent.getStringExtra("key2") != null) {
            c cVar5 = this.P;
            if (cVar5 != null) {
                cVar5.o(intent.getStringExtra("key2").toString().trim());
            }
        } else if (intent.getStringExtra("key3") != null && (cVar = this.P) != null) {
            cVar.t(intent.getStringExtra("key3").toString().trim());
        }
    }

    public final void h() {
        if (this.Q == null) {
            this.Q = new a();
        }
    }

    public final void j(String str) {
        c cVar;
        String str2;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1989870024:
                if (str.equals(j.f23065a)) {
                    c10 = 0;
                    break;
                }
                break;
            case -1527348823:
                if (str.equals(j.f23079o)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1480040898:
                if (str.equals(j.f23076l)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1325468476:
                if (str.equals(j.f23069e)) {
                    c10 = 3;
                    break;
                }
                break;
            case -326394447:
                if (str.equals(j.f23067c)) {
                    c10 = 4;
                    break;
                }
                break;
            case 147414783:
                if (str.equals(j.f23081q)) {
                    c10 = 5;
                    break;
                }
                break;
            case 170797306:
                if (str.equals(j.f23077m)) {
                    c10 = 6;
                    break;
                }
                break;
            case 349856231:
                if (str.equals(j.f23075k)) {
                    c10 = 7;
                    break;
                }
                break;
            case 529245855:
                if (str.equals(j.f23068d)) {
                    c10 = 8;
                    break;
                }
                break;
            case 672908035:
                if (str.equals(a.e.f16172d)) {
                    c10 = 9;
                    break;
                }
                break;
            case 925367141:
                if (str.equals(j.f23066b)) {
                    c10 = 10;
                    break;
                }
                break;
            case 1080341942:
                if (str.equals(j.f23082r)) {
                    c10 = 11;
                    break;
                }
                break;
            case 1115713592:
                if (str.equals(j.f23070f)) {
                    c10 = 12;
                    break;
                }
                break;
            case 1425334010:
                if (str.equals(j.f23080p)) {
                    c10 = 13;
                    break;
                }
                break;
            case 1447914017:
                if (str.equals(j.f23078n)) {
                    c10 = 14;
                    break;
                }
                break;
            case 1477240079:
                if (str.equals(j.f23071g)) {
                    c10 = 15;
                    break;
                }
                break;
            case 1477842786:
                if (str.equals(j.f23074j)) {
                    c10 = 16;
                    break;
                }
                break;
            case 1502799235:
                if (str.equals(j.f23073i)) {
                    c10 = 17;
                    break;
                }
                break;
            case 1570940141:
                if (str.equals(j.f23072h)) {
                    c10 = 18;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 10:
                cVar = this.P;
                if (cVar != null) {
                    str2 = "Radio";
                    break;
                } else {
                    return;
                }
            case 1:
            case 13:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16178j;
                    break;
                } else {
                    return;
                }
            case 2:
            case 7:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16176h;
                    break;
                } else {
                    return;
                }
            case 3:
            case 12:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16173e;
                    break;
                } else {
                    return;
                }
            case 4:
            case 8:
                cVar = this.P;
                if (cVar != null) {
                    str2 = "TV";
                    break;
                } else {
                    return;
                }
            case 5:
            case 11:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16179k;
                    break;
                } else {
                    return;
                }
            case 6:
            case 14:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16177i;
                    break;
                } else {
                    return;
                }
            case 9:
                c cVar2 = this.P;
                if (cVar2 != null) {
                    cVar2.s(a.e.f16172d);
                    return;
                }
                return;
            case 15:
            case 18:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16174f;
                    break;
                } else {
                    return;
                }
            case 16:
            case 17:
                cVar = this.P;
                if (cVar != null) {
                    str2 = a.e.f16175g;
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        cVar.s(str2);
    }

    public void l(c cVar) {
        this.P = cVar;
        this.R.c(new b.C0267b(Y, this));
    }

    public void m() {
        if (this.Q != null) {
            o2.a.b(this.O).f(this.Q);
        }
        this.R.o(Y);
        Z = null;
    }

    @h1
    public void n(boolean z10) {
        i0.d.l(this.O).execute(new a(this, z10));
    }
}
