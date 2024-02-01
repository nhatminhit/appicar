package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.i0;
import j8.q;
import j8.s;
import l8.b;

@SafeParcelable.a(creator = "ActivityTransitionEventCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new i0();
    @SafeParcelable.c(getter = "getActivityType", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getTransitionType", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getElapsedRealTimeNanos", id = 3)
    public final long Q;

    @SafeParcelable.b
    public ActivityTransitionEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) long j10) {
        ActivityTransition.f1(i11);
        this.O = i10;
        this.P = i11;
        this.Q = j10;
    }

    public int X0() {
        return this.O;
    }

    public long Z0() {
        return this.Q;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.O == activityTransitionEvent.O && this.P == activityTransitionEvent.P && this.Q == activityTransitionEvent.Q;
    }

    public int f1() {
        return this.P;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P), Long.valueOf(this.Q));
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.O;
        sb2.append("ActivityType " + i10);
        sb2.append(" ");
        int i11 = this.P;
        sb2.append("TransitionType " + i11);
        sb2.append(" ");
        long j10 = this.Q;
        sb2.append("ElapsedRealTimeNanos " + j10);
        return sb2.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.F(parcel, 1, X0());
        b.F(parcel, 2, f1());
        b.K(parcel, 3, Z0());
        b.b(parcel, a10);
    }
}
