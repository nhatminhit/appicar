package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.data.DataHolder;
import d.m0;
import e8.a;

@a
public abstract class c<L> implements f.b<L> {

    /* renamed from: a  reason: collision with root package name */
    public final DataHolder f5651a;

    @a
    public c(@m0 DataHolder dataHolder) {
        this.f5651a = dataHolder;
    }

    @a
    public final void a(@m0 L l10) {
        c(l10, this.f5651a);
    }

    @a
    public void b() {
        DataHolder dataHolder = this.f5651a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @a
    public abstract void c(@m0 L l10, @m0 DataHolder dataHolder);
}
