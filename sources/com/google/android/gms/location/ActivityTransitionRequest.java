package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.j0;
import d9.k0;
import j8.q;
import j8.s;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.g({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new k0();
    @m0
    public static final Comparator<ActivityTransition> S = new j0();
    @SafeParcelable.c(getter = "getActivityTransitions", id = 1)
    public final List O;
    @o0
    @SafeParcelable.c(getter = "getTag", id = 2)
    public final String P;
    @SafeParcelable.c(getter = "getClients", id = 3)
    public final List Q;
    @o0
    @SafeParcelable.c(defaultValueUnchecked = "null", getter = "getContextAttributionTag", id = 4)
    public String R;

    public ActivityTransitionRequest(@m0 List<ActivityTransition> list) {
        this(list, (String) null, (List) null, (String) null);
    }

    @SafeParcelable.b
    public ActivityTransitionRequest(@SafeParcelable.e(id = 1) @m0 List list, @SafeParcelable.e(id = 2) @o0 String str, @SafeParcelable.e(id = 3) @o0 List list2, @SafeParcelable.e(id = 4) @o0 String str2) {
        s.m(list, "transitions can't be null");
        s.b(list.size() > 0, "transitions can't be empty.");
        s.l(list);
        TreeSet treeSet = new TreeSet(S);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            s.b(treeSet.add(activityTransition), String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.O = Collections.unmodifiableList(list);
        this.P = str;
        this.Q = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.R = str2;
    }

    public void X0(@m0 Intent intent) {
        s.l(intent);
        c.n(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @m0
    public final ActivityTransitionRequest Z0(@o0 String str) {
        this.R = str;
        return this;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return q.b(this.O, activityTransitionRequest.O) && q.b(this.P, activityTransitionRequest.P) && q.b(this.R, activityTransitionRequest.R) && q.b(this.Q, activityTransitionRequest.Q);
        }
    }

    public int hashCode() {
        int hashCode = this.O.hashCode() * 31;
        String str = this.P;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.Q;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.R;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode3 + i10;
    }

    @m0
    public String toString() {
        String valueOf = String.valueOf(this.O);
        String str = this.P;
        String valueOf2 = String.valueOf(this.Q);
        String str2 = this.R;
        return "ActivityTransitionRequest [mTransitions=" + valueOf + ", mTag='" + str + "', mClients=" + valueOf2 + ", mAttributionTag=" + str2 + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = b.a(parcel);
        b.d0(parcel, 1, this.O, false);
        b.Y(parcel, 2, this.P, false);
        b.d0(parcel, 3, this.Q, false);
        b.Y(parcel, 4, this.R, false);
        b.b(parcel, a10);
    }
}
