package com.google.android.exoplayer2.offline;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.exoplayer2.offline.b;
import com.google.android.exoplayer2.scheduler.Requirements;
import d.a1;
import d.o0;
import java.util.HashMap;
import java.util.List;
import w7.p;
import w7.q0;
import w7.u;
import z6.d;
import z6.r;
import z6.t;

public abstract class DownloadService extends Service {
    public static final String X = "com.google.android.exoplayer.downloadService.action.INIT";
    public static final String Y = "com.google.android.exoplayer.downloadService.action.RESTART";
    public static final String Z = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f5185a0 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f5186b0 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f5187c0 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f5188d0 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f5189e0 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON";

    /* renamed from: f0  reason: collision with root package name */
    public static final String f5190f0 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS";

    /* renamed from: g0  reason: collision with root package name */
    public static final String f5191g0 = "download_request";

    /* renamed from: h0  reason: collision with root package name */
    public static final String f5192h0 = "content_id";

    /* renamed from: i0  reason: collision with root package name */
    public static final String f5193i0 = "stop_reason";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f5194j0 = "requirements";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f5195k0 = "foreground";

    /* renamed from: l0  reason: collision with root package name */
    public static final int f5196l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final long f5197m0 = 1000;

    /* renamed from: n0  reason: collision with root package name */
    public static final String f5198n0 = "DownloadService";

    /* renamed from: o0  reason: collision with root package name */
    public static final HashMap<Class<? extends DownloadService>, b> f5199o0 = new HashMap<>();
    @o0
    public final c O;
    @o0
    public final String P;
    @a1
    public final int Q;
    @a1
    public final int R;
    public b S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;

    public static final class b implements b.d {

        /* renamed from: a  reason: collision with root package name */
        public final Context f5200a;

        /* renamed from: b  reason: collision with root package name */
        public final b f5201b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final a7.c f5202c;

        /* renamed from: d  reason: collision with root package name */
        public final Class<? extends DownloadService> f5203d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public DownloadService f5204e;

        public b(Context context, b bVar, @o0 a7.c cVar, Class<? extends DownloadService> cls) {
            this.f5200a = context;
            this.f5201b = bVar;
            this.f5202c = cVar;
            this.f5203d = cls;
            bVar.e(this);
            if (cVar != null) {
                Requirements l10 = bVar.l();
                i(!l10.a(context), l10);
            }
        }

        public void a(b bVar, d dVar) {
            DownloadService downloadService = this.f5204e;
            if (downloadService != null) {
                downloadService.u(dVar);
            }
        }

        public void b(b bVar, Requirements requirements, int i10) {
            boolean z10 = i10 == 0;
            if (this.f5204e == null && z10) {
                try {
                    this.f5200a.startService(DownloadService.p(this.f5200a, this.f5203d, DownloadService.X));
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            if (this.f5202c != null) {
                i(true ^ z10, requirements);
            }
        }

        public final void c(b bVar) {
            DownloadService downloadService = this.f5204e;
            if (downloadService != null) {
                downloadService.I();
            }
        }

        public /* synthetic */ void d(b bVar) {
            r.d(this, bVar);
        }

        public void e(b bVar, d dVar) {
            DownloadService downloadService = this.f5204e;
            if (downloadService != null) {
                downloadService.t(dVar);
            }
        }

        public void g(DownloadService downloadService) {
            w7.a.i(this.f5204e == null);
            this.f5204e = downloadService;
        }

        public void h(DownloadService downloadService, boolean z10) {
            w7.a.i(this.f5204e == downloadService);
            this.f5204e = null;
            a7.c cVar = this.f5202c;
            if (cVar != null && z10) {
                cVar.cancel();
            }
        }

        public final void i(boolean z10, Requirements requirements) {
            if (!z10) {
                this.f5202c.cancel();
                return;
            }
            if (!this.f5202c.a(requirements, this.f5200a.getPackageName(), DownloadService.Y)) {
                p.d(DownloadService.f5198n0, "Scheduling downloads failed.");
            }
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5205a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5206b;

        /* renamed from: c  reason: collision with root package name */
        public final Handler f5207c = new Handler(Looper.getMainLooper());

        /* renamed from: d  reason: collision with root package name */
        public final Runnable f5208d = new t(this);

        /* renamed from: e  reason: collision with root package name */
        public boolean f5209e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5210f;

        public c(int i10, long j10) {
            this.f5205a = i10;
            this.f5206b = j10;
        }

        public void b() {
            if (this.f5210f) {
                f();
            }
        }

        public void c() {
            if (!this.f5210f) {
                f();
            }
        }

        public void d() {
            this.f5209e = true;
            f();
        }

        public void e() {
            this.f5209e = false;
            this.f5207c.removeCallbacks(this.f5208d);
        }

        public final void f() {
            List<d> f10 = DownloadService.this.S.f();
            DownloadService downloadService = DownloadService.this;
            downloadService.startForeground(this.f5205a, downloadService.o(f10));
            this.f5210f = true;
            if (this.f5209e) {
                this.f5207c.removeCallbacks(this.f5208d);
                this.f5207c.postDelayed(this.f5208d, this.f5206b);
            }
        }
    }

    public DownloadService(int i10) {
        this(i10, 1000);
    }

    public DownloadService(int i10, long j10) {
        this(i10, j10, (String) null, 0, 0);
    }

    @Deprecated
    public DownloadService(int i10, long j10, @o0 String str, @a1 int i11) {
        this(i10, j10, str, i11, 0);
    }

    public DownloadService(int i10, long j10, @o0 String str, @a1 int i11, @a1 int i12) {
        if (i10 == 0) {
            this.O = null;
            this.P = null;
            this.Q = 0;
            this.R = 0;
            return;
        }
        this.O = new c(i10, j10);
        this.P = str;
        this.Q = i11;
        this.R = i12;
    }

    public static void A(Context context, Class<? extends DownloadService> cls, boolean z10) {
        H(context, i(context, cls, z10), z10);
    }

    public static void B(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        H(context, j(context, cls, str, z10), z10);
    }

    public static void C(Context context, Class<? extends DownloadService> cls, boolean z10) {
        H(context, k(context, cls, z10), z10);
    }

    public static void D(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        H(context, l(context, cls, requirements, z10), z10);
    }

    public static void E(Context context, Class<? extends DownloadService> cls, @o0 String str, int i10, boolean z10) {
        H(context, m(context, cls, str, i10, z10), z10);
    }

    public static void F(Context context, Class<? extends DownloadService> cls) {
        context.startService(p(context, cls, X));
    }

    public static void G(Context context, Class<? extends DownloadService> cls) {
        q0.U0(context, q(context, cls, X, true));
    }

    public static void H(Context context, Intent intent, boolean z10) {
        if (z10) {
            q0.U0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent f(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        return q(context, cls, Z, z10).putExtra(f5191g0, downloadRequest).putExtra("stop_reason", i10);
    }

    public static Intent g(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        return f(context, cls, downloadRequest, 0, z10);
    }

    public static Intent h(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return q(context, cls, f5188d0, z10);
    }

    public static Intent i(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return q(context, cls, f5186b0, z10);
    }

    public static Intent j(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return q(context, cls, f5185a0, z10).putExtra(f5192h0, str);
    }

    public static Intent k(Context context, Class<? extends DownloadService> cls, boolean z10) {
        return q(context, cls, f5187c0, z10);
    }

    public static Intent l(Context context, Class<? extends DownloadService> cls, Requirements requirements, boolean z10) {
        return q(context, cls, f5190f0, z10).putExtra("requirements", requirements);
    }

    public static Intent m(Context context, Class<? extends DownloadService> cls, @o0 String str, int i10, boolean z10) {
        return q(context, cls, f5189e0, z10).putExtra(f5192h0, str).putExtra("stop_reason", i10);
    }

    public static Intent p(Context context, Class<? extends DownloadService> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static Intent q(Context context, Class<? extends DownloadService> cls, String str, boolean z10) {
        return p(context, cls, str).putExtra(f5195k0, z10);
    }

    public static void x(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, int i10, boolean z10) {
        H(context, f(context, cls, downloadRequest, i10, z10), z10);
    }

    public static void y(Context context, Class<? extends DownloadService> cls, DownloadRequest downloadRequest, boolean z10) {
        H(context, g(context, cls, downloadRequest, z10), z10);
    }

    public static void z(Context context, Class<? extends DownloadService> cls, boolean z10) {
        H(context, h(context, cls, z10), z10);
    }

    public final void I() {
        c cVar = this.O;
        if (cVar != null) {
            cVar.e();
            if (this.U && q0.f14786a >= 26) {
                this.O.c();
            }
        }
        if (q0.f14786a >= 28 || !this.V) {
            stopSelfResult(this.T);
        } else {
            stopSelf();
        }
    }

    public abstract b n();

    public abstract Notification o(List<d> list);

    @o0
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        String str = this.P;
        if (str != null) {
            u.b(this, str, this.Q, this.R, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends DownloadService>, b> hashMap = f5199o0;
        b bVar = hashMap.get(cls);
        if (bVar == null) {
            b n10 = n();
            n10.A();
            bVar = new b(getApplicationContext(), n10, r(), cls);
            hashMap.put(cls, bVar);
        }
        this.S = bVar.f5201b;
        bVar.g(this);
    }

    public void onDestroy() {
        this.W = true;
        f5199o0.get(getClass()).h(this, true ^ this.S.p());
        c cVar = this.O;
        if (cVar != null) {
            cVar.e();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r7, int r8, int r9) {
        /*
            r6 = this;
            r6.T = r9
            r8 = 0
            r6.V = r8
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.RESTART"
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x002d
            java.lang.String r0 = r7.getAction()
            boolean r2 = r6.U
            java.lang.String r3 = "foreground"
            boolean r3 = r7.getBooleanExtra(r3, r8)
            if (r3 != 0) goto L_0x0022
            boolean r3 = r9.equals(r0)
            if (r3 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r3 = r8
            goto L_0x0023
        L_0x0022:
            r3 = r1
        L_0x0023:
            r2 = r2 | r3
            r6.U = r2
            java.lang.String r2 = "content_id"
            java.lang.String r2 = r7.getStringExtra(r2)
            goto L_0x002e
        L_0x002d:
            r2 = r0
        L_0x002e:
            java.lang.String r3 = "com.google.android.exoplayer.downloadService.action.INIT"
            if (r0 != 0) goto L_0x0033
            r0 = r3
        L_0x0033:
            r4 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -1931239035: goto L_0x0094;
                case -932047176: goto L_0x0089;
                case -871181424: goto L_0x0080;
                case -650547439: goto L_0x0075;
                case -119057172: goto L_0x006a;
                case 191112771: goto L_0x005f;
                case 671523141: goto L_0x0054;
                case 1015676687: goto L_0x004b;
                case 1547520644: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x009e
        L_0x003d:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0047
            goto L_0x009e
        L_0x0047:
            r4 = 8
            goto L_0x009e
        L_0x004b:
            boolean r9 = r0.equals(r3)
            if (r9 != 0) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            r4 = 7
            goto L_0x009e
        L_0x0054:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x005d
            goto L_0x009e
        L_0x005d:
            r4 = 6
            goto L_0x009e
        L_0x005f:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0068
            goto L_0x009e
        L_0x0068:
            r4 = 5
            goto L_0x009e
        L_0x006a:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0073
            goto L_0x009e
        L_0x0073:
            r4 = 4
            goto L_0x009e
        L_0x0075:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x007e
            goto L_0x009e
        L_0x007e:
            r4 = 3
            goto L_0x009e
        L_0x0080:
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0087
            goto L_0x009e
        L_0x0087:
            r4 = 2
            goto L_0x009e
        L_0x0089:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x0092
            goto L_0x009e
        L_0x0092:
            r4 = r1
            goto L_0x009e
        L_0x0094:
            java.lang.String r9 = "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD"
            boolean r9 = r0.equals(r9)
            if (r9 != 0) goto L_0x009d
            goto L_0x009e
        L_0x009d:
            r4 = r8
        L_0x009e:
            java.lang.String r9 = "stop_reason"
            java.lang.String r3 = "DownloadService"
            switch(r4) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00f7;
                case 2: goto L_0x0113;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00de;
                case 5: goto L_0x00d8;
                case 6: goto L_0x00c5;
                case 7: goto L_0x0113;
                case 8: goto L_0x00ba;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Ignored unrecognized action: "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
        L_0x00b6:
            w7.p.d(r3, r7)
            goto L_0x0113
        L_0x00ba:
            if (r2 != 0) goto L_0x00bf
            java.lang.String r7 = "Ignored REMOVE_DOWNLOAD: Missing content_id extra"
            goto L_0x00b6
        L_0x00bf:
            com.google.android.exoplayer2.offline.b r7 = r6.S
            r7.y(r2)
            goto L_0x0113
        L_0x00c5:
            boolean r0 = r7.hasExtra(r9)
            if (r0 != 0) goto L_0x00ce
            java.lang.String r7 = "Ignored SET_STOP_REASON: Missing stop_reason extra"
            goto L_0x00b6
        L_0x00ce:
            int r7 = r7.getIntExtra(r9, r8)
            com.google.android.exoplayer2.offline.b r8 = r6.S
            r8.E(r2, r7)
            goto L_0x0113
        L_0x00d8:
            com.google.android.exoplayer2.offline.b r7 = r6.S
            r7.v()
            goto L_0x0113
        L_0x00de:
            java.lang.String r8 = "requirements"
            android.os.Parcelable r7 = r7.getParcelableExtra(r8)
            com.google.android.exoplayer2.scheduler.Requirements r7 = (com.google.android.exoplayer2.scheduler.Requirements) r7
            if (r7 != 0) goto L_0x00eb
            java.lang.String r7 = "Ignored SET_REQUIREMENTS: Missing requirements extra"
            goto L_0x00b6
        L_0x00eb:
            com.google.android.exoplayer2.offline.b r8 = r6.S
            r8.D(r7)
            goto L_0x0113
        L_0x00f1:
            com.google.android.exoplayer2.offline.b r7 = r6.S
            r7.x()
            goto L_0x0113
        L_0x00f7:
            com.google.android.exoplayer2.offline.b r7 = r6.S
            r7.A()
            goto L_0x0113
        L_0x00fd:
            java.lang.String r0 = "download_request"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            com.google.android.exoplayer2.offline.DownloadRequest r0 = (com.google.android.exoplayer2.offline.DownloadRequest) r0
            if (r0 != 0) goto L_0x010a
            java.lang.String r7 = "Ignored ADD_DOWNLOAD: Missing download_request extra"
            goto L_0x00b6
        L_0x010a:
            int r7 = r7.getIntExtra(r9, r8)
            com.google.android.exoplayer2.offline.b r8 = r6.S
            r8.d(r0, r7)
        L_0x0113:
            com.google.android.exoplayer2.offline.b r7 = r6.S
            boolean r7 = r7.n()
            if (r7 == 0) goto L_0x011e
            r6.I()
        L_0x011e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.DownloadService.onStartCommand(android.content.Intent, int, int):int");
    }

    public void onTaskRemoved(Intent intent) {
        this.V = true;
    }

    @o0
    public abstract a7.c r();

    public final void s() {
        c cVar = this.O;
        if (cVar != null && !this.W) {
            cVar.b();
        }
    }

    public final void t(d dVar) {
        v(dVar);
        c cVar = this.O;
        if (cVar != null) {
            int i10 = dVar.f15945b;
            if (i10 == 2 || i10 == 5 || i10 == 7) {
                cVar.d();
            } else {
                cVar.b();
            }
        }
    }

    public final void u(d dVar) {
        w(dVar);
        c cVar = this.O;
        if (cVar != null) {
            cVar.b();
        }
    }

    public void v(d dVar) {
    }

    public void w(d dVar) {
    }
}
