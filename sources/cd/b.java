package cd;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f16371c = "Connectivity";

    /* renamed from: d  reason: collision with root package name */
    public static final int f16372d = 2000;

    /* renamed from: e  reason: collision with root package name */
    public static final int f16373e = 4000;

    /* renamed from: f  reason: collision with root package name */
    public static final int f16374f = 999;

    /* renamed from: g  reason: collision with root package name */
    public static long f16375g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static Thread f16376h;

    /* renamed from: i  reason: collision with root package name */
    public static final List<C0267b> f16377i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public static b f16378j;

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f16379a;

    /* renamed from: b  reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f16380b = new a();

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public void onAvailable(Network network) {
            b bVar = b.this;
            bVar.n(bVar.f());
        }

        public void onLost(Network network) {
            b.this.n(-1);
        }
    }

    /* renamed from: cd.b$b  reason: collision with other inner class name */
    public static class C0267b {

        /* renamed from: a  reason: collision with root package name */
        public String f16382a;

        /* renamed from: b  reason: collision with root package name */
        public d f16383b;

        public C0267b(String str, d dVar) {
            this.f16382a = str;
            this.f16383b = dVar;
        }

        public d a() {
            return this.f16383b;
        }

        public String b() {
            return this.f16382a;
        }

        public void c(d dVar) {
            this.f16383b = dVar;
        }

        public void d(String str) {
            this.f16382a = str;
        }
    }

    public b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f16379a = connectivityManager;
        if (Build.VERSION.SDK_INT >= 24) {
            connectivityManager.registerDefaultNetworkCallback(this.f16380b);
        } else {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), this.f16380b);
        }
        d();
    }

    public static b e(Context context) {
        if (f16378j == null) {
            f16378j = new b(context);
        }
        return f16378j;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l() {
        while (true) {
            if (!Thread.currentThread().isInterrupted()) {
                try {
                    Socket socket = new Socket();
                    socket.connect(new InetSocketAddress("8.8.8.8", 53), 2000);
                    socket.close();
                    f16375g = (System.currentTimeMillis() % 1000) - (System.currentTimeMillis() % 1000);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ping google: ");
                    sb2.append(f16375g);
                    if (k()) {
                        long j10 = f16375g;
                        if (j10 < 0) {
                            j10 = 999;
                        }
                        m(true, j10);
                    } else {
                        m(false, 999);
                    }
                } catch (IOException e10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("ping error: ");
                    sb3.append(e10.getMessage());
                    m(false, 999);
                }
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public void c(C0267b bVar) {
        int i10 = 0;
        while (true) {
            List<C0267b> list = f16377i;
            if (i10 >= list.size()) {
                bVar.a().f(k());
                bVar.a().G(f());
                list.add(bVar);
                return;
            } else if (!list.get(i10).b().equals(bVar.b())) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void d() {
        if (f16376h == null) {
            Thread thread = new Thread(new a(this));
            f16376h = thread;
            thread.start();
        }
    }

    public int f() {
        NetworkInfo activeNetworkInfo = this.f16379a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    public String g() {
        NetworkInfo activeNetworkInfo = this.f16379a.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getTypeName();
        }
        return null;
    }

    public long h() {
        return f16375g;
    }

    public e i() {
        if (!k()) {
            return new e(0, 0);
        }
        ConnectivityManager connectivityManager = this.f16379a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return new e(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
    }

    public boolean j() {
        try {
            return !InetAddress.getByName("google.com").equals("");
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean k() {
        try {
            ConnectivityManager connectivityManager = this.f16379a;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (Exception e10) {
            e10.toString();
            return false;
        }
    }

    public final void m(boolean z10, long j10) {
        int i10 = 0;
        while (true) {
            List<C0267b> list = f16377i;
            if (i10 < list.size()) {
                list.get(i10).a().f(z10);
                list.get(i10).a().J(j10);
                i10++;
            } else {
                return;
            }
        }
    }

    public final void n(int i10) {
        int i11 = 0;
        while (true) {
            List<C0267b> list = f16377i;
            if (i11 < list.size()) {
                list.get(i11).a().G(i10);
                i11++;
            } else {
                return;
            }
        }
    }

    public void o(String str) {
        int i10 = 0;
        while (true) {
            List<C0267b> list = f16377i;
            if (i10 >= list.size()) {
                return;
            }
            if (list.get(i10).b().equals(str)) {
                list.remove(i10);
            } else {
                i10++;
            }
        }
    }
}
