package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.o0;
import d9.e0;
import j8.q;
import j8.s;
import j8.w;
import l8.b;

@SafeParcelable.a(creator = "UserPreferredSleepWindowCreator")
@w
@SafeParcelable.g({1000})
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new e0();
    @SafeParcelable.c(getter = "getStartHour", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getStartMinute", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getEndHour", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getEndMinute", id = 4)
    public final int R;

    @SafeParcelable.b
    public zzaj(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) int i13) {
        boolean z10 = true;
        s.s(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        s.s(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        s.s(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        s.s(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        s.s(((i10 + i11) + i12) + i13 <= 0 ? false : z10, "Parameters can't be all 0.");
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = i13;
    }

    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzaj = (zzaj) obj;
        return this.O == zzaj.O && this.P == zzaj.P && this.Q == zzaj.Q && this.R == zzaj.R;
    }

    public final int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P), Integer.valueOf(this.Q), Integer.valueOf(this.R));
    }

    public final String toString() {
        int i10 = this.O;
        int i11 = this.P;
        int i12 = this.Q;
        int i13 = this.R;
        return "UserPreferredSleepWindow [startHour=" + i10 + ", startMinute=" + i11 + ", endHour=" + i12 + ", endMinute=" + i13 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, this.P);
        b.F(parcel, 3, this.Q);
        b.F(parcel, 4, this.R);
        b.b(parcel, a10);
    }
}
