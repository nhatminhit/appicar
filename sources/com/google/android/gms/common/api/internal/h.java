package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.f;
import d.m0;
import d.o0;
import e8.a;
import f8.a;
import f8.a.b;
import h9.n;

@a
public abstract class h<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    public final f f5668a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final Feature[] f5669b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5670c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5671d;

    @e8.a
    public h(@m0 f<L> fVar) {
        this(fVar, (Feature[]) null, false, 0);
    }

    @e8.a
    public h(@m0 f<L> fVar, @m0 Feature[] featureArr, boolean z10) {
        this(fVar, featureArr, z10, 0);
    }

    @e8.a
    public h(@m0 f<L> fVar, @o0 Feature[] featureArr, boolean z10, int i10) {
        this.f5668a = fVar;
        this.f5669b = featureArr;
        this.f5670c = z10;
        this.f5671d = i10;
    }

    @e8.a
    public void a() {
        this.f5668a.a();
    }

    @e8.a
    @o0
    public f.a<L> b() {
        return this.f5668a.b();
    }

    @e8.a
    @o0
    public Feature[] c() {
        return this.f5669b;
    }

    @e8.a
    public abstract void d(@m0 A a10, @m0 n<Void> nVar) throws RemoteException;

    public final int e() {
        return this.f5671d;
    }

    public final boolean f() {
        return this.f5670c;
    }
}
