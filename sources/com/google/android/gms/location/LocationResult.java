package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.b1;
import j8.q;
import java.util.Collections;
import java.util.List;
import l8.b;
import l8.c;

@SafeParcelable.a(creator = "LocationResultCreator")
@SafeParcelable.g({1000})
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<LocationResult> CREATOR = new b1();
    public static final List P = Collections.emptyList();
    @SafeParcelable.c(defaultValueUnchecked = "LocationResult.DEFAULT_LOCATIONS", getter = "getLocations", id = 1)
    public final List O;

    @SafeParcelable.b
    public LocationResult(@SafeParcelable.e(id = 1) List list) {
        this.O = list;
    }

    @m0
    public static LocationResult X0(@m0 List<Location> list) {
        if (list == null) {
            list = P;
        }
        return new LocationResult(list);
    }

    @o0
    public static LocationResult Z0(@m0 Intent intent) {
        if (!h1(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) c.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean h1(@m0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@d.o0 java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L_0x008c
            com.google.android.gms.location.LocationResult r9 = (com.google.android.gms.location.LocationResult) r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L_0x0016
            java.util.List r0 = r8.O
            java.util.List r9 = r9.O
            boolean r9 = r0.equals(r9)
            return r9
        L_0x0016:
            java.util.List r0 = r8.O
            int r0 = r0.size()
            java.util.List r2 = r9.O
            int r2 = r2.size()
            if (r0 == r2) goto L_0x0025
            return r1
        L_0x0025:
            java.util.List r0 = r8.O
            java.util.Iterator r0 = r0.iterator()
            java.util.List r9 = r9.O
            java.util.Iterator r9 = r9.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r9.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0052
            return r1
        L_0x0052:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L_0x0061
            return r1
        L_0x0061:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            return r1
        L_0x006e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = j8.q.b(r2, r3)
            if (r2 != 0) goto L_0x0031
            return r1
        L_0x008a:
            r9 = 1
            return r9
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    @o0
    public Location f1() {
        int size = this.O.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.O.get(size - 1);
    }

    @m0
    public List<Location> g1() {
        return this.O;
    }

    public int hashCode() {
        return q.c(this.O);
    }

    @m0
    public String toString() {
        return "LocationResult".concat(String.valueOf(this.O));
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.d0(parcel, 1, g1(), false);
        b.b(parcel, a10);
    }
}
