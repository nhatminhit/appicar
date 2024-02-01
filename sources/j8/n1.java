package j8;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.common.t;

public final class n1 extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f9781a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n1(d dVar, Looper looper) {
        super(looper);
        this.f9781a = dVar;
    }

    public static final void a(Message message) {
        o1 o1Var = (o1) message.obj;
        o1Var.b();
        o1Var.e();
    }

    public static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            j8.d r0 = r7.f9781a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f9725q0
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            j8.d r0 = r7.f9781a
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            j8.d r0 = r7.f9781a
            boolean r0 = r0.k()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            j8.d r0 = r7.f9781a
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f9722n0 = r1
            j8.d r8 = r7.f9781a
            boolean r8 = j8.d.p0(r8)
            if (r8 == 0) goto L_0x005f
            j8.d r8 = r7.f9781a
            boolean r0 = r8.f9723o0
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.q0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            j8.d r8 = r7.f9781a
            com.google.android.gms.common.ConnectionResult r0 = r8.f9722n0
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f9722n0
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            j8.d r0 = r7.f9781a
            j8.d$c r0 = r0.f9712d0
            r0.a(r8)
            j8.d r0 = r7.f9781a
            r0.U(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            j8.d r8 = r7.f9781a
            com.google.android.gms.common.ConnectionResult r0 = r8.f9722n0
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f9722n0
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            j8.d r0 = r7.f9781a
            j8.d$c r0 = r0.f9712d0
            r0.a(r8)
            j8.d r0 = r7.f9781a
            r0.U(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            j8.d r8 = r7.f9781a
            j8.d$c r8 = r8.f9712d0
            r8.a(r0)
            j8.d r8 = r7.f9781a
            r8.U(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            j8.d r0 = r7.f9781a
            r0.q0(r3, (android.os.IInterface) null)
            j8.d r0 = r7.f9781a
            j8.d$a r1 = r0.f9717i0
            if (r1 == 0) goto L_0x00d7
            j8.d$a r0 = r0.f9717i0
            int r1 = r8.arg2
            r0.D(r1)
        L_0x00d7:
            j8.d r0 = r7.f9781a
            int r8 = r8.arg2
            r0.V(r8)
            j8.d r8 = r7.f9781a
            j8.d.o0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            j8.d r0 = r7.f9781a
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            a(r8)
            return
        L_0x00f4:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            j8.o1 r8 = (j8.o1) r8
            r8.c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r0, r8)
            return
        L_0x0120:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.n1.handleMessage(android.os.Message):void");
    }
}
