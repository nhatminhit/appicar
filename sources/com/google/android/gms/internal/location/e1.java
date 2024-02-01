package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import f8.a;
import f8.k;
import f8.u;

public abstract class e1 extends b.a {
    public e1(k kVar) {
        super((a<?>) r0.f5913n, kVar);
    }

    @e8.a
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        super.o((u) obj);
    }

    public final /* synthetic */ u k(Status status) {
        return new LocationSettingsResult(status, (LocationSettingsStates) null);
    }
}
