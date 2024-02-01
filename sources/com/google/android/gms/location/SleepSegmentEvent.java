package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.b0;
import j8.q;
import j8.s;
import j8.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "SleepSegmentEventCreator")
@SafeParcelable.g({1000})
public class SleepSegmentEvent extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new b0();
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    @SafeParcelable.c(getter = "getStartTimeMillis", id = 1)
    public final long O;
    @SafeParcelable.c(getter = "getEndTimeMillis", id = 2)
    public final long P;
    @SafeParcelable.c(getter = "getStatus", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getMissingDataDurationMinutes", id = 4)
    public final int R;
    @SafeParcelable.c(getter = "getNinetiethPctConfidence", id = 5)
    public final int S;

    @SafeParcelable.b
    @w
    public SleepSegmentEvent(@SafeParcelable.e(id = 1) long j10, @SafeParcelable.e(id = 2) long j11, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12) {
        s.b(j10 <= j11, "endTimeMillis must be greater than or equal to startTimeMillis");
        this.O = j10;
        this.P = j11;
        this.Q = i10;
        this.R = i11;
        this.S = i12;
    }

    @m0
    public static List<SleepSegmentEvent> X0(@m0 Intent intent) {
        s.l(intent);
        if (!m1(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte[] bArr = (byte[]) arrayList.get(i10);
            s.l(bArr);
            arrayList2.add((SleepSegmentEvent) c.a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean m1(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_SEGMENT_RESULT");
    }

    public long Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            return this.O == sleepSegmentEvent.g1() && this.P == sleepSegmentEvent.Z0() && this.Q == sleepSegmentEvent.h1() && this.R == sleepSegmentEvent.R && this.S == sleepSegmentEvent.S;
        }
    }

    public long f1() {
        return this.P - this.O;
    }

    public long g1() {
        return this.O;
    }

    public int h1() {
        return this.Q;
    }

    public int hashCode() {
        return q.c(Long.valueOf(this.O), Long.valueOf(this.P), Integer.valueOf(this.Q));
    }

    @m0
    public String toString() {
        long j10 = this.O;
        long j11 = this.P;
        int i10 = this.Q;
        return "startMillis=" + j10 + ", endMillis=" + j11 + ", status=" + i10;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.K(parcel, 1, g1());
        b.K(parcel, 2, Z0());
        b.F(parcel, 3, h1());
        b.F(parcel, 4, this.R);
        b.F(parcel, 5, this.S);
        b.b(parcel, a10);
    }
}
