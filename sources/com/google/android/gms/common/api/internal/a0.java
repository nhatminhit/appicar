package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import d.m0;
import g8.k2;
import g8.v;
import j8.s;

public final class a0 extends k2 {

    /* renamed from: b  reason: collision with root package name */
    public final b.a f5647b;

    public a0(int i10, b.a aVar) {
        super(i10);
        this.f5647b = (b.a) s.m(aVar, "Null methods are not runnable.");
    }

    public final void a(@m0 Status status) {
        try {
            this.f5647b.a(status);
        } catch (IllegalStateException unused) {
        }
    }

    public final void b(@m0 Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f5647b.a(new Status(10, simpleName + ": " + localizedMessage));
        } catch (IllegalStateException unused) {
        }
    }

    public final void c(u uVar) throws DeadObjectException {
        try {
            this.f5647b.A(uVar.s());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    public final void d(@m0 v vVar, boolean z10) {
        vVar.c(this.f5647b, z10);
    }
}
