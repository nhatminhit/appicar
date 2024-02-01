package j8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import d.g;
import d.o0;

public final class r1 extends c1 {
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f9795g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f9796h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @g
    public r1(d dVar, @o0 int i10, @o0 IBinder iBinder, Bundle bundle) {
        super(dVar, i10, bundle);
        this.f9796h = dVar;
        this.f9795g = iBinder;
    }

    public final void f(ConnectionResult connectionResult) {
        if (this.f9796h.f9718j0 != null) {
            this.f9796h.f9718j0.H(connectionResult);
        }
        this.f9796h.U(connectionResult);
    }

    public final boolean g() {
        try {
            IBinder iBinder = this.f9795g;
            s.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f9796h.N().equals(interfaceDescriptor)) {
                String N = this.f9796h.N();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("service descriptor mismatch: ");
                sb2.append(N);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                return false;
            }
            IInterface A = this.f9796h.A(this.f9795g);
            if (A == null) {
                return false;
            }
            if (!d.o0(this.f9796h, 2, 4, A) && !d.o0(this.f9796h, 3, 4, A)) {
                return false;
            }
            this.f9796h.f9722n0 = null;
            Bundle F = this.f9796h.F();
            d dVar = this.f9796h;
            if (dVar.f9717i0 != null) {
                dVar.f9717i0.J(F);
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
