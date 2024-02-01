package vn.icar.entertaiment.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.tatv.baseapp.service.BaseService;
import d.o0;
import ni.d;
import ni.e;

public class RemoteService extends BaseService {
    public static final String W = "RemoteService";
    public static d X;
    public final b U = new b();
    public final e.b V = new a();

    public class a extends e.b {
        public a() {
        }

        public void C0(int i10) throws RemoteException {
        }

        public void D1() throws RemoteException {
            RemoteService.this.P.sendBroadcast(new Intent("vn.icar.entertaiment.BACK"));
        }

        public void P0() throws RemoteException {
            jj.a.b(RemoteService.this.P).k();
            jj.a.b(RemoteService.this.P).l();
        }

        public void b(int i10) throws RemoteException {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("setVolume: ");
            sb2.append(i10);
            jj.a.b(RemoteService.this.P).o(i10);
        }

        public void f() throws RemoteException {
            RemoteService.this.P.sendBroadcast(new Intent("vn.icar.entertaiment.PLAY_PAUSE"));
        }

        public void m() throws RemoteException {
            int i10;
            jj.a aVar;
            if (mj.a.d(RemoteService.this.P).g() > 0) {
                aVar = jj.a.b(RemoteService.this.P);
                i10 = 0;
            } else {
                aVar = jj.a.b(RemoteService.this.P);
                i10 = 101;
            }
            aVar.o(i10);
        }

        public void m0(String str) throws RemoteException {
            d unused = RemoteService.X = null;
        }

        public void next() throws RemoteException {
            RemoteService.this.P.sendBroadcast(new Intent("vn.icar.entertaiment.NEXT"));
        }

        public void pause() throws RemoteException {
            RemoteService.this.P.sendBroadcast(new Intent("vn.icar.entertaiment.PLAY_PAUSE"));
        }

        public void seekTo(int i10) throws RemoteException {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("seekTo: ");
            sb2.append(i10);
            jj.a.b(RemoteService.this.P).h((float) i10);
        }

        public void y1(String str, d dVar) throws RemoteException {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("registerCallback: ");
            sb2.append(dVar != null);
            d unused = RemoteService.X = dVar;
        }
    }

    public class b extends Binder {
        public b() {
        }

        public RemoteService a() {
            return RemoteService.this;
        }
    }

    public static void C(int i10, int i11) {
        try {
            if (X != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onCurrentTimeChanged: ");
                sb2.append(i10);
                X.J0(i10, i11);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void D() {
        try {
            if (X != null) {
                X.a();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void E(int i10) {
        try {
            if (X != null) {
                X.r1(i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void F(String str, String str2, int i10) {
        try {
            if (X != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onMediaChanged: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(i10);
                X.k1(str, str2, i10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void H(boolean z10) {
        try {
            if (X != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onStatusChanged: ");
                sb2.append(z10);
                X.D0(z10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void I(int i10, int i11) {
        try {
            if (X != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onVolumeChanged: ");
                sb2.append(i10);
                X.i1(i10, i11);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String[] i() {
        return new String[0];
    }

    public void n(Context context, Intent intent) {
    }

    @o0
    public IBinder onBind(Intent intent) {
        return (intent == null || intent.getAction() == null || !intent.getAction().equals("vn.icar.entertaiment.Bind")) ? this.U : this.V;
    }

    public void onCreate() {
        super.onCreate();
        ad.d.c(W, "onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }
}
