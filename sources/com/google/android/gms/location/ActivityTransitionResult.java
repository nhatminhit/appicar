package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.l0;
import j8.s;
import j8.w;
import java.util.Collections;
import java.util.List;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "ActivityTransitionResultCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new l0();
    @SafeParcelable.c(getter = "getTransitionEvents", id = 1)
    public final List O;
    @o0
    @SafeParcelable.c(getter = "getExtras", id = 2)
    public Bundle P;

    public ActivityTransitionResult(@SafeParcelable.e(id = 1) @m0 List<ActivityTransitionEvent> list) {
        this.P = null;
        s.m(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i10 = 1; i10 < list.size(); i10++) {
                s.a(list.get(i10).Z0() >= list.get(i10 + -1).Z0());
            }
        }
        this.O = Collections.unmodifiableList(list);
    }

    @SafeParcelable.b
    @w
    public ActivityTransitionResult(@SafeParcelable.e(id = 1) @m0 List list, @SafeParcelable.e(id = 2) @o0 Bundle bundle) {
        this(list);
        this.P = bundle;
    }

    @o0
    public static ActivityTransitionResult X0(@m0 Intent intent) {
        if (!f1(intent)) {
            return null;
        }
        return (ActivityTransitionResult) c.b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    public static boolean f1(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    @m0
    public List<ActivityTransitionEvent> Z0() {
        return this.O;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.O.equals(((ActivityTransitionResult) obj).O);
    }

    public int hashCode() {
        return this.O.hashCode();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.d0(parcel, 1, Z0(), false);
        b.k(parcel, 2, this.P, false);
        b.b(parcel, a10);
    }
}
