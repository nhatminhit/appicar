package x7;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import b6.c;
import d.o0;
import w7.q0;

public final class f {

    /* renamed from: m  reason: collision with root package name */
    public static final long f15183m = 500;

    /* renamed from: n  reason: collision with root package name */
    public static final long f15184n = 20000000;

    /* renamed from: o  reason: collision with root package name */
    public static final long f15185o = 80;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15186p = 6;

    /* renamed from: a  reason: collision with root package name */
    public final WindowManager f15187a;

    /* renamed from: b  reason: collision with root package name */
    public final b f15188b;

    /* renamed from: c  reason: collision with root package name */
    public final a f15189c;

    /* renamed from: d  reason: collision with root package name */
    public long f15190d;

    /* renamed from: e  reason: collision with root package name */
    public long f15191e;

    /* renamed from: f  reason: collision with root package name */
    public long f15192f;

    /* renamed from: g  reason: collision with root package name */
    public long f15193g;

    /* renamed from: h  reason: collision with root package name */
    public long f15194h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15195i;

    /* renamed from: j  reason: collision with root package name */
    public long f15196j;

    /* renamed from: k  reason: collision with root package name */
    public long f15197k;

    /* renamed from: l  reason: collision with root package name */
    public long f15198l;

    @TargetApi(17)
    public final class a implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayManager f15199a;

        public a(DisplayManager displayManager) {
            this.f15199a = displayManager;
        }

        public void a() {
            this.f15199a.registerDisplayListener(this, (Handler) null);
        }

        public void b() {
            this.f15199a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                f.this.h();
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    public static final class b implements Choreographer.FrameCallback, Handler.Callback {
        public static final int T = 0;
        public static final int U = 1;
        public static final int V = 2;
        public static final b W = new b();
        public volatile long O = c.f4201b;
        public final Handler P;
        public final HandlerThread Q;
        public Choreographer R;
        public int S;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.Q = handlerThread;
            handlerThread.start();
            Handler z10 = q0.z(handlerThread.getLooper(), this);
            this.P = z10;
            z10.sendEmptyMessage(0);
        }

        public static b d() {
            return W;
        }

        public void a() {
            this.P.sendEmptyMessage(1);
        }

        public final void b() {
            int i10 = this.S + 1;
            this.S = i10;
            if (i10 == 1) {
                this.R.postFrameCallback(this);
            }
        }

        public final void c() {
            this.R = Choreographer.getInstance();
        }

        public void doFrame(long j10) {
            this.O = j10;
            this.R.postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.P.sendEmptyMessage(2);
        }

        public final void f() {
            int i10 = this.S - 1;
            this.S = i10;
            if (i10 == 0) {
                this.R.removeFrameCallback(this);
                this.O = c.f4201b;
            }
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            } else if (i10 == 1) {
                b();
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public f() {
        this((Context) null);
    }

    public f(@o0 Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f15187a = (WindowManager) context.getSystemService("window");
        } else {
            this.f15187a = null;
        }
        if (this.f15187a != null) {
            this.f15189c = q0.f14786a >= 17 ? g(context) : aVar;
            this.f15188b = b.d();
        } else {
            this.f15189c = null;
            this.f15188b = null;
        }
        this.f15190d = c.f4201b;
        this.f15191e = c.f4201b;
    }

    public static long c(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            long j15 = j14;
            j14 = j12 + j14;
            j13 = j15;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (f(r0, r13) != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f15195i
            if (r2 == 0) goto L_0x0040
            long r2 = r10.f15192f
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = r10.f15198l
            r4 = 1
            long r2 = r2 + r4
            r10.f15198l = r2
            long r2 = r10.f15194h
            r10.f15193g = r2
        L_0x0018:
            long r2 = r10.f15198l
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L_0x0039
            long r6 = r10.f15197k
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r10.f15193g
            long r2 = r2 + r6
            boolean r4 = r10.f(r2, r13)
            if (r4 == 0) goto L_0x0032
        L_0x002f:
            r10.f15195i = r5
            goto L_0x0040
        L_0x0032:
            long r4 = r10.f15196j
            long r4 = r4 + r2
            long r6 = r10.f15197k
            long r4 = r4 - r6
            goto L_0x0042
        L_0x0039:
            boolean r2 = r10.f(r0, r13)
            if (r2 == 0) goto L_0x0040
            goto L_0x002f
        L_0x0040:
            r4 = r13
            r2 = r0
        L_0x0042:
            boolean r6 = r10.f15195i
            if (r6 != 0) goto L_0x0051
            r10.f15197k = r0
            r10.f15196j = r13
            r13 = 0
            r10.f15198l = r13
            r13 = 1
            r10.f15195i = r13
        L_0x0051:
            r10.f15192f = r11
            r10.f15194h = r2
            x7.f$b r11 = r10.f15188b
            if (r11 == 0) goto L_0x0076
            long r12 = r10.f15190d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0065
            goto L_0x0076
        L_0x0065:
            long r6 = r11.O
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006c
            return r4
        L_0x006c:
            long r8 = r10.f15190d
            long r11 = c(r4, r6, r8)
            long r13 = r10.f15191e
            long r11 = r11 - r13
            return r11
        L_0x0076:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.f.b(long, long):long");
    }

    public void d() {
        if (this.f15187a != null) {
            a aVar = this.f15189c;
            if (aVar != null) {
                aVar.b();
            }
            this.f15188b.e();
        }
    }

    public void e() {
        this.f15195i = false;
        if (this.f15187a != null) {
            this.f15188b.a();
            a aVar = this.f15189c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public final boolean f(long j10, long j11) {
        return Math.abs((j11 - this.f15196j) - (j10 - this.f15197k)) > f15184n;
    }

    @TargetApi(17)
    public final a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    public final void h() {
        Display defaultDisplay = this.f15187a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f15190d = refreshRate;
            this.f15191e = (refreshRate * 80) / 100;
        }
    }
}
