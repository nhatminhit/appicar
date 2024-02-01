package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.a0;
import j8.q;
import j8.s;
import j8.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "SleepClassifyEventCreator")
public class SleepClassifyEvent extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<SleepClassifyEvent> CREATOR = new a0();
    @SafeParcelable.c(getter = "getTimestampSec", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getConfidence", id = 2)
    public final int P;
    @SafeParcelable.c(getter = "getMotion", id = 3)
    public final int Q;
    @SafeParcelable.c(getter = "getLight", id = 4)
    public final int R;
    @SafeParcelable.c(getter = "getNoise", id = 5)
    public final int S;
    @SafeParcelable.c(getter = "getLightDiff", id = 6)
    public final int T;
    @SafeParcelable.c(getter = "getNightOrDay", id = 7)
    public final int U;
    @SafeParcelable.c(getter = "getConfidenceOverwrittenByAlarmClockTrigger", id = 8)
    public final boolean V;
    @SafeParcelable.c(getter = "getPresenceConfidence", id = 9)
    public final int W;

    @SafeParcelable.b
    @w
    public SleepClassifyEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) int i13, @SafeParcelable.e(id = 5) int i14, @SafeParcelable.e(id = 6) int i15, @SafeParcelable.e(id = 7) int i16, @SafeParcelable.e(id = 8) boolean z10, @SafeParcelable.e(id = 9) int i17) {
        this.O = i10;
        this.P = i11;
        this.Q = i12;
        this.R = i13;
        this.S = i14;
        this.T = i15;
        this.U = i16;
        this.V = z10;
        this.W = i17;
    }

    @m0
    public static List<SleepClassifyEvent> X0(@m0 Intent intent) {
        s.l(intent);
        if (!m1(intent)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
        if (arrayList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte[] bArr = (byte[]) arrayList.get(i10);
            s.l(bArr);
            arrayList2.add((SleepClassifyEvent) c.a(bArr, CREATOR));
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean m1(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_SLEEP_CLASSIFY_RESULT");
    }

    public int Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepClassifyEvent)) {
            return false;
        }
        SleepClassifyEvent sleepClassifyEvent = (SleepClassifyEvent) obj;
        return this.O == sleepClassifyEvent.O && this.P == sleepClassifyEvent.P;
    }

    public int f1() {
        return this.R;
    }

    public int g1() {
        return this.Q;
    }

    public long h1() {
        return ((long) this.O) * 1000;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P));
    }

    @m0
    public String toString() {
        int i10 = this.O;
        int i11 = this.P;
        int i12 = this.Q;
        int i13 = this.R;
        return i10 + " Conf:" + i11 + " Motion:" + i12 + " Light:" + i13;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, Z0());
        b.F(parcel, 3, g1());
        b.F(parcel, 4, f1());
        b.F(parcel, 5, this.S);
        b.F(parcel, 6, this.T);
        b.F(parcel, 7, this.U);
        b.g(parcel, 8, this.V);
        b.F(parcel, 9, this.W);
        b.b(parcel, a10);
    }
}
