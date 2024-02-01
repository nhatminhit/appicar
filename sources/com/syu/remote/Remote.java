package com.syu.remote;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.SparseArray;
import com.syu.ipc.IRemoteModule;
import com.syu.ipc.IRemoteToolkit;
import java.util.HashMap;
import java.util.Random;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Remote implements ServiceConnection {
    public static final HashMap<String, Remote> Y = new HashMap<>();
    public final int O;
    public final int P;
    public SparseArray<d> Q;
    public IRemoteToolkit R;
    public Context S;
    public Looper T;
    public Handler U;
    public boolean V;
    public String W;
    public String X;

    public class a implements Runnable {
        public final /* synthetic */ Handler P;

        public a(Handler handler) {
            this.P = handler;
        }

        public void run() {
            Remote remote = Remote.this;
            if (remote.V && remote.R == null) {
                remote.a();
            }
            this.P.removeCallbacks(this);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            for (int i10 = 0; i10 < 20; i10++) {
                IRemoteModule iRemoteModule = null;
                try {
                    iRemoteModule = Remote.this.R.getRemoteModule(i10);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
                if (iRemoteModule != null) {
                    d dVar = new d(iRemoteModule, new RemoteCallback(i10));
                    Remote.this.Q.put(i10, dVar);
                    dVar.e();
                }
            }
            EventBus.getDefault().post(new ConnEvent("conn", true));
        }
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f17762a;

        /* renamed from: b  reason: collision with root package name */
        public int f17763b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f17764c;

        /* renamed from: d  reason: collision with root package name */
        public float[] f17765d;

        /* renamed from: e  reason: collision with root package name */
        public String[] f17766e;

        public c(int i10, int i11, int[] iArr, float[] fArr, String[] strArr) {
            this.f17762a = i10;
            this.f17763b = i11;
            this.f17764c = iArr;
            this.f17765d = fArr;
            this.f17766e = strArr;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public IRemoteModule f17768a;

        /* renamed from: b  reason: collision with root package name */
        public RemoteCallback f17769b;

        public d(IRemoteModule iRemoteModule, RemoteCallback remoteCallback) {
            this.f17768a = iRemoteModule;
            this.f17769b = remoteCallback;
        }

        public void a(int i10, int... iArr) {
            b(i10, iArr, (float[]) null, (String[]) null);
        }

        public void b(int i10, int[] iArr, float[] fArr, String[] strArr) {
            try {
                this.f17768a.cmd(i10, iArr, fArr, strArr);
            } catch (RemoteException e10) {
                e10.printStackTrace();
                Remote remote = Remote.this;
                if (remote.V) {
                    remote.a();
                }
            }
        }

        public void c(int... iArr) {
            if (iArr != null) {
                for (int disEnable : iArr) {
                    this.f17769b.disEnable(disEnable);
                }
            }
        }

        public void d(int... iArr) {
            if (iArr != null) {
                for (int i10 : iArr) {
                    this.f17769b.enable(i10);
                    try {
                        this.f17768a.register(this.f17769b, i10, 1);
                    } catch (RemoteException e10) {
                        e10.printStackTrace();
                        Remote remote = Remote.this;
                        if (remote.V) {
                            remote.a();
                        }
                    }
                }
            }
        }

        public void e() {
            SparseArray<Boolean> clone = this.f17769b.f17772b.clone();
            int size = clone.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    this.f17768a.register(this.f17769b, clone.keyAt(i10), clone.valueAt(i10).booleanValue() ? 1 : 0);
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
            }
        }

        public void f() {
            SparseArray<Boolean> clone = this.f17769b.f17772b.clone();
            int size = clone.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    this.f17768a.unregister(this.f17769b, clone.keyAt(i10));
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                    Remote remote = Remote.this;
                    if (remote.V) {
                        remote.a();
                    }
                }
            }
        }
    }

    public Remote(Context context) {
        this(context, "com.syu.ms.toolkit", gg.a.L5);
    }

    public Remote(Context context, String str, String str2) {
        this.O = 1500;
        this.P = 500;
        this.Q = new SparseArray<>();
        this.V = true;
        EventBus.getDefault().register(this);
        this.S = context;
        this.W = str;
        this.X = str2;
        HandlerThread handlerThread = new HandlerThread("remote connection");
        handlerThread.start();
        this.T = handlerThread.getLooper();
        this.U = new Handler(this.T);
        a();
    }

    public static Remote getAutoTools(Context context) {
        return getAutoTools(context, "com.syu.ms.toolkit", gg.a.L5);
    }

    public static Remote getAutoTools(Context context, String str, String str2) {
        String str3 = String.valueOf(str2) + "#" + str;
        HashMap<String, Remote> hashMap = Y;
        if (hashMap.containsKey(str3)) {
            return hashMap.get(str3);
        }
        Remote remote = new Remote(context, str, str2);
        hashMap.put(str3, remote);
        return remote;
    }

    public void a() {
        Intent intent = new Intent(this.W);
        this.V = true;
        intent.setPackage(this.X);
        this.S.bindService(intent, this, 1);
        Handler handler = new Handler();
        handler.postDelayed(new a(handler), (long) (new Random().nextInt(1500) + 500));
    }

    public d b(int i10) {
        return this.Q.get(i10, (Object) null);
    }

    public void c() {
        this.V = false;
        Context context = this.S;
        if (context != null) {
            context.unbindService(this);
        }
    }

    public void command(int i10, int i11, int... iArr) {
        command(i10, i11, iArr, (float[]) null, (String[]) null);
    }

    public void command(int i10, int i11, int[] iArr, float[] fArr, String[] strArr) {
        EventBus.getDefault().post(new c(i10, i11, iArr, fArr, strArr));
    }

    public void disobserve(int i10, int... iArr) {
        d b10 = b(i10);
        if (b10 != null) {
            b10.c(iArr);
        }
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void handCommand(c cVar) {
        d b10 = b(cVar.f17762a);
        if (b10 != null) {
            b10.b(cVar.f17763b, cVar.f17764c, cVar.f17765d, cVar.f17766e);
        }
    }

    public boolean isConnected() {
        return this.R != null;
    }

    public void observe(int i10, int... iArr) {
        d b10 = b(i10);
        if (b10 != null) {
            b10.d(iArr);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler handler;
        if (iBinder != null) {
            IRemoteToolkit asInterface = IRemoteToolkit.Stub.asInterface(iBinder);
            this.R = asInterface;
            if (asInterface != null && (handler = this.U) != null) {
                handler.post(new b());
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.R = null;
        if (this.V) {
            a();
        } else {
            EventBus.getDefault().post(new ConnEvent("conn", false));
        }
    }
}
