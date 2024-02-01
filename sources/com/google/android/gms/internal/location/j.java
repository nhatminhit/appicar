package com.google.android.gms.internal.location;

import android.location.Location;
import h9.f;
import h9.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f5879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f5880b;

    public /* synthetic */ j(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f5879a = atomicReference;
        this.f5880b = countDownLatch;
    }

    public final void a(m mVar) {
        AtomicReference atomicReference = this.f5879a;
        CountDownLatch countDownLatch = this.f5880b;
        if (mVar.v()) {
            atomicReference.set((Location) mVar.r());
        }
        countDownLatch.countDown();
    }
}
