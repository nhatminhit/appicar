package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import d.m0;
import d.o0;
import e8.a;
import f8.h;
import f8.j0;
import f8.u;
import j8.q;
import j8.s;
import j8.w;
import l8.b;
import w8.d0;

@SafeParcelable.a(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements u, ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<Status> CREATOR = new j0();
    @a
    @m0
    @w
    @d0
    public static final Status T = new Status(-1);
    @a
    @m0
    @w
    @d0
    public static final Status U = new Status(0);
    @a
    @w
    @m0
    public static final Status V = new Status(14);
    @a
    @w
    @m0
    public static final Status W = new Status(8);
    @a
    @w
    @m0
    public static final Status X = new Status(15);
    @a
    @w
    @m0
    public static final Status Y = new Status(16);
    @a
    @m0
    public static final Status Z = new Status(18);
    @w
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public static final Status f5629a0 = new Status(17);
    @SafeParcelable.h(id = 1000)
    public final int O;
    @SafeParcelable.c(getter = "getStatusCode", id = 1)
    public final int P;
    @o0
    @SafeParcelable.c(getter = "getStatusMessage", id = 2)
    public final String Q;
    @o0
    @SafeParcelable.c(getter = "getPendingIntent", id = 3)
    public final PendingIntent R;
    @o0
    @SafeParcelable.c(getter = "getConnectionResult", id = 4)
    public final ConnectionResult S;

    public Status(int i10) {
        this(i10, (String) null);
    }

    @SafeParcelable.b
    public Status(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) int i11, @SafeParcelable.e(id = 2) @o0 String str, @SafeParcelable.e(id = 3) @o0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @o0 ConnectionResult connectionResult) {
        this.O = i10;
        this.P = i11;
        this.Q = str;
        this.R = pendingIntent;
        this.S = connectionResult;
    }

    public Status(int i10, @o0 String str) {
        this(1, i10, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i10, @o0 String str, @o0 PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@m0 ConnectionResult connectionResult, @m0 String str) {
        this(connectionResult, str, 17);
    }

    @a
    @Deprecated
    public Status(@m0 ConnectionResult connectionResult, @m0 String str, int i10) {
        this(1, i10, str, connectionResult.f1(), connectionResult);
    }

    public void A1(@m0 Activity activity, int i10) throws IntentSender.SendIntentException {
        if (h1()) {
            PendingIntent pendingIntent = this.R;
            s.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0);
        }
    }

    @m0
    public final String F1() {
        String str = this.Q;
        return str != null ? str : h.a(this.P);
    }

    @o0
    public ConnectionResult X0() {
        return this.S;
    }

    @o0
    public PendingIntent Z0() {
        return this.R;
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.O == status.O && this.P == status.P && q.b(this.Q, status.Q) && q.b(this.R, status.R) && q.b(this.S, status.S);
    }

    public int f1() {
        return this.P;
    }

    @CanIgnoreReturnValue
    @m0
    public Status g() {
        return this;
    }

    @o0
    public String g1() {
        return this.Q;
    }

    @d0
    public boolean h1() {
        return this.R != null;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.O), Integer.valueOf(this.P), this.Q, this.R, this.S);
    }

    public boolean m1() {
        return this.P == 16;
    }

    public boolean p1() {
        return this.P == 14;
    }

    @CheckReturnValue
    public boolean r1() {
        return this.P <= 0;
    }

    @m0
    public String toString() {
        q.a d10 = q.d(this);
        d10.a("statusCode", F1());
        d10.a("resolution", this.R);
        return d10.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, f1());
        b.Y(parcel, 2, g1(), false);
        b.S(parcel, 3, this.R, i10, false);
        b.S(parcel, 4, X0(), i10, false);
        b.F(parcel, 1000, this.O);
        b.b(parcel, a10);
    }
}
