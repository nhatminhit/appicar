package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import d9.y;
import j8.q;
import j8.w;
import l8.b;

@SafeParcelable.a(creator = "NetworkLocationStatusCreator")
@w
@Deprecated
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new y();
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 1)
    public final int O;
    @SafeParcelable.c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", id = 2)
    public final int P;
    @SafeParcelable.c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 3)
    public final long Q;
    @SafeParcelable.c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", id = 4)
    public final long R;

    @SafeParcelable.b
    public zzac(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) long j10, @SafeParcelable.e(id = 4) long j11) {
        this.O = i10;
        this.P = i11;
        this.Q = j10;
        this.R = j11;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj instanceof zzac) {
            zzac zzac = (zzac) obj;
            return this.O == zzac.O && this.P == zzac.P && this.Q == zzac.Q && this.R == zzac.R;
        }
    }

    public final int hashCode() {
        return q.c(Integer.valueOf(this.P), Integer.valueOf(this.O), Long.valueOf(this.R), Long.valueOf(this.Q));
    }

    public final String toString() {
        int i10 = this.O;
        int i11 = this.P;
        long j10 = this.R;
        long j11 = this.Q;
        return "NetworkLocationStatus: Wifi status: " + i10 + " Cell status: " + i11 + " elapsed time NS: " + j10 + " system time ms: " + j11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.K(parcel, 3, this.Q);
        b.K(parcel, 4, this.R);
        b.b(parcel, a10);
    }
}
