package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.f;
import d.m0;
import e8.a;
import f8.a;
import f8.a.b;
import h9.n;

@a
public abstract class k<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    public final f.a f5682a;

    @e8.a
    public k(@m0 f.a<L> aVar) {
        this.f5682a = aVar;
    }

    @e8.a
    @m0
    public f.a<L> a() {
        return this.f5682a;
    }

    @e8.a
    public abstract void b(@m0 A a10, @m0 n<Boolean> nVar) throws RemoteException;
}
