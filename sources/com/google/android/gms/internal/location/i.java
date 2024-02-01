package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import h9.f;
import h9.m;

public final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.C0094b f5873a;

    public /* synthetic */ i(b.C0094b bVar) {
        this.f5873a = bVar;
    }

    public final void a(m mVar) {
        b.C0094b bVar = this.f5873a;
        if (mVar.v()) {
            bVar.b(Status.U);
        } else if (mVar.t()) {
            bVar.a(Status.Y);
        } else {
            Exception q10 = mVar.q();
            if (q10 instanceof f8.b) {
                bVar.a(((f8.b) q10).a());
            } else {
                bVar.a(Status.W);
            }
        }
    }
}
