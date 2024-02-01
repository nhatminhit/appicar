package mj;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sj.i;
import t7.t;
import vn.icar.entertaiment.service.RemoteService;
import vn.tw.service.xt.TWCommand;
import w7.s;

public class a {

    /* renamed from: h  reason: collision with root package name */
    public static a f21141h;

    /* renamed from: a  reason: collision with root package name */
    public Context f21142a;

    /* renamed from: b  reason: collision with root package name */
    public AudioManager f21143b;

    /* renamed from: c  reason: collision with root package name */
    public c f21144c;

    /* renamed from: d  reason: collision with root package name */
    public int f21145d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f21146e = 0;

    /* renamed from: f  reason: collision with root package name */
    public ContentObserver f21147f;

    /* renamed from: g  reason: collision with root package name */
    public TWCommand f21148g;

    /* renamed from: mj.a$a  reason: collision with other inner class name */
    public class C0368a implements TWCommand.OnServiceStatus {

        /* renamed from: mj.a$a$a  reason: collision with other inner class name */
        public class C0369a implements TWCommand.OnCommandCallback {
            public C0369a() {
            }

            public void onBtCallStatus(int i10, String str, String str2) {
            }

            public void onBtConnectedStatus(int i10) {
            }

            public void onBtPhoneStatus(int i10) {
            }

            public void onExtendedInterface(Bundle bundle) {
            }

            public void onReverseStatus(int i10) {
            }

            public void onSleepStatus(int i10) {
            }

            public void onSystemVolume(int i10) {
                int unused = a.this.f21146e = i10;
                a.this.j(i10);
            }

            public void onVolumeStatus(int i10) {
            }
        }

        public C0368a() {
        }

        public void serviceConnectStatus(boolean z10) {
            if (z10) {
                a.this.f21148g.registerTWCommandCallback((TWCommand.OnCommandCallback) new C0369a());
                a.this.f21148g.getVolume();
                return;
            }
            a.this.f21148g.unRegisterTWCommandCallback();
        }
    }

    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z10) {
            a aVar = a.this;
            aVar.j(aVar.g());
            super.onChange(z10);
        }
    }

    public interface c {
        void b(int i10);
    }

    public a(Context context) {
        this.f21142a = context;
        this.f21143b = (AudioManager) context.getSystemService(s.f14801b);
        h();
        c();
    }

    public static a d(Context context) {
        if (f21141h == null) {
            f21141h = new a(context);
        }
        return f21141h;
    }

    public final void c() {
        String b10 = vc.c.g().d().b();
        b10.hashCode();
        if (b10.equals("OWNICE C970") || b10.equals("OWNICE C970 (+360)")) {
            try {
                o();
            } catch (Exception unused) {
            }
        }
    }

    public int e() {
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
            case 326786986:
                if (b10.equals("OWNICE C970")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1576255573:
                if (b10.equals("OWNICE C970 (+360)")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 36;
            case 4:
            case 5:
                return 30;
            default:
                return this.f21143b.getStreamMaxVolume(3);
        }
    }

    public int f() {
        return i.r(this.f21142a).h0();
    }

    public int g() {
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
            case 326786986:
                if (b10.equals("OWNICE C970")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1576255573:
                if (b10.equals("OWNICE C970 (+360)")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return this.f21145d;
            case 4:
            case 5:
                return this.f21146e;
            default:
                return this.f21143b.getStreamVolume(3);
        }
    }

    public void h() {
        this.f21147f = new b(new Handler());
        this.f21142a.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f21147f);
    }

    public void i() {
        if (g() != 0) {
            i.r(this.f21142a).n1(g());
        }
    }

    public void j(int i10) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "volume");
            jSONObject.put(t.f13205o, i10);
            jSONObject.put("data", jSONArray);
            kj.a.j(this.f21142a).k(jSONObject);
            RemoteService.I(i10, e());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void k(int i10) {
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
            case 326786986:
                if (b10.equals("OWNICE C970")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1576255573:
                if (b10.equals("OWNICE C970 (+360)")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                if (this.f21144c != null) {
                    i();
                    if (i10 > 100) {
                        this.f21144c.b(f());
                        return;
                    } else {
                        this.f21144c.b(i10);
                        return;
                    }
                } else {
                    return;
                }
            case 4:
            case 5:
                if (this.f21148g == null) {
                    try {
                        o();
                    } catch (Exception unused) {
                    }
                }
                this.f21148g.volumeValue(i10);
                return;
            default:
                i();
                if (i10 > 100) {
                    try {
                        this.f21143b.setStreamVolume(3, f(), 4);
                        return;
                    } catch (Exception unused2) {
                        return;
                    }
                } else {
                    this.f21143b.setStreamVolume(3, i10, 4);
                    return;
                }
        }
    }

    public void l(int i10) {
        this.f21145d = i10;
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
                j(i10);
                return;
            default:
                return;
        }
    }

    public void m(c cVar) {
        this.f21144c = cVar;
    }

    public void n() {
        if (this.f21147f != null) {
            this.f21142a.getApplicationContext().getContentResolver().unregisterContentObserver(this.f21147f);
        }
        f21141h = null;
    }

    public void o() {
        TWCommand instance = TWCommand.getInstance();
        this.f21148g = instance;
        instance.init(this.f21142a, new C0368a());
    }
}
