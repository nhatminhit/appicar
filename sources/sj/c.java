package sj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final String f23035e = "hg";

    /* renamed from: a  reason: collision with root package name */
    public Context f23036a;

    /* renamed from: b  reason: collision with root package name */
    public IntentFilter f23037b = new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS");

    /* renamed from: c  reason: collision with root package name */
    public b f23038c;

    /* renamed from: d  reason: collision with root package name */
    public a f23039d;

    public class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public final String f23040a = "reason";

        /* renamed from: b  reason: collision with root package name */
        public final String f23041b = "globalactions";

        /* renamed from: c  reason: collision with root package name */
        public final String f23042c = "recentapps";

        /* renamed from: d  reason: collision with root package name */
        public final String f23043d = "homekey";

        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && (stringExtra = intent.getStringExtra("reason")) != null && c.this.f23038c != null) {
                if (stringExtra.equals("homekey")) {
                    c.this.f23038c.b();
                } else if (stringExtra.equals("recentapps")) {
                    c.this.f23038c.a();
                }
            }
        }
    }

    public interface b {
        void a();

        void b();
    }

    public c(Context context) {
        this.f23036a = context;
    }

    public void b(b bVar) {
        this.f23038c = bVar;
        this.f23039d = new a();
    }

    public void c() {
        a aVar = this.f23039d;
        if (aVar != null) {
            try {
                this.f23036a.registerReceiver(aVar, this.f23037b);
            } catch (Exception unused) {
                d();
            }
        }
    }

    public void d() {
        a aVar = this.f23039d;
        if (aVar != null) {
            this.f23036a.unregisterReceiver(aVar);
        }
    }
}
