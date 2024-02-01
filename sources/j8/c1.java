package j8;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import d.g;
import d.o0;

public abstract class c1 extends o1 {

    /* renamed from: d  reason: collision with root package name */
    public final int f9699d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f9700e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f9701f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @g
    public c1(d dVar, @o0 int i10, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        this.f9701f = dVar;
        this.f9699d = i10;
        this.f9700e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f9699d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001b
            j8.d r3 = r2.f9701f
            r3.q0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.f(r3)
        L_0x001b:
            return
        L_0x001c:
            j8.d r3 = r2.f9701f
            r3.q0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f9700e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f9699d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.c1.a(java.lang.Object):void");
    }

    public final void b() {
    }

    public abstract void f(ConnectionResult connectionResult);

    public abstract boolean g();
}
