package m4;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import d.m0;
import m4.c;
import t4.k;

public final class e implements c {
    public static final String T = "ConnectivityMonitor";
    public final Context O;
    public final c.a P;
    public boolean Q;
    public boolean R;
    public final BroadcastReceiver S = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(@m0 Context context, Intent intent) {
            e eVar = e.this;
            boolean z10 = eVar.Q;
            eVar.Q = eVar.c(context);
            if (z10 != e.this.Q) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("connectivity changed, isConnected: ");
                    sb2.append(e.this.Q);
                }
                e eVar2 = e.this;
                eVar2.P.f(eVar2.Q);
            }
        }
    }

    public e(@m0 Context context, @m0 c.a aVar) {
        this.O = context.getApplicationContext();
        this.P = aVar;
    }

    public void a() {
        g();
    }

    public void b() {
        d();
    }

    @SuppressLint({"MissingPermission"})
    public boolean c(@m0 Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) k.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException unused) {
            Log.isLoggable("ConnectivityMonitor", 5);
            return true;
        }
    }

    public final void d() {
        if (!this.R) {
            this.Q = c(this.O);
            try {
                this.O.registerReceiver(this.S, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.R = true;
            } catch (SecurityException unused) {
                Log.isLoggable("ConnectivityMonitor", 5);
            }
        }
    }

    public final void g() {
        if (this.R) {
            this.O.unregisterReceiver(this.S);
            this.R = false;
        }
    }

    public void onDestroy() {
    }
}
