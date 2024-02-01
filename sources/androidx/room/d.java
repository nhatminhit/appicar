package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import d.m0;
import d.o0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3778a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3779b;

    /* renamed from: c  reason: collision with root package name */
    public int f3780c;

    /* renamed from: d  reason: collision with root package name */
    public final c f3781d;

    /* renamed from: e  reason: collision with root package name */
    public final c.C0053c f3782e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public b f3783f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f3784g;

    /* renamed from: h  reason: collision with root package name */
    public final a f3785h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f3786i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final ServiceConnection f3787j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f3788k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f3789l;

    public class a extends a.b {

        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        public class C0054a implements Runnable {
            public final /* synthetic */ String[] O;

            public C0054a(String[] strArr) {
                this.O = strArr;
            }

            public void run() {
                d.this.f3781d.i(this.O);
            }
        }

        public a() {
        }

        public void d0(String[] strArr) {
            d.this.f3784g.execute(new C0054a(strArr));
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f3783f = b.C0052b.D(iBinder);
            d dVar = d.this;
            dVar.f3784g.execute(dVar.f3788k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.f3784g.execute(dVar.f3789l);
            d.this.f3783f = null;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            try {
                d dVar = d.this;
                b bVar = dVar.f3783f;
                if (bVar != null) {
                    dVar.f3780c = bVar.q0(dVar.f3785h, dVar.f3779b);
                    d dVar2 = d.this;
                    dVar2.f3781d.a(dVar2.f3782e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: androidx.room.d$d  reason: collision with other inner class name */
    public class C0055d implements Runnable {
        public C0055d() {
        }

        public void run() {
            d dVar = d.this;
            dVar.f3781d.m(dVar.f3782e);
        }
    }

    public class e extends c.C0053c {
        public e(String[] strArr) {
            super(strArr);
        }

        public boolean a() {
            return true;
        }

        public void b(@m0 Set<String> set) {
            if (!d.this.f3786i.get()) {
                try {
                    d dVar = d.this;
                    b bVar = dVar.f3783f;
                    if (bVar != null) {
                        bVar.M1(dVar.f3780c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public d(Context context, String str, c cVar, Executor executor) {
        b bVar = new b();
        this.f3787j = bVar;
        this.f3788k = new c();
        this.f3789l = new C0055d();
        Context applicationContext = context.getApplicationContext();
        this.f3778a = applicationContext;
        this.f3779b = str;
        this.f3781d = cVar;
        this.f3784g = executor;
        this.f3782e = new e((String[]) cVar.f3750a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }

    public void a() {
        if (this.f3786i.compareAndSet(false, true)) {
            this.f3781d.m(this.f3782e);
            try {
                b bVar = this.f3783f;
                if (bVar != null) {
                    bVar.Q1(this.f3785h, this.f3780c);
                }
            } catch (RemoteException unused) {
            }
            this.f3778a.unbindService(this.f3787j);
        }
    }
}
