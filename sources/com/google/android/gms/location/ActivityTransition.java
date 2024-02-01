package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.h0;
import j8.q;
import j8.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SafeParcelable.a(creator = "ActivityTransitionCreator")
@SafeParcelable.g({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new h0();
    public static final int Q = 0;
    public static final int R = 1;
    @SafeParcelable.c(getter = "getActivityType", id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getTransitionType", id = 2)
    public final int P;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5934a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f5935b = -1;

        @m0
        public ActivityTransition a() {
            boolean z10 = true;
            s.s(this.f5934a != -1, "Activity type not set.");
            if (this.f5935b == -1) {
                z10 = false;
            }
            s.s(z10, "Activity transition type not set.");
            return new ActivityTransition(this.f5934a, this.f5935b);
        }

        @m0
        public a b(int i10) {
            ActivityTransition.f1(i10);
            this.f5935b = i10;
            return this;
        }

        @m0
        public a c(int i10) {
            this.f5934a = i10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @SafeParcelable.b
    public ActivityTransition(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11) {
        this.O = i10;
        this.P = i11;
    }

    public static void f1(int i10) {
        boolean z10 = true;
        if (i10 < 0 || i10 > 1) {
            z10 = false;
        }
        s.b(z10, "Transition type " + i10 + " is not valid.");
    }

    public int X0() {
        return this.O;
    }

    public int Z0() {
        return this.P;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.O == activityTransition.O && this.P == activityTransition.P;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P));
    }

    @m0
    public String toString() {
        int i10 = this.O;
        int i11 = this.P;
        return "ActivityTransition [mActivityType=" + i10 + ", mTransitionType=" + i11 + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        s.l(parcel);
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, X0());
        l8.b.F(parcel, 2, Z0());
        l8.b.b(parcel, a10);
    }
}
