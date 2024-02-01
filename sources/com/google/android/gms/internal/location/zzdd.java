package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import d.o0;
import j8.q;
import java.util.Iterator;
import java.util.List;
import l8.b;
import w8.e0;

@SafeParcelable.a(creator = "LocationRequestInternalCreator")
@Deprecated
@SafeParcelable.g({2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000})
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new f2();
    @SafeParcelable.c(defaultValueUnchecked = "null", id = 1)
    public LocationRequest O;

    @SafeParcelable.b
    public zzdd(@SafeParcelable.e(id = 1) LocationRequest locationRequest, @o0 @SafeParcelable.f(defaultValueUnchecked = "null", id = 5) List list, @SafeParcelable.f(defaultValue = "false", id = 8) boolean z10, @SafeParcelable.f(defaultValue = "false", id = 9) boolean z11, @o0 @SafeParcelable.f(defaultValueUnchecked = "null", id = 10) String str, @SafeParcelable.f(defaultValue = "false", id = 11) boolean z12, @SafeParcelable.f(defaultValue = "false", id = 12) boolean z13, @o0 @SafeParcelable.f(defaultValueUnchecked = "null", id = 13) String str2, @SafeParcelable.f(defaultValueUnchecked = "Long.MAX_VALUE", id = 14) long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    e0.a(workSource, clientIdentity.O, clientIdentity.P);
                }
            }
            aVar.o(workSource);
        }
        if (z10) {
            aVar.c(1);
        }
        if (z11) {
            aVar.n(2);
        }
        if (str != null) {
            aVar.m(str);
        } else if (str2 != null) {
            aVar.m(str2);
        }
        if (z12) {
            aVar.l(true);
        }
        if (z13) {
            aVar.k(true);
        }
        if (j10 != Long.MAX_VALUE) {
            aVar.e(j10);
        }
        this.O = aVar.a();
    }

    @Deprecated
    public static zzdd X0(@o0 String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, (List) null, false, false, (String) null, false, false, (String) null, Long.MAX_VALUE);
    }

    public final boolean equals(@o0 Object obj) {
        if (obj instanceof zzdd) {
            return q.b(this.O, ((zzdd) obj).O);
        }
        return false;
    }

    public final int hashCode() {
        return this.O.hashCode();
    }

    public final String toString() {
        return this.O.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.S(parcel, 1, this.O, i10, false);
        b.b(parcel, a10);
    }
}
