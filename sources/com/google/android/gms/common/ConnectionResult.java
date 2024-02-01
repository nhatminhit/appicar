package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d8.c0;
import e8.a;
import j8.q;
import j8.s;
import j8.w;
import l8.b;
import va.k;

@SafeParcelable.a(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new c0();
    @a
    public static final int S = -1;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;
    public static final int X = 4;
    public static final int Y = 5;
    public static final int Z = 6;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f5607a0 = 7;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f5608b0 = 8;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f5609c0 = 9;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f5610d0 = 10;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f5611e0 = 11;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f5612f0 = 13;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f5613g0 = 14;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f5614h0 = 15;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f5615i0 = 16;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f5616j0 = 17;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f5617k0 = 18;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f5618l0 = 19;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f5619m0 = 20;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f5620n0 = 22;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f5621o0 = 23;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f5622p0 = 24;
    @Deprecated

    /* renamed from: q0  reason: collision with root package name */
    public static final int f5623q0 = 1500;
    @a
    @w
    @m0

    /* renamed from: r0  reason: collision with root package name */
    public static final ConnectionResult f5624r0 = new ConnectionResult(0);
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getErrorCode", id = 2)
    public final int P;
    @o0
    @SafeParcelable.c(getter = "getResolution", id = 3)
    public final PendingIntent Q;
    @o0
    @SafeParcelable.c(getter = "getErrorMessage", id = 4)
    public final String R;

    public ConnectionResult(int i10) {
        this(i10, (PendingIntent) null, (String) null);
    }

    @SafeParcelable.b
    public ConnectionResult(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) @o0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @o0 String str) {
        this.O = i10;
        this.P = i11;
        this.Q = pendingIntent;
        this.R = str;
    }

    public ConnectionResult(int i10, @o0 PendingIntent pendingIntent) {
        this(i10, pendingIntent, (String) null);
    }

    public ConnectionResult(int i10, @o0 PendingIntent pendingIntent, @o0 String str) {
        this(1, i10, pendingIntent, str);
    }

    @m0
    public static String p1(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return k.a.f23566o;
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int X0() {
        return this.P;
    }

    @o0
    public String Z0() {
        return this.R;
    }

    public boolean equals(@o0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.P == connectionResult.P && q.b(this.Q, connectionResult.Q) && q.b(this.R, connectionResult.R);
    }

    @o0
    public PendingIntent f1() {
        return this.Q;
    }

    public boolean g1() {
        return (this.P == 0 || this.Q == null) ? false : true;
    }

    public boolean h1() {
        return this.P == 0;
    }

    public int hashCode() {
        return q.c(Integer.valueOf(this.P), this.Q, this.R);
    }

    public void m1(@m0 Activity activity, int i10) throws IntentSender.SendIntentException {
        if (g1()) {
            PendingIntent pendingIntent = this.Q;
            s.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0);
        }
    }

    @m0
    public String toString() {
        q.a d10 = q.d(this);
        d10.a("statusCode", p1(this.P));
        d10.a("resolution", this.Q);
        d10.a("message", this.R);
        return d10.toString();
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.F(parcel, 2, X0());
        b.S(parcel, 3, f1(), i10, false);
        b.Y(parcel, 4, Z0(), false);
        b.b(parcel, a10);
    }
}
