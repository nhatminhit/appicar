package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import h9.i;
import h9.n;

public final /* synthetic */ class k1 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d2 f5885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f.a f5886b;

    public /* synthetic */ k1(d2 d2Var, f.a aVar) {
        this.f5885a = d2Var;
        this.f5886b = aVar;
    }

    public final void b() {
        try {
            this.f5885a.v0(this.f5886b, true, new n());
        } catch (RemoteException unused) {
        }
    }
}
