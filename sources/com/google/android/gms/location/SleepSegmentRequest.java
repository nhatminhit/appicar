package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.c0;
import j8.q;
import j8.s;
import j8.w;
import java.util.List;
import l8.b;

@SafeParcelable.a(creator = "SleepSegmentRequestCreator")
@SafeParcelable.g({1000})
public class SleepSegmentRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new c0();
    public static final int Q = 0;
    public static final int R = 1;
    public static final int S = 2;
    @o0
    @SafeParcelable.c(getter = "getUserPreferredSleepWindow", id = 1)
    public final List O;
    @SafeParcelable.c(defaultValue = "0", getter = "getRequestedDataType", id = 2)
    public final int P;

    public SleepSegmentRequest(int i10) {
        this((List) null, i10);
    }

    @SafeParcelable.b
    @w
    public SleepSegmentRequest(@SafeParcelable.e(id = 1) @o0 List list, @SafeParcelable.e(id = 2) int i10) {
        this.O = list;
        this.P = i10;
    }

    @m0
    public static SleepSegmentRequest X0() {
        return new SleepSegmentRequest((List) null, 0);
    }

    public int Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return q.b(this.O, sleepSegmentRequest.O) && this.P == sleepSegmentRequest.P;
    }

    public int hashCode() {
        return q.c(this.O, Integer.valueOf(this.P));
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.d0(parcel, 1, this.O, false);
        b.F(parcel, 2, Z0());
        b.b(parcel, a10);
    }
}
