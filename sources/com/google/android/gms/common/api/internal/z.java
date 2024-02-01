package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.i;
import f8.a;
import h9.n;

public final class z extends k {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i.a f5739b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(i.a aVar, f.a aVar2) {
        super(aVar2);
        this.f5739b = aVar;
    }

    public final void b(a.b bVar, n<Boolean> nVar) throws RemoteException {
        this.f5739b.f5676b.accept(bVar, nVar);
    }
}
