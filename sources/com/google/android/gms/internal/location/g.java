package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import d.o0;
import g8.r;
import h9.n;
import j8.s;

public final class g implements b.C0094b {

    /* renamed from: a  reason: collision with root package name */
    public final n f5865a;

    public g(n nVar) {
        s.l(nVar);
        this.f5865a = nVar;
    }

    public final void a(@o0 Status status) {
        if (status != null) {
            this.f5865a.b(new f8.b(status));
        }
    }

    public final /* synthetic */ void b(Object obj) {
        r.b((Status) obj, null, this.f5865a);
    }
}
